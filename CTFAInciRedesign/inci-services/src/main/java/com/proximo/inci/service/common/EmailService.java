/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.service.common;

import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;
import javax.mail.internet.MimeMultipart;
import javax.mail.util.ByteArrayDataSource;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proximo.inci.common.TemplarUtil;

//import com.proximo.inci.exception.InciException;

/**
 * Email sending service.
 */
public class EmailService {

    private static Logger logger = LoggerFactory.getLogger(EmailService.class);

    public final static String JNDI_EMAIL_SEND_SMTP_HOST = "java:comp/env/email/send/smtp/host";
    public final static String JNDI_EMAIL_SEND_USERNAME = "java:comp/env/email/send/smtp/username";
    public final static String JNDI_EMAIL_SEND_PASSWORD = "java:comp/env/email/send/smtp/password";

    private static final String smtpHost;
    private static final String userName;
    private static final String password;

    private static Properties emailProperties;

    static {
        logger.info("Initializing Email service");
        try {
            Context ctx = new InitialContext();
            smtpHost = (String) ctx.lookup(JNDI_EMAIL_SEND_SMTP_HOST);
            userName = (String) ctx.lookup(JNDI_EMAIL_SEND_USERNAME);
            password = (String) ctx.lookup(JNDI_EMAIL_SEND_PASSWORD);
        } catch (NamingException e) {
            logger.error("Unable to retrieve Email service's JNDI initialization parameters", e);
            //throw new InciException();
            throw new RuntimeException(e);
        }

        initEmailProperties();

        logger.info("Finished initializing Email service");
    }

    /** Not intended to be instantiated. Exposed only static members. */
    private EmailService() {
    }

    private static void initEmailProperties() {
        emailProperties = new Properties();

        emailProperties.put("mail.smtp.host", smtpHost);
        emailProperties.put("mail.smtp.port", 25);
        emailProperties.put("mail.smtp.auth", "true");
    }

    public static void sendHtml(String from, String to, String subject, String html) throws MessagingException {
        logger.info("Sending email from={}, to={}, subject={}", new Object[] { from, to, subject });
        
        Session session = Session.getDefaultInstance(emailProperties, new ProxMailAuthenticator(userName, password));

        MimeMessage message = new MimeMessage(session);

        message.setFrom(new InternetAddress(from));
        message.addRecipient(RecipientType.TO, new InternetAddress(to));
        //message.addRecipient(RecipientType.CC, new InternetAddress("dgutu@proximo.com"));

        message.setSubject(subject);
        message.setContent(html, "text/html; charset=Cp1252");

        Transport.send(message);
        
        logger.info("Sent email from={}, to={}, subject={}", new Object[] { from, to, subject });
    }
    
    public static void sendHtmlWithCC(String from, String to, String cc1, String cc2, String cc3, String subject, String html) throws MessagingException {
        logger.info("Sending email from={}, to={}, subject={}", new Object[] { from, to, subject });
        
        Session session = Session.getDefaultInstance(emailProperties, new ProxMailAuthenticator(userName, password));

        MimeMessage message = new MimeMessage(session);

        message.setFrom(new InternetAddress(from));
        message.addRecipient(RecipientType.TO, new InternetAddress(to));
        if (!TemplarUtil.isStringNullOrEmpty(cc1))
        	message.addRecipient(RecipientType.CC, new InternetAddress(cc1));
        if (!TemplarUtil.isStringNullOrEmpty(cc2))
        	message.addRecipient(RecipientType.CC, new InternetAddress(cc2));
        if (!TemplarUtil.isStringNullOrEmpty(cc3))
        	message.addRecipient(RecipientType.CC, new InternetAddress(cc3));

        message.setSubject(subject);
        message.setContent(html, "text/html; charset=Cp1252");

        Transport.send(message);
        
        logger.info("Sent email from={}, to={}, subject={}", new Object[] { from, to, subject });
    }
    
    
    public static void sendHtmlAttachement(String from, String to, String subject, String html, byte[] attachment) throws MessagingException {
    	
    	/*logger.debug("EmailService.sendHtmlAttachement");
    	logger.debug("EmailService.sendHtmlAttachement from=" + from);
    	logger.debug("EmailService.sendHtmlAttachement to=" + to);
    	logger.debug("EmailService.sendHtmlAttachement subject=" + subject);
    	logger.debug("EmailService.sendHtmlAttachement html=" + html);*/
    	
    	logger.info("sendHtmlAttachement email from={}, to={}, subject={}", new Object[] { from, to, subject });
    	
    	// create email session
    	Session session = Session.getDefaultInstance(emailProperties, new ProxMailAuthenticator(userName, password));        
    	
        //try {          
            // text body part
            MimeBodyPart textBodyPart = new MimeBodyPart();
            textBodyPart.setContent(html, "text/html; charset=Cp1252");
             
            // pdf body part
            DataSource dataSource = new ByteArrayDataSource(attachment, "application/pdf");
            MimeBodyPart pdfBodyPart = new MimeBodyPart();
            pdfBodyPart.setDataHandler(new DataHandler(dataSource));
            pdfBodyPart.setFileName("attachment.pdf");
                         
            // mime multi part
            MimeMultipart mimeMultipart = new MimeMultipart();
            mimeMultipart.addBodyPart(textBodyPart);
            mimeMultipart.addBodyPart(pdfBodyPart);
             
            // sender/recipient addresses
            InternetAddress iaSender = new InternetAddress(from);
            InternetAddress iaRecipient = new InternetAddress(to);
             
            // mime message
            MimeMessage mimeMessage = new MimeMessage(session);
            mimeMessage.setFrom(new InternetAddress(from));
            mimeMessage.setSender(iaSender);
            mimeMessage.setSubject(subject);
            mimeMessage.setRecipient(Message.RecipientType.TO, iaRecipient);
            mimeMessage.setContent(mimeMultipart);
            //mimeMessage.addRecipient(Message.RecipientType.CC, new InternetAddress("dgutu@proximo.com"));
             
            // send the email
            Transport.send(mimeMessage);
       
        //} catch(Exception ex) {
        //    logger.error("sendHtmlAttachement error: " + ex.getLocalizedMessage());
        //} 
    }

    private static class ProxMailAuthenticator extends Authenticator {
        private PasswordAuthentication passwordAuthentication;

        public ProxMailAuthenticator(String username, String password) {
            passwordAuthentication = new PasswordAuthentication(username, password);
        }

        @Override
        public PasswordAuthentication getPasswordAuthentication() {
            return passwordAuthentication;
        }
    }
}
