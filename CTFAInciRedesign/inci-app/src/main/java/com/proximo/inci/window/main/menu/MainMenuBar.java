/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.window.main.menu;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.service.security.user.User;
import com.proximo.inci.url.UrlResolver;
import com.proximo.inci.view.ViewKey;
import com.proximo.inci.view.security.user.detail.UserDetailView;
import com.proximo.inci.window.SubWindowKey;
import com.proximo.inci.window.main.MainWindow;
import com.vaadin.terminal.ExternalResource;
import com.vaadin.terminal.ThemeResource;
import com.vaadin.ui.MenuBar;
import com.vaadin.ui.Window;

/**
 * Main menu bar.
 */
@SuppressWarnings("serial")
public class MainMenuBar extends MenuBar {
    
    private static Logger logger = LoggerFactory.getLogger(MainMenuBar.class);
    
	/** Reference to the main window. */
	private MainWindow mainWindow;

	public MainMenuBar(MainWindow mainWindow) {
		super();
		this.mainWindow = mainWindow;
	}
	
    public void showBaseMenu() {
        logger.info("Initializing base menu started");
        
        removeItems();
        
        addMenuItem("menubar.process", new Command() {
            @Override
            public void menuSelected(MenuItem selectedItem) {
                mainWindow.showSubWindow(SubWindowKey.HOME_PROCESS);
            }
        });
        
        addMenuItem("menubar.instructions", new Command() {
            @Override
            public void menuSelected(MenuItem selectedItem) {
                mainWindow.showSubWindow(SubWindowKey.HOME_INSTRUCTIONS);
            }
        });        
        
        addMenuItem("menubar.PCPC.home", new Command() {
            @Override
            public void menuSelected(MenuItem selectedItem) {
                mainWindow.open(new ExternalResource(UrlResolver.getUrl("common.personalCareCouncil")), "_blank");
            }
        });
        
        addMenuItem("menubar.contact", new Command() {
            @Override
            public void menuSelected(MenuItem selectedItem) {
                //mainWindow.showSubWindow(SubWindowKey.HOME_CONTACT);
            	mainWindow.open(new ExternalResource("mailto:inci@personalcarecouncil.org"));
            }
        });                
        
        logger.info("Initializing base menu finished");
    }
    
    public void showUserMenu() {
        if (mainWindow.getCurrentSecurityInfo().getUser().isAdmin()) {
            showAdminUserMenu();
        } else {
            showRegularUserMenu();
        }
    }    

	/** Regular user menu initialization. */
	private void showRegularUserMenu() {
	    logger.info("Initializing regular user menu started");
	    
		removeItems();
		
		addNavigationMenuItem("menubar.tradeNameApplication", ViewKey.TN_SEARCH);
		
		/*
		 * Remove the Archive tab for regular users.  
		 * They will no longer have access to the archive area.
		 */
			
		//addNavigationMenuItem("menubar.archive", ViewKey.TN_ARCHIVE);
		
		addMenuItem("menubar.myProfile", new Command() {
            @Override
            public void menuSelected(MenuItem selectedItem) {
            	User user = mainWindow.getCurrentSecurityInfo().getUser();            	
            	
                Map<String, Object> navigationParameterMap = new HashMap<String, Object>();
                navigationParameterMap.put(UserDetailView.USER_REC_ID_NAVIG_PARAM_KEY, user.getUserRecId());
                navigationParameterMap.put(UserDetailView.PARENT_VIEW_NAVIG, "HOME_PROCESS");
                mainWindow.navigateTo(ViewKey.SCR_USER_DETAIL.toString(), navigationParameterMap, mainWindow.getCurrentView());
            }
        });
		
        addNavigationMenuItem("menubar.instructions", ViewKey.HOME_INSTRUCTIONS);
        addMenuItem("menubar.process", new Command() {
            @Override
            public void menuSelected(MenuItem selectedItem) {
                navigateTo(ViewKey.HOME_PROCESS);
            }
        });

        addMenuItem("menubar.PCPC", new Command() {
            @Override
            public void menuSelected(MenuItem selectedItem) {
                mainWindow.open(new ExternalResource(UrlResolver.getUrl("common.personalCareCouncil")), "_blank");
            }
        });
        
        addMenuItem("menubar.contact", new Command() {
            @Override
            public void menuSelected(MenuItem selectedItem) {
            	mainWindow.open(new ExternalResource("mailto:inci@personalcarecouncil.org"));
            }
        });        
        
        //addNavigationMenuItem("menubar.contact", ViewKey.HOME_CONTACT);
        
        /*addMenuItem("menubar.help", new Command() {
            @Override
            public void menuSelected(MenuItem selectedItem) {
                mainWindow.open(new ThemeResource("help.html"), "_blank", 800, 600, Window.BORDER_DEFAULT);
            }
        });*/
        

        addMenuItem("menubar.logout", new Command() {
            @Override
            public void menuSelected(MenuItem selectedItem) {
                mainWindow.logout();
            }
        });
		
		logger.info("Initializing regular user menu finished");
	}

    /** Admin user menu initialization. */
    private void showAdminUserMenu() {
        logger.info("Initializing admin user menu started");
        
        removeItems();
        
        addNavigationMenuItem("menubar.tradeNameApplication", ViewKey.TN_SEARCH);
        addNavigationMenuItem("menubar.archive", ViewKey.TN_ARCHIVE);
        addNavigationMenuItem("menubar.userSearch", ViewKey.SCR_USER_SEARCH);
        addNavigationMenuItem("menubar.admin", ViewKey.ADMIN_FUNCTIONS);
        addNavigationMenuItem("menubar.instructions", ViewKey.HOME_INSTRUCTIONS);
        addMenuItem("menubar.process", new Command() {
            @Override
            public void menuSelected(MenuItem selectedItem) {
                navigateTo(ViewKey.HOME_PROCESS);
            }
        });

        addMenuItem("menubar.PCPC", new Command() {
            @Override
            public void menuSelected(MenuItem selectedItem) {
                mainWindow.open(new ExternalResource(UrlResolver.getUrl("common.personalCareCouncil")), "_blank");
            }
        });
        
        //addNavigationMenuItem("menubar.contact", ViewKey.HOME_CONTACT);
        
        addMenuItem("menubar.contact", new Command() {
            @Override
            public void menuSelected(MenuItem selectedItem) {
            	mainWindow.open(new ExternalResource("mailto:inci@personalcarecouncil.org"));
            }
        });         
        
        /*addMenuItem("menubar.help", new Command() {
            @Override
            public void menuSelected(MenuItem selectedItem) {
                mainWindow.open(new ThemeResource("help.html"), "_blank", 800, 600, Window.BORDER_DEFAULT);
            }
        });*/
        

        addMenuItem("menubar.logout", new Command() {
            @Override
            public void menuSelected(MenuItem selectedItem) {
                mainWindow.logout();
            }
        });

        
        logger.info("Initializing admin user menu finished");
    }	
	
	/**
	 * Adds a menu item to the menu bar. When this menu item is clicked on, the
	 * navigation to the view, which key is given by <code>viewKey</code> will
	 * take place.
	 * 
	 * @param captionKey
	 *            menu item caption resource key.
	 * @param viewKey
	 *            linked navigation: view key.
	 */
	private void addNavigationMenuItem(String captionKey, final ViewKey viewKey) {
		addItem(CaptionResolver.getCaption(captionKey), new Command() {
			@Override
			public void menuSelected(MenuItem selectedItem) {
				navigateTo(viewKey);
			}
		});
	}

	/**
	 * Adds a menu item to the menu bar.
	 * 
	 * @param captionKey
	 *            menu item caption resource key.
	 */
	private void addMenuItem(String captionKey, Command command) {
		addItem(CaptionResolver.getCaption(captionKey), command);
	}

    private void navigateTo(ViewKey key) {
        mainWindow.navigateTo(key.toString());
    }

}
