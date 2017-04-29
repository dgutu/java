/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.payment;

import com.proximo.inci.component.AbstractInciComponentLayout;
import com.vaadin.ui.VerticalLayout;

public class PaymentOptionsLayout extends AbstractInciComponentLayout<VerticalLayout> {

    private PaymentView parentView;

    private PaymentOptions paymentOptions;
    private ActionButtonsLayout actionButtonsLayout;

    public PaymentOptionsLayout(PaymentView parentView) {
        this.parentView = parentView;

        build();
    }

    @Override
    protected VerticalLayout createMainComponentInstance() {
        return new VerticalLayout();
    }

    @Override
    protected void init() {
        mainComponent.setMargin(true);
        mainComponent.setSpacing(true);

        mainComponent.addStyleName("grayBackgroundColor");
        mainComponent.addStyleName("roundedCorners");

        mainComponent.setWidth("400px");

        paymentOptions = new PaymentOptions(this);
        actionButtonsLayout = new ActionButtonsLayout(this);        
    }

    @Override
    protected void addContent() {
        addComponent(paymentOptions);
        addComponent(actionButtonsLayout);
    }

    public PaymentView getParentView() {
        return parentView;
    }

    public PaymentOptions getPaymentOptions() {
        return paymentOptions;
    }

    public ActionButtonsLayout getActionButtonsLayout() {
        return actionButtonsLayout;
    }

}
