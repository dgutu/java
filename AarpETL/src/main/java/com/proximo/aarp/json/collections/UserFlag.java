package com.proximo.aarp.json.collections;

import java.util.ArrayList;
import java.util.Date;

import com.proximo.aarp.util.MyUtils;

public class UserFlag {
	
	public final static String IDKEY = "_id";
	public final static String _TYPEKEY = "_type";
	public final static String USER_IDKEY = "user_id";
	public final static String TYPEKEY = "type";
	public final static String CREATEDKEY = "created";
	
	private Id id;
	private ArrayList<String> _type;
	private String user_id;
	private String type;
	private Double created;
	
	public UserFlag() {}
	
	public UserFlag(Id id, ArrayList<String> _type, String user_id, String type, Double created) {
		this.id = id;
		this._type = _type;
		this.user_id = user_id;
		this.type = type;
		this.created = created;
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
	
	// created
	public Double getCreated() {
		return this.created;
	}
	
	public void setCreated(Double val) {
		this.created = val;
	}	
	
	// user_id
	public String getuser_id() {
		return this.user_id;
	}
	
	public void setuser_id(String val) {
		this.user_id = val;
	}	
	
	// type
	public String gettype() {
		return this.type;
	}
	
	public void settype(String val) {
		this.type = val;
	}
	
	public Date getCreatedFormat() {
		if (this.getCreated() == null)
			return null;
		else
			return MyUtils.convertUnixTimeStampToDateExample(this.getCreated());
	}	

}
