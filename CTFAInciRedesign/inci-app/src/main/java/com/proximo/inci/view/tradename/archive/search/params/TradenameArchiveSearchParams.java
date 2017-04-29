/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.archive.search.params;

import java.util.Properties;

import com.proximo.inci.DOTradeName;
import com.proximo.inci.common.TDate;
import com.proximo.inci.common.TemplarUtil;
import com.proximo.inci.window.main.URIUtil;

public class TradenameArchiveSearchParams {
	
	private final String tradenameURI = "tradename";
	private final String categoryURI = "category";
	private final String companyURI = "company";
	
	private final String applicationNumberURI = "appno";
	private final String assignDtStartURI = "assigndtst";
	private final String assignDtEndURI = "assigndten";
	
	private DOTradeName formTn;
    private String userRecId;
    
    private String orderBy = "";
    private int ordering = 1; // 1 - asc, 2 - desc
    

    public TradenameArchiveSearchParams(DOTradeName formTn, String userRecId) {
        this.formTn = formTn;
        this.userRecId = userRecId;
    }

    public TradenameArchiveSearchParams() {
	}

	public DOTradeName getFormTn() {
        return formTn;
    }

    public void setFormTn(DOTradeName formTn) {
        this.formTn = formTn;
    }

    public String getUserRecId() {
        return userRecId;
    }

    public void setUserRecId(String userRecId) {
        this.userRecId = userRecId;
    }
    
    public String getParametersURI() {
    	String result = "~";
    	
    	// application Number
    	if (!TemplarUtil.isStringNullOrEmpty(formTn.tnNumber))
    		result += applicationNumberURI + "=" + formTn.tnNumber + "~";
    	
    	// trade name
    	if (!TemplarUtil.isStringNullOrEmpty(formTn.tradeName))
    		result += tradenameURI + "=" + formTn.tradeName + "~";
    	
    	// category
    	result += categoryURI + "=" + String.valueOf(formTn.categoryID) + "~";    	

    	// company
    	if (!TemplarUtil.isStringNullOrEmpty(formTn.pubCompany.name))
    		result += companyURI + "=" + formTn.pubCompany.name + "~";
    	
    	// assignmanet date from start
    	if (!formTn.inciNameDt.isNull())
    		result += assignDtStartURI + "=" + formTn.inciNameDt.getInternalFormat() + "~";
    	
    	// assignmanet date to start
    	if (!formTn.submitDt.isNull())
    		result += assignDtEndURI + "=" + formTn.submitDt.getInternalFormat() + "~";
    	
    	return result;
    }

	public void fillSearchParamByURIString(String fragment, String userRecId) {
		// get parameters properties
		Properties prop = new Properties();
		prop = URIUtil.fillSearchParamByURIString(fragment);
		
		// create new instance of the class 
		DOTradeName formTn = new DOTradeName(); 
		
		if (prop.getProperty(applicationNumberURI) != null)
			formTn.tnNumber = prop.getProperty(applicationNumberURI);
		
		if (prop.getProperty(tradenameURI) != null) 
			formTn.tradeName = prop.getProperty(tradenameURI);		
		
		if (prop.getProperty(categoryURI) != null) 
			formTn.categoryID = (int) Integer.valueOf(prop.getProperty(categoryURI));
		
		if (prop.getProperty(companyURI) != null)
			formTn.pubCompany.name = prop.getProperty(companyURI);
		
		if (prop.getProperty(assignDtStartURI) != null)
			formTn.inciNameDt = new TDate(prop.getProperty(assignDtStartURI));
		
		if (prop.getProperty(assignDtEndURI) != null)
			formTn.submitDt = new TDate(prop.getProperty(assignDtEndURI));
		
		// set new formTn 
		this.formTn = formTn;
		
		// set user id
		this.userRecId = userRecId;
	}
	
    public void setOrderBy(String orderBy) {
    	this.orderBy = orderBy;
    }
    
    public String getOrderBy() {
    	return orderBy;
    }
    
    public void setOrdering(int ordering) {
    	this.ordering = ordering;
    }
    
    public int getOrdering() {
    	return this.ordering;
    }	
	
	
}
