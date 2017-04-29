/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/


package com.proximo.inci;

import com.proximo.inci.common.DODataRecord;
import com.proximo.inci.common.TDate;

public class DOCMSText extends DODataRecord {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long cmsUID;
	private String cmsTitle;
	private String cmsText;
	private TDate cmsCreated;
	private TDate cmsModified;
	
	public DOCMSText() {
		super();
		Clear();
	}
	
	public void Clear() {
		this.cmsUID = 0l;
		this.cmsTitle = "";
		this.cmsText = "";
		this.cmsCreated = new TDate(TDate.getNullDateObject());
		this.cmsModified = new TDate(TDate.getNullDateObject());
	}
	
	public Object Clone() {
		DOCMSText doCMSText = (DOCMSText) super.clone();
		doCMSText.cmsUID = this.cmsUID;
		doCMSText.cmsTitle = this.cmsTitle;
		doCMSText.cmsText = this.cmsText;
		doCMSText.cmsCreated = this.cmsCreated;
		doCMSText.cmsModified = this.cmsModified;
		return doCMSText;
	}
	
	public long getCMSUid () {
		return this.cmsUID;
	}
	
	public String getCMSTitle () {
		return this.cmsTitle;
	}
	
	public String getCMSText () {
		return this.cmsText;
	}
	
	public TDate getCMSCreated () {
		return this.cmsCreated;
	}
	
	public TDate getCMSModified () {
		return this.cmsModified;
	}
	
	public void setCMSUid (long cmsUID) {
		this.cmsUID = cmsUID;
	}
	
	public void setCMSTitle (String cmsTitle) {
		this.cmsTitle = cmsTitle;
	}
	
	public void setCMSText (String cmsText) {
		this.cmsText = cmsText;
	}
	
	public void setCMSCreated (TDate cmsCreated) {
		this.cmsCreated = cmsCreated;
	}
	
	public void setCMSModified (TDate cmsModified) {
		this.cmsModified = cmsModified;
	}
}
