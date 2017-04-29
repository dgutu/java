/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.component.common.security.company;

import com.proximo.inci.component.AbstractInciComponentLayout;
import com.proximo.inci.component.common.LabelComponent;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.HorizontalLayout;

public class CompanyFormTitleLayout extends AbstractInciComponentLayout<HorizontalLayout> {

    private String titleKey;

    public CompanyFormTitleLayout(String titleKey) {
        this.titleKey = titleKey;
        
        build();
    }

    private LabelComponent companyFormTitle;

    @Override
    protected HorizontalLayout createMainComponentInstance() {
        return new HorizontalLayout();
    }

    @Override
    protected void init() {
        companyFormTitle = new LabelComponent(titleKey, "form-title");
    }

    @Override
    protected void addContent() {
        addComponent(companyFormTitle, Alignment.MIDDLE_CENTER);
    }

}
