/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.window.subwindow;

import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.window.main.MainWindow;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
public class LoginFailedWindow extends InformationWindow {

    private static String CAPTION_KEY = "loginFailedWindow.caption";

    private static final String WIDTH = "380px";
    private static final String HEIGHT = "190px";

    public LoginFailedWindow(MainWindow mainWindow) {
        super(mainWindow);
    }

    @Override
    protected void addInformation() {
        VerticalLayout layout = (VerticalLayout) getContent();

        layout.addComponent(new Label(CaptionResolver.getCaption("loginFailedWindow.info"), Label.CONTENT_XHTML));
    }

    @Override
    protected String getCaptionKey() {
        return CAPTION_KEY;
    }

    @Override
    protected String getWindowWidth() {
        return WIDTH;
    }

    @Override
    protected String getWindowHeight() {
        return HEIGHT;
    }

}
