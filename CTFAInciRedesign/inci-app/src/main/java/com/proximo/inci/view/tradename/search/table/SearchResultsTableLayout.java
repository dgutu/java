/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.search.table;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.component.AbstractInciComponentLayout;
import com.proximo.inci.component.common.HtmlLabelComponent;
import com.proximo.inci.service.tradename.TradeNameSearchResult;
import com.proximo.inci.service.tradename.TradeNameService;
import com.proximo.inci.view.tradename.search.TradeNameSearchView;
import com.proximo.inci.view.tradename.search.params.TradenameSearchParams;
import com.proximo.inci.view.tradename.search.table.legend.SearchResultsTableLegend;
import com.proximo.inci.view.tradename.search.table.paging.PagingHeaderLayout;
import com.vaadin.ui.VerticalLayout;

public class SearchResultsTableLayout extends AbstractInciComponentLayout<VerticalLayout> {

    private static Logger logger = LoggerFactory.getLogger(SearchResultsTableLayout.class);
    
    private TradeNameSearchView parentView;

    private TradenameSearchParams searchParams;

    private SearchResultsTableLegend searchResultsTableLegend;
    private PagingHeaderLayout pagingHeaderLayout;
    private SearchResultsTable searchResultsTable;
    private HtmlLabelComponent noMatchLabel;
    
    private int count = 0;

    public SearchResultsTableLayout(TradeNameSearchView parentView) {
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
        noMatchLabel = new HtmlLabelComponent("<br><div style=\"font-weight: bold;\">"
                + CaptionResolver.getCaption("tradeName.search.noMatch") + "</div>");
        searchResultsTable = new SearchResultsTable(this);
        pagingHeaderLayout = new PagingHeaderLayout(this);
    }
    
    @Override
    protected void addContent() {
        /* Components will be added on search. */
    }

    /**
     * Search using the previous search parameters filled.
     */
    public void search() {
        search(searchParams);
    }

    /**
     * Search using new search parameters filled. 
     */
    public void search(TradenameSearchParams searchParams) {
        this.searchParams = searchParams;

        /*
         * Remove all search results components, because a new search results will
         * force them to be rendered differently.
         */
        clearSearchResults();

        /*
         * Take the first page as search result and this way get the count,
         * which is necessary for paging component to be constructed. The
         * received search results are then used to render a search results
         * page.
         */
        TradeNameSearchResult searchResult = searchTradenames(pagingHeaderLayout.getPageSize(), 1);
        count = searchResult.getTotalCount();

        if (count > 0) {
            mainComponent.addComponent(searchResultsTableLegend.getMainComponent());
            /*
             * It is necessary that the table is created each time a new search is
             * performed (mind, that this is different from the search page request
             * coming from the same search. (Removing/adding items in general would be
             * more effective but due to Vaadin limitations doesn't work).
             */
            searchResultsTable.reInitialize(searchResult);
            //searchResultsTable.setSearchResult(searchResult);
            
            mainComponent.addComponent(searchResultsTable.getMainComponent());
            
            /* Calling this method we actually fill the search results table with records */
            pagingHeaderLayout.reInitialize(count);
            int tableIdx = mainComponent.getComponentIndex(searchResultsTable.getMainComponent());
            // paging component goes before the table
            mainComponent.addComponent(pagingHeaderLayout.getMainComponent(), tableIdx);
        } else {
            mainComponent.addComponent(noMatchLabel.getMainComponent());
        }
    }

    /**
     * Searches for trade names according to the search parameters filled.
     */
    public TradeNameSearchResult searchTradenames(int pageSize, int pageNumber) {
        return TradeNameService.quickTradeNameSearch(searchParams.getUserRecId(),
                searchParams.getTradename(), searchParams.getApplicationNumber(),
                searchParams.getExportStatus(), searchParams.getCompany(),
                searchParams.getEntryDt_start(), searchParams.getEntryDt_end(), searchParams.isCommentsOutsd(),
                searchParams.isCommentsRespond(), searchParams.getCategoryId(),
                searchParams.getStaffReviewDateFromDt(), searchParams.getStaffReviewDateToDt(),
                searchParams.getCommiteeReviewDateFromDt(), searchParams.getCommiteeReviewDateToDt(),
                searchParams.getSubmissionStatus(), pageSize, pageNumber, searchParams.getOrderBy(), searchParams.getOrdering());
    }

    public void clearSearchResults() {
        logger.debug("Clearing search results");

        mainComponent.removeComponent(noMatchLabel.getMainComponent());
        mainComponent.removeComponent(searchResultsTableLegend.getMainComponent());
        mainComponent.removeComponent(searchResultsTable.getMainComponent());
        mainComponent.removeComponent(pagingHeaderLayout.getMainComponent());

        logger.debug("Clearing search results finished");
    }

    public void resetPagingConfig() {
        pagingHeaderLayout.resetPagingConfig();
    }
    
    public TradeNameSearchView getParentView() {
        return parentView;
    }
    
    public TradenameSearchParams getSearchParams() {
        return searchParams;
    }
    
    public SearchResultsTable getSearchTable() {
        return searchResultsTable;
    }

    public PagingHeaderLayout getPagingHeaderLayout() {
        return pagingHeaderLayout;
    }
    
    public int getTotalApplicationCount() {
    	return count;
    }
    
    public void setTotalApplicationCount(int count) {
    	this.count = count;
    }

}
