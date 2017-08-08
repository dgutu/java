package com.searchincite.client.widgets;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.MouseListener;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.SourcesTableEvents;
import com.google.gwt.user.client.ui.TableListener;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.searchincite.client.entity.ChangeEvent;
import com.searchincite.client.entity.DocumentSource;
import com.searchincite.client.entity.Ontology;
import com.searchincite.client.listeners.DocumentSourceChangeListener;
import com.searchincite.client.listeners.DocumentSourceSelectionListener;
import com.searchincite.client.listeners.DocumentSourceSelectionListenerCollection;
import com.searchincite.client.services.DocumentSourceService;
import com.searchincite.client.services.DocumentSourceServiceAsync;
import com.searchincite.client.services.DocumentSourceServiceProxy;
import com.searchincite.client.widgets.dialogs.AddEditDocumentSourceDialog;
import com.searchincite.client.widgets.entitylabels.DocumentSourceLabel;

public class DocumentSourcePanel extends Composite implements TableListener, ClickListener, MouseListener, DocumentSourceChangeListener {

	protected DocumentSourceSelectionListenerCollection m_DocumentSourceSelectionListenerCollection = new DocumentSourceSelectionListenerCollection();

	//VerticalPanel m_tblOuter = new VerticalPanel();
	FlexTable m_tblOuter = new FlexTable();
	FlexTable m_tbl = new FlexTable();
	DocumentSource[] m_arrDocSources = null;
	private int m_iSelectedRow = -1;
	private ScrollPanel m_ScrollPanel = null;
	private int m_iDocumentSourceIDToSelect = -1;

	private Image m_imgNew = null;
	private Image m_imgEdit = null;
	private Image m_imgDelete = null;
	private Image m_imgRefresh = null;

	public DocumentSourcePanel() 
	{
		
		m_tbl.addTableListener(this);
		Init(); 
	}	

	public DocumentSourcePanel(DocumentSource[] arrDocSources) 
	{

		m_tbl.addTableListener(this);
		m_arrDocSources = arrDocSources;
		Init();
	}	

	private void Init() 
	{

		m_tbl.setSize("100%", "100%");
		m_tbl.setCellSpacing(1);  
		m_tbl.setCellPadding(1);
		m_tbl.setBorderWidth(0);
		m_tbl.setText(0,0,"ID");  
		m_tbl.setText(0,1,"Source");  
		m_tbl.setText(0, 2, "Ontologies");  
		
		m_tbl.setStyleName("documentSourceList");
		m_tbl.getCellFormatter().setStyleName(0, 0, "documentSourceList-ColumnHeader");
		m_tbl.getCellFormatter().setStyleName(0, 1, "documentSourceList-ColumnHeader");
		m_tbl.getCellFormatter().setStyleName(0, 2, "documentSourceList-ColumnHeader");
 
		//initWidget(m_tbl);
		m_ScrollPanel = new ScrollPanel();
		m_ScrollPanel.add(m_tbl);
		m_ScrollPanel.setSize("100%", "100%");

		//m_tblOuter.setSize("100%", "100%");
		m_tblOuter.setHeight("100%");
		
		InitImageButtons();
		
		m_tblOuter.setWidget(1, 0, m_ScrollPanel);
		m_tblOuter.getFlexCellFormatter().setHeight(1, 0, "100%");
		
		initWidget(m_tblOuter);
		
		m_tblOuter.setHeight("100%");
		m_ScrollPanel.setHeight("100%");
		m_tbl.setHeight("100%");
		//m_tbl.setWidth("100%");

		refreshList();
		loadDocumentSources();
	}
	
	private void InitImageButtons()
	{
		HorizontalPanel hp = new HorizontalPanel();
		hp.setSpacing(3);

		Label lbl = new Label();
		lbl.setText("Sources");
		lbl.setStyleName("documentSourceList-Title");
		
		m_imgNew = new Image("images/new.gif");
		m_imgNew.setSize("16px", "16px");
		m_imgNew.setTitle("New Document Source");
		m_imgNew.addStyleName("imageButton");
		m_imgNew.addMouseListener(this);
		m_imgNew.addClickListener(this);
		
		m_imgEdit = new Image("images/edit.gif");
		m_imgEdit.setSize("16px", "16px");
		m_imgEdit.setTitle("Edit Document Source");
		m_imgEdit.addStyleName("imageButton");
		m_imgEdit.addMouseListener(this);
		m_imgEdit.addClickListener(this);

		m_imgDelete = new Image("images/delete.gif");
		m_imgDelete.setSize("16px", "16px");
		m_imgDelete.setTitle("Delete Document Source");
		m_imgDelete.addStyleName("imageButton");
		m_imgDelete.addMouseListener(this);
		m_imgDelete.addClickListener(this);
		
		m_imgRefresh = new Image("images/refresh.gif");
		m_imgRefresh.setSize("16px", "16px");
		m_imgRefresh.setTitle("Refresh List");
		m_imgRefresh.addStyleName("imageButton");
		m_imgRefresh.addMouseListener(this);
		m_imgRefresh.addClickListener(this);

		hp.setVerticalAlignment(VerticalPanel.ALIGN_MIDDLE);
		hp.add(lbl);
		hp.add(m_imgNew);
		hp.add(m_imgEdit);
		hp.add(m_imgDelete);
		hp.add(m_imgRefresh);
		
		m_tblOuter.setWidget(0, 0, hp);
	}
	
	public void refreshList() 
	{
		
		int iRows = m_tbl.getRowCount() - 1;
		
		for (int i = 0; i < iRows; i++) 
		{
			m_tbl.removeRow(1);			
		}
		
		if (m_arrDocSources != null && m_arrDocSources.length > 0) 
		{
			for (int i = 0; i < m_arrDocSources.length; i++) 
			{
			
				DocumentSource s = m_arrDocSources[i];
				
				m_tbl.setWidget(i + 1, 0, new Label(String.valueOf(s.getDocumentSourceID())));
				m_tbl.setWidget(i + 1, 1, new DocumentSourceLabel(s));
				m_tbl.getFlexCellFormatter().setWordWrap(i + 1, 1, false);
				m_tbl.getFlexCellFormatter().setVerticalAlignment(i + 1, 0, HorizontalPanel.ALIGN_TOP);
				m_tbl.getFlexCellFormatter().setVerticalAlignment(i + 1, 1, HorizontalPanel.ALIGN_TOP);
				
				m_tbl.getRowFormatter().addStyleName(i + 1, "documentSourceList-Row");
				
				HTML htmlOntologies = new HTML();
				String strHTML = new String();
				Ontology[] arrOntologies = s.getOntologies();
				
				if (arrOntologies != null) 
				{
					for (int iOntologyCount = 0; iOntologyCount < arrOntologies.length; iOntologyCount++) 
					{
						strHTML += iOntologyCount == 0 ? "" : "<br>";
						//strHTML += "<li>" + arrOntologies[iOntologyCount].getName();
						strHTML += " " + arrOntologies[iOntologyCount].getName();
					}
				}

				htmlOntologies.setHTML(strHTML);
				m_tbl.setWidget(i + 1, 2, htmlOntologies);
				m_tbl.getFlexCellFormatter().setWordWrap(i + 1, 2, false);
			}
		}
		else 
		{
			m_tbl.setText(1, 0, "No Document Sources");
			m_tbl.getFlexCellFormatter().setColSpan(1, 0, 2);
			//m_tbl.getFlexCellFormatter().setHeight(1, 0, "100%");
			//m_tbl.getCellFormatter().setHeight(1, 0, "100%");
			m_tbl.getRowFormatter().addStyleName(1, "documentSourceList-EmptyRow");
		}

		int iRowCount = m_tbl.getRowCount();
		m_tbl.setText(iRowCount, 0, " ");
		m_tbl.getFlexCellFormatter().setColSpan(iRowCount, 0, 2);
		m_tbl.getFlexCellFormatter().setHeight(iRowCount, 0, "100%");
		m_tbl.getRowFormatter().addStyleName(iRowCount, "documentSourceList-EmptyRow");
	}

	public void onCellClicked(SourcesTableEvents sender, int row, int cell) 
	{

		// Select the row that was clicked (-1 to account for header row).
		if (row > 0 && row != m_tbl.getRowCount() -1) 
		{
			selectRow(row);
		}
		else 
		{
			selectRow(-1);
		}
	}

	public void onClick(Widget sender) 
	{

		sender.removeStyleName("imageButton-OnMouseOver");

		if (sender.equals(m_imgNew)) 
		{
			AddEditDocumentSourceDialog dlg = new AddEditDocumentSourceDialog(null, this); //TODO: Find better way to pass listener to dialogs. Perhaps create base class for all dialogs.
			dlg.show();
		} 
		else if (sender.equals(m_imgDelete)) 
		{
			
			DocumentSource s = getSelectedDocumentSource();
			
			if (s == null) 
			{
				Window.alert("Please select the Document Source to delete before choosing this option.");
				return;
			}
			
			if (Window.confirm("Delete the selected Document Source?")) 
			{
				DocumentSourceServiceProxy proxy = new DocumentSourceServiceProxy();
				proxy.addDocumentSourceChangeListener(this);
				proxy.deleteDocumentSource(s.getDocumentSourceID());
			}		
		} 
		else if (sender.equals(m_imgEdit)) 
		{
			DocumentSource s = getSelectedDocumentSource();
			
			if (s != null) 
			{
				AddEditDocumentSourceDialog dlg = new AddEditDocumentSourceDialog(s, this); //TODO: Find better way to pass listener to dialogs. Perhaps create base class for all dialogs.
				dlg.show();
			}
			else 
			{
				Window.alert("Please select the Document Source to edit before choosing this option.");
			}
		}
		else if (sender.equals(m_imgRefresh))
		{
			loadDocumentSources();
		}
	}
	
	private void selectRow(int row) 
	{
		// When a row (other than the first one, which is used as a header) is
		// selected, display its associated Phrases.

		// De-select the currently selected row
		styleRow(m_iSelectedRow, false);
		
		m_iSelectedRow = row;
		
		DocumentSource s = getSelectedDocumentSource();
		
		if (s != null) 
		{
			styleRow(row, true);
		}

		m_DocumentSourceSelectionListenerCollection.fireDocumentSourceSelected(s);
	}

	private void styleRow(int row, boolean selected) 
	{
		
		if (row != -1) 
		{
			if (selected) 
			{
				m_tbl.getRowFormatter().removeStyleName(row, "documentSourceList-Row");
				m_tbl.getRowFormatter().addStyleName(row, "documentSourceList-SelectedRow");
			} else 
			{
				m_tbl.getRowFormatter().removeStyleName(row, "documentSourceList-SelectedRow");
				m_tbl.getRowFormatter().addStyleName(row, "documentSourceList-Row");
			}
		}
		
	}

	public void addDocumentSourceSelectionListener(DocumentSourceSelectionListener listener) 
	{
		if (m_DocumentSourceSelectionListenerCollection == null) 
		{
			m_DocumentSourceSelectionListenerCollection = new DocumentSourceSelectionListenerCollection();
		}
		m_DocumentSourceSelectionListenerCollection.add(listener);
	}

	public void removeDocumentSourceSelectionListener(DocumentSourceSelectionListener listener) 
	{
		if (m_DocumentSourceSelectionListenerCollection != null) 
		{
			m_DocumentSourceSelectionListenerCollection.remove(listener);
		}
	}

	private DocumentSource getSelectedDocumentSource() 
	{
		
		if (m_iSelectedRow != -1 && m_tbl.isCellPresent(m_iSelectedRow, 1)) 
		{

			DocumentSourceLabel lbl = (DocumentSourceLabel)m_tbl.getWidget(m_iSelectedRow, 1);
		
			if (lbl != null) 
			{
		
				// Find the subject for the selected ID
				for (int i = 0; i < m_arrDocSources.length; i++) 
				{
					if (lbl.getDocumentSource() == m_arrDocSources[i]) 
					{
						return m_arrDocSources[i];
					}
				}
			}
		}
		
		return null;
	}

	private void selectDocumentSource(int iDocumentSourceIDToSelect) 
	{
		
		for (int iRow = 0; iRow < m_tbl.getRowCount(); iRow++) 
		{

			if (m_tbl.isCellPresent(iRow, 1)) {
				DocumentSourceLabel lbl = (DocumentSourceLabel)m_tbl.getWidget(iRow, 1);
				
				if (lbl != null) 
				{
					if (lbl.getDocumentSource().getDocumentSourceID() == iDocumentSourceIDToSelect) 
					{
						selectRow(iRow);
						return;
					}
				}
			}
		}
		
	}
	
	public void loadDocumentSources() 
	{
		
		DocumentSourceServiceAsync svc = (DocumentSourceServiceAsync)GWT.create(DocumentSourceService.class);
		ServiceDefTarget endpoint = (ServiceDefTarget)svc;
		String moduleRelativeURL = GWT.getModuleBaseURL() + "docsource";
		endpoint.setServiceEntryPoint(moduleRelativeURL);

		AsyncCallback callback = new AsyncCallback() 
		{
			public void onSuccess(Object result) 
			{
				m_arrDocSources = (DocumentSource[])result;
				refreshList();
				selectDocumentSource(m_iDocumentSourceIDToSelect);
			}

			public void onFailure(Throwable caught) 
			{
				Window.alert("DocumentSourcePanel::loadDocumentSource() -- service call failed.  Are you logged out?");
			}
		};
        
		svc.getDocumentSourcesForOrganization(DocumentSource.FIELD_ALL_FIELDS, callback);
	}

	
	public void onMouseDown(Widget sender, int x, int y) 
	{
		// TODO Auto-generated method stub
		
	}

	public void onMouseEnter(Widget sender) 
	{
		if (sender.equals(m_imgNew) || 
			sender.equals(m_imgEdit) ||
			sender.equals(m_imgDelete) ||
			sender.equals(m_imgRefresh)) 
		{
			sender.addStyleName("imageButton-OnMouseOver");
		}
	}

	public void onMouseLeave(Widget sender) 
	{
		if (sender.equals(m_imgNew) || 
			sender.equals(m_imgEdit) ||
			sender.equals(m_imgDelete) ||
			sender.equals(m_imgRefresh)) 
		{
			sender.removeStyleName("imageButton-OnMouseOver");
		}
	}

	public void onMouseMove(Widget sender, int x, int y) 
	{
		// TODO Auto-generated method stub
		
	}

	public void onMouseUp(Widget sender, int x, int y) 
	{
		// TODO Auto-generated method stub
	}

	public void onDocumentSourceChange(DocumentSource s, ChangeEvent event) 
	{
		if (event.isCreate() || event.isUpdate()) {
			m_iDocumentSourceIDToSelect = s.getDocumentSourceID();
		}
		//else if (event.isDelete()) {
		//}
		loadDocumentSources();
	}

}
