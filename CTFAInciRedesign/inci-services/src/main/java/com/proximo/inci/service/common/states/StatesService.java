/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.service.common.states;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import oracle.jdbc.OracleTypes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proximo.inci.DbConnectionManager;
import com.proximo.inci.exception.InciException;

public class StatesService {

    private static Logger logger = LoggerFactory.getLogger(StatesService.class);

    private static List<State> states = new ArrayList<State>();

    /** Not intended to be instantiated. Exposed only static members. */
    private StatesService() {
    }

    public static void initialize() {
        logger.info("Loading states");

        states = loadStatesFromDb();

        logger.info("Finished loading states");
    }

    public static List<State> getStates() {
        return states;
    }

    private static List<State> loadStatesFromDb() {
        logger.debug("Entering loadStatesFromDb()");

        List<State> statesList = new ArrayList<State>();

        Connection conn = null;
        CallableStatement cs = null;
        ResultSet rs = null;

        try {
            conn = DbConnectionManager.getConnection();

            cs = conn.prepareCall("{ call TRADE_NAME_MGMT.list_states(?)}");
            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.execute();

            rs = (ResultSet) cs.getObject(1);
            while (rs.next()) {
                statesList.add(new State(rs.getString(2), rs.getString(1), rs.getString(3)));
            }
        } catch (SQLException e) {
            logger.error("Error retrieving states: ", e);
            //throw new InciException();
            throw new RuntimeException(e);
        } finally {
            DbConnectionManager.freeResources(conn, cs, rs);
        }

        logger.debug("Leaving loadStatesFromDb(): statesList.size()=" + statesList.size());

        return statesList;
    }
}
