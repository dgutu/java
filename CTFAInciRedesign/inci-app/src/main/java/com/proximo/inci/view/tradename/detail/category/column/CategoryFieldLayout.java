/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.category.column;

import com.proximo.inci.component.common.CategoryField;
import com.proximo.inci.component.common.LabelComponent;
import com.proximo.inci.view.tradename.detail.category.ferments.FermentsTradeNameDetails;
import com.vaadin.ui.VerticalLayout;

public class CategoryFieldLayout extends TradeNameColumnDetailsFieldLayout<VerticalLayout> {

    private LabelComponent categoryFieldLabel;
    private CategoryField categoryField;

    public CategoryFieldLayout(TradeNameColumnDetails parentColumnDetails) {
        super(parentColumnDetails, null, null);
    }
    
    public CategoryFieldLayout(TradeNameColumnDetails parentColumnDetails, Integer fieldTabIndex) {
        super(parentColumnDetails, null, fieldTabIndex);
    }

    @Override
    protected VerticalLayout createMainComponentInstance() {
        return new VerticalLayout();
    }

    @Override
    protected void init() {
        categoryField = new CategoryField(FermentsTradeNameDetails.FORM_COLUMN_FIELD_WIDTH, null);
        categoryField.setEnabled(false);
        categoryField.setRequired(true);

        categoryFieldLabel = new LabelComponent("tradeName.detail.categoryField", "required-field-label");
    }

    @Override
    protected void addContent() {
        addComponent(categoryFieldLabel);
        addComponent(categoryField);
    }

    @Override
    public void generateContent() {
        categoryField.setValue(
                String.valueOf(getParentColumnDetails().getParentDetails().getParentView().getFormTn().categoryID));
    }

}
