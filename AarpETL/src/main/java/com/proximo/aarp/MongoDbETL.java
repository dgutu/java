package com.proximo.aarp;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

import com.proximo.aarp.cms.CMSProcess;
import com.proximo.aarp.data.DatabaseManager;
import com.proximo.aarp.util.ConfigurationManager;

public class MongoDbETL {

	static final Logger logger = Logger.getLogger(MongoDbETL.class);	
	final static int SUCCESS=0;
	final static int ERROR=1;	
	
	public static String builJsonURL(String since, String page, String limit, String key) {
		return ConfigurationManager.jsonbaseurl + "since=" + since + "&page=" + page + "&limit=" + limit + "&key=" + key;
		//return ConfigurationManager.jsonbaseurl + "since=" + since + "&limit=" + limit + "&key=" + key;
	}
	
	public static void main(String[] args) {
		
		// file parameter
		String file = System.getProperty("file");
		
    	// keep URL 
    	String url = "", jsonFile = "";
    	
		// read configuration file
		ConfigurationManager.readConfiguration();

		// pages in JSON file
		int page = ConfigurationManager.getPageStart();

		// since value
		String since = "";

		// database load status
		short result, resultDW;

		// database Manager
		DatabaseManager dm = null;
		
		// CMS process
		CMSProcess cms = null;
		
		// number of tokens in JSON, total number of tokens
		int tokens = 0, totalTokens = 0;

        logger.debug("Start processing -------------------------------------------------------- >");

        try {

        	// database manage
        	dm = new DatabaseManager(ConfigurationManager.jdbc_driver,
									 ConfigurationManager.db_url,
									 ConfigurationManager.database,
									 ConfigurationManager.dbuser,
									 ConfigurationManager.dbpassword,
									 ConfigurationManager.getSince(),
									 ConfigurationManager.batchsize,
									 "MongoDB");
        	
			dm.setAarpLoadType(ConfigurationManager.mongodb_source_system);        	
        	
			// cms manage
			cms = new CMSProcess();
			cms.setDm(dm);
			cms.setContentType(ConfigurationManager.mongodb_source_system);
			cms.setSourceSystem(ConfigurationManager.mongodb_source_system); // MongoDB_v2

        	// get since value for URL API
        	since = dm.getLastSinceStr();
        	
        	// check if previous ETL process is still run 
        	// logger.debug("previous ETL still run: " + dm.getmETLStillRun());
        	
        	// if previous ETL process is finished
        	// if (!dm.getmETLStillRun()) {
        		        		
			// truncate MongoDB staging tables
        	if (Integer.valueOf(ConfigurationManager.truncate_Staging_Tables) != 0) {
        		dm.truncateMongoDBStagingTables();
        	}
			
        	// infinite loop
        	while(true) {
        		
        		// some init
        		// reset error message
        		dm.setErrorMessage("");
        		// ============================================ >
        		
        		// source of JSON is local file
        		if (!ConfigurationManager.mongoDB_v2_json_file_source_flag.isEmpty() && Integer.valueOf(ConfigurationManager.mongoDB_v2_json_file_source_flag) == 1) {	        			
        			if (StringUtils.isBlank(file)) {	        			
        				jsonFile = ConfigurationManager.mongoDB_v2_json_file_source;
        			}
        			else {
        				jsonFile = file;
        			}
        			
        			cms.setJsonFile(jsonFile);
        			cms.setJsonSource("FILE");
        			logger.debug("jsonFile="+jsonFile);
        			
	        		// start ETL log
        			// call get_info_log in startEtlLog        			
	        		startEtlLog(dm, jsonFile, page, 1);

        		}
        		else {	        		
                	// get since value for URL API
        			// since = dm.getLastSinceStr();
        			
        			//url = builJsonURL(since,String.valueOf(0),ConfigurationManager.jsonlimit,ConfigurationManager.jsonkey);
        			url = builJsonURL(since,String.valueOf(page),ConfigurationManager.jsonlimit,ConfigurationManager.jsonkey);
        			cms.setJsonURL(url);
        			cms.setJsonSource("URL");
        			logger.debug("url="+url);
        			
	        		// start ETL log
        			// don't call get_info_log in startEtlLog
	        		startEtlLog(dm, url, page, 1);
        		}
        		
        		// ETLProcessID from LR_ETL_Process_Dtl table
    			cms.setEtlProcessID(dm.getLastETLProcessDtlID());	        		
        		
	        	// process API
	        	result = process(dm, cms);
	        	
	        	// get number of tokens in JSON
	        	tokens = dm.getNumberOfTokens();
	        	// tokens = cms.getNumberOfTokens();
	        	
	        	// end ETL log
	        	endEtlLog(dm, result);
	        	
				// go to next page
				page++;
				logger.debug("number of loops: "+ page);
				
				//
				totalTokens+=tokens;
				logger.debug("number of tokens in JSON file: "+tokens);
	        	logger.debug("total number of tokens in JSON file: "+totalTokens);

	        	// truncate staging Stg_Json_Structure_v2 table
	        	if (Integer.valueOf(ConfigurationManager.truncate_Stg_Json_Structure) != 0) {
	        		dm.truncateStg_Json_Structure_v2();
	        	}
	        	
				logger.debug("-------------------------------------------------------------------- >");					
	        	
				// end the loop
				// if the process failed
				if (!(result == 1) || (tokens < ConfigurationManager.getLimit()) || (ConfigurationManager.batchloop != 0 && page >= ConfigurationManager.batchloop)) {
					break;
				}
				
			} // end infinite loop	        	
        	
			// load into DHW
        	long etStart = 0L, etEnd = 0L;
        	int totalEt = 0;
        	
			totalEt = 0;
			etStart = System.currentTimeMillis();
			//----
			resultDW = stagingToDWH(dm);
			//----
			etEnd = System.currentTimeMillis();
			totalEt += (etEnd-etStart)/1000;
			logger.debug("Elapsed time(seconds): "+totalEt);
			
			// set exit status based on execution result
			if ((result == 1) && (resultDW == 1)) {
				System.exit(SUCCESS);
			}
			else {
				System.exit(ERROR);
			}
	        	
        	// } // end if still running
        }
        catch(Exception ex) {
        	ex.printStackTrace();
        	logger.error("Exception: " + ex.getMessage());

        	try {
	        	// log errors 
				endEtlLog(dm, 0);				
        	}
        	catch(Exception ex1) {}
        }
        finally {
        	try {
            	// close database connection
            	dm.freeResource();
        	}
        	catch(Exception ex) {}
        }

	}
	
	private static short process(DatabaseManager dm, CMSProcess cms) {
    	long etStart = 0L, etEnd = 0L;

    	// total execution time in seconds
    	int totalEt = 0, total = 0;
    	
    	short result = 1; // success 
    	
    	try {
    		
			etStart = System.currentTimeMillis();
			logger.debug("loading into Stg_Json_Structure_v2 ...");
			//----
			cms.process_v2();
			//----
			etEnd = System.currentTimeMillis();
			totalEt += (etEnd-etStart)/1000;
			total += totalEt;
			logger.debug("Elapsed time(seconds): "+totalEt);    		
    		
			// load_Stg_Json_Structure
			//totalEt = 0;			
			//etStart = System.currentTimeMillis();
			//logger.debug("procedure load_Stg_Json_Structure() ...");
			//----
			//dm.loadStg_Json_Structure();
			//----
			//etEnd = System.currentTimeMillis();
			//totalEt += (etEnd-etStart)/1000;
			//total += totalEt;
			//logger.debug("Elapsed time(seconds): "+totalEt);		
			
			// load into staging
			totalEt = 0;
			etStart = System.currentTimeMillis();
			logger.debug("loading staging tables ...");
			//----
			logger.debug("contentType="+cms.getContentType());
			logger.debug("etlProcessID="+cms.getEtlProcessID());
			if (Integer.valueOf(ConfigurationManager.load_into_staging) != 0) {
				result = dm.loadStagingMongoDB_v2();
			}
			//----
			etEnd = System.currentTimeMillis();
			totalEt += (etEnd-etStart)/1000;
			total += totalEt;
			logger.debug("Elapsed time(seconds): "+totalEt);
			
			// load into DHW
			// totalEt = 0;
			// etStart = System.currentTimeMillis();
			//----
			// stagingToDWH(dm);
			//----
			//etEnd = System.currentTimeMillis();
			//totalEt += (etEnd-etStart)/1000;
			//total += totalEt;
			//logger.debug("Elapsed time(seconds): "+totalEt);
			logger.debug("Total Elapsed time(seconds): "+total);
    	}
    	catch(Exception ex) {
			result = -1;
			ex.printStackTrace();
			logger.error("noroc"+ex.getMessage());		
    	}
    	
    	return result;
		
	}
	
	private static void startEtlLog(DatabaseManager dm, String etlProcessTypeSource, int page, int flag_get_inf_log) {
    	dm.startLR_ETL_Process_Type(etlProcessTypeSource, null, ConfigurationManager.mongodb_source_system);
    	
    	if (flag_get_inf_log == 1) {
    		dm.getLastETLProcessData();
    	}
    	
    	dm.startLR_ETL_Process_Dtl(dm.getmETLProcessTypeID(), dm.getsince(), page, ConfigurationManager.getLimit(), ConfigurationManager.mongodb_source_system);
	}
	
	private static void endEtlLog(DatabaseManager dm, int result) {		
		// success
		if (result == 1) {
			dm.endLR_ETL_Process_Type(ConfigurationManager.getEtlSuccessMessage());
			dm.endLR_ETL_Process_Dtl(ConfigurationManager.getEtlSuccessMessage());
		}
		// warning/error
		else {
			dm.endLR_ETL_Process_Type(ConfigurationManager.getEtlErrorMessage());
			dm.endLR_ETL_Process_Dtl(ConfigurationManager.getEtlErrorMessage());
			dm.insertLR_ETL_Load_Error(dm.getLastETLProcessDtlID(), dm.getErrorMessage());
		}
	}
	
	private static short stagingToDWH(DatabaseManager dm) {
		// by default it's supposed to return Success result: 1-Success; -1-Fail
		short resultDW = 1;
		if (ConfigurationManager.getDWLoad() == 1) {
			logger.debug("staging to DWH ...");
			resultDW = dm.refreshDW_v2();
		}
		
		return resultDW;
	}
		
}
