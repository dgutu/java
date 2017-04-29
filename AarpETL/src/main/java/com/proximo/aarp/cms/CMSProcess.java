package com.proximo.aarp.cms;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.JsonToken;

import com.proximo.aarp.data.*;
import com.proximo.aarp.util.ConfigurationManager;

public class CMSProcess {
	
	final static String SOURCE_FILE = "FILE";
	final static String SOURCE_URL = "URL";
	
	static final Logger logger = Logger.getLogger(CMSProcess.class);

	// db manager
	private DatabaseManager dm;
	
	// json file content
	private String json;
	
	// cms url 
	private String jsonURL;
	
	// cms content_type
	private String contentType;
	
	// source system
	private String sourceSystem = "";
	
	// etl process ID
	private long etlProcessID = 0L;	
	
	// flag next JsonToken
	//private boolean flag_next_token = false;
	
	// keep number of tokens in the JSON file
	private int numberOfTokens = 0;
	
	// flag that JSON is loaded from local file or URL
	private String jsonSource;
	
	// json file location
	private String jsonFile;
	
	public static Long id = 0L, parentID = 0L;
	
	public static String parentString = "", arrayIndex = "", parentTagType = "";
	
	// insert statement for MongoDBAPI
	public StringBuilder insertStmt = new StringBuilder();
	
	public CMSProcess() {		
	}
	
	public CMSProcess(DatabaseManager dm, String json) {
		this.dm = dm;
		this.json = json;
	}
	
	public String readJSONFromURL() throws MalformedURLException, IOException {
		return IOUtils.toString(new URL(getJsonURL()).openStream());
	}
	
	public static String getJSON(String urlString) throws Exception {
	    URL url = new URL(urlString);	    
        InputStream is = url.openStream();
        Scanner scan = new Scanner(is);
        StringBuilder responseString = new StringBuilder();
        while (scan.hasNextLine()) {
            responseString.append(scan.nextLine());
        }	    
        scan.close();
	    return responseString.toString();
	}
	
	/*
	public void process() throws Exception {
		long etStart = 0L, etEnd = 0L;		
		
		ObjectMapper mapper = new ObjectMapper();
		/*mapper.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
		mapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
		mapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS, true);
		mapper.configure(JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER, true);
		mapper.configure(JsonParser.Feature.ALLOW_COMMENTS, true);
		mapper.configure(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS, true);
		mapper.configure(JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS, true);*/
		//JsonParser parser = mapper.getJsonFactory().createJsonParser(getJSON(getJsonURL()));		
		/*
		logger.debug("get JSON file from API ...");
		etStart = System.currentTimeMillis();
		//----
		URL url = new URL(getJsonURL());
		JsonParser parser = mapper.getJsonFactory().createJsonParser(url);
		//JsonParser parser = mapper.getJsonFactory().createJsonParser(new File("/Users/dumitrugutu/Downloads/long.txt"));
		logger.debug("Size of JSON file: "+MyUtils.getContentSize(url));
		
		// reset number of tokens in JSON each time we have a new URL
		numberOfTokens = 0;
		//----
		etEnd = System.currentTimeMillis();
		logger.debug("Elapsed time to get JSON file from API(seconds): "+(etEnd-etStart)/1000);    
		
		while (!parser.isClosed()) {
			JsonToken token = parser.nextToken();
			
			if (token == null) {
				break;
			}
			
			/*if (!JsonToken.START_ARRAY.equals(token)) {
				logger.debug("Expected an array");
				break;
			}*/
			/*
			while (parser.nextToken() != null) {
				JsonNode node = parser.readValueAsTree();
				//System.out.println("node:"+node.toString());
				
				if (!node.toString().equals("null")) {
				
					JsonNode newNode;
				
					if (Integer.valueOf(ConfigurationManager.filter_json) != 0) {
						newNode = mapper.readTree(select(node));
					}
					else {
						newNode = node;
					}					
				
					//System.out.println("newNode:"+newNode.toString());
				
					// flag that is next token, useful for MongoDB
					flag_next_token=true;
					printJsonObject(newNode);
				
					// count number of tokens in the JSON file				
					numberOfTokens++;
					
				}
			}
			
			parser.close();			
		}
	}
	
	
	public void printJsonObject(JsonNode node) {

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
					dm.loadUndefineJSON(key, null, parent_id, temp.asToken().toString(), numberOfTokens, etlProcessID, this.contentType, null);
				else
					dm.loadUndefineJSON(key, temp.toString(), parent_id, temp.asToken().toString(), numberOfTokens, etlProcessID, this.contentType, null);
				
				printJsonObject(temp);
			}
		}
		// array type JSON
		else if (node.isArray()) {
			for (int i=0;i<node.size();i++) {
				//index++;

				JsonNode child = node.get(i);
				printJsonObject(child);
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
	
	public int load() {
		
    	long etStart = 0L, etEnd = 0L;

    	// total execution time in seconds
    	int totalEt = 0;
    	
    	int result = 1; // success 
    	
    	try {		
			// insert into lr_etl_process_type 
			dm.startLR_ETL_Process_Type(getJsonURL(), null, contentType);
			
			// get last ETLProcessTypeID from lr_etl_process_type
			dm.getLastETLProcessData();
			
			// insert into lr_etl_process_dtl
			dm.startLR_ETL_Process_Dtl(dm.getmETLProcessTypeID(), null, null, null, contentType);
			
			// set etlProcessID, get last ETLProcessID from lr_etl_process_dtl
			setEtlProcessID(dm.getLastETLProcessDtlID());
			
			// process CMS API 
			etStart = System.currentTimeMillis();
			
			// MognoDB
			if (this.getSourceSystem().equals(ConfigurationManager.mongodb_source_system))  
				logger.debug("loading into Stg_Json_Structure_v2 ...");
			// CMS
			else if (this.getSourceSystem().equals(ConfigurationManager.cms_source_system))
				logger.debug("loading into Stg_Json_Structure ...");
			
			//----
			this.process_v2();
			//----
			etEnd = System.currentTimeMillis();
			totalEt += (etEnd-etStart)/1000;
			logger.debug("totalEt="+totalEt);
			
			// load_Stg_Json_Structure
			if (Integer.valueOf(ConfigurationManager.load_into_staging) != 0) {
				// load into staging
				totalEt = 0;
				etStart = System.currentTimeMillis();
				logger.debug("loading staging tables ...");
				//----
				logger.debug("contentType="+contentType);
				logger.debug("etlProcessID="+etlProcessID);
				dm.loadStagingCMS();
				//----
				etEnd = System.currentTimeMillis();
				totalEt += (etEnd-etStart)/1000;
				logger.debug("totalEt="+totalEt);
			}
			
			// end logging
			dm.endLR_ETL_Process_Dtl(ConfigurationManager.getEtlSuccessMessage());
			dm.endLR_ETL_Process_Type(ConfigurationManager.getEtlSuccessMessage());	
    	}
    	catch(Exception ex) {
			result = -1;
			ex.printStackTrace();
			logger.error(ex.getMessage());		
    	}
    	
    	return result;
	}
	
	// filter Json using collections ArrayList
	// will process only collections that are defined in database 
	public String select(JsonNode node) {
		
		String temp = "";
		String newJson = "";
		
		ArrayList<String> collections = dm.getCollections(contentType);
		
		for (int i=0; i<collections.size(); i++) {
			
			JsonNode childNode = node.get(collections.get(i));
			
			if (childNode != null && ((childNode.isObject() && childNode.toString().length() > 0) || (childNode.isArray() && childNode.size() > 0))) {			
				temp = "\"" + collections.get(i) + "\":" + node.get(collections.get(i));
				newJson = newJson + temp + ",";
			}
		}
		
		return "{"+ StringUtils.strip(newJson,",") +"}";
	}
	
	public void process_v2() throws Exception {
		long etStart = 0L, etEnd = 0L;	
		int level;
		ObjectMapper mapper = new ObjectMapper();
		JsonParser parser = null;
		URL url = null;
		File file = null;
		String jsonFile = this.getJsonFile();		
		// ------
		logger.debug("get JSON file from API ...");
		etStart = System.currentTimeMillis();
		//----
		if (this.getJsonSource().equals(CMSProcess.SOURCE_FILE)) {
			file = new File(jsonFile);
			if (file.exists()) 
				parser = mapper.getJsonFactory().createJsonParser(file);
			else
				return ;
		}
		else {
			url = new URL(getJsonURL());
			parser = mapper.getJsonFactory().createJsonParser(url);
		}
		//----
		//logger.debug("Size of JSON file: "+MyUtils.getContentSize(url));
		
		// reset number of tokens in JSON each time we have a new URL
		numberOfTokens = 0;
		//----
		etEnd = System.currentTimeMillis();
		logger.debug("Elapsed time to get JSON file from API(seconds): "+(etEnd-etStart)/1000);    
		
		// reset variables
		arrayIndex = "";
		parentString = "";
		level = 0;
		id = 0L;
		parentID = 0L;
		
		// reset insertStmt StringBuilder
		resetInsertStmt();
		
		String jsonFileContent = "";
		
		while (!parser.isClosed()) {
			JsonToken token = parser.nextToken();
			
			if (token == null) {
				break;
			}
			
			while (parser.nextToken() != null) {
				JsonNode node = parser.readValueAsTree();
				
				jsonFileContent += node.asText();
				
				if (!node.toString().equals("null")) {
				
					JsonNode newNode;
				
					if (Integer.valueOf(ConfigurationManager.filter_json) != 0) {
						newNode = mapper.readTree(select(node));
					}
					else {
						newNode = node;
					}
					
					//System.out.println(newNode.toString());
					
					// count number of tokens in the JSON file				
					numberOfTokens++;
					
					// load into staging if load_step match and source system is MongoDB_v2
					//if (this.getSourceSystem().equals(ConfigurationManager.mongodb_source_system) && (Integer.valueOf(ConfigurationManager.load_step) != 0 && (numberOfTokens % Integer.valueOf(ConfigurationManager.load_step)) == 0)) {
					// 	dm.loadStagingMongoDB_v2();
					//	dm.truncateStg_Json_Structure_v2();
					//}
					
					// process JSON
					if (newNode.isArray()) {
						parseArray(newNode,level, parentString, arrayIndex);
					}
					else if (newNode.isObject()) {
						parseObject(newNode, level, parentString, arrayIndex);
					}
				}
			}
			
			parser.close();			
		}
		
		byte[] bt = jsonFileContent.getBytes("UTF-8");
		
		logger.debug("Size of JSON file (bytes): "+ bt.length);
		
		// insert into database
		dm.loadUndefineJSON_v3(StringUtils.strip(insertStmt.toString(),","));
		//System.out.println(StringUtils.strip(insertStmt.toString(),","));
	}	
	
	// parse JSON Object
	public void parseObject(JsonNode node, Integer level, String parentString, String arrayIndex) throws JsonProcessingException, IOException {
		
		Iterator<Map.Entry<String,JsonNode>> iterator=node.getFields();
		
		int oldLevel = level;
		long oldParentID = parentID;
		String oldParentString = parentString;
		
		// commit into database and reset insertStmt 
		commitIntoDatabase(id);
		
		while(iterator.hasNext()) {
			
			Map.Entry<String,JsonNode> jsonNode=iterator.next();				
			
			String key = jsonNode.getKey();				
			JsonNode temp = jsonNode.getValue();	
			
			parentString = oldParentString + "." + key;			
			
			//System.out.println("id="+(id));
			//System.out.println("key="+key);
			//System.out.println("temp="+temp.toString());
			
			// for parent tag do not save meta value
			if (parentID == 0 && (Integer.valueOf(ConfigurationManager.load_parentid_zero_meta_value) == 0)) { 
				// MongoDB_v2				
				if (this.getSourceSystem().equals(ConfigurationManager.mongodb_source_system)) {
					
					// if parentID is same as config ConfigurationManager.parent_id_value then it's parent_tag_type value
					if (parentID == Long.valueOf(ConfigurationManager.parent_id_value)) { 
						parentTagType = temp.asToken().toString();
					}
					
					//dm.loadUndefineJSON_v2(++id, key, null, parentID, temp.asToken().toString(), numberOfTokens, etlProcessID, this.contentType, level, parentString, arrayIndex, parentTagType);
					buildInsertStmtMongo(++id, key, temp.toString(), parentID, temp.asToken().toString(), numberOfTokens, etlProcessID, this.contentType, level, parentString, arrayIndex, parentTagType);
				}
				// CMS				
				else {
					//dm.loadUndefineJSON(++id, key, null, parentID, temp.asToken().toString(), arrayIndex, etlProcessID, this.contentType,parentString);
					buildInsertStmtCMS(++id, key, null, parentID, temp.asToken().toString(), arrayIndex, etlProcessID, this.contentType,parentString);
				}
			}
			else {
				// MongoDB_v2
				if (this.getSourceSystem().equals(ConfigurationManager.mongodb_source_system)) {

					// if parentID is same as config ConfigurationManager.parent_id_value then it's parent_tag_type value
					if (parentID == Long.valueOf(ConfigurationManager.parent_id_value)) { 
						parentTagType = temp.asToken().toString();
					}

					//dm.loadUndefineJSON_v2(++id, key, temp.toString(), parentID, temp.asToken().toString(), numberOfTokens, etlProcessID, this.contentType, level, parentString, arrayIndex, parentTagType);
					buildInsertStmtMongo(++id, key, temp.toString(), parentID, temp.asToken().toString(), numberOfTokens, etlProcessID, this.contentType, level, parentString, arrayIndex, parentTagType);
				}
				// CMS
				else {
					//dm.loadUndefineJSON(++id, key, temp.toString(), parentID, temp.asToken().toString(), arrayIndex, etlProcessID, this.contentType,parentString);
					buildInsertStmtCMS(++id, key, temp.toString(), parentID, temp.asToken().toString(), arrayIndex, etlProcessID, this.contentType,parentString);
				}
			}
			
			if (temp.isArray() && temp.size() > 0) {
				level++;
				oldParentID = parentID;
				parentID = id;				
				parseArray(temp, level, parentString, arrayIndex);
				parentID = oldParentID;
			}
			else if (temp.isObject() && temp.size() > 0) {
				level++;
				oldParentID = parentID;
				parentID = id;				
				parseObject(temp, level, parentString, arrayIndex);
				parentID = oldParentID;
			}
			
			// set level
			level = oldLevel;
		}
	}
	
	public StringBuilder buildInsertStmtMongo(Long id, String metaData, String metaValue, Long parentId, String pType, Integer pIndex, Long etlProcessID, String contentType, Integer level, String parentString, String array_indx, String parentTagType) {
		
		String l_parentString = StringUtils.strip(parentString,"\\.");
		
		String[] parts = l_parentString.split("\\.");
		
		String l_parent_tag = "";
		
		if (parts.length == 1) {
			l_parent_tag = l_parentString;
		}
		else if (parts.length > 1) {
			l_parent_tag = parts[1];
		}
		
		insertStmt.append("(" + (id) + ",'" + metaData + "','" + StringUtils.replace(metaValue, "'", "''") + "'," + parentId + ",'" + pType + "'," + pIndex + ",'" + l_parentString + "'," + level + ",'" + StringUtils.strip(array_indx,"\\.") + "','" + l_parent_tag + "','" + parentTagType + "'," + etlProcessID + ", now()),");

		return insertStmt;
	}
	
	public StringBuilder buildInsertStmtCMS(Long id, String metaData, String metaValue, Long parentId, String pType, String pIndex, Long etlProcessID, String contentType, String parentString) {
		
		String l_parentString = StringUtils.strip(parentString,"\\.");
		
		String[] parts = l_parentString.split("\\.");
		
		String l_parentString2 = "";
		
		if (parts.length > 0) {
			for (int i=1;i<parts.length;i++) {
				l_parentString2 += parts[i] + ".";
			}
		}
		
		l_parentString2 = StringUtils.strip(l_parentString2,"\\.");
		
		insertStmt.append("(" + (id) + ",'" + metaData + "','" + StringUtils.replace(metaValue, "'", "''") + "'," + parentId + ",'" + pType + "','" + StringUtils.strip(pIndex,"\\.") + "','" + l_parentString + "','" + l_parentString2 + "'," + etlProcessID + ", now()),");

		return insertStmt;
	}	
	
	// reset insertStmt StringBuilder string if "id" match ConfigurationManager.load_step 
	public void commitIntoDatabase(Long id) {
		if (this.getSourceSystem().equals(ConfigurationManager.mongodb_source_system) && (Integer.valueOf(ConfigurationManager.load_step) != 0 && (id > 0) && (id % Integer.valueOf(ConfigurationManager.load_step)) == 0)) {
			// load into database
			dm.loadUndefineJSON_v3(StringUtils.strip(insertStmt.toString(),","));
			
			// reset insertStmt StringBuilder
			resetInsertStmt();
		}
	}
	
	public void resetInsertStmt() {
		// reset SQL insert statement
		insertStmt.setLength(0);
		
		// MognoDB
		if (this.getSourceSystem().equals(ConfigurationManager.mongodb_source_system))  
			insertStmt.append("insert into Stg_Json_Structure_v2 (id,meta_data,meta_value,parent_id,type,nr_token,parent_str,level,array_indx,parent_tag,parent_tag_type,ETLProcessID,Created) values ");
		// CMS
		else if (this.getSourceSystem().equals(ConfigurationManager.cms_source_system))
			insertStmt.append("insert into Stg_Json_Structure (id,meta_data,meta_value,parent_id,type,array_indx,parent_str,parent_str2,ETLProcessID,Created) values ");
	}
	
	// parse JSON Array
	public void parseArray(JsonNode node, Integer level, String parentString, String arrayIndex) throws JsonProcessingException, IOException {	
		String oldarrayIndex = arrayIndex;
		
		if (node.isArray()) {
			
			for (int i=0; i<node.size(); i++) {
				JsonNode temp = node.get(i);
				
				if (temp.isArray()) {
					arrayIndex = oldarrayIndex+(i+1)+".";
					parseArray(temp, level, parentString, arrayIndex);
				}
				else if (temp.isObject()) {
					arrayIndex = oldarrayIndex+(i+1)+".";
					parseObject(temp, level, parentString, arrayIndex);
				}
			}	
		}		
	}		

	public DatabaseManager getDm() {
		return dm;
	}

	public void setDm(DatabaseManager dm) {
		this.dm = dm;
	}

	public String getJson() {
		return json;
	}

	public void setJson(String json) {
		this.json = json;
	}

	public String getJsonURL() {
		return jsonURL;
	}

	public void setJsonURL(String url) {
		this.jsonURL = url;
		
		// reset number of tokens for each url change
		setNumberOfTokens(0);
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public long getEtlProcessID() {
		return etlProcessID;
	}

	public void setEtlProcessID(long etlProcessID) {
		this.etlProcessID = etlProcessID;
	}

	public int getNumberOfTokens() {
		return numberOfTokens;
	}

	public void setNumberOfTokens(int numberOfTokens) {
		this.numberOfTokens = numberOfTokens;
	}

	public String getJsonSource() {
		return jsonSource;
	}

	public void setJsonSource(String jsonSource) {
		this.jsonSource = jsonSource;
	}

	public String getJsonFile() {
		return jsonFile;
	}

	public void setJsonFile(String jsonFile) {
		this.jsonFile = jsonFile;
	}

	public String getSourceSystem() {
		return sourceSystem;
	}

	public void setSourceSystem(String sourceSystem) {
		this.sourceSystem = sourceSystem;
	}
	
}
