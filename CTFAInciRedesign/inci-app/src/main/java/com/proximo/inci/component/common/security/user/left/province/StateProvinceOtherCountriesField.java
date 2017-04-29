/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.component.common.security.user.left.province;

import com.proximo.inci.component.common.security.company.CompanyForm;
import com.proximo.inci.component.common.security.user.UserField;
import com.proximo.inci.component.common.security.user.left.UserFieldsLeft;
import com.vaadin.ui.TextField;

public class StateProvinceOtherCountriesField extends UserField<TextField> {

    public StateProvinceOtherCountriesField(UserFieldsLeft parentLayout) {
        super(parentLayout);
    }

    @Override
    protected TextField createMainComponentInstance() {
        return new TextField();
    }

    @Override
    protected void init() {
        mainComponent.setWidth(CompanyForm.FORM_TEXT_FIELD_WIDTH);
    }

    @Override
    public void generateContent() {
        super.generateContent();

        String province = getParentLayout().getParentForm().getParentLayout().getUser().getProvince();
        setValue(province != null ? province : "");
    }

    @Override
    public String getFieldDescription() {
        return "";
    }

}
