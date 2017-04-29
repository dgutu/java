/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.component.common.security.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proximo.inci.component.AbstractInciComponentLayout;
import com.proximo.inci.component.common.security.user.left.UserFieldsLeft;
import com.proximo.inci.component.common.security.user.right.UserFieldsRight;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.HorizontalLayout;

public class UserFieldsLayout extends AbstractInciComponentLayout<HorizontalLayout> {

    private static Logger logger = LoggerFactory.getLogger(UserFieldsLayout.class);

    protected UserForm parentForm;

    private UserFieldsLeft userFieldsLeft;
    private UserFieldsRight userFieldsRight;

    public UserFieldsLayout(UserForm parentForm) {
        this.parentForm = parentForm;

        build();
    }

    @Override
    protected HorizontalLayout createMainComponentInstance() {
        return new HorizontalLayout();
    }

    @Override
    protected void init() {
        userFieldsLeft = new UserFieldsLeft(parentForm);
        userFieldsRight = new UserFieldsRight(parentForm);
    }

    @Override
    protected void addContent() {
        addFields();
    }

    private void addFields() {
        logger.debug("Adding fields");

        mainComponent.setSizeFull();

        HorizontalLayout h1 = new HorizontalLayout();
        HorizontalLayout h11 = new HorizontalLayout();
        h11.setWidth("80px");
        h1.addComponent(h11);
        h1.addComponent(userFieldsLeft.getMainComponent());
        mainComponent.addComponent(h1);
        HorizontalLayout h12 = new HorizontalLayout();
        h12.setWidth("80px");
        h1.addComponent(h12);

        HorizontalLayout h2 = new HorizontalLayout();
        h2.addComponent(userFieldsRight.getMainComponent());
        HorizontalLayout h21 = new HorizontalLayout();
        h21.setWidth("80px");
        h2.addComponent(h21);
        mainComponent.addComponent(h2);
        mainComponent.setComponentAlignment(h2, Alignment.TOP_RIGHT);

        logger.debug("Adding fields finished");
    }

    @Override
    public void generateContent() {
    	clearFields();
        userFieldsLeft.generateContent();
        userFieldsRight.generateContent();
    }
    
    
    public void clearFields() {
    	userFieldsLeft.clearAllFields();
    	userFieldsRight.clearAllFields();    	
    }    

}
