/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.extra;

import com.proximo.inci.component.common.LabelComponent;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.HorizontalLayout;

public class InciNameDateFieldLayout extends TradeNameExtraDetailsComponentLayout<HorizontalLayout> {

    private LabelComponent inciNameDateFieldLabel;
    private InciNameDateField inciNameDateField;
    private LabelComponent inciNameDateFieldDescriptionLabel;

    public InciNameDateFieldLayout(TradeNameExtraDetails parentDetails) {    	
        super(parentDetails);
    }

    @Override
    protected HorizontalLayout createMainComponentInstance() {
        return new HorizontalLayout();
    }

    @Override
    protected void init() {
        inciNameDateFieldLabel = new LabelComponent("tradeName.detail.inciNameDateField");
        inciNameDateField = new InciNameDateField(this);
        inciNameDateFieldDescriptionLabel = new LabelComponent("tradeName.detail.inciNameDateField.description");
    }

    @Override
    protected void addContent() {
        addComponent(inciNameDateFieldLabel, Alignment.BOTTOM_LEFT);
        addSpace();
        addComponent(inciNameDateField);
        addSpace();
        addComponent(inciNameDateFieldDescriptionLabel, Alignment.BOTTOM_LEFT);
    }

    public InciNameDateField getInciNameDateField() {
        return inciNameDateField;
    }

}
