/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.service.tradename.pdf;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.xml.ws.Holder;

//import org.apache.axis.utils.StringUtils;

import com.avectra._2005.AuthorizationToken;
import com.avectra._2005.NetForumXML;
import com.avectra._2005.NetForumXMLSoap;
import com.proximo.inci.AbstractServiceTest;
import com.proximo.inci.DOTradeName;
import com.proximo.inci.service.security.NetforumSecurityTest;
import com.proximo.inci.service.security.SecurityService;
import com.proximo.inci.service.security.user.User;
import com.proximo.inci.service.tradename.TradeNameService;

public class PDFTestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			testGetTradeName();
			//test1();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (NamingException e) {
			e.printStackTrace();
		}
		
	}
	

    @SuppressWarnings("unused")
	private static void test1() throws SQLException, NamingException {
        AbstractServiceTest test = new AbstractServiceTest(true) {
            @Override
            protected void runTest() {
            	final String DEFAULT_MSG = "In response to your INCI name application, "
            + "the following additional information is required in order to assign an INCI name to your material. \n\n"
            
            + "Please enter responses in the \"User Response to Comments\" area of the application form. "
            + "You will be unable to edit any fields on the application. If additional space is needed, "
            + "attachments to the application may be uploaded. However, you must note \"see attachment\" in the comments box. \n\n"
    
    		+ "You must respond within 12 months or your application will be considered no longer active and moved to the Archived area. \n\n"; 
            	
            	
            	String str = DEFAULT_MSG.replace("\n", "");
            	
            	
            	System.out.println(DEFAULT_MSG);
            	System.out.println(str);
            	
            	//String userMessage = "dima message 1";
            	
            	//String str = "[Note to Proximo: comments go here.]"; 
            	
            	//System.out.println(DEFAULT_MSG.substring(DEFAULT_MSG.indexOf(str) + str.length()));
            }
        };
    }	
	
	
    @SuppressWarnings("unused")
	private static void testGetTradeName() throws SQLException, NamingException {
        AbstractServiceTest test = new AbstractServiceTest(true) {
            @Override
            protected void runTest() {
            	
            	initContext();
            	//----------------------------------
            	
        		String filename = "c:/FirstPdf.pdf";
        		
        		BufferedOutputStream bs = null;

        		try {

                    long recId = 299352;
                    String userId = "423d7c56-85bf-4056-bbe8-980cd43c8946";
                    DOTradeName tn = TradeNameService.getTradeName(recId, userId);
                    
                    
                    System.out.println(tn.tnNumber);
                    System.out.println(tn.inciNameDt);                    
                    
                    User user = SecurityService.findUserByRecId(userId);
                    String basepath = "C:/apache-tomcat-7.0.34/webapps/inci-app/VAADIN/themes/inci-app-theme/images/";
        			
        		    FileOutputStream fs = new FileOutputStream(new File(filename));
        		    bs = new BufferedOutputStream(fs);
        		    bs.write(PDFTest.asssignmentNoticeAttachment(tn, user, basepath));
        		    /*bs.write(PrintPdf.generatePDF(tn, "10 November 2013 00:45 AM"+
					"Your application, gda gdimas 111111 (1-10-2013-0341), has been saved, but not submitted. Once we receive a"+
					"check for $1.00, your application will be submitted and processed by the Personal Care Products Council. Please"+
					"print this page for your reference. The Reference ID for this transaction is 93005."+
					"Refund Policy"+
					"You have 24 hours from the time that you place your order to cancel your order for a partial refund. Cancellations"+
					"must be submitted in writing to inci@personalcarecouncil.org. An administrative fee of $30.00 will be deducted from"+
					"the amount of your refund. Refunds will be processed utilizing the same payment method used to place the original"+
					"order. No refunds will be issued for orders cancelled more than 24 hours after the order has been placed.", "c:/"));*/
        		    //bs.write(AssignmentPDF.sssignmentNoticeAttachment(tn));
        		    //bs.write(PDFTest.sssignmentNoticeAttachment());
        		    bs.close();
        		    bs = null;
        		    
        		    System.out.println(filename + " generated !");
        		    
        		    //testGetTradeName();
        		} catch (Exception e) {
        		    e.printStackTrace();
        		}

        		if (bs != null) try { bs.close(); } catch (Exception e) {}
            }
        };
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

}
