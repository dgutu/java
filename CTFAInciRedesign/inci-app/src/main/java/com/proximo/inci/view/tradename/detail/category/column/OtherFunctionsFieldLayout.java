/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.category.column;

import com.proximo.inci.component.common.LabelComponent;
import com.vaadin.ui.VerticalLayout;

public class OtherFunctionsFieldLayout extends TradeNameColumnDetailsFieldLayout<VerticalLayout> {

    private LabelComponent otherFunctionsFieldLabel;
    private OtherFunctionsField otherFunctionsField;

    public OtherFunctionsFieldLayout(TradeNameColumnDetails parentColumnDetails) {
        super(parentColumnDetails, null, null);
    }
    
    public OtherFunctionsFieldLayout(TradeNameColumnDetails parentColumnDetails, Integer fieldTabIndex) {
        super(parentColumnDetails, null, fieldTabIndex);
    }

    @Override
    protected VerticalLayout createMainComponentInstance() {
        return new VerticalLayout();
    }

    @Override
    protected void init() {
        otherFunctionsFieldLabel = new LabelComponent("tradeName.detail.otherFunctionsField");
        otherFunctionsField = new OtherFunctionsField(this);
    }

    @Override
    protected void addContent() {
        addComponent(otherFunctionsFieldLabel);
        addComponent(otherFunctionsField);
    }

    public OtherFunctionsField getOtherFunctionsField() {
        return otherFunctionsField;
    }
    
}
