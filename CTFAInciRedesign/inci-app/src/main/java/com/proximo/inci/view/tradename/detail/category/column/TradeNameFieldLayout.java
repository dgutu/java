/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.category.column;

import com.proximo.inci.component.common.LabelComponent;
import com.vaadin.ui.VerticalLayout;

public class TradeNameFieldLayout extends TradeNameColumnDetailsFieldLayout<VerticalLayout> {

    private LabelComponent tradeNameFieldLabel;
    private LabelComponent tradeNameFieldDescriptionLabel1;
    private LabelComponent tradeNameFieldDescriptionLabel2;
    private LabelComponent tradeNameFieldDescriptionLabel3;
    private TradeNameField tradeNameField;    

    public TradeNameFieldLayout(TradeNameColumnDetails parentColumnDetails) {
        super(parentColumnDetails, null, null);
    }
    
    public TradeNameFieldLayout(TradeNameColumnDetails parentColumnDetails, Integer fieldTabIndex) {
        super(parentColumnDetails, null, fieldTabIndex);
    }    

    @Override
    protected VerticalLayout createMainComponentInstance() {
        return new VerticalLayout();
    }

    @Override
    protected void init() {
        tradeNameField = new TradeNameField(this);
        tradeNameFieldLabel = new LabelComponent("tradeName.detail.tradeNameField", "required-field-label");
        tradeNameFieldDescriptionLabel1 = new LabelComponent("tradeName.detail.tradeNameField.description1", "very-small-text");
        tradeNameFieldDescriptionLabel2 = new LabelComponent("tradeName.detail.tradeNameField.description2", "very-small-text");
        tradeNameFieldDescriptionLabel3 = new LabelComponent("tradeName.detail.tradeNameField.description3", "very-small-text");
    }

    @Override
    protected void addContent() {
        addComponent(tradeNameFieldLabel);
        addComponent(tradeNameFieldDescriptionLabel1);
        addComponent(tradeNameFieldDescriptionLabel2);
        addComponent(tradeNameFieldDescriptionLabel3);
        addComponent(tradeNameField);
    }

    public TradeNameField getTradeNameField() {
        return tradeNameField;
    }

}
