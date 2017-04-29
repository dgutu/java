/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.admin.payment_clear.detail.fields;

import com.proximo.inci.DOList;
import com.proximo.inci.DOLookupValue;
import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.component.field.AbstractInciFieldComponent;
import com.proximo.inci.component.util.ComponentUtil;
import com.proximo.inci.service.common.LookupService;
import com.proximo.inci.view.admin.payment_clear.detail.AbstractPaymentClearInfoLayout;
import com.vaadin.ui.ComboBox;

public class CountryField extends AbstractInciFieldComponent<ComboBox> {

    @SuppressWarnings("unused")
	private AbstractPaymentClearInfoLayout paymentClearInfoLayout;

    public CountryField(AbstractPaymentClearInfoLayout paymentClearInfoLayout) {
        this.paymentClearInfoLayout = paymentClearInfoLayout;

        build();
    }

    @Override
    protected ComboBox createMainComponentInstance() {
        return new ComboBox();
    }

    @Override
    protected void init() {
        mainComponent.setWidth(PaymentClearFields.FORM_FIELD_LARGE_WIDTH);
        mainComponent.setCaption(CaptionResolver.getCaption("view.admin.payment_clearing.detail.country"));

        fillOptions();
    }

    private void fillOptions() {
        DOList countries = LookupService.getCountries();
        for (int i = 0; i < countries.size(); i++) {
            DOLookupValue lv = (DOLookupValue) countries.elementAt(i);
            ComponentUtil.addItemWithCaption(mainComponent, lv.keyValue, lv.keyDesc);
        }
    }

    @Override
    public String getFieldDescription() {
        return "";
    }

}
