/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.window.subwindow.tradename.admin_comments;

import java.util.ArrayList;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proximo.inci.DOFormTNComment;
import com.proximo.inci.DOList;
import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.common.TDate;
import com.proximo.inci.component.AbstractInciComponent;
import com.vaadin.data.Property;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.Label;
import com.vaadin.ui.Table;

@SuppressWarnings("serial")
public class ExistingCommentsTable extends AbstractInciComponent<Table> {

	@SuppressWarnings("unused")
	private static Logger logger = LoggerFactory.getLogger(ExistingCommentsTable.class);
	
    private AdminCommentsWindow parentWindow;
    
    private ArrayList<CheckBox> exstngCmntsClsdArrayList;
    private ArrayList<TDate> exstngCmntsClsdDateArrayList;
    private ArrayList<Label> exstngCmntsClsdDateLblArrayList;
    
    public ExistingCommentsTable(AdminCommentsWindow parentWindow) {
        this.parentWindow = parentWindow;

        build();
    }

    @Override
    protected Table createMainComponentInstance() {
        return new Table();
    }

    @Override
    protected void init() {
    }

    @Override
    public void generateContent() {
        reInitialize();
    }

    private void reInitialize() {
        exstngCmntsClsdArrayList = new ArrayList<CheckBox>();
        exstngCmntsClsdDateArrayList = new ArrayList<TDate>();
        exstngCmntsClsdDateLblArrayList = new ArrayList<Label>();

        
        build();
        initializeTable();
    }

    private void initializeTable() {
        mainComponent.setSizeFull();
        mainComponent.addStyleName("tn-comments");
        initializeTableColumns();
        generateRows();
    }

    private void initializeTableColumns() {
   	
    	int windowWidth = 950;
    	int COLUMN_COUNT = 5;
		int averageColumnWidth = (windowWidth - (60 * 2)) / COLUMN_COUNT;
		
        String subjectColumnCaption = CaptionResolver
                .getCaption("admin_comments_window.existing_comments_table.column.subject");
        mainComponent.addContainerProperty(subjectColumnCaption, String.class, null);
        mainComponent.setColumnWidth(subjectColumnCaption, averageColumnWidth);
        
        String msgBodyColumnCaption = CaptionResolver
                .getCaption("admin_comments_window.existing_comments_table.column.message_body");
        mainComponent.addContainerProperty(msgBodyColumnCaption, String.class, null);
        mainComponent.setColumnWidth(msgBodyColumnCaption, averageColumnWidth);
        
        String dtSent = CaptionResolver.getCaption("admin_comments_window.existing_comments_table.column.date_sent"); 
        mainComponent.addContainerProperty(dtSent, String.class, null);
        mainComponent.setColumnWidth(dtSent, averageColumnWidth);
        
        String chkBox = CaptionResolver.getCaption("admin_comments_window.existing_comments_table.column.closed");
        mainComponent.addContainerProperty(chkBox, CheckBox.class, null);
        mainComponent.setColumnWidth(chkBox, averageColumnWidth);
        
        String dtClose = CaptionResolver.getCaption("admin_comments_window.existing_comments_table.column.closed_date");
        mainComponent.addContainerProperty(dtClose, Label.class, null);        
        mainComponent.setColumnWidth(dtClose, averageColumnWidth);
    }

    private void generateRows() {
    	int pageSize = 0;
    	
        DOList commentsList = parentWindow.getCommentsList();        

        for (int i = 0; i < commentsList.size(); i++) {
            DOFormTNComment comment = (DOFormTNComment) commentsList.elementAt(i);

            mainComponent.addItem(new Object[] { comment.subject, comment.msgBody, convertTDateToCol(comment.sentDt),
                    createCmntClosedCheckBox(comment.isClosed), createCmntClosedDateLabel(comment.closeDt) }, i);
            
            // count pageSize
            pageSize++;
        }
        
        mainComponent.setPageLength(pageSize + 1);     
    }
    
    private CheckBox createCmntClosedCheckBox(boolean closed) {
        final CheckBox checkBox = new CheckBox(null, closed);
        checkBox.setImmediate(true);
        checkBox.addListener(new Property.ValueChangeListener() {
            @Override
            public void valueChange(ValueChangeEvent event) {
                Boolean cmntClosed = (Boolean) checkBox.getValue();
                if (cmntClosed) {
                    int index = exstngCmntsClsdArrayList.indexOf(checkBox);
                    TDate nowTDate = new TDate(new Date());
                    exstngCmntsClsdDateArrayList.set(index, nowTDate);
                    exstngCmntsClsdDateLblArrayList.get(index).setValue(convertTDateToCol(nowTDate));
                } else {
                    TDate tDate = TDate.getNullDateObject();
                    int index = exstngCmntsClsdArrayList.indexOf(checkBox);
                    exstngCmntsClsdDateArrayList.set(index, tDate);
                    exstngCmntsClsdDateLblArrayList.get(index).setValue(convertTDateToCol(tDate));
                }
                
                /*if ((Boolean) checkBox.getValue()) {
                	logger.debug("createCmntClosedCheckBox=true");
                }
                else {
                	logger.debug("createCmntClosedCheckBox=false");
                }*/	
            }
        });
        exstngCmntsClsdArrayList.add(checkBox);
        return checkBox;
    }
    
    private Label createCmntClosedDateLabel(TDate tDate) {
        exstngCmntsClsdDateArrayList.add(tDate);
        Label cmntClosedDateLbl = new Label();
        cmntClosedDateLbl.setValue(convertTDateToCol(tDate));
        exstngCmntsClsdDateLblArrayList.add(cmntClosedDateLbl);
        return cmntClosedDateLbl;
    }

    private static String convertTDateToCol(TDate tDate) {
        String result;

        if (tDate.isNull()) {
            result = "";
        } else {
            result = TDate.convertTDateToCol(tDate);
        }

        return result;
    }
    
    public ArrayList<CheckBox> getExstngCmntsClsdArrayList() {
        return exstngCmntsClsdArrayList;
    }

    public ArrayList<TDate> getExstngCmntsClsdDateArrayList() {
        return exstngCmntsClsdDateArrayList;
    }

}
