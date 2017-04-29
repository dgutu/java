/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.archive.search;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proximo.inci.DOList;
import com.proximo.inci.DOTradeName;
import com.proximo.inci.component.util.ComponentUtil;
import com.proximo.inci.service.security.SecurityInfo;
//import com.proximo.inci.service.tradename.TradeNameService;
import com.proximo.inci.view.BaseView;
import com.proximo.inci.view.ViewKey;
import com.proximo.inci.view.tradename.archive.search.form.TradeNameArchiveSearchForm;
import com.proximo.inci.view.tradename.archive.search.params.TradenameArchiveSearchParams;
import com.proximo.inci.view.tradename.archive.search.table.SearchResultsTableLayout;
import com.proximo.inci.view.tradename.archive.search.table.legend.AbstractSearchResultsTableLegend;
import com.proximo.inci.view.tradename.detail.TradeNameDetailView;
import com.proximo.inci.view.tradename.detail.mode.TradeNameDetailViewMode;
import com.proximo.inci.window.main.MainWindow;
import com.vaadin.event.MouseEvents;
import com.vaadin.terminal.ThemeResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Embedded;
import com.vaadin.ui.HorizontalLayout;

/**
 * The view used for trade name search.
 */
@SuppressWarnings("serial")
public abstract class AbstractTradeNameArchiveView extends BaseView {

    @SuppressWarnings("unused")
	private static Logger logger = LoggerFactory.getLogger(AbstractTradeNameArchiveView.class);

    private TradeNameArchiveSearchForm tradeNameArchiveSearchForm;
    protected SearchResultsTableLayout searchResultsTableLayout;

    private Button.ClickListener searchBtnListener;
    private Button.ClickListener clearBtnListener;
    
    public AbstractTradeNameArchiveView(MainWindow mainWindow, String captionKey) {
        super(mainWindow, true, captionKey);
    }

    @Override
    protected void init() {
        super.init();

        searchBtnListener = createSearchBtnListener();
        clearBtnListener = createClearBtnListener();

        tradeNameArchiveSearchForm = new TradeNameArchiveSearchForm(this);
        searchResultsTableLayout = new SearchResultsTableLayout(this);
    }

    public abstract AbstractSearchResultsTableLegend createSearchResultsTableLegend();

    /** Search service call. */
    public abstract DOList search(DOTradeName searchObj, String userRecId, String orderBy, int ordering);

    /** Search results table row actions layout */
    public abstract HorizontalLayout createRowActionsLayout(DOTradeName formTn);
    
    public abstract ViewKey getViewKey();

    @Override
    protected void addContent() {
        super.addContent();

        addLeftButtons();
        addSpace();
        addComponent(tradeNameArchiveSearchForm);
        addSpace();
        addComponent(searchResultsTableLayout);
    }

    private void addLeftButtons() {
        mainComponent.addComponent(ComponentUtil.createButtonWithInfo("search", searchBtnListener,
                "view.trade_name.archive.search.search_btn.info"));
        mainComponent.addComponent(ComponentUtil.createButtonWithInfo("clear", clearBtnListener,
                "view.trade_name.archive.search.clear_btn.info"));
    }

    protected void search(boolean setFragment) {
        SecurityInfo currentSecurityInfo = getCurrentSecurityInfo();
        
        String validationErrorStr = tradeNameArchiveSearchForm.validate();
        
        if (validationErrorStr == null) {
            TradenameArchiveSearchParams searchParams = tradeNameArchiveSearchForm.fillSearchParams(currentSecurityInfo
                    .getUser().getUserRecId());
            
            // set the URI
            if (setFragment) {            
            	//TradeNameService.log(getViewKey().toString() + "|search|" + searchParams.getParametersURI());            
            	setFragment(getViewKey().toString() + "|search|" + searchParams.getParametersURI());
            }            
            
            searchResultsTableLayout.search(searchParams);
        } else {
        	showInfoMsgWindow(validationErrorStr);
        }
    }
    
    public void clearSearchFormAndResults() {
        tradeNameArchiveSearchForm.clearSearchFields();
        searchResultsTableLayout.clearSearchResults();
    }

    private Button.ClickListener createSearchBtnListener() {
        return new Button.ClickListener() {
            @Override
            public void buttonClick(ClickEvent event) {
            	// search for applications and set the URI
                search(true);
            }
        };
    }

    private Button.ClickListener createClearBtnListener() {
        return new Button.ClickListener() {
            @Override
            public void buttonClick(ClickEvent event) {
                tradeNameArchiveSearchForm.clearSearchFields();
            }
        };
    }

    protected Embedded createViewPic(final DOTradeName formTn) {
        Embedded viewPic = new Embedded(null, new ThemeResource("images/view.gif"));

        viewPic.addListener(new MouseEvents.ClickListener() {
            @Override
            public void click(MouseEvents.ClickEvent event) {
                
                Map<String, Object> navigationParameterMap = new HashMap<String, Object>();

                navigationParameterMap.put(TradeNameDetailView.MODE_NAVIG_PARAM_KEY, TradeNameDetailViewMode.READ);
                navigationParameterMap.put(TradeNameDetailView.FORM_TN_REC_ID_NAVIG_PARAM_KEY, formTn.recID);
                
                // navugate to detail view
                navigateTo(ViewKey.TN_DETAIL.toString(), navigationParameterMap, getCurrentView());
            }
        });
        viewPic.addStyleName("cursor-pointer");

        return viewPic;
    }

    @Override
    public void handleNavigateOut() {
		if (!getCurrentView().contains("search")) {    	
			clearSearchFormAndResults();
		}    	
    }
    
    /* refresh search result after navigate */
    @Override
    public void applyNavigationParameters(Map<String, Object> navigationParameterMap) {
		String fragment = getCurrentView();
		
		// if in URI fragment there is a "search"
		if (fragment.contains("search")) {
			TradenameArchiveSearchParams searchParam = new TradenameArchiveSearchParams();
			searchParam.fillSearchParamByURIString(fragment, mainWindow.getCurrentSecurityInfo().getUser().getUserRecId());
			
			// fill search form based on search params
			tradeNameArchiveSearchForm.fillSearchFom(searchParam);
			
			// search for application
			//TradeNameService.log(getViewKey().toString() + " ###### applyNavigationParameters current View:" + getCurrentView());
			//TradeNameService.log(getViewKey().toString() + " ###### applyNavigationParameters previous View:" + getPreviousView());
			
			// made the search and don't set the URI
			search(false);
		}
    }    

    @Override
    public void applySecurityInfo(SecurityInfo securityInfo) {
        tradeNameArchiveSearchForm.applySecurityInfo(securityInfo);
    }
    
    public Button.ClickListener getSearchBtnListener() {
        return searchBtnListener;
    }

    public Button.ClickListener getClearBtnListener() {
        return clearBtnListener;
    }

}
