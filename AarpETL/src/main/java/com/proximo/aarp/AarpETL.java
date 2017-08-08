package com.proximo.aarp;

import java.net.URL;

import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;

import com.proximo.aarp.data.DatabaseManager;
import com.proximo.aarp.util.ConfigurationManager;

public class AarpETL {

	static final Logger logger = Logger.getLogger(AarpETL.class);

	public static String builJsonURL(String since, String page, String limit, String key) {
		return ConfigurationManager.jsonbaseurl + "since=" + since + "&page=" + page + "&limit=" + limit + "&key="
				+ key;
	}

	// main
	public static void main(String[] args) {

		logger.debug(
				"---------------------------------------------------------------------------------------------------------->");

		// keep execution time
		long etStart = 0L, etEnd = 0L;

		// total execution time in seconds
		int totalEt = 0, totalItems = 0;

		// keep URL & jsonFile from API
		String url, jsonFile;

		// read configuration file
		ConfigurationManager.readConfiguration();

		// pages in JSON file
		int page = ConfigurationManager.getPageStart();

		// since value
		long since = 0L;

		// database load status
		short result;

		// flag if the whole ETL process is good
		boolean etlFlag = true;

		// database Manager
		DatabaseManager dm = null;

		// log configuration properties
		logger.debug("dbURL=" + ConfigurationManager.db_url);
		logger.debug("database=" + ConfigurationManager.database);
		logger.debug("dbUser=" + ConfigurationManager.dbuser);
		logger.debug("dbPassword=" + ConfigurationManager.dbpassword);
		logger.debug("jdbcDriver=" + ConfigurationManager.jdbc_driver);
		logger.debug("connectionString=" + ConfigurationManager.connectionString());
		logger.debug("jsonBaseURL=" + ConfigurationManager.jsonbaseurl);
		logger.debug("jsonURL=" + ConfigurationManager.jsonurl);
		logger.debug("pageLimit=" + ConfigurationManager.getLimit());
		logger.debug("pageStart=" + ConfigurationManager.getPageStart());
		logger.debug("batchsize=" + ConfigurationManager.batchsize);
		logger.debug("dwload=" + ConfigurationManager.getDWLoad());
		logger.debug("batchloop=" + ConfigurationManager.batchloop);

		logger.debug("Start processing -------------------------------------------------------- >");

		try {

			// database manage
			dm = new DatabaseManager(ConfigurationManager.jdbc_driver, ConfigurationManager.db_url,
					ConfigurationManager.database, ConfigurationManager.dbuser, ConfigurationManager.dbpassword,
					ConfigurationManager.getSince(), ConfigurationManager.batchsize, "MongoDB");

			// get since value for URL API
			since = dm.getLastSinceUnixTimeStamp();

			logger.debug("previous ETL still run: " + dm.getmETLStillRun());
			// if previous ETL process is finished
			if (!dm.getmETLStillRun()) {

				// start ETL log table LR_ETL_Process_Type
				// ============================================ >
				// API URL
				String etlProcessTypeSource = builJsonURL(String.valueOf(since), String.valueOf(page),
						ConfigurationManager.jsonlimit, ConfigurationManager.jsonkey);

				dm.startLR_ETL_Process_Type(etlProcessTypeSource, null, null);
				// end ETL log table LR_ETL_Process_Type
				// ============================================== >

				// truncate staging tables
				dm.truncateStagingTables();

				// truncate Stg_Json_Structure table
				// dm.truncateStg_Json_Structure();

				// infinite loop
				while (true) {

					// start ETL log table LR_ETL_Process_Dtl
					// ============================================ >
					dm.getLastETLProcessData();
					dm.startLR_ETL_Process_Dtl(dm.getmETLProcessTypeID(), dm.getsince(), page,
							ConfigurationManager.getLimit(), null);
					// end ETL log table LR_ETL_Process_Dtl
					// ============================================== >

					// reset error message
					dm.setErrorMessage("");

					// get JSON file from API
					// --------------------------------------------------------
					// >
					etStart = System.currentTimeMillis();
					// build API URL
					url = builJsonURL(String.valueOf(since), String.valueOf(page), ConfigurationManager.jsonlimit,
							ConfigurationManager.jsonkey);
					logger.debug(url);

					// get JSON file from API
					jsonFile = IOUtils.toString(new URL(url).openStream());
					etEnd = System.currentTimeMillis();
					logger.debug("json gettime=" + (etEnd - etStart));
					totalEt += (etEnd - etStart) / 1000;

					// process the file and load into database
					// --------------------------------------- >
					etStart = System.currentTimeMillis();
					dm.getLastETLProcessDtlID();
					result = dm.loadJsonIntoDatabase(jsonFile);

					// last ETLProcessID from LR_ETL_Process_Dtl
					dm.getLastETLProcessDtlID();

					// parse undefined JSON
					if (ConfigurationManager.getUndefinedLoad() == 1) {
						dm.parseUndefinedJSON();
					}

					etEnd = System.currentTimeMillis();
					// -------------------------------------------------------------------------------
					// >

					// end ETL log table LR_ETL_Process_Dtl
					// ============================================ >
					if (result == 1) {
						dm.endLR_ETL_Process_Dtl(ConfigurationManager.getEtlSuccessMessage());
					} else {
						// set the ETL flag
						// true if the result of load is 1 - success
						// false if the result != 1 - failed
						// stop processing, not make sense since will set whole
						// process as failed
						etlFlag = false;

						// log error and detail
						dm.endLR_ETL_Process_Dtl(ConfigurationManager.getEtlErrorMessage());
						dm.insertLR_ETL_Load_Error(dm.getmETLProcessDtlID(), dm.getErrorMessage());
					}

					// end ETL log table LR_ETL_Process_Dtl
					// ============================================== >

					// debug
					logger.debug("page=" + page + ";item.size=" + dm.getProcessing().getJsonArray().size() + ";gettime="
							+ (etEnd - etStart));
					page++;
					totalEt += (etEnd - etStart) / 1000;
					totalItems += dm.getProcessing().getJsonArray().size();

					// debug
					logger.debug("totalEt=" + totalEt);
					logger.debug("totalItems=" + totalItems);
					logger.debug("-------------------------------------------------------------------- >");

					// end the loop
					if (!etlFlag || (dm.getProcessing().getJsonArray().size() < ConfigurationManager.getLimit())
							|| (ConfigurationManager.batchloop != 0 && page > ConfigurationManager.batchloop)) {
						// if (!etlFlag || page > 5) {
						break;
					}
				}

				// end ETL log
				if (etlFlag) { // success
					// start DW load
					if (ConfigurationManager.getDWLoad() == 1) {
						logger.debug("staging to DW start");
						result = dm.refreshDW();
						logger.debug("staging to DW end");

						// if result of staging -> DW failed, set main process
						// as failed, otherwise = success
						if (result != 1) {
							logger.debug("DW load failed, check the log error table");
							dm.endLR_ETL_Process_Type(ConfigurationManager.getEtlErrorMessage());
						} else { // success
							dm.endLR_ETL_Process_Type(ConfigurationManager.getEtlSuccessMessage());
						}
					} else {
						dm.endLR_ETL_Process_Type(ConfigurationManager.getEtlSuccessMessage());
					}
				} else {
					logger.debug("no DW load - the process failed, check the log error table");
					dm.endLR_ETL_Process_Type(ConfigurationManager.getEtlErrorMessage());
				}
			} // end if still running
		} catch (Exception ex) {
			ex.printStackTrace();
			logger.error("Exception: " + ex.getMessage());

			try {
				// log errors and set the status of ETL
				dm.endLR_ETL_Process_Dtl(ex.getMessage());
				dm.insertLR_ETL_Load_Error(dm.getmETLProcessDtlID(), ex.getMessage());
				dm.endLR_ETL_Process_Type(ex.getMessage());
			} catch (Exception ex1) {
			}
		} finally {
			try {
				// close database connection
				dm.freeResource();
			} catch (Exception ex) {
			}
		}
	}

}
