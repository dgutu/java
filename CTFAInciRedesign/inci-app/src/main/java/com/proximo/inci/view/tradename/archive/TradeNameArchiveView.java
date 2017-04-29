/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.archive;

import com.proximo.inci.view.BaseView;
import com.proximo.inci.view.ViewKey;
import com.proximo.inci.window.main.MainWindow;

public class TradeNameArchiveView extends BaseView {

    public TradeNameArchiveView(MainWindow mainWindow) {
        super(mainWindow, true, "view.trade_name.archive");
    }

    @Override
    protected void addContent() {
        super.addContent();

        addMenuLinks();
    }

    private void addMenuLinks() {
        addComponent(new TradeNameArchiveMenuLink(this, "view.trade_name.archive.menu.search",
                ViewKey.TN_ARCHIVE_SEARCH, false));
        addComponent(new TradeNameArchiveMenuLink(this, "view.trade_name.archive.menu.move", ViewKey.TN_ARCHIVE_MOVE,
                true));
    } 
}
