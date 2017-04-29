/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.component.common.security.company.left.province;

import com.proximo.inci.component.AbstractInciComponentLayout;
import com.proximo.inci.component.common.LabelComponent;
import com.proximo.inci.component.common.security.company.CompanyForm;
import com.vaadin.ui.HorizontalLayout;

public class StateProvinceFieldsDescriptionLayout extends AbstractInciComponentLayout<HorizontalLayout> {

    private LabelComponent stateProvinceUsCanadaFieldDescriptionLabel;
    private LabelComponent stateProvinceOtherCountriesFieldDescriptionLabel;

    public StateProvinceFieldsDescriptionLayout() {
        build();
    }

    @Override
    protected HorizontalLayout createMainComponentInstance() {
        return new HorizontalLayout();
    }

    @Override
    protected void init() {
        mainComponent.setSpacing(true);

        stateProvinceUsCanadaFieldDescriptionLabel = new LabelComponent(
                "component.common.state_province_us_canada.description", "very-small-bold-text");
        stateProvinceUsCanadaFieldDescriptionLabel.getMainComponent().setWidth(CompanyForm.FORM_TEXT_FIELD_WIDTH);

        stateProvinceOtherCountriesFieldDescriptionLabel = new LabelComponent(
                "component.common.state_province_other_countries.description", "very-small-bold-text");
        stateProvinceOtherCountriesFieldDescriptionLabel.getMainComponent().setWidth(CompanyForm.FORM_TEXT_FIELD_WIDTH);
    }

    @Override
    protected void addContent() {
        addComponent(stateProvinceUsCanadaFieldDescriptionLabel);
        addComponent(stateProvinceOtherCountriesFieldDescriptionLabel);
    }

}
