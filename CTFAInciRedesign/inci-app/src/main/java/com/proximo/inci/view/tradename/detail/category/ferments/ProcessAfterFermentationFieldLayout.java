/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.category.ferments;

import com.proximo.inci.component.common.LabelComponent;
import com.proximo.inci.view.tradename.detail.category.column.TradeNameColumnDetails;
import com.proximo.inci.view.tradename.detail.category.column.TradeNameColumnDetailsFieldLayout;
import com.vaadin.ui.VerticalLayout;

public class ProcessAfterFermentationFieldLayout extends TradeNameColumnDetailsFieldLayout<VerticalLayout> {

    private LabelComponent processAfterFermentationFieldLabel;
    private LabelComponent processAfterFermentationFieldDescriptionLabel;
    private ProcessAfterFermentationField processAfterFermentationField;

    public ProcessAfterFermentationFieldLayout(TradeNameColumnDetails parentColumnDetails) {
        super(parentColumnDetails, null, null);
    }
    
    public ProcessAfterFermentationFieldLayout(TradeNameColumnDetails parentColumnDetails, Integer fieldTabIndex) {
        super(parentColumnDetails, null, fieldTabIndex);
    }

    @Override
    protected VerticalLayout createMainComponentInstance() {
        return new VerticalLayout();
    }

    @Override
    protected void init() {
        processAfterFermentationFieldLabel = new LabelComponent("tradeName.detail.processAfterFermentationField",
                "required-field-label");
        processAfterFermentationFieldDescriptionLabel = new LabelComponent(
                "tradeName.detail.processAfterFermentationField.description", "very-small-text");

        processAfterFermentationField = new ProcessAfterFermentationField(this);
    }

    @Override
    protected void addContent() {
        addComponent(processAfterFermentationFieldLabel);
        addComponent(processAfterFermentationFieldDescriptionLabel);
        addComponent(processAfterFermentationField);
    }

    public ProcessAfterFermentationField getProcessAfterFermentationField() {
        return processAfterFermentationField;
    }

}
