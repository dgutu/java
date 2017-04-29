/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.admin.misc_text_maint.search;

import com.proximo.inci.DOList;
import com.proximo.inci.common.TemplarUtil;
import com.proximo.inci.component.AbstractInciComponentLayout;
import com.proximo.inci.component.common.LabelComponent;
import com.proximo.inci.service.tradename.TradeNameService;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window.Notification;

public class MTMSearchResultLayout extends AbstractInciComponentLayout<VerticalLayout> {
	
	private MTMView parentView;
    private LabelComponent noMatchLabel;
    private MTMSeacrhResult mtmSearchResult;
	
	public MTMSearchResultLayout(MTMView parentView) {
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

        noMatchLabel = new LabelComponent("view.admin.misc_text_maint_report.no_match", "bold-text");
        mtmSearchResult = new MTMSeacrhResult(this);
	}
	
    @Override
    protected void addContent() {
        /* Components will be added on search. */
    }
    
    /**
     * Search using new search parameters filled.
     */
    public void search(String text, boolean setFragment) {
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
            	String uriString = "~";
            	
            	if (!TemplarUtil.isStringNullOrEmpty(text))
            		uriString += "txt=" + text + "~";
            	
            	//TradeNameService.log("search.ADMIN_MISC_TEXT_MAINT_SEARCH|search|" + uriString);            
            	parentView.setFragment("ADMIN_MISC_TEXT_MAINT_SEARCH|search|" + uriString);
            }              	
        	
            // search cms textin database
	        DOList searchResult = TradeNameService.searchCMSListByText(text);        	
	        if (searchResult.size() > 0) {
	            /*
	             * It is necessary that the table is created each time a new search
	             * is performed. (Removing/adding items in general would be more
	             * effective but due to Vaadin limitations doesn't work).
	             */
	        	mtmSearchResult.reInitialize(searchResult);
	
	            mainComponent.addComponent(mtmSearchResult.getMainComponent());	
	        } else {
	            mainComponent.addComponent(noMatchLabel.getMainComponent());
	        }
        }
        catch(Exception ex)
        {
        	mainComponent.getWindow().showNotification("MTMSearchResultLayout.search Exception!", ex.getMessage(), Notification.TYPE_ERROR_MESSAGE);        	
        }
    }
    
    public void clearSearchResults() {
        mainComponent.removeComponent(noMatchLabel.getMainComponent());
        mainComponent.removeComponent(mtmSearchResult.getMainComponent());
    }
    
    public MTMView getParentView() {
        return this.parentView;
    }

    public MTMSeacrhResult getSearchTable() {
        return this.mtmSearchResult;
    }
}
