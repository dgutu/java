/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.archive.move;

import java.util.ArrayList;

import com.proximo.inci.DOList;
import com.proximo.inci.DOTradeName;
import com.proximo.inci.service.tradename.archive.TradeNameArchiveService;
import com.proximo.inci.view.ViewKey;
import com.proximo.inci.view.tradename.archive.move.table.legend.SearchResultsTableLegend;
import com.proximo.inci.view.tradename.archive.search.AbstractTradeNameArchiveView;
import com.proximo.inci.view.tradename.archive.search.table.legend.AbstractSearchResultsTableLegend;
import com.proximo.inci.window.main.MainWindow;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Window.Notification;

/**
 * The view used for trade name "move-to-archive".
 */
public class TradeNameArchiveMoveView extends AbstractTradeNameArchiveView {

    private ArrayList<CheckBox> rowCheckBoxArrayList = new ArrayList<CheckBox>();

    public TradeNameArchiveMoveView(MainWindow mainWindow) {
        super(mainWindow, "view.trade_name.archive.move");
    }

    @Override
    public AbstractSearchResultsTableLegend createSearchResultsTableLegend() {
        return new SearchResultsTableLegend(this);
    }

    @Override
    public DOList search(DOTradeName searchObj, String userRecId, String orderBy, int ordering) {
        return TradeNameArchiveService.searchActiveTradeNames(searchObj, userRecId, orderBy, ordering);
    }

    @Override
    public HorizontalLayout createRowActionsLayout(final DOTradeName formTn) {
        HorizontalLayout actionsLayout = new HorizontalLayout();

        /* view pic */
        actionsLayout.addComponent(createViewPic(formTn));

        /* row check box */
        CheckBox checkBox = new CheckBox();
        rowCheckBoxArrayList.add(checkBox);
        actionsLayout.addComponent(checkBox);

        return actionsLayout;
    }

    @Override
    protected void search(boolean setFragment) {
        rowCheckBoxArrayList.clear();
        super.search(setFragment);
    }

    public void handleSelectAll(boolean newValue) {
        for (CheckBox cb : rowCheckBoxArrayList) {
            cb.setValue(newValue);
        }
    }

    public void handleMoveToArchive() {
        ArrayList<Long> recIds = new ArrayList<Long>();

        for (int i = 0; i < rowCheckBoxArrayList.size(); i++) {
            CheckBox cb = rowCheckBoxArrayList.get(i);

            if ((Boolean) cb.getValue()) {
                recIds.add(((DOTradeName) searchResultsTableLayout.getSearchResult().elementAt(i)).recID);
            }
        }

        if (recIds == null || recIds.size() >= 1) {
        	TradeNameArchiveService.moveActives2Archive(recIds, getCurrentSecurityInfo().getUser()
                .getLoginId());
        }
        else
        	mainWindow.showNotification("No record is avaiable to move !", Notification.TYPE_WARNING_MESSAGE);

        search(false);
    }

    @Override
    public ViewKey getViewKey() {
        return ViewKey.TN_ARCHIVE_MOVE;
    }

}
