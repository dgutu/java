/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.payment;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proximo.inci.DOTradeName;
import com.proximo.inci.DOUserCC;
import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.component.util.ComponentUtil;
import com.proximo.inci.service.security.SecurityInfo;
import com.proximo.inci.service.tradename.TradeNameService;
import com.proximo.inci.service.user_info.UserInfoService;
import com.proximo.inci.view.BaseView;
import com.proximo.inci.view.ViewKey;
import com.proximo.inci.view.tradename.payment.cc.PaymentByCCView;
import com.proximo.inci.view.tradename.payment.option.AbstractPaymentOptionView;
import com.proximo.inci.window.main.MainWindow;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.HorizontalLayout;
//import com.vaadin.ui.VerticalLayout;

public class PaymentView extends BaseView {
	
	@SuppressWarnings("unused")
	private static Logger logger = LoggerFactory.getLogger(PaymentView.class);
	
    /* Navigation parameters' keys */
    public static String FORM_TN_NAVIG_PARAM_KEY = "formTn";
    public static String BACK_VIEW = "backView";

    private String textPrivacyPolicy = "";
    		
    private static Map<String, ViewKey> paymentOptionToViewMap;
    static {
        paymentOptionToViewMap = new HashMap<String, ViewKey>();
        paymentOptionToViewMap.put("C", ViewKey.TN_PAYMENT_BY_CHECK);
        paymentOptionToViewMap.put("A", ViewKey.TN_PAYMENT_BY_WIRE);
        paymentOptionToViewMap.put("N", ViewKey.TN_PAYMENT_BY_CC);
        paymentOptionToViewMap.put("E", ViewKey.TN_PAYMENT_BY_CC);
    }

    private DOTradeName formTn;
    private DOUserCC defaultUserCreditCard;

    private HeaderTextLayout headerTextLayout;
    private AcknowledgedPolicyLayout acknowledgedPolicyLayout;
    private ApplicationFeeText applicationFeeText;
    private PaymentOptionsLayout paymentOptionsLayout;
    
    private String backView;

    public PaymentView(MainWindow mainWindow) {
        super(mainWindow, false, null);
    }

    @Override
    protected void init() {
        super.init();

        headerTextLayout = new HeaderTextLayout(this);
        acknowledgedPolicyLayout = new AcknowledgedPolicyLayout(this);
        applicationFeeText = new ApplicationFeeText(this);
        paymentOptionsLayout = new PaymentOptionsLayout(this);        
    }

    @Override
    protected void addContent() {
        super.addContent();
    }

    @Override
    public void applyNavigationParameters(Map<String, Object> navigationParameterMap) {
    	try {
	        formTn = (DOTradeName) navigationParameterMap.get(FORM_TN_NAVIG_PARAM_KEY);
	        backView = (String) navigationParameterMap.get(BACK_VIEW);
    	}
    	catch(Exception ex) {    		
    	}
        
        //logger.debug("PaymentView.backNavigateView="+backView);
        
        defaultUserCreditCard = UserInfoService.getUserDefaultCreditCard(getCurrentSecurityInfo().getUser()
                .getUserRecId());

        
        this.generateContent();
        headerTextLayout.generateContent();
        acknowledgedPolicyLayout.generateContent();
        paymentOptionsLayout.generateContent();
    }

    @Override
    public void applySecurityInfo(SecurityInfo securityInfo) {
        // PaymentView has no component for which to apply the security info
    }
    
    public void paymentOptionSelected() {
        String paymentOptionSelected = (String) paymentOptionsLayout.getPaymentOptions().getValue();
        
        ViewKey paymentOptionViewKey = paymentOptionToViewMap.get(paymentOptionSelected);
        if (paymentOptionViewKey != null) {
            Map<String, Object> paymentByCheckViewNavigParamsMap = new HashMap<String, Object>();
            paymentByCheckViewNavigParamsMap.put(AbstractPaymentOptionView.FORM_TN_NAVIG_PARAM_KEY, formTn);
            paymentByCheckViewNavigParamsMap.put(AbstractPaymentOptionView.BACK_VIEW, backView);

            if(ViewKey.TN_PAYMENT_BY_CC.equals(paymentOptionViewKey)) {
                paymentByCheckViewNavigParamsMap.put(PaymentByCCView.USER_DEFAULT_CC_NAVIG_PARAM_KEY,defaultUserCreditCard);
                paymentByCheckViewNavigParamsMap.put(PaymentByCCView.FLAG_OF_NEW_CC,paymentOptionSelected);
            }
            
            navigateTo(paymentOptionViewKey.toString(), paymentByCheckViewNavigParamsMap);
        } else {
        	showInfoMsgWindow(CaptionResolver.getCaption("select.payment"));
        }
        
    }

    public PaymentOptionsLayout getPaymentOptionsLayout() {
        return paymentOptionsLayout;
    }
    
    public DOTradeName getFormTn() {
        return formTn;
    }

    public DOUserCC getDefaultUserCreditCard() {
        return defaultUserCreditCard;
    }
    
    public String getTextPrivacyPolicy() {
    	return textPrivacyPolicy;
    }
    
    public String getBackView() {
    	return backView;
    }
    
    @Override
    public void generateContent() {
        mainComponent.removeAllComponents();
        
        // get privacy policy from db
        textPrivacyPolicy = TradeNameService.getPrivacyPolicy();

        ComponentUtil.addHtml(textPrivacyPolicy, mainComponent);
        addSpace();
        addSpace();
        addComponent(headerTextLayout, Alignment.MIDDLE_CENTER);
        addSpace();
        addComponent(acknowledgedPolicyLayout, Alignment.MIDDLE_CENTER);
        addSpace();
        
        HorizontalLayout applicationFeeTextLayout = new HorizontalLayout();
        applicationFeeTextLayout.addComponent(applicationFeeText.getMainComponent());
        mainComponent.addComponent(applicationFeeTextLayout);
        mainComponent.setComponentAlignment(applicationFeeTextLayout, Alignment.MIDDLE_CENTER);
        addSpace();
        
        addComponent(paymentOptionsLayout, Alignment.MIDDLE_CENTER);
    }
   
}
