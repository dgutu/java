/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.admin.misc_text_maint.detail;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.component.AbstractInciComponentLayout;
import com.proximo.inci.component.common.SpacingComponent;
import com.proximo.inci.component.util.ComponentUtil;
import com.proximo.inci.service.tradename.TradeNameService;
import com.proximo.inci.view.ViewKey;
import com.proximo.inci.window.SubWindowKey;
import com.proximo.inci.window.subwindow.CMSSaveSubWindow;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.RichTextArea;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Window.Notification;

public class MTMDetailForm extends AbstractInciComponentLayout<VerticalLayout> {
	
	private static Logger logger = LoggerFactory.getLogger(MTMDetailForm.class);
	
	// constant
	public final static ViewKey PARENT_VIEW_KEY=ViewKey.ADMIN_MISC_TEXT_MAINT_SEARCH;
	
	// local variable
	private MTMDetailView parentView;
	private TextField title;
	private RichTextArea textArea; 
	private HorizontalLayout btnLayout;
	private Button saveBtn;
	private Button cancelBtn;
	private SpacingComponent space;
	private Long cmsUid;  
	
	//private String cmsTitle;
	
	// constructor	
	public MTMDetailForm(MTMDetailView parentView) {
		this.parentView = parentView;
		//this.cmsTitle = cmsTitle;
		
		// build
		// creating main component instance for this class
		build();
	}	
	
	@Override
	protected VerticalLayout createMainComponentInstance() {
		return new VerticalLayout();
	}

	@Override
	protected void init() {
		try
		{
	        mainComponent.setSpacing(true);
	        mainComponent.setMargin(true);
	        
	        mainComponent.addStyleName("grayBackgroundColor");
	        mainComponent.addStyleName("roundedCorners");
	        
	        mainComponent.setWidth("900px");		
			
			title = new TextField(CaptionResolver.getCaption("view.admin.misc_text_maint_report.detail.title"),"");
			textArea = new RichTextArea(CaptionResolver.getCaption("view.admin.misc_text_maint_report.detail.rich_text_area"),"");
			
			title.setWidth("200px");
			textArea.setWidth("850px");
			textArea.setHeight("550px");
			
			// initiate space
			space = new SpacingComponent(10);
			
			// initiate btn Layout
			btnLayout = new HorizontalLayout();			
			
			// initiate save button
			saveBtn = ComponentUtil.createActionButton("save", saveBtnListener());
			cancelBtn = ComponentUtil.createActionButton("cancel", cancelBtnListener());
			
			btnLayout.addComponent(saveBtn);
			btnLayout.addComponent(cancelBtn);
			
			// initiate cmsUid
			this.cmsUid = new Long(0);
		}
		catch (Exception ex) {
			logger.error("MTMDetailForm.init()="+ex.getCause().getMessage());
		}
	}
	
	@Override
	protected void addContent() {
		try
		{
			// add Title on main view
			mainComponent.addComponent(title);
			mainComponent.addComponent(space.getMainComponent());
			
			// add Text Area on main view
			mainComponent.addComponent(textArea);
			mainComponent.addComponent(space.getMainComponent());
			
			// add save & cancel buttons on main view
			btnLayout.addComponent(saveBtn);
			btnLayout.addComponent(cancelBtn);
			
			mainComponent.addComponent(btnLayout);
			mainComponent.setComponentAlignment(btnLayout, Alignment.MIDDLE_RIGHT);
			
			// focus cursor into textarea
			textArea.focus();
		}
		catch(Exception ex) {
			logger.error("MTMDetailForm.addContent()="+ex.getCause().getMessage());
		}
		
	}
	
	// cancel button on Detail form
	protected Button.ClickListener cancelBtnListener() {
        return new Button.ClickListener() {
            /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
            public void buttonClick(ClickEvent event) {
				// go to MTMView page
				parentView.navigateTo(parentView.getBackURL());				
            }
        };
    }

	// save button on Detail form
    protected Button.ClickListener saveBtnListener() {
        return new Button.ClickListener() {
            /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
            public void buttonClick(ClickEvent event) {
				// call save SP
		        Map<String, Object> parameters = new HashMap<String, Object>();		        
		        parameters.put(CMSSaveSubWindow.PARENT_FORM_MAP_KEY, getCurrentClassInstance()); // pass current class inctance
				parentView.showSubWindow(SubWindowKey.CMS_SAVE, parameters);
            }
        };
    }
	
	public MTMDetailView getParentView() {
		return this.parentView;
	}
	
	public TextField getTextField() {
		return this.title;
	}
	
	public RichTextArea getRichTextArea() {
		return this.textArea;
	}
	
	public Long getCmsUid () {
		return this.cmsUid;
	}
	
	public void setCmsUid (Long cmsUid) {
		this.cmsUid = cmsUid;
	}	
	
	// clear form
	public void clearForm() {
		this.title.setValue("");
		this.textArea.setValue("");
		this.cmsUid = new Long(0);
	}
	
    public void save(Long cmsUid, String cmsTitle, String cmsText) {
    	int rs = 0; //  0 - the save SP executed successfully
    				// -1 - the save SP failed
    	
    	try {
    		// call save SP
    		rs = TradeNameService.saveCMS(cmsUid, cmsTitle, cmsText);    		
    		
    		// oracle SP exeption 
    		if (rs == -1) {
    			mainComponent.getWindow().showNotification("MTMDetailForm.save Exception!", "Trade_Name_Mgmt.Save_CMS_Text failed !!!", Notification.TYPE_ERROR_MESSAGE);    			
    		}
    	}
    	catch (Exception ex) {
    		mainComponent.getWindow().showNotification("MTMDetailForm.save Exception!", ex.getMessage(), Notification.TYPE_ERROR_MESSAGE);
    	}
    }
    
    protected MTMDetailForm getCurrentClassInstance() {
    	return this;
    }
}
