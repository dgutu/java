/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.category;

import com.proximo.inci.component.AbstractInciComponentLayout;
import com.proximo.inci.view.tradename.detail.TradeNameDetailView;
import com.vaadin.ui.HorizontalLayout;

public abstract class TradeNameDetails extends AbstractInciComponentLayout<HorizontalLayout> {

    public static final String FORM_COLUMN_FIELD_WIDTH = "298px";
    public static final int FORM_SPACING_PX = 3;
    public static final int DEFAULT_LABEL_HEIGHT_PX = 18;
    public static final int DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX = 14;    
    public static final int FORM_COLUMN_TEXTAREA_SMALL_HEIGHT_PX = 70;
    public static final int DESCR_LABL_GEIGHT_PX = 13;
    public static final String FORM_COLUMN_TEXTAREA_MEDIUM_HEIGHT = "110px";

    protected TradeNameDetailView parentView;

    public TradeNameDetails(TradeNameDetailView parentView) {
        this.parentView = parentView;

        build();
    }

    @Override
    protected HorizontalLayout createMainComponentInstance() {
        return new HorizontalLayout();
    }

    /**
     * Based on UI components values sets attribute values in formTn, which is
     * an attribute of parentView (TradeNameDetailView).
     */
    public abstract void prepareFormTn();
    
    public abstract boolean areFieldsModified();

    public TradeNameDetailView getParentView() {
        return parentView;
    }   
}
