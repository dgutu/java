/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.payment;

import com.proximo.inci.component.AbstractInciComponent;
import com.proximo.inci.component.util.ComponentUtil;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

@SuppressWarnings("serial")
public class ContinueButton extends AbstractInciComponent<Button> {

    private PaymentView parentView;

    public ContinueButton(PaymentView parentView) {
        this.parentView = parentView;

        build();
    }

    @Override
    protected Button createMainComponentInstance() {
        return ComponentUtil.createActionButton("continue", new ClickListener() {
            @Override
            public void buttonClick(ClickEvent event) {
                parentView.paymentOptionSelected();
            }
        });
    }

    @Override
    protected void init() {
    }

    @Override
    public void generateContent() {
        setEnabled(false);
    }
}
