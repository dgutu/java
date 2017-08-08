package com.searchincite.client.widgets.dialogs;

import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.DockPanel;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.KeyboardListener;
import com.google.gwt.user.client.ui.RadioButton;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.searchincite.client.entity.Category;
import com.searchincite.client.entity.ChangeEvent;
import com.searchincite.client.entity.Document;
import com.searchincite.client.entity.DocumentSource;
import com.searchincite.client.listeners.CategoryChangeListener;
import com.searchincite.client.listeners.DocumentChangeListener;
import com.searchincite.client.listeners.DocumentSourceChangeListener;
import com.searchincite.client.services.CategoryServiceProxy;
import com.searchincite.client.services.DocumentServiceProxy;
import com.searchincite.client.widgets.OntologyList;

  public class ResetDocumentsDialog extends DialogBox implements DocumentChangeListener, KeyboardListener {

	//private boolean m_bEditing = false;
	//private Category m_Category = null;
	private int m_iDocumentSourceID = 0;
    DockPanel m_pnlOuter = new DockPanel();
	FlexTable m_tblMain = new FlexTable();
	HorizontalPanel m_pnlButtons = new HorizontalPanel();
    TextBox m_txtName = new TextBox();
    RadioButton m_btnAllDocuments = new RadioButton(null);
    RadioButton m_btnSomeDocuments = new RadioButton(null);
    
	private Button m_btnCancel = new Button("Cancel", new ClickListener() {
	      public void onClick(Widget sender) {
		        cancel();
		      }
	      }
	);

	private DocumentChangeListener m_DocumentChangeListener = null;
	
	public ResetDocumentsDialog(int iDocumentSourceID, DocumentChangeListener listener) {
		  
		super();
		
		m_iDocumentSourceID = iDocumentSourceID;
		m_DocumentChangeListener = listener;
		
		setText("Reset Documents");
	    
		m_pnlOuter.setSpacing(4);

	    HorizontalPanel pnlCaption = new HorizontalPanel();
	    HTML text = new HTML("This function will reset some or all Documents in the selected<br>Document Source to uploaded status.");
	    pnlCaption.add(text);
	    m_pnlOuter.add(pnlCaption, DockPanel.NORTH);

	    m_tblMain.setSize("100%", "100%");

	    m_pnlButtons.setHorizontalAlignment(HorizontalPanel.ALIGN_RIGHT);
	    m_pnlButtons.setSpacing(4);
	    Button btnOK = new Button("OK", new ClickListener() {
	      public void onClick(Widget sender) {
	    	  onClickOK();
	      }
	    });
	    
	    m_btnAllDocuments.setText("Reset all documents");
	    m_btnAllDocuments.setChecked(true);
	    m_tblMain.setWidget(1, 1, m_btnAllDocuments);

	    m_btnSomeDocuments.setText("Reset 100 most recent documents");
	    m_tblMain.setWidget(2, 1, m_btnSomeDocuments);

	    HorizontalPanel pnlButtons = new HorizontalPanel();
	    pnlButtons.setSpacing(4); 
	    pnlButtons.add(btnOK);
	    pnlButtons.add(m_btnCancel);
	    
	    m_tblMain.setWidget(3, 2, pnlButtons);
	    m_tblMain.getCellFormatter().setHorizontalAlignment(3, 2, HorizontalPanel.ALIGN_RIGHT);
	    m_tblMain.getCellFormatter().setVerticalAlignment(3, 2, VerticalPanel.ALIGN_BOTTOM);
	    m_tblMain.getCellFormatter().setHeight(3, 2, "55px");
	    
	    m_pnlOuter.add(m_tblMain, DockPanel.CENTER);
	    m_pnlOuter.setSpacing(8);

	    setWidget(m_pnlOuter);
  }

	private void onClickOK() {

		if (!m_btnAllDocuments.isChecked() && !this.m_btnSomeDocuments.isChecked()) {
			Window.alert("Please select the number of documents to reset");
			return;
		}
		
		executeReset();
	}
	
	public void show() {
		  super.show();
		  int left = (Window.getClientWidth() - getOffsetWidth()) / 2 + getBodyScrollLeft();
		  int top = (Window.getClientHeight() - getOffsetHeight()) / 2 + getBodyScrollTop();
		  setPopupPosition(left, top);
		  m_txtName.selectAll();
		  m_txtName.setFocus(true);
	  }

	  private native int getBodyScrollLeft() /*-{
	        return $doc.body.scrollLeft;
	      }-*/;

	  private native int getBodyScrollTop() /*-{
	        return $doc.body.scrollTop;
	      }-*/;

	public void executeReset() {

		DocumentServiceProxy proxy = new DocumentServiceProxy();
		proxy.addDocumentChangeListener(m_DocumentChangeListener);
		proxy.addDocumentChangeListener(this);
		
		int iNumberOfDocumentsToReset = m_btnSomeDocuments.isChecked() ? 100 : 1000000;
		
		proxy.updateStatusOfDocsInSource(m_iDocumentSourceID, 1 /* STATUS_UPLOADED = 1 - see DocumentData */, iNumberOfDocumentsToReset);
	}

	public void onKeyDown(Widget sender, char keyCode, int modifiers) {
	}

	private void cancel() {
		hide();
	}
	
	public void onKeyPress(Widget sender, char keyCode, int modifiers) {
		if (/*sender == m_txtName && */ keyCode == 13) {
			onClickOK();
		}
		else if (keyCode == 27) {
			cancel();
		}
	}

	public void onKeyUp(Widget sender, char keyCode, int modifiers) {
	}

	public void onDocumentChange(Document d, ChangeEvent event) {
		if (event.isCreate() || event.isUpdate()) {
			hide();
		}
	}

  }
