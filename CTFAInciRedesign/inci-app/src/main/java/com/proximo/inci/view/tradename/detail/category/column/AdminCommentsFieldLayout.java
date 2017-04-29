/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.category.column;

import com.proximo.inci.component.common.LabelComponent;
import com.vaadin.ui.VerticalLayout;

public class AdminCommentsFieldLayout extends TradeNameColumnDetailsFieldLayout<VerticalLayout> {

    private LabelComponent adminCommentsFieldLabel;
    private LabelComponent adminCommentsFieldDescriptionLabel1;
    private LabelComponent adminCommentsFieldDescriptionLabel2;
    private LabelComponent adminCommentsFieldDescriptionLabel3;
    private LabelComponent adminCommentsFieldDescriptionLabel4;
    private AdminCommentsField adminCommentsField;

    public AdminCommentsFieldLayout(TradeNameColumnDetails parentColumnDetails) {
        super(parentColumnDetails, null, null);
    }
    
    public AdminCommentsFieldLayout(TradeNameColumnDetails parentColumnDetails, Integer fieldTabIndex) {
        super(parentColumnDetails, null, fieldTabIndex);
    }

    @Override
    protected VerticalLayout createMainComponentInstance() {
        return new VerticalLayout();
    }

    @Override
    protected void init() {
        setAdminComponent(true);

        adminCommentsFieldLabel = new LabelComponent("tradeName.detail.adminCommentsField");

        adminCommentsFieldDescriptionLabel1 = new LabelComponent("tradeName.detail.adminCommentsField.description1",
                "very-small-text");
        adminCommentsFieldDescriptionLabel2 = new LabelComponent("tradeName.detail.adminCommentsField.description2",
                "very-small-text");
        adminCommentsFieldDescriptionLabel3 = new LabelComponent("tradeName.detail.adminCommentsField.description3",
                "very-small-text");
        adminCommentsFieldDescriptionLabel4 = new LabelComponent("tradeName.detail.adminCommentsField.description4",
                "very-small-text");

        adminCommentsField = new AdminCommentsField(this);
    }

    @Override
    protected void addContent() {
        addComponent(adminCommentsFieldLabel);
        addComponent(adminCommentsFieldDescriptionLabel1);
        addComponent(adminCommentsFieldDescriptionLabel2);
        addComponent(adminCommentsFieldDescriptionLabel3);
        addComponent(adminCommentsFieldDescriptionLabel4);
        addComponent(adminCommentsField);
    }

    public AdminCommentsField getAdminCommentsField() {
        return adminCommentsField;
    }

}
