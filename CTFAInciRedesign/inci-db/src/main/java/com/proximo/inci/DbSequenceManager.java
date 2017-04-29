/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DbSequenceManager {

    private static Logger logger = LoggerFactory.getLogger(DbSequenceManager.class);

    private static final int INOSS_TN_OBJECT_ID = 100;

    /** Not intended to be instantiated. Exposed only static members. */
    private DbSequenceManager() {
    }

    public static String getNextFormTnSequenceNumber(Connection conn) {
        return getNextSequenceNumber(conn, INOSS_TN_OBJECT_ID);
    }

    private static String getNextSequenceNumber(Connection conn, int objectTypeId) {
        logger.debug("Entering getNextSequence(objectTypeId={}", objectTypeId);

        String id = "";

        Statement stmt = null;
        ResultSet rs = null;

        try {

            String stmtStr = new String("SELECT Last_Sequence FROM object_sequences WHERE object_type_id = "
                    + objectTypeId);

            stmt = conn.createStatement();
            rs = stmt.executeQuery(stmtStr);

            long seq = 0;
            if (rs.next()) {
                seq = rs.getLong(1);
            }

            seq++;
            if (seq != 0) {
                stmtStr = "UPDATE object_sequences set last_sequence = " + seq + " WHERE object_type_id = "
                        + objectTypeId;
                stmt.executeUpdate(stmtStr);
                id = String.valueOf(seq);
            } else {
                id = "";
            }
        } catch (SQLException e) {
            logger.error("Error getting the next sequence: ", e);
            throw new RuntimeException(e);
        } finally {
            DbConnectionManager.freeResources(null, stmt, rs);
        }

        logger.debug("Leaving getNextSequence(objectTypeId={}", objectTypeId);
        return id;
    }
}
