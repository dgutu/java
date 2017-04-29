/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.payment;

import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.component.field.AbstractInciFieldComponent;
import com.vaadin.data.Property;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.ui.CheckBox;

@SuppressWarnings("serial")
public class AcknowledgedPolicy extends AbstractInciFieldComponent<CheckBox> {

    private AcknowledgedPolicyLayout parentLayout;

    public AcknowledgedPolicy(AcknowledgedPolicyLayout parentLayout) {
        this.parentLayout = parentLayout;

        build();
    }

    @Override
    protected CheckBox createMainComponentInstance() {
        return new CheckBox();
    }

    @Override
    protected void init() {
        mainComponent.setCaption(CaptionResolver.getCaption("payment.acknowledgedPolicy"));

        mainComponent.setImmediate(true);

        mainComponent.addListener(new Property.ValueChangeListener() {
            @Override
            public void valueChange(ValueChangeEvent event) {               
            	parentLayout.getParentView().getPaymentOptionsLayout().getPaymentOptions().setEnabled((Boolean) getValue());            	
                parentLayout.getParentView().getPaymentOptionsLayout().getActionButtonsLayout().getContinueButton().setEnabled((Boolean) getValue());
            }
        });
    }
    
    @Override
    public void generateContent() {
        setValue(false);
    	parentLayout.getParentView().getPaymentOptionsLayout().getPaymentOptions().setEnabled((Boolean) getValue());            	
        parentLayout.getParentView().getPaymentOptionsLayout().getActionButtonsLayout().getContinueButton().setEnabled((Boolean) getValue());        
    }

    @Override
    public String getFieldDescription() {
        return "";
    }
}
