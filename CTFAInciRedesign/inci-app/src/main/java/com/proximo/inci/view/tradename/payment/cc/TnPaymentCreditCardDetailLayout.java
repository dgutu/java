/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.payment.cc;

import com.proximo.inci.component.AbstractInciComponentLayout;
import com.proximo.inci.component.common.HtmlLabelComponent;
import com.proximo.inci.component.common.cc.detail.AbstractCreditCardDetailLayout;
import com.proximo.inci.component.common.cc.detail.AbstractFeeText;
import com.proximo.inci.component.common.cc.detail.AbstractSubTitle;
import com.proximo.inci.component.common.cc.detail.fields.AbstractSaveAsDefaultCardCBLayout;
import com.proximo.inci.view.BaseView;
import com.vaadin.ui.HorizontalLayout;

public class TnPaymentCreditCardDetailLayout extends AbstractCreditCardDetailLayout {

    private static final String TITLE_KEY = "credit_card.detail.payment.title";    


    public TnPaymentCreditCardDetailLayout(PaymentByCCView parentView) {
        super(parentView);
    }

    @Override
    protected void init() {
        super.init();
    }

    @Override
    protected void addContent() {
        super.addContent();
    }

    @Override
    protected String getTitleKey() {
        return TITLE_KEY;
    }

    @Override
    protected AbstractSubTitle createSubTitle() {
        return new SubTitle((PaymentByCCView) parentView);
    }

    @Override
    protected AbstractFeeText createFeeText() {
        return new FeeText((PaymentByCCView) parentView);
    }

    @Override
    public AbstractSaveAsDefaultCardCBLayout createSaveAsDefaultCardCBLayout() {
        return new SaveAsDefaultCardCBLayout(this);
    }

    @Override
    public HtmlLabelComponent createRefundPolicyText() {
        return new HtmlLabelComponent("");
    }

    @Override
    public AbstractInciComponentLayout<HorizontalLayout> createActionButtonsLayout(BaseView parentView) {
        return new ActionButtonsLayout((PaymentByCCView) parentView);
    }    
    
    @Override
    public void generateContent() {
    	super.generateContent();
    }

    
}
