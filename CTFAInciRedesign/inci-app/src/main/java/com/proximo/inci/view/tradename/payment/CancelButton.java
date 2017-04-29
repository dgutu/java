/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.payment;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proximo.inci.DOTradeName;
import com.proximo.inci.component.AbstractInciComponent;
import com.proximo.inci.component.util.ComponentUtil;
import com.proximo.inci.view.ViewKey;
import com.proximo.inci.view.tradename.detail.TradeNameDetailView;
import com.proximo.inci.view.tradename.detail.mode.TradeNameDetailViewMode;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

@SuppressWarnings("serial")
public class CancelButton extends AbstractInciComponent<Button> {
	
	@SuppressWarnings("unused")
	private static Logger logger = LoggerFactory.getLogger(CancelButton.class);

    private PaymentView parentView;

    public CancelButton(PaymentView parentView) {
        this.parentView = parentView;

        build();
    }

    @Override
    protected Button createMainComponentInstance() {
        return ComponentUtil.createActionButton("cancel", new ClickListener() {
            @Override
            public void buttonClick(ClickEvent event) {
                DOTradeName formTn = parentView.getFormTn();

                Map<String, Object> tnDetailViewNavigParamsMap = new HashMap<String, Object>();

                tnDetailViewNavigParamsMap
                        .put(TradeNameDetailView.MODE_NAVIG_PARAM_KEY, TradeNameDetailViewMode.UPDATE);
                tnDetailViewNavigParamsMap.put(TradeNameDetailView.FORM_TN_REC_ID_NAVIG_PARAM_KEY, formTn.recID);

                //parentView.navigateTo(ViewKey.TN_DETAIL.toString(), tnDetailViewNavigParamsMap, ViewKey.TN_SEARCH.toString());
                //logger.debug("################ Cancel Payment back URL: " + parentView.getBackView());
                parentView.navigateTo(ViewKey.TN_DETAIL.toString(), tnDetailViewNavigParamsMap, parentView.getBackView());
            }
        });
    }

    @Override
    protected void init() {
    }

}
