/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.category.inorganic;

import com.proximo.inci.component.common.LabelComponent;
import com.proximo.inci.view.tradename.detail.category.column.CompositionStatementField;
import com.proximo.inci.view.tradename.detail.category.column.TradeNameColumnDetails;
import com.proximo.inci.view.tradename.detail.category.column.TradeNameColumnDetailsFieldLayout;
import com.vaadin.ui.VerticalLayout;

public class InorganicMineralBasedCompositionStatementFieldLayout extends
        TradeNameColumnDetailsFieldLayout<VerticalLayout> {

    private LabelComponent compositionStatementFieldLabel;
    private LabelComponent compositionStatementFieldDescriptionLabel1;
    private LabelComponent compositionStatementFieldDescriptionLabel2;
    private CompositionStatementField compositionStatementField;

    public InorganicMineralBasedCompositionStatementFieldLayout(TradeNameColumnDetails parentColumnDetails) {
        super(parentColumnDetails, null, null);
    }
    
    public InorganicMineralBasedCompositionStatementFieldLayout(TradeNameColumnDetails parentColumnDetails,
            Integer fieldTabIndex) {
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
                "tradeName.detail.compositionStatementField.inorganic.description1", "very-small-text");
        compositionStatementFieldDescriptionLabel2 = new LabelComponent(
                "tradeName.detail.compositionStatementField.inorganic.description2", "very-small-text");

        compositionStatementField = new CompositionStatementField(this);
        compositionStatementField.setRequired(true);
    }

    @Override
    protected void addContent() {
        addComponent(compositionStatementFieldLabel);
        addComponent(compositionStatementFieldDescriptionLabel1);
        addComponent(compositionStatementFieldDescriptionLabel2);
        addComponent(compositionStatementField);
    }

    public CompositionStatementField getCompositionStatementField() {
        return compositionStatementField;
    }

}
