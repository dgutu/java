/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.service.tradename.export;

import java.sql.SQLException;

import javax.naming.NamingException;

import com.proximo.inci.AbstractServiceTest;
import com.proximo.inci.jndi.InitialContextFactoryForTest;
import com.proximo.inci.service.tradename.CsvTradeNameExportService;

public class CsvTradeNameExportServiceTest {

    private static final String EXPORT_FTP_HOST = "eservices.personalcarecouncil.org";
    private static final String EXPORT_FTP_USERNAME = "ctfa2000.org/prox";
    private static final String EXPORT_FTP_PASSWORD = "@services1";
    private static final String EXPORT_FTP_DIRECTORY = "INCIexport";

    public static void main(String[] args) throws SQLException, NamingException {
        testUploadExportResultFile();
    }

    public static void initMockJndi() {
        InitialContextFactoryForTest.bind(CsvTradeNameExportService.JNDI_EXPORT_FTP_HOST, EXPORT_FTP_HOST);
        InitialContextFactoryForTest.bind(CsvTradeNameExportService.JNDI_EXPORT_FTP_USERNAME, EXPORT_FTP_USERNAME);
        InitialContextFactoryForTest.bind(CsvTradeNameExportService.JNDI_EXPORT_FTP_PASSWORD, EXPORT_FTP_PASSWORD);
        InitialContextFactoryForTest.bind(CsvTradeNameExportService.JNDI_EXPORT_FTP_DIRECTORY, EXPORT_FTP_DIRECTORY);
    }

    private static void testUploadExportResultFile() throws SQLException, NamingException {
        @SuppressWarnings("unused")
        AbstractServiceTest test = new AbstractServiceTest(false) {
            @Override
            protected void initMockJndiContext() {
                initMockJndi();
            }

            @Override
            public void runTest() {
                CsvTradeNameExportService.uploadExportResultFile(new byte[] { 123, 126, 125 }, "test.txt");
                System.out.println("SUCCESS!");
            }
        };
    }

}
