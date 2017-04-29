/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.service.payment.pay_pal;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import paypal.payflow.PayflowAPI;

import com.proximo.inci.DOUserCC;
import com.proximo.inci.exception.InciException;

public class PayFlowService {

    private static Logger logger = LoggerFactory.getLogger(PayFlowService.class);

    public final static String JNDI_PAYFLOW_HOST_ADDRESS = "java:comp/env/payflow/host_address";
    public final static String JNDI_PAYFLOW_PARTNER = "java:comp/env/payflow/partner";
    public final static String JNDI_PAYFLOW_VENDOR = "java:comp/env/payflow/vendor";
    public final static String JNDI_PAYFLOW_USER = "java:comp/env/payflow/user";
    public final static String JNDI_PAYFLOW_PASSWORD = "java:comp/env/payflow/password";

    private static final String hostAddress;
    private static final int hostPort;
    private static final int timeout;
    private static final String proxyAddress;
    private static final int proxyPort;
    private static final String proxyLogon;
    private static final String proxyPassword;
    private static final String partner;
    private static final String vendor;
    private static final String user;
    private static final String password;

    static {
        logger.info("Initializing Pay Flow service");
        try {
            Context ctx = new InitialContext();
            hostAddress = (String) ctx.lookup(JNDI_PAYFLOW_HOST_ADDRESS);
            partner = (String) ctx.lookup(JNDI_PAYFLOW_PARTNER);
            vendor = (String) ctx.lookup(JNDI_PAYFLOW_VENDOR);
            user = (String) ctx.lookup(JNDI_PAYFLOW_USER);
            password = (String) ctx.lookup(JNDI_PAYFLOW_PASSWORD);

            hostPort = 443;
            timeout = 30;
            proxyAddress = "";
            proxyPort = 0;
            proxyLogon = "";
            proxyPassword = "";
        } catch (NamingException e) {
            logger.error("Unable to retrieve Pay Flow service's JNDI initialization parameters", e);
            //throw new InciException();
            throw new RuntimeException(e);
        }
        logger.info("Finished initializing Pay Flow service");
    }
    
    public static final String TENDER_AUTOMATED_CLEARINGHOUSE = "A";
    public static final String TENDER_CREDIT_CARD = "C";
    public static final String TENDER_PINLESS_DEBIT = "D";
    public static final String TENDER_ELECTRONIC_CHECK = "E";
    public static final String TENDER_TELECHECK = "K";
    public static final String TENDER_PAYPAL = "P";

    public static final String TRXTYPE_SALE = "S";
    public static final String TRXTYPE_CREDIT = "C";
    public static final String TRXTYPE_AUTHORIZATION = "A";
    public static final String TRXTYPE_DELAYED_CAPTURE = "D";
    public static final String TRXTYPE_VOID = "V";
    public static final String TRXTYPE_VOICE_AUTHORIZATION = "F";
    public static final String TRXTYPE_INQUIRY = "I";

    public static final String CURRENCY_US_DOLLAR = "USD";
    public static final String CURRENCY_EURO = "EUR";
    public static final String CURRENCY_UK_POUND = "GBP";
    public static final String CURRENCY_CANADIAN_DOLLAR = "CAD";
    public static final String CURRENCY_JAPANESE_YEN = "JPY";
    public static final String CURRENCY_AUSTRALIAN_DOLLAR = "AUD";    

    /** Not intended to be instantiated. Exposed only static members. */
    private PayFlowService() {
    }

    public static TransactionResult authenticate(final DOUserCC userCC, String tenderType, String trxType, double amount, String origID) {
        return authenticate(userCC, tenderType, trxType, amount, CURRENCY_US_DOLLAR, origID);
    }

    public static TransactionResult authenticate(final DOUserCC userCC, String tenderType, String trxType, double amount,
            String currency, String origID) {
        return authenticate(userCC, tenderType, trxType, amount, currency, "", "", "", origID);
    }

    public static TransactionResult authenticate(final DOUserCC userCC, String tenderType, String trxType, double amount,
            String currency, String comment1, String comment2, String invoiceNumber, String origID) {
    	
    	/*
    	 * this call will validate the CC and charge the CC for the amount 
    	 */
    	
        // Calls the client with this constructor
        PayflowAPI payFlowApi = new PayflowAPI(hostAddress, hostPort, timeout, proxyAddress, proxyPort, proxyLogon,
                proxyPassword);

        int addressLength = userCC.address1.length() + userCC.address2.length() + userCC.address3.length() + 2;

        // lets use a common string that is required for any type of transaction
        String paramListCommon = "USER=" + user + "&VENDOR=" + vendor + "&PARTNER=" + partner + "&PWD=" + password
                + "&TRXTYPE=" + trxType + "&TENDER=" + tenderType;

        String paramList = "";
        paramList = paramListCommon + "&ACCT=" + userCC.ccNumber + "&EXPDATE=" + userCC.getExpDateMMDDFormat()
                + "&AMT=" + amount + "&COMMENT1=" + comment1 + "&COMMENT2=" + comment2 + "&INVNUM=" + invoiceNumber
                + "&STREET[" + addressLength + "]=" + userCC.address1 + " " + userCC.address2 + " " + userCC.address3
                + "&ZIP=" + userCC.zip + "&CVV2=" + userCC.ccSecurityCode + "&FNAME[" + userCC.firstName.length()
                + "]=" + userCC.firstName + "&LNAME[" + userCC.lastName.length() + "]=" + userCC.lastName;

        // Used for Capture Delay
        // we could have used transaction type check but since it works with the
        // current system
        // we will not change it
        if (origID != null && !origID.equalsIgnoreCase("")) {
            paramList = paramListCommon + "&ORIGID=" + origID;
        }

        // Used for Credit Transactions (Refunds)
        if (trxType.equalsIgnoreCase(TRXTYPE_CREDIT)) {
            paramList = paramListCommon + "&ORIGID=" + origID + "&COMMENT1=" + comment1 + "&COMMENT2=" + comment2;

            // if amount is 0 then the original transaction will get the full
            // refund of what was originally charged
            // Specify amount in order to refund a particular amount
            if (amount >= 0.0)
                paramList = paramList + "&AMT=" + amount;
        }

        logger.debug("PayFlowService.TransactionResult paramList=" + paramList);
        
        String rc = payFlowApi.submitTransaction(paramList, payFlowApi.generateRequestId());

        return new TransactionResult(rc, origID);
    }

}