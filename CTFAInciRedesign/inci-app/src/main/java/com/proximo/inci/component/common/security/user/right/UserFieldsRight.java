/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.component.common.security.user.right;

import com.proximo.inci.component.common.security.user.UserFields;
import com.proximo.inci.component.common.security.user.UserForm;
import com.proximo.inci.component.util.ComponentUtil;

public class UserFieldsRight extends UserFields {

    private FirstNameField firstNameField;
    private LastNameField lastNameField;
    private PhoneField phoneField;
    private FaxField faxField;
    private CityField cityField;
    private ZipPostalCodeField zipPostalCodeField;
    //private InactivatedLayout inactivatedLayout;

    public UserFieldsRight(UserForm parentForm) {
        super(parentForm);
    }

    @Override
    protected void init() {
        super.init();

        firstNameField = new FirstNameField(this);
        lastNameField = new LastNameField(this);
        phoneField = new PhoneField(this);
        faxField = new FaxField(this);
        cityField = new CityField(this);
        zipPostalCodeField = new ZipPostalCodeField(this);
        //inactivatedLayout = new InactivatedLayout(this);
    }

    @Override
    protected void addContent() {
        addComponent(firstNameField);
        addSpacing(ComponentUtil.NORMAL_FORM_SPACING_PX);
        addComponent(lastNameField);
        addSpacing(ComponentUtil.NORMAL_FORM_SPACING_PX);
        //addSpacing(ComponentUtil.NORMAL_FORM_TEXT_FIELD_HEIGHT_PX);
        //addSpacing(ComponentUtil.NORMAL_FORM_SPACING_PX);
        addComponent(phoneField);
        addSpacing(ComponentUtil.NORMAL_FORM_SPACING_PX);
        addComponent(faxField);
        addSpacing(ComponentUtil.NORMAL_FORM_SPACING_PX);
        addComponent(cityField);
        addSpacing(ComponentUtil.NORMAL_FORM_SPACING_PX);
        addComponent(zipPostalCodeField);
        //addSpacing(ComponentUtil.NORMAL_FORM_SPACING_PX);
        //addComponent(inactivatedLayout, Alignment.MIDDLE_RIGHT);
    }
    
    @Override
    public void generateContent() {
        firstNameField.generateContent();
        lastNameField.generateContent();
        phoneField.generateContent();
        faxField.generateContent();
        cityField.generateContent();
        zipPostalCodeField.generateContent();
    }

	public void clearAllFields() {
    	phoneField.setValue("");
    	phoneField.setValue("");
    	faxField.setValue("");
    	cityField.setValue("");
    	zipPostalCodeField.setValue("");		
	}    

}
