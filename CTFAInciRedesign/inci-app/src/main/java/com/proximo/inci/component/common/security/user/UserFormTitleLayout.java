/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.component.common.security.user;

import com.proximo.inci.component.AbstractInciComponentLayout;
import com.proximo.inci.component.common.LabelComponent;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.HorizontalLayout;

public class UserFormTitleLayout extends AbstractInciComponentLayout<HorizontalLayout> {

    public UserFormTitleLayout() {
        build();
    }

    private LabelComponent userFormTitle;

    @Override
    protected HorizontalLayout createMainComponentInstance() {
        return new HorizontalLayout();
    }

    @Override
    protected void init() {
        userFormTitle = new LabelComponent("component.security.user.title", "form-title");
    }

    @Override
    protected void addContent() {
        addComponent(userFormTitle, Alignment.MIDDLE_CENTER);
    }

}
