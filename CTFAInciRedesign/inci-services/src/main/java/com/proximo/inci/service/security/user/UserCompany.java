/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.service.security.user;

import com.proximo.inci.DOTNCompany;
import com.proximo.inci.service.common.LookupService;

public class UserCompany {

    private String companyName;

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
    private String zip;

    public UserCompany() {
    	this("","","","","","","","","","","","");
    }

    public UserCompany(String companyName, String country, String state, String province, String city, String address1,
            String address2, String address3, String phone, String fax, String zip, String countryLong) {
        this.companyName = companyName;
        this.country = country;
        this.state = state;
        this.province = province;
        this.city = city;
        this.address1 = address1;
        this.address2 = address2;
        this.address3 = address3;
        this.phone = phone;
        this.fax = fax;
        this.zip = zip;
        this.countryLong = countryLong;
    }
    
    public UserCompany(DOTNCompany doTnCompany) {
        companyName = doTnCompany.name;
        address1 = doTnCompany.addrLine1;
        address2 = doTnCompany.addrLine2;
        address3 = doTnCompany.addrLine3;
        phone = doTnCompany.phone;
        fax = doTnCompany.fax;
        city = doTnCompany.city;
        zip = doTnCompany.zip;        
        country = doTnCompany.country;
        setStateOrProvince(country, doTnCompany.state);
        countryLong = doTnCompany.countryLong;
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

    public String getCompanyName() {
    	if (companyName != null)
    		return companyName;
    	else 
    		return "";
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCountry() {
    	if (country != null)
    		return country;
    	else 
    		return "";
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    public String getCountryLong() {
    	if (countryLong != null)
    		return countryLong;
    	else 
    		return "";
    }

    public void setCountryLong(String countryLong) {
        this.countryLong = countryLong;
    }
    

    public String getState() {
    	if (state != null)
    		return state;
    	else 
    		return "";
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getProvince() {
    	if (province != null)
    		return province;
    	else 
    		return "";
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
    	if (city != null)
    		return city;
    	else
    		return "";
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress1() {
    	if (address1 != null)
    		return address1;
    	else
    		return "";
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
    	if (address2 != null)
    		return address2;
    	else
    		return "";
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddress3() {
    	if (address3 != null)
    		return address3;
    	else	
    		return "";
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public String getPhone() {
    	if (phone != null)
    		return phone;
    	else 
    		return "";
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
    	if (fax != null)
    		return fax;
    	else 
    		return "";    	
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getZip() {
    	if (zip != null)
    		return zip;
    	else 
    		return "";
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

}
