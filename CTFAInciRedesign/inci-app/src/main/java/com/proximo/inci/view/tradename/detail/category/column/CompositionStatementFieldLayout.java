/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.category.column;

import com.proximo.inci.component.common.LabelComponent;
import com.vaadin.ui.VerticalLayout;

public class CompositionStatementFieldLayout extends TradeNameColumnDetailsFieldLayout<VerticalLayout> {

    private LabelComponent compositionStatementFieldLabel;
    private LabelComponent compositionStatementFieldDescriptionLabel1;
    private LabelComponent compositionStatementFieldDescriptionLabel2;
    private LabelComponent compositionStatementFieldDescriptionLabel3;
    private LabelComponent compositionStatementFieldDescriptionLabel4;
    private CompositionStatementField compositionStatementField;

    public CompositionStatementFieldLayout(TradeNameColumnDetails parentColumnDetails) {
        super(parentColumnDetails, null, null);
    }

    public CompositionStatementFieldLayout(TradeNameColumnDetails parentColumnDetails, Integer fieldTabIndex) {
        super(parentColumnDetails, null, fieldTabIndex);
    }
    
    @Override
    protected VerticalLayout createMainComponentInstance() {
        return new VerticalLayout();
    }

    @Override
    protected void init() {
        compositionStatementFieldLabel = new LabelComponent("tradeName.detail.compositionStatementField",
                "required-field-label");

        compositionStatementFieldDescriptionLabel1 = new LabelComponent(
                "tradeName.detail.compositionStatementField.description1", "very-small-text");
        compositionStatementFieldDescriptionLabel2 = new LabelComponent(
                "tradeName.detail.compositionStatementField.description2", "very-small-text");
        compositionStatementFieldDescriptionLabel3 = new LabelComponent(
                "tradeName.detail.compositionStatementField.description3", "very-small-text");
        compositionStatementFieldDescriptionLabel4 = new LabelComponent(
                "tradeName.detail.compositionStatementField.description4", "very-small-text");        
        compositionStatementField = new CompositionStatementField(this);
        compositionStatementField.setRequired(true);
    }

    @Override
    protected void addContent() {
        addComponent(compositionStatementFieldLabel);
        addComponent(compositionStatementFieldDescriptionLabel1);
        addComponent(compositionStatementFieldDescriptionLabel2);
        addComponent(compositionStatementFieldDescriptionLabel3);
        addComponent(compositionStatementFieldDescriptionLabel4);
        addComponent(compositionStatementField);
    }

    public CompositionStatementField getCompositionStatementField() {
        return compositionStatementField;
    }

}
