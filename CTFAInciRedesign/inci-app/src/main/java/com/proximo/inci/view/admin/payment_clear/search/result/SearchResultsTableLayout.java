/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.admin.payment_clear.search.result;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proximo.inci.DOList;
import com.proximo.inci.common.TemplarUtil;
import com.proximo.inci.component.AbstractInciComponentLayout;
import com.proximo.inci.component.common.LabelComponent;
import com.proximo.inci.service.payment.PaymentClearSearchParams;
import com.proximo.inci.view.admin.payment_clear.search.AbstractPaymentClearSearchView;
import com.vaadin.ui.VerticalLayout;

public class SearchResultsTableLayout extends AbstractInciComponentLayout<VerticalLayout> {

    @SuppressWarnings("unused")
	private static Logger logger = LoggerFactory.getLogger(SearchResultsTableLayout.class);

    private AbstractPaymentClearSearchView parentView;

    private SearchResultsTableLegend searchResultsTableLegend;
    private SearchResultsTable searchResultsTable;
    private LabelComponent noMatchLabel;
    
    private PaymentClearSearchParams searchParams;

    public SearchResultsTableLayout(AbstractPaymentClearSearchView parentView) {
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

        searchResultsTableLegend = new SearchResultsTableLegend();
        noMatchLabel = new LabelComponent("view.admin.payment_clearing.search.no_match", "bold-text");
        searchResultsTable = new SearchResultsTable(this);
    }

    @Override
    protected void addContent() {
        /* Components will be added on search. */
    }

    /**
     * Search using new search parameters filled.
     */
    public void search(PaymentClearSearchParams searchParams, boolean setFragment) {
        /*
         * Hide all search results components, because a new search results will
         * force them to be rendered differently.
         */
        clearSearchResults();
        
        this.searchParams = searchParams;
        
        try {
        	
            /*
             * save URI
             */            
            if (setFragment) {            
            	String uriString = getParametersURI(searchParams);
            	
            	//TradeNameService.log("search." + parentView.getSearchViewKey() + "|search|" + uriString);            
            	parentView.setFragment(parentView.getSearchViewKey() + "|search|" + uriString);
            }   
        	
	        DOList searchResult = parentView.searchServiceCall(searchParams);
	        if (searchResult.size() > 0) {
	            mainComponent.addComponent(searchResultsTableLegend.getMainComponent());
	            /*
	             * It is necessary that the table is created each time a new search
	             * is performed. (Removing/adding items in general would be more
	             * effective but due to Vaadin limitations doesn't work).
	             */
	            searchResultsTable.reInitialize(searchResult);
	
	            mainComponent.addComponent(searchResultsTable.getMainComponent());
	        } else {
	            mainComponent.addComponent(noMatchLabel.getMainComponent());
	        }
        }
        catch (Exception ex) {
        	
        }
    }

    public void clearSearchResults() {
        mainComponent.removeComponent(noMatchLabel.getMainComponent());
        mainComponent.removeComponent(searchResultsTableLegend.getMainComponent());
        mainComponent.removeComponent(searchResultsTable.getMainComponent());
    }

    public AbstractPaymentClearSearchView getParentView() {
        return parentView;
    }

    public SearchResultsTable getSearchTable() {
        return searchResultsTable;
    }
    
    public String getParametersURI(PaymentClearSearchParams searchParams){
    	String result = "~";
    	
    	// app no
    	if (!TemplarUtil.isStringNullOrEmpty(searchParams.getApplicationNumber()))
    		result += parentView.appNoURI + "=" + searchParams.getApplicationNumber() + "~";
    	
    	// comp name
    	if (!TemplarUtil.isStringNullOrEmpty(searchParams.getCompanyName()))
    		result += parentView.compNameURI + "=" + searchParams.getCompanyName() + "~";    	
    	
    	return result;
    	
    }    
    
    public PaymentClearSearchParams getSearchParams() {
    	return searchParams;
    }

}
