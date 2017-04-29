/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.component.common.security.company;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proximo.inci.DOTradeName;
import com.proximo.inci.caption.ValidationErrorStrUtils;
import com.proximo.inci.common.TemplarUtil;
import com.proximo.inci.component.AbstractInciComponentLayout;
import com.proximo.inci.component.common.security.company.left.CompanyFieldsLeft;
import com.proximo.inci.component.common.security.company.right.CompanyFieldsRight;
import com.proximo.inci.component.util.ComponentUtil;
import com.proximo.inci.service.security.user.UserCompany;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.VerticalLayout;

public class CompanyFormLayout extends AbstractInciComponentLayout<VerticalLayout> {
	
	private static Logger logger = LoggerFactory.getLogger(CompanyFormLayout.class);
    
    public static String DEFAULT_TITLE_KEY = "component.security.company.title";

    private UserCompany userCompany;

    private boolean editable = true;
    
    private String titleKey;

    private CompanyFormTitleLayout companyFormTitleLayout;
    private CompanyForm companyForm;

    public CompanyFormLayout(String titleKey) {
        this.titleKey = titleKey;
        
        build();
    }
    
    public CompanyFormLayout() {
        titleKey = DEFAULT_TITLE_KEY;
        
        build();
    }

    @Override
    protected VerticalLayout createMainComponentInstance() {
        return new VerticalLayout();
    }

    @Override
    protected void init() {
        mainComponent.setSpacing(false);

        companyFormTitleLayout = new CompanyFormTitleLayout(titleKey);
        companyForm = new CompanyForm(this);
        
    }

    @Override
    protected void addContent() {
        addComponent(companyFormTitleLayout, Alignment.MIDDLE_CENTER);
        addSpacing(ComponentUtil.NORMAL_FORM_SPACING_PX);
        addComponent(companyForm);
        
    }
    
    @Override
    public String validate() {
        String result = super.validate();

        if (result == null) {
            /* 
             * validate fields for Publication Company only
             * */
        	if (titleKey.equals("tradeName.detail.pub_company.title"))
        		result = companyFormFieldValidate();
        }

        return result;
    }
    
    private String companyFormFieldValidate() {
        CompanyFieldsLeft left = companyForm.getCompanyFieldsLayout().getCompanyFieldsLeft();
        CompanyFieldsRight right = companyForm.getCompanyFieldsLayout().getCompanyFieldsRight();
        
        // Company Name
        if (TemplarUtil.isObjNullOrEmpty(left.getCompanyNameField().getValue()))
        	return ValidationErrorStrUtils.getFieldIsRequiredMsg(left.getCompanyNameField());
        
        // Address
        if (TemplarUtil.isObjNullOrEmpty(left.getAddr1Field().getValue()))
        	return ValidationErrorStrUtils.getFieldIsRequiredMsg(left.getAddr1Field());

        // Country
        if (TemplarUtil.isStringNullOrEmpty(left.getCountryField().getCountryValue()))
        	return ValidationErrorStrUtils.getFieldIsRequiredMsg(left.getCountryField());

        // State/Province        
        if (
        	(
             !TemplarUtil.isStringNullOrEmpty(left.getCountryField().getCountryValue()) && 
        	 ("US".equals(left.getCountryField().getCountryValue()) || "CA".equals(left.getCountryField().getCountryValue()))
        	)
        	&&
        	(TemplarUtil.isObjNullOrEmpty(left.getStateProvinceLayout().getStateProvinceUsCanadaField().getValue()))
           )
        	return ValidationErrorStrUtils.getFieldIsRequiredMsg(left.getStateProvinceLayout().getStateProvinceUsCanadaField());

        // Phone
        if (TemplarUtil.isObjNullOrEmpty(right.getPhoneField().getValue()))
        	return ValidationErrorStrUtils.getFieldIsRequiredMsg(right.getPhoneField());

        // Zip Code
        if (TemplarUtil.isObjNullOrEmpty(right.getZipPostalCodeField().getValue()))
        	return ValidationErrorStrUtils.getFieldIsRequiredMsg(right.getZipPostalCodeField());
        
        return null;
	}

	public void prepareFormTn(DOTradeName formTn) {
        CompanyFieldsLeft left = companyForm.getCompanyFieldsLayout().getCompanyFieldsLeft();
        CompanyFieldsRight right = companyForm.getCompanyFieldsLayout().getCompanyFieldsRight();
        
        formTn.pubCompany.name = (String) left.getCompanyNameField().getValue();
        formTn.pubCompany.addrLine1 = (String) left.getAddr1Field().getValue();
        formTn.pubCompany.addrLine2 = (String) left.getAddr2Field().getValue();
        formTn.pubCompany.addrLine3 = (String) left.getAddr3Field().getValue();
        formTn.pubCompany.phone = (String) right.getPhoneField().getValue();
        formTn.pubCompany.fax = (String) right.getFaxField().getValue();
        formTn.pubCompany.city = (String) right.getCityField().getValue();
        formTn.pubCompany.zip = (String) right.getZipPostalCodeField().getValue();
        formTn.pubCompany.state = left.getStateProvinceLayout().getStateOrProvince();
        formTn.pubCompany.country = (String) left.getCountryField().getCountryValue();
    }
    
    public boolean areFieldsModified(DOTradeName formTn) {
    	
    	logger.debug("CompanyFormLayout.areFieldsModified - START");    	
    	
        CompanyFieldsLeft left = companyForm.getCompanyFieldsLayout().getCompanyFieldsLeft();
        CompanyFieldsRight right = companyForm.getCompanyFieldsLayout().getCompanyFieldsRight();
        
        boolean flag = false;      
        boolean fieldsModified = false;   
        
        // check Company Name: 
        flag = formTn.pubCompany.name.equals(left.getCompanyNameField().getValue().toString());        
        if (!flag)
        {
        	fieldsModified = true;
        	logger.debug("Company Name: ");
        	logger.debug(formTn.pubCompany.name.toString());
        	logger.debug(left.getCompanyNameField().getValue().toString());
        }
        
        // check Address1: 
        flag = formTn.pubCompany.addrLine1.equals(left.getAddr1Field().getValue().toString());        
        if (!flag)
        {
        	fieldsModified = true;
        	logger.debug("Address1: ");
        	logger.debug(formTn.pubCompany.addrLine1.toString());
        	logger.debug(left.getAddr1Field().getValue().toString());
        }        
        
        // check Address2: 
        flag = formTn.pubCompany.addrLine2.equals(left.getAddr2Field().getValue().toString());        
        if (!flag)
        {
        	fieldsModified = true;
        	logger.debug("Address2: ");
        	logger.debug(formTn.pubCompany.addrLine2.toString());
        	logger.debug(left.getAddr2Field().getValue().toString());
        }    
        
        // check Address2: 
        flag = formTn.pubCompany.addrLine3.equals(left.getAddr3Field().getValue().toString());        
        if (!flag)
        {
        	fieldsModified = true;
        	logger.debug("Address3: ");
        	logger.debug(formTn.pubCompany.addrLine3.toString());
        	logger.debug(left.getAddr3Field().getValue().toString());
        }        
        
        // check State/Province
        flag = formTn.pubCompany.state.equals(left.getStateProvinceLayout().getStateOrProvince());        
        if (!flag)
        {
        	fieldsModified = true;
        	logger.debug("State/Province: ");
        	logger.debug(formTn.pubCompany.state.toString());
        	logger.debug(left.getStateProvinceLayout().getStateOrProvince());        	             
        }    
        
        // check Country
        flag = formTn.pubCompany.country.equals(left.getCountryField().getCountryValue());        
        if (!flag)
        {
        	fieldsModified = true;
        	logger.debug("Country: ");
        	logger.debug(formTn.pubCompany.country.toString());
        	logger.debug(left.getCountryField().getCountryValue());
        }
        
        // check Phone
        flag = formTn.pubCompany.phone.equals(right.getPhoneField().getValue().toString());        
        if (!flag)
        {
        	fieldsModified = true;
        	logger.debug("Phone: ");
        	logger.debug(formTn.pubCompany.phone.toString());
        	logger.debug(right.getPhoneField().getValue().toString());
        }    
        
        // check Fax
        flag = formTn.pubCompany.fax.equals(right.getFaxField().getValue().toString());        
        if (!flag)
        {
        	fieldsModified = true;
        	logger.debug("Fax: ");
        	logger.debug(formTn.pubCompany.fax.toString());
        	logger.debug(right.getFaxField().getValue().toString());
        }
        
        // check City
        flag = formTn.pubCompany.city.equals(right.getCityField().getValue().toString());        
        if (!flag)
        {
        	fieldsModified = true;
        	logger.debug("City: ");
        	logger.debug(formTn.pubCompany.city.toString());
        	logger.debug(right.getCityField().getValue().toString());
        }   

        // check Zip
        flag = formTn.pubCompany.zip.equals(right.getZipPostalCodeField().getValue().toString());        
        if (!flag)
        {
        	fieldsModified = true;
        	logger.debug("Zip: ");
        	logger.debug(formTn.pubCompany.zip.toString());
        	logger.debug(right.getZipPostalCodeField().getValue().toString());
        }
        
        logger.debug("CompanyFormLayout.areFieldsModified - END");
        
        return fieldsModified;
    }
    
    public UserCompany getUserCompany() {
        return userCompany;
    }

    public void setUserCompany(UserCompany userCompany) {
        this.userCompany = userCompany;
    }

    public boolean isEditable() {
        return editable;
    }

    public void setEditable(boolean editable) {
        this.editable = editable;
    }
    
    public CompanyForm getCompanyForm() {
    	return companyForm; 
    }
    
    public String getTitleKey() {
    	return titleKey;
    }
    
    public void clearFields() {
        // clear all fields
        companyForm.getCompanyFieldsLayout().getCompanyFieldsLeft().clearAllFields();
        companyForm.getCompanyFieldsLayout().getCompanyFieldsRight().clearAllFields();
    }

}
