/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.extra;

import com.proximo.inci.common.TemplarUtil;
import com.proximo.inci.view.tradename.detail.TradeNameDetailView;
import com.proximo.inci.view.tradename.detail.category.TradeNameDetails;
import com.vaadin.ui.TextArea;

public class InciNameTextArea extends TradeNameExtraDetailsField<TextArea> {

    public InciNameTextArea(InciNameTextAreaLayout parentLayout) {
        super(parentLayout);
    }

    @Override
    protected TextArea createMainComponentInstance() {
        return new TextArea();
    }

    @Override
    protected void init() {
        mainComponent.setHeight(TradeNameDetails.FORM_COLUMN_TEXTAREA_SMALL_HEIGHT_PX + "px");
        mainComponent.addStyleName("description");
        mainComponent.setWidth("383px");
        mainComponent.setMaxLength(4000);
    }

    @Override
    public void generateContent() {
        TradeNameDetailView parentView = getParentLayout().getParentDetails().getParentView();

        setEnabled(parentView.isEditable() && parentView.getCurrentSecurityInfo().getUser().isAdmin());
        //setEnabled(parentView.isEditable());

        setValue(TemplarUtil.convertNonEnglishCharsToEnglish(parentView.getFormTn().inciName));
    }

    @Override
    public String getFieldDescription() {
        return "";
    }

}
