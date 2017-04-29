/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.extra;

import java.util.Date;

import com.proximo.inci.common.TDate;
import com.proximo.inci.component.util.ComponentUtil;
import com.proximo.inci.view.tradename.detail.TradeNameDetailView;
import com.vaadin.ui.PopupDateField;

public class ExportQuestionDateField extends TradeNameExtraDetailsField<PopupDateField> {
	
    public ExportQuestionDateField(ExportQuestionLayout parentLayout) {
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
    }

    @Override
    public void generateContent() {
        TradeNameDetailView parentView = getParentLayout().getParentDetails().getParentView();

        TDate exportDt = parentView.getFormTn().exportDt;
        if (!exportDt.isNull()) {
            setValue(exportDt.getUtilDate());
            
        	/*
        	 * when the flag is 'Y', but the application already has a submit date, the only fields the user can edit 
        	 * is the user response and/or upload new attachments,
        	 * all other fields should be read-only
        	 */
        	
        	if (parentView.isEditable() && 
        			!parentView.getCurrentSecurityInfo().getUser().isAdmin() && 
        			parentView.getFormTn().submitted && parentView.getFormTn().editable)
        		setEnabled(false);   
        	else
        		setEnabled(parentView.isEditable());
        } else {
            setValue(null);
            setEnabled(false);
        }
    }

    public void refresh(boolean toExport) {
        if (toExport) {
            setValue(new Date());
            setEnabled(true);
        } else {
            setValue(null);
            setEnabled(false);
        }
    }

    @Override
    public String getFieldDescription() {
        return "";
    }
}
