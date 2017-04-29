/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.component.common.security.user;

import com.proximo.inci.component.AbstractInciComponentLayout;
import com.vaadin.ui.VerticalLayout;

public class UserForm extends AbstractInciComponentLayout<VerticalLayout> {

    public static final String FORM_TEXT_FIELD_DOUBLE_WIDTH = "306px";
    public static final String FORM_TEXT_FIELD_WIDTH = "150px";
    
    private UserFormLayout parentLayout;

    private UserFieldsLayout companyFieldsLayout;

    public UserForm(UserFormLayout parentLayout) {
        this.parentLayout = parentLayout;
        
        build();
    }

    @Override
    protected VerticalLayout createMainComponentInstance() {
        return new VerticalLayout();
    }

    @Override
    protected void init() {
        mainComponent.addStyleName("grayBackgroundColor");
        mainComponent.addStyleName("roundedCorners");

        companyFieldsLayout = new UserFieldsLayout(this);
    }

    @Override
    protected void addContent() {
        addComponent(companyFieldsLayout);
    }

    public UserFieldsLayout getCompanyFieldsLayout() {
        return companyFieldsLayout;
    }

    public UserFormLayout getParentLayout() {
        return parentLayout;
    }

}
