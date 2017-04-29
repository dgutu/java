/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.component.common.security.company.left;

import com.proximo.inci.component.common.security.company.CompanyField;
import com.proximo.inci.component.common.security.company.CompanyForm;
import com.vaadin.ui.TextField;

public class Addr2Field extends CompanyField<TextField> {

    public Addr2Field(CompanyFieldsLeft parentLayout) {
        super(parentLayout);
    }

    @Override
    protected TextField createMainComponentInstance() {
        return new TextField();
    }

    @Override
    protected void init() {
        mainComponent.setWidth(CompanyForm.FORM_TEXT_FIELD_DOUBLE_WIDTH);
    }

    @Override
    public void generateContent() {
        super.generateContent();

        String address2 = getParentLayout().getParentForm().getParentLayout().getUserCompany().getAddress2();
        setValue(address2 != null ? address2 : "");
    }

    @Override
    public String getFieldDescription() {
        return "";
    }

}
