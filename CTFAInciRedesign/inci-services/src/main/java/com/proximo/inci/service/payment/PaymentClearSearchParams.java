/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.service.payment;

public class PaymentClearSearchParams {

    private String applicationNumber;
    private String companyName;
    private String orderBy = "";
    private int ordering = 1; // 1 - asc, 2 - desc        

    public PaymentClearSearchParams(String applicationNumber, String companyName) {
        this.applicationNumber = applicationNumber;
        this.companyName = companyName;
    }

    public String getApplicationNumber() {
        return applicationNumber;
    }

    public void setApplicationNumber(String applicationNumber) {
        this.applicationNumber = applicationNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
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
