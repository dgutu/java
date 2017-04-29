/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.service.payment;

import java.sql.SQLException;

import javax.naming.NamingException;
import com.proximo.inci.AbstractServiceTest;
import com.proximo.inci.DOCreditCardReport;
import com.proximo.inci.DOList;
import com.proximo.inci.jndi.InitialContextFactoryForTest;
import com.proximo.inci.service.netforum.NetforumService;

public class CreditCardTransactionBatch {
	
    public static void main(String[] args) throws SQLException, NamingException {
    	ccBatch();
    }

    public static void initMockJndi(String netforumUsername, String netforumPassword) {
        InitialContextFactoryForTest.bind(NetforumService.JNDI_NETFORUM_USERNAME, netforumUsername);
        InitialContextFactoryForTest.bind(NetforumService.JNDI_NETFORUM_PASSWORD, netforumPassword);
    }
    
    private static void ccBatch() throws SQLException, NamingException {
        @SuppressWarnings("unused")
		AbstractServiceTest test = new AbstractServiceTest(true) {
            @Override
            protected void initMockJndiContext() {
                initMockJndi(NETFORUM_USERNAME, NETFORUM_PASSWORD);
            }

            @Override
            public void runTest() {
                DOList ccTransactionsReport = TradeNamePaymentService.findCCTxsForExtStorage();
                
                DOList newCCTransactionList = new DOList();

                for (int i = 0; i < ccTransactionsReport.size(); i++) {
                    DOCreditCardReport ccTransaction = (DOCreditCardReport) ccTransactionsReport.elementAt(i);
                    
                    String notes = "Application: " + ccTransaction.tnNumber;
                    
                    boolean result = false;
                    
                    try {
        	            // call netforum method
                    	//result = NetforumService.uploadSingleTradeNamePaymentInfo2(ccTransaction.cstKey, notes,
        	            //		ccTransaction.ccTypeID, ccTransaction.formatCCYearAndMonth(), ccTransaction.ccNumber, ccTransaction.formatCCFirstLastName());
        	            
        	            //ccTransaction.cc_exported = true; 
                    }
                    catch (Exception ex) {
                    	//ccTransaction.cc_exported = false;
                    	System.out.println(ex.getMessage());
                    }
                    
                    ccTransaction.cc_exported = result;
                    
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
    // end

}
