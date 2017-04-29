/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proximo.inci.service.security.SecurityInfo;
import com.vaadin.ui.Component;

public abstract class AbstractInciComponent<C extends Component> {
    
    @SuppressWarnings("unused")
	private static Logger logger = LoggerFactory.getLogger(AbstractInciComponent.class);

    protected C mainComponent;
    
    /** Indicates whether a component is accessible only for admin user. */
    protected boolean adminComponent = false;
    
    protected boolean visible = true;

    /** Must be called in a subclass. */
    protected void build() {
        //logger.debug("Building {}", getClass());
        
        //logger.debug("Creating main component instance for {}", getClass());
        mainComponent = createMainComponentInstance();
        //logger.debug("Creating main component instance for {} finished", getClass());        

        //logger.debug("Initializing {}", getClass());
        init();
        //logger.debug("Initializing {} finished", getClass());
        
        //logger.debug("Building {} finished", getClass());
    }
    
    protected abstract C createMainComponentInstance();

    /** Initializes mainComponent. */
    protected abstract void init();

    public C getMainComponent() {
        return mainComponent;
    }

    public void setVisible(boolean visible) {
    	//logger.debug("################################");
    	//logger.debug("Apply Visibility for "+getClass());
        mainComponent.setVisible(visible);
        this.visible = visible;
        //logger.debug("value="+this.visible);
        //logger.debug("################################");
    }
    
    public void setEnabled(boolean enabled) {
        mainComponent.setEnabled(enabled);
    }
    
    public void setReadOnly(boolean readOnly) {
    	mainComponent.setReadOnly(readOnly);
    }
    
    public void applySecurityInfo(SecurityInfo securityInfo) {
        //logger.debug("Applying security info for {}", getClass());
        
        if(adminComponent && !securityInfo.getUser().isAdmin()) {
            mainComponent.setVisible(false);
        } else {
            mainComponent.setVisible(true);
        }
        
        //logger.debug("Applying security info for {} finished", getClass());
    }
    
    public void generateContent() {
    }
    
    /**
     * Returned null means "valid", otherwise - "invalid" and returned string is
     * a message telling what is actually wrong
     */
    public String validate() {
        return null;
    }

    public void setAdminComponent(boolean adminComponent) {
        this.adminComponent = adminComponent;
    }
    
    /* check if component is visible */
    public boolean isVisibile() {
    	return this.visible;
    }
}
