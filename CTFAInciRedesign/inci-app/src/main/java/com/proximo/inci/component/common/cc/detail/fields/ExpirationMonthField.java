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
import com.proximo.inci.component.util.ComponentUtil;
import com.proximo.inci.service.common.LookupService;
import com.vaadin.ui.ComboBox;

public class ExpirationMonthField extends AbstractInciFieldComponent<ComboBox> {

    private AbstractCreditCardDetailLayout creditCardDetailLayout;

    public ExpirationMonthField(AbstractCreditCardDetailLayout creditCardDetailLayout) {
        this.creditCardDetailLayout = creditCardDetailLayout;

        build();
    }

    @Override
    protected ComboBox createMainComponentInstance() {
        return new ComboBox();
    }

    @Override
    protected void init() {
        mainComponent.setWidth(CreditCardFields.FORM_FIELD_SMALL_WIDTH);
        
        setRequired(true);

        ComponentUtil.fillLookupValues(mainComponent, LookupService.getMonths());
    }

    @Override
    public void generateContent() {
        DOUserCC userCC = creditCardDetailLayout.getUserCC();
        if (userCC != null && !TemplarUtil.isStringNullOrEmpty(String.valueOf(userCC.ccExpMonth))) {
            String month = String.valueOf(userCC.ccExpMonth);
        	if (month.equalsIgnoreCase("0")) {
                setValue(null);
            }        
        	else {
        		setValue(String.valueOf(userCC.ccExpMonth));
        	}
        } else {
            setValue(null);
        }
        
        mainComponent.setEnabled(creditCardDetailLayout.isEditable());
    }

    @Override
    public String getFieldDescription() {
        return CaptionResolver.getCaption("credit_card.detail.expiration.month.DESC");
    }

}
