/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.admin.payment_clear.detail;

import com.proximo.inci.component.AbstractInciComponent;
import com.proximo.inci.component.util.ButtonWidth;
import com.proximo.inci.component.util.ComponentUtil;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

@SuppressWarnings("serial")
public class ClearPaymentButton extends AbstractInciComponent<Button> {

    protected AbstractPaymentClearDetailView parentView;

    public ClearPaymentButton(AbstractPaymentClearDetailView parentView) {
        this.parentView = parentView;

        build();
    }

    @Override
    protected Button createMainComponentInstance() {
        return ComponentUtil.createActionButton(parentView.getClearPaymentBtnCaptionKey(), new ClickListener() {
            @Override
            public void buttonClick(ClickEvent event) {
                parentView.clearPayment();
            }
        }, ButtonWidth.XLARGE);
    }

    @Override
    protected void init() {
    }

}
