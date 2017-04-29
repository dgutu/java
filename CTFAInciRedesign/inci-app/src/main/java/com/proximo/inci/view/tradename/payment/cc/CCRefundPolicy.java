/** Copyright 2013 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.payment.cc;

import com.proximo.inci.component.AbstractInciComponentLayout;
import com.proximo.inci.service.tradename.TradeNameService;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

public class CCRefundPolicy extends AbstractInciComponentLayout<VerticalLayout>{
	
	public CCRefundPolicy() {
		build();
    }

	@Override
	protected VerticalLayout createMainComponentInstance() {
		return new VerticalLayout();
	}

	@Override
	protected void init() {
		mainComponent.setWidth("350px");
	}
	
    @Override
    public void generateContent() {
    	String str = "<b><u>Refund Policy</u></b><br><br>" + TradeNameService.getCMSText("PaymentTextRefundPolicy");
    	mainComponent.removeAllComponents();
    	mainComponent.addComponent(new Label("<div class=\"very-small-text\">" + str + "</div>", Label.CONTENT_XHTML));
    }	
}
