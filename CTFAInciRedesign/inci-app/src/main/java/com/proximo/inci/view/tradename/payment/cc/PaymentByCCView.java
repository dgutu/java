/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.payment.cc;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proximo.inci.DOTradeName;
import com.proximo.inci.DOUserACH;
import com.proximo.inci.DOUserCC;
import com.proximo.inci.DOUserCheck;
import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.common.TDate;
import com.proximo.inci.common.TemplarUtil;
import com.proximo.inci.service.common.EmailService;
import com.proximo.inci.service.netforum.NetforumService;
import com.proximo.inci.service.payment.TradeNamePaymentService;
import com.proximo.inci.service.security.SecurityInfo;
import com.proximo.inci.service.security.user.User;
import com.proximo.inci.service.tradename.TradeNameService;
import com.proximo.inci.view.BaseView;
import com.proximo.inci.view.ViewKey;
import com.proximo.inci.view.tradename.payment.option.thankyou.AbstractPaymentOptionThankYouView;
import com.proximo.inci.view.utils.ButtonPressed;
import com.proximo.inci.window.main.MainWindow;
import com.vaadin.ui.Alignment;

public class PaymentByCCView extends BaseView {

    private static Logger logger = LoggerFactory.getLogger(PaymentByCCView.class);

    /* Navigation parameters' keys */
    public static String FORM_TN_NAVIG_PARAM_KEY = "formTn";
    public static String USER_DEFAULT_CC_NAVIG_PARAM_KEY = "defaultUserCreditCard";
    public static String FLAG_OF_NEW_CC = "flagOfNewCC";
    public static String BACK_VIEW = "backView";

    private DOTradeName formTn;
    private String backView;

    private TnPaymentCreditCardDetailLayout tnPaymentCreditCardDetailLayout;

    public PaymentByCCView(MainWindow mainWindow) {
        super(mainWindow, false, null);
    }

    @Override
    protected void init() {
        super.init();

        tnPaymentCreditCardDetailLayout = new TnPaymentCreditCardDetailLayout(this);
    }

    @Override
    protected void addContent() {
        super.addContent();

        addComponent(tnPaymentCreditCardDetailLayout, Alignment.TOP_CENTER);
    }

    @Override
    public void applyNavigationParameters(Map<String, Object> navigationParameterMap) {        
    	if (navigationParameterMap != null && navigationParameterMap.size() > 0) {    	
	    	formTn = (DOTradeName) navigationParameterMap.get(FORM_TN_NAVIG_PARAM_KEY);
	    	backView = (String) navigationParameterMap.get(BACK_VIEW);
	    	
	    	String flagOfNewCC = (String) navigationParameterMap.get(FLAG_OF_NEW_CC);
	        
	    	//logger.debug("########################## flagOfNewCC="+flagOfNewCC);
	    	
	    	// if option selected is not new cc
	    	if (!TemplarUtil.isStringNullOrEmpty(flagOfNewCC) && !flagOfNewCC.equals("N")) {
	    		tnPaymentCreditCardDetailLayout.setUserCC((DOUserCC) navigationParameterMap
	    				.get(USER_DEFAULT_CC_NAVIG_PARAM_KEY));       
	    	}
	    	else {
	    		// new CC
	    		DOUserCC newUserCC = new DOUserCC(); 
	    		tnPaymentCreditCardDetailLayout.setUserCC(newUserCC);
	    	}
	        tnPaymentCreditCardDetailLayout.generateContent();
    	}
    }

    @Override
    public void applySecurityInfo(SecurityInfo securityInfo) {
        // PaymentByCCView has no component for which to apply the security info
    }

    public void submitPayment() {
        String validationErrorStr = tnPaymentCreditCardDetailLayout.getCreditCardFieldsLayout().getCreditCardFields()
                .validate();
        if (validationErrorStr == null) {
            submitPaymentServiceCall();
        } else {
            showInfoMsgWindow(validationErrorStr);
        }
    }

    private void submitPaymentServiceCall() {
    	
        DOTradeName parentForm = formTn;        
        DOTradeName formTn2 = TradeNameService.getTradeName(parentForm.recID, getCurrentSecurityInfo().getUser().getLoginId());
        
    	if (formTn2.submitted) {
    		showInfoMsgWindow(CaptionResolver.getCaption("submitted.already"));
    	}
    	else {        
	        DOUserCC userCC = prepareUserCC();        
	        
	        Integer tnPaymentAmount = (Integer) getApplicationProperty("tnPaymentAmount");
	        
	        User currrentUser = getCurrentSecurityInfo().getUser();
	        
	        logger.debug("tnPaymentAmount="+tnPaymentAmount);
	        logger.debug("currrentUser.getLoginId="+currrentUser.getLoginId());
	        logger.debug("userCC.ccNumber="+userCC.ccNumber);
	        logger.debug("userCC.lastName="+userCC.lastName);
	        logger.debug("userCC.userRecId="+userCC.userRecId); 
	        logger.debug("formTn2.userRecId="+formTn2.userRecId);
	        
	        // checks if credit card is valid
	        /*TransactionResult transactionResult = PayFlowService.authenticate(userCC, PayFlowService.TENDER_CREDIT_CARD,
	                PayFlowService.TRXTYPE_AUTHORIZATION, tnPaymentAmount, PayFlowService.CURRENCY_US_DOLLAR,
	                "Trade Name: " + formTn.tnNumber, "Payment by " + currrentUser.getLoginId(),
	                formTn.tnNumber, "");*/
	
	        //boolean isCardValid = transactionResult.isResultValid();
	        
	        // DG 3/31 according to client the userRecID should be of the user who created/own the application and 
	        // not of the user who made the payment
	        
	        int result = NetforumService.uploadSingleTradeNamePaymentInfo2(formTn2.userRecId/*userCC.userRecId*/, formTn.tnNumber, 
	        		userCC.ccType, userCC.formatCCYearAndMonth(), userCC.ccNumber, userCC.formatCCFirstLastName(), userCC.ccCVV2);
	        
	        //int result = 1;
	        
	        //String ifvalid = CaptionResolver.getCaption("credit_card.detail.ifvalid").toUpperCase();        
	        //boolean checkIfValid = !TemplarUtil.isStringNullOrEmpty(ifvalid) && ifvalid.equals("Y");
	
	        // netforum not available
	        if (result == -1) {
	        	// send message to proximo staff
	        	//sendSpecificEmailToProximo(CaptionResolver.getCaption("credit_card.detail.netforum.not.available"));
	        	showInfoMsgWindow(CaptionResolver.getCaption("credit_card.detail.netforum.not.available"));
	        }
	        // netforum failed processing the transaction
	        else if (result == 0) {
	        	// send message to proximo staff
	        	//sendSpecificEmailToProximo(CaptionResolver.getCaption("credit_card.detail.netforum.failed"));
	        	showInfoMsgWindow(CaptionResolver.getCaption("credit_card.detail.netforum.failed"));
	        }
	        // netforum OK
	        else {
	            final long referenceId = TradeNamePaymentService.savePayment(formTn, getCurrentSecurityInfo().getUser()
	                    .getUserRecId(), new DOUserCheck(), userCC, 1, tnPaymentAmount, new DOUserACH());
	
	            formTn.isSubmitting = true;
	            formTn.submitted = true;
	            
	            TradeNameService.saveFormTnServiceCall(formTn, currrentUser.getUserRecId(), currrentUser.getLoginId(), ButtonPressed.SUBMIT.toString());
	            // update cc_export_dt
	            TradeNamePaymentService.updateCCExportDate3(formTn.recID);
	            
	            sendSpecificEmail(referenceId);
	
	            navigateToThankYouView(referenceId);
	        }
    	}
        // 
        /*userCC.CCResult = transactionResult.getResult();
        userCC.CCRespMsg = transactionResult.getResponseMessage();
        userCC.CCAuthCode = transactionResult.getAuthCode();
        userCC.CCPnref = transactionResult.getReference();
        userCC.CCCvv2Match = transactionResult.getCVVMatch();
        userCC.CCAvsAddr = transactionResult.getAvsAddress();
        userCC.CCAvsZip = transactionResult.getAvsZip();
        String origID = transactionResult.getReference();

        // actual payment
        transactionResult = PayFlowService.authenticate(userCC, PayFlowService.TENDER_CREDIT_CARD,
                PayFlowService.TRXTYPE_DELAYED_CAPTURE, tnPaymentAmount, PayFlowService.CURRENCY_US_DOLLAR,
                "Trade Name: " + formTn.tnNumber, "Payment by " + currrentUser.getLoginId(),
                formTn.tnNumber, origID);

        userCC.CCResult = transactionResult.getResult();
        userCC.CCRespMsg = transactionResult.getResponseMessage();
        userCC.CCAuthCode = transactionResult.getAuthCode();
        userCC.CCPnref = transactionResult.getReference();*/
    }

    private DOUserCC prepareUserCC() {
        DOUserCC prepareUserCC = tnPaymentCreditCardDetailLayout.prepareUserCC();

        prepareUserCC.userRecId = getCurrentSecurityInfo().getUser().getUserRecId();

        return prepareUserCC;
    }

    private void sendSpecificEmail(final long referenceId) {
        try {
            final Integer tnPaymentAmount = (Integer) getApplicationProperty("tnPaymentAmount");
            final TDate transactionDate = TDate.rightNow();
            final String dateTime = transactionDate.formatIt(TDate.DDMONTHYYYY) + " "
                    + transactionDate.formatIt(TDate.HHMM12) + "<br><br>";
            final String subject = "INCI Name Credit Card Payment";
            final String htmlMessage = "Your application, "
                    + getFormTn().tradeName
                    + " ("
                    + getFormTn().tnNumber
                    + "), "
                    + "has been submitted.  Your credit card has been charged $"
                    + tnPaymentAmount
                    + ".00.  "
                    + "Please retain this email for your reference.  "
                    + "The Reference ID for this transaction is "
                    + referenceId
                    + "."
                    + "<br><br><br><b><u>Refund Policy</u></b><br><br><br>"
                    + TradeNameService.getCMSText("PaymentTextRefundPolicy") + "<hr>";
            
                    /*+ "You have 24 hours from the time that you place your order to cancel your order "
                    + "for a partial refund.   Cancellations must be submitted in writing to "
                    + "<a href='mailto:inci@personalcarecouncil.org'>inci@personalcarecouncil.org</a>.    An administrative fee "
                    + "of $30.00 will be deducted from the amount of your refund.    Refunds will be "
                    + "processed utilizing the same payment method used to place the original order.  "
                    + "No refunds will be issued for orders cancelled more than 24 hours after the order "
                    + "has been placed.<br><br><hr>"*/;
            
            // get Privacy Policy from DB
            String privacyPolicy = TradeNameService.getPrivacyPolicy(); 
            
            EmailService.sendHtml("inci@personalcarecouncil.org", getCurrentSecurityInfo().getUser().getEmail(), subject,
                    dateTime + htmlMessage + privacyPolicy);
        } catch (Throwable t) {
            // don't interrupt processing and allow errors in sending email
            logger.error("Unable to send email", t);
        }
    }
    
    @SuppressWarnings("unused")
	private void sendSpecificEmailToProximo(String message) {
        try {
        	String from = CaptionResolver.getCaption("credit_card.detail.netforum.email.from");
        	String to = CaptionResolver.getCaption("credit_card.detail.netforum.email.to");
        	String cc1 = CaptionResolver.getCaption("credit_card.detail.netforum.email.cc1");
        	String cc2 = CaptionResolver.getCaption("credit_card.detail.netforum.email.cc2");
        	String cc3 = CaptionResolver.getCaption("credit_card.detail.netforum.email.cc3");
        	String subject = "Netforum CC processing failed";
            TDate transactionDate = TDate.rightNow();
            String dateTime = transactionDate.formatIt(TDate.DDMONTHYYYY) + " " + transactionDate.formatIt(TDate.HHMM12) + "<br><br>";
            String html = "Application, "
                    + getFormTn().tradeName
                    + " ("
                    + getFormTn().tnNumber
                    + ").<br><br>" + dateTime + "<br><br>" + message
                    + "<br><br>"; 
            	EmailService.sendHtmlWithCC(from, to, cc1, cc2, cc3, subject, html);
        } 
        catch (Throwable t) {
            // don't interrupt processing and allow errors in sending email
            logger.error("sendSpecificEmailToProximo.Unable to send email", t);
        }
    }

    private void navigateToThankYouView(Long referenceId) {
        Map<String, Object> thankYouViewNavigParamsMap = new HashMap<String, Object>();

        thankYouViewNavigParamsMap.put(AbstractPaymentOptionThankYouView.FORM_TN_NAVIG_PARAM_KEY, formTn);
        thankYouViewNavigParamsMap.put(AbstractPaymentOptionThankYouView.REF_ID_NAVIG_PARAM_KEY, referenceId);
        thankYouViewNavigParamsMap.put(AbstractPaymentOptionThankYouView.BACK_VIEW, backView);

        navigateTo(ViewKey.TN_PAYMENT_BY_CC_THANK_YOU.toString(), thankYouViewNavigParamsMap);
    }

    public DOTradeName getFormTn() {
        return formTn;
    }
    
    public String getBackView() {
    	return backView;
    }

}
