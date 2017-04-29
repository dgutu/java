/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.window.main;

//import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.apache.catalina.util.URLEncoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//import com.proximo.inci.exception.InciException;
import com.proximo.inci.service.security.SecurityInfo;
//import com.proximo.inci.service.tradename.TradeNameService;
import com.proximo.inci.view.AbstractView;
import com.proximo.inci.view.ViewKey;
import com.proximo.inci.view.tradename.detail.TradeNameDetailView;
import com.proximo.inci.window.SubWindowKey;
import com.proximo.inci.window.subwindow.InformationMessageWindow;
import com.proximo.inci.window.subwindow.SubWindow;
import com.vaadin.ui.AbstractOrderedLayout;
import com.vaadin.ui.UriFragmentUtility;
import com.vaadin.ui.Window;
import com.vaadin.ui.UriFragmentUtility.FragmentChangedEvent;
import com.vaadin.ui.UriFragmentUtility.FragmentChangedListener;

@SuppressWarnings("serial")
public abstract class AbstractMainWindow extends Window {

    private static Logger logger = LoggerFactory.getLogger(AbstractMainWindow.class);

    protected Map<String, Object> applicationProperties;

    protected String themePagesUrl;

    protected Map<ViewKey, Class<? extends AbstractView>> viewKeyToClassMap;
    protected Map<ViewKey, AbstractView> viewsMap;
    protected ViewKey currentViewKey;

    protected Map<SubWindowKey, Class<? extends SubWindow>> windowKeyToClassMap;
    protected Map<SubWindowKey, SubWindow> subWindowsMap;

    /** Current security information. */
    protected SecurityInfo securityInfo;
    
    // UriFragmentUtility browser history
    protected UriFragmentUtility urifu = null;    
    protected String currentView = "SCR_LOGON";
    protected String previousView = "SCR_LOGON";
    
    private HttpServletResponse response;
    private HttpServletRequest request;    

    public AbstractMainWindow(String caption, String themePagesUrl, Map<String, Object> applicationProperties,
            ViewKey currentViewKey, HttpServletResponse response, HttpServletRequest request) {
        super(caption);

        this.applicationProperties = applicationProperties;
        this.themePagesUrl = themePagesUrl;
        this.currentViewKey = currentViewKey;
        
        this.response = response;
        this.request = request;

        init();
        showView(initView(this.currentViewKey));
    }

	protected abstract void init();

    public abstract AbstractOrderedLayout getMainLayout();

    protected abstract void showView(AbstractView view);

    public AbstractView getView(ViewKey viewKey) {
        AbstractView view = viewsMap.get(viewKey);
        if (view == null) {
            view = initView(viewKey);
        }

        return view;
    }

    protected AbstractView initView(ViewKey viewKey) {
        try {
            AbstractView view = (AbstractView) viewKeyToClassMap.get(viewKey).getConstructors()[0].newInstance(this);
            view.applySecurityInfo(securityInfo);
            viewsMap.put(viewKey, view);            
            
            return view;
        } catch (Exception e) {
            String viewKeyStr = "null";
            if (viewKey != null) {
                viewKeyStr = viewKey.toString();
            }
            logger.error("Unable to initialize the view with key=" + viewKeyStr, e);
            throw new RuntimeException(e);
        }
    }
    
    //public void navigateTo(ViewKey viewKey) {
    public void navigateTo(String destinationURL) {
         navigateTo(destinationURL, null, null);
    }
    
    //public void navigateTo(ViewKey viewKey, Map<String, Object> navigationParameterMap) {
    public void navigateTo(String destinationURL, Map<String, Object> navigationParameterMap) {
        //navigateTo(viewKey, navigationParameterMap, null);
    	navigateTo(destinationURL, navigationParameterMap, null);
    }
    
    //public void navigateTo(ViewKey viewKey, ViewKey backViewKey) {
    public void navigateTo(String destinationURL, String backURL) {
        //navigateTo(viewKey, null, backViewKey);
    	navigateTo(destinationURL, null, backURL);
    }

    /**
     * Navigation to the view with a key given by <code>viewKey</code> with a
     * possibility to "go-back" according to the given <code>backViewKey</code>.
     * 
     * @param navigationParameterMap
     *            used to pass some information from view to view when
     *            navigation takes place.
     */
    //public void navigateTo(ViewKey viewKey, Map<String, Object> navigationParameterMap, ViewKey backViewKey) {
    public void navigateTo(String destinationURL, Map<String, Object> navigationParameterMap, String backURL) {
        logger.debug("Navigating to ({})", destinationURL);
        
        ViewKey viewKey = null;
        
        // replace URL encoded 
        destinationURL = destinationURL.replaceAll("%7C", "|");
        
    	if (destinationURL.indexOf("|") > 0)
    		viewKey = ViewKey.valueOf((destinationURL.substring(0, destinationURL.indexOf("|"))));
    	else
    		viewKey = ViewKey.valueOf(destinationURL);
        
        
        if (isViewKeyValid(viewKey)) {
        	
            /*
             *  browser history
             *  pass new ViewKey
             *  
             *  previousView = currentView;
             *  currentView = newFragment; - here is viewKey
             *  
             */
            setFragment(destinationURL);
        	
        	// get current View
            AbstractView currentView = viewsMap.get(currentViewKey);
            logger.debug("Handling navigate out for view (key={})", viewKey);
            // handle handleNavigateOut method for current View
            currentView.handleNavigateOut();
            logger.debug("Handling navigate out for view (key={}) finished", viewKey);
            
            // now current view is navigateTo View
            currentViewKey = viewKey;

            AbstractView view = viewsMap.get(viewKey);
            if (view == null) {
                view = initView(viewKey);
            }
            
            //view.setBackViewKey(backViewKey);
            view.setBackURL(backURL);

            logger.debug("Applying navigation parameters: {} for view (key={})", viewKey);
            // apply parameters for new View
            view.applyNavigationParameters(navigationParameterMap);
            logger.debug("Applying navigation parameters for view (key={}) finished", viewKey);

            logger.debug("Showing view (key={})", viewKey);
            showView(view);
            logger.debug("Showing view (key={}) finished", viewKey);
        }
        
        logger.debug("Navigation to ({}) finished", destinationURL);
    }
    
    public void navigateToURI(ViewKey viewKey, Map<String, Object> navigationParameterMap, ViewKey backViewKey) {
        logger.debug("navigateToURI.Navigating to view (key={})", viewKey);

        if (isViewKeyValid(viewKey)) {
        	
            /*
             *  browser history
             *  pass new ViewKey
             *  
             *  previousView = currentView;
             *  currentView = newFragment; - here is viewKey
             *  
             */
            //setFragment(fragmentURI);
        	
        	// get current View
            AbstractView currentView = viewsMap.get(currentViewKey);
            //logger.debug("Handling navigate out for view (key={})", viewKey);
            // handle handleNavigateOut method for current View
            currentView.handleNavigateOut();
            //logger.debug("Handling navigate out for view (key={}) finished", viewKey);
            
            // now current view is navigateTo View
            currentViewKey = viewKey;

            AbstractView view = viewsMap.get(viewKey);
            if (view == null) {
                view = initView(viewKey);
            }
            
            //view.setBackViewKey(backViewKey);

            //logger.debug("Applying navigation parameters: {} for view (key={})", viewKey);
            // apply parameters for new View
            view.applyNavigationParameters(navigationParameterMap);
            //logger.debug("Applying navigation parameters for view (key={}) finished", viewKey);

            //logger.debug("Showing view (key={})", viewKey);
            showView(view);
            //logger.debug("Showing view (key={}) finished", viewKey);
        }
        
        logger.debug("navigateToURI.Navigation to view (key={}) finished", viewKey);
    }    

    public Map<String, Object> getApplicationProperties() {
        return applicationProperties;
    }

    public String getThemePageUrl() {
        return themePagesUrl;
    }

    private boolean isViewKeyValid(ViewKey viewKey) {
        if (viewKey == null) {
            return false;
        }

        return true;
    }

    public void showSubWindow(SubWindowKey windowKey) {
        showSubWindow(windowKey, null);
    }
    
    public void showSubWindow(SubWindowKey windowKey, Map<String, Object> parameters) {
        logger.debug("Showing sub window (windowKey={})", windowKey);
        
        SubWindow subWindow = subWindowsMap.get(windowKey);

        if (subWindow == null) {
            subWindow = initSubWindow(windowKey);
        }

        if (subWindow.getParent() == null) {
            addWindow(subWindow);
        }

        subWindow.show(parameters);
        
        logger.debug("Showing sub window (windowKey={}) finished", windowKey);
    }
    
    public void showInfoMsgWindow(String message) {
        Map<String, Object> infoMsgWindowParams = new HashMap<String, Object>();
        infoMsgWindowParams.put(InformationMessageWindow.INFO_MSG_PARAM_KEY, message);
        showSubWindow(SubWindowKey.CMN_INFO_MSG, infoMsgWindowParams);
    }
    
    public void showInfoMsgWindowWithCaptionAndButtonText(String message, boolean changeDefaultStyle, String caption, String okButton, TradeNameDetailView parentView) {
        Map<String, Object> infoMsgWindowParams = new HashMap<String, Object>();
        infoMsgWindowParams.put(InformationMessageWindow.INFO_MSG_PARAM_KEY, message);
       	infoMsgWindowParams.put(InformationMessageWindow.CHANGE_DEFAULT_STYLE, (changeDefaultStyle == true ? "Y" : "N"));
       	infoMsgWindowParams.put(InformationMessageWindow.CAPTION_KEY_NEW_VALUE, caption);
       	infoMsgWindowParams.put(InformationMessageWindow.OK_BUTTON_VALUE, okButton);
       	infoMsgWindowParams.put(InformationMessageWindow.PARENT_VIEW, parentView);
        showSubWindow(SubWindowKey.CMN_INFO_MSG, infoMsgWindowParams);
    }    
    
    protected SubWindow initSubWindow(SubWindowKey windowKey) {
        try {
            SubWindow subWindow = (SubWindow) windowKeyToClassMap.get(windowKey).getConstructors()[0].newInstance(this);
            subWindowsMap.put(windowKey, subWindow);
            return subWindow;
        } catch (Exception e) {
            String windowKeyStr = "null";
            if (windowKey != null) {
                windowKeyStr = windowKey.toString();
            }
            logger.error("Unable to initialize the view with key=" + windowKeyStr, e);
            throw new RuntimeException(e);
        }
    }

    public void logon(SecurityInfo securityInfo) {
        this.securityInfo = securityInfo;
    }
    
    public boolean isLoggedOn() {
        return securityInfo != null;
    }

    public SecurityInfo getCurrentSecurityInfo() {
        return securityInfo;
    }

	public UriFragmentUtility getUrifu() {
		return this.urifu;
	}
	
	public String getCurrentView() {
		return this.currentView;
	}
	
	public String getPreviousView() {
		return this.previousView;
	}
	
	
	public ViewKey getCurrentViewKey() {
		return this.currentViewKey;
	}
	
	public void initUriFu() {
        // UriFragmentUtility
        urifu = new UriFragmentUtility();        
        this.addComponent(urifu);
		urifu.addListener(new FragmentChangedListener() {
		public void fragmentChanged(FragmentChangedEvent source) {
			
			//logger.debug("source.getUriFragmentUtility().getFragment()="+source.getUriFragmentUtility().getFragment());
			//logger.debug("currentView="+currentView);
			
            String fragment = source.getUriFragmentUtility().getFragment();
            if (fragment == null || fragment.equals(""))  fragment = "SCR_LOGON";
            if (!currentView.toUpperCase().contains("SCR_LOGON") && !fragment.equals(currentView)) {
            	
            	//TradeNameService.log("initUriFu.currentView="+currentView);
            	//TradeNameService.log("initUriFu.fragment="+fragment);
            	
            	//previousView = currentView; 
            	currentView = fragment;
            	
            	/*
            	 * parse fragment 
            	 * #TN_SEARCH|search|~appno=aa~tradename=bb~exportst=A~company=comp~
            	 */
            	
            	String view = fragment;
            	
            	try {            		
            		view = view.replaceAll("%7C", "|");
            		
	            	if (view.indexOf("|") > 0)
	            		view = view.substring(0, view.indexOf("|"));
	            	
	            	// navigate to history VIEW
	            	//navigateTo(ViewKey.valueOf(fragment));
            	
            		navigateToURI(ViewKey.valueOf(view), null, null);
            	}
            	catch (Exception ex) {
            		logger.error("navigateToURI="+ex.getMessage());
            	}
            }            	
		}
		});
	}
	
	public void setFragment(String newFragment) {
		previousView = currentView;
        currentView = newFragment;
        urifu.setFragment(currentView,false);
        
        //logger.debug("######### setFragment.previousView="+previousView);
        //logger.debug("######### setFragment.currentView="+currentView);
        
        //try {
	        //TradeNameService.log("setFragment.previousView="+previousView);
			//TradeNameService.log("setFragment.currentView="+currentView);
        //} 
        //catch (Exception ex){
        //}
	}

    public HttpServletResponse getResponse() {
    	return response;
    }
    
    public HttpServletRequest getRequest() {
    	return request;
    }

}
