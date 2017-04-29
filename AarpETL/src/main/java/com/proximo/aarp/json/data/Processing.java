package com.proximo.aarp.json.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.log4j.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import com.proximo.aarp.json.collections.*;

public class Processing {
	
	// logger
	static final Logger logger = Logger.getLogger(Processing.class);
	
	public static final String USERCOLLECTIONNAME="user";
	public static final String USERFLAGCOLLECTIONNAME="userflag";
	public static final String USER_QUIZCOLLECTIONNAME="user_quiz";
	public static final String FILECOLLECTIONNAME="file";
	public static final String USER_LOGINCOLLECTIONNAME="user_login";
	public static final String LINKEDIN_WORK_HISTORYCOLLECTIONNAME="linkedin_work_history";
	public static final String USER_PROFILECOLLECTIONNAME="user_profile";
	public static final String USER_CHALLENGECOLLECTIONNAME="user_challenge";
	public static final String SURVEY_CHALLENGECOLLECTIONNAME="survey_challenge";
	public static final String USER_CHALLENGE_STATSCOLLECTIONNAME="user_challenge_stats";
	
	// json file to process
	private String jsonFile;
	
	// json object to process
	private Object jsonObject;
	
	// json Array of JSONObject
	private JSONArray jsonArray;	
	
	public Processing() {}
	
	public Processing(String jsonFile) throws Exception {		
		if (!StringUtils.isBlank(jsonFile)) {
			this.jsonFile = jsonFile;
			this.jsonObject = (Object) JSONValue.parseWithException(this.jsonFile);
			this.jsonArray = (JSONArray) this.jsonObject;
		}
	}

	// parse user object
	@SuppressWarnings("unchecked")
	public User getLRUser(JSONObject object) {		
		// user
		User user = new User();
		
		try {
			if (object.get(Processing.USERCOLLECTIONNAME) != null) {
				
				// get "user" collection from JSON
				JSONObject json = getJSONObject(object, Processing.USERCOLLECTIONNAME);		
		
				Set<String> set = json.keySet();
				Iterator<String> iterator = set.iterator();
				
				while (iterator.hasNext()) {
					String key = iterator.next();			
					//System.out.println("key="+key);
					// user._id 
					if (key.equals(User.IDKEY)) {
						if (json.get(key) instanceof JSONObject) {				
							JSONObject id = (JSONObject) json.get(key);
							user.setID(getLRId(id));
							//System.out.println(key);
						}
					}
					// user._type
					else if (key.equals(User._TYPEKEY)) {
						if (json.get(key) instanceof JSONArray) {				
							JSONArray arr = (JSONArray) json.get(key);
							ArrayList<String> _type = new ArrayList<String>();
							
							for (int i=0;i<arr.size();i++) {						
								if (arr.get(i) != null)						
									_type.add(new String(arr.get(i).toString()));
							}
							
							user.setType(_type);
						}				
					}
					// user.settings
					else if (key.equals(User.SETTINGSKEY)) {
						if (json.get(key) instanceof JSONObject) {				
							JSONObject settings = (JSONObject) json.get(key);
							user.setUserSettings(getLRUserSettings(settings));
						}				
					}
					else {				
						switch (key) {
							case User.EMAILKEY : {
								if (json.get(key) != null) {
									user.setEmail(json.get(key).toString());
									//System.out.println(user.getEmail());
								}
								break;
							}
							case User.EMAIL_UPDATEDKEY : {
								if (json.get(key) != null) {
									user.setEmailUpdated(Double.parseDouble(json.get(key).toString()));								
								}
								break;
							}					
							case User.FIRSTNAMEKEY : {
								if (json.get(key) != null) {
									user.setFirstName(json.get(key).toString());
								}
								break;
							}	
							case User.FIRSTNAME_UPDATEDKEY : {
								if (json.get(key) != null) {
									user.setFirstNameUpdated(Double.parseDouble(json.get(key).toString()));
								}
								break;
							}						
							case User.LASTNAMEKEY : {
								if (json.get(key) != null) {
									user.setLastName(json.get(key).toString());
								}
								break;
							}
							case User.LASTNAME_UPDATEDKEY : {
								if (json.get(key) != null) {
									user.setLastNameUpdated(Double.parseDouble(json.get(key).toString()));
								}
								break;
							}					
							case User.ZIP_CODEKEY : {
								if (json.get(key) != null) {
									user.setZipCode(json.get(key).toString());
								}
								break;
							}	
							case User.ZIP_UPDATEDKEY : {
								if (json.get(key) != null) {
									user.setZipUpdated(Double.parseDouble(json.get(key).toString()));
								}
								break;
							}						
							case User.SIGNUP_VERSIONKEY : {
								if (json.get(key) != null) {
									user.setSignupVerion(json.get(key).toString());
								}
								break;
							}	
							case User.DOBKEY : {
								if (json.get(key) != null) {									
									if (NumberUtils.isNumber(json.get(key).toString()))
										user.setDob(Double.parseDouble(json.get(key).toString()));
								}
								break;
							}		
							case User.DOB_UPDATEDKEY : {
								if (json.get(key) != null) {
									user.setDobUpdated(Double.parseDouble(json.get(key).toString()));
								}
								break;
							}
							case User.CREATEDKEY : {
								if (json.get(key) != null) {
									user.setCreated(Double.parseDouble(json.get(key).toString()));
								}
								break;
							}			
							case User.USERNAMEKEY : {
								if (json.get(key) != null) {
									user.setUsername(json.get(key).toString());
								}
								break;
							}	
							case User.THIRD_PARTYKEY : {
								if (json.get(key) != null) {
									user.setThirdParty(Integer.parseInt(json.get(key).toString()));
								}
								break;
							}		
							case User.LASTLOGINKEY : {
								if (json.get(key) != null) {
									user.setLastLogin(Double.parseDouble(json.get(key).toString()));
								}
								break;
							}		
							case User.UPDATEDKEY : {
								if (json.get(key) != null) {
									user.setUpdated(Double.parseDouble(json.get(key).toString()));
								}
								break;
							}		
							case User.SOURCE_CODESKEY : {
								if (json.get(key) != null) {
									user.setSourceCodes(json.get(key).toString());
								}
								break;
							}
							case User.CAMPAINGKEY : {
								if (json.get(key) != null) {
									user.setCampaign(json.get(key).toString());
								}
								break;
							}					
						} // end switch	
					} // end else
				} // end while
			} // end if
		}
		catch (Exception ex) {
			ex.printStackTrace();
			logger.error("Exception: " + ex.getLocalizedMessage());

		}
		
		return user;
	}
	
	// parse _id object
	public Id getLRId(JSONObject json) {
		Id id = new Id();		
		
		try {
			if (json.get(Id.OIDKEY) != null)
				id.setOid(json.get(Id.OIDKEY).toString());
		}
		catch(Exception ex) {
			ex.printStackTrace();
			logger.error("Exception: " + ex.getLocalizedMessage());
		}
		
		return id;
	}	
	
	// parse settings object
	public UserSettings getLRUserSettings(JSONObject json) {
		UserSettings settings = new UserSettings();
		
		try {
			if (json.get(UserSettings.EMAILKEY) != null)		
				settings.setemail(Float.parseFloat(json.get(UserSettings.EMAILKEY).toString()));
			
			if (json.get(UserSettings.PROFILE_PHOTOKEY) != null)			
				settings.setprofile_photo(Float.parseFloat(json.get(UserSettings.PROFILE_PHOTOKEY).toString()));		
			
			if (json.get(UserSettings.LOCATIONKEY) != null)
				settings.setlocation(Float.parseFloat(json.get(UserSettings.LOCATIONKEY).toString()));
			
			if (json.get(UserSettings.PROFESSIONKEY) != null)
				settings.setprofession(Float.parseFloat(json.get(UserSettings.PROFESSIONKEY).toString()));
			
			if (json.get(UserSettings.COMPANYKEY) != null)
				settings.setcompany(Float.parseFloat(json.get(UserSettings.COMPANYKEY).toString()));
			
			if (json.get(UserSettings.OCCUPATIONKEY) != null)
				settings.setoccupation(Float.parseFloat(json.get(UserSettings.OCCUPATIONKEY).toString()));
			
			if (json.get(UserSettings.RECEIVE_STORIES_EMAILSKEY) != null)
				settings.setreceive_stories_emails(Float.parseFloat(json.get(UserSettings.RECEIVE_STORIES_EMAILSKEY).toString()));
			
			if (json.get(UserSettings.RECEIVE_SUCCESS_REMINDER_EMAILSKEY) != null)
				settings.setreceive_success_reminder_emails(Float.parseFloat(json.get(UserSettings.RECEIVE_SUCCESS_REMINDER_EMAILSKEY).toString()));
			
			if (json.get(UserSettings.RECEIVE_CONVERSATION_EMAILSKEY) != null)
				settings.setreceive_conversation_emails(Float.parseFloat(json.get(UserSettings.RECEIVE_CONVERSATION_EMAILSKEY).toString()));
			
			if (json.get(UserSettings.RECEIVE_EVENTS_EMAILSKEY) != null)
				settings.setreceive_events_emails(Float.parseFloat(json.get(UserSettings.RECEIVE_EVENTS_EMAILSKEY).toString()));
			
			if (json.get(UserSettings.COIKEY) != null) {
				if (json.get(UserSettings.COIKEY) instanceof JSONObject) {				
					JSONObject coiJson = (JSONObject) json.get(UserSettings.COIKEY);
					settings.setCOI(getLRUserSettingsCOI(coiJson));
				}				
			}
			
			if (json.get(UserSettings.NARROW_OPTOUTKEY) != null) {
				if (json.get(UserSettings.NARROW_OPTOUTKEY) instanceof JSONArray) {				
					JSONArray json_narrow_optout = (JSONArray) json.get(UserSettings.NARROW_OPTOUTKEY);
					settings.setNarrowOptout(getLRUserSettingsNarrowOptout(json_narrow_optout));
				}				
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
			logger.error("Exception: " + ex.getLocalizedMessage());
		}
		
		return settings;
	}
	
	
	// parse user.settings.coi
	public COI getLRUserSettingsCOI(JSONObject json) {
		COI coi = new COI();
		
		try {
			if (json.get(COI.STATUSKEY) != null)		
				coi.setStatus(json.get(COI.STATUSKEY).toString());		
			
			if (json.get(COI.COI_DATEKEY) != null)		
				coi.setCoiDate(Double.parseDouble(json.get(COI.COI_DATEKEY).toString()));
		}
		catch(Exception ex) {
			ex.printStackTrace();
			logger.error("Exception: " + ex.getLocalizedMessage());
		}
		
		return coi;
	}
	
	// parse user.settings.narrow_optout
	public ArrayList<NarrowOptout> getLRUserSettingsNarrowOptout(JSONArray json_narrow_optout) {
		ArrayList<NarrowOptout> arr = new ArrayList<NarrowOptout>();
		
		try {
			for (int i=0; i< json_narrow_optout.size(); i++) {
				JSONObject jsonObject = (JSONObject) json_narrow_optout.get(i);
				NarrowOptout narrow_optout = new NarrowOptout();
				
				if (jsonObject.get(NarrowOptout.CONTRACT_IDKEY) != null)
					narrow_optout.setContractId(Float.parseFloat(jsonObject.get(NarrowOptout.CONTRACT_IDKEY).toString()));
				
				if (jsonObject.get(NarrowOptout.CHALLENGE_IDKEY) != null)
					narrow_optout.setChallengeId(Float.parseFloat(jsonObject.get(NarrowOptout.CHALLENGE_IDKEY).toString()));			
	
				if (jsonObject.get(NarrowOptout.OPTOUT_DATEKEY) != null)
					narrow_optout.setOptoutDate(Double.parseDouble(jsonObject.get(NarrowOptout.OPTOUT_DATEKEY).toString()));
				
				arr.add(narrow_optout);
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
			logger.error("Exception: " + ex.getLocalizedMessage());
		}
		
		return arr;
	}
	
	// parse userflag collection
	@SuppressWarnings("unchecked")
	public ArrayList<UserFlag> getLRUserFlag(JSONObject object) {
		ArrayList<UserFlag> arr = new ArrayList<UserFlag>();
		
		try {
			// get "userflag" collection from JSON
			if (object.get(Processing.USERFLAGCOLLECTIONNAME) != null) {
				JSONArray collection = (JSONArray) object.get(Processing.USERFLAGCOLLECTIONNAME);
				
				for (int i=0;i<collection.size();i++) {
					JSONObject obj = (JSONObject) collection.get(i);
					
					Set<String> set = obj.keySet();
					Iterator<String> iterator = set.iterator();
					
					// UserFlag class
					UserFlag uf = new UserFlag();
					
					while (iterator.hasNext()) {
						String key = iterator.next();
						
						// userflag._id 
						if (key.equals(UserFlag.IDKEY)) {
							if (obj.get(key) instanceof JSONObject) {				
								JSONObject id = (JSONObject) obj.get(key);
								uf.setID(getLRId(id));
							}
						}
						// userflag._type
						else if (key.equals(UserFlag._TYPEKEY)) {
							if (obj.get(key) instanceof JSONArray) {				
								JSONArray arrType = (JSONArray) obj.get(key);
								ArrayList<String> _type = new ArrayList<String>();
								
								for (int j=0;j<arrType.size();j++) {						
									if (arrType.get(j) != null)						
										_type.add(new String(arrType.get(j).toString()));
								}
								
								uf.setType(_type);
							}				
						}
						else {
							switch (key) {
								case UserFlag.USER_IDKEY : {
									if (obj.get(key) != null) {
										uf.setuser_id(obj.get(key).toString());
									}
									break;
								}
								case UserFlag.TYPEKEY : {
									if (obj.get(key) != null) {
										uf.settype(obj.get(key).toString());
									}
									break;
								}					
								case UserFlag.CREATEDKEY : {
									if (obj.get(key) != null) {
										uf.setCreated(Double.parseDouble(obj.get(key).toString()));
									}
									break;
								}	
							} // end switch	
						} // end if
						
					} // end while
					
					// add to array
					arr.add(uf);
					
				} // end for
			
			} // end if check for null
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
			logger.error("Exception: " + ex.getLocalizedMessage());
		}
		
		return arr;
	}
	
	// parse user_quiz collection
	@SuppressWarnings("unchecked")
	public ArrayList<UserQuiz> getLRUserQuiz(JSONObject object) {
		ArrayList<UserQuiz> arr = new ArrayList<UserQuiz>();
		
		try {
			// get "user_quiz" collection from JSON
			if (object.get(Processing.USER_QUIZCOLLECTIONNAME) != null) {
				JSONArray collection = (JSONArray) object.get(Processing.USER_QUIZCOLLECTIONNAME);
				
				for (int i=0;i<collection.size();i++) {
					JSONObject obj = (JSONObject) collection.get(i);
					
					Set<String> set = obj.keySet();
					Iterator<String> iterator = set.iterator();
					
					// UserQuiz class
					UserQuiz uq = new UserQuiz();
					
					while (iterator.hasNext()) {
						String key = iterator.next();
						
						// user_quiz._id 
						if (key.equals(UserQuiz.IDKEY)) {
							if (obj.get(key) instanceof JSONObject) {				
								JSONObject id = (JSONObject) obj.get(key);
								uq.setID(getLRId(id));
							}
						}
						// user_quiz._type
						else if (key.equals(UserQuiz._TYPEKEY)) {
							if (obj.get(key) instanceof JSONArray) {				
								JSONArray arrType = (JSONArray) obj.get(key);
								ArrayList<String> _type = new ArrayList<String>();
								
								for (int j=0;j<arrType.size();j++) {						
									if (arrType.get(j) != null)						
										_type.add(new String(arrType.get(j).toString()));
								}
								
								uq.setType(_type);
							}				
						}
						// user_quiz.from_flags
						else if (key.equals(UserQuiz.FROM_FLAGSKEY)) {
							if (obj.get(key) instanceof JSONObject) {				
								JSONObject from_flag = (JSONObject) obj.get(key);
								
								// user_quiz.from_flags.user_challenge_id
								if (from_flag.get(UserQuiz.FROM_FLAGS_USER_CHALLENGE_IDKEY) != null)
									uq.setFrom_flags_user_challenge_id(from_flag.get(UserQuiz.FROM_FLAGS_USER_CHALLENGE_IDKEY).toString());
	
								// user_quiz.from_flags.challenge_nid							
								if (from_flag.get(UserQuiz.FROM_FLAGS_CHALLENGE_NIDKEY) != null)
									uq.setFrom_flags_challenge_nid(Integer.parseInt(from_flag.get(UserQuiz.FROM_FLAGS_CHALLENGE_NIDKEY).toString()));
								
								// user_quiz.from_flags.step_nid
								if (from_flag.get(UserQuiz.FROM_FLAGS_STEP_NIDKEY) != null)
									uq.setFrom_flags_step_nid(Integer.parseInt(from_flag.get(UserQuiz.FROM_FLAGS_STEP_NIDKEY).toString()));
								
								// user_quiz.from_flags.activity_nid							
								if (from_flag.get(UserQuiz.FROM_FLAGS_ACTIVITY_NIDKEY) != null)
									uq.setFrom_flags_activity_nid(Integer.parseInt(from_flag.get(UserQuiz.FROM_FLAGS_ACTIVITY_NIDKEY).toString()));
							}			
						}	
						// user_quiz.answers
						else if (key.equals(UserQuiz.ANSWERSKEY)) {
							if (obj.get(UserQuiz.ANSWERSKEY) != null)  {
								JSONArray answers = (JSONArray) obj.get(UserQuiz.ANSWERSKEY);
								uq.setAnswers(getLRUserQuizAnswers(answers));
							}
						}
						else {
							switch (key) {
								case UserQuiz.USER_IDKEY : {
									if (obj.get(key) != null) {
										uq.setUserId(obj.get(key).toString());
									}
									break;
								}
								case UserQuiz.QUIZ_IDKEY : {
									if (obj.get(key) != null) {
										if (NumberUtils.isNumber(obj.get(key).toString()))
											uq.setQuizId(Long.parseLong(obj.get(key).toString()));
									}
									break;
								}					
								case UserQuiz.USER_SCOREKEY : {
									if (obj.get(key) != null) {
										if (NumberUtils.isNumber(obj.get(key).toString()))
											uq.setUserScore(Integer.parseInt(obj.get(key).toString()));
									}
									break;
								}	
								case UserQuiz.CREATEDKEY : {
									if (obj.get(key) != null) {
										if (NumberUtils.isNumber(obj.get(key).toString()))
											uq.setCreated(Double.parseDouble(obj.get(key).toString()));
									}
									break;
								}		
							} // end switch	
						} // end if
						
					} // end while
					
					// add to array
					arr.add(uq);
					
				} // end for
				
			} // end if			
		}
		catch(Exception ex) {
			ex.printStackTrace();
			logger.error("Exception: " + ex.getLocalizedMessage());
		}
		
		return arr;
	}
	
	// get user_quiz.answers
	public ArrayList<Answers> getLRUserQuizAnswers(JSONArray answers) {
		ArrayList<Answers> arr = new ArrayList<Answers>();
		
		try {
			for (int i=0;i<answers.size();i++) {
				JSONObject object = (JSONObject) answers.get(i);
				Answers answer = new Answers();
				
				// answer
				if (object.get(Answers.ANSWERKEY) != null)
					answer.setAnswer(object.get(Answers.ANSWERKEY).toString());
				
				// complete
				if (object.get(Answers.COMPLETEKEY) != null)
					answer.setComplete(object.get(Answers.COMPLETEKEY).toString().equals("true"));

				// points
				if (object.get(Answers.POINTSKEY) != null)
					answer.setPoints(Integer.parseInt(object.get(Answers.POINTSKEY).toString()));
				
				// offset
				if (object.get(Answers.OFFSETKEY) != null)
					answer.setOffset(Float.parseFloat(object.get(Answers.OFFSETKEY).toString()));				
				
				// created
				if (object.get(Answers.CREATEDKEY) != null)
					answer.setCreated(Double.parseDouble(object.get(Answers.CREATEDKEY).toString()));				
				
				arr.add(answer);
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
			logger.error("Exception: " + ex.getLocalizedMessage());
		}		
		
		return arr;
	}
	
	// get file collection
	@SuppressWarnings("unchecked")
	public ArrayList<LRFile> getLRFile(JSONObject object) {
		ArrayList<LRFile> arr = new ArrayList<LRFile>();
		
		try {
			// get "file" collection from JSON
			if (object.get(Processing.FILECOLLECTIONNAME) != null) {
				JSONArray collection = (JSONArray) object.get(Processing.FILECOLLECTIONNAME);
				
				for (int i=0;i<collection.size();i++) {
					JSONObject obj = (JSONObject) collection.get(i);
					
					Set<String> set = obj.keySet();
					Iterator<String> iterator = set.iterator();
					
					// LRFile class
					LRFile f = new LRFile();
					
					while (iterator.hasNext()) {
						String key = iterator.next();
						
						// file._id 
						if (key.equals(LRFile.IDKEY)) {
							if (obj.get(key) instanceof JSONObject) {				
								JSONObject id = (JSONObject) obj.get(key);
								f.setID(getLRId(id));
							}
						}
						// file._type
						else if (key.equals(LRFile._TYPEKEY)) {
							if (obj.get(key) instanceof JSONArray) {				
								JSONArray arrType = (JSONArray) obj.get(key);
								ArrayList<String> _type = new ArrayList<String>();
								
								for (int j=0;j<arrType.size();j++) {						
									if (arrType.get(j) != null)						
										_type.add(new String(arrType.get(j).toString()));
								}
								
								f.setType(_type);
							}				
						}	
						else {
							switch (key) {
								case LRFile.USER_IDKEY : {
									if (obj.get(key) != null) {
										f.setuser_id(obj.get(key).toString());
									}
									break;
								}
								case LRFile.MIMEKEY : {
									if (obj.get(key) != null) {
										f.setMime(obj.get(key).toString());
									}
									break;
								}					
								case LRFile.SIZEKEY : {
									if (obj.get(key) != null) {
										f.setSize(Integer.parseInt(obj.get(key).toString()));
									}
									break;
								}	
								case LRFile.NAMEKEY : {
									if (obj.get(key) != null) {
										f.setName(obj.get(key).toString());
									}
									break;
								}		
								case LRFile.EXTENSIONKEY : {
									if (obj.get(key) != null) {
										f.setExtension(obj.get(key).toString());
									}
									break;
								}	
								case LRFile.CONTENTKEY : {
									if (obj.get(key) != null) {
										f.setContent(obj.get(key).toString());
									}
									break;
								}								
								case UserQuiz.CREATEDKEY : {
									if (obj.get(key) != null) {
										f.setCreated(Double.parseDouble(obj.get(key).toString()));
									}
									break;
								}		
							} // end switch	
						} // end if
						
					} // end while
					
					// add to array
					arr.add(f);
					
				} // end for
				
			} // end if
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
			logger.error("Exception: " + ex.getLocalizedMessage());
		}
		
		return arr;
	}
	
	// get user_login collection
	@SuppressWarnings("unchecked")
	public ArrayList<UserLogin> getLRUserLogin(JSONObject object) {
		ArrayList<UserLogin> arr = new ArrayList<UserLogin>();
		
		try {
			// get "user_login" collection from JSON
			if (object.get(Processing.USER_LOGINCOLLECTIONNAME) != null) {
				JSONArray collection = (JSONArray) object.get(Processing.USER_LOGINCOLLECTIONNAME);
				
				for (int i=0;i<collection.size();i++) {
					JSONObject obj = (JSONObject) collection.get(i);
					
					Set<String> set = obj.keySet();
					Iterator<String> iterator = set.iterator();
					
					// UserLogin class
					UserLogin userLogin = new UserLogin();
					
					while (iterator.hasNext()) {
						String key = iterator.next();
						
						// user_login._id 
						if (key.equals(UserLogin.IDKEY)) {
							if (obj.get(key) instanceof JSONObject) {				
								JSONObject id = (JSONObject) obj.get(key);
								userLogin.setId(getLRId(id));
							}
						}
						// user_login._type
						else if (key.equals(UserLogin._TYPEKEY)) {
							if (obj.get(key) instanceof JSONArray) {				
								JSONArray arrType = (JSONArray) obj.get(key);
								ArrayList<String> _type = new ArrayList<String>();
								
								for (int j=0;j<arrType.size();j++) {						
									if (arrType.get(j) != null)						
										_type.add(new String(arrType.get(j).toString()));
								}
								
								userLogin.set_type(_type);
							}				
						}	
						// user_login.geo_hash
						else if (key.equals(UserLogin.GEO_HASHKEY)) {
							if (obj.get(key) instanceof JSONObject) {				
								JSONObject geoHashJson = (JSONObject) obj.get(key);
								setUserLoginGeoHash(geoHashJson, userLogin);
							}
						}
						else {
							switch (key) {
								case UserLogin.EMAILKEY : {
									if (obj.get(key) != null) {
										userLogin.setEmail(obj.get(key).toString());
									}
									break;
								}
								case UserLogin.IPKEY : {
									if (obj.get(key) != null) {
										userLogin.setIp(obj.get(key).toString());
									}
									break;
								}					
								case UserLogin.TIMESTAMPKEY : {
									if (obj.get(key) != null) {
										userLogin.setTimestamp(Double.parseDouble(obj.get(key).toString()));
									}
									break;
								}	
								case UserLogin.USER_IDKEY : {
									if (obj.get(key) != null) {
										userLogin.setUser_id(obj.get(key).toString());
									}
									break;
								}
								case UserQuiz.CREATEDKEY : {
									if (obj.get(key) != null) {
										userLogin.setCreated(Double.parseDouble(obj.get(key).toString()));
									}
									break;
								}		
							} // end switch	
						} // end if
						
					} // end while
					
					// add to array
					arr.add(userLogin);
					
				} // end for
				
			} // end if			
		}
		catch(Exception ex) {
			ex.printStackTrace();
			logger.error("Exception: " + ex.getLocalizedMessage());
		}
		
		return arr;
	}
	
	// parse user_login.geo_hash	
	public void setUserLoginGeoHash(JSONObject jsonObject, UserLogin userLogin) {		
		
		try {
			// user_login.geo_hash.success
			if (jsonObject.get(UserLogin.SUCCESSKEY) != null)
				userLogin.setSuccess(jsonObject.get(UserLogin.SUCCESSKEY).toString().equals("true"));
			
			// user_login.geo_hash.remaining_lookups
			if (jsonObject.get(UserLogin.REMAINING_LOOKUPSKEY) != null)
				userLogin.setRemaining_lookups(Long.parseLong(jsonObject.get(UserLogin.REMAINING_LOOKUPSKEY).toString()));
			
			// user_login.geo_hash.ip_info
			if (jsonObject.get(UserLogin.IP_INFOKEY) != null) {
				if (jsonObject.get(UserLogin.IP_INFOKEY) instanceof JSONObject) {				
					JSONObject ip_info = (JSONObject) jsonObject.get(UserLogin.IP_INFOKEY);
					
					// user_login.geo_hash.ip_info.continent_code
					if (ip_info.get(UserLogin.IP_INFO_CONTINENT_CODEKEY) != null) 
						userLogin.setIp_info_continent_code(ip_info.get(UserLogin.IP_INFO_CONTINENT_CODEKEY).toString());
					
					// user_login.geo_hash.ip_info.country_code
					if (ip_info.get(UserLogin.IP_INFO_COUNTRY_CODEKEY) != null) 
						userLogin.setIp_info_country_code(ip_info.get(UserLogin.IP_INFO_COUNTRY_CODEKEY).toString());					

					// user_login.geo_hash.ip_info.country_code3
					if (ip_info.get(UserLogin.IP_INFO_COUNTRY_CODE3KEY) != null) 
						userLogin.setIp_info_country_code3(ip_info.get(UserLogin.IP_INFO_COUNTRY_CODE3KEY).toString());					

					// user_login.geo_hash.ip_info.country_name
					if (ip_info.get(UserLogin.IP_INFO_COUNTRY_NAMEKEY) != null) 
						userLogin.setIp_info_country_name(ip_info.get(UserLogin.IP_INFO_COUNTRY_NAMEKEY).toString());

					// user_login.geo_hash.ip_info.region
					if (ip_info.get(UserLogin.IP_INFO_REGIONKEY) != null) 
						userLogin.setIp_info_region(ip_info.get(UserLogin.IP_INFO_REGIONKEY).toString());	
					
					// user_login.geo_hash.ip_info.city
					if (ip_info.get(UserLogin.IP_INFO_CITYKEY) != null) 
						userLogin.setIp_info_city(ip_info.get(UserLogin.IP_INFO_CITYKEY).toString());
					
					// user_login.geo_hash.ip_info.postal_code
					if (ip_info.get(UserLogin.IP_INFO_POSTAL_CODEKEY) != null) 
						userLogin.setIp_info_postal_code(ip_info.get(UserLogin.IP_INFO_POSTAL_CODEKEY).toString());
					
					// user_login.geo_hash.ip_info.latitude
					if (ip_info.get(UserLogin.IP_INFO_LATITUDEKEY) != null) 
						userLogin.setIp_info_latitude(Float.parseFloat(ip_info.get(UserLogin.IP_INFO_LATITUDEKEY).toString()));
					
					// user_login.geo_hash.ip_info.longitude
					if (ip_info.get(UserLogin.IP_INFO_LONGITUDEKEY) != null) 
						userLogin.setIp_info_longitude(Float.parseFloat(ip_info.get(UserLogin.IP_INFO_LONGITUDEKEY).toString()));

					// user_login.geo_hash.ip_info.dma_code
					if (ip_info.get(UserLogin.IP_INFO_DMA_CODEKEY) != null) 
						userLogin.setIp_info_dma_code(Integer.parseInt(ip_info.get(UserLogin.IP_INFO_DMA_CODEKEY).toString()));
					
					// user_login.geo_hash.ip_info.area_code
					if (ip_info.get(UserLogin.IP_INFO_AREA_CODEKEY) != null) 
						userLogin.setIp_info_area_code(Integer.parseInt(ip_info.get(UserLogin.IP_INFO_AREA_CODEKEY).toString()));
					
					// user_login.geo_hash.ip_info.timezone
					if (ip_info.get(UserLogin.IP_INFO_TIMEZONEKEY) != null) 
						userLogin.setIp_info_timezone(ip_info.get(UserLogin.IP_INFO_TIMEZONEKEY).toString());
					
					// user_login.geo_hash.ip_info.lookup_address
					if (ip_info.get(UserLogin.IP_INFO_LOOKUP_ADDRESSKEY) != null) 
						userLogin.setIp_info_lookup_address(ip_info.get(UserLogin.IP_INFO_LOOKUP_ADDRESSKEY).toString());
				}
			}
				
			// user_login.geo_hash.nearest_postal_code_info
			if (jsonObject.get(UserLogin.NEAREST_POSTAL_CODE_INFOKEY) != null) {
				if (jsonObject.get(UserLogin.NEAREST_POSTAL_CODE_INFOKEY) instanceof JSONObject) {				
					JSONObject nearest_postal_code_info = (JSONObject) jsonObject.get(UserLogin.NEAREST_POSTAL_CODE_INFOKEY);
					
					// user_login.geo_hash.nearest_postal_code_info.id
					if (nearest_postal_code_info.get(UserLogin.NEAREST_POSTAL_CODE_INFO_IDKEY) != null) 
						userLogin.setNearest_postal_code_info_id(nearest_postal_code_info.get(UserLogin.NEAREST_POSTAL_CODE_INFO_IDKEY).toString());
					
					// user_login.geo_hash.nearest_postal_code_info.coords
					if (nearest_postal_code_info.get(UserLogin.NEAREST_POSTAL_CODE_INFO_COORDSKEY) != null) 
						userLogin.setNearest_postal_code_info_coords(nearest_postal_code_info.get(UserLogin.NEAREST_POSTAL_CODE_INFO_COORDSKEY).toString());

					// user_login.geo_hash.nearest_postal_code_info.country_code
					if (nearest_postal_code_info.get(UserLogin.NEAREST_POSTAL_CODE_INFO_COUNTRY_CODEKEY) != null) 
						userLogin.setNearest_postal_code_info_country_code(nearest_postal_code_info.get(UserLogin.NEAREST_POSTAL_CODE_INFO_COUNTRY_CODEKEY).toString());

					// user_login.geo_hash.nearest_postal_code_info.country_name
					if (nearest_postal_code_info.get(UserLogin.NEAREST_POSTAL_CODE_INFO_COUNTRY_NAMEKEY) != null) 
						userLogin.setNearest_postal_code_info_country_name(nearest_postal_code_info.get(UserLogin.NEAREST_POSTAL_CODE_INFO_COUNTRY_NAMEKEY).toString());

					// user_login.geo_hash.nearest_postal_code_info.postal_code
					if (nearest_postal_code_info.get(UserLogin.NEAREST_POSTAL_CODE_INFO_POSTAL_CODEKEY) != null) 
						userLogin.setNearest_postal_code_info_postal_code(nearest_postal_code_info.get(UserLogin.NEAREST_POSTAL_CODE_INFO_POSTAL_CODEKEY).toString());
					
					// user_login.geo_hash.nearest_postal_code_info.place_name
					if (nearest_postal_code_info.get(UserLogin.NEAREST_POSTAL_CODE_INFO_PLACE_NAMEKEY) != null) 
						userLogin.setNearest_postal_code_info_place_name(nearest_postal_code_info.get(UserLogin.NEAREST_POSTAL_CODE_INFO_PLACE_NAMEKEY).toString());
					
					// user_login.geo_hash.nearest_postal_code_info.state
					if (nearest_postal_code_info.get(UserLogin.NEAREST_POSTAL_CODE_INFO_PLACE_STATEKEY) != null) 
						userLogin.setNearest_postal_code_info_state(nearest_postal_code_info.get(UserLogin.NEAREST_POSTAL_CODE_INFO_PLACE_STATEKEY).toString());
					
					// user_login.geo_hash.nearest_postal_code_info.province
					if (nearest_postal_code_info.get(UserLogin.NEAREST_POSTAL_CODE_INFO_PROVINCEKEY) != null) 
						userLogin.setNearest_postal_code_info_province(nearest_postal_code_info.get(UserLogin.NEAREST_POSTAL_CODE_INFO_PROVINCEKEY).toString());
					
					// user_login.geo_hash.nearest_postal_code_info.community
					if (nearest_postal_code_info.get(UserLogin.NEAREST_POSTAL_CODE_INFO_COMMUNITYKEY) != null) 
						userLogin.setNearest_postal_code_info_community(nearest_postal_code_info.get(UserLogin.NEAREST_POSTAL_CODE_INFO_COMMUNITYKEY).toString());
					
					// user_login.geo_hash.nearest_postal_code_info.distance
					if (nearest_postal_code_info.get(UserLogin.NEAREST_POSTAL_CODE_INFO_DISTANCEKEY) != null) 
						userLogin.setNearest_postal_code_info_distance(Float.parseFloat(nearest_postal_code_info.get(UserLogin.NEAREST_POSTAL_CODE_INFO_DISTANCEKEY).toString()));
				}
				
			}				
		}
		catch(Exception ex) {
			ex.printStackTrace();
			logger.error("Exception: " + ex.getLocalizedMessage());
		}
	}
	
	// parse linkedin_work_history
	@SuppressWarnings("unchecked")
	public ArrayList<LinkedinWorkHistory> getLinkedin_Work_History(JSONObject object) {
		ArrayList<LinkedinWorkHistory> arr = new ArrayList<LinkedinWorkHistory>();
		
		try {
			// get "linkedin_work_history" collection from JSON
			if (object.get(Processing.LINKEDIN_WORK_HISTORYCOLLECTIONNAME) != null) {
				JSONArray collection = (JSONArray) object.get(Processing.LINKEDIN_WORK_HISTORYCOLLECTIONNAME);
				
				for (int i=0;i<collection.size();i++) {
					JSONObject obj = (JSONObject) collection.get(i);
					
					Set<String> set = obj.keySet();
					Iterator<String> iterator = set.iterator();
					
					// LinkedinWorkHistory class
					LinkedinWorkHistory lwh = new LinkedinWorkHistory();
					
					while (iterator.hasNext()) {
						String key = iterator.next();
						
						// linkedin_work_history._id 
						if (key.equals(LinkedinWorkHistory.IDKEY)) {
							if (obj.get(key) instanceof JSONObject) {				
								JSONObject id = (JSONObject) obj.get(key);
								lwh.setID(getLRId(id));
							}
						}
						// linkedin_work_history._type
						else if (key.equals(LinkedinWorkHistory._TYPEKEY)) {
							if (obj.get(key) instanceof JSONArray) {				
								JSONArray arrType = (JSONArray) obj.get(key);
								ArrayList<String> _type = new ArrayList<String>();
								
								for (int j=0;j<arrType.size();j++) {						
									if (arrType.get(j) != null)						
										_type.add(new String(arrType.get(j).toString()));
								}
								
								lwh.setType(_type);
							}				
						}	
						// linkedin_work_history.positions
						else if (key.equals(LinkedinWorkHistory.POSITIONSKEY)) {
							if (obj.get(key) instanceof JSONObject) {				
								JSONObject positions = (JSONObject) obj.get(key);
								
								// linkedin_work_history.positions._total
								if (positions.get(LinkedinWorkHistory.POSITIONS_TOTALKEY) != null) {
									lwh.set_total(Integer.parseInt(positions.get(LinkedinWorkHistory.POSITIONS_TOTALKEY).toString()));
								}							
								
								// posistions
								lwh.setPositions(getLinkedin_Work_History_Positions(positions));
							}
						}
						else {
							switch (key) {
								case LinkedinWorkHistory.USER_IDKEY : {
									if (obj.get(key) != null) {
										lwh.setUser_id(obj.get(key).toString());
									}
									break;
								}
								case LinkedinWorkHistory.CREATEDKEY : {
									if (obj.get(key) != null) {
										lwh.setCreated(Double.parseDouble(obj.get(key).toString()));
									}
									break;
								}		
								case LinkedinWorkHistory.EMAILADDRESSKEY : {
									if (obj.get(key) != null) {
										lwh.setEmailAddress(obj.get(key).toString());
									}
									break;
								}	
								case LinkedinWorkHistory.FIRSTNAMEKEY : {
									if (obj.get(key) != null) {
										lwh.setFirstName(obj.get(key).toString());
									}
									break;
								}		
								case LinkedinWorkHistory.IDFIELDKEY : {
									if (obj.get(key) != null) {
										lwh.setIdField(obj.get(key).toString());
									}
									break;
								}		
								case LinkedinWorkHistory.LASTNAMEKEY : {
									if (obj.get(key) != null) {
										lwh.setLastName(obj.get(key).toString());
									}
									break;
								}
								case LinkedinWorkHistory.PICTUREURLKEY : {
									if (obj.get(key) != null) {
										lwh.setPictureUrl(obj.get(key).toString());
									}
									break;
								}
							} // end switch	
						} // end if
						
					} // end while
					
					// add to array
					arr.add(lwh);
					
				} // end for
				
			} // end if			
		}
		catch(Exception ex) {
			ex.printStackTrace();
			logger.error("Exception: " + ex.getLocalizedMessage());
		}
		
		return arr;
	}
	
	// parse linkedin_work_history.positions
	public ArrayList<LinkedinWorkHistoryPosition> getLinkedin_Work_History_Positions(JSONObject positions) {
		ArrayList<LinkedinWorkHistoryPosition> arr = new ArrayList<LinkedinWorkHistoryPosition>();
		
		try {
			
			if (positions.get(LinkedinWorkHistoryPosition.POSITIONS_VALUESKEY) != null ) {
				// get linkedin_work_history.positions.values
				JSONArray values = (JSONArray) positions.get(LinkedinWorkHistoryPosition.POSITIONS_VALUESKEY);
				
				for (int i=0;i<values.size();i++) {
					JSONObject object = (JSONObject) values.get(i);
					LinkedinWorkHistoryPosition value = new LinkedinWorkHistoryPosition();
					
					// linkedin_work_history.positions.values.id
					if (object.get(LinkedinWorkHistoryPosition.POSITIONS_VALUES_IDKEY) != null)
						value.setIdField(Long.parseLong(object.get(LinkedinWorkHistoryPosition.POSITIONS_VALUES_IDKEY).toString()));
					
					// linkedin_work_history.positions.values.isCurrent
					if (object.get(LinkedinWorkHistoryPosition.POSITIONS_VALUES_ISCURRENTKEY) != null)
						value.setCurrent(object.get(LinkedinWorkHistoryPosition.POSITIONS_VALUES_ISCURRENTKEY).toString().equals("true"));
					
					// linkedin_work_history.positions.values.title
					if (object.get(LinkedinWorkHistoryPosition.POSITIONS_VALUES_TITLEKEY) != null)
						value.setTitle(object.get(LinkedinWorkHistoryPosition.POSITIONS_VALUES_TITLEKEY).toString());			
					
					// linkedin_work_history.positions.values.summary
					if (object.get(LinkedinWorkHistoryPosition.POSITIONS_VALUES_SUMMARYKEY) != null)
						value.setSummary(object.get(LinkedinWorkHistoryPosition.POSITIONS_VALUES_SUMMARYKEY).toString());			
					
					// linkedin_work_history.positions.values.created
					if (object.get(LinkedinWorkHistoryPosition.POSITIONS_VALUES_CREATEDKEY) != null)
						value.setCreated(Double.parseDouble(object.get(LinkedinWorkHistoryPosition.POSITIONS_VALUES_CREATEDKEY).toString()));	
					
					// linkedin_work_history.positions.values.company				
					if (object.get(LinkedinWorkHistoryPosition.POSITIONS_VALUES_COMPANYKEY) != null) {
						if (object.get(LinkedinWorkHistoryPosition.POSITIONS_VALUES_COMPANYKEY) instanceof JSONObject) {						
							JSONObject company = (JSONObject) object.get(LinkedinWorkHistoryPosition.POSITIONS_VALUES_COMPANYKEY);
							
							// company.id
							if (company.get(LinkedinWorkHistoryPosition.POSITIONS_VALUES_COMPANY_IDKEY) != null)
								value.setCompanyId(Integer.parseInt(company.get(LinkedinWorkHistoryPosition.POSITIONS_VALUES_COMPANY_IDKEY).toString()));
							
							// company.name
							if (company.get(LinkedinWorkHistoryPosition.POSITIONS_VALUES_COMPANY_NAMEKEY) != null)
								value.setCompanyName(company.get(LinkedinWorkHistoryPosition.POSITIONS_VALUES_COMPANY_NAMEKEY).toString());						
						}
					}
					
					// linkedin_work_history.positions.values.startDate				
					if (object.get(LinkedinWorkHistoryPosition.POSITIONS_VALUES_STARTDATEKEY) != null) {
						if (object.get(LinkedinWorkHistoryPosition.POSITIONS_VALUES_STARTDATEKEY) instanceof JSONObject) {						
							JSONObject startDate = (JSONObject) object.get(LinkedinWorkHistoryPosition.POSITIONS_VALUES_STARTDATEKEY);
							
							// startDate.month
							if (startDate.get(LinkedinWorkHistoryPosition.POSITIONS_VALUES_STARTDATE_MMKEY) != null)
								value.setStartDateMM(Integer.parseInt(startDate.get(LinkedinWorkHistoryPosition.POSITIONS_VALUES_STARTDATE_MMKEY).toString()));
							
							// startDate.year
							if (startDate.get(LinkedinWorkHistoryPosition.POSITIONS_VALUES_STARTDATE_YYKEY) != null)
								value.setStartDateYY(Integer.parseInt(startDate.get(LinkedinWorkHistoryPosition.POSITIONS_VALUES_STARTDATE_YYKEY).toString()));						
						}
					}				
					
					// linkedin_work_history.positions.values.endDate				
					if (object.get(LinkedinWorkHistoryPosition.POSITIONS_VALUES_ENDDATEKEY) != null) {
						if (object.get(LinkedinWorkHistoryPosition.POSITIONS_VALUES_ENDDATEKEY) instanceof JSONObject) {						
							JSONObject endDate = (JSONObject) object.get(LinkedinWorkHistoryPosition.POSITIONS_VALUES_ENDDATEKEY);
							
							// endDate.month
							if (endDate.get(LinkedinWorkHistoryPosition.POSITIONS_VALUES_ENDDATE_MMKEY) != null)
								value.setEndDateMM(Integer.parseInt(endDate.get(LinkedinWorkHistoryPosition.POSITIONS_VALUES_ENDDATE_MMKEY).toString()));
							
							// endDate.year
							if (endDate.get(LinkedinWorkHistoryPosition.POSITIONS_VALUES_STARTDATE_YYKEY) != null)
								value.setEndDateYY(Integer.parseInt(endDate.get(LinkedinWorkHistoryPosition.POSITIONS_VALUES_ENDDATE_YYKEY).toString()));						
						}
					}					
					
					arr.add(value);
				}
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
			logger.error("Exception: " + ex.getLocalizedMessage());
		}		
		
		return arr;
	}
	
	// parse user_profile
	@SuppressWarnings("unchecked")
	public ArrayList<UserProfile> getUserProfile(JSONObject object) {
		ArrayList<UserProfile> arr = new ArrayList<UserProfile>();
		
		try {
			// get "user_profile" collection from JSON
			if (object.get(Processing.USER_PROFILECOLLECTIONNAME) != null) {
				JSONArray collection = (JSONArray) object.get(Processing.USER_PROFILECOLLECTIONNAME);
				
				for (int i=0;i<collection.size();i++) {
					JSONObject obj = (JSONObject) collection.get(i);
					
					Set<String> set = obj.keySet();
					Iterator<String> iterator = set.iterator();
					
					// UserProfile class
					UserProfile profile = new UserProfile();
					
					while (iterator.hasNext()) {
						String key = iterator.next();
						
						// user_profile._id 
						if (key.equals(UserProfile.IDKEY)) {
							if (obj.get(key) instanceof JSONObject) {				
								JSONObject id = (JSONObject) obj.get(key);
								profile.setId(getLRId(id));
							}
						}
						// user_profile._type
						else if (key.equals(UserProfile._TYPEKEY)) {
							if (obj.get(key) instanceof JSONArray) {				
								JSONArray arrType = (JSONArray) obj.get(key);
								ArrayList<String> _type = new ArrayList<String>();
								
								for (int j=0;j<arrType.size();j++) {						
									if (arrType.get(j) != null)						
										_type.add(new String(arrType.get(j).toString()));
								}
								
								profile.set_type(_type);
							}				
						}	
						// user_profile.picture
						else if (key.equals(UserProfile.PICTUREKEY)) {
							if (obj.get(key) instanceof JSONObject) {				
								JSONObject picture = (JSONObject) obj.get(key);
								
								// picture.path
								if (picture.get(UserProfile.PICTURE_PATHKEY) != null) {
									profile.setPicture_path(picture.get(UserProfile.PICTURE_PATHKEY).toString());
								}
								
								// picture.content
								if (picture.get(UserProfile.PICTURE_CONTENTKEY) != null) {
									profile.setPicture_content(picture.get(UserProfile.PICTURE_CONTENTKEY).toString());
								}
								
								// picture.download
								if (picture.get(UserProfile.PICTURE_DOWNLOADKEY) != null) {
									profile.setPicture_download(picture.get(UserProfile.PICTURE_DOWNLOADKEY).toString());
								}
								
								// picture.picture_id
								if (picture.get(UserProfile.PICTURE_PICTURE_IDKEY) != null) {
									profile.setPicture_picture_id(picture.get(UserProfile.PICTURE_PICTURE_IDKEY).toString());
								}
								
								// picture.full
								if (picture.get(UserProfile.PICTURE_FULLKEY) != null) {
									profile.setPicture_full(picture.get(UserProfile.PICTURE_FULLKEY).toString());
								}
							}
						}
						else {
							switch (key) {
								case UserProfile.USER_IDKEY : {
									if (obj.get(key) != null) {
										profile.setUser_id(obj.get(key).toString());
									}
									break;
								}
								case UserProfile.CREATEDKEY : {
									if (obj.get(key) != null) {
										profile.setCreated(Double.parseDouble(obj.get(key).toString()));
									}
									break;
								}		
								case UserProfile.ISDEFAULTKEY : {
									if (obj.get(key) != null) {
										profile.setIsDefault(obj.get(key).toString().equals("true"));
									}
									break;
								}	
								case UserProfile.DEFAULT_TITLEKEY : {
									if (obj.get(key) != null) {
										profile.setDefault_title(obj.get(key).toString());
									}
									break;
								}		
								case UserProfile.DEFAULT_CITYKEY : {
									if (obj.get(key) != null) {
										profile.setDefault_city(obj.get(key).toString());
									}
									break;
								}		
								case UserProfile.DEFAULT_DESCRIPTIONKEY : {
									if (obj.get(key) != null) {
										profile.setDefault_description(obj.get(key).toString());
									}
									break;
								}
								case UserProfile.FIRSTNAMEKEY : {
									if (obj.get(key) != null) {
										profile.setFirstname(obj.get(key).toString());
									}
									break;
								}
								case UserProfile.LASTNAMEKEY : {
									if (obj.get(key) != null) {
										profile.setLastname(obj.get(key).toString());
									}
									break;
								}			
								case UserProfile.CHALLENGES_ACTIVEKEY : {
									if (obj.get(key) != null) {
										profile.setChallenges_active(Integer.parseInt(obj.get(key).toString()));
									}
									break;
								}							
								case UserProfile.CHALLENGES_COMPLETEDKEY : {
									if (obj.get(key) != null) {
										profile.setChallenges_completed(Integer.parseInt(obj.get(key).toString()));
									}
									break;
								}		
								case UserProfile.TITLEKEY : {
									if (obj.get(key) != null) {
										profile.setTitle(obj.get(key).toString());
									}
									break;
								}							
								case UserProfile.DESCRIPTIONKEY : {
									if (obj.get(key) != null) {
										profile.setDescription(obj.get(key).toString());
									}
									break;
								}		
								case UserProfile.CITYKEY : {
									if (obj.get(key) != null) {
										profile.setCity(obj.get(key).toString());
									}
									break;
								}	
								case UserProfile.UPDATEDKEY : {
									if (obj.get(key) != null) {
										profile.setUpdated(Double.parseDouble(obj.get(key).toString()));
									}
									break;
								}								
								case UserProfile.SHOWTITLEKEY : {
									if (obj.get(key) != null) {
										profile.setShowTitle(obj.get(key).toString().equals("true"));
									}
									break;
								}
								case UserProfile.SHOWBIOKEY : {
									if (obj.get(key) != null) {
										profile.setShowBio(obj.get(key).toString().equals("true"));
									}
									break;
								}	
								case UserProfile.SHOWCOVERKEY : {
									if (obj.get(key) != null) {
										profile.setShowCover(obj.get(key).toString().equals("true"));
									}
									break;
								}	
								case UserProfile.SHOWPICTUREKEY : {
									if (obj.get(key) != null) {
										profile.setShowPicture(obj.get(key).toString().equals("true"));
									}
									break;
								}	
								case UserProfile.SHOWPROGRAMSKEY : {
									if (obj.get(key) != null) {
										profile.setShowPrograms(obj.get(key).toString().equals("true"));
									}
									break;
								}								
							} // end switch	
						} // end if
						
					} // end while
					
					// add to array
					arr.add(profile);
					
				} // end for
				
			} // end if
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
			logger.error("Exception: " + ex.getLocalizedMessage());
		}
		
		return arr;
	}	
	
	// parse user_challenge collection
	@SuppressWarnings("unchecked")
	public ArrayList<UserChallenge> getUserChallenge(JSONObject object) {
		ArrayList<UserChallenge> arr = new ArrayList<UserChallenge>();
		
		try {
			// get "user_challenge" collection from JSON
			if (object.get(Processing.USER_CHALLENGECOLLECTIONNAME) != null) {
				JSONArray collection = (JSONArray) object.get(Processing.USER_CHALLENGECOLLECTIONNAME);
				
				for (int i=0;i<collection.size();i++) {
					JSONObject obj = (JSONObject) collection.get(i);
					
					Set<String> set = obj.keySet();
					Iterator<String> iterator = set.iterator();
					
					// UserChallenge class
					UserChallenge userChall = new UserChallenge();
					
					while (iterator.hasNext()) {
						String key = iterator.next();
						
						// user_challenge._id 
						if (key.equals(UserChallenge.IDKEY)) {
							if (obj.get(key) instanceof JSONObject) {				
								JSONObject id = (JSONObject) obj.get(key);
								userChall.setID(getLRId(id));
								//System.out.println(userChall.getID().getOid());
							}
						}
						// user_challenge._type
						else if (key.equals(UserChallenge._TYPEKEY)) {
							if (obj.get(key) instanceof JSONArray) {				
								JSONArray arrType = (JSONArray) obj.get(key);
								ArrayList<String> _type = new ArrayList<String>();
								
								for (int j=0;j<arrType.size();j++) {						
									if (arrType.get(j) != null)						
										_type.add(new String(arrType.get(j).toString()));
								}
								
								userChall.setType(_type);
							}				
						}
						// user_challenge.complete_status
						else if (key.equals(UserChallenge.COMPLETE_STATUSKEY)) {
							if (obj.get(UserChallenge.COMPLETE_STATUSKEY) != null)  {
								
								// user_challenge.complete_status object
								UserChallengeCompleteStatus usrCompSts = new UserChallengeCompleteStatus();
								
								// get JSON object
								JSONObject complete_status = (JSONObject) obj.get(UserChallenge.COMPLETE_STATUSKEY);							
								
								// parse complete_status.step
								parseCollectionStep(usrCompSts, complete_status);	
								
								userChall.setCompleteStatus(usrCompSts);
							}
						}
						else {
							switch (key) {
								case UserChallenge.CHALLENGE_IDKEY : {
									if (obj.get(key) != null) {
										userChall.setChallengeId(Integer.parseInt(obj.get(key).toString()));
									}
									break;
								}
								case UserChallenge.USER_IDKEY : {
									if (obj.get(key) != null) {
										userChall.setUserId(obj.get(key).toString());
									}
									break;
								}					
								case UserChallenge.STARTDATEKEY : {
									if (obj.get(key) != null) {
										userChall.setStartDate(Double.parseDouble(obj.get(key).toString()));
									}
									break;
								}	
								case UserChallenge.TIMEZONEKEY : {
									if (obj.get(key) != null) {
										userChall.setTimezone(obj.get(key).toString());
									}
									break;
								}	
								case UserChallenge.CREATEDKEY : {
									if (obj.get(key) != null) {
										userChall.setCreated(Double.parseDouble(obj.get(key).toString()));
									}
									break;
								}	
								case UserChallenge.HAS_ANSWERSKEY : {
									if (obj.get(key) != null) {
										userChall.setHasAnswers(obj.get(key).toString().equals("true"));
									}
									break;
								}	
								case UserChallenge.HAS_SUPPORTING_ACTIVITYKEY : {
									if (obj.get(key) != null) {
										userChall.setHasSupportingActivity(obj.get(key).toString().equals("true"));
									}
									break;
								}				
								case UserChallenge.HAS_SUPPORTING_QUIZKEY : {
									if (obj.get(key) != null) {
										userChall.setHasSupportingQuiz(obj.get(key).toString().equals("true"));
									}
									break;
								}	
								case UserChallenge.HASHKEY : {
									if (obj.get(key) != null) {
										userChall.setHash(obj.get(key).toString());
									}
									break;
								}	
								case UserChallenge.UPDATEDKEY : {
									if (obj.get(key) != null) {
										userChall.setUpdated(Double.parseDouble(obj.get(key).toString()));
									}
									break;
								}	
								case UserChallenge.DISMISSEDKEY : {
									if (obj.get(key) != null) {
										userChall.setDismissed(obj.get(key).toString().equals("true"));
									}
									break;
								}								
							} // end switch	
						} // end if
						
					} // end while
					
					// add to array
					arr.add(userChall);
					
				} // end for
				
			} // end if
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
			logger.error("Exception: " + ex.getLocalizedMessage());
		}
		
		return arr;
	}	
	
	// check survey_challenge collection in JSON file
	public int checkSurveyChallengeCollection() {
		
		int result = 0;
		
		try {
			for (int i=0; i< getJsonArray().size();i++) {						
				JSONObject object = (JSONObject)getJsonArray().get(i);
				if (object.get(Processing.SURVEY_CHALLENGECOLLECTIONNAME) != null) {
					JSONArray arr = (JSONArray) object.get(Processing.SURVEY_CHALLENGECOLLECTIONNAME);
					result = arr.size();
				}
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
			logger.error("Exception: " + ex.getLocalizedMessage());
		}
		
		return result;
	}		
	
	
	// parse JSON user_challenge.complete_status.step
	public void parseCollectionStep(UserChallengeCompleteStatus usrCompSts, JSONObject json) {
		Set<String> set_complete_status = json.keySet();
		Iterator<String> it = set_complete_status.iterator();							
		
		ArrayList<UserChallengeStep> steps = new ArrayList<UserChallengeStep>();
		
		
		try {
			while (it.hasNext()) {
				String keyIt = it.next();
	
				if (keyIt.equals(UserChallengeCompleteStatus.COMPLETEDKEY)) {				
					if (json.get(keyIt) != null) {
						//System.out.println("complete_status.completed=" + json.get(keyIt).toString());
						usrCompSts.setCompleted(json.get(keyIt).toString().equals("true"));
					}
				}
				else if (keyIt.equals(UserChallengeCompleteStatus.CREATEDKEY)) {				
					if (json.get(keyIt) != null) {
						//System.out.println("complete_status.created=" + json.get(keyIt).toString());
						usrCompSts.setCreated(Double.parseDouble(json.get(keyIt).toString()));
					}
				}
				else if (keyIt.startsWith("step")) {
					if (json.get(keyIt) instanceof JSONObject) {
						//System.out.println(keyIt);
						JSONObject stepJson = (JSONObject) json.get(keyIt);
						
						UserChallengeStep step = new UserChallengeStep();
						
						// set stepName
						step.setStepName(keyIt);
						
						// parse step collection
						parseCollectionStepActivity(step, stepJson);
						
						// add step to complete_status
						steps.add(step);
					}
				}
			} // end while
			
			// add all steps to complete_status 
			usrCompSts.setSteps(steps);
		}
		catch(Exception ex) {
			ex.printStackTrace();
			logger.error("Exception: " + ex.getLocalizedMessage());
		}
	}
	
	// parse JSON user_challenge.complete_status.step.activity
	public void parseCollectionStepActivity(UserChallengeStep step, JSONObject json) {
		Set<String> set_complete_status = json.keySet();
		Iterator<String> it = set_complete_status.iterator();							
		
		ArrayList<UserChallengeStepActivity> activities = new ArrayList<UserChallengeStepActivity>();
		
		try {
			while (it.hasNext()) {
				String keyIt = it.next();
				
				if (keyIt.equals(UserChallengeStep.COMPLETEDKEY)) {
					if (json.get(keyIt) != null) {
						//System.out.println("complete_status.step.completed=" + json.get(keyIt).toString());
						step.setCompleted(json.get(keyIt).toString().equals("true"));
					}				
				}	
				else if (keyIt.equals(UserChallengeStep.CREATEDKEY)) {				
					if (json.get(keyIt) != null) {
						//System.out.println("complete_status.step.created=" + json.get(keyIt).toString());
						step.setCreated(Double.parseDouble(json.get(keyIt).toString()));
					}
				}	
				else if (keyIt.equals(UserChallengeStep.COMPLETED_TIMEKEY)) {				
					if (json.get(keyIt) != null) {
						//System.out.println("complete_status.step.completed_time=" + json.get(keyIt).toString());
						step.setCompleted_time(Double.parseDouble(json.get(keyIt).toString()));
					}
				}				
				else if (keyIt.startsWith("activity")) {
					//System.out.println(keyIt);
					JSONObject activityJson = (JSONObject) json.get(keyIt);
					
					UserChallengeStepActivity activity = new UserChallengeStepActivity();
					
					// activityName
					activity.setActivityName(keyIt);
					
					// complete_status.step.activity.completed
					if (activityJson.get(UserChallengeStepActivity.COMPLETEDKEY) != null) {					
						if (activityJson.get(UserChallengeStepActivity.COMPLETEDKEY) != null) {
							//System.out.println("complete_status.step.activity.completed=" + activityJson.get(UserChallengeStepActivity.COMPLETEDKEY).toString());
							activity.setCompleted(activityJson.get(UserChallengeStepActivity.COMPLETEDKEY).toString().equals("true"));
						}					
					}
					
					// complete_status.step.activity.created
					if (activityJson.get(UserChallengeStepActivity.CREATEDKEY) != null) {					
						if (activityJson.get(UserChallengeStepActivity.CREATEDKEY) != null) {
							//System.out.println("complete_status.step.activity.created=" + activityJson.get(UserChallengeStepActivity.CREATEDKEY).toString());
							activity.setCreated(Double.parseDouble(activityJson.get(UserChallengeStepActivity.CREATEDKEY).toString()));
						}					
					}
					
					// complete_status.step.activity.answers
					if (activityJson.get(UserChallengeStepActivity.ANSWERSKEY) != null) {					
						JSONArray answers = (JSONArray) activityJson.get(UserChallengeStepActivity.ANSWERSKEY);
						
						ArrayList<String> anArr = new ArrayList<String>();
						
						for (int i=0; i<answers.size();i++) {						
							if (answers.get(i) != null) {
								//System.out.println("complete_status.step.activity.answers[" + i + "]=" + answers.get(i));
								anArr.add(answers.get(i).toString());
							}
						} // end for
						
						// set activity answers
						activity.setAnswers(anArr);
					}
					
					// add to activities array 
					activities.add(activity);
					
				} // end else if
				
			} // end while
			
			// set step activities 
			step.setActivity(activities);
			//System.out.println(step.getActivity().size());
		}
		catch(Exception ex) {
			ex.printStackTrace();
			logger.error("Exception: " + ex.getLocalizedMessage());
		}
	}	
	
	// parse user_challenge_stats collection
	@SuppressWarnings("unchecked")
	public ArrayList<UserChallengeStats> getUserChallengeStats(JSONObject object) {
		ArrayList<UserChallengeStats> arr = new ArrayList<UserChallengeStats>();
		
		try {
			// get "user_challenge_stats" collection from JSON
			if (object.get(Processing.USER_CHALLENGE_STATSCOLLECTIONNAME) != null) {
				JSONArray collection = (JSONArray) object.get(Processing.USER_CHALLENGE_STATSCOLLECTIONNAME);
				
				for (int i=0;i<collection.size();i++) {
					JSONObject obj = (JSONObject) collection.get(i);
					
					Set<String> set = obj.keySet();
					Iterator<String> iterator = set.iterator();
					
					// UserChallengeStats class
					UserChallengeStats userStats = new UserChallengeStats();
					
					while (iterator.hasNext()) {
						String key = iterator.next();
						
						// user_challenge_stats._id 
						if (key.equals(UserFlag.IDKEY)) {
							if (obj.get(key) instanceof JSONObject) {				
								JSONObject id = (JSONObject) obj.get(key);
								userStats.setID(getLRId(id));
							}
						}
						// user_challenge_stats._type
						else if (key.equals(UserFlag._TYPEKEY)) {
							if (obj.get(key) instanceof JSONArray) {				
								JSONArray arrType = (JSONArray) obj.get(key);
								ArrayList<String> _type = new ArrayList<String>();
								
								for (int j=0;j<arrType.size();j++) {						
									if (arrType.get(j) != null)						
										_type.add(new String(arrType.get(j).toString()));
								}
								
								userStats.setType(_type);
							}				
						}
						else {
							switch (key) {						
							
								case UserChallengeStats.PROGRESS_COUNTERKEY : {
									if (obj.get(key) != null) {
										userStats.setProgressCounter(Integer.parseInt(obj.get(key).toString()));
									}
									break;
								}		
								case UserChallengeStats.STARTEDKEY : {
									if (obj.get(key) != null) {
										userStats.setStarted(obj.get(key).toString().equals("true"));
									}
									break;
								}							
								case UserChallengeStats.USER_IDKEY : {
									if (obj.get(key) != null) {
										userStats.setUserId(obj.get(key).toString());
									}
									break;
								}
								case UserChallengeStats.CHALLENGE_IDKEY : {
									if (obj.get(key) != null) {
										if (NumberUtils.isNumber(obj.get(key).toString()))
											userStats.setChallengeId(Double.parseDouble(obj.get(key).toString()));
									}
									break;
								}
								case UserChallengeStats.CHALLENGE_NAMEKEY : {
									if (obj.get(key) != null) {
										userStats.setChallengeName(obj.get(key).toString());
									}
									break;
								}
								case UserChallengeStats.CHALLENGE_IMAGEKEY : {
									if (obj.get(key) != null) {
										userStats.setChallengeImage(obj.get(key).toString());
									}
									break;
								}							
								case UserChallengeStats.CHALLENGE_DURATIONKEY : {
									if (obj.get(key) != null) {
										userStats.setChallengeDuration(Integer.parseInt(obj.get(key).toString()));
									}
									break;
								}
								case UserChallengeStats.EXPERT_IDKEY : {
									if (obj.get(key) != null) {
										userStats.setExpertId(Integer.parseInt(obj.get(key).toString()));
									}
									break;
								}
								case UserChallengeStats.CHALLENGE_COMPLETEDKEY : {
									if (obj.get(key) != null) {
										userStats.setChallengeCompleted(obj.get(key).toString().equals("true"));
									}
									break;
								}
								case UserChallengeStats.PROGRESSKEY : {
									if (obj.get(key) != null) {
										userStats.setProgress(obj.get(key).toString().equals("true"));
									}
									break;
								}							
								case UserChallengeStats.TIMESTAMPKEY : {
									if (obj.get(key) != null) {
										userStats.setTimestamp(Double.parseDouble(obj.get(key).toString()));
									}
									break;
								}
								case UserChallengeStats.CREATEDKEY : {
									if (obj.get(key) != null) {
										userStats.setCreated(Double.parseDouble(obj.get(key).toString()));
									}
									break;
								}	
							} // end switch	
						} // end if
						
					} // end while
					
					// add to array
					arr.add(userStats);
					
				} // end for
			
			} // end if
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
			logger.error("Exception: " + ex.getLocalizedMessage());
		}
		
		return arr;
	}
	
	// parse survey_challenge collection
	@SuppressWarnings("unchecked")
	public ArrayList<SurveyChallenge> getSurveyChallenge(JSONObject object) {
		ArrayList<SurveyChallenge> arr = new ArrayList<SurveyChallenge>();
		
		try {
			// get "survey_challenge" collection from JSON
			if (object.get(Processing.SURVEY_CHALLENGECOLLECTIONNAME) != null) {
			
				JSONArray collection = (JSONArray) object.get(Processing.SURVEY_CHALLENGECOLLECTIONNAME);
				
				for (int i=0;i<collection.size();i++) {
					JSONObject obj = (JSONObject) collection.get(i);
					
					Set<String> set = obj.keySet();
					Iterator<String> iterator = set.iterator();
					
					// SurveyChallenge class
					SurveyChallenge survey = new SurveyChallenge();
					
					while (iterator.hasNext()) {
						String key = iterator.next();
						
						// survey_challenge._id 
						if (key.equals(SurveyChallenge.IDKEY)) {
							if (obj.get(key) instanceof JSONObject) {				
								JSONObject id = (JSONObject) obj.get(key);
								survey.setId(getLRId(id));
							}
						}
						// survey_challenge._type
						else if (key.equals(SurveyChallenge._TYPEKEY)) {
							if (obj.get(key) instanceof JSONArray) {				
								JSONArray arrType = (JSONArray) obj.get(key);
								ArrayList<String> _type = new ArrayList<String>();
								
								for (int j=0;j<arrType.size();j++) {						
									if (arrType.get(j) != null)						
										_type.add(new String(arrType.get(j).toString()));
								}
								
								survey.set_type(_type);
							}				
						}
						else {
							switch (key) {
								case SurveyChallenge.USER_IDKEY : {
									if (obj.get(key) != null) {
										survey.setUser_id(obj.get(key).toString());
									}
									break;
								}
								case SurveyChallenge.USER_CHALLENGE_IDKEY : {
									if (obj.get(key) != null) {
										survey.setUser_challenge_id(obj.get(key).toString());
									}
									break;
								}
								case SurveyChallenge.CHALLENGE_NIDKEY : {
									if (obj.get(key) != null) {
										survey.setChallenge_nid(Long.parseLong(obj.get(key).toString()));
									}
									break;
								}	
								case SurveyChallenge.HASHKEY : {
									if (obj.get(key) != null) {
										survey.setHash(obj.get(key).toString());
									}
									break;
								}	
								case SurveyChallenge.CHALLENGE_TITLEKEY : {
									if (obj.get(key) != null) {
										survey.setChallenge_title(obj.get(key).toString());
									}
									break;
								}	
								case SurveyChallenge.STEP_COUNTKEY : {
									if (obj.get(key) != null) {
										survey.setStep_count(Integer.parseInt(obj.get(key).toString()));
									}
									break;
								}	
								case SurveyChallenge.PROGRAMRATINGKEY : {
									if (obj.get(key) != null) {
										survey.setProgramRating(Integer.parseInt(obj.get(key).toString()));
									}
									break;
								}		
								case SurveyChallenge.GENDERKEY : {
									if (obj.get(key) != null) {
										survey.setGender(obj.get(key).toString());
									}
									break;
								}	
								case SurveyChallenge.DOBKEY : {
									if (obj.get(key) != null) {
										//survey.setDob(Long.parseLong(obj.get(key).toString()));									
									}
									break;
								}	
								case SurveyChallenge.ZIP_CODEKEY : {
									if (obj.get(key) != null) {
										survey.setZip_code(obj.get(key).toString());
									}
									break;
								}	
								case SurveyChallenge.OCCUPATIONKEY : {
									if (obj.get(key) != null) {
										survey.setOccupation(obj.get(key).toString());
									}
									break;
								}	
								case SurveyChallenge.COMPLTED_PROGRAMSKEY : {
									if (obj.get(key) != null) {
										survey.setCompleted_programs(Integer.parseInt(obj.get(key).toString()));
									}
									break;
								}								
								case SurveyChallenge.CREATEDKEY : {
									if (obj.get(key) != null) {
										survey.setCreated(Double.parseDouble(obj.get(key).toString()));
									}
									break;
								}	
								case SurveyChallenge.PROGRAMDESCRIPTIONSKEY : {
									if (obj.get(key) != null) {
										if (obj.get(key) instanceof JSONArray) {				
											JSONArray pr = (JSONArray) obj.get(key);
											ArrayList<String> prArr = new ArrayList<String>();
											
											for (int j=0;j<pr.size();j++) {						
												if (pr.get(j) != null)						
													prArr.add(new String(pr.get(j).toString()));
											}
											
											survey.setProgramDescriptions(prArr);
										}	
									}
									break;
								}								
							} // end switch	
						} // end if
						
					} // end while
					
					// add to array
					arr.add(survey);
					
				} // end for
				
			} // end if
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
			logger.error("Exception: " + ex.getLocalizedMessage());
		}
		
		return arr;
	}
	
	public JSONObject getJSONObject(JSONObject object, String collectionName) throws Exception {
		return (JSONObject)object.get(collectionName);
	}

	public Object getJsonObject() {
		return jsonObject;
	}

	public void setJsonObject(Object jsonObject) {
		this.jsonObject = jsonObject;
	}

	public String getJsonFile() {
		return jsonFile;
	}

	public void setJsonFile(String jsonFile) {
		this.jsonFile = jsonFile;
	}

	public JSONArray getJsonArray() {
		return jsonArray;
	}

	public void setJsonArray(JSONArray jsonArray) {
		this.jsonArray = jsonArray;
	}
}
