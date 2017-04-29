/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.admin.export;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.component.AbstractInciComponent;
import com.vaadin.terminal.StreamResource;
import com.vaadin.terminal.StreamResource.StreamSource;
import com.vaadin.ui.Link;

@SuppressWarnings("serial")
public class DownloadExportResultLink extends AbstractInciComponent<Link> {

    private ExportView parentView;

    public DownloadExportResultLink(ExportView parentView) {
        this.parentView = parentView;

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
        mainComponent.setCaption(CaptionResolver.getCaption("view.admin.export.result.download"));
    }

    public void refresh(String fileName, final byte[] content) {
        StreamSource streamSource = new StreamSource() {
            @Override
            public InputStream getStream() {
                return new ByteArrayInputStream(content);
            }
        };

        StreamResource streamResource = new StreamResource(streamSource, fileName, parentView.getApplication());
        
        /* Do not display in a browser, but let the file to be downloaded. */
        streamResource.getStream().setParameter("Content-Disposition", "attachment;filename=\"" + fileName + "\"");
        streamResource.setMIMEType("application/octet-stream");
        streamResource.setCacheTime(0);        
        
        mainComponent.setResource(streamResource);
    }

}
