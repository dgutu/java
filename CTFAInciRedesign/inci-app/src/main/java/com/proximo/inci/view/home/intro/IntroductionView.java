/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.home.intro;

import com.proximo.inci.service.security.SecurityInfo;
import com.proximo.inci.view.BaseView;
import com.proximo.inci.window.main.MainWindow;

public class IntroductionView extends BaseView {
    
    public IntroductionView(MainWindow mainWindow) {
        super(mainWindow, false, null);
    }

    @Override
    protected void addContent() {
        super.addContent();
        
        // TODO (LOW) refactor into component
        mainComponent.addComponent(new IntroductionLayout((MainWindow) mainWindow));
    }

    @Override
    public void applySecurityInfo(SecurityInfo securityInfo) {
        // IntroductionView has no component for which to apply the security info
    }

}
