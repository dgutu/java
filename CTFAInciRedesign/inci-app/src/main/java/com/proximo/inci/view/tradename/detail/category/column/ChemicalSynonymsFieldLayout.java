/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.category.column;

import com.proximo.inci.component.common.LabelComponent;
import com.vaadin.ui.VerticalLayout;

public class ChemicalSynonymsFieldLayout extends TradeNameColumnDetailsFieldLayout<VerticalLayout> {

    private LabelComponent chemicalSynonymsFieldLabel;
    private LabelComponent chemicalSynonymsFieldDescriptionLabel;
    private ChemicalSynonymsField chemicalSynonymsField;

    public ChemicalSynonymsFieldLayout(TradeNameColumnDetails parentColumnDetails) {
        super(parentColumnDetails, null, null);
    }
    
    public ChemicalSynonymsFieldLayout(TradeNameColumnDetails parentColumnDetails, Integer fieldTabIndex) {
        super(parentColumnDetails, null, fieldTabIndex);
    }

    @Override
    protected VerticalLayout createMainComponentInstance() {
        return new VerticalLayout();
    }

    @Override
    protected void init() {
        chemicalSynonymsFieldLabel = new LabelComponent("tradeName.detail.chemicalSynonymsField");
        chemicalSynonymsFieldDescriptionLabel = new LabelComponent(
                "tradeName.detail.chemicalSynonymsField.description", "very-small-text");
        chemicalSynonymsField = new ChemicalSynonymsField(this);
    }

    @Override
    protected void addContent() {
        addComponent(chemicalSynonymsFieldLabel);
        addComponent(chemicalSynonymsFieldDescriptionLabel);
        addComponent(chemicalSynonymsField);
    }

    public ChemicalSynonymsField getChemicalSynonymsField() {
        return chemicalSynonymsField;
    }

}
