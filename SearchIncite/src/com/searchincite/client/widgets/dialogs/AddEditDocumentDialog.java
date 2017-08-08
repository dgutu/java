package com.searchincite.client.widgets.dialogs;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.KeyboardListener;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.searchincite.client.entity.ChangeEvent;
import com.searchincite.client.entity.Document;
import com.searchincite.client.listeners.DocumentChangeListener;
import com.searchincite.client.services.DocumentService;
import com.searchincite.client.services.DocumentServiceAsync;
import com.searchincite.client.services.DocumentServiceProxy;

  public class AddEditDocumentDialog extends DialogBox implements DocumentChangeListener, KeyboardListener {

	private boolean m_bEditing = false;
	private Document m_Document = null;
	private long m_lDocumentID = -1;
	private int m_iDocumentSourceID = -1;
	
	VerticalPanel m_pnlOuter = new VerticalPanel();
    FlexTable m_tblMain = new FlexTable();
	HorizontalPanel m_pnlButtons = new HorizontalPanel();
    TextArea m_txtDocument = new TextArea();
    ScrollPanel m_lstOntologies = new ScrollPanel();
    VerticalPanel m_pnlOntologies = new VerticalPanel();
    TextBox m_txtFileName = new TextBox();
    TextBox m_txtDescription = new TextBox();

    Button m_btnCancel = new Button("Cancel", new ClickListener() {
	      public void onClick(Widget sender) {
	        cancel();
	      }
	});
  
	private DocumentChangeListener m_DocumentChangeListener = null;
	
	public AddEditDocumentDialog(long lDocumentID, int iDocumentSourceID, DocumentChangeListener listener) {
		  
			super();
			
			m_DocumentChangeListener = listener;
			//m_Document = d;
			
			m_lDocumentID = lDocumentID;
			
			m_iDocumentSourceID = iDocumentSourceID;
			//m_bEditing = m_Document != null;
			m_bEditing = m_lDocumentID != -1;
			m_Document = new Document();
			m_Document.setDocumentID(m_lDocumentID);
			
			if (m_bEditing) {
				setText("Edit Document");
				//m_txtDescription.setText(d.getDescription());
				//m_txtDocument.setText(d.getContent().toString());
				//m_txtFileName.setText(d.getFilename());
			}
			else {
				setText("New Document");
			}
		    
		    HTML htmlCaption = new HTML("<br><b>Enter information for the new Document below, then click OK to save, or Cancel to close this dialog.</b><br><br>");
		    
		    m_tblMain.setWidget(0, 0, htmlCaption);
		    m_tblMain.getFlexCellFormatter().setColSpan(0, 0, 3);
		    
		    m_tblMain.setSize("100%", "100%");

		    m_pnlButtons.setHorizontalAlignment(HorizontalPanel.ALIGN_RIGHT);
		    m_pnlButtons.setSpacing(4);
		    Button btnOK = new Button("OK", new ClickListener() {
		      public void onClick(Widget sender) {
		    	  onClickOK();
		      }
		    });
		    
		    HTML htmlCaption1 = new HTML();
		    htmlCaption1.setHTML("<b>Description:</b>");
		    m_tblMain.setWidget(2, 0, htmlCaption1);
		    m_tblMain.getFlexCellFormatter().setColSpan(2, 1, 2);
		    m_tblMain.getFlexCellFormatter().setWidth(2, 1, "90%");
		    m_tblMain.setWidget(2, 1, m_txtDescription);

		    m_txtDocument.setWidth("100%");
		    
		    HTML htmlCaption2 = new HTML();
		    htmlCaption2.setHTML("<b>Filename:</b>");
		    m_tblMain.setWidget(1, 0, htmlCaption2);
		    m_tblMain.getFlexCellFormatter().setWordWrap(1, 0, false);
		    m_tblMain.setWidget(1, 1, m_txtFileName);
		    m_txtDocument.setWidth("100%");
		    m_tblMain.getFlexCellFormatter().setColSpan(1, 1, 2);

		    HTML htmlCaption3 = new HTML();
		    htmlCaption3.setHTML("<b>Document Text:</b>");
		    m_tblMain.setWidget(3, 0, htmlCaption3);
		    m_tblMain.getFlexCellFormatter().setColSpan(3, 0, 3);

		    m_tblMain.setWidget(4, 0, m_txtDocument);
		    m_txtDocument.setSize("100%", "100%");
		    m_tblMain.getFlexCellFormatter().setHeight(4, 0, "100%");
		    m_tblMain.getFlexCellFormatter().setColSpan(4, 0, 3);
		    
		    m_tblMain.getFlexCellFormatter().setVerticalAlignment(4, 0, VerticalPanel.ALIGN_TOP);

		    HorizontalPanel pnlButtons = new HorizontalPanel();
		    pnlButtons.setSpacing(4); 
		    pnlButtons.add(btnOK);
		    pnlButtons.add(m_btnCancel);
		    
		    m_tblMain.setWidget(5, 0, pnlButtons);
		    m_tblMain.getFlexCellFormatter().setColSpan(5, 0, 3);
		    m_tblMain.getCellFormatter().setHorizontalAlignment(5, 0, HorizontalPanel.ALIGN_RIGHT);
		    m_tblMain.getCellFormatter().setVerticalAlignment(5, 0, VerticalPanel.ALIGN_BOTTOM);
		    m_tblMain.getCellFormatter().setHeight(5, 0, "40px");
		    
		    m_pnlOuter.add(m_tblMain);
		    m_pnlOuter.setSpacing(2);

		    m_pnlOuter.setSize("100%", "100%");
		    setWidget(m_pnlOuter);
		    
		    // add keyboard listeners for ENTER keypress in edit boxes
		    m_txtDescription.addKeyboardListener(this);
		    m_txtFileName.addKeyboardListener(this);
		    m_txtDocument.addKeyboardListener(this);
		    
		    if (m_bEditing) {
		    	loadDocument();
		    }
		    
		    this.setSize("600px", "400px");

		    m_txtDescription.setFocus(true);
	}

	private void onClickOK() {
    	
		if (m_txtDescription.getText().trim().length() == 0) {
    		Window.alert("Please enter a Description");
    		m_txtDescription.setFocus(true);
    		return;
    	}
    	if (m_txtFileName.getText().trim().length() == 0) {
    		Window.alert("Please enter a Filename");
    		m_txtFileName.setFocus(true);
    		return;
    	}
    	if (m_txtDocument.getText().trim().length() == 0) {
    		Window.alert("Please enter the Document Text");
    		m_txtDocument.setFocus(true);
    		return;
    	}
    	  
    	m_Document.setDescription(m_txtDescription.getText());
		m_Document.setDocumentSourceID(m_iDocumentSourceID);
		m_Document.setFilename(m_txtFileName.getText());
		m_Document.setContentString(m_txtDocument.getText());
    	  
    	if (!m_bEditing) {
	    	//m_Document.setDocumentStatusID(1); //TODO: Use constant (1 = uploaded)
	    	createDocument(m_Document);
    	}
    	else {
    		updateDocument(m_Document);
    	}
	}

	public void loadDocument() {
		
		DocumentServiceAsync svc = (DocumentServiceAsync)GWT.create(DocumentService.class);
        ServiceDefTarget endpoint = (ServiceDefTarget)svc;
        String moduleRelativeURL = GWT.getModuleBaseURL() + "document";
        endpoint.setServiceEntryPoint(moduleRelativeURL);

        AsyncCallback callback = new AsyncCallback() {

        	public void onSuccess(Object result) {

        		m_Document = (Document)result;
				
        		m_txtDescription.setText(m_Document.getDescription());
				
        		try {
        		m_txtDocument.setText(m_Document.getContentString());
        		}
        		catch (Exception ex) {
        			
        		}
				
        		m_txtFileName.setText(m_Document.getFilename());

        	}

            public void onFailure(Throwable caught) {
            	Window.alert("AddEditDocumentDialog::loadDocument() -- service call failed.");
            }
        };
        
        svc.getDocumentByID(m_Document.getDocumentID(), Document.FIELD_ALL_FIELDS, callback);
	}
	
	public void show() {
		  super.show();
		  int left = (Window.getClientWidth() - getOffsetWidth()) / 2 + getBodyScrollLeft();
		  int top = (Window.getClientHeight() - getOffsetHeight()) / 2 + getBodyScrollTop();
		  setPopupPosition(left, top);
		  m_txtDocument.selectAll();
		  m_txtDocument.setFocus(true);
	  }

	private native int getBodyScrollLeft() /*-{
		return $doc.body.scrollLeft;
	}-*/;

	private native int getBodyScrollTop() /*-{
		return $doc.body.scrollTop;
	}-*/;
	
	public void createDocument(Document doc) {
			DocumentServiceProxy proxy = new DocumentServiceProxy();
			proxy.addDocumentChangeListener(this);
			proxy.addDocumentChangeListener(m_DocumentChangeListener);
			proxy.createDocument(doc);
	}

	public void onDocumentChange(Document doc, ChangeEvent event) {
		if (event.isCreate() || event.isUpdate()) {
			hide();
		}
	}

	public void updateDocument(Document doc) {
		DocumentServiceProxy proxy = new DocumentServiceProxy();
		proxy.addDocumentChangeListener(this);
		proxy.addDocumentChangeListener(m_DocumentChangeListener);
		proxy.updateDocument(doc);
	}

	public void onKeyDown(Widget sender, char keyCode, int modifiers) {
	}

	public void onKeyPress(Widget sender, char keyCode, int modifiers) {
		if ((sender == m_txtDescription || sender == m_txtFileName) && keyCode == 13) {
			onClickOK();
		}
		else if (keyCode == 27) {
			cancel();
		}
	}

	public void onKeyUp(Widget sender, char keyCode, int modifiers) {
	}

	private void cancel() {
		hide();
	}
  }
