/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.payment.option;

import com.proximo.inci.component.AbstractInciComponentLayout;
import com.proximo.inci.component.common.JavaScriptPrintButton;
import com.vaadin.ui.HorizontalLayout;

public class ActionButtonsLayout extends AbstractInciComponentLayout<HorizontalLayout> {

    private PaymentOptionLayout parentLayout;

    private SubmitPaymentButton submitPaymentButton;
    private ChangePaymentButton changePaymentButton;
    private JavaScriptPrintButton printButton;

    public ActionButtonsLayout(PaymentOptionLayout parentLayout) {
        this.parentLayout = parentLayout;

        build();
    }

    @Override
    protected HorizontalLayout createMainComponentInstance() {
        return new HorizontalLayout();
    }

    @Override
    protected void init() {
        mainComponent.setSpacing(true);

        AbstractPaymentOptionView parentView = parentLayout.getParentView();
        submitPaymentButton = new SubmitPaymentButton(parentView);
        changePaymentButton = new ChangePaymentButton(parentView);

        printButton = new JavaScriptPrintButton(parentLayout.getParentView());
    }

    @Override
    protected void addContent() {
        addComponent(submitPaymentButton);
        addComponent(changePaymentButton);
        addComponent(printButton);
    }

    public PaymentOptionLayout getParentLayout() {
        return parentLayout;
    }
}
