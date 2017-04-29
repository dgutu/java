/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.window.subwindow.tradename;

import java.util.Map;

import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.component.util.ComponentUtil;
import com.proximo.inci.view.ViewKey;
//import com.proximo.inci.view.admin.misc_text_maint.detail.MTMDetailForm;
import com.proximo.inci.view.tradename.detail.TradeNameDetailView;
import com.proximo.inci.window.main.MainWindow;
import com.proximo.inci.window.subwindow.SubWindow;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
public class CancelTNDetailWindow extends SubWindow {

    private static String CAPTION_KEY = "sub_window.tn_detail.cancel";

    private static final String WIDTH = "380px";
    private static final String HEIGHT = "150px";
    @SuppressWarnings("unused")
	private TradeNameDetailView parentForm; 

    public CancelTNDetailWindow(MainWindow mainWindow) {
        super(mainWindow);
    }

    @Override
    protected void init() {
        super.init();

        setModal(true);
        setResizable(false);
        setClosable(false);

        VerticalLayout layout = (VerticalLayout) getContent();
        layout.setSizeFull();
    }

    @Override
    protected void addContent() {
        VerticalLayout layout = (VerticalLayout) getContent();

        layout.addComponent(new Label(CaptionResolver.getCaption("sub_window.tn_detail.cancel.question")));

        HorizontalLayout actionButtonsLayout = new HorizontalLayout();
        actionButtonsLayout.setSpacing(true);
        Button okButton = ComponentUtil.createActionButton("yes", new Button.ClickListener() {
            @Override
            public void buttonClick(ClickEvent event) {
            	// call save SP
            	//if (parentForm != null)
            	//	parentForm.saveFormTn();
            	
                mainWindow.removeWindow(getWindow());
                mainWindow.navigateTo(mainWindow.getView(ViewKey.TN_DETAIL).getBackURL());
            }
        });
        actionButtonsLayout.addComponent(okButton);

        Button noButton = ComponentUtil.createActionButton("no", new Button.ClickListener() {
            @Override
            public void buttonClick(ClickEvent event) {
                mainWindow.removeWindow(getWindow());
            }
        });
        actionButtonsLayout.addComponent(noButton);

        layout.addComponent(actionButtonsLayout);
        layout.setComponentAlignment(actionButtonsLayout, Alignment.BOTTOM_CENTER);
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
    
	@Override
    protected void handleParams(Map<String, Object> parameters) {
		if (parameters != null && parameters.size() > 0) {
			parentForm = (TradeNameDetailView) parameters.get("parentForm");
		}			
    }

}
