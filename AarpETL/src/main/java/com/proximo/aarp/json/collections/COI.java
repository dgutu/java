package com.proximo.aarp.json.collections;

import java.util.Date;

import com.proximo.aarp.util.MyUtils;

public class COI {
	
	public static final String STATUSKEY="status";
	public static final String COI_DATEKEY="coi_date";
	
	private String status;
	private Double coi_date;
	
	public COI() {}
	
	public COI(String status, Double coi_date) {
		this.status = status;
		this.coi_date = coi_date;
	}
	
	public String getStatus() {
		return this.status;
	}
	
	public void setStatus(String value) {
		this.status = value;
	}
	
	public Double getCoiDate() {
		return this.coi_date;
	}
	
	public void setCoiDate(Double value) {
		this.coi_date = value;
	}
	
	public Date getCoiDateFormat() {
		if (getCoiDate() == null)
			return null;
		else
			return MyUtils.convertUnixTimeStampToDateExample(getCoiDate());		
	}
}
