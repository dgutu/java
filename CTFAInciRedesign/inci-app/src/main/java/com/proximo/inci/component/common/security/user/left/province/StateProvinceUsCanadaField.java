/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.component.common.security.user.left.province;

import java.util.List;

import com.proximo.inci.component.common.security.user.UserField;
import com.proximo.inci.component.common.security.user.UserForm;
import com.proximo.inci.component.common.security.user.left.UserFieldsLeft;
import com.proximo.inci.service.common.states.State;
import com.proximo.inci.service.common.states.StatesService;
import com.vaadin.ui.ComboBox;

public class StateProvinceUsCanadaField extends UserField<ComboBox> {

    public StateProvinceUsCanadaField(UserFieldsLeft parentLayout) {
        super(parentLayout);
    }

    @Override
    protected ComboBox createMainComponentInstance() {
        return new ComboBox();
    }

    @Override
    protected void init() {
        mainComponent.setWidth(UserForm.FORM_TEXT_FIELD_WIDTH);

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

        String state = getParentLayout().getParentForm().getParentLayout().getUser().getStateOrProvince();//.getState();
        setValue(state != null ? state : "");
    }

    @Override
    public String getFieldDescription() {
        return "";
    }

}
