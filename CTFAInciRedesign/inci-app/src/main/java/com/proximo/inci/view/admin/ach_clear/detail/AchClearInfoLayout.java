/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.admin.ach_clear.detail;

import com.proximo.inci.view.admin.payment_clear.detail.AbstractPaymentClearInfoLayout;

public class AchClearInfoLayout extends AbstractPaymentClearInfoLayout {

    public AchClearInfoLayout(AchClearDetailView parentView) {
        super(parentView);
    }

    @Override
    public String getTitleKey() {
        return "view.admin.ach_clearing.detail.info_layout";
    }

    @Override
    public String getNumberFieldCaptionKey() {
        return "view.admin.ach_clearing.detail.payment_number";
    }

}
