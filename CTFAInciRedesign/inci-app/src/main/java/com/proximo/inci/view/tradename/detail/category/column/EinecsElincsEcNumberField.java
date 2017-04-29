/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.category.column;

import com.proximo.inci.view.tradename.detail.category.TradeNameDetails;
import com.vaadin.ui.TextArea;

public class EinecsElincsEcNumberField extends TradeNameColumnDetailsField<TextArea> {

    public EinecsElincsEcNumberField(EinecsElincsEcNumberFieldLayout parentLayout) {
        super(parentLayout);
    }

    @Override
    protected TextArea createMainComponentInstance() {
        return new TradeNameColumnDetailsTextArea(TradeNameDetails.FORM_COLUMN_TEXTAREA_SMALL_HEIGHT_PX + "px",
                getParentLayout());
    }

    @Override
    public void generateContent() {
        super.generateContent();
        setValue(getParentLayout().getParentColumnDetails().getParentDetails().getParentView().getFormTn().EINECSNumber);
    }

    @Override
    public String getFieldDescription() {
        return "";
    }
}
