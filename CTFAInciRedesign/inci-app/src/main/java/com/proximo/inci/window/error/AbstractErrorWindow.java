/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.window.error;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vaadin.ui.Window;

@SuppressWarnings("serial")
public abstract class AbstractErrorWindow extends Window {

    private static final Logger logger = LoggerFactory.getLogger(AbstractErrorWindow.class);

    protected String appUrl;

    public AbstractErrorWindow(String appUrl) {
        try {
            /*
             * Such description is set for application to know that it needs to
             * be reinitialized, when this window is shown to a user.
             */
            setDescription("ERROR");

            this.appUrl = appUrl;

            init();
        } catch (Throwable t) {
            logger.error("Could not create a proper Error window (" + this.getClass().getName() + ")", t);
            showNotification("ERROR", Notification.TYPE_ERROR_MESSAGE);
        }
    }

    protected abstract void init();

}
