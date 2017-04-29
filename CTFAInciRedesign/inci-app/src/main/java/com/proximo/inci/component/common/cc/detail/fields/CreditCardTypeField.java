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
import com.proximo.inci.component.field.AbstractInciFieldComponent;
import com.proximo.inci.component.util.ComponentUtil;
import com.proximo.inci.service.common.LookupService;
import com.vaadin.data.Property;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.ui.ComboBox;

@SuppressWarnings("serial")
public class CreditCardTypeField extends AbstractInciFieldComponent<ComboBox> {

    private CreditCardFields parentLayout;

    public CreditCardTypeField(CreditCardFields parentLayout) {
        this.parentLayout = parentLayout;

        build();
    }

    @Override
    protected ComboBox createMainComponentInstance() {
        return new ComboBox();
    }

    @Override
    protected void init() {
        mainComponent.setCaption(CaptionResolver.getCaption("credit_card.detail.type"));
        mainComponent.setWidth(CreditCardFields.FORM_FIELD_MEDIUM_WIDTH);

        setRequired(true);
        mainComponent.setImmediate(true);
        mainComponent.addListener(new Property.ValueChangeListener() {
            @Override
            public void valueChange(ValueChangeEvent event) {
            	if (getValue() != null)
            		parentLayout.getCvnLayout().getCvnField().refresh(Integer.parseInt((String) getValue()));
            }
        });
        
        ComponentUtil.fillLookupValues(mainComponent, LookupService.getCreditCardTypes());
    }

    @Override
    public void generateContent() {
        DOUserCC userCC = parentLayout.getParentLayout().getParentLayout().getUserCC();
        if (userCC != null && !TemplarUtil.isStringNullOrEmpty(String.valueOf(userCC.ccType))) {
        	String ccType = String.valueOf(userCC.ccType);
        	if (ccType.equalsIgnoreCase("0")) {
        		setValue(null);
        	}
        	else {
        		setValue(String.valueOf(userCC.ccType));
        	}
        } else {
            setValue(null);
        }
        
        mainComponent.setEnabled(parentLayout.getParentLayout().getParentLayout().isEditable());
    }

    @Override
    public String getFieldDescription() {
        return CaptionResolver.getCaption("credit_card.detail.type.DESC");
    }

}
