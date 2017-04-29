/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.payment.wire.thankyou;

import com.proximo.inci.view.tradename.payment.option.thankyou.AbstractPaymentOptionThankYouView;
import com.proximo.inci.view.tradename.payment.option.thankyou.ThankYouText;
import com.proximo.inci.window.main.MainWindow;

public class PayByWireThankYouView extends AbstractPaymentOptionThankYouView {

    public PayByWireThankYouView(MainWindow mainWindow) {
        super(mainWindow, false, null);
    }

    @Override
    public ThankYouText createThankYouText() {
        return new PayByWireThankYouText(this);
    }

}
