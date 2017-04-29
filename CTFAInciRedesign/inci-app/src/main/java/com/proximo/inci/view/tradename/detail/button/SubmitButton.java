/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.button;

import com.proximo.inci.DOTradeName;
import com.proximo.inci.component.util.ComponentUtil;
import com.proximo.inci.view.tradename.detail.TradeNameDetailView;
import com.vaadin.ui.Button;

public class SubmitButton extends TradeNameDetailViewButton {

    public SubmitButton(TradeNameDetailView parentView) {
        super(parentView);
    }

    @Override
    protected Button createMainComponentInstance() {
        return ComponentUtil.createActionButton("tradeName.detail.submitButton", parentView.getSubmitButtonListener());
    }

    @Override
    public void generateContent() {
        DOTradeName formTn = parentView.getFormTn();

        boolean enabled = true;
        /*
         * If application is on hold then user should not be able to submit the
         * application.
         */
        if (formTn.onHold || formTn.onHoldForACH) {
            enabled = false;
        } else {
        	enabled = (parentView.isEditable());
        }

        if ("Y".equals(parentView.getFormTn().is_archive))
        	setEnabled(false);
        else {
        	if (parentView.getCurrentSecurityInfo().getUser().isAdmin() && formTn.submitted && !formTn.hasOutstdComments)
        		setEnabled(false);
        	else
        		setEnabled(enabled);
        }
    }

}
