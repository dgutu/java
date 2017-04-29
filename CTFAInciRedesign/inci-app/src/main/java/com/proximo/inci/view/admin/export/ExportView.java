/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.admin.export;

import java.util.Date;

import com.proximo.inci.common.TDate;
import com.proximo.inci.service.tradename.CsvTradeNameExportService;
import com.proximo.inci.view.BaseView;
import com.proximo.inci.window.main.MainWindow;

public class ExportView extends BaseView {

    public static final String FORM_WIDTH = "900px";

    private ExportFieldsLayout exportFieldsLayout;
    private DownloadExportResultLink downloadExportResultLink;

    public ExportView(MainWindow mainWindow) {
        super(mainWindow, true, "view.admin.export");
    }

    @Override
    protected void init() {
        super.init();

        mainComponent.setWidth(FORM_WIDTH);

        exportFieldsLayout = new ExportFieldsLayout(this);
        downloadExportResultLink = new DownloadExportResultLink(this);
    }

    @Override
    protected void addContent() {
        super.addContent();

        addComponent(exportFieldsLayout);
        addSpace();
    }

    public void export() {
        String fileName = CsvTradeNameExportService.generateMultipleTNExportResultFileName();

        String userId = getCurrentSecurityInfo().getUser().getLoginId();

        TDate assignmentStartDt = new TDate();
        assignmentStartDt.setNull();
        Date assignmentStartDate = (Date) exportFieldsLayout.getFromDate().getValue();
        if (assignmentStartDate != null) {
            assignmentStartDt = new TDate(assignmentStartDate);
        }

        TDate assignmentEndDt = new TDate();
        assignmentEndDt.setNull();
        Date assignmentEndDate = (Date) exportFieldsLayout.getToDate().getValue();
        if (assignmentEndDate != null) {
            assignmentEndDt = new TDate(assignmentEndDate);
        }

        byte[] fileContent = CsvTradeNameExportService.exportTradeNames(userId, assignmentStartDt, assignmentEndDt);
        CsvTradeNameExportService.uploadExportResultFile(fileContent, fileName);

        downloadExportResultLink.refresh(fileName, fileContent);
        addComponent(downloadExportResultLink);
    }

    @Override
    public void handleNavigateOut() {
        exportFieldsLayout.clear();
        removeComponent(downloadExportResultLink);
    }
}
