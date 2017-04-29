package com.proximo.aarp.json.collections;

import java.util.ArrayList;
import java.util.Date;

import org.apache.log4j.Logger;

import com.proximo.aarp.util.MyUtils;

public class UserChallengeCompleteStatus {	
	// logger
	static final Logger logger = Logger.getLogger(UserChallengeCompleteStatus.class);
	
	public final static String COMPLETEDKEY = "completed";
	public final static String STEPKEY = "step";	
	public final static String CREATEDKEY = "created";
	
	private Boolean completed;
	private ArrayList<UserChallengeStep> steps;
	private Double created;
	
	public UserChallengeCompleteStatus() {}
	public UserChallengeCompleteStatus(Boolean completed, ArrayList<UserChallengeStep> steps) {
		this.completed = completed;
		this.steps = steps;
	}
	
	// completed
	public Boolean isCompleted() {
		return completed;
	}
	public void setCompleted(Boolean completed) {
		this.completed = completed;
	}
	
	// step
	public ArrayList<UserChallengeStep> getSteps() {
		if (steps != null)
			return steps;
		else
			return new ArrayList<UserChallengeStep>();
	}
	public void setSteps(ArrayList<UserChallengeStep> steps) {
		this.steps = steps;
	}	
	
	// print 
	public void printUserChallengeCompleteStatus() {
		try {
			// print completed
			System.out.println("completed="+isCompleted());
			
			// print steps
			if (!steps.isEmpty()) {
				for (int i=0;i<steps.size();i++) {
					UserChallengeStep s = (UserChallengeStep) steps.get(i);
					s.printUserChallengeStep();
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
	
}
