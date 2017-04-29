/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.service.security.user;

public class UserSearchParams {

    private String lastName;
    private String firstName;
    private String loginId;
    
    private String orderBy = "";
    private int ordering = 1; // 1 - asc, 2 - desc    

    public UserSearchParams(String lastName, String firstName, String loginId) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.loginId = loginId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
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