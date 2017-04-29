/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.service.pay_pal;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.xml.ws.Holder;

import paypal.payflow.PayflowAPI;

import com.avectra._2005.AuthorizationToken;
import com.avectra._2005.NetForumXML;
import com.avectra._2005.NetForumXMLSoap;
import com.proximo.inci.AbstractServiceTest;
import com.proximo.inci.DOTradeName;
import com.proximo.inci.DOUserCC;
import com.proximo.inci.service.payment.pay_pal.PayFlowService;
import com.proximo.inci.service.payment.pay_pal.TransactionResult;
import com.proximo.inci.service.security.NetforumSecurityTest;
import com.proximo.inci.service.security.SecurityService;
import com.proximo.inci.service.security.user.User;
import com.proximo.inci.service.tradename.TradeNameService;
import com.proximo.inci.service.user_info.UserInfoService;

public class PayPalTest {
	
	final static String hostAddress = "payflowpro.paypal.com";
	final static String user = "dkoterbactfa";
	final static String vendor = "dkoterbactfa";
	final static String partner = "PayPal";
	final static String password = "25ingredient47";
	final static int hostPort = 443;
	final static int timeout = 30;
	final static String proxyAddress = "";
	final static int proxyPort = 0;
	final static String proxyLogon = "";
	final static String proxyPassword = "";	
	
    public static void main(String[] args) throws SQLException, NamingException {
        testService();
    }
    
    @SuppressWarnings("unused")
	private static void testService() throws SQLException, NamingException {
        AbstractServiceTest test = new AbstractServiceTest(true) {
            @Override
            protected void runTest() {
            	
            	//-----------------------
            	//initContext();
            	//-----------------------
            	
                String cstKey = "548ec95d-4779-48d3-a147-4c6501c0557e"; // gnagy                
                //User user = SecurityService.findUserByRecId(cstKey);
                
                //System.out.println("user.getLoginId=" + user.getUserFullName());
                //System.out.println("user.getLoginId=" + user.getLoginId());
                
                long tnrecID = 299552; 
                
                ///DOTradeName tn = TradeNameService.getTradeName(tnrecID, cstKey);                
                
                //System.out.println(tn.tnNumber);
                //System.out.println(tn.tradeName);
                
                DOUserCC userCC = new DOUserCC();
                //UserInfoService.getUserDefaultCreditCard(cstKey);
                
                //System.out.println(userCC.ccNumber);
                //System.out.println(userCC.lastName);
                
                int tnPaymentAmount = 0;
                
                /*authenticate(userCC, PayFlowService.TENDER_CREDIT_CARD,
                        PayFlowService.TRXTYPE_AUTHORIZATION, tnPaymentAmount, PayFlowService.CURRENCY_US_DOLLAR,
                        "Trade Name: " + tn.tnNumber, "Payment by " + user.getLoginId(),
                        tn.tnNumber, "");*/
                
                authenticate(userCC, /*PayFlowService.TENDER_CREDIT_CARD*/"C",
                        PayFlowService.TRXTYPE_AUTHORIZATION, tnPaymentAmount, PayFlowService.CURRENCY_US_DOLLAR,
                        "Trade Name: " + "1-11-2013-0369", "Payment by " + "gnagy@proximo.com",
                        "1-11-2013-0369", "");
            }
        };
    }
    
    // authenticate pay pal
    public static void authenticate(final DOUserCC userCC, String tenderType, String trxType, double amount,
            String currency, String comment1, String comment2, String invoiceNumber, String origID) {
        // Calls the client with this constructor
        PayflowAPI payFlowApi = new PayflowAPI(hostAddress, hostPort, timeout, proxyAddress, proxyPort, proxyLogon,
                proxyPassword);

        //int addressLength = userCC.address1.length() + userCC.address2.length() + userCC.address3.length() + 2;
        int addressLength = "street 1".length() + "street 2".length() + "street 3".length() + 2;

        // lets use a common string that is required for any type of transaction
        String paramListCommon = "USER=" + user + "&VENDOR=" + vendor + "&PARTNER=" + partner + "&PWD=" + password
                + "&TRXTYPE=" + trxType + "&TENDER=" + tenderType;

        String paramList = "";
        /*paramList = paramListCommon + "&ACCT=" + userCC.ccNumber + "&EXPDATE=" + userCC.getExpDateMMDDFormat()
                + "&AMT=" + amount + "&COMMENT1=" + comment1 + "&COMMENT2=" + comment2 + "&INVNUM=" + invoiceNumber
                + "&STREET[" + addressLength + "]=" + userCC.address1 + " " + userCC.address2 + " " + userCC.address3
                + "&ZIP=" + userCC.zip + "&CVV2=" + userCC.ccSecurityCode + "&FNAME[" + userCC.firstName.length()
                + "]=" + userCC.firstName + "&LNAME[" + userCC.lastName.length() + "]=" + userCC.lastName;*/
        
        paramList = paramListCommon + "&ACCT=" + "4335233336XXXX" + "&EXPDATE=" + getExpDateMMDDFormat(6, 2016)
                + "&AMT=" + amount + "&COMMENT1=" + comment1 + "&COMMENT2=" + comment2 + "&INVNUM=" + invoiceNumber
                + "&STREET[" + addressLength + "]=" + "street 1" + " " + "street 2" + " " + "street 3"
                + "&ZIP=" + "11" + "&CVV2=" + "132" + "&FNAME[" + "gutu".length()
                + "]=" + "gutu" + "&LNAME[" + "dima".length() + "]=" + "dima";        

        // Used for Capture Delay
        // we could have used transaction type check but since it works with the
        // current system
        // we will not change it
        if (origID != null && !origID.equalsIgnoreCase("")) {
            paramList = paramListCommon + "&ORIGID=" + origID;
        }

        // Used for Credit Transactions (Refunds)
        if (trxType.equalsIgnoreCase(PayFlowService.TRXTYPE_CREDIT)) {
            paramList = paramListCommon + "&ORIGID=" + origID + "&COMMENT1=" + comment1 + "&COMMENT2=" + comment2;

            // if amount is 0 then the original transaction will get the full
            // refund of what was originally charged
            // Specify amount in order to refund a particular amount
            if (amount >= 0.0)
                paramList = paramList + "&AMT=" + amount;
        }
        System.out.println("paramList="+paramList);
        
        String rc = payFlowApi.submitTransaction(paramList, payFlowApi.generateRequestId());
        
        System.out.println("rc="+rc);
        System.out.println("origID="+origID);
        
        TransactionResult tr = new TransactionResult(rc, origID);
        
        HashMap<String, String> result = tr.getResult1();
        
        Iterator it = result.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pairs = (Map.Entry)it.next();
            System.out.println(pairs.getKey() + " = " + pairs.getValue());
            //it.remove(); // avoids a ConcurrentModificationException
        }
        
        
        
        System.out.println(tr.isResultValid());
        
        //return new TransactionResult(rc, origID);
    }
    
    private static void initContext() {
        NetforumSecurityTest.initMockJndi();
        
        //UserSearchParams searchParams = new UserSearchParams("", "", "nagy");
        
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
    }
    
    public static String getExpDateMMDDFormat(int ccExpMonth, int ccExpYear) {
    	String expDateStr = new String();
        String month = "";
        String year = "";
        
        if (ccExpMonth != 0 && ccExpYear != 0){
            if (ccExpMonth < 10)
                month = "0" + ccExpMonth;
            else
                month = Integer.toString(ccExpMonth);
            
            year = Integer.toString(ccExpYear);
            char[] yearArray = year.toCharArray();
            year = yearArray[yearArray.length - 2] + "" + yearArray[yearArray.length - 1];
            
            expDateStr = month + year;
        }
        
        return expDateStr;
    }
   

}
