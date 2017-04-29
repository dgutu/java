/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view;

import java.util.Map;

import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.common.TemplarUtil;
import com.proximo.inci.component.AbstractInciComponentLayout;
import com.proximo.inci.component.common.LabelComponent;
import com.proximo.inci.component.util.ComponentUtil;
import com.proximo.inci.service.security.SecurityInfo;
import com.proximo.inci.view.tradename.detail.TradeNameDetailView;
import com.proximo.inci.window.SubWindowKey;
import com.proximo.inci.window.main.AbstractMainWindow;
import com.vaadin.Application;
import com.vaadin.terminal.ExternalResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window.Notification;

/**
 * Base class for any view in application.
 * 
 * The Layout for a view is vertical.
 */
@SuppressWarnings("serial")
public abstract class AbstractView extends AbstractInciComponentLayout<VerticalLayout> {

    /** Reference to the main window, to delegate navigation, etc. */
    protected AbstractMainWindow mainWindow;

    private boolean addCaption;
    private String initCaptionKey;

    private LabelComponent viewTitle;
    
    //protected ViewKey backViewKey;
    protected String backURL;

    public AbstractView(AbstractMainWindow mainWindow, boolean addCaption, String initCaptionKey) {
        this.mainWindow = mainWindow;
        this.addCaption = addCaption;
        this.initCaptionKey = initCaptionKey;

        build();
    }

    @Override
    protected VerticalLayout createMainComponentInstance() {
        return new VerticalLayout();
    }

    @Override
    protected void init() {
        viewTitle = new LabelComponent(null, "view-title");
    }

    @Override
    protected void addContent() {
        if (addCaption) {
            addViewCaption();
        }
    }

    /** Adds a caption to the view. */
    private void addViewCaption() {
        addComponent(viewTitle);
        viewTitle.setValue(CaptionResolver.getCaption(initCaptionKey));
        addSpace();
    }

    /**
     * Creates a button, the click on which will result in navigation to the
     * view which is defined by <code>viewKey</code>.
     * 
     * @param initCaptionKey
     *            button caption resource key.
     * @param viewKey
     *            defines the view which is shown when the button is clicked.
     */
    public Button createNavigationButton(String captionKey, final ViewKey viewKey) {
        return ComponentUtil.createActionButton(captionKey, createNavigationBtnListener(viewKey, null));
    }

    /**
     * Creates a button with information label on the right. The click on the
     * button will result in navigation to the view which is defined by
     * <code>viewKey</code>.
     * 
     * @param initCaptionKey
     *            button caption resource key.
     * @param viewKey
     *            defines the view which is shown when the button is clicked.
     * @param infoKey
     *            information label resource key. It is shown on the right of
     *            the button.
     */
    public HorizontalLayout createNavigationButtonWithInfo(String captionKey, final ViewKey viewKey, String infoKey) {
        return ComponentUtil.createButtonWithInfo(captionKey, createNavigationBtnListener(viewKey, null), infoKey);
    }
    
    public Button createButtonNavigationLink(String captionKey, ViewKey viewKey) {
        Button buttonLink = new Button();
        
        buttonLink.addStyleName("link");
        buttonLink.setCaption(CaptionResolver.getCaption(captionKey));
        buttonLink.addListener(createNavigationBtnListener(viewKey, null));
        
        return buttonLink;
    }    

    /**
     * Creates a button click listener, where on-click will result in navigation
     * to the view which key is given by <code>viewKey</code>.
     */
    public Button.ClickListener createNavigationBtnListener(final ViewKey viewKey,
            final Map<String, Object> navigationParameterMap) {
        return new Button.ClickListener() {
            @Override
            public void buttonClick(ClickEvent event) {
                navigateTo(viewKey.toString(), navigationParameterMap);
            }
        };
    }

    public Button createShowSubWndwBtn(String captionKey, final SubWindowKey subWindowKey) {
        return ComponentUtil.createActionButton(captionKey, createShowSubWndwBtnListener(subWindowKey, null));
    }

    private ClickListener createShowSubWndwBtnListener(final SubWindowKey subWindowKey,
            final Map<String, Object> parameters) {
        return new Button.ClickListener() {
            @Override
            public void buttonClick(ClickEvent event) {
                mainWindow.showSubWindow(subWindowKey, parameters);
            }
        };
    }

    /** Handles navigation out from view; Override in subclasses if needed. */
    public void handleNavigateOut() {
    }

    public void navigateTo(String viewKey) {
        mainWindow.navigateTo(viewKey);
    }

    public void navigateTo(String viewKey, Map<String, Object> navigationParameterMap) {
        mainWindow.navigateTo(viewKey, navigationParameterMap);
    }
    
    public void navigateTo(String viewKey, String backViewKey) {
        mainWindow.navigateTo(viewKey, backViewKey);
    }
    
    public void navigateTo(String viewKey, Map<String, Object> navigationParameterMap, String backViewKey) {
        mainWindow.navigateTo(viewKey, navigationParameterMap, backViewKey);
    }    
    
    public void navigateBack() {
        mainWindow.navigateTo(backURL);
        
        backURL = null;
    }

    /** Override to apply navigation parameters received. */
    public void applyNavigationParameters(Map<String, Object> navigationParameterMap) {
    }

    public void openLink(String urlString) {
        mainWindow.open(new ExternalResource(urlString), "_blank");
    }

    public Object getApplicationProperty(String propertyName) {
        return mainWindow.getApplicationProperties().get(propertyName);
    }

    public void executeJavaScript(String script) {
        mainWindow.executeJavaScript(script);
    }

    public void showInfoMsgWindow(String message) {
        mainWindow.showInfoMsgWindow(message);
    }
    
    public void showInfoMsgWindowWithCaptionAndButtonText(String message, boolean changeDefaultStyle, String caption, String okButton, TradeNameDetailView parentView) {
        mainWindow.showInfoMsgWindowWithCaptionAndButtonText(message, changeDefaultStyle, caption, okButton, parentView);
    }
    

    public void showSubWindow(SubWindowKey subWindowKey) {
        mainWindow.showSubWindow(subWindowKey, null);
    }

    public void showSubWindow(SubWindowKey windowKey, Map<String, Object> parameters) {
        mainWindow.showSubWindow(windowKey, parameters);
    }

    /**
     * Shows a notification message.
     * 
     * @param msg
     *            information message.
     */
    public void showInformationMsg(String msg) {
        mainWindow.showNotification(msg);
    }

    public void showWarningMsg(String msg) {
        mainWindow.showNotification(msg, Notification.TYPE_WARNING_MESSAGE);
    }

    public void showWarningMsg(String msg, String description) {
        mainWindow.showNotification(msg, description, Notification.TYPE_WARNING_MESSAGE);
    }

    protected void setViewCaption(String caption) {
        viewTitle.setValue(caption);
    }

    public SecurityInfo getCurrentSecurityInfo() {
        return mainWindow.getCurrentSecurityInfo();
    }

    public Application getApplication() {
        return mainWindow.getApplication();
    }

    /*public void setBackViewKey(ViewKey backViewKey) {
        this.backViewKey = backViewKey;
    }*/
    
    public void setBackURL(String backURL) {
    	this.backURL = backURL;
    }
    
    /*public ViewKey getBackViewKey() {
    	return this.backViewKey;
    }*/
    
    public String getBackURL() {
    	if (!TemplarUtil.isStringNullOrEmpty(this.backURL))
    		return this.backURL;
    	else
    		return "";
    }
    
    public String getViewCaption() {
    	return viewTitle.toString();
    }
    
    public String getCurrentView() {
    	return mainWindow.getCurrentView();
    }
    
    public String getPreviousView() {
    	return mainWindow.getPreviousView();
    }    
    
    public void setFragment(String newFragment) {
    	mainWindow.setFragment(newFragment);
    }
    
    public AbstractMainWindow getMainWindow() {
    	return mainWindow;
    }

}
