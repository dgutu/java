package com.proximo.aarp.json.collections;

import java.util.ArrayList;
import java.util.Date;

import com.proximo.aarp.util.MyUtils;

public class LinkedinWorkHistory {
	
	public final static String IDKEY = "_id";
	public final static String _TYPEKEY = "_type";
	public final static String EMAILADDRESSKEY = "emailAddress";
	public final static String FIRSTNAMEKEY = "firstName";
	public final static String IDFIELDKEY = "id";
	public final static String LASTNAMEKEY = "lastName";
	public final static String PICTUREURLKEY = "pictureUrl";
	public final static String POSITIONSKEY = "positions";
	public final static String USER_IDKEY = "user_id";
	public final static String CREATEDKEY = "created";
	public final static String POSITIONS_TOTALKEY = "_total";
	
	private Id id;
	private ArrayList<String> _type;
	private String emailAddress;
	private String firstName;
	private String idField;
	private String lastName;
	private String pictureUrl;
	private ArrayList<LinkedinWorkHistoryPosition> positions;
	private String user_id;
	private Double created;
	private Integer _total;
	
	public LinkedinWorkHistory() {}
	
	public LinkedinWorkHistory(Id id, 
							   ArrayList<String> _type, 
							   String emailAddress, 
							   String firstName, 
							   String idField,
							   String lastName,
							   String pictureUrl,
							   ArrayList<LinkedinWorkHistoryPosition> positions,
							   String user_id,
							   Double created, 
							   Integer _total) {
		this.id = id;
		this._type = _type;
		this.emailAddress = emailAddress;
		this.firstName = firstName;
		this.idField = idField;
		this.lastName = lastName;
		this.pictureUrl = pictureUrl;
		this.positions = positions;
		this.user_id = user_id;
		this.created = created;
		this._total = _total;
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
	
	// emailAddress
	public String getEmailAddress() {
		return emailAddress;
	}
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	// firstName
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	// idField
	public String getIdField() {
		return idField;
	}

	public void setIdField(String idField) {
		this.idField = idField;
	}

	// lastName
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	// pictureUrl
	public String getPictureUrl() {
		return pictureUrl;
	}

	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}
	
	// positions
	public ArrayList<LinkedinWorkHistoryPosition> getPositions() {
		if (positions != null)
			return positions;
		else
			return new  ArrayList<LinkedinWorkHistoryPosition>();
	}

	public void setPositions(ArrayList<LinkedinWorkHistoryPosition> positions) {
		this.positions = positions;
	}
	
	// user_id
	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	
	// created
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

	public Integer get_total() {
		return _total;
	}

	public void set_total(Integer _total) {
		this._total = _total;
	}		
}
