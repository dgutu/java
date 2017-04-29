/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.archive.search.table.legend;

import com.vaadin.ui.CheckBox;
import com.proximo.inci.component.AbstractInciComponentLayout;
import com.proximo.inci.view.tradename.archive.search.AbstractTradeNameArchiveView;
import com.vaadin.ui.HorizontalLayout;


public abstract class AbstractSearchResultsTableLegend extends AbstractInciComponentLayout<HorizontalLayout> {

    protected AbstractTradeNameArchiveView parentView;
	public CheckBox selectAllCheckBox;
    
    public AbstractSearchResultsTableLegend(AbstractTradeNameArchiveView parentView) {
        this.parentView = parentView;
        
        build();
    }

    @Override
    protected HorizontalLayout createMainComponentInstance() {
        return new HorizontalLayout();
    }

    @Override
    protected void init() {
        mainComponent.setSizeFull();
    }
}
