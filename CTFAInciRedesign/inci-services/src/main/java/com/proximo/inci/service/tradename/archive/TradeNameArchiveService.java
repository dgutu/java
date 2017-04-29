/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.service.tradename.archive;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import oracle.jdbc.OracleTypes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proximo.inci.DOList;
import com.proximo.inci.DOTradeName;
import com.proximo.inci.DbConnectionManager;
import com.proximo.inci.DbUtil;
import com.proximo.inci.common.TDate;
import com.proximo.inci.common.TemplarUtil;

public class TradeNameArchiveService {

    private static Logger logger = LoggerFactory.getLogger(TradeNameArchiveService.class);

    /** Not intended to be instantiated. Exposed only static members. */
    private TradeNameArchiveService() {
    }

    public static DOList searchArchivedTradeNames(DOTradeName searchObj, String userRecId, String orderBy, int ordering) {
        logger.debug("Entering searchArchivedTradeNames(userRecId={})", userRecId);

        DOList list = new DOList();

        Connection conn = null;
        CallableStatement cs = null;

        ResultSet rs = null;

        try {
            conn = DbConnectionManager.getConnection();

            cs = conn.prepareCall("{? = call TRADE_NAME_MGMT.search_archived_TN(?, ?, ?, ?, ?, ?, ?, ?, ?)}");

            cs.setString(2, userRecId);
            cs.setString(3, searchObj.tradeName);
            cs.setInt(4, searchObj.categoryID);
            cs.setString(5, searchObj.tnNumber);
            cs.setDate(6, searchObj.inciNameDt.getSqlDate());
            // use as end date of inciNameDt
            cs.setDate(7, searchObj.submitDt.getSqlDate());

            cs.setString(8, TemplarUtil.convertCompanyName(searchObj.pubCompany.name));

            cs.registerOutParameter(1, OracleTypes.CURSOR);

            cs.setString(9, orderBy);
            cs.setInt(10, ordering);            
            
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

                tn.submitDt = new TDate(rs.getDate(25));
                tn.inciName = DbUtil.formatString(rs.getString(24));
                tn.pubCompany.name = DbUtil.formatString(rs.getString(31));

                list.addElement(tn);
            }
        } catch (SQLException e) {
            logger.error("Error searching the archived trade names: ", e);
            //throw new InciException();
            throw new RuntimeException(e);
        } finally {
            DbConnectionManager.freeResources(conn, cs, rs);
        }

        logger.debug("Leaving searchArchivedTradeNames(userRecId={}): list.size()={}", userRecId, list.size());
        return list;
    }

    public static DOList searchActiveTradeNames(DOTradeName searchObj, String userRecId, String orderBy, int ordering) {
        logger.debug("Entering searchActiveTradeNames(userRecId={})", userRecId);

        DOList list = new DOList();

        Connection conn = null;
        CallableStatement cs = null;

        ResultSet rs = null;

        try {
            conn = DbConnectionManager.getConnection();

            cs = conn.prepareCall("{? = call TRADE_NAME_MGMT.search_active_TN(?, ?, ?, ?, ?, ?, ?, ?, ?)}");

            cs.setString(2, userRecId);
            cs.setString(3, searchObj.tradeName);
            cs.setInt(4, searchObj.categoryID);
            cs.setString(5, searchObj.tnNumber);
            cs.setDate(6, searchObj.inciNameDt.getSqlDate());
            // use as end date of inciNameDt
            cs.setDate(7, searchObj.submitDt.getSqlDate());

            cs.setString(8, TemplarUtil.convertCompanyName(searchObj.pubCompany.name));

            cs.registerOutParameter(1, OracleTypes.CURSOR);
            
            cs.setString(9, orderBy);
            cs.setInt(10, ordering);

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

                tn.submitDt = new TDate(rs.getDate(25));
                tn.inciName = DbUtil.formatString(rs.getString(24));
                tn.pubCompany.name = DbUtil.formatString(rs.getString(31));

                list.addElement(tn);
            }
        } catch (SQLException e) {
            logger.error("Error searching active trade names: ", e);
            //throw new InciException();
            throw new RuntimeException(e);
        } finally {
            DbConnectionManager.freeResources(conn, cs, rs);
        }

        logger.debug("Leaving searchActiveTradeNames(userRecId={}): list.size()={}", userRecId, list.size());
        return list;
    }

    public static void moveActives2Archive(List<Long> recIds, String userLoginId) {
        logger.debug("Entering moveActives2Archive(userLoginId={})", userLoginId);

        Connection conn = null;
        CallableStatement cs = null;

        if (recIds == null || recIds.size() < 1) {
            logger.error("No record is avaiable to move.");
            //throw new InciException();
            throw new RuntimeException("Tradename.ArchiveService.moveActives2Archive: No record is avaiable to move !");
        }

        try {
            conn = DbConnectionManager.getConnection();

            cs = conn.prepareCall("{call TRADE_NAME_MGMT.move_to_archive(?,?)}");

            for (Long recId : recIds) {
                cs.setLong(1, recId);
                cs.setString(2, userLoginId);
                cs.addBatch();
            }

            cs.executeBatch();
        } catch (SQLException e) {
            logger.error("Error moving to the archive trade names: ", e);
            //throw new InciException();
            throw new RuntimeException(e);
        } finally {
            DbConnectionManager.freeResources(conn, cs, null);
        }

        logger.debug("Leaving moveActives2Archive(userLoginId={})", userLoginId);
    }

    public static void removeTnFromArchive(long recId, String userLoginId) {
        logger.debug("Entering removeTnFromArchive(recId={}, userLoginId={})", recId, userLoginId);

        Connection conn = null;
        CallableStatement cs = null;

        try {
            conn = DbConnectionManager.getConnection();

            cs = conn.prepareCall("{call TRADE_NAME_MGMT.remove_from_archive(?,?)}");

            cs.setLong(1, recId);
            cs.setString(2, userLoginId);

            cs.execute();
        } catch (SQLException e) {
            logger.error("Error removing from the archive a trade name: ", e);
            //throw new InciException();
            throw new RuntimeException(e);
        } finally {
            DbConnectionManager.freeResources(conn, cs, null);
        }

        logger.debug("Leaving removeTnFromArchive(recId={}, userLoginId={})", recId, userLoginId);
    }

}
