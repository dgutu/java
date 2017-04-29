/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.security;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.component.util.ComponentUtil;
import com.proximo.inci.service.security.SecurityInfo;
import com.proximo.inci.service.security.SecurityService;
import com.proximo.inci.url.UrlResolver;
import com.proximo.inci.view.BaseView;
import com.proximo.inci.window.SubWindowKey;
import com.proximo.inci.window.main.MainWindow;
import com.vaadin.event.ShortcutAction.KeyCode;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.LoginForm.LoginEvent;
import com.vaadin.ui.LoginForm.LoginListener;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
public class LogonView extends BaseView {

    private static Logger logger = LoggerFactory.getLogger(LogonView.class);

    private final String layoutWidth = "650px";  

    private TextField userIdField;
    private PasswordField passwordField;

    public LogonView(MainWindow mainWindow) {
        super(mainWindow, false, null);
    }
    
    @Override
    protected void init() {
    	super.init();

        userIdField = new TextField(CaptionResolver.getCaption("security.logon.userIdLabel"));
        passwordField = new PasswordField(CaptionResolver.getCaption("security.logon.passwordLabel"));
        
        userIdField.focus();
    }

    @Override
    protected void addContent() {
        super.addContent();

        addTopInfo();
        //addLoginForm();
        addUsernamePasswordForm();
        addBottomInfo();        

        userIdField.focus(); 
    }

    private void addTopInfo() {
        logger.debug("Adding top info");

        //addFeeNotice();
        //ComponentUtil.addHtml("<br>", mainComponent);
        //addInciGoLiveNote();
        addPart1Notice();
        //ComponentUtil.addHtml("<br>", mainComponent);
        //addNewUserInfo();
        //ComponentUtil.addHtml("<br>", mainComponent);
        //addCookiesNotice();

        logger.debug("Adding top info finished");
    }

    @SuppressWarnings("unused")
	private void addFeeNotice() {
        logger.debug("Adding fee notice");

        HorizontalLayout hz = new HorizontalLayout();
        hz.setWidth(layoutWidth);
        hz.setHeight("82px");
        hz.addStyleName("lightSteelBlueBkgColor");
        hz.addStyleName("roundedCorners");

        HorizontalLayout hzInner = new HorizontalLayout();

        Label label = new Label(CaptionResolver.getCaption("security.logon.feeNotice"), Label.CONTENT_XHTML);
        hzInner.addComponent(label);
        hzInner.setComponentAlignment(label, Alignment.MIDDLE_CENTER);

        hz.addComponent(hzInner);
        hz.setComponentAlignment(hzInner, Alignment.MIDDLE_CENTER);

        mainComponent.addComponent(hz);
        mainComponent.setComponentAlignment(hz, Alignment.MIDDLE_CENTER);

        logger.debug("Adding fee notice finished");
    }
    
    private void addPart1Notice() {
        HorizontalLayout hz = new HorizontalLayout();
        hz.setWidth("100%");
        hz.setHeight("400px");
        //hz.addStyleName("lightSteelBlueBkgColor");
        //hz.addStyleName("roundedCorners");

        HorizontalLayout hzInner = new HorizontalLayout();

        Label label = new Label(CaptionResolver.getCaption("security.logon.part1"), Label.CONTENT_XHTML);
        hzInner.addComponent(label);
        hzInner.setComponentAlignment(label, Alignment.MIDDLE_CENTER);

        hz.addComponent(hzInner);
        hz.setComponentAlignment(hzInner, Alignment.MIDDLE_CENTER);

        mainComponent.addComponent(hz);
        mainComponent.setComponentAlignment(hz, Alignment.MIDDLE_CENTER);

        //logger.debug("Adding fee notice finished");
    }    

    @SuppressWarnings("unused")
	private void addInciGoLiveNote() {
    	logger.debug("Adding INCI Go live Notice start");
    	
        VerticalLayout verticalLayout = new VerticalLayout();
        verticalLayout.setWidth(layoutWidth);
        
        
        // first
        HorizontalLayout horizontalLayout1 = new HorizontalLayout();
        horizontalLayout1.addComponent(new Label(CaptionResolver.getCaption("security.logon.inciGoLive.part1"), Label.CONTENT_XHTML));
        horizontalLayout1.addComponent(new Label(CaptionResolver.getCaption("security.logon.inciGoLive.part2"), Label.CONTENT_XHTML));
        
        verticalLayout.addComponent(horizontalLayout1);
        verticalLayout.setComponentAlignment(horizontalLayout1, Alignment.MIDDLE_CENTER);
        
        // second        
        HorizontalLayout horizontalLayout2 = new HorizontalLayout();        
        horizontalLayout2.addComponent(new Label(CaptionResolver.getCaption("security.logon.inciGoLive.part3"), Label.CONTENT_XHTML));
        Button newUserLink = new Button();
        newUserLink.addStyleName("link");
        newUserLink.addStyleName("big-link");
        newUserLink.setCaption(CaptionResolver.getCaption("security.logon.inciGoLive.part4"));
        newUserLink.addListener(new Button.ClickListener() {
            @Override
            public void buttonClick(com.vaadin.ui.Button.ClickEvent event) {
                openLink(UrlResolver.getUrl("security.createNewUser"));
            }
        });
        horizontalLayout2.addComponent(newUserLink);        
        
        horizontalLayout2.addComponent(new Label(CaptionResolver.getCaption("security.logon.inciGoLive.part5"), Label.CONTENT_XHTML));
        horizontalLayout2.addComponent(new Label(CaptionResolver.getCaption("security.logon.inciGoLive.part6"), Label.CONTENT_XHTML));
        
        verticalLayout.addComponent(horizontalLayout2);
        verticalLayout.setComponentAlignment(horizontalLayout2, Alignment.MIDDLE_CENTER);        
        
        // third
        HorizontalLayout horizontalLayout3 = new HorizontalLayout();        
        horizontalLayout3.addComponent(new Label(CaptionResolver.getCaption("security.logon.inciGoLive.part7"), Label.CONTENT_XHTML));
        verticalLayout.addComponent(horizontalLayout3);
        verticalLayout.setComponentAlignment(horizontalLayout3, Alignment.MIDDLE_CENTER);        
        
        // fourth
        HorizontalLayout horizontalLayout4 = new HorizontalLayout();  
        horizontalLayout4.addComponent(new Label(CaptionResolver.getCaption("security.logon.inciGoLive.part8"), Label.CONTENT_XHTML));
        verticalLayout.addComponent(horizontalLayout4);
        verticalLayout.setComponentAlignment(horizontalLayout4, Alignment.MIDDLE_CENTER);        
        
        // fifth
        HorizontalLayout horizontalLayout5 = new HorizontalLayout();  
        horizontalLayout5.addComponent(new Label(CaptionResolver.getCaption("security.logon.inciGoLive.part9"), Label.CONTENT_XHTML));
        verticalLayout.addComponent(horizontalLayout5);
        verticalLayout.setComponentAlignment(horizontalLayout5, Alignment.MIDDLE_CENTER);

        
        mainComponent.addComponent(verticalLayout);
        mainComponent.setComponentAlignment(verticalLayout, Alignment.MIDDLE_CENTER);
        
    	logger.debug("Adding INCI Go live Notice end");
    }
    
    @SuppressWarnings("unused")
	private void addNewUserInfo() {
        logger.debug("Adding new user info");

        VerticalLayout verticalLayout = new VerticalLayout();
        verticalLayout.setWidth(layoutWidth);

        HorizontalLayout horizontalLayout1 = new HorizontalLayout();

        horizontalLayout1.addComponent(new Label(CaptionResolver.getCaption("security.logon.firstTimeUser.part5"),
                Label.CONTENT_XHTML));
        Button newUserLink = new Button();
        newUserLink.addStyleName("link");
        //newUserLink.addStyleName("big-link");
        newUserLink.setCaption(CaptionResolver.getCaption("security.logon.firstTimeUser.part2"));
        newUserLink.addListener(new Button.ClickListener() {
            @Override
            public void buttonClick(com.vaadin.ui.Button.ClickEvent event) {
                openLink(UrlResolver.getUrl("security.createNewUser"));
            }
        });
        horizontalLayout1.addComponent(newUserLink);
        horizontalLayout1.addComponent(new Label(CaptionResolver.getCaption("security.logon.firstTimeUser.part3"),
                Label.CONTENT_XHTML));
        verticalLayout.addComponent(horizontalLayout1);
        verticalLayout.setComponentAlignment(horizontalLayout1, Alignment.MIDDLE_CENTER);

        //HorizontalLayout horizontalLayout2 = new HorizontalLayout();
        //horizontalLayout2.addComponent(new Label(CaptionResolver.getCaption("security.logon.firstTimeUser.part4"),
        //        Label.CONTENT_XHTML));

        //verticalLayout.addComponent(horizontalLayout2);
        //verticalLayout.setComponentAlignment(horizontalLayout2, Alignment.MIDDLE_CENTER);

        mainComponent.addComponent(verticalLayout);
        mainComponent.setComponentAlignment(verticalLayout, Alignment.MIDDLE_CENTER);

        logger.debug("Adding new user info finished");
    }

    @SuppressWarnings("unused")
	private void addCookiesNotice() {
        logger.debug("Adding cookies notice");

        HorizontalLayout hz = new HorizontalLayout();
        hz.setWidth(layoutWidth);
        hz.setHeight("64px");
        hz.addStyleName("lightSteelBlueBkgColor");
        hz.addStyleName("roundedCorners");

        //HorizontalLayout hzInner = new HorizontalLayout();
        VerticalLayout hzInner = new VerticalLayout();

        Label label = new Label(CaptionResolver.getCaption("security.logon.browserSettingsInfo"), Label.CONTENT_XHTML);
        hzInner.addComponent(label);
        hzInner.setComponentAlignment(label, Alignment.MIDDLE_CENTER);

        hz.addComponent(hzInner);
        hz.setComponentAlignment(hzInner, Alignment.MIDDLE_CENTER);

        mainComponent.addComponent(hz);
        mainComponent.setComponentAlignment(hz, Alignment.MIDDLE_CENTER);

        logger.debug("Adding cookies notice");
    }

    
    @SuppressWarnings("unused")
	private void addLoginForm() {
    	HorizontalLayout formHorizontalLayout = new HorizontalLayout();
    	formHorizontalLayout.setWidth("210px");
    	formHorizontalLayout.setHeight("120px");
    	String usernameCaption = CaptionResolver.getCaption("security.logon.userIdLabel");
    	String passwordCaption = CaptionResolver.getCaption("security.logon.passwordLabel");
    	String submitCaption = CaptionResolver.getCaption("security.logon.logonBtnCaption");    	
    	
    	InciLoginForm loginForm = new InciLoginForm(usernameCaption, passwordCaption,submitCaption);    	
    	loginForm.setSizeFull();
    	formHorizontalLayout.addComponent(loginForm);
    	formHorizontalLayout.setComponentAlignment(loginForm, Alignment.MIDDLE_CENTER);	    
    	
        // Handle form submits
	    loginForm.addListener(new LoginListener() {
	        @Override
	        public void onLogin(LoginEvent event) {
	            String username = event.getLoginParameter("username");
	            String password = event.getLoginParameter("password");
	            
                SecurityInfo securityInfo = SecurityService.getSecurityInfoByCredentials(username.toUpperCase(), password);
		        
                if (securityInfo != null) {
                    mainWindow.logon(securityInfo);
                } else {
                    mainWindow.showSubWindow(SubWindowKey.SCR_LOGIN_FAILED);
                }
	        }
	    });
	    
        mainComponent.addComponent(formHorizontalLayout);
        mainComponent.setComponentAlignment(formHorizontalLayout, Alignment.MIDDLE_CENTER);	    
    }        

    /**
     * Username/password fields, Submit button.
     */
    private void addUsernamePasswordForm() {
        logger.debug("Adding username/password form");

        HorizontalLayout formHorizontalLayout = new HorizontalLayout();
        FormLayout formLayout = new FormLayout();
        formHorizontalLayout.addComponent(formLayout);
        formHorizontalLayout.setComponentAlignment(formLayout, Alignment.MIDDLE_CENTER);

        userIdField.focus();
        formLayout.addComponent(userIdField);
        formLayout.addComponent(passwordField);

        Button logonButton = ComponentUtil.createActionButton("security.logon.logonBtnCaption",
                new Button.ClickListener() {
                    @Override
                    public void buttonClick(ClickEvent event) {
                        String userId = (String) userIdField.getValue();
                        String userPassword = (String) passwordField.getValue();

                        // removing entered data
                        userIdField.setValue("");
                        passwordField.setValue("");
                        userIdField.focus();
                        
                        SecurityInfo securityInfo = SecurityService.getSecurityInfoByCredentials(userId.toUpperCase(),
                                userPassword);

                        if (securityInfo != null) {
                            mainWindow.logon(securityInfo);
                        } else {
                            mainWindow.showSubWindow(SubWindowKey.SCR_LOGIN_FAILED);
                        }
                    }
                });
        logonButton.setClickShortcut(KeyCode.ENTER);
        formLayout.addComponent(logonButton);

        mainComponent.addComponent(formHorizontalLayout);
        mainComponent.setComponentAlignment(formHorizontalLayout, Alignment.MIDDLE_CENTER);

        logger.debug("Adding username/password form finished");
    }

    private void addBottomInfo() {
        logger.debug("Adding bottom info");

        addForgottenPasswordInfo();
        //ComponentUtil.addHtml("<br>", mainComponent);
        //addMaintenanceInfo();

        logger.debug("Adding bottom info finished");
    }

    private void addForgottenPasswordInfo() {
        //logger.debug("Adding forgotten password info");

        VerticalLayout verticalLayout = new VerticalLayout();
        verticalLayout.setWidth("100%");

        HorizontalLayout horizontalLayout1 = new HorizontalLayout();

        horizontalLayout1.addComponent(new Label(CaptionResolver.getCaption("security.logon.forgotPassword.part3"), Label.CONTENT_XHTML));
        //Button remindPasswordLink = new Button();
        //remindPasswordLink.addStyleName("link");
        //remindPasswordLink.addStyleName("bold-link");
        //remindPasswordLink.setCaption(CaptionResolver.getCaption("security.logon.forgotPassword.part2"));
        //remindPasswordLink.addListener(new Button.ClickListener() {
        //    @Override
        //    public void buttonClick(com.vaadin.ui.Button.ClickEvent event) {
        //        openLink(UrlResolver.getUrl("security.forgotPassword"));
        //    }
        //});
        //horizontalLayout1.addComponent(remindPasswordLink);
        //horizontalLayout1.addComponent(new Label(
        //        "<div style=\"text-align:center; font-size: 14px; font-weight: bold;\">.</div>", Label.CONTENT_XHTML));
        verticalLayout.addComponent(horizontalLayout1);
        verticalLayout.setComponentAlignment(horizontalLayout1, Alignment.MIDDLE_CENTER);

        mainComponent.addComponent(verticalLayout);
        mainComponent.setComponentAlignment(verticalLayout, Alignment.MIDDLE_CENTER);

        //logger.debug("Adding forgotten password info finished");
    }

    @SuppressWarnings("unused")
	private void addMaintenanceInfo() {
        logger.debug("Adding maintenance info");

        HorizontalLayout hz = new HorizontalLayout();
        hz.setWidth(layoutWidth);
        hz.setHeight("102px");
        //hz.addStyleName("lightSteelBlueBkgColor");
        //hz.addStyleName("roundedCorners");

        HorizontalLayout hzInner = new HorizontalLayout();
        //Label label = new Label(CaptionResolver.getCaption("security.logon.maintenanceInfo"), Label.CONTENT_XHTML);
        Label label = new Label(CaptionResolver.getCaption("security.logon.part2"), Label.CONTENT_XHTML);
        hzInner.addComponent(label);
        hzInner.setComponentAlignment(label, Alignment.MIDDLE_LEFT);

        hz.addComponent(hzInner);
        hz.setComponentAlignment(hzInner, Alignment.MIDDLE_LEFT);

        mainComponent.addComponent(hz);
        mainComponent.setComponentAlignment(hz, Alignment.MIDDLE_CENTER);

        logger.debug("Adding maintenance info finished");
    }

    @Override
    public void applyNavigationParameters(Map<String, Object> navigationParameterMap) {
    	userIdField.focus();
    }    
    
    @Override
    public void generateContent() {
    	super.generateContent();
        userIdField.focus();
    }

    @Override
    public void handleNavigateOut() {
    	userIdField.focus();
    }
}
