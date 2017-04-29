/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail;

import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.component.AbstractInciComponent;
import com.proximo.inci.view.tradename.detail.mode.TradeNameDetailViewMode;
import com.vaadin.ui.Label;

public class ModeText extends AbstractInciComponent<Label> {

    private TradeNameDetailView parentView;

    public ModeText(TradeNameDetailView parentView) {
        this.parentView = parentView;

        build();
    }

    @Override
    protected Label createMainComponentInstance() {
        return new Label();
    }

    @Override
    protected void init() {
    }

    @Override
    public void generateContent() {
        String mStyleName;
        String mValue;
        if (TradeNameDetailViewMode.READ.equals(parentView.getMode())) {
            mStyleName = "tradename-detail-modeText-view";
            mValue = CaptionResolver.getCaption("tradeName.detail.header.modeText.view.caption");
        } else {
            // CREATE, UPDATE
            mStyleName = "tradename-detail-modeText-edit";
            mValue = CaptionResolver.getCaption("tradeName.detail.header.modeText.edit.caption");
        }

        mainComponent.setStyleName(mStyleName);
        mainComponent.setValue(mValue);
    }

}
