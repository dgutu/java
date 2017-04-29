/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.service.appidmove;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import oracle.jdbc.OracleTypes;

import com.proximo.inci.DbConnectionManager;
import com.proximo.inci.common.Encrypt;

public class AppIDMoveService {
	
	// check user credentials and return userRecId
    public static long verifyOldUserCredentials(String username, String password) {
        long userRecId = 0;

        Connection conn = null;
        CallableStatement cs = null;
        Integer validityIndicator = null;

        try {
            conn = DbConnectionManager.getConnection();

            cs = conn.prepareCall("{call TRADE_NAME_MGMT.ValidateUser(?,?,?,?)}");

            cs.setString(1, username.toUpperCase());
            cs.setString(2, Encrypt.encrypt(password, Encrypt.TYPE_CRYPT_CHECKSUM));            

            cs.registerOutParameter(3, OracleTypes.NUMBER);
            cs.registerOutParameter(4, OracleTypes.NUMBER);

            cs.execute();

            validityIndicator = cs.getInt(3);

            if (validityIndicator != null) {
                if (validityIndicator != 1 && validityIndicator != 2 && validityIndicator != 3) {
                	userRecId =  cs.getLong(4);
                	
                }
            }            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            DbConnectionManager.freeResources(conn, cs, null);
        }

        return userRecId;
    }
    
	// check user credentials and return userRecId
    public static String updateUserTables(long userRecId, String cstKey) {

        Connection conn = null;
        CallableStatement cs = null;
        
        String result = null;

        try {
            conn = DbConnectionManager.getConnection();

            cs = conn.prepareCall("{call TRADE_NAME_MGMT.update_cst_key(?,?,?)}");

            cs.setLong(1, userRecId);
            cs.setString(2, cstKey.toUpperCase());          

            cs.registerOutParameter(3, OracleTypes.VARCHAR);

            cs.execute();            
            result = cs.getString(3);
            conn.commit();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            DbConnectionManager.freeResources(conn, cs, null);
        }

        return result;
    }
    
}
