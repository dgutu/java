/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.admin.check_clear.search;

import com.proximo.inci.DOList;
import com.proximo.inci.service.payment.PaymentClearSearchParams;
import com.proximo.inci.service.payment.TradeNamePaymentService;
import com.proximo.inci.view.ViewKey;
import com.proximo.inci.view.admin.payment_clear.search.AbstractPaymentClearSearchView;
import com.proximo.inci.window.main.MainWindow;

public class CheckClearSearchView extends AbstractPaymentClearSearchView {

    public CheckClearSearchView(MainWindow mainWindow) {
        super(mainWindow, true, "view.admin.check_clearing.search");
    }

    @Override
    public ViewKey getDetailViewKey() {
        return ViewKey.ADMIN_CHECK_CLEARING_DETAIL;
    }
    
    @Override
    public ViewKey getSearchViewKey() {
        return ViewKey.ADMIN_CHECK_CLEARING_SEARCH;
    }    

    @Override
    public DOList searchServiceCall(PaymentClearSearchParams searchParams) {
        return TradeNamePaymentService.getOnHoldTnForms(searchParams);
    }
}
