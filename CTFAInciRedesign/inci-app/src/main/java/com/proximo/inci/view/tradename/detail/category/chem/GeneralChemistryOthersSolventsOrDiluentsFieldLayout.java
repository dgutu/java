/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.category.chem;

import com.proximo.inci.component.common.LabelComponent;
import com.proximo.inci.view.tradename.detail.category.column.SolventsOrDiluentsField;
import com.proximo.inci.view.tradename.detail.category.column.TradeNameColumnDetails;
import com.proximo.inci.view.tradename.detail.category.column.TradeNameColumnDetailsFieldLayout;
import com.vaadin.ui.VerticalLayout;

public class GeneralChemistryOthersSolventsOrDiluentsFieldLayout extends
        TradeNameColumnDetailsFieldLayout<VerticalLayout> {

    private LabelComponent solventsOrDiluentsFieldLabel;
    private LabelComponent solventsOrDiluentsFieldDescriptionLabel1;
    private LabelComponent solventsOrDiluentsFieldDescriptionLabel2;
    private SolventsOrDiluentsField solventsOrDiluentsField;

    public GeneralChemistryOthersSolventsOrDiluentsFieldLayout(TradeNameColumnDetails parentColumnDetails) {
        super(parentColumnDetails, null, null);
    }
    
    public GeneralChemistryOthersSolventsOrDiluentsFieldLayout(TradeNameColumnDetails parentColumnDetails,
            Integer fieldTabIndex) {
        super(parentColumnDetails, null, fieldTabIndex);
    }

    @Override
    protected VerticalLayout createMainComponentInstance() {
        return new VerticalLayout();
    }

    @Override
    protected void init() {
        solventsOrDiluentsFieldLabel = new LabelComponent("tradeName.detail.solventsOrDiluentsField",
                "required-field-label");

        solventsOrDiluentsFieldDescriptionLabel1 = new LabelComponent(
                "tradeName.detail.solventsOrDiluentsField.chem.description1", "very-small-text");
        solventsOrDiluentsFieldDescriptionLabel2 = new LabelComponent(
                "tradeName.detail.solventsOrDiluentsField.chem.description2", "very-small-text");

        solventsOrDiluentsField = new SolventsOrDiluentsField(this);
    }

    @Override
    protected void addContent() {
        addComponent(solventsOrDiluentsFieldLabel);
        addComponent(solventsOrDiluentsFieldDescriptionLabel1);
        addComponent(solventsOrDiluentsFieldDescriptionLabel2);
        addComponent(solventsOrDiluentsField);
    }

    public SolventsOrDiluentsField getSolventsOrDiluentsField() {
        return solventsOrDiluentsField;
    }

}
