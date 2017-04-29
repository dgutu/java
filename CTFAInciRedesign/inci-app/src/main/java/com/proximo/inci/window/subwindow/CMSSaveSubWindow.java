/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.window.subwindow;

import java.util.Map;

import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.component.common.SpacingComponent;
import com.proximo.inci.component.util.ComponentUtil;
import com.proximo.inci.view.admin.misc_text_maint.detail.MTMDetailForm;
import com.proximo.inci.window.main.MainWindow;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;

public class CMSSaveSubWindow extends SubWindow {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;	
	
	public static final String PARENT_FORM_MAP_KEY = "parentForm";
	
	private final String CAPTION_KEY="view.admin.misc_text_maint_report.sub_window.caption";
    private final String WIDTH = "350px";
    private final String HEIGHT = "150px";   
    private MTMDetailForm parentForm;
    
    private Long cmsUid;
    private String cmsTitle;
    private String cmsText;
    
	public CMSSaveSubWindow(MainWindow mainWindow) {
		super(mainWindow);
	}
	
	@Override
	protected void init() {
        super.init();
        
        setModal(true);
        setResizable(false);
        setClosable(true);
	}
	
	@Override
    protected void handleParams(Map<String, Object> parameters) {
		if (parameters != null && parameters.size() > 0) {
			parentForm = (MTMDetailForm) parameters.get(PARENT_FORM_MAP_KEY);
			cmsUid = parentForm.getCmsUid();
			cmsTitle = parentForm.getTextField().getValue().toString();
			cmsText = parentForm.getRichTextArea().getValue().toString();
		}			
		else {
			cmsUid = new Long(0);
			cmsTitle = "";
			cmsText = "";
		}
    }

	@Override
	protected String getCaptionKey() {
		return this.CAPTION_KEY;
	}

	@Override
	protected void addContent() {
		VerticalLayout layout = (VerticalLayout) getContent();		
        ComponentUtil.addHtml(
                CaptionResolver.getCaption("view.admin.misc_text_maint_report.sub_window.text"), layout);
        HorizontalLayout actionButtonsLayout = new HorizontalLayout();
        actionButtonsLayout.setSpacing(true);
        
        // yes button
        Button yesButton = ComponentUtil.createActionButton("yes", new Button.ClickListener() {
            /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
            public void buttonClick(ClickEvent event) {
				if (cmsUid != null && cmsTitle != null && cmsText != null) {
					// call save oracle SP
					parentForm.save(cmsUid, cmsTitle, cmsText);
					// close current subwindow
	                mainWindow.removeWindow(getWindow());
	                // go to MTMView page	                
	                //mainWindow.navigateTo(parentForm.getParentView().getBackURL());
	                // the application have been saved
	                mainWindow.showInfoMsgWindow(CaptionResolver.getCaption("view.admin.misc_text_maint_report.cms.have.been.saved"));
				}
            }
        });
        
        // no button
        Button noButton = ComponentUtil.createActionButton("no", new Button.ClickListener() {
            /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
            public void buttonClick(ClickEvent event) {
				// close current subwindow
				mainWindow.removeWindow(getWindow());
                // go to MTMView page
				mainWindow.navigateTo(parentForm.getParentView().getBackURL());
            }
        });
        
        // add buttons on layout
        actionButtonsLayout.addComponent(yesButton);
        actionButtonsLayout.addComponent(noButton);
        
        // add space before button
        layout.addComponent(new SpacingComponent(10).getMainComponent());

        // add buttons on parent layout
        layout.addComponent(actionButtonsLayout);
        layout.setComponentAlignment(actionButtonsLayout, Alignment.BOTTOM_CENTER);
	}

	@Override
	protected String getWindowWidth() {
		return this.WIDTH;
	}

	@Override
	protected String getWindowHeight() {
		return this.HEIGHT;
	}
	
	public MTMDetailForm getParentForm() {
		return this.parentForm;
	}
	
	public Long getCMSUid() {
		return this.cmsUid;
	}
	
	public String getCMSTitle() {
		return this.cmsTitle;
	}
	
	public String getCMSText() {
		return this.cmsText;
	}
}
