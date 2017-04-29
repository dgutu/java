/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.search.form.fields.right;

import java.util.Date;

import com.proximo.inci.caption.CaptionResolver;
//import com.proximo.inci.common.TDate;
import com.proximo.inci.component.AbstractInciComponentLayout;
import com.proximo.inci.component.common.LabelComponent;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.HorizontalLayout;

public class CommiteeReviewDatesLayout extends AbstractInciComponentLayout<HorizontalLayout> {

    private CommiteeReviewDateFromField commiteeReviewDateFromField;
    private LabelComponent commiteeReviewDateToFieldCaption;
    private CommiteeReviewDateToField commiteeReviewDateToField;

    public CommiteeReviewDatesLayout() {
        build();
    }

    @Override
    protected HorizontalLayout createMainComponentInstance() {
        return new HorizontalLayout();
    }

    @Override
    protected void init() {
        mainComponent.setCaption(CaptionResolver.getCaption("tradeName.search.commiteeReviewDateFieldFrom"));

        commiteeReviewDateFromField = new CommiteeReviewDateFromField();
        commiteeReviewDateToFieldCaption = new LabelComponent("tradeName.search.commiteeReviewDateFieldTo");
        commiteeReviewDateToField = new CommiteeReviewDateToField();
    }

    @Override
    protected void addContent() {
        addComponent(commiteeReviewDateFromField);
        addSpace(3);
        addComponent(commiteeReviewDateToFieldCaption, Alignment.MIDDLE_CENTER);
        addSpace(3);
        addComponent(commiteeReviewDateToField);
    }

    public void clear() {
        commiteeReviewDateFromField.setValue(null);
        commiteeReviewDateToField.setValue(null);
    }

    public Date getCommiteeReviewDateFromFieldValue() {
        return (Date) commiteeReviewDateFromField.getValue();
    }
    
    public void setCommiteeReviewDateFromFieldValue(Date value) {
        commiteeReviewDateFromField.setValue(value);
    }    

    public Date getCommiteeReviewDateToFieldValue() {
        return (Date) commiteeReviewDateToField.getValue();
    }
    
    public void setCommiteeReviewDateToFieldValue(Date value) {
        commiteeReviewDateToField.setValue(value);
    }
    

}
