package com.proximo.aarp;

import java.util.ArrayList;

import org.apache.log4j.Logger;

import com.proximo.aarp.cms.CMSProcess;
import com.proximo.aarp.data.DatabaseManager;
import com.proximo.aarp.util.API;
import com.proximo.aarp.util.ConfigurationManager;

public class CmsETL {
	
	static final Logger logger = Logger.getLogger(CmsETL.class);
	
	final static String CMS="CMS";
	final static int SUCCESS=0;
	final static int ERROR=1;

	public static void main(String[] args) {
		
    	// keep execution time
    	long etStart = 0L, etEnd = 0L;

    	// total execution time in seconds
    	int totalEt = 0;
		
		// read configuration file
		ConfigurationManager.readConfiguration();
		
		// name of process
		String etlProcessTypeName = "";
		
		// CMS content_type
		String contentType = "";
		
		// CMS api URL
		String apiURL = "";
		
		// Database class
		DatabaseManager dm = null;
		
		// CMS process
		CMSProcess cms = new CMSProcess();	
		
		// 1 - success
		int result = 1;
		
		// log configuration properties
        logger.debug("dbURL="+ConfigurationManager.db_url);
        logger.debug("database="+ConfigurationManager.database);
        logger.debug("dbUser="+ConfigurationManager.dbuser);
        logger.debug("dbPassword="+ConfigurationManager.dbpassword);
        logger.debug("jdbcDriver="+ConfigurationManager.jdbc_driver);
        logger.debug("connectionString="+ConfigurationManager.connectionString());

		try {
			// init
			dm = new DatabaseManager(ConfigurationManager.jdbc_driver,
									 ConfigurationManager.db_url,
									 ConfigurationManager.database,
									 ConfigurationManager.dbuser,
									 ConfigurationManager.dbpassword,
									 ConfigurationManager.getSince(),
									 ConfigurationManager.batchsize,
									 etlProcessTypeName);
			
			//cms = new CMSProcess();
			
			// truncate CMS staging tables
			if (Integer.valueOf(ConfigurationManager.truncate_Staging_Tables) != 0) {
				dm.truncateCMSStagingTables();
			}
			
			ArrayList<API> array = dm.getAPIs(ConfigurationManager.cms_source_system);
			
			// loop through the APIs
			for (int i=0; i<array.size(); i++) {
				
				// get api one by one
				API api = (API) array.get(i);
				contentType = api.getContentType();
				apiURL = api.getUrl();
				
				etlProcessTypeName = CMS;
				dm.setAarpLoadType(etlProcessTypeName);
				dm.setErrorMessage("");
				cms.setDm(dm);
				cms.setContentType(contentType);
				cms.setJsonURL(apiURL);			
    			cms.setJsonSource("URL");
				cms.setSourceSystem(ConfigurationManager.cms_source_system); // CMS
				
				logger.debug("Start processing content_type = " + etlProcessTypeName + " -------------------------------------------------------- >");	
				logger.debug("API="+apiURL);

				etStart = System.currentTimeMillis();
	    		//----
				result = cms.load();
				//----
				// get time
				etEnd = System.currentTimeMillis();
				totalEt += (etEnd-etStart)/1000;
				logger.debug("totalEt="+totalEt);
				logger.debug("-------------------------------------------------------------------- >");			
				
	        	// truncate staging Stg_Json_Structure_v2 table
	        	if (Integer.valueOf(ConfigurationManager.truncate_Stg_Json_Structure) != 0) {
	        		dm.truncateStg_Json_Structure();
	        	}
	        	
				// end the loop
				// if the process failed
				if (!(result == 1)) {
					break;
				}	        	
			}
			
			// #####################################################################################
			
			// load DW from staging

        	if (result == 1) { // success
        		// start DW load
        		if (ConfigurationManager.getDWLoad() == 1) {
        			logger.debug("staging to DW start");
        			int resultDW = dm.refreshCMS_DW();
        			logger.debug("staging to DW end");

        			// if result of staging -> DW failed, set main process as failed, otherwise = success
        			if (resultDW != 1) {
        				logger.debug("DW load failed, check the log error table");
        				dm.endLR_ETL_Process_Type(ConfigurationManager.getEtlErrorMessage());
        				System.exit(ERROR);
        			}
        			else { // success
                		dm.endLR_ETL_Process_Type(ConfigurationManager.getEtlSuccessMessage());
                		System.exit(SUCCESS);
        			}
        		}
        		else {
        			dm.endLR_ETL_Process_Type(ConfigurationManager.getEtlSuccessMessage());
        			System.exit(SUCCESS);
        		}
        	}
        	else {
        		logger.debug("no DW load - the process failed, check the log error table");
        		dm.endLR_ETL_Process_Type(ConfigurationManager.getEtlErrorMessage());
        		System.exit(ERROR);
        	}	
		}
		catch(Exception ex) {
			ex.printStackTrace();
        	logger.error("Exception: " + ex.getMessage());
        	
        	try {
	        	// log errors and set the status of ETL
				dm.endLR_ETL_Process_Dtl(ex.getMessage());
				dm.insertLR_ETL_Load_Error(dm.getmETLProcessDtlID(), ex.getMessage());
				dm.endLR_ETL_Process_Type(ex.getMessage());
        	}
        	catch(Exception ex1) {}
        	System.exit(ERROR);
		}
		finally {
			if (dm != null) {
				try {
					dm.freeResource();
				}
				catch(Exception e) {}
			}
		}
	}
}
