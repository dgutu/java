/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.payment.option.thankyou;

import com.proximo.inci.common.TemplarUtil;
import com.proximo.inci.component.AbstractInciComponent;
import com.proximo.inci.service.tradename.TradeNameService;
import com.vaadin.ui.Label;

public class ThankYouText extends AbstractInciComponent<Label> {

    protected AbstractPaymentOptionThankYouView parentView;
    
    protected String refundPolicy;

    public ThankYouText(AbstractPaymentOptionThankYouView parentView) {
        this.parentView = parentView;
        
        setRefundPolicyText();        
        
        build();
    }
    
    public ThankYouText() {
        setRefundPolicyText();        
        
        build();
    }    

    @Override
    protected Label createMainComponentInstance() {
        return new Label();
    }

    @Override
    protected void init() {
        mainComponent.setContentMode(Label.CONTENT_XHTML);
    }
    
    public void setRefundPolicyText() {
    	refundPolicy = "<b><u>Refund Policy</u></b><br><br>" + TradeNameService.getCMSText("PaymentTextRefundPolicy");    	
    }
    
    public String getRefundPolicyText() {
    	if (!TemplarUtil.isStringNullOrEmpty(refundPolicy))
    		return refundPolicy;
    	else 
    		return "";
    }    

    @Override
    public void generateContent() {
    	setRefundPolicyText(); 
        mainComponent.setValue(getRefundPolicyText());
    }    
    
}
