/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

//package com.proximo.inci.view.tradename.detail.category.column;
package com.proximo.inci.view.tradename.detail.extra;

import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.view.tradename.detail.TradeNameDetailView;
import com.proximo.inci.view.tradename.detail.category.TradeNameDetails;
import com.proximo.inci.view.tradename.detail.extra.TradeNameExtraDetailsField;
import com.vaadin.data.validator.RegexpValidator;
import com.vaadin.ui.TextArea;

public class MonoIdField extends TradeNameExtraDetailsField<TextArea> {

    public MonoIdField(MonoIdFieldLayout parentLayout) {
        super(parentLayout);
    }

    @Override
    protected TextArea createMainComponentInstance() {
        //return new TradeNameColumnDetailsTextArea(TradeNameDetails.FORM_COLUMN_TEXTAREA_SMALL_HEIGHT_PX + "px",
        //        getParentLayout());
    	 return new TextArea();
    }

    @Override
    protected void init() {
        super.init();
        mainComponent.setHeight(TradeNameDetails.FORM_COLUMN_TEXTAREA_SMALL_HEIGHT_PX + "px");
        /* comma-separated numbers (without spaces) allowed only */
        mainComponent.addValidator(new RegexpValidator("[0-9]+(,[0-9]+)*", CaptionResolver
                .getCaption("tradeName.detail.monoIdField.INVALID_VALUE")));
        mainComponent.addStyleName("description");
        mainComponent.setWidth("383px");
        mainComponent.setMaxLength(4000);        
    }

    @Override
    public void generateContent() {
        super.generateContent();
        
        TradeNameDetailView parentView = getParentLayout().getParentDetails().getParentView();
        
        setEnabled(parentView.isEditable() && parentView.getCurrentSecurityInfo().getUser().isAdmin());
        setValue(getParentLayout().getParentDetails().getParentView().getFormTn().monoId);
    }

    @Override
    public String getFieldDescription() {
        return "";
    }

    @Override
    public String getInvalidValueDescription() {
        return CaptionResolver.getCaption("tradeName.detail.monoIdField.INVALID_VALUE");
    }
}
