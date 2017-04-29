/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.window.main.layout;

import java.util.Calendar;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.url.UrlResolver;
//import com.proximo.inci.view.ViewKey;
import com.proximo.inci.window.SubWindowKey;
import com.proximo.inci.window.main.MainWindow;
import com.proximo.inci.window.main.menu.MainMenuBar;
import com.vaadin.terminal.ExternalResource;
import com.vaadin.terminal.ThemeResource;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Embedded;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Link;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;

/**
 * The Layout intended for the use in the main window as the main layout.
 */
// TODO refactor this class into component
@SuppressWarnings("serial")
public class MainLayout extends VerticalLayout {
	
	private static Logger logger = LoggerFactory.getLogger(MainLayout.class);

	private VerticalLayout contentLayout;

	private VerticalLayout topLayout;
	
	private Label loginInfoLabel;
	
	private Label loginDateLabel;
	
	private MainWindow mainWindow;

	// need reference to the mainMenuBar for security roles management
	/**
	 * Main menu bar.
	 */
	private MainMenuBar mainMenuBar;

	private VerticalLayout bottomLayout;

	public MainLayout(MainWindow mainWindow) {
		init(mainWindow);
	}

	public void showUserMenu() {
		mainMenuBar.showUserMenu();
	}
	
    public void showBaseMenu() {
        mainMenuBar.showBaseMenu();
    }	

	/**
	 * Main layout initialization.
	 * 
	 * @param mainWindow
	 *            reference to the main window which is needed for navigation
	 *            handling.
	 */
	private void init(MainWindow mainWindow) {
	    logger.info("Initializing main layout started");
	    
	    this.mainWindow = mainWindow; 
	    
		initTopLayout(mainWindow);
		initContentLayout();
		initBottomLayout();

		addComponent(topLayout);
		addComponent(contentLayout);
		addComponent(bottomLayout);
		
		logger.info("Initializing main layout finished");
	}

	/**
	 * Top layout initialization.
	 */
	private void initTopLayout(MainWindow mainWindow) {
	    logger.info("Initializing main layout:TOP started");
	    
		topLayout = new VerticalLayout();
          		
		// topPicSubLayout1: 1st line of top picture
        topLayout.addComponent(createTopPicSubLayout1());
        // topPicSubLayout2: 2nd line of top picture
        topLayout.addComponent(createTopPicSubLayout2());
        // topPicSubLayout3: 3rd line of top picture
        topLayout.addComponent(createTopPicSubLayout3());
        
        mainMenuBar = new MainMenuBar(mainWindow);
        mainMenuBar.showBaseMenu();
        // mainMenuBar wrapping layout
        topLayout.addComponent(createMainMenuBarWrappingLayout());
        
        logger.info("Initializing main layout:TOP finished");
	}
	
	private VerticalLayout createMainMenuBarWrappingLayout(){
        VerticalLayout mainMenuBarWrappingLayout = new VerticalLayout();
        
        mainMenuBarWrappingLayout.addComponent(mainMenuBar);
        mainMenuBarWrappingLayout.setComponentAlignment(mainMenuBar, Alignment.MIDDLE_CENTER);
        mainMenuBarWrappingLayout.addStyleName("main-menu-bkg");
        
        return mainMenuBarWrappingLayout;
	}
	
	private HorizontalLayout createTopPicSubLayout1(){
        HorizontalLayout topPicSubLayout1 = new HorizontalLayout();
        
        topPicSubLayout1.setSizeFull();
        topPicSubLayout1.addStyleName("top-bkg-1");
        
        // topPicSubLayout11: top line pictures with small brand info label
        HorizontalLayout topPicSubLayout11 = new HorizontalLayout();        
        Embedded pic1 = new Embedded(null, new ThemeResource("images/collage_top.jpg"));
        topPicSubLayout11.addComponent(pic1);
        Embedded pic2 = new Embedded(null, new ThemeResource("images/utilityblank.jpg"));
        topPicSubLayout11.addComponent(pic2);
        Label smallBrandInfo = new Label(CaptionResolver.getCaption("template.top.brand"));
        smallBrandInfo.addStyleName("small-brand-info");
        topPicSubLayout11.addComponent(smallBrandInfo);     
        topPicSubLayout1.addComponent(topPicSubLayout11);
        topPicSubLayout1.setComponentAlignment(topPicSubLayout11, Alignment.TOP_LEFT);

        // topPicSubLayout12: application version label
        HorizontalLayout topPicSubLayout12 = new HorizontalLayout();
        Label smallVersionInfo = new Label(CaptionResolver.getCaption("version") + " "
                + mainWindow.getApplicationProperties().get("applicationVersion") + "&nbsp;&nbsp;", Label.CONTENT_XHTML);
        smallVersionInfo.addStyleName("small-brand-info");
        topPicSubLayout12.addComponent(smallVersionInfo);
        topPicSubLayout1.addComponent(topPicSubLayout12);
        topPicSubLayout1.setComponentAlignment(topPicSubLayout12, Alignment.TOP_RIGHT);
        
        return topPicSubLayout1;
	}
	
    private HorizontalLayout createTopPicSubLayout2(){
        HorizontalLayout topPicSubLayout2 = new HorizontalLayout();
        
        Link externalLink = new Link(null, new ExternalResource(UrlResolver.getUrl("common.personalCareCouncil")));
        externalLink.setIcon(new ThemeResource("images/ctfa_logo.jpg"));
        externalLink.setTargetName("_blank");
        topPicSubLayout2.addComponent(externalLink);
        
        Embedded pic2 = new Embedded(null, new ThemeResource("images/collage.jpg"));
        topPicSubLayout2.addComponent(pic2);
        
        return topPicSubLayout2;
    }
    
    private HorizontalLayout createTopPicSubLayout3(){
        HorizontalLayout topPicSubLayout3 = new HorizontalLayout();
        
        topPicSubLayout3.setSizeFull();
        topPicSubLayout3.addStyleName("top-bkg-3");
        
        // topPicSubLayout31: top line pictures with small login info label
        HorizontalLayout topPicSubLayout31 = new HorizontalLayout();        
        Embedded pic = new Embedded(null, new ThemeResource("images/collage_bottom.jpg"));
        topPicSubLayout31.addComponent(pic);
        loginInfoLabel = new Label();
        loginInfoLabel.setValue(CaptionResolver.getCaption("template.top.notloggedin"));
        loginInfoLabel.addStyleName("login-info");
        topPicSubLayout31.addComponent(loginInfoLabel);
        topPicSubLayout31.setComponentAlignment(loginInfoLabel, Alignment.MIDDLE_LEFT);
        topPicSubLayout3.addComponent(topPicSubLayout31);
        topPicSubLayout3.setComponentAlignment(topPicSubLayout31, Alignment.MIDDLE_LEFT);  
        
        // topPicSubLayout312: top line small login date label
        HorizontalLayout topPicSubLayout312 = new HorizontalLayout();    
        loginDateLabel = new Label();
        loginDateLabel.addStyleName("login-info");
        topPicSubLayout312.addComponent(loginDateLabel);
        topPicSubLayout312.setComponentAlignment(loginDateLabel, Alignment.MIDDLE_RIGHT);
        topPicSubLayout3.addComponent(topPicSubLayout312);
        topPicSubLayout3.setComponentAlignment(topPicSubLayout312, Alignment.MIDDLE_LEFT);

        // topPicSubLayout32: copyright information label
        HorizontalLayout topPicSubLayout32 = new HorizontalLayout();
                
        Link copyrightInfoLink = new Link();
        copyrightInfoLink.addStyleName("copyright-info");
        copyrightInfoLink.setCaption(CaptionResolver.getCaption("template.top.copyrightinfo"));
        ThemeResource copyrightNoticesResource = new ThemeResource("copyrightnotices.html");
        copyrightInfoLink.setResource(copyrightNoticesResource);
        copyrightInfoLink.setTargetName("_blank");
        copyrightInfoLink.setTargetWidth(500);
        copyrightInfoLink.setTargetHeight(250);
        copyrightInfoLink.setTargetBorder(Link.TARGET_BORDER_NONE);
        topPicSubLayout32.addComponent(copyrightInfoLink);
        topPicSubLayout32.setComponentAlignment(copyrightInfoLink, Alignment.MIDDLE_RIGHT);
        
        Label whitespace = new Label("&nbsp;&nbsp;", Label.CONTENT_XHTML);
        topPicSubLayout32.addComponent(whitespace);
        topPicSubLayout32.setComponentAlignment(whitespace, Alignment.MIDDLE_RIGHT);
        
        topPicSubLayout3.addComponent(topPicSubLayout32);
        topPicSubLayout3.setComponentAlignment(topPicSubLayout32, Alignment.MIDDLE_RIGHT);
        
        return topPicSubLayout3;
    }    

	/**
	 * Content layout is customized in each view.
	 */
	private void initContentLayout() {
		contentLayout = new VerticalLayout();
		contentLayout.setMargin(true);
	}

	private void initBottomLayout() {
	    logger.info("Initializing main layout:BOTTOM started");
	    
		bottomLayout = new VerticalLayout();
		
		HorizontalLayout hWrapperLayout = new HorizontalLayout();
		hWrapperLayout.setSizeFull();
		hWrapperLayout.addStyleName("bottom-bkg-2");
		
		HorizontalLayout bottomPicLayout = new HorizontalLayout();
		
		HorizontalLayout hz1 = new HorizontalLayout(); 
		hz1.addStyleName("bottom-bkg-1");
		hz1.setWidth("200px");
		Embedded pic1 = new Embedded(null, new ThemeResource("images/body_bg_r3_c1.jpg"));
		hz1.addComponent(pic1);
		bottomPicLayout.addComponent(hz1);
		
        HorizontalLayout hz2 = new HorizontalLayout(); 
        Embedded pic2 = new Embedded(null, new ThemeResource("images/body_r3_c3.jpg"));
        hz2.addComponent(pic2);
		bottomPicLayout.addComponent(hz2);

	    hWrapperLayout.addComponent(bottomPicLayout);
		
		bottomLayout.addComponent(hWrapperLayout);
		
		VerticalLayout vInfoLayout = new VerticalLayout();
		
		vInfoLayout.setMargin(true);
		
		Calendar now = Calendar.getInstance();  
		int year = now.get(Calendar.YEAR); 
		
		Label infoLabel1 = new Label("Copyright &copy; " + year + " The Personal Care Products Council", Label.CONTENT_XHTML); 
		infoLabel1.addStyleName("bottom-info");
		vInfoLayout.addComponent(infoLabel1);
		
        Label infoLabel2 = new Label("1620 L Street, NW, Suite 1200, Washington, D.C. 20036 USA", Label.CONTENT_XHTML);
        infoLabel2.addStyleName("bottom-info");
        vInfoLayout.addComponent(infoLabel2);
        
        Label infoLabel3 = new Label("telephone: (202) 331-1770 &nbsp; fax: (202) 331-1969", Label.CONTENT_XHTML);
        infoLabel3.addStyleName("bottom-info");
        vInfoLayout.addComponent(infoLabel3);
        
        /*Link policyLink = new Link();
        policyLink.addStyleName("bottom-info");
        policyLink.setCaption(CaptionResolver.getCaption("template.bottom.privacypolicy"));        
        ThemeResource privacyPolicyResource = new ThemeResource("privacypolicy.html");
        policyLink.setResource(privacyPolicyResource);
        policyLink.setTargetName("_blank");                
        vInfoLayout.addComponent(policyLink);*/        
        
        Button policyLink = new Button(CaptionResolver.getCaption("template.bottom.privacypolicy"));
        policyLink.setStyleName("link");
        policyLink.addStyleName("bottom-link");
        policyLink.addListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {				
				mainWindow.showSubWindow(SubWindowKey.PRIVACY_POLICY);
			}
		});
        

        vInfoLayout.addComponent(policyLink);
        
        Link externalLink = new Link(CaptionResolver.getCaption("template.bottom.personalCareCouncilLink"),
                new ExternalResource(UrlResolver.getUrl("common.personalCareCouncil")));
        externalLink.addStyleName("bottom-info");
        externalLink.setTargetName("_blank");
        vInfoLayout.addComponent(externalLink);
		
		bottomLayout.addComponent(vInfoLayout);
		
		logger.info("Initializing main layout:BOTTOM finished");
	}
	
	public void setLoginInfo(String userFullName){
        StringBuffer loginInfo = new StringBuffer(CaptionResolver.getCaption("template.top.welcome"));
        if (userFullName != null) {
            loginInfo.append(" " + userFullName);
        }
        
	    loginInfoLabel.setValue(loginInfo.toString());
	}
	
    public void resetLoginInfo(){
        loginInfoLabel.setValue(CaptionResolver.getCaption("template.top.notloggedin"));
    }
    
    public void setLoginDate(Date loginDate) {
        // TODO (LOW): setup date format
        String loginDateStr = CaptionResolver.getCaption("template.top.loginAt") + " " + (loginDate.toString());

        loginDateLabel.setValue(loginDateStr);
    }
    
    public void resetLoginDate(){
        loginDateLabel.setValue("");
    }    
    
    public VerticalLayout getTopLayout(){
        return topLayout;
    }

	public VerticalLayout getContentLayout() {
		return contentLayout;
	}

}
