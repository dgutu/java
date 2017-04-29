/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.admin.payment_clear.search.form;

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

    private TextField applicationNumber;
    private TextField companyName;

    public SearchFieldsLayout() {
        build();
    }

    @Override
    protected HorizontalLayout createMainComponentInstance() {
        return new HorizontalLayout();
    }

    @Override
    protected void init() {
        applicationNumber = new TextField(CaptionResolver.getCaption("view.admin.payment_clearing.search.form.application_number"));
        applicationNumber.setWidth(FORM_TEXT_FIELD_WIDTH);

        companyName = new TextField(CaptionResolver.getCaption("view.admin.payment_clearing.search.form.company_name"));
        companyName.setWidth(FORM_TEXT_FIELD_WIDTH);
        
        // set focus for application number
        applicationNumber.focus();
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
        lastNameFormLayout.addComponent(applicationNumber);
        h1.addComponent(lastNameFormLayout);
        HorizontalLayout h12 = new HorizontalLayout();
        h12.setWidth("50px");
        h1.addComponent(h12);
        mainComponent.addComponent(h1);

        HorizontalLayout h2 = new HorizontalLayout();
        HorizontalLayout h21 = new HorizontalLayout();
        h21.setWidth("50px");
        h2.addComponent(h21);
        FormLayout formLayout2 = new FormLayout();
        formLayout2.addComponent(companyName);
        h2.addComponent(formLayout2);
        HorizontalLayout h22 = new HorizontalLayout();
        h22.setWidth("100px");
        h2.addComponent(h22);
        mainComponent.addComponent(h2);
        mainComponent.setComponentAlignment(h2, Alignment.TOP_RIGHT);

        logger.debug("Adding search fields finished");
    }

    public void clear() {
        applicationNumber.setValue("");
        companyName.setValue("");
        
        // set focus for application number
        applicationNumber.focus();
    }

    public String getApplicationNumber() {
        return (String) applicationNumber.getValue();
    }

    public String getCompanyName() {
        return (String) companyName.getValue();
    }
    
    public void setApplicationNumber(String value) {
    	applicationNumber.setValue(value);
    }
    
    public void setCompanyName(String value) {
    	companyName.setValue(value);
    }

}
