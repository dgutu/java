package com.proximo.aarp.json.collections;

import java.util.ArrayList;
import java.util.Date;

import com.proximo.aarp.util.MyUtils;

public class UserQuiz {
	
	public final static String IDKEY = "_id";
	public final static String _TYPEKEY = "_type";	
	public final static String USER_IDKEY = "user_id";
	public final static String QUIZ_IDKEY = "quiz_id";
	public final static String ANSWERSKEY = "answers";
	public final static String USER_SCOREKEY = "user_score";
	public final static String CREATEDKEY = "created";
	public final static String FROM_FLAGSKEY = "from_flags";	
	public final static String FROM_FLAGS_USER_CHALLENGE_IDKEY = "user_challenge_id";
	public final static String FROM_FLAGS_CHALLENGE_NIDKEY = "challenge_nid";
	public final static String FROM_FLAGS_STEP_NIDKEY = "step_nid";
	public final static String FROM_FLAGS_ACTIVITY_NIDKEY = "activity_nid";
	
	private Id id;
	private ArrayList<String> _type;
	private Double created;
	private Long quiz_id;
	private ArrayList<Answers> answers;
	private String user_id;
	private Integer user_score;
	private String from_flags_user_challenge_id;
	private Integer from_flags_challenge_nid;
	private Integer from_flags_step_nid;
	private Integer from_flags_activity_nid;
	
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
	
	// created
	public Double getCreated() {
		return created;
	}

	public void setCreated(Double val) {
		this.created = val;
	}
	
	// quiz_id
	public Long getQuizId() {
		return quiz_id;
	}

	public void setQuizId(Long val) {
		this.quiz_id = val;
	}
	
	// answers
	public ArrayList<Answers> getAnswers() {
		if (this.answers != null)
			return this.answers;
		else
			return new ArrayList<Answers>();
	}

	public void setAnswers(ArrayList<Answers> val) {
		this.answers = val;
	}
	
	// user_id
	public String getUserId() {
		return user_id;
	}

	public void setUserId(String val) {
		this.user_id = val;
	}
	
	// user_score
	public Integer getUserScore() {
		return user_score;
	}

	public void setUserScore(Integer val) {
		this.user_score = val;
	}

	public String getFrom_flags_user_challenge_id() {
		return from_flags_user_challenge_id;
	}

	public void setFrom_flags_user_challenge_id(String from_flags_user_challenge_id) {
		this.from_flags_user_challenge_id = from_flags_user_challenge_id;
	}

	public Integer getFrom_flags_challenge_nid() {
		return from_flags_challenge_nid;
	}

	public void setFrom_flags_challenge_nid(Integer from_flags_challenge_nid) {
		this.from_flags_challenge_nid = from_flags_challenge_nid;
	}

	public Integer getFrom_flags_step_nid() {
		return from_flags_step_nid;
	}

	public void setFrom_flags_step_nid(Integer from_flags_step_nid) {
		this.from_flags_step_nid = from_flags_step_nid;
	}

	public Integer getFrom_flags_activity_nid() {
		return from_flags_activity_nid;
	}

	public void setFrom_flags_activity_nid(Integer from_flags_activity_nid) {
		this.from_flags_activity_nid = from_flags_activity_nid;
	}	
	
	public Date getCreatedFormat() {
		if (this.getCreated() == null)
			return null;
		else
			return MyUtils.convertUnixTimeStampToDateExample(this.getCreated());
	}	
}
