/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.category.column;

import com.proximo.inci.component.common.LabelComponent;
import com.vaadin.ui.VerticalLayout;

public class FunctionsFieldLayout extends TradeNameColumnDetailsFieldLayout<VerticalLayout> {

    private LabelComponent functionsFieldLabel;
    private LabelComponent functionsFieldDescriptionLabel1;
    private LabelComponent functionsFieldDescriptionLabel2;
    private LabelComponent functionsFieldDescriptionLabel3;
    private FunctionsField functionsField;

    public FunctionsFieldLayout(TradeNameColumnDetails parentColumnDetails) {
        super(parentColumnDetails, null, null);
    }

    public FunctionsFieldLayout(TradeNameColumnDetails parentColumnDetails, Integer fieldTabIndex) {
        super(parentColumnDetails, null, fieldTabIndex);
    }

    @Override
    protected VerticalLayout createMainComponentInstance() {
        return new VerticalLayout();
    }

    @Override
    protected void init() {
        functionsFieldLabel = new LabelComponent("tradeName.detail.functionsField", "required-field-label");

        functionsFieldDescriptionLabel1 = new LabelComponent("tradeName.detail.functionsField.description1",
                "very-small-text");
        functionsFieldDescriptionLabel2 = new LabelComponent("tradeName.detail.functionsField.description2",
                "very-small-text");
        functionsFieldDescriptionLabel3 = new LabelComponent("tradeName.detail.functionsField.description3",
                "very-small-text");

        functionsField = new FunctionsField(this);
    }

    @Override
    protected void addContent() {
        addComponent(functionsFieldLabel);
        addComponent(functionsFieldDescriptionLabel1);
        addComponent(functionsFieldDescriptionLabel2);
        addComponent(functionsFieldDescriptionLabel3);
        addComponent(functionsField);
    }

    public FunctionsField getFunctionsField() {
        return functionsField;
    }

}
