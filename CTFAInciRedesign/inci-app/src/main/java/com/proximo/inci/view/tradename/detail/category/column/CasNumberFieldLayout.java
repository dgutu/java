/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.category.column;

import com.proximo.inci.component.common.LabelComponent;
import com.vaadin.ui.VerticalLayout;

public class CasNumberFieldLayout extends TradeNameColumnDetailsFieldLayout<VerticalLayout> {

    private LabelComponent casNumberFieldLabel;
    private LabelComponent casNumberFieldDescriptionLabel1;
    private LabelComponent casNumberFieldDescriptionLabel2;
    private CasNumberField casNumberField;
    private Integer categoryID; 

    public CasNumberFieldLayout(TradeNameColumnDetails parentColumnDetails) {
        super(parentColumnDetails, null, null);
    }

    public CasNumberFieldLayout(TradeNameColumnDetails parentColumnDetails, Integer fieldTabIndex) {
        super(parentColumnDetails, null, fieldTabIndex);        
    }

    @Override
    protected VerticalLayout createMainComponentInstance() {
        return new VerticalLayout();
    }

    @Override
    protected void init() {
        casNumberFieldLabel = new LabelComponent("tradeName.detail.casNumberField");
        casNumberFieldDescriptionLabel1 = new LabelComponent("tradeName.detail.casNumberField.polimers.description1", "very-small-text");
        casNumberFieldDescriptionLabel2 = new LabelComponent("tradeName.detail.casNumberField.polimers.description2", "very-small-text");
        casNumberField = new CasNumberField(this);
        categoryID = this.getParentColumnDetails().getParentDetails().getParentView().getFormTn().categoryID;
        
    }

    @Override
    protected void addContent() {
        addComponent(casNumberFieldLabel);
        
        // when category is 'Polimers/Silicons' change the CAS Number description
        if (categoryID == 3) {
            addComponent(casNumberFieldDescriptionLabel1);
            addComponent(casNumberFieldDescriptionLabel2);
        }
        	
        addComponent(casNumberField);
    }

    public CasNumberField getCasNumberField() {
        return casNumberField;
    }

}
