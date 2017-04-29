/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.component.common;

import com.proximo.inci.component.AbstractInciComponent;
import com.vaadin.ui.Label;

public class SpacingComponent extends AbstractInciComponent<Label> {
    
    private int heightPx;
    
    public SpacingComponent(int heightPx) {
        this.heightPx = heightPx;
        
        build();
    }
    
    @Override
    protected Label createMainComponentInstance() {
        return new Label();
    }

    @Override
    protected void init() {
        mainComponent.setContentMode(Label.CONTENT_XHTML);
        mainComponent.setValue("<div style=\"height: " + heightPx + "px\"></div>");
    }

}
