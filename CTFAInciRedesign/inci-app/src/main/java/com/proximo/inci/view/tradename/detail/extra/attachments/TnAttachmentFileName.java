/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.extra.attachments;

import com.proximo.inci.component.AbstractInciComponent;
import com.vaadin.ui.TextField;

public class TnAttachmentFileName extends AbstractInciComponent<TextField> {

    public TnAttachmentFileName() {
        build();
    }

    @Override
    protected TextField createMainComponentInstance() {
        return new TextField();
    }

    @Override
    protected void init() {
        mainComponent.setWidth("298px");
        mainComponent.setEnabled(false);
    }
    
    @Override
    public void generateContent() {
        mainComponent.setValue("");
    }

}
