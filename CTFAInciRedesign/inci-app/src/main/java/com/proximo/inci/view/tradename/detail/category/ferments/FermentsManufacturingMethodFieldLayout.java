/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.category.ferments;

import com.proximo.inci.component.common.LabelComponent;
import com.proximo.inci.view.tradename.detail.category.column.ManufacturingMethodField;
import com.proximo.inci.view.tradename.detail.category.column.TradeNameColumnDetails;
import com.proximo.inci.view.tradename.detail.category.column.TradeNameColumnDetailsFieldLayout;
import com.vaadin.ui.VerticalLayout;

public class FermentsManufacturingMethodFieldLayout extends TradeNameColumnDetailsFieldLayout<VerticalLayout> {

    private LabelComponent manufacturingMethodFieldLabel;
    private LabelComponent manufacturingMethodFieldDescriptionLabel1;
    private LabelComponent manufacturingMethodFieldDescriptionLabel2;
    private LabelComponent manufacturingMethodFieldDescriptionLabel3;
    private LabelComponent manufacturingMethodFieldDescriptionLabel4;
    private LabelComponent manufacturingMethodFieldDescriptionLabel5;
    private LabelComponent manufacturingMethodFieldDescriptionLabel6;
    private LabelComponent manufacturingMethodFieldDescriptionLabel7;
    private LabelComponent manufacturingMethodFieldDescriptionLabel8;
    private ManufacturingMethodField manufacturingMethodField;

    public FermentsManufacturingMethodFieldLayout(TradeNameColumnDetails parentColumnDetails) {
        super(parentColumnDetails, null, null);
    }
    
    public FermentsManufacturingMethodFieldLayout(TradeNameColumnDetails parentColumnDetails, Integer fieldTabIndex) {
        super(parentColumnDetails, null, fieldTabIndex);
    }

    @Override
    protected VerticalLayout createMainComponentInstance() {
        return new VerticalLayout();
    }

    @Override
    protected void init() {
        manufacturingMethodFieldLabel = new LabelComponent("tradeName.detail.manufacturingMethodField",
                "required-field-label");

        manufacturingMethodFieldDescriptionLabel1 = new LabelComponent(
                "tradeName.detail.manufacturingMethodField.ferments.description1", "very-small-text");
        manufacturingMethodFieldDescriptionLabel2 = new LabelComponent(
                "tradeName.detail.manufacturingMethodField.ferments.description2", "very-small-text");
        manufacturingMethodFieldDescriptionLabel3 = new LabelComponent(
                "tradeName.detail.manufacturingMethodField.ferments.description3", "very-small-text");
        manufacturingMethodFieldDescriptionLabel4 = new LabelComponent(
                "tradeName.detail.manufacturingMethodField.ferments.description4", "very-small-text");
        manufacturingMethodFieldDescriptionLabel5 = new LabelComponent(
                "tradeName.detail.manufacturingMethodField.ferments.description5", "very-small-text");
        manufacturingMethodFieldDescriptionLabel6 = new LabelComponent(
                "tradeName.detail.manufacturingMethodField.ferments.description6", "very-small-text");
        manufacturingMethodFieldDescriptionLabel7 = new LabelComponent(
                "tradeName.detail.manufacturingMethodField.ferments.description7", "very-small-text");
        manufacturingMethodFieldDescriptionLabel8 = new LabelComponent(
                "tradeName.detail.manufacturingMethodField.ferments.description8", "very-small-text");

        manufacturingMethodField = new ManufacturingMethodField(this);
        manufacturingMethodField.setRequired(true);
    }

    @Override
    protected void addContent() {
        addComponent(manufacturingMethodFieldLabel);
        addComponent(manufacturingMethodFieldDescriptionLabel1);
        addComponent(manufacturingMethodFieldDescriptionLabel2);
        addComponent(manufacturingMethodFieldDescriptionLabel3);
        addComponent(manufacturingMethodFieldDescriptionLabel4);
        addComponent(manufacturingMethodFieldDescriptionLabel5);
        addComponent(manufacturingMethodFieldDescriptionLabel6);
        addComponent(manufacturingMethodFieldDescriptionLabel7);
        addComponent(manufacturingMethodFieldDescriptionLabel8);
        addComponent(manufacturingMethodField);
    }

    public ManufacturingMethodField getManufacturingMethodField() {
        return manufacturingMethodField;
    }

}
