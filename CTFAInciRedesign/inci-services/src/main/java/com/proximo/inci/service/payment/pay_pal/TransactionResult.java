/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.service.payment.pay_pal;

import java.util.HashMap;
import java.util.StringTokenizer;

public class TransactionResult {

    private HashMap<String, String> result;
    private String origID;

    public TransactionResult(String resultCodes, String origID) {
        this.origID = origID;
        
        StringTokenizer st = new StringTokenizer(resultCodes, "&");
        result = new HashMap<String, String>();
        while (st.hasMoreTokens()) {
            String keyValue = st.nextToken();
            StringTokenizer st1 = new StringTokenizer(keyValue, "=");
            String key = st1.nextToken();
            String value = st1.nextToken();
            result.put(key, value);
        }
    }

    public String getResult() {
        return parseValueAsString(result.get("RESULT"));
    }

    public String getResponseMessage() {
        return parseValueAsString(result.get("RESPMSG"));
    }

    public String getAuthCode() {
        return parseValueAsString(result.get("AUTHCODE"));
    }

    public String getReference() {
        return parseValueAsString(result.get("PNREF"));
    }

    public String getCVVMatch() {
        Object x = result.get("CVV2MATCH");
        if (x != null) {
            return (String) x;
        } else {
            /*
             * From the old system's code: GN 10/16/09 if CVV was not returned
             * in result, it means it's not relevant. Set return value to X -->
             * don't care
             */
            return "X";
        }
    }

    public String getAvsAddress() {
        return parseValueAsString(result.get("AVSADDR"));
    }

    public String getAvsZip() {
        return parseValueAsString(result.get("AVSZIP"));
    }
    
    public boolean isResultValid() {
        if (origID != null && !origID.equalsIgnoreCase("")) {
            return getResult().equalsIgnoreCase("0");
        } else {
            return validateResult();
        }        
    }
    
    public HashMap<String, String> getResult1() {
    	return result;
    }
    
    /* Taken from the old system's code */
    private boolean validateResult(){
        boolean isResultMatch = getResult().equalsIgnoreCase("0");
        //SJ May 24 2007 return of X means that this function is not supported
        //by the credit card.  In this case allow this check for CvvMatch.
        //This was discovered while doing AMEX transactions.  AMEX only returns this field
        //if they give the company the privilege.
        boolean isCvvMatch = getCVVMatch().equalsIgnoreCase("Y") || getCVVMatch().equalsIgnoreCase("X");
        
        //SJ June 04, 007: For international Cards, banks do not support AVSZIP field. 
        //PayFlowService will return an X for these fields 
        boolean isZipMatch = getAvsZip().equalsIgnoreCase("Y") || getAvsZip().equalsIgnoreCase("X");
        
        //SJ June 04, 007: For international Cards, banks do not support AVSADDR field. 
        //PayFlowService will return an X for these fields 
        
        boolean isAddressMatch = getAvsAddress().equals("Y") || getAvsAddress().equals("X");

        //SJ October 3, 2007 PO Boxes are not getting approved
        //as a resolution ignore addressmatch
        //GN November 19, 2009 As per discussion with Donna, 
        //IF the bank allows the transaction to be approved without the Zip Matching
        //then so will we. OOur only check is against the main result and the CVV (VISA, Mastercard)
        return isResultMatch && isCvvMatch; // && isZipMatch; // && isAddressMatch;
            
    }    
    
    private static String parseValueAsString(Object value) {
        if (value != null) {
            return (String) value;
        } else {
            return "";
        }        
    }
    
    

}
