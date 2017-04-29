/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.search.form.fields.right;

import com.proximo.inci.component.field.AbstractInciFieldComponent;
import com.proximo.inci.view.tradename.search.form.TradeNameSearchForm;
import com.vaadin.ui.PopupDateField;

public class CommiteeReviewDateToField extends AbstractInciFieldComponent<PopupDateField> {

    public CommiteeReviewDateToField() {
        build();
    }
    
    @Override
    protected PopupDateField createMainComponentInstance() {
        return new PopupDateField();
    }

    @Override
    protected void init() {
        mainComponent.setResolution(PopupDateField.RESOLUTION_DAY);
        mainComponent.setWidth(TradeNameSearchForm.FORM_DATE_FIELD_WIDTH);
        mainComponent.setImmediate(true);
    }

    @Override
    public String getFieldDescription() {
        return "";
    }

}
