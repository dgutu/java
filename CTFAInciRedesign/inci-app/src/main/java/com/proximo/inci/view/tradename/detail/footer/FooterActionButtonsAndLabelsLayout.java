/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.footer;

import com.proximo.inci.component.AbstractInciComponentLayout;
import com.vaadin.ui.HorizontalLayout;

public class FooterActionButtonsAndLabelsLayout extends AbstractInciComponentLayout<HorizontalLayout> {
	
    private TradeNameDetailViewFooter parentFooter;

    private FooterActionButtonsLayout footerActionButtonsLayout;
    private FooterActionLabelsLayout footerActionLabelsLayout;

    public FooterActionButtonsAndLabelsLayout(TradeNameDetailViewFooter parentFooter) {
        this.parentFooter = parentFooter;

        build();
    }

    @Override
    protected HorizontalLayout createMainComponentInstance() {
        return new HorizontalLayout();
    }

    @Override
    protected void init() {
        mainComponent.setSpacing(true);

        footerActionButtonsLayout = new FooterActionButtonsLayout(this);
        footerActionLabelsLayout = new FooterActionLabelsLayout(this);
    }

    @Override
    protected void addContent() {
        addComponent(footerActionButtonsLayout);
        addComponent(footerActionLabelsLayout);
    }

    public TradeNameDetailViewFooter getParentFooter() {
        return parentFooter;
    }
    
    public FooterActionButtonsLayout getFooterActionButtonsLayout() {
    	return footerActionButtonsLayout;
    }
    
    public FooterActionLabelsLayout getFooterActionLabelsLayout() {
    	return footerActionLabelsLayout;
    }    
}
