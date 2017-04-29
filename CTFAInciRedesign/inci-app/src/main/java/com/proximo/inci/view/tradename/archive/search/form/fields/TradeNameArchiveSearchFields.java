/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.archive.search.form.fields;

import com.proximo.inci.component.AbstractInciComponentLayout;
import com.proximo.inci.view.tradename.archive.search.form.TradeNameArchiveSearchForm;
import com.vaadin.ui.FormLayout;

public abstract class TradeNameArchiveSearchFields extends AbstractInciComponentLayout<FormLayout> {

    private TradeNameArchiveSearchForm parentForm;

    public TradeNameArchiveSearchFields(TradeNameArchiveSearchForm parentForm) {
        this.parentForm = parentForm;

        build();
    }

    @Override
    protected FormLayout createMainComponentInstance() {
        return new FormLayout();
    }

    @Override
    protected void init() {
        mainComponent.setSpacing(false);
    }

    public TradeNameArchiveSearchForm getParentForm() {
        return parentForm;
    }

}
