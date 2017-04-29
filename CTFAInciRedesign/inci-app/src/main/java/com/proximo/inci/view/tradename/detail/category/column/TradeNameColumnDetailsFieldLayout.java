/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.category.column;

import com.proximo.inci.component.AbstractInciComponentLayout;
import com.vaadin.ui.AbstractOrderedLayout;

public abstract class TradeNameColumnDetailsFieldLayout<C extends AbstractOrderedLayout> extends
        AbstractInciComponentLayout<C> {

    private TradeNameColumnDetails parentColumnDetails;
    
    private String fieldHeightStr;
    private Integer fieldTabIndex;

    public TradeNameColumnDetailsFieldLayout(TradeNameColumnDetails parentColumnDetails) {
        this(parentColumnDetails, null, null);
    }
    
    public TradeNameColumnDetailsFieldLayout(TradeNameColumnDetails parentColumnDetails, String fieldHeightStr) {
        this(parentColumnDetails, fieldHeightStr, null);
    }
    
    public TradeNameColumnDetailsFieldLayout(TradeNameColumnDetails parentColumnDetails, String fieldHeightStr, Integer fieldTabIndex) {
        this.parentColumnDetails = parentColumnDetails;
        
        this.fieldHeightStr = fieldHeightStr;
        this.fieldTabIndex = fieldTabIndex;

        build();
    }
    
    public TradeNameColumnDetails getParentColumnDetails() {
        return parentColumnDetails;
    }

    public String getFieldHeightStr() {
        return fieldHeightStr;
    }

    public Integer getFieldTabIndex() {
        return fieldTabIndex;
    }

}
