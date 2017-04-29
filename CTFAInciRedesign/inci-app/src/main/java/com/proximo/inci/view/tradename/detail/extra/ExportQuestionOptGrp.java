/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.extra;

import com.proximo.inci.DOTradeName;
import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.view.tradename.detail.TradeNameDetailView;
import com.vaadin.data.Property;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.ui.OptionGroup;

@SuppressWarnings("serial")
public class ExportQuestionOptGrp extends TradeNameExtraDetailsField<OptionGroup> {

    public ExportQuestionOptGrp(ExportQuestionLayout parentLayout) {
        super(parentLayout);
    }

    @Override
    protected OptionGroup createMainComponentInstance() {
        return new OptionGroup();
    }

    @Override
    protected void init() {
        mainComponent.addStyleName("horizontal");
        fillOptions();
        mainComponent.setImmediate(true);
        mainComponent.addListener(createValueChangeListener());
    }

    private void fillOptions() {
        Boolean yesItemId = true;
        String yesItemCaption = CaptionResolver.getCaption("yes");
        mainComponent.addItem(yesItemId);
        mainComponent.setItemCaption(yesItemId, yesItemCaption);

        Boolean noItemId = false;
        String noItemCaption = CaptionResolver.getCaption("no");
        mainComponent.addItem(noItemId);
        mainComponent.setItemCaption(noItemId, noItemCaption);
    }

    private Property.ValueChangeListener createValueChangeListener() {
        return new Property.ValueChangeListener() {
            @Override
            public void valueChange(ValueChangeEvent event) {
                ((ExportQuestionLayout) getParentLayout()).refreshExportQuestionDateField();
            }
        };
    }

    @Override
    public void generateContent() {
        TradeNameDetailView parentView = getParentLayout().getParentDetails().getParentView();
        DOTradeName formTn = parentView.getFormTn();

        setValue(!formTn.exportDt.isNull());
        
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
    }

    @Override
    public String getFieldDescription() {
        return "";
    }

}
