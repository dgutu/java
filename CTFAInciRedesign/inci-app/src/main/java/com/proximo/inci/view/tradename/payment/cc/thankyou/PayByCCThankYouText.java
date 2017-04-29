/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.payment.cc.thankyou;

import com.proximo.inci.DOTradeName;
import com.proximo.inci.common.TDate;
import com.proximo.inci.view.tradename.payment.option.thankyou.AbstractPaymentOptionThankYouView;
import com.proximo.inci.view.tradename.payment.option.thankyou.ThankYouText;

public class PayByCCThankYouText extends ThankYouText {

    public PayByCCThankYouText(AbstractPaymentOptionThankYouView parentView) {
        super(parentView);
    }

    @Override
    public void generateContent() {
        final DOTradeName formTn = parentView.getFormTn();
        final Integer paymentAmount = (Integer) parentView.getApplicationProperty("tnPaymentAmount");
        Long referenceId = parentView.getReferenceId();

        final String txtThankYouNote = "Your application, " + formTn.tradeName + " (" + formTn.tnNumber + "), "
                + "has been submitted.  Your credit card has been charged $" + paymentAmount + ".00.  "
                + "Please retain this email for your reference.  " + "The reference ID for this transaction is "
                + referenceId + ".";

        TDate transactionDate = TDate.rightNow();
        String dateTime = transactionDate.formatIt(TDate.DDMONTHYYYY) + " " + transactionDate.formatIt(TDate.HHMM12)
                + "<br><br>";

        //mainComponent.setValue(dateTime + txtThankYouNote + TXT_REFUND_POLICY);
        setRefundPolicyText(); 
        mainComponent.setValue(dateTime + txtThankYouNote + "<br><br>" + getRefundPolicyText());
    }
}
