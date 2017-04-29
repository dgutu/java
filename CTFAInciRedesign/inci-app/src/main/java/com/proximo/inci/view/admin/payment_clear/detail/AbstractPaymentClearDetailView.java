/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.admin.payment_clear.detail;

import java.util.Map;
import java.util.Vector;

import javax.mail.MessagingException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proximo.inci.DOTradeName;
import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.service.common.EmailService;
import com.proximo.inci.service.security.user.User;
import com.proximo.inci.service.tradename.TradeNameService;
import com.proximo.inci.view.BaseView;
import com.proximo.inci.view.ViewKey;
import com.proximo.inci.view.utils.ButtonPressed;
import com.proximo.inci.window.main.MainWindow;

public abstract class AbstractPaymentClearDetailView extends BaseView {	
	
	private static Logger logger = LoggerFactory.getLogger(AbstractPaymentClearDetailView.class);
	
	public static final String PAYMENT_REC_ID_NAVIG_PARAM_KEY = "paymentRecId";
    public static final String TN_REC_ID_NAVIG_PARAM_KEY = "tnRecId";
    public static final String TRADE_NUMBER = "tradeNumber";    

    protected Long paymentRecId;
    protected Long tnRecId;
    protected String tradeNumber;
    
    // captionKey to identify which page is displayed "Check Clearing" or "Bank/Wire Transfer Clearing"
    protected String captionKey;

    protected AbstractPaymentClearInfoLayout paymentClearInfoLayout;

    public AbstractPaymentClearDetailView(MainWindow mainWindow, boolean addCaption, String captionKey) {    	
        super(mainWindow, addCaption, captionKey);
        this.captionKey = captionKey;
    }

    public abstract ViewKey getSearchViewKey();

    protected abstract AbstractPaymentClearInfoLayout createPaymentClearInfoLayout();

    public abstract String getClearPaymentBtnCaptionKey();

    public abstract String getDoNotClearPaymentBtnCaptionKey();

    public abstract void clearPayment();

    @Override
    protected void init() {
        super.init();

        paymentClearInfoLayout = createPaymentClearInfoLayout();
    }

    @Override
    protected void addContent() {
        super.addContent();

        addComponent(paymentClearInfoLayout);
    }

    @Override
    public void applyNavigationParameters(Map<String, Object> navigationParameterMap) {    	
    	if (navigationParameterMap != null && navigationParameterMap.size() > 0) {    	
	        paymentRecId = (Long) navigationParameterMap.get(PAYMENT_REC_ID_NAVIG_PARAM_KEY);
	        tnRecId = (Long) navigationParameterMap.get(TN_REC_ID_NAVIG_PARAM_KEY);
	        tradeNumber = (String) navigationParameterMap.get(TRADE_NUMBER);
	        
	        // set new caption to Check Clearing Detail page        
	        setViewCaption(CaptionResolver.getCaption(this.captionKey) + " (Application No. " + tradeNumber + ")");        
    	}

        // clear all inputs from Check Clearing Detail page
        paymentClearInfoLayout.getPaymentClearFieldsLayout().getPaymentClearFields().Clear();    	
    }

    protected void submitTnFormServiceCall() {
        DOTradeName tn = TradeNameService.getTradeName(tnRecId, getCurrentSecurityInfo().getUser().getLoginId());

        tn.isSubmitting = true;
        tn.submitted = true;
        
        //User user = SecurityService.findUserByRecId(tn.userRecId);

        @SuppressWarnings("rawtypes")
		Vector vector = TradeNameService.saveFormTnServiceCall(tn, 
															   tn.userRecId, // cst_key from trade_name 
															   getCurrentSecurityInfo().getUser().getLoginId(), // modified by user /*user.getLoginId()*/ 
															   ButtonPressed.SUBMIT.toString());

        
        int saveResult = ((Integer) vector.elementAt(2)).intValue();

        // check the result of save_trade_name SP 
        if (saveResult == -3) {
        	logger.debug("AbstractPaymentClearDetailView.submitTnFormServiceCall: ");
        	logger.debug("Database error, TRADE_NAME_MGMT.SAVE_TRADE_NAME: -3 !");
        	logger.debug("tnRecId=" + tnRecId);
        	logger.debug("tn.recID=" + tn.recID);
        	logger.debug("tn.userRecId=" + tn.userRecId);
        	logger.debug("tn.tnNumber=" + tn.tnNumber);        	
        	showWarningMsg("Database error, TRADE_NAME_MGMT.SAVE_TRADE_NAME: -3 !");
        }
    }
    
    public String getCaptioKey() {
    	return this.captionKey;
    }
    
    public void sendCheckEmail() {
    	String url = getApplication().getURL().toString(); 
    	User user = getCurrentSecurityInfo().getUser();
        String userEmail = user.getEmail();
        DOTradeName tn = TradeNameService.getTradeName(tnRecId, getCurrentSecurityInfo().getUser().getLoginId());
        String subject = "INCI Name Application " + tn.tnNumber;
        String htmlMessage = "Your payment has been received and your application has been submitted. For further details on the INCI process, please refer to the <a href=\"" + url + "html/ctfa-process.jpg\">INCI Application Review Process flow chart</a>.";
        try {
			EmailService.sendHtml(CaptionResolver.getCaption("credit_card.detail.netforum.email.from"), userEmail, subject, htmlMessage);
		} catch (MessagingException e) {
			e.printStackTrace();
		}
    }    

}
