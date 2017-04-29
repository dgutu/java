/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.component.common.cc.detail.fields;

import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.component.field.AbstractInciFieldComponent;
import com.vaadin.data.validator.RegexpValidator;
import com.vaadin.ui.TextField;

public class CCNumberField extends AbstractInciFieldComponent<TextField> {

    private CCNumberLayout parentLayout;

    public CCNumberField(CCNumberLayout parentLayout) {
        this.parentLayout = parentLayout;

        build();
    }

    @Override
    protected TextField createMainComponentInstance() {
        return new TextField();
    }

    @Override
    protected void init() {
        mainComponent.setWidth(CreditCardFields.FORM_FIELD_LARGE_WIDTH);
        mainComponent.setImmediate(true);
        mainComponent.addValidator(new RegexpValidator("\\d+", CaptionResolver
                .getCaption("credit_card.detail.number.INVALID_VALUE")));
    }

    @Override
    public String getFieldDescription() {
        return CaptionResolver.getCaption("credit_card.detail.number.DESC");
    }

    @Override
    public void generateContent() {
        boolean isNewCard = (parentLayout.getCreditCardDetailLayout().getUserCC() == null);

        setEnabled(parentLayout.getCreditCardDetailLayout().isEditable());
        setRequired(isNewCard);
        setValue("");
    }
    
    @Override
    public String getInvalidValueDescription() {
        return CaptionResolver.getCaption("credit_card.detail.number.INVALID_VALUE");
    }
}
