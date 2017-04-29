/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.component.common.security.user.left.province;

import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.component.AbstractInciComponentLayout;
import com.proximo.inci.component.common.security.user.left.UserFieldsLeft;
import com.vaadin.ui.HorizontalLayout;

public class StateProvinceLayout extends AbstractInciComponentLayout<HorizontalLayout> {

    private UserFieldsLeft parentLayout;

    private StateProvinceUsCanadaField stateProvinceUsCanadaField;
    private StateProvinceOtherCountriesField stateProvinceOtherCountriesField;

    public StateProvinceLayout(UserFieldsLeft parentLayout) {
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

	public void clear() {
    	stateProvinceOtherCountriesField.setValue("");
    	stateProvinceUsCanadaField.setValue(null);		
	}
    

}
