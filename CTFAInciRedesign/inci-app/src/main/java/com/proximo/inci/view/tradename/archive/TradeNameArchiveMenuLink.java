/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.archive;

import com.proximo.inci.component.AbstractInciComponent;
import com.proximo.inci.view.ViewKey;
import com.vaadin.ui.Button;

public class TradeNameArchiveMenuLink extends AbstractInciComponent<Button>{
    
    private TradeNameArchiveView parentView;
    
    private String captionKey;
    private ViewKey navigationKey;
    private boolean admin;
    
    public TradeNameArchiveMenuLink(TradeNameArchiveView parentView, String captionKey, ViewKey navigationKey, boolean admin) {
        this.parentView = parentView;
        
        this.captionKey = captionKey;
        this.navigationKey = navigationKey;
        this.admin = admin;
        
        build();
    }

    @Override
    protected Button createMainComponentInstance() {
        return parentView.createButtonNavigationLink(captionKey, navigationKey);
    }

    @Override
    protected void init() {
        setAdminComponent(admin);
    }

}
