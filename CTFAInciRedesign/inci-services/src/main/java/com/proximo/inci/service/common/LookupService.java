/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.service.common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proximo.inci.DOList;
import com.proximo.inci.DOLookupValue;
import com.proximo.inci.DbConnectionManager;
import com.proximo.inci.DbUtil;
import com.proximo.inci.common.TemplarUtil;

public class LookupService {

    private static Logger logger = LoggerFactory.getLogger(LookupService.class);

    // sorts for lookup value methods
    public final static int LV_SORT_ID = 0;
    public final static int LV_SORT_VALUE = 1;
    public final static int LV_SORT_DESC = 2;

    /* Lookup keys. */
    public final static int FORM_TN_CAT_KEY = 101;
    public final static int FORM_TN_SUB_CAT_KEY = 108;
    public final static int FORM_TN_FUNC_KEY = 102;
    public final static int FORM_TN_CHEM_STRUCT_QUESTION_KEY = 109;
    public final static int FORM_TN_SUBMISSION_STATUS_KEY = 110;
    public final static int FORM_TN_EXPORT_STATUS_KEY = 111;

    public final static int CREDIT_CARD_KEY = 112;
    public final static int MONTH_KEY = 113;
    public final static int COUNTRY_KEY = 5;

    private static DOList formTnCategories = new DOList();
    private static DOList formTnSubCategories = new DOList();
    private static DOList formTnFunctions = new DOList();
    private static DOList formTnChemStructQuestionsAnswers = new DOList();
    private static DOList formTnSubmissionStatuses = new DOList();
    private static DOList formTnExportStatuses = new DOList();

    private static DOList creditCardTypes = new DOList();
    private static DOList months = new DOList();
    private static DOList countries = new DOList();
    private static DOList countriesAbbr = new DOList();

    /** Not intended to be instantiated. Exposed only static members. */
    private LookupService() {
    }

    public static void initialize() {
        logger.info("Loading lookup values");

        logger.info("Loading lookup values for form tn categories");
        formTnCategories = getLookupValues(FORM_TN_CAT_KEY, LV_SORT_ID/*, false*/);
        logger.info("Finished loading lookup values for form tn categories");

        logger.info("Loading lookup values for form tn sub categories");
        formTnSubCategories = getLookupValues(FORM_TN_SUB_CAT_KEY, LV_SORT_ID/*, false*/);
        logger.info("Finished loading lookup values for form tn sub categories");

        logger.info("Loading lookup values for form tn functions");
        formTnFunctions = getLookupValues(FORM_TN_FUNC_KEY, LV_SORT_VALUE/*, false*/);
        logger.info("Finished loading lookup values for form tn functions");

        logger.info("Loading lookup values for form chemical structure question answers");
        formTnChemStructQuestionsAnswers = getLookupValues(FORM_TN_CHEM_STRUCT_QUESTION_KEY, LV_SORT_ID/*, false*/);
        logger.info("Finished loading lookup values for form chemical structure question answers");

        logger.info("Loading lookup values for form submission statuses");
        formTnSubmissionStatuses = getLookupValues(FORM_TN_SUBMISSION_STATUS_KEY, LV_SORT_ID/*, false*/);
        logger.info("Finished loading lookup values for form submission statuses");

        logger.info("Loading lookup values for form export statuses");
        formTnExportStatuses = getLookupValues(FORM_TN_EXPORT_STATUS_KEY, LV_SORT_ID/*, false*/);
        logger.info("Finished loading lookup values for form export statuses");

        logger.info("Loading lookup values for credit card types");
        creditCardTypes = getLookupValues(CREDIT_CARD_KEY, LV_SORT_ID/*, false*/);
        logger.info("Finished loading lookup values for credit card types");

        logger.info("Loading lookup values for months");
        months = getLookupValues(MONTH_KEY, LV_SORT_ID/*, false*/);
        logger.info("Finished loading lookup values for months");

        logger.info("Loading lookup values for countries");
        countries = getLookupValues(COUNTRY_KEY, LV_SORT_DESC/*, false*/);
        logger.info("Finished loading lookup values for countries");
        
        logger.info("Loading lookup values for countries");
        countriesAbbr = getLookupValues(COUNTRY_KEY, LV_SORT_ID/*, true*/);
        logger.info("Finished loading lookup values for countries");        

        logger.info("Loading lookup values finished");
    }

    public static DOList getFormTnCategories() {
        return formTnCategories;
    }

    public static DOList getFormTnSubCategories() {
        return formTnSubCategories;
    }

    public static DOList getFormTnFunctions() {
        return formTnFunctions;
    }

    public static DOList getFormTnChemStructQAnswers() {
        return formTnChemStructQuestionsAnswers;
    }

    public static DOList getFormTnSubmissionStatuses() {
        return formTnSubmissionStatuses;
    }

    public static DOList getFormTnExportStatuses() {
        return formTnExportStatuses;
    }

    public static DOList getCreditCardTypes() {
        return creditCardTypes;
    }

    public static DOList getMonths() {
        return months;
    }

    public static DOList getCountries() {
        return countries;
    }
    
    public static DOList getCountriesAbbr() {
    	return countriesAbbr;
    }
    
    public static boolean isCountryUsOrCanada(String countryCode) {
        if (
        	(!TemplarUtil.isStringNullOrEmpty(countryCode)) && 
        	("US".equals(countryCode.toUpperCase()) || "CA".equals(countryCode.toUpperCase()))) {
            return true;
        } else {
            return false;
        }
    }

    private static DOList getLookupValues(int key, int sortType/*, boolean flag*/) {
        logger.debug("Entering getLookupValues(key={}, sortType={})", key, sortType);

        Connection conn = null;
        DOList list = new DOList();
        PreparedStatement stmt = null;
        String query = "";
        ResultSet rs = null;

        try {
            conn = DbConnectionManager.getConnection();
            
            /*if (flag) {
	            query = "select key_id, decode(key_type, 5, upper(key_desc), key_value) as key_value, is_default, key_desc, is_system, sub_key_type, key_cat "
	                    + "from lookup_values " + "where key_type = ?" + " ";
            }
            else {*/
            query = "select key_id, key_value, is_default, key_desc, is_system, sub_key_type, key_cat "
                    + "from lookup_values " + "where key_type = ?" + " ";
            	
            //}

            if (sortType == LV_SORT_ID)
                query += "order by key_id";
            else if (sortType == LV_SORT_VALUE)
                query += "order by upper(key_value)";
            else
                query += "order by upper(key_desc)";

            stmt = conn.prepareStatement(query);
            stmt.setInt(1, key);
            stmt.setMaxRows(0);

            rs = stmt.executeQuery();

            while (rs.next()) {
                DOLookupValue value = new DOLookupValue(rs.getInt(1), rs.getInt(5),
                        DbUtil.formatString(rs.getString(2)), DbUtil.formatString(rs.getString(3)).equals("Y"),
                        DbUtil.formatString(rs.getString(4)), rs.getInt(6), key, DbUtil.formatString(rs.getString(7)));
                list.addElement(value);
            }

        } catch (SQLException e) {
            logger.error("Error getting lookup values: ", e);
            throw new RuntimeException(e);
        } finally {
            DbConnectionManager.freeResources(conn, stmt, rs);
        }

        logger.debug("Leaving getLookupValues(): list.size()=" + list.size());

        return list;
    }

}
