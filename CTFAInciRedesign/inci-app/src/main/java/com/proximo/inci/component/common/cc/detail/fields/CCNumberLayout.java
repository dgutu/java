/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.component.common.cc.detail.fields;

import com.proximo.inci.DOUserCC;
import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.common.TemplarUtil;
import com.proximo.inci.component.AbstractInciComponentLayout;
import com.proximo.inci.component.common.LabelComponent;
import com.proximo.inci.component.common.cc.detail.AbstractCreditCardDetailLayout;
import com.vaadin.ui.VerticalLayout;

public class CCNumberLayout extends AbstractInciComponentLayout<VerticalLayout> {

    private AbstractCreditCardDetailLayout creditCardDetailLayout;

    private CCNumberField ccNumberField;
    private LabelComponent creditCardMaskText;

    public CCNumberLayout(AbstractCreditCardDetailLayout creditCardDetailLayout) {
        this.creditCardDetailLayout = creditCardDetailLayout;

        build();
    }

    @Override
    protected VerticalLayout createMainComponentInstance() {
        return new VerticalLayout();
    }
    
	@Override
    protected void init() {
        mainComponent.setCaption(CaptionResolver.getCaption("credit_card.detail.number"));
        mainComponent.addStyleName("required-field");
        ccNumberField = new CCNumberField(this);
        creditCardMaskText = new LabelComponent();
    }

    @Override
    protected void addContent() {
        addComponent(ccNumberField);
        addComponent(creditCardMaskText);
    }

    @Override
    public void generateContent() {
        ccNumberField.generateContent();
        generateContentForCCMaskText();
    }

    private void generateContentForCCMaskText() {
        String newValue = null;

        DOUserCC defaultUserCreditCard = creditCardDetailLayout.getUserCC();
        if (defaultUserCreditCard != null) {
            newValue = defaultUserCreditCard.maskCC();
        }

        creditCardMaskText.setValue(newValue);        
        
        if (TemplarUtil.isObjNullOrEmpty(creditCardMaskText.getMainComponent().getValue()))
        	ccNumberField.setRequired(true);
        else
        	ccNumberField.setRequired(false);
    }

    public AbstractCreditCardDetailLayout getCreditCardDetailLayout() {
        return creditCardDetailLayout;
    }

    public CCNumberField getCcNumberField() {
        return ccNumberField;
    }
    
    public LabelComponent getCCMaskText() {
    	return creditCardMaskText;
    }    
}
