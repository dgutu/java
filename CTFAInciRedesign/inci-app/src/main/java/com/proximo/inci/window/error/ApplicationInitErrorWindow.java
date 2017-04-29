/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.window.error;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proximo.inci.caption.CaptionResolver;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
public class ApplicationInitErrorWindow extends AbstractErrorWindow {

    private static final Logger logger = LoggerFactory.getLogger(ApplicationInitErrorWindow.class);

    public ApplicationInitErrorWindow(String appUrl) {
        super(appUrl);
    }

    @Override
    protected void init() {
        logger.debug("Initializing ApplicationInitErrorWindow");

        VerticalLayout layout = new VerticalLayout();
        layout.setMargin(true);

        layout.addComponent(new Label("<div style=\"font-size:14px\">"
                + CaptionResolver.getCaption("appInitError.info") + "</div><br>"
                + "<br><div style=\"font-size:14px;\"><a href=\" " + appUrl + "\" style=\"color: red;\" >"
                + "To Logon screen</a></div>", Label.CONTENT_XHTML));

        setContent(layout);

        logger.debug("Initializing ApplicationInitErrorWindow finished");
    }

}
