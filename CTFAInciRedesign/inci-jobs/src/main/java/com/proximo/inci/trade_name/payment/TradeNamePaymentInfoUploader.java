/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.trade_name.payment;

import com.proximo.inci.DOCreditCardReport;
import com.proximo.inci.DOList;
import com.proximo.inci.service.netforum.NetforumService;
import com.proximo.inci.service.payment.TradeNamePaymentService;

public class TradeNamePaymentInfoUploader {

    public static void main(String[] args) {
        DOList ccTransactionsReport = TradeNamePaymentService.findCCTxsForExtStorage();
        String notes = "Application: ";
        
        DOList newCCTransactionList = new DOList();

        for (int i = 0; i < ccTransactionsReport.size(); i++) {
            DOCreditCardReport ccTransaction = (DOCreditCardReport) ccTransactionsReport.elementAt(i);
            
            notes += ccTransaction.tnNumber;
            
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
        if (ccTransactionsReport.size() > 0)
        	TradeNamePaymentService.updateCCExportDate(newCCTransactionList);
    }

}
