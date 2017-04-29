/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.component.common.cc.detail;

import com.proximo.inci.DOUserCC;
import com.proximo.inci.common.TemplarUtil;
import com.proximo.inci.component.AbstractInciComponentLayout;
import com.proximo.inci.component.common.HtmlLabelComponent;
import com.proximo.inci.component.common.cc.detail.fields.AbstractSaveAsDefaultCardCBLayout;
import com.proximo.inci.component.common.cc.detail.fields.CreditCardFields;
import com.proximo.inci.component.common.cc.detail.fields.CreditCardFieldsLayout;
import com.proximo.inci.component.util.ComponentUtil;
import com.proximo.inci.view.BaseView;
import com.vaadin.terminal.ThemeResource;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Embedded;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.VerticalLayout;

public abstract class AbstractCreditCardDetailLayout extends AbstractInciComponentLayout<VerticalLayout> {

    protected BaseView parentView;

    protected DOUserCC userCC;

    protected boolean editable = true;

    private TitleLayout titleLayout;
    private SubTitleLayout subTitleLayout;
    private FeeTextLayout feeTextLayout;
    
    private CreditCardFieldsLayout creditCardFieldsLayout;

    public AbstractCreditCardDetailLayout(BaseView parentView) {
        this.parentView = parentView;

        build();
    }

    protected abstract String getTitleKey();

    protected abstract AbstractSubTitle createSubTitle();

    protected abstract AbstractFeeText createFeeText();

    public abstract AbstractSaveAsDefaultCardCBLayout createSaveAsDefaultCardCBLayout();

    public abstract HtmlLabelComponent createRefundPolicyText();

    public abstract AbstractInciComponentLayout<HorizontalLayout> createActionButtonsLayout(BaseView parentView);

    @Override
    protected VerticalLayout createMainComponentInstance() {
        return new VerticalLayout();
    }

    @Override
    protected void init() {
        mainComponent.setSpacing(false);
        mainComponent.setMargin(true);

        mainComponent.addStyleName("grayBackgroundColor");
        mainComponent.addStyleName("roundedCorners");

        mainComponent.setWidth("500px");

        titleLayout = new TitleLayout(this);
        subTitleLayout = new SubTitleLayout(this);
        feeTextLayout = new FeeTextLayout(this);

        creditCardFieldsLayout = new CreditCardFieldsLayout(this);
    }

    @Override
    protected void addContent() {
        addComponent(titleLayout, Alignment.TOP_CENTER);
        addComponent(subTitleLayout, Alignment.TOP_CENTER);
        addCardsPic();
        addComponent(feeTextLayout, Alignment.TOP_CENTER);
        addSpacing(ComponentUtil.NORMAL_FORM_SPACING_PX);
        addComponent(creditCardFieldsLayout, Alignment.TOP_CENTER);
    }

    private void addCardsPic() {
        addSpace();

        Embedded cardsPic = new Embedded(null, new ThemeResource("images/cards.gif"));

        mainComponent.addComponent(cardsPic);
        mainComponent.setComponentAlignment(cardsPic, Alignment.MIDDLE_CENTER);

        addSpace();
    }

    public DOUserCC prepareUserCC() {
        DOUserCC preparedUserCC = new DOUserCC();
        if (userCC != null) {
            preparedUserCC.recID = userCC.recID;
        }

        CreditCardFields ccFields = creditCardFieldsLayout.getCreditCardFields();

        if (ccFields.getSaveAsDefaultCardCBLayout() != null)
        	preparedUserCC.isDefault = (Boolean) ccFields.getSaveAsDefaultCardCBLayout().getSaveAsDefaultCardCheckBox().getValue();
        else
        	preparedUserCC.isDefault = true;

        preparedUserCC.zip = (String) ccFields.getZipField().getValue();
        preparedUserCC.lastName = (String) ccFields.getLastNameField().getValue();
        preparedUserCC.firstName = (String) ccFields.getFirstNameField().getValue();

        preparedUserCC.countryCode = (String) ccFields.getCountryField().getValue();
        preparedUserCC.state = (String) ccFields.getStateProvinceField().getValue();
        preparedUserCC.city = (String) ccFields.getCityField().getValue();
        preparedUserCC.ccType = Integer.parseInt((String) ccFields.getCreditCardTypeField().getValue());
        preparedUserCC.ccSecurityCode = (String) ccFields.getCvnLayout().getCvnField().getValue();

        
        // new ccNumber entered in field
        String newCCNumber = (String) ccFields.getCcNumberLayout().getCcNumberField().getValue();
        
        // if newccNumber is empty or equal to previous CCNumber, then don't change it
        if ((userCC != null && newCCNumber.equals(userCC.ccNumber)) || TemplarUtil.isStringNullOrEmpty(newCCNumber) ){
            preparedUserCC.ccNumber = userCC.ccNumber;
        } else {
        	preparedUserCC.ccNumber = newCCNumber;
        }
        
        if (!TemplarUtil.isObjNullOrEmpty(ccFields.getCvnLayout().getCvnField().getValue()))
        	preparedUserCC.ccCVV2 = (String)ccFields.getCvnLayout().getCvnField().getValue();

        preparedUserCC.ccExpYear = Integer.parseInt((String) ccFields.getExpirationDateLayout()
                .getExpirationYearField().getValue());
        preparedUserCC.ccExpMonth = Integer.parseInt((String) ccFields.getExpirationDateLayout()
                .getExpirationMonthField().getValue());
        preparedUserCC.address1 = (String) ccFields.getAddress1Field().getValue();
        preparedUserCC.address2 = (String) ccFields.getAddress2Field().getValue();
        preparedUserCC.address3 = (String) ccFields.getAddress3Field().getValue();
        
        preparedUserCC.userRecId = parentView.getCurrentSecurityInfo().getUser().getUserRecId();
        
        preparedUserCC.phone = (String) ccFields.getPhoneField().getValue();
        
        return preparedUserCC;
    }

    public BaseView getParentView() {
        return parentView;
    }

    public boolean isEditable() {
        return editable;
    }

    public void setEditable(boolean editable) {
        this.editable = editable;
    }

    public CreditCardFieldsLayout getCreditCardFieldsLayout() {
        return creditCardFieldsLayout;
    }

    public DOUserCC getUserCC() {
        return userCC;
    }

    public void setUserCC(DOUserCC userCC) {
        this.userCC = userCC;
    }    
    
    @Override
    public void generateContent() {
    	creditCardFieldsLayout.generateContent();
    }    
}
