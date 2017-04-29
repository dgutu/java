/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.window.subwindow;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.common.TemplarUtil;
//import com.proximo.inci.component.util.ComponentUtil;
import com.proximo.inci.view.tradename.detail.TradeNameDetailView;
import com.proximo.inci.window.main.MainWindow;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;

public class InformationMessageWindow extends InformationWindow {
	
	@SuppressWarnings("unused")
	private static Logger logger = LoggerFactory.getLogger(InformationMessageWindow.class);
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -9051120872066549983L;

	private String CAPTION_KEY = "Information";

    private static final String WIDTH = "430px";
    private static final String HEIGHT = "170px";    

    public static String INFO_MSG_PARAM_KEY = "infoMsg";
    public static String CHANGE_DEFAULT_STYLE = "style";
    public static String CAPTION_KEY_NEW_VALUE = "caption";
    public static String OK_BUTTON_VALUE = "okButton";
    public static String PARENT_VIEW = "parentView";

    private Label infoMsgLabel;
    private TradeNameDetailView parentView;
    
    private Button okButton1;
    private Button cancelButton;
    
    private HorizontalLayout actionButtonsLayout;

    public InformationMessageWindow(MainWindow mainWindow) {
        super(mainWindow);
    }

    @Override
    protected void init() {
        super.init();

        infoMsgLabel = new Label("", Label.CONTENT_XHTML);        
        cancelButton = new Button(CaptionResolver.getCaption("save.cancelButton"));
        cancelButton.addStyleName("actionbtn-xlarge");
        cancelButton.addListener(createCancelButtonListener());
        
        // save & submit popup
        okButton1 = new Button(CaptionResolver.getCaption("ok"));
        okButton1.addStyleName("actionbtn-xxxxlarge");
        okButton1.addListener(createButtonListener1());
    }

    @Override
    protected void addInformation() {
        VerticalLayout layout = (VerticalLayout) getContent();

        layout.addComponent(infoMsgLabel);
        
        //
    	//VerticalLayout contentLayout = (VerticalLayout) getContent();

        actionButtonsLayout = new HorizontalLayout();
        actionButtonsLayout.setSpacing(true);        
        
        actionButtonsLayout.addComponent(okButton1);
        actionButtonsLayout.addComponent(cancelButton);
        layout.addComponent(actionButtonsLayout);
        layout.setComponentAlignment(actionButtonsLayout, Alignment.BOTTOM_CENTER);        
    }
    
    /*@Override
    protected void addActionButtonsLayout() {
    	VerticalLayout contentLayout = (VerticalLayout) getContent();

        actionButtonsLayout = new HorizontalLayout();
        actionButtonsLayout.setSpacing(true);        
        
        actionButtonsLayout.addComponent(okButton);
        actionButtonsLayout.addComponent(okButton1);
        actionButtonsLayout.addComponent(cancelButton);
        contentLayout.addComponent(actionButtonsLayout);
        contentLayout.setComponentAlignment(actionButtonsLayout, Alignment.BOTTOM_CENTER);
    }*/
    
    @Override
    protected void handleParams(Map<String, Object> parameters) {
    	
    	//logger.debug("parameters.get(PARENT_VIEW)0="+parameters.get(PARENT_VIEW));
    	
        infoMsgLabel.setValue(parameters.get(INFO_MSG_PARAM_KEY));
        
        // set mystyle name 
        if (parameters.get(CHANGE_DEFAULT_STYLE) != null && parameters.get(CHANGE_DEFAULT_STYLE).toString().toUpperCase().equals("Y"))
        	infoMsgLabel.addStyleName("mystyle");
        
        // set caption
        if (parameters.get(CAPTION_KEY_NEW_VALUE) != null && !parameters.get(CAPTION_KEY_NEW_VALUE).toString().equals("")) {
        	CAPTION_KEY = parameters.get(CAPTION_KEY_NEW_VALUE).toString();
        }
        else 
        	CAPTION_KEY = CaptionResolver.getCaption("information_message_window.caption");
        
        if (!TemplarUtil.isStringNullOrEmpty(CAPTION_KEY))
        	setCaption(CAPTION_KEY);
        
        // set save & submit popup button text
        if (parameters.get(OK_BUTTON_VALUE) != null && !TemplarUtil.isStringNullOrEmpty(parameters.get(OK_BUTTON_VALUE).toString())) { 
        	String buttonText = parameters.get(OK_BUTTON_VALUE).toString();
    		okButton1.setCaption(CaptionResolver.getCaption(buttonText));
        }
        
        // parentView 
        //logger.debug("parameters.get(PARENT_VIEW)="+parameters.get(PARENT_VIEW));
        if (parameters.get(PARENT_VIEW) != null && !TemplarUtil.isStringNullOrEmpty(parameters.get(PARENT_VIEW).toString())) {
        	try {
        		parentView = (TradeNameDetailView) parameters.get(PARENT_VIEW);
            	if (parentView != null) {
                	okButtonParent.setVisible(false);      // ok button 
                	okButton1.setVisible(true);            // save & submit popup button
                	cancelButton.setVisible(true);         // exit button 
            	}
        	}
        	catch (Exception ex) {
        	}
        }
        else {
        	//logger.debug("parameters.get(PARENT_VIEW)2="+parameters.get(PARENT_VIEW));
        	okButtonParent.setVisible(true);        // ok button 
        	okButton1.setVisible(false);            // save & submit popup button
        	cancelButton.setVisible(false);         // exit button
        }
    }
    
    @Override
    protected String getCaptionKey() {
        return CAPTION_KEY;
    }

    @Override
    protected String getWindowWidth() {
        return WIDTH;
    }

    @Override
    protected String getWindowHeight() {
        return HEIGHT;
    }
    
    private Button.ClickListener createButtonListener1() {
        return new Button.ClickListener() {
            /**
			 * 
			 */
			private static final long serialVersionUID = 5979869671644632295L;

			@Override
            public void buttonClick(ClickEvent event) {
            	if (parentView != null) {
            		
            		String validationErrorStr = parentView.saveFormTn();
                    if (validationErrorStr == null) {
                    	mainWindow.removeWindow(getWindow());
                    }
                    else {
                    	mainWindow.showNotification(validationErrorStr);
                    }
            	}
            }
        };
    }  
}
