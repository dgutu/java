/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.category.column;

import com.proximo.inci.component.common.LabelComponent;
import com.vaadin.ui.VerticalLayout;

public class NomenclatureFieldLayout extends TradeNameColumnDetailsFieldLayout<VerticalLayout> {
    
    private LabelComponent nomenclatureFieldLabel;
    private LabelComponent nomenclatureFieldDescriptionLabel;
    private NomenclatureField nomenclatureField;

    public NomenclatureFieldLayout(TradeNameColumnDetails parentColumnDetails, String heightStr) {
        super(parentColumnDetails, heightStr, null);
    }
    
    public NomenclatureFieldLayout(TradeNameColumnDetails parentColumnDetails, String heightStr, Integer fieldTabIndex) {
        super(parentColumnDetails, heightStr, fieldTabIndex);
    }

    @Override
    protected VerticalLayout createMainComponentInstance() {
        return new VerticalLayout();
    }

    @Override
    protected void init() {
        nomenclatureFieldLabel = new LabelComponent("tradeName.detail.nomenclatureField", "required-field-label");
        nomenclatureFieldDescriptionLabel = new LabelComponent("tradeName.detail.nomenclatureField.description",
                "very-small-text");
        nomenclatureField = new NomenclatureField(this);
    }

    @Override
    protected void addContent() {
        addComponent(nomenclatureFieldLabel);
        addComponent(nomenclatureFieldDescriptionLabel);
        addComponent(nomenclatureField);
    }

    public NomenclatureField getNomenclatureField() {
        return nomenclatureField;
    }

}
