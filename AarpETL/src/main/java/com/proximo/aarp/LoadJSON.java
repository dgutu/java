package com.proximo.aarp;

import java.io.File;
import java.util.Iterator;
import java.util.Map;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.ObjectMapper;

import com.proximo.aarp.data.DatabaseManager;
import com.proximo.aarp.util.ConfigurationManager;
import com.proximo.test.TestMain;

@SuppressWarnings("unused")
public class LoadJSON {	
	
	private static long id = 0l;
	private static long parent_id = 0l;
	
	private static boolean flag = false;
	
	// flag next JsonToken
	private static boolean flag_next_token = false;
	
	// keep number of tokens in the JSON file
	private static int numberOfTokens = 0;		
	
	public static void parse_json(DatabaseManager dm, String url, Long processID, String contentType) {
		
		int step = 0;
		
		try 
		{
			dm.truncateStg_Json_Structure();
			
			ObjectMapper mapper = new ObjectMapper();				
			JsonParser parser = mapper.getJsonFactory().createJsonParser(new File(url));
			
			while (!parser.isClosed()) {
				JsonToken token = parser.nextToken();
				
				if (token == null) {
					break;
				}
				
				/*if (!JsonToken.START_ARRAY.equals(token)) {
					break;
				}*/
				
				while (parser.nextToken() != null) {
					JsonNode node = parser.readValueAsTree();
					
					System.out.println(step+"=node:"+node.toString());
					
					if (!node.toString().equals("null")) {
					
						JsonNode newNode;
					
						//if (contentType.equals("MongoDB_v2")) {
						//	newNode = mapper.readTree(select(dm, node));
						//}
						//else {
						newNode = node;
						//}					
					
						//System.out.println("newNode:"+newNode.toString());
					
						// flag that is next token, useful for MongoDB
						flag_next_token=true;
						printJsonObject(dm, newNode, processID, contentType);
					
						// count number of tokens in the JSON file				
						numberOfTokens++;
						
						step++;
						
						if ((step % Integer.valueOf(ConfigurationManager.historical_load_step)) == 0) {
							dm.loadStg_Json_Structure();
							dm.loadStagingHistorical();
							dm.truncateStg_Json_Structure();
							break;
						}
					}					
				}
				
				dm.loadStg_Json_Structure();
				dm.loadStagingHistorical();
				dm.refreshHistDW_v2();
				dm.truncateStg_Json_Structure();
				
				parser.close();			

			}
			

		}
		catch(Exception ex) {
			System.out.println(ex.getLocalizedMessage());
		}
	}
	
	
	public static void printJsonObject(DatabaseManager dm, JsonNode node, Long processID, String contentType) {
		
		int index = 1;
		
		//int index = 1;				
		long parent_id = 0L;
		
		if (flag_next_token) {
			parent_id = 0L;
			flag_next_token = false;
		}
		else
		{
			parent_id = dm.getMaxIdJsonUndefineStructure();			
		}
		
		// object type JSON
		if (node.isObject()) {
			
			Iterator<Map.Entry<String,JsonNode>> iterator=node.getFields();
			
			while(iterator.hasNext()) {
				Map.Entry<String,JsonNode> jsonNode=iterator.next();				
				
				String key = jsonNode.getKey();				
				JsonNode temp = jsonNode.getValue();	
				
				// insert into database
				//if (temp.asToken() == JsonToken.START_OBJECT)
				//	dm.loadUndefineJSON(key, null, parent_id, temp.asToken().toString(), index, processID, contentType);
				//else
				//	dm.loadUndefineJSON(key, temp.toString(), parent_id, temp.asToken().toString(), index, processID, contentType);
				
				printJsonObject(dm, temp, processID, contentType);
			}
		}
		// array type JSON
		else if (node.isArray()) {
			for (int i=0;i<node.size();i++) {
				index++;

				JsonNode child = node.get(i);
				printJsonObject(dm, child, processID, contentType);
			}  
		}
		/*else {
	        if (node.isValueNode())
	        {
	        	logger.debug("valueNode: " + node.asText());
	        }
	        else
	        {
	        	logger.debug("node some other type");
	        }
		}*/
	}		
	

	public static void main(String[] args) {
		/*String file = System.getProperty("file");
		String stagingTable = System.getProperty("stagingTable");
		String contentType = System.getProperty("contentType");
		String processID = System.getProperty("processID");		*/
		
		String file = "/Users/dumitrugutu/Downloads/app_progress/app_progress1.json";
		String stagingTable = "";
		String contentType = "MongoDB_v2";
		String processID = "-1";
		

		// read configuration file
		ConfigurationManager.readConfiguration();
		
		DatabaseManager dm = new DatabaseManager(ConfigurationManager.jdbc_driver, 
				 ConfigurationManager.db_url, 
				 ConfigurationManager.database, 
				 ConfigurationManager.dbuser, 
				 ConfigurationManager.dbpassword, 
				 ConfigurationManager.getSince(), 
				 ConfigurationManager.batchsize,
				 "");			
		
		System.out.println(file);
		System.out.println(stagingTable);
		
		// set ETLProcessID value
		dm.setmETLProcessDtlID(Long.valueOf(processID));
		
		dm.setAarpLoadType(contentType);
		
		try {
			System.out.println("URL: "+file);
	
			parse_json(dm, file, Long.valueOf(processID), contentType);
			
			dm.freeResource();
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
