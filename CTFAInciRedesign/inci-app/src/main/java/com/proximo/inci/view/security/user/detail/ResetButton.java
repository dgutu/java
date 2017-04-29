/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.security.user.detail;

import com.proximo.inci.component.util.ComponentUtil;
import com.vaadin.ui.Button;

public class ResetButton extends UserDetailViewButton {

    public ResetButton(UserDetailView parentView) {
        super(parentView);
    }

    @Override
    protected Button createMainComponentInstance() {
        return ComponentUtil.createActionButton("refresh", getParentView().getResetButtonListener());
    }

}
