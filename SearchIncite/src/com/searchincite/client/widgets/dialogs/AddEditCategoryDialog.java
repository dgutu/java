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
import com.searchincite.client.listeners.CategoryChangeListener;
import com.searchincite.client.services.CategoryServiceProxy;
import com.searchincite.client.widgets.OntologyList;

  public class AddEditCategoryDialog extends DialogBox implements CategoryChangeListener, KeyboardListener {

	private boolean m_bEditing = false;
	private Category m_Category = null;
    
	private Button m_btnCancel = new Button("Cancel", new ClickListener() {
	      public void onClick(Widget sender) {
		        cancel();
		      }
	      }
	);

	
    DockPanel m_pnlOuter = new DockPanel();
	FlexTable m_tblMain = new FlexTable();
	HorizontalPanel m_pnlButtons = new HorizontalPanel();
    TextBox m_txtName = new TextBox();
	
	private OntologyList m_lstOntology = new OntologyList(true);
	private CategoryChangeListener m_CategoryChangeListener = null;
	
	public AddEditCategoryDialog(Category c, CategoryChangeListener listener) {
		  
			super();
			
			m_CategoryChangeListener = listener;
			m_Category = c;
			m_bEditing = m_Category != null;
			
			if (m_bEditing) {
				setText("Edit Category");
				m_txtName.setText(c.getName());
			}
			else {
				setText("New Category");
			}
		    
		    // Create a DockPanel to contain the ontology list
			m_pnlOuter.setSpacing(4);

		    HorizontalPanel pnlCaption = new HorizontalPanel();
		    HTML text = new HTML("Enter information for the new Category below,<br>then click OK to save or Cancel to close this dialog.");
		    pnlCaption.add(text);
		    //text.setWordWrap(true);
		    m_pnlOuter.add(pnlCaption, DockPanel.NORTH);

		    m_tblMain.setSize("100%", "100%");

		    m_pnlButtons.setHorizontalAlignment(HorizontalPanel.ALIGN_RIGHT);
		    m_pnlButtons.setSpacing(4);
		    Button btnOK = new Button("OK", new ClickListener() {
		      public void onClick(Widget sender) {
		    	  onClickOK();
		      }
		    });
		    
		    HTML htmlCaption = new HTML();
		    htmlCaption.setHTML("<b>Category name:</b>");
		    
		    m_tblMain.setWidget(1, 0, htmlCaption);
		    m_tblMain.setWidget(1, 1, m_txtName);
		    m_txtName.addKeyboardListener(this);
		    m_tblMain.getFlexCellFormatter().setColSpan(1, 1, 2);
		    
		    HorizontalPanel pnlButtons = new HorizontalPanel();
		    pnlButtons.setSpacing(4); 
		    pnlButtons.add(btnOK);
		    pnlButtons.add(m_btnCancel);
		    
		    m_tblMain.setWidget(2, 2, pnlButtons);
		    m_tblMain.getCellFormatter().setHorizontalAlignment(2, 2, HorizontalPanel.ALIGN_RIGHT);
		    m_tblMain.getCellFormatter().setVerticalAlignment(2, 2, VerticalPanel.ALIGN_BOTTOM);
		    m_tblMain.getCellFormatter().setHeight(2, 2, "55px");
		    
		    m_pnlOuter.add(m_tblMain, DockPanel.CENTER);
		    m_pnlOuter.setSpacing(8);

		    setWidget(m_pnlOuter);
	  }

	private void onClickOK() {

		if (m_txtName.getText().trim().length() == 0) {
			Window.alert("Please enter a Cateogry name");
			m_txtName.setFocus(true);
			return;
		}
		
		if (!m_bEditing) {
	    	Category c = new Category();
	    	c.setName(m_txtName.getText());
	    	createCategory(c);
    	}
    	else {
    		m_Category.setName(m_txtName.getText());
    		updateCategory(m_Category);
    	}
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
	
		public void createCategory(Category category) {
			CategoryServiceProxy proxy = new CategoryServiceProxy();
			proxy.addCategoryChangeListener(this);
			proxy.addCategoryChangeListener(m_CategoryChangeListener);
			proxy.createCategory(category);
		}

	public void onCategoryChange(Category c, ChangeEvent event) {
		if (event.isCreate() || event.isUpdate()) {
			hide();
		}
	}

	public void updateCategory(Category category) {
		CategoryServiceProxy proxy = new CategoryServiceProxy();
		proxy.addCategoryChangeListener(this);
		proxy.addCategoryChangeListener(m_CategoryChangeListener);
		proxy.updateCategory(category);
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

  }
