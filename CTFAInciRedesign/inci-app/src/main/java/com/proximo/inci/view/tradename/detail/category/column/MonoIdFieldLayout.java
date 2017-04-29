/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.category.column;

import com.proximo.inci.component.common.LabelComponent;
import com.vaadin.ui.VerticalLayout;

public class MonoIdFieldLayout extends TradeNameColumnDetailsFieldLayout<VerticalLayout> {

    private LabelComponent monoIdFieldLabel;
    private MonoIdField monoIdField;

    public MonoIdFieldLayout(TradeNameColumnDetails parentColumnDetails) {
        super(parentColumnDetails, null, null);
    }

    public MonoIdFieldLayout(TradeNameColumnDetails parentColumnDetails, Integer fieldTabIndex) {
        super(parentColumnDetails, null, fieldTabIndex);
    }

    @Override
    protected VerticalLayout createMainComponentInstance() {
        return new VerticalLayout();
    }

    @Override
    protected void init() {
        mainComponent.setHeight("88px");

        monoIdFieldLabel = new LabelComponent("tradeName.detail.monoIdField");
        monoIdFieldLabel.setAdminComponent(true);

        monoIdField = new MonoIdField(this);
        monoIdField.setAdminComponent(true);
    }

    @Override
    protected void addContent() {
        addComponent(monoIdFieldLabel);
        addComponent(monoIdField);
    }

    public MonoIdField getMonoIdField() {
        return monoIdField;
    }

}
