package com.proximo.pcpc.pubedit.model;

public class Result {
	private Integer id;
	private Long apiID;
	private String message;
	private Boolean isUserValid;
	
	public Result() {}
	
	public Long getApiID() {
		return apiID;
	}
	public void setApiID(Long apiID) {
		this.apiID = apiID;
	}	
	
	public Boolean isUserValid() {
		return isUserValid;
	}
	public void setIsUserValid(Boolean isUserValid) {
		this.isUserValid = isUserValid;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
