/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.extra.attachments;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proximo.inci.DOTradeName;
import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.component.AbstractInciComponent;
import com.proximo.inci.service.tradename.TnAttachmentsService;
//import com.proximo.inci.view.tradename.archive.search.table.SearchResultsTable;
import com.proximo.inci.view.tradename.detail.TradeNameDetailView;
import com.vaadin.terminal.FileResource;
import com.vaadin.ui.Link;

public class ViewTnAttachmentLink extends AbstractInciComponent<Link> {
	
	@SuppressWarnings("unused")
	private static Logger logger = LoggerFactory.getLogger(ViewTnAttachmentLink.class);
	
    private TnAttachmentUploadLayout parentLayout;

    public ViewTnAttachmentLink(TnAttachmentUploadLayout parentLayout) {
        this.parentLayout = parentLayout;

        build();
    }

    @Override
    protected Link createMainComponentInstance() {
        return new Link();
    }

    @Override
    protected void init() {
        mainComponent.addStyleName("common");
        mainComponent.setTargetName("_blank");
    }

    @Override
    public void generateContent() {
        TradeNameDetailView parentView = parentLayout.getParentLayout().getParentDetails().getParentView();
        DOTradeName formTn = parentView.getFormTn();
        int attachmentIndex = parentLayout.getAttachmentIndex();

        File tnAttachmentFile = TnAttachmentsService.retrieveTnFormAttachmentFile(formTn, attachmentIndex);
        
        //logger.debug("File.Filename="+tnAttachmentFile.getAbsolutePath());
        //logger.debug("File.Filename="+tnAttachmentFile.getName());
        
        if (tnAttachmentFile != null && tnAttachmentFile.exists()) {
            mainComponent.setCaption(CaptionResolver.getCaption("view") + " "
                    + formTn.getOriginalAttachmentFileName(attachmentIndex));
            mainComponent.setResource(new FileResource(tnAttachmentFile, parentView.getApplication()));
            mainComponent.setVisible(true);
        } else {
            mainComponent.setCaption(null);
            mainComponent.setResource(null);
            mainComponent.setVisible(false);
        }
    }
    
}
