/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.component.common.security.company.left.province;

import java.util.List;

import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.component.common.security.company.CompanyField;
import com.proximo.inci.component.common.security.company.CompanyForm;
import com.proximo.inci.component.common.security.company.left.CompanyFieldsLeft;
import com.proximo.inci.service.common.states.State;
import com.proximo.inci.service.common.states.StatesService;
import com.vaadin.ui.ComboBox;

public class StateProvinceUsCanadaField extends CompanyField<ComboBox> {

    public StateProvinceUsCanadaField(CompanyFieldsLeft parentLayout) {
        super(parentLayout);
    }

    @Override
    protected ComboBox createMainComponentInstance() {
        return new ComboBox();
    }

    @Override
    protected void init() {
        mainComponent.setWidth(CompanyForm.FORM_TEXT_FIELD_WIDTH);

        fillOptions();
    }

    private void fillOptions() {
        List<State> states = StatesService.getStates();
        for (State state : states) {
            String stateCode = state.getCode();
            mainComponent.addItem(stateCode);
            mainComponent.setItemCaption(stateCode, state.getName());
        }
    }

    @Override
    public void generateContent() {
        super.generateContent();

        String state = getParentLayout().getParentForm().getParentLayout().getUserCompany().getStateOrProvince();//.getState();
        setValue(state != null ? state : "");
    }

    @Override
    public String getFieldDescription() {
        return CaptionResolver.getCaption("component.common.state_province_layout.DESC");
    }

}
