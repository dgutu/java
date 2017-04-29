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

public class PhoneField extends AbstractInciFieldComponent<TextField> {

    private AbstractCreditCardDetailLayout creditCardDetailLayout;

    public PhoneField(AbstractCreditCardDetailLayout creditCardDetailLayout) {
        this.creditCardDetailLayout = creditCardDetailLayout;

        build();
    }

    @Override
    protected TextField createMainComponentInstance() {
        return new TextField();
    }

    @Override
    protected void init() {
        mainComponent.setWidth(CreditCardFields.FORM_FIELD_MEDIUM_WIDTH);
        mainComponent.setCaption(CaptionResolver.getCaption("credit_card.detail.phone"));
    }

    @Override
    public void generateContent() {
        DOUserCC userCC = creditCardDetailLayout.getUserCC();
        if (userCC != null && !TemplarUtil.isStringNullOrEmpty(userCC.phone)) {
            setValue(userCC.phone);
        } else {
            setValue("");
        }
        
        mainComponent.setEnabled(creditCardDetailLayout.isEditable());
    }

    @Override
    public String getFieldDescription() {
        return "";
    }

}
