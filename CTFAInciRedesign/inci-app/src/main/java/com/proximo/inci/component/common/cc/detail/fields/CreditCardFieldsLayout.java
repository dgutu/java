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

public class CreditCardFieldsLayout extends AbstractInciComponentLayout<HorizontalLayout> {

    protected AbstractCreditCardDetailLayout parentLayout;

    private CreditCardFields creditCardFields;

    public CreditCardFieldsLayout(AbstractCreditCardDetailLayout parentLayout) {
        this.parentLayout = parentLayout;

        build();
    }

    @Override
    protected HorizontalLayout createMainComponentInstance() {
        return new HorizontalLayout();
    }

    @Override
    protected void init() {
        creditCardFields = new CreditCardFields(this);
    }

    @Override
    protected void addContent() {
        addComponent(creditCardFields);
    }

    public AbstractCreditCardDetailLayout getParentLayout() {
        return parentLayout;
    }

    public CreditCardFields getCreditCardFields() {
        return creditCardFields;
    }
    
    @Override
    public void generateContent() {
    	creditCardFields.generateContent();
    }      
}
