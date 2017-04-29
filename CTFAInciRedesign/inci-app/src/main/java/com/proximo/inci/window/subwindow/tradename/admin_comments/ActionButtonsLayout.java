/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.window.subwindow.tradename.admin_comments;

import com.proximo.inci.component.AbstractInciComponentLayout;
import com.proximo.inci.component.util.ButtonWidth;
import com.proximo.inci.component.util.ComponentUtil;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.HorizontalLayout;
//import com.vaadin.ui.Window;

@SuppressWarnings("serial")
public class ActionButtonsLayout extends AbstractInciComponentLayout<HorizontalLayout> {

    private SendCommentLayout parentLayout;

    public ActionButtonsLayout(SendCommentLayout parentLayout) {
        this.parentLayout = parentLayout;

        build();
    }

    @Override
    protected HorizontalLayout createMainComponentInstance() {
        return new HorizontalLayout();
    }

    @Override
    protected void init() {
        mainComponent.setSpacing(true);
    }

    @Override
    protected void addContent() {
        addButtons();
    }

    private void addButtons() {
        Button sendCommentButton = ComponentUtil.createActionButton("admin_comments_window.send_comment_btn",
                new ClickListener() {
                    @Override
                    public void buttonClick(ClickEvent event) {
                        ((AdminCommentsWindow) parentLayout.getMainComponent().getWindow()).sendComment();
                    }
                }, ButtonWidth.XLARGE);
        mainComponent.addComponent(sendCommentButton);

        Button cancelButton = ComponentUtil.createActionButton("cancel", new ClickListener() {
            @Override
            public void buttonClick(ClickEvent event) {
                //Window mainComponentWindow = mainComponent.getWindow();
                //mainComponentWindow.getParent().removeWindow(mainComponentWindow);
            	((AdminCommentsWindow) parentLayout.getMainComponent().getWindow()).closeWindow();
            	
            }
        });
        mainComponent.addComponent(cancelButton);
    }
}
