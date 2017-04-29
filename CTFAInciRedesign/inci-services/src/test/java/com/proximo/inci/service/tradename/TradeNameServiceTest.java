/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.service.tradename;

import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.xml.ws.Holder;

import com.avectra._2005.AuthorizationToken;
import com.avectra._2005.NetForumXML;
import com.avectra._2005.NetForumXMLSoap;
import com.proximo.inci.AbstractServiceTest;
import com.proximo.inci.DOTradeName;
import com.proximo.inci.common.TDate;
import com.proximo.inci.service.netforum.NetforumService;
import com.proximo.inci.service.tradename.TradeNameSearchResult;
import com.proximo.inci.service.tradename.TradeNameService;

public class TradeNameServiceTest {

    public static void main(String[] args) throws SQLException, NamingException {
        //testQuickTradeNameSearch();
        testGetTradeName();
    }

    private static void testQuickTradeNameSearch() throws SQLException, NamingException {
        @SuppressWarnings("unused")
        AbstractServiceTest test = new AbstractServiceTest(true) {
            @Override
            public void runTest() {
                String userRecId = "-1";
                String tradeName = "";
                String tnNumber = "";
                String exportStatus = "A";
                String companyName = "";
                TDate entryDt_Start = new TDate();
                TDate entryDt_End = new TDate();
                entryDt_Start.setNull();
                entryDt_End.setNull();
                boolean isOutstdComments = false;
                boolean isRespondComments = false;
                int catId = 0;
                TDate expFromDt = new TDate();
                expFromDt.setNull();
                TDate expToDt = new TDate();
                expToDt.setNull();
                TDate antFromDt = new TDate();
                antFromDt.setNull();
                TDate antToDt = new TDate();
                antToDt.setNull();
                String submissionStatus = "";
                int pageSize = 5;
                int pageNumber = 1;
                TradeNameSearchResult searchResult = TradeNameService.quickTradeNameSearch(userRecId, tradeName, tnNumber,
                        exportStatus, companyName, entryDt_Start, entryDt_End, isOutstdComments, isRespondComments, catId, expFromDt,
                        expToDt, antFromDt, antToDt, submissionStatus, pageSize, pageNumber, "", 1);
                if (searchResult != null) {
                    System.out.println(searchResult.getTnList().toString());
                } else {
                    System.out.println("OK. Returned empty list.");
                }
            }
        };
    }
    
    @SuppressWarnings("unused")
	private static void testGetTradeName() throws SQLException, NamingException {
        AbstractServiceTest test = new AbstractServiceTest(true) {
            @Override
            protected void runTest() {
                /*long recId = 188185;
                String userId = "DKOTERBA";
                DOTradeName tn = TradeNameService.getTradeName(recId, userId);
                System.out.println(tn.tnNumber);
                System.out.println(tn.EINECSNumber);*/
            	
               /* NetForumXMLSoap netForumXmlSoapPort=null;
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
                }   */         	
            	
                int result = NetforumService.uploadSingleTradeNamePaymentInfo2("97E708B8-BE28-4643-91A2-217CC69ACB8C", "1-11-2014-0462", 
    	        		2, "2015/03", "4111111111111111", "test", "0001");
                
                System.out.println(result);
            }
        };
    }
}
