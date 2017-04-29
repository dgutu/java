package com.proximo.pcpc.pubedit.json;

import com.google.gson.annotations.SerializedName;

public class InputJson {
	@SerializedName("token")
	private String token;
	
	@SerializedName("data_type")
	private String dataType;
	
	@SerializedName("action")
	private String action;
	
	@SerializedName("data")
	private String data;
	
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	
	public String getDataType() {
		return dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
	
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
}
