/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.payment.cc;

import com.proximo.inci.component.AbstractInciComponentLayout;
import com.vaadin.ui.HorizontalLayout;

public class ActionButtonsLayout extends AbstractInciComponentLayout<HorizontalLayout> {

    protected PaymentByCCView parentView;

    private SubmitPaymentButton submitPaymentButton;
    private ChangePaymentButton changePaymentButton;

    public ActionButtonsLayout(PaymentByCCView parentView) {
        this.parentView = parentView;

        build();
    }

    @Override
    protected HorizontalLayout createMainComponentInstance() {
        return new HorizontalLayout();
    }

    @Override
    protected void init() {
        mainComponent.setSpacing(true);

        submitPaymentButton = new SubmitPaymentButton(parentView);
        changePaymentButton = new ChangePaymentButton(parentView);
    }

    @Override
    protected void addContent() {
        addComponent(submitPaymentButton);
        addComponent(changePaymentButton);
    }

}
