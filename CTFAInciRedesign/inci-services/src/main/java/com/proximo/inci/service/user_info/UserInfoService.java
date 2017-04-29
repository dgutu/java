/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.service.user_info;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import oracle.jdbc.OracleTypes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proximo.inci.DOList;
import com.proximo.inci.DOUserCC;
import com.proximo.inci.DbConnectionManager;
import com.proximo.inci.DbUtil;
//import com.proximo.inci.exception.InciException;

public class UserInfoService {

    private static Logger logger = LoggerFactory.getLogger(UserInfoService.class);

    /** Not intended to be instantiated. Exposed only static members. */
    private UserInfoService() {
    }
    
    /**
     * Retrieves user's default credit card. 
     */
    public static DOUserCC getUserDefaultCreditCard(String userRecId) {
        DOUserCC defaultCreditCard = null;
        
        DOList userCreditCards = UserInfoService.getUserCreditCards(userRecId);
        for (int i = 0; i < userCreditCards.size(); i++) {
            DOUserCC cc = (DOUserCC) userCreditCards.elementAt(i);
            if (cc.isDefault) {
                defaultCreditCard = cc;
                break;
            }
        }        
        
        return defaultCreditCard;
    }

    /**
     * Retrieves user's credit cards list. If a user has no credit cards, empty
     * list is returned.
     */
    private static DOList getUserCreditCards(String userRecId) {
        logger.debug("Entering getUserCreditCards(userRecId={})", userRecId);
        
        DOList creditCards = new DOList();

        Connection conn = null;
        CallableStatement cs = null;
        ResultSet rs = null;

        try {
            conn = DbConnectionManager.getConnection();

            cs = conn.prepareCall("{? = call trade_name_mgmt.get_user_cc(?, ?)}");

            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.setString(2, userRecId);
            /*
             * COMMENT FROM THE OLD SYSTEM's CODE: SJ 01/16/2007 Although the
             * spec calls for user having only one credit card stored we will
             * retrieve all credit cards. We can always loop through the list in
             * front end to find out the default card.
             * 
             * If only default card needed to be retrieved then pass in "D" in
             * the third parameter.
             */
            cs.setString(3, "A");

            cs.execute();

            rs = (ResultSet) cs.getObject(1);

            while (rs.next()) {
                DOUserCC creditCard = new DOUserCC();

                creditCard.recID = rs.getLong(1);
                creditCard.userRecId = rs.getString(2);
                creditCard.firstName = DbUtil.formatString(rs.getString(3));
                creditCard.lastName = DbUtil.formatString(rs.getString(4));
                creditCard.address1 = DbUtil.formatString(rs.getString(5));
                creditCard.address2 = DbUtil.formatString(rs.getString(6));
                creditCard.address3 = DbUtil.formatString(rs.getString(7));
                creditCard.city = DbUtil.formatString(rs.getString(8));
                creditCard.state = DbUtil.formatString(rs.getString(9));
                creditCard.zip = DbUtil.formatString(rs.getString(10));
                creditCard.countryCode = DbUtil.formatString(rs.getString(11));
                creditCard.ccType = rs.getInt(12);
                creditCard.ccNumber = DbUtil.formatString(rs.getString(13));
                creditCard.ccExpMonth = rs.getInt(14);
                creditCard.ccExpYear = rs.getInt(15);
                creditCard.ccSecurityCode = rs.getString(16);
                creditCard.isDefault = rs.getString(17).equalsIgnoreCase("Y");
                creditCard.phone = rs.getString(18);

                creditCards.addElement(creditCard);
            }
        } catch (SQLException e) {
            logger.error("Error getting user's credit cards: ", e);
            //throw new InciException();
            throw new RuntimeException(e);
        } finally {
            DbConnectionManager.freeResources(conn, cs, rs);
        }

        logger.debug("Leaving getAdminUserSecurityInfo(): creditCards.size()={}", creditCards.size());
        return creditCards;
    }
    
    /**
     * Save Credit Card User Information 
     */
    public static void saveUserCreditCard(DOUserCC creditCard) {
    	logger.debug("Entering UserInfoService.saveUserCreditCard(...)");
    	
        Connection conn = null;        
        CallableStatement cs = null;
        Long rs = null;

        try {
        	// get connection
            conn = DbConnectionManager.getConnection();

            // call oracle SP
            cs = conn.prepareCall("{? = call TRADE_NAME_MGMT.saveusercc(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            
            // set oracle parameters
            cs.registerOutParameter(1, OracleTypes.NUMBER);
            
            // i_payment_method_id
            cs.setLong(2, creditCard.recID);
            
            // i_cst_key
            cs.setString(3, creditCard.userRecId);
            
            // i_firstname
            cs.setString(4, creditCard.firstName);
            
            // i_lastname
            cs.setString(5, creditCard.lastName);

            // i_address1
            cs.setString(6, creditCard.address1);
            
            // i_address2
            cs.setString(7, creditCard.address2);
            
            // i_address3
            cs.setString(8, creditCard.address3);
            
            // i_city
            cs.setString(9, creditCard.city);
            
            // i_state
            cs.setString(10, creditCard.state);
            
            // i_zip
            cs.setString(11, creditCard.zip);

            // i_countrycode
            cs.setString(12, creditCard.countryCode);
            
            // i_cctype
            cs.setLong(13, creditCard.ccType);
            
            // i_ccnumber
            cs.setString(14, creditCard.ccNumber);
            
            // i_ccexpmonth
            cs.setLong(15, creditCard.ccExpMonth);
            
            // i_ccexpyear
            cs.setLong(16, creditCard.ccExpYear);
            
            // i_ccsecuritycode
            cs.setString(17, creditCard.ccSecurityCode);
            
            // i_isdefault
            if (creditCard.isDefault)
            	cs.setString(18, "Y");
            else
            	cs.setString(18, "N");            
            
            // phone
            cs.setString(19, creditCard.phone);

            // execute oracle stored procedure
            cs.execute();

            // get the result
            rs = cs.getLong(1);

	    } catch (SQLException e) {
	        logger.error("Error save (TRADE_NAME_MGMT.saveusercc): ", e);
	        throw new RuntimeException(e);
	    } finally {
	    	// free connection resources
	        DbConnectionManager.freeResources(conn, cs, null);
	    }
    	
    	logger.debug("UserInfoService.saveUserCreditCard(...): {}", rs);
    	
    	//return rs;
    }
}
