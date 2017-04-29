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
public class LoadingWindow extends SubWindow {

    private static final String CAPTION_KEY = "loading_window.caption";

    private static final String WIDTH = "380px";
    private static final String HEIGHT = "150px";

    public LoadingWindow(MainWindow mainWindow) {
        super(mainWindow);
    }

    @Override
    protected void init() {
        super.init();

        setModal(true);
        setResizable(false);
        setClosable(false);

        VerticalLayout contentLayout = (VerticalLayout) getContent();
        contentLayout.setSizeFull();
    }

    @Override
    protected void addContent() {
        VerticalLayout layout = (VerticalLayout) getContent();

        layout.addComponent(new Label(CaptionResolver.getCaption("loading_window.info_msg"), Label.CONTENT_XHTML));
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
