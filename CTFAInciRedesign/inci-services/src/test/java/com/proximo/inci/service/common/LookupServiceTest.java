/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.service.common;

import java.sql.SQLException;

import javax.naming.NamingException;

import com.proximo.inci.AbstractServiceTest;
import com.proximo.inci.DOList;
import com.proximo.inci.service.common.LookupService;

/**
 * LookupService.getLookupValues(...) test.
 */
public class LookupServiceTest {

    public static void main(String[] args) throws SQLException, NamingException {
        @SuppressWarnings("unused")
        AbstractServiceTest test = new AbstractServiceTest(true) {
            @Override
            public void runTest() {
                LookupService.initialize();
                DOList x = LookupService.getFormTnCategories();
                if (x != null) {
                    System.out.println(x.toString());
                } else {
                    System.out.println("OK. Returned empty list.");
                }
            }
        };
    }
}
