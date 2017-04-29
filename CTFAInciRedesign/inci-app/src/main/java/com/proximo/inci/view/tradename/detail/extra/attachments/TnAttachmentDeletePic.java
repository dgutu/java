/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.extra.attachments;

import com.proximo.inci.component.AbstractInciComponent;
import com.vaadin.event.MouseEvents.ClickEvent;
import com.vaadin.event.MouseEvents.ClickListener;
import com.vaadin.terminal.ThemeResource;
import com.vaadin.ui.Embedded;

@SuppressWarnings("serial")
public class TnAttachmentDeletePic extends AbstractInciComponent<Embedded> {

    private TnAttachmentUploadLayout parentLayout;

    public TnAttachmentDeletePic(TnAttachmentUploadLayout parentLayout) {
        this.parentLayout = parentLayout;
        
        build();
    }

    @Override
    protected Embedded createMainComponentInstance() {
        return new Embedded(null, new ThemeResource("images/pdelete.gif"));
    }

    @Override
    protected void init() {
        mainComponent.addStyleName("cursor-pointer");

        mainComponent.addListener(new ClickListener() {
            @Override
            public void click(ClickEvent event) {
                parentLayout.setAttachmentDeleted(true);
                
                parentLayout.getTnAttachmentFileName().getMainComponent().setValue("");                
                parentLayout.getViewTnAttachmentLink().getMainComponent().setVisible(false);
                mainComponent.setVisible(false);
            }
        });
    }
    
    @Override
    public void generateContent() {
        mainComponent.setVisible(parentLayout.getViewTnAttachmentLink().getMainComponent().isVisible());
    }

}
