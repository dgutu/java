/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.security.user.detail;

import com.proximo.inci.component.AbstractInciComponentLayout;
import com.vaadin.ui.HorizontalLayout;

public class ActionButtonLayout extends AbstractInciComponentLayout<HorizontalLayout> {

    private UserDetailView parentView;

    private ResetButton resetButton;
    private CancelButton cancelButton;
    private SaveButton saveButton; 

    public ActionButtonLayout(UserDetailView parentView) {
        this.parentView = parentView;

        build();
    }

    @Override
    protected HorizontalLayout createMainComponentInstance() {
        return new HorizontalLayout();
    }

    @Override
    protected void init() {
        mainComponent.setSpacing(true);

        resetButton = new ResetButton(parentView);
        cancelButton = new CancelButton(parentView);
        saveButton = new SaveButton(parentView);
    }

    @Override
    protected void addContent() {
        addComponent(resetButton);
        addComponent(saveButton);
        addComponent(cancelButton);
    }
    
    public CancelButton getCancelButton() {
    	return cancelButton;
    }
    
    public ResetButton getResetButton() {
    	return resetButton;
    }
    
    public SaveButton getSaveButton() {
    	return saveButton;
    }

}
