/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.component.common;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proximo.inci.DOTradeName;
import com.proximo.inci.component.AbstractInciComponent;
import com.proximo.inci.component.util.ComponentUtil;
import com.vaadin.terminal.StreamResource;
import com.vaadin.terminal.StreamResource.StreamSource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.proximo.inci.view.tradename.payment.PrintLayoutPDF;
import com.proximo.inci.view.tradename.payment.option.AbstractPaymentOptionView;

@SuppressWarnings("serial")
public class JavaScriptPrintButton extends AbstractInciComponent<Button> {

	private static Logger logger = LoggerFactory.getLogger(JavaScriptPrintButton.class);
	
	private AbstractPaymentOptionView parentView;
	
    public JavaScriptPrintButton(AbstractPaymentOptionView parentView) {
        this.parentView = parentView;
        
        build();
    }

    @Override
    protected Button createMainComponentInstance() {
        return ComponentUtil.createActionButton("print", new ClickListener() {
            @Override
            public void buttonClick(ClickEvent event) {
            	try {
	            	DOTradeName formTn = parentView.getFormTn();
	            	
	                // generate PDF            
	                String basepath = parentView.getApplication().getContext().getBaseDirectory().getAbsolutePath() + "/VAADIN/themes/inci-app-theme/images/";
	                
	                String message = null;
	                if (parentView.getPaymentOptionLayout().getInstructionsText().getMainComponent().getValue() != null)
	                	message = parentView.getPaymentOptionLayout().getInstructionsText().getMainComponent().getValue().toString();
	                
	                message = StringUtils.replace(message, "<br>", "\n");
	                message = StringUtils.replace(message, "<BR>", "\n");
	                message = StringUtils.replace(message, "<bR>", "\n");
	                message = StringUtils.replace(message, "<Br>", "\n");
	                message = message.replaceAll("\\<.*?\\>", "");
	                message = message.replaceAll("\\&.*?\\;", "");
	                
	                String appUrlString = parentView.getApplication().getURL().toString();
	                
	                final byte[] pdf = PrintLayoutPDF.generatePDF(formTn, message, basepath, appUrlString);
	                
	                String fileName = formTn.tnNumber + ".pdf";
	
	                StreamSource streamSource = new StreamSource() {
	        			@Override
	                    public InputStream getStream() {
	                        return new ByteArrayInputStream(pdf);
	                    }
	                };
	
	                StreamResource streamResource = new StreamResource(streamSource, fileName, parentView.getApplication());
	
	                streamResource.getStream().setParameter("Content-Disposition", "attachment;filename=\"" + fileName + "\"");
	                streamResource.setMIMEType("application/octet-stream");
	                streamResource.setCacheTime(5000); // fix for IE
	
	                parentView.getApplication().getMainWindow().open(streamResource, "_blank");
            	}
            	catch (Exception ex) {
            		logger.error("JavaScriptPrintButton.Print="+ex.getMessage());
            	}
            }
        });
    }

    @Override
    protected void init() {
    }

}
