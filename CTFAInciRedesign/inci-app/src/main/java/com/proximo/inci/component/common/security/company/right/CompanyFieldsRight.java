/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.component.common.security.company.right;

import com.proximo.inci.component.common.security.company.CompanyFields;
import com.proximo.inci.component.common.security.company.CompanyForm;
import com.proximo.inci.component.util.ComponentUtil;

public class CompanyFieldsRight extends CompanyFields {

    private PhoneField phoneField;
    private FaxField faxField;
    private CityField cityField;
    private ZipPostalCodeField zipPostalCodeField;

    public CompanyFieldsRight(CompanyForm parentForm) {
        super(parentForm);
    }

    @Override
    protected void init() {
        super.init();
        
        phoneField = new PhoneField(this);
        phoneField.setRequired(true);
        faxField = new FaxField(this);
        cityField = new CityField(this);
        zipPostalCodeField = new ZipPostalCodeField(this);
        zipPostalCodeField.setRequired(true);
    }

    @Override
    protected void addContent() {
        addSpacing(ComponentUtil.NORMAL_FORM_TEXT_FIELD_HEIGHT_PX);
        addSpacing(ComponentUtil.NORMAL_FORM_SPACING_PX);
        addComponent(phoneField);
        addSpacing(ComponentUtil.NORMAL_FORM_SPACING_PX);
        addComponent(faxField);
        addSpacing(ComponentUtil.NORMAL_FORM_SPACING_PX);
        addComponent(cityField);
        addSpacing(ComponentUtil.NORMAL_FORM_SPACING_PX);
        addComponent(zipPostalCodeField);
    }

    public PhoneField getPhoneField() {
        return phoneField;
    }

    public FaxField getFaxField() {
        return faxField;
    }

    public CityField getCityField() {
        return cityField;
    }

    public ZipPostalCodeField getZipPostalCodeField() {
        return zipPostalCodeField;
    }
    
    public void clearAllFields() {
    	phoneField.setValue("");
    	phoneField.setValue("");
    	faxField.setValue("");
    	cityField.setValue("");
    	zipPostalCodeField.setValue("");
    }

}
