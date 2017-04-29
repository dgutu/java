/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.security.user.detail;

import com.proximo.inci.component.AbstractInciComponent;
import com.vaadin.ui.Button;

public abstract class UserDetailViewButton extends AbstractInciComponent<Button> {

    private UserDetailView parentView;

    public UserDetailViewButton(UserDetailView parentView) {
        this.parentView = parentView;

        build();
    }

    @Override
    protected void init() {
    }

    public UserDetailView getParentView() {
        return parentView;
    }

}
