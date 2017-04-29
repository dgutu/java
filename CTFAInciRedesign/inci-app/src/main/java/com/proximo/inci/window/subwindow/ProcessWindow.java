/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.window.subwindow;

import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.window.main.MainWindow;
import com.vaadin.terminal.ThemeResource;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Embedded;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
public class ProcessWindow extends SubWindow {

    private static final String CAPTION_KEY = "processWindow.caption";

    private static final String WIDTH = "950px";
    private static final String HEIGHT = "600px";

    public ProcessWindow(MainWindow mainWindow) {
        super(mainWindow);
    }

    @Override
    protected void init() {
        super.init();

        //setResizable(false);
        
        VerticalLayout layout = (VerticalLayout) getContent();
        layout.setSpacing(true);
        layout.setSizeUndefined();
    }

    @Override
    protected void addContent() {
        VerticalLayout layout = (VerticalLayout) getContent();

        // needed to provide better look for navigation to the top of this window 
        layout.addComponent(new Label(""));

        Button closeBtnTop = new Button(CaptionResolver.getCaption("close"), new Button.ClickListener() {
            public void buttonClick(ClickEvent event) {
                mainWindow.removeWindow(getWindow());
            }
        });
        layout.addComponent(closeBtnTop);
        layout.setComponentAlignment(closeBtnTop, Alignment.TOP_CENTER);

        Embedded processPic = new Embedded(null, new ThemeResource("images/ctfa-process.jpg"));
        processPic.setWidth("960px");
        processPic.setHeight("720px");        
        layout.addComponent(processPic);
        layout.setComponentAlignment(processPic, Alignment.MIDDLE_CENTER);

        Button closeBtnBottom = new Button(CaptionResolver.getCaption("close"), new Button.ClickListener() {
            public void buttonClick(ClickEvent event) {
                mainWindow.removeWindow(getWindow());
            }
        });
        layout.addComponent(closeBtnBottom);
        layout.setComponentAlignment(closeBtnBottom, Alignment.BOTTOM_CENTER);
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
