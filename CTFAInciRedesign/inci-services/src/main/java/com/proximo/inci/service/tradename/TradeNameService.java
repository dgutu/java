/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.service.tradename;

//import java.io.Serializable;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import oracle.jdbc.OracleTypes;
import oracle.sql.CLOB;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proximo.inci.DOCMSText;
import com.proximo.inci.DOFormTNComment;
import com.proximo.inci.DOList;
import com.proximo.inci.DOLookupValue;
import com.proximo.inci.DOTradeName;
import com.proximo.inci.DOUserPayment;
import com.proximo.inci.DbConnectionManager;
import com.proximo.inci.DbSequenceManager;
import com.proximo.inci.DbUtil;
import com.proximo.inci.common.TDate;
import com.proximo.inci.common.TemplarUtil;
//import com.proximo.inci.exception.InciException;

public class TradeNameService {

    private static Logger logger = LoggerFactory.getLogger(TradeNameService.class);

    /** Not intended to be instantiated. Exposed only static members. */
    private TradeNameService() {
    }

    public static TradeNameSearchResult searchTradeNames(String tradeName, String tnNumber, int catID,
            String CASNumber, String EINECSNumber, String formula, String keywords, String submissionStatus,
            boolean isOutstdComments, boolean isRespondComments, String exportStatus, TDate expFromDt, TDate expToDt,
            String userRecId, String companyName, TDate antFromDt, TDate antToDt, int pageSize, int pageNumber,
            TDate entryDt_Start, TDate entryDt_End, String orderBy, int ordering) {
        logger.debug(
                "Entering searchTradeNames(tradeName={}, tnNumber={}, catId={}, CASNumber={}, EINECSNumber={}, "
                        + "formula={}, keywords={}, submissionStatus={}, isOutstdComments={}, isRespondComments={}, exportStatus={}, expFromDt={}, "
                        + "expToDt={}, userRecId={}, companyName={}, antFromDt={}, antToDt={}, pageSize={}, pageNumber={}, entryDt={}, orderBy={}, ordering={})",
                new Object[] { tradeName, tnNumber, Integer.valueOf(catID), CASNumber, EINECSNumber, formula, keywords,
                        submissionStatus, Boolean.valueOf(isOutstdComments), Boolean.valueOf(isRespondComments),
                        exportStatus, expFromDt, expToDt, userRecId, companyName, antFromDt, antToDt, pageSize,
                        pageNumber, entryDt_Start, entryDt_End, orderBy, ordering});

        DOList tnList = new DOList();
        int totalCount = 0;

        Connection conn = null;
        CallableStatement cs = null;
        ResultSet rs = null;

        try {
            conn = DbConnectionManager.getConnection();
            
            cs = conn
                    .prepareCall("{? = call TRADE_NAME_MGMT.search_tn(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}");
            
            cs.setString(2, userRecId);
            cs.setString(3, tradeName);
            cs.setString(4, CASNumber);
            cs.setString(5, EINECSNumber);
            cs.setString(6, formula);
            cs.setInt(7, catID);
            cs.setString(8, submissionStatus);
            cs.setString(9, keywords);
            cs.setString(10, tnNumber);
            cs.setString(11, isOutstdComments ? "Y" : "N");
            cs.setString(12, exportStatus);
            cs.setDate(13, expFromDt.getSqlDate());
            cs.setDate(14, expToDt.getSqlDate());
            cs.setString(15, isRespondComments ? "Y" : "N");
            cs.setString(16, TemplarUtil.convertCompanyName(DbUtil.formatString(companyName)));
            cs.setDate(17, antFromDt.getSqlDate());
            cs.setDate(18, antToDt.getSqlDate());
            cs.setInt(19, pageSize);
            cs.setInt(20, pageNumber);
            cs.setDate(21, entryDt_Start.getSqlDate());
            cs.setDate(22, entryDt_End.getSqlDate());
            cs.setString(23, orderBy);
            cs.setInt(24, ordering);
            
            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.execute();

            rs = (ResultSet) cs.getObject(1);
            while (rs.next()) {
                DOTradeName tn = new DOTradeName();
                tn.recID = rs.getLong(1);
                tn.categoryID = rs.getInt(3);
                tn.catName = DbUtil.formatString(rs.getString(4));
                tn.tradeName = DbUtil.formatString(rs.getString(5));
                tn.formula = DbUtil.formatString(rs.getString(7));
                tn.CASNumber = DbUtil.formatString(rs.getString(8));
                tn.EINECSNumber = DbUtil.formatString(rs.getString(9));
                tn.submitted = DbUtil.getFlag(rs.getString(23));
                tn.tnNumber = DbUtil.formatString(rs.getString(46));
                tn.hasOutstdComments = DbUtil.getFlag(rs.getString(47));
                tn.exportDt = new TDate(rs.getDate(48));
                tn.editable = DbUtil.getFlag(rs.getString(49));
                tn.hasUserResponded = DbUtil.getFlag(rs.getString(50));
                tn.hasAttachments = DbUtil.getFlag(rs.getString(51));
                tn.onHoldForACH = DbUtil.getFlag(rs.getString(54));

                tn.submitDt = new TDate(rs.getDate(25));
                tn.inciName = DbUtil.formatString(rs.getString(24));
                tn.pubCompany.name = DbUtil.formatString(rs.getString(31));

                tn.reviewDt.set(rs.getDate(52));
                tn.onHold = rs.getString(53).equalsIgnoreCase("Y");
                
                tn.adminComments = DbUtil.formatString(rs.getString(56));

                totalCount = rs.getInt("cnt");

                tnList.addElement(tn);
            }
        } catch (SQLException e) {
            logger.error("Error searching the trade names: ", e);
            //throw new InciException();
            throw new RuntimeException(e);
        } finally {
            DbConnectionManager.freeResources(conn, cs, rs);
        }

        logger.debug("Leaving searchTradeNames(...): tnList.size()={}", tnList.size());
        return new TradeNameSearchResult(tnList, totalCount);
    }

    public static TradeNameSearchResult quickTradeNameSearch(String userRecId, String tradeName, String tnNumber,
            String exportStatus, String companyName, TDate entryDt_Start, TDate entryDt_End, boolean isOutstdComments,
            boolean isRespondComments, int catID, TDate expFromDt, TDate expToDt, TDate antFromDt, TDate antToDt,
            String submissionStatus, int pageSize, int pageNumber, String orderBy, int ordering) {
        logger.debug(
                "Entering quickTradeNameSearch(userRecId={}, tradeName={}, tnNumber={}, exportStatus={}, companyName={}, entryDt={}, "
                        + "isOutstdComments={}, isRespondComments={}, catID={}, expFromDt={}, expToDt={}, antFromDt={}, antToDt={}, submissionStatus={}, "
                        + "pageSize={}, pageNumber={}, orderBy={}, ordering={})", new Object[] { userRecId, tradeName, tnNumber, exportStatus,
                        entryDt_Start, entryDt_End, Boolean.valueOf(isOutstdComments), Boolean.valueOf(isRespondComments), catID,
                        expFromDt, expToDt, antFromDt, antToDt, submissionStatus, pageSize, pageNumber, orderBy, ordering});

        // String tradeName = "";
        // String tnNumber = "";
        // int catID = 0;
        String CASNumber = "";
        String EINECSNumber = "";
        String formula = "";
        String keywords = "";
        // String submissionStatus = "";
        // boolean isOutstdComments = false;
        // boolean isRespondComments = false;
        // String exportStatus = "A";
        // TDate expFromDt = null;
        // TDate expToDt = null;
        // String companyName = "";
        // TDate antFromDt = null;
        // TDate antToDt = null;

        // expFromDt = new TDate();
        // expFromDt.setNull();

        // expToDt = new TDate();
        // expToDt.setNull();

        // antFromDt = new TDate();
        // antFromDt.setNull();

        // antToDt = new TDate();
        // antToDt.setNull();

        logger.debug("Leaving quickTradeNameSearch(...): passing control to searchTradeNames(...)");
        return searchTradeNames(tradeName, tnNumber, catID, CASNumber, EINECSNumber, formula, keywords,
                submissionStatus, isOutstdComments, isRespondComments, exportStatus, expFromDt, expToDt, userRecId,
                companyName, antFromDt, antToDt, pageSize, pageNumber, entryDt_Start, entryDt_End, orderBy, ordering);
    }

    public static DOTradeName getTradeName(long recId, String userRecId) {
        logger.debug("Entering getTradeName(recId={}, userRecId={})", recId, userRecId);

        DOTradeName theFormTN = new DOTradeName();

        Connection conn = null;
        CallableStatement cs = null;
        ResultSet rs = null;

        try {
            conn = DbConnectionManager.getConnection();

            cs = conn.prepareCall("{call TRADE_NAME_MGMT.get_trade_name(?, ?, ?, ?, ?, ?)}");

            cs.setLong(1, recId);
            cs.setString(2, userRecId);
            cs.registerOutParameter(3, OracleTypes.CURSOR);
            cs.registerOutParameter(4, OracleTypes.CURSOR);
            cs.registerOutParameter(5, OracleTypes.CURSOR);
            cs.registerOutParameter(6, OracleTypes.CURSOR);

            cs.execute();

            logger.debug("Fetching tradeName object not-complex fields");
            rs = (ResultSet) cs.getObject(3);
            if (rs.next()) {
                theFormTN.recID = rs.getLong(1);
                theFormTN.categoryID = rs.getInt(2);
                theFormTN.nomenclature = DbUtil.formatString(rs.getString(3));
                theFormTN.formula = DbUtil.formatString(rs.getString(4));
                theFormTN.CASNumber = DbUtil.formatString(rs.getString(5));
                theFormTN.EINECSNumber = DbUtil.formatString(rs.getString(6));
                theFormTN.chemSynonyms = DbUtil.formatString(rs.getString(7));
                theFormTN.compStmt = DbUtil.formatString(rs.getString(8));
                theFormTN.mfgMehod = DbUtil.formatString(rs.getString(9));
                theFormTN.solvents = DbUtil.formatString(rs.getString(10));
                theFormTN.genus = DbUtil.formatString(rs.getString(11));
                theFormTN.species = DbUtil.formatString(rs.getString(12));
                theFormTN.material = DbUtil.formatString(rs.getString(13));
                theFormTN.process = DbUtil.formatString(rs.getString(14));
                theFormTN.plantPart = DbUtil.formatString(rs.getString(15));
                theFormTN.prepare = DbUtil.formatString(rs.getString(16));
                theFormTN.functionID = rs.getInt(17);
                theFormTN.reference = DbUtil.formatString(rs.getString(18));
                theFormTN.published = DbUtil.getFlag(rs.getString(19));
                theFormTN.submitted = DbUtil.getFlag(rs.getString(20));
                theFormTN.inciName = DbUtil.formatString(rs.getString(21));
                theFormTN.submitDt.set(rs.getDate(22));
                theFormTN.other1 = DbUtil.formatString(rs.getString(23));
                theFormTN.other2 = DbUtil.formatString(rs.getString(24));
                theFormTN.other3 = DbUtil.formatString(rs.getString(25));
                theFormTN.other4 = DbUtil.formatString(rs.getString(26));
                theFormTN.other5 = DbUtil.formatString(rs.getString(27));
                theFormTN.pubCompany.name = DbUtil.formatString(rs.getString(28));
                theFormTN.pubCompany.addrLine1 = DbUtil.formatString(rs.getString(29));
                theFormTN.pubCompany.addrLine2 = DbUtil.formatString(rs.getString(30));
                theFormTN.pubCompany.addrLine3 = DbUtil.formatString(rs.getString(31));
                theFormTN.pubCompany.city = DbUtil.formatString(rs.getString(32));
                theFormTN.pubCompany.state = DbUtil.formatString(rs.getString(33));
                theFormTN.pubCompany.zip = DbUtil.formatString(rs.getString(34));
                theFormTN.pubCompany.country = DbUtil.formatString(rs.getString(35));
                theFormTN.pubCompany.phone = DbUtil.formatString(rs.getString(36));
                theFormTN.pubCompany.fax = DbUtil.formatString(rs.getString(37));
                theFormTN.file1 = DbUtil.formatString(rs.getString(38));
                theFormTN.file2 = DbUtil.formatString(rs.getString(39));
                theFormTN.file3 = DbUtil.formatString(rs.getString(40));
                theFormTN.file4 = DbUtil.formatString(rs.getString(41));
                theFormTN.file5 = DbUtil.formatString(rs.getString(42));
                theFormTN.tradeName = DbUtil.formatString(rs.getString(43));
                theFormTN.tnNumber = DbUtil.formatString(rs.getString(44));
                theFormTN.approved = DbUtil.getFlag(rs.getString(45));
                theFormTN.exportDt.set(rs.getDate(46));
                theFormTN.editable = DbUtil.getFlag(rs.getString(48));
                theFormTN.hasOutstdComments = DbUtil.getFlag(rs.getString(49));
                theFormTN.inciNameDt.set(rs.getDate(50));
                theFormTN.chemStructOpt = rs.getString(51);
                theFormTN.ingredient = DbUtil.formatString(rs.getString(52));
                theFormTN.ingredDesc = DbUtil.formatString(rs.getString(53));
                theFormTN.reviewDt.set(rs.getDate(54));
                theFormTN.otherFunctions = DbUtil.formatString(rs.getString(55));
                theFormTN.is_archive = DbUtil.formatString(rs.getString(56));
                //theFormTN.onHold = rs.getString(57).equalsIgnoreCase("Y");
                theFormTN.onHold = DbUtil.getFlag(rs.getString(57));
                //theFormTN.adminComments = DbUtil.formatString(rs.getString(58));
                theFormTN.adminComments = DbUtil.formatString1(rs.getString(58)); // allow special chars
                //theFormTN.onHoldForACH = rs.getString(59).equalsIgnoreCase("Y");
                theFormTN.onHoldForACH = DbUtil.getFlag(rs.getString(59));
                theFormTN.catName = DbUtil.formatString(rs.getString(60));
                if (!theFormTN.file1.equals("") || !theFormTN.file2.equals("") || !theFormTN.file3.equals("")
                        || !theFormTN.file4.equals("") || !theFormTN.file5.equals("")) {
                    theFormTN.hasAttachments = true;
                } else {
                    theFormTN.hasAttachments = false;
                }
                theFormTN.monoId = DbUtil.formatString(rs.getString(61));
                theFormTN.userCompanySupplierId = DbUtil.formatString(rs.getString(62));
                theFormTN.userRecId = rs.getString(63);
                theFormTN.publicationCompanySupplierId = DbUtil.formatString(rs.getString(64));
                theFormTN.pubCompany.countryLong = DbUtil.formatString(rs.getString(65));
            }
            rs.close();
            logger.debug("Fetching tradeName object not-complex fields finished");

            logger.debug("Fetching function list");
            rs = (ResultSet) cs.getObject(4);
            while (rs.next()) {
                DOLookupValue d = new DOLookupValue();
                d.keyID = Integer.parseInt(rs.getString(1));
                theFormTN.functionList.addElement(d);
            }
            rs.close();
            logger.debug("Fetching functions list finished");

            logger.debug("Fetching CTFA comments list");
            rs = (ResultSet) cs.getObject(5);
            while (rs.next()) {
                DOFormTNComment c = new DOFormTNComment();
                c.sentDt = new TDate(rs.getDate(1));
                c.closeDt = new TDate(rs.getDate(2));
                c.msgBody = rs.getString(3);

                theFormTN.ctfaCommentList.addElement(c);
            }
            rs.close();
            logger.debug("Fetching CTFA comments list finished");

            logger.debug("Fetching user comments list");
            rs = (ResultSet) cs.getObject(6);
            while (rs.next()) {
                DOFormTNComment c = new DOFormTNComment();
                c.sentDt = new TDate(rs.getDate(1));
                c.msgBody = rs.getString(2);

                theFormTN.userCommentList.addElement(c);
            }
            rs.close();
            logger.debug("Fetching user comments list finished");

            cs.close();

            // get payment information for this trade name
            theFormTN.paymentInfo = getPaymentInfo(conn, theFormTN);
            theFormTN.refundInfo = getRefundInfo(conn, theFormTN);
        } catch (SQLException e) {
            logger.error("Error getting the trade name: ", e);
            //throw new InciException();
            throw new RuntimeException(e);
        } finally {
            DbConnectionManager.freeResources(conn, cs, rs);
        }

        logger.debug("Leaving getTradeName(): theFormTN.recID={}", new Object[] { theFormTN.recID });
        return theFormTN;
    }

    private static DOUserPayment getPaymentInfo(Connection conn, DOTradeName tn) {
        logger.debug("Entering getPaymentInfo(tn.recID={})", tn.recID);

        DOUserPayment userPayment = new DOUserPayment();
        CallableStatement cs = null;
        ResultSet rs = null;

        try {
            cs = conn.prepareCall("{ call TRADE_NAME_MGMT.get_trade_name_payment(?,?,?,?,?) }");

            cs.setLong(1, tn.recID);
            cs.registerOutParameter(2, OracleTypes.CURSOR);
            cs.registerOutParameter(3, OracleTypes.CURSOR);
            cs.registerOutParameter(4, OracleTypes.CURSOR);
            cs.registerOutParameter(5, OracleTypes.CURSOR);

            cs.execute();

            logger.debug("Fetching main info");
            rs = (ResultSet) cs.getObject(2);
            while (rs.next()) {
                userPayment.tn_rec_id = rs.getLong(1);
                userPayment.recID = rs.getLong(2);
                userPayment.payment_method_id = rs.getLong(3);
                userPayment.payment_type = rs.getLong(4);
                userPayment.amount = rs.getDouble(5);
                userPayment.CCPnref = DbUtil.formatString(rs.getString(7));
                userPayment.CCAuthCode = DbUtil.formatString(rs.getString(8));
                userPayment.CCRespMsg = DbUtil.formatString(rs.getString(9));
                userPayment.CCResult = DbUtil.formatString(rs.getString(10));
                userPayment.CCAvsAddr = DbUtil.formatString(rs.getString(11));
                userPayment.CCAvsZip = DbUtil.formatString(rs.getString(12));
                userPayment.CCCvv2Match = DbUtil.formatString(rs.getString(13));
            }
            rs.close();
            logger.debug("Fetching main info finished");

            logger.debug("Fetching user CC info");
            rs = (ResultSet) cs.getObject(3);
            while (rs.next()) {
                userPayment.userCC.recID = rs.getLong(1);
                userPayment.userCC.userRecId = rs.getString(2);
                userPayment.userCC.firstName = DbUtil.formatString(rs.getString(3));
                userPayment.userCC.lastName = DbUtil.formatString(rs.getString(4));
                userPayment.userCC.address1 = DbUtil.formatString(rs.getString(5));
                userPayment.userCC.address2 = DbUtil.formatString(rs.getString(6));
                userPayment.userCC.address3 = DbUtil.formatString(rs.getString(7));
                userPayment.userCC.city = DbUtil.formatString(rs.getString(8));
                userPayment.userCC.state = DbUtil.formatString(rs.getString(9));
                userPayment.userCC.zip = DbUtil.formatString(rs.getString(10));
                userPayment.userCC.countryCode = DbUtil.formatString(rs.getString(11));
                userPayment.userCC.ccType = rs.getInt(12);
                userPayment.userCC.ccNumber = DbUtil.formatString(rs.getString(13));
                userPayment.userCC.ccExpMonth = rs.getInt(14);
                userPayment.userCC.ccExpYear = rs.getInt(15);
                userPayment.userCC.ccSecurityCode = DbUtil.formatString(rs.getString(16));
                userPayment.userCC.isDefault = DbUtil.formatString(rs.getString(17)).equalsIgnoreCase("Y");
            }
            rs.close();
            logger.debug("Fetching user CC info finished");

            logger.debug("Fetching user check info");
            rs = (ResultSet) cs.getObject(4);
            while (rs.next()) {
                userPayment.userCheck.recID = rs.getLong(1);
                userPayment.userCheck.userRecId = rs.getString(2);
                userPayment.userCheck.firstName = DbUtil.formatString(rs.getString(3));
                userPayment.userCheck.lastName = DbUtil.formatString(rs.getString(4));
                userPayment.userCheck.address1 = DbUtil.formatString(rs.getString(5));
                userPayment.userCheck.address2 = DbUtil.formatString(rs.getString(6));
                userPayment.userCheck.address3 = DbUtil.formatString(rs.getString(7));
                userPayment.userCheck.city = DbUtil.formatString(rs.getString(8));
                userPayment.userCheck.state = DbUtil.formatString(rs.getString(9));
                userPayment.userCheck.zip = DbUtil.formatString(rs.getString(10));
                userPayment.userCheck.countryCode = DbUtil.formatString(rs.getString(11));
                userPayment.userCheck.checkNumber = DbUtil.formatString(rs.getString(12));
                userPayment.userCheck.receiveDate = new TDate(rs.getDate(13));
                userPayment.userCheck.clearDate = new TDate(rs.getDate(14));
                userPayment.userCheck.notes = DbUtil.formatString(rs.getString(15));
            }
            rs.close();
            logger.debug("Fetching user check info finished");

            logger.debug("Fetching user ACH info");
            rs = (ResultSet) cs.getObject(5);
            while (rs.next()) {
                userPayment.userACH.recID = rs.getLong(1);
                userPayment.userACH.userRecId = rs.getString(2);
                userPayment.userACH.firstName = DbUtil.formatString(rs.getString(3));
                userPayment.userACH.lastName = DbUtil.formatString(rs.getString(4));
                userPayment.userACH.address1 = DbUtil.formatString(rs.getString(5));
                userPayment.userACH.address2 = DbUtil.formatString(rs.getString(6));
                userPayment.userACH.address3 = DbUtil.formatString(rs.getString(7));
                userPayment.userACH.city = DbUtil.formatString(rs.getString(8));
                userPayment.userACH.state = DbUtil.formatString(rs.getString(9));
                userPayment.userACH.zip = DbUtil.formatString(rs.getString(10));
                userPayment.userACH.countryCode = DbUtil.formatString(rs.getString(11));
                userPayment.userACH.achNumber = DbUtil.formatString(rs.getString(12));
                userPayment.userACH.receiveDate = new TDate(rs.getDate(13));
                userPayment.userACH.clearDate = new TDate(rs.getDate(14));
                userPayment.userACH.notes = DbUtil.formatString(rs.getString(15));
            }
            rs.close();
            logger.debug("Fetching user ACH info finished");

            cs.close();
        } catch (SQLException e) {
            logger.error("Error getting the payment info: ", e);
            //throw new InciException();
            throw new RuntimeException(e);
        } finally {
            DbConnectionManager.freeResources(null, cs, rs);
        }

        logger.debug("Leaving getPaymentInfo(tn.recID={})", tn.recID);
        return userPayment;
    }

    private static DOList getRefundInfo(Connection conn, DOTradeName tn) {
        logger.debug("Entering getRefundInfo(tn.recID={})", tn.recID);

        DOList userRefunds = new DOList();
        CallableStatement cs = null;
        ResultSet rs = null;

        try {
            cs = conn.prepareCall("{?=call TRADE_NAME_MGMT.get_trade_name_refunds(?)}");

            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.setLong(2, tn.recID);

            cs.execute();

            rs = (ResultSet) cs.getObject(1);
            while (rs.next()) {
                DOUserPayment userPayment = new DOUserPayment();
                userPayment.tn_rec_id = rs.getLong(1);
                userPayment.recID = rs.getLong(2);
                userPayment.payment_method_id = rs.getLong(3);
                userPayment.payment_type = rs.getLong(4);
                userPayment.amount = rs.getDouble(5);
                userPayment.CCPnref = DbUtil.formatString(rs.getString(6));
                userPayment.CCAuthCode = DbUtil.formatString(rs.getString(7));
                userPayment.CCRespMsg = DbUtil.formatString(rs.getString(8));
                userPayment.CCResult = DbUtil.formatString(rs.getString(9));
                userPayment.comments = DbUtil.formatString(rs.getString(10));
                userPayment.transDate = new TDate(rs.getDate(11));
                userRefunds.addElement(userPayment);
            }
        } catch (SQLException e) {
            logger.error("Error getting the refund info: ", e);
            //throw new InciException();
            throw new RuntimeException(e);
        } finally {
            DbConnectionManager.freeResources(null, cs, rs);
        }

        logger.debug("Leaving getRefundInfo(tn.recID={})", tn.recID);
        return userRefunds;
    }

    @SuppressWarnings("rawtypes")
	public static Vector saveFormTnServiceCall(DOTradeName formTn, String userRecId, String userLoginId, String btnName) {
        return TradeNameService.saveTradeName(formTn, userRecId, userLoginId, btnName);
    }

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static Vector saveTradeName(DOTradeName formTn, String userRecId, String userLoginId, String btnName) {
		logger.debug("Entering saveTradeName(userId={}, formTn.recID={}", userRecId, String.valueOf(formTn.recID));

        Vector retVec = new Vector();

        Connection conn = null;
        CallableStatement cs = null;

        try {
            conn = DbConnectionManager.getConnection();
            conn.setAutoCommit(false);

            if (formTn.recID == 0) {
                formTn.tnNumber = getNextTradeNameNumber(conn, formTn);
            }

            cs = conn.prepareCall("{ call TRADE_NAME_MGMT.save_trade_name(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
                    + "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
                    + "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
                    + "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }");

            cs.setLong(1, formTn.recID);              // io_tn_rec_id
            cs.setInt(2, formTn.categoryID);          // i_tn_type_id 
            cs.setString(3, DbUtil.formatString(TemplarUtil.convertNonEnglishCharsToEnglish(formTn.nomenclature))); // i_nomenclature
            cs.setString(4, DbUtil.formatString(TemplarUtil.convertNonEnglishCharsToEnglish(formTn.formula)));      // i_empirical_formula
            cs.setString(5, DbUtil.formatString(TemplarUtil.convertNonEnglishCharsToEnglish(formTn.CASNumber)));    // i_cas_number
            cs.setString(6, DbUtil.formatString(TemplarUtil.convertNonEnglishCharsToEnglish(formTn.EINECSNumber))); // i_einecs_number
            cs.setString(7, DbUtil.formatString(TemplarUtil.convertNonEnglishCharsToEnglish(formTn.chemSynonyms))); // i_chemical_syns
            cs.setString(8, DbUtil.formatString(TemplarUtil.convertNonEnglishCharsToEnglish(formTn.compStmt)));     // i_composition
            cs.setString(9, DbUtil.formatString(TemplarUtil.convertNonEnglishCharsToEnglish(formTn.mfgMehod)));     // i_mfc_method
            cs.setString(10, DbUtil.formatString(TemplarUtil.convertNonEnglishCharsToEnglish(formTn.solvents)));    // i_solvents_diluents
            cs.setString(11, DbUtil.formatString(TemplarUtil.convertNonEnglishCharsToEnglish(formTn.genus)));       // i_genus
            cs.setString(12, DbUtil.formatString(TemplarUtil.convertNonEnglishCharsToEnglish(formTn.species)));     // i_species
            cs.setString(13, DbUtil.formatString(TemplarUtil.convertNonEnglishCharsToEnglish(formTn.material)));    // i_material
            cs.setString(14, DbUtil.formatString(TemplarUtil.convertNonEnglishCharsToEnglish(formTn.process)));     // i_ferment_process
            cs.setString(15, DbUtil.formatString(TemplarUtil.convertNonEnglishCharsToEnglish(formTn.plantPart)));   // i_plant_part
            cs.setString(16, DbUtil.formatString(TemplarUtil.convertNonEnglishCharsToEnglish(formTn.prepare)));     // i_prep_type
            cs.setInt(17, formTn.functionID);                                                                       // i_function_id 
            cs.setString(18, DbUtil.formatString(TemplarUtil.convertNonEnglishCharsToEnglish(formTn.reference)));   // i_refs
            cs.setString(19, (formTn.published ? "Y" : "N"));                                                       // i_published_flag  
            cs.setString(20, (formTn.submitted ? "Y" : "N"));                                                       // i_submitted 
            cs.setString(21, DbUtil.formatString(TemplarUtil.convertNonEnglishCharsToEnglish(formTn.inciName)));    // i_inci_name  
            cs.setString(22, DbUtil.formatString(TemplarUtil.convertNonEnglishCharsToEnglish(formTn.other1)));      // i_other1 -- User response
            cs.setString(23, DbUtil.formatString(TemplarUtil.convertNonEnglishCharsToEnglish(formTn.other2)));      // i_other2
            cs.setString(24, DbUtil.formatString(TemplarUtil.convertNonEnglishCharsToEnglish(formTn.other3)));      // i_other3
            cs.setString(25, DbUtil.formatString(TemplarUtil.convertNonEnglishCharsToEnglish(formTn.other4)));      // i_other4
            cs.setString(26, DbUtil.formatString(TemplarUtil.convertNonEnglishCharsToEnglish(formTn.other5)));      // i_other5
            cs.setString(27, DbUtil.formatString(TemplarUtil.convertNonEnglishCharsToEnglish(formTn.pubCompany.name))); // i_pub_co_name
            cs.setString(28, DbUtil.formatString(TemplarUtil.convertNonEnglishCharsToEnglish(formTn.pubCompany.addrLine1))); // i_pub_co_addr1
            cs.setString(29, DbUtil.formatString(TemplarUtil.convertNonEnglishCharsToEnglish(formTn.pubCompany.addrLine2))); // i_pub_co_addr2
            cs.setString(30, DbUtil.formatString(TemplarUtil.convertNonEnglishCharsToEnglish(formTn.pubCompany.addrLine3))); // i_pub_co_addr3
            cs.setString(31, DbUtil.formatString(TemplarUtil.convertNonEnglishCharsToEnglish(formTn.pubCompany.city)));      // i_pub_co_city
            cs.setString(32, DbUtil.formatString(TemplarUtil.convertNonEnglishCharsToEnglish(formTn.pubCompany.state)));     // i_pub_co_state
            cs.setString(33, DbUtil.formatString(TemplarUtil.convertNonEnglishCharsToEnglish(formTn.pubCompany.zip)));       // i_pub_co_zip
            cs.setString(34, DbUtil.formatString(TemplarUtil.convertNonEnglishCharsToEnglish(formTn.pubCompany.country)));   // i_pub_co_country
            cs.setString(35, DbUtil.formatString(TemplarUtil.convertNonEnglishCharsToEnglish(formTn.pubCompany.phone)));     // i_pub_co_phone
            cs.setString(36, DbUtil.formatString(TemplarUtil.convertNonEnglishCharsToEnglish(formTn.pubCompany.fax)));       // i_pub_co_fax
            cs.setString(37, DbUtil.formatString(TemplarUtil.convertNonEnglishCharsToEnglish(formTn.file1)));                // i_file1
            cs.setString(38, DbUtil.formatString(TemplarUtil.convertNonEnglishCharsToEnglish(formTn.file2)));                // i_file2
            cs.setString(39, DbUtil.formatString(TemplarUtil.convertNonEnglishCharsToEnglish(formTn.file3)));                // i_file3
            cs.setString(40, DbUtil.formatString(TemplarUtil.convertNonEnglishCharsToEnglish(formTn.file4)));                // i_file4 
            cs.setString(41, DbUtil.formatString(TemplarUtil.convertNonEnglishCharsToEnglish(formTn.file5)));                // i_file5
            cs.setString(42, DbUtil.formatString(TemplarUtil.convertNonEnglishCharsToEnglish(formTn.tradeName)));            // i_trade_name 
            cs.setString(43, DbUtil.formatString(TemplarUtil.convertNonEnglishCharsToEnglish(formTn.tnNumber)));             // i_tn_number
            cs.setString(44, (formTn.approved ? "Y" : "N"));                                                                 // i_approved_flag  
            cs.setString(45, userLoginId);                                                                                   // i_login_userid  
            cs.setDate(46, formTn.exportDt.getSqlDate());																	 // i_export_dt
            
            // check 
            
            cs.setDate(47, formTn.inciNameDt.getSqlDate());              													 // i_inci_name_dt	
            cs.setString(48, DbUtil.formatString(formTn.chemStructOpt));													 // i_req_structure
            cs.setString(49, DbUtil.formatString(formTn.ingredient));                                                        // i_ingredient  
            cs.setString(50, DbUtil.formatString(TemplarUtil.convertNonEnglishCharsToEnglish(formTn.ingredDesc)));           // i_ingredient_desc
            cs.setDate(51, formTn.reviewDt.getSqlDate());                                                                    // i_review_date 
            cs.setString(52, DbUtil.formatString(TemplarUtil.convertNonEnglishCharsToEnglish(formTn.otherFunctions)));       // i_other_functions
            cs.setString(53, TemplarUtil.convertCompanyName(DbUtil.formatString(formTn.pubCompany.name)));                   // i_company_name_mkey
            cs.setString(54, DbUtil.formatString(TemplarUtil.convertNonEnglishCharsToEnglish(formTn.adminComments)));        // i_admin_comments        
            cs.setString(55, DbUtil.formatString(TemplarUtil.convertNonEnglishCharsToEnglish(formTn.monoId)));               // i_monoid
            cs.setString(56, DbUtil.formatString(TemplarUtil.convertNonEnglishCharsToEnglish(formTn.userCompanySupplierId))); // i_cosupplierid
            cs.setString(57, userRecId);                                                                                      // i_cst_key                                                                     
            cs.setString(58, DbUtil.formatString(TemplarUtil.convertNonEnglishCharsToEnglish(formTn.publicationCompanySupplierId))); // i_pubcosupplierid
            cs.setString(59, btnName);                                                                                               // i_button          	
            
            cs.registerOutParameter(1, OracleTypes.NUMBER);    // io_tn_rec_id
            cs.registerOutParameter(60, OracleTypes.NUMBER);   // o_error
            cs.registerOutParameter(61, OracleTypes.VARCHAR);  // o_is_editable
            cs.registerOutParameter(62, OracleTypes.DATE);     // o_submit_dt
            cs.registerOutParameter(63, OracleTypes.VARCHAR);  // o_outstanding_comments 

            // execute the SP
            cs.execute();

            // o_error
            int retCode = cs.getInt(60);  

            // duplicate database record
            if (retCode != -3) {
                long databaseRecordId = cs.getLong(1);
                
                // o_is_editable
                String isEditableStr = DbUtil.formatString(cs.getString(61)); 
                boolean isEditable = isEditableStr.equals("Y");
                
                // o_submit_dt
                TDate submitDt = new TDate(cs.getDate(62));                   
                
                // o_outstanding_comments
                String hasCommentsFlag = DbUtil.formatString(cs.getString(63));
                
                cs.close();

                // get list of functions
                addTradeNameFunctions(conn, formTn, databaseRecordId);

                // recID
                formTn.recID = databaseRecordId;

                if (retCode == 0 || retCode == -2) {
                    conn.commit();
                } else {
                    conn.rollback();
                }

                retVec.addElement(new Long(formTn.recID));
                retVec.addElement(formTn.tnNumber);
                retVec.addElement(new Integer(retCode));
                retVec.addElement(new Boolean(isEditable));
                retVec.addElement(submitDt);
                retVec.addElement(new Boolean(hasCommentsFlag.equals("Y")));
                /* failed attachments */
                retVec.addElement("");
            } else {
                retVec.addElement(new Long(formTn.recID));
                retVec.addElement(formTn.tnNumber);
                retVec.addElement(new Integer(retCode));
                retVec.addElement(new Boolean(true));
                retVec.addElement(new TDate());
                retVec.addElement(new Boolean(false));
                retVec.addElement("");
            }
        } catch (Throwable t) {
            logger.error("Error saving the formTn: ", t);
            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException se) {
                    logger.error("Error on rolling back db changes");
                }
            }
            throw new RuntimeException(t);
        } finally {
            DbConnectionManager.freeResources(conn, cs, null);
        }

        logger.debug("Leaving saveTradeName(...)");
        return retVec;
    }

    private static String getNextTradeNameNumber(Connection conn, DOTradeName formTn) {
        TDate today = new TDate();
        String monStr = String.valueOf(today.getMonth());
        monStr = TemplarUtil.lpad(monStr, 2, '0');

        String yrStr = String.valueOf(today.getYear());
        yrStr = TemplarUtil.lpad(yrStr, 4, '0');

        String seqNumber = DbSequenceManager.getNextFormTnSequenceNumber(conn);
        String seqNumberPadded = TemplarUtil.lpad(seqNumber, 4, '0');

        return formTn.categoryID + "-" + monStr + "-" + yrStr + "-" + seqNumberPadded;
    }

    private static void addTradeNameFunctions(Connection conn, DOTradeName formTn, long databaseRecordId) {
        logger.debug("Entering addTradeNameFunctions(...)");

        CallableStatement cs = null;

        try {
            for (int i = 0; i < formTn.functionList.size(); i++) {
                DOLookupValue d = (DOLookupValue) formTn.functionList.elementAt(i);

                cs = conn.prepareCall("{call TRADE_NAME_MGMT.add_trade_name_function (?)}");
                cs.setInt(1, d.keyID);

                cs.execute();
                cs.close();
            }

            cs = conn.prepareCall("{call TRADE_NAME_MGMT.save_parameters (?)}");
            cs.setLong(1, databaseRecordId);
            cs.execute();
            cs.close();
        } catch (Throwable t) {
            logger.error("Error adding trade name functions: ", t);
            try {
                conn.rollback();
            } catch (SQLException se) {
                logger.error("Error on rolling back db changes");
            }
            throw new RuntimeException(t);
        } finally {
            DbConnectionManager.freeResources(null, cs, null);
        }
    }
    
    // method to get data from cms_text table
    // D. Gutu 26.03.2013
    public static DOList searchCMSList(String text) {
        logger.debug("Entering searchCMSList(...)");

        DOList cmsList = new DOList();

        Connection conn = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        
        // if pass null or empty string return all data from cms_text table
        String tString = "%";
        CLOB clob = null;

        try {
        	// get connection
            conn = DbConnectionManager.getConnection();

            // call oracle SP to pull all cms
            cs = conn.prepareCall("{call TRADE_NAME_MGMT.get_cms_list(?,?)}");
            
            // if input parameter is not null or empty
            if (text != null && !"".equals(text))
            	tString = DbUtil.formatString(text);
            
            // set oracle parameters
            cs.setString(1, tString);
            cs.registerOutParameter(2, OracleTypes.CURSOR);

            // execute oracle stored procedure
            cs.execute();

            // get the result
            rs = (ResultSet) cs.getObject(2);
            
            // loop thru the result, out cursor
            while (rs.next()) {
            	DOCMSText doCMSText = new DOCMSText();
            	
            	// cms_uid from cms_text table
            	doCMSText.setCMSUid(rs.getLong(1));
            	
            	// cms_title from cms_text table
            	doCMSText.setCMSTitle(DbUtil.formatString(rs.getString(2)));
            	
            	//cms_text from cms_text table 
            	clob = (CLOB) rs.getClob(3);
            	if (clob != null) {
            		long length = clob.length();
            		String str = clob.getSubString(1, (int) length);
            		if (str != null)
            			doCMSText.setCMSText(DbUtil.formatString(str));
            	}            	
            	
            	// add CMS object to the list
            	cmsList.addElement(doCMSText);
            }
        } catch (SQLException e) {
            logger.error("Error searching for cms list (TRADE_NAME_MGMT.GET_CMS_LIST): ", e);
            //throw new InciException();
            throw new RuntimeException(e);
            //System.out.print(e.getMessage());
        } finally {
        	// free connection resources
            DbConnectionManager.freeResources(conn, cs, rs);
        }

        logger.debug("Leaving searchCMSList(...): cmsList.size()={}", cmsList.size());
        
        // return the result
        return cmsList;
    }
    
    // method to get data from cms_text table search by cms text
    // D. Gutu 10.09.2014
    public static DOList searchCMSListByText(String text) {
        logger.debug("Entering searchCMSListByText(...)");

        DOList cmsList = new DOList();

        Connection conn = null;
        ResultSet rs = null;
        CallableStatement cs = null;
        
        // if pass null or empty string return all data from cms_text table
        String tString = "%";
        CLOB clob = null;

        try {
        	// get connection
            conn = DbConnectionManager.getConnection();

            // call oracle SP to pull all cms
            cs = conn.prepareCall("{call TRADE_NAME_MGMT.get_cms_list2(?,?)}");
            
            // if input parameter is not null or empty
            if (text != null && !"".equals(text))
            	tString = DbUtil.formatString(text);
            
            // set oracle parameters
            cs.setString(1, tString);
            cs.registerOutParameter(2, OracleTypes.CURSOR);

            // execute oracle stored procedure
            cs.execute();

            // get the result
            rs = (ResultSet) cs.getObject(2);
            
            // loop thru the result, out cursor
            while (rs.next()) {
            	DOCMSText doCMSText = new DOCMSText();
            	
            	// cms_uid from cms_text table
            	doCMSText.setCMSUid(rs.getLong(1));
            	
            	// cms_title from cms_text table
            	doCMSText.setCMSTitle(DbUtil.formatString(rs.getString(2)));
            	
            	//cms_text from cms_text table 
            	clob = (CLOB) rs.getClob(3);
            	if (clob != null) {
            		long length = clob.length();
            		String str = clob.getSubString(1, (int) length);
            		if (str != null)
            			doCMSText.setCMSText(DbUtil.formatString(str));
            	}            	
            	
            	// add CMS object to the list
            	cmsList.addElement(doCMSText);
            }
        } catch (SQLException e) {
            logger.error("Error searching for cms list (TRADE_NAME_MGMT.GET_CMS_LIST2): ", e);
            //throw new InciException();
            throw new RuntimeException(e);
            //System.out.print(e.getMessage());
        } finally {
        	// free connection resources
            DbConnectionManager.freeResources(conn, cs, rs);
        }

        logger.debug("Leaving searchCMSListByText(...): cmsList.size()={}", cmsList.size());
        
        // return the result
        return cmsList;
    }    
    
    
    // method to create temporary Oracle Clob
    public static Object createTemporaryLOB(Connection conn)
	{
		Object lob = null;
		try {
			CallableStatement createTemporaryStmt = conn.prepareCall("{ call DBMS_LOB.CREATETEMPORARY(?,TRUE)}");
			createTemporaryStmt.registerOutParameter(1, oracle.jdbc.OracleTypes.CLOB);
			createTemporaryStmt.execute();
			lob = createTemporaryStmt.getObject(1);
		}
		catch(Exception e) {
			//throw new InciException();
			throw new RuntimeException(e);
		}
		
		return lob;
    }
    
    // method to save cms data
    // D. Gutu 29.03.2013
    public static int saveCMS (Long cmsUid, String cmsTitle, String cmsText) {
    	logger.debug("Entering saveCMS(...)");
    	
        Connection conn = null;        
        CallableStatement cs = null;
        int rs = 0;
        CLOB clob = null;
        
        try {
        	// get connection
            conn = DbConnectionManager.getConnection();

            // call oracle SP to pull all cms
            cs = conn.prepareCall("{call TRADE_NAME_MGMT.save_cms_text(?,?,?,?)}");
            
            // set oracle parameters
            
            // cms_uid
            cs.setLong(1, cmsUid);
            
            // cms_title
            cs.setString(2, DbUtil.formatString(cmsTitle));
            
            // cms_text
            if (createTemporaryLOB(conn) != null)
            	clob = (CLOB) createTemporaryLOB(conn);
            
            clob.putChars(1, DbUtil.formatString(cmsText).toCharArray());            
            cs.setClob(3, clob);
            
            // out parameter
            cs.registerOutParameter(4, OracleTypes.NUMBER);

            // execute oracle stored procedure
            cs.execute();

            // get the result
            rs = cs.getInt(4);

	    } catch (SQLException e) {
	        logger.error("Error save (TRADE_NAME_MGMT.SAVE_CMS_TEXT): ", e);
	        //throw new InciException();
	        throw new RuntimeException(e);
	    } finally {
	    	// free connection resources
	        DbConnectionManager.freeResources(conn, cs, null);
	    }
    	
    	logger.debug("Leaving saveCMS(...): {}", rs);
    	
    	return rs;
    }
    
    // method to query trade_names
    // D. Gutu 03.04.2013
    public static DOList getTradeNameList (StringBuilder cstKeyList, String appNumber, String tradeName, String companyName, String orderBy, int ordering) {
    	logger.debug("Entering getTradeNameList(...)");
    	//logger.debug("cstKeyList="+cstKeyList);
        Connection conn = null;        
        CallableStatement cs = null;
        ResultSet rs = null;
        DOList list = new DOList();
        CLOB clob = null;
        
        try {
        	// get connection
            conn = DbConnectionManager.getConnection();

            // call oracle SP to pull trades
            cs = conn.prepareCall("{call TRADE_NAME_MGMT.get_trade_list(?,?,?,?,?,?,?)}");
            
            // set oracle parameters            
            // cst_key list
            if (createTemporaryLOB(conn) != null)
            	clob = (CLOB) createTemporaryLOB(conn);
            
            if (cstKeyList != null && !cstKeyList.equals(""))
            	clob.putChars(1, DbUtil.formatString(cstKeyList.toString()).toCharArray());
            
           	cs.setClob(1, clob);
            
            //cs.setString(1, cstKeyList.toString());     
            
            // appNumber
            cs.setString(2, appNumber);
            
            // tradename
            cs.setString(3, tradeName);
            
            // company name
            cs.setString(4, companyName);
            
            // order By
            cs.setString(5, orderBy);
            
            // ordering
            cs.setInt(6, ordering);            
            
            // out parameter
            cs.registerOutParameter(7, OracleTypes.CURSOR);

            // execute oracle stored procedure
            cs.execute();

            // get the result
            rs = (ResultSet) cs.getObject(7);
            
            // loop thru the result, out cursor
            while (rs.next()) {
            	DOTradeName trade = new DOTradeName();            	
            	trade.userRecId = DbUtil.formatString(rs.getString(1));  // cst_key            	
            	trade.compStmt = DbUtil.formatString(rs.getString(2));   // company_name_mkey
            	trade.tnNumber = DbUtil.formatString(rs.getString(3));   // tn_number 
            	trade.tradeName = DbUtil.formatString(rs.getString(4));  // trade_name    
            	trade.recID = rs.getLong(5);                             // tn_rec_id
            	trade.pubCompany.name = DbUtil.formatString(rs.getString(6)); // publication company name
            	
            	// add CMS object to the list
            	list.addElement(trade);
            	
            	//logger.debug(trade.userRecId);
            }

	    } catch (SQLException e) {
	        logger.error("Error searching for trades (TRADE_NAME_MGMT.get_trade_list): ", e);
	        throw new RuntimeException(e);
	    } finally {
	    	// free connection resources
	        DbConnectionManager.freeResources(conn, cs, null);
	    }
    	
    	logger.debug("Leaving getTradeNameList(...): {}", rs);
    	
    	return list;
    }
    
    // method to move trades to new user cst_key
    // D. Gutu 08.04.2013
    public static int moveTradesToNewUser (String newUserCstKey, StringBuilder tnRecIdList, String currentUserRecId) {
    	logger.debug("Entering moveTradesToNewUser(...)");
    	
        Connection conn = null;        
        CallableStatement cs = null;
        int rs = 0;
        
        try {
        	// get connection
            conn = DbConnectionManager.getConnection();

            // call oracle SP to pull all cms
            cs = conn.prepareCall("{call TRADE_NAME_MGMT.move_trades_to_new_user(?,?,?,?)}");
            
            // set oracle parameters
            
            // cst_key
            cs.setString(1, newUserCstKey);
            
            // TN_REC_ID, TN_REC_ID
            cs.setString(2, tnRecIdList.toString());
            
            // currentUserRecId
            cs.setString(3, currentUserRecId);
            
            // out parameter
            cs.registerOutParameter(4, OracleTypes.NUMBER);

            // execute oracle stored procedure
            cs.execute();

            // get the result
            rs = cs.getInt(4);

	    } catch (SQLException e) {
	        logger.error("Error save (TRADE_NAME_MGMT.move_trades_to_new_user): ", e);
	        throw new RuntimeException(e);
	    } finally {
	    	// free connection resources
	        DbConnectionManager.freeResources(conn, cs, null);
	    }
    	
    	logger.debug("Leaving moveTradesToNewUser(...): {}", rs);
    	
    	return rs;
    }
    
	public static int deleteTradeName(long tnRecId) {
        logger.debug("Entering deleteTradeName(tnRecId={}", tnRecId);

        int retCode = 0;

        Connection conn = null;
        CallableStatement cs = null;

        try {
            conn = DbConnectionManager.getConnection();
            conn.setAutoCommit(false);

            cs = conn.prepareCall("{ call TRADE_NAME_MGMT.delete_trade_name(?,?) }");

            cs.setLong(1, tnRecId);
            cs.registerOutParameter(2, OracleTypes.NUMBER);            

            // execute Oracle SP
            cs.execute();
            
            // SP return value
            retCode = cs.getInt(2);
            
            // if OK commit the transaction
            if (retCode == 0) {
                conn.commit();
            } else {
                conn.rollback();
            }
        } catch (Throwable t) {
            logger.error("Error deleting the trade: ", t);
            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException se) {
                    logger.error("Error on rolling back db changes");
                }
            }
            throw new RuntimeException(t);
        } finally {
            DbConnectionManager.freeResources(conn, cs, null);
        }

        logger.debug("Leaving deleteTradeName(...)");
        return retCode;
    }
	
	public static String getPrivacyPolicy() {
    	String privacyPolicy = null;
    	DOList cmsList = new DOList();
    	DOCMSText cmsText = new DOCMSText(); 
    	
    	try {
    		// get data from DB
    		cmsList = TradeNameService.searchCMSList("Privacy Policy");
    		
    		if (cmsList.size() > 0) {
    			cmsText = (DOCMSText) cmsList.elementAt(0);
    		}
    		
    		privacyPolicy = cmsText.getCMSText();
    		
    	}
    	catch (Exception ex) {
    		logger.error("######### TradeNameService.getPrivacyPolicy: " + ex.getMessage());
    	}
    	
    	return (TemplarUtil.isStringNullOrEmpty(privacyPolicy) ? "" : privacyPolicy);
    }
	
	public static String getCMSText(String cmsTitle) {
    	String text = null;
    	DOList cmsList = new DOList();
    	DOCMSText cmsText = new DOCMSText(); 
    	
    	try {
    		// get data from DB
    		cmsList = TradeNameService.searchCMSList(cmsTitle);
    		
    		if (cmsList.size() > 0) {
    			cmsText = (DOCMSText) cmsList.elementAt(0);
    		}
    		
    		text = cmsText.getCMSText();
    		
    	}
    	catch (Exception ex) {
    		logger.error("######### TradeNameService.getCMSText: " + ex.getMessage());
    	}
    	
    	return (TemplarUtil.isStringNullOrEmpty(text) ? "" : text);
	}
	
	public static boolean checkSaveAsTradeIsDuplicate(String tradename, String cstKey, long tn_rec_id) {
        CallableStatement cs = null;
        int rs = 0;
        
        Connection conn = null;

        try {
        	conn = DbConnectionManager.getConnection();
            cs = conn.prepareCall("{?=call TRADE_NAME_MGMT.saveas_trade_is_duplicate(?,?,?)}");

            cs.registerOutParameter(1, OracleTypes.NUMBER);
            cs.setString(2, tradename);
            cs.setString(3, cstKey);
            cs.setLong(4, tn_rec_id);

            cs.execute();

            rs = cs.getInt(1);            
        } catch (SQLException e) {
            logger.error("Error checkSaveAsTradeIsDuplicate: ", e);
            throw new RuntimeException(e);
        } finally {
            DbConnectionManager.freeResources(null, cs, null);
        }
        
        return (rs==1?true:false);
    }	
	
	// log to database
    /*public static void log (String message) {
    	logger.debug("Entering log(...)");
    	
        Connection conn = null;        
        CallableStatement cs = null;
        
        try {
        	// get connection
            conn = DbConnectionManager.getConnection();

            // call oracle SP 
            cs = conn.prepareCall("{call TRADE_NAME_MGMT.log(?)}");
            conn.setAutoCommit(true);
            
            // message
            cs.setString(1, message);            

            // execute oracle stored procedure
            cs.execute();

	    } catch (SQLException e) {
	        logger.error("Error (TRADE_NAME_MGMT.log): ", e);
	    } finally {
	    	// free connection resources
	        DbConnectionManager.freeResources(conn, cs, null);
	    }
    	
    	logger.debug("Leaving log(...): {}");
    }*/	
}
