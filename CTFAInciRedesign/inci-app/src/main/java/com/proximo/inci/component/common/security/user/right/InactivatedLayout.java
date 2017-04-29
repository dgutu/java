/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.component.common.security.user.right;

import com.proximo.inci.component.AbstractInciComponentLayout;
import com.vaadin.ui.HorizontalLayout;

public class InactivatedLayout extends AbstractInciComponentLayout<HorizontalLayout> {

    private UserFieldsRight parentLayout;

    private InactivatedField inactivatedField;

    public InactivatedLayout(UserFieldsRight parentLayout) {
        this.parentLayout = parentLayout;

        build();
    }

    @Override
    protected HorizontalLayout createMainComponentInstance() {
        return new HorizontalLayout();
    }

    @Override
    protected void init() {
        inactivatedField = new InactivatedField(parentLayout);
    }

    @Override
    protected void addContent() {
        addComponent(inactivatedField);
    }

}
