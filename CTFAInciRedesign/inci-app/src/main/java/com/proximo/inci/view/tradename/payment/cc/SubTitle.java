/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.payment.cc;

import com.proximo.inci.DOTradeName;
import com.proximo.inci.component.common.cc.detail.AbstractSubTitle;

public class SubTitle extends AbstractSubTitle {

    public SubTitle(PaymentByCCView parentView) {
        super(parentView);
    }

    @Override
    public void generateContent() {
        DOTradeName formTn = ((PaymentByCCView) parentView).getFormTn();
        
        mainComponent.setValue(formTn.tradeName + " (" + formTn.tnNumber + ")");
    }

}
