/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.security.user.search.result;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proximo.inci.common.TemplarUtil;
import com.proximo.inci.component.AbstractInciComponentLayout;
import com.proximo.inci.component.common.LabelComponent;
import com.proximo.inci.service.security.SecurityService;
import com.proximo.inci.service.security.user.UserSearchParams;
import com.proximo.inci.service.security.user.UserSearchResult;
import com.proximo.inci.view.security.user.search.UserSearchView;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window.Notification;

public class SearchResultsTableLayout extends AbstractInciComponentLayout<VerticalLayout> {

    private static Logger logger = LoggerFactory.getLogger(SearchResultsTableLayout.class);

    private UserSearchView parentView;

    private SearchResultsTableLegend searchResultsTableLegend;
    private SearchResultsTable searchResultsTable;
    private LabelComponent noMatchLabel;
    private UserSearchParams searchParams;

    public SearchResultsTableLayout(UserSearchView parentView) {
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
        noMatchLabel = new LabelComponent("view.security.user.search.noMatch", "bold-text");
        searchResultsTable = new SearchResultsTable(this);
    }

    @Override
    protected void addContent() {
        /* Components will be added on search. */
    }

    /**
     * Search using new search parameters filled.
     */
    public void search(UserSearchParams searchParams, boolean setFragment) {
        /*
         * Hide all search results components, because a new search results will
         * force them to be rendered differently.
         */
        clearSearchResults();
        
        this.searchParams = searchParams;

        try
        {	
            /*
             * save URI
             */            
            if (setFragment) {            
            	String uriString = getParametersURI(searchParams);
            	
            	//TradeNameService.log("search.SCR_USER_SEARCH|search|" + uriString);            
            	parentView.setFragment("SCR_USER_SEARCH|search|" + uriString);
            }        	
        	
        	UserSearchResult searchResult = SecurityService.findUsers(searchParams);
        
	        if (searchResult.getUserList().size() > 0) {
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
        catch(Exception ex)
        {
        	logger.error(ex.getLocalizedMessage());        	
        	mainComponent.getWindow().showNotification("SearchResultsTableLayout.search Exception!", ex.getLocalizedMessage(), Notification.TYPE_ERROR_MESSAGE);        	                                            	
        }
	        
    }

    public void clearSearchResults() {
        mainComponent.removeComponent(noMatchLabel.getMainComponent());
        mainComponent.removeComponent(searchResultsTableLegend.getMainComponent());
        mainComponent.removeComponent(searchResultsTable.getMainComponent());
    }

    public UserSearchView getParentView() {
        return parentView;
    }

    public SearchResultsTable getSearchTable() {
        return searchResultsTable;
    }
    
    public String getParametersURI(UserSearchParams searchParams){
    	String result = "~";
    	
    	// lastname
    	if (!TemplarUtil.isStringNullOrEmpty(searchParams.getLastName()))
    		result += parentView.lastNameURI + "=" + searchParams.getLastName() + "~";
    	
    	// firstname
    	if (!TemplarUtil.isStringNullOrEmpty(searchParams.getFirstName()))
    		result += parentView.firstNameURI + "=" + searchParams.getFirstName() + "~";
    	
    	// login
    	if (!TemplarUtil.isStringNullOrEmpty(searchParams.getLoginId()))
    		result += parentView.loginURI + "=" + searchParams.getLoginId() + "~";
    	
    	return result;
    	
    }
    
    public UserSearchParams getSearchParams() {
    	return searchParams;
    }
    

}
