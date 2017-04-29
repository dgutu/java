/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.admin.misc_text_maint.search;

import java.util.Map;
import java.util.Properties;

import com.proximo.inci.common.TemplarUtil;
//import com.proximo.inci.service.tradename.TradeNameService;
import com.proximo.inci.view.BaseView;
import com.proximo.inci.view.ViewKey;
import com.proximo.inci.window.main.MainWindow;
import com.proximo.inci.window.main.URIUtil;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;

public class MTMView  extends BaseView {
	
	// local variable
    private Button.ClickListener searchBtnListener;
    private Button.ClickListener cancelBtnListener;
    
    private MTMForm mtmForm;
    private MTMSearchResultLayout mtmSearchResultLayout;
    
	//public MTMView(MainWindow mainWindow, boolean addCaption,
	//		String captionKey) {
	//	super(mainWindow, addCaption, captionKey);
	//}
	
	public MTMView(MainWindow mainWindow) {
		super(mainWindow, true, "view.admin.misc_text_maint_report");
	}
	
    @Override
    protected void init() {
        super.init();
        
        searchBtnListener = createSearchBtnListener();
        cancelBtnListener = createCancelBtnListener();
        
        mtmForm = new MTMForm(this);
        mtmSearchResultLayout = new MTMSearchResultLayout(this);        
    }
    
    @Override
    protected void addContent() {
        super.addContent();
        
        addComponent(mtmForm);
        addSpace();
        addComponent(mtmSearchResultLayout);
    }
    
    private Button.ClickListener createCancelBtnListener() {
        return new Button.ClickListener() {
            /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
            public void buttonClick(ClickEvent event) {
                navigateTo(ViewKey.ADMIN_FUNCTIONS.toString());
            }
        };
    }

    private Button.ClickListener createSearchBtnListener() {
        return new Button.ClickListener() {
            /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
            public void buttonClick(ClickEvent event) {
				mtmSearchResultLayout.search(mtmForm.getTextValue(), true);
            }
        };
    }
    
    public Button.ClickListener getCancelBtnListener() {
        return cancelBtnListener;
    }

    public Button.ClickListener getSearchBtnListener() {
        return searchBtnListener;
    }    
    
    @Override
    public void handleNavigateOut() {  
		if (!getCurrentView().contains("search")) {    	
	        // clear the form when navigate out
	        mtmForm.clearForm();
	        mtmSearchResultLayout.clearSearchResults();
		}         
    }
    
    @Override
    public void applyNavigationParameters(Map<String, Object> navigationParameterMap) {
		String fragment = getCurrentView();
		
		if (fragment.contains("search")) {
			
			// parameters
			Properties prop = new Properties();
			prop = URIUtil.fillSearchParamByURIString(fragment);
			
			if (!TemplarUtil.isStringNullOrEmpty(prop.getProperty("txt")))
				mtmForm.setTextValue(prop.getProperty("txt"));			
			
			// log the the DB
			//TradeNameService.log("MTMView.applyNavigationParameters current View:" + getCurrentView());
			//TradeNameService.log("MTMView.applyNavigationParameters previous View:" + getPreviousView());
			
			// search for applications and don't set the URI
			mtmSearchResultLayout.search(mtmForm.getTextValue(), false);
		}    	
    }
    
    // refresh table result after search
    public void refreshSearchResult() {
    	mtmSearchResultLayout.search(mtmForm.getTextValue(), false);
    	mtmSearchResultLayout.generateContent();
    }
}
