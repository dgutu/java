/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.button;

import com.proximo.inci.component.AbstractInciComponent;
import com.proximo.inci.view.tradename.detail.TradeNameDetailView;
import com.vaadin.ui.Button;

public abstract class TradeNameDetailViewButton extends AbstractInciComponent<Button> {
    
    protected TradeNameDetailView parentView;

    public TradeNameDetailViewButton(TradeNameDetailView parentView) {
        this.parentView = parentView;

        build();
    }
    
    @Override
    protected void init() {
    }

}
