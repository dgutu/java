/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.admin.cc_transactions_report.result;

import com.proximo.inci.component.AbstractInciComponentLayout;
import com.proximo.inci.component.common.LabelComponent;
import com.vaadin.ui.HorizontalLayout;

public class TotalAmountLayout extends AbstractInciComponentLayout<HorizontalLayout>{
    
    private LabelComponent totalLabel;
    
    public TotalAmountLayout() {
        build();
    }

    @Override
    protected HorizontalLayout createMainComponentInstance() {
        return new HorizontalLayout();
    }

    @Override
    protected void init() {
        totalLabel = new LabelComponent();
        totalLabel.getMainComponent().addStyleName("bold-text");
    }
    
    @Override
    protected void addContent() {
        addComponent(totalLabel);
    }

    public LabelComponent getTotalLabel() {
        return totalLabel;
    }
}
