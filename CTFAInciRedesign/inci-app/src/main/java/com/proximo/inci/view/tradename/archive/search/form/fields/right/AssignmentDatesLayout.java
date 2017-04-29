/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.archive.search.form.fields.right;

import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.component.AbstractInciComponentLayout;
import com.proximo.inci.component.common.LabelComponent;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.HorizontalLayout;

public class AssignmentDatesLayout extends AbstractInciComponentLayout<HorizontalLayout> {

    private AssignmentDateFromField assignmentDateFromField;
    private LabelComponent commiteeReviewDateToFieldCaption;
    private AssignmentDateToField assignmentDateToField;

    public AssignmentDatesLayout() {
        build();
    }

    @Override
    protected HorizontalLayout createMainComponentInstance() {
        return new HorizontalLayout();
    }

    @Override
    protected void init() {
        mainComponent.setCaption(CaptionResolver.getCaption("view.trade_name.archive.search.assignment_date_from"));

        assignmentDateFromField = new AssignmentDateFromField();
        commiteeReviewDateToFieldCaption = new LabelComponent("view.trade_name.archive.search.assignment_date_to");
        assignmentDateToField = new AssignmentDateToField();
    }

    @Override
    protected void addContent() {
        addComponent(assignmentDateFromField);
        addSpace(3);
        addComponent(commiteeReviewDateToFieldCaption, Alignment.MIDDLE_CENTER);
        addSpace(3);
        addComponent(assignmentDateToField);
    }

    public void clear() {
        assignmentDateFromField.setValue(null);
        assignmentDateToField.setValue(null);
    }

    public AssignmentDateFromField getAssignmentDateFromField() {
        return assignmentDateFromField;
    }

    public AssignmentDateToField getAssignmentDateToField() {
        return assignmentDateToField;
    }

}
