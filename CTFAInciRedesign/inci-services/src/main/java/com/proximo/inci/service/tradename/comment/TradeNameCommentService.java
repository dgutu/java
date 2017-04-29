/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.service.tradename.comment;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import oracle.jdbc.OracleTypes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proximo.inci.DOFormTNComment;
import com.proximo.inci.DOList;
import com.proximo.inci.DbConnectionManager;
import com.proximo.inci.DbUtil;
import com.proximo.inci.common.TDate;

public class TradeNameCommentService {

    private static Logger logger = LoggerFactory.getLogger(TradeNameCommentService.class);

    /** Not intended to be instantiated. Exposed only static members. */
    private TradeNameCommentService() {
    }

    public static void saveComment(long tnRecId, String userLoginId, String subject, String msg) {
        logger.debug("Entering saveComment(tnRecId={}, userLoginId={}, subject={}, ...)", new Object[] { tnRecId,
                userLoginId, subject });

        Connection conn = null;
        CallableStatement cs = null;

        try {
            conn = DbConnectionManager.getConnection();

            cs = conn.prepareCall("{ call TRADE_NAME_MGMT.add_tn_comment(?, ?, ?, ?, ?) }");

            cs.setLong(1, tnRecId);
            cs.setString(2, userLoginId);
            cs.setString(3, subject);
            cs.setString(4, msg.trim());

            cs.registerOutParameter(5, OracleTypes.NUMBER);

            cs.execute();

            int retCode = cs.getInt(5);
            if (retCode != 0) {
                //throw new InciException();
            	throw new RuntimeException("TradeNameCommentService.saveComment, call TRADE_NAME_MGMT.add_tn_comment, retCode != 0 !");
            }
        } catch (SQLException e) {
            logger.error("Error saving comment: ", e);
            //throw new InciException();
            throw new RuntimeException(e);
        } finally {
            DbConnectionManager.freeResources(conn, cs, null);
        }

        logger.debug("Leaving saveComment(tnRecId={}, userLoginId={}, subject={}, ...)", new Object[] { tnRecId,
                userLoginId, subject });
    }

    public static DOList findComments(long tnRecId, String userLoginId) {
        logger.debug("Entering findComments(tnRecId={}, userLoginId={})", tnRecId, userLoginId);

        DOList list = new DOList();

        Connection conn = null;
        CallableStatement cs = null;
        ResultSet rs = null;

        try {
            conn = DbConnectionManager.getConnection();
            cs = conn.prepareCall("{call TRADE_NAME_MGMT.get_tn_comments(?, ?, ?)}");

            cs.setLong(1, tnRecId);
            cs.setString(2, userLoginId);
            cs.registerOutParameter(3, OracleTypes.CURSOR);

            cs.execute();

            rs = (ResultSet) cs.getObject(3);
            while (rs.next()) {
                DOFormTNComment tnComment = new DOFormTNComment();

                tnComment.recID = rs.getLong(1);
                tnComment.tnRecID = tnRecId;
                tnComment.subject = DbUtil.formatString(rs.getString(2));
                tnComment.msgBody = DbUtil.formatString(rs.getString(3));
                tnComment.sentDt = new TDate(rs.getDate(4));
                tnComment.isClosed = DbUtil.getFlag(rs.getString(5));
                tnComment.closeDt = new TDate(rs.getDate(6));

                list.addElement(tnComment);
            }
        } catch (SQLException e) {
            logger.error("Error finding comments: ", e);
            //throw new InciException();
            throw new RuntimeException(e);
        } finally {
            DbConnectionManager.freeResources(conn, cs, rs);
        }

        logger.debug("Leaving findComments(...): list.size()={}", list.size());
        return list;
    }
    
    public static void setCloseTnComments(DOList commentList, String userLoginId) {
        Connection conn = null;
        CallableStatement cs = null;
        
        try {
            conn = DbConnectionManager.getConnection();
            
            cs = conn.prepareCall("{ call TRADE_NAME_MGMT.set_close_tn_comment(?, ?, ?) }");

            logger.debug("commentList.size()="+commentList.size());
            
            for (int i = 0; i < commentList.size(); i++) {
                DOFormTNComment tnComment = (DOFormTNComment) commentList.elementAt(i);
                
                logger.debug("setCloseTnComments.tnComment.isClosed="+tnComment.isClosed);                
                
                cs.setLong(1, tnComment.recID);
                cs.setString(2, userLoginId);
                cs.setString(3, tnComment.isClosed ? "Y" : "N");

                cs.execute();
            }
            
            cs.close();
        } catch (SQLException e) {
            logger.error("Error finding comments: ", e);
            //throw new InciException();
            throw new RuntimeException(e);
        } finally {
            DbConnectionManager.freeResources(conn, cs, null);
        }
    }    

}
