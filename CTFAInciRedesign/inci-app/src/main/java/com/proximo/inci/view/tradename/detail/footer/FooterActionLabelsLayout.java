/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.footer;

import com.proximo.inci.component.AbstractInciComponentLayout;
import com.proximo.inci.component.common.LabelComponent;
import com.vaadin.ui.VerticalLayout;

public class FooterActionLabelsLayout extends AbstractInciComponentLayout<VerticalLayout> {

    private FooterActionButtonsAndLabelsLayout parentLayout;

    private LabelComponent saveButtonDescriptionLabel;
    private LabelComponent saveAsButtonDescriptionLabel;
    private LabelComponent resetButtonDescriptionLabel;
    private LabelComponent submitButtonDescriptionLabel;
    private LabelComponent printFormButtonDescriptionLabel;
    private LabelComponent deleteButtonDescriptionLabel;
    private LabelComponent commentsButtonDescriptionLabel;
    private LabelComponent assignmentNoticeButtonDescriptionLabel;
    private LabelComponent exportButtonDescriptionLabel;
    private LabelComponent cancelButtonDescriptionLabel;
    private LabelComponent unarchiveButtonDescriptionLabel;

    public FooterActionLabelsLayout(FooterActionButtonsAndLabelsLayout parentLayout) {
        this.parentLayout = parentLayout;

        build();
    }

    @Override
    protected VerticalLayout createMainComponentInstance() {
        return new VerticalLayout();
    }

    @Override
    protected void init() {
        mainComponent.setWidth("740px");
        
        saveButtonDescriptionLabel = new LabelComponent("tradeName.detail.footer.saveButton.description",
                "very-small-bold-text", "30px");
        saveAsButtonDescriptionLabel = new LabelComponent("tradeName.detail.footer.saveAsButton.description",
                "very-small-bold-text", "26px");
        resetButtonDescriptionLabel = new LabelComponent("tradeName.detail.footer.resetButton.description",
                "very-small-bold-text", "26px");
        submitButtonDescriptionLabel = new LabelComponent("tradeName.detail.footer.submitButton.description",
                "very-small-bold-text", "26px");
        printFormButtonDescriptionLabel = new LabelComponent("tradeName.detail.footer.printFormButton.description",
                "very-small-bold-text", "26px");
        deleteButtonDescriptionLabel = new LabelComponent("tradeName.detail.footer.deleteButton.description",
                "very-small-bold-text", "26px");
        
        commentsButtonDescriptionLabel = new LabelComponent("tradeName.detail.footer.commentsButton.description",
                "very-small-bold-text", "26px");
        //commentsButtonDescriptionLabel.setAdminComponent(true);
        
        assignmentNoticeButtonDescriptionLabel = new LabelComponent(
                "tradeName.detail.footer.assignmentNoticeButton.description", "very-small-bold-text", "26px");
        //assignmentNoticeButtonDescriptionLabel.setAdminComponent(true);
        
        exportButtonDescriptionLabel = new LabelComponent(
                "tradeName.detail.footer.exportButton.description", "very-small-bold-text", "26px");
        //exportButtonDescriptionLabel.setAdminComponent(true);        
        
        unarchiveButtonDescriptionLabel = new LabelComponent(
                "tradeName.detail.footer.unarchiveButton.description", "very-small-bold-text", "26px");
        
        cancelButtonDescriptionLabel = new LabelComponent("tradeName.detail.footer.cancelButton.description",
                "very-small-bold-text", "26px");
    }

    @Override
    protected void addContent() {
        addComponent(saveButtonDescriptionLabel);
        addComponent(saveAsButtonDescriptionLabel);
        addComponent(resetButtonDescriptionLabel);
        addComponent(submitButtonDescriptionLabel);
        addComponent(printFormButtonDescriptionLabel);
        addComponent(deleteButtonDescriptionLabel);
        addComponent(commentsButtonDescriptionLabel);
        addComponent(assignmentNoticeButtonDescriptionLabel);
        addComponent(exportButtonDescriptionLabel);
        addComponent(unarchiveButtonDescriptionLabel);
        addSpacing(26);
        addComponent(cancelButtonDescriptionLabel);
    }
    
    public FooterActionButtonsAndLabelsLayout getParentLayout() {
    	return this.parentLayout;
    }

    @Override
    public void generateContent() {    
    	// apply visibility for label components
    	applyVisibility();
    }
    
    public void applyVisibility() {
    	/* set visibility based on button */
		saveButtonDescriptionLabel.setVisible(parentLayout.getFooterActionButtonsLayout().saveButton.isVisibile());
		saveAsButtonDescriptionLabel.setVisible(parentLayout.getFooterActionButtonsLayout().saveAsButton.isVisibile());
		resetButtonDescriptionLabel.setVisible(parentLayout.getFooterActionButtonsLayout().resetButton.isVisibile());
		submitButtonDescriptionLabel.setVisible(parentLayout.getFooterActionButtonsLayout().submitButton.isVisibile());
		printFormButtonDescriptionLabel.setVisible(parentLayout.getFooterActionButtonsLayout().printFormButton.isVisibile());
		deleteButtonDescriptionLabel.setVisible(parentLayout.getFooterActionButtonsLayout().deleteButton.isVisibile());
		commentsButtonDescriptionLabel.setVisible(parentLayout.getFooterActionButtonsLayout().commentsButton.isVisibile());
		assignmentNoticeButtonDescriptionLabel.setVisible(parentLayout.getFooterActionButtonsLayout().assignmentNoticeButton.isVisibile());
		exportButtonDescriptionLabel.setVisible(parentLayout.getFooterActionButtonsLayout().exportButton.isVisibile());
		unarchiveButtonDescriptionLabel.setVisible(parentLayout.getFooterActionButtonsLayout().unarchiveButton.isVisibile());
		cancelButtonDescriptionLabel.setVisible(parentLayout.getFooterActionButtonsLayout().cancelButton.isVisibile());
    }    

}
