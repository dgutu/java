/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.category.column;

import com.proximo.inci.component.common.LabelComponent;
import com.vaadin.ui.VerticalLayout;

public class EmpiricalFormulaFieldLayout extends TradeNameColumnDetailsFieldLayout<VerticalLayout> {

    private LabelComponent empiricalFormulaFieldLabel;
    private EmpiricalFormulaField empiricalFormulaField;

    public EmpiricalFormulaFieldLayout(TradeNameColumnDetails parentColumnDetails) {
        super(parentColumnDetails, null, null);
    }
    
    public EmpiricalFormulaFieldLayout(TradeNameColumnDetails parentColumnDetails, Integer fieldTabIndex) {
        super(parentColumnDetails, null, fieldTabIndex);
    }

    @Override
    protected VerticalLayout createMainComponentInstance() {
        return new VerticalLayout();
    }

    @Override
    protected void init() {
        empiricalFormulaFieldLabel = new LabelComponent("view.trade_name.detail.empirical_formula");
        empiricalFormulaField = new EmpiricalFormulaField(this);
    }

    @Override
    protected void addContent() {
        addComponent(empiricalFormulaFieldLabel);
        addComponent(empiricalFormulaField);
    }

    public EmpiricalFormulaField getEmpiricalFormulaField() {
        return empiricalFormulaField;
    }

}
