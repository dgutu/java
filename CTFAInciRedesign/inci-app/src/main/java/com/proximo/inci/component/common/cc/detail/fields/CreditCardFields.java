/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.component.common.cc.detail.fields;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proximo.inci.DOUserCC;
import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.caption.ValidationErrorStrUtils;
import com.proximo.inci.common.TemplarUtil;
import com.proximo.inci.component.AbstractInciComponentLayout;
import com.proximo.inci.component.common.cc.detail.AbstractCreditCardDetailLayout;
import com.proximo.inci.component.util.ComponentUtil;
import com.proximo.inci.view.tradename.payment.cc.CCRefundPolicy;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;

public class CreditCardFields extends AbstractInciComponentLayout<FormLayout> {

	@SuppressWarnings("unused")
	private static Logger									logger					= LoggerFactory.getLogger(CreditCardFields.class);

	public static final String								FORM_FIELD_LARGE_WIDTH	= "350px";
	public static final String								FORM_FIELD_MEDIUM_WIDTH	= "200px";
	public static final String								FORM_FIELD_SMALL_WIDTH	= "100px";

	protected CreditCardFieldsLayout						parentLayout;

	// private LabelComponent requiredFieldLabel;
	private CreditCardTypeField								creditCardTypeField;
	private CCNumberLayout									ccNumberLayout;
	private CVNLayout										cvnLayout;
	private ExpirationDateLayout							expirationDateLayout;
	private FirstNameField									firstNameField;
	private LastNameField									lastNameField;
	private Address1Field									address1Field;
	private Address2Field									address2Field;
	private Address3Field									address3Field;
	private CityField										cityField;
	private StateProvinceField								stateProvinceField;
	private ZipField										zipField;
	private CountryField									countryField;
	private PhoneField										phoneField;
	private CCRefundPolicy									refund;

	private AbstractSaveAsDefaultCardCBLayout				saveAsDefaultCardCBLayout;

	private AbstractInciComponentLayout<HorizontalLayout>	actionButtonsLayout;

	public CreditCardFields(CreditCardFieldsLayout parentLayout) {
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

		AbstractCreditCardDetailLayout creditCardDetailLayout = parentLayout.getParentLayout();

		creditCardTypeField = new CreditCardTypeField(this);
		ccNumberLayout = new CCNumberLayout(creditCardDetailLayout);
		cvnLayout = new CVNLayout(creditCardDetailLayout);
		expirationDateLayout = new ExpirationDateLayout(creditCardDetailLayout);
		firstNameField = new FirstNameField(creditCardDetailLayout);
		lastNameField = new LastNameField(creditCardDetailLayout);
		address1Field = new Address1Field(creditCardDetailLayout);
		address2Field = new Address2Field(creditCardDetailLayout);
		address3Field = new Address3Field(creditCardDetailLayout);
		cityField = new CityField(creditCardDetailLayout);
		stateProvinceField = new StateProvinceField(creditCardDetailLayout);
		zipField = new ZipField(creditCardDetailLayout);
		countryField = new CountryField(creditCardDetailLayout);
		phoneField = new PhoneField(creditCardDetailLayout);

		saveAsDefaultCardCBLayout = creditCardDetailLayout.createSaveAsDefaultCardCBLayout();

		// refundPolicyText = creditCardDetailLayout.createRefundPolicyText();

		refund = new CCRefundPolicy();

		actionButtonsLayout = creditCardDetailLayout.createActionButtonsLayout(parentLayout.getParentLayout().getParentView());

		// requiredFieldLabel = new LabelComponent("credit_card.required.field",
		// "very-small-text");
	}

	@Override
	public void addContent() {
		// addComponent(requiredFieldLabel);
		addSpacing(ComponentUtil.NORMAL_FORM_SPACING_PX);
		addComponent(creditCardTypeField);
		addSpacing(ComponentUtil.NORMAL_FORM_SPACING_PX);
		addComponent(ccNumberLayout);
		addSpacing(ComponentUtil.NORMAL_FORM_SPACING_PX);
		addComponent(cvnLayout);
		addSpacing(ComponentUtil.NORMAL_FORM_SPACING_PX);
		addComponent(expirationDateLayout);
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

		if (saveAsDefaultCardCBLayout != null) {
			addSpace();
			addComponent(saveAsDefaultCardCBLayout);
		}

		addSpace();
		addComponent(refund);

		if (actionButtonsLayout != null) {
			addSpace();
			addComponent(actionButtonsLayout);
		}
	}

	@Override
	public String validate() {
		String result = super.validate();

		if (result == null) {
			result = validateCvnField();
			if (result == null) {
				result = validateCCNumber();
				if (result == null) {
					result = validateAddress();
				}
			}
		}

		return result;
	}

	private String validateCvnField() {
		int ccType = Integer.parseInt((String) creditCardTypeField.getValue());
		String cvnFieldValue = (String) cvnLayout.getCvnField().getValue();

		//if (DOUserCC.AMEX != ccType && "".equals(cvnLayout.getCvnField().getValue())) {
		if ("".equals(cvnLayout.getCvnField().getValue())) {
			return ValidationErrorStrUtils.getFieldIsRequiredMsg(cvnLayout.getCvnField());
		}
		else if ((DOUserCC.MASTERCARD == ccType || DOUserCC.VISA == ccType) && cvnFieldValue.length() != 3) {
			return CaptionResolver.getCaption("credit_card.detail.cvn.INVALID_VALUE");
		}
		else if (DOUserCC.AMEX == ccType && cvnFieldValue.length() != 4) {
			return CaptionResolver.getCaption("credit_card.detail.cvn.INVALID_VALUE");
		}		
		else {
			return null;
		}
	}

	private String validateCCNumber() {
		String result = null;

		String ccNumberFieldValue = (String) ccNumberLayout.getCcNumberField().getValue();
		int ccType = Integer.parseInt((String) creditCardTypeField.getValue());
		if (ccNumberFieldValue != "") {
			final String INVALID_VALUE_MSG = CaptionResolver.getCaption("credit_card.detail.number.INVALID_VALUE");

			if (DOUserCC.MASTERCARD == ccType && ccNumberFieldValue.length() != 16) {
				result = INVALID_VALUE_MSG;
			}

			if (DOUserCC.VISA == ccType && ccNumberFieldValue.length() != 16 && ccNumberFieldValue.length() != 13) {
				result = INVALID_VALUE_MSG;
			}

			if (DOUserCC.AMEX == ccType && ccNumberFieldValue.length() != 15) {
				result = INVALID_VALUE_MSG;
			}
		}

		return result;
	}

	private String validateAddress() {
		if ("".equals(address1Field.getValue()) && "".equals(address2Field.getValue()) && "".equals(address3Field.getValue())) {
			return CaptionResolver.getCaption("credit_card.detail.address.REQUIRED");
		}
		else {
			return null;
		}
	}

	public CreditCardFieldsLayout getParentLayout() {
		return parentLayout;
	}

	public CVNLayout getCvnLayout() {
		return cvnLayout;
	}

	public AbstractSaveAsDefaultCardCBLayout getSaveAsDefaultCardCBLayout() {
		return saveAsDefaultCardCBLayout;
	}

	public CreditCardTypeField getCreditCardTypeField() {
		return creditCardTypeField;
	}

	public CCNumberLayout getCcNumberLayout() {
		return ccNumberLayout;
	}

	public ExpirationDateLayout getExpirationDateLayout() {
		return expirationDateLayout;
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

	// check mandaroty fields
	public String checkMandatoryFields() {

		// cc type
		if (TemplarUtil.isObjNullOrEmpty(creditCardTypeField.getValue())) {
			return ValidationErrorStrUtils.getFieldIsRequiredMsg(creditCardTypeField);
		}

		// cc number
		if ((TemplarUtil.isObjNullOrEmpty(ccNumberLayout.getCcNumberField().getValue())) && (TemplarUtil.isObjNullOrEmpty(ccNumberLayout.getCCMaskText().getMainComponent().getValue()))) {
			return ValidationErrorStrUtils.getFieldIsRequiredMsg(ccNumberLayout.getCcNumberField());
		}

		// cc cvv
		if (TemplarUtil.isObjNullOrEmpty(cvnLayout.getCvnField().getValue())) {
			return ValidationErrorStrUtils.getFieldIsRequiredMsg(cvnLayout.getCvnField());
		}

		// cc exp month
		if (TemplarUtil.isObjNullOrEmpty(expirationDateLayout.getExpirationMonthField().getValue())) {
			return ValidationErrorStrUtils.getFieldIsRequiredMsg(expirationDateLayout.getExpirationMonthField());
		}

		// cc exp yy
		if (TemplarUtil.isObjNullOrEmpty(expirationDateLayout.getExpirationYearField().getValue())) {
			return ValidationErrorStrUtils.getFieldIsRequiredMsg(expirationDateLayout.getExpirationYearField());
		}

		// first name
		if (TemplarUtil.isObjNullOrEmpty(firstNameField.getValue())) {
			return ValidationErrorStrUtils.getFieldIsRequiredMsg(firstNameField);
		}

		// last name
		if (TemplarUtil.isObjNullOrEmpty(lastNameField.getValue())) {
			return ValidationErrorStrUtils.getFieldIsRequiredMsg(lastNameField);
		}

		// address1Field
		if (TemplarUtil.isObjNullOrEmpty(address1Field.getValue())) {
			return ValidationErrorStrUtils.getFieldIsRequiredMsg(address1Field);
		}

		// cityField
		if (TemplarUtil.isObjNullOrEmpty(cityField.getValue())) {
			return ValidationErrorStrUtils.getFieldIsRequiredMsg(cityField);
		}

		// stateProvinceField
		if (TemplarUtil.isObjNullOrEmpty(stateProvinceField.getValue())) {
			return ValidationErrorStrUtils.getFieldIsRequiredMsg(stateProvinceField);
		}

		// zipField
		if (TemplarUtil.isObjNullOrEmpty(zipField.getValue())) {
			return ValidationErrorStrUtils.getFieldIsRequiredMsg(zipField);
		}

		// countryField
		if (TemplarUtil.isObjNullOrEmpty(countryField.getValue())) {
			return ValidationErrorStrUtils.getFieldIsRequiredMsg(countryField);
		}

		return null;
	}

	/*
	 * @Override public void generateContent() {
	 * mainComponent.removeAllComponents(); super.generateContent();
	 * creditCardTypeField.generateContent(); ccNumberLayout.generateContent();
	 * cvnLayout.generateContent(); expirationDateLayout.generateContent();
	 * firstNameField.generateContent(); lastNameField.generateContent();
	 * address1Field.generateContent(); address2Field.generateContent();
	 * address3Field.generateContent(); cityField.generateContent();
	 * stateProvinceField.generateContent(); zipField.generateContent();
	 * countryField.generateContent(); phoneField.generateContent();
	 * refund.generateContent(); saveAsDefaultCardCBLayout.generateContent();
	 * 
	 * addContent(); }
	 */
}
