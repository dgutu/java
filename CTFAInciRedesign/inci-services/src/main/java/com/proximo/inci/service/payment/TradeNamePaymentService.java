/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.service.payment;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Array;

import oracle.jdbc.OracleTypes;
import oracle.sql.ArrayDescriptor;
import oracle.sql.CLOB;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proximo.inci.DOCreditCardReport;
import com.proximo.inci.DOList;
import com.proximo.inci.DOTradeName;
import com.proximo.inci.DOUserACH;
import com.proximo.inci.DOUserCC;
import com.proximo.inci.DOUserCheck;
import com.proximo.inci.DOUserPayment;
import com.proximo.inci.DbConnectionManager;
import com.proximo.inci.DbUtil;
import com.proximo.inci.common.TDate;
import com.proximo.inci.service.tradename.TradeNameService;


public class TradeNamePaymentService {

    private static Logger logger = LoggerFactory.getLogger(TradeNamePaymentService.class);

    /** Not intended to be instantiated. Exposed only static members. */
    private TradeNamePaymentService() {
    }

    public static Long savePayment(DOTradeName tn, String userRecId, DOUserCheck userCheck, DOUserCC userCC,
            int paymentType, int paymentAmount, DOUserACH userACH) {
        logger.debug("Entering savePayment(...)");

        Long referenceId = null;

        Connection conn = null;
        CallableStatement cs = null;

        try {
            long paymentID = userCC.recID;
            String firstName = userCC.firstName;
            String lastName = userCC.lastName;
            String address1 = userCC.address1;
            String address2 = userCC.address2;
            String address3 = userCC.address3;
            String city = userCC.city;
            String state = userCC.state;
            String zip = userCC.zip;
            String countryCode = userCC.countryCode;
            String phone = userCC.phone;

            if (paymentType == 2) {
                paymentID = userCheck.recID;
                firstName = userCheck.firstName;
                lastName = userCheck.lastName;
                address1 = userCheck.address1;
                address2 = userCheck.address2;
                address3 = userCheck.address3;
                city = userCheck.city;
                state = userCheck.state;
                zip = userCheck.zip;
                countryCode = userCheck.countryCode;
                phone = userCheck.phone;
            } else if (paymentType == 3) {
                paymentID = userACH.recID;
                firstName = userACH.firstName;
                lastName = userACH.lastName;
                address1 = userACH.address1;
                address2 = userACH.address2;
                address3 = userACH.address3;
                city = userACH.city;
                state = userACH.state;
                zip = userACH.zip;
                countryCode = userACH.countryCode;
                phone = userACH.phone;
            }

            conn = DbConnectionManager.getConnection();
            cs = conn.prepareCall("{? = call TRADE_NAME_MGMT.saveUserPayment(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"
                    + "?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");

            cs.registerOutParameter(1, OracleTypes.NUMBER);

            cs.setInt(2, 0);
            cs.setLong(3, tn.recID);
            cs.setString(4, userRecId);
            cs.setLong(5, paymentID);
            cs.setInt(6, paymentType);
            cs.setInt(7, paymentAmount);
            cs.setString(8, firstName);
            cs.setString(9, lastName);
            cs.setString(10, address1);
            cs.setString(11, address2);
            cs.setString(12, address3);
            cs.setString(13, city);
            cs.setString(14, state);
            cs.setString(15, zip);
            cs.setString(16, countryCode);
            cs.setInt(17, userCC.ccType);
            cs.setString(18, userCC.ccNumber);
            cs.setInt(19, userCC.ccExpMonth);
            cs.setInt(20, userCC.ccExpYear);
            cs.setString(21, "");
            cs.setString(22, (userCC.isDefault ? "Y" : "N"));
            cs.setString(23, userCC.CCPnref);
            cs.setString(24, userCC.CCAuthCode);
            cs.setString(25, userCC.CCRespMsg);
            cs.setString(26, userCC.CCResult);
            cs.setString(27, userCC.CCAvsAddr);
            cs.setString(28, userCC.CCAvsZip);
            //cs.setString(29, userCC.CCCvv2Match);
            cs.setString(29, userCC.ccCVV2);
            cs.setString(30, phone); // phone

            cs.execute();

            referenceId = cs.getLong(1);
        } catch (SQLException e) {
            logger.error("Error saving payment: ", e);
            //throw new InciException();
            throw new RuntimeException(e);
        } finally {
            DbConnectionManager.freeResources(conn, cs, null);
        }

        logger.debug("Leaving savePayment(...): referenceID={}", referenceId);
        return referenceId;
    }

    public static DOList getOnHoldTnForms(PaymentClearSearchParams paymentClearSearchParams) {
        logger.debug("Entering getOnHoldTnForms(...)");

        DOList tnList = new DOList();

        Connection conn = null;
        ResultSet rs = null;
        CallableStatement cs = null;

        try {
            conn = DbConnectionManager.getConnection();

            cs = conn.prepareCall("{? = call TRADE_NAME_MGMT.get_uncleared_apps(?,?,?,?)}");

            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.setString(2, paymentClearSearchParams.getApplicationNumber());
            cs.setString(3, paymentClearSearchParams.getCompanyName());
            cs.setString(4, paymentClearSearchParams.getOrderBy());
            cs.setInt(5, paymentClearSearchParams.getOrdering());
            cs.execute();

            rs = (ResultSet) cs.getObject(1);
            while (rs.next()) {
                DOUserPayment p = new DOUserPayment();

                p.trade_number = rs.getString(1);
                p.trade_name = rs.getString(2);
                p.payment_method_id = rs.getLong(3);
                p.tn_rec_id = rs.getLong(4);

                tnList.addElement(p);
            }
        } catch (SQLException e) {
            logger.error("Error getting on-hold tn forms: ", e);
            //throw new InciException();
            throw new RuntimeException(e);
        } finally {
            DbConnectionManager.freeResources(conn, cs, rs);
        }

        logger.debug("Leaving getOnHoldTnForms(...): tnList.size()={}", tnList.size());
        return tnList;
    }

    public static DOList getOnHoldTnFormsACH(PaymentClearSearchParams paymentClearSearchParams) {
        logger.debug("Entering getOnHoldTnFormsACH(...)");

        DOList tnList = new DOList();

        Connection conn = null;
        ResultSet rs = null;
        CallableStatement cs = null;

        try {
            conn = DbConnectionManager.getConnection();

            cs = conn.prepareCall("{? = call TRADE_NAME_MGMT.get_uncleared_apps_ach(?,?,?,?)}");

            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.setString(2, paymentClearSearchParams.getApplicationNumber());
            cs.setString(3, paymentClearSearchParams.getCompanyName());
            cs.setString(4, paymentClearSearchParams.getOrderBy());
            cs.setInt(5, paymentClearSearchParams.getOrdering());
            cs.execute();

            rs = (ResultSet) cs.getObject(1);
            while (rs.next()) {
                DOUserPayment p = new DOUserPayment();

                p.trade_number = rs.getString(1);
                p.trade_name = rs.getString(2);
                p.payment_method_id = rs.getLong(3);
                p.tn_rec_id = rs.getLong(4);

                tnList.addElement(p);
            }
        } catch (SQLException e) {
            logger.error("Error getting on-hold ACH tn forms: ", e);
            throw new RuntimeException(e);
        } finally {
            DbConnectionManager.freeResources(conn, cs, rs);
        }

        logger.debug("Leaving getOnHoldTnFormsACH(...): tnList.size()={}", tnList.size());
        return tnList;
    }

    public static DOUserACH getUserACH(long recId) {
        logger.debug("Entering getUserACH(recId={})", recId);

        DOUserACH userACH = new DOUserACH();

        Connection conn = null;
        ResultSet rs = null;
        CallableStatement cs = null;

        try {
            conn = DbConnectionManager.getConnection();

            cs = conn.prepareCall("{? = call TRADE_NAME_MGMT.get_user_ach(?)}");
            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.setLong(2, recId);
            cs.execute();

            rs = (ResultSet) cs.getObject(1);
            while (rs.next()) {
                userACH.recID = rs.getLong(1);
                userACH.userRecId = rs.getString(2);
                userACH.firstName = rs.getString(3);
                userACH.lastName = rs.getString(4);
                userACH.address1 = rs.getString(5);
                userACH.address2 = rs.getString(6);
                userACH.address3 = rs.getString(7);
                userACH.city = rs.getString(8);
                userACH.state = rs.getString(9);
                userACH.zip = rs.getString(10);
                userACH.countryCode = rs.getString(11);
                userACH.achNumber = rs.getString(12);
                userACH.notes = rs.getString(13);
            }
        } catch (SQLException e) {
            logger.error("Error getting ACH: ", e);
            //throw new InciException();
            throw new RuntimeException(e);
        } finally {
            DbConnectionManager.freeResources(conn, cs, rs);
        }

        logger.debug("Leaving getUserACH(recId={})", recId);
        return userACH;
    }

    public static DOUserCheck getUserCheck(long recId) {
        logger.debug("Entering getUserCheck(recId={})", recId);

        DOUserCheck userCheck = new DOUserCheck();

        Connection conn = null;
        ResultSet rs = null;
        CallableStatement cs = null;

        try {
            conn = DbConnectionManager.getConnection();

            cs = conn.prepareCall("{? = call TRADE_NAME_MGMT.get_user_check(?)}");
            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.setLong(2, recId);
            cs.execute();

            rs = (ResultSet) cs.getObject(1);
            while (rs.next()) {
                userCheck.recID = rs.getLong(1);
                userCheck.userRecId = rs.getString(2);
                userCheck.firstName = rs.getString(3);
                userCheck.lastName = rs.getString(4);
                userCheck.address1 = rs.getString(5);
                userCheck.address2 = rs.getString(6);
                userCheck.address3 = rs.getString(7);
                userCheck.city = rs.getString(8);
                userCheck.state = rs.getString(9);
                userCheck.zip = rs.getString(10);
                userCheck.countryCode = rs.getString(11);
                userCheck.checkNumber = rs.getString(12);
                userCheck.notes = rs.getString(13);
                userCheck.phone = rs.getString(14);
            }
        } catch (SQLException e) {
            logger.error("Error getting Check: ", e);
            //throw new InciException();
            throw new RuntimeException(e);
        } finally {
            DbConnectionManager.freeResources(conn, cs, rs);
        }

        logger.debug("Leaving getUserCheck(recId={})", recId);
        return userCheck;
    }

    public static long saveACH(DOUserACH userACH) {
        logger.debug("Entering saveACH(...)");

        long referenceId = 0;

        Connection conn = null;
        CallableStatement cs = null;

        try {
            conn = DbConnectionManager.getConnection();

            cs = conn.prepareCall("{? = call TRADE_NAME_MGMT.saveUserACH(?,?,?,?,?," + "?,?,?,?,?," + "?,?,?,?,?)}");

            cs.registerOutParameter(1, OracleTypes.NUMBER);

            cs.setLong(2, userACH.recID);
            cs.setString(3, userACH.userRecId);
            cs.setString(4, userACH.firstName);
            cs.setString(5, userACH.lastName);
            cs.setString(6, userACH.address1);
            cs.setString(7, userACH.address2);
            cs.setString(8, userACH.address3);
            cs.setString(9, userACH.city);
            cs.setString(10, userACH.state);
            cs.setString(11, userACH.zip);
            cs.setString(12, userACH.countryCode);
            cs.setString(13, userACH.achNumber);
            cs.setDate(14, null);
            cs.setDate(15, null);
            cs.setString(16, userACH.notes);

            cs.execute();

            referenceId = cs.getLong(1);
        } catch (SQLException e) {
            logger.error("Error saving ACH: ", e);
            //throw new InciException();
            throw new RuntimeException(e);
        } finally {
            DbConnectionManager.freeResources(conn, cs, null);
        }

        logger.debug("Leaving saveACH(...): referenceId={}", referenceId);
        return referenceId;
    }

    public static long saveCheck(DOUserCheck userCheck) {
        logger.debug("Entering saveCheck(...)");

        long referenceId = 0;

        Connection conn = null;
        CallableStatement cs = null;

        try {
            conn = DbConnectionManager.getConnection();

            cs = conn.prepareCall("{? = call TRADE_NAME_MGMT.saveUserCheck(?,?,?,?,?," + "?,?,?,?,?," + "?,?,?,?,?,?)}");

            cs.registerOutParameter(1, OracleTypes.NUMBER);

            cs.setLong(2, userCheck.recID);
            cs.setString(3, userCheck.userRecId);
            cs.setString(4, userCheck.firstName);
            cs.setString(5, userCheck.lastName);
            cs.setString(6, userCheck.address1);
            cs.setString(7, userCheck.address2);
            cs.setString(8, userCheck.address3);
            cs.setString(9, userCheck.city);
            cs.setString(10, userCheck.state);
            cs.setString(11, userCheck.zip);
            cs.setString(12, userCheck.countryCode);
            cs.setString(13, userCheck.checkNumber);
            cs.setDate(14, null);
            cs.setDate(15, null);
            cs.setString(16, userCheck.notes);
            cs.setString(17, userCheck.phone);

            cs.execute();

            referenceId = cs.getLong(1);
        } catch (SQLException e) {
            logger.error("Error saving Check: ", e);
            throw new RuntimeException(e);
        } finally {
            DbConnectionManager.freeResources(conn, cs, null);
        }

        logger.debug("Leaving saveCheck(...): referenceId={}", referenceId);
        return referenceId;
    }
    
    public static DOList searchCreditCardTransactions(CCTransactionsReportParams ccTransactionsReportParams) {
        logger.debug("Entering searchCreditCardTransactions(...)");

        DOList ccTransactionList = new DOList();

        Connection conn = null;
        ResultSet rs = null;
        CallableStatement cs = null;

        try {
            conn = DbConnectionManager.getConnection();

            cs = conn.prepareCall("{? = call TRADE_NAME_MGMT.credit_card_transactions(?,?,?,?,?,?,?)}");

            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.setDate(2, ccTransactionsReportParams.getTransactionStartDt().getSqlDate());
            cs.setDate(3, ccTransactionsReportParams.getTransactionEndDt().getSqlDate());
            //cs.setDouble(4, ccTransactionsReportParams.getAmountMin());
            //cs.setDouble(5, ccTransactionsReportParams.getAmountMax());
            cs.setString(4, ccTransactionsReportParams.getSearchStr());
            cs.setString(5, ccTransactionsReportParams.getUserCompanyName());
            cs.setString(6, ccTransactionsReportParams.getOrderBy());
            cs.setInt(7, ccTransactionsReportParams.getOrdering());
            cs.setString(8, ccTransactionsReportParams.getLogon());

            cs.execute();

            rs = (ResultSet) cs.getObject(1);
            while (rs.next()) {
                DOCreditCardReport ccTransaction = new DOCreditCardReport();
                
                ccTransaction.tnRecId = rs.getLong(1);
                ccTransaction.tradeName = DbUtil.formatString(rs.getString(2));
                ccTransaction.tnNumber = DbUtil.formatString(rs.getString(3));
                ccTransaction.transactionDate = new TDate(rs.getDate(4));
                ccTransaction.transactionAmount = rs.getDouble(5);
                ccTransaction.cstKey = DbUtil.formatString(rs.getString(6));
                ccTransaction.ccTypeID = rs.getInt(7);
                ccTransaction.ccTypeValue = DbUtil.formatString(rs.getString(8));
                ccTransaction.ccExpYear = rs.getInt(9);
                ccTransaction.ccExpMonth = rs.getInt(10);
                ccTransaction.ccNumber = DbUtil.formatString(rs.getString(11));
                ccTransaction.ccFirstName = DbUtil.formatString(rs.getString(12));
                ccTransaction.ccLastName = DbUtil.formatString(rs.getString(13));
                ccTransaction.ccISDefault = (DbUtil.formatString(rs.getString(14)).toUpperCase().equals("Y"));                
                ccTransaction.CCPNRef = DbUtil.formatString(rs.getString(15));
                ccTransaction.publicationCompany = DbUtil.formatString(rs.getString(16));
                ccTransaction.publicationCompanyAddr = DbUtil.formatString(rs.getString(17));
                
                ccTransactionList.addElement(ccTransaction);
            }
        } catch (SQLException e) {
            logger.error("Error searching for credit card transactions: ", e);
            throw new RuntimeException(e);
        } finally {
            DbConnectionManager.freeResources(conn, cs, rs);
        }

        logger.debug("Leaving searchCreditCardTransactions(...): ccTransactionList.size()={}", ccTransactionList.size());
        return ccTransactionList;
    }

    /**
     * Finds credit card transactions for export to external storage.
     */
    public static DOList findCCTxsForExtStorage() {
        logger.debug("Entering findCreditCardTxsForExternalStorage(...)");

        DOList ccTransactionList = new DOList();

        Connection conn = null;
        ResultSet rs = null;
        CallableStatement cs = null;

        try {
            conn = DbConnectionManager.getConnection();
            cs = conn.prepareCall("{call TRADE_NAME_MGMT.get_cc_export(?)}");
            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.execute();

            rs = (ResultSet) cs.getObject(1);
            while (rs.next()) {
                DOCreditCardReport ccTransaction = new DOCreditCardReport();

                ccTransaction.tnRecId = rs.getLong(1);
                ccTransaction.tradeName = DbUtil.formatString(rs.getString(2));
                ccTransaction.tnNumber = DbUtil.formatString(rs.getString(3));
                ccTransaction.transactionDate = new TDate(rs.getDate(4));
                ccTransaction.transactionAmount = rs.getDouble(5);
                ccTransaction.cstKey = DbUtil.formatString(rs.getString(6));
                ccTransaction.ccTypeID = rs.getInt(7);
                ccTransaction.ccTypeValue = DbUtil.formatString(rs.getString(8));
                ccTransaction.ccExpYear = rs.getInt(9);
                ccTransaction.ccExpMonth = rs.getInt(10);
                ccTransaction.ccNumber = DbUtil.formatString(rs.getString(11));
                ccTransaction.ccFirstName = DbUtil.formatString(rs.getString(12));
                ccTransaction.ccLastName = DbUtil.formatString(rs.getString(13));
                ccTransaction.ccISDefault = (DbUtil.formatString(rs.getString(14)).toUpperCase().equals("Y"));
                ccTransaction.CCPNRef = DbUtil.formatString(rs.getString(15));
                ccTransaction.publicationCompany = DbUtil.formatString(rs.getString(16));

                ccTransactionList.addElement(ccTransaction);
            }
        } catch (SQLException e) {
            logger.error("Error finding credit card transactions for external storage: ", e);
            throw new RuntimeException(e);
        } finally {
            DbConnectionManager.freeResources(conn, cs, rs);
        }

        logger.debug("Leaving findCreditCardTxsForExternalStorage(...): ccTransactionList.size()={}",
                ccTransactionList.size());
        return ccTransactionList;
    }

    /**
     * Updates last date of the credit card transactions export to external
     * storage.
     */
    public static void updateLastDtOfCCTxsExportToExt(TDate lastExportDate, String userLoginId) {
        logger.debug("Entering updateLastDtOfCCTxsExportToExt()");

        Connection conn = null;
        CallableStatement cs = null;

        try {
            conn = DbConnectionManager.getConnection();
            cs = conn.prepareCall("{call TRADE_NAME_MGMT.update_cc_export(?)}");

            cs.setDate(1, lastExportDate.getSqlDate());
            cs.setString(1, userLoginId);

            cs.execute();
        } catch (SQLException e) {
            logger.error("Error updateLastDtOfCCTxsExportToExt: ", e.getMessage());
            throw new RuntimeException(e);
        } finally {
            DbConnectionManager.freeResources(conn, cs, null);
        }

        logger.debug("Leaving updateLastDtOfCCTxsExportToExt()");
    }

    
    /* update cc_export_dt in trade_name, CC batch */
    public static void updateCCExportDate(DOList ccTransactionList) {
        logger.debug("Entering updateCCExportDate()");

        Connection conn = null;
        CallableStatement cs = null;
        ArrayDescriptor arrayDescriptor = null;
        Array arraytnRecID = null;

        long tnRecID[] = null;
        
        if (ccTransactionList != null && ccTransactionList.size() > 0) {
	        try {
	        	// set size of array
	        	tnRecID = new long[ccTransactionList.size()];
	        	
	        	// read ccTransaction list
	            for (int i=0;i<ccTransactionList.size();i++) {
	            	DOCreditCardReport ccTransaction = (DOCreditCardReport) ccTransactionList.elementAt(i);
	            	if (ccTransaction != null && ccTransaction.cc_exported)
	            		tnRecID[i] = ccTransaction.recID;
	            }
	        	
	        	// get conneaction
	            conn = DbConnectionManager.getConnection();
	            cs = conn.prepareCall("{call TRADE_NAME_MGMT.update_trade_cc_export(?)}");
	            arrayDescriptor = ArrayDescriptor.createDescriptor("TABLE_IN", conn);
	            arraytnRecID = new oracle.sql.ARRAY(arrayDescriptor, conn, tnRecID);
	            cs.setArray(1, arraytnRecID);
	            
	            cs.execute();
	        } catch (SQLException e) {
	            logger.error("Error updateCCExportDate: ", e.getMessage());
	            throw new RuntimeException(e);
	        } finally {
	            DbConnectionManager.freeResources(conn, cs, null);
	        }
        }

        logger.debug("Leaving updateCCExportDate()");
    }
    
    /* update cc_export_dt in trade_name, CC batch */
    public static void updateCCExportDate2(DOList ccTransactionList) {
    	logger.debug("Entering updateCCExportDate2()");
    	
    	Connection conn = null;        
        CallableStatement cs = null;
        CLOB clob = null;
        StringBuilder tnRecIDList = new StringBuilder();
        
        if (ccTransactionList != null && ccTransactionList.size() > 0) {
	        try {
	        	// read ccTransaction list
	            for (int i=0;i<ccTransactionList.size();i++) {
	            	DOCreditCardReport ccTransaction = (DOCreditCardReport) ccTransactionList.elementAt(i);
	            	if (ccTransaction != null && ccTransaction.cc_exported) {
	            		tnRecIDList.append(String.valueOf(ccTransaction.tnRecId));
	            		tnRecIDList.append(",");
	            	}	
	            }
	            
	        	// get connection
	            conn = DbConnectionManager.getConnection();

	            // call oracle SP to pull trades
	            cs = conn.prepareCall("{call TRADE_NAME_MGMT.update_trade_cc_export2(?)}");
	            
	            // set oracle parameters            
	            // cst_key list
	            if (TradeNameService.createTemporaryLOB(conn) != null)
	            	clob = (CLOB) TradeNameService.createTemporaryLOB(conn);
	            
	            if (tnRecIDList != null && !tnRecIDList.equals(""))
	            	clob.putChars(1, DbUtil.formatString(tnRecIDList.toString()).toCharArray());
	            
	           	cs.setClob(1, clob);
	            
	            // execute oracle stored procedure
	            cs.execute();            
	            
	        } catch (SQLException e) {
	            logger.error("Error updateCCExportDate: ", e.getMessage());
	            throw new RuntimeException(e);
	        } finally {
	            DbConnectionManager.freeResources(conn, cs, null);
	        }
        }

        logger.debug("Leaving updateCCExportDate2()");
    }
    
    /* update cc_export_dt in trade_name, p_tn_rec_id input parameter */
    public static void updateCCExportDate3(long tnRecID) {
        logger.debug("Entering updateCCExportDate3()");

        Connection conn = null;
        CallableStatement cs = null;
        
        try {
        	// get conneaction
            conn = DbConnectionManager.getConnection();
            cs = conn.prepareCall("{call TRADE_NAME_MGMT.update_trade_cc_export3(?)}");
            cs.setLong(1, tnRecID);
            
            cs.execute();
        } catch (SQLException e) {
            logger.error("Error updateCCExportDate3: ", e.getMessage());
            throw new RuntimeException(e);
        } finally {
            DbConnectionManager.freeResources(conn, cs, null);
        }

        logger.debug("Leaving updateCCExportDate3()");
    }
    
    
    
}
