package com.proximo.aarp.util;

import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

public class ConfigurationManager {
	
	// logger
	static final Logger logger = Logger.getLogger(ConfigurationManager.class);
	
	// mysql database name
	public static String database;
	
	// mysql database username
	public static String dbuser;
	
	// mysql database password
	public static String dbpassword;
	
	// mysql driver
	public static String jdbc_driver;
	
	// mysql database url
	public static String db_url;
	
	// batch size used for batch processing
	public static int batchsize;	
	
	// aarp full json url string
	public static String jsonurl;
	
	// aarp base json url string
	public static String jsonbaseurl;
	
	// aarp page start processing
	public static String jsonpagestart;
	
	// aarp limit of items on the json api page
	public static String jsonlimit;
	
	// aarp json key
	public static String jsonkey;
	
	// aarp json since
	public static String jsonsince;
	
	// aarp json since date format
	public static String jsonsinceformat;
	
	// aarp jsonfile
	public static String jsonfile;
	
	// default value for jsonlimit
	public final static int JSONLIMITDEFAULT = 1;
	
	// default value for jsonpagestart
	public final static int JSONPAGESTARTDEFAULT = 0;
	
	// configuration file from resources folder
	public static String configurationFileName = "/config.properties";
	
	// etlprocesstypename
	public static String etlprocesstypename;
	
	// etlSuccessMessage
	public static String etlSuccessMessage;
	
	// etlErrorMessage
	public static String etlErrorMessage;	
	
	// DW load flag, load DW or not
	public static String dwload; 
	
	// undefinedLoad flag - start undefined process
	public static String undefinedLoad;
	
	// credentials for S3 amazon
	// path
	public static String aws_path;
	
	// access key
	public static String aws_access_key;
	
	// secret
	public static String aws_secret;	
	
	// loop batch
	public static int batchloop;
	
	// step
	public static int step;
	
	// cms source_system
	public static String cms_source_system;
	
	// MongoDB source_system
	public static String mongodb_source_system;
	
	// cms url content_type=challenge_category
	public static String cms_json_url_challenge_category;
	
	// cms url content_type=challenge
	public static String cms_json_url_challenge;
	
	// cms url content_type=challenge_expert
	public static String cms_json_url_challenge_expert;	
	
	// cms url content_type=challenge_step
	public static String cms_json_url_challenge_step;	
	
	// cms url content_type=challenge_step_activity
	public static String cms_json_url_challenge_step_activity;	
	
	// cms content_type=challenge staging table
	public static String cms_ct_challenge_staging_tbl;
	
	// cms content_type=challenge_category staging table
	public static String cms_ct_challenge_category_staging_tbl;
	
	// cms content_type=challenge_expert staging table
	public static String cms_ct_challenge_expert_staging_tbl;
	
	// cms content_type=challenge_step staging table
	public static String cms_ct_challenge_step_staging_tbl;
	
	// cms content_type=challenge_step_activity staging table
	public static String cms_ct_challenge_step_activity_staging_tbl;	
	
	// step on historical JSON load
	public static String historical_load_step;
	
	// step on JSON load
	public static String load_step;
	
	// json file source for MongoDB_v2
	public static String mongoDB_v2_json_file_source;
	
	// is local file is source for MongoDB_v2 load ?
	public static String mongoDB_v2_json_file_source_flag;
	
	// load all files from directory 
	public static String mongoDB_v2_json_dir_source;
	public static String mongoDB_v2_json_dir_source_flag;
	
	// flag if load staging tables
	public static String load_into_staging;
	
	// flag to filter the JSON
	public static String filter_json;
	
	// flag to check truncate Stg_Json_Structure
	public static String truncate_Stg_Json_Structure;
	
	// flag that is historical load
	public static String load_parentid_zero_meta_value;
	
	// load source system
	public static String source_system_load;
	
	// flag to truncate staging tables
	public static String truncate_Staging_Tables;
	
	// check for parent_tag_type
	// check the field from Stg_Json_Structure_v2.parent_id
	// if json is {"result":{"user":{}, "file":{},...}, "last_update_timestamp":last_update_timestamp} - Stg_Json_Structure_v2.parent_id for "user" collection will be 1
	// if json is {"user":{}, "file":{},...}} - Stg_Json_Structure_v2.parent_id for "user" collection will be 0
    public static String parent_id_value;
	
	// read file configuration from file
	public static void readConfiguration(String fileName) {
		InputStream input = null;		
		
		try {
			input = new FileInputStream(fileName);
			
			loadProperties(input);
		}
		catch(Exception ex) {
			logger.error(ex.getMessage());
		}
	}
	
	// read file configuration from stream
	public static void readConfiguration(InputStream input) {
		loadProperties(input);
	}
	
	// constructor read from default location resources/config.properties
	public static void readConfiguration() {
		InputStream input = ConfigurationManager.class.getResourceAsStream(ConfigurationManager.configurationFileName);
		loadProperties(input);
	}	
	
	// load properties from config.properties file
	public static void loadProperties(InputStream input) {
		Properties prop = new Properties();
		
		try {
			// load properties file
			prop.load(input);
			
			// get the properties
			database = prop.getProperty("database");
			dbuser = prop.getProperty("dbuser");
			dbpassword = prop.getProperty("dbpassword");
			jsonurl = prop.getProperty("jsonurl");
			jsonbaseurl = prop.getProperty("jsonbaseurl");
			jsonpagestart = prop.getProperty("jsonpagestart");
			jsonlimit = prop.getProperty("jsonlimit");
			jsonkey = prop.getProperty("jsonkey");		
			jdbc_driver = prop.getProperty("jdbc_driver");
			db_url = prop.getProperty("db_url");
			batchsize = Integer.parseInt(prop.getProperty("batchsize"));
			etlprocesstypename = prop.getProperty("etlprocesstypename");
			jsonsince = prop.getProperty("jsonsince");
			jsonsinceformat = prop.getProperty("jsonsinceformat");
			jsonfile = prop.getProperty("jsonfile");
			etlSuccessMessage = prop.getProperty("etlSuccessMessage");
			etlErrorMessage = prop.getProperty("etlErrorMessage");		
			dwload = prop.getProperty("dwload");
			undefinedLoad = prop.getProperty("undefinedLoad");
			aws_path = prop.getProperty("aws_path");
			aws_access_key = prop.getProperty("aws_access_key");
			aws_secret = prop.getProperty("aws_secret");
			batchloop = Integer.parseInt(prop.getProperty("batchloop"));
			step = Integer.parseInt(prop.getProperty("step"));
			
			cms_source_system=prop.getProperty("cms_source_system");
			mongodb_source_system=prop.getProperty("mongodb_source_system");
			
			cms_json_url_challenge_category=prop.getProperty("cmsjsonurl_ct_challenge_category");
			cms_json_url_challenge=prop.getProperty("cmsjsonurl_ct_challenge");
			cms_json_url_challenge_expert=prop.getProperty("cmsjsonurl_ct_challenge_expert");
			cms_json_url_challenge_step=prop.getProperty("cmsjsonurl_ct_challenge_step");
			cms_json_url_challenge_step_activity=prop.getProperty("cmsjsonurl_ct_challenge_step_activity");			
			cms_ct_challenge_staging_tbl=prop.getProperty("cms_ct_challenge_staging_tbl");
			cms_ct_challenge_category_staging_tbl=prop.getProperty("cms_ct_challenge_category_staging_tbl");
			cms_ct_challenge_expert_staging_tbl=prop.getProperty("cms_ct_challenge_expert_staging_tbl");
			cms_ct_challenge_step_staging_tbl=prop.getProperty("cms_ct_challenge_step_staging_tbl");
			cms_ct_challenge_step_activity_staging_tbl=prop.getProperty("cms_ct_challenge_step_activity_staging_tbl");		
			
			mongoDB_v2_json_file_source=prop.getProperty("mongoDB_v2_json_file_source");
			mongoDB_v2_json_file_source_flag=prop.getProperty("mongoDB_v2_json_file_source_flag");
			
			historical_load_step=prop.getProperty("historical_load_step");
			load_step=prop.getProperty("load_step");
			
			load_into_staging=prop.getProperty("load_into_staging");
			
			filter_json=prop.getProperty("filter_json");
			
			truncate_Stg_Json_Structure=prop.getProperty("truncate_Stg_Json_Structure");
			load_parentid_zero_meta_value=prop.getProperty("load_parentid_zero_meta_value");
			
			source_system_load=prop.getProperty("source_system_load");
			
			truncate_Staging_Tables=prop.getProperty("truncate_Staging_Tables");
			
			parent_id_value=prop.getProperty("parent_id_value");
			
			mongoDB_v2_json_dir_source=prop.getProperty("mongoDB_v2_json_dir_source");
			mongoDB_v2_json_dir_source_flag=prop.getProperty("mongoDB_v2_json_dir_source_flag");
		}
		catch(Exception ex) {
			ex.printStackTrace();
			logger.error("Exception: " + ex.getLocalizedMessage());
		}
		finally {
			if (input != null) {
				try {
					input.close();
				}
				catch(Exception ex) {
					ex.printStackTrace();
					logger.error("Exception: " + ex.getLocalizedMessage());
				}
			}
		}
	}
	
	// get jsonlimit parameter as int
	public static int getLimit() {		
		if (!StringUtils.isBlank(jsonlimit)) {			
			try {
				return Integer.parseInt(jsonlimit);
			}
			catch(Exception ex) {
				return JSONLIMITDEFAULT;
			}
		}
		else			
			return JSONLIMITDEFAULT;
	}
	
	// get jsonpagestart as int 
	public static int getPageStart() {
		
		if (!StringUtils.isBlank(jsonpagestart)) {			
			try {
				return Integer.parseInt(jsonpagestart);
			}
			catch(Exception ex) {
				return JSONPAGESTARTDEFAULT;
			}
		}
		else			
			return JSONPAGESTARTDEFAULT;
	}
	
	// get jsonsince as Date
	public static Date getSince() {
		Date newDate = new Date();
		
		try {
			SimpleDateFormat df = new SimpleDateFormat(jsonsinceformat);
			newDate = df.parse(jsonsince);
		}
		catch(Exception ex) {
			ex.printStackTrace();
			logger.error("Exception: " + ex.getLocalizedMessage());			
		}
		
		return newDate;
	}

	public static String getConfigurationFileName() {
		return configurationFileName;
	}
	
	public static String connectionString() {
		return db_url.concat(database).concat("?").concat("user=").concat(dbuser).concat("&password=").concat(dbpassword);
	}

	public static String getEtlprocesstypename() {
		return etlprocesstypename;
	}

	public static void setEtlprocesstypename(String etlprocesstypename) {
		ConfigurationManager.etlprocesstypename = etlprocesstypename;
	}

	public static String getEtlSuccessMessage() {
		return etlSuccessMessage;
	}

	public static void setEtlSuccessMessage(String etlSuccessMessage) {
		ConfigurationManager.etlSuccessMessage = etlSuccessMessage;
	}

	public static String getEtlErrorMessage() {
		return etlErrorMessage;
	}

	public static void setEtlErrorMessage(String etlErrorMessage) {
		ConfigurationManager.etlErrorMessage = etlErrorMessage;
	}
	
	public static Integer getDWLoad() {
		if (StringUtils.isBlank(dwload)) 
			return 0;
		else
			return Integer.parseInt(dwload);
	}
	
	public static Integer getUndefinedLoad() {
		if (StringUtils.isBlank(undefinedLoad)) 
			return 0;
		else
			return Integer.parseInt(undefinedLoad);
	}
}
