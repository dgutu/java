/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.extra;

import com.vaadin.ui.CheckBox;

public class OutstdCommentsCheckBox extends TradeNameExtraDetailsField<CheckBox> {

    public OutstdCommentsCheckBox(OutstdCommentsCheckBoxLayout parentLayout) {
        super(parentLayout);
    }

    @Override
    protected CheckBox createMainComponentInstance() {
        return new CheckBox();
    }

    @Override
    protected void init() {
        setEnabled(false);
    }

    @Override
    public void generateContent() {
        setValue(getParentLayout().getParentDetails().getParentView().getFormTn().hasOutstdComments);
    }

    @Override
    public String getFieldDescription() {
        return "";
    }

}
