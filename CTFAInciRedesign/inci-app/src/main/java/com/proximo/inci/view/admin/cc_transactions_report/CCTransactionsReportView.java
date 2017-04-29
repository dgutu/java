/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.admin.cc_transactions_report;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Date;
import java.util.Map;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.lowagie.text.Document;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.Rectangle;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import com.proximo.inci.DOCreditCardReport;
import com.proximo.inci.DOList;
import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.common.TDate;
import com.proximo.inci.common.TemplarUtil;
import com.proximo.inci.service.payment.CCTransactionsReportParams;
import com.proximo.inci.view.BaseView;
import com.proximo.inci.view.ViewKey;
import com.proximo.inci.view.admin.cc_transactions_report.form.CCTransactionsReportForm;
import com.proximo.inci.view.admin.cc_transactions_report.result.SearchResultsTableLayout;
import com.proximo.inci.window.main.MainWindow;
import com.proximo.inci.window.main.URIUtil;
import com.vaadin.terminal.StreamResource;
import com.vaadin.terminal.StreamResource.StreamSource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.PopupDateField;
import com.vaadin.ui.Window.Notification;

@SuppressWarnings("serial")
public class CCTransactionsReportView extends BaseView {

	private static Logger logger = LoggerFactory.getLogger(CCTransactionsReportView.class);
    private CCTransactionsReportForm ccTransactionsReportForm;
    private SearchResultsTableLayout searchResultsTableLayout;

    private Button.ClickListener searchBtnListener;
    private Button.ClickListener cancelBtnListener;
    private Button.ClickListener printBtnListener;

    public CCTransactionsReportView(MainWindow mainWindow) {
        super(mainWindow, true, "view.admin.cc_transactions_report");
    }

    @Override
    protected void init() {
        super.init();

        searchBtnListener = createSearchBtnListener();
        cancelBtnListener = createCancelBtnListener();
        printBtnListener = createPrintBtnListener();

        ccTransactionsReportForm = new CCTransactionsReportForm(this);
        searchResultsTableLayout = new SearchResultsTableLayout(this);
    }

    @Override
    protected void addContent() {
        super.addContent();

        addComponent(ccTransactionsReportForm);
        addSpace();
        addComponent(searchResultsTableLayout);
    }
    
    // print CC transaction report
    private Button.ClickListener createPrintBtnListener() {
        return new Button.ClickListener() {
            @Override
            public void buttonClick(ClickEvent event) {
            	if (!checkInputParameters() && searchResultsTableLayout.getCCReportResult() == null) {
            		String notificationCaption = CaptionResolver.getCaption("view.admin.cc_transactions_report.search.search_form.wrgmsg2");
            		mainComponent.getWindow().showNotification(notificationCaption, Notification.TYPE_WARNING_MESSAGE);
            	}
            	else { // generate PDF
            		printCCPDFReport();
            	}
            }
        };
    }    

    private Button.ClickListener createCancelBtnListener() {
        return new Button.ClickListener() {
            @Override
            public void buttonClick(ClickEvent event) {
                navigateTo(ViewKey.ADMIN_FUNCTIONS.toString());
            }
        };
    }

    private Button.ClickListener createSearchBtnListener() {
        return new Button.ClickListener() {
            @Override
            public void buttonClick(ClickEvent event) {    
            	String notificationCaption = CaptionResolver.getCaption("view.admin.cc_transactions_report.search.search_form.wrgmsg");
            	
            	// 
            	if (checkInputParameters()) {
            		searchResultsTableLayout.search(ccTransactionsReportForm.fillSearchParams(), true);
            	}
            	else {
            		mainComponent.getWindow().showNotification(notificationCaption, Notification.TYPE_WARNING_MESSAGE);
            	}
            }
        };
    }

    @Override
    public void handleNavigateOut() {
		if (!getCurrentView().contains("search")) {    	
	        ccTransactionsReportForm.clearSearchFields();
	        searchResultsTableLayout.clearSearchResults();
		}
    }

    public Button.ClickListener getCancelBtnListener() {
        return cancelBtnListener;
    }

    public Button.ClickListener getSearchBtnListener() {
        return searchBtnListener;
    }
    
    public Button.ClickListener getPrintBtnListener() {
        return printBtnListener;
    }
    
    public CCTransactionsReportForm getCcTransactionsReportForm() {
    	return this.ccTransactionsReportForm;
    }
    
    /* refresh search result after navigate */
    @Override    
    public void applyNavigationParameters(Map<String, Object> navigationParameterMap) {
		String fragment = getCurrentView();		
		
		if (fragment.contains("search")) {
			
			// parameters
			Properties prop = new Properties();
			prop = URIUtil.fillSearchParamByURIString(fragment);			
			
			CCTransactionsReportParams searchParams = new CCTransactionsReportParams();
			searchParams.setTransactionStartDt(new TDate(prop.getProperty(searchParams.transactionStartDtURI)));
			searchParams.setTransactionEndDt(new TDate(prop.getProperty(searchParams.transactionEndDtURI)));
			searchParams.setSearchStr(prop.getProperty(searchParams.searchURI));
			searchParams.setLogon(prop.getProperty(searchParams.logonURI));
			searchParams.setUserCompanyName(prop.getProperty(searchParams.pubCompURI));
		
			// fill search form based on search params
			ccTransactionsReportForm.fillSearchFom(searchParams);
			
			// log the the DB
			//TradeNameService.log("CCTransactionsReportView.applyNavigationParameters current View:" + getCurrentView());
			//TradeNameService.log("CCTransactionsReportView.applyNavigationParameters previous View:" + getPreviousView());
			
			// search for applications and don't set the URI
			searchResultsTableLayout.search(ccTransactionsReportForm.fillSearchParams(), false);
		}
    }
    
    public void printCCPDFReport() {
        String fileName = "ccReport.pdf";

        final byte[] pdfContent = generatePDF(searchResultsTableLayout.getCCReportResult());

        StreamSource streamSource = new StreamSource() {
            /**
			 * 
			 */
			private static final long serialVersionUID = -8115268242273178525L;

			@Override
            public InputStream getStream() {
                return new ByteArrayInputStream(pdfContent);
            }
        };

        StreamResource streamResource = new StreamResource(streamSource, fileName, getApplication());

        /* Do not display in a browser, but let the file to be downloaded. */        
        streamResource.getStream().setParameter("Content-Disposition", "attachment;filename=\"" + fileName + "\"");
        streamResource.setMIMEType("application/octet-stream");
        streamResource.setCacheTime(5000); // fix for IE

        mainWindow.open(streamResource, "_blank");        
    }

	@SuppressWarnings("unused")
	private byte[] generatePDF(DOList ccReportResult) {		
        ByteArrayOutputStream pdfByteOutputStream = new ByteArrayOutputStream();
        byte[] result = new byte[] {};

        int allBorders = Rectangle.LEFT | Rectangle.RIGHT | Rectangle.TOP | Rectangle.BOTTOM;
        PdfPCell emptyCell = new PdfPCell();
        emptyCell.disableBorderSide(allBorders);
		
        try {
            // Start writing to the document
            Document pdfDocument = new Document();
            pdfDocument.setMargins(0.5F, 0.5F, 1.0F, 1.0F);
            
            PdfWriter outputWriter = PdfWriter.getInstance(pdfDocument, pdfByteOutputStream);
            
            pdfDocument.open();
            
	        // Title
	        PdfPTable titleTable = new PdfPTable(1);
	        PdfPCell titleCell = new PdfPCell();
	        Phrase titlePhrase = new Phrase("Credit Card Transactions Report", FontFactory.getFont(FontFactory.TIMES_ROMAN,
	                14.0F, Font.BOLD));
	        titleCell.setPhrase(titlePhrase);
	        titleCell.setPaddingTop(24.0F);
	        titleCell.disableBorderSide(allBorders);
	        titleCell.setHorizontalAlignment(Element.ALIGN_CENTER);
	        titleTable.addCell(titleCell);
	        pdfDocument.add(titleTable);
	        
	        // Search parameters
	        PdfPTable searchTable = new PdfPTable(1);
	        
	        PopupDateField dateFrom = ccTransactionsReportForm.getSearchFieldsLayout().getDateFrom();	        
	        PopupDateField dateTo = ccTransactionsReportForm.getSearchFieldsLayout().getDateTo();
	        
	        TDate transactionStartDt = new TDate();
	        transactionStartDt.setNull();
	        Date transactionStartDate = (Date) ccTransactionsReportForm.getSearchFieldsLayout().getDateFrom().getValue();
	        if (transactionStartDate != null) {
	            transactionStartDt = new TDate(transactionStartDate);
	        }
	        
	        TDate transactionEndDt = new TDate();
	        transactionEndDt.setNull();
	        Date transactionEndDate = (Date) ccTransactionsReportForm.getSearchFieldsLayout().getDateTo().getValue();
	        if (transactionEndDate != null) {
	            transactionEndDt = new TDate(transactionEndDate);
	        }    	        
	        
	        PdfPCell dateFromCell = new PdfPCell(new Phrase("Date From: " + transactionStartDt.formatIt(TDate.DDMONTHYYYY), FontFactory.getFont(FontFactory.TIMES_ROMAN, 8.0F, Font.NORMAL)));
	        dateFromCell.disableBorderSide(allBorders);
	        dateFromCell.setHorizontalAlignment(Element.ALIGN_LEFT);
	        
	        PdfPCell dateToCell = new PdfPCell(new Phrase("Date To: " + transactionEndDt.formatIt(TDate.DDMONTHYYYY), FontFactory.getFont(FontFactory.TIMES_ROMAN, 8.0F, Font.NORMAL)));
	        dateToCell.disableBorderSide(allBorders);
	        dateToCell.setHorizontalAlignment(Element.ALIGN_LEFT);
	        
	        PdfPCell logonCell = new PdfPCell(new Phrase("Logon (email address): " + ccTransactionsReportForm.getSearchFieldsLayout().getLogon().getValue().toString(), FontFactory.getFont(FontFactory.TIMES_ROMAN, 8.0F, Font.NORMAL)));
	        logonCell.disableBorderSide(allBorders);
	        logonCell.setHorizontalAlignment(Element.ALIGN_LEFT);
	        
	        PdfPCell pubCompCell = new PdfPCell(new Phrase("Publication Company Name: " + ccTransactionsReportForm.getSearchFieldsLayout().getUserCompanyName().getValue().toString(), FontFactory.getFont(FontFactory.TIMES_ROMAN, 8.0F, Font.NORMAL)));
	        pubCompCell.disableBorderSide(allBorders);
	        pubCompCell.setHorizontalAlignment(Element.ALIGN_LEFT);	        
	        
	        PdfPCell searchCell = new PdfPCell(new Phrase("Search: " + ccTransactionsReportForm.getSearchFieldsLayout().getSearchStr().getValue().toString(), FontFactory.getFont(FontFactory.TIMES_ROMAN, 8.0F, Font.NORMAL)));
	        searchCell.disableBorderSide(allBorders);
	        searchCell.setHorizontalAlignment(Element.ALIGN_LEFT);	 	        
	        
	        searchTable.addCell(emptyCell);
	        searchTable.addCell(dateFromCell);
	        searchTable.addCell(dateToCell);
	        searchTable.addCell(logonCell);
	        searchTable.addCell(pubCompCell);
	        searchTable.addCell(searchCell);
	        searchTable.addCell(emptyCell);
	        searchTable.addCell(emptyCell);
	        pdfDocument.add(searchTable);
	        
	        
	        // CC table view
	        PdfPTable ccReport = new PdfPTable(10);
	        
	        // header
	        PdfPCell ccReportHeaderCol1 = new PdfPCell(new Paragraph("Transaction ID",FontFactory.getFont(FontFactory.TIMES_ROMAN, 8.0F, Font.BOLD)));	        
	        PdfPCell ccReportHeaderCol2 = new PdfPCell(new Paragraph("Date",FontFactory.getFont(FontFactory.TIMES_ROMAN, 8.0F, Font.BOLD)));
	        PdfPCell ccReportHeaderCol3 = new PdfPCell(new Paragraph("User Name",FontFactory.getFont(FontFactory.TIMES_ROMAN, 8.0F, Font.BOLD)));
	        PdfPCell ccReportHeaderCol4 = new PdfPCell(new Paragraph("Publication Company",FontFactory.getFont(FontFactory.TIMES_ROMAN, 8.0F, Font.BOLD)));
	        PdfPCell ccReportHeaderCol5 = new PdfPCell(new Paragraph("Trade Name",FontFactory.getFont(FontFactory.TIMES_ROMAN, 8.0F, Font.BOLD)));      
	        PdfPCell ccReportHeaderCol6 = new PdfPCell(new Paragraph("Company Address",FontFactory.getFont(FontFactory.TIMES_ROMAN, 8.0F, Font.BOLD)));       
	        PdfPCell ccReportHeaderCol7 = new PdfPCell(new Paragraph("Email",FontFactory.getFont(FontFactory.TIMES_ROMAN, 8.0F, Font.BOLD)));
	        PdfPCell ccReportHeaderCol8 = new PdfPCell(new Paragraph("Name On Card",FontFactory.getFont(FontFactory.TIMES_ROMAN, 8.0F, Font.BOLD)));
	        PdfPCell ccReportHeaderCol9 = new PdfPCell(new Paragraph("Card Type",FontFactory.getFont(FontFactory.TIMES_ROMAN, 8.0F, Font.BOLD)));
	        PdfPCell ccReportHeaderCol10 = new PdfPCell(new Paragraph("Amount",FontFactory.getFont(FontFactory.TIMES_ROMAN, 8.0F, Font.BOLD)));
	        
	        ccReportHeaderCol1.setHorizontalAlignment(Element.ALIGN_CENTER);
	        ccReportHeaderCol2.setHorizontalAlignment(Element.ALIGN_CENTER);
	        ccReportHeaderCol3.setHorizontalAlignment(Element.ALIGN_CENTER);
	        ccReportHeaderCol4.setHorizontalAlignment(Element.ALIGN_CENTER);
	        ccReportHeaderCol5.setHorizontalAlignment(Element.ALIGN_CENTER);
	        ccReportHeaderCol6.setHorizontalAlignment(Element.ALIGN_CENTER);
	        ccReportHeaderCol7.setHorizontalAlignment(Element.ALIGN_CENTER);
	        ccReportHeaderCol8.setHorizontalAlignment(Element.ALIGN_CENTER);
	        ccReportHeaderCol9.setHorizontalAlignment(Element.ALIGN_CENTER);
	        ccReportHeaderCol10.setHorizontalAlignment(Element.ALIGN_CENTER);
	        
	        ccReport.addCell(ccReportHeaderCol1);
	        ccReport.addCell(ccReportHeaderCol2);
	        ccReport.addCell(ccReportHeaderCol3);
	        ccReport.addCell(ccReportHeaderCol4);
	        ccReport.addCell(ccReportHeaderCol5);
	        ccReport.addCell(ccReportHeaderCol6);
	        ccReport.addCell(ccReportHeaderCol7);
	        ccReport.addCell(ccReportHeaderCol8);
	        ccReport.addCell(ccReportHeaderCol9);
	        ccReport.addCell(ccReportHeaderCol10);
	        
	        // body
	        int total = 0;
	        for (int i = 0; i < ccReportResult.size(); i++) {
	        	DOCreditCardReport ccTransaction = (DOCreditCardReport) ccReportResult.elementAt(i);	        	
	        	
		        PdfPCell ccReportcurrCol1 = new PdfPCell(new Paragraph(ccTransaction.CCPNRef,FontFactory.getFont(FontFactory.TIMES_ROMAN, 7.0F, Font.NORMAL)));
		        PdfPCell ccReportcurrCol2 = new PdfPCell(new Paragraph(ccTransaction.transactionDate.formatIt(TDate.DDMONTHYYYY),FontFactory.getFont(FontFactory.TIMES_ROMAN, 7.0F, Font.NORMAL)));
		        PdfPCell ccReportcurrCol3 = new PdfPCell(new Paragraph(ccTransaction.ccUserFullName,FontFactory.getFont(FontFactory.TIMES_ROMAN, 7.0F, Font.NORMAL)));     
		        PdfPCell ccReportcurrCol4 = new PdfPCell(new Paragraph(ccTransaction.publicationCompany,FontFactory.getFont(FontFactory.TIMES_ROMAN, 7.0F, Font.NORMAL)));
		        PdfPCell ccReportcurrCol5 = new PdfPCell(new Paragraph(ccTransaction.tradeName,FontFactory.getFont(FontFactory.TIMES_ROMAN, 7.0F, Font.NORMAL)));
		        PdfPCell ccReportcurrCol6 = new PdfPCell(new Paragraph(ccTransaction.publicationCompanyAddr,FontFactory.getFont(FontFactory.TIMES_ROMAN, 7.0F, Font.NORMAL)));
		        PdfPCell ccReportcurrCol7 = new PdfPCell(new Paragraph(ccTransaction.ccUserEmail,FontFactory.getFont(FontFactory.TIMES_ROMAN, 7.0F, Font.NORMAL)));
		        PdfPCell ccReportcurrCol8 = new PdfPCell(new Paragraph(ccTransaction.formatCCLastFirstName(),FontFactory.getFont(FontFactory.TIMES_ROMAN, 7.0F, Font.NORMAL)));
		        PdfPCell ccReportcurrCol9 = new PdfPCell(new Paragraph(ccTransaction.ccTypeValue,FontFactory.getFont(FontFactory.TIMES_ROMAN, 7.0F, Font.NORMAL)));
		        PdfPCell ccReportcurrCol10 = new PdfPCell(new Paragraph(TemplarUtil.formatCurrency(ccTransaction.transactionAmount , 2),FontFactory.getFont(FontFactory.TIMES_ROMAN, 7.0F, Font.NORMAL)));
		        
		        ccReportcurrCol1.setHorizontalAlignment(Element.ALIGN_CENTER);
		        ccReportcurrCol2.setHorizontalAlignment(Element.ALIGN_CENTER);
		        ccReportcurrCol3.setHorizontalAlignment(Element.ALIGN_CENTER);
		        ccReportcurrCol4.setHorizontalAlignment(Element.ALIGN_CENTER);
		        ccReportcurrCol5.setHorizontalAlignment(Element.ALIGN_CENTER);
		        ccReportcurrCol6.setHorizontalAlignment(Element.ALIGN_CENTER);
		        ccReportcurrCol7.setHorizontalAlignment(Element.ALIGN_CENTER);
		        ccReportcurrCol8.setHorizontalAlignment(Element.ALIGN_CENTER);
		        ccReportcurrCol9.setHorizontalAlignment(Element.ALIGN_CENTER);
		        ccReportcurrCol10.setHorizontalAlignment(Element.ALIGN_CENTER);
		        
		        ccReport.addCell(ccReportcurrCol1);
		        ccReport.addCell(ccReportcurrCol2);
		        ccReport.addCell(ccReportcurrCol3);
		        ccReport.addCell(ccReportcurrCol4);
		        ccReport.addCell(ccReportcurrCol5);
		        ccReport.addCell(ccReportcurrCol6);
		        ccReport.addCell(ccReportcurrCol7);
		        ccReport.addCell(ccReportcurrCol8);
		        ccReport.addCell(ccReportcurrCol9);
		        ccReport.addCell(ccReportcurrCol10);
		        
		        total += ccTransaction.transactionAmount;
	        } // end of for	        
	        
	        pdfDocument.add(ccReport);
	        
	        // total
	        PdfPTable totalTable = new PdfPTable(1);
	        String totalStr = "Total: " + TemplarUtil.formatCurrency(total , 2);	        
	        PdfPCell totalCell = new PdfPCell(new Paragraph(totalStr ,FontFactory.getFont(FontFactory.TIMES_ROMAN, 8.0F, Font.BOLD)));
	        totalCell.disableBorderSide(allBorders);	        
	        totalCell.setHorizontalAlignment(Element.ALIGN_RIGHT);
	        totalTable.addCell(emptyCell);
	        totalTable.addCell(totalCell);    
	        pdfDocument.add(totalTable);
	        
	        // final	        	        
	        pdfDocument.close();
	        result = pdfByteOutputStream.toByteArray();
        }
        catch (Exception ex) {
            logger.error("Error preparing PDF for Credit Card Transaction Report: ", ex);
            throw new RuntimeException(ex);
        }
        
		return result;
	}
	
	public boolean checkInputParameters() {
    	String dateFrom = "";
    	String dateTo = "";
    	String searchStr = "";
    	String logon = "";
    	String userCompanyName = "";
		
    	// dateFrom 
    	try {
    		dateFrom = ccTransactionsReportForm.getSearchFieldsLayout().getDateFrom().getValue().toString();
    	}
    	catch (Exception ex) {
    		dateFrom = "";
    	}
    	
    	// dateTo
    	try {
    		dateTo = ccTransactionsReportForm.getSearchFieldsLayout().getDateTo().getValue().toString();
    	}
    	catch (Exception ex) {
    		dateTo = "";
    	}
    	
    	// searchStr
    	try {
    		searchStr = ccTransactionsReportForm.getSearchFieldsLayout().getSearchStr().getValue().toString();
    	}
    	catch (Exception ex) {
    		searchStr = "";
    	}
    	
    	// logon
    	try {
    		logon = ccTransactionsReportForm.getSearchFieldsLayout().getLogon().getValue().toString();
    	}
    	catch (Exception ex) {
    		logon = "";
    	}

    	// userCompanyName
    	try {
    		userCompanyName = ccTransactionsReportForm.getSearchFieldsLayout().getUserCompanyName().getValue().toString();
    	}
    	catch (Exception ex) {
    		userCompanyName = "";
    	}
    	
		
		if (dateFrom.equals("") && dateTo.equals("") && searchStr.equals("") && logon.equals("") && userCompanyName.equals("")) {
			return false;
		}
		else {            	
			return true;
		}
	}
    
    
}
