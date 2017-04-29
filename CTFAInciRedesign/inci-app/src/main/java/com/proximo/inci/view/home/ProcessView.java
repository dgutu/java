/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.home;

import com.proximo.inci.component.util.ComponentUtil;
import com.proximo.inci.view.BaseView;
import com.proximo.inci.view.ViewKey;
import com.proximo.inci.window.main.MainWindow;
import com.vaadin.terminal.ThemeResource;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Embedded;

@SuppressWarnings("serial")
public class ProcessView extends BaseView {
    
    public ProcessView(MainWindow mainWindow) {
        super(mainWindow, false, null);
    }

    @Override
    protected void addContent() {
        super.addContent();
        
        Button continueButtonTop = ComponentUtil.createActionButton("continue", new Button.ClickListener() {
            @Override
            public void buttonClick(ClickEvent event) {
                navigateTo(ViewKey.HOME_INTRODUCTION.toString());
            }
        });
        // TODO (LOW) refactor into component
        mainComponent.addComponent(continueButtonTop);
        mainComponent.setComponentAlignment(continueButtonTop, Alignment.MIDDLE_CENTER);
        
        // process picture
        Embedded processPic = new Embedded(null, new ThemeResource("images/ctfa-process.jpg"));        
        processPic.setWidth("960px");
        processPic.setHeight("720px");        
        // TODO (LOW) refactor into component
        mainComponent.addComponent(processPic);
        mainComponent.setComponentAlignment(processPic, Alignment.MIDDLE_CENTER);
        
        Button continueButtonBottom = ComponentUtil.createActionButton("continue", new Button.ClickListener() {
            @Override
            public void buttonClick(ClickEvent event) {
                navigateTo(ViewKey.HOME_INTRODUCTION.toString());
            }
        });
        // TODO (LOW) refactor into component
        mainComponent.addComponent(continueButtonBottom);
        mainComponent.setComponentAlignment(continueButtonBottom, Alignment.MIDDLE_CENTER);
    }

}
