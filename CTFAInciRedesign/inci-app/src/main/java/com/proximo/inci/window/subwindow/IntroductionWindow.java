/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.window.subwindow;

import com.proximo.inci.view.home.intro.IntroductionLayout;
import com.proximo.inci.window.main.MainWindow;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
public class IntroductionWindow extends SubWindow {

    private static final String CAPTION_KEY = "introductionWindow.caption";

    private static final String WIDTH = "950px";
    private static final String HEIGHT = "600px";

    public IntroductionWindow(MainWindow mainWindow) {
        super(mainWindow);
    }

    @Override
    protected void addContent() {
        VerticalLayout layout = (VerticalLayout) getContent();
        layout.setSpacing(true);

        // needed to provide better look for navigation to the top of this window 
        layout.addComponent(new Label(""));
        
        layout.addComponent(new IntroductionLayout(mainWindow));
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
