/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.archive.search.form.fields.right;

import com.proximo.inci.component.util.ComponentUtil;
import com.proximo.inci.view.tradename.archive.search.form.TradeNameArchiveSearchForm;
import com.proximo.inci.view.tradename.archive.search.form.fields.TradeNameArchiveSearchFields;

public class TradeNameArchiveSearchFieldsRight extends TradeNameArchiveSearchFields {

    private ApplicationNumberField applicationNumberField;
    private AssignmentDatesLayout assignmentDatesLayout;

    public TradeNameArchiveSearchFieldsRight(TradeNameArchiveSearchForm parentForm) {
        super(parentForm);
    }

    @Override
    protected void init() {
        super.init();

        applicationNumberField = new ApplicationNumberField();
        assignmentDatesLayout = new AssignmentDatesLayout();
    }

    @Override
    protected void addContent() {
        addComponent(applicationNumberField);
        addSpacing(ComponentUtil.NORMAL_FORM_SPACING_PX);
        addComponent(assignmentDatesLayout);
    }

    public void clear() {
        applicationNumberField.setValue("");
        assignmentDatesLayout.clear();
    }

    @Override
    public String validate() {
        String validationErrorStr = null;

        validationErrorStr = assignmentDatesLayout.validate();        

        return validationErrorStr;
    }

    public ApplicationNumberField getApplicationNumberField() {
        return applicationNumberField;
    }

    public AssignmentDatesLayout getAssignmentDatesLayout() {
        return assignmentDatesLayout;
    }

}
