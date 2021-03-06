/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.payment;

import com.proximo.inci.component.AbstractInciComponentLayout;
import com.vaadin.ui.HorizontalLayout;

public class ActionButtonsLayout extends AbstractInciComponentLayout<HorizontalLayout> {

    private PaymentOptionsLayout parentLayout;

    private ContinueButton continueButton;
    private CancelButton cancelButton;

    public ActionButtonsLayout(PaymentOptionsLayout parentLayout) {
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
        
        continueButton = new ContinueButton(parentLayout.getParentView());
        cancelButton = new CancelButton(parentLayout.getParentView());
    }

    @Override
    protected void addContent() {
        addComponent(continueButton);
        addComponent(cancelButton);
    }

    public ContinueButton getContinueButton() {
        return continueButton;
    }

    public PaymentOptionsLayout getParentLayout() {
        return parentLayout;
    }
}
