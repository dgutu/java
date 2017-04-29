/** Copyright 2013 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.window.subwindow;

import com.proximo.inci.component.util.ComponentUtil;
import com.proximo.inci.service.tradename.TradeNameService;
//import com.proximo.inci.view.home.intro.IntroductionLayout;
import com.proximo.inci.window.main.MainWindow;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

public class PrivacyPolicyWindow extends SubWindow {

    /**
	 * 
	 */
	private static final long serialVersionUID = -2547706216461356348L;

	private static final String CAPTION_KEY = "privacyPolicyWindow.caption";

    private static final String WIDTH = "950px";
    private static final String HEIGHT = "600px";
	
	
	public PrivacyPolicyWindow(MainWindow mainWindow) {
		super(mainWindow);
	}

    @Override
    protected void addContent() {    	
    	load();
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
    
    private void load() {
    	VerticalLayout vl = new VerticalLayout();        
        String privacyPolicy = TradeNameService.getPrivacyPolicy();        
        ComponentUtil.addHtml(privacyPolicy, vl);
        vl.setSizeFull();    	
    	
        VerticalLayout layout = (VerticalLayout) getContent();
        layout.removeAllComponents();
        layout.setSpacing(true);

        // needed to provide better look for navigation to the top of this window 
        layout.addComponent(new Label(""));
        
        layout.addComponent(vl);
    }
    
    protected void afterShow() {
    	load();
    }    
    
}
