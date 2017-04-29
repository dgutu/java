package com.proximo.aarp.json.collections;

import java.util.ArrayList;
import java.util.Date;

import com.proximo.aarp.util.MyUtils;

public class UserChallengeStats {

	public final static String IDKEY = "_id";
	public final static String _TYPEKEY = "_type";
	public final static String PROGRESS_COUNTERKEY = "progress_counter";
	public final static String STARTEDKEY = "started";
	public final static String USER_IDKEY = "user_id";
	public final static String CHALLENGE_IDKEY = "challenge_id";
	public final static String CHALLENGE_NAMEKEY = "challenge_name";
	public final static String CHALLENGE_IMAGEKEY = "challenge_image";
	public final static String CHALLENGE_DURATIONKEY = "challenge_duration";
	public final static String EXPERT_IDKEY = "expert_id";
	public final static String CHALLENGE_COMPLETEDKEY = "challenge_completed";
	public final static String PROGRESSKEY = "progress";
	public final static String TIMESTAMPKEY = "timestamp";
	public final static String CREATEDKEY = "created";	
	
	private Id id;
	private ArrayList<String> _type;	
	private Integer progress_counter;
	private Boolean started;
	private String user_id;
	private Double challenge_id;
	private String challenge_name;
	private String challenge_image;
	private Integer challenge_duration;
	private Integer expert_id;
	private Boolean challenge_completed;
	private Double timestamp;
	private Double created;
	private Boolean progress;
	
	public UserChallengeStats() {}
	
	public UserChallengeStats(Id id, 
							  ArrayList<String> _type, 
							  Integer progress_counter,
							  Boolean started, 
							  String user_id, 
							  Double challenge_id, 
							  String challenge_name, 
							  String challenge_image, 
							  Integer challenge_duration, 
							  Integer expert_id, 
							  Boolean challenge_completed, 
							  Double timestamp, 
							  Double created,
							  Boolean progress) {
		this.id = id;
		this._type = _type;
		this.progress_counter = progress_counter;
		this.started = started;
		this.user_id = user_id;
		this.challenge_id = challenge_id;
		this.challenge_name = challenge_name;
		this.challenge_image = challenge_image;
		this.challenge_duration = challenge_duration;
		this.expert_id = expert_id;
		this.challenge_completed = challenge_completed;
		this.timestamp = timestamp;
		this.created = created;
		this.progress = progress;
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
	
	// progress_counter
	public Integer getProgressCounter() {
		return this.progress_counter;
	}
	
	public void setProgressCounter(Integer val) {
		this.progress_counter = val;
	}		
	
	// started
	public Boolean getStarted() {
		return this.started;
	}
	
	public void setStarted(Boolean val) {
		this.started = val;
	}
	
	// user_id
	public String getUserId() {
		return this.user_id;
	}
	
	public void setUserId(String val) {
		this.user_id = val;
	}	
	
	// challenge_id
	public Double getChallengeId() {
		return this.challenge_id;
	}
	
	public void setChallengeId(Double val) {
		this.challenge_id = val;
	}
	
	// challenge_name
	public String getChallengeName() {
		return this.challenge_name;
	}
	
	public void setChallengeName(String val) {
		this.challenge_name = val;
	}
	
	// challenge_image
	public String getChallengeImage() {
		return challenge_image;
	}

	public void setChallengeImage(String val) {
		this.challenge_image = val;
	}

	// challenge_duration
	public Integer getChallengeDuration() {
		return challenge_duration;
	}

	public void setChallengeDuration(Integer val) {
		this.challenge_duration = val;
	}
	
	// expert_id
	public Integer getExpertId() {
		return expert_id;
	}

	public void setExpertId(Integer val) {
		this.expert_id = val;
	}
	
	// challenge_completed
	public Boolean isChallengeCompleted() {
		return challenge_completed;
	}

	public void setChallengeCompleted(Boolean val) {
		this.challenge_completed = val;
	}
	
	// timestamp
	public Double getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Double val) {
		this.timestamp = val;
	}
	
	//
	public Double getCreated() {
		return created;
	}

	public void setCreated(Double val) {
		this.created = val;
	}

	public Boolean getProgress() {
		return progress;
	}

	public void setProgress(Boolean progress) {
		this.progress = progress;
	}
	
	public Date getCreatedFormat() {
		if (this.getCreated() == null)
			return null;
		else
			return MyUtils.convertUnixTimeStampToDateExample(this.getCreated());
	}
	
	public Date getTimestampFormat() {
		if (this.getCreated() == null)
			return null;
		else
			return MyUtils.convertUnixTimeStampToDateExample(this.getTimestamp());
	}
	
}
