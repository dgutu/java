/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.search.form.fields.right;

import java.util.Date;

//import com.proximo.inci.component.common.CategoryField;
import com.proximo.inci.component.common.SpacingComponent;
import com.proximo.inci.component.util.ComponentUtil;
import com.proximo.inci.service.security.SecurityInfo;
import com.proximo.inci.view.tradename.search.form.TradeNameSearchForm;
import com.proximo.inci.view.tradename.search.form.fields.TradeNameSearchFields;
import com.proximo.inci.view.tradename.search.form.fields.left.EntryDateFromField;
import com.proximo.inci.view.tradename.search.form.fields.left.EntryDateToField;
import com.proximo.inci.view.tradename.search.form.fields.left.EntryDatesLayout;

public class TradeNameSearchFieldsRight extends TradeNameSearchFields {

    private CommentsCheckBoxesLayout commentsCheckBoxesLayout;
    //private CategoryField categoryField;
    private EntryDatesLayout entryDatesLayout;
    private StaffReviewDatesLayout staffReviewDatesLayout;
    private CommiteeReviewDatesLayout commiteeReviewDatesLayout;
    private SubmissionStatusField submissionStatusField;

    public TradeNameSearchFieldsRight(TradeNameSearchForm parentForm) {
        super(parentForm);
    }
    
    @Override
    protected void init() {
        super.init();
        
        commentsCheckBoxesLayout = new CommentsCheckBoxesLayout();
        commentsCheckBoxesLayout.setAdminComponent(true);
        
        //categoryField = new CategoryField(TradeNameSearchForm.FORM_TEXT_FIELD_WIDTH, "tradeName.search.categoryField");
        entryDatesLayout = new EntryDatesLayout();
        
        staffReviewDatesLayout = new StaffReviewDatesLayout();
        staffReviewDatesLayout.setAdminComponent(true);
        
        commiteeReviewDatesLayout = new CommiteeReviewDatesLayout();
        commiteeReviewDatesLayout.setAdminComponent(true);
        
        submissionStatusField = new SubmissionStatusField();
    }

    @Override
    protected void addContent() {
        addCommentsCheckBoxesLayout();
        //addComponent(categoryField);
        addEntryDatesLayout();
        addSpacing(ComponentUtil.NORMAL_FORM_SPACING_PX);
        addStaffReviewDatesLayout();
        addCommiteeReviewDatesLayout();
        addComponent(submissionStatusField);
        addSpacing(ComponentUtil.NORMAL_FORM_SPACING_PX);
    }

    private void addEntryDatesLayout() {
        addComponent(entryDatesLayout);
        SpacingComponent spacingComponent = ComponentUtil.createNormalSpacingComponent();
        addComponent(spacingComponent);
    }    
    
    private void addCommentsCheckBoxesLayout() {
        addComponent(commentsCheckBoxesLayout);
        
        SpacingComponent spacingComponent = ComponentUtil.createNormalSpacingComponent();
        addComponent(spacingComponent);
        spacingComponent.setAdminComponent(true);
    }

    private void addStaffReviewDatesLayout() {
        addComponent(staffReviewDatesLayout);
        SpacingComponent spacingComponent = ComponentUtil.createNormalSpacingComponent();
        addComponent(spacingComponent);
        spacingComponent.setAdminComponent(true);
    }

    private void addCommiteeReviewDatesLayout() {
        addComponent(commiteeReviewDatesLayout);
        
        SpacingComponent commiteeReviewDatesLayoutSpacingComponent = ComponentUtil.createNormalSpacingComponent();
        addComponent(commiteeReviewDatesLayoutSpacingComponent);
        commiteeReviewDatesLayoutSpacingComponent.setAdminComponent(true);        
    }

    public void clear() {
        commentsCheckBoxesLayout.clear();
        //categoryField.setValue(null);
        staffReviewDatesLayout.clear();
        commiteeReviewDatesLayout.clear();
        submissionStatusField.setValue(null);
        entryDatesLayout.clear();
    }

    @Override
    public String validate() {
        String validationErrorStr = null;
        
        SecurityInfo securityInfo = parentForm.getParentView().getCurrentSecurityInfo();
        
        if (securityInfo.getUser().isAdmin()) {
            validationErrorStr = staffReviewDatesLayout.validate();
            if (validationErrorStr == null) {
                validationErrorStr = commiteeReviewDatesLayout.validate();
            }
        }
        
        return validationErrorStr;
    }

    public Boolean getCommentsOutsdFieldValue() {
        return commentsCheckBoxesLayout.getCommentsOutsdFieldValue();
    }    

    public Boolean getCommentsRespondFieldValue() {
        return commentsCheckBoxesLayout.getCommentsRespondFieldValue();
    }

    /*public String getCategoryFieldValue() {
        return (String) categoryField.getValue();
    }*/

    public Date getStaffReviewDateFromFieldValue() {
        return staffReviewDatesLayout.getStaffReviewDateFromFieldValue();
    }

    public Date getStaffReviewDateToFieldValue() {
        return staffReviewDatesLayout.getStaffReviewDateToFieldValue();
    }

    public Date getCommiteeReviewDateFromFieldValue() {
        return commiteeReviewDatesLayout.getCommiteeReviewDateFromFieldValue();
    }

    public Date getCommiteeReviewDateToFieldValue() {
        return commiteeReviewDatesLayout.getCommiteeReviewDateToFieldValue();
    }

    public String getSubmissionStatusFieldValue() {
        return (String) submissionStatusField.getValue();
    }

    public StaffReviewDateFromField getStaffReviewDateFromField() {
        return staffReviewDatesLayout.getStaffReviewDateFromField();
    }
    
    public StaffReviewDateToField getStaffReviewDateToField() {
        return staffReviewDatesLayout.getStaffReviewDateToField();
    }
    
    
    /*****/
    
    public CommentsCheckBoxesLayout getCommentsCheckBoxesLayout() {
    	return commentsCheckBoxesLayout;
    }
    
    /*public CategoryField getCategoryField() {
    	return categoryField;
    }*/
    
    public StaffReviewDatesLayout getStaffReviewDatesLayout() {
    	return staffReviewDatesLayout;
    }
    
    public CommiteeReviewDatesLayout getCommiteeReviewDatesLayout() {
    	return commiteeReviewDatesLayout;
    }
    
    public SubmissionStatusField getSubmissionStatusField() {
    	return submissionStatusField;
    }
    
    public Date getEntryDateFromFieldValue() {
        return entryDatesLayout.getEntryDateFromFieldValue();
    }

    public Date getEntryDateToFieldValue() {
        return entryDatesLayout.getEntryDateToFieldValue();
    }   
    
    public EntryDateFromField getEntryDateFromField() {
        return entryDatesLayout.getEntryDateFromField();
    }
    
    public EntryDateToField getEntryDateToField() {
        return entryDatesLayout.getEntryDateToField();
    }
    

    

}
