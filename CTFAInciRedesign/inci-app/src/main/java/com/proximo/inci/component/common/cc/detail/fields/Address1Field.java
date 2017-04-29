/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.component.common.cc.detail.fields;

import com.proximo.inci.DOUserCC;
import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.common.TemplarUtil;
import com.proximo.inci.component.common.cc.detail.AbstractCreditCardDetailLayout;
import com.proximo.inci.component.field.AbstractInciFieldComponent;
import com.vaadin.ui.TextField;

public class Address1Field extends AbstractInciFieldComponent<TextField> {

    private AbstractCreditCardDetailLayout creditCardDetailLayout;

    public Address1Field(AbstractCreditCardDetailLayout creditCardDetailLayout) {
        this.creditCardDetailLayout = creditCardDetailLayout;

        build();
    }

    @Override
    protected TextField createMainComponentInstance() {
        return new TextField();
    }

    @Override
    protected void init() {
        mainComponent.setWidth(CreditCardFields.FORM_FIELD_LARGE_WIDTH);
        mainComponent.setCaption(CaptionResolver.getCaption("credit_card.detail.address"));
        setRequired(true);
    }

    @Override
    public void generateContent() {
        DOUserCC userCC = creditCardDetailLayout.getUserCC();
        if (userCC != null && !TemplarUtil.isStringNullOrEmpty(userCC.address1)) {
            setValue(userCC.address1);
        } else {
            setValue("");
        }
        
        mainComponent.setEnabled(creditCardDetailLayout.isEditable());
    }

    @Override
    public String getFieldDescription() {
    	return CaptionResolver.getCaption("credit_card.detail.address.DESC");
    }

}
