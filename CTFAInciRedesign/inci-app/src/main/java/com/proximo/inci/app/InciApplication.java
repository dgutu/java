/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.app;

//import java.net.URL;

//import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.service.security.SecurityService;
import com.proximo.inci.view.ViewKey;
import com.proximo.inci.window.main.AbstractMainWindow;
import com.proximo.inci.window.main.MainWindow;
//import com.vaadin.Application.CustomizedSystemMessages;
//import com.vaadin.Application.SystemMessages;
import com.vaadin.terminal.gwt.server.HttpServletRequestListener;

/**
 * The INCI Application's "main" class
 */
@SuppressWarnings("serial")
public class InciApplication extends AbstractInciApplication implements HttpServletRequestListener {
    
    @SuppressWarnings("unused")
	private static final Logger logger = LoggerFactory.getLogger(InciApplication.class);

    private static final String APPLICATION_THEME = "inci-app-theme";
    
    private String username;
    
    private HttpServletResponse response;
    private HttpServletRequest request;

    @Override
    protected String[] getApplicationPropertiesNames() {
        return new String[] { "applicationVersion", "tnPaymentAmount", "tnAchPaymentAmount" };
    }

    @Override
    protected Class<?>[] getApplicationPropertiesClasses() {
        return new Class<?>[] { String.class, Integer.class, Integer.class };
    }

    @Override
    protected String getApplicationTheme() {
        return APPLICATION_THEME;
    }

    @Override
    protected AbstractMainWindow createMainAppWindow() {
        return new MainWindow(CaptionResolver.getCaption("app.caption"), getThemePagesUrl(), applicationProperties, ViewKey.SCR_LOGON, response, request);
    }

    @Override
    public void onRequestStart(HttpServletRequest request, HttpServletResponse response) {
    	
        /*Cookie[] cookies = request.getCookies();
        for (int i=0; cookies != null && i<cookies.length; i++) {
        	logger.debug("onRequestStart.cookies[i].getName()="+cookies[i].getName());
            if ("username".equals(cookies[i].getName()))
                this.username = cookies[i].getValue();       
        }*/
        
        this.response = response;
        this.request = request;        
        
        processSingleSignOn(request, response);        
    }

    private void processSingleSignOn(HttpServletRequest request, HttpServletResponse response) {
        String cst_key = request.getParameter("cst_key");
        // TODO remove this logging
        //logger.debug("Received request parameter cst_key=" + cst_key);

        String loginStatus = request.getParameter("loginStatus");
        // TODO remove this logging
        //logger.debug("Received request parameter loginStatus=" + loginStatus);

        if (cst_key != null && loginStatus == null) {
            /* FIXME It is very probable that cst_key does not identifies a user's SSO session */
            if (SecurityService.isCstKeyValid(cst_key)) {
                sso_cst_key = cst_key;
                logonBySSODependingOnAlreadyCalledInit();
            }
        } else {
            /*
             * Will check sites 1. webdictionary and 2. onlinepersonalcare ,
             * whether in current's browser's window stored session there is
             * successful logon information.
             */

            if (loginStatus != null) {
                if (!("fail".equals(loginStatus))) {
                    // TODO how to get cst_key??? (sso_cst_key = ?;)
                    logonBySSODependingOnAlreadyCalledInit();
                } else {
                    // TODO check onlinepersonalcare site for logged on user
                    // pageName = request.getRequestURL() 
                }
            } else if (!isLoggedOn()) {
                // TODO check webdictionary site for logged on user
            }
        }
    }
    
    @Override
    public void onRequestEnd(HttpServletRequest request, HttpServletResponse response) {
    }    
    
    public String getUsername() {
		return username;    	
    }
    
    public HttpServletResponse getResponse() {
    	return response;
    }
    
    public HttpServletRequest getRequest() {
    	return request;
    }
    
    
    // Override the default implementation
    /*public static SystemMessages getSystemMessages() {
    	CustomizedSystemMessages messages = new CustomizedSystemMessages();
        messages.setSessionExpiredNotificationEnabled(true);
        messages.setCommunicationErrorNotificationEnabled(true);
        messages.setOutOfSyncNotificationEnabled(true);
        messages.setSessionExpiredURL(CaptionResolver.getCaption("application.url"));
        messages.setCommunicationErrorURL(CaptionResolver.getCaption("application.url"));
        messages.setOutOfSyncURL(CaptionResolver.getCaption("application.url"));
        
        return messages;
    }*/
}
