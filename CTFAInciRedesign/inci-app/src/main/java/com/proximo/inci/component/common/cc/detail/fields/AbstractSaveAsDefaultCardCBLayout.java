/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.component.common.cc.detail.fields;

import com.proximo.inci.component.AbstractInciComponentLayout;
import com.proximo.inci.component.common.cc.detail.AbstractCreditCardDetailLayout;
import com.vaadin.ui.HorizontalLayout;

public abstract class AbstractSaveAsDefaultCardCBLayout extends AbstractInciComponentLayout<HorizontalLayout> {

    private AbstractCreditCardDetailLayout creditCardDetailLayout;

    private SaveAsDefaultCardCheckBox saveAsDefaultCardCheckBox;

    public AbstractSaveAsDefaultCardCBLayout(AbstractCreditCardDetailLayout creditCardDetailLayout) {
        this.creditCardDetailLayout = creditCardDetailLayout;

        build();
    }

    @Override
    protected HorizontalLayout createMainComponentInstance() {
        return new HorizontalLayout();
    }

    @Override
    protected void init() {
        saveAsDefaultCardCheckBox = new SaveAsDefaultCardCheckBox(creditCardDetailLayout);
    }

    @Override
    protected void addContent() {
        addComponent(saveAsDefaultCardCheckBox);
    }

    public SaveAsDefaultCardCheckBox getSaveAsDefaultCardCheckBox() {
        return saveAsDefaultCardCheckBox;
    }

}
