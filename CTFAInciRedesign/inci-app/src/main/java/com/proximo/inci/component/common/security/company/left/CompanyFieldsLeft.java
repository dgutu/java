/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.component.common.security.company.left;

import com.proximo.inci.component.common.security.company.CompanyFields;
import com.proximo.inci.component.common.security.company.CompanyForm;
import com.proximo.inci.component.common.security.company.left.province.StateProvinceFieldsDescriptionLayout;
import com.proximo.inci.component.common.security.company.left.province.StateProvinceLayout;
import com.proximo.inci.component.util.ComponentUtil;

public class CompanyFieldsLeft extends CompanyFields {

    private CompanyNameField companyNameField;
    private Addr1Field addr1Field;
    private Addr2Field addr2Field;
    private Addr3Field addr3Field;
    private StateProvinceLayout stateProvinceLayout;
    private StateProvinceFieldsDescriptionLayout stateProvinceFieldsDescriptionLayout;
    private CountryField countryField;
    private boolean stateOrProvinceMandatory = false;
    

    public CompanyFieldsLeft(CompanyForm parentForm) {
        super(parentForm);
    }

    @Override
    protected void init() {
        super.init();

        companyNameField = new CompanyNameField(this);
        companyNameField.setRequired(true);
        addr1Field = new Addr1Field(this);
        addr1Field.setRequired(true);
        addr2Field = new Addr2Field(this);
        addr3Field = new Addr3Field(this);
        stateProvinceLayout = new StateProvinceLayout(this);
        stateProvinceFieldsDescriptionLayout = new StateProvinceFieldsDescriptionLayout();
        countryField = new CountryField(this);
    }

    @Override
    protected void addContent() {
        addComponent(companyNameField);
        addSpacing(ComponentUtil.NORMAL_FORM_SPACING_PX);
        addComponent(addr1Field);
        addSpacing(ComponentUtil.NORMAL_FORM_SPACING_PX);
        addComponent(addr2Field);
        addSpacing(ComponentUtil.NORMAL_FORM_SPACING_PX);
        addComponent(addr3Field);
        addSpacing(ComponentUtil.NORMAL_FORM_SPACING_PX);
        addComponent(countryField);
        addSpacing(ComponentUtil.NORMAL_FORM_SPACING_PX);
        addComponent(stateProvinceLayout);
        addSpacing(ComponentUtil.NORMAL_FORM_SPACING_PX);
        addComponent(stateProvinceFieldsDescriptionLayout);
    }

    public void countryChanged(String newCountryCode) {
        if (parentForm.getParentLayout().isEditable()) {
	        if ("US".equals(newCountryCode) || "CA".equals(newCountryCode)) {
	            stateProvinceLayout.getStateProvinceOtherCountriesField().setValue("");
	            stateProvinceLayout.getStateProvinceOtherCountriesField().setEnabled(false);
	            stateProvinceLayout.getStateProvinceUsCanadaField().setEnabled(true);
	            stateProvinceLayout.getStateProvinceUsCanadaField().setRequired(true);
	            //stateProvinceLayout.getMainComponent().addStyleName("required-field");
	            
	            //stateProvinceLayout.getMainComponent().setCaption(stateProvinceLayout.getMainComponent().getCaption().toString() + " *");
	            
	            // set Us/Canada field mandatory
	            stateOrProvinceMandatory = true;
	        } else {
	            stateProvinceLayout.getStateProvinceUsCanadaField().setValue(null);
	            stateProvinceLayout.getStateProvinceUsCanadaField().setEnabled(false);
	            stateProvinceLayout.getStateProvinceOtherCountriesField().setEnabled(true);
	            stateProvinceLayout.getStateProvinceUsCanadaField().setRequired(false);
	            /*stateProvinceLayout.getMainComponent().addStyleName("black-field");
	            
	            String caption = stateProvinceLayout.getMainComponent().getCaption().toString();
	            
	            try {
	            	if (caption.indexOf("*") > 0) {
	            		caption = caption.substring(0, caption.indexOf("*") - 1);
	            	}
	            } catch(Exception ex) {
	            	
	            }
	            
	            stateProvinceLayout.getMainComponent().setCaption(caption);*/
	        }
        }
        else {
	        if ("US".equals(newCountryCode) || "CA".equals(newCountryCode)) {
	            stateProvinceLayout.getStateProvinceOtherCountriesField().setValue("");
	        } else {
	            stateProvinceLayout.getStateProvinceUsCanadaField().setValue(null);
	        }
        }        
    }

    @Override
    public void generateContent() {
        super.generateContent();
        countryChanged((String) countryField.getCountryValue());
    }

    public CompanyNameField getCompanyNameField() {
        return companyNameField;
    }

    public Addr1Field getAddr1Field() {
        return addr1Field;
    }

    public Addr2Field getAddr2Field() {
        return addr2Field;
    }

    public Addr3Field getAddr3Field() {
        return addr3Field;
    }

    public StateProvinceLayout getStateProvinceLayout() {
        return stateProvinceLayout;
    }

    public CountryField getCountryField() {
        return countryField;
    }
    
    public void clearAllFields() {
        companyNameField.setValue("");        
        addr1Field.setValue("");
        addr2Field.setValue("");
        addr3Field.setValue("");
        stateProvinceLayout.clear();
        countryField.setValue(null);
    }
    
    public boolean getStateOrProvinceMandatory() {
    	return this.stateOrProvinceMandatory;
    }
}
