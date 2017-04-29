/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.service.security;

//import java.io.File;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
//import javax.xml.parsers.DocumentBuilder;
//import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.ws.Holder;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.avectra._2005.AuthorizationToken;
import com.avectra._2005.GetQueryResponse.GetQueryResult;
//import com.avectra._2005.CustomerAddressType;
import com.avectra._2005.NetForumXML;
import com.avectra._2005.NetForumXMLSoap;
import com.avectra._2005.WEBAddressGetAddressesByCustomerResponse.WEBAddressGetAddressesByCustomerResult;
import com.proximo.inci.AbstractServiceTest;
//import com.proximo.inci.common.TemplarUtil;
import com.proximo.inci.service.netforum.NetforumService;
//import com.proximo.inci.service.security.convert.SecurityObjectsConverter;
import com.proximo.inci.service.security.user.User;
import com.proximo.inci.service.security.user.UserSearchParams;
import com.proximo.inci.service.security.user.UserSearchResult;
//import com.proximo.inci.xml.XmlUtil;

public class UserAddress {

	public static void main(String[] args) throws SQLException, NamingException {
		// test();
		test22();
		// test22();
		// test3();

		// boolean isEditable = true;
		// String is_archive = "Y";
		// String cc = "";
		// String ccMask = "";

		/*
		 * if (isEditable || (!TemplarUtil.isStringNullOrEmpty(is_archive) &&
		 * !is_archive.equals("Y"))) { System.out.println("Yes"); } else
		 * System.out.println("No");
		 */

		// String txt1 = "<p>You have 24 hours from the time that you place your
		// order to cancel your order for a partial refund. Cancellations must
		// be submitted in writing to <a style=\"color: red;\"
		// href=\"mailto:inci@personalcarecouncil.org\">inci@personalcarecouncil.org</a>.
		// An administrative fee of $30.00 will be deducted from the amount of
		// your refund. Refunds will be processed utilizing the same payment
		// method used to place the original order. No refunds will be issued
		// for orders cancelled more than 24 hours after the order has been
		// placed.111<br></p><p>&nbsp;</p>";
		// txt1 = txt1.replaceAll("\\<.*?\\>", "");
		// txt1 = txt1.replaceAll("\\&.*?\\;", "");
		// System.out.println(txt1);

		// System.out.println(!("Y".equals(is_archive) || isEditable));
		// System.out.println(TemplarUtil.isStringNullOrEmpty(cc) ||
		// TemplarUtil.isStringNullOrEmpty(ccMask));
	}

	@SuppressWarnings("unused")
	private static void test2() throws SQLException, NamingException {
		AbstractServiceTest test = new AbstractServiceTest(true) {
			@Override
			public void runTest() {

				// final String NETFORUM_USERNAME = "Proximoxweb";
				// final String NETFORUM_PASSWORD = "xwebProximo";

				// User adminUser = AdminUserSecurityService.getAdminUser();
				// System.out.println(adminUser.getUserRecId());

				// InitialContextFactoryForTest.bind(NetforumService.JNDI_NETFORUM_USERNAME,
				// NETFORUM_USERNAME);
				// InitialContextFactoryForTest.bind(NetforumService.JNDI_NETFORUM_PASSWORD,
				// NETFORUM_PASSWORD);

				NetforumSecurityTest.initMockJndi();

				UserSearchParams searchParams = new UserSearchParams("", "", "nagy");

				NetForumXMLSoap netForumXmlSoapPort = null;
				NetForumXML netForumXml = new NetForumXML();
				netForumXmlSoapPort = netForumXml.getNetForumXMLSoap();

				String JNDI_NETFORUM_USERNAME = "java:comp/env/netforum/username";
				String JNDI_NETFORUM_PASSWORD = "java:comp/env/netforum/password";
				Holder<AuthorizationToken> authTokenHolder = new Holder<AuthorizationToken>();

				try {
					Context ctx = new InitialContext();
					String netforumXmlUsername = (String) ctx.lookup(JNDI_NETFORUM_USERNAME);
					String netforumXmlPassword = (String) ctx.lookup(JNDI_NETFORUM_PASSWORD);
					netForumXmlSoapPort.authenticate(netforumXmlUsername, netforumXmlPassword, authTokenHolder);
				}
				catch (Exception e) {
					System.out.println(e.getMessage());
				}

				System.out.println(authTokenHolder.toString());

				// User user = SecurityService.findUserByRecId("-1");
				User user = SecurityService.findUserByLogon("zzjohnsons@personalcarecouncil.orgzz");
				System.out.println(user.getFirstName());
				System.out.println(user.getLastName());
				System.out.println(user.getCountry());
				System.out.println(user.getUserRecId());

			}

		};
	}

	@SuppressWarnings("unused")
	private static void test22() throws SQLException, NamingException {
		AbstractServiceTest test = new AbstractServiceTest(true) {
			@Override
			public void runTest() {

				// final String NETFORUM_USERNAME = "Proximoxweb";
				// final String NETFORUM_PASSWORD = "xwebProximo";

				// User adminUser = AdminUserSecurityService.getAdminUser();
				// System.out.println(adminUser.getUserRecId());

				// InitialContextFactoryForTest.bind(NetforumService.JNDI_NETFORUM_USERNAME,
				// NETFORUM_USERNAME);
				// InitialContextFactoryForTest.bind(NetforumService.JNDI_NETFORUM_PASSWORD,
				// NETFORUM_PASSWORD);

				NetforumSecurityTest.initMockJndi();

				UserSearchParams searchParams = new UserSearchParams("", "", "zzgnagy@proximo.comzz");

				NetForumXMLSoap netForumXmlSoapPort = null;
				NetForumXML netForumXml = new NetForumXML();
				netForumXmlSoapPort = netForumXml.getNetForumXMLSoap();

				String JNDI_NETFORUM_USERNAME = "java:comp/env/netforum/username";
				String JNDI_NETFORUM_PASSWORD = "java:comp/env/netforum/password";
				Holder<AuthorizationToken> authTokenHolder = new Holder<AuthorizationToken>();

				try {
					Context ctx = new InitialContext();
					String netforumXmlUsername = (String) ctx.lookup(JNDI_NETFORUM_USERNAME);
					String netforumXmlPassword = (String) ctx.lookup(JNDI_NETFORUM_PASSWORD);
					netForumXmlSoapPort.authenticate(netforumXmlUsername, netforumXmlPassword, authTokenHolder);
				}
				catch (Exception e) {
					System.out.println(e.getMessage());
				}

				System.out.println(authTokenHolder.toString());

				DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
				Date dStart = new Date();
				System.out.println(dateFormat.format(dStart));

				UserSearchResult searchResult = SecurityService.findUsers(searchParams);
				System.out.println("size=" + searchResult.getUserList().size());
				for (int i = 0; i < searchResult.getUserList().size(); i++) {
					User user = searchResult.getUserList().get(i);
					System.out.println("========================================>");
					System.out.println(user.getFirstName());
					System.out.println(user.getLastName());
					System.out.println(user.getCountry());
					System.out.println(user.getUserRecId());
				}
				Date dEnd = new Date();
				System.out.println(dateFormat.format(dEnd));

				System.out.println(searchResult.getUserList().size());

				User user = SecurityService.findUserByLogon("zzgnagy@proximo.comzz");
				System.out.println("========================================>");
				System.out.println(user.getFirstName());
				System.out.println(user.getLastName());
				System.out.println(user.getCountry());
				System.out.println(user.getUserRecId());
			}
		};
	}

	@SuppressWarnings("unused")
	private static void test3() throws SQLException, NamingException {
		AbstractServiceTest test = new AbstractServiceTest(true) {
			@Override
			public void runTest() {

				// final String NETFORUM_USERNAME = "Proximoxweb";
				// final String NETFORUM_PASSWORD = "xwebProximo";

				// User adminUser = AdminUserSecurityService.getAdminUser();
				// System.out.println(adminUser.getUserRecId());

				// InitialContextFactoryForTest.bind(NetforumService.JNDI_NETFORUM_USERNAME,
				// NETFORUM_USERNAME);
				// InitialContextFactoryForTest.bind(NetforumService.JNDI_NETFORUM_PASSWORD,
				// NETFORUM_PASSWORD);

				NetforumSecurityTest.initMockJndi();

				UserSearchParams searchParams = new UserSearchParams("", "", "nagy");

				NetForumXMLSoap netForumXmlSoapPort = null;
				NetForumXML netForumXml = new NetForumXML();
				netForumXmlSoapPort = netForumXml.getNetForumXMLSoap();

				String JNDI_NETFORUM_USERNAME = "java:comp/env/netforum/username";
				String JNDI_NETFORUM_PASSWORD = "java:comp/env/netforum/password";
				Holder<AuthorizationToken> authTokenHolder = new Holder<AuthorizationToken>();

				try {
					Context ctx = new InitialContext();
					String netforumXmlUsername = (String) ctx.lookup(JNDI_NETFORUM_USERNAME);
					String netforumXmlPassword = (String) ctx.lookup(JNDI_NETFORUM_PASSWORD);
					netForumXmlSoapPort.authenticate(netforumXmlUsername, netforumXmlPassword, authTokenHolder);
				}
				catch (Exception e) {
					System.out.println(e.getMessage());
				}

				User user = SecurityService.findUserByRecId("423d7c56-85bf-4056-bbe8-980cd43c8946");// ("423d7c56-85bf-4056-bbe8-980cd43c8946");
				// User user =
				// SecurityService.findUserByRecId("a2a65d25-13c5-4665-a2d9-424eaa0c62a0");//("423d7c56-85bf-4056-bbe8-980cd43c8946");

				System.out.printf(
						"CST_KEY=%s\n" + "Login=%s\n" + "First Name=%s\n" + "Last Name=%s\n" + "Country=%s\n" + "Country Long=%s\n" + "Company Country=%s\n" + "Company State=%s\n" + "Company=%s\n" + "Company Address=%s\n" + "User Address=%s\n"
								+ "User state=%s\n" + "User state1=%s\n",
						user.getUserRecId(), user.getLoginId(), user.getFirstName(), user.getLastName(), user.getCountry(), user.getCountryLong(), user.getUserCompany().getCountry(), user.getUserCompany().getStateOrProvince(),
						user.getUserCompany().getCompanyName().toString(), user.getUserCompany().getAddress1().toString() + "<->" + user.getUserCompany().getAddress2().toString() + "<->" + user.getUserCompany().getAddress3().toString(),
						user.getAddress1().toString() + "<->" + user.getAddress2().toString() + "<->" + user.getAddress3().toString(), user.getStateOrProvince(), user.getState());

			}

		};
	}

	private static void test() throws SQLException, NamingException {
		@SuppressWarnings("unused")
		AbstractServiceTest test = new AbstractServiceTest(true) {
			@Override
			public void runTest() {

				// final String NETFORUM_USERNAME = "Proximoxweb";
				// final String NETFORUM_PASSWORD = "xwebProximo";

				// User adminUser = AdminUserSecurityService.getAdminUser();
				// System.out.println(adminUser.getUserRecId());

				// InitialContextFactoryForTest.bind(NetforumService.JNDI_NETFORUM_USERNAME,
				// NETFORUM_USERNAME);
				// InitialContextFactoryForTest.bind(NetforumService.JNDI_NETFORUM_PASSWORD,
				// NETFORUM_PASSWORD);

				NetforumSecurityTest.initMockJndi();

				UserSearchParams searchParams = new UserSearchParams("", "", "nagy");

				NetForumXMLSoap netForumXmlSoapPort = null;
				NetForumXML netForumXml = new NetForumXML();
				netForumXmlSoapPort = netForumXml.getNetForumXMLSoap();

				String JNDI_NETFORUM_USERNAME = "java:comp/env/netforum/username";
				String JNDI_NETFORUM_PASSWORD = "java:comp/env/netforum/password";
				Holder<AuthorizationToken> authTokenHolder = new Holder<AuthorizationToken>();

				try {
					Context ctx = new InitialContext();
					String netforumXmlUsername = (String) ctx.lookup(JNDI_NETFORUM_USERNAME);
					String netforumXmlPassword = (String) ctx.lookup(JNDI_NETFORUM_PASSWORD);
					netForumXmlSoapPort.authenticate(netforumXmlUsername, netforumXmlPassword, authTokenHolder);
				}
				catch (Exception e) {
					System.out.println(e.getMessage());
				}

				System.out.println(authTokenHolder.toString());

				// UserSearchResult searchResult2 =
				// SecurityService.findUsersByLogonCompanyName("zzkoterbad@personalcarecouncil.orgzz","");
				// UserSearchResult searchResult2 =
				// SecurityService.findUsersByLogonCompanyName("zzgnagy@personalcarecouncil.orgzz","");
				StringBuilder sb = new StringBuilder();
				// sb.append("'423D7C56-85BF-4056-BBE8-980CD43C8946','548EC95D-4779-48D3-A147-4C6501C0557E','423D7C56-85BF-4056-BBE8-980CD43C8946','548EC95D-4779-48D3-A147-4C6501C0557E','-1','548EC95D-4779-48D3-A147-4C6501C0557E'");
				sb.append("'423d7c56-85bf-4056-bbe8-980cd43c8946'");

				UserSearchResult searchResult2 = SecurityService.findUsersByCstKeyList(sb);
				for (int i = 0; i < searchResult2.getUserList().size(); i++) {
					User user = null;
					user = (User) searchResult2.getUserList().get(i);

					System.out.println(String.valueOf(i) + "##############################");
					System.out.println(user.getUserFullName());
					System.out.println(user.getFirstName());
					System.out.println(user.getLastName());
					System.out.println(user.getLoginId());
					System.out.println(user.getEmail());
					System.out.println(user.getUserCompany().getCompanyName());
					System.out.println(user.getUserCompany().getAddress1());
					System.out.println(user.getUserCompany().getAddress2());
					System.out.println(user.getUserCompany().getAddress3());
					System.out.println(user.getUserCompany().getCity());
					System.out.println(user.getUserCompany().getState());
					System.out.println(user.getUserCompany().getStateOrProvince());
					System.out.println(user.getUserCompany().getCountry());
				}

				// StringBuilder sb = new StringBuilder();
				// sb.append("'423D7C56-85BF-4056-BBE8-980CD43C8946','548EC95D-4779-48D3-A147-4C6501C0557E','423D7C56-85BF-4056-BBE8-980CD43C8946','548EC95D-4779-48D3-A147-4C6501C0557E','-1','548EC95D-4779-48D3-A147-4C6501C0557E'");

				GetQueryResult getQueryResult = NetforumService.findIndividualObjects3(sb);

				NodeList individualNodeList = ((Element) getQueryResult.getContent().get(0)).getChildNodes();
				for (int i = 0; i < individualNodeList.getLength(); i++) {
					Node individualNode = individualNodeList.item(i);
					// User user = new User();
					NodeList individualFieldsNodeList = individualNode.getChildNodes();
					for (int j = 0; j < individualFieldsNodeList.getLength(); j++) {
						Node indidvidualFieldNode = individualFieldsNodeList.item(j);

						System.out.println("getNodeName=" + indidvidualFieldNode.getNodeName());
						System.out.println("getTextContent=" + indidvidualFieldNode.getTextContent());

						/*
						 * if ("ind_cst_key".equals(indidvidualFieldNode.
						 * getNodeName())) {
						 * user.setUserRecId(indidvidualFieldNode.getTextContent
						 * ()); } else if
						 * ("eml_address".equals(indidvidualFieldNode.
						 * getNodeName())) {
						 * user.setLoginId(indidvidualFieldNode.getTextContent()
						 * );
						 * user.setEmail(indidvidualFieldNode.getTextContent());
						 * } else if
						 * ("ind_full_name_cp".equals(indidvidualFieldNode.
						 * getNodeName())) {
						 * user.setUserFullName(indidvidualFieldNode.
						 * getTextContent()); } else if
						 * ("phn_number_display".equals(indidvidualFieldNode.
						 * getNodeName())) {
						 * user.setPhone(indidvidualFieldNode.getTextContent());
						 * } else if
						 * ("ind_first_name".equals(indidvidualFieldNode.
						 * getNodeName())) {
						 * user.setFirstName(indidvidualFieldNode.getTextContent
						 * ()); } else if
						 * ("ind_last_name".equals(indidvidualFieldNode.
						 * getNodeName())) {
						 * user.setLastName(indidvidualFieldNode.getTextContent(
						 * )); } else if
						 * ("cst_web_login".equals(indidvidualFieldNode.
						 * getNodeName())) {
						 * user.setCstWebLogin(indidvidualFieldNode.
						 * getTextContent()); } else if
						 * ("org_name".equals(indidvidualFieldNode.getNodeName()
						 * )) { UserCompany userCompany = new UserCompany();
						 * userCompany.setCompanyName(indidvidualFieldNode.
						 * getTextContent()); user.setUserCompany(userCompany);
						 * }
						 */

					}
				}

				System.out.println("new method\n");
				// UserSearchParams searchParams3 = new UserSearchParams("", "",
				// "zzkoterbad@personalcarecouncil.orgzz");
				UserSearchParams searchParams3 = new UserSearchParams("", "", "800ksh@naver.com");
				UserSearchResult searchResult3 = SecurityService.findUsers(searchParams3);
				User user = null;
				for (int i = 0; i < searchResult3.getUserList().size(); i++) {

					user = (User) searchResult3.getUserList().get(i);

					SecurityService.setUserInciAddress(user);

					System.out.printf("CST_KEY=%s\n" + "Login=%s\n" + "First Name=%s\n" + "Last Name=%s\n" + "Country=%s\n" + "Company Country=%s\n" + "Company State=%s\n" + "Company=%s\n" + "Company Address=%s\n" + "User Address=%s\n",
							user.getUserRecId(), user.getLoginId(), user.getFirstName(), user.getLastName(), user.getCountry(), user.getUserCompany().getCountry(), user.getUserCompany().getStateOrProvince(),
							user.getUserCompany().getCompanyName().toString(), user.getUserCompany().getAddress1().toString() + "<->" + user.getUserCompany().getAddress2().toString() + "<->" + user.getUserCompany().getAddress3().toString(),
							user.getAddress1().toString() + "<->" + user.getAddress2().toString() + "<->" + user.getAddress3().toString());
				}

				System.out.println("=========================\n");
				// 423d7c56-85bf-4056-bbe8-980cd43c8946 -- Donna userRecId
				// 548ec95d-4779-48d3-a147-4c6501c0557e -- GNagy
				System.out.println("423d7c56-85bf-4056-bbe8-980cd43c8946 -- Donna userRecId");
				WEBAddressGetAddressesByCustomerResult searchResult = NetforumService.findIndividualAddresses("423d7c56-85bf-4056-bbe8-980cd43c8946");
				// WEBAddressGetAddressesByCustomerResult searchResult =
				// NetforumService.findIndividualAddresses("548ec95d-4779-48d3-a147-4c6501c0557e");

				System.out.println(searchResult.getContent().size());
				NodeList resultNodeList = ((Element) searchResult.getContent().get(0)).getChildNodes();
				for (int i = 0; i < resultNodeList.getLength(); i++) {
					Node resultNode = resultNodeList.item(i);
					String nodeCxaKey = null;
					String nodeAdtCode = null;

					NodeList resultFieldsNodeList = resultNode.getChildNodes();

					System.out.println("cnt=" + resultFieldsNodeList.getLength());

					for (int j = 0; j < resultFieldsNodeList.getLength(); j++) {

						System.out.println("############### Node " + (j + 1));

						Node indidvidualFieldNode = resultFieldsNodeList.item(j);

						System.out.println("findInciAddressKey=>indidvidualFieldNode.getNodeName()=" + indidvidualFieldNode.getNodeName());
						System.out.println("findInciAddressKey=>indidvidualFieldNode.getTextContent()=" + indidvidualFieldNode.getTextContent());

						if ("adt_code".equals(indidvidualFieldNode.getNodeName())) {
							nodeAdtCode = indidvidualFieldNode.getTextContent();
						}
						else if ("cxa_key".equals(indidvidualFieldNode.getNodeName())) {
							nodeCxaKey = indidvidualFieldNode.getTextContent();
						}

						// System.out.println("findInciAddressKey=>nodeAdtCode="+nodeAdtCode);
						// System.out.println("findInciAddressKey=>nodeCxaKey="+nodeCxaKey);
					}
				}
				// ---------------------------------

				user = SecurityService.findUserByRecId("548ec95d-4779-48d3-a147-4c6501c0557e");// ("423d7c56-85bf-4056-bbe8-980cd43c8946");

				System.out.printf(
						"CST_KEY=%s\n" + "Login=%s\n" + "First Name=%s\n" + "Last Name=%s\n" + "Country=%s\n" + "Company Country=%s\n" + "Company State=%s\n" + "Company=%s\n" + "Company Address=%s\n" + "User Address=%s\n" + "State/province=%s\n"
								+ "Phone=%s\n" + "Fax=%s\n" + "Zip=%s\n",
						user.getUserRecId(), user.getLoginId(), user.getFirstName(), user.getLastName(), user.getCountry(), user.getUserCompany().getCountry(), user.getUserCompany().getStateOrProvince(),
						user.getUserCompany().getCompanyName().toString(), user.getUserCompany().getAddress1().toString() + "<->" + user.getUserCompany().getAddress2().toString() + "<->" + user.getUserCompany().getAddress3().toString(),
						user.getAddress1().toString() + "<->" + user.getAddress2().toString() + "<->" + user.getAddress3().toString(), user.getProvince(), user.getPhone(), user.getFax(), user.getZip());

			}

		};
	}

}
