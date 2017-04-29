/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.payment.option.thankyou;

import java.util.Map;

import com.proximo.inci.DOTradeName;
import com.proximo.inci.service.security.SecurityInfo;
import com.proximo.inci.view.BaseView;
import com.proximo.inci.window.main.MainWindow;

public abstract class AbstractPaymentOptionThankYouView extends BaseView {

    /* Navigation parameters' keys */
    public static String FORM_TN_NAVIG_PARAM_KEY = "formTn";
    public static String REF_ID_NAVIG_PARAM_KEY = "referenceId";
    public static String BACK_VIEW = "backView";

    private DOTradeName formTn;
    private Long referenceId;
    private String backView;

    private ThankYouLayout thankYouLayout;

    public AbstractPaymentOptionThankYouView(MainWindow mainWindow, boolean addCaption, String captionKey) {
        super(mainWindow, false, null);
    }

    public abstract ThankYouText createThankYouText();

    @Override
    protected void init() {
        super.init();

        thankYouLayout = new ThankYouLayout(this);
    }

    @Override
    protected void addContent() {
        super.addContent();

        addComponent(thankYouLayout);
    }

    @Override
    public void applyNavigationParameters(Map<String, Object> navigationParameterMap) {
    	try {
    		formTn = (DOTradeName) navigationParameterMap.get(FORM_TN_NAVIG_PARAM_KEY);
    		referenceId = (Long) navigationParameterMap.get(REF_ID_NAVIG_PARAM_KEY);
    		backView = (String) navigationParameterMap.get(BACK_VIEW);
    	}
    	catch(Exception ex) {    		
    	}

        thankYouLayout.generateContent();
    }

    @Override
    public void applySecurityInfo(SecurityInfo securityInfo) {
        // AbstractPaymentOptionThankYouView has no component for which to apply
        // the security info
    }

    public DOTradeName getFormTn() {
        return formTn;
    }

    public Long getReferenceId() {
        return referenceId;
    }

    public String getThankYouText() {
    	return thankYouLayout.getThankYouText();
    }
    
    public String getBackView() {
    	return backView;
    }
}
