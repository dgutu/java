/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.archive.search.table;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proximo.inci.DOList;
import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.component.AbstractInciComponentLayout;
import com.proximo.inci.component.common.HtmlLabelComponent;
import com.proximo.inci.view.tradename.archive.search.AbstractTradeNameArchiveView;
import com.proximo.inci.view.tradename.archive.search.params.TradenameArchiveSearchParams;
import com.proximo.inci.view.tradename.archive.search.table.legend.AbstractSearchResultsTableLegend;
import com.vaadin.ui.AbstractLayout;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;

public class SearchResultsTableLayout extends AbstractInciComponentLayout<VerticalLayout> {

    private static Logger logger = LoggerFactory.getLogger(SearchResultsTableLayout.class);

    private AbstractTradeNameArchiveView parentView;

    private AbstractSearchResultsTableLegend searchResultsTableLegend;
    private SearchResultsTable searchResultsTable;
    private HtmlLabelComponent noMatchLabel;
    private TradenameArchiveSearchParams searchParams;
    
    private Panel pn;
    
    /** Last search result */
    private DOList searchResult;

    public SearchResultsTableLayout(AbstractTradeNameArchiveView parentView) {
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

        searchResultsTableLegend = parentView.createSearchResultsTableLegend();
        noMatchLabel = new HtmlLabelComponent("<br><div style=\"font-weight: bold;\">"
                + CaptionResolver.getCaption("view.trade_name.archive.search.no_match") + "</div>");
        searchResultsTable = new SearchResultsTable(this);
        
        pn = new Panel();
        AbstractLayout panelLayout = (AbstractLayout) pn.getContent();
        panelLayout.setMargin(false);
        pn.setHeight("100%");
        pn.setWidth("100%");                
    }

    @Override
    protected void addContent() {
        /* Components will be added on search. */
    }

    /**
     * Search using new search parameters filled.
     */
    public void search(TradenameArchiveSearchParams searchParams) {
        /*
         * Remove all search results components, because a new search results
         * will force them to be rendered differently.
         */
        clearSearchResults();
        this.searchParams = searchParams;

        searchResult = parentView.search(searchParams.getFormTn(), searchParams.getUserRecId(), searchParams.getOrderBy(), searchParams.getOrdering());

        // limit dataset
        int rowLimit = 1000000; // unlimited
        rowLimit = Integer.parseInt(CaptionResolver.getCaption("view.trade_name.archive.search.record_limit"));  
        
        if (searchResult.size() > 0 && searchResult.size() < rowLimit) {
            mainComponent.addComponent(searchResultsTableLegend.getMainComponent());
            /*
             * It is necessary that the table is created each time a new search
             * is performed. (Removing/adding items in general would be more
             * effective but due to Vaadin limitations doesn't work).
             */
            searchResultsTable.reInitialize(searchResult);
            pn.addComponent(searchResultsTable.getMainComponent());
            mainComponent.addComponent(pn);                    
            
            //mainComponent.addComponent(searchResultsTable.getMainComponent());
        }
        else if (searchResult.size() > 0 && searchResult.size() > rowLimit) {
        	parentView.showInfoMsgWindow(CaptionResolver.getCaption("view.trade_name.archive.search.validation.error.msg"));
        }
        else {
            mainComponent.addComponent(noMatchLabel.getMainComponent());
        }
    }

    public void clearSearchResults() {
        logger.debug("Clearing search results");
        if (searchResultsTableLegend.selectAllCheckBox != null)
        	searchResultsTableLegend.selectAllCheckBox.setValue(false);
        
        pn.removeAllComponents();
        mainComponent.removeComponent(pn);
        mainComponent.removeComponent(noMatchLabel.getMainComponent());
        mainComponent.removeComponent(searchResultsTableLegend.getMainComponent());
        mainComponent.removeComponent(searchResultsTable.getMainComponent());
        logger.debug("Clearing search results finished");
    }

    public AbstractTradeNameArchiveView getParentView() {
        return parentView;
    }

    public SearchResultsTable getSearchTable() {
        return searchResultsTable;
    }

    public DOList getSearchResult() {
        return searchResult;
    }
    
    public TradenameArchiveSearchParams getSearchParams() {
    	return this.searchParams;
    }

}
