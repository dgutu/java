/** Copyright 2013 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.home;

import java.util.Map;

import com.proximo.inci.component.util.ComponentUtil;
import com.proximo.inci.service.tradename.TradeNameService;
import com.proximo.inci.view.BaseView;
import com.proximo.inci.window.main.MainWindow;
import com.vaadin.ui.VerticalLayout;

public class PrivacyPolicyView extends BaseView {

	public PrivacyPolicyView(MainWindow mainWindow) {
		super(mainWindow, false, null);
	}

    @Override
    protected void addContent() {
        super.addContent();
    }	
    
    @Override
    public void generateContent() {
        mainComponent.removeAllComponents();
        
        VerticalLayout vl = new VerticalLayout();        
        String privacyPolicy = TradeNameService.getPrivacyPolicy();        
        ComponentUtil.addHtml(privacyPolicy, vl);
        vl.setSizeFull();
        
        mainComponent.addComponent(vl);
    }
    
    public void applyNavigationParameters(Map<String, Object> navigationParameterMap) {
    	generateContent();
    }    
}
