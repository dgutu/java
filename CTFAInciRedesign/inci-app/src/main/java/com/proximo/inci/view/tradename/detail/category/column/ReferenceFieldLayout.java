/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.category.column;

import com.proximo.inci.component.common.LabelComponent;
import com.vaadin.ui.VerticalLayout;

public class ReferenceFieldLayout extends TradeNameColumnDetailsFieldLayout<VerticalLayout> {

    private LabelComponent referenceFieldLabel;
    private LabelComponent referenceFieldDescriptionLabel1;
    private LabelComponent referenceFieldDescriptionLabel2;
    private LabelComponent referenceFieldDescriptionLabel3;
    private LabelComponent referenceFieldDescriptionLabel4;
    private LabelComponent referenceFieldDescriptionLabel5;
    private ReferenceField referenceField;

    public ReferenceFieldLayout(TradeNameColumnDetails parentColumnDetails) {
        super(parentColumnDetails, null, null);
    }
    
    public ReferenceFieldLayout(TradeNameColumnDetails parentColumnDetails, Integer fieldTabIndex) {
        super(parentColumnDetails, null, fieldTabIndex);
    }

    @Override
    protected VerticalLayout createMainComponentInstance() {
        return new VerticalLayout();
    }

    @Override
    protected void init() {
        referenceFieldLabel = new LabelComponent("tradeName.detail.referenceField");

        referenceFieldDescriptionLabel1 = new LabelComponent("tradeName.detail.referenceField.description1",
                "very-small-text");
        referenceFieldDescriptionLabel2 = new LabelComponent("tradeName.detail.referenceField.description2",
                "very-small-text");
        referenceFieldDescriptionLabel3 = new LabelComponent("tradeName.detail.referenceField.description3",
                "very-small-text");
        referenceFieldDescriptionLabel4 = new LabelComponent("tradeName.detail.referenceField.description4",
                "very-small-text");
        referenceFieldDescriptionLabel5 = new LabelComponent("tradeName.detail.referenceField.description5",
                "very-small-text");

        referenceField = new ReferenceField(this);
    }

    @Override
    protected void addContent() {
        addComponent(referenceFieldLabel);
        addComponent(referenceFieldDescriptionLabel1);
        addComponent(referenceFieldDescriptionLabel2);
        addComponent(referenceFieldDescriptionLabel3);
        addComponent(referenceFieldDescriptionLabel4);
        addComponent(referenceFieldDescriptionLabel5);
        addComponent(referenceField);
    }

    public ReferenceField getReferenceField() {
        return referenceField;
    }

}
