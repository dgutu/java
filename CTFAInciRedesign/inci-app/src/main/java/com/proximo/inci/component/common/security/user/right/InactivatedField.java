/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.component.common.security.user.right;

import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.component.common.security.user.UserField;
import com.vaadin.ui.CheckBox;

public class InactivatedField extends UserField<CheckBox> {

    public InactivatedField(UserFieldsRight parentLayout) {
        super(parentLayout);
    }

    @Override
    protected CheckBox createMainComponentInstance() {
        return new CheckBox();
    }

    @Override
    protected void init() {
        mainComponent.setCaption(CaptionResolver.getCaption("component.security.user.inactivated"));
    }

    @Override
    public void generateContent() {
        super.generateContent();

        boolean inactivated = !getParentLayout().getParentForm().getParentLayout().getUser().isActive();
        setValue(inactivated);
    }

    @Override
    public String getFieldDescription() {
        return "";
    }

}
