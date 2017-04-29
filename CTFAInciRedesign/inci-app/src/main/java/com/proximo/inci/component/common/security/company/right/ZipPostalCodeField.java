/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.component.common.security.company.right;

import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.component.common.security.company.CompanyField;
import com.proximo.inci.component.common.security.company.CompanyForm;
import com.vaadin.ui.TextField;

public class ZipPostalCodeField extends CompanyField<TextField> {

    public ZipPostalCodeField(CompanyFieldsRight parentLayout) {
        super(parentLayout);
    }

    @Override
    protected TextField createMainComponentInstance() {
        return new TextField();
    }

    @Override
    protected void init() {
        mainComponent.setCaption(CaptionResolver.getCaption("component.common.zip"));
        mainComponent.setWidth(CompanyForm.FORM_TEXT_FIELD_WIDTH);
        mainComponent.setRequired(true);
    }

    @Override
    public void generateContent() {
        super.generateContent();

        String zip = getParentLayout().getParentForm().getParentLayout().getUserCompany().getZip();
        setValue(zip != null ? zip : "");
    }

    @Override
    public String getFieldDescription() {
    	return CaptionResolver.getCaption("component.common.zip.DESC");
    }

}
