/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.payment.option.thankyou;

import com.proximo.inci.component.AbstractInciComponentLayout;
import com.proximo.inci.component.common.JavaScriptPrintButtonTnakYou;
import com.vaadin.ui.HorizontalLayout;

public class ThankYouButtonsLayout extends AbstractInciComponentLayout<HorizontalLayout> {

    private ThankYouLayout parentLayout;

    private GoToApplicationButton goToApplicationButton;
    private JavaScriptPrintButtonTnakYou printButton;

    public ThankYouButtonsLayout(ThankYouLayout parentLayout) {
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

        goToApplicationButton = new GoToApplicationButton(parentLayout.getParentView());
        printButton = new JavaScriptPrintButtonTnakYou(parentLayout.getParentView());
    }

    @Override
    protected void addContent() {
        addComponent(goToApplicationButton);
        addComponent(printButton);
    }

    public ThankYouLayout getParentLayout() {
        return parentLayout;
    }
}
