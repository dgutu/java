/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.search.params;

import java.util.Properties;
import com.proximo.inci.common.TDate;
import com.proximo.inci.common.TemplarUtil;
import com.proximo.inci.window.main.URIUtil;


public class TradenameSearchParams {
	
	private final String applicationNumberURI = "appno";
	private final String tradenameURI = "tradename";
	private final String exportstatusURI = "exportst";
	private final String companyURI = "company";
	private final String entryDtURI_Start = "entrydt_start";
	private final String entryDtURI_End = "entrydt_end";
	private final String outstandingCommentsURI = "outcomm";
	private final String respondedCommentsURI = "respcomm";
	private final String categoryURI = "category";
	private final String staffReviewDtStartURI = "staffdtst";
	private final String staffReviewDtEndURI = "staffdten";
	private final String commiteeReviewDtStartURI = "commdten";
	private final String commiteeReviewDtEndURI = "commidten";
	private final String submitionStatusURI = "substatus";
	
    private String userRecId;
    private String applicationNumber;
    private String tradename;
    private String exportStatus;
    private String company;
    private TDate entryDt_start;
    private TDate entryDt_end;
    private int categoryId;
    private TDate staffReviewDateFromDt;
    private TDate staffReviewDateToDt;
    private TDate commiteeReviewDateFromDt;
    private TDate commiteeReviewDateToDt;
    private String submissionStatus;
    private boolean commentsOutsd = false;;
    private boolean commentsRespond = false;
    
    private String orderBy;
    private int ordering = 1; // 1 - asc, 2 - desc

    public TradenameSearchParams(String userRecId, String applicationNumber, String tradename, String exportStatus,
            String company, TDate entryDt_start, TDate entryDt_end, boolean commentsOutsd, boolean commentsRespond, int categoryId,
            TDate staffReviewDateFromDt, TDate staffReviewDateToDt, TDate commiteeReviewDateFromDt,
            TDate commiteeReviewDateToDt, String submissionStatus, String orderBy, int ordering) {
        this.userRecId = userRecId;
        this.applicationNumber = applicationNumber;
        this.tradename = tradename;
        this.exportStatus = exportStatus;
        this.company = company;
        this.entryDt_start = entryDt_start;
        this.entryDt_end = entryDt_end;
        this.commentsOutsd = commentsOutsd;
        this.commentsRespond = commentsRespond;
        this.categoryId = categoryId;
        this.staffReviewDateFromDt = staffReviewDateFromDt;
        this.staffReviewDateToDt = staffReviewDateToDt;
        this.commiteeReviewDateFromDt = commiteeReviewDateFromDt;
        this.commiteeReviewDateToDt = commiteeReviewDateToDt;
        this.submissionStatus = submissionStatus;
        this.orderBy = orderBy;
        this.ordering = ordering;
    }

    public TradenameSearchParams() {
	}

	public String getApplicationNumber() {
        return applicationNumber;
    }

    public void setApplicationNumber(String applicationNumber) {
        this.applicationNumber = applicationNumber;
    }

    public String getTradename() {
        return tradename;
    }

    public void setTradename(String tradename) {
        this.tradename = tradename;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getSubmissionStatus() {
        return submissionStatus;
    }

    public void setSubmissionStatus(String submissionStatus) {
        this.submissionStatus = submissionStatus;
    }

    public TDate getEntryDt_start() {
        return entryDt_start;
    }

    public void setEntryDt_start(TDate entryDt_start) {
        this.entryDt_start = entryDt_start;
    }
    
    public TDate getEntryDt_end() {
        return entryDt_end;
    }

    public void setEntryDt_end(TDate entryDt_end) {
        this.entryDt_end = entryDt_end;
    }    

    public String getUserRecId() {
        return userRecId;
    }

    public void setUserRecId(String userRecId) {
        this.userRecId = userRecId;
    }

    public boolean isCommentsOutsd() {
        return commentsOutsd;
    }

    public void setCommentsOutsd(boolean commentsOutsd) {
        this.commentsOutsd = commentsOutsd;
    }

    public boolean isCommentsRespond() {
        return commentsRespond;
    }

    public void setCommentsRespond(boolean commentsRespond) {
        this.commentsRespond = commentsRespond;
    }

    public String getExportStatus() {
        return exportStatus;
    }

    public void setExportStatus(String exportStatus) {
        this.exportStatus = exportStatus;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public TDate getStaffReviewDateFromDt() {
        return staffReviewDateFromDt;
    }

    public void setStaffReviewDateFromDt(TDate staffReviewDateFromDt) {
        this.staffReviewDateFromDt = staffReviewDateFromDt;
    }

    public TDate getStaffReviewDateToDt() {
        return staffReviewDateToDt;
    }

    public void setStaffReviewDateToDt(TDate staffReviewDateToDt) {
        this.staffReviewDateToDt = staffReviewDateToDt;
    }

    public TDate getCommiteeReviewDateFromDt() {
        return commiteeReviewDateFromDt;
    }

    public void setCommiteeReviewDateFromDt(TDate commiteeReviewDateFromDt) {
        this.commiteeReviewDateFromDt = commiteeReviewDateFromDt;
    }

    public TDate getCommiteeReviewDateToDt() {
        return commiteeReviewDateToDt;
    }

    public void setCommiteeReviewDateToDt(TDate commiteeReviewDateToDt) {
        this.commiteeReviewDateToDt = commiteeReviewDateToDt;
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
    
    public String getParametersURI() {
    	String result = "~";
    	
    	// application Number
    	if (!TemplarUtil.isStringNullOrEmpty(applicationNumber))
    		result += applicationNumberURI + "=" + applicationNumber + "~";
    	
    	// trade name
    	if (!TemplarUtil.isStringNullOrEmpty(tradename))
    		result += tradenameURI + "=" + tradename + "~";
    	
    	// staff review
    	if (!TemplarUtil.isStringNullOrEmpty(exportStatus))
    		result += exportstatusURI + "=" + exportStatus + "~";

    	// company
    	if (!TemplarUtil.isStringNullOrEmpty(company))
    		result += companyURI + "=" + company + "~";
    	
    	// creation date, entry date start
    	if (entryDt_start != null && !entryDt_start.isNull())
    		result += entryDtURI_Start + "=" + entryDt_start.getInternalFormat() + "~";
    	
    	// creation date, entry date end
    	if (entryDt_end != null && !entryDt_end.isNull())
    		result += entryDtURI_End + "=" + entryDt_end.getInternalFormat() + "~";    	
    	
    	// outstanding comments
    	result += outstandingCommentsURI + "=" + (commentsOutsd == true ? "Y" : "N") + "~";
    	
    	// responded comments
    	result += respondedCommentsURI + "=" + (commentsRespond == true ? "Y" : "N") + "~";

    	// category
    	result += categoryURI + "=" + String.valueOf(categoryId) + "~";
    	
    	// printed staff review date start
    	if (staffReviewDateFromDt != null && !staffReviewDateFromDt.isNull())
    		result += staffReviewDtStartURI + "=" + staffReviewDateFromDt.getInternalFormat() + "~";
    	
    	// printed staff review date end
    	if (staffReviewDateToDt != null && !staffReviewDateToDt.isNull())
    		result += staffReviewDtEndURI + "=" + staffReviewDateToDt.getInternalFormat() + "~";
    	
    	// anticipated committee review date start
    	if (commiteeReviewDateFromDt != null && !commiteeReviewDateFromDt.isNull())
    		result += commiteeReviewDtStartURI + "=" + commiteeReviewDateFromDt.getInternalFormat() + "~";    	
    	
    	// anticipated committee review date end
    	if (commiteeReviewDateToDt != null && !commiteeReviewDateToDt.isNull())
    		result += commiteeReviewDtEndURI + "=" + commiteeReviewDateToDt.getInternalFormat() + "~";    	
    	
    	// submition status
    	if (!TemplarUtil.isStringNullOrEmpty(submissionStatus))
    		result += submitionStatusURI + "=" + submissionStatus + "~";    	
    	
    	return result;
    }

	public void fillSearchParamByURIString(String fragment, String userRecId) {
		// parameters
		Properties prop = new Properties();
		prop = URIUtil.fillSearchParamByURIString(fragment);
		
		// set parameters
		setSearchParameter(prop);
		
		// set userRecID
		this.userRecId = userRecId;
	}
	
	public void setSearchParameter(Properties prop) {
		if (prop.getProperty(applicationNumberURI) != null)
			applicationNumber = prop.getProperty(applicationNumberURI);
		
		if (prop.getProperty(tradenameURI) != null)
			tradename = prop.getProperty(tradenameURI);
		
		if (prop.getProperty(exportstatusURI) != null)
			exportStatus = prop.getProperty(exportstatusURI);
		
		if  (prop.getProperty(companyURI) != null)
			company = prop.getProperty(companyURI);
		
		if (prop.getProperty(entryDtURI_Start) != null)
			entryDt_start = new TDate(prop.getProperty(entryDtURI_Start));
		
		if (prop.getProperty(entryDtURI_End) != null)
			entryDt_end = new TDate(prop.getProperty(entryDtURI_End));		
		
		if (prop.getProperty(categoryURI) != null)
			categoryId = (int) Integer.valueOf(prop.getProperty(categoryURI));
		
		if (prop.getProperty(staffReviewDtStartURI) != null)
			staffReviewDateFromDt = new TDate(prop.getProperty(staffReviewDtStartURI));
		
		if (prop.getProperty(staffReviewDtEndURI) != null)
			staffReviewDateToDt = new TDate(prop.getProperty(staffReviewDtEndURI));
		
		if (prop.getProperty(commiteeReviewDtStartURI) != null)
			commiteeReviewDateFromDt = new TDate(prop.getProperty(commiteeReviewDtStartURI));
		
		if (prop.getProperty(commiteeReviewDtEndURI) != null)
			commiteeReviewDateToDt = new TDate(prop.getProperty(commiteeReviewDtEndURI));
		
		if (prop.getProperty(submitionStatusURI) != null)
			submissionStatus = prop.getProperty(submitionStatusURI);
		
		if (prop.getProperty(outstandingCommentsURI) != null)
			commentsOutsd = (prop.getProperty(outstandingCommentsURI).equalsIgnoreCase("Y") ? true : false);
		
		if (prop.getProperty(respondedCommentsURI) != null)
			commentsRespond = (prop.getProperty(respondedCommentsURI).equalsIgnoreCase("Y") ? true : false);		
	}

}
