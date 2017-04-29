/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.service.common;

import java.sql.SQLException;

import javax.mail.MessagingException;
import javax.naming.NamingException;

import com.proximo.inci.AbstractServiceTest;
import com.proximo.inci.jndi.InitialContextFactoryForTest;

public class EmailServiceTest {

    private static final String SMTP_HOST = "64.90.169.80";
    private static final String USER_NAME = "donotreply@proximolistmanager.com";
    private static final String PASSWORD = "qp56xn";

    public static void main(String[] args) throws SQLException, NamingException {
        @SuppressWarnings("unused")
        AbstractServiceTest test = new AbstractServiceTest(false) {
            @Override
            protected void initMockJndiContext() {
                InitialContextFactoryForTest.bind(EmailService.JNDI_EMAIL_SEND_SMTP_HOST, SMTP_HOST);
                InitialContextFactoryForTest.bind(EmailService.JNDI_EMAIL_SEND_USERNAME, USER_NAME);
                InitialContextFactoryForTest.bind(EmailService.JNDI_EMAIL_SEND_PASSWORD, PASSWORD);
            }

            @Override
            public void runTest() {
                try {
                    EmailService.sendHtml("dgutu@proximo.com", "dgutu@proximo.com",
                            "Testing Proximo Smtp", "<h1>TEST</h1>");
                } catch (MessagingException e) {
                    throw new IllegalStateException(e);
                }
            }
        };
    }
}
