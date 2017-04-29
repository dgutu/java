/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.archive.search;

import com.proximo.inci.DOList;
import com.proximo.inci.DOTradeName;
import com.proximo.inci.service.tradename.archive.TradeNameArchiveService;
import com.proximo.inci.view.ViewKey;
import com.proximo.inci.view.tradename.archive.search.table.legend.AbstractSearchResultsTableLegend;
import com.proximo.inci.view.tradename.archive.search.table.legend.SearchResultsTableLegend;
import com.proximo.inci.window.main.MainWindow;
import com.vaadin.ui.HorizontalLayout;

/**
 * The view used for trade name archive search.
 */
public class TradeNameArchiveSearchView extends AbstractTradeNameArchiveView {

    private static String CAPTION_KEY = "view.trade_name.archive.search";

    public TradeNameArchiveSearchView(MainWindow mainWindow) {
        super(mainWindow, CAPTION_KEY);
    }

    @Override
    public AbstractSearchResultsTableLegend createSearchResultsTableLegend() {
        return new SearchResultsTableLegend(this);
    }

    @Override
    public DOList search(DOTradeName searchObj, String userRecId, String orderBy, int ordering) {
        return TradeNameArchiveService.searchArchivedTradeNames(searchObj, userRecId, orderBy, ordering);
    }

    @Override
    public HorizontalLayout createRowActionsLayout(final DOTradeName formTn) {
        HorizontalLayout actionsLayout = new HorizontalLayout();

        actionsLayout.addComponent(createViewPic(formTn));

        return actionsLayout;
    }

    @Override
    public ViewKey getViewKey() {
        return ViewKey.TN_ARCHIVE_SEARCH;
    }

}
