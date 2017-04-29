package com.proximo.test;

import java.io.File;

import org.apache.commons.lang3.StringUtils;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.ObjectMapper;

import com.proximo.aarp.data.DatabaseManager;
import com.proximo.aarp.util.ConfigurationManager;

public class FirstLoad {
	
	public static void process(String srcJsonFile) {

			System.out.println("---------------------------------------------------------------------------------------------------------->");

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
	        System.out.println("dbURL="+ConfigurationManager.db_url);
	        System.out.println("database="+ConfigurationManager.database);
	        System.out.println("dbUser="+ConfigurationManager.dbuser);
	        System.out.println("dbPassword="+ConfigurationManager.dbpassword);
	        System.out.println("jdbcDriver="+ConfigurationManager.jdbc_driver);
	        System.out.println("connectionString="+ConfigurationManager.connectionString());
	        System.out.println("jsonBaseURL="+ConfigurationManager.jsonbaseurl);
	        System.out.println("jsonURL="+ConfigurationManager.jsonurl);
	        System.out.println("pageLimit="+ConfigurationManager.getLimit());
	        System.out.println("pageStart="+ConfigurationManager.getPageStart());
	        System.out.println("batchsize="+ConfigurationManager.batchsize);
	        System.out.println("dwload="+ConfigurationManager.getDWLoad());
	        System.out.println("batchloop="+ConfigurationManager.batchloop);

	        System.out.println("Start processing -------------------------------------------------------- >");

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
	        							

	        	// get since value for URL API
	        	since = dm.getLastSinceUnixTimeStamp();

	        	System.out.println("previous ETL still run: " + dm.getmETLStillRun());
	        	// if previous ETL process is finished
	        	if (!dm.getmETLStillRun()) {

		        	// start ETL log table LR_ETL_Process_Type ============================================ >
		        	// MongoDB
		        	// API URL
		        	String etlProcessTypeSource = ConfigurationManager.jsonfile;//builJsonURL(String.valueOf(since),String.valueOf(page),ConfigurationManager.jsonlimit,ConfigurationManager.jsonkey);

		        	dm.startLR_ETL_Process_Type(etlProcessTypeSource, null, null);
		        	// end ETL log table LR_ETL_Process_Type ============================================== >

		        	// truncate staging tables
		        	dm.truncateStagingTables();

					// truncate Stg_Json_Structure table
		        	// TODO this is Sprint 2
					// dm.truncateStg_Json_Structure();

		        	// infinite loop
		        	//while(true) {

			        	// start ETL log table LR_ETL_Process_Dtl ============================================ >
						dm.getLastETLProcessData();
			        	dm.startLR_ETL_Process_Dtl(dm.getmETLProcessTypeID(), dm.getsince(), page, ConfigurationManager.getLimit(), null);
			        	// end ETL log table LR_ETL_Process_Dtl ============================================== >

		        		// reset error message
		        		dm.setErrorMessage("");

		        		// get JSON file from API -------------------------------------------------------- >
		        		etStart = System.currentTimeMillis();
		        		// build API URL
						//url = builJsonURL(String.valueOf(since),String.valueOf(page),ConfigurationManager.jsonlimit,ConfigurationManager.jsonkey);
						//System.out.println(url);

						// get JSON file from API
						//jsonFile = IOUtils.toString(new URL(url).openStream());
						jsonFile = srcJsonFile;
						etEnd = System.currentTimeMillis();
						System.out.println("json gettime=" + (etEnd-etStart));
						totalEt += (etEnd-etStart)/1000;

						// process the file and load into database --------------------------------------- >
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
						// ------------------------------------------------------------------------------- >

			        	// end ETL log table LR_ETL_Process_Dtl ============================================ >
						if (result == 1) {
							dm.endLR_ETL_Process_Dtl(ConfigurationManager.getEtlSuccessMessage());
						}
						else {
							// set the ETL flag
							// true if the result of load is 1 - success
							// false if the result != 1 - failed
							// stop processing, not make sense since will set whole process as failed
							etlFlag = false;

							// log error and detail
							dm.endLR_ETL_Process_Dtl(ConfigurationManager.getEtlErrorMessage());
							dm.insertLR_ETL_Load_Error(dm.getmETLProcessDtlID(), dm.getErrorMessage());
						}

			        	// end ETL log table LR_ETL_Process_Dtl ============================================== >

						// debug
						System.out.println("page=" + page + ";item.size=" + dm.getProcessing().getJsonArray().size() + ";gettime=" + (etEnd-etStart));
						page++;
						totalEt += (etEnd-etStart)/1000;
						totalItems += dm.getProcessing().getJsonArray().size();

						// debug
						System.out.println("totalEt="+totalEt);
						System.out.println("totalItems="+totalItems);
						System.out.println("-------------------------------------------------------------------- >");

						// end the loop
						//if (!etlFlag || (dm.getProcessing().getJsonArray().size() < ConfigurationManager.getLimit()) || (ConfigurationManager.batchloop != 0 && page > ConfigurationManager.batchloop)) {
						//if (!etlFlag || page > 5) {
						//	break;
						//}
					//}

		        	// end ETL log
		        	if (etlFlag) { // success
		        		// start DW load
		        		if (ConfigurationManager.getDWLoad() == 1) {
		        			System.out.println("staging to DW start");
		        			result = dm.refreshDW();
		        			System.out.println("staging to DW end");

		        			// if result of staging -> DW failed, set main process as failed, otherwise = success
		        			if (result != 1) {
		        				System.out.println("DW load failed, check the log error table");
		        				dm.endLR_ETL_Process_Type(ConfigurationManager.getEtlErrorMessage());
		        			}
		        			else { // success
		                		dm.endLR_ETL_Process_Type(ConfigurationManager.getEtlSuccessMessage());
		        			}
		        		}
		        		else {
		        			dm.endLR_ETL_Process_Type(ConfigurationManager.getEtlSuccessMessage());
		        		}
		        	}
		        	else {
		        		System.out.println("no DW load - the process failed, check the log error table");
		        		dm.endLR_ETL_Process_Type(ConfigurationManager.getEtlErrorMessage());
		        	}
	        	} // end if still running
	        }
	        catch(Exception ex) {
	        	ex.printStackTrace();
	        	System.out.println("Exception: " + ex.getMessage());

	        	// log errors and set the status of ETL
				dm.endLR_ETL_Process_Dtl(ex.getMessage());
				dm.insertLR_ETL_Load_Error(dm.getmETLProcessDtlID(), ex.getMessage());
				dm.endLR_ETL_Process_Type(ex.getMessage());
	        }
	        finally {
	        	try {
	            	// close database connection
	            	dm.freeResource();
	        	}
	        	catch(Exception ex) {}
	        }
	}
	
	public static void jacksonExample(String file) {
		try {
			int index = 1, step=ConfigurationManager.step;
			
			String jsonF;
			
			if (StringUtils.isBlank(file))
				jsonF = ConfigurationManager.jsonfile;
			else
				jsonF = file;
			
			ObjectMapper mapper = new ObjectMapper();
			JsonParser parser = mapper.getJsonFactory().createJsonParser(new File(jsonF));
			
			JsonToken token = parser.nextToken();
			
			if (token == null) {
				System.out.println("no json file");
			}
			
			if (!JsonToken.START_ARRAY.equals(token)) {
				System.out.println("Expected an array");
			}		
			
			StringBuilder sb = new StringBuilder("[");		
			//String sb;
			
        	// database manage
        	/*DatabaseManager dm = new DatabaseManager(ConfigurationManager.jdbc_driver, 
        											 ConfigurationManager.db_url, 
        											 ConfigurationManager.database, 
        											 ConfigurationManager.dbuser, 
        											 ConfigurationManager.dbpassword, 
        											 ConfigurationManager.getSince(), 
        											 ConfigurationManager.batchsize);*/
        	
        	// truncate staging tables before load
        	//dm.truncateStagingTables();
        	
        	// go to the end of json Array ]
			while (!JsonToken.END_ARRAY.equals(parser.nextToken())) {
				//System.out.println(parser.readValueAsTree().toString());
				//dm.loadJsonIntoDatabase("["+parser.readValueAsTree().toString()+"]");		
				//sb.append("{\"user\": ");
			    sb.append(parser.readValueAsTree().toString());
			    //sb.append("}");
			    
			    if (index%step==0) {					  
			    	sb.append("]\n\n");
			    	//System.out.println(sb.toString());
			    	//result = dm.loadJsonIntoDatabase(sb.toString());	
			    	
			    	process(sb.toString());
			    	sb.setLength(0);
			    	sb.append("[");
				}
				else {
					sb.append(",\n");
				}
			    
			    //if (index%5==0)
			    //	break;
				//System.out.println(index); 
				index++;
				
			}			
			
			//System.out.println(sb.toString());
			
			// check if string builder is not null and proceed
			if (sb.length() > 1) {
				// last char is ,
				if (sb.charAt(sb.length() - 2) == ',') {				
					sb.deleteCharAt(sb.length() - 2);
					sb.append("]");
				}
				else {
					sb.append("]");
				}
				
				//result = dm.loadJsonIntoDatabase(sb.toString());
				process(sb.toString());
				//System.out.println(sb.toString());
		    }
			
			System.out.println(index);
			
			// close json parser
			parser.close();
        	// close database connection
        	//dm.freeResource();    			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		
		String file = System.getProperty("file");
		
		ConfigurationManager.readConfiguration();
		jacksonExample(file);
		
		
	}

}
