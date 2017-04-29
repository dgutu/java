/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.admin.cc_transactions_report.result;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proximo.inci.DOList;
import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.common.TemplarUtil;
import com.proximo.inci.component.AbstractInciComponentLayout;
import com.proximo.inci.component.common.LabelComponent;
import com.proximo.inci.service.payment.CCTransactionsReportParams;
import com.proximo.inci.service.payment.TradeNamePaymentService;
import com.proximo.inci.view.admin.cc_transactions_report.CCTransactionsReportView;
import com.vaadin.ui.AbstractLayout;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;

public class SearchResultsTableLayout extends AbstractInciComponentLayout<VerticalLayout> {

    private static Logger logger = LoggerFactory.getLogger(SearchResultsTableLayout.class);

    private CCTransactionsReportView parentView;

    private Panel pn;
    private SearchResultsTable searchResultsTable;
    private LabelComponent noMatchLabel;
    private TotalAmountLayout totalAmountLayout;
    
    // list of parameters
    private CCTransactionsReportParams ccSearchParams;
    
    private DOList searchResultFinal; 

    public SearchResultsTableLayout(CCTransactionsReportView parentView) {
        this.parentView = parentView;

        build();
    }

    @Override
    protected VerticalLayout createMainComponentInstance() {
        return new VerticalLayout();
    }

    @Override
    protected void init() {
        mainComponent.setSpacing(false);

        noMatchLabel = new LabelComponent("view.admin.cc_transactions_report.no_match", "bold-text");
        searchResultsTable = new SearchResultsTable(this);        
        totalAmountLayout = new TotalAmountLayout();
        pn = new Panel();
        AbstractLayout panelLayout = (AbstractLayout) pn.getContent();
        panelLayout.setMargin(false);
        pn.setHeight("100%");
        pn.setWidth("100%");
        
        // init searchresult
        searchResultFinal = new DOList(); 
    }

    @Override
    protected void addContent() {
        /* Components will be added on search. */
    }

    /**
     * Search using new search parameters filled.
     */
    public void search(CCTransactionsReportParams searchParams, boolean setFragment) {
    	
    	// set ccSearchParams
    	ccSearchParams = searchParams;
    	
        /*
         * Hide all search results components, because a new search results will
         * force them to be rendered differently.
         */
        clearSearchResults();
        
        try
        {
        	/*
             * save URI
             */            
            if (setFragment) {            
            	String uriString = getParametersURI(searchParams);
            	
            	//TradeNameService.log("searchTrades.ADMIN_CC_TRANSACTIONS_REPORT|search|" + uriString);            
            	parentView.setFragment("ADMIN_CC_TRANSACTIONS_REPORT|search|" + uriString);
            }        	
        	
        	// result set from database
	        DOList searchResult = TradeNamePaymentService.searchCreditCardTransactions(searchParams);

	        // limit dataset
	        int rowLimit = 1000000; // unlimited
	        rowLimit = Integer.parseInt(CaptionResolver.getCaption("view.admin.cc_transactions_report.search.record_limit"));
	        
        	// result including filter on Netforum
	        searchResultFinal = searchResultsTable.ccTransactionReport(searchResult);	        
	        
	        // check the result from db < roLimit 
	        if (searchResultFinal.size() > 0 && searchResultFinal.size() < rowLimit) {	        	
	            /*
	             * It is necessary that the table is created each time a new search
	             * is performed. (Removing/adding items in general would be more
	             * effective but due to Vaadin limitations doesn't work).
	             */
	            searchResultsTable.reInitialize(searchResultFinal);
	            pn.addComponent(searchResultsTable.getMainComponent());
	            mainComponent.addComponent(pn);
	
	            //double total = calculateTotal(searchResult);
	            double total = searchResultsTable.getTotal();
	            
	            totalAmountLayout.getTotalLabel().setValue(
	                    CaptionResolver.getCaption("view.admin.cc_transactions_report.total") + " " + TemplarUtil.formatCurrency(total,2));
	            
	            mainComponent.addComponent(totalAmountLayout.getMainComponent());
	            mainComponent.setComponentAlignment(totalAmountLayout.getMainComponent(), Alignment.MIDDLE_RIGHT);
	        }
	        else if (searchResultFinal.size() > 0 && searchResultFinal.size() > rowLimit) {
	        	parentView.showInfoMsgWindow(CaptionResolver.getCaption("view.admin.cc_transactions_report.search.validation.error.msg"));
	        }
	        else {
	            mainComponent.addComponent(noMatchLabel.getMainComponent());
	        }
        }
        catch(Exception ex)
        {
        	logger.error(ex.getMessage());
        	//mainComponent.getWindow().showNotification("SearchResultsTableLayout.search Exception!", ex.getMessage(), Notification.TYPE_ERROR_MESSAGE);
        	throw new RuntimeException(ex);
        }
    }

    /*private double calculateTotal(DOList searchResult) {
        double total = 0;

        for (int i = 0; i < searchResult.size(); i++) {
            DOCreditCardReport ccTransaction = (DOCreditCardReport) searchResult.elementAt(i);
            total += ccTransaction.transactionAmount;
        }

        return total;
    }*/

    public void clearSearchResults() {
    	pn.removeAllComponents();
    	mainComponent.removeComponent(pn);    	
    	mainComponent.removeComponent(noMatchLabel.getMainComponent());
        mainComponent.removeComponent(searchResultsTable.getMainComponent());
        mainComponent.removeComponent(totalAmountLayout.getMainComponent());
    }

    public CCTransactionsReportView getParentView() {
        return parentView;
    }

    public SearchResultsTable getSearchTable() {
        return searchResultsTable;
    }
    
    public CCTransactionsReportParams getCCSearchParams() {
    	return this.ccSearchParams;
    }
    
    public Panel getPanel() {
    	return this.pn;
    }
    
	public String getParametersURI(CCTransactionsReportParams searchParams) {
    	String result = "~";    	

    	// date start
    	if (searchParams.getTransactionStartDt() != null && !searchParams.getTransactionStartDt().isNull())
    		result += searchParams.transactionStartDtURI + "=" + searchParams.getTransactionStartDt().getInternalFormat() + "~";
    	
    	// date end
    	if (searchParams.getTransactionEndDt() != null && !searchParams.getTransactionEndDt().isNull())
    		result += searchParams.transactionEndDtURI + "=" + searchParams.getTransactionEndDt().getInternalFormat() + "~";
    	
    	// logon
    	if (!TemplarUtil.isStringNullOrEmpty(searchParams.getLogon()))
    		result += searchParams.logonURI + "=" + searchParams.getLogon() + "~";
    	
    	// comp name
    	if (!TemplarUtil.isStringNullOrEmpty(searchParams.getUserCompanyName()))
    		result += searchParams.pubCompURI + "=" + searchParams.getUserCompanyName() + "~";    	
    	
    	// search string
    	if (!TemplarUtil.isStringNullOrEmpty(searchParams.getSearchStr()))
    		result += searchParams.searchURI + "=" + searchParams.getSearchStr() + "~";    	
    	
    	return result;
	}
	
	public DOList getCCReportResult () {
		return searchResultFinal;
	}
	
}
