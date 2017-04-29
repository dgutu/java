/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.service.security.user;

import com.proximo.inci.common.TemplarUtil;
import com.proximo.inci.service.common.LookupService;

public class User {
    private String userRecId;

    private String loginId;

    private String firstName;
    private String lastName;
    private String userFullName;

    /*
     * TODO refactor common fields into address, that also will be used in user's
     * company.
     */
    
    /** Country code */
    private String country;
    private String countryLong;

    /* Either State (for US/Canada) or Province (Other countries) is stored */
    private String state;
    private String province;

    private String city;

    private String address1;
    private String address2;
    private String address3;

    private String phone;
    private String fax;
    private String email;
    private String zip;
    private String cst_web_login = "";

    private UserCompany userCompany;

    private boolean active = true;

    private boolean admin;

    public User() {
    		this("","","","","","","","","","","","","","","","",new UserCompany(), false, false, "");
    }

    public User(String userRecId, String loginId, String firstName, String lastName, String userFullName, String country,
            String state, String province, String city, String address1, String address2, String address3,
            String phone, String fax, String email, String zip, UserCompany userCompany, boolean active, boolean admin, String countryLong) {
        this.userRecId = userRecId;
        this.loginId = loginId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userFullName = userFullName;
        this.country = country;
        this.state = state;
        this.province = province;
        this.city = city;
        this.address1 = address1;
        this.address2 = address2;
        this.address3 = address3;
        this.phone = phone;
        this.fax = fax;
        this.email = email;
        this.zip = zip;
        this.userCompany = userCompany;
        this.active = active;
        this.admin = admin;
        this.countryLong = countryLong;
    }
    
    public String getStateOrProvince() {
        if (state != null) {
            return state;
        } else {
            return province;
        }
    }

    public void setStateOrProvince(String countryCode, String stateOrProvince) {
        if (LookupService.isCountryUsOrCanada(countryCode)) {
            setState(stateOrProvince);
            setProvince(null);
        } else {
            setProvince(stateOrProvince);
            setState(null);
        }
    }
    
    public String getCountryLong() {
    	if (!TemplarUtil.isStringNullOrEmpty(countryLong))
    		return this.countryLong;    		
    	else
    		return "";
    }
    
    public void setCountryLong(String value) {
    	this.countryLong = value;
    }

    public String getUserRecId() {
        return userRecId;
    }

    public void setUserRecId(String userRecId) {
        this.userRecId = userRecId;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserFullName() {
        return userFullName;
    }

    public void setUserFullName(String userFullName) {
        this.userFullName = userFullName;
    }

    public String getCountry() {
    	if (!TemplarUtil.isStringNullOrEmpty(country))
    		return country;
    	else
    		return "";
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
    	if (!TemplarUtil.isStringNullOrEmpty(state))
    		return state;    		
    	else
    		return "";    		
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getProvince() {
    	if (!TemplarUtil.isStringNullOrEmpty(province))
    		return province;
    	else
    		return "";
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
    	if (!TemplarUtil.isStringNullOrEmpty(city))
    		return city;    		
    	else
    		return "";    		
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress1() {
    	if (!TemplarUtil.isStringNullOrEmpty(address1))
    		return address1;
    	else
    		return "";
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
    	if (!TemplarUtil.isStringNullOrEmpty(address2))
    		return address2;
    	else
    		return "";
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddress3() {
    	if (!TemplarUtil.isStringNullOrEmpty(address3))
    		return address3;
    	else
    		return "";
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public String getPhone() {
    	if (!TemplarUtil.isStringNullOrEmpty(phone))
    		return phone;    		
    	else
    		return "";
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
    	if (!TemplarUtil.isStringNullOrEmpty(fax))
    		return fax;
    	else    		
    		return "";
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {    	
    	String tmp = this.email;
    	
    	/* trim first and last two "zz" */
    	if (!TemplarUtil.isStringNullOrEmpty(tmp))
    	{    	
	    	if (!TemplarUtil.isStringNullOrEmpty(tmp) && tmp.length() > 4 && tmp.substring(0, 2).equals("zz") && tmp.substring(tmp.length() - 2).equals("zz"))    		
	    		return tmp.substring(2, tmp.length() - 2);
	    	else
	    		return tmp;
    	}
    	else
    		return "";
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public UserCompany getUserCompany() {
        return userCompany;
    }

    public void setUserCompany(UserCompany userCompany) {
        this.userCompany = userCompany;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
    
    public void setCstWebLogin(String cst_web_login) {
    	this.cst_web_login = cst_web_login;
    }
    
    public String getCstWebLogin() {
    	return this.cst_web_login;
    }

}
