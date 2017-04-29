/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.component.common.security.company.left.province;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.common.TemplarUtil;
import com.proximo.inci.component.AbstractInciComponentLayout;
import com.proximo.inci.component.common.security.company.left.CompanyFieldsLeft;
import com.vaadin.ui.HorizontalLayout;

public class StateProvinceLayout extends AbstractInciComponentLayout<HorizontalLayout> {
	
	private static Logger logger = LoggerFactory.getLogger(StateProvinceLayout.class);
	
    private CompanyFieldsLeft parentLayout;

    private StateProvinceUsCanadaField stateProvinceUsCanadaField;
    private StateProvinceOtherCountriesField stateProvinceOtherCountriesField;

    public StateProvinceLayout(CompanyFieldsLeft parentLayout) {
        this.parentLayout = parentLayout;

        build();
    }

    @Override
    protected HorizontalLayout createMainComponentInstance() {
        return new HorizontalLayout();
    }

    @Override
    protected void init() {
        mainComponent.setSpacing(true);
        mainComponent.setCaption(CaptionResolver.getCaption("component.common.state_province_layout"));

        stateProvinceUsCanadaField = new StateProvinceUsCanadaField(parentLayout);
        stateProvinceOtherCountriesField = new StateProvinceOtherCountriesField(parentLayout);
    }

    @Override
    protected void addContent() {
        addComponent(stateProvinceUsCanadaField);
        addComponent(stateProvinceOtherCountriesField);
    }

    public StateProvinceUsCanadaField getStateProvinceUsCanadaField() {
        return stateProvinceUsCanadaField;
    }

    public StateProvinceOtherCountriesField getStateProvinceOtherCountriesField() {
        return stateProvinceOtherCountriesField;
    }

    public String getStateOrProvince() {
    	String stateValue = "";
    	
    	try
    	{
	        if (stateProvinceUsCanadaField.getMainComponent().getValue() != null && !TemplarUtil.isStringNullOrEmpty(stateProvinceUsCanadaField.getValue().toString())) {
	            stateValue = stateProvinceUsCanadaField.getValue().toString();
	        }
	        else if (stateProvinceOtherCountriesField.getMainComponent().getValue() != null && !TemplarUtil.isStringNullOrEmpty(stateProvinceOtherCountriesField.getValue().toString())) { 
	        	stateValue = stateProvinceOtherCountriesField.getValue().toString();
	        }
	        else 
	        	stateValue = "";
    	}
    	catch (Exception ex)
    	{
    		logger.debug("getStateOrProvince ERROR: " + ex.getMessage());
    	}
    	
    	return stateValue;
    }
    
    public void setStateProvinceUsCanadaField(String newValue) {
    	stateProvinceUsCanadaField.setValue(newValue);
    }
    
    public void clear() {
    	stateProvinceOtherCountriesField.setValue("");
    	stateProvinceUsCanadaField.setValue(null);
    }
    
    @Override
    public void generateContent() {
        super.generateContent();
        
        stateProvinceUsCanadaField.generateContent();
        stateProvinceOtherCountriesField.generateContent();
    }    
}
