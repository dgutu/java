/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.payment;

import com.proximo.inci.DOUserCC;
import com.proximo.inci.component.field.AbstractInciFieldComponent;
import com.proximo.inci.component.util.ComponentUtil;
import com.vaadin.ui.OptionGroup;

public class PaymentOptions extends AbstractInciFieldComponent<OptionGroup> {

    private PaymentOptionsLayout parentLayout;

    public PaymentOptions(PaymentOptionsLayout parentLayout) {
        this.parentLayout = parentLayout;

        build();
    }

    @Override
    protected OptionGroup createMainComponentInstance() {
        return new OptionGroup();
    }

    @Override
    protected void init() {
    }

    @Override
    public void generateContent() {
        mainComponent.removeAllItems();

        /*          
         * Please make not visible the ability for the user to pay by Wire or Check.  
         * Admin still needs their access thru Admin so they can release the applications when they receive the check or wire.
         */
        if (parentLayout.getParentView().getCurrentSecurityInfo().getUser().isAdmin())
        	ComponentUtil.addItemWithCaption(mainComponent, "C", "Pay By Check");

        String payByNewCardTxt = "Pay by Credit Card";
        DOUserCC defaultCreditCard = parentLayout.getParentView().getDefaultUserCreditCard();
        if (defaultCreditCard != null) {
            payByNewCardTxt = "Pay by New Credit Card";
            
            ComponentUtil.addItemWithCaption(mainComponent, "E",
                    "Pay by saved card ending with " + defaultCreditCard.maskCC());
        }
        
        ComponentUtil.addItemWithCaption(mainComponent, "N", payByNewCardTxt);
        
        if (parentLayout.getParentView().getCurrentSecurityInfo().getUser().isAdmin())
        	ComponentUtil.addItemWithCaption(mainComponent, "A", "Pay By Bank/Wire Transfer");
    }

    @Override
    public String getFieldDescription() {
        return "";
    }
}
