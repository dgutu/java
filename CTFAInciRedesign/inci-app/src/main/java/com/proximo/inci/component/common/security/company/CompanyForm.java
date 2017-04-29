/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.component.common.security.company;

import com.proximo.inci.component.AbstractInciComponentLayout;
import com.vaadin.ui.VerticalLayout;

public class CompanyForm extends AbstractInciComponentLayout<VerticalLayout> {

    public static final String FORM_TEXT_FIELD_DOUBLE_WIDTH = "306px";
    public static final String FORM_TEXT_FIELD_WIDTH = "150px";
    
    private CompanyFormLayout parentLayout;

    private CompanyFieldsLayout companyFieldsLayout;

    public CompanyForm(CompanyFormLayout parentLayout) {
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

        companyFieldsLayout = new CompanyFieldsLayout(this);        
    }

    @Override
    protected void addContent() {
        addComponent(companyFieldsLayout);
    }

    public CompanyFormLayout getParentLayout() {
        return parentLayout;
    }

    public CompanyFieldsLayout getCompanyFieldsLayout() {
        return companyFieldsLayout;
    }
    
    @Override
    public void generateContent() {
    	companyFieldsLayout.generateContent();
    }    
}
