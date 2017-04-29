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

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//import com.proximo.inci.exception.InciException;

public class DbConnectionManager {

    private static Logger logger = LoggerFactory.getLogger(DbConnectionManager.class);

    public final static String JNDI_INCI_DATASOURCE = "java:comp/env/jdbc/inciDB";

    private static DataSource dataSource = loadDataSource();

    /** Not intended to be instantiated. Exposed only static members. */
    private DbConnectionManager() {
    }

    public static Connection getConnection() throws SQLException {
        logger.debug("Getting database connection");
        
        Connection conn = dataSource.getConnection();

        if (conn != null) {
            
            if (logger.isTraceEnabled()) {
                conn = new net.sf.log4jdbc.ConnectionSpy(conn);
            }
            

            logger.debug("Database connection acquired");
            return conn;
        } else {
            // no connections are available currently
            return getConnection();
        }
    }

    public static void freeResources(Connection conn, Statement stmt, ResultSet rs) {
        logger.debug("Releasing JDBC resources");
        
        if (rs != null) {
            try {
                logger.debug("Closing ResultSet");
                rs.close();
                logger.debug("ResultSet closed");
            } catch (SQLException e) {
                logger.warn("Error on ResultSet close", e);
            }
        }
        if (stmt != null) {
            try {
                logger.debug("Closing Statement");
                stmt.close();
                logger.debug("Statement closed");
            } catch (SQLException e) {
                logger.warn("Error on Statement close", e);
            }
        }
        if (conn != null) {
            try {
                logger.debug("Closing Connection");
                conn.close();
                logger.debug("Connection closed");
            } catch (SQLException e) {
                logger.warn("Error on Connection close", e);
            }
        }
        
        logger.debug("Released JDBC resources");
    }

    private static DataSource loadDataSource() {
        logger.debug("Retrieving the data source via JNDI");
        try {
            Context ctx = new InitialContext();
            DataSource ods = (DataSource) ctx.lookup(JNDI_INCI_DATASOURCE);
            return ods;
        } catch (NamingException e) {
            logger.error("Unable to retrieve data source via JNDI", e);
            //throw new InciException();
            throw new RuntimeException(e);
        }
    }
}
