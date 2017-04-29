/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.component.common.cc.detail;

import com.proximo.inci.component.AbstractInciComponentLayout;
import com.proximo.inci.component.common.HtmlLabelComponent;
import com.proximo.inci.component.common.cc.detail.fields.AbstractSaveAsDefaultCardCBLayout;
import com.proximo.inci.view.BaseView;
import com.vaadin.ui.HorizontalLayout;

public class CreditCardDetailLayout extends AbstractCreditCardDetailLayout {

    private static final String TITLE_KEY = "credit_card.detail.title";

    public CreditCardDetailLayout(BaseView parentView) {
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
        return null;
    }

    @Override
    protected AbstractFeeText createFeeText() {
        return null;
    }

    @Override
    public AbstractSaveAsDefaultCardCBLayout createSaveAsDefaultCardCBLayout() {
        return null;
    }

    @Override
    public HtmlLabelComponent createRefundPolicyText() {
        return null;
    }

    @Override
    public AbstractInciComponentLayout<HorizontalLayout> createActionButtonsLayout(BaseView parentView) {
        return null;
    }

}
