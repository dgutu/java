/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.extra;

import com.proximo.inci.component.common.LabelComponent;
import com.vaadin.ui.HorizontalLayout;

public class ExportQuestionLayout extends TradeNameExtraDetailsComponentLayout<HorizontalLayout> {

    private LabelComponent exportQuestionOptGrpLabel;
    private ExportQuestionOptGrp exportQuestionOptGrp;
    private ExportQuestionDateField exportQuestionDateField;

    public ExportQuestionLayout(TradeNameExtraDetails parentDetails) {
        super(parentDetails);
    }

    @Override
    protected HorizontalLayout createMainComponentInstance() {
        return new HorizontalLayout();
    }

    @Override
    protected void init() {
        setAdminComponent(true);

        exportQuestionOptGrpLabel = new LabelComponent("tradeName.detail.exportQuestionOptGrp");
        exportQuestionOptGrp = new ExportQuestionOptGrp(this);
        exportQuestionDateField = new ExportQuestionDateField(this);
    }

    @Override
    protected void addContent() {
        addComponent(exportQuestionOptGrpLabel);
        addComponent(exportQuestionOptGrp);
        addComponent(exportQuestionDateField);
    }
    
    public void refreshExportQuestionDateField() {
        exportQuestionDateField.refresh((Boolean) exportQuestionOptGrp.getValue());
    }

    public ExportQuestionOptGrp getExportQuestionOptGrp() {
        return exportQuestionOptGrp;
    }

    public ExportQuestionDateField getExportQuestionDateField() {
        return exportQuestionDateField;
    }

}
