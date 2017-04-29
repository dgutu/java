/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.service.payment;

import com.proximo.inci.common.TDate;

public class CCTransactionsReportParams {

    private TDate transactionStartDt;
    private TDate transactionEndDt;
    private double amountMin;
    private double amountMax;
    private String searchStr;
    private String logon;
    private String userCompanyName;
    
    private String orderBy = "";
    private int ordering = 1; // 1 - asc, 2 - desc       
    
    public final String transactionStartDtURI = "trstartdt";
    public final String transactionEndDtURI = "trenddt";
    public final String logonURI = "logon";
    public final String pubCompURI = "pubcomp";
    public final String searchURI = "str";    

    public CCTransactionsReportParams(TDate transactionStartDt, TDate transactionEndDt, double amountMin,
            double amountMax, String searchStr, String logon, String userCompanyName) {
        this.transactionStartDt = transactionStartDt;
        this.transactionEndDt = transactionEndDt;
        this.amountMin = amountMin;
        this.amountMax = amountMax;
        this.searchStr = searchStr;
        this.logon = logon;
        this.userCompanyName = userCompanyName;
    }

    public CCTransactionsReportParams() {
        this.transactionStartDt = new TDate();
        this.transactionEndDt = new TDate();
        this.amountMin = 0;
        this.amountMax = 0;
        this.searchStr = "";
        this.logon = "";
        this.userCompanyName = "";
	}

	public TDate getTransactionStartDt() {
        return transactionStartDt;
    }

    public void setTransactionStartDt(TDate transactionStartDt) {
        this.transactionStartDt = transactionStartDt;
    }

    public TDate getTransactionEndDt() {
        return transactionEndDt;
    }

    public void setTransactionEndDt(TDate transactionEndDt) {
        this.transactionEndDt = transactionEndDt;
    }

    public double getAmountMin() {
        return amountMin;
    }

    public void setAmountMin(double amountMin) {
        this.amountMin = amountMin;
    }

    public double getAmountMax() {
        return amountMax;
    }

    public void setAmountMax(double amountMax) {
        this.amountMax = amountMax;
    }

    public String getSearchStr() {
        return searchStr;
    }

    public void setSearchStr(String searchStr) {
        this.searchStr = searchStr;
    }
    
    public String getLogon() {
    	return logon;
    }
    
    public void setLogon(String logon) {
    	this.logon = logon;
    }
    
    public String getUserCompanyName() {
    	return this.userCompanyName;
    }
    
    public void setUserCompanyName(String userCompanyName) {
    	this.userCompanyName = userCompanyName;
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
