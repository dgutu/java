/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.component.common.cc.detail;

import com.proximo.inci.component.AbstractInciComponentLayout;
import com.proximo.inci.component.common.LabelComponent;
import com.vaadin.ui.HorizontalLayout;

public class TitleLayout extends AbstractInciComponentLayout<HorizontalLayout> {

    private AbstractCreditCardDetailLayout parentLayout;

    private LabelComponent title;

    public TitleLayout(AbstractCreditCardDetailLayout parentLayout) {
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

        title = new LabelComponent(parentLayout.getTitleKey(), "form-title");
    }

    @Override
    protected void addContent() {
        addComponent(title);
    }

}
