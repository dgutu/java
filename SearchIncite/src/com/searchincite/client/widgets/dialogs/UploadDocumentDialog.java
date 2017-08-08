package com.searchincite.client.widgets.dialogs;

import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.DockPanel;
import com.google.gwt.user.client.ui.FileUpload;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.FlexTable.FlexCellFormatter;
import com.google.gwt.user.client.ui.FormHandler;
import com.google.gwt.user.client.ui.FormPanel;
import com.google.gwt.user.client.ui.FormSubmitCompleteEvent;
import com.google.gwt.user.client.ui.FormSubmitEvent;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HTMLTable.CellFormatter;
import com.google.gwt.user.client.ui.Hidden;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.KeyboardListener;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.searchincite.client.entity.ChangeEvent;
import com.searchincite.client.entity.Document;
import com.searchincite.client.listeners.DocumentChangeListener;
import com.searchincite.client.services.DocumentServiceProxy;

public class UploadDocumentDialog
  extends DialogBox
  implements DocumentChangeListener, KeyboardListener
{
  private int m_iDocumentSourceID = -1;
  FormPanel m_frmUpload = new FormPanel();
  DockPanel m_pnlOuter = new DockPanel();
  FlexTable m_tblMain = new FlexTable();
  HorizontalPanel m_pnlButtons = new HorizontalPanel();
  TextBox m_txtDescription = new TextBox();
  ScrollPanel m_lstOntologies = new ScrollPanel();
  VerticalPanel m_pnlUpload = new VerticalPanel();
  Button m_btnOK = null;
  private DocumentChangeListener m_DocumentChangeListener = null;
  
  public UploadDocumentDialog(Document d, int iDocumentSourceID, DocumentChangeListener listener)
  {
    this.m_DocumentChangeListener = listener;
    
    this.m_iDocumentSourceID = iDocumentSourceID;
    
    setText("Upload Document");
    
    this.m_pnlOuter.setSpacing(4);
    
    HorizontalPanel pnlCaption = new HorizontalPanel();
    HTML text = new HTML("Specify the filename and optional description for file to upload below, then click OK to upload the file or Cancel to close this dialog.");
    
    pnlCaption.add(text);
    
    this.m_pnlOuter.add(pnlCaption, DockPanel.NORTH);
    
    this.m_tblMain.setSize("100%", "100%");
    
    this.m_pnlButtons.setHorizontalAlignment(HorizontalPanel.ALIGN_RIGHT);
    this.m_pnlButtons.setSpacing(4);
    HTML htmlCaption1 = new HTML();
    htmlCaption1.setHTML("<b>Description:</b>");
    
    this.m_tblMain.setWidget(1, 0, htmlCaption1);
    this.m_tblMain.getFlexCellFormatter().setWordWrap(1, 0, false);
    this.m_tblMain.setWidget(1, 1, this.m_txtDescription);
    this.m_txtDescription.setWidth("100%");
    this.m_tblMain.getFlexCellFormatter().setColSpan(1, 1, 2);
    

    this.m_frmUpload.setAction("upload");
    this.m_frmUpload.setEncoding("multipart/form-data");
    this.m_frmUpload.setMethod("post");
    
    this.m_pnlUpload = new VerticalPanel();
    this.m_frmUpload.setWidget(this.m_pnlUpload);
    FileUpload upload = new FileUpload();
    upload.setName("file");
    this.m_pnlUpload.add(upload);
    
    this.m_frmUpload.addFormHandler(new FormHandler()
    {
      public void onSubmit(FormSubmitEvent formSubmitEvent) {}
      
      public void onSubmitComplete(FormSubmitCompleteEvent formSubmitCompleteEvent)
      {
        UploadDocumentDialog.this.m_DocumentChangeListener.onDocumentChange(null, new ChangeEvent(true, false, false));
        





        //UploadDocumentDialog.this.hide();
      }
    });
    HTML htmlCaption2 = new HTML();
    htmlCaption2.setHTML("<b>Filename:</b>");
    this.m_tblMain.setWidget(2, 0, htmlCaption2);
    this.m_tblMain.getFlexCellFormatter().setVerticalAlignment(2, 0, VerticalPanel.ALIGN_TOP);
    

    this.m_tblMain.setWidget(2, 1, this.m_frmUpload);
    this.m_tblMain.getFlexCellFormatter().setColSpan(2, 1, 2);
    this.m_tblMain.getFlexCellFormatter().setVerticalAlignment(2, 1, VerticalPanel.ALIGN_TOP);
    


    HorizontalPanel pnlButtons = new HorizontalPanel();
    pnlButtons.setSpacing(4);
    this.m_btnOK = new Button("OK", new ClickListener()
    {
      public void onClick(Widget sender)
      {
        Hidden fldDocumentSourceID = new Hidden();
        fldDocumentSourceID.setName("documentSourceID");
        fldDocumentSourceID.setValue(String.valueOf(UploadDocumentDialog.this.m_iDocumentSourceID));
        
        UploadDocumentDialog.this.m_pnlUpload.add(fldDocumentSourceID);
        
        Hidden fldDescription = new Hidden();
        fldDescription.setName("documentDescription");
        fldDescription.setValue(UploadDocumentDialog.this.m_txtDescription.getText());
        UploadDocumentDialog.this.m_pnlUpload.add(fldDescription);
        


        UploadDocumentDialog.this.m_frmUpload.submit();
        UploadDocumentDialog.this.hide();
      }
    });
    Button btnCancel = new Button("Cancel", new ClickListener()
    {
      public void onClick(Widget sender)
      {
        UploadDocumentDialog.this.hide();
      }
    });
    pnlButtons.add(this.m_btnOK);
    pnlButtons.add(btnCancel);
    
    this.m_tblMain.setWidget(4, 2, pnlButtons);
    this.m_tblMain.getCellFormatter().setHorizontalAlignment(4, 2, HorizontalPanel.ALIGN_RIGHT);
    
    this.m_tblMain.getCellFormatter().setVerticalAlignment(4, 2, VerticalPanel.ALIGN_BOTTOM);
    
    this.m_tblMain.getCellFormatter().setHeight(4, 2, "55px");
    
    this.m_txtDescription.addKeyboardListener(this);
    
    this.m_pnlOuter.add(this.m_tblMain, DockPanel.CENTER);
    this.m_pnlOuter.setSpacing(8);
    
    this.m_pnlOuter.setSize("100%", "100%");
    setWidget(this.m_pnlOuter);
    
    fillList();
    
    setSize("325px", "250px");
  }
  
  public void fillList() {}
  
  public void show()
  {
    super.show();
    int left = (Window.getClientWidth() - getOffsetWidth()) / 2 + getBodyScrollLeft();
    
    int top = (Window.getClientHeight() - getOffsetHeight()) / 2 + getBodyScrollTop();
    
    setPopupPosition(left, top);
    this.m_txtDescription.selectAll();
    this.m_txtDescription.setFocus(true);
  }
  
	private native int getBodyScrollLeft() /*-{
	 return $doc.body.scrollLeft;
	 }-*/;

	private native int getBodyScrollTop() /*-{
	 return $doc.body.scrollTop;
	 }-*/;
  
  public void createDocument(Document doc)
  {
    DocumentServiceProxy proxy = new DocumentServiceProxy();
    proxy.addDocumentChangeListener(this);
    proxy.addDocumentChangeListener(this.m_DocumentChangeListener);
    proxy.createDocument(doc);
  }
  
  public void onDocumentChange(Document doc, ChangeEvent event)
  {
    if ((event.isCreate()) || (event.isUpdate())) {
      hide();
    }
  }
  
  public void updateDocument(Document doc)
  {
    DocumentServiceProxy proxy = new DocumentServiceProxy();
    proxy.addDocumentChangeListener(this);
    proxy.addDocumentChangeListener(this.m_DocumentChangeListener);
    proxy.updateDocument(doc);
  }
  
  public void onKeyDown(Widget sender, char keyCode, int modifiers) {}
  
  public void onKeyPress(Widget sender, char keyCode, int modifiers)
  {
    if ((sender == this.m_txtDescription) && (keyCode == '\r')) {
      this.m_btnOK.click();
    } else if (keyCode == '\033') {
      hide();
    }
  }
  
  public void onKeyUp(Widget sender, char keyCode, int modifiers) {}
}
