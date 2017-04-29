/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.service.security;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import oracle.jdbc.OracleTypes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proximo.inci.DbConnectionManager;
import com.proximo.inci.DbUtil;
import com.proximo.inci.common.Encrypt;
//import com.proximo.inci.exception.InciException;
import com.proximo.inci.service.security.user.User;
import com.proximo.inci.service.security.user.UserCompany;

public class AdminUserSecurityService {

    private static Logger logger = LoggerFactory.getLogger(AdminUserSecurityService.class);

    public static final int ADMIN_USER_REC_ID = -1; /*"97E708B8-BE28-4643-91A2-217CC69ACB8C";*/ 
    public static final String ADMIN_USERNAME = "ADMIN";

    /** Not intended to be instantiated. Exposed only static members. */
    private AdminUserSecurityService() {
    }

    public static boolean verifyAdminUserPassword(String password) {
        boolean passwordValid = false;

        Connection conn = null;
        CallableStatement cs = null;
        Integer validityIndicator = null;

        try {
            conn = DbConnectionManager.getConnection();

            cs = conn.prepareCall("{? = call ctfa_security.validateuser(?,?)}");

            cs.setString(2, ADMIN_USERNAME);
            cs.setString(3, Encrypt.encrypt(password, Encrypt.TYPE_CRYPT_CHECKSUM));

            cs.registerOutParameter(1, OracleTypes.INTEGER);

            cs.execute();

            validityIndicator = cs.getInt(1);
        } catch (SQLException e) {
            logger.error("Error verifying Admin user's password: ", e);
            //throw new InciException();
            throw new RuntimeException(e);
        } finally {
            DbConnectionManager.freeResources(conn, cs, null);
        }

        if (validityIndicator != null) {
            if (validityIndicator != 1 && validityIndicator != 2 && validityIndicator != 3) {
                passwordValid = true;
            }
        }

        return passwordValid;
    }

    public static User getAdminUser() {
        logger.debug("Entering getAdminUser()");

        User user = null;

        Connection conn = null;
        CallableStatement cs = null;

        try {
            conn = DbConnectionManager.getConnection();

            cs = conn.prepareCall("{call ctfa_security.getRegistration(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"
                    + "?,?,?,?,?,?,?,?,?,?,?,?,?)}");

            cs.setString(1, ADMIN_USERNAME);

            cs.registerOutParameter(2, OracleTypes.NUMBER);
            cs.registerOutParameter(3, OracleTypes.NUMBER);
            cs.registerOutParameter(4, OracleTypes.VARCHAR);
            cs.registerOutParameter(5, OracleTypes.VARCHAR);
            cs.registerOutParameter(6, OracleTypes.VARCHAR);
            cs.registerOutParameter(7, OracleTypes.CHAR);
            cs.registerOutParameter(8, OracleTypes.VARCHAR);
            cs.registerOutParameter(9, OracleTypes.VARCHAR);
            cs.registerOutParameter(10, OracleTypes.VARCHAR);
            cs.registerOutParameter(11, OracleTypes.VARCHAR);
            cs.registerOutParameter(12, OracleTypes.VARCHAR);
            cs.registerOutParameter(13, OracleTypes.VARCHAR);
            cs.registerOutParameter(14, OracleTypes.VARCHAR);
            cs.registerOutParameter(15, OracleTypes.VARCHAR);
            cs.registerOutParameter(16, OracleTypes.VARCHAR);
            cs.registerOutParameter(17, OracleTypes.VARCHAR);
            cs.registerOutParameter(18, OracleTypes.VARCHAR);
            cs.registerOutParameter(19, OracleTypes.VARCHAR);
            cs.registerOutParameter(20, OracleTypes.VARCHAR);
            cs.registerOutParameter(21, OracleTypes.VARCHAR);
            cs.registerOutParameter(22, OracleTypes.VARCHAR);
            cs.registerOutParameter(23, OracleTypes.VARCHAR);
            cs.registerOutParameter(24, OracleTypes.VARCHAR);
            cs.registerOutParameter(25, OracleTypes.VARCHAR);
            cs.registerOutParameter(26, OracleTypes.VARCHAR);
            cs.registerOutParameter(27, OracleTypes.VARCHAR);
            cs.registerOutParameter(28, OracleTypes.DATE);

            cs.execute();

            String companyCountryCode = DbUtil.formatString(cs.getString(25));
            String state = null;
            String province = null;
            String stateOrProvince = DbUtil.formatString(cs.getString(23));
            if ("US".equals(companyCountryCode) || "CA".equals(companyCountryCode)) {
                state = stateOrProvince;
            } else {
                province = stateOrProvince;
            }

            UserCompany adminUserCompany = new UserCompany(DbUtil.formatString(cs.getString(18)), companyCountryCode,
                    state, province, DbUtil.formatString(cs.getString(22)), DbUtil.formatString(cs.getString(19)),
                    DbUtil.formatString(cs.getString(20)), DbUtil.formatString(cs.getString(21)),
                    DbUtil.formatString(cs.getString(26)), DbUtil.formatString(cs.getString(27)),
                    DbUtil.formatString(cs.getString(24)),companyCountryCode);

            user = new User(String.valueOf(ADMIN_USER_REC_ID), ADMIN_USERNAME, ADMIN_USERNAME, ADMIN_USERNAME, ADMIN_USERNAME, null,
                    null, null, null, null, null, null, null, null, DbUtil.formatString(cs.getString(8)), null,
                    adminUserCompany, true, true, null);
        } catch (SQLException e) {
            logger.error("Error getting Admin user: ", e);
            //throw new InciException();
            throw new RuntimeException(e);
        } finally {
            DbConnectionManager.freeResources(conn, cs, null);
        }

        logger.debug("Leaving getAdminUser()");
        return user;
    }
}
