/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.extra;

import com.proximo.inci.common.TDate;
import com.proximo.inci.component.util.ComponentUtil;
import com.proximo.inci.view.tradename.detail.TradeNameDetailView;
import com.vaadin.ui.PopupDateField;

public class InciNameDateField extends TradeNameExtraDetailsField<PopupDateField> {

    public InciNameDateField(InciNameDateFieldLayout parentLayout) {
        super(parentLayout);
    }

    @Override
    protected PopupDateField createMainComponentInstance() {
        return new PopupDateField();
    }

    @Override
    protected void init() {
        mainComponent.setResolution(PopupDateField.RESOLUTION_DAY);
        mainComponent.setWidth(ComponentUtil.NORMAL_DATE_FIELD_WIDTH);
        
        // admin should be able to edit
        TradeNameDetailView parentView = getParentLayout().getParentDetails().getParentView();
        if (!parentView.getCurrentSecurityInfo().getUser().isAdmin())
        	setEnabled(false); 
        else
        	setEnabled(parentView.isEditable());
    }

    @Override
    public void generateContent() {
        TradeNameDetailView parentView = getParentLayout().getParentDetails().getParentView();
        TDate inciNameDt = parentView.getFormTn().inciNameDt;
        /*if (!inciNameDt.isNull() && parentView.getCurrentSecurityInfo().getUser().isAdmin()) {
            setValue(inciNameDt.getUtilDate());
        } else {
            setValue(null);
        }*/
        setValue(inciNameDt.getUtilDate());
    }

    @Override
    public String getFieldDescription() {
        return "";
    }

}
