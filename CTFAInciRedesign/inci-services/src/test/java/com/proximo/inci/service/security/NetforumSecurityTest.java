/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.service.security;

import java.sql.SQLException;

import javax.naming.NamingException;

import com.avectra._2005.IndividualType;
import com.proximo.inci.AbstractServiceTest;
import com.proximo.inci.DOCreditCardReport;
import com.proximo.inci.DOList;
import com.proximo.inci.DOTradeName;
import com.proximo.inci.DOUserCC;
import com.proximo.inci.jndi.InitialContextFactoryForTest;
import com.proximo.inci.service.netforum.NetforumService;
import com.proximo.inci.service.payment.TradeNamePaymentService;
import com.proximo.inci.service.tradename.TradeNameService;
import com.proximo.inci.xml.XmlUtil;

public class NetforumSecurityTest {

    private static final String NETFORUM_USERNAME = "Proximoxweb";
    private static final String NETFORUM_PASSWORD = "xwebProximo";

    public static void main(String[] args) throws SQLException, NamingException {
        //test2();
    	test();
    	//test3();
    	//test4();
    }

    public static void initMockJndi() {
        InitialContextFactoryForTest.bind(NetforumService.JNDI_NETFORUM_USERNAME, NETFORUM_USERNAME);
        InitialContextFactoryForTest.bind(NetforumService.JNDI_NETFORUM_PASSWORD, NETFORUM_PASSWORD);
    }

    private static void test() throws SQLException, NamingException {
        @SuppressWarnings("unused")
        AbstractServiceTest test = new AbstractServiceTest(true) {
            @Override
            protected void initMockJndiContext() {
                initMockJndi();
            }

            @Override
            public void runTest() {
                IndividualType individual = NetforumService.findIndividual("548ec95d-4779-48d3-a147-4c6501c0557e");
                System.out.println(individual.getIndividual().getIndFullNameCp().getValue());                
            }
        };
    }
    
    private static void test2() throws SQLException, NamingException {
        @SuppressWarnings("unused")
        AbstractServiceTest test = new AbstractServiceTest(true) {
            @Override
            protected void initMockJndiContext() {
                initMockJndi();
            }

            @Override
            public void runTest() {
                //NetforumService.uploadSingleTradeNamePaymentInfo("548ec95d-4779-48d3-a147-4c6501c0557e", "notes",
                //        DOUserCC.AMEX, "2013/08", "379014381212345");
            	
            	NetforumService.uploadSingleTradeNamePaymentInfo("548ec95d-4779-48d3-a147-4c6501c0557e", "Application: 123456789",
                        DOUserCC.VISA, "2015/12", "4111111111111111", "Gabriella Nagy");
            	
                
                /*NetforumService.uploadSingleTradeNamePaymentInfo_old("548ec95d-4779-48d3-a147-4c6501c0557e", "Application: 123456789",
                        DOUserCC.VISA, "2018/07", "4111111111111111");*/
                
            	
            }
        };
    }  

    
    private static void test4() throws SQLException, NamingException {
        @SuppressWarnings("unused")
        AbstractServiceTest test = new AbstractServiceTest(true) {
            @Override
            protected void initMockJndiContext() {
                initMockJndi();
            }

            @Override
            public void runTest() {
                DOList ccTransactionsReport = TradeNamePaymentService.findCCTxsForExtStorage();
                
                DOList newCCTransactionList = new DOList();

                for (int i = 0; i < ccTransactionsReport.size(); i++) {
                    DOCreditCardReport ccTransaction = (DOCreditCardReport) ccTransactionsReport.elementAt(i);
                    
                    String notes = "Application: " + ccTransaction.tnNumber;
                    
                    try {
        	            // cal netforum method
                    	NetforumService.uploadSingleTradeNamePaymentInfo(ccTransaction.cstKey, notes,
        	            		ccTransaction.ccTypeID, ccTransaction.formatCCYearAndMonth(), ccTransaction.ccNumber, ccTransaction.formatCCFirstLastName());
        	            
        	            ccTransaction.cc_exported = true; 
                    }
                    catch (Exception ex) {
                    	ccTransaction.cc_exported = false;
                    	System.out.println(ex.getMessage());
                    }
                    
                    System.out.println(i + " ======================================= ");
                    System.out.println("cstKey="+ccTransaction.cstKey);
                    System.out.println("notes="+notes);
                    System.out.println("ccTypeID="+ccTransaction.ccTypeID);
                    System.out.println("ccExpirationDate="+ccTransaction.formatCCYearAndMonth());
                    System.out.println("ccNumber="+ccTransaction.ccNumber);
                    System.out.println("cc_exported="+ccTransaction.cc_exported);
                    
                    // create new transaction list
                    newCCTransactionList.addElement(ccTransaction);
                }
                
                // update cc_export_dt in trade_name
                TradeNamePaymentService.updateCCExportDate2(newCCTransactionList);
            }
        };
    }    
    
    
    private static void test3() throws SQLException, NamingException {
        @SuppressWarnings("unused")
        AbstractServiceTest test = new AbstractServiceTest(true) {
            @Override
            protected void initMockJndiContext() {
                initMockJndi();
            }

            @Override
            public void runTest() {
                //NetforumService.uploadSingleTradeNamePaymentInfo("548ec95d-4779-48d3-a147-4c6501c0557e", "notes",
                //        DOUserCC.AMEX, "2013/08", "379014381212345");
            	
                //NetforumService.uploadSingleTradeNamePaymentInfo("548ec95d-4779-48d3-a147-4c6501c0557e", "10",
                //        DOUserCC.VISA, "2018/07", "4111111111111111");
            	
            	IndividualType individual = NetforumService.findIndividual("548ec95d-4779-48d3-a147-4c6501c0557e");
            	
            	System.out.println(XmlUtil.extractValFromNullableStrElem(individual.getCustomer().getCstNameCp()));	
            	System.out.println(XmlUtil.extractValFromNullableStrElem(individual.getCustomer().getCstCxaKey()));	
            }
        };
    }       
}
