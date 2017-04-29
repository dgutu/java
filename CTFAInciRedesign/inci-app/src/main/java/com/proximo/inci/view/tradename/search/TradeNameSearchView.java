/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.search;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Map;

import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.common.TemplarUtil;
import com.proximo.inci.component.util.ComponentUtil;
import com.proximo.inci.service.security.SecurityInfo;
//import com.proximo.inci.url.UrlResolver;
import com.proximo.inci.view.BaseView;
import com.proximo.inci.view.tradename.search.form.TradeNameSearchForm;
import com.proximo.inci.view.tradename.search.params.TradenameSearchParams;
import com.proximo.inci.view.tradename.search.table.SearchResultsTableLayout;
import com.proximo.inci.window.SubWindowKey;
import com.proximo.inci.window.main.MainWindow;
//import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
//import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.VerticalLayout;

/**
 * The view used for trade name search.
 */
public class TradeNameSearchView extends BaseView {

    /* Navigation parameters' keys */
	private static Logger logger = LoggerFactory.getLogger(TradeNameSearchView.class);

    public static int DEFAULT_PAGE_SIZE = 10;

    private TradeNameSearchForm tradeNameSearchForm;
    private SearchResultsTableLayout searchResultsTableLayout;

    private Button.ClickListener newBtnListener;
    private Button.ClickListener searchBtnListener;
    private Button.ClickListener clearBtnListener;

    public TradeNameSearchView(MainWindow mainWindow) {
        super(mainWindow, true, "tradeName.search.caption");
    }

    @Override
    protected void init() {
        super.init();

        newBtnListener = createNewBtnListener();
        searchBtnListener = createSearchBtnListener();
        clearBtnListener = createClearBtnListener();

        tradeNameSearchForm = new TradeNameSearchForm(this);
        searchResultsTableLayout = new SearchResultsTableLayout(this);
    }

    @Override
    protected void addContent() {
        super.addContent();

        addLeftButtons();
        addSpace();
        addLinkToInciIDMove();
        addComponent(tradeNameSearchForm);
        addSpace();
        addComponent(searchResultsTableLayout);        
    }

    private void addLinkToInciIDMove() {    	
        VerticalLayout hl = new VerticalLayout();        
        hl.setSizeFull();
        
        String applicationMoveURL = getApplication().getURL().toString() + "appmove/";
        
        Label lbl = new Label();
        lbl.setContentMode(Label.CONTENT_XHTML);
        
        String value = CaptionResolver.getCaption("flag.moveid.text1") + CaptionResolver.getCaption("flag.moveid.text2")
        			   + "<a href=\"" + applicationMoveURL + "\" target=\"_blank\">" 
        			   + "\"" + CaptionResolver.getCaption("flag.moveid.text3") + "\"" + "</a>"
        			   + CaptionResolver.getCaption("flag.moveid.text4") 
        			   + CaptionResolver.getCaption("flag.moveid.text5") + "<br><br>"
        			   + "<a href=\"" + applicationMoveURL + "\" target=\"_blank\">" 
        			   + CaptionResolver.getCaption("flag.moveid.text3") + "</a>"
        			   + "&nbsp;-&nbsp;" + CaptionResolver.getCaption("flag.moveid.text6");
        
        lbl.setValue("<div style=\"font-size: 12px; font-weight: bold;\">" + value + "</div>");
        hl.addComponent(lbl);
        
        String flag = CaptionResolver.getCaption("flag.moveid.string");
        
        if (!TemplarUtil.isStringNullOrEmpty(flag) && flag.toUpperCase().equals("Y")) {  
        	mainComponent.addComponent(hl);
        	addSpace();
        }        
    }
    
    private void addLeftButtons() {
        logger.debug("Adding buttons on the left");

        mainComponent.addComponent(ComponentUtil.createButtonWithInfo("new", newBtnListener,
                "tradeName.search.newBtn.info"));
        mainComponent.addComponent(ComponentUtil.createButtonWithInfo("search", searchBtnListener,
                "tradeName.search.searchBtn.info"));
        mainComponent.addComponent(ComponentUtil.createButtonWithInfo("clear", clearBtnListener,
                "tradeName.search.clearBtn.info"));

        logger.debug("Adding buttons on the left finished");
    }

    private ClickListener createNewBtnListener() {
        return new Button.ClickListener() {
            /**
			 * 
			 */
			private static final long serialVersionUID = -5176953779558144391L;

			@Override
            public void buttonClick(ClickEvent event) {
                mainWindow.showSubWindow(SubWindowKey.TN_NEW);
            }
        };
    }

    private Button.ClickListener createSearchBtnListener() {
        return new Button.ClickListener() {
            /**
			 * 
			 */
			private static final long serialVersionUID = -5252865795643643141L;

			@Override
            public void buttonClick(ClickEvent event) {
            	searchTrades(true);
            }
        };
    }
    
    public void searchTrades(boolean setFragment) {
        SecurityInfo currentSecurityInfo = getCurrentSecurityInfo();

        if (tradeNameSearchForm.validate() == null) {
            TradenameSearchParams searchParams = tradeNameSearchForm.fillSearchParams(currentSecurityInfo
                    .getUser().getUserRecId());
            /*
             * Resetting paging config because the search occurs
             * potentially with different search parameters.
             */
            //searchResultsTableLayout.resetPagingConfig();
            
            /*
             * save URI
             */            
            if (setFragment) {            
            	String uriString = searchParams.getParametersURI();
            	
            	//TradeNameService.log("searchTrades.TN_SEARCH|search|" + uriString);            
            	setFragment("TN_SEARCH|search|" + uriString);
            }
            
            try {            
            	searchResultsTableLayout.search(searchParams);
            }
            catch(Exception ex) {
            	throw new RuntimeException(ex);
            }
        } else {
            showInfoMsgWindow(CaptionResolver.getCaption("tradeName.search.invalidParams"));
        }    	
    }

    private Button.ClickListener createClearBtnListener() {
        return new Button.ClickListener() {
            /**
			 * 
			 */
			private static final long serialVersionUID = 7336044745044690266L;

			@Override
            public void buttonClick(ClickEvent event) {
                tradeNameSearchForm.clearSearchFields();
            }
        };
    }
    
    private void clearSearchFormAndResults() {
        tradeNameSearchForm.clearSearchFields();
        searchResultsTableLayout.clearSearchResults();
        //searchResultsTableLayout.resetPagingConfig();
        
        // set application count to 0
        searchResultsTableLayout.setTotalApplicationCount(0);
    }

    @Override
    public void handleNavigateOut() {
		//if (!getCurrentView().contains("search")) {
        // don't reset page if go to detail page
        if (!getCurrentView().equals("TN_DETAIL")) {
			clearSearchFormAndResults();
		}
        
        if (!getPreviousView().equals("TN_DETAIL")) {
        	clearSearchFormAndResults();
        }
    }

    @Override
    public void applySecurityInfo(SecurityInfo securityInfo) {
        tradeNameSearchForm.applySecurityInfo(securityInfo);
    }

    public Button.ClickListener getNewBtnListener() {
        return newBtnListener;
    }

    public Button.ClickListener getSearchBtnListener() {
        return searchBtnListener;
    }

    public Button.ClickListener getClearBtnListener() {
        return clearBtnListener;
    }
    
    /* refresh trade search result after navigate */
    @Override
    public void applyNavigationParameters(Map<String, Object> navigationParameterMap) {
		String fragment = getCurrentView();
		
		if (fragment.contains("search")) {
			TradenameSearchParams searchParam = new TradenameSearchParams();
			searchParam.fillSearchParamByURIString(fragment, mainWindow.getCurrentSecurityInfo().getUser().getUserRecId());
			
			// fill search form based on search params
			tradeNameSearchForm.fillSearchFom(searchParam);
			
			// log the the DB
			//TradeNameService.log("TradeNameSearchView.applyNavigationParameters current View:" + getCurrentView());
			//TradeNameService.log("TradeNameSearchView.applyNavigationParameters previous View:" + getPreviousView());
			
			// search for applications and don't set the URI
			searchTrades(false);
		}
    }    
}
