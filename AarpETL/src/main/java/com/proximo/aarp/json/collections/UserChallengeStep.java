package com.proximo.aarp.json.collections;

import java.util.ArrayList;
import java.util.Date;

import org.apache.log4j.Logger;

import com.proximo.aarp.util.MyUtils;

public class UserChallengeStep {
	// logger
	static final Logger logger = Logger.getLogger(UserChallengeStep.class);
	
	public final static String COMPLETEDKEY = "completed";
	public final static String ACTIVITYKEY = "activity";
	public final static String CREATEDKEY = "created";
	public final static String COMPLETED_TIMEKEY= "completed_time";
		
	private Boolean completed;
	private ArrayList<UserChallengeStepActivity> activity;
	private Double created;
	private Double completed_time;
	private String stepName;
	
	public UserChallengeStep() {}
	public UserChallengeStep(Boolean completed, ArrayList<UserChallengeStepActivity> activity) {
		this.completed = completed;
		this.activity = activity;
	}
	
	// completed
	public Boolean isCompleted() {
		return completed;
	}	
	public void setCompleted(Boolean completed) {
		this.completed = completed;
	}
	
	// activity
	public ArrayList<UserChallengeStepActivity> getActivity() {
		if (activity != null)
			return activity;
		else
			return new ArrayList<UserChallengeStepActivity>();
	}
	public void setActivity(ArrayList<UserChallengeStepActivity> activity) {
		this.activity = activity;
	}
	
	// print UserChallengeStepActivity
	public void printUserChallengeStep() {
		try {
			// print completed
			System.out.println("completed="+isCompleted());
			
			// print 
			if (!activity.isEmpty()) {
				for (int i=0; i<activity.size();i++) {
					UserChallengeStepActivity a = (UserChallengeStepActivity) activity.get(i);
					a.printUserChallengeStepActivity();					
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
	
	public Date getCompleted_timeFormat() {
		if (this.getCompleted_time() == null)
			return null;
		else
			return MyUtils.convertUnixTimeStampToDateExample(this.getCompleted_time());
	}	
	
	public Double getCompleted_time() {
		return completed_time;
	}
	public void setCompleted_time(Double completed_time) {
		this.completed_time = completed_time;
	}
	
	public String getStepName() {
		return stepName;
	}
	
	public void setStepName(String stepName) {
		this.stepName = stepName;
	}
	
}
