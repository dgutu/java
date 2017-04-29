/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail;

import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.common.TDate;
import com.proximo.inci.component.AbstractInciComponent;
import com.proximo.inci.view.tradename.detail.mode.TradeNameDetailViewMode;
import com.vaadin.ui.Label;

public class SubmissionStatusText extends AbstractInciComponent<Label> {

    private TradeNameDetailView parentView;

    public SubmissionStatusText(TradeNameDetailView parentView) {
        this.parentView = parentView;

        build();
    }

    @Override
    protected Label createMainComponentInstance() {
        return new Label();
    }

    @Override
    protected void init() {
        mainComponent.addStyleName("tradename-detail-submissionStatusText");
    }

    @Override
    public void generateContent() {
        String value = null;
        if (TradeNameDetailViewMode.UPDATE.equals(parentView.getMode())
                || TradeNameDetailViewMode.READ.equals(parentView.getMode())) {
            if (parentView.getFormTn().submitted) {
                value = CaptionResolver
                        .getCaption("tradeName.detail.header.submissionStatusText.submitted.caption.prefix")
                        + " "
                        + TDate.convertTDateToCol(parentView.getFormTn().submitDt) + ".";
            } else {
                value = CaptionResolver
                        .getCaption("tradeName.detail.header.submissionStatusText.notSubmitted.caption");
            }
        }

        mainComponent.setValue(value);
    }

}
