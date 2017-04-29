/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.admin.cc_transactions_report.form;

import com.proximo.inci.component.AbstractInciComponentLayout;
import com.proximo.inci.component.util.ComponentUtil;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.HorizontalLayout;

public class ActionButtonsLayout extends AbstractInciComponentLayout<HorizontalLayout> {

    private CCTransactionsReportForm parentForm;

    public ActionButtonsLayout(CCTransactionsReportForm parentForm) {
        this.parentForm = parentForm;

        build();
    }

    @Override
    protected HorizontalLayout createMainComponentInstance() {
        return new HorizontalLayout();
    }

    @Override
    protected void init() {
        mainComponent.setMargin(false, true, true, false);
        mainComponent.setSizeFull();

        HorizontalLayout innnerLayout = new HorizontalLayout();
        innnerLayout.setSpacing(true);

        innnerLayout.addComponent(ComponentUtil.createActionButton("print", parentForm.getParentView()
                .getPrintBtnListener()));
        innnerLayout.addComponent(ComponentUtil.createActionButton("search", parentForm.getParentView()
                .getSearchBtnListener()));        
        innnerLayout.addComponent(ComponentUtil.createActionButton("cancel", parentForm.getParentView()
                .getCancelBtnListener()));

        mainComponent.addComponent(innnerLayout);
        mainComponent.setComponentAlignment(innnerLayout, Alignment.MIDDLE_RIGHT);
    }

}
