/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.window.subwindow;

import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.window.main.MainWindow;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.VerticalLayout;


public abstract class InformationWindow extends SubWindow {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1437393659880372665L;
	protected Button okButtonParent;
	
	
    public InformationWindow(MainWindow mainWindow) {
        super(mainWindow);
    }

    /**
     * Override this in subclasses to add information components to the content
     * layout of the window.
     */
    protected abstract void addInformation();
    
    //protected abstract void addActionButtonsLayout();

    @Override
    protected void init() {
        super.init();

        setModal(true);
        setResizable(false);
        setClosable(false);

        VerticalLayout contentLayout = (VerticalLayout) getContent();
        contentLayout.setSizeFull();
    }

    @Override
    protected void addContent() {
        addInformation();
        addActionButtonsLayout();
    }

    private void addActionButtonsLayout() {
        VerticalLayout contentLayout = (VerticalLayout) getContent();

        HorizontalLayout actionButtonsLayout = new HorizontalLayout();
        actionButtonsLayout.setSpacing(true);
        
        okButtonParent = new Button(CaptionResolver.getCaption("ok"));
        okButtonParent.addStyleName("actionbtn");
        okButtonParent.addListener(createCancelButtonListener());
        
        actionButtonsLayout.addComponent(okButtonParent);
        contentLayout.addComponent(actionButtonsLayout);
        contentLayout.setComponentAlignment(actionButtonsLayout, Alignment.BOTTOM_CENTER);
    }
    
    protected Button.ClickListener createCancelButtonListener() {
        return new Button.ClickListener() {
            /**
			 * 
			 */
			private static final long serialVersionUID = 5979869671644632295L;

			@Override
            public void buttonClick(ClickEvent event) {
            	mainWindow.removeWindow(getWindow());
            }
        };
    }      
    
}
