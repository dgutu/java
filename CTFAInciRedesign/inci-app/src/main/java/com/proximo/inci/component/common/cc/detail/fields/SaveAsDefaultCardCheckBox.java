/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.component.common.cc.detail.fields;

import com.proximo.inci.DOUserCC;
import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.component.common.cc.detail.AbstractCreditCardDetailLayout;
import com.proximo.inci.component.field.AbstractInciFieldComponent;
import com.vaadin.ui.CheckBox;

public class SaveAsDefaultCardCheckBox extends AbstractInciFieldComponent<CheckBox> {

    private AbstractCreditCardDetailLayout creditCardDetailLayout;

    public SaveAsDefaultCardCheckBox(AbstractCreditCardDetailLayout creditCardDetailLayout) {
        this.creditCardDetailLayout = creditCardDetailLayout;

        build();
    }

    @Override
    protected CheckBox createMainComponentInstance() {
        return new CheckBox();
    }

    @Override
    protected void init() {
        mainComponent.setCaption(CaptionResolver.getCaption("credit_card.detail.save_as_default_card"));
    }

    @Override
    public void generateContent() {
        DOUserCC userCC = creditCardDetailLayout.getUserCC();
        if (userCC != null) {
            if (userCC.recID != 0) {
                setEnabled(false);
            }
        } else {
            setEnabled(true);
        }

        setValue(false);
        
        mainComponent.setEnabled(creditCardDetailLayout.isEditable());
    }

    @Override
    public String getFieldDescription() {
        return "";
    }
}
