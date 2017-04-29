/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.security.user.search.form;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.component.AbstractInciComponentLayout;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.TextField;

public class SearchFieldsLayout extends AbstractInciComponentLayout<HorizontalLayout> {

    private static Logger logger = LoggerFactory.getLogger(SearchFieldsLayout.class);

    public static final String FORM_TEXT_FIELD_WIDTH = "200px";

    private TextField lastName;
    private TextField firstName;
    private TextField loginId;

    public SearchFieldsLayout() {
        build();
    }

    @Override
    protected HorizontalLayout createMainComponentInstance() {
        return new HorizontalLayout();
    }

    @Override
    protected void init() {
        lastName = new TextField(CaptionResolver.getCaption("view.security.user.search.last_name"));
        lastName.setWidth(FORM_TEXT_FIELD_WIDTH);

        firstName = new TextField(CaptionResolver.getCaption("view.security.user.search.first_name"));
        firstName.setWidth(FORM_TEXT_FIELD_WIDTH);

        loginId = new TextField(CaptionResolver.getCaption("view.security.user.search.login_id"));
        loginId.setWidth(FORM_TEXT_FIELD_WIDTH);
    }

    @Override
    protected void addContent() {
        addSearchFields();
    }

    private void addSearchFields() {
        logger.debug("Adding search fields");

        mainComponent.setSizeFull();

        HorizontalLayout h1 = new HorizontalLayout();
        HorizontalLayout h11 = new HorizontalLayout();
        h11.setWidth("100px");
        h1.addComponent(h11);
        FormLayout lastNameFormLayout = new FormLayout();
        lastNameFormLayout.addComponent(lastName);
        h1.addComponent(lastNameFormLayout);
        //HorizontalLayout h12 = new HorizontalLayout();
        //h12.setWidth("50px");
        //h1.addComponent(h12);
        mainComponent.addComponent(h1);

        HorizontalLayout h2 = new HorizontalLayout();
        //HorizontalLayout h21 = new HorizontalLayout();
        //h21.setWidth("50px");
        //h2.addComponent(h21);
        FormLayout firstNameFormLayout = new FormLayout();
        firstNameFormLayout.addComponent(firstName);
        h2.addComponent(firstNameFormLayout);
        //HorizontalLayout h22 = new HorizontalLayout();
        //h22.setWidth("50px");
        //h2.addComponent(h22);
        mainComponent.addComponent(h2);
        mainComponent.setComponentAlignment(h2, Alignment.TOP_CENTER);

        HorizontalLayout h3 = new HorizontalLayout();
        //HorizontalLayout h31 = new HorizontalLayout();
        //h31.setWidth("50px");
        //h3.addComponent(h31);
        FormLayout loginIdFormLayout = new FormLayout();
        loginIdFormLayout.addComponent(loginId);
        h3.addComponent(loginIdFormLayout);
        HorizontalLayout h32 = new HorizontalLayout();
        h32.setWidth("100px");
        h3.addComponent(h32);
        mainComponent.addComponent(h3);
        mainComponent.setComponentAlignment(h3, Alignment.TOP_RIGHT);

        logger.debug("Adding search fields finished");
    }

    public void clear() {
        lastName.setValue("");
        firstName.setValue("");
        loginId.setValue("");
    }

    public String getLastNameFieldValue() {
        return (String) lastName.getValue();
    }

    public String getFirstNameFieldValue() {
        return (String) firstName.getValue();
    }

    public String getLoginIdFieldValue() {
        return (String) loginId.getValue();
    }
    
    public void setLastNameFieldValue(String value) {
        lastName.setValue(value);
    }

    public void setFirstNameFieldValue(String value) {
        firstName.setValue(value);
    }

    public void setLoginIdFieldValue(String value) {
        loginId.setValue(value);
    }    

}
