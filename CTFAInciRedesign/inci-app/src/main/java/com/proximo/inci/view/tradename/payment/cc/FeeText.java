/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.payment.cc;

import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.component.common.cc.detail.AbstractFeeText;

public class FeeText extends AbstractFeeText {

    public FeeText(PaymentByCCView parentView) {
        super(parentView);
    }

    @Override
    public void init() {
        Integer tnPaymentAmount = (Integer) parentView.getApplicationProperty("tnPaymentAmount");

        mainComponent.setValue(CaptionResolver.getCaption("credit_card.detail.payment.fee_text.part1")
                + tnPaymentAmount + CaptionResolver.getCaption("credit_card.detail.payment.fee_text.part2"));
    }

}
