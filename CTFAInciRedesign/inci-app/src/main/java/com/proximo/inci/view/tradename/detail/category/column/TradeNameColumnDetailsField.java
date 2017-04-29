/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.category.column;

import com.proximo.inci.DOTradeName;
import com.proximo.inci.component.field.AbstractInciFieldComponent;
import com.vaadin.ui.AbstractField;

public abstract class TradeNameColumnDetailsField<F extends AbstractField> extends AbstractInciFieldComponent<F> {

    private TradeNameColumnDetailsFieldLayout<?> parentLayout;

    public TradeNameColumnDetailsField(TradeNameColumnDetailsFieldLayout<?> parentLayout) {
        this.parentLayout = parentLayout;

        build();
    }

    @Override
    protected void init() {
        String heightStr = parentLayout.getFieldHeightStr();
        if (heightStr != null) {
            mainComponent.setHeight(heightStr);
        }
        
        Integer tabIndex = parentLayout.getFieldTabIndex();
        if (tabIndex != null) {
            mainComponent.setTabIndex(tabIndex);
        }
    }

    @Override
    public void generateContent() {
    	DOTradeName formTn = parentLayout.getParentColumnDetails().getParentDetails().getParentView().getFormTn();
    	
    	/*
    	 * when the flag is 'Y', but the application already has a submit date, the only fields the user can edit 
    	 * is the user response and/or upload new attachments,
    	 * all other fields should be read-only
    	 */
    	
    	if (parentLayout.getParentColumnDetails().getParentDetails().getParentView().isEditable() && 
    			!parentLayout.getParentColumnDetails().getParentDetails().getParentView().getCurrentSecurityInfo().getUser().isAdmin() && 
    			formTn.submitted && formTn.editable)
    		setEnabled(false);
    	else
    		setEnabled(parentLayout.getParentColumnDetails().getParentDetails().getParentView().isEditable());
    }

    public TradeNameColumnDetailsFieldLayout<?> getParentLayout() {
        return parentLayout;
    }

}
