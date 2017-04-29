/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.service.security;

import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.xml.ws.Holder;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.avectra._2005.AuthorizationToken;
//import com.avectra._2005.GetQuery;
//import com.avectra._2005.IndividualType;
import com.avectra._2005.CustomerAddressType;
import com.avectra._2005.IndividualType;
import com.avectra._2005.NetForumXML;
import com.avectra._2005.NetForumXMLSoap;
import com.avectra._2005.WEBAddressGetAddressesByCustomerResponse.WEBAddressGetAddressesByCustomerResult;
//import com.avectra._2005.GetQueryResponse.GetQueryResult;
import com.proximo.inci.AbstractServiceTest;
//import com.proximo.inci.jndi.InitialContextFactoryForTest;
//import com.proximo.inci.service.netforum.NetforumService;
//import com.proximo.inci.service.security.convert.SecurityObjectsConverter;
import com.proximo.inci.service.netforum.NetforumService;
import com.proximo.inci.service.security.convert.SecurityObjectsConverter;
import com.proximo.inci.service.security.user.User;
import com.proximo.inci.service.security.user.UserSearchParams;
import com.proximo.inci.service.security.user.UserSearchResult;
import com.proximo.inci.xml.XmlUtil;

public class AdminUserSecurityServiceTest {

    public static void main(String[] args) throws SQLException, NamingException {
        testGetAdminUser();
    }

    public static boolean isStringNullOrEmpty(String s) {        	
    	if (s == null)
    		return true;
    	else if (s.equals(""))
    		return true;
    	else if (s.isEmpty())
    		return true;
    	else
    		return false;
    	
    	//return !(s!=null && !s.isEmpty() && !s.equals(""));
    }

    
    private static void testGetAdminUser() throws SQLException, NamingException {
        @SuppressWarnings("unused")
        AbstractServiceTest test = new AbstractServiceTest(true) {
            @Override
            public void runTest() {
            	
                //final String NETFORUM_USERNAME = "Proximoxweb";
                //final String NETFORUM_PASSWORD = "xwebProximo";
            	
                //User adminUser = AdminUserSecurityService.getAdminUser();
                //System.out.println(adminUser.getUserRecId());
                
                
                
                //InitialContextFactoryForTest.bind(NetforumService.JNDI_NETFORUM_USERNAME, NETFORUM_USERNAME);
                //InitialContextFactoryForTest.bind(NetforumService.JNDI_NETFORUM_PASSWORD, NETFORUM_PASSWORD);               
            
                NetforumSecurityTest.initMockJndi();
                
                UserSearchParams searchParams = new UserSearchParams("koter", "donn", "donn");
                
                NetForumXMLSoap netForumXmlSoapPort=null;
                NetForumXML netForumXml = new NetForumXML();
                netForumXmlSoapPort = netForumXml.getNetForumXMLSoap();
                
                String JNDI_NETFORUM_USERNAME = "java:comp/env/netforum/username";
                String JNDI_NETFORUM_PASSWORD = "java:comp/env/netforum/password";
                Holder<AuthorizationToken> authTokenHolder = new Holder<AuthorizationToken>();
                
                try
                {
                Context ctx = new InitialContext();
                String netforumXmlUsername = (String) ctx.lookup(JNDI_NETFORUM_USERNAME);
                String netforumXmlPassword = (String) ctx.lookup(JNDI_NETFORUM_PASSWORD);
                netForumXmlSoapPort.authenticate(netforumXmlUsername, netforumXmlPassword, authTokenHolder);
                }
                catch(Exception e)
                {
                	System.out.println(e.getMessage());
                }
  
                System.out.println(authTokenHolder.toString());
                
                
                //GetQueryResult r = netForumXmlSoapPort.getQuery("Individual",
                //        "*", "1=1 and upper(ind_last_name) like upper('%nagy%')", null,
                //        /*generateAuthTokenHolder()*/authTokenHolder);                
                
                // UserSearchResult searchResult = new UserSearchResult (SecurityObjectsConverter.convertIndividualGetQueryResultToUserList(r));
                
                //UserSearchResult searchResult = SecurityService.findUsers(searchParams);
                
                
                //IndividualType in = netForumXmlSoapPort.webIndividualGet("548ec95d-4779-48d3-a147-4c6501c0557e", authTokenHolder);
                
                //User user = SecurityObjectsConverter.convertToUser(NetforumService.findIndividual("548ec95d-4779-48d3-a147-4c6501c0557e"));
                //User user = SecurityObjectsConverter.convertToUser(in);
                
                //System.out.println(user.getLoginId());
                
                //UserSearchResult searchResult = SecurityService.findUsers(searchParams);
                
                
                //User usr = SecurityService.findUserByRecId("ADMIN");
                
                //System.out.println(usr.getFirstName());
                
                //UserSearchResult searchResult = new UserSearchResult (SecurityObjectsConverter.convertIndividualGetQueryResultToUserList(r));//SecurityService.findUsers(searchParams);
                
               
                
                //GetQueryResult getQueryResult = NetforumService.findIndividualObjects(searchParams.getLastName(),
                //        searchParams.getFirstName(), searchParams.getLoginId());
                
                
                /*User user = SecurityObjectsConverter.convertToUser(NetforumService.findIndividual("548ec95d-4779-48d3-a147-4c6501c0557e"));
                
                IndividualType ind = NetforumService.findIndividual("548ec95d-4779-48d3-a147-4c6501c0557e");
                
                System.out.println(user.getFirstName());
                System.out.println(user.getLastName());
                System.out.println(user.getLoginId());
                System.out.println(user.getEmail());
                System.out.println(user.getAddress1());
                System.out.println(user.getAddress2());
                System.out.println(user.getAddress3());
                
                System.out.println("-------------------------");*/
                
                //System.out.println(ind.getHomeAddress().getAd2AdrCity().toString());
                //System.out.println(ind.getHomeAddress().getAd2AdrCity().toString());
                UserSearchResult searchResult2 = SecurityService.findUsersByLogonCompanyName("zzgnagy@proximo.comzz","");
                for (int i=0;i<searchResult2.getUserList().size();i++)
                {
                	User user = null;
                	user = (User) searchResult2.getUserList().get(i);
                	
                	System.out.printf("CST_KEY=%s\tLogin=%s\tFirst Name=%s\tLast Name=%s\tCompany=%s\n", user.getUserRecId(), user.getLoginId(), user.getFirstName(), user.getLastName(), user.getUserCompany().getCompanyName().toString());
                }
                
                
                System.out.println("new method\n");
                UserSearchParams searchParams3 = new UserSearchParams("", "", "zzgnagy@proximo.comzz");                
                UserSearchResult searchResult3 = SecurityService.findUsers(searchParams3);
                User user = null;
                for (int i=0;i<searchResult3.getUserList().size();i++)
                {
                	
                	user = (User) searchResult3.getUserList().get(i);
                	
                	System.out.printf("CST_KEY=%s\n" +
                					  "Login=%s\n" +
                					  "First Name=%s\n" +
                					  "Last Name=%s\n" +
                					  "Company=%s\n" +
                					  "Company Address=%s\n" +
                					  "User Address=%s\n", 
                			user.getUserRecId(), 
                			user.getLoginId(), 
                			user.getFirstName(), 
                			user.getLastName(), 
                			user.getUserCompany().getCompanyName().toString(),
                			user.getUserCompany().getAddress1().toString() + "<->" +
                			user.getUserCompany().getAddress2().toString() + "<->" +
                			user.getUserCompany().getAddress3().toString(),
                			user.getAddress1().toString() + "<->" + user.getAddress2().toString() + "<->" + user.getAddress3().toString()                			
                			);
                }
                
                System.out.println("=========================\n");
                
                WEBAddressGetAddressesByCustomerResult searchResult4 = NetforumService.findIndividualAddresses(user.getUserRecId());

                NodeList resultNodeList4 = ((Element) searchResult4.getContent().get(0)).getChildNodes();
                for (int i = 0; i < resultNodeList4.getLength(); i++) {
                    Node resultNode = resultNodeList4.item(i);
                    String nodeCxaKey = null;
                    String nodeAdtCode = null;

                    NodeList resultFieldsNodeList = resultNode.getChildNodes();
                    for (int j = 0; j < resultFieldsNodeList.getLength(); j++) {
                        Node indidvidualFieldNode = resultFieldsNodeList.item(j);
                        
                        System.out.println("node name=" + indidvidualFieldNode.getNodeName());
                        System.out.println("context=" + indidvidualFieldNode.getTextContent());
                        
                        if ("adt_code".equals(indidvidualFieldNode.getNodeName())) {
                            nodeAdtCode = indidvidualFieldNode.getTextContent();
                        } else if ("cxa_key".equals(indidvidualFieldNode.getNodeName())) {
                            nodeCxaKey = indidvidualFieldNode.getTextContent();
                        }
                        
                        
                    }
                    
                    

                    /*if ("INCI".equals(nodeAdtCode)) {
                        return nodeCxaKey;
                    }*/
                    //return nodeCxaKey;
                }
                
                System.out.println("=========================\n");
                //String aaa = SecurityService.findInciAddressKey(user.getUserRecId(), "INCI");
                String aaa = SecurityService.findInciAddressKey(user.getUserRecId());
                System.out.println("inciAddressKey="+aaa);                
                SecurityService.setUserInciAddress(user);
            	System.out.printf("CST_KEY=%s\n" +
  					  "Login=%s\n" +
  					  "First Name=%s\n" +
  					  "Last Name=%s\n" +
  					  "Company=%s\n" +
  					  "Company Address=%s\n" +
  					  "User Address=%s\n", 
  					user.getUserRecId(), 
  					user.getLoginId(), 
  					user.getFirstName(), 
  					user.getLastName(), 
  					user.getUserCompany().getCompanyName().toString(),
  					user.getUserCompany().getAddress1().toString() + "<->" +
  							user.getUserCompany().getAddress2().toString() + "<->" +
  							user.getUserCompany().getAddress3().toString(),
  							user.getAddress1().toString() + "<->" + user.getAddress2().toString() + "<->" + user.getAddress3().toString()                			
			  			);                
                System.out.println("=========================\n");
                
                
                //System.out.println(searchResult.getUserList().size());
                
                /*String s = "";
                
                if (isStringNullOrEmpty(s))
                	System.out.println("empty");
                else
            		System.out.println("not empty");*/
                //NetForumXML netForumXml;
                //NetForumXMLSoap netForumXmlSoapPort;

                //IndividualType ind = NetforumService.findIndividual("548ec95d-4779-48d3-a147-4c6501c0557e");
                //System.out.println(ind.getBusinessAddress().getAdrCity().getValue().toString());
                //System.out.println(XmlUtil.extractValFromNullableStrElem(ind.getBusinessAddress().getAdrCountry()));
                //System.out.println(XmlUtil.extractValFromNullableStrElem(ind.getBusinessAddress().getAdrAdbKey()));
                
                CustomerAddressType cstAddrType = NetforumService.findIndividualAddressByKey("548ec95d-4779-48d3-a147-4c6501c0557e");
                String addr1 = XmlUtil.extractValFromNullableStrElem(cstAddrType.getAddress().getAdrLine1());
                String addr2 = XmlUtil.extractValFromNullableStrElem(cstAddrType.getAddress().getAdrLine2());
                System.out.println("addr1="+addr1);
                
                //String cxaKey = SecurityService.findInciAddressKey("548ec95d-4779-48d3-a147-4c6501c0557e");
                //System.out.println("cxaKey"+cxaKey);
                
                WEBAddressGetAddressesByCustomerResult searchResult = NetforumService.findIndividualAddresses("548ec95d-4779-48d3-a147-4c6501c0557e");

                NodeList resultNodeList = ((Element) searchResult.getContent().get(0)).getChildNodes();
                for (int i = 0; i < resultNodeList.getLength(); i++) {
                    Node resultNode = resultNodeList.item(i);
                    String nodeCxaKey = null;
                    String nodeAdtCode = null;

                    NodeList resultFieldsNodeList = resultNode.getChildNodes();
                    for (int j = 0; j < resultFieldsNodeList.getLength(); j++) {
                        Node indidvidualFieldNode = resultFieldsNodeList.item(j);

                        /*if ("adt_code".equals(indidvidualFieldNode.getNodeName())) {
                            nodeAdtCode = indidvidualFieldNode.getTextContent();
                        } else if ("cxa_key".equals(indidvidualFieldNode.getNodeName())) {
                            nodeCxaKey = indidvidualFieldNode.getTextContent();
                        }*/
                        
                        System.out.println("Node name: " + indidvidualFieldNode.getNodeName());
                        System.out.println("Context: " + indidvidualFieldNode.getTextContent());
                    }

                    //if ("INCI".equals(nodeAdtCode)) {
                    //    return nodeCxaKey;
                    //}
                    
                    
                    
                }
                
                /// 

                System.out.println("-------------------------------------------");
                
                user = SecurityService.findUserByRecId("548ec95d-4779-48d3-a147-4c6501c0557e");
                
                System.out.println(user.getFirstName());
                System.out.println(user.getLastName());
                System.out.println(user.getCity());
                System.out.println(user.getCountry());
                System.out.println(user.getAddress1());
                System.out.println(user.getAddress2());
                System.out.println(user.getAddress3());
                
                
            }           
            
        
        };
    }

}
