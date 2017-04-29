/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.payment.option.thankyou;

import com.proximo.inci.component.AbstractInciComponentLayout;
import com.vaadin.ui.VerticalLayout;

public class ThankYouLayout extends AbstractInciComponentLayout<VerticalLayout> {

    private AbstractPaymentOptionThankYouView parentView;

    private ThankYouText thankYouText;
    private ThankYouButtonsLayout thankYouButtonsLayout;

    public ThankYouLayout(AbstractPaymentOptionThankYouView parentView) {
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

        thankYouText = parentView.createThankYouText();
        thankYouButtonsLayout = new ThankYouButtonsLayout(this);
    }

    @Override
    protected void addContent() {
        addComponent(thankYouText);
        addComponent(thankYouButtonsLayout);
    }

    public AbstractPaymentOptionThankYouView getParentView() {
        return parentView;
    }

    public ThankYouButtonsLayout getThankYouButtonsLayout() {
        return thankYouButtonsLayout;
    }
    
    public String getThankYouText() {
    	return thankYouText.getMainComponent().getValue().toString();
    }

}
