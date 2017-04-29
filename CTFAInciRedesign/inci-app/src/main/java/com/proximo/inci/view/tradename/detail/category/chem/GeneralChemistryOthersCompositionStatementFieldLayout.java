/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.category.chem;

import com.proximo.inci.component.common.LabelComponent;
import com.proximo.inci.view.tradename.detail.category.column.CompositionStatementField;
import com.proximo.inci.view.tradename.detail.category.column.TradeNameColumnDetails;
import com.proximo.inci.view.tradename.detail.category.column.TradeNameColumnDetailsFieldLayout;
import com.vaadin.ui.VerticalLayout;

public class GeneralChemistryOthersCompositionStatementFieldLayout extends
        TradeNameColumnDetailsFieldLayout<VerticalLayout> {

    private LabelComponent compositionStatementFieldLabel;
    private LabelComponent compositionStatementFieldDescriptionLabel1;
    private LabelComponent compositionStatementFieldDescriptionLabel2;
    private LabelComponent compositionStatementFieldDescriptionLabel3;
    private CompositionStatementField compositionStatementField;

    public GeneralChemistryOthersCompositionStatementFieldLayout(TradeNameColumnDetails parentColumnDetails) {
        super(parentColumnDetails, null, null);
    }
    
    public GeneralChemistryOthersCompositionStatementFieldLayout(TradeNameColumnDetails parentColumnDetails,
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
                "tradeName.detail.compositionStatementField.chem.description1", "very-small-text");
        compositionStatementFieldDescriptionLabel2 = new LabelComponent(
                "tradeName.detail.compositionStatementField.chem.description2", "very-small-text");
        compositionStatementFieldDescriptionLabel3 = new LabelComponent(
                "tradeName.detail.compositionStatementField.chem.description3", "very-small-text");

        compositionStatementField = new CompositionStatementField(this);
        compositionStatementField.setRequired(true);
    }

    @Override
    protected void addContent() {
        addComponent(compositionStatementFieldLabel);
        addComponent(compositionStatementFieldDescriptionLabel1);
        addComponent(compositionStatementFieldDescriptionLabel2);
        addComponent(compositionStatementFieldDescriptionLabel3);
        addComponent(compositionStatementField);
    }

    public CompositionStatementField getCompositionStatementField() {
        return compositionStatementField;
    }

}
