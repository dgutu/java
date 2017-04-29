/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.window.subwindow.tradename;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

import com.proximo.inci.DOTradeName;
import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.common.TDate;
import com.proximo.inci.component.util.ComponentUtil;
import com.proximo.inci.service.security.user.User;
import com.proximo.inci.service.tradename.TradeNameService;
import com.proximo.inci.view.ViewKey;
import com.proximo.inci.view.tradename.detail.mode.TradeNameDetailViewMode;
import com.proximo.inci.window.main.MainWindow;
import com.proximo.inci.window.subwindow.SubWindow;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
public class SaveAsWindow extends SubWindow {

    private static String CAPTION_KEY = "sub_window.tn_detail.save_as";

    private static final String WIDTH = "380px";
    private static final String HEIGHT = "280px";

    public static String FORM_TN_PARAM_KEY = "formTn";

    private DOTradeName formTn;

    private TextField newTradeNameField;
    private Label tradeNameInvalidLabel;

    public SaveAsWindow(MainWindow mainWindow) {
        super(mainWindow);
    }

    @Override
    protected void init() {
        super.init();

        setModal(true);
        setResizable(false);
        setClosable(false);

        VerticalLayout layout = (VerticalLayout) getContent();
        layout.setSpacing(false);
        layout.setSizeFull();

        newTradeNameField = new TextField(CaptionResolver.getCaption("sub_window.tn_detail.save_as.new_trade_name"));
        newTradeNameField.setWidth("340px");
        
        // always default to blank
        newTradeNameField.setValue("");

        tradeNameInvalidLabel = new Label();
        tradeNameInvalidLabel.addStyleName("error-label");
    }

    @Override
    protected void addContent() {
        VerticalLayout layout = (VerticalLayout) getContent();

        layout.addComponent(new Label(CaptionResolver.getCaption("sub_window.tn_detail.save_as.question")));
        ComponentUtil.addSpace(layout);
        layout.addComponent(newTradeNameField);
        layout.addComponent(tradeNameInvalidLabel);
        ComponentUtil.addSpace(layout);

        HorizontalLayout actionButtonsLayout = new HorizontalLayout();
        actionButtonsLayout.setSpacing(true);
        Button okButton = ComponentUtil.createActionButton("ok", new Button.ClickListener() {
            @Override
            public void buttonClick(ClickEvent event) {
                tradeNameInvalidLabel.setVisible(false);

                if ("".equals(newTradeNameField.getValue())) {
                    tradeNameInvalidLabel.setValue(CaptionResolver
                            .getCaption("sub_window.tn_detail.save_as.new_trade_name.REQURIED"));
                    tradeNameInvalidLabel.setVisible(true);
                    return;
                }
                
                User currrentUser = mainWindow.getCurrentSecurityInfo().getUser();
                
                // check for duplicate
                /* Trade name already exists. */
                if (TradeNameService.checkSaveAsTradeIsDuplicate((String) newTradeNameField.getValue(), currrentUser.getUserRecId(), formTn.recID))
                {
                	tradeNameInvalidLabel.setValue(CaptionResolver
                            .getCaption("sub_window.tn_detail.save_as.trade_name_exists"));
                    tradeNameInvalidLabel.setVisible(true);
                }
                else {
	                formTn.recID = 0;
	                formTn.tradeName = (String) newTradeNameField.getValue();
	                formTn.submitDt = new TDate();
	                formTn.submitDt.setNull();
	                formTn.submitted = false;
	                formTn.inciNameDt = new TDate();
	                formTn.inciNameDt.setNull();
	                formTn.inciName = "";	
	                
	                @SuppressWarnings("rawtypes")
					Vector retVec = TradeNameService.saveFormTnServiceCall(formTn, currrentUser.getUserRecId(),
	                        currrentUser.getLoginId(), "save");
	                //int retCode = ((Integer) retVec.elementAt(2)).intValue();
	
	                //if (-3 == retCode) {
	                    /* Trade name already exists. */
	                /*    tradeNameInvalidLabel.setValue(CaptionResolver
	                            .getCaption("sub_window.tn_detail.save_as.trade_name_exists"));
	                    tradeNameInvalidLabel.setVisible(true);
	                } else {*/
                    mainWindow.removeWindow(getWindow());

                    long formTnRecId = ((Long) retVec.elementAt(0)).longValue();
                    Map<String, Object> navigationParameterMap = new HashMap<String, Object>();
                    navigationParameterMap.put("mode", TradeNameDetailViewMode.UPDATE);
                    navigationParameterMap.put("formTnRecId", formTnRecId);
                    mainWindow.navigateTo(ViewKey.TN_DETAIL.toString(), navigationParameterMap, ViewKey.TN_SEARCH.toString());

                    mainWindow.showInfoMsgWindow(CaptionResolver.getCaption("sub_window.tn_detail.save_as.success"));
	                //}
                }
            }
        });
        actionButtonsLayout.addComponent(okButton);

        Button noButton = ComponentUtil.createActionButton("cancel", new Button.ClickListener() {
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
    protected void handleParams(Map<String, Object> parameters) {
        formTn = (DOTradeName) parameters.get(FORM_TN_PARAM_KEY);
        tradeNameInvalidLabel.setVisible(false);
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
    protected void afterShow() {
    	newTradeNameField.setValue("");
    	newTradeNameField.focus();
    }
}
