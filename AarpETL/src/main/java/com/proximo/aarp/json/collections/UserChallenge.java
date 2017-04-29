package com.proximo.aarp.json.collections;

import java.util.ArrayList;
import java.util.Date;

import com.proximo.aarp.util.MyUtils;

public class UserChallenge {
	
	public final static String IDKEY = "_id";
	public final static String _TYPEKEY = "_type";
	public final static String USER_IDKEY = "user_id";
	public final static String CREATEDKEY = "created";	
	public final static String CHALLENGE_IDKEY = "challenge_id";
	public final static String STARTDATEKEY = "startDate";
	public final static String TIMEZONEKEY = "timezone";
	public final static String HAS_ANSWERSKEY = "has_answers";
	public final static String HAS_SUPPORTING_ACTIVITYKEY = "has_supporting_activity";
	public final static String HAS_SUPPORTING_QUIZKEY = "has_supporting_quiz";
	public final static String COMPLETE_STATUSKEY = "complete_status";
	public final static String HASHKEY = "hash";
	public final static String UPDATEDKEY = "updated";	
	public final static String DISMISSEDKEY= "dismissed";
	
	private Id id;
	private ArrayList<String> _type;
	private Integer challenge_id;
	private String user_id;
	private Double startDate;
	private String timezone;
	private Double created;
	private Boolean dismissed;
	private Boolean has_answers;
	private Boolean has_supporting_activity;
	private Boolean has_supporting_quiz;
	private UserChallengeCompleteStatus completeStatus;
	private String hash;
	private Double updated;
	
	public UserChallenge() {}
	public UserChallenge(Id id, 
						 ArrayList<String> _type, 
						 Integer challenge_id, 
						 String user_id,
						 Double startDate,
						 String timezone, 
						 Double created, 
						 Boolean has_answers, 
						 Boolean has_supporting_activity,
						 Boolean has_supporting_quiz, 
						 UserChallengeCompleteStatus completeStatus, 
						 String hash) {
		this.id = id;
		this._type = _type;
		this.challenge_id = challenge_id;
		this.user_id = user_id;
		this.startDate = startDate;
		this.timezone = timezone;
		this.created = created;
		this.has_answers = has_answers;
		this.has_supporting_activity = has_supporting_activity;
		this.has_supporting_quiz = has_supporting_quiz;
		this.completeStatus = completeStatus;
		this.hash = hash;
	}
	
	// Id
	public Id getID() {
		return this.id;
	}
	
	public void setID(Id val) {
		this.id = val;
	}
	
	// _type
	public ArrayList<String> getType() {
		return this._type;
	}
	
	public void setType(ArrayList<String> val) {
		this._type = val;
	}
	
	// challenge_id
	public Integer getChallengeId() {
		return this.challenge_id;
	}
	
	public void setChallengeId(Integer val) {
		this.challenge_id = val;
	}
	
	// user_id
	public String getUserId() {
		return user_id;
	}

	public void setUserId(String val) {
		this.user_id = val;
	}
	
	// startDate
	public Double getStartDate() {
		return startDate;
	}
	public void setStartDate(Double startDate) {
		this.startDate = startDate;
	}
	
	// timezone
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	
	// created
	public Double getCreated() {
		return created;
	}

	public void setCreated(Double val) {
		this.created = val;
	}
	
	// has_answers
	public Boolean isHasAnswers() {
		return has_answers;
	}
	
	public void setHasAnswers(Boolean has_answers) {
		this.has_answers = has_answers;
	}
	
	// has_supporting_activity
	public Boolean isHasSupportingActivity() {
		return has_supporting_activity;
	}
	
	public void setHasSupportingActivity(Boolean has_supporting_activity) {
		this.has_supporting_activity = has_supporting_activity;
	}
	
	// has_supporting_quiz
	public Boolean isHasSupportingQuiz() {
		return has_supporting_quiz;
	}
	
	public void setHasSupportingQuiz(Boolean has_supporting_quiz) {
		this.has_supporting_quiz = has_supporting_quiz;
	}
	
	// completeStatus
	public UserChallengeCompleteStatus getCompleteStatus() {
		if (completeStatus != null)
			return completeStatus;
		else
			return new UserChallengeCompleteStatus();
	}
	
	public void setCompleteStatus(UserChallengeCompleteStatus completeStatus) {
		this.completeStatus = completeStatus;
	}
	
	// hash
	public String getHash() {
		return hash;
	}
	
	public void setHash(String hash) {
		this.hash = hash;
	}
	
	public Date getCreatedFormat() {
		if (this.getCreated() == null)
			return null;
		else
			return MyUtils.convertUnixTimeStampToDateExample(this.getCreated());
	}
	
	public Double getUpdated() {
		return updated;
	}
	public void setUpdated(Double updated) {
		this.updated = updated;
	}
	
	public Date getUpdatedFormat() {
		if (this.getUpdated() == null)
			return null;
		else
			return MyUtils.convertUnixTimeStampToDateExample(this.getUpdated());
	}
	
	public Boolean getDismissed() {
		return dismissed;
	}
	public void setDismissed(Boolean dismissed) {
		this.dismissed = dismissed;
	}
	
	public Date getStartDateFormat() {
		if (this.getStartDate() == null)
			return null;
		else
			return MyUtils.convertUnixTimeStampToDateExample(this.getStartDate());
	}
}
