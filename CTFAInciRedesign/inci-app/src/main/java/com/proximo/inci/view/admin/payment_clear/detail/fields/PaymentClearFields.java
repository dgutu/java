/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.admin.payment_clear.detail.fields;

import com.proximo.inci.component.AbstractInciComponentLayout;
import com.proximo.inci.component.util.ComponentUtil;
import com.proximo.inci.view.admin.payment_clear.detail.AbstractPaymentClearInfoLayout;
import com.proximo.inci.view.admin.payment_clear.detail.ActionButtonsLayout;
import com.vaadin.ui.FormLayout;

public class PaymentClearFields extends AbstractInciComponentLayout<FormLayout> {

    public static final String FORM_FIELD_LARGE_WIDTH = "350px";
    public static final String FORM_FIELD_MEDIUM_WIDTH = "200px";
    public static final String FORM_FIELD_SMALL_WIDTH = "100px";

    protected PaymentClearFieldsLayout parentLayout;

    private PaymentNumberField paymentNumberField;
    private FirstNameField firstNameField;
    private LastNameField lastNameField;
    private Address1Field address1Field;
    private Address2Field address2Field;
    private Address3Field address3Field;
    private CityField cityField;
    private StateProvinceField stateProvinceField;
    private ZipField zipField;
    private CountryField countryField;
    private PhoneField phoneField;
    
    private ActionButtonsLayout actionButtonsLayout;

    public PaymentClearFields(PaymentClearFieldsLayout parentLayout) {
        this.parentLayout = parentLayout;

        build();
    }

    @Override
    protected FormLayout createMainComponentInstance() {
        return new FormLayout();
    }

    @Override
    protected void init() {
        mainComponent.setSpacing(false);

        AbstractPaymentClearInfoLayout paymentClearInfoLayout = parentLayout.getParentLayout();

        paymentNumberField = new PaymentNumberField(paymentClearInfoLayout);
        firstNameField = new FirstNameField(paymentClearInfoLayout);
        lastNameField = new LastNameField(paymentClearInfoLayout);
        address1Field = new Address1Field(paymentClearInfoLayout);
        address2Field = new Address2Field(paymentClearInfoLayout);
        address3Field = new Address3Field(paymentClearInfoLayout);
        cityField = new CityField(paymentClearInfoLayout);
        stateProvinceField = new StateProvinceField(paymentClearInfoLayout);
        zipField = new ZipField(paymentClearInfoLayout);
        countryField = new CountryField(paymentClearInfoLayout);
        phoneField = new PhoneField(paymentClearInfoLayout);
        
        actionButtonsLayout = new ActionButtonsLayout(paymentClearInfoLayout.getParentView());
    }

    @Override
    protected void addContent() {
        addComponent(paymentNumberField);
        addSpacing(ComponentUtil.NORMAL_FORM_SPACING_PX);
        addComponent(firstNameField);
        addSpacing(ComponentUtil.NORMAL_FORM_SPACING_PX);
        addComponent(lastNameField);
        addSpacing(ComponentUtil.NORMAL_FORM_SPACING_PX);
        addComponent(address1Field);
        addSpacing(ComponentUtil.NORMAL_FORM_SPACING_PX);
        addComponent(address2Field);
        addSpacing(ComponentUtil.NORMAL_FORM_SPACING_PX);
        addComponent(address3Field);
        addSpacing(ComponentUtil.NORMAL_FORM_SPACING_PX);
        addComponent(cityField);
        addSpacing(ComponentUtil.NORMAL_FORM_SPACING_PX);
        addComponent(stateProvinceField);
        addSpacing(ComponentUtil.NORMAL_FORM_SPACING_PX);
        addComponent(zipField);
        addSpacing(ComponentUtil.NORMAL_FORM_SPACING_PX);
        addComponent(countryField);
        addSpacing(ComponentUtil.NORMAL_FORM_SPACING_PX);
        addComponent(phoneField);
        addSpace();
        addComponent(actionButtonsLayout);
    }

    public PaymentClearFieldsLayout getParentLayout() {
        return parentLayout;
    }

    public PaymentNumberField getPaymentNumberField() {
        return paymentNumberField;
    }

    public FirstNameField getFirstNameField() {
        return firstNameField;
    }

    public LastNameField getLastNameField() {
        return lastNameField;
    }

    public Address1Field getAddress1Field() {
        return address1Field;
    }

    public Address2Field getAddress2Field() {
        return address2Field;
    }

    public Address3Field getAddress3Field() {
        return address3Field;
    }

    public CityField getCityField() {
        return cityField;
    }

    public StateProvinceField getStateProvinceField() {
        return stateProvinceField;
    }

    public ZipField getZipField() {
        return zipField;
    }

    public CountryField getCountryField() {
        return countryField;
    }

    public PhoneField getPhoneField() {
        return phoneField;
    }
    
    public void Clear() {
        // clear all fields
        paymentNumberField.setValue("");
        firstNameField.setValue("");
        lastNameField.setValue("");
        address1Field.setValue("");
        address2Field.setValue("");
        address3Field.setValue("");
        cityField.setValue("");
        stateProvinceField.setValue("");
        zipField.setValue("");
        countryField.setValue(null);
        phoneField.setValue("");
    }
}
