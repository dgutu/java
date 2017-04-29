/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.payment.option;

import com.proximo.inci.component.AbstractInciComponentLayout;
import com.vaadin.ui.VerticalLayout;

public class PaymentOptionLayout extends AbstractInciComponentLayout<VerticalLayout> {

    private AbstractPaymentOptionView parentView;

    private InstructionsText instructionsText;
    private ActionButtonsLayout actionButtonsLayout;

    public PaymentOptionLayout(AbstractPaymentOptionView parentView) {
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

        instructionsText = parentView.createInstructionsText();
        actionButtonsLayout = new ActionButtonsLayout(this);
    }

    @Override
    protected void addContent() {    	
    	addComponent(instructionsText);
        addComponent(actionButtonsLayout);
    }

    public AbstractPaymentOptionView getParentView() {
        return parentView;
    }

    public ActionButtonsLayout getActionButtonsLayout() {
        return actionButtonsLayout;
    }
    
    public InstructionsText getInstructionsText() {
    	return instructionsText;
    }

}
