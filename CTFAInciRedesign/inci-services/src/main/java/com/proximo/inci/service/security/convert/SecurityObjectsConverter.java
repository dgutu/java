/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.service.security.convert;

import java.util.ArrayList;
import java.util.List;

//import javax.xml.bind.JAXBElement;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.avectra._2005.GetQueryResponse.GetQueryResult;
import com.avectra._2005.IndividualBusinessAddressDataObjectType;
//import com.avectra._2005.IndividualHomeAddressDataObjectType;
import com.avectra._2005.IndividualType;
//import com.proximo.inci.common.TemplarUtil;
import com.proximo.inci.service.security.SecurityService;
import com.proximo.inci.service.security.user.User;
import com.proximo.inci.service.security.user.UserCompany;
import com.proximo.inci.xml.XmlUtil;

public class SecurityObjectsConverter {

    /** Not intended to be instantiated. Exposed only static members. */
    private SecurityObjectsConverter() {
    }

    public static User convertToUser(IndividualType individualType) {
        User user = new User();

        // Netforum stores only regular users
        user.setAdmin(false);

        user.setUserRecId(XmlUtil.extractValFromNullableStrElem(individualType.getIndividual().getIndCstKey()));

        String emailAddress = XmlUtil.extractValFromNullableStrElem(individualType.getEmail().getEmlAddress());
        user.setEmail(emailAddress);
        user.setLoginId(emailAddress);

        user.setFirstName(XmlUtil.extractValFromNullableStrElem(individualType.getIndividual().getIndFirstName()));
        user.setLastName(XmlUtil.extractValFromNullableStrElem(individualType.getIndividual().getIndLastName()));
        user.setUserFullName(XmlUtil.extractValFromNullableStrElem(individualType.getIndividual().getIndFullNameCp()));

        /*String userCountryCode = XmlUtil.extractValFromNullableStrElem(individualType.getHomeAddressCountry().getCt2CtyCode());
        user.setCountry(userCountryCode);
        String countryLong = XmlUtil.extractValFromNullableStrElem(individualType.getHomeAddressCountry().getCt2CtyLongName());
        user.setCountryLong(countryLong);

        IndividualHomeAddressDataObjectType homeAddress = individualType.getHomeAddress();
        user.setStateOrProvince(userCountryCode, XmlUtil.extractValFromNullableStrElem(individualType.getHomeAddress().getAd2AdrState()));
        user.setCity(XmlUtil.extractValFromNullableStrElem(homeAddress.getAd2AdrCity()));
        user.setAddress1(XmlUtil.extractValFromNullableStrElem(homeAddress.getAd2AdrLine1()));
        user.setAddress2(XmlUtil.extractValFromNullableStrElem(homeAddress.getAd2AdrLine2()));
        user.setAddress3(XmlUtil.extractValFromNullableStrElem(homeAddress.getAd2AdrLine3()));
        user.setZip(XmlUtil.extractValFromNullableStrElem(homeAddress.getAd2AdrPostCode()));

        // fax
        if (!TemplarUtil.isStringNullOrEmpty(XmlUtil.extractValFromNullableStrElem(individualType.getHomeFax().getFa2FaxNumberDisplay())))
        	user.setFax(XmlUtil.extractValFromNullableStrElem(individualType.getHomeFax().getFa2FaxNumberDisplay()));
        else
        	user.setFax(XmlUtil.extractValFromNullableStrElem(individualType.getBusinessFax().getFaxNumberDisplay()));
        
        // phone
        if (!TemplarUtil.isStringNullOrEmpty(XmlUtil.extractValFromNullableStrElem(individualType.getHomePhone().getPh2PhnNumberDisplay())))
        	user.setPhone(XmlUtil.extractValFromNullableStrElem(individualType.getHomePhone().getPh2PhnNumberDisplay()));
        else
        	user.setPhone(XmlUtil.extractValFromNullableStrElem(individualType.getBusinessPhone().getPhnNumberDisplay()));*/
                
        // user company
        user.setUserCompany(extractUserCompany2(individualType));

        return user;
    }

	private static UserCompany extractUserCompany(IndividualType individualType) {
        UserCompany userCompany = new UserCompany();

        userCompany.setCompanyName(XmlUtil.extractValFromNullableStrElem(individualType.getOrganization().getOrgName()));

        /*System.out.println("Country getCtyCode="+individualType.getBusinessAddressCountry().getCtyCode());
        System.out.println("Country getCtyLongName="+individualType.getBusinessAddressCountry().getCtyLongName());
        System.out.println("Country getCtyCapital="+individualType.getBusinessAddressCountry().getCtyCapital());*/
        String userCompanyCountryCode = XmlUtil.extractValFromNullableStrElem(individualType.getBusinessAddressCountry().getCtyIso2());
        userCompany.setCountry(userCompanyCountryCode);
        
        String countryLong = XmlUtil.extractValFromNullableStrElem(individualType.getBusinessAddress().getAdrCountry());
        userCompany.setCountryLong(countryLong);

        IndividualBusinessAddressDataObjectType businessAddress = individualType.getBusinessAddress();
        userCompany.setStateOrProvince(userCompanyCountryCode, XmlUtil.extractValFromNullableStrElem(businessAddress.getAdrIntlProvince()));
        userCompany.setCity(XmlUtil.extractValFromNullableStrElem(businessAddress.getAdrCity()));
        userCompany.setAddress1(XmlUtil.extractValFromNullableStrElem(businessAddress.getAdrLine1()));
        userCompany.setAddress2(XmlUtil.extractValFromNullableStrElem(businessAddress.getAdrLine2()));
        userCompany.setAddress3(XmlUtil.extractValFromNullableStrElem(businessAddress.getAdrLine3()));
        userCompany.setZip(XmlUtil.extractValFromNullableStrElem(businessAddress.getAdrPostCode()));

        userCompany.setFax(XmlUtil.extractValFromNullableStrElem(individualType.getBusinessFax().getFaxNumberDisplay()));
        userCompany.setPhone(XmlUtil.extractValFromNullableStrElem(individualType.getBusinessPhone().getPhnNumberDisplay()));

        return userCompany;
    }
    
    @SuppressWarnings("unused")
	private static UserCompany extractUserCompany2(IndividualType individualType) {
        UserCompany userCompany = new UserCompany();

        userCompany.setCompanyName(XmlUtil.extractValFromNullableStrElem(individualType.getOrganization().getOrgName()));

        /*System.out.println("Country getCtyCode="+individualType.getBusinessAddressCountry().getCtyCode());
        System.out.println("Country getCtyLongName="+individualType.getBusinessAddressCountry().getCtyLongName());
        System.out.println("Country getCtyCapital="+individualType.getBusinessAddressCountry().getCtyCapital());*/
        /*String userCompanyCountryCode = XmlUtil.extractValFromNullableStrElem(individualType.getBusinessAddressCountry().getCtyIso2());
        userCompany.setCountry(userCompanyCountryCode);
        
        String countryLong = XmlUtil.extractValFromNullableStrElem(individualType.getBusinessAddress().getAdrCountry());
        userCompany.setCountryLong(countryLong);

        IndividualBusinessAddressDataObjectType businessAddress = individualType.getBusinessAddress();
        userCompany.setStateOrProvince(userCompanyCountryCode, XmlUtil.extractValFromNullableStrElem(businessAddress.getAdrIntlProvince()));
        userCompany.setCity(XmlUtil.extractValFromNullableStrElem(businessAddress.getAdrCity()));
        userCompany.setAddress1(XmlUtil.extractValFromNullableStrElem(businessAddress.getAdrLine1()));
        userCompany.setAddress2(XmlUtil.extractValFromNullableStrElem(businessAddress.getAdrLine2()));
        userCompany.setAddress3(XmlUtil.extractValFromNullableStrElem(businessAddress.getAdrLine3()));
        userCompany.setZip(XmlUtil.extractValFromNullableStrElem(businessAddress.getAdrPostCode()));

        userCompany.setFax(XmlUtil.extractValFromNullableStrElem(individualType.getBusinessFax().getFaxNumberDisplay()));
        userCompany.setPhone(XmlUtil.extractValFromNullableStrElem(individualType.getBusinessPhone().getPhnNumberDisplay()));*/

        return userCompany;
    }    

    public static List<User> convertIndividualGetQueryResultToUserList(GetQueryResult getQueryResult) {
        List<User> userList = new ArrayList<User>();

        NodeList individualNodeList = ((Element) getQueryResult.getContent().get(0)).getChildNodes();
        for (int i = 0; i < individualNodeList.getLength(); i++) {
            Node individualNode = individualNodeList.item(i);
            User user = new User();
            UserCompany userCompany = new UserCompany();
            NodeList individualFieldsNodeList = individualNode.getChildNodes();
            for (int j = 0; j < individualFieldsNodeList.getLength(); j++) {
                Node indidvidualFieldNode = individualFieldsNodeList.item(j);

                if ("ind_cst_key".equals(indidvidualFieldNode.getNodeName())) {
                    user.setUserRecId(indidvidualFieldNode.getTextContent());
                } else if ("eml_address".equals(indidvidualFieldNode.getNodeName())) {
                    user.setLoginId(indidvidualFieldNode.getTextContent());
                    user.setEmail(indidvidualFieldNode.getTextContent());
                } else if ("ind_full_name_cp".equals(indidvidualFieldNode.getNodeName())) {
                    user.setUserFullName(indidvidualFieldNode.getTextContent());
                /*} else if ("phn_number_display".equals(indidvidualFieldNode.getNodeName())) {
                    user.setPhone(indidvidualFieldNode.getTextContent());*/                    
                } else if ("ind_first_name".equals(indidvidualFieldNode.getNodeName())) {
                	user.setFirstName(indidvidualFieldNode.getTextContent());
            	} else if ("ind_last_name".equals(indidvidualFieldNode.getNodeName())) {
            		user.setLastName(indidvidualFieldNode.getTextContent());
            	} else if ("cst_web_login".equals(indidvidualFieldNode.getNodeName())) {
            		user.setCstWebLogin(indidvidualFieldNode.getTextContent());
            	}                
                else if ("org_name".equals(indidvidualFieldNode.getNodeName())) {
                    userCompany.setCompanyName(indidvidualFieldNode.getTextContent());
                }
                /*else if ("adr_line1".equals(indidvidualFieldNode.getNodeName())) {
                	userCompany.setAddress1(indidvidualFieldNode.getTextContent());
                }
                else if ("adr_line2".equals(indidvidualFieldNode.getNodeName())) {
                	userCompany.setAddress2(indidvidualFieldNode.getTextContent());
                }
                else if ("adr_line3".equals(indidvidualFieldNode.getNodeName())) {
                	userCompany.setAddress3(indidvidualFieldNode.getTextContent());
                }
                else if ("adr_city".equals(indidvidualFieldNode.getNodeName())) {
                	userCompany.setCity(indidvidualFieldNode.getTextContent());
                }
                else if ("adr_state".equals(indidvidualFieldNode.getNodeName())) {
                	userCompany.setState(indidvidualFieldNode.getTextContent());
                }
                else if ("adr_country".equals(indidvidualFieldNode.getNodeName())) {
                	userCompany.setCountry(indidvidualFieldNode.getTextContent());
                }*/
                
                user.setUserCompany(userCompany);
            }            
   			// set user address
			SecurityService.setUserInciAddress(user);
			
			// set user phone
			SecurityService.setUserInciPhone(user);
			
			// set user fax
			SecurityService.setUserInciFax(user);     
			
            userList.add(user);
        }

        return userList;
    }

}
