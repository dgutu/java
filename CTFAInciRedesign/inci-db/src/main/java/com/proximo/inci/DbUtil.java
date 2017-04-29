/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.proximo.inci.common.TemplarUtil;

/** Db utility methods. */
public class DbUtil {

    /** Not intended to be instantiated. Exposed only static members. */
    private DbUtil() {
    }

    /** Taken from the old system's code (TemplarMagic) */
    // add string manipulation for data retrieved from DB
    // check for nulls; if null, return ""
    // always trim the string
    public static String formatString1(String s) {
        String r;

        if (s == null)
            r = new String("");
        else {
            r = new String(TemplarUtil.convertNonEnglishCharsToEnglish(s.trim()));
        }

        return r;
    }
    
    public static String formatString(String s) {
        String r;

        if (s == null)
            r = "";
        else {
            r = s;
        }

        return r;
    }    

    /** Taken from the old system's code (TemplarMagic) */
    // DR 2/7/98: take a result set and column and return a boolean based on
    // DT_Flag
    public static boolean getFlag(ResultSet rs, int column) throws SQLException {
        return getFlag(rs.getString(column));
    }

    /** Taken from the old system's code (TemplarMagic) */
    public static boolean getFlag(String flag) throws SQLException {
        return flag != null && flag.toUpperCase().equals("Y");
    }

}
