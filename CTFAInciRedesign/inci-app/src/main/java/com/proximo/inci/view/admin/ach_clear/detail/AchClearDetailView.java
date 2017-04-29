/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.admin.ach_clear.detail;

import com.proximo.inci.DOUserACH;
import com.proximo.inci.service.payment.TradeNamePaymentService;
import com.proximo.inci.view.ViewKey;
import com.proximo.inci.view.admin.payment_clear.detail.AbstractPaymentClearDetailView;
import com.proximo.inci.view.admin.payment_clear.detail.AbstractPaymentClearInfoLayout;
import com.proximo.inci.view.admin.payment_clear.detail.fields.PaymentClearFields;
import com.proximo.inci.window.main.MainWindow;

public class AchClearDetailView extends AbstractPaymentClearDetailView {

    public AchClearDetailView(MainWindow mainWindow) {
        super(mainWindow, true, "view.admin.ach_clearing.detail"); // create Bank/Wire Transfer Clearing Detail page
    }

    @Override
    protected AbstractPaymentClearInfoLayout createPaymentClearInfoLayout() {
        return new AchClearInfoLayout(this);
    }

    @Override
    public ViewKey getSearchViewKey() {
        return ViewKey.ADMIN_ACH_CLEARING_SEARCH;
    }

    @Override
    public String getClearPaymentBtnCaptionKey() {
        return "view.admin.ach_clearing.detail.clear_payment_btn";
    }

    @Override
    public String getDoNotClearPaymentBtnCaptionKey() {
        return "view.admin.ach_clearing.detail.do_not_clear_payment_btn";
    }

    /* TODO this operation looks inefficient (because of the data model?). */
    @Override
    public void clearPayment() {
        DOUserACH userACH = new DOUserACH();
        
        userACH.recID = paymentRecId;
        
        DOUserACH achFromDb = TradeNamePaymentService.getUserACH(paymentRecId);
        userACH.userRecId = achFromDb.userRecId;
        
        PaymentClearFields fields = paymentClearInfoLayout.getPaymentClearFieldsLayout().getPaymentClearFields();
        
        userACH.zip = (String) fields.getZipField().getValue();
        userACH.lastName = (String) fields.getLastNameField().getValue();
        userACH.firstName = (String) fields.getFirstNameField().getValue();
        userACH.achNumber = (String) fields.getPaymentNumberField().getValue();
        userACH.countryCode = (String) fields.getCountryField().getValue();
        userACH.state = (String) fields.getStateProvinceField().getValue();
        userACH.city = (String) fields.getCityField().getValue();
        userACH.address1 = (String) fields.getAddress1Field().getValue();
        userACH.address2 = (String) fields.getAddress2Field().getValue();
        userACH.address3 = (String) fields.getAddress3Field().getValue();
        userACH.phone = (String) fields.getPhoneField().getValue();

        TradeNamePaymentService.saveACH(userACH);

        submitTnFormServiceCall();
        
        // send email to user
        sendCheckEmail();

        //navigateTo(getSearchViewKey().toString());
        navigateTo(getBackURL());
    }    
}
