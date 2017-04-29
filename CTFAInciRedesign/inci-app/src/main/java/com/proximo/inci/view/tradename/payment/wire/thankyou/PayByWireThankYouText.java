/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.payment.wire.thankyou;

import com.proximo.inci.DOTradeName;
import com.proximo.inci.common.TDate;
import com.proximo.inci.view.tradename.payment.option.thankyou.AbstractPaymentOptionThankYouView;
import com.proximo.inci.view.tradename.payment.option.thankyou.ThankYouText;

public class PayByWireThankYouText extends ThankYouText {

    public PayByWireThankYouText(AbstractPaymentOptionThankYouView parentView) {
        super(parentView);
    }

    @Override
    public void generateContent() {
        final DOTradeName formTn = parentView.getFormTn();
        Integer paymentAmount = (Integer) parentView.getApplicationProperty("tnPaymentAmount")
                + (Integer) parentView.getApplicationProperty("tnAchPaymentAmount");
        Long referenceId = parentView.getReferenceId();

        final String txtThankYouNote = "Your application, " + formTn.tradeName + " (" + formTn.tnNumber + "), "
                + "has been saved, but not submitted.  Once we receive your bank/wire transfer for $" + paymentAmount
                + ".00, your application will be submitted and processed by the Personal Care Products Council.  "
                + "Please retain this email for your reference. " + "The Reference ID for this transaction is "
                + referenceId + ".";

        TDate transactionDate = TDate.rightNow();
        String dateTime = transactionDate.formatIt(TDate.DDMONTHYYYY) + " " + transactionDate.formatIt(TDate.HHMM12)
                + "<br><br>";

        //mainComponent.setValue(dateTime + txtThankYouNote + TXT_REFUND_POLICY);
        setRefundPolicyText(); 
        mainComponent.setValue(dateTime + txtThankYouNote + "<br><br>" + getRefundPolicyText());
    }
}
