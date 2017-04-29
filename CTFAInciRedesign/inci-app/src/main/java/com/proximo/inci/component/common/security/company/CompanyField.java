/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.component.common.security.company;

import com.proximo.inci.component.field.AbstractInciFieldComponent;
import com.vaadin.ui.AbstractField;

public abstract class CompanyField<C extends AbstractField> extends AbstractInciFieldComponent<C> {

    private CompanyFields parentLayout;

    public CompanyField(CompanyFields parentLayout) {
        this.parentLayout = parentLayout;

        build();
    }

    @Override
    protected void init() {
    }

    public CompanyFields getParentLayout() {
        return parentLayout;
    }

    @Override
    public void generateContent() {
        mainComponent.setEnabled(parentLayout.getParentForm().getParentLayout().isEditable());
    }
}
