/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.window.subwindow.tradename;

import java.util.HashMap;
import java.util.Map;

import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.component.util.ComponentUtil;
import com.proximo.inci.service.common.LookupService;
import com.proximo.inci.view.ViewKey;
import com.proximo.inci.view.tradename.detail.TradeNameDetailView;
import com.proximo.inci.view.tradename.detail.mode.TradeNameDetailViewMode;
//import com.proximo.inci.view.tradename.search.TradeNameSearchView;
import com.proximo.inci.window.main.MainWindow;
import com.proximo.inci.window.subwindow.SubWindow;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
public class NewTradeNameWindow extends SubWindow {

    private static String CAPTION_KEY = "newInciTradeNameWindow.caption";

    private static final String WIDTH = "280px";
    private static final String HEIGHT = "160px";

    private ComboBox formTypeSelect;

    public NewTradeNameWindow(MainWindow mainWindow) {
        super(mainWindow);
    }

    @Override
    protected void init() {
        super.init();
        
        setModal(true);
        setResizable(false);

        VerticalLayout layout = (VerticalLayout) getContent();
        layout.setSpacing(true);
        layout.setSizeFull();

        initFormTypeSelect();
    }

    private void initFormTypeSelect() {
        formTypeSelect = new ComboBox();
        formTypeSelect.setWidth("200px");
        ComponentUtil.fillLookupValues(formTypeSelect, LookupService.getFormTnCategories());
    }

    @Override
    protected void addContent() {
        addFormTypeSelectLabel();
        addFormTypeSelect();
        addActionButtonsLayout();
    }

    private void addFormTypeSelectLabel() {
        VerticalLayout layout = (VerticalLayout) getContent();

        HorizontalLayout formTypeSelectLabelWrapper = new HorizontalLayout();
        Label formTypeSelectLabel = new Label(
                CaptionResolver.getCaption("newInciTradeNameWindow.formTypeSelect.caption"));
        formTypeSelectLabelWrapper.addComponent(formTypeSelectLabel);
        layout.addComponent(formTypeSelectLabelWrapper);
        layout.setComponentAlignment(formTypeSelectLabelWrapper, Alignment.TOP_CENTER);
    }

    private void addFormTypeSelect() {
        VerticalLayout layout = (VerticalLayout) getContent();

        layout.addComponent(formTypeSelect);
        layout.setComponentAlignment(formTypeSelect, Alignment.TOP_CENTER);
    }

    private void addActionButtonsLayout() {
        VerticalLayout layout = (VerticalLayout) getContent();

        HorizontalLayout actionButtonsLayout = new HorizontalLayout();
        actionButtonsLayout.setSpacing(true);
        Button okButton = ComponentUtil.createActionButton("ok", new Button.ClickListener() {
            @Override
            public void buttonClick(ClickEvent event) {
                if (formTypeSelect.getValue() != null) {
                    final Map<String, Object> navigationParameterMap = new HashMap<String, Object>();
                    navigationParameterMap
                            .put(TradeNameDetailView.MODE_NAVIG_PARAM_KEY, TradeNameDetailViewMode.CREATE);
                    navigationParameterMap.put(TradeNameDetailView.CATEGORY_ID_NAVIG_PARAM_KEY,
                            Integer.parseInt((String) formTypeSelect.getValue()));

                    mainWindow.navigateTo(ViewKey.TN_DETAIL.toString(), navigationParameterMap, mainWindow.getView(ViewKey.TN_SEARCH).getCurrentView());

                    mainWindow.removeWindow(getWindow());
                } else {
                    mainWindow.showNotification(
                            CaptionResolver.getCaption("newInciTradeNameWindow.formTypeSelect.invalid"),
                            Notification.TYPE_WARNING_MESSAGE);
                }
            }
        });
        actionButtonsLayout.addComponent(okButton);
        Button cancelButton = ComponentUtil.createActionButton("cancel", new Button.ClickListener() {
            @Override
            public void buttonClick(ClickEvent event) {
                //((TradeNameSearchView) mainWindow.getView(ViewKey.TN_SEARCH)).setClearOnNavigateOut(true);
                mainWindow.removeWindow(getWindow());
            }
        });
        actionButtonsLayout.addComponent(cancelButton);
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
    protected void afterShow() {
        formTypeSelect.setValue(null);
    }

    @Override
    protected void close() {
        //((TradeNameSearchView) mainWindow.getView(ViewKey.TN_SEARCH)).setClearOnNavigateOut(true);

        super.close();
    }

}
