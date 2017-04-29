/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.footer;

import com.proximo.inci.component.AbstractInciComponentLayout;
import com.proximo.inci.view.tradename.detail.ModeText;
import com.proximo.inci.view.tradename.detail.SubmissionStatusText;
import com.proximo.inci.view.tradename.detail.TradeNameDetailView;
import com.vaadin.ui.VerticalLayout;

public class TradeNameDetailViewFooter extends AbstractInciComponentLayout<VerticalLayout> {

    private TradeNameDetailView parentView;

    private FooterActionButtonsAndLabelsLayout actionButtonsAndLabelsLayout;
    private SubmissionStatusText submissionStatusText;
    private ModeText modeText;

    public TradeNameDetailViewFooter(TradeNameDetailView parentView) {
        this.parentView = parentView;

        build();
    }

    @Override
    protected VerticalLayout createMainComponentInstance() {
        return new VerticalLayout();
    }

    @Override
    protected void init() {
        actionButtonsAndLabelsLayout = new FooterActionButtonsAndLabelsLayout(this);
        submissionStatusText = new SubmissionStatusText(parentView);
        modeText = new ModeText(parentView);
    }

    @Override
    protected void addContent() {
        addComponent(actionButtonsAndLabelsLayout);
        addSpace();
        addComponent(submissionStatusText);
        addSpace();
        addComponent(modeText);
    }

    public TradeNameDetailView getParentView() {
        return parentView;
    }

}
