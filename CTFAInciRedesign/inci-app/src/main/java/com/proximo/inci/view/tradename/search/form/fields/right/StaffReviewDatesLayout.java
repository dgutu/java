/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.search.form.fields.right;

import java.util.Date;

import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.common.TDate;
import com.proximo.inci.component.AbstractInciComponentLayout;
import com.proximo.inci.component.common.LabelComponent;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.HorizontalLayout;

public class StaffReviewDatesLayout extends AbstractInciComponentLayout<HorizontalLayout> {

    private StaffReviewDateFromField staffReviewDateFromField;
    private LabelComponent staffReviewDateToFieldCaption;
    private StaffReviewDateToField staffReviewDateToField;

    public StaffReviewDatesLayout() {
        build();
    }

    @Override
    protected HorizontalLayout createMainComponentInstance() {
        return new HorizontalLayout();
    }

    @Override
    protected void init() {
        mainComponent.setCaption(CaptionResolver.getCaption("tradeName.search.staffReviewDateFieldFrom"));

        staffReviewDateFromField = new StaffReviewDateFromField();
        staffReviewDateToFieldCaption = new LabelComponent("tradeName.search.staffReviewDateFieldTo");
        staffReviewDateToField = new StaffReviewDateToField();
    }

    @Override
    protected void addContent() {
        addComponent(staffReviewDateFromField);
        addSpace(3);
        addComponent(staffReviewDateToFieldCaption, Alignment.MIDDLE_CENTER);
        addSpace(3);
        addComponent(staffReviewDateToField);
    }

    public void clear() {
        staffReviewDateFromField.setValue(null);
        staffReviewDateToField.setValue(null);
    }

    public Date getStaffReviewDateFromFieldValue() {
        return (Date) staffReviewDateFromField.getValue();
    }
    
    public void setStaffReviewDateFromFieldValue(TDate value) {
        staffReviewDateFromField.setValue(value.formatIt(6));
    }    

    public Date getStaffReviewDateToFieldValue() {
        return (Date) staffReviewDateToField.getValue();
    }
    
    public void setStaffReviewDateToFieldValue(TDate value) {
    	staffReviewDateToField.setValue(value.formatIt(6));
    }    

    public StaffReviewDateFromField getStaffReviewDateFromField() {
        return staffReviewDateFromField;
    }
    
    public StaffReviewDateToField getStaffReviewDateToField() {
        return staffReviewDateToField;
    }
    

}
