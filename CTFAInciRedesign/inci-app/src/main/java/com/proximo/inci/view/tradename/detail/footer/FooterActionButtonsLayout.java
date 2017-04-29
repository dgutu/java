/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.footer;

import com.proximo.inci.component.AbstractInciComponentLayout;
import com.proximo.inci.view.tradename.detail.TradeNameDetailView;
import com.proximo.inci.view.tradename.detail.button.AssignmentNoticeButton;
import com.proximo.inci.view.tradename.detail.button.CancelButton;
import com.proximo.inci.view.tradename.detail.button.CommentsButton;
import com.proximo.inci.view.tradename.detail.button.DeleteButton;
import com.proximo.inci.view.tradename.detail.button.ExportButton;
import com.proximo.inci.view.tradename.detail.button.PrintFormButton;
import com.proximo.inci.view.tradename.detail.button.ResetButton;
import com.proximo.inci.view.tradename.detail.button.SaveAsButton;
import com.proximo.inci.view.tradename.detail.button.SaveButton;
import com.proximo.inci.view.tradename.detail.button.SubmitButton;
import com.proximo.inci.view.tradename.detail.button.UnarchiveButton;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.VerticalLayout;

public class FooterActionButtonsLayout extends AbstractInciComponentLayout<VerticalLayout> {

    private FooterActionButtonsAndLabelsLayout parentLayout;

    public SaveButton saveButton;
    public SaveAsButton saveAsButton;
    public ResetButton resetButton;
    public SubmitButton submitButton;
    public PrintFormButton printFormButton;
    public DeleteButton deleteButton;
    public CommentsButton commentsButton;
    public AssignmentNoticeButton assignmentNoticeButton;
    public CancelButton cancelButton;
    public ExportButton exportButton;
    public UnarchiveButton unarchiveButton;

    public FooterActionButtonsLayout(FooterActionButtonsAndLabelsLayout parentLayout) {
        this.parentLayout = parentLayout;

        build();
    }

    @Override
    protected VerticalLayout createMainComponentInstance() {
        return new VerticalLayout();
    }

    @Override
    protected void init() {
        mainComponent.setWidth("160px");
        
        TradeNameDetailView parentView = parentLayout.getParentFooter().getParentView();

        saveButton = new SaveButton(parentView);
        saveAsButton = new SaveAsButton(parentView);
        resetButton = new ResetButton(parentView);
        submitButton = new SubmitButton(parentView);
        printFormButton = new PrintFormButton(parentView);
        deleteButton = new DeleteButton(parentView);
        commentsButton = new CommentsButton(parentView);
        assignmentNoticeButton = new AssignmentNoticeButton(parentView);
        cancelButton = new CancelButton(parentView);
        exportButton = new ExportButton(parentView);
        unarchiveButton = new UnarchiveButton(parentView);
    }

    @Override
    protected void addContent() {
        addComponent(saveButton, Alignment.MIDDLE_RIGHT);
        addComponent(saveAsButton, Alignment.MIDDLE_RIGHT);
        addComponent(resetButton, Alignment.MIDDLE_RIGHT);
        addComponent(submitButton, Alignment.MIDDLE_RIGHT);
        addComponent(printFormButton, Alignment.MIDDLE_RIGHT);
        addComponent(deleteButton, Alignment.MIDDLE_RIGHT);
        addComponent(commentsButton, Alignment.MIDDLE_RIGHT);
        addComponent(assignmentNoticeButton, Alignment.MIDDLE_RIGHT);
        addComponent(exportButton, Alignment.MIDDLE_RIGHT);
        addComponent(unarchiveButton, Alignment.MIDDLE_RIGHT);
        addSpacing(26);
        addComponent(cancelButton, Alignment.MIDDLE_RIGHT);
    }
}
