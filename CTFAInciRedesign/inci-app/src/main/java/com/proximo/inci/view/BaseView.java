/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view;

import com.proximo.inci.window.main.MainWindow;
import com.proximo.inci.window.main.layout.MainLayout;

public abstract class BaseView extends AbstractView {

    public BaseView(MainWindow mainWindow, boolean addCaption, String captionKey) {
        super(mainWindow, addCaption, captionKey);
    }

    protected void showBaseMenu() {
        ((MainLayout) mainWindow.getMainLayout()).showBaseMenu();
    }

    public void closeLoadingSubWindow() {
        ((MainWindow) mainWindow).closeLoadingSubWindow();
    }

}
