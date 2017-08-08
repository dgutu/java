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
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.searchincite.client.entity.Category;
import com.searchincite.client.entity.ChangeEvent;
import com.searchincite.client.entity.Ontology;
import com.searchincite.client.listeners.OntologyChangeListener;
import com.searchincite.client.services.OntologyServiceProxy;
import com.searchincite.client.widgets.OntologyList;

  public class AddEditOntologyDialog extends DialogBox implements OntologyChangeListener, KeyboardListener {

	private boolean m_bEditing = false;
	private Ontology m_Ontology = null;
	private Category m_Category = null;
	
    DockPanel m_pnlOuter = new DockPanel();
	FlexTable m_tblMain = new FlexTable();
	HorizontalPanel m_pnlButtons = new HorizontalPanel();
    TextBox m_txtName = new TextBox();
    TextBox m_txtDescription = new TextBox();
    Button m_btnOK = null;
	
	private OntologyList m_lstOntology = new OntologyList(true);
	private OntologyChangeListener m_OntologyChangeListener = null;
	
	public AddEditOntologyDialog(Ontology o, Category category, OntologyChangeListener listener) {
		  
			super();
			
			m_OntologyChangeListener = listener;
			m_Ontology = o;
			m_bEditing = m_Ontology != null;
			m_Category = category;
			
			if (m_bEditing) {
				setText("Edit Ontology");
				m_txtName.setText(o.getName());
				m_txtDescription.setText(o.getDescription());
			}
			else {
				setText("New Ontology");
				m_Ontology = new Ontology();
				m_Ontology.setOrganizationID(m_Category.getOrganizationID());
				m_Ontology.setCategoryID(m_Category.getCategoryID());
			}
		    
		    // Create a DockPanel to contain the ontology list
			m_pnlOuter.setSpacing(4);

		    HorizontalPanel pnlCaption = new HorizontalPanel();
		    HTML text = new HTML("Enter information for the new Ontology below,<br>then click OK to save or Cancel to close this dialog.");
		    pnlCaption.add(text);
		    //text.setWordWrap(true);
		    m_pnlOuter.add(pnlCaption, DockPanel.NORTH);

		    m_tblMain.setSize("100%", "100%");

		    m_pnlButtons.setHorizontalAlignment(HorizontalPanel.ALIGN_RIGHT);
		    m_pnlButtons.setSpacing(4);
		    m_btnOK = new Button("OK", new ClickListener() {
		      public void onClick(Widget sender) {

		    	m_Ontology.setName(m_txtName.getText());
	    		m_Ontology.setDescription(m_txtDescription.getText());
	    		//m_Ontology.setCategoryID()

		    	if (m_bEditing) {
		    		updateOntology(m_Ontology);
		    	}
		    	else {
			    	createOntology(m_Ontology);
		    	}
		    	  
		      }
		    });
		    
		    Button btnCancel = new Button("Cancel", new ClickListener() {
			      public void onClick(Widget sender) {
			        hide();
			      }
			    });
		    
		    HTML htmlNameCaption = new HTML();
		    htmlNameCaption.setHTML("<b>Ontology name:</b>");
		    
		    m_tblMain.setWidget(1, 0, htmlNameCaption);
		    m_tblMain.setWidget(1, 1, m_txtName);
		    m_tblMain.getFlexCellFormatter().setColSpan(1, 1, 2);

		    HTML htmlDescCaption = new HTML();
		    htmlDescCaption.setHTML("<b>Description:</b>");

		    m_tblMain.setWidget(2, 0, htmlDescCaption);
		    m_tblMain.setWidget(2, 1, m_txtDescription);
		    m_tblMain.getFlexCellFormatter().setColSpan(2, 1, 2);

		    HorizontalPanel pnlButtons = new HorizontalPanel();
		    pnlButtons.setSpacing(4); 
		    pnlButtons.add(m_btnOK);
		    pnlButtons.add(btnCancel);
		    
		    m_tblMain.setWidget(3, 2, pnlButtons);
		    m_tblMain.getCellFormatter().setHorizontalAlignment(3, 2, HorizontalPanel.ALIGN_RIGHT);
		    m_tblMain.getCellFormatter().setVerticalAlignment(3, 2, VerticalPanel.ALIGN_BOTTOM);
		    m_tblMain.getCellFormatter().setHeight(2, 2, "55px");
		    
		    m_pnlOuter.add(m_tblMain, DockPanel.CENTER);
		    m_pnlOuter.setSpacing(8);

		    m_txtName.addKeyboardListener(this);
		    m_txtDescription.addKeyboardListener(this);
		    
		    setWidget(m_pnlOuter);
	  }

	public void show() {
		  super.show();
		  int left = (Window.getClientWidth() - getOffsetWidth()) / 2 + getBodyScrollLeft();
		  int top = (Window.getClientHeight() - getOffsetHeight()) / 2 + getBodyScrollTop();
		  setPopupPosition(left, top);
		  m_txtName.selectAll();
		  m_txtName.setFocus(true);
	  }

	public int getSelectedOntologyID() {
		
		int iSelectedIndex = m_lstOntology.getSelectedIndex();
		
		if (iSelectedIndex != -1) {
			return Integer.parseInt(m_lstOntology.getValue(iSelectedIndex));
		}
		
		return -1; 
	}
	
	  private native int getBodyScrollLeft() /*-{
	        return $doc.body.scrollLeft;
	      }-*/;

	  private native int getBodyScrollTop() /*-{
	        return $doc.body.scrollTop;
	      }-*/;
	
		public void createOntology(Ontology ontology) {
			OntologyServiceProxy proxy = new OntologyServiceProxy();
			proxy.addOntologyChangeListener(this);
			proxy.addOntologyChangeListener(m_OntologyChangeListener);
			proxy.createOntology(ontology);
		}

	public void onOntologyChange(Ontology c, ChangeEvent event) {
		if (event.isCreate() || event.isUpdate()) {
			hide();
		}
	}

	public void updateOntology(Ontology ontology) {
		OntologyServiceProxy proxy = new OntologyServiceProxy();
		proxy.addOntologyChangeListener(this);
		proxy.addOntologyChangeListener(m_OntologyChangeListener);
		proxy.updateOntology(ontology);
	}

	public void onKeyDown(Widget sender, char keyCode, int modifiers) {
		// TODO Auto-generated method stub
		
	}

	public void onKeyPress(Widget sender, char keyCode, int modifiers) {

		if ((sender == m_txtDescription || sender == m_txtName) && keyCode == 13) {
			m_btnOK.click();
		}
		if (keyCode == 27) {
			cancel();
		}
	}

	public void onKeyUp(Widget sender, char keyCode, int modifiers) {
		// TODO Auto-generated method stub
		
	}

	private void cancel() {
		hide();
	}

  }
