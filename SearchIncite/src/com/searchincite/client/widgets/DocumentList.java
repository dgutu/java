package com.searchincite.client.widgets;

import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.MenuBar;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.SourcesTableEvents;
import com.google.gwt.user.client.ui.TableListener;
import com.google.gwt.user.client.ui.Widget;
import com.searchincite.client.entity.DocumentWithResult;
import com.searchincite.client.listeners.DocumentChangeListener;
import com.searchincite.client.services.DocumentServiceProxy;
import com.searchincite.client.widgets.entitylabels.DocumentLabel;

//TODO: Make this a generic class (e.g., create superclass ClickableTable) with constructor
//		that accepts a menu bar as a parameter.  Subclass DocumentList.

public class DocumentList extends FlexTable implements TableListener, ClickListener {

    private MenuBar m_ContextMenu;
    private PopupPanel m_pnlContextMenu;
    private DocumentChangeListener m_DocumentChangeListener;
    
	int m_iSelectedRow;
	
	public DocumentList(DocumentChangeListener listener) {

		super(); 
        addTableListener(this);
        m_DocumentChangeListener = listener;
        sinkEvents(Event.ONCLICK | Event.ONDBLCLICK | Event.ONKEYDOWN | Event.ONMOUSEDOWN | Event.ONMOUSEUP);
        
        m_ContextMenu = new MenuBar(true);
        m_pnlContextMenu = new PopupPanel(true);
        m_pnlContextMenu.setStyleName("contextMenuContainer");
        m_ContextMenu.addStyleName("contextMenu");
        
		m_ContextMenu.addItem("Mark as uploaded", new Command() { 
            public void execute() { 
                //Window.alert("menu item clicked"); 

        		DocumentServiceProxy proxy = new DocumentServiceProxy();
        		proxy.addDocumentChangeListener(m_DocumentChangeListener);
        		proxy.updateDocumentStatus(getSelectedDocument().getDocumentResult().getOntology().getOntologyID() , getSelectedDocument().getDocumentID(), 1);

            	m_pnlContextMenu.hide();
            }; 
		}); 
		
		m_pnlContextMenu.add(m_ContextMenu);
	}
	
	public void onBrowserEvent(Event event) {
		
		// find out which cell was actually clicked.
		Element td = getEventTargetCell(event);
		if (td == null) {
			return;
		}
		Element tr = DOM.getParent(td);
		Element body = DOM.getParent(tr);
		int row = DOM.getChildIndex(body, tr);
		//int column = DOM.getChildIndex(tr, td);

		switch (DOM.eventGetType(event)) {

			case Event.ONMOUSEDOWN: 

				if (row > 0 && row != getRowCount() -1) {
					selectRow(row);
				}
				else {
					selectRow(-1);
				}
				
				break;

			case Event.ONMOUSEUP: {

				switch(DOM.eventGetButton(event)){
					case Event.BUTTON_RIGHT:
						int iMouseX = DOM.eventGetClientX(event);
						int iMouseY = DOM.eventGetClientY(event);
						
						if (m_iSelectedRow != -1) {
							
							DocumentWithResult d = getSelectedDocument();
							
							if (d != null) {
								if (d.getDocumentResult().getDocumentStatusID() == 3 ||
										d.getDocumentResult().getDocumentStatusID() == 4 ||
										d.getDocumentResult().getDocumentStatusID() == 5 || //TODO: Use constants
										d.getDocumentResult().getDocumentStatusID() == 6) { 
									m_pnlContextMenu.setPopupPosition(iMouseX, iMouseY);
									m_pnlContextMenu.show();
								}
								//else 
									//other option to set status to 5 (do not process)
							}
						}

						break;
				}
			}
		}
	}

	public void onCellClicked(SourcesTableEvents sender, int row, int cell) {
	}

	private void selectRow(int row) {

		// De-select the currently selected row
		styleRow(m_iSelectedRow, false);
		
		m_iSelectedRow = row;
		
		//Document d = getSelectedDocument();
		
		//if (d != null) {
			styleRow(row, true);
		//}
	}

	private void styleRow(int row, boolean selected) {
		
		if (row != -1) {
			if (selected) {
				getRowFormatter().removeStyleName(row, "documentList-Row");
				getRowFormatter().addStyleName(row, "documentList-SelectedRow");
			} else {
				getRowFormatter().removeStyleName(row, "documentList-SelectedRow");
				getRowFormatter().addStyleName(row, "documentList-Row");
			}
		}
		
	}

	public void onClick(Widget sender) {
		// TODO Auto-generated method stub
		
	}

	public DocumentWithResult getSelectedDocument() {
		
		if (m_iSelectedRow != -1) {

			DocumentLabel lbl = (DocumentLabel)getWidget(m_iSelectedRow, 1);
		
			if (lbl != null) {
				// Find the document for the selected ID
				return lbl.getDocument();
			}
		}
		
		return null;
	}

	public void selectDocument(long lDocumentIDToSelect) {
		
		for (int iRow = 0; iRow < getRowCount(); iRow++) {

			if (getCellCount(iRow) < 2) {
				continue;
			}
			
			DocumentLabel lbl = (DocumentLabel)getWidget(iRow, 1);
			
			if (lbl != null) {
				if (lbl.getDocument().getDocumentID() == lDocumentIDToSelect) {
					selectRow(iRow);
					return;
				}
			}
		}
	}

	public void clearSelection() {

		m_iSelectedRow = -1;

		for (int iRow = 0; iRow < getRowCount(); iRow++) {

			if (getCellCount(iRow) < 2) {
				continue;
			}
			
			styleRow(iRow, false);
		}
	}

}
