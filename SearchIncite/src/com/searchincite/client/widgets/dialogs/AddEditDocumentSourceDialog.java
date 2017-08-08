package com.searchincite.client.widgets.dialogs;

import java.util.ArrayList;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.DockPanel;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.KeyboardListener;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.searchincite.client.entity.ChangeEvent;
import com.searchincite.client.entity.DocumentSource;
import com.searchincite.client.entity.Ontology;
import com.searchincite.client.listeners.DocumentSourceChangeListener;
import com.searchincite.client.services.DocumentSourceServiceProxy;
import com.searchincite.client.services.OntologyService;
import com.searchincite.client.services.OntologyServiceAsync;

  public class AddEditDocumentSourceDialog extends DialogBox implements DocumentSourceChangeListener, KeyboardListener {

	private boolean m_bEditing = false;
	private DocumentSource m_DocumentSource = null;
	
    DockPanel m_pnlOuter = new DockPanel();
	FlexTable m_tblMain = new FlexTable();
	HorizontalPanel m_pnlButtons = new HorizontalPanel();
    TextBox m_txtDocumentSource = new TextBox();
    ScrollPanel m_lstOntologies = new ScrollPanel();
    VerticalPanel m_pnlOntologies = new VerticalPanel();
    Button m_btnOK = null;
    
    Button m_btnCancel = new Button("Cancel", new ClickListener() {
	      public void onClick(Widget sender) {
	        cancel();
	      }
	    });
  
	private DocumentSourceChangeListener m_DocumentSourceChangeListener = null;
	
	public AddEditDocumentSourceDialog(DocumentSource s, DocumentSourceChangeListener listener) {
		  
			super();
			
			m_DocumentSourceChangeListener = listener;
			m_DocumentSource = s;
			m_bEditing = m_DocumentSource != null;
			
			if (m_bEditing) {
				setText("Edit Document Source");
				m_txtDocumentSource.setText(s.getDocumentSource());
			}
			else {
				setText("New Document Source");
			}
		    
			m_pnlOuter.setSpacing(4);

		    HorizontalPanel pnlCaption = new HorizontalPanel();
		    HTML text = new HTML("Enter information for the new Document Source below,<br>then click OK to save or Cancel to close this dialog.");
		    pnlCaption.add(text);
		    //text.setWordWrap(true);
		    m_pnlOuter.add(pnlCaption, DockPanel.NORTH);

		    m_tblMain.setSize("100%", "100%");

		    m_pnlButtons.setHorizontalAlignment(HorizontalPanel.ALIGN_RIGHT);
		    m_pnlButtons.setSpacing(4);
		    m_btnOK = new Button("OK", new ClickListener() {
		      public void onClick(Widget sender) {
		    	  
		    	if (!m_bEditing) {
			    	m_DocumentSource = new DocumentSource();
		    	}

		    	if (m_txtDocumentSource.getText().trim().length() == 0) {
		    		Window.alert("Please specify a Document Source name");
		    		return;
		    	}
		    	
		    	m_DocumentSource.setDocumentSource(m_txtDocumentSource.getText().trim());

		    	// Get selected ontologies and store in document source (s)
		    	ArrayList arrLstOntologies = new ArrayList();
		    	
		    	for (int iOntologies = 0; iOntologies < m_pnlOntologies.getWidgetCount(); iOntologies++) {
		    		CheckBox chk = ((CheckBox)m_pnlOntologies.getWidget(iOntologies));
		    		if (chk.isChecked()) {
		    			Ontology o = new Ontology();
		    			o.setOntologyID(Integer.parseInt(chk.getName()));
		    			arrLstOntologies.add(o);
		    		}
		    	}

		    	if (arrLstOntologies.size() == 0) {
		    		Window.alert("Please select at least one Ontology");
		    		return;
		    	}
		    	
		    	Ontology[] arrOntologies = new Ontology[arrLstOntologies.size()];
		    	for (int iOntologies = 0; iOntologies < arrLstOntologies.size(); iOntologies++) {
	    			Ontology o = (Ontology)arrLstOntologies.get(iOntologies);
	    			arrOntologies[iOntologies] = o;
		    	}
		    	
		    	m_DocumentSource.setOntologies(arrOntologies);
		    	  
		    	if (!m_bEditing) {
			    	createDocumentSource(m_DocumentSource);
		    	}
		    	else {
		    		updateDocumentSource(m_DocumentSource);
		    	}
		    	  
		      }
		    });

		    HTML htmlCaption1 = new HTML();
		    htmlCaption1.setHTML("<b>Document Source:</b>");
		    
		    m_tblMain.setWidget(1, 0, htmlCaption1);
		    m_tblMain.getFlexCellFormatter().setWordWrap(1, 0, false);
		    m_tblMain.setWidget(1, 1, m_txtDocumentSource);
		    m_txtDocumentSource.setWidth("100%");
		    m_txtDocumentSource.addKeyboardListener(this);
		    m_tblMain.getFlexCellFormatter().setColSpan(1, 1, 2);

		    HTML htmlCaption2 = new HTML();
		    htmlCaption2.setHTML("<b>Ontologies:</b>");

		    m_tblMain.setWidget(2, 0, htmlCaption2);
		    //m_lstOntologies.setVisibleItemCount(2);
		    m_lstOntologies.setHeight("100px");
		    m_lstOntologies.setWidth("100%");
		    
		    m_lstOntologies.add(m_pnlOntologies);
		    
		    m_tblMain.setWidget(2, 1, m_lstOntologies);

		    m_tblMain.getFlexCellFormatter().setVerticalAlignment(2, 0, VerticalPanel.ALIGN_TOP);
		    m_tblMain.getFlexCellFormatter().setColSpan(2, 1, 2);
		    m_tblMain.getFlexCellFormatter().setWidth(2, 1, "100%");
		    
		    /*
		    HTML htmlWeightCaption = new HTML();
		    htmlWeightCaption.setHTML("<b>Weight:</b>");
		    
		    m_tblMain.setWidget(2, 0, htmlWeightCaption);
		    m_tblMain.setWidget(2, 1, m_txtWeight);
		    m_tblMain.getFlexCellFormatter().setColSpan(2, 1, 2);

		    HTML htmlColorCaption = new HTML();
		    htmlColorCaption.setHTML("<b>Color:</b>");
		    
		    m_tblMain.setWidget(3, 0, htmlColorCaption);
		    m_tblMain.setWidget(3, 1, m_txtColor);
		    m_tblMain.getFlexCellFormatter().setColSpan(3, 1, 2);
			*/
		    
		    HorizontalPanel pnlButtons = new HorizontalPanel();
		    pnlButtons.setSpacing(4); 
		    pnlButtons.add(m_btnOK);
		    pnlButtons.add(m_btnCancel);
		    
		    m_tblMain.setWidget(4, 2, pnlButtons);
		    m_tblMain.getCellFormatter().setHorizontalAlignment(4, 2, HorizontalPanel.ALIGN_RIGHT);
		    m_tblMain.getCellFormatter().setVerticalAlignment(4, 2, VerticalPanel.ALIGN_BOTTOM);
		    m_tblMain.getCellFormatter().setHeight(4, 2, "55px");

		    m_pnlOuter.add(m_tblMain, DockPanel.CENTER);
		    m_pnlOuter.setSpacing(8);

		    m_pnlOuter.setSize("100%", "100%");
		    setWidget(m_pnlOuter);
		    
		    fillList();
		    
		    this.setSize("325px", "250px");
	  }

	public void fillList() {
		
		OntologyServiceAsync ontologyService = (OntologyServiceAsync)GWT.create(OntologyService.class);
        ServiceDefTarget endpoint = (ServiceDefTarget)ontologyService;
        String moduleRelativeURL = GWT.getModuleBaseURL() + "ontology";
        endpoint.setServiceEntryPoint(moduleRelativeURL);

        AsyncCallback callback = new AsyncCallback() {

        	public void onSuccess(Object result) {

        		Ontology[] arrOntologies = (Ontology[])result;
        		for (int i = 0; i < arrOntologies.length; i++) {
        			Ontology o = arrOntologies[i];
        			CheckBox cb = new CheckBox();
        			cb.setName(String.valueOf(o.getOntologyID()));
        			cb.setText(o.getName());
        			
        			if (m_bEditing) {
        				// If we are editing, go through the ontologies in the document source
        				// that we are editing to see if we need to check the checkbox.
        				Ontology[] arrOntologiesInSource = m_DocumentSource.getOntologies();
        				for (int iDSOntologies = 0; iDSOntologies < arrOntologiesInSource.length; iDSOntologies++) {
        					Ontology ontologyInSource = arrOntologiesInSource[iDSOntologies];
        					if (ontologyInSource.getOntologyID() == o.getOntologyID()) {
        						cb.setChecked(true);
        					}       					
        				}
        			}
        			
        			m_pnlOntologies.add(cb);
        		}
        	}

            public void onFailure(Throwable caught) {
            	Window.alert("AddEditDocumentSourceDialog::fillList() -- service call failed.");
            }
        };
        
        ontologyService.getOntologiesForOrganization(Ontology.FIELD_ID | Ontology.FIELD_NAME, callback);
	}
	
	public void show() {
		  super.show();
		  int left = (Window.getClientWidth() - getOffsetWidth()) / 2 + getBodyScrollLeft();
		  int top = (Window.getClientHeight() - getOffsetHeight()) / 2 + getBodyScrollTop();
		  setPopupPosition(left, top);
		  m_txtDocumentSource.selectAll();
		  m_txtDocumentSource.setFocus(true);
	  }

	/*
	public int getSelectedOntologyID() {
		
		int iSelectedIndex = m_lstOntology.getSelectedIndex();
		
		if (iSelectedIndex != -1) {
			return Integer.parseInt(m_lstOntology.getValue(iSelectedIndex));
		}
		
		return -1; 
	}
	*/
	  private native int getBodyScrollLeft() /*-{
	        return $doc.body.scrollLeft;
	      }-*/;

	  private native int getBodyScrollTop() /*-{
	        return $doc.body.scrollTop;
	      }-*/;
	
		public void createDocumentSource(DocumentSource ds) {
			DocumentSourceServiceProxy proxy = new DocumentSourceServiceProxy();
			proxy.addDocumentSourceChangeListener(this);
			proxy.addDocumentSourceChangeListener(m_DocumentSourceChangeListener);
			proxy.createDocumentSource(ds);
		}

	public void onDocumentSourceChange(DocumentSource c, ChangeEvent event) {
		if (event.isCreate() || event.isUpdate()) {
			hide();
		}
	}

	public void updateDocumentSource(DocumentSource ds) {
		DocumentSourceServiceProxy proxy = new DocumentSourceServiceProxy();
		proxy.addDocumentSourceChangeListener(this);
		proxy.addDocumentSourceChangeListener(m_DocumentSourceChangeListener);
		proxy.updateDocumentSource(ds);
	}
	
	private void cancel() {
		hide();
	}

	public void onKeyDown(Widget sender, char keyCode, int modifiers) {
		// TODO Auto-generated method stub
		
	}

	public void onKeyPress(Widget sender, char keyCode, int modifiers) {

		if (sender == m_txtDocumentSource && keyCode == 13) {
			m_btnOK.click();
		}
		if (keyCode == 27) {
			cancel();
		}
	}

	public void onKeyUp(Widget sender, char keyCode, int modifiers) {
		// TODO Auto-generated method stub
		
	}

  }
