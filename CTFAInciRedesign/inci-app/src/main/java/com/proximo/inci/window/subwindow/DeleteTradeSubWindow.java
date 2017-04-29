/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.window.subwindow;

//import java.util.HashMap;
import java.util.Map;

import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.component.common.SpacingComponent;
import com.proximo.inci.component.util.ComponentUtil;
/*import com.proximo.inci.view.ViewKey;
import com.proximo.inci.view.admin.misc_text_maint.detail.MTMDetailForm;
import com.proximo.inci.view.admin.misc_text_maint.search.MTMView;*/
import com.proximo.inci.view.tradename.detail.TradeNameDetailView;
import com.proximo.inci.window.main.MainWindow;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;

public class DeleteTradeSubWindow extends SubWindow {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6224842953180614067L;

	public final static String PARENT_VIEW_KEY = "parentView";
	
	private final String CAPTION="trade.delete.caption.window";
    private final String WIDTH = "350px";
    private final String HEIGHT = "150px";
    
    private TradeNameDetailView parentView;
	
	public DeleteTradeSubWindow(MainWindow mainWindow) {
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
			parentView = (TradeNameDetailView) parameters.get(PARENT_VIEW_KEY);
		}
    }	

	@Override
	protected String getCaptionKey() {
		return this.CAPTION;
	}

	@Override
	protected void addContent() {
		VerticalLayout layout = (VerticalLayout) getContent();		
        ComponentUtil.addHtml(
                CaptionResolver.getCaption("trade.delete.prompt.message"), layout);
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
				if (parentView != null) {
					// call save oracle SP
					parentView.deleteTn();
					// close current subwindow
	                mainWindow.removeWindow(getWindow());
	                // navigate back to search VIEW
	                parentView.navigateBackToSearchView();
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

}
