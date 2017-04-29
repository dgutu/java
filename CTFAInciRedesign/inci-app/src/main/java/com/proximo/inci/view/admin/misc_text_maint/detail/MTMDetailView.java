/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.admin.misc_text_maint.detail;

import java.util.Map;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

import com.proximo.inci.view.BaseView;
import com.proximo.inci.window.main.MainWindow;

public class MTMDetailView extends BaseView {	
	//private static Logger logger = LoggerFactory.getLogger(MTMDetailView.class);
	
	// costant
	public static final String MTM_CMS_UID = "cmsUid";
    public static final String MTM_CMS_TITLE = "cmsTitle";
    public static final String MTM_CMS_TEXT = "cmsText";
	
	// local variable
	private MTMDetailForm mtmDetailForm;
	private Long cmsUid;
	private String cmsTitle;
	private String cmsText;
	
	public MTMDetailView(MainWindow mainWindow) {
		super(mainWindow, true, "view.admin.misc_text_maint_report.detail");
	}
	
	@Override
	public void init() {
		super.init();
		
		// initiate Detail Form
		mtmDetailForm = new MTMDetailForm(this);
	}	

	@Override
	public void addContent() {
		super.addContent();
		addComponent(mtmDetailForm);
	}
	
    @Override
    public void applyNavigationParameters(Map<String, Object> navigationParameterMap) {
    	if (navigationParameterMap != null && navigationParameterMap.size()>0)
    	{
    		// read parameters from navigation
    		cmsUid = (Long) navigationParameterMap.get(MTM_CMS_UID);
    		cmsTitle = navigationParameterMap.get(MTM_CMS_TITLE).toString();
    		cmsText = navigationParameterMap.get(MTM_CMS_TEXT).toString();
    		
    		// populate detail fields
    		mtmDetailForm.getTextField().setValue(this.cmsTitle);
    		mtmDetailForm.getRichTextArea().setValue(this.cmsText);
    		mtmDetailForm.setCmsUid(cmsUid);
    	}
    	else
    	{
    		this.cmsUid = new Long(0);
    		this.cmsTitle = "";
    		this.cmsText = "";
    	}
    	
        //logger.debug("applyNavigationParameters.parentView.getCMSTitle()="+this.cmsTitle);
        //logger.debug("applyNavigationParameters.parentView.getCMSUid()="+this.cmsUid.toString());
    }
	
	public MTMDetailForm getMTMDetailForm() {
		return this.mtmDetailForm;
	}
	
	public Long getCMSUid() {
		if (this.cmsUid != null)
			return this.cmsUid;
		else
			return 0L;
	}
	
	public String getCMSTitle() {
		if (this.cmsTitle != null)
			return this.cmsTitle;
		else	
			return "";
	}
	
	public String getCMSText() {
		if (this.cmsText != null)
			return this.cmsText;
		else	
			return "";		
	}
	
    @Override
    public void handleNavigateOut() {
        // clear the form when navigate out
    	mtmDetailForm.clearForm();
    }
}
