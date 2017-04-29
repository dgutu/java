/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.admin.check_clear.detail;

//import java.util.HashMap;
//import java.util.Map;

import com.proximo.inci.DOUserCheck;
import com.proximo.inci.service.payment.TradeNamePaymentService;
import com.proximo.inci.view.ViewKey;
import com.proximo.inci.view.admin.payment_clear.detail.AbstractPaymentClearDetailView;
import com.proximo.inci.view.admin.payment_clear.detail.AbstractPaymentClearInfoLayout;
import com.proximo.inci.view.admin.payment_clear.detail.fields.PaymentClearFields;
//import com.proximo.inci.view.admin.payment_clear.search.AbstractPaymentClearSearchView;
import com.proximo.inci.window.main.MainWindow;
//import com.proximo.inci.window.subwindow.tradename.PrepareForSubmissionWindow;

public class CheckClearDetailView extends AbstractPaymentClearDetailView {

    public CheckClearDetailView(MainWindow mainWindow) {
        super(mainWindow, true, "view.admin.check_clearing.detail"); // create Check Clearing Detail view        
    }

    @Override
    protected AbstractPaymentClearInfoLayout createPaymentClearInfoLayout() {
        return new CheckClearInfoLayout(this);
    }

    @Override
    public ViewKey getSearchViewKey() {
        return ViewKey.ADMIN_CHECK_CLEARING_SEARCH;
    }

    @Override
    public String getClearPaymentBtnCaptionKey() {
        return "view.admin.check_clearing.detail.clear_payment_btn";
    }

    @Override
    public String getDoNotClearPaymentBtnCaptionKey() {
        return "view.admin.check_clearing.detail.do_not_clear_payment_btn";
    }

    /* clear payment */
    @Override
    public void clearPayment() {
        DOUserCheck userCheck = new DOUserCheck();

        userCheck.recID = paymentRecId;        

        DOUserCheck checkFromDb = TradeNamePaymentService.getUserCheck(paymentRecId);
        userCheck.userRecId = checkFromDb.userRecId;

        PaymentClearFields fields = paymentClearInfoLayout.getPaymentClearFieldsLayout().getPaymentClearFields();

        userCheck.checkNumber = (String) fields.getPaymentNumberField().getValue();
        userCheck.firstName = (String) fields.getFirstNameField().getValue();
        userCheck.lastName = (String) fields.getLastNameField().getValue();                
        userCheck.address1 = (String) fields.getAddress1Field().getValue();
        userCheck.address2 = (String) fields.getAddress2Field().getValue();
        userCheck.address3 = (String) fields.getAddress3Field().getValue();
        userCheck.city = (String) fields.getCityField().getValue();
        userCheck.state = (String) fields.getStateProvinceField().getValue();
        userCheck.zip = (String) fields.getZipField().getValue();
        userCheck.countryCode = (String) fields.getCountryField().getValue();        
        userCheck.phone = (String) fields.getPhoneField().getValue();

        // save check payment information
        TradeNamePaymentService.saveCheck(userCheck);

        // submit application trade information
        submitTnFormServiceCall();
        
        // send email to user
        sendCheckEmail();        
        
        //navigateTo(getSearchViewKey().toString());
        navigateTo(getBackURL());
    }

}
