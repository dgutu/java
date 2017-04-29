/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.extra.attachments;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.component.AbstractInciComponent;
import com.proximo.inci.window.SubWindowKey;
import com.vaadin.ui.Upload;
import com.vaadin.ui.Upload.Receiver;
import com.vaadin.ui.Upload.StartedEvent;
import com.vaadin.ui.Upload.SucceededEvent;

@SuppressWarnings("serial")
public class TnAttachmentUpload extends AbstractInciComponent<Upload> {

    private TnAttachmentUploadLayout parentLayout;

    private TnAttachmentUploadReceiver receiver;
    
    public TnAttachmentUpload(TnAttachmentUploadLayout parentLayout) {
        this.parentLayout = parentLayout;

        build();
    }

    @Override
    protected Upload createMainComponentInstance() {
        return new Upload();
    }

    @Override
    protected void init() {
        mainComponent.setButtonCaption(CaptionResolver.getCaption("tradeName.detail.attachments.browse_btn"));

        mainComponent.setImmediate(true);

        receiver = new TnAttachmentUploadReceiver();        
        mainComponent.setReceiver(receiver);

        mainComponent.addListener(new Upload.StartedListener() {
            @Override
            public void uploadStarted(StartedEvent event) {
                parentLayout.getParentLayout().getParentDetails().getParentView().showSubWindow(SubWindowKey.CMN_LOADING);
            	//mainComponent.setVisible(false);
            }
        });

        mainComponent.addListener(new Upload.SucceededListener() {
            @Override
            public void uploadSucceeded(SucceededEvent event) {
                parentLayout.getTnAttachmentFileName().getMainComponent().setValue(event.getFilename());
                parentLayout.getViewTnAttachmentLink().getMainComponent().setVisible(false);
                parentLayout.setAttachmentDeleted(false);
                parentLayout.getTnAttachmentDeletePic().getMainComponent().setVisible(true);
                
                parentLayout.getParentLayout().getParentDetails().getParentView().closeLoadingSubWindow();
            }
        });
        
        /*mainComponent.addListener(new Upload.FinishedListener() {			
			@Override
			public void uploadFinished(FinishedEvent event) {
				mainComponent.setVisible(true);				
			}
		});*/
    }

    @Override
    public void generateContent() {
        receiver.setByteArrayOutputStream(new ByteArrayOutputStream());
    }

    public ByteArrayOutputStream getByteArrayOutputStream() {
        return receiver.getByteArrayOutputStream();
    }

    private static class TnAttachmentUploadReceiver implements Receiver {

        private ByteArrayOutputStream byteArrayOutputStream;

        @Override
        public OutputStream receiveUpload(String filename, String mimeType) {
            byteArrayOutputStream = new ByteArrayOutputStream();
            return byteArrayOutputStream;
        }

        public ByteArrayOutputStream getByteArrayOutputStream() {
            return byteArrayOutputStream;
        }

        public void setByteArrayOutputStream(ByteArrayOutputStream byteArrayOutputStream) {
            this.byteArrayOutputStream = byteArrayOutputStream;
        }

    }
}
