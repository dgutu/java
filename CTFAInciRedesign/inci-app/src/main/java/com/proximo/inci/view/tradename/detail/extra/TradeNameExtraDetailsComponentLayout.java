/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.extra;

import com.proximo.inci.component.AbstractInciComponentLayout;
import com.vaadin.ui.AbstractOrderedLayout;

public abstract class TradeNameExtraDetailsComponentLayout<C extends AbstractOrderedLayout> extends
        AbstractInciComponentLayout<C> {

    private TradeNameExtraDetails parentDetails;

    public TradeNameExtraDetailsComponentLayout(TradeNameExtraDetails parentDetails) {
        this.parentDetails = parentDetails;

        build();
    }

    public TradeNameExtraDetails getParentDetails() {
        return parentDetails;
    }
    
}
