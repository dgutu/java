/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.service.security;

import java.sql.SQLException;

import javax.naming.NamingException;

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import com.avectra._2005.CustomerAddressType;
import com.avectra._2005.GetQueryResponse.GetQueryResult;
import com.avectra._2005.IndividualHomeAddressDataObjectType;
import com.avectra._2005.IndividualType;
import com.proximo.inci.AbstractServiceTest;
import com.proximo.inci.common.TemplarUtil;
import com.proximo.inci.service.netforum.NetforumService;
import com.proximo.inci.service.security.user.User;
import com.proximo.inci.service.security.user.UserSearchParams;
import com.proximo.inci.service.security.user.UserSearchResult;
import com.proximo.inci.xml.XmlUtil;

public class SecurityServiceTest {

    public static void main(String[] args) throws SQLException, NamingException {
        //testIsCstKeyValid();
        testFindUserByRecId();
    	//testFindIndividualObjects();
    }

    private static void testIsCstKeyValid() throws SQLException, NamingException {
        @SuppressWarnings("unused")
        AbstractServiceTest test = new AbstractServiceTest(true) {
            @Override
            protected void initMockJndiContext() {
                NetforumSecurityTest.initMockJndi();
            }

            @Override
            public void runTest() {
                System.out.println(SecurityService.isCstKeyValid("548ec95d-4779-48d3-a147-4c6501c0557e"));
            }
        };
    }
    
	private static String convertCountry(String country) {
		return (!TemplarUtil.isStringNullOrEmpty(country) && country.toUpperCase().equals("UNITED STATES OF AMERICA") ? "United States" : (!TemplarUtil.isStringNullOrEmpty(country) ? country : ""));
	}
    

    private static void testFindUserByRecId() throws SQLException, NamingException {
        @SuppressWarnings("unused")
        AbstractServiceTest test = new AbstractServiceTest(true) {
            @Override
            protected void initMockJndiContext() {
                NetforumSecurityTest.initMockJndi();
            }

            @Override
            public void runTest() {
            	//423d7c56-85bf-4056-bbe8-980cd43c8946
                User user = SecurityService.findUserByRecId("423d7c56-85bf-4056-bbe8-980cd43c8946");//"E9B9404C-1CA2-4EDA-808B-4BA691A0B37E");
                IndividualType individual = NetforumService.findIndividual("423d7c56-85bf-4056-bbe8-980cd43c8946");
                
                IndividualHomeAddressDataObjectType homeAddress = individual.getHomeAddress();
                //IndividualHomeAddressDataObjectType buissAddress = individual.getHomeAddressCountry().getCt2CtyCode()
                
                System.out.println(XmlUtil.extractValFromNullableStrElem(individual.getBusinessAddressCountry().getCtyCode()));
                System.out.println(individual.getBusinessAddressCountry());
                System.out.println(XmlUtil.extractValFromNullableStrElem(individual.getHomeAddressCountry().getCt2CtyCode()));
                System.out.println(individual.getHomeAddress());
                System.out.println(XmlUtil.extractValFromNullableStrElem(homeAddress.getAd2AdrCountry()));
                System.out.println(XmlUtil.extractValFromNullableStrElem(individual.getHomeAddressCountry().getCt2CtyCode()));                
                
                System.out.println(user.getFirstName());
                System.out.println(user.getLastName());
                System.out.println(user.getEmail());
                System.out.println(user.getFirstName());
                System.out.println(convertCountry(user.getCountryLong()));
                System.out.println("getCountryLong()=" + user.getCountryLong());
                System.out.println("getCountry()=" + user.getCountry());
                System.out.println("phone=" + user.getPhone());
                System.out.println("fax=" + user.getFax());
                System.out.println("email=" + user.getEmail());
                
                System.out.println(XmlUtil.extractValFromNullableStrElem(individual.getHomeFax().getFa2FaxNumberDisplay()));
                System.out.println(XmlUtil.extractValFromNullableStrElem(individual.getBusinessFax().getFaxNumberDisplay()));
                System.out.println(XmlUtil.extractValFromNullableStrElem(individual.getHomePhone().getPh2PhnNumberDisplay()));
                System.out.println(XmlUtil.extractValFromNullableStrElem(individual.getBusinessPhone().getPhnNumberDisplay()));
                
                /*String cxaKey = SecurityService.findInciAddressKey(user.getUserRecId());
                System.out.println(cxaKey);
                CustomerAddressType cstAddrType = NetforumService.findIndividualAddressByKey(cxaKey);
                System.out.println();
                
            	String tmp = "zzdgutu@proximo.comzz";
            	
            	tmp.substring(2, tmp.length() - 2);
            	
            	System.out.println(tmp.substring(2, tmp.length() - 2));*/
                
            }
        };
    }
    
    
    private static void testFindIndividualObjects() throws SQLException, NamingException {
        @SuppressWarnings("unused")
        AbstractServiceTest test = new AbstractServiceTest(true) {
            @Override
            protected void initMockJndiContext() {
                NetforumSecurityTest.initMockJndi();
            }

            @Override
            public void runTest() {
            	String indLastName = null;
            	String indFirstName = null;
            	String indEmail = null; 
            	GetQueryResult queryResult = NetforumService.findIndividualObjects(indLastName, indFirstName, indEmail);
                
            	NodeList individualNodeList = ((Element) queryResult.getContent().get(0)).getChildNodes();
            	
            	System.out.println(individualNodeList.getLength());
            	
            	UserSearchParams searchParams = new UserSearchParams(null, null, null);            	
            	
            	UserSearchResult searchResult = SecurityService.findUsers(searchParams);
            	
            	System.out.println(searchResult.getUserList().size());
            	
            	String tmp = "zzdgutu@proximo.comzz";
            	System.out.println(tmp);
            	System.out.println(tmp.length());
            	System.out.println(tmp.substring(0, 2));
            	System.out.println(tmp.substring(tmp.length() - 2));
            	
            	if (!TemplarUtil.isStringNullOrEmpty(tmp) && tmp.length() > 4 && tmp.substring(0, 2).equals("zz") && tmp.substring(tmp.length() - 2).equals("zz"))    		
            		System.out.println(tmp.substring(2, tmp.length() - 2));
            	else
            		System.out.println(tmp);
            	
            }
        };
    }    
    
    
}
