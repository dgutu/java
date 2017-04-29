/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.category.column;

import com.proximo.inci.view.tradename.detail.category.TradeNameDetails;
import com.vaadin.ui.TextArea;

@SuppressWarnings("serial")
public class TradeNameColumnDetailsTextArea extends TextArea {

    public TradeNameColumnDetailsTextArea(final TradeNameColumnDetailsFieldLayout<?> parentLayout) {
        this(null, parentLayout);
    }

    public TradeNameColumnDetailsTextArea(String height, final TradeNameColumnDetailsFieldLayout<?> parentLayout) {
        if (height != null) {
            setHeight(height);
        }
        addStyleName("description");
        setWidth(TradeNameDetails.FORM_COLUMN_FIELD_WIDTH);
        setMaxLength(4000);
    }

}
