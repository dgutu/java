package com.proximo.aarp.json.collections;

import java.util.ArrayList;
import java.util.Date;

import com.proximo.aarp.util.MyUtils;

public class SurveyChallenge {
	public final static String IDKEY = "_id";
	public final static String _TYPEKEY = "_type";
	public final static String USER_IDKEY = "user_id";
	public final static String USER_CHALLENGE_IDKEY = "user_challenge_id";
	public final static String CHALLENGE_NIDKEY = "challenge_nid";
	public final static String HASHKEY = "hash";
	public final static String CHALLENGE_TITLEKEY = "challenge_title";
	public final static String STEP_COUNTKEY = "step_count";
	public final static String PROGRAMDESCRIPTIONSKEY = "programDescriptions";
	public final static String PROGRAMRATINGKEY = "programRating";
	public final static String PROGRAMREVIEWTEXTKEY = "programReviewText";
	public final static String GENDERKEY = "gender";
	public final static String DOBKEY = "dob";
	public final static String ZIP_CODEKEY = "zip_code";
	public final static String OCCUPATIONKEY = "occupation";
	public final static String COMPLTED_PROGRAMSKEY = "completed_programs";
	public final static String CREATEDKEY = "created";
	
	private Id id;
	private ArrayList<String> _type;
	private String user_id;
	private String user_challenge_id;
	private Long challenge_nid;
	private String hash;
	private String challenge_title;
	private Integer step_count;
	private ArrayList<String> programDescriptions;
	private Integer programRating;
	private String programReviewText;
	private String gender;
	private Double dob;
	private String zip_code;
	private String occupation;
	private Integer completed_programs;
	private Double created;
	
	public SurveyChallenge() {}
	
	public Id getId() {
		return id;
	}
	public void setId(Id id) {
		this.id = id;
	}
	public ArrayList<String> get_type() {
		return _type;
	}
	public void set_type(ArrayList<String> _type) {
		this._type = _type;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_challenge_id() {
		return user_challenge_id;
	}
	public void setUser_challenge_id(String user_challenge_id) {
		this.user_challenge_id = user_challenge_id;
	}
	public Long getChallenge_nid() {
		return challenge_nid;
	}
	public void setChallenge_nid(Long challenge_nid) {
		this.challenge_nid = challenge_nid;
	}
	public String getHash() {
		return hash;
	}
	public void setHash(String hash) {
		this.hash = hash;
	}
	public String getChallenge_title() {
		return challenge_title;
	}
	public void setChallenge_title(String challenge_title) {
		this.challenge_title = challenge_title;
	}
	public Integer getStep_count() {
		return step_count;
	}
	public void setStep_count(Integer step_count) {
		this.step_count = step_count;
	}
	public ArrayList<String> getProgramDescriptions() {
		return programDescriptions;
	}
	public void setProgramDescriptions(ArrayList<String> programDescriptions) {
		this.programDescriptions = programDescriptions;
	}
	public Integer getProgramRating() {
		return programRating;
	}
	public void setProgramRating(Integer programRating) {
		this.programRating = programRating;
	}
	public String getProgramReviewText() {
		return programReviewText;
	}
	public void setProgramReviewText(String programReviewText) {
		this.programReviewText = programReviewText;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Double getDob() {
		return dob;
	}
	public void setDob(Double dob) {
		this.dob = dob;
	}
	public String getZip_code() {
		return zip_code;
	}
	public void setZip_code(String zip_code) {
		this.zip_code = zip_code;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public Integer getCompleted_programs() {
		return completed_programs;
	}
	public void setCompleted_programs(Integer completed_programs) {
		this.completed_programs = completed_programs;
	}
	public Double getCreated() {
		return created;
	}
	public void setCreated(Double created) {
		this.created = created;
	}
	public Date getCreatedFormat() {
		if (this.getCreated() == null)
			return null;
		else
			return MyUtils.convertUnixTimeStampToDateExample(this.getCreated());
	}
		
}
