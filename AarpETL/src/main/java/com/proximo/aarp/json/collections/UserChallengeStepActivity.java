package com.proximo.aarp.json.collections;

import java.util.ArrayList;
import java.util.Date;

import org.apache.log4j.Logger;

import com.proximo.aarp.util.MyUtils;

public class UserChallengeStepActivity {
	// logger
	static final Logger logger = Logger.getLogger(UserChallengeStepActivity.class);	
	
	public final static String COMPLETEDKEY = "completed";
	public final static String ANSWERSKEY = "answers";
	public final static String SUPPORTING_ACTIVITYKEY = "supporting_activity";
	public final static String SUPPORTING_ACTIVITY_COMPLETEDKEY = "completed";
	public final static String CREATEDKEY = "created";
	
	private Boolean completed;
	private ArrayList<String> answers;
	private Double created;
	private String activityName;
	
	public UserChallengeStepActivity() {}
	public UserChallengeStepActivity(Boolean completed, ArrayList<String> answers) {
		this.completed = completed;
		this.answers = answers;
	}
	
	// completed
	public Boolean isCompleted() {
		return completed;
	}
	public void setCompleted(Boolean completed) {
		this.completed = completed;
	}
	
	// answers
	public ArrayList<String> getAnswers() {
		if (answers != null)
			return answers;
		else
			return new ArrayList<String>();
	}
	public void setAnswers(ArrayList<String> answers) {
		this.answers = answers;
	}
	
	// print all answers
	public void printUserChallengeStepActivity() {		
		try {
			// print completed
			System.out.println("completed="+isCompleted());
			
			// print answers
			if (!answers.isEmpty()) {
				for (int i=0;i<answers.size();i++) {
					System.out.println("answer["+i+"]="+answers.get(i));
				}
			}	
		}
		catch(Exception ex) {
			logger.error(ex.getMessage());
		}	
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
	
	public String getActivityName() {
		return activityName;
	}
	
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}
		
}
