/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.payment.option;

import java.util.HashMap;
import java.util.Map;

import com.proximo.inci.component.AbstractInciComponent;
import com.proximo.inci.component.util.ButtonWidth;
import com.proximo.inci.component.util.ComponentUtil;
import com.proximo.inci.view.ViewKey;
import com.proximo.inci.view.tradename.payment.PaymentView;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

@SuppressWarnings("serial")
public class ChangePaymentButton extends AbstractInciComponent<Button> {

    private AbstractPaymentOptionView parentView;

    public ChangePaymentButton(AbstractPaymentOptionView parentView) {
        this.parentView = parentView;

        build();
    }

    @Override
    protected Button createMainComponentInstance() {
        return ComponentUtil.createActionButton("payment.option.changePaymentBtn", new ClickListener() {
            @Override
            public void buttonClick(ClickEvent event) {
                Map<String, Object> paymentViewNavigationParamsMap = new HashMap<String, Object>();
                paymentViewNavigationParamsMap.put(PaymentView.FORM_TN_NAVIG_PARAM_KEY, parentView.getFormTn());
                paymentViewNavigationParamsMap.put(PaymentView.BACK_VIEW, parentView.getBackView());
                parentView.navigateTo(ViewKey.TN_PAYMENT.toString(), paymentViewNavigationParamsMap);
            }
        }, ButtonWidth.XLARGE);
    }

    @Override
    protected void init() {
    }

}
