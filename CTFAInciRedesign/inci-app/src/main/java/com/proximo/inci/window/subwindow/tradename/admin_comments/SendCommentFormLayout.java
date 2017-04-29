/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.window.subwindow.tradename.admin_comments;

import com.proximo.inci.DOTradeName;
import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.component.AbstractInciComponentLayout;
import com.proximo.inci.component.util.ComponentUtil;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.TextField;
//import org.apache.commons.lang.StringUtils;

public class SendCommentFormLayout extends AbstractInciComponentLayout<FormLayout> {

    public static final String DEFAULT_MSG = "In response to your INCI name application, "
            + "the following additional information is required in order to assign an INCI name to your material.\n\n"
            
            + "Please enter responses in the \"User Response to Comments\" area of the application form. "
            + "You will be unable to edit any fields on the application. If additional space is needed, "
            + "attachments to the application may be uploaded. However, you must note \"see attachment\" in the comments box.\n\n"
    
    		+ "You must respond within 12 months or your application will be considered no longer active and moved to the Archived area.\n\n";
    
    public static final String DEFAULT_EMAIL_MSG = "In response to your INCI name application, "
            + "the following additional information is required in order to assign an INCI name to your material. <br><br>"
            
            + "Please enter responses in the \"User Response to Comments\" area of the application form. "
            + "You will be unable to edit any fields on the application. If additional space is needed, "
            + "attachments to the application may be uploaded. However, you must note \"see attachment\" in the comments box. <br><br>"
    
    		+ "You must respond within 12 months or your application will be considered no longer active and moved to the Archived area.<br><br>";

    private SendCommentLayout parentLayout;

    private Label from;
    private Label to;
    private TextField subject;
    private TextArea comments;

    public SendCommentFormLayout(SendCommentLayout parentLayout) {
        this.parentLayout = parentLayout;

        build();
    }

    @Override
    protected FormLayout createMainComponentInstance() {
        return new FormLayout();
    }

    @Override
    protected void init() {
        mainComponent.setSpacing(false);

        initFrom();
        initTo();
        initSubject();
        initComments();
    }
    
    private void initSubject() {
        subject = new TextField(CaptionResolver.getCaption("admin_comments_window.subject"));
        subject.setWidth("500px");
    }

    private void initTo() {
        to = new Label();
        to.setCaption(CaptionResolver.getCaption("admin_comments_window.to"));
    }    
    
    private void initFrom() {
        from = new Label();
        from.setCaption(CaptionResolver.getCaption("admin_comments_window.from"));
    }
    
    private void initComments() {
        comments = new TextArea(CaptionResolver.getCaption("admin_comments_window.comments"));
        comments.addStyleName("description");
        comments.setSizeFull();
        comments.setHeight("275px");
    }

    @Override
    protected void addContent() {
        mainComponent.addComponent(from);
        addSpacing(ComponentUtil.NORMAL_FORM_SPACING_PX);
        mainComponent.addComponent(to);
        addSpacing(ComponentUtil.NORMAL_FORM_SPACING_PX);
        mainComponent.addComponent(subject);
        addSpacing(ComponentUtil.NORMAL_FORM_SPACING_PX);
        mainComponent.addComponent(comments);
    }

    @Override
    public void generateContent() {
        AdminCommentsWindow parentWindow = (AdminCommentsWindow) parentLayout.getMainComponent().getWindow();
        //MainWindow mainWindow = (MainWindow) parentWindow.getParent();
        DOTradeName formTn = parentWindow.getFormTn();
        
        
        
        
        //from.setValue(mainWindow.getCurrentSecurityInfo().getUser().getEmail());  
        from.setValue(CaptionResolver.getCaption("credit_card.detail.netforum.email.from"));
        //to.setValue(((MainWindow) parentWindow.getParent()).getCurrentSecurityInfo().getUser().getEmail());
        to.setValue(parentWindow.getParentForm().getExtraDetails().getUserFormLayout().getUser().getEmail());
        subject.setValue(CaptionResolver.getCaption("admin_comments_window.subject.default.part1") + " "
                + formTn.tnNumber + " " + CaptionResolver.getCaption("admin_comments_window.subject.default.part2"));
        comments.setValue(DEFAULT_MSG);
    }

    public String getFrom() {
        return (String) from.getValue();
    }

    public String getTo() {
        return (String) to.getValue();
    }

    public String getSubject() {
        return (String) subject.getValue();
    }

    public String getMessage() {
        return (String) comments.getValue();
    }
    
    public String getMessageToSave() {
    	String last = "You must respond within 12 months or your application will be considered no longer active and moved to the Archived area.";
    	return getMessage().substring(getMessage().indexOf(last) + last.length()).trim(); 
    }

}
