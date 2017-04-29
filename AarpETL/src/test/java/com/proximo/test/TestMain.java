package com.proximo.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;







import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
//import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.node.ArrayNode;
import org.json.JSONException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;



import org.json.simple.JSONValue;
















//import com.amazonaws.auth.AWSCredentials;
//import com.amazonaws.auth.BasicAWSCredentials;
//import com.amazonaws.services.s3.AmazonS3;
//import com.amazonaws.services.s3.AmazonS3Client;
//import com.amazonaws.services.s3.model.ObjectMetadata;
//import com.amazonaws.services.s3.model.PutObjectRequest;
//import com.amazonaws.services.s3.model.PutObjectResult;
import com.proximo.aarp.json.data.Processing;
import com.proximo.aarp.util.ConfigurationManager;

import com.proximo.aarp.util.MyUtils;
//import com.proximo.aarp.util.MyUtils;
import com.proximo.aarp.data.*;

public class TestMain {	
	
	//private static int prevIndex;
	//private static String prevKey;
	//private static int treeLen = 0;
	
	private static long id = 0l;
	private static long parent_id = 0l;
	
	private static boolean flag = false;
	
	// flag next JsonToken
	private static boolean flag_next_token = false;
	
	// keep number of tokens in the JSON file
	private static int numberOfTokens = 0;	
	
	private static String parent_str = "";
	
	//private static String array_indx = "";
	
	private static boolean array_flag = false;
	
	public static String builJsonURL(String since, String page, String limit, String key) {
		return ConfigurationManager.jsonbaseurl.concat("since=1422975728&page=").concat(page).concat("&limit=").concat(limit).concat("&key=").concat(key);
	}	
	
	public static void test1() {		
		// pages in json file
		int page = ConfigurationManager.getPageStart();	
		
		String url = builJsonURL("",String.valueOf(page),ConfigurationManager.jsonlimit,ConfigurationManager.jsonkey); 
		

		try {
			// get json file from API
			String jsonFile = IOUtils.toString(new URL(url).openStream());
			Processing p = new Processing(jsonFile);
			
			for (int i=0; i<p.getJsonArray().size();i++) {
       			// go through each item object
       			JSONObject object = (JSONObject)p.getJsonArray().get(i);				
				p.getUserChallenge(object);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	public static void startLR_ETL_Process_Type() {
		try {
			DatabaseManager dm = new DatabaseManager(ConfigurationManager.jdbc_driver, 
													 ConfigurationManager.db_url, 
													 ConfigurationManager.database, 
													 ConfigurationManager.dbuser, 
													 ConfigurationManager.dbpassword, 
													 ConfigurationManager.getSince(), 
													 ConfigurationManager.batchsize,
													 "");
			
			//System.out.println(dm.getLastETLProcessTypeID());
			System.out.println(dm.getLastSince());			
			dm.getLastETLProcessData();
			
			// build JSON API URL with since parameter
			String apiURL = ConfigurationManager.jsonbaseurl + "since=" + dm.getLastSinceUnixTimeStamp() + 
															   "&page=" + ConfigurationManager.jsonpagestart + 
															   "&limit=" + ConfigurationManager.jsonlimit + 
															   "&key=" + ConfigurationManager.jsonkey;
			
			System.out.println(apiURL);
			
			dm.startLR_ETL_Process_Type(ConfigurationManager.jsonurl, null, "");
			// some logic
			// update last ETL IDs
			dm.getLastETLProcessData();
			dm.endLR_ETL_Process_Type(ConfigurationManager.getEtlSuccessMessage());
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public static void endLR_ETL_Process_Type() {
		try {
			DatabaseManager dm = new DatabaseManager(ConfigurationManager.jdbc_driver, 
					 ConfigurationManager.db_url, 
					 ConfigurationManager.database, 
					 ConfigurationManager.dbuser, 
					 ConfigurationManager.dbpassword, 
					 ConfigurationManager.getSince(), 
					 ConfigurationManager.batchsize,
					 "");
			
			dm.connectionString();
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	
	public static void load_live_users() {
		try {
			FileInputStream inputStream = new FileInputStream(ConfigurationManager.jsonfile);
	        String jsonFile = IOUtils.toString(inputStream);
	        inputStream.close();

	        DatabaseManager dm = new DatabaseManager(ConfigurationManager.jdbc_driver, 
					 								 ConfigurationManager.db_url, 
					 								 ConfigurationManager.database, 
					 								 ConfigurationManager.dbuser, 
					 								 ConfigurationManager.dbpassword, 
					 								 ConfigurationManager.getSince(), 
					 								 ConfigurationManager.batchsize,
					 								 "");
	        
	        dm.truncateStagingTables();
	        int result = dm.loadJsonIntoDatabase(jsonFile);
	        
	        System.out.println(result);
		}
		catch(Exception ex) {
			
		}
	}
	
	public static void readBigFile() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(ConfigurationManager.jsonfile));
			String line;
			int cnt = 0;
			while ((line = reader.readLine()) != null)
			{
				System.out.println(line);
				if (cnt%2 == 0)
					break;
			}			
			reader.close();
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}		
	}
	
	public static void jacksonExample() {
		try {
			int index = 1, result, step=10;
			
			ObjectMapper mapper = new ObjectMapper();
			JsonParser parser = mapper.getJsonFactory().createJsonParser(new File(ConfigurationManager.jsonfile));
			
			JsonToken token = parser.nextToken();
			
			if (token == null) {
				System.out.println("no json file");
			}
			
			if (!JsonToken.START_ARRAY.equals(token)) {
				System.out.println("Expected an array");
			}		
			
			//StringBuilder sb = new StringBuilder("[");		
			//String sb;
			
        	// database manage
        	DatabaseManager dm = new DatabaseManager(ConfigurationManager.jdbc_driver, 
        											 ConfigurationManager.db_url, 
        											 ConfigurationManager.database, 
        											 ConfigurationManager.dbuser, 
        											 ConfigurationManager.dbpassword, 
        											 ConfigurationManager.getSince(), 
        											 ConfigurationManager.batchsize,
        											 "");
        	
        	// truncate staging tables before load
        	dm.truncateStagingTables();
        	
        	// go to the end of json Array ]
			while (!JsonToken.END_ARRAY.equals(parser.nextToken())) {
				
				dm.loadJsonIntoDatabase("["+parser.readValueAsTree().toString()+"]");		
				//sb.append("{\"user\": ");
			    //sb.append(parser.readValueAsTree().toString());
			    //sb.append("}");
			    
			    //if (index%step==0) {					  
			    	//sb.append("]\n\n");
			    //	System.out.println(sb.toString());
			    	//result = dm.loadJsonIntoDatabase(sb.toString());			    	
			    	//sb.setLength(0);
			    	//sb.append("[");
				//}
				//else {
					//sb.append(",\n");
				//}
			    
			    //if (index%5==0)
			    //	break;
				System.out.println(index); 
				index++;
				
			}			
			
			// check if string builder is not null and proceed
			//if (sb.length() > 0) {
				// last char is ,
			//	if (sb.charAt(sb.length() - 2) == ',') {				
			//		sb.deleteCharAt(sb.length() - 2);
			//		sb.append("]");
			//	}
			//	else {
			//		sb.append("]");
			//	}
				
				//result = dm.loadJsonIntoDatabase(sb.toString());
				//System.out.println(sb.toString());
			//}
			
			//System.out.println(index);
			
			// close json parser
			parser.close();
        	// close database connection
        	dm.freeResource();    			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public static void undefinedJson() {
		ObjectMapper mapper = new ObjectMapper();		
		
		try {
			JsonParser parser = mapper.getJsonFactory().createJsonParser(new File("/Users/dumitrugutu/Downloads/test_json.txt"));
			
			while (parser.nextToken() != null) {
				//System.out.println(parser.getCurrentName());
				//System.out.println(parser.getText());
				//System.out.println(parser.readValueAsTree());
				//System.out.println(parser.getTokenLocation());
				//System.out.println(parser.getCurrentLocation());
				System.out.println(parser.getCurrentToken());
				
				if (JsonToken.START_ARRAY.equals(parser.getCurrentToken())) {
					//System.out.println("array start");
					JsonNode node = parser.readValueAsTree();
					readJsonArrayNode(node);
				}
				else if (JsonToken.START_OBJECT.equals(parser.getCurrentToken())) {
					JsonNode node = parser.readValueAsTree();
					readJsonObjectNode(node);
				}
				
				
				
				//if (JsonToken.END_ARRAY.equals(parser.getCurrentToken()))
				//	System.out.println("array end");
				//System.out.println("----------->");
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	/**
	 * @param dm
	 * @param url
	 * @param processID
	 * @param contentType
	 */
	@SuppressWarnings("unchecked")
	public static void readJsonSprint2(DatabaseManager dm, String url, Long processID, String contentType) {
		
		int step = 0;
		
		try 
		{
			dm.truncateStg_Json_Structure();
			
			ObjectMapper mapper = new ObjectMapper();				
			//JsonParser parser = mapper.getJsonFactory().createJsonParser(new File("/Users/dumitrugutu/Downloads/json_cms_challenge.txt"));
			JsonParser parser = mapper.getJsonFactory().createJsonParser(new File("/Users/dumitrugutu/Downloads/aaa.json"));
			//JsonParser parser = mapper.getJsonFactory().createJsonParser(new File("/Users/dumitrugutu/Downloads/activity_result/activity_results1.json"));
			//JsonParser parser = mapper.getJsonFactory().createJsonParser(new File("/Users/dumitrugutu/Downloads/app_progress/app_progress1.json"));
			//JsonParser parser = mapper.getJsonFactory().createJsonParser(new File("/Users/dumitrugutu/Downloads/Ecommerce_collections/ecommerce_purchase_orders_624.json"));
			//JsonParser parser = mapper.getJsonFactory().createJsonParser(new File(url));
			//JsonParser parser = mapper.getJsonFactory().createJsonParser(new URL("http://cms.lifereimagined.org/webservice/getcontent.json?content_type=challenge_supporting_material"));	
			//JsonParser parser = mapper.getJsonFactory().createJsonParser(new File("/Volumes/External Flash/users_tmp.json.txt"));
			//JsonParser parser = mapper.getJsonFactory().createJsonParser(new File("/Users/dumitrugutu/Downloads/users_USER_OID.json"));
			
			
			//JsonNode node = parser.readValueAsTree();
			//printJsonObject(dm, node);
			//parser.close();		
			
			dm.setmETLProcessDtlID(10l);
			dm.truncateStg_Json_Structure_v2();
			//PreparedStatement ps = null;
			
			//ps = dm.getConnection().prepareStatement("{call LoadUndefineJSON_v2(?,?,?,?,?,?,?,?,?,?,?)}");
			
			DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			java.util.Date date = new java.util.Date();
			System.out.println(dateFormat.format(date));
			
			while (!parser.isClosed()) {
				JsonToken token = parser.nextToken();
				
				if (token == null) {
					break;
				}
				
				/*if (!JsonToken.START_ARRAY.equals(token)) {
					break;
				}*/
				
				//int pk = 0;
				
				while (parser.nextToken() != null) {
					// JsonNode node = parser.readValueAsTree();
					JsonNode node = mapper.readTree(parser);
					
					//System.out.println(step+"=node:"+node.toString());
					
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
						//printJsonObject(dm, newNode, processID, contentType);
					
						// count number of tokens in the JSON file				
						numberOfTokens++;
						
						step++;
						
						int level = 0;
						String array_indx = "";
						parent_str = "";
						
						//long oldid = id;	
						System.out.println("numberOfTokens:"+numberOfTokens);
												
						if (newNode.isArray()) {
							//parent_id = id;
							parseArray(dm, newNode, level, array_indx, parent_id, parent_str);
							//parent_id = oldid;
						}
						else if (newNode.isObject()) {
							//parent_id = id;
							parseObject(dm, newNode, level, array_indx, parent_id, parent_str);
							//parent_id = oldid;
						}
						
						/*if ((step % Integer.valueOf(ConfigurationManager.historical_load_step)) == 0) {
							dm.loadStg_Json_Structure();
							dm.loadStagingHistorical();
							dm.truncateStg_Json_Structure();
						}*/
					}					
				}
				
				/*dm.loadStg_Json_Structure();
				dm.loadStagingHistorical();
				dm.refreshHistDW_v2();
				dm.truncateStg_Json_Structure();*/
				
				parser.close();
				//if (ps!=null) {
				////	ps.executeBatch();				
				//	ps.close();
				//}
				
				//DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
				date = new java.util.Date();
				System.out.println(dateFormat.format(date));
			}
			

		}
		catch(Exception ex) {
			System.out.println(ex.getLocalizedMessage());
		}
	}
	
	public static void parseObject(DatabaseManager dm, JsonNode node, int level, String array_indx, long parent_id, String parent_str) throws JsonProcessingException, IOException, SQLException {
		Iterator<Map.Entry<String,JsonNode>> iterator=node.getFields();
		
		int oldlevel = level;
		//long oldid = id;	
		long oldparentid = parent_id;
		//String array_indx_old = array_indx;
		//int n = 0;
		
		String oldparent_str = parent_str;
		
		while(iterator.hasNext()) {
			
			//String tabs="";
			//for (int k=0;k<level;k++)
			//	tabs+="\t";
			
			Map.Entry<String,JsonNode> jsonNode=iterator.next();				
			
			String key = jsonNode.getKey();				
			JsonNode temp = jsonNode.getValue();	
			
			//System.out.println(tabs+"level="+level);
			//System.out.println(tabs+"-----------------");
			
			//System.out.println(tabs+"PK="+i);	
			//System.out.print("key="+key+"; ");
			//System.out.println("value="+temp.toString());
			//array_indx = array_indx_old+(n+1)+".";
			
			//System.out.println(tabs+"(id="+(++id)+",parent_id="+parent_id+")==>"+key+"="+temp.toString());
			//id++;
			//dm.loadUndefineJSON_v2(ps, ++id, key, temp.toString(), parent_id, temp.asToken().toString(), numberOfTokens, 10L, "MongoDB_v2", level, null, array_indx);
			parent_str = oldparent_str + "." + key;
			
			dm.loadUndefineJSON_v2(++id, key, temp.toString(), parent_id, temp.asToken().toString(), numberOfTokens, 10L, "MongoDB_v2", level, parent_str, array_indx, temp.toString());
			
			//if (id%1000==0)
			//	ps.executeBatch();
			
			if (temp.isArray() && temp.size() > 0) {
				level++;
				//oldid = id;
				oldparentid = parent_id;
				parent_id = id;				
				//parent_str=parent_str+"."+key;
				
				parseArray(dm, temp, level, array_indx, parent_id, parent_str);
				parent_id = oldparentid;
			}
			else if (temp.isObject() && temp.size() > 0) {
				level++;
				//oldid = id;
				oldparentid = parent_id;
				parent_id = id;
				//parent_str=parent_str+"."+key;
				//parent_str=parent_str+"."+key;
				//array_indx = array_indx_old+(n+1)+".";
				parseObject(dm, temp, level, array_indx, parent_id, parent_str);
				parent_id = oldparentid;
			}
						
			level = oldlevel;
			//parent_id = oldid;
			//System.out.println(tabs+"n="+n++);
			
		}
		//parent_id = oldid;
		
	}
	
	public static void parseArray(DatabaseManager dm, JsonNode node, int level, String array_indx, long parent_id, String parent_str) throws JsonProcessingException, IOException, SQLException {	
		//long oldparent_id = parent_id;	
		String array_indx_old = array_indx;
		if (node.isArray()) {
			
			for (int i=0; i<node.size(); i++) {

				//String tabs="";
				//for (int k=0;k<level;k++)
			//		tabs+="\t";				
				
				//System.out.println(tabs+"array index=" + i);				
				
				JsonNode temp = node.get(i);
				
				if (temp.isArray()) {
					//oldid = id;
					//parent_id = id;
					array_indx = array_indx_old+(i+1)+".";
					parseArray(dm, temp, level, array_indx, parent_id, parent_str);
					//parent_id = oldparent_id;
				}
				else if (temp.isObject()) {
					//oldid = id;
					//parent_id = id;
					array_indx = array_indx_old+(i+1)+".";
					parseObject(dm, temp, level, array_indx, parent_id, parent_str);
					//parent_id = oldid;
				}
				
				//System.out.println(tabs+"array index=" + array_indx);
				//parent_id = oldid;
			}	
			//parent_id = oldid;
			
			//array_indx = "";
			
			//array_flag = false;
		}
	}		
	
	/*
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
				if (temp.asToken() == JsonToken.START_OBJECT)
					dm.loadUndefineJSON(key, null, parent_id, temp.asToken().toString(), index, processID, contentType, null);
				else
					dm.loadUndefineJSON(key, temp.toString(), parent_id, temp.asToken().toString(), index, processID, contentType, null);
				
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
	//}		
	
	public static void readJsonArrayNode(JsonNode node) {
		//System.out.println(node);
		
		if (node.isArray()) {
			for (int i=0;i<node.size();i++) {
				System.out.println("array index="+i);
				
				JsonNode child = node.get(i);
				
				if (child.isObject()) {
					readJsonObjectNode(child);
				}
				else if (child.isArray()) {
					readJsonArrayNode(child);
				}
				else {
					System.out.println(child);
				}
			}
		}
	}
	
	public static void readJsonObjectNode(JsonNode node) {
		
		if (node.isObject()) {
			//Iterator<JsonNode> i = node.getElements();
			Iterator<Map.Entry<String,JsonNode>> i=node.getFields();
			while (i.hasNext()) {
				
				Map.Entry<String,JsonNode> jsonNode=i.next();				
				
				String key = jsonNode.getKey();
				JsonNode temp = jsonNode.getValue();				
				
				/*if (temp.isArray()) {
					System.out.print(key+"=");
					System.out.println(temp);
					
					readJsonArrayNode(temp);
					parentId++;
				}
				else */if (temp.isObject()) {
					System.out.println();
					System.out.println("ObjectNode");
					System.out.print(key+"=");
					System.out.println(temp);
					
					//root++;
					//System.out.println("root="+root);
					readJsonObjectNode(temp);
					//parentId++;
					
				}
				else {
					//@SuppressWarnings("unchecked")
					//Map.Entry<String, String> entry = (Map.Entry<String, String>) temp;
					
					//TextNode tNode = (TextNode)temp;
					
					
					if (temp.isValueNode()) {
						System.out.println();
						System.out.println("ValueNode");
						System.out.print(key+"=");
						System.out.println(temp);
						//System.out.println("path="+temp);
						
					}
					//System.out.println(temp.getTextValue());
				}
			}
		}
	}
	
	public static void undefinedJsonSimple() {
		try {
			FileInputStream is = new FileInputStream(new File("/Users/dumitrugutu/Downloads/test_json.txt"));
			String json = IOUtils.toString(is);
			
			System.out.println(json);
			
			Object object = (Object) JSONValue.parseWithException(json);
			
			if (object instanceof JSONObject) {
				System.out.println("json object");
			}
			else if (object instanceof JSONArray) {
				System.out.println("json Array");
			}
			else {
				System.out.println("json element");
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	
	public static void testSince() {
		try {
	        DatabaseManager dm = new DatabaseManager(ConfigurationManager.jdbc_driver, 
					 								 ConfigurationManager.db_url, 
					 								 ConfigurationManager.database, 
					 								 ConfigurationManager.dbuser, 
					 								 ConfigurationManager.dbpassword, 
					 								 ConfigurationManager.getSince(), 
					 								 ConfigurationManager.batchsize,
					 								 "");
	        
	        long since = dm.getLastSinceUnixTimeStamp();
	        
	        System.out.println(since);
		}
		catch(Exception ex) {
			
		}
	}
	
	/*public static void testS3Amazon() {
		try {
			String awsPath = ConfigurationManager.aws_path;
			String awsAccessKey = ConfigurationManager.aws_access_key;
			String awsSecret = ConfigurationManager.aws_secret;
			
			String testFilePath = "/Users/dumitrugutu/Downloads/";
			String testFile = "export.log";
			
			AWSCredentials awsCredentials = new BasicAWSCredentials(awsAccessKey, awsSecret);
			AmazonS3 s3Client = new AmazonS3Client(awsCredentials);
						
			FileInputStream stream = new FileInputStream(testFilePath + testFile);
			ObjectMetadata objectMetadata = new ObjectMetadata();
			PutObjectRequest putObjectRequest = new PutObjectRequest(awsPath, testFile, stream, objectMetadata);
			PutObjectResult result = s3Client.putObject(putObjectRequest);
			System.out.println("Etag:" + result.getETag() + "-->" + result);			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}*/
	
	public static java.sql.Timestamp getCurrentTimeStamp(java.util.Date dt) {
		if (dt == null)
			return null;
		else
			return new Timestamp(dt.getTime());
	}

	public void mongodb_v2(DatabaseManager dm) {
		long etStart = 0L, etEnd = 0L;
		
    	// total execution time in seconds
    	int totalEt = 0, total = 0;
    	
		/*System.out.println("from config.properties file");
		System.out.println(ConfigurationManager.getSince());
		System.out.println(MyUtils.convertDatetoUnixTimeStamp(ConfigurationManager.getSince()));
		System.out.println("---------------------------------- >");*/
		
		// test method
		
		//testSince();
		//jacksonExample();
		//startLR_ETL_Process_Type();
		//System.out.println(0%100);
		//undefinedJson();
		//undefinedJsonSimple();
		//readJsonSprint2();
		
		//testS3Amazon();
		
		/*double val = 331574400d;
		
		java.util.Date dt = MyUtils.convertUnixTimeStampToDateExample(Double.valueOf(val));
		
		System.out.println(MyUtils.convertUnixTimeStampToDateExample(Double.valueOf(val)));
		System.out.println(getCurrentTimeStamp(dt));
		
		System.out.println(MyUtils.isValidDate(dt));
		
		
		DateFormat df = new SimpleDateFormat("MM/dd/YYYY HH:mm:ss");
		System.out.println(df.format(dt));*/
		
		// ############ 
		// Stg_User_Ecom_PO
		
		// set ETLProcessID value
		dm.setmETLProcessDtlID(10L);		
		
		String url = "/Users/dumitrugutu/Downloads/Ecommerce_collections/ecommerce_purchase_orders_624.json";
		String stagingTableName = "Stg_User_Ecom_PO";
		
		System.out.println("URL: "+url);
		etStart = System.currentTimeMillis();
		System.out.println("loading into Stg_Json_Structure ...");

		readJsonSprint2(dm, url, 10L, "MongoDB");
		
		etEnd = System.currentTimeMillis();
		totalEt += (etEnd-etStart)/1000;
		total += totalEt;
		System.out.println("Elapsed time(seconds): "+totalEt);
		
		// 
		totalEt = 0;			
		etStart = System.currentTimeMillis();
		System.out.println("procedure load_Stg_Json_Structure() ...");
		//----
		dm.loadStg_Json_Structure();
		//----
		etEnd = System.currentTimeMillis();
		totalEt += (etEnd-etStart)/1000;
		total += totalEt;
		System.out.println("Elapsed time(seconds): "+totalEt);		
		
		// load into staging
		totalEt = 0;
		etStart = System.currentTimeMillis();
		System.out.println("loading staging tables ...");
		//----
		System.out.println("contentType="+"MongoDB");
		System.out.println("etlProcessID="+"MongoDB");
		dm.build_insert_stmt_v2(stagingTableName);
		//----
		etEnd = System.currentTimeMillis();
		totalEt += (etEnd-etStart)/1000;
		total += totalEt;
		System.out.println("Elapsed time(seconds): "+totalEt);
		
		// load into DHW
		totalEt = 0;
		etStart = System.currentTimeMillis();
		System.out.println("staging to DHW ...");
		//----
		int result = dm.refreshDW();			
		//----
		etEnd = System.currentTimeMillis();
		totalEt += (etEnd-etStart)/1000;
		total += totalEt;
		System.out.println("Elapsed time(seconds): "+totalEt);
		System.out.println("Total Elapsed time(seconds): "+total);
		
		// truncate Stg_JsonStructure
		dm.truncateStg_Json_Structure();
	}
	
	public static String select(DatabaseManager dm, JsonNode node) {
		
		String temp = "";
		String newJson = "";
		
		ArrayList<String> collections = dm.getCollections("MongoDB_v2");
		
		for (int i=0; i<collections.size(); i++) {
			
			temp = "\"" + collections.get(i) + "\":" + node.get(collections.get(i));
			newJson = newJson + temp;
			
			if (i!=collections.size()-1) {
				newJson = newJson + ",";
			}
		}
		
		return "{"+ newJson +"}";
	}
	
	public static void readJSONFromURL() {
		
		try 
		{
			ObjectMapper mapper = new ObjectMapper();	
			String json = readUrl("http://cms.lifereimagined.org/webservice/getcontent.json?content_type=challenge_category");
			System.out.println(json);
			JsonParser parser = mapper.getJsonFactory().createJsonParser(new File(json));
			
			
			while (!parser.isClosed()) {
				JsonToken token = parser.nextToken();
				
				if (token == null) {
					break;
				}
				
				while (parser.nextToken() != null) {
					JsonNode node = mapper.readTree(parser);
					
					System.out.println("node:"+node.toString());
				}				
				
				parser.close();
			}
		}
		catch(Exception ex) {
			System.out.println(ex.getLocalizedMessage());
		}
	}	
	
	private static String readUrl(String urlString) throws Exception {
	    BufferedReader reader = null;
	    try {
	        URL url = new URL(urlString);
	        reader = new BufferedReader(new InputStreamReader(url.openStream()));
	        StringBuffer buffer = new StringBuffer();
	        int read;
	        char[] chars = new char[1024];
	        while ((read = reader.read(chars)) != -1)
	            buffer.append(chars, 0, read); 

	        return buffer.toString();
	    } finally {
	        if (reader != null)
	            reader.close();
	    }
	}
	
	public static String readJSONFromURL(String url) throws MalformedURLException, IOException  {
		return IOUtils.toString(new URL(url).openStream());
	}
	
	
	public static void main(String[] args) throws MalformedURLException, IOException {

		// read configuration file
		//ConfigurationManager.readConfiguration();
		
		/*DatabaseManager dm = new DatabaseManager(ConfigurationManager.jdbc_driver, 
				 ConfigurationManager.db_url, 
				 ConfigurationManager.database, 
				 ConfigurationManager.dbuser, 
				 ConfigurationManager.dbpassword, 
				 ConfigurationManager.getSince(), 
				 ConfigurationManager.batchsize,
				 "");		*/
		
		//dm.setmETLProcessDtlID(10L);
		//dm.setAarpLoadType("MongoDB_v2");
		
		//readJsonSprint2(dm, "", 10L, "MongoDB_v2");
		
		//readJSONFromURL();
		//System.setProperty("jsse.enableSNIExtension", "false");
		//String json = readJSONFromURL("https://cms.lifereimagined.org/webservice/getcontent.json?content_type=challenge_category");
		//System.out.println(json);
		
		/*String l_parentString = StringUtils.strip("results.unu.doi.trei.","\\.");
		System.out.println("l_parentString="+l_parentString);
		String[] parts = l_parentString.split("\\.");
		
		
		System.out.println("l_parentString="+l_parentString);
		System.out.println("len="+parts.length);
		System.out.println("parts0="+parts[0]);
		
		String aaa = "";
		if (parts.length > 0) {
			for (int i=1;i<parts.length;i++) {
				aaa += parts[i] + ".";
			}
		}
		
		System.out.println(StringUtils.strip(aaa,"\\."));*/
		
		//dm.freeResource();
		
		boolean adminCheck = true;
		String s = "~successAllAdmin~~successIRDBAdmin~~successIRDBSuper~";
		
		
		System.out.println(s.indexOf("~successAllAdmin~"));
		System.out.println(s.indexOf("successIRDB"));
		
		if (adminCheck) {
			if (s.indexOf("successAllAdmin") > -1 || s.indexOf("successIRDBAdmin") > -1 || s.indexOf("successIRDBSuper") > -1)
				System.out.println("admin");
		}
		else {
			if ((s.indexOf("successAll") > -1) || (s.indexOf("successIRDB") > -1))
				System.out.println("regular user");
		}
		
		System.out.println((s.indexOf("success") > -1) && (s.indexOf("IRDB") > -1) && ! adminCheck);
	}
	
	

}
