package com.proximo.aarp.json.collections;

import java.util.Date;

import com.proximo.aarp.util.MyUtils;

public class Answers {
	
	public final static String ANSWERKEY = "answer";
	public final static String COMPLETEKEY = "complete";
	public final static String POINTSKEY = "points";
	public final static String OFFSETKEY = "offset";
	public final static String CREATEDKEY = "created";
	
	private String answer;
	private Integer points;
	private Boolean complete;
	private Double created;
	private Float offset;
	
	public Answers() {}
	
	public Answers(String answer, Integer points, Boolean complete, Double created, Float offset) {
		this.answer = answer;
		this.points = points;
		this.complete = complete;
		this.created = created;
		this.offset = offset;
	}
	
	// answer
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String val) {
		this.answer = val;
	}
	
	// points
	public Integer getPoints() {
		return points;
	}
	public void setPoints(Integer val) {
		this.points = val;
	}
	
	// complete
	public Boolean isComplete() {
		return complete;
	}
	public void setComplete(Boolean val) {
		this.complete = val;
	}

	public Double getCreated() {
		return created;
	}

	public void setCreated(Double created) {
		this.created = created;
	}

	public Float getOffset() {
		return offset;
	}

	public void setOffset(Float offset) {
		this.offset = offset;
	}
	
	public Date getCreatedFormat() {
		if (this.getCreated() == null)
			return null;
		else
			return MyUtils.convertUnixTimeStampToDateExample(this.getCreated());
	}	
}
