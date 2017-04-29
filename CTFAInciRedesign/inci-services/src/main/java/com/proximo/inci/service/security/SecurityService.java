/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.service.security;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.avectra._2005.CustomerAddressType;
import com.avectra._2005.GetQueryResponse.GetQueryResult;
import com.avectra._2005.IndividualType;
import com.avectra._2005.WEBAddressGetAddressesByCustomerResponse.WEBAddressGetAddressesByCustomerResult;
import com.avectra._2005.WEBFaxGetFaxesByCustomerResponse.WEBFaxGetFaxesByCustomerResult;
import com.avectra._2005.WEBPhoneGetPhonesByCustomerResponse.WEBPhoneGetPhonesByCustomerResult;
import com.avectra._2005.WebUserType;
import com.proximo.inci.DOCreditCardReport;
import com.proximo.inci.DOList;
import com.proximo.inci.DOTradeName;
import com.proximo.inci.common.TemplarUtil;
import com.proximo.inci.service.netforum.NetforumService;
import com.proximo.inci.service.security.convert.SecurityObjectsConverter;
import com.proximo.inci.service.security.user.User;
import com.proximo.inci.service.security.user.UserSearchParams;
import com.proximo.inci.service.security.user.UserSearchResult;
import com.proximo.inci.xml.XmlUtil;

/**
 * Used in INCI web application for any security-related operations. ADMIN user
 * is managed only in INCI web application (not in Avectra's Netforum).
 */
public class SecurityService {

	private static Logger logger = LoggerFactory.getLogger(SecurityService.class);

	// private static Logger logger =
	// LoggerFactory.getLogger(SecurityService.class);

	/** Not intended to be instantiated. Exposed only static members. */
	private SecurityService() {
	}

	/**
	 * Validates username/password and returns security information if
	 * credentials are valid. Null returned means, credentials are invalid.
	 */
	public static SecurityInfo getSecurityInfoByCredentials(final String username, final String password) {
		// ADMIN user
		if (AdminUserSecurityService.ADMIN_USERNAME.equals(username)) {
			if (AdminUserSecurityService.verifyAdminUserPassword(password)) {
				return new SecurityInfo(AdminUserSecurityService.getAdminUser());
			}
			// Regular user go to NetForum
		}
		else {
			WebUserType webUserType = NetforumService.login(username, password);
			// correct credentials
			if (webUserType != null) {
				String individualCstKey = webUserType.getIndividual().getIndCstKey().getValue();
				return new SecurityInfo(findRegularUserByRecId(individualCstKey));
			}
		}

		return null;
	}

	public static boolean isCstKeyValid(String cst_key) {
		try {
			IndividualType individualType = NetforumService.findIndividual(cst_key);
			return individualType.getIndividual() != null;
		}
		catch (Throwable t) {
			return false;
		}
	}

	/** SSO related. Returns security information for cst_key given. */
	public static SecurityInfo retrieveSecurityInfoByCstKey(String cst_key) {
		return new SecurityInfo(findRegularUserByRecId(cst_key));
	}

	public static UserSearchResult findUsers(UserSearchParams searchParams) {
		GetQueryResult getQueryResult = NetforumService.findIndividualObjects(searchParams.getLastName(), searchParams.getFirstName(), searchParams.getLoginId());

		return new UserSearchResult(SecurityObjectsConverter.convertIndividualGetQueryResultToUserList(getQueryResult));
	}

	public static UserSearchResult findUsersByLogonCompanyName(String logon, String companyName) {
		GetQueryResult getQueryResult = NetforumService.findIndividualObjects2(logon, companyName);

		return new UserSearchResult(SecurityObjectsConverter.convertIndividualGetQueryResultToUserList(getQueryResult));
	}

	public static UserSearchResult findUsersByCstKeyList(StringBuilder cstKeyList) {
		GetQueryResult getQueryResult = NetforumService.findIndividualObjects3(cstKeyList);

		return new UserSearchResult(SecurityObjectsConverter.convertIndividualGetQueryResultToUserList(getQueryResult));
	}

	public static User findUserByRecId(String userRecId) {
		if (String.valueOf(AdminUserSecurityService.ADMIN_USER_REC_ID).equals(userRecId)) {
			return AdminUserSecurityService.getAdminUser();
		}
		else {
			return findRegularUserByRecId(userRecId);
		}
	}

	private static User findRegularUserByRecId(String userRecId) {
		User user = null;
		try {
			// get user from Netforum
			user = SecurityObjectsConverter.convertToUser(NetforumService.findIndividual(userRecId));

			// set user address
			setUserInciAddress(user);

			// set user phone
			setUserInciPhone(user);

			// set user fax
			setUserInciFax(user);
		}
		catch (Exception ex) {
			logger.error("SecurityService.findRegularUserByRecId error: " + ex.getMessage());
		}

		return user;
	}

	// find user by logon or email address
	public static User findUserByLogon(String logon) {
		if (logon.toUpperCase().equals("ADMIN")) {
			return AdminUserSecurityService.getAdminUser();
		}
		else {
			UserSearchResult getQueryResult = findUsersByLogonCompanyName(logon, null);
			User user = new User();
			if (!getQueryResult.getUserList().isEmpty()) {
				user = (User) getQueryResult.getUserList().get(0);
				user = findRegularUserByRecId(user.getUserRecId());
			}

			return user;
		}
	}

	public static String findInciAddressKey(String userRecId) {// , String
																// addressType)
																// {
		String nodeCxaKey = null;
		String nodeAdtCode = null;
		String homeAddress = null;
		String inciAddress = null;
		String mailingAdress = null;
		String otherAddress = null;
		String streetAddress = null;

		WEBAddressGetAddressesByCustomerResult searchResult = NetforumService.findIndividualAddresses(userRecId);

		NodeList resultNodeList = ((Element) searchResult.getContent().get(0)).getChildNodes();
		for (int i = 0; i < resultNodeList.getLength(); i++) {
			Node resultNode = resultNodeList.item(i);

			NodeList resultFieldsNodeList = resultNode.getChildNodes();
			for (int j = 0; j < resultFieldsNodeList.getLength(); j++) {
				Node indidvidualFieldNode = resultFieldsNodeList.item(j);

				if ("adt_code".equals(indidvidualFieldNode.getNodeName())) {
					nodeAdtCode = indidvidualFieldNode.getTextContent();
				}
				else if ("cxa_key".equals(indidvidualFieldNode.getNodeName())) {
					nodeCxaKey = indidvidualFieldNode.getTextContent();
				}
			}

			// inci address key
			// System.out.println(nodeAdtCode.toUpperCase());
			if ("INCI".equals(nodeAdtCode.toUpperCase())) {
				inciAddress = nodeCxaKey;
				// System.out.println("INCI");
			}

			// street address key
			else if ("STREET".equals(nodeAdtCode.toUpperCase())) {
				streetAddress = nodeCxaKey;
				// System.out.println("MAILING");
			}

			// home address key
			else if ("MAILING".equals(nodeAdtCode.toUpperCase())) {
				mailingAdress = nodeCxaKey;
				// System.out.println("MAILING");
			}

			// home address key
			else if ("HOME".equals(nodeAdtCode.toUpperCase())) {
				homeAddress = nodeCxaKey;
				// System.out.println("HOME");
			}

			else {
				otherAddress = nodeCxaKey;
				// System.out.println("OTHER");
			}

		}

		/*
		 * if (addressType.toUpperCase().equals("HOME")) return homeAddress;
		 * else if (addressType.toUpperCase().equals("INCI")) return
		 * inciAddress; else if (addressType.toUpperCase().equals("MAILING"))
		 * return mailingAdress; else return otherAddress;
		 */

		if (!TemplarUtil.isStringNullOrEmpty(inciAddress)) {
			// System.out.println("This is INCI address");
			return inciAddress;
		}
		else if (!TemplarUtil.isStringNullOrEmpty(streetAddress)) {
			// System.out.println("This is MAILING address");
			return streetAddress;
		}
		else { // if (!TemplarUtil.isStringNullOrEmpty(mailingAdress))
				// System.out.println("This is MAILING address");
			return mailingAdress;
		}
		/*
		 * else if (!TemplarUtil.isStringNullOrEmpty(homeAddress)) return
		 * homeAddress; else return otherAddress;
		 */

	}

	// set user inci phone
	public static void setUserInciPhone(User user) {

		String pht_code = null;
		String cph_phn_number_complete = null;
		String cph_key = null;
		//
		String inciPhone = null;
		String inciPhoneKey = null;
		String homePhone = null;
		String homePhoneKey = null;
		String businessPhone = null;
		String businessPhoneKey = null;
		String otherPhone = null;
		String otherPhoneKey = null;

		// invoke SOAP netforum method
		WEBPhoneGetPhonesByCustomerResult searchResult = NetforumService.findIndividualPhones(user.getUserRecId());

		NodeList resultNodeList = ((Element) searchResult.getContent().get(0)).getChildNodes();
		for (int i = 0; i < resultNodeList.getLength(); i++) {
			Node resultNode = resultNodeList.item(i);

			NodeList resultFieldsNodeList = resultNode.getChildNodes();
			for (int j = 0; j < resultFieldsNodeList.getLength(); j++) {
				Node indidvidualFieldNode = resultFieldsNodeList.item(j);

				if ("pht_code".equals(indidvidualFieldNode.getNodeName())) {
					pht_code = indidvidualFieldNode.getTextContent();
				}
				else if ("cph_phn_number_complete".equals(indidvidualFieldNode.getNodeName())) {
					cph_phn_number_complete = indidvidualFieldNode.getTextContent();
				}
				else if ("cph_key".equals(indidvidualFieldNode.getNodeName())) {
					cph_key = indidvidualFieldNode.getTextContent();
				}
			}

			// inci address key
			if ("INCI".equals(pht_code.toUpperCase())) {
				inciPhone = cph_phn_number_complete;
				inciPhoneKey = cph_key;
				// System.out.println("INCI phone");
			}

			// home home key
			else if ("HOME".equals(pht_code.toUpperCase())) {
				homePhone = cph_phn_number_complete;
				homePhoneKey = cph_key;
				// System.out.println("Home phone");
			}

			// home Business key
			else if ("BUSINESS".equals(pht_code.toUpperCase())) {
				businessPhone = cph_phn_number_complete;
				businessPhoneKey = cph_key;
				// System.out.println("Business phone");
			}

			else {
				otherPhone = cph_phn_number_complete;
				otherPhoneKey = cph_key;
				// System.out.println("OTHER");
			}

		}

		if (!TemplarUtil.isStringNullOrEmpty(inciPhone)) {
			// System.out.println("This is INCI phone");
			user.setPhone(inciPhone);

			// company phone
			user.getUserCompany().setPhone(inciPhone);
		}
		else {
			// System.out.println("This is BUSINESS phone");
			user.setPhone(businessPhone);

			// company phone
			user.getUserCompany().setPhone(businessPhone);

		}
	}

	// set user inci fax
	public static void setUserInciFax(User user) {

		String fxt_code = null;
		String cfx_fax_number_complete = null;
		String cfx_key = null;
		//
		String inciFax = null;
		String inciFaxKey = null;
		String homeFax = null;
		String homeFaxKey = null;
		String businessFax = null;
		String businessFaxKey = null;
		String otherFax = null;
		String otherFaxKey = null;

		// invoke SOAP netforum method
		WEBFaxGetFaxesByCustomerResult searchResult = NetforumService.findIndividualFaxes(user.getUserRecId());

		NodeList resultNodeList = ((Element) searchResult.getContent().get(0)).getChildNodes();
		for (int i = 0; i < resultNodeList.getLength(); i++) {
			Node resultNode = resultNodeList.item(i);

			NodeList resultFieldsNodeList = resultNode.getChildNodes();
			for (int j = 0; j < resultFieldsNodeList.getLength(); j++) {
				Node indidvidualFieldNode = resultFieldsNodeList.item(j);

				if ("fxt_code".equals(indidvidualFieldNode.getNodeName())) {
					fxt_code = indidvidualFieldNode.getTextContent();
				}
				else if ("cfx_fax_number_complete".equals(indidvidualFieldNode.getNodeName())) {
					cfx_fax_number_complete = indidvidualFieldNode.getTextContent();
				}
				else if ("cfx_key".equals(indidvidualFieldNode.getNodeName())) {
					cfx_key = indidvidualFieldNode.getTextContent();
				}
			}

			// inci address key
			if ("INCI".equals(fxt_code.toUpperCase())) {
				inciFax = cfx_fax_number_complete;
				inciFaxKey = cfx_key;
				// System.out.println("INCI fax");
			}

			// home home key
			else if ("HOME".equals(fxt_code.toUpperCase())) {
				homeFax = cfx_fax_number_complete;
				homeFaxKey = cfx_key;
				// System.out.println("Home phone");
			}

			// home Business key
			else if ("BUSINESS".equals(fxt_code.toUpperCase())) {
				businessFax = cfx_fax_number_complete;
				businessFaxKey = cfx_key;
				// System.out.println("Business phone");
			}

			else {
				otherFax = cfx_fax_number_complete;
				otherFaxKey = cfx_key;
				// System.out.println("OTHER");
			}

		}

		if (!TemplarUtil.isStringNullOrEmpty(inciFax)) {
			// System.out.println("This is INCI fax");
			user.setFax(inciFax);

			// company phone
			user.getUserCompany().setFax(inciFax);
		}
		else {
			// System.out.println("This is BUSINESS fax");
			user.setFax(businessFax);

			// company phone
			user.getUserCompany().setFax(businessFax);
		}
	}

	public static void setUserInciAddress(User user) {
		String cxaKey = findInciAddressKey(user.getUserRecId());
		/*
		 * String cxaKey = findInciAddressKey(user.getUserRecId(), "INCI");
		 * 
		 * // if no INCI address then use Home address if (cxaKey == null ||
		 * cxaKey.equals("")) cxaKey = findInciAddressKey(user.getUserRecId(),
		 * "HOME");
		 * 
		 * // if no HOME address then use Mailing address if (cxaKey == null ||
		 * cxaKey.equals("")) cxaKey = findInciAddressKey(user.getUserRecId(),
		 * "MAILING");
		 * 
		 * if (cxaKey == null || cxaKey.equals("")) cxaKey =
		 * findInciAddressKey(user.getUserRecId(), "OTHER");
		 * 
		 */

		// System.out.println(cxaKey);

		if (!TemplarUtil.isStringNullOrEmpty(cxaKey)) {
			CustomerAddressType cstAddrType = NetforumService.findIndividualAddressByKey(cxaKey);

			user.setAddress1(XmlUtil.extractValFromNullableStrElem(cstAddrType.getAddress().getAdrLine1()));
			user.setAddress2(XmlUtil.extractValFromNullableStrElem(cstAddrType.getAddress().getAdrLine2()));
			user.setAddress3(XmlUtil.extractValFromNullableStrElem(cstAddrType.getAddress().getAdrLine3()));
			user.setCity(XmlUtil.extractValFromNullableStrElem(cstAddrType.getAddress().getAdrCity()));

			/*
			 * According to the client the company information - same data you
			 * use for the Contact User Information except without the Login,
			 * First Name, and Last Name. INCI Issue 32 INCI vs Business on both
			 * INCI Application and My Profile
			 */
			// company info
			user.getUserCompany().setAddress1(XmlUtil.extractValFromNullableStrElem(cstAddrType.getAddress().getAdrLine1()));
			user.getUserCompany().setAddress2(XmlUtil.extractValFromNullableStrElem(cstAddrType.getAddress().getAdrLine2()));
			user.getUserCompany().setAddress3(XmlUtil.extractValFromNullableStrElem(cstAddrType.getAddress().getAdrLine3()));
			user.getUserCompany().setCity(XmlUtil.extractValFromNullableStrElem(cstAddrType.getAddress().getAdrCity()));

			/*
			 * System.out.println("getAdrCountry="+XmlUtil.
			 * extractValFromNullableStrElem(cstAddrType.getAddress().
			 * getAdrCountry())); System.out.println("getCtyCode="+XmlUtil.
			 * extractValFromNullableStrElem(cstAddrType.getCountry().getCtyCode
			 * ())); System.out.println("setCtyIso2="+XmlUtil.
			 * extractValFromNullableStrElem(cstAddrType.getCountry().getCtyIso2
			 * ()));
			 */

			// System.out.println(XmlUtil.extractValFromNullableStrElem(cstAddrType.getCountry().getCtyLongName()));
			// System.out.println(XmlUtil.extractValFromNullableStrElem(cstAddrType.getAddress().getAdrCountry()));
			// user.setCountry(XmlUtil.extractValFromNullableStrElem(cstAddrType.getAddress().getAdrCountry()));
			// // country name, ex. United States
			user.setCountry(XmlUtil.extractValFromNullableStrElem(cstAddrType.getCountry().getCtyIso2())); // country
																											// code,
																											// ex.
																											// US
			user.setCountryLong(XmlUtil.extractValFromNullableStrElem(cstAddrType.getCountry().getCtyLongName())); // country
																													// long
																													// name.
																													// United
																													// States

			// company info
			user.getUserCompany().setCountry(XmlUtil.extractValFromNullableStrElem(cstAddrType.getCountry().getCtyIso2())); // country
																															// code,
																															// ex.
																															// US
			user.getUserCompany().setCountryLong(XmlUtil.extractValFromNullableStrElem(cstAddrType.getCountry().getCtyLongName())); // country
																																	// long
																																	// name.
																																	// United
																																	// States

			/*
			 * System.out.println("Country="+user.getCountry());
			 * System.out.println("State or province="
			 * +XmlUtil.extractValFromNullableStrElem(cstAddrType.getAddress().
			 * getAdrState())); System.out.println("getStateTerritory="+XmlUtil.
			 * extractValFromNullableStrElem(cstAddrType.getStateTerritory().
			 * getStaCode())); System.out.println("getStateTerritory="+XmlUtil.
			 * extractValFromNullableStrElem(cstAddrType.getAddress().
			 * getAdrIntlProvince()));
			 */

			if (!TemplarUtil.isStringNullOrEmpty(XmlUtil.extractValFromNullableStrElem(cstAddrType.getAddress().getAdrState()))) {
				user.setStateOrProvince(user.getCountry(), XmlUtil.extractValFromNullableStrElem(cstAddrType.getAddress().getAdrState()));

				// company info
				user.getUserCompany().setStateOrProvince(user.getCountry(), XmlUtil.extractValFromNullableStrElem(cstAddrType.getAddress().getAdrState()));

			}
			else {
				user.setStateOrProvince(user.getCountry(), XmlUtil.extractValFromNullableStrElem(cstAddrType.getAddress().getAdrIntlProvince()));
				// company info
				user.getUserCompany().setStateOrProvince(user.getCountry(), XmlUtil.extractValFromNullableStrElem(cstAddrType.getAddress().getAdrIntlProvince()));

			}

			// zip
			user.setZip(XmlUtil.extractValFromNullableStrElem(cstAddrType.getAddress().getAdrPostCode()));
			// company zip
			user.getUserCompany().setZip(XmlUtil.extractValFromNullableStrElem(cstAddrType.getAddress().getAdrPostCode()));

			// System.out.println("New
			// phone="+XmlUtil.extractValFromNullableStrElem(cstAddrType.getCustomer().getCstPhnNumberCompleteDn()));
			// System.out.println("New
			// fax="+XmlUtil.extractValFromNullableStrElem(cstAddrType.getCustomer().getCstFaxNumberCompleteDn()));

		}
	}

	// prepare cstkeylist based on result set from database
	public static StringBuilder getCstKeyListCC(DOList searchResult) {
		StringBuilder result = new StringBuilder();

		for (int i = 0; searchResult != null && i < searchResult.size(); i++) {
			DOCreditCardReport ccTransaction = (DOCreditCardReport) searchResult.elementAt(i);

			if (!TemplarUtil.isStringNullOrEmpty(ccTransaction.cstKey)) {
				result.append("'" + ccTransaction.cstKey.toUpperCase() + "'");

				// if (i != (searchResult.size() - 1))
				result.append(",");
			}
		}

		if (result.length() > 0 && result.indexOf(",") > 0 && result.substring(result.length() - 1).equals(",")) {
			return new StringBuilder(result.substring(0, result.length() - 1));
		}
		else {
			return result;
		}
	}

	// prepare cstkeylist based on result set from database
	public static StringBuilder getCstKeyListAppMv(DOList searchResult) {
		StringBuilder result = new StringBuilder();

		for (int i = 0; searchResult != null && i < searchResult.size(); i++) {
			DOTradeName trade = (DOTradeName) searchResult.elementAt(i);

			if (!TemplarUtil.isStringNullOrEmpty(trade.userRecId)) {
				result.append("'" + trade.userRecId.toUpperCase() + "'");

				// if (i != (searchResult.size() - 1))
				result.append(",");
			}
		}

		if (result.length() > 0 && result.indexOf(",") > 0 && result.substring(result.length() - 1).equals(",")) {
			return new StringBuilder(result.substring(0, result.length() - 1));
		}
		else {
			return result;
		}
	}

	// user map list cstKey = logon (email)
	public static UserSearchResult getUsersByCstKey(StringBuilder cstKeyList) {
		UserSearchResult resultSet = null;

		// call netforum method
		try {
			resultSet = SecurityService.findUsersByCstKeyList(cstKeyList);
		}
		catch (Exception ex) {
			logger.error("CC transaction report search.SearchResultsTable.getUserLogonByCstKey Netforum error: " + ex.getMessage());
		}

		return resultSet;
	}

	// check if logon exist in user list
	public static boolean ifExists(UserSearchResult list, String logon) {
		boolean result = false;
		for (int i = 0; i < list.getUserList().size(); i++) {
			User user = (User) list.getUserList().get(i);
			if (user.getEmail() != null && user.getEmail().toUpperCase().contains(logon.toUpperCase())) {
				result = true;
				break;
			}
		}

		return result;
	}

	// get user from user list
	public static User getUserByCstKey(UserSearchResult list, String cstKey) {

		if (String.valueOf(AdminUserSecurityService.ADMIN_USER_REC_ID).equals(cstKey)) {
			return AdminUserSecurityService.getAdminUser();
		}

		else {
			User result = null;
			for (int i = 0; i < list.getUserList().size(); i++) {
				User user = (User) list.getUserList().get(i);
				if (user.getUserRecId().toUpperCase().contains(cstKey.toUpperCase())) {
					result = user;
					break;
				}
			}

			return result;
		}
	}

}
