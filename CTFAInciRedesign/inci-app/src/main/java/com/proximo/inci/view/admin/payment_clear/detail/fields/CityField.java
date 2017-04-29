/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.admin.payment_clear.detail.fields;

import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.component.field.AbstractInciFieldComponent;
import com.proximo.inci.view.admin.payment_clear.detail.AbstractPaymentClearInfoLayout;
import com.vaadin.ui.TextField;

public class CityField extends AbstractInciFieldComponent<TextField> {

    @SuppressWarnings("unused")
	private AbstractPaymentClearInfoLayout paymentClearInfoLayout;

    public CityField(AbstractPaymentClearInfoLayout paymentClearInfoLayout) {
        this.paymentClearInfoLayout = paymentClearInfoLayout;

        build();
    }

    @Override
    protected TextField createMainComponentInstance() {
        return new TextField();
    }

    @Override
    protected void init() {
        mainComponent.setWidth(PaymentClearFields.FORM_FIELD_MEDIUM_WIDTH);
        mainComponent.setCaption(CaptionResolver.getCaption("view.admin.payment_clearing.detail.city"));
    }

    @Override
    public String getFieldDescription() {
        return "";
    }

}
