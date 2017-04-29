/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.window.subwindow.tradename.admin_comments;

import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.component.AbstractInciComponentLayout;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

public class SendCommentLayout extends AbstractInciComponentLayout<VerticalLayout> {

    private SendCommentFormLayout sendCommentFormLayout;
    private ActionButtonsLayout actionButtonsLayout;

    public SendCommentLayout() {
        build();
    }

    @Override
    protected VerticalLayout createMainComponentInstance() {
        return new VerticalLayout();
    }

    @Override
    protected void init() {
        mainComponent.setMargin(true);

        mainComponent.addStyleName("grayBackgroundColor");
        mainComponent.addStyleName("roundedCorners");

        sendCommentFormLayout = new SendCommentFormLayout(this);
        actionButtonsLayout = new ActionButtonsLayout(this);
    }

    @Override
    protected void addContent() {
        addInstructions();

        addComponent(sendCommentFormLayout);
        addComponent(actionButtonsLayout, Alignment.BOTTOM_RIGHT);
    }

    private void addInstructions() {
        Label instructions = new Label(CaptionResolver.getCaption("admin_comments_window.instructions.part1") + " \""
                + CaptionResolver.getCaption("admin_comments_window.send_comment_btn") + "\" "
                + CaptionResolver.getCaption("admin_comments_window.instructions.part2"));
        instructions.addStyleName("bold-text");

        mainComponent.addComponent(instructions);
    }

    public SendCommentFormLayout getSendCommentFormLayout() {
        return sendCommentFormLayout;
    }
    
}
