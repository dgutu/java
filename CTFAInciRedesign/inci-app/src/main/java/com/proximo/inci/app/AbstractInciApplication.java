/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.app;

import java.util.HashMap;
import java.util.Map;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proximo.inci.service.security.SecurityService;
import com.proximo.inci.window.error.ApplicationInitErrorWindow;
//import com.proximo.inci.window.error.ApplicationProcessingErrorWindow;
import com.proximo.inci.window.main.AbstractMainWindow;
import com.vaadin.Application;
//import com.vaadin.Application.SystemMessages;
import com.vaadin.terminal.ExternalResource;
import com.vaadin.ui.Window;
import com.vaadin.ui.Window.Notification;

@SuppressWarnings("serial")
public abstract class AbstractInciApplication extends Application {

    private static final Logger logger = LoggerFactory.getLogger(AbstractInciApplication.class);

    /** Properties set for INCI Web application in JNDI context. */
    protected Map<String, Object> applicationProperties;

    protected AbstractMainWindow mainWindow;
    
    /**
     * Tells, whether in init() method to use successful logon information from another site
     * which is, as well as our site, also included in the Single-Sign-On pool.
     */
    protected boolean useLogonFromAnotherSSOSiteOnInit = false;
    /**
     * Defines current logged on user session, when this session was initialized
     * in some other SSO-site. Using this parameter's value it is possible to
     * get the information about current user's session.
     */
    protected String sso_cst_key = null;

    @Override
    public void init() {
        logger.info("Application initialization started");

        // Add New Microsoft Office MIME Type File Extension mappings
		com.vaadin.service.FileTypeResolver.addExtension("docm","application/vnd.ms-word.document.macroEnabled.12");
		com.vaadin.service.FileTypeResolver.addExtension("docx","application/vnd.openxmlformats-officedocument.wordprocessingml.document");
		com.vaadin.service.FileTypeResolver.addExtension("dotx","application/vnd.openxmlformats-officedocument.wordprocessingml.template");
		com.vaadin.service.FileTypeResolver.addExtension("potm","application/vnd.ms-powerpoint.template.macroEnabled.12");
		com.vaadin.service.FileTypeResolver.addExtension("potx","application/vnd.openxmlformats-officedocument.presentationml.template");
		com.vaadin.service.FileTypeResolver.addExtension("ppam","application/vnd.ms-powerpoint.addin.macroEnabled.12");
		com.vaadin.service.FileTypeResolver.addExtension("ppsm","application/vnd.ms-powerpoint.slideshow.macroEnabled.12");
		com.vaadin.service.FileTypeResolver.addExtension("ppsx","application/vnd.openxmlformats-officedocument.presentationml.slideshow");
		com.vaadin.service.FileTypeResolver.addExtension("pptm","application/vnd.ms-powerpoint.presentation.macroEnabled.12");
		com.vaadin.service.FileTypeResolver.addExtension("pptx","application/vnd.openxmlformats-officedocument.presentationml.presentation");
		com.vaadin.service.FileTypeResolver.addExtension("xlam","application/vnd.ms-excel.addin.macroEnabled.12");
		com.vaadin.service.FileTypeResolver.addExtension("xlab","application/vnd.ms-excel.sheet.binary.macroEnabled.12");
		com.vaadin.service.FileTypeResolver.addExtension("xlsm","application/vnd.ms-excel.sheet.macroEnabled.12");
		com.vaadin.service.FileTypeResolver.addExtension("xlsx","application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
		com.vaadin.service.FileTypeResolver.addExtension("xltm","application/vnd.ms-excel.template.macroEnabled.12");
		com.vaadin.service.FileTypeResolver.addExtension("xltx","application/vnd.openxmlformats-officedocument.spreadsheetml.template");
	
        try {
            initApplicationProperties();

            // custom theme
            setTheme(getApplicationTheme());

            // main window
            mainWindow = createMainAppWindow();
            setMainWindow(mainWindow);

            if (useLogonFromAnotherSSOSiteOnInit) {
                logonBySSO();
            }            
            
            logger.info("Application initialization finished");
        } catch (Throwable t) {
            logger.error("Application initialization error: ", t);
            setMainWindow(new ApplicationInitErrorWindow(getURL().toString()));
        }
    }

    protected abstract String[] getApplicationPropertiesNames();

    protected abstract Class<?>[] getApplicationPropertiesClasses();

    protected abstract String getApplicationTheme();

    protected abstract AbstractMainWindow createMainAppWindow();
    
    /**
     * If init wasn't called, the mainWindow is null, and we need first to
     * initialize the mainWindow, and only then we can call the
     * mainWindow.logon().
     */
    protected void logonBySSODependingOnAlreadyCalledInit() {
        if (mainWindow == null) {
            useLogonFromAnotherSSOSiteOnInit = true;
        } else {
            logonBySSO();
        }        
    }    
    
    protected void logonBySSO() {
        mainWindow.logon(SecurityService.retrieveSecurityInfoByCstKey(sso_cst_key));
    }
    
    protected boolean isLoggedOn() {
        boolean loggedOn = false;
        
        if (mainWindow != null) {
            loggedOn = mainWindow.isLoggedOn(); 
        }
        
        return loggedOn;
    }    

    private void initApplicationProperties() throws NamingException {
        logger.info("Application properties initialization started");

        applicationProperties = new HashMap<String, Object>();

        Context ctx = new InitialContext();

        String[] applicationPropertiesNames = getApplicationPropertiesNames();
        Class<?>[] applicationPropertiesClasses = getApplicationPropertiesClasses();
        for (int i = 0; i < applicationPropertiesNames.length; i++) {
            String appPropName = applicationPropertiesNames[i];
            Object appPropValue = ctx.lookup("java:comp/env/" + appPropName);
            if (applicationPropertiesClasses[i].isInstance(appPropValue)) {
                applicationProperties.put(appPropName, appPropValue);
            } else {
                throw new IllegalArgumentException("Unable to initialize web application properties");
            }
        }

        logger.info("Application properties initialization finished");
    }

    protected String getThemePagesUrl() {
        return getURL().toString() + "VAADIN/themes/" + getApplicationTheme() + "/";
    }
    
    protected String getApplicationUrl() {
    	return getURL().toString();
    }
    
    @Override
    public Window getWindow(String name) {
    	// If the window is identified by name, we are good to go
        Window w = super.getWindow(name);

        // If not, we must create a new window for this new browser window/tab
        if (w == null) {
        	try {
        		w = createMainAppWindow();
        		
        		// Use the random name given by the framework to identify this
    			// window in future        		
        		w.setName(name);
    			addWindow(w);
    			
    			// Move to the url to remember the name in the future
    			w.open(new ExternalResource(w.getURL()));
        	}
        	catch(Exception ex) {
        		logger.error(ex.getMessage());
        	}        	
        }

        return w;
    }

    /**
     * Handling of application (while working with application) errors.
     */
    @Override
    public void terminalError(com.vaadin.terminal.Terminal.ErrorEvent event) {
    	super.terminalError(event);
    	
    	if (getMainWindow() != null) {
    		logger.error("Application error:", event.getThrowable());
    		getMainWindow().showNotification("An unchecked exception occured!",
                    						 event.getThrowable().toString(),
                    						 Notification.TYPE_ERROR_MESSAGE);
    	}
    }
}
