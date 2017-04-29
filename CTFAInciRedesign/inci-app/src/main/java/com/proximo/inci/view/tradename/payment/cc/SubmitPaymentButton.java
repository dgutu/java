/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.payment.cc;

import com.proximo.inci.component.AbstractInciComponent;
import com.proximo.inci.component.util.ComponentUtil;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

@SuppressWarnings("serial")
public class SubmitPaymentButton extends AbstractInciComponent<Button> {

    protected PaymentByCCView parentView;

    public SubmitPaymentButton(PaymentByCCView parentView) {
        this.parentView = parentView;

        build();
    }

    @Override
    protected Button createMainComponentInstance() {
        return ComponentUtil.createActionButton("submit", new ClickListener() {
            @Override
            public void buttonClick(ClickEvent event) {
                parentView.submitPayment();
            }
        });
    }

    @Override
    protected void init() {
    }
    
    /*@Override
    public void generateContent() {
        super.generateContent();
        
        DOTradeName parentForm = parentView.getFormTn();        
        DOTradeName formTn = TradeNameService.getTradeName(parentForm.recID, parentView.getCurrentSecurityInfo().getUser().getLoginId());
        
        if (formTn.submitted) { 
        	setEnabled(false);
        }
        else {
        	setEnabled(true);
        }
    } */   

}
