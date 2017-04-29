package com.proximo.test;

import java.io.File;

import org.apache.commons.lang3.StringUtils;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.ObjectMapper;

import com.proximo.aarp.data.DatabaseManager;
import com.proximo.aarp.util.ConfigurationManager;

public class UserChallengeETL {

	public static void process(DatabaseManager dm, String file) {
		try {
			int index = 0, step=ConfigurationManager.step;
			
			String jsonF;
			
			if (StringUtils.isBlank(file))
				jsonF = ConfigurationManager.jsonfile;
			else
				jsonF = file;
			
			@SuppressWarnings("unused")
			int result = 1;
			
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
				sb.append("{\"user_challenge\": [");
			    sb.append(parser.readValueAsTree().toString());
			    sb.append("]}");
			    
			    if (index%step==0) {					  
			    	sb.append("]\n\n");
			    	//System.out.println(sb.toString());
			    	result = dm.loadJsonIntoDatabase_v2(sb.toString());	
			    	
			    	//process(sb.toString());
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
				
				result = dm.loadJsonIntoDatabase_v2(sb.toString());
				//process(sb.toString());
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
		
		System.out.println("file="+file);
		
		ConfigurationManager.readConfiguration();
		
    	// database manage
		DatabaseManager dm = new DatabaseManager(ConfigurationManager.jdbc_driver,
								 ConfigurationManager.db_url,
								 ConfigurationManager.database,
								 ConfigurationManager.dbuser,
								 ConfigurationManager.dbpassword,
								 ConfigurationManager.getSince(),
								 ConfigurationManager.batchsize,
								 "MongoDB");	
		
		//process(dm, "/Users/dumitrugutu/Dropbox (Personal)/Loghinescu/AARP/User_Challenge_Load_26Oct/user_challenge1.json");
		process(dm, file);
		
		dm.freeResource();
	}

}
