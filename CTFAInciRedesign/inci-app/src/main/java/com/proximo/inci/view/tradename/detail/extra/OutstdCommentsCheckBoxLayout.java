/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.extra;

import com.proximo.inci.component.common.LabelComponent;
import com.vaadin.ui.HorizontalLayout;

public class OutstdCommentsCheckBoxLayout extends TradeNameExtraDetailsComponentLayout<HorizontalLayout> {

    private LabelComponent outstdCommentsCheckBoxLabel;
    private OutstdCommentsCheckBox outstdCommentsCheckBox;

    public OutstdCommentsCheckBoxLayout(TradeNameExtraDetails parentDetails) {
        super(parentDetails);
    }

    @Override
    protected HorizontalLayout createMainComponentInstance() {
        return new HorizontalLayout();
    }

    @Override
    protected void init() {
        outstdCommentsCheckBoxLabel = new LabelComponent("tradeName.detail.outstdCommentsCheckBox");
        outstdCommentsCheckBox = new OutstdCommentsCheckBox(this);
    }

    @Override
    protected void addContent() {
        addComponent(outstdCommentsCheckBoxLabel);
        addComponent(outstdCommentsCheckBox);
    }

}
