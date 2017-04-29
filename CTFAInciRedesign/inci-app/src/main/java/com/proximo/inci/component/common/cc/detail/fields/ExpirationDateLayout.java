/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.component.common.cc.detail.fields;

import java.util.Calendar;

//import com.proximo.inci.DOUserCC;
import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.component.AbstractInciComponentLayout;
import com.proximo.inci.component.common.LabelComponent;
import com.proximo.inci.component.common.cc.detail.AbstractCreditCardDetailLayout;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.HorizontalLayout;

public class ExpirationDateLayout extends AbstractInciComponentLayout<HorizontalLayout> {

    private AbstractCreditCardDetailLayout creditCardDetailLayout;

    private ExpirationMonthField expirationMonthField;
    private ExpirationYearField expirationYearField;
    private LabelComponent dateFormatInfo;

    public ExpirationDateLayout(AbstractCreditCardDetailLayout creditCardDetailLayout) {
        this.creditCardDetailLayout = creditCardDetailLayout;

        build();
    }

    @Override
    protected HorizontalLayout createMainComponentInstance() {
        return new HorizontalLayout();
    }

    @Override
    protected void init() {
        mainComponent.setCaption(CaptionResolver.getCaption("credit_card.detail.expiration"));
        mainComponent.addStyleName("required-field");

        expirationMonthField = new ExpirationMonthField(creditCardDetailLayout);
        expirationYearField = new ExpirationYearField(creditCardDetailLayout);
        dateFormatInfo = new LabelComponent("credit_card.detail.expiration.year_format","required-field-label");
    }

    @Override
    protected void addContent() {
        addComponent(expirationMonthField);
        addSpace();
        addComponent(expirationYearField);
        addSpace();
        addComponent(dateFormatInfo, Alignment.MIDDLE_CENTER);
    }

    @Override
    public String validate() {
        String result = super.validate();

        if (result == null) {
            result = validateExpirationDate();
        }

        return result;
    }
    
    @Override
    public void generateContent() {
    	expirationMonthField.generateContent();
    	expirationYearField.generateContent();
    }    

    private String validateExpirationDate() {
        Calendar calendar = Calendar.getInstance();
        int currentMonth = calendar.get(Calendar.MONTH) + 1;
        int currentYear = calendar.get(Calendar.YEAR);

        Integer enteredMonth = Integer.valueOf((String) expirationMonthField.getValue());
        Integer enteredYear = Integer.valueOf((String) expirationYearField.getValue());

        if ((enteredMonth < currentMonth && enteredYear <= currentYear) || enteredYear < currentYear) {
            return CaptionResolver.getCaption("credit_card.detail.expiration_date.INVALID_VALUE");
        }

        return null;
    }

    public ExpirationMonthField getExpirationMonthField() {
        return expirationMonthField;
    }

    public ExpirationYearField getExpirationYearField() {
        return expirationYearField;
    }

}
