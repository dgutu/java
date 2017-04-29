/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.admin;

import com.proximo.inci.view.BaseView;
import com.proximo.inci.view.ViewKey;
import com.proximo.inci.window.main.MainWindow;

public class AdminFunctionsView extends BaseView {

    public AdminFunctionsView(MainWindow mainWindow) {
        super(mainWindow, true, "view.admin.functions");
    }

    @Override
    protected void addContent() {
        super.addContent();

        addMenuLinks();
    }

    private void addMenuLinks() {
        /* 2013-02-05: decided to have only single TN Export from INCI Detail page.
        mainComponent.addComponent(createButtonNavigationLink("view.admin.functions.export", ViewKey.ADMIN_EXPORT));
        */
        
        mainComponent.addComponent(createButtonNavigationLink("view.admin.functions.check_clearing",
                ViewKey.ADMIN_CHECK_CLEARING_SEARCH));
        mainComponent.addComponent(createButtonNavigationLink("view.admin.functions.ach_clearing",
                ViewKey.ADMIN_ACH_CLEARING_SEARCH));
        mainComponent.addComponent(createButtonNavigationLink("view.admin.functions.cc_transactions_report",
                ViewKey.ADMIN_CC_TRANSACTIONS_REPORT));
        mainComponent.addComponent(createButtonNavigationLink("view.admin.functions.misc_text_maint",
                ViewKey.ADMIN_MISC_TEXT_MAINT_SEARCH));
        mainComponent.addComponent(createButtonNavigationLink("view.admin.functions.app_move",
                ViewKey.ADMIN_APP_MOVE_SEARCH));        
        
    }

}
