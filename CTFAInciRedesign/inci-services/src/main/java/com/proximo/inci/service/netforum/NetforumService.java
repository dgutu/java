/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.service.netforum;

//import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.naming.Context;
import javax.naming.InitialContext;
//import javax.naming.NamingException;
//import javax.xml.bind.JAXBElement;
import javax.xml.ws.Holder;
//import javax.xml.ws.soap.SOAPFaultException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.avectra._2005.AuthorizationToken;
import com.avectra._2005.CentralizedOrderEntryType;
import com.avectra._2005.CustomerAddressType;
import com.avectra._2005.GetQueryResponse.GetQueryResult;
import com.avectra._2005.InvoiceDetailType;
import com.avectra._2005.ObjectFactory;
import com.avectra._2005.WEBAddressGetAddressesByCustomerResponse.WEBAddressGetAddressesByCustomerResult;
import com.avectra._2005.IndividualType;
import com.avectra._2005.NetForumXML;
import com.avectra._2005.NetForumXMLSoap;
import com.avectra._2005.WEBFaxGetFaxesByCustomerResponse.WEBFaxGetFaxesByCustomerResult;
import com.avectra._2005.WEBPhoneGetPhonesByCustomerResponse.WEBPhoneGetPhonesByCustomerResult;
import com.avectra._2005.WebUserType;
//import com.proximo.inci.DOCreditCardReport;
//import com.proximo.inci.DOList;
import com.proximo.inci.DOUserCC;
import com.proximo.inci.common.TemplarUtil;
//import com.proximo.inci.exception.InciException;
//import com.proximo.inci.service.payment.TradeNamePaymentService;
import com.proximo.inci.xml.XmlUtil;

/**
 * Used for Netforum operations (specifically, as a delegate in SecurityService
 * for any security-Netforum related operations).
 */
public class NetforumService {

    private static Logger logger = LoggerFactory.getLogger(NetforumService.class);

    public final static String JNDI_NETFORUM_USERNAME = "java:comp/env/netforum/username";
    public final static String JNDI_NETFORUM_PASSWORD = "java:comp/env/netforum/password";

    private static final String netforumXmlUsername;
    private static final String netforumXmlPassword;

    private static final NetForumXML netForumXml;
    private static final NetForumXMLSoap netForumXmlSoapPort;
    //private static Holder<AuthorizationToken> authTokenHolder;
    
    private static final String EXCEPTION_MESSAGE = "Netforum is not available, please contact system administrator!";

    static {
        logger.info("Initializing Netforum security service");
        try {
            Context ctx = new InitialContext();

            netforumXmlUsername = (String) ctx.lookup(JNDI_NETFORUM_USERNAME);
            netforumXmlPassword = (String) ctx.lookup(JNDI_NETFORUM_PASSWORD);
        } catch (Exception e) {
            logger.error("Unable to retrieve Netforum security service's JNDI initialization parameters", e);
            throw new RuntimeException(e.getMessage());
        }

        netForumXml = new NetForumXML();
        netForumXmlSoapPort = (NetForumXMLSoap) netForumXml.getNetForumXMLSoap();
        
        // netforum authentication
        //authTokenHolder = new Holder<AuthorizationToken>();
        //authTokenHolder = generateAuthTokenHolder();

        //logger.info(netForumXml.getWSDLLocation());
        //System.out.println(netForumXml.getWSDLLocation());
        logger.info("Finished initializing Netforum security service");
    }

    /**
     * Validates username/password and returns WebUserType if credentials are
     * valid. Null returned means, credentials are invalid.
     */
    public static WebUserType login(String username, String password) {
    	logger.debug("start NetforumService.login.username="+username);
    	
        Holder<AuthorizationToken> authTokenHolder = generateAuthTokenHolder();
        
    	if (authTokenHolder == null)
            throw new RuntimeException(EXCEPTION_MESSAGE);     	
    	
        WebUserType webUserType = null;
        
        try {
            	webUserType = netForumXmlSoapPort.webWebUserLogin(username, password, authTokenHolder);
        } catch (Exception ex) {
        	logger.error("NetforumService.login error: "+ex.getMessage());
        }
        logger.debug("end NetforumService.login.webUserType="+(webUserType != null ? webUserType.getEmail().toString() : " IS NULL"));
        
        return webUserType;   
    }

    // get individual information from netforum
    public static IndividualType findIndividual(String individualCstKey) {
    	logger.debug("start NetforumService.findIndividual.individualCstKey="+individualCstKey);
    	
        Holder<AuthorizationToken> authTokenHolder = generateAuthTokenHolder();
        
    	if (authTokenHolder == null)
            throw new RuntimeException(EXCEPTION_MESSAGE); 
    	
    	IndividualType individual = null;
    	
    	try {
   			individual =  netForumXmlSoapPort.webIndividualGet(individualCstKey, authTokenHolder);
    	}
    	catch (Exception ex) {
    		logger.error("NetforumService.findIndividual error: " + ex.getMessage());
    	}
    	logger.debug("end NetforumService.findIndividual.individual="+(individual != null ? individual.getEmail().toString() : " IS NULL"));
    	
        return individual;
    }

    public static GetQueryResult findIndividualObjects(String indLastName, String indFirstName, String indEmail) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	    Date dStart = new Date();
	    logger.debug("findIndividualObjects start=" + dateFormat.format(dStart));
	    
    	logger.debug("start NetforumService.findIndividualObjects.indLastName=" + indLastName);
    	logger.debug("start NetforumService.findIndividualObjects.indFirstName=" + indFirstName);
    	logger.debug("start NetforumService.findIndividualObjects.indEmail=" + indEmail);
    	
        Holder<AuthorizationToken> authTokenHolder = generateAuthTokenHolder();
        
    	if (authTokenHolder == null)
            throw new RuntimeException(EXCEPTION_MESSAGE);     	
    	
        /* creating parameters map for "where" clause construction */
        Map<String, String> paramsMap = new HashMap<String, String>();
        if (!TemplarUtil.isStringNullOrEmpty(indLastName)) {
            paramsMap.put("upper(ind_last_name)", indLastName.toUpperCase());
        }
        if (!TemplarUtil.isStringNullOrEmpty(indFirstName)) {
            paramsMap.put("upper(ind_first_name)", indFirstName.toUpperCase());
        }
        if (!TemplarUtil.isStringNullOrEmpty(indEmail)) {
            paramsMap.put("upper(Email.eml_address)", indEmail.toUpperCase());                                 	
        }
        /* constructing "where clause" */
        StringBuilder whereClause = new StringBuilder();
        List<Entry<String, String>> entryList = new ArrayList<Entry<String, String>>();
        entryList.addAll(paramsMap.entrySet());

        /*if (entryList.size() > 0) {
            Entry<String, String> entry = entryList.get(0);
            whereClause.append(entry.getKey() + "=" + "'" + entry.getValue() + "'");

            for (int i = 1; i < entryList.size(); i++) {
                Entry<String, String> e = entryList.get(i);
                whereClause.append(" and " + e.getKey() + "=" + "'" + e.getValue() + "'");
            }
        }*/
        
        for (int i=0; i<entryList.size();i++) {
        	Entry<String, String> entry = entryList.get(i);
        	
       		// if there are more that one entries add "and" sql statement
       		if (i>0) 
       			whereClause.append(" and ");        		
       		
       		whereClause.append(entry.getKey() + " like '%" + entry.getValue() + "%'"); 
        }        
        
        System.out.println(whereClause.toString());
        
        /*return netForumXmlSoapPort.getQuery("Individual @TOP 100",
                "ind_cst_key, eml_address,ind_full_name_cp,phn_number_display,org_name", whereClause.toString(), "ind_full_name_cp",
                generateAuthTokenHolder());*/
        
        logger.debug("NetforumService.findIndividualObjects. Query the Individual table with where clase: " + whereClause.toString());
        
        GetQueryResult resultSet = null;
        
        try
        {
       		resultSet = netForumXmlSoapPort.getQuery("Individual @TOP 100", "*", whereClause.toString(), null, authTokenHolder);
       		
    	    Date dEnd = new Date();
    	    logger.debug("findIndividualObjects end=" + dateFormat.format(dEnd));
       		
        }
        catch (Exception ex) {
        	logger.error("NetforumService.findIndividualObjects error: " + ex.getMessage());
        }

        logger.debug("NetforumService.findIndividualObjects.resultSet" + (resultSet != null ? String.valueOf(resultSet.getContent().size()) : " IS NULL"));
        
        
        
       	return resultSet;
    }
    
    public static GetQueryResult findIndividualObjects2(String indEmail, String compName) {
    	logger.debug("start NetforumService.findIndividualObjects2.indEmail=" + indEmail);
    	logger.debug("start NetforumService.findIndividualObjects2.compName=" + compName);
    	
        Holder<AuthorizationToken> authTokenHolder = generateAuthTokenHolder();
        
    	if (authTokenHolder == null)
            throw new RuntimeException(EXCEPTION_MESSAGE);     	
    	
        /* creating parameters map for "where" clause construction */
        Map<String, String> paramsMap = new HashMap<String, String>();
        if (!TemplarUtil.isStringNullOrEmpty(indEmail)) {
            paramsMap.put("upper(Email.eml_address)", indEmail.toUpperCase());                                 	
        }
        if (!TemplarUtil.isStringNullOrEmpty(compName)) {
            paramsMap.put("upper(org_name)", compName.toUpperCase());                                 	
        }        
        /* constructing "where clause" */
        StringBuilder whereClause = new StringBuilder();
        List<Entry<String, String>> entryList = new ArrayList<Entry<String, String>>();
        entryList.addAll(paramsMap.entrySet());
        
        for (int i=0; i<entryList.size();i++) {
        	Entry<String, String> entry = entryList.get(i);
        	
       		// if there are more that one entries add "and" sql statement
       		if (i>0) 
       			whereClause.append(" and ");        		
       		
       		whereClause.append(entry.getKey() + " like '%" + entry.getValue() + "%'"); 
        }
        
        // if indEmail and compName are null or empty 
        if (TemplarUtil.isStringNullOrEmpty(whereClause.toString())) {
        	whereClause.append("1=2");
        }
        
        logger.debug("NetforumService.findIndividualObjects2. Query the Individual table with where clase: " + whereClause.toString());
        
        GetQueryResult resultSet = null;
        
        try {
        		resultSet = netForumXmlSoapPort.getQuery("Individual", "ind_cst_key,ind_full_name_cp,org_name,Email.eml_address", whereClause.toString(), null, authTokenHolder);
        }
        catch(Exception ex) {
        	logger.error("NetforumService.findIndividualObjects2 error: " + ex.getMessage());
        }

        logger.debug("NetforumService.findIndividualObjects2.resultSet" + (resultSet != null ? String.valueOf(resultSet.getContent().size()) : " IS NULL"));
        
       	return resultSet;
    }
    
    public static GetQueryResult findIndividualObjects3(StringBuilder cstKeyList) {
    	logger.debug("start NetforumService.findIndividualObjects3.cstKeyList=" + cstKeyList);
    	
        Holder<AuthorizationToken> authTokenHolder = generateAuthTokenHolder();
        
    	if (authTokenHolder == null)
            throw new RuntimeException(EXCEPTION_MESSAGE);    	
    	
    	StringBuilder whereClause = new StringBuilder();
        if (cstKeyList != null && cstKeyList.length() > 0) {
        	whereClause.append("upper(ind_cst_key) in (" + cstKeyList.toString() + ")");
        }
        else
        	whereClause.append("1=2");        
        
        logger.debug("NetforumService.findIndividualObjects3. Query the Individual table with where clase: " + whereClause.toString());
        
        GetQueryResult resultSet = null;
        
        try {
        	resultSet = netForumXmlSoapPort.getQuery("Individual @TOP 100", "ind_cst_key,ind_full_name_cp,ind_first_name,ind_last_name,co_organization.org_name,Email.eml_address,co_address.adr_line1,co_address.adr_line2,co_address.adr_line3,co_address.adr_city,co_address.adr_state,co_address.adr_country", whereClause.toString(), null, authTokenHolder);
        }
        catch(Exception ex) {
        	logger.error("NetforumService.findIndividualObjects3 error: " + ex.getMessage());
        }

        logger.debug("NetforumService.findIndividualObjects3.resultSet=" + (resultSet != null ? String.valueOf(resultSet.getContent().size()) : " IS NULL"));
        
       	return resultSet;
    }      

    public static WEBAddressGetAddressesByCustomerResult findIndividualAddresses(String cstKey) {
    	
        Holder<AuthorizationToken> authTokenHolder = generateAuthTokenHolder();
        
    	if (authTokenHolder == null)
            throw new RuntimeException(EXCEPTION_MESSAGE);    	
    	
    	WEBAddressGetAddressesByCustomerResult result = null;
 	
    	try {
    			result = netForumXmlSoapPort.webAddressGetAddressesByCustomer(cstKey, authTokenHolder);
    	}
    	catch (Exception ex) {
    		logger.error("NetforumService.findIndividualAddresses error: " + ex.getMessage());
    	}
    	
    	logger.debug("NetforumService.findIndividualAddresses.result=" + (result != null ? String.valueOf(result.getContent().size()) : " IS NULL"));
    	
        return result;
    }
    
    // get customer phones
    public static WEBPhoneGetPhonesByCustomerResult findIndividualPhones(String cstKey) {
    	
        Holder<AuthorizationToken> authTokenHolder = generateAuthTokenHolder();
        
    	if (authTokenHolder == null)
            throw new RuntimeException(EXCEPTION_MESSAGE);    	
    	
    	WEBPhoneGetPhonesByCustomerResult result = null;
 	
    	try {
    			result = netForumXmlSoapPort.webPhoneGetPhonesByCustomer(cstKey, authTokenHolder);
    	}
    	catch (Exception ex) {
    		logger.error("NetforumService.findIndividualPhones error: " + ex.getMessage());
    	}
    	
    	logger.debug("NetforumService.findIndividualPhones.result=" + (result != null ? String.valueOf(result.getContent().size()) : " IS NULL"));
    	
        return result;
    }    
    
    // get customer faxes
    public static WEBFaxGetFaxesByCustomerResult findIndividualFaxes(String cstKey) {
    	
        Holder<AuthorizationToken> authTokenHolder = generateAuthTokenHolder();
        
    	if (authTokenHolder == null)
            throw new RuntimeException(EXCEPTION_MESSAGE);    	
    	
    	WEBFaxGetFaxesByCustomerResult result = null;
 	
    	try {
    			result = netForumXmlSoapPort.webFaxGetFaxesByCustomer(cstKey, authTokenHolder);
    	}
    	catch (Exception ex) {
    		logger.error("NetforumService.findIndividualFaxes error: " + ex.getMessage());
    	}
    	
    	logger.debug("NetforumService.findIndividualFaxes.result=" + (result != null ? String.valueOf(result.getContent().size()) : " IS NULL"));
    	
        return result;
    }      
    

    public static CustomerAddressType findIndividualAddressByKey(String addressKey) {
    	
        Holder<AuthorizationToken> authTokenHolder = generateAuthTokenHolder();
        
    	if (authTokenHolder == null)
            throw new RuntimeException(EXCEPTION_MESSAGE);    	
    	
    	CustomerAddressType address = null;
    	
    	try {
    			address = netForumXmlSoapPort.webAddressGet(addressKey, authTokenHolder);
    	}
    	catch(Exception ex) {
    		logger.error("NetforumService.findIndividualAddressByKey error: " + ex.getMessage());
    	}
    	
        return address;
    }
    
    /**
     * ccExpirationDate - is of YYYY/MM format.
     */
    public static void uploadSingleTradeNamePaymentInfo(String cstKey, String tnNumber, int ccType, String ccExpirationDate, String ccNumber, String ccCardHolderName) {
        Holder<AuthorizationToken> authTokenHolder = generateAuthTokenHolder();
        
        String notes = "Application: " + tnNumber;
        
    	if (authTokenHolder == null)
            throw new RuntimeException(EXCEPTION_MESSAGE);
        
    	try {
    	
	        CentralizedOrderEntryType shoppingCart = netForumXmlSoapPort.pcpcwebCentralizedShoppingCartGetNew(cstKey, "INCI", authTokenHolder);
	        
	        //CentralizedOrderEntryType shoppingCart = netForumXmlSoapPort.webCentralizedShoppingCartGetNew(cstKey, authTokenHolder);	        
	        
	        final String productKey = "3093d46e-fa92-449d-954c-2c76735b97b7";
	        
	        IndividualType individual = findIndividual(cstKey);
	        
	        final String customerXAddressKey = XmlUtil.extractValFromNullableStrElem(individual.getCustomer().getCstCxaKey());
	        
	        System.out.println(customerXAddressKey);
	        
	        InvoiceDetailType oLineItem = netForumXmlSoapPort.webCentralizedShoppingCartGetProductLineItem(
	                productKey, cstKey, customerXAddressKey, authTokenHolder);
	        
	        ObjectFactory objFactory = new ObjectFactory();
	        
	        oLineItem.getInvoiceDetail().setIvdNotes(
	                objFactory.createInvoiceDetailAdditionalInvoiceDetailDataObjectTypeIvdNotes(notes));
	        
	        shoppingCart = netForumXmlSoapPort.webCentralizedShoppingCartAddLineItem(shoppingCart, oLineItem, authTokenHolder);
	        
	        //final String visaMastercardApmKey = "a604c6ce-5e0f-471a-855e-757c8cf5cc54";
	        //final String amexApmKey = "d2bc22f0-f5ed-4948-b0ef-df2a86b74ad9";
	        
	        // old changed on 12/02/2016 
	        /*final String visaApmKey = "A604C6CE-5E0F-471A-855E-757C8CF5CC54";
	        final String mastercardApmKey = "481E73BB-FC9A-4D14-8A74-18D837C45FD1";
	        final String amexApmKey = "D2BC22F0-F5ED-4948-B0EF-DF2A86B74AD9";*/
	        
	        // new changed on 12/02/2016
	        final String visaApmKey = "D7C11233-08DE-4AC7-BDC8-4343EA0E504A";
	        final String mastercardApmKey = "FAA72ADC-0E62-43F7-8A16-D3353D3A6083";
	        final String amexApmKey = "C0A73087-C710-4282-BC08-332365E0CA37";
	        
	        String apmKey = null;
	        if (DOUserCC.MASTERCARD == ccType) {
	            apmKey = mastercardApmKey;
	        } else if (DOUserCC.AMEX == ccType) {
	            apmKey = amexApmKey;
	        } else if (DOUserCC.VISA == ccType) {
	        	apmKey = visaApmKey; 
	        }
	        
	        System.out.println(apmKey);
	        
	        shoppingCart.getPaymentInfo().setPinCcCardholderName(
	        		objFactory.createCentralizedOrderEntryPaymentInfoDataObjectTypePinCcCardholderName(ccCardHolderName));
	        
	        shoppingCart.getPaymentInfo().setPinApmKey(
	                objFactory.createCentralizedOrderEntryPaymentInfoDataObjectTypePinApmKey(apmKey));
	        
	        /*shoppingCart.getPaymentInfo().setPinCheckAmount(
	                objFactory.createCentralizedOrderEntryPaymentInfoDataObjectTypePinCheckAmount(oLineItem
	                        .getInvoiceDetail().getIvdNettotal().getValue()));*/	        
        
	        //shoppingCart.getInvoice().setInvAutoapply(objFactory.createCentralizedOrderEntryInvoiceDetailDataObjectTypeIvdApproveFlag((short)1));
	        //shoppingCart.getInvoice().setInvAutoapplypayment(objFactory.createCentralizedOrderEntryInvoiceDetailDataObjectTypeIvdApproveFlag((short)1));
	        
	        shoppingCart.getPaymentInfo().setPinCcExpire(
	                objFactory.createCentralizedOrderEntryPaymentInfoDataObjectTypePinCcExpire(ccExpirationDate));
	        
	        shoppingCart.getPaymentInfo().setPinCcNumber(
	                objFactory.createCentralizedOrderEntryPaymentInfoDataObjectTypePinCcNumber(ccNumber));
	        
	        //netForumXmlSoapPort.webCentralizedShoppingCartInsert(shoppingCart, authTokenHolder);
	        netForumXmlSoapPort.pcpcwebCentralizedShoppingCartInsert(shoppingCart, true, authTokenHolder);
    	}
    	catch (Exception ex) {
    		System.out.println("NetforumService.uploadSingleTradeNamePaymentInfo.error: " + ex.getMessage());
    		logger.error("NetforumService.uploadSingleTradeNamePaymentInfo.error: " + ex.getMessage());
    	}
    }
    
    /**
     * ccExpirationDate - is of YYYY/MM format.
     */
    public static int uploadSingleTradeNamePaymentInfo2(String cstKey, String tnNumber, int ccType, String ccExpirationDate, String ccNumber, String ccCardHolderName, String ccCVV2) {
        Holder<AuthorizationToken> authTokenHolder = generateAuthTokenHolder();
        
        // note to pass to netforum method
        String notes = "Application: " + tnNumber;        
        
        /*
         * 0 - failed
         * 1 - success
         * -1 - netforum is not available
         */
        int result = 0;
        
    	if (authTokenHolder == null) {
    		// netforum is not available
    		result = -1; 
    	}	
    	else {
	    	try {
	    		/*System.out.println("start--");
	    		System.out.println(cstKey);
	    		System.out.println(authTokenHolder.toString());*/
		        CentralizedOrderEntryType shoppingCart = netForumXmlSoapPort.pcpcwebCentralizedShoppingCartGetNew(cstKey, "INCI", authTokenHolder);
		        //CentralizedOrderEntryType shoppingCart = netForumXmlSoapPort.webCentralizedShoppingCartGetNew(cstKey, authTokenHolder);	        
		        
		        final String productKey = "3093d46e-fa92-449d-954c-2c76735b97b7";
		        
		        IndividualType individual = findIndividual(cstKey);
		        
		        //System.out.println(cstKey);
		        
		        final String customerXAddressKey = XmlUtil.extractValFromNullableStrElem(individual.getCustomer().getCstCxaKey());
		        
		        //System.out.println(customerXAddressKey);
		        
		        InvoiceDetailType oLineItem = netForumXmlSoapPort.webCentralizedShoppingCartGetProductLineItem(
		                productKey, cstKey, customerXAddressKey, authTokenHolder);
		        
		        ObjectFactory objFactory = new ObjectFactory();
		        
		        oLineItem.getInvoiceDetail().setIvdNotes(
		                objFactory.createInvoiceDetailAdditionalInvoiceDetailDataObjectTypeIvdNotes(notes));
		        
		        CentralizedOrderEntryType shoppingCartColler = netForumXmlSoapPort.webCentralizedShoppingCartAddLineItem(shoppingCart, oLineItem, authTokenHolder);
		        
		        
		        // old changed on 12/02/2016 
		        /*final String visaApmKey = "A604C6CE-5E0F-471A-855E-757C8CF5CC54";
		        final String mastercardApmKey = "481E73BB-FC9A-4D14-8A74-18D837C45FD1";
		        final String amexApmKey = "D2BC22F0-F5ED-4948-B0EF-DF2A86B74AD9";*/
		        
		        // new changed on 12/02/2016
		        final String visaApmKey = "D7C11233-08DE-4AC7-BDC8-4343EA0E504A";
		        final String mastercardApmKey = "FAA72ADC-0E62-43F7-8A16-D3353D3A6083";
		        final String amexApmKey = "C0A73087-C710-4282-BC08-332365E0CA37";
		        
		        
		        String apmKey = null;
		        if (DOUserCC.MASTERCARD == ccType) {
		            apmKey = mastercardApmKey;
		        } else if (DOUserCC.AMEX == ccType) {
		            apmKey = amexApmKey;
		        } else if (DOUserCC.VISA == ccType) {
		        	apmKey = visaApmKey; 
		        }
		        
		        /*if (shoppingCartColler == null) {
		        	System.out.println("is null");
		        }
		        else {
		        	System.out.println("is not null");
		        }
		        
		        System.out.println(apmKey);*/
		        
		        shoppingCartColler.getPaymentInfo().setPinCcCardholderName(
		        		objFactory.createCentralizedOrderEntryPaymentInfoDataObjectTypePinCcCardholderName(ccCardHolderName));
		        
		        shoppingCartColler.getPaymentInfo().setPinApmKey(
		                objFactory.createCentralizedOrderEntryPaymentInfoDataObjectTypePinApmKey(apmKey));
		        
		        /*shoppingCart.getPaymentInfo().setPinCheckAmount(
		                objFactory.createCentralizedOrderEntryPaymentInfoDataObjectTypePinCheckAmount(oLineItem
		                        .getInvoiceDetail().getIvdNettotal().getValue()));*/	        
	        
		        //shoppingCart.getInvoice().setInvAutoapply(objFactory.createCentralizedOrderEntryInvoiceDetailDataObjectTypeIvdApproveFlag((short)1));
		        //shoppingCart.getInvoice().setInvAutoapplypayment(objFactory.createCentralizedOrderEntryInvoiceDetailDataObjectTypeIvdApproveFlag((short)1));
		        
		        shoppingCartColler.getPaymentInfo().setPinCcExpire(
		                objFactory.createCentralizedOrderEntryPaymentInfoDataObjectTypePinCcExpire(ccExpirationDate));
		        
		        shoppingCartColler.getPaymentInfo().setPinCcNumber(
		                objFactory.createCentralizedOrderEntryPaymentInfoDataObjectTypePinCcNumber(ccNumber));
		        
		        // CVV
		        shoppingCartColler.getPaymentInfo().setPinCcSecurityCode(objFactory.createCentralizedOrderEntryPaymentInfoDataObjectTypePinCcSecurityCode(ccCVV2));
		        
		        //netForumXmlSoapPort.webCentralizedShoppingCartInsert(shoppingCart, authTokenHolder);
		        
		        /*if (shoppingCartColler.getInvoiceDetailCollection() != null)
		        	System.out.println("not null");
		        else
		        	System.out.println("null");
		        
		        System.out.println("size="+shoppingCartColler.getInvoiceDetailCollection().getInvoiceDetail().size());*/
		        
		        netForumXmlSoapPort.pcpcwebCentralizedShoppingCartInsert(shoppingCartColler, true, authTokenHolder);
		        
		        result = 1;
	    	}
	    	catch (Exception ex) {
	    		result = 0;
	    		logger.error("NetforumService.uploadSingleTradeNamePaymentInfo2.error: " + ex.getMessage());
	    	}
    	}
    	
		logger.debug("uploadSingleTradeNamePaymentInfo2.result=" + result);
		logger.debug("cstKey=" + cstKey);
		logger.debug("notes=" + notes);
		logger.debug("ccTypeID=" + ccType);
		logger.debug("ccExpirationDate=" + ccExpirationDate);
		logger.debug("ccNumber=" + ccNumber);
    	
    	return result;
    }
    
    /**
     * ccExpirationDate - is of YYYY/MM format.
     */
    public static void uploadSingleTradeNamePaymentInfo_old(String cstKey, String notes, int ccType, String ccExpirationDate, String ccNumber) {
        Holder<AuthorizationToken> authTokenHolder = generateAuthTokenHolder();
        
    	if (authTokenHolder == null)
            throw new RuntimeException(EXCEPTION_MESSAGE);
        
    	try {
    	
	        CentralizedOrderEntryType shoppingCart = netForumXmlSoapPort.pcpcwebCentralizedShoppingCartGetNew(cstKey,
	                "INCI", authTokenHolder);
	        
	        //CentralizedOrderEntryType shoppingCart = netForumXmlSoapPort.webCentralizedShoppingCartGetNew(cstKey, authTokenHolder);
	        
	        
	        final String productKey = "3093d46e-fa92-449d-954c-2c76735b97b7";                                   
	        
	        IndividualType individual = findIndividual(cstKey);
	        
	        final String customerXAddressKey = XmlUtil.extractValFromNullableStrElem(individual.getCustomer()
	                .getCstCxaKey());
	        InvoiceDetailType oLineItem = netForumXmlSoapPort.webCentralizedShoppingCartGetProductLineItem(
	                productKey, cstKey, customerXAddressKey, authTokenHolder);
	        
	        ObjectFactory objFactory = new ObjectFactory();
	        
	        oLineItem.getInvoiceDetail().setIvdNotes(
	                objFactory.createInvoiceDetailAdditionalInvoiceDetailDataObjectTypeIvdNotes(notes));
	        
	        shoppingCart = netForumXmlSoapPort.webCentralizedShoppingCartAddLineItem(shoppingCart, oLineItem, authTokenHolder);
	        
	        final String visaMastercardApmKey = "a604c6ce-5e0f-471a-855e-757c8cf5cc54";
	        final String amexApmKey = "d2bc22f0-f5ed-4948-b0ef-df2a86b74ad9";
	        
	        String apmKey = null;
	        if (DOUserCC.MASTERCARD == ccType || DOUserCC.VISA == ccType) {
	            apmKey = visaMastercardApmKey;
	        } else if (DOUserCC.AMEX == ccType) {
	            apmKey = amexApmKey;
	        }
	        
	        shoppingCart.getPaymentInfo().setPinApmKey(
	                objFactory.createCentralizedOrderEntryPaymentInfoDataObjectTypePinApmKey(apmKey));
	        
	        shoppingCart.getPaymentInfo().setPinCheckAmount(
	                objFactory.createCentralizedOrderEntryPaymentInfoDataObjectTypePinCheckAmount(oLineItem
	                        .getInvoiceDetail().getIvdNettotal().getValue()));
	        
	        shoppingCart.getPaymentInfo().setPinCcExpire(
	                objFactory.createCentralizedOrderEntryPaymentInfoDataObjectTypePinCcExpire(ccExpirationDate));
	        
	        shoppingCart.getPaymentInfo().setPinCcNumber(
	                objFactory.createCentralizedOrderEntryPaymentInfoDataObjectTypePinCcNumber(ccNumber));
	        
	        netForumXmlSoapPort.webCentralizedShoppingCartInsert(shoppingCart, authTokenHolder);
    	}
    	catch (Exception ex) {
    		System.out.println("NetforumService.uploadSingleTradeNamePaymentInfo.error: " + ex.getMessage());
    		logger.error("NetforumService.uploadSingleTradeNamePaymentInfo.error: " + ex.getMessage());
    	}
    }
    

    private static Holder<AuthorizationToken> generateAuthTokenHolder() {
        Holder<AuthorizationToken> authTokenHolder = new Holder<AuthorizationToken>();
        
        try {
        	logger.debug("START NETFORUM authentication ##### ");
        	netForumXmlSoapPort.authenticate(netforumXmlUsername, netforumXmlPassword, authTokenHolder);
        	//netForumXmlSoapPort.authenticate("Proximoxweb", "xwebProximo", authTokenHolder);
        	logger.debug("END NETFORUM authentication ##### ");
        } 
        catch(Exception ex){
        	logger.error("NetforumService.generateAuthTokenHolder error: " + ex.getMessage());
        }
        
   		return authTokenHolder;
    }
}
