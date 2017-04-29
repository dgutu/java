/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.category.column;

import com.proximo.inci.component.common.LabelComponent;
import com.vaadin.ui.VerticalLayout;

public class UserRespToCommFieldLayout extends TradeNameColumnDetailsFieldLayout<VerticalLayout> {

    private LabelComponent userRespToCommFieldLabel;
    private LabelComponent userRespToCommFieldDescriptionLabel1;
    private LabelComponent userRespToCommFieldDescriptionLabel2;
    private LabelComponent userRespToCommFieldDescriptionLabel3;
    private UserRespToCommField userRespToCommField;

    public UserRespToCommFieldLayout(TradeNameColumnDetails parentColumnDetails) {
        super(parentColumnDetails, null, null);
    }
    
    public UserRespToCommFieldLayout(TradeNameColumnDetails parentColumnDetails, Integer fieldTabIndex) {
        super(parentColumnDetails, null, fieldTabIndex);
    }

    @Override
    protected VerticalLayout createMainComponentInstance() {
        return new VerticalLayout();
    }

    @Override
    protected void init() {
        userRespToCommFieldLabel = new LabelComponent("tradeName.detail.userRespToCommField");

        userRespToCommFieldDescriptionLabel1 = new LabelComponent("tradeName.detail.userRespToCommField.description1",
                "very-small-text");
        userRespToCommFieldDescriptionLabel2 = new LabelComponent("tradeName.detail.userRespToCommField.description2",
                "very-small-text");
        userRespToCommFieldDescriptionLabel3 = new LabelComponent("tradeName.detail.userRespToCommField.description3",
                "very-small-text");

        userRespToCommField = new UserRespToCommField(this);
    }

    @Override
    protected void addContent() {
        addComponent(userRespToCommFieldLabel);
        addComponent(userRespToCommFieldDescriptionLabel1);
        addComponent(userRespToCommFieldDescriptionLabel2);
        addComponent(userRespToCommFieldDescriptionLabel3);
        addComponent(userRespToCommField);
    }

    public UserRespToCommField getUserRespToCommField() {
        return userRespToCommField;
    }

}
