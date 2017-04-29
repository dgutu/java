/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.component.common.security.user;

import com.proximo.inci.component.field.AbstractInciFieldComponent;
import com.vaadin.ui.AbstractField;

public abstract class UserField<C extends AbstractField> extends AbstractInciFieldComponent<C> {

    private UserFields parentLayout;

    public UserField(UserFields parentLayout) {
        this.parentLayout = parentLayout;

        build();
    }

    @Override
    protected void init() {
    }

    public UserFields getParentLayout() {
        return parentLayout;
    }

    @Override
    public void generateContent() {
        mainComponent.setEnabled(parentLayout.getParentForm().getParentLayout().isEditable());
    }
}
