/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.window.subwindow.tradename.admin_comments;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proximo.inci.DOFormTNComment;
import com.proximo.inci.DOList;
import com.proximo.inci.DOTradeName;
import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.component.util.ComponentUtil;
import com.proximo.inci.service.common.EmailService;
import com.proximo.inci.service.tradename.comment.TradeNameCommentService;
import com.proximo.inci.view.tradename.detail.TradeNameDetailView;
import com.proximo.inci.window.main.MainWindow;
import com.proximo.inci.window.subwindow.SubWindow;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;

@SuppressWarnings("serial")
public class AdminCommentsWindow extends SubWindow {

    private static Logger logger = LoggerFactory.getLogger(AdminCommentsWindow.class);

    private static final String CAPTION_KEY = "admin_comments_window.caption";

    private static final String WIDTH = "950px";
    private static final String HEIGHT = "580px";

    public static String FORM_TN_PARAM_KEY = "formTn";

    private DOTradeName formTn;
    private DOList commentsList;

    private Label title;
    private ExistingCommentsTable existingCommentsTable;
    private SendCommentLayout sendCommentLayout;
    
    private TradeNameDetailView parentForm; 

    public AdminCommentsWindow(MainWindow mainWindow) {
        super(mainWindow);
    }

    @Override
    protected void init() {
        super.init();

        setModal(true);
        setResizable(false);

        VerticalLayout layout = (VerticalLayout) getContent();
        layout.setSpacing(true);

        initTitle();
        existingCommentsTable = new ExistingCommentsTable(this);
        sendCommentLayout = new SendCommentLayout();
    }

    private void initTitle() {
        title = new Label();
        title.addStyleName("form-title");
    }

    @Override
    protected void addContent() {
        addTitle();
        addExistingCommentsTable();
        addSaveClosedCmntsButton();
        addSendCommentsLayout();
    }

    private void addTitle() {
        VerticalLayout layout = (VerticalLayout) getContent();

        HorizontalLayout titleLayout = new HorizontalLayout();
        titleLayout.addComponent(title);

        layout.addComponent(titleLayout);
        layout.setComponentAlignment(titleLayout, Alignment.TOP_CENTER);
    }
    
    private void addExistingCommentsTable() {
        VerticalLayout layout = (VerticalLayout) getContent();
        
        if (commentsList != null && commentsList.size() > 0) {
            layout.addComponent(existingCommentsTable.getMainComponent());            
        } else {
            layout.addComponent(new Label(CaptionResolver.getCaption("admin_comments_window.no_tn_comments")));
        }
    }
    
    private void addSaveClosedCmntsButton() {
        final Button saveClosedCmntsBtn = ComponentUtil.createActionButton("save", new Button.ClickListener() {
            @Override
            public void buttonClick(ClickEvent event) {
                saveComments();
            }
        });
        
        VerticalLayout layout = (VerticalLayout) getContent();
        layout.addComponent(saveClosedCmntsBtn);
        layout.setComponentAlignment(saveClosedCmntsBtn, Alignment.MIDDLE_RIGHT);
    }

    private void addSendCommentsLayout() {
        VerticalLayout layout = (VerticalLayout) getContent();

        layout.addComponent(sendCommentLayout.getMainComponent());
        layout.setComponentAlignment(sendCommentLayout.getMainComponent(), Alignment.TOP_CENTER);
    }

    @Override
    protected void handleParams(Map<String, Object> parameters) {
    	if (parameters != null && parameters.size() > 0) {
    		formTn = (DOTradeName) parameters.get(FORM_TN_PARAM_KEY);
    		parentForm = (TradeNameDetailView) parameters.get("parentForm");
    	}
        
        commentsList = TradeNameCommentService.findComments(formTn.recID, mainWindow.getCurrentSecurityInfo().getUser()
                .getLoginId());

        title.setValue(CaptionResolver.getCaption("admin_comments_window.title.part1") + " " + formTn.tnNumber + ")");

        sendCommentLayout.generateContent();        
        existingCommentsTable.generateContent();
        
        ((VerticalLayout) getContent()).removeAllComponents();
        addContent();
    }

    public void sendComment() {
        String from = sendCommentLayout.getSendCommentFormLayout().getFrom();
        String to = sendCommentLayout.getSendCommentFormLayout().getTo();
        String subject = sendCommentLayout.getSendCommentFormLayout().getSubject();
        String userMessage = sendCommentLayout.getSendCommentFormLayout().getMessageToSave();
		String message = SendCommentFormLayout.DEFAULT_EMAIL_MSG + userMessage;		

        try {
            EmailService.sendHtml(from, to, subject, message);
        } catch (Throwable t) {
            logger.error("Unable to send comment-email");
            throw new RuntimeException(t);
        }

        TradeNameCommentService.saveComment(formTn.recID, mainWindow.getCurrentSecurityInfo().getUser().getLoginId(),
                sendCommentLayout.getSendCommentFormLayout().getSubject(), userMessage);
        
        // refresh the content
        //existingCommentsTable.generateContent();                
        
        // show notification window
        mainWindow.showInfoMsgWindow("Email successfully sent!");
        

        // navigate to Detail Window
        // refresh trade info
        parentForm.refreshTradeData(formTn.recID);
        
        // close comments window
        mainWindow.removeWindow(this.getWindow());   
    }
    
    private void saveComments() {
    	DOList newList = new DOList();
        for (int i = 0; i < commentsList.size(); i++) {
            DOFormTNComment comment = (DOFormTNComment) commentsList.elementAt(i);
            
            logger.debug("email.id="+comment.recID);
            logger.debug("existingCommentsTable.getExstngCmntsClsdArrayList().get(i).getValue()="+existingCommentsTable.getExstngCmntsClsdArrayList().get(i).getValue());
            
            comment.isClosed = (Boolean) existingCommentsTable.getExstngCmntsClsdArrayList().get(i).getValue();
            comment.closeDt = existingCommentsTable.getExstngCmntsClsdDateArrayList().get(i);
            
            newList.addElement(comment);
        }

        //TradeNameCommentService.setCloseTnComments(commentsList, mainWindow.getCurrentSecurityInfo().getUser().getLoginId());
        TradeNameCommentService.setCloseTnComments(newList, mainWindow.getCurrentSecurityInfo().getUser().getLoginId());

        // refresh trade info        
        parentForm.refreshTradeData(formTn.recID);
        
        mainWindow.showInfoMsgWindow("All changes saved!");
    }
    
    

    @Override
    protected String getCaptionKey() {
        return CAPTION_KEY;
    }

    @Override
    protected String getWindowWidth() {
        return WIDTH;
    }

    @Override
    protected String getWindowHeight() {
        return HEIGHT;
    }

    public DOTradeName getFormTn() {
        return formTn;
    }

    public DOList getCommentsList() {
        return commentsList;
    }
    
    public TradeNameDetailView getParentForm() {
    	return parentForm;
    }

	public void closeWindow() {
        // navigate to Detail Window
        // refresh trade info
        //parentForm.refreshTradeData(formTn.recID);
        
        // close comments window
        mainWindow.removeWindow(this.getWindow());
	}

}
