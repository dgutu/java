/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.header;

import com.proximo.inci.component.AbstractInciComponentLayout;
import com.proximo.inci.view.tradename.detail.button.CancelButton;
import com.proximo.inci.view.tradename.detail.button.ExportButton;
import com.proximo.inci.view.tradename.detail.button.PrintFormButton;
import com.proximo.inci.view.tradename.detail.button.SaveButton;
import com.proximo.inci.view.tradename.detail.button.UnarchiveButton;
import com.vaadin.ui.HorizontalLayout;

public class HeaderActionButtonsLayout extends AbstractInciComponentLayout<HorizontalLayout> {

    private TradeNameDetailViewHeader parentHeader;

    private SaveButton saveButton;
    private CancelButton cancelButton;
    private PrintFormButton printFormButton;
    private ExportButton exportButton;
    private UnarchiveButton unarchiveButton;

    public HeaderActionButtonsLayout(TradeNameDetailViewHeader parentHeader) {
        this.parentHeader = parentHeader;

        build();
    }

    @Override
    protected HorizontalLayout createMainComponentInstance() {
        return new HorizontalLayout();
    }

    @Override
    protected void init() {
        mainComponent.setSpacing(true);

        saveButton = new SaveButton(parentHeader.getParentView());
        cancelButton = new CancelButton(parentHeader.getParentView());
        printFormButton = new PrintFormButton(parentHeader.getParentView());
        exportButton = new ExportButton(parentHeader.getParentView());
        unarchiveButton = new UnarchiveButton(parentHeader.getParentView());
    }

    @Override
    protected void addContent() {
        addComponent(saveButton);
        addComponent(cancelButton);
        addComponent(printFormButton);
        addComponent(exportButton);
        addComponent(unarchiveButton);
    }

}
