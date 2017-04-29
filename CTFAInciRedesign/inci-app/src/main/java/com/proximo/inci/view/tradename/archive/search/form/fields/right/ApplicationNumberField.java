/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.archive.search.form.fields.right;

import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.component.field.AbstractInciFieldComponent;
import com.proximo.inci.view.tradename.archive.search.form.TradeNameArchiveSearchForm;
import com.vaadin.ui.TextField;

public class ApplicationNumberField extends AbstractInciFieldComponent<TextField> {

    public ApplicationNumberField() {
        build();
    }

    @Override
    protected TextField createMainComponentInstance() {
        return new TextField();
    }

    @Override
    protected void init() {
        mainComponent.setCaption(CaptionResolver.getCaption("view.trade_name.archive.search.app_no"));
        mainComponent.setWidth(TradeNameArchiveSearchForm.FORM_TEXT_FIELD_WIDTH);
    }

    @Override
    public String getFieldDescription() {
        return "";
    }

}