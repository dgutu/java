/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.admin.application_move;

import java.util.Map;
import java.util.Properties;

import com.proximo.inci.common.TemplarUtil;
//import com.proximo.inci.service.tradename.TradeNameService;
import com.proximo.inci.view.BaseView;
import com.proximo.inci.window.main.MainWindow;
//import com.vaadin.ui.Window.Notification;
import com.proximo.inci.window.main.URIUtil;

public class APPMoveSearchView extends BaseView {

	// search form
	protected APPMoveSearchForm searchForm;
	protected APPMoveSearchResultLayout searchResultLayout;
		
	/*public APPMoveSearchView(MainWindow mainWindow, boolean addCaption,
			String captionKey) {
		super(mainWindow, addCaption, captionKey);
	}*/
	
	public APPMoveSearchView(MainWindow mainWindow) {
		super(mainWindow, true, "view.admin.app_move.search.view_caption");
	}
	
	@Override
	protected void init() {
		super.init();
		
		try
		{
			searchForm = new APPMoveSearchForm(this);
			searchResultLayout = new APPMoveSearchResultLayout(this);
		}
		catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}
	
	@Override
	protected void addContent() {
		super.addContent();
		
		addComponent(searchForm);
		addSpace();
		addComponent(searchResultLayout);
	}
	
    @Override
    public void handleNavigateOut() { 
    	if (!getCurrentView().contains("search")) {    	
        	// clear form when navigate out
        	searchForm.clearForm();
        	searchResultLayout.clearSearchResults();
		}             	
    }
    
    public APPMoveSearchForm getAPPMoveSearchForm () {
    	return this.searchForm;
    }
    
    public APPMoveSearchResultLayout getAPPMoveSearchResultLayout () {
    	return this.searchResultLayout;
    }
    
    @Override
    public void applyNavigationParameters(Map<String, Object> navigationParameterMap) {
		String fragment = getCurrentView();
		
		if (fragment.contains("search")) {
			
			// parameters
			Properties prop = new Properties();
			prop = URIUtil.fillSearchParamByURIString(fragment);
			
			// clear form before apply
			searchForm.clearForm();
			
			// logon 
			if (!TemplarUtil.isStringNullOrEmpty(prop.getProperty("logon")))
				searchForm.getLogonField().setValue(prop.getProperty("logon"));
			
			// company name 
			if (!TemplarUtil.isStringNullOrEmpty(prop.getProperty("comp")))
				searchForm.getCompanyName().setValue(prop.getProperty("comp"));
			
			// company name 
			if (!TemplarUtil.isStringNullOrEmpty(prop.getProperty("appno")))
				searchForm.getApplicationNumber().setValue(prop.getProperty("appno"));
			
			
			// trade name 
			if (!TemplarUtil.isStringNullOrEmpty(prop.getProperty("trade")))
				searchForm.getTradeName().setValue(prop.getProperty("trade"));
			
			// log the the DB
			//TradeNameService.log("APPMoveSearchView.applyNavigationParameters current View:" + getCurrentView());
			//TradeNameService.log("APPMoveSearchView.applyNavigationParameters previous View:" + getPreviousView());
			
			// search for applications and don't set the URI
			String logonStr = (searchForm.getLogonField()!=null?searchForm.getLogonField().getValue().toString():"");
			String companyNameStr = (searchForm.getCompanyName()!=null?searchForm.getCompanyName().toString():"");
			String appNumberStr = (searchForm.getApplicationNumber()!=null?searchForm.getApplicationNumber().toString():"");
			String tradeNameStr = (searchForm.getTradeName()!=null?searchForm.getTradeName().toString():"");
			
			searchResultLayout.search(logonStr, companyNameStr, appNumberStr, tradeNameStr, false, "", 1);
		}    	
    }    
}
