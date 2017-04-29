/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.extra.attachments;

import com.proximo.inci.DOTradeName;
import com.proximo.inci.common.TemplarUtil;
import com.proximo.inci.component.AbstractInciComponentLayout;
import com.proximo.inci.service.tradename.TnAttachmentsService;
import com.vaadin.ui.HorizontalLayout;

public class TnAttachmentUploadLayout extends AbstractInciComponentLayout<HorizontalLayout> {

    private TnAttachmentsListLayout parentLayout;

    private int attachmentIndex;
    private boolean attachmentDeleted = false;

    private TnAttachmentFileName tnAttachmentFileName;     
    private TnAttachmentUpload tnAttachmentUpload;
    private ViewTnAttachmentLink viewTnAttachmentLink;
    private TnAttachmentDeletePic tnAttachmentDeletePic;

    public TnAttachmentUploadLayout(TnAttachmentsListLayout parentLayout, int attachmentIndex) {
        this.parentLayout = parentLayout;

        this.attachmentIndex = attachmentIndex;

        build();
    }

    @Override
    protected HorizontalLayout createMainComponentInstance() {
        return new HorizontalLayout();
    }

    @Override
    protected void init() {
        tnAttachmentFileName = new TnAttachmentFileName();
        tnAttachmentUpload = new TnAttachmentUpload(this);
        viewTnAttachmentLink = new ViewTnAttachmentLink(this);
        tnAttachmentDeletePic = new TnAttachmentDeletePic(this);
    }

    @Override
    protected void addContent() {
        addComponent(tnAttachmentFileName);
        addComponent(tnAttachmentUpload);
        addSpace();
        addComponent(viewTnAttachmentLink);
        addSpace();
        addComponent(tnAttachmentDeletePic);
    }

    @Override
    public void generateContent() {
        super.generateContent();

        attachmentDeleted = false;
        
        setEnabled(parentLayout.getParentDetails().getParentView().isEditable());

        // attachement link should be available in all cases
        viewTnAttachmentLink.setEnabled(true);
    }

    /**
     * UI Events to perform operations on attachments storage system (file
     * system).
     * 
     * 1) new attachment was uploaded: the old file will be deleted (if exists)
     * and the new will be saved. 2) old deleted: the old file will be deleted.
     * 3) new attachment was uploaded and then deleted: if old file exists it
     * will be deleted.
     */
    public void prepareFormTn() {
        String fileName = (String) tnAttachmentFileName.getMainComponent().getValue();    	
        
        DOTradeName formTn = parentLayout.getParentDetails().getParentView().getFormTn();        
        
        if (!TemplarUtil.isStringNullOrEmpty(fileName)) {        	
        	if (fileName.lastIndexOf(".") != -1) {
        		formTn.setAttachmentFileNameByIndex(attachmentIndex, (String) fileName);
        		return;
        	}
        }

        if (attachmentDeleted) {
            formTn.setAttachmentFileNameByIndex(attachmentIndex, "");
            return;
        }
    }    
    
    public void afterTnFormSaved() {
        String fileName = (String) tnAttachmentFileName.getMainComponent().getValue();    	
        DOTradeName formTn = parentLayout.getParentDetails().getParentView().getFormTn();

        if (!TemplarUtil.isStringNullOrEmpty(fileName)) {
        	if (fileName.lastIndexOf(".") != -1) {
        		TnAttachmentsService.storeTnFormAttachment(formTn, attachmentIndex, tnAttachmentUpload.getByteArrayOutputStream().toByteArray());
        		return;
        	}
        }

        if (attachmentDeleted) {
            TnAttachmentsService.deleteTnFormAttachment(formTn, attachmentIndex);
            return;
        }
    }

    public TnAttachmentsListLayout getParentLayout() {
        return parentLayout;
    }

    public int getAttachmentIndex() {
        return attachmentIndex;
    }

    public boolean isAttachmentDeleted() {
        return attachmentDeleted;
    }

    public void setAttachmentDeleted(boolean attachmentDeleted) {
        this.attachmentDeleted = attachmentDeleted;
    }

    public TnAttachmentFileName getTnAttachmentFileName() {
        return tnAttachmentFileName;
    }

    public ViewTnAttachmentLink getViewTnAttachmentLink() {
        return viewTnAttachmentLink;
    }

    public TnAttachmentDeletePic getTnAttachmentDeletePic() {
        return tnAttachmentDeletePic;
    }
    
}
