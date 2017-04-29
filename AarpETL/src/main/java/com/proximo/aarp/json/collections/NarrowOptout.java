package com.proximo.aarp.json.collections;

import com.proximo.aarp.util.MyUtils;
import java.util.Date;

public class NarrowOptout {
    
	public final static String CONTRACT_IDKEY = "contract_id";
	public final static String OPTOUT_DATEKEY = "optout_date";
	public final static String CHALLENGE_IDKEY = "challenge_id";
	
	private Float contract_id;
	private Double optout_date;
	private Float challenge_id;
	
	public NarrowOptout() {}
	
	public NarrowOptout(Float contract_id, Double optout_date, Float challenge_id) {
		this .contract_id = contract_id;
		this.optout_date = optout_date;
		this.challenge_id = challenge_id;
	}
	
	public Float getContractId() {
		return this.contract_id;
	}
	
	public void setContractId(Float value) {
		this.contract_id = value;
	}	
	
	public Double getOptoutDate() {
		return this.optout_date;
	}
	
	public void setOptoutDate(Double value) {
		this.optout_date = value;
	}	
	
	public Float getChallengeId() {
		return this.challenge_id;
	}
	
	public void setChallengeId(Float value) {
		this.challenge_id = value;
	}	
	
	public Date getOptoutDateFormat() {
		if (getOptoutDate() == null)
			return null;
		else
			return MyUtils.convertUnixTimeStampToDateExample(getOptoutDate());
	}
}
