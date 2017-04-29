package com.proximo.aarp.data;

//import java.io.File;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONObject;

import com.proximo.aarp.json.collections.*;
import com.proximo.aarp.json.data.Processing;
import com.proximo.aarp.util.API;
import com.proximo.aarp.util.ConfigurationManager;
import com.proximo.aarp.util.LogData;
import com.proximo.aarp.util.MyUtils;

public class DatabaseManager {
	
	// logger
	static final Logger logger = Logger.getLogger(DatabaseManager.class);
	
	// jdbc_driver from config.properties
	private String jdbcDriver;
	
	// db_url from config.properties
	private String dbUrl;
	
	// database from config.properties
	private String database;
	
	// dbuser from config.properties
	private String dbUser;
	
	// dbpassword from config.properties
	private String dbPassword;
	
	// jsonSince used to build Last since value
	private java.util.Date jsonSince;
	
	// connection to database	
	private Connection connection = null;
	
	// processing JSON
	private Processing p;
	
	// LogData class
	private LogData logData;
	
	// get current ETLProcessTypeID, ETLProcessTypeParamDt, ETLProcessTypeCreatedDate from LR_ETL_Process_Type 
	// get current ETLProcessID from LR_ETL_Process_Dtl
	// get current ETLLoadErrID from LR_ETL_Load_Error	
	// get current ID from Stg_Json_Structure
	private Long mETLProcessTypeID = 0L, mETLProcessDtlID = 0L, mETLLoadErrID = 0L, mIdJsonUndefineStructure = 0L;
	private java.util.Date mETLProcessTypeParamDt = null, mETLProcessTypeCreatedDate = null, since = null;
	
	private String sinceStr = "";
	
	// previous process is still running
	// false = previous process is finished
	// true  = previous process is running
	private Boolean mETLStillRun = false;

	// current ste_id from Stg_User_Challenge_Step and step_uid from LR_User_Challenge_Step
	private Long mStepID = 0L, mStepIDDW = 0L, mCombinedStepID = 0L;
	
	// error message
	private String errorMessage;
	
	private Integer batchSize = 0;
	
	// Stg_user sql
	private String sql_Stg_user = "{call LoadUser(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";		
	
	// Stg_User_Challenge_Stats sql
	private String sql_Stg_User_Narrow_OptOut = "{call LoadUserNarrowOptOut(?,?,?,?,?)}";
	
	// Stg_Userflag sql
	private String sql_Stg_Userflag = "{call LoadUserFlag(?,?,?,?,?,?)}";
	
	// Stg_User_Quiz sql
	private String sql_Stg_User_Quiz = "{call LoadUserQuiz(?,?,?,?,?,?,?,?,?,?,?)}";
	
	// Stg_User_Quiz_Answers sql
	private String sql_Stg_User_Quiz_Answers = "{call LoadUserQuizAnswers(?,?,?,?,?,?,?,?)}";
	
	// Stg_File sql
	private String sql_Stg_File = "{call LoadFile(?,?,?,?,?,?,?,?,?,?)}";
	
	// Stg_User_Login sql
	private String sql_Stg_User_Login = "{call LoadUserLogin(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
	
	// Stg_Linkedin_Work_History sql
	private String sql_Stg_Linkedin_Work_History = "{call LoadLinkedinWorkHistory(?,?,?,?,?,?,?,?,?,?,?)}";
	
	// Stg_Linkedin_Work_History_Pos sql
	private String sql_Stg_Linkedin_Work_History_Pos = "{call LoadLinkedinWorkHistoryPos(?,?,?,?,?,?,?,?,?,?)}";
	
	// Stg_User_Profile sql
	private String sql_Stg_User_Profile = "{call LoadUserProfile(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";	
	
	// Stg_User_Challenge sql
	private String sql_Stg_User_Challenge = "{call LoadUserChallenge(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
	
	// used for user_challenge load from files, bug found for completed_time in User_Challenge_Step table
	private String sql_Stg_User_Challenge_v2 = "{call LoadUserChallenge_v2(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
	// ----------
	
	// Stg_User_Challenge_Step sql
	private String sql_Stg_User_Challenge_Step = "{call LoadUserChallengeStep(?,?,?,?,?,?,?,?)}";
	
	// used for user_challenge load from files, bug found for completed_time in User_Challenge_Step table
	private String sql_Stg_User_Challenge_Step_v2 = "{call LoadUserChallengeStep_v2(?,?,?,?,?,?,?,?)}";
	// ----------
	
	// Stg_User_Challenge_Step_Activity sql
	private String sql_Stg_User_Challenge_Step_Activity = "{call LoadUserChallengeStepActivity(?,?,?,?,?,?,?,?)}";

	// used for user_challenge load from files, bug found for completed_time in User_Challenge_Step table	
	private String sql_Stg_User_Challenge_Step_Activity_v2 = "{call LoadUserChallengeStepActivity_v2(?,?,?,?,?,?,?,?)}";
	// ----------
	
	// Stg_User_Challenge_Stats sql
	private String sql_Stg_User_Challenge_Stats = "{call LoadUserChallengeStats(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
	
	// Stg_Survey_Challenge sql
	private String sql_Stg_Survey_Challenge = "{call LoadSurveyChallenge(?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
	
	// MongoDB, CMS_challenge_category
	private String aarpLoadType;
	
	// constructor
	public DatabaseManager() {
		logData = new LogData();
	}
	
	// constructor
	public DatabaseManager(String jdbcDriver, String dbUrl, String database, String dbUser, String dbPassword, java.util.Date jsonSince, Integer batchSize, String aarpLoadType) {
		this.jdbcDriver = jdbcDriver;
		this.dbUrl = dbUrl;
		this.database = database;
		this.dbUser = dbUser;
		this.dbPassword = dbPassword;
		this.jsonSince = jsonSince;
		this.batchSize = batchSize;
		this.aarpLoadType = aarpLoadType;
		
		// build connection
		getConnection();		
		
		// init LogData class
		logData = new LogData();
	}
	
	// build connection string
	public String connectionString() {
		return this.dbUrl.concat(database).concat("?").concat("user=").concat(dbUser).concat("&password=").concat(dbPassword);		
	}	
	
	// get database connection
	public Connection getConnection() {		
		try {
			Class.forName(jdbcDriver);
			
			connection = DriverManager.getConnection(this.dbUrl + this.database, this.dbUser, this.dbPassword);
		}
		catch(Exception ex) {
			ex.printStackTrace();
			logger.error("Exception:" + ex.getMessage());
			errorMessage = ex.getMessage();
		}
		
		return connection;
	}
	
	// PreparedStatement for Stg_user table
	public void getPrStmtStg_user(PreparedStatement ps, User user) throws Exception  {	

		ps.setString(1,user.getID().getOid());											  									   // oid
		
		// _type
		if (user.getType().size() > 0)
			ps.setString(2,user.getType().get(0));											  									   
		else
			ps.setString(2, "");
		
		ps.setString(3,user.getChannel());                             					  									   // channel
		ps.setObject(4, StringUtils.isBlank(user.getBetaAccess()), java.sql.Types.SMALLINT);		   						   // beta_access
		ps.setObject(5, this.getCurrentTimeStamp(user.getCreatedFormat()), java.sql.Types.TIMESTAMP);			  			   // created
		ps.setObject(6, this.getCurrentTimeStamp(user.getDobFormat()), java.sql.Types.TIMESTAMP);				   			   // dob
		ps.setObject(7, this.getCurrentTimeStamp(user.getDobUpdatedFormat()), java.sql.Types.TIMESTAMP);		  			   // dob_updated
		ps.setString(8, user.getEmail());																					   // email
		ps.setObject(9, this.getCurrentTimeStamp(user.getEmailUpdatedFormat()), java.sql.Types.TIMESTAMP);		  			   // email_updated
		ps.setString(10, user.getFirstName());																				   // firstname
		ps.setObject(11, this.getCurrentTimeStamp(user.getFirstNameUpdatedFormat()), java.sql.Types.TIMESTAMP);				   // firstname_updated
		ps.setObject(12, this.getCurrentTimeStamp(user.getLastLoginFormat()), java.sql.Types.TIMESTAMP);					   // lastlogin
		ps.setString(13, user.getLastName());																				   // lastname
		ps.setObject(14, this.getCurrentTimeStamp(user.getLastNameUpdatedFormat()), java.sql.Types.TIMESTAMP);		    	   // lastname_updated
		ps.setObject(15, user.getThirdParty(), java.sql.Types.INTEGER);														   // third_party
		ps.setObject(16, this.getCurrentTimeStamp(user.getUpdatedFormat()), java.sql.Types.TIMESTAMP);                         // updated
		ps.setString(17, user.getUsername());																				   // username				
		ps.setString(18, user.getZipCode());                                                         						   // zip_code
		ps.setObject(19, this.getCurrentTimeStamp(user.getZipUpdatedFormat()), java.sql.Types.TIMESTAMP);                  	   // zip_updated	
		ps.setObject(20, user.getUserSettings().getemail(), java.sql.Types.INTEGER);                                           // settings_email                          
		ps.setObject(21, user.getUserSettings().getprofile_photo(), java.sql.Types.INTEGER);                                   // settings_profile_photo                  
		ps.setObject(22, user.getUserSettings().getlocation(), java.sql.Types.INTEGER);                                        // settings_location                       
		ps.setObject(23, user.getUserSettings().getprofession(), java.sql.Types.INTEGER);                                      // settings_profession                     
		ps.setObject(24, user.getUserSettings().getcompany(), java.sql.Types.INTEGER);                                         // settings_company                        
		ps.setObject(25, user.getUserSettings().getoccupation(), java.sql.Types.INTEGER);                                      // settings_occupation                     
		ps.setObject(26, user.getUserSettings().getreceive_stories_emails(), java.sql.Types.INTEGER);                          // settings_receive_stories_emails         
		ps.setObject(27, user.getUserSettings().getreceive_success_reminder_emails(), java.sql.Types.INTEGER);                 // settings_receive_success_reminder_emails
		ps.setObject(28, user.getUserSettings().getreceive_conversation_emails(), java.sql.Types.INTEGER);                     // settings_receive_conversation_emails    
		ps.setObject(29, user.getUserSettings().getreceive_events_emails(), java.sql.Types.INTEGER);                           // settings_received_events_emails         
		ps.setString(30, user.getUserSettings().getCOI().getStatus());														   // settings_coi_status 		
		ps.setString(31, user.getCampaign()); 																				   // campaign
		ps.setString(32, user.getSourceCodes()); 																			   // source_codes
		ps.setObject(33, this.getmETLProcessDtlID(), java.sql.Types.INTEGER);                         						   // ETLLogID			
	}
	
	// PreparedStatement for Stg_Userflag table
	public void getPrStmtStg_userflag(PreparedStatement ps, UserFlag userflag) throws Exception  {	

		ps.setString(1,userflag.getID().getOid());									  			    		// userflag_oid
		ps.setString(2,userflag.getuser_id()); 											  					// user_oid
		
		// type
		if (userflag.getType().size() > 0)
			ps.setString(3,userflag.getType().get(0));										  					
		else
			ps.setString(3,"");										  					 
		
		ps.setString(4,userflag.gettype());     										  					// flag_type
		ps.setObject(5, this.getCurrentTimeStamp(userflag.getCreatedFormat()), java.sql.Types.TIMESTAMP);	// created
		ps.setObject(6, this.getmETLProcessDtlID(), java.sql.Types.INTEGER);                         	    // ETLLogID
	}
	
	// PreparedStatement for Stg_User_Quiz table
	public void getPrStmtStg_user_quiz(PreparedStatement ps, UserQuiz userquiz) throws Exception  {	

		ps.setString(1,userquiz.getID().getOid());										 		    		// user_quiz_oid
		ps.setString(2,userquiz.getUserId());											  					// user_oid
		
		// type
		if (userquiz.getType().size() > 0)
			ps.setString(3,userquiz.getType().get(0));										  					
		else
			ps.setString(3,"");			
		
		ps.setObject(4,userquiz.getQuizId(), java.sql.Types.BIGINT);    				  					// quiz_id		
		ps.setObject(5,userquiz.getUserScore(), java.sql.Types.INTEGER);					                // user_score
		ps.setString(6,userquiz.getFrom_flags_user_challenge_id());						  					// fromflag_user_challenge_id		
		ps.setObject(7,userquiz.getFrom_flags_challenge_nid(), java.sql.Types.INTEGER);             		// fromflag_challenge_nid
		ps.setObject(8,userquiz.getFrom_flags_step_nid(), java.sql.Types.INTEGER);						    // fromflag_step_nid
		ps.setObject(9,userquiz.getFrom_flags_activity_nid(), java.sql.Types.INTEGER);						// fromflag_activity_nid
		ps.setObject(10, this.getCurrentTimeStamp(userquiz.getCreatedFormat()), java.sql.Types.TIMESTAMP);	// created
		ps.setObject(11, this.getmETLProcessDtlID(), java.sql.Types.INTEGER);                         		// ETLLogID
		
	}
	
	// PreparedStatement for Stg_userflag table
	public void getPrStmtStg_user_quiz_answers(PreparedStatement ps, String user_quiz_oid, String user_oid, Answers answer) throws Exception  {	

		ps.setString(1,user_quiz_oid);										  			 		  			// user_quiz_oid
		ps.setString(2,user_oid);										  									// user_oid
		ps.setString(3,answer.getAnswer());										  							// answer		
		ps.setObject(4, answer.isComplete(), java.sql.Types.SMALLINT);										// complete
		ps.setObject(5, answer.getPoints(), java.sql.Types.INTEGER);										// points
		ps.setObject(6,answer.getOffset(), java.sql.Types.REAL);						  					// offset
		ps.setObject(7, this.getCurrentTimeStamp(answer.getCreatedFormat()), java.sql.Types.TIMESTAMP);		// created	
		ps.setObject(8, this.getmETLProcessDtlID(), java.sql.Types.INTEGER);                         		// ETLLogID
	}
	
	// PreparedStatement for Stg_File table
	public void getPrStmtStg_file(PreparedStatement ps, LRFile file) throws Exception  {	

		ps.setString(1, file.getID().getOid());								  			 		  			// file_oid
		ps.setString(2, file.getuser_id());								  									// user_oid
		
		// type
		if (file.getType().size() > 0)
			ps.setString(3,file.getType().get(0));										  					
		else
			ps.setString(3,"");	
		
		ps.setString(4, file.getMime());																	// mime
		ps.setObject(5, file.getSize(), java.sql.Types.INTEGER);											// size
		ps.setString(6, file.getName());													  				// name
		ps.setString(7, file.getExtension().substring(0, Math.min(file.getExtension().length(), 99)));		// extension
		ps.setObject(8, file.getContent(), java.sql.Types.LONGVARCHAR);										// content
		ps.setObject(9, this.getCurrentTimeStamp(file.getCreatedFormat()), java.sql.Types.TIMESTAMP);		// created
		ps.setObject(10, this.getmETLProcessDtlID(), java.sql.Types.INTEGER);                         		// ETLLogID
	}
	
	// PreparedStatement for Stg_User_Login table
	public void getPrStmtStg_User_login(PreparedStatement ps, UserLogin userLogin) throws Exception  {	

		ps.setString(1, userLogin.getId().getOid());															// user_login_oid                   
		ps.setString(2, userLogin.getUser_id());	 															// user_oid                           
		
		// type
		if (userLogin.get_type().size() > 0)
			ps.setString(3,userLogin.get_type().get(0));										  					
		else
			ps.setString(3,"");	
		
		ps.setString(4, userLogin.getEmail());																	// email                            
		ps.setString(5, userLogin.getIp());																		// ip                               
		ps.setObject(6, this.getCurrentTimeStamp(userLogin.getgetTimestampFormat()), java.sql.Types.TIMESTAMP); // timestamp                        
		ps.setObject(7, this.getCurrentTimeStamp(userLogin.getCreatedFormat()), java.sql.Types.TIMESTAMP); 		// created                          
		ps.setObject(8, userLogin.getSuccess(), java.sql.Types.SMALLINT); 										// geohash_success                  
		ps.setString(9, userLogin.getIp_info_continent_code());												    // geohash_ipinfo_continent_code    
		ps.setString(10, userLogin.getIp_info_country_code()); 													// geohash_ipinfo_country_code      
		ps.setString(11, userLogin.getIp_info_country_code3());													// geohash_ipinfo_country_code3      
		ps.setString(12, userLogin.getIp_info_country_name()); 													// geohash_ipinfo_country_name      
		ps.setString(13, userLogin.getIp_info_region()); 														// geohash_ipinfo_region            
		ps.setString(14, userLogin.getIp_info_city());															// geohash_ipinfo_city              
		ps.setString(15, userLogin.getIp_info_postal_code());													// geohash_ipinfo_postal_code       
		ps.setObject(16, userLogin.getIp_info_latitude(), java.sql.Types.REAL);									// geohash_ipinfo_latitude          
		ps.setObject(17, userLogin.getIp_info_longitude(), java.sql.Types.REAL);								// geohash_ipinfo_longitude         
		ps.setObject(18, userLogin.getIp_info_dma_code(), java.sql.Types.INTEGER); 								// geohash_ipinfo_dma_code          
		ps.setObject(19, userLogin.getIp_info_area_code(), java.sql.Types.INTEGER); 							// geohash_ipinfo_area_code         
		ps.setString(20, userLogin.getIp_info_timezone()); 														// geohash_ipinfo_timezone          
		ps.setString(21, userLogin.getIp_info_lookup_address());												// geohash_ipinfo_lookup_address    
		ps.setString(22, userLogin.getNearest_postal_code_info_id());											// geohash_nearstpcinfo_id          
		ps.setString(23, userLogin.getNearest_postal_code_info_coords());										// geohash_nearstpcinfo_coords      
		ps.setString(24, userLogin.getNearest_postal_code_info_country_code());									// geohash_nearstpcinfo_country_code
		ps.setString(25, userLogin.getNearest_postal_code_info_country_name());									// geohash_nearstpcinfo_country_name
		ps.setString(26, userLogin.getNearest_postal_code_info_postal_code());									// geohash_nearstpcinfo_postal_code 
		ps.setString(27, userLogin.getNearest_postal_code_info_place_name());									// geohash_nearstpcinfo_place_name  
		ps.setString(28, userLogin.getNearest_postal_code_info_state());										// geohash_nearstpcinfo_state       
		ps.setString(29, userLogin.getNearest_postal_code_info_province());										// geohash_nearstpcinfo_province    
		ps.setString(30, userLogin.getNearest_postal_code_info_community());									// geohash_nearstpcinfo_community   
		ps.setObject(31, userLogin.getNearest_postal_code_info_distance(), java.sql.Types.REAL);				// geohash_nearstpcinfo_distance    
		ps.setObject(32, userLogin.getRemaining_lookups(), java.sql.Types.INTEGER);								// geohash_remaining_lookups
		ps.setObject(33, this.getmETLProcessDtlID(), java.sql.Types.INTEGER);                         			// ETLLogID
		
	}
	
	// PreparedStatement for Stg_Linkedin_Work_History table
	public void getPrStmtStg_Linkedin_Work_History(PreparedStatement ps, LinkedinWorkHistory lwh) throws Exception  {
		
		ps.setString(1, lwh.getID().getOid());														 // linkedin_work_hist_oid
		ps.setString(2, lwh.getUser_id());															 // user_oid                      
		
		// type
		if (lwh.getType().size() > 0)
			ps.setString(3,lwh.getType().get(0));										  					
		else
			ps.setString(3,"");			
		
		ps.setString(4, lwh.getEmailAddress());														 // email_address         
		ps.setString(5, lwh.getFirstName());														 // first_name            
		ps.setString(6, lwh.getIdField());															 // id                    
		ps.setString(7, lwh.getLastName());															 // last_name             
		ps.setString(8, lwh.getPictureUrl());														 // picture_url           
		ps.setObject(9, lwh.get_total(), java.sql.Types.INTEGER);									 // positions_total       
		ps.setObject(10, this.getCurrentTimeStamp(lwh.getCreatedFormat()), java.sql.Types.TIMESTAMP);// created      
		ps.setObject(11, this.getmETLProcessDtlID(), java.sql.Types.INTEGER);                        // ETLLogID
	}
	
	// PreparedStatement for Stg_Linkedin_Work_History_Pos table
	public void getPrStmtStg_Linkedin_Work_History_Pos(PreparedStatement ps, String linkedin_work_hist_oid, String user_oid, LinkedinWorkHistoryPosition lwhp) throws Exception  {
		
		ps.setString(1, linkedin_work_hist_oid);													  // linkedin_work_hist_oid
		ps.setString(2, user_oid);															 		  // user_oid              
		ps.setString(3, lwhp.getCompanyName()); 													  // company_name                  
		ps.setObject(4, lwhp.getEndDateMM(), java.sql.Types.INTEGER);								  // end_date_month         
		ps.setObject(5, lwhp.getEndDateYY(), java.sql.Types.INTEGER);								  // end_date_year            
		ps.setObject(6, lwhp.getStartDateMM(), java.sql.Types.INTEGER);								  // start_date_month         
		ps.setObject(7, lwhp.getStartDateYY(), java.sql.Types.INTEGER);								  // start_date_year            
		ps.setObject(8, lwhp.isCurrent(), java.sql.Types.SMALLINT);									  // is_current
		ps.setObject(9, this.getCurrentTimeStamp(lwhp.getCreatedFormat()), java.sql.Types.TIMESTAMP); // created
		ps.setObject(10, this.getmETLProcessDtlID(), java.sql.Types.INTEGER);                         // ETLLogID
		
	}	
	
	// PreparedStatement for Stg_Linkedin_Work_History_Pos table
	public void getPrStmtStg_Linkedin_Work_History_Pos(PreparedStatement ps, UserProfile profile) throws Exception  {
		
		ps.setString(1, profile.getId().getOid());											             // user_profile_oid
		ps.setString(2, profile.getUser_id());															 // user_oid
		
		// type
		if (profile.get_type().size() > 0)
			ps.setString(3,profile.get_type().get(0));										  					
		else
			ps.setString(3,"");					
		
		ps.setString(4, profile.getCity());																 // city
		ps.setString(5, profile.getDefault_city());														 // default_city
		ps.setString(6, profile.getDescription());														 // description
		ps.setString(7, profile.getDefault_description()); 												 // default_description
		ps.setString(8, profile.getTitle());															 // title
		ps.setString(9, profile.getDefault_title());													 // default_title
		ps.setObject(10, profile.getIsDefault(), java.sql.Types.SMALLINT);								 // is_default
		ps.setObject(11, profile.getShowTitle(), java.sql.Types.SMALLINT);								 // show_title
		ps.setObject(12, profile.getShowPicture(), java.sql.Types.SMALLINT);                             // show_picture
		ps.setObject(13, profile.getShowCover(), java.sql.Types.SMALLINT);								 // show_cover
		ps.setObject(14, profile.getShowPrograms(), java.sql.Types.SMALLINT);							 // show_programs
		ps.setObject(15, profile.getShowBio(), java.sql.Types.SMALLINT);								 // show_bio
		ps.setString(16, profile.getPicture_path());													 // picture_path
		ps.setString(17, profile.getPicture_content());													 // picture_content
		ps.setString(18, profile.getPicture_download());												 // picture_download
		ps.setString(19, profile.getPicture_picture_id());												 // picture_picture_id
		ps.setString(20, profile.getPicture_full());													 // picture_full
		ps.setObject(21, this.getCurrentTimeStamp(profile.getUpdatedFormat()), java.sql.Types.TIMESTAMP);// updated
		ps.setObject(22, this.getCurrentTimeStamp(profile.getCreatedFormat()), java.sql.Types.TIMESTAMP);// created
		ps.setObject(23, this.getmETLProcessDtlID(), java.sql.Types.INTEGER);                         	 // ETLLogID
		
	}	
	
	// PreparedStatement for Stg_User_Challenge table
	public void getPrStmtStg_User_Challenge(PreparedStatement ps, UserChallenge userChallenge) throws Exception  {
		
		ps.setString(1, userChallenge.getID().getOid()); 														 // user_challenge_oid
		ps.setString(2, userChallenge.getUserId()); 															 // user_oid
		
		// type
		if (userChallenge.getType().size() > 0)
			ps.setString(3,userChallenge.getType().get(0));										  					
		else
			ps.setString(3,"");							
		
		ps.setObject(4, userChallenge.getChallengeId(), java.sql.Types.INTEGER); 								 // challenge_id
		ps.setObject(5, this.getCurrentTimeStamp(userChallenge.getCreatedFormat()), java.sql.Types.TIMESTAMP);	 // created
		ps.setObject(6, userChallenge.getDismissed(), java.sql.Types.SMALLINT);									 // dismissed
		ps.setObject(7, userChallenge.isHasAnswers(), java.sql.Types.SMALLINT);									 // has_answers
		ps.setObject(8, userChallenge.isHasSupportingActivity(), java.sql.Types.SMALLINT);						 // has_sup_activity
		ps.setObject(9, userChallenge.isHasSupportingQuiz(), java.sql.Types.SMALLINT);							 // has_sup_quiz
		ps.setString(10, userChallenge.getHash());																 // hash
		ps.setObject(11, this.getCurrentTimeStamp(userChallenge.getStartDateFormat()), java.sql.Types.TIMESTAMP);// startdate
		ps.setString(12, userChallenge.getTimezone());															 // timezone
		ps.setObject(13, this.getCurrentTimeStamp(userChallenge.getUpdatedFormat()), java.sql.Types.TIMESTAMP);  // updated
		ps.setObject(14, userChallenge.getCompleteStatus().isCompleted(), java.sql.Types.SMALLINT);				 // complete_status
		ps.setObject(15, this.getmETLProcessDtlID(), java.sql.Types.INTEGER);                         			 // ETLLogID
		
	}	
	
	// PreparedStatement for Stg_User_Challenge_Step table
	public void getPrStmtStg_User_Challenge_Step(PreparedStatement ps, Long step_id, String user_challenge_oid, String user_oid, UserChallengeStep step) throws Exception  {

		ps.setObject(1, step_id, java.sql.Types.BIGINT);                                                        // step_id
		ps.setString(2, user_oid); 																				// user_oid              
		ps.setString(3, user_challenge_oid);																	// user_challenge_oid    
		ps.setObject(4, step.isCompleted(), java.sql.Types.SMALLINT);											// completed             
		ps.setObject(5, this.getCurrentTimeStamp(step.getCompleted_timeFormat()), java.sql.Types.TIMESTAMP);	// completed_time        
		ps.setObject(6, this.getCurrentTimeStamp(step.getCreatedFormat()), java.sql.Types.TIMESTAMP);			// created
		ps.setString(7, step.getStepName());                                                                    // step_id_mongo
		ps.setObject(8, this.getmETLProcessDtlID(), java.sql.Types.INTEGER);                         		    // ETLLogID
		
	}	
	
	// PreparedStatement for Stg_User_Challenge_Step_Activity table
	public void getPrStmtStg_User_Challenge_Step_Activity(PreparedStatement ps, Long step_id, String user_challenge_oid, String user_oid, Boolean isCompleted, String answer, java.util.Date created, String activityName) throws Exception  {

		ps.setObject(1, step_id, java.sql.Types.BIGINT);								// step_id           
		ps.setString(2, user_oid); 														// user_oid          
		ps.setString(3, user_challenge_oid);											// user_challenge_oid
		ps.setObject(4, isCompleted, java.sql.Types.SMALLINT);							// completed         
		ps.setObject(5, answer, java.sql.Types.LONGVARCHAR);							// answer            
		ps.setObject(6, this.getCurrentTimeStamp(created), java.sql.Types.TIMESTAMP);   // created
		ps.setString(7, activityName);               									// activity_id_mongo
		ps.setObject(8, this.getmETLProcessDtlID(), java.sql.Types.INTEGER);            // ETLLogID
	}		
	
	// PreparedStatement for Stg_User_Challenge_Stats table
	public void getPrStmtStg_User_Challenge_Stats(PreparedStatement ps, UserChallengeStats stat) throws Exception  {

		ps.setString(1, stat.getID().getOid()); 															// user_challenge_stats_oid
		ps.setString(2, stat.getUserId()); 																	// user_oid
		
		// type
		if (stat.getType().size() > 0)
			ps.setString(3,stat.getType().get(0));										  					
		else
			ps.setString(3,"");							
		
		ps.setObject(4, stat.getProgressCounter(), java.sql.Types.INTEGER); 								// progress_counter
		ps.setObject(5, stat.getStarted(), java.sql.Types.SMALLINT); 										// started
		ps.setObject(6, stat.getChallengeId(), java.sql.Types.INTEGER);										// challenge_id
		ps.setString(7, stat.getChallengeName());															// challenge_name
		ps.setString(8, stat.getChallengeImage());															// challenge_image
		ps.setObject(9, stat.getChallengeDuration(), java.sql.Types.INTEGER);								// challenge_duration
		ps.setObject(10, stat.getExpertId(), java.sql.Types.INTEGER);										// expert_id
		ps.setObject(11, stat.isChallengeCompleted(), java.sql.Types.SMALLINT);							    // challenge_completed
		ps.setObject(12, stat.getProgress(), java.sql.Types.SMALLINT);										// progress
		ps.setObject(13, this.getCurrentTimeStamp(stat.getTimestampFormat()), java.sql.Types.TIMESTAMP);	// timestamp
		ps.setObject(14, this.getCurrentTimeStamp(stat.getCreatedFormat()), java.sql.Types.TIMESTAMP);		// created
		ps.setObject(15, this.getmETLProcessDtlID(), java.sql.Types.INTEGER);                         	    // ETLLogID
	}	
	
	// PreparedStatement for Stg_User_Narrow_OptOut table
	public void getPrStmtStg_User_Narrow_OptOut(PreparedStatement ps, String user_oid, NarrowOptout narrow) throws Exception  {

		ps.setString(1, user_oid); 																			// User_oid
		ps.setObject(2, narrow.getContractId(), java.sql.Types.INTEGER); 									// Narrow_optout_contract_id
		ps.setObject(3, this.getCurrentTimeStamp(narrow.getOptoutDateFormat()), java.sql.Types.TIMESTAMP);	// Narrow_optout_optout_date														
		ps.setObject(4, narrow.getChallengeId(), java.sql.Types.INTEGER); 								    // Narrow_optout_challenge_id		
		ps.setObject(5, this.getmETLProcessDtlID(), java.sql.Types.INTEGER);                                // ETLLogID
	}	
	
	// PreparedStatement for Stg_User_Narrow_OptOut table
	public void getPrStmtStg_Survey_Challenge(PreparedStatement ps, SurveyChallenge survey) throws Exception  {

		ps.setString(1, survey.getId().getOid());  														 // survey_challenge_oid
		ps.setString(2, survey.getUser_id());															 // user_oid
		
		// type
		if (survey.get_type().size() > 0)
			ps.setString(3,survey.get_type().get(0));										  					
		else
			ps.setString(3,"");							
		
		ps.setString(4, survey.getUser_challenge_id()); 												 // user_challenge_id
		ps.setObject(5, survey.getChallenge_nid(), java.sql.Types.INTEGER); 							 // challenge_nid
		ps.setString(6, survey.getHash());																 // hash
		ps.setString(7, survey.getChallenge_title());													 // challenge_title
		ps.setObject(8, survey.getStep_count(), java.sql.Types.INTEGER);								 // step_count
		
		// program_description
		if (survey.getProgramDescriptions().size() > 0)
			ps.setString(9, survey.getProgramDescriptions().get(0));										 
		else
			ps.setString(9, "");
		
		ps.setObject(10, survey.getProgramRating(), java.sql.Types.INTEGER);							 // program_rating
		ps.setString(11, survey.getProgramReviewText());												 // program_review_text
		ps.setObject(12, survey.getCompleted_programs(), java.sql.Types.INTEGER);						 // completed_programs
		ps.setObject(13, this.getCurrentTimeStamp(survey.getCreatedFormat()), java.sql.Types.TIMESTAMP); // created
		ps.setObject(14, this.getmETLProcessDtlID(), java.sql.Types.INTEGER);                         	 // ETLLogID
	}	
	
	// -------------------------------------------------------------------------------------------- logging start ------------------ >
	// ########################################### Table LR_ETL_Process_Type
	// get last ETLProcessTypeID
	public long getLastETLProcessData_old () {
		
		String sql = "SELECT ETLProcessTypeID, ETLProcessTypeParamDt, ETLProcessTypeCreatedDate, ifnull(ETLProcessTypeModifiedDate,1) as stillRUN " +
					 " FROM LR_ETL_Process_Type t " +
					 " WHERE ETLProcessTypeName = '" + getAarpLoadType() + "' " +
					 " AND ETLProcessTypeID = (SELECT MAX(ETLProcessTypeID) " +
					 " FROM LR_ETL_Process_Type " + 
					 " WHERE ETLProcessTypeName = '" + getAarpLoadType() + "' " + 
					 " AND ETLProcessTypeResult = '" + ConfigurationManager.getEtlSuccessMessage() + "')";		
		
		//System.out.println(sql);
					   		
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			ps = connection.prepareStatement(sql);
			rs = ps.executeQuery();
			
			// get max ETLProcessTypeID
			if (rs != null && rs.next()) {
				if (rs.getString("ETLProcessTypeID") != null) {
					// last process type id
					mETLProcessTypeID = Long.parseLong(rs.getString("ETLProcessTypeID"));
					
					// last since value used in API
					mETLProcessTypeParamDt = rs.getDate("ETLProcessTypeParamDt"); // since
					
					// when executed, this value is used as next since 
					mETLProcessTypeCreatedDate = rs.getDate("ETLProcessTypeCreatedDate");
					
					// previous process is still running
					mETLStillRun = (rs.getInt("stillRUN") == 1);
					
					logger.debug("mETLProcessTypeID="+mETLProcessTypeID);      
					logger.debug("mETLProcessTypeParamDt="+mETLProcessTypeParamDt);         
					logger.debug("mETLProcessTypeCreatedDate="+mETLProcessTypeCreatedDate);
					logger.debug("mETLStillRun="+mETLStillRun);
				}
			}			
		}
		catch(Exception ex) {
			ex.printStackTrace();
			logger.error("Exception:" + ex.getMessage());
		}
		finally {
			try {				
				if (rs != null) 
					rs.close();
				if (ps != null)
					ps.close();
			}
			catch(Exception ignore) {}
		}				
		
		return mETLProcessTypeID;
	}
	
	// get LogData from database 
	// call get_info_log('MongoDB_v2', 'Success')
	public long getLastETLProcessData() {
		
		String sql = "{call get_info_log(?,?)}";	
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			ps = connection.prepareStatement(sql);
			ps.setString(1, getAarpLoadType());
			ps.setString(2, ConfigurationManager.getEtlSuccessMessage());
			rs = ps.executeQuery();
			
			// 
			if (rs != null && rs.next()) {
				// ETLProcessTypeID
				if (rs.getString("ETLProcessTypeID") != null) {
					this.getLogData().setEtlProcessTypeID(Long.parseLong(rs.getString("ETLProcessTypeID"))); 
				}
				
				// m_ETLProcessID
				if (rs.getString("m_ETLProcessID") != null) {
					this.getLogData().setMaxEtlProcessID(Long.parseLong(rs.getString("m_ETLProcessID")));  
				}

				// ETLProcessTypeParamDt
				if (rs.getTimestamp("ETLProcessTypeParamDt") != null) {
					Timestamp timestamp = rs.getTimestamp("ETLProcessTypeParamDt");
					
					if (timestamp != null)
						this.getLogData().setEtlProcessTypeParamDt(new java.util.Date(timestamp.getTime()));
				}
				
				// ETLProcessTypeCreatedDate
				if (rs.getTimestamp("ETLProcessTypeCreatedDate") != null) {
					Timestamp timestamp = rs.getTimestamp("ETLProcessTypeCreatedDate");
					
					if (timestamp != null)
						this.getLogData().setEtlProcessTypeCreatedDate(new java.util.Date(timestamp.getTime()));
				}
				
				// stillRUN
				this.getLogData().setStillRun(rs.getInt("stillRUN") == 1);

				// since
				if (rs.getString("since") != null) {
					this.getLogData().setSince(rs.getString("since"));
				}
				else {
					// assign value from config
					this.getLogData().setSince(MyUtils.convertDatetoUnixTimeStamp(this.jsonSince).toString());
				}
				
				// next since_dt
				if (rs.getTimestamp("since_dt") != null) {
					Timestamp timestamp = rs.getTimestamp("since_dt");
					
					if (timestamp != null)
						this.getLogData().setSinceDt(new java.util.Date(timestamp.getTime()));					
				}
				else {
					// assign value from config
					this.getLogData().setSinceDt(this.jsonSince);
				}
				
				// last process type id
				mETLProcessTypeID = this.getLogData().getEtlProcessTypeID();
				
				// last since value used in API
				mETLProcessTypeParamDt = this.getLogData().getEtlProcessTypeParamDt();
				
				// when executed
				mETLProcessTypeCreatedDate = this.getLogData().getEtlProcessTypeCreatedDate();
				
				// since value
				since = this.getLogData().getSinceDt();
				
				// since value string
				sinceStr = this.getLogData().getSince();
				
				SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
				
				logger.debug("mETLProcessTypeID="+mETLProcessTypeID);      
				logger.debug("mETLProcessTypeParamDt="+df.format(mETLProcessTypeParamDt));         
				logger.debug("mETLProcessTypeCreatedDate="+df.format(mETLProcessTypeCreatedDate));
				logger.debug("since="+sinceStr);
				logger.debug("sinceDt="+df.format(since));
				//logger.debug("mETLStillRun="+mETLStillRun);		
			}			
		}
		catch(Exception ex) {
			ex.printStackTrace();
			logger.error("Exception:" + ex.getMessage());
		}
		finally {
			try {				
				if (rs != null) 
					rs.close();
				if (ps != null)
					ps.close();
			}
			catch(Exception ignore) {}
		}				
		
		return mETLProcessTypeID;
	}	
	
	// get number of tokens in JSON file
	public int getNumberOfTokens() {
		
		String sql = "{call get_number_of_tokens()}";	
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		int result = 0;
		
		try {
			ps = connection.prepareStatement(sql);
			rs = ps.executeQuery();
			
			// 
			if (rs != null && rs.next()) {
				// nr
				result = rs.getInt("nr");  
			}			
		}
		catch(Exception ex) {
			ex.printStackTrace();
			logger.error("Exception:" + ex.getMessage());
		}
		finally {
			try {				
				if (rs != null) 
					rs.close();
				if (ps != null)
					ps.close();
			}
			catch(Exception ignore) {}
		}				
		
		return result;
	}		
	
	// get last "since" for API url, Date format
	public java.util.Date getLastSince() {
		
		try {
			// get last LR_ETL_Process_Type data from database
			getLastETLProcessData();
			
			// if nothing in database get value from config
			// jsonSince - keep value from config
			if (mETLProcessTypeID == 0) {
				since = this.jsonSince;
				sinceStr = MyUtils.convertDatetoUnixTimeStamp(this.jsonSince).toString();
			}	
		}	
		catch(Exception ex) {
			ex.printStackTrace();
			logger.error("Exception:" + ex.getMessage());
		}
		
		return since;
	}
	
	// get last "since" for API url, String format
	public String getLastSinceStr() {
		
		try {
			// get last LR_ETL_Process_Type data from database
			getLastETLProcessData();
			
			// if nothing in database get value from config
			// jsonSince - keep value from config
			if (mETLProcessTypeID == 0) {
				since = this.jsonSince;
				sinceStr = MyUtils.convertDatetoUnixTimeStamp(this.jsonSince).toString();
			}	
		}	
		catch(Exception ex) {
			ex.printStackTrace();
			logger.error("Exception:" + ex.getMessage());
		}
		
		return this.sinceStr;
	}
	
	
	// get last ETLProcessTypeParamDt - since unixTimeStamp format - long
	public Long getLastSinceUnixTimeStamp() {		
		return MyUtils.convertDatetoUnixTimeStamp(getLastSince());
	}
	
	// start logging LR_ETL_Process_Type table
	public void startLR_ETL_Process_Type(//String  		etlProcessTypeName, 
										 String  		etlProcessTypeSource, 
										 Integer 		etlProcessTypeParamNum, 
										 String  		etlProcessTypeParamText) {
		
		String sql = "INSERT INTO LR_ETL_Process_Type (" + 
		     	 	 "ETLProcessTypeName," + 
		     	     "ETLProcessTypeSource," +
		     	     "ETLProcessTypeParamDt," +
		     	     "ETLProcessTypeParamNum," +
		     	     "ETLProcessTypeParamText," +
		     	     "ETLProcessTypeCreatedDate," +
		     	     //"ETLProcessTypeModifiedDate," +
		     	     "ETLProcessTypeResult" +
		     	     ") VALUES (?,?,?,?,?,?,?)";		
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			//connection.setAutoCommit(false);
			ps = connection.prepareStatement(sql);
			ps.setString(1, this.getAarpLoadType());
			ps.setString(2, etlProcessTypeSource);			
			//ps.setObject(3,  this.getLastSince(), java.sql.Types.DATE);
			ps.setObject(3, this.getsince(), java.sql.Types.DATE);
			ps.setObject(4, etlProcessTypeParamNum, java.sql.Types.INTEGER);
			ps.setString(5, etlProcessTypeParamText);
			ps.setObject(6, this.getCurrentTimeStamp(), java.sql.Types.TIMESTAMP);	 // ETLProcessTypeCreatedDate	
			//ps.setObject(7, this.getCurrentTimeStamp(), java.sql.Types.TIMESTAMP);   // ETLProcessTypeModifiedDate			
			ps.setString(7, ConfigurationManager.getEtlSuccessMessage());            // put Success at start of process			
			ps.execute();
			//connection.commit();		
			
		}	
		catch(Exception ex) {
			try {
				//connection.rollback();
			}
			catch(Exception ignore) {}			
			ex.printStackTrace();
			logger.error("Exception:" + ex.getMessage());
		}
		finally {
			try {				
				if (rs != null) 
					rs.close();
				if (ps != null)
					ps.close();
			}
			catch(Exception ignore) {}
		}		
	}	
	
	// end logging LR_ETL_Process_Type table
	public void endLR_ETL_Process_Type(String etlProcessTypeResult) {
		
		String sql = "UPDATE LR_ETL_Process_Type SET ETLProcessTypeModifiedDate = ?, ETLProcessTypeResult = ? "+
				     "WHERE ETLProcessTypeID = ?";
		
		PreparedStatement ps = null;
		
		try {			
			
			//connection.setAutoCommit(false);
			ps = connection.prepareStatement(sql);
			ps.setTimestamp(1, this.getCurrentTimeStamp());
			ps.setString(2, etlProcessTypeResult);
			ps.setLong(3, this.mETLProcessTypeID);
			ps.execute();
			//connection.commit();
		}
		catch(Exception ex) {
			try {
				//connection.rollback();
			}
			catch(Exception ignore) {}
			ex.printStackTrace();
			logger.error("Exception:" + ex.getMessage());	
		}
		finally {
			try {	
				if (ps != null)
					ps.close();
			}
			catch(Exception ignore) {}
		}			
	}	
	
	// ########################################### Table LR_ETL_Process_Dtl
	
	public long getLastETLProcessDtlID () {
		
		String sql = "SELECT MAX(ETLProcessID) as mETLProcessDtlID FROM LR_ETL_Process_Dtl where ETLProcessTypeID=" + mETLProcessTypeID;
					   		
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			ps = connection.prepareStatement(sql);
			rs = ps.executeQuery();
			
			// get max ETLProcessID
			if (rs != null && rs.next()) {
				if (rs.getString("mETLProcessDtlID") != null) {
					//
					mETLProcessDtlID = Long.parseLong(rs.getString("mETLProcessDtlID"));
					 
					logger.debug("mETLProcessDtlID="+mETLProcessDtlID);
				}
			}			
		}
		catch(Exception ex) {
			ex.printStackTrace();
			logger.error("Exception:" + ex.getMessage());
		}
		finally {
			try {				
				if (rs != null) 
					rs.close();
				if (ps != null)
					ps.close();
			}
			catch(Exception ignore) {}
		}				
		
		return mETLProcessDtlID;
	}
	
	// start logging LR_ETL_Process_Dtl
	public void startLR_ETL_Process_Dtl (Long 			etlProcessTypeID,
										 java.util.Date etlProcessParamDt,	
										 Integer 		etlProcessParamInt1,
										 Integer 		etlProcessParamInt2,
										 String 		etlProcessParamText) {
		
		String sql = "INSERT INTO LR_ETL_Process_Dtl (" + 
					 "ETLProcessTypeID," +	
					 "ETLProcessBegin, " +
					 "ETLProcessParamDt," +	
					 "ETLProcessParamInt1," +
					 "ETLProcessParamInt2," +
					 "ETLProcessParamText," +	
					 "ETLProcessCreated" +
	     	 	 	 ") VALUES (?,?,?,?,?,?,?)";	
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			//connection.setAutoCommit(false);
			ps = connection.prepareStatement(sql);
			ps.setObject(1, etlProcessTypeID,  java.sql.Types.BIGINT);
			ps.setObject(2, this.getCurrentTimeStamp(), java.sql.Types.TIMESTAMP);		
			ps.setObject(3, etlProcessParamDt, java.sql.Types.DATE);
			ps.setObject(4, etlProcessParamInt1, java.sql.Types.INTEGER);
			ps.setObject(5, etlProcessParamInt2, java.sql.Types.INTEGER);
			ps.setString(6, etlProcessParamText);
			ps.setObject(7, this.getCurrentTimeStamp(), java.sql.Types.TIMESTAMP);	
			ps.execute();
			//connection.commit();			
		}	
		catch(Exception ex) {
			try {
				//connection.rollback();
			}
			catch(Exception ignore) {}			
			ex.printStackTrace();
			logger.error("Exception:" + ex.getMessage());
		}
		finally {
			try {				
				if (rs != null) 
					rs.close();
				if (ps != null)
					ps.close();
			}
			catch(Exception ignore) {}
		}	
	}
	
	// end logging LR_ETL_Process_Dtl
	public void endLR_ETL_Process_Dtl (String etlProcessResult) {
		
		String sql = "UPDATE LR_ETL_Process_Dtl SET ETLProcessEnd = ?, ETLProcessResult = ? WHERE ETLProcessID = ?";	
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			//connection.setAutoCommit(false);
			ps = connection.prepareStatement(sql);
			ps.setObject(1,  this.getCurrentTimeStamp(), java.sql.Types.TIMESTAMP);
			ps.setString(2,  etlProcessResult);
			ps.setObject(3, this.mETLProcessDtlID, java.sql.Types.BIGINT);
			ps.execute();
			//connection.commit();			
		}	
		catch(Exception ex) {
			try {
				//connection.rollback();
			}
			catch(Exception ignore) {}			
			ex.printStackTrace();
			logger.error("Exception:" + ex.getMessage());
		}
		finally {
			try {				
				if (rs != null) 
					rs.close();
				if (ps != null)
					ps.close();
			}
			catch(Exception ignore) {}
		}	
	}
	
	// ########################################### Table LR_ETL_Load_Error
	public long getLastETLLoadErrorID () {
		
		String sql = "SELECT MAX(ETLLoadErrID) as mETLLoadErrID FROM LR_ETL_Load_Error where ETLProcessID=" + mETLProcessDtlID;
					   		
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			ps = connection.prepareStatement(sql);
			rs = ps.executeQuery();
			
			// get max ETLLoadErrID
			if (rs != null && rs.next()) {
				if (rs.getString("mETLLoadErrID") != null) {
					//
					mETLLoadErrID = Long.parseLong(rs.getString("mETLLoadErrID"));
					 
					logger.debug("mETLLoadErrID="+mETLLoadErrID);
				}
			}			
		}
		catch(Exception ex) {
			ex.printStackTrace();
			logger.error("Exception:" + ex.getMessage());
		}
		finally {
			try {				
				if (rs != null) 
					rs.close();
				if (ps != null)
					ps.close();
			}
			catch(Exception ignore) {}
		}				
		
		return mETLLoadErrID;
	}
	
	// insert into LR_ETL_Load_Error
	public void insertLR_ETL_Load_Error (Long 	etlProessID,
								     	String  etLoadError) {
		
		String sql = "INSERT INTO LR_ETL_Load_Error (" + 
					 "ETLProcessID," +	
					 "ETLLoadError, " +
					 "ETLLoadErrorCreated" +
	     	 	 	 ") VALUES (?,?,?)";	
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			//connection.setAutoCommit(false);
			ps = connection.prepareStatement(sql);
			
			ps.setObject(1, etlProessID, java.sql.Types.INTEGER);
			ps.setString(2, etLoadError);
			ps.setObject(3, this.getCurrentTimeStamp(), java.sql.Types.TIMESTAMP);		
			ps.execute();
			//connection.commit();			
		}	
		catch(Exception ex) {
			try {
				//connection.rollback();
			}
			catch(Exception ignore) {}			
			ex.printStackTrace();
			logger.error("Exception:" + ex.getMessage());
		}
		finally {
			try {				
				if (rs != null) 
					rs.close();
				if (ps != null)
					ps.close();
			}
			catch(Exception ignore) {}
		}	
	}
	
	// -------------------------------------------------------------------------------------------- logging end ------------------ >
	
	// get max step_id from Stg_User_Challenge_Step
	public long getMaxStepId() {
		String sql = "SELECT IFNULL((SELECT MAX(step_id) AS mStepID FROM Stg_User_Challenge_Step),0) AS mStepID";
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {			
			ps = connection.prepareStatement(sql);			
			rs = ps.executeQuery();
			if (rs != null && rs.next()) {
				if (rs.getString("mStepID") != null)
					mStepID = Long.parseLong(rs.getString("mStepID"));
			}				
		}
		catch(Exception ex) {
			ex.printStackTrace();
			logger.error("Exception:" + ex.getMessage());	
			errorMessage = ex.getMessage();
		}
		finally {
			try {	
				if (ps != null)
					ps.close();
				if (rs != null) 
					rs.close();				
			}
			catch(Exception ignore) {}
		}
		
		return mStepID;
	}	
	
	// get max step_uid from LR_User_Challenge_Step
	public long getMaxStepIdDW() {
		
		String sql = "SELECT IFNULL((SELECT MAX(step_uid) AS mStepUID FROM LR_User_Challenge_Step),0) AS mStepUID";
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {			
			ps = connection.prepareStatement(sql);			
			rs = ps.executeQuery();
			if (rs != null && rs.next()) {
				if (rs.getString("mStepUID") != null)
					mStepIDDW = Long.parseLong(rs.getString("mStepUID"));
			}				
		}
		catch(Exception ex) {
			ex.printStackTrace();
			logger.error("Exception:" + ex.getMessage());	
			errorMessage = ex.getMessage();
		}
		finally {
			try {	
				if (ps != null)
					ps.close();
				if (rs != null) 
					rs.close();				
			}
			catch(Exception ignore) {}
		}
		
		return mStepIDDW;
	}	
	
	// get max step_uid from LR_User_Challenge_Step + step_id from Stg_User_Challenge_Step
	public long getMaxCombinedStepID() {
		
		String sql = "SELECT IFNULL((SELECT MAX(step_uid) FROM LR_User_Challenge_Step),0) + IFNULL((SELECT MAX(step_id) FROM Stg_User_Challenge_Step),0) AS mCombinedStepID";
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {			
			ps = connection.prepareStatement(sql);			
			rs = ps.executeQuery();
			if (rs != null && rs.next()) {
				if (rs.getString("mCombinedStepID") != null)
					mCombinedStepID = Long.parseLong(rs.getString("mCombinedStepID"));
			}				
		}
		catch(Exception ex) {
			ex.printStackTrace();
			logger.error("Exception:" + ex.getMessage());	
			errorMessage = ex.getMessage();
		}
		finally {
			try {	
				if (ps != null)
					ps.close();
				if (rs != null) 
					rs.close();				
			}
			catch(Exception ignore) {}
		}
		
		return mCombinedStepID;
	}		
	
	// load JSON file into database
	public short loadJsonIntoDatabase(String jsonFile) {
		
		short result = 1; // success 
		
		PreparedStatement ps_Stg_User = null;
		PreparedStatement ps_Stg_User_Narrow_OptOut = null;
		PreparedStatement ps_Stg_UserFlag = null;
		PreparedStatement ps_Stg_User_Quiz = null;
		PreparedStatement ps_Stg_User_Quiz_Answers = null;
		PreparedStatement ps_Stg_File = null;
		PreparedStatement ps_Stg_User_Login = null;
		PreparedStatement ps_Stg_Linkedin_Work_History = null;
		PreparedStatement ps_Stg_Linkedin_Work_History_Pos = null;
		PreparedStatement ps_Stg_User_Profile = null;
		PreparedStatement ps_Stg_User_Challenge = null;
		PreparedStatement ps_Stg_User_Challenge_Step = null;
		PreparedStatement ps_Stg_User_Challenge_Step_Activity = null;
		PreparedStatement ps_Stg_User_Challenge_Stats = null;
		PreparedStatement ps_Stg_Survey_Challenge = null;
		
		int userIndex = 0;
		
		try {			 
        	// control commit
        	//connection.setAutoCommit(false);			
			
        	// processing the file
        	p = new Processing(jsonFile);        	
        	
        	// get ps for Stg_User
        	ps_Stg_User = connection.prepareStatement(this.sql_Stg_user);
        	ps_Stg_User_Narrow_OptOut = connection.prepareStatement(this.sql_Stg_User_Narrow_OptOut);
        	ps_Stg_UserFlag = connection.prepareStatement(this.sql_Stg_Userflag);
        	ps_Stg_User_Quiz = connection.prepareStatement(this.sql_Stg_User_Quiz);
        	ps_Stg_User_Quiz_Answers = connection.prepareStatement(this.sql_Stg_User_Quiz_Answers);
        	ps_Stg_File = connection.prepareStatement(this.sql_Stg_File);
        	ps_Stg_User_Login = connection.prepareStatement(this.sql_Stg_User_Login);
        	ps_Stg_Linkedin_Work_History = connection.prepareStatement(this.sql_Stg_Linkedin_Work_History);
        	ps_Stg_Linkedin_Work_History_Pos = connection.prepareStatement(this.sql_Stg_Linkedin_Work_History_Pos);
        	ps_Stg_User_Profile = connection.prepareStatement(this.sql_Stg_User_Profile);
        	ps_Stg_User_Challenge = connection.prepareStatement(this.sql_Stg_User_Challenge);
        	ps_Stg_User_Challenge_Step = connection.prepareStatement(this.sql_Stg_User_Challenge_Step);
        	ps_Stg_User_Challenge_Step_Activity = connection.prepareStatement(this.sql_Stg_User_Challenge_Step_Activity);
        	ps_Stg_User_Challenge_Stats = connection.prepareStatement(this.sql_Stg_User_Challenge_Stats);
        	ps_Stg_Survey_Challenge = connection.prepareStatement(this.sql_Stg_Survey_Challenge);
        	
   			// get max step_id from Stg_User_Challenge_Step + step_uid from LR_User_Challenge_Step
   			long stepId = this.getMaxStepId(); // this.getMaxCombinedStepID();       	
        	
        	// go through each object 
       		for (int i=0; i<p.getJsonArray().size();i++) {
       			
       			// user index used in catch
       			userIndex = i;
       			//logger.debug("index: " + i);	
       			
       			// go through each item object
       			JSONObject object = (JSONObject)p.getJsonArray().get(i);
       			
       			// -------------------------------- user collection
       			// get User collection from json object
       			User user = p.getLRUser(object);
       			
       			// get User PreparedStatement
       			getPrStmtStg_user(ps_Stg_User, user);
       			ps_Stg_User.addBatch();
       			
       			// insert user.settings.narrowoptout
       			for (int qq=0;qq<user.getUserSettings().getNarrowOptout().size();qq++) {
       				NarrowOptout narrow = (NarrowOptout) user.getUserSettings().getNarrowOptout().get(qq);
       				getPrStmtStg_User_Narrow_OptOut(ps_Stg_User_Narrow_OptOut, user.getID().getOid(), narrow);
       				ps_Stg_User_Narrow_OptOut.addBatch();
       			}
       			
       			// -------------------------------- userflag collection
       			ArrayList<UserFlag> uf = p.getLRUserFlag(object);
       			for (int k=0; k<uf.size();k++) {
       				UserFlag ufc = (UserFlag) uf.get(k);
       				getPrStmtStg_userflag(ps_Stg_UserFlag, ufc);
       				ps_Stg_UserFlag.addBatch();
       			}
       			
       			// -------------------------------- user_quiz collection
       			ArrayList<UserQuiz> uq = p.getLRUserQuiz(object);       			
       			for (int k=0; k<uq.size(); k++) {
       				UserQuiz uqc = (UserQuiz) uq.get(k);
       				getPrStmtStg_user_quiz(ps_Stg_User_Quiz, uqc);
       				ps_Stg_User_Quiz.addBatch();
       				
       				// load User_Quiz_Answers
       				for (int kk=0; kk<uqc.getAnswers().size(); kk++) {       					
       					Answers an = (Answers) uqc.getAnswers().get(kk);
       					getPrStmtStg_user_quiz_answers(ps_Stg_User_Quiz_Answers, uqc.getID().getOid(), uqc.getUserId(), an);
       					ps_Stg_User_Quiz_Answers.addBatch();
       				}
       			}

       			// -------------------------------- file collection
       			ArrayList<LRFile> file = p.getLRFile(object);
       			for (int k=0; k<file.size();k++) {
       				LRFile fileC = (LRFile) file.get(k);
       				getPrStmtStg_file(ps_Stg_File, fileC);
       				ps_Stg_File.addBatch();
       			}
       			
       			// -------------------------------- user_login collection
       			ArrayList<UserLogin> userLogin = p.getLRUserLogin(object);
       			for (int k=0; k<userLogin.size();k++) {
       				UserLogin ulC = (UserLogin) userLogin.get(k);
       				getPrStmtStg_User_login(ps_Stg_User_Login, ulC);
       				ps_Stg_User_Login.addBatch();
       			}   
       			
       			// -------------------------------- linkedin_work_history collection
       			ArrayList<LinkedinWorkHistory> lwh = p.getLinkedin_Work_History(object);
       			for (int k=0; k<lwh.size(); k++) {
       				LinkedinWorkHistory lwhChild = (LinkedinWorkHistory) lwh.get(k);
       				getPrStmtStg_Linkedin_Work_History(ps_Stg_Linkedin_Work_History, lwhChild);
       				ps_Stg_Linkedin_Work_History.addBatch();       				
       				
       				// load LinkedinWorkHistoryPosition
       				for (int kk=0; kk<lwhChild.getPositions().size(); kk++) {       					
       					LinkedinWorkHistoryPosition posistionH = (LinkedinWorkHistoryPosition) lwhChild.getPositions().get(kk);
       					getPrStmtStg_Linkedin_Work_History_Pos(ps_Stg_Linkedin_Work_History_Pos, lwhChild.getID().getOid(), lwhChild.getUser_id(), posistionH);
       					ps_Stg_Linkedin_Work_History_Pos.addBatch();
       				}
       			} 
       			
       			// -------------------------------- user_profile collection
       			ArrayList<UserProfile> userProfile = p.getUserProfile(object);
       			for (int k=0; k<userProfile.size();k++) {
       				UserProfile profile = (UserProfile) userProfile.get(k);
       				getPrStmtStg_Linkedin_Work_History_Pos(ps_Stg_User_Profile, profile);
       				ps_Stg_User_Profile.addBatch();
       			}
       			
       			// -------------------------------- user_challenge collection       			
       			// go through UserChallenges
       			ArrayList<UserChallenge> userChallenge = p.getUserChallenge(object);
       			for (int k=0; k<userChallenge.size();k++) {
       				UserChallenge userC = (UserChallenge) userChallenge.get(k);
       				getPrStmtStg_User_Challenge(ps_Stg_User_Challenge, userC);
       				ps_Stg_User_Challenge.addBatch();
       				
       				//System.out.println("size=" + userC.getCompleteStatus().getSteps().size());
       				
       				// load steps
       				for (int jj=0;jj<userC.getCompleteStatus().getSteps().size();jj++) {
       					
       					UserChallengeStep step = userC.getCompleteStatus().getSteps().get(jj);
       					
       					getPrStmtStg_User_Challenge_Step(ps_Stg_User_Challenge_Step, ++stepId, userC.getID().getOid(), userC.getUserId(), step);
       					ps_Stg_User_Challenge_Step.addBatch();
       					
       					//System.out.println("stepId=" + stepId);
       					//System.out.println("stepName=" + step.getStepName());
       					
       					//System.out.println(step.getActivity().size());
       					// load activities
       					for (int pp=0;pp<step.getActivity().size();pp++) {
       						
       						UserChallengeStepActivity activity = step.getActivity().get(pp);
       						
       						//System.out.println("answer size=" + activity.getAnswers().size());
       						
       						if (activity.getAnswers().size() > 0) {
	       						for (int ll=0;ll<activity.getAnswers().size();ll++) {
	       							String answer = activity.getAnswers().get(ll);       							
	       							getPrStmtStg_User_Challenge_Step_Activity(ps_Stg_User_Challenge_Step_Activity, stepId, userC.getID().getOid(), userC.getUserId(), activity.isCompleted(), answer, activity.getCreatedFormat(), activity.getActivityName());
	       							ps_Stg_User_Challenge_Step_Activity.addBatch();
	       						} // end for ll
       						}
       						else {
       							// if no answers put null for answer
       							getPrStmtStg_User_Challenge_Step_Activity(ps_Stg_User_Challenge_Step_Activity, stepId, userC.getID().getOid(), userC.getUserId(), activity.isCompleted(), null, activity.getCreatedFormat(), activity.getActivityName());
       							ps_Stg_User_Challenge_Step_Activity.addBatch();       							
       						}
       						
       					} // end for pp       					
       					
       				} // end for jj
       				
       			} // end for k
       			
       			// -------------------------------- user_challenge_stats collection   
       			ArrayList<UserChallengeStats> stats = p.getUserChallengeStats(object);
       			for (int k=0; k<stats.size();k++) {
       				UserChallengeStats userStats = (UserChallengeStats) stats.get(k);
       				getPrStmtStg_User_Challenge_Stats(ps_Stg_User_Challenge_Stats, userStats);
       				ps_Stg_User_Challenge_Stats.addBatch();
       			}       			

       			// -------------------------------- survey_challenge collection          			
       			ArrayList<SurveyChallenge> survey = p.getSurveyChallenge(object);
       			for (int k=0; k<survey.size();k++) {
       				SurveyChallenge surveyC = (SurveyChallenge) survey.get(k);
       				getPrStmtStg_Survey_Challenge(ps_Stg_Survey_Challenge, surveyC);
       				ps_Stg_Survey_Challenge.addBatch();
       			}       			       			
       			// ----------------------------------------------------------
       			// execute batches if index same as batchSize in configuration file       			
       			if (batchSize>0 && i>0 && i%batchSize == 0) {
       				System.out.println("batchSize="+batchSize);
       				System.out.println("commit batch: " + i);
       	       		ps_Stg_User.executeBatch();
       	       		ps_Stg_User_Narrow_OptOut.executeBatch();
       	       		ps_Stg_UserFlag.executeBatch();       		
       	       		ps_Stg_User_Quiz.executeBatch();
       	       		ps_Stg_User_Quiz_Answers.executeBatch();
       	       		ps_Stg_File.executeBatch();
       	       		ps_Stg_User_Login.executeBatch();
       	       		ps_Stg_Linkedin_Work_History.executeBatch();
       	       		ps_Stg_Linkedin_Work_History_Pos.executeBatch();
       	       		ps_Stg_User_Profile.executeBatch();
       	       		ps_Stg_User_Challenge.executeBatch();
       	       		ps_Stg_User_Challenge_Step.executeBatch();
       	       		ps_Stg_User_Challenge_Step_Activity.executeBatch();
       	       		ps_Stg_User_Challenge_Stats.executeBatch();
       	       		ps_Stg_Survey_Challenge.executeBatch();
       			}
       			
        	} // end for      
       		
       		// execute batches
       		ps_Stg_User.executeBatch();
       		ps_Stg_User_Narrow_OptOut.executeBatch();
       		ps_Stg_UserFlag.executeBatch();       		
       		ps_Stg_User_Quiz.executeBatch();
       		ps_Stg_User_Quiz_Answers.executeBatch();
       		ps_Stg_File.executeBatch();
       		ps_Stg_User_Login.executeBatch();
       		ps_Stg_Linkedin_Work_History.executeBatch();
       		ps_Stg_Linkedin_Work_History_Pos.executeBatch();
       		ps_Stg_User_Profile.executeBatch();
       		ps_Stg_User_Challenge.executeBatch();
       		ps_Stg_User_Challenge_Step.executeBatch();
       		ps_Stg_User_Challenge_Step_Activity.executeBatch();
       		ps_Stg_User_Challenge_Stats.executeBatch();
       		ps_Stg_Survey_Challenge.executeBatch();
       		
       		//connection.commit();       		
		}
		catch(Exception ex) {		
			try {
				//connection.rollback();
			}
			catch (Exception ignore) {}
			result = -1;
			ex.printStackTrace();
			errorMessage = "Exception: " + ex.getMessage() + "; userIndex: " + userIndex;
			logger.error(errorMessage);			
		}
		finally {
			try {				
				if (ps_Stg_User != null)
					ps_Stg_User.close();
				
				if (ps_Stg_User_Narrow_OptOut != null)
					ps_Stg_User_Narrow_OptOut.close();
				
				if (ps_Stg_UserFlag != null)
					ps_Stg_UserFlag.close();
				
				if (ps_Stg_User_Quiz != null)
					ps_Stg_User_Quiz.close();
				
				if (ps_Stg_User_Quiz_Answers != null)
					ps_Stg_User_Quiz_Answers.close();		
				
				if (ps_Stg_File != null)
					ps_Stg_File.close();	
				
				if (ps_Stg_User_Login != null)
					ps_Stg_User_Login.close();	
				
				if (ps_Stg_Linkedin_Work_History != null)
					ps_Stg_Linkedin_Work_History.close();	
				
				if (ps_Stg_Linkedin_Work_History_Pos != null)
					ps_Stg_Linkedin_Work_History_Pos.close();	
				
				if (ps_Stg_User_Profile != null)
					ps_Stg_User_Profile.close();		
				
				if (ps_Stg_User_Challenge != null)
					ps_Stg_User_Challenge.close();				

				if (ps_Stg_User_Challenge_Step != null)
					ps_Stg_User_Challenge_Step.close();		
				
				if (ps_Stg_User_Challenge_Step_Activity != null)
					ps_Stg_User_Challenge_Step_Activity.close();	
				
				if (ps_Stg_User_Challenge_Stats != null)
					ps_Stg_User_Challenge_Stats.close();	
				
				if (ps_Stg_Survey_Challenge != null)
					ps_Stg_Survey_Challenge.close();				
			}
			catch(Exception ignore) {}			
		}		
		
		return result;
	}
	

	// load JSON file into database, used for completed_time bug User_Challenge collection
	public short loadJsonIntoDatabase_v2(String jsonFile) {
		
		short result = 1; // success 
		
		/*PreparedStatement ps_Stg_User = null;
		PreparedStatement ps_Stg_User_Narrow_OptOut = null;
		PreparedStatement ps_Stg_UserFlag = null;
		PreparedStatement ps_Stg_User_Quiz = null;
		PreparedStatement ps_Stg_User_Quiz_Answers = null;
		PreparedStatement ps_Stg_File = null;
		PreparedStatement ps_Stg_User_Login = null;
		PreparedStatement ps_Stg_Linkedin_Work_History = null;
		PreparedStatement ps_Stg_Linkedin_Work_History_Pos = null;
		PreparedStatement ps_Stg_User_Profile = null;*/
		PreparedStatement ps_Stg_User_Challenge = null;
		PreparedStatement ps_Stg_User_Challenge_Step = null;
		PreparedStatement ps_Stg_User_Challenge_Step_Activity = null;
		//PreparedStatement ps_Stg_User_Challenge_Stats = null;
		//PreparedStatement ps_Stg_Survey_Challenge = null;
		
		int userIndex = 0;
		
		try {			 
        	// control commit
        	//connection.setAutoCommit(false);			
			
        	// processing the file
        	p = new Processing(jsonFile);        	
        	
        	// get ps for Stg_User
        	/*ps_Stg_User = connection.prepareStatement(this.sql_Stg_user);
        	ps_Stg_User_Narrow_OptOut = connection.prepareStatement(this.sql_Stg_User_Narrow_OptOut);
        	ps_Stg_UserFlag = connection.prepareStatement(this.sql_Stg_Userflag);
        	ps_Stg_User_Quiz = connection.prepareStatement(this.sql_Stg_User_Quiz);
        	ps_Stg_User_Quiz_Answers = connection.prepareStatement(this.sql_Stg_User_Quiz_Answers);
        	ps_Stg_File = connection.prepareStatement(this.sql_Stg_File);
        	ps_Stg_User_Login = connection.prepareStatement(this.sql_Stg_User_Login);
        	ps_Stg_Linkedin_Work_History = connection.prepareStatement(this.sql_Stg_Linkedin_Work_History);
        	ps_Stg_Linkedin_Work_History_Pos = connection.prepareStatement(this.sql_Stg_Linkedin_Work_History_Pos);
        	ps_Stg_User_Profile = connection.prepareStatement(this.sql_Stg_User_Profile);*/
        	
        	ps_Stg_User_Challenge = connection.prepareStatement(this.sql_Stg_User_Challenge_v2);
        	ps_Stg_User_Challenge_Step = connection.prepareStatement(this.sql_Stg_User_Challenge_Step_v2);
        	ps_Stg_User_Challenge_Step_Activity = connection.prepareStatement(this.sql_Stg_User_Challenge_Step_Activity_v2);        	
        	
        	//ps_Stg_User_Challenge_Stats = connection.prepareStatement(this.sql_Stg_User_Challenge_Stats);
        	//ps_Stg_Survey_Challenge = connection.prepareStatement(this.sql_Stg_Survey_Challenge);
        	
   			// get max step_id from Stg_User_Challenge_Step + step_uid from LR_User_Challenge_Step
   			long stepId = this.getMaxStepId(); // this.getMaxCombinedStepID();       	
        	
        	// go through each object 
       		for (int i=0; i<p.getJsonArray().size();i++) {
       			
       			// user index used in catch
       			userIndex = i;
       			//logger.debug("index: " + i);	
       			
       			// go through each item object
       			JSONObject object = (JSONObject)p.getJsonArray().get(i);
       			
       			// -------------------------------- user_challenge collection       			
       			// go through UserChallenges
       			ArrayList<UserChallenge> userChallenge = p.getUserChallenge(object);
       			for (int k=0; k<userChallenge.size();k++) {
       				UserChallenge userC = (UserChallenge) userChallenge.get(k);
       				getPrStmtStg_User_Challenge(ps_Stg_User_Challenge, userC);
       				ps_Stg_User_Challenge.addBatch();
       				
       				//System.out.println("size=" + userC.getCompleteStatus().getSteps().size());
       				
       				// load steps
       				for (int jj=0;jj<userC.getCompleteStatus().getSteps().size();jj++) {
       					
       					UserChallengeStep step = userC.getCompleteStatus().getSteps().get(jj);
       					
       					getPrStmtStg_User_Challenge_Step(ps_Stg_User_Challenge_Step, ++stepId, userC.getID().getOid(), userC.getUserId(), step);
       					ps_Stg_User_Challenge_Step.addBatch();
       					
       					//System.out.println("stepId=" + stepId);
       					//System.out.println("stepName=" + step.getStepName());
       					
       					//System.out.println(step.getActivity().size());
       					// load activities
       					for (int pp=0;pp<step.getActivity().size();pp++) {
       						
       						UserChallengeStepActivity activity = step.getActivity().get(pp);
       						
       						//System.out.println("answer size=" + activity.getAnswers().size());
       						
       						if (activity.getAnswers().size() > 0) {
	       						for (int ll=0;ll<activity.getAnswers().size();ll++) {
	       							String answer = activity.getAnswers().get(ll);       							
	       							getPrStmtStg_User_Challenge_Step_Activity(ps_Stg_User_Challenge_Step_Activity, stepId, userC.getID().getOid(), userC.getUserId(), activity.isCompleted(), answer, activity.getCreatedFormat(), activity.getActivityName());
	       							ps_Stg_User_Challenge_Step_Activity.addBatch();
	       						} // end for ll
       						}
       						else {
       							// if no answers put null for answer
       							getPrStmtStg_User_Challenge_Step_Activity(ps_Stg_User_Challenge_Step_Activity, stepId, userC.getID().getOid(), userC.getUserId(), activity.isCompleted(), null, activity.getCreatedFormat(), activity.getActivityName());
       							ps_Stg_User_Challenge_Step_Activity.addBatch();       							
       						}
       						
       					} // end for pp       					
       					
       				} // end for jj
       				
       			} // end for k
       			
       			// ----------------------------------------------------------
       			// execute batches if index same as batchSize in configuration file       			
       			if (batchSize>0 && i>0 && i%batchSize == 0) {
       				System.out.println("batchSize="+batchSize);
       				System.out.println("commit batch: " + i);
       	       		//ps_Stg_User.executeBatch();
       	       		//ps_Stg_User_Narrow_OptOut.executeBatch();
       	       		//ps_Stg_UserFlag.executeBatch();       		
       	       		//ps_Stg_User_Quiz.executeBatch();
       	       		//ps_Stg_User_Quiz_Answers.executeBatch();
       	       		//ps_Stg_File.executeBatch();
       	       		//ps_Stg_User_Login.executeBatch();
       	       		//ps_Stg_Linkedin_Work_History.executeBatch();
       	       		//ps_Stg_Linkedin_Work_History_Pos.executeBatch();
       	       		//ps_Stg_User_Profile.executeBatch();
       	       		ps_Stg_User_Challenge.executeBatch();
       	       		ps_Stg_User_Challenge_Step.executeBatch();
       	       		ps_Stg_User_Challenge_Step_Activity.executeBatch();
       	       		//ps_Stg_User_Challenge_Stats.executeBatch();
       	       		//ps_Stg_Survey_Challenge.executeBatch();
       			}
       			
        	} // end for      
       		
       		// execute batches
       		//ps_Stg_User.executeBatch();
       		//ps_Stg_User_Narrow_OptOut.executeBatch();
       		//ps_Stg_UserFlag.executeBatch();       		
       		//ps_Stg_User_Quiz.executeBatch();
       		//ps_Stg_User_Quiz_Answers.executeBatch();
       		//ps_Stg_File.executeBatch();
       		//ps_Stg_User_Login.executeBatch();
       		//ps_Stg_Linkedin_Work_History.executeBatch();
       		//ps_Stg_Linkedin_Work_History_Pos.executeBatch();
       		//ps_Stg_User_Profile.executeBatch();
       		ps_Stg_User_Challenge.executeBatch();
       		ps_Stg_User_Challenge_Step.executeBatch();
       		ps_Stg_User_Challenge_Step_Activity.executeBatch();
       		//ps_Stg_User_Challenge_Stats.executeBatch();
       		//ps_Stg_Survey_Challenge.executeBatch();
       		
       		//connection.commit();       		
		}
		catch(Exception ex) {		
			try {
				//connection.rollback();
			}
			catch (Exception ignore) {}
			result = -1;
			ex.printStackTrace();
			errorMessage = "Exception: " + ex.getMessage() + "; userIndex: " + userIndex;
			logger.error(errorMessage);			
		}
		finally {
			try {				
				/*if (ps_Stg_User != null)
					ps_Stg_User.close();
				
				if (ps_Stg_User_Narrow_OptOut != null)
					ps_Stg_User_Narrow_OptOut.close();
				
				if (ps_Stg_UserFlag != null)
					ps_Stg_UserFlag.close();
				
				if (ps_Stg_User_Quiz != null)
					ps_Stg_User_Quiz.close();
				
				if (ps_Stg_User_Quiz_Answers != null)
					ps_Stg_User_Quiz_Answers.close();		
				
				if (ps_Stg_File != null)
					ps_Stg_File.close();	
				
				if (ps_Stg_User_Login != null)
					ps_Stg_User_Login.close();	
				
				if (ps_Stg_Linkedin_Work_History != null)
					ps_Stg_Linkedin_Work_History.close();	
				
				if (ps_Stg_Linkedin_Work_History_Pos != null)
					ps_Stg_Linkedin_Work_History_Pos.close();	
				
				if (ps_Stg_User_Profile != null)
					ps_Stg_User_Profile.close();*/		
				
				if (ps_Stg_User_Challenge != null)
					ps_Stg_User_Challenge.close();				

				if (ps_Stg_User_Challenge_Step != null)
					ps_Stg_User_Challenge_Step.close();		
				
				if (ps_Stg_User_Challenge_Step_Activity != null)
					ps_Stg_User_Challenge_Step_Activity.close();	
				
				/*if (ps_Stg_User_Challenge_Stats != null)
					ps_Stg_User_Challenge_Stats.close();	
				
				if (ps_Stg_Survey_Challenge != null)
					ps_Stg_Survey_Challenge.close();*/				
			}
			catch(Exception ignore) {}			
		}		
		
		return result;
	}
	
	
	public void truncateStagingTables() {
		String sql = "{call truncateStaging}";	
		
		PreparedStatement ps = null;
		
		try {
			//connection.setAutoCommit(false);
			ps = connection.prepareStatement(sql);
			ps.execute();
			//connection.commit();			
		}
		catch(Exception ex) {
			try {
				//connection.rollback();
			}
			catch(Exception ignore) {}			
			ex.printStackTrace();
			logger.error("Exception:" + ex.getMessage());	
			errorMessage = ex.getMessage();
		}
		finally {
			try {				
				if (ps != null)
					ps.close();
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
		}
	}
	
	// truncate CMS staging tables
	public void truncateCMSStagingTables() {
		
		String sql = "{call truncateCMSStaging}";
		logger.debug(sql);
		
		PreparedStatement ps = null;
		
		try {
			//connection.setAutoCommit(false);
			ps = connection.prepareStatement(sql);
			ps.execute();
			//connection.commit();			
		}
		catch(Exception ex) {
			try {
				//connection.rollback();
			}
			catch(Exception ignore) {}			
			ex.printStackTrace();
			logger.error("Exception:" + ex.getMessage());	
			errorMessage = ex.getMessage();
		}
		finally {
			try {				
				if (ps != null)
					ps.close();
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
		}
	}	
	
	// truncate MongoDB staging tables
	public void truncateMongoDBStagingTables() {
		String sql = "{call truncateMongoDBStaging}";	
		logger.debug(sql);
		
		PreparedStatement ps = null;
		
		try {
			//connection.setAutoCommit(false);
			ps = connection.prepareStatement(sql);
			ps.execute();
			//connection.commit();			
		}
		catch(Exception ex) {
			try {
				//connection.rollback();
			}
			catch(Exception ignore) {}			
			ex.printStackTrace();
			logger.error("Exception:" + ex.getMessage());	
			errorMessage = ex.getMessage();
		}
		finally {
			try {				
				if (ps != null)
					ps.close();
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
		}
	}	
	
	public void loadStagingCMS() {
		
		logger.debug("enter {call load_Staging_v2("+this.mETLProcessDtlID+")}");
		String sql = "{call load_Staging_v2(?)}";		
		
		PreparedStatement ps = null;
		
		try {
			//connection.setAutoCommit(false);
			ps = connection.prepareStatement(sql);
			ps.setObject(1, this.mETLProcessDtlID, java.sql.Types.BIGINT);
			ps.execute();
			//connection.commit();			
		}
		catch(Exception ex) {
			try {
				//connection.rollback();
			}
			catch(Exception ignore) {}			
			ex.printStackTrace();
			logger.error("Exception:" + ex.getMessage());	
			errorMessage = ex.getMessage();
		}
		finally {
			try {				
				if (ps != null)
					ps.close();
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
		}
	}
	
	public short loadStagingMongoDB_v2() {
		
		logger.debug("enter {call load_Staging_MongoDB_v2("+this.mETLProcessDtlID+")}");
		String sql = "{call load_Staging_MongoDB_v2(?,0,0)}";		
		
		PreparedStatement ps = null;
		short result = 1; // success 
		
		try {
			//connection.setAutoCommit(false);
			ps = connection.prepareStatement(sql);
			ps.setObject(1, this.mETLProcessDtlID, java.sql.Types.BIGINT);
			ps.execute();
			//connection.commit();			
		}
		catch(Exception ex) {
			result = -1;
			try {
				//connection.rollback();
			}
			catch(Exception ignore) {}			
			ex.printStackTrace();
			logger.error("Exception:" + ex.getMessage());	
			errorMessage = ex.getMessage();
		}
		finally {
			try {				
				if (ps != null)
					ps.close();
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
		}
		
		return result;
	}	
	
	public void loadStagingHistorical() {
		
		logger.debug("enter {call load_Staging_Hist_v2("+this.mETLProcessDtlID+")}");
		String sql = "{call load_Staging_Hist_v2(?)}";		
		
		PreparedStatement ps = null;
		
		try {
			//connection.setAutoCommit(false);
			ps = connection.prepareStatement(sql);
			ps.setObject(1, this.mETLProcessDtlID, java.sql.Types.BIGINT);
			ps.execute();
			//connection.commit();			
		}
		catch(Exception ex) {
			try {
				//connection.rollback();
			}
			catch(Exception ignore) {}			
			ex.printStackTrace();
			logger.error("Exception:" + ex.getMessage());	
			errorMessage = ex.getMessage();
		}
		finally {
			try {				
				if (ps != null)
					ps.close();
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
		}
	}	
	
	public void build_insert_stmt_v2(String staggingTableName) {
		logger.debug("enter {call build_insert_stmt_v2('"+staggingTableName+"',"+this.mETLProcessDtlID+")}");
		String sql = "{call build_insert_stmt_v2(?,?)}";		
		
		PreparedStatement ps = null;
		
		try {
			//connection.setAutoCommit(false);
			ps = connection.prepareStatement(sql);
			ps.setString(1, staggingTableName);
			ps.setObject(2, this.mETLProcessDtlID, java.sql.Types.BIGINT);
			ps.execute();
			//connection.commit();			
		}
		catch(Exception ex) {
			try {
				//connection.rollback();
			}
			catch(Exception ignore) {}			
			ex.printStackTrace();
			logger.error("Exception:" + ex.getMessage());	
			errorMessage = ex.getMessage();
		}
		finally {
			try {				
				if (ps != null)
					ps.close();
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
		}
	}	
	
	
	// count records in staging tables
	public Long countRowsInStaging() {
		
		String sql = "{call count_rows_in_staging(?,?,?)}";		
		
		Long count = 0L;
		
		CallableStatement cstmt = null;
		
		try {
			//connection.setAutoCommit(false);
			cstmt = connection.prepareCall(sql);
			cstmt.setString(1, this.getAarpLoadType());
			cstmt.setObject(2, this.mETLProcessDtlID, java.sql.Types.BIGINT);
			cstmt.registerOutParameter(3, java.sql.Types.BIGINT);
			cstmt.execute();
			//connection.commit();
			
			count = cstmt.getLong(3);
			logger.debug("enter {call count_rows_in_staging("+this.getAarpLoadType()+","+this.mETLProcessDtlID+","+count+")}");
		}
		catch(Exception ex) {
			try {
				//connection.rollback();
			}
			catch(Exception ignore) {}			
			ex.printStackTrace();
			logger.error("Exception:" + ex.getMessage());	
			errorMessage = ex.getMessage();
		}
		finally {
			try {				
				if (cstmt != null)
					cstmt.close();
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
		}
		
		return count;
	}		
	
	public ArrayList<API> getAPIs(String sourceSystem) {
		
		String sql = "{call get_apis(?)}";
		
		ResultSet rs = null;
		PreparedStatement ps = null;
		ArrayList<API> al = new ArrayList<API>();
		
		try {
			ps = connection.prepareStatement(sql);
			ps.setString(1, sourceSystem);
			rs = ps.executeQuery();
			
			if (rs != null) {
				while (rs.next()) {					
					API api = new API();
					api.setId(rs.getLong(1)); 				// id
					api.setUrl(rs.getString(2));			// api url
					api.setContentType(rs.getString(3));	// content_type for CMS
					
					al.add(api);
				}				
			}
		}
		catch(Exception ex) {
			try {
				connection.rollback();
			}
			catch(Exception ignore) {}			
			ex.printStackTrace();
			logger.error("Exception:" + ex.getMessage());	
			errorMessage = ex.getMessage();
		}
		finally {
			try {				
				if (ps != null)
					ps.close();
				
				if (rs != null)
					rs.close();
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
		}	
		
		return al;		
	}
	
	// get collections to process 
	public ArrayList<String> getCollections(String sourceSystem) {
		
		String sql = "{call get_collections(?)}";
		
		ResultSet rs = null;
		PreparedStatement ps = null;
		ArrayList<String> collections = new ArrayList<String>();
		
		try {
			ps = connection.prepareStatement(sql);
			ps.setString(1, sourceSystem);
			rs = ps.executeQuery();
			
			if (rs != null) {
				while (rs.next()) {					
					collections.add(rs.getString(1));
				}				
			}
		}
		catch(Exception ex) {
			try {
				connection.rollback();
			}
			catch(Exception ignore) {}			
			ex.printStackTrace();
			logger.error("Exception:" + ex.getMessage());	
			errorMessage = ex.getMessage();
		}
		finally {
			try {				
				if (ps != null)
					ps.close();
				
				if (rs != null)
					rs.close();
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
		}	
		
		return collections;		
	}	
	
	// close database resources
	public void freeResource() {
		try {
			if (connection != null)
				connection.close();
		}
		catch(Exception ex) {
			ex.printStackTrace();
			logger.error("Exception:" + ex.getMessage());
			errorMessage = ex.getMessage();
		}
	}	

	private java.sql.Timestamp getCurrentTimeStamp() {
		return new Timestamp(new java.util.Date().getTime());
	}
	
	private java.sql.Timestamp getCurrentTimeStamp(java.util.Date dt) {
		if (dt == null)
			return null;
		else if (!MyUtils.isValidDate(dt))
			return null;
		else
			return new Timestamp(dt.getTime());
	}
	
	public Processing getProcessing() {
		return p;
	}
	
	public void setProcessing(Processing p) {
		this.p = p;
	}
	
	// mETLProcessTypeID
	public long getmETLProcessTypeID() {
		return mETLProcessTypeID;
	}

	public void setmETLProcessTypeID(long mETLProcessTypeID) {
		this.mETLProcessTypeID = mETLProcessTypeID;
	}
	
	// mETLProcessDtlID
	public long getmETLProcessDtlID() {
		return mETLProcessDtlID;
	}

	public void setmETLProcessDtlID(long mETLProcessDtlID) {
		this.mETLProcessDtlID = mETLProcessDtlID;
	}
	
	// mETLLoadErrID
	public long getmETLLoadErrID() {
		return mETLLoadErrID;
	}

	public void setmETLLoadErrID(long mETLLoadErrID) {
		this.mETLLoadErrID = mETLLoadErrID;
	}
	
	// private java.util.Date mETLProcessTypeParamDt = null, mETLProcessTypeCreatedDate = null, since = null;
	// mETLProcessTypeParamDt
	public java.util.Date getmETLProcessTypeParamDt() {
		return mETLProcessTypeParamDt;
	}

	public void setmETLProcessTypeParamDt(java.util.Date mETLProcessTypeParamDt) {
		this.mETLProcessTypeParamDt = mETLProcessTypeParamDt;
	}
	
	// mETLProcessTypeCreatedDate
	public java.util.Date getmETLProcessTypeCreatedDate() {
		return mETLProcessTypeCreatedDate;
	}

	public void setmETLProcessTypeCreatedDate(java.util.Date mETLProcessTypeCreatedDate) {
		this.mETLProcessTypeCreatedDate = mETLProcessTypeCreatedDate;
	}
	
	// since
	public java.util.Date getsince() {
		return since;
	}

	public void setsince(java.util.Date since) {
		this.since = since;
	}

	//
	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public java.util.Date getJsonSince() {
		return jsonSince;
	}

	public void setJsonSince(java.util.Date jsonSince) {
		this.jsonSince = jsonSince;
	}
	
	
	// staging to DW
	public short refreshDW() {
		
		logger.debug("enter {call Refresh_DW_Main()}");
		short result = 1; // success 
		
		String sql = "{call Refresh_DW_Main}";	
		
		PreparedStatement ps = null;
		
		try {
			//connection.setAutoCommit(false);
			ps = connection.prepareStatement(sql);
			ps.execute();
			//connection.commit();			
		}
		catch(Exception ex) {
			try {
				//connection.rollback();
			}
			catch(Exception ignore) {}	
			result = -1;
			ex.printStackTrace();
			logger.error("Exception:" + ex.getMessage());	
			errorMessage = ex.getMessage();
		}
		finally {
			try {				
				if (ps != null)
					ps.close();
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
		}
		
		return result;
	}
	
	// staging to DW - dynamic SQL  
	public short refreshDW_v2() {
		
		logger.debug("enter {call Refresh_DW_Main_v2()}");
		
		short result = 1; // success 
		
		String sql = "{call Refresh_DW_Main_v2}";	
		
		PreparedStatement ps = null;
		
		try {
			//connection.setAutoCommit(false);
			ps = connection.prepareStatement(sql);
			ps.execute();
			//connection.commit();			
		}
		catch(Exception ex) {
			try {
				//connection.rollback();
			}
			catch(Exception ignore) {}	
			result = -1;
			ex.printStackTrace();
			logger.error("Exception:" + ex.getMessage());	
			errorMessage = ex.getMessage();
		}
		finally {
			try {				
				if (ps != null)
					ps.close();
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
		}
		
		return result;
	}	
	
	// staging to DW - dynamic SQL for historical load  
	public short refreshHistDW_v2() {
		
		logger.debug("enter {call Refresh_Hist_DW_Main_v2()}");
		
		short result = 1; // success 
		
		String sql = "{call Refresh_Hist_DW_Main_v2}";	
		
		PreparedStatement ps = null;
		
		try {
			//connection.setAutoCommit(false);
			ps = connection.prepareStatement(sql);
			ps.execute();
			//connection.commit();			
		}
		catch(Exception ex) {
			try {
				//connection.rollback();
			}
			catch(Exception ignore) {}	
			result = -1;
			ex.printStackTrace();
			logger.error("Exception:" + ex.getMessage());	
			errorMessage = ex.getMessage();
		}
		finally {
			try {				
				if (ps != null)
					ps.close();
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
		}
		
		return result;
	}	
	
	// CMS staging to DW
	public short refreshCMS_DW() {
		
		short result = 1; // success 
		
		String sql = "{call Refresh_CMS_DW_Main}";	
		
		PreparedStatement ps = null;
		
		try {
			//connection.setAutoCommit(false);
			ps = connection.prepareStatement(sql);
			ps.execute();
			//connection.commit();			
		}
		catch(Exception ex) {
			try {
				//connection.rollback();
			}
			catch(Exception ignore) {}	
			result = -1;
			ex.printStackTrace();
			logger.error("Exception:" + ex.getMessage());	
			errorMessage = ex.getMessage();
		}
		finally {
			try {				
				if (ps != null)
					ps.close();
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
		}
		
		return result;
	}
	
	
	// parse undefined JSON
	public void loadUndefineJSON(Long id, String metaData, String metaValue, Long parentId, String pType, String pIndex, Long etlProcessID, String contentType, String parentString) {
		String sql = "{call LoadUndefineJSON(?,?,?,?,?,?,?,?,?)}";	
		
		PreparedStatement ps = null;
		
		try {			
			//connection.setAutoCommit(false);
			ps = connection.prepareStatement(sql);
			ps.setObject(1, id, java.sql.Types.BIGINT);
			ps.setString(2, metaData);
			ps.setObject(3, metaValue, java.sql.Types.LONGVARCHAR);
			ps.setObject(4, parentId, java.sql.Types.BIGINT);
			ps.setString(5, pType);
			ps.setString(6, pIndex);
			ps.setObject(7, etlProcessID, java.sql.Types.BIGINT);
			ps.setString(8, contentType);
			ps.setString(9, parentString);
			
			ps.execute();
			//connection.commit();			
		}
		catch(Exception ex) {
			try {
				//connection.rollback();
			}
			catch(Exception ignore) {}			
			ex.printStackTrace();
			logger.error("Exception:" + ex.getMessage());	
			errorMessage = ex.getMessage();
		}
		finally {
			try {				
				if (ps != null)
					ps.close();
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
		}
	}
	
	// parse undefined JSON
	public void loadUndefineJSON_v2(Long id, String metaData, String metaValue, Long parentId, String pType, Integer pIndex, Long etlProcessID, String contentType, Integer level, String parentString, String array_indx, String parentTagType) {
		String sql = "{call LoadUndefineJSON_v2(?,?,?,?,?,?,?,?,?,?,?,?,?)}";	
		
		PreparedStatement ps = null;
		
		try {			
			//connection.setAutoCommit(false);
			ps = connection.prepareStatement(sql);
			ps.setObject(1, id, java.sql.Types.BIGINT);
			ps.setString(2, metaData);
			ps.setObject(3, metaValue, java.sql.Types.LONGVARCHAR);
			ps.setObject(4, parentId, java.sql.Types.BIGINT);
			ps.setString(5, pType);
			ps.setInt(6, pIndex);
			ps.setObject(7, etlProcessID, java.sql.Types.BIGINT);
			ps.setString(8, contentType);
			ps.setInt(9, level);
			ps.setString(10, parentString);
			ps.setString(11, array_indx);
			ps.setString(12, parentString);
			ps.setString(13, parentTagType);
			
			ps.execute();
			//connection.commit();			
		}
		catch(Exception ex) {
			try {
				//connection.rollback();
			}
			catch(Exception ignore) {}			
			ex.printStackTrace();
			logger.error("Exception:" + ex.getMessage());	
			errorMessage = ex.getMessage();
		}
		finally {
			try {				
				if (ps != null)
					ps.close();
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
		}	
	}	
	
	// parse undefined JSON
	public void loadUndefineJSON_v3(String insertStmt) {
			
		
		PreparedStatement ps = null;
		
		try {			
			//connection.setAutoCommit(false);
			ps = connection.prepareStatement(insertStmt);
			
			ps.execute();
			//connection.commit();			
		}
		catch(Exception ex) {
			try {
				//connection.rollback();
			}
			catch(Exception ignore) {}			
			ex.printStackTrace();
			logger.error("Exception:" + ex.getMessage());	
			errorMessage = ex.getMessage();
		}
		finally {
			try {				
				if (ps != null)
					ps.close();
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
		}	
	}		
	
	// parse undefined JSON test
	public void loadUndefineJSON_tst(Long id, String metaData, String metaValue, Long parentId, String pType, Integer pIndex, Long etlProcessID) {
		String sql = "{call LoadUndefineJSON_TST(?,?,?,?,?,?,?)}";	
		
		PreparedStatement ps = null;
		
		try {
			//connection.setAutoCommit(false);
			ps = connection.prepareStatement(sql);
			ps.setObject(1, id, java.sql.Types.BIGINT);
			ps.setString(2, metaData);
			ps.setObject(3, metaValue, java.sql.Types.LONGVARCHAR);
			ps.setObject(4, parentId, java.sql.Types.BIGINT);
			ps.setString(5, pType);
			ps.setInt(6, pIndex);
			ps.setObject(7, etlProcessID, java.sql.Types.BIGINT);
			
			ps.execute();
			//connection.commit();			
		}
		catch(Exception ex) {
			try {
				//connection.rollback();
			}
			catch(Exception ignore) {}			
			ex.printStackTrace();
			logger.error("Exception:" + ex.getMessage());	
			errorMessage = ex.getMessage();
		}
		finally {
			try {				
				if (ps != null)
					ps.close();
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
		}
	}
	
	// get last ID from stg_json_structure
	public long getMaxIdJsonUndefineStructure() {
		
		String sql = "SELECT MAX(id) AS mIdJsonUndefineStructure FROM Stg_Json_Structure where ETLProcessID="+this.mETLProcessDtlID;
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {			
			ps = connection.prepareStatement(sql);			
			rs = ps.executeQuery();
			if (rs != null && rs.next()) {
				if (rs.getString("mIdJsonUndefineStructure") != null)
					this.setmIdJsonUndefineStructure(Long.parseLong(rs.getString("mIdJsonUndefineStructure")));
			}				
		}
		catch(Exception ex) {
			ex.printStackTrace();
			logger.error("Exception:" + ex.getMessage());	
			errorMessage = ex.getMessage();
		}
		finally {
			try {	
				if (ps != null)
					ps.close();
				if (rs != null) 
					rs.close();				
			}
			catch(Exception ignore) {}
		}
		
		return getmIdJsonUndefineStructure();
	}
	
	// clean Stg_Json_Structure
	public void truncateStg_Json_Structure() {		
		
		logger.debug("enter {call TruncateStg_Json_Structure("+this.mETLProcessDtlID+")}");
		String sql = "{call TruncateStg_Json_Structure(?)}";
		
		PreparedStatement ps = null;
		
		try {			
			
			//connection.setAutoCommit(false);
			ps = connection.prepareStatement(sql);
			ps.setObject(1, this.mETLProcessDtlID, java.sql.Types.BIGINT);
			ps.execute();
			//connection.commit();
			
			// reset undefined to 0
			this.setmIdJsonUndefineStructure(0l);
		}
		catch(Exception ex) {
			try {
				//connection.rollback();
			}
			catch(Exception ignore) {}
			ex.printStackTrace();
			logger.error("Exception:" + ex.getMessage());	
		}
		finally {
			try {	
				if (ps != null)
					ps.close();
			}
			catch(Exception ignore) {}
		}	
	}	
	
	// clean Stg_Json_Structure_v2
	public void truncateStg_Json_Structure_v2() {		
		
		logger.debug("enter {call TruncateStg_Json_Structure_v2("+this.mETLProcessDtlID+")}");
		String sql = "{call TruncateStg_Json_Structure_v2(?)}";
		
		PreparedStatement ps = null;
		
		try {			
			
			//connection.setAutoCommit(false);
			ps = connection.prepareStatement(sql);
			ps.setObject(1, this.mETLProcessDtlID, java.sql.Types.BIGINT);
			ps.execute();
			//connection.commit();
			
			// reset undefined to 0
			this.setmIdJsonUndefineStructure(0l);
		}
		catch(Exception ex) {
			try {
				//connection.rollback();
			}
			catch(Exception ignore) {}
			ex.printStackTrace();
			logger.error("Exception:" + ex.getMessage());	
		}
		finally {
			try {	
				if (ps != null)
					ps.close();
			}
			catch(Exception ignore) {}
		}	
	}
	
	// clean Stg_Json_Structure
	public void truncateStg_Json_Structure_tst() {
		
		String sql = "{call TruncateStg_Json_Structure_TST}";
		
		PreparedStatement ps = null;
		
		try {			
			
			//connection.setAutoCommit(false);
			ps = connection.prepareStatement(sql);
			ps.execute();
			//connection.commit();
			
			// reset undefined to 0
			this.setmIdJsonUndefineStructure(0l);
		}
		catch(Exception ex) {
			try {
				//connection.rollback();
			}
			catch(Exception ignore) {}
			ex.printStackTrace();
			logger.error("Exception:" + ex.getMessage());	
		}
		finally {
			try {	
				if (ps != null)
					ps.close();
			}
			catch(Exception ignore) {}
		}	
	}
	
	// load Stg_Json_Structure
	public void loadStg_Json_Structure() {
		
		logger.debug("enter {call load_Stg_Json_Structure("+this.getAarpLoadType()+", "+this.mETLProcessDtlID+")}");		
		String sql = "{call load_Stg_Json_Structure(?,?)}";
		
		PreparedStatement ps = null;
		
		try {			
			
			//connection.setAutoCommit(false);
			ps = connection.prepareStatement(sql);
			ps.setString(1, this.getAarpLoadType());
			ps.setObject(2, this.mETLProcessDtlID, java.sql.Types.BIGINT);
			ps.execute();
			//connection.commit();
		}
		catch(Exception ex) {
			try {
				//connection.rollback();
			}
			catch(Exception ignore) {}
			ex.printStackTrace();
			logger.error("Exception:" + ex.getMessage());	
		}
		finally {
			try {	
				if (ps != null)
					ps.close();
			}
			catch(Exception ignore) {}
		}	
	}

	public Long getmIdJsonUndefineStructure() {
		return mIdJsonUndefineStructure;
	}

	public void setmIdJsonUndefineStructure(Long mIdJsonUndefineStructure) {
		this.mIdJsonUndefineStructure = mIdJsonUndefineStructure;
	}
	
	// parse undefined JSON Sprint 2	
	public void parseUndefinedJSON() {
		
		PreparedStatement ps = null;
		
		try {
			//connection.setAutoCommit(false);			
			ps = connection.prepareStatement("{call LoadUndefineJSON(?,?,?,?,?,?)}");
			
			// go through array
			for (int i=0; i<p.getJsonArray().size();i++) {
				JSONObject object = (JSONObject)p.getJsonArray().get(i);
				
				ObjectMapper mapper = new ObjectMapper();
				JsonParser parser = mapper.getJsonFactory().createJsonParser(object.toJSONString());				
				
				while (parser.nextToken() != null) {				
					JsonNode node = parser.readValueAsTree();
					//System.out.println(node);
					parseUndefinedJSONObject(node, ps);
				} // end while
			}
			
			ps.executeBatch();
			//connection.commit();
		}
		catch(Exception ex) {
			try {
				//connection.rollback();
			}
			catch(Exception ignore) {}			
			ex.printStackTrace();
			logger.error("Exception:" + ex.getMessage());	
			errorMessage = ex.getMessage();
		}
		finally {
			try {				
				if (ps != null)
					ps.close();
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
		}
 	}
	
	// parse undefined JSON object Sprint 2	
	public void parseUndefinedJSONObject(JsonNode node, PreparedStatement ps) {
		try {
			if (node.isObject()) {
				Iterator<Map.Entry<String,JsonNode>> iterator=node.getFields();
				
				int index = 1;				
				
				while(iterator.hasNext()) {
					Map.Entry<String,JsonNode> jsonNode=iterator.next();				
					
					String key = jsonNode.getKey();
					JsonNode temp = jsonNode.getValue();	
					//System.out.println("index="+index);
					//System.out.println("key="+key);
					//System.out.println("JsonNode="+temp);
					
					// insert into database, add batch
					// -------------
					undefinedJSONBatch(ps, key, temp.toString(), null, temp.asToken().toString(), index, this.getmETLProcessDtlID());
					// -------------
					
					index++;																				
					parseUndefinedJSONObject(temp, ps);
				}
			}
			else if (node.isArray()) {
				for (int i=0;i<node.size();i++) {  
					JsonNode child = node.get(i);
					parseUndefinedJSONObject(child, ps);
				}  
			}
			/*else {
	            if (node.isValueNode())
	            {
	                System.out.println("  valueNode: " + node.asText());
	            }
	            else
	            {
	                System.out.println("  node some other type");
	            }
			}*/
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	// populate batch PreparedStatement 
	public void undefinedJSONBatch(PreparedStatement ps, String metaData, String metaValue, Long parentId, String pType, Integer pIndex, Long etlProcessID) {
		try {
			ps.setString(1, metaData);
			ps.setObject(2, metaValue, java.sql.Types.LONGVARCHAR);
			ps.setObject(3, parentId, java.sql.Types.BIGINT);
			ps.setString(4, pType);
			ps.setInt(5, pIndex);
			ps.setObject(6, etlProcessID, java.sql.Types.BIGINT);
			ps.addBatch();
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	// setMySQLParameters
	// SET GLOBAL group_concat_max_len = 18446744073709551615;
	// SET GLOBAL max_allowed_packet = 1073741824;
	// SET GLOBAL net_read_timeout = 3600;
	// SET GLOBAL connect_timeout = 3600;
	
	public void setMySQLParameters() {
		String stmt = "SET GLOBAL group_concat_max_len = 18446744073709551615";
		PreparedStatement ps = null;
		
		try {
			// SET SESSION group_concat_max_len = 18446744073709551615;
			ps = connection.prepareStatement(stmt);
			ps.execute();
			ps.close();
			
			// SET SESSION max_allowed_packet = 1073741824;
			stmt = "SET GLOBAL max_allowed_packet = 1073741824";
			ps = connection.prepareStatement(stmt);
			ps.execute();
			ps.close();
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		finally {
			try {
				if (ps != null)
					ps.close();
			}
			catch(Exception ex1) {}
		}
	}

	public Boolean getmETLStillRun() {
		return mETLStillRun;
	}

	public void setmETLStillRun(Boolean mETLStillRun) {
		this.mETLStillRun = mETLStillRun;
	}

	public String getAarpLoadType() {
		return aarpLoadType;
	}

	public void setAarpLoadType(String aarpLoadType) {
		this.aarpLoadType = aarpLoadType;
	}	
	
	// start logging into LR_ETL_Process_Type & LR_ETL_Process_Dtl
	public void startEtlLog (String etlProcessTypeName, String etlProcessTypeSource) {
		
		String sql = "call Start_ETL_Log(?,?)";	
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			//connection.setAutoCommit(false);
			ps = connection.prepareStatement(sql);
			ps.setString(1, etlProcessTypeName);
			ps.setString(2, etlProcessTypeSource);		
			ps.execute();
			//connection.commit();	
			
			// set all local variables
			this.getLastETLProcessData();	        		

		}	
		catch(Exception ex) {
			try {
				//connection.rollback();
			}
			catch(Exception ignore) {}			
			ex.printStackTrace();
			logger.error("Exception:" + ex.getMessage());
		}
		finally {
			try {				
				if (rs != null) 
					rs.close();
				if (ps != null)
					ps.close();
			}
			catch(Exception ignore) {}
		}	
	}
	
	// end logging into LR_ETL_Process_Type & LR_ETL_Process_Dtl
	public void endEtlLog (String etlProcessTypeName) {
		
		String sql = "call End_ETL_Log(?)";	
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			//connection.setAutoCommit(false);
			ps = connection.prepareStatement(sql);
			ps.setString(1, etlProcessTypeName);
			ps.execute();
			//connection.commit();			
		}	
		catch(Exception ex) {
			try {
				//connection.rollback();
			}
			catch(Exception ignore) {}			
			ex.printStackTrace();
			logger.error("Exception:" + ex.getMessage());
		}
		finally {
			try {				
				if (rs != null) 
					rs.close();
				if (ps != null)
					ps.close();
			}
			catch(Exception ignore) {}
		}	
	}

	public LogData getLogData() {
		return logData;
	}

	public void setLogData(LogData logData) {
		this.logData = logData;
	}

}
