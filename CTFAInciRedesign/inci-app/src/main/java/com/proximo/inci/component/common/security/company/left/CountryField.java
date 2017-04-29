/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.component.common.security.company.left;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proximo.inci.DOList;
import com.proximo.inci.DOLookupValue;
import com.proximo.inci.caption.CaptionResolver;
//import com.proximo.inci.common.TemplarUtil;
import com.proximo.inci.component.common.security.company.CompanyField;
import com.proximo.inci.component.common.security.company.CompanyForm;
import com.proximo.inci.component.util.ComponentUtil;
import com.proximo.inci.service.common.LookupService;
import com.vaadin.data.Property;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.ui.ComboBox;

@SuppressWarnings("serial")
public class CountryField extends CompanyField<ComboBox> {

	@SuppressWarnings("unused")
	private static Logger logger = LoggerFactory.getLogger(CountryField.class);
	
    public CountryField(CompanyFieldsLeft parentLayout) {
        super(parentLayout);
    }

    @Override
    protected ComboBox createMainComponentInstance() {
        return new ComboBox();
    }
    
    @Override
    protected void init() {
        mainComponent.setCaption(CaptionResolver.getCaption("component.common.country"));
        mainComponent.setWidth(CompanyForm.FORM_TEXT_FIELD_DOUBLE_WIDTH);
        
        mainComponent.setNullSelectionAllowed(false);
        
        mainComponent.setImmediate(true);
        mainComponent.addListener(new Property.ValueChangeListener() {
            @Override
            public void valueChange(ValueChangeEvent event) {
            	((CompanyFieldsLeft) getParentLayout()).countryChanged((String) getCountryValue());
            }
        });        

        fillOptions();
        
        setRequired(true);
    }

    private void fillOptions() {
    	// list of countries
    	DOList countries = LookupService.getCountries();
    	
        for (int i = 0; i < countries.size(); i++) {
            DOLookupValue lv = (DOLookupValue) countries.elementAt(i);
            ComponentUtil.addItemWithCaption(mainComponent, lv.keyValue, lv.keyDesc);
        }
    }

    @Override
    public void generateContent() {
        super.generateContent();
        
        String country = getParentLayout().getParentForm().getParentLayout().getUserCompany().getCountry();
        
        setValue(country != null ? country : "");
    }

    @Override
    public String getFieldDescription() {
        return CaptionResolver.getCaption("component.common.country.DESC");
    }
    
    public String getCountryValue() {
    	if (getValue() != null)
    		return getValue().toString();
    	else 
    		return "";
    }
}
