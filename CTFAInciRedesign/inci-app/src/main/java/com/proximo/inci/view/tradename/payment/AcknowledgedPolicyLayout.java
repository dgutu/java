/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.payment;

import com.proximo.inci.component.AbstractInciComponentLayout;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.VerticalLayout;

public class AcknowledgedPolicyLayout extends AbstractInciComponentLayout<VerticalLayout> {
    
    private PaymentView parentView;

    private AcknowledgedPolicy acknowledgedPolicy;

    public AcknowledgedPolicyLayout(PaymentView parentView) {
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

        mainComponent.addStyleName("grayBackgroundColor");
        mainComponent.addStyleName("roundedCorners");
        
        mainComponent.setWidth("650px");

        acknowledgedPolicy = new AcknowledgedPolicy(this);
    }

    @Override
    protected void addContent() {
        addComponent(acknowledgedPolicy, Alignment.MIDDLE_CENTER);
    }

    public AcknowledgedPolicy getAcknowledgedPolicy() {
        return acknowledgedPolicy;
    }

    public PaymentView getParentView() {
        return parentView;
    }
}
