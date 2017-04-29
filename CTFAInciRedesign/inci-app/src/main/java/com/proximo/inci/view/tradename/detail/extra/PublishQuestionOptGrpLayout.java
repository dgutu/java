/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.extra;

import com.proximo.inci.component.common.LabelComponent;
import com.vaadin.ui.VerticalLayout;

public class PublishQuestionOptGrpLayout extends TradeNameExtraDetailsComponentLayout<VerticalLayout> {

    private LabelComponent publishQuestionOptGrpLabel;
    private PublishQuestionOptGrp publishQuestionOptGrp;

    public PublishQuestionOptGrpLayout(TradeNameExtraDetails parentDetails) {
        super(parentDetails);
    }

    @Override
    protected VerticalLayout createMainComponentInstance() {
        return new VerticalLayout();
    }

    @Override
    protected void init() {
        publishQuestionOptGrpLabel = new LabelComponent("tradeName.detail.publishQuestionOptGrp");
        publishQuestionOptGrp = new PublishQuestionOptGrp(this);
    }

    @Override
    protected void addContent() {
        addComponent(publishQuestionOptGrpLabel);
        addComponent(publishQuestionOptGrp);
    }

    public PublishQuestionOptGrp getPublishQuestionOptGrp() {
        return publishQuestionOptGrp;
    }

}
