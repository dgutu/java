/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.component.common.security.user.left;

import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.component.common.security.user.UserField;
import com.proximo.inci.component.common.security.user.UserForm;
import com.vaadin.ui.TextField;

public class MainCompanyField extends UserField<TextField> {

    public MainCompanyField(UserFieldsLeft parentLayout) {
        super(parentLayout);
    }

    @Override
    protected TextField createMainComponentInstance() {
        return new TextField();
    }

    @Override
    protected void init() {
        mainComponent.setCaption(CaptionResolver.getCaption("component.security.user.main_company"));
        mainComponent.setWidth(UserForm.FORM_TEXT_FIELD_DOUBLE_WIDTH);
    }

    @Override
    public void generateContent() {
        super.generateContent();

        String mainCompany = getParentLayout().getParentForm().getParentLayout().getUser().getUserCompany().getCompanyName();
        setValue(mainCompany != null ? mainCompany : "");
    }

    @Override
    public String getFieldDescription() {
        return "";
    }

}
