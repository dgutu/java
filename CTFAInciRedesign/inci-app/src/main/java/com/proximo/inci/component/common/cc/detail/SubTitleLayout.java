/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.component.common.cc.detail;

import com.proximo.inci.component.AbstractInciComponentLayout;
import com.vaadin.ui.HorizontalLayout;

public class SubTitleLayout extends AbstractInciComponentLayout<HorizontalLayout> {

    private AbstractCreditCardDetailLayout parentLayout;

    private AbstractSubTitle subTitle;

    public SubTitleLayout(AbstractCreditCardDetailLayout parentLayout) {
        this.parentLayout = parentLayout;

        build();
    }

    @Override
    protected HorizontalLayout createMainComponentInstance() {
        return new HorizontalLayout();
    }

    @Override
    protected void init() {
        mainComponent.setSpacing(false);

        subTitle = parentLayout.createSubTitle();
    }

    @Override
    protected void addContent() {
        if (subTitle != null) {
            addComponent(subTitle);
        }
    }

}
