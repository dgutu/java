/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.component.common.security.user.left;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import com.proximo.inci.DOList;
import com.proximo.inci.DOLookupValue;
import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.common.TemplarUtil;
import com.proximo.inci.component.common.security.user.UserField;
import com.proximo.inci.component.common.security.user.UserForm;
import com.proximo.inci.component.util.ComponentUtil;
import com.proximo.inci.service.common.LookupService;
import com.vaadin.data.Property;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.ui.ComboBox;

public class CountryField extends UserField<ComboBox> {
	
	@SuppressWarnings("unused")
	private static Logger logger = LoggerFactory.getLogger(CountryField.class);
	
    public CountryField(UserFieldsLeft parentLayout) {
        super(parentLayout);
    }

    @Override
    protected ComboBox createMainComponentInstance() {
        return new ComboBox();
    }

    @Override
    protected void init() {
        mainComponent.setCaption(CaptionResolver.getCaption("component.common.user.country"));
        mainComponent.setWidth(UserForm.FORM_TEXT_FIELD_DOUBLE_WIDTH);
        
        mainComponent.setNullSelectionAllowed(false);
        
        mainComponent.setImmediate(true);
        mainComponent.addListener(new Property.ValueChangeListener() {
            /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
            public void valueChange(ValueChangeEvent event) {
            	((UserFieldsLeft) getParentLayout()).countryChanged((String) getCountryValue());
            }
        });           

        fillOptions();
    }

    private void fillOptions() {
        //DOList countries = LookupService.getCountriesAbbr();
    	DOList countries = LookupService.getCountries();
        for (int i = 0; i < countries.size(); i++) {
        	//logger.debug("############ countries="+countries.elementAt(i));
            DOLookupValue lv = (DOLookupValue) countries.elementAt(i);
            ComponentUtil.addItemWithCaption(mainComponent, lv.keyValue, lv.keyDesc);
        }
    }

    @Override
    public void generateContent() {
        super.generateContent();

        //logger.debug("############ Contact User Information: Country="+getParentLayout().getParentForm().getParentLayout().getUser().getCountry());
        
        String country = getParentLayout().getParentForm().getParentLayout().getUser().getCountry();        
        setValue(!TemplarUtil.isStringNullOrEmpty(country) ? country : "");
        //setValue("MD");
    }

    @Override
    public String getFieldDescription() {
        return "";
    }
    
    public String getCountryValue() {
    	if (getValue() != null)
    		return getValue().toString();
    	else 
    		return "";
    }    

}
