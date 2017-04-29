/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.extra;

import com.proximo.inci.component.common.LabelComponent;
import com.vaadin.ui.VerticalLayout;

public class InciNameTextAreaLayout extends TradeNameExtraDetailsComponentLayout<VerticalLayout> {

    private LabelComponent inciNameTextAreaLabel;
    private InciNameTextArea inciNameTextArea;

    public InciNameTextAreaLayout(TradeNameExtraDetails parentDetails) {
        super(parentDetails);
    }

    @Override
    protected VerticalLayout createMainComponentInstance() {
        return new VerticalLayout();
    }

    @Override
    protected void init() {
        inciNameTextAreaLabel = new LabelComponent("tradeName.detail.inciNameTextArea");
        inciNameTextArea = new InciNameTextArea(this);
    }

    @Override
    protected void addContent() {
    	addSpacing(13); // add additional space before "INCI name" to be in same line as "Mono ID"
        addComponent(inciNameTextAreaLabel);
        addComponent(inciNameTextArea);
    }

    public InciNameTextArea getInciNameTextArea() {
        return inciNameTextArea;
    }

}
