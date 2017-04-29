/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.admin.payment_clear.search;

import java.util.Map;
import java.util.Properties;

import com.proximo.inci.DOList;
import com.proximo.inci.service.payment.PaymentClearSearchParams;
//import com.proximo.inci.service.tradename.TradeNameService;
import com.proximo.inci.view.BaseView;
import com.proximo.inci.view.ViewKey;
import com.proximo.inci.view.admin.payment_clear.search.form.PaymentClearSearchForm;
import com.proximo.inci.view.admin.payment_clear.search.result.SearchResultsTableLayout;
import com.proximo.inci.window.main.MainWindow;
import com.proximo.inci.window.main.URIUtil;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;

@SuppressWarnings("serial")
public abstract class AbstractPaymentClearSearchView extends BaseView {

	private PaymentClearSearchForm paymentClearSearchForm;
    private SearchResultsTableLayout searchResultsTableLayout;

    private Button.ClickListener searchBtnListener;
    private Button.ClickListener clearBtnListener;
    
    // URI constant
    public final String appNoURI = "appno";
    public final String compNameURI = "comp";

    public AbstractPaymentClearSearchView(MainWindow mainWindow, boolean addCaption, String captionKey) {
        super(mainWindow, addCaption, captionKey);
    }

    public abstract ViewKey getDetailViewKey();
    
    public abstract ViewKey getSearchViewKey();

    public abstract DOList searchServiceCall(PaymentClearSearchParams searchParams);

    @Override
    protected void init() {
        super.init();

        searchBtnListener = createSearchBtnListener();
        clearBtnListener = createClearBtnListener();

        paymentClearSearchForm = new PaymentClearSearchForm(this);
        searchResultsTableLayout = new SearchResultsTableLayout(this);
    }

    @Override
    protected void addContent() {
        super.addContent();

        addComponent(paymentClearSearchForm);
        addSpace();
        addComponent(searchResultsTableLayout);
    }

    private Button.ClickListener createClearBtnListener() {
        return new Button.ClickListener() {
            @Override
            public void buttonClick(ClickEvent event) {
                paymentClearSearchForm.clearSearchFields();
                searchResultsTableLayout.clearSearchResults();
            }
        };
    }

    private Button.ClickListener createSearchBtnListener() {
        return new Button.ClickListener() {
            @Override
            public void buttonClick(ClickEvent event) {
                searchResultsTableLayout.search(paymentClearSearchForm.fillSearchParams(), true);
            }
        };
    }

    @Override
    public void handleNavigateOut() {
		if (!getCurrentView().contains("search")) {    	
    		paymentClearSearchForm.clearSearchFields();
    		searchResultsTableLayout.clearSearchResults();
		}    
    }

    public Button.ClickListener getClearBtnListener() {
        return clearBtnListener;
    }

    public Button.ClickListener getSearchBtnListener() {
        return searchBtnListener;
    }
    
    public SearchResultsTableLayout getSearchResultsTableLayout() {
    	return searchResultsTableLayout;
    }
    
    public PaymentClearSearchForm getPaymentClearSearchForm() {
    	return paymentClearSearchForm;
    }
    
    /* refresh search result after navigate */
    @Override
    public void applyNavigationParameters(Map<String, Object> navigationParameterMap) {
		String fragment = getCurrentView();
		
		if (fragment.contains("search")) {
			
			// parameters
			Properties prop = new Properties();
			prop = URIUtil.fillSearchParamByURIString(fragment);
			PaymentClearSearchParams searchParam = new PaymentClearSearchParams(prop.getProperty(appNoURI), prop.getProperty(compNameURI));			
		
			// fill search form based on search params
			paymentClearSearchForm.fillSearchFom(searchParam);
			
			// log the the DB
			//TradeNameService.log("AbstractPaymentClearSearchView.applyNavigationParameters current View:" + getCurrentView());
			//TradeNameService.log("AbstractPaymentClearSearchView.applyNavigationParameters previous View:" + getPreviousView());
			
			// search for applications and don't set the URI
    		searchResultsTableLayout.search(paymentClearSearchForm.fillSearchParams(), false);
		}
    }
}
