/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.window.subwindow;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.window.main.MainWindow;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;

@SuppressWarnings("serial")
public abstract class SubWindow extends Window {

    private static Logger logger = LoggerFactory.getLogger(SubWindow.class);

    protected MainWindow mainWindow;

    public SubWindow(MainWindow mainWindow) {
        this.mainWindow = mainWindow;

        setCaption(CaptionResolver.getCaption(getCaptionKey()));

        init();

        addContent();
    }

    protected abstract String getCaptionKey();

    protected void init() {
        logger.debug("Initializing subwindow {}", getClass());

        addStyleName("inci-sub-window");

        VerticalLayout layout = (VerticalLayout) getContent();
        layout.setMargin(true);

        logger.debug("Finished Initializing subwindow {}", getClass());
    }

    protected abstract void addContent();

    protected abstract String getWindowWidth();

    protected abstract String getWindowHeight();

    /**
     * Handles parameters passed for a sub window on its show(..).
     * 
     * Override in subclasses if needed.
     */
    protected void handleParams(Map<String, Object> parameters) {
    }

    /** Override if some additional logic on subwindow show is needed. */
    protected void afterShow() {
    }

    public void show(Map<String, Object> parameters) {
        handleParams(parameters);

        scrollIntoView(getContent().getComponentIterator().next());
        setWidth(getWindowWidth());
        setHeight(getWindowHeight());
        center();

        afterShow();
    }

}
