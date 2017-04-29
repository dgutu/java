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
public class ApplicationProcessingErrorWindow extends AbstractErrorWindow {

    private static Logger logger = LoggerFactory.getLogger(ApplicationProcessingErrorWindow.class);
    private String errorMessage = null;

    public ApplicationProcessingErrorWindow(String appUrl) {
        super(appUrl);
    }

    public ApplicationProcessingErrorWindow(String appUrl, String error) {
        super(appUrl);
        this.errorMessage = error;
    }

    @Override
    protected void init() {
        logger.debug("Initializing ApplicationProcessingErrorWindow");

        setCaption(CaptionResolver.getCaption("appProcessingError.caption"));
        setModal(true);
        setResizable(false);
        //setClosable(false);
        setClosable(true);
        
        addStyleName("inci-sub-window");

        VerticalLayout layout = new VerticalLayout();
        layout.setMargin(true);
        layout.setSizeUndefined();

        //layout.addComponent(new Label(CaptionResolver.getCaption("appProcessingError.info1") + "\"" + appUrl + "\""
        //        + CaptionResolver.getCaption("appProcessingError.info2"), Label.CONTENT_XHTML));
        
        Label label = new Label(this.errorMessage + "\"" + appUrl + "\"", Label.CONTENT_XHTML);
        
        layout.addComponent(label);


        setContent(layout);

        logger.debug("Initializing ApplicationProcessingErrorWindow finished");
    }
}
