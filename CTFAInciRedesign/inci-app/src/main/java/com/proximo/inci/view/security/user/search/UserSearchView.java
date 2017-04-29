/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.security.user.search;

import java.util.Map;

import java.util.Properties;

import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.window.main.URIUtil;
import com.proximo.inci.service.security.user.UserSearchParams;
import com.proximo.inci.view.BaseView;
import com.proximo.inci.view.security.user.search.form.UserSearchForm;
import com.proximo.inci.view.security.user.search.result.SearchResultsTableLayout;
import com.proximo.inci.window.main.MainWindow;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Label;

@SuppressWarnings("serial")
public class UserSearchView extends BaseView {

    private UserSearchForm userSearchForm;
    private SearchResultsTableLayout searchResultsTableLayout;

    private Button.ClickListener searchBtnListener;
    private Button.ClickListener clearBtnListener;
    
    public final String firstNameURI = "fname";
    public final String lastNameURI = "lname";
    public final String loginURI = "login";

    public UserSearchView(MainWindow mainWindow) {
        super(mainWindow, true, "view.security.user.search");
    }

    @Override
    protected void init() {
        super.init();

        searchBtnListener = createSearchBtnListener();
        clearBtnListener = createClearBtnListener();

        userSearchForm = new UserSearchForm(this);
        searchResultsTableLayout = new SearchResultsTableLayout(this);
    }

    @Override
    protected void addContent() {
        super.addContent();

        addInfo();
        addSpace();
        addComponent(userSearchForm);
        addSpace();
        addComponent(searchResultsTableLayout);
    }

    private Button.ClickListener createClearBtnListener() {
        return new Button.ClickListener() {
            @Override
            public void buttonClick(ClickEvent event) {
                userSearchForm.clearSearchFields();
            }
        };
    }

    private Button.ClickListener createSearchBtnListener() {
        return new Button.ClickListener() {
            @Override
            public void buttonClick(ClickEvent event) {
                searchResultsTableLayout.search(userSearchForm.fillSearchParams(), true);
            }
        };
    }

    private void addInfo() {
        Label info1 = new Label();
        info1.addStyleName("very-small-bold-text");
        info1.setValue(CaptionResolver.getCaption("view.security.user.search.info1.part1") + " \""
                + CaptionResolver.getCaption("search") + "\" "
                + CaptionResolver.getCaption("view.security.user.search.info1.part2"));
        mainComponent.addComponent(info1);

        Label info2 = new Label();
        info2.addStyleName("very-small-bold-text");
        info2.setValue(CaptionResolver.getCaption("view.security.user.search.info2.part1") + " \""
                + CaptionResolver.getCaption("clear") + "\" "
                + CaptionResolver.getCaption("view.security.user.search.info2.part2"));
        mainComponent.addComponent(info2);
    }

    @Override
    public void handleNavigateOut() {
		if (!getCurrentView().contains("search")) {    	
	        userSearchForm.clearSearchFields();
	        searchResultsTableLayout.clearSearchResults();
		}        
    }    
    
    public Button.ClickListener getClearBtnListener() {
        return clearBtnListener;
    }

    public Button.ClickListener getSearchBtnListener() {
        return searchBtnListener;
    }
    
    /* refresh trade search result after navigate */
    @Override
    public void applyNavigationParameters(Map<String, Object> navigationParameterMap) {
		String fragment = getCurrentView();
		
		if (fragment.contains("search")) {
			
			// parameters
			Properties prop = new Properties();
			prop = URIUtil.fillSearchParamByURIString(fragment);						
			UserSearchParams searchParam = new UserSearchParams(prop.getProperty(lastNameURI), prop.getProperty(firstNameURI), prop.getProperty(loginURI));
			
			// fill search form based on search params
			userSearchForm.fillSearchFom(searchParam);
			
			// log the the DB
			//TradeNameService.log("UserSearchView.applyNavigationParameters current View:" + getCurrentView());
			//TradeNameService.log("UserSearchView.applyNavigationParameters previous View:" + getPreviousView());
			
			// search for applications and don't set the URI
			searchResultsTableLayout.search(userSearchForm.fillSearchParams(), false);
		}
    }
}
