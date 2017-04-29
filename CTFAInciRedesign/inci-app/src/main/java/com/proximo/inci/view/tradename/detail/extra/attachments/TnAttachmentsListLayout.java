/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.extra.attachments;

import com.proximo.inci.component.common.LabelComponent;
import com.proximo.inci.component.util.ComponentUtil;
import com.proximo.inci.view.tradename.detail.extra.TradeNameExtraDetails;
import com.proximo.inci.view.tradename.detail.extra.TradeNameExtraDetailsComponentLayout;
import com.vaadin.ui.VerticalLayout;

public class TnAttachmentsListLayout extends TradeNameExtraDetailsComponentLayout<VerticalLayout> {

    private LabelComponent attachmentsLabel;
    private LabelComponent attachmentsDescriptionLabel;
    private TnAttachmentUploadLayout tnAttachmentUploadLayout1;
    private TnAttachmentUploadLayout tnAttachmentUploadLayout2;
    private TnAttachmentUploadLayout tnAttachmentUploadLayout3;
    private TnAttachmentUploadLayout tnAttachmentUploadLayout4;
    private TnAttachmentUploadLayout tnAttachmentUploadLayout5;

    public TnAttachmentsListLayout(TradeNameExtraDetails parentDetails) {
        super(parentDetails);
    }

    @Override
    protected VerticalLayout createMainComponentInstance() {
        return new VerticalLayout();
    }

    @Override
    protected void init() {
        attachmentsLabel = new LabelComponent("tradeName.detail.attachments");
        attachmentsDescriptionLabel = new LabelComponent("tradeName.detail.attachments.description", "very-small-text");
        tnAttachmentUploadLayout1 = new TnAttachmentUploadLayout(this, 1);
        tnAttachmentUploadLayout2 = new TnAttachmentUploadLayout(this, 2);
        tnAttachmentUploadLayout3 = new TnAttachmentUploadLayout(this, 3);
        tnAttachmentUploadLayout4 = new TnAttachmentUploadLayout(this, 4);
        tnAttachmentUploadLayout5 = new TnAttachmentUploadLayout(this, 5);
    }

    @Override
    protected void addContent() {
        addComponent(attachmentsLabel);
        addComponent(attachmentsDescriptionLabel);
        addSpacing(ComponentUtil.NORMAL_FORM_SPACING_PX);
        addComponent(tnAttachmentUploadLayout1);
        addComponent(tnAttachmentUploadLayout2);
        addComponent(tnAttachmentUploadLayout3);
        addComponent(tnAttachmentUploadLayout4);
        addComponent(tnAttachmentUploadLayout5);
    }

    /**
     * Based on UI components values sets attribute values in formTn.
     */
    public void prepareFormTn() {
        tnAttachmentUploadLayout1.prepareFormTn();
        tnAttachmentUploadLayout2.prepareFormTn();
        tnAttachmentUploadLayout3.prepareFormTn();
        tnAttachmentUploadLayout4.prepareFormTn();
        tnAttachmentUploadLayout5.prepareFormTn();
    }
    
    public void afterTnFormSaved() {
        tnAttachmentUploadLayout1.afterTnFormSaved();
        tnAttachmentUploadLayout2.afterTnFormSaved();
        tnAttachmentUploadLayout3.afterTnFormSaved();
        tnAttachmentUploadLayout4.afterTnFormSaved();
        tnAttachmentUploadLayout5.afterTnFormSaved();        
    }
}
