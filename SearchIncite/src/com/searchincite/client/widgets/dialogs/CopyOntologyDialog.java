package com.searchincite.client.widgets.dialogs;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ChangeListener;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.DockPanel;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.KeyboardListener;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RadioButton;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.searchincite.client.entity.Category;
import com.searchincite.client.entity.ChangeEvent;
import com.searchincite.client.entity.Ontology;
import com.searchincite.client.listeners.CategoryChangeListener;
import com.searchincite.client.listeners.OntologyChangeListener;
import com.searchincite.client.services.CategoryServiceProxy;
import com.searchincite.client.services.OntologyService;
import com.searchincite.client.services.OntologyServiceAsync;
import com.searchincite.client.services.OntologyServiceProxy;
import com.searchincite.client.widgets.CategoryList;
import com.searchincite.client.widgets.OntologyList;
import com.searchincite.client.widgets.OrganizationDropdown;

public class CopyOntologyDialog extends DialogBox implements CategoryChangeListener, KeyboardListener, ChangeListener, OntologyChangeListener {
	
	//private boolean m_bEditing = false;
	private Ontology m_Ontology = null;
	//private ColorPickerDialog m_ColorPickerDialog = new ColorPickerDialog();
	
    DockPanel m_pnlOuter = new DockPanel();
	FlexTable m_tblMain = new FlexTable();
	HorizontalPanel m_pnlButtons = new HorizontalPanel();
    TextBox m_txtOntologyName = new TextBox();
    TextBox m_txtNewCategory = new TextBox();
    int m_iOntologyID = -1;
    OntologyList m_lstOntology = null;
    RadioButton m_btnExistingCategory = new RadioButton("nec");
    RadioButton m_btnNewCategory = new RadioButton("nec");
    OrganizationDropdown m_lstOrganization = new OrganizationDropdown(true);
    CategoryList m_lstCategory = null;
    String m_strCategoryName;
    int m_iSelectedCategoryID = -1;
	
	private CategoryChangeListener m_CategoryChangeListener = null;
    private OntologyChangeListener m_OntologyChangeListener = null;
	
	public CopyOntologyDialog(Ontology o, String strCategoryName, OntologyChangeListener ontologyListener, CategoryChangeListener catListener) {
		  
			super();
			
			m_OntologyChangeListener = ontologyListener;
			m_CategoryChangeListener = catListener;
			m_strCategoryName = strCategoryName;
			m_Ontology = o;
			m_iOntologyID = o.getOntologyID();
			//m_bEditing = m_Subject != null;
			
			setText("Copy Ontology");
		    
			m_pnlOuter.setSpacing(4);

		    HorizontalPanel pnlCaption = new HorizontalPanel();
		    HTML text = new HTML("Select the destination Organization and Category.");
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
		    
		    Button btnCancel = new Button("Cancel", new ClickListener() {
			      public void onClick(Widget sender) {
			        hide();
			      }
			    });
		    
		    HTML htmlCaption = new HTML();
		    htmlCaption.setHTML("<b>Source Ontology:</b>");
		    
		    m_tblMain.setWidget(1, 0, htmlCaption);
		    //m_tblMain.setWidget(1, 1, m_txtName);
		    
		    //m_lstOntology = new OntologyList(false);
		    //m_lstOntology.fillList(-1);
		    //m_tblMain.setWidget(1, 1, m_lstOntology);
		    m_tblMain.setWidget(1, 1, new Label(m_Ontology.getName()));
		    m_tblMain.getFlexCellFormatter().setColSpan(1, 1, 2);

		    HTML htmlDestCaption = new HTML();
		    htmlDestCaption.setHTML("<hr size=1 width=100% /><b>Destination</b><br>");
		    m_tblMain.setWidget(2, 0, htmlDestCaption);
		    m_tblMain.getFlexCellFormatter().setColSpan(2, 0, 3);
		    
		    //m_tblMain.setBorderWidth(1);

		    HTML htmlOntologyCaption = new HTML();
		    htmlOntologyCaption.setHTML("Ontology name:");
		    m_tblMain.setWidget(3, 0, htmlOntologyCaption);
		    m_tblMain.setWidget(3, 1, m_txtOntologyName);
		    m_txtOntologyName.setText(m_Ontology.getName());
		    m_tblMain.getFlexCellFormatter().setColSpan(3, 1, 2);

		    HTML htmlWeightCaption = new HTML();
		    htmlWeightCaption.setHTML("Organization:");
		    m_lstOrganization.addChangeListener(this);
		    m_tblMain.setWidget(4, 0, htmlWeightCaption);
		    m_tblMain.setWidget(4, 1, m_lstOrganization);
		    m_tblMain.getFlexCellFormatter().setColSpan(4, 1, 2);

		    HTML htmlCategoryCaption = new HTML();
		    htmlCategoryCaption.setHTML("Category");
		    m_tblMain.setWidget(5, 0, htmlCategoryCaption);
		    m_tblMain.getFlexCellFormatter().setColSpan(5, 0, 3);

		    m_btnNewCategory.setText("New:");
		    m_tblMain.setWidget(6, 0, m_btnNewCategory);
		    m_btnNewCategory.setChecked(true);
		    m_btnNewCategory.setStyleName("indentedRadioButton");
		    m_tblMain.getFlexCellFormatter().setHorizontalAlignment(6, 0, HorizontalPanel.ALIGN_LEFT);
		    m_tblMain.setWidget(6, 1, m_txtNewCategory);
		    m_txtNewCategory.setText(m_strCategoryName);
		    m_tblMain.getFlexCellFormatter().setColSpan(6, 1, 2);

		    m_tblMain.setWidget(7, 0, m_btnExistingCategory);
		    m_btnExistingCategory.setText("Existing:");
		    m_btnExistingCategory.setStyleName("indentedRadioButton");
		    m_tblMain.getFlexCellFormatter().setHorizontalAlignment(7, 0, HorizontalPanel.ALIGN_LEFT);
		    m_lstCategory = new CategoryList(true, false, 1);
		    m_lstCategory.addChangeListener(this);
		    m_tblMain.setWidget(7, 1, m_lstCategory);
		    m_tblMain.getFlexCellFormatter().setColSpan(7, 1, 2);

		    HorizontalPanel pnlButtons = new HorizontalPanel();
		    pnlButtons.setSpacing(4); 
		    pnlButtons.add(btnOK);
		    pnlButtons.add(btnCancel);
		    
		    m_tblMain.setWidget(8, 2, pnlButtons);
		    m_tblMain.getCellFormatter().setHorizontalAlignment(8, 2, HorizontalPanel.ALIGN_RIGHT);
		    m_tblMain.getCellFormatter().setVerticalAlignment(8, 2, VerticalPanel.ALIGN_BOTTOM);
		    m_tblMain.getCellFormatter().setHeight(8, 2, "55px");
		    
		    m_pnlOuter.add(m_tblMain, DockPanel.CENTER);
		    m_pnlOuter.setSpacing(8);

		    // add keyboard listeners for ENTER keypress in edit boxes
		    m_txtOntologyName.addKeyboardListener(this);
		    m_txtNewCategory.addKeyboardListener(this);
		    m_lstCategory.addKeyboardListener(this);
		    //m_lstOntology.addKeyboardListener(this);
		    m_lstOrganization.addKeyboardListener(this);
		    m_btnExistingCategory.addKeyboardListener(this);
		    m_btnNewCategory.addKeyboardListener(this);
		
			m_txtOntologyName.setTabIndex(1);
			m_lstOrganization.setTabIndex(2);
			m_btnNewCategory.setTabIndex(3);
			m_txtNewCategory.setTabIndex(4);
			m_btnExistingCategory.setTabIndex(5);
			m_lstCategory.setTabIndex(6);
			btnOK.setTabIndex(7);
			btnCancel.setTabIndex(8);

		    //m_ColorPickerDialog.addPopupListener(this);
		    setWidget(m_pnlOuter);
		    //m_lstOrganization.setFocus(true);
	  }

	private void onClickOK() {
    	
		if (m_txtOntologyName.getText().trim().length() == 0) {
			Window.alert("Please enter an Ontology Name");
			m_txtOntologyName.setFocus(true);
			return;
		}

		if (m_lstOrganization.getSelectedIndex() == 0) {
			Window.alert("Please select an Organization");
			m_lstOrganization.setFocus(true);
			return;
		}

		m_iSelectedCategoryID = -1;
		
		if (m_btnNewCategory.isChecked()) {
			//check length (not blank)
			if (m_txtNewCategory.getText().trim().length() == 0) {
				Window.alert("Please specifiy a Category Name");
				m_txtNewCategory.setFocus(true);
				return;
			}
			//check whether this category exists in the list
			for (int iCats = 0; iCats < m_lstCategory.getItemCount(); iCats++) {
				//if exists create ontology in existing category
				if (m_lstCategory.getItemText(iCats).trim().equals(m_txtNewCategory.getText().trim())) {
					//Window.alert("The specified Category already exists in the selected Organization.  The Ontology will be copied to the existing Category in the selected Organization.");
					m_iSelectedCategoryID = Integer.parseInt(m_lstCategory.getValue(iCats));
					//m_strCreateCategoryName = m_lstCategory.getItemText(iCats).trim();
					break;
				}
			}
		}
		else if (m_btnExistingCategory.isChecked()) {
			//check selection -- cannot be index 0 (zero)
			if (m_lstCategory.getSelectedIndex() == 0) {
				Window.alert("Please select an existing Category");
				m_lstCategory.setFocus(true);
				return;
			}
			m_iSelectedCategoryID = Integer.parseInt(m_lstCategory.getValue(m_lstCategory.getSelectedIndex()));
		}
		else {
			Window.alert("Please select \"New\" or \"Existing\" category");
			return;
		}

		if (m_iSelectedCategoryID != -1) {
			//get ontologies for the category and check for dupe of specified ontology name
			copyOntology();						
		}
		else {
			// create category and copy ontology to selected organization
			createCategoryAndCopyOntology();
		}
	}
	
	public void createCategoryAndCopyOntology() {
		createCategory();
	}
	
	public void copyOntology() {
		
		//get ontologies for selected category

		OntologyServiceAsync ontologyService = (OntologyServiceAsync)GWT.create(OntologyService.class);
        ServiceDefTarget endpoint = (ServiceDefTarget)ontologyService;
        String moduleRelativeURL = GWT.getModuleBaseURL() + "ontology";
        endpoint.setServiceEntryPoint(moduleRelativeURL);

        AsyncCallback callback = new AsyncCallback() {

        	public void onSuccess(Object result) {

        		Ontology[] arrOntologies = (Ontology[])result;
        		
        		for (int iOntology = 0; iOntology < arrOntologies.length; iOntology++) {
        			if (arrOntologies[iOntology].getName().trim().equals(m_txtOntologyName.getText().trim())) {
        				Window.alert("An Ontology with this name already exists in the selected Organization and Category.  Please specify an different Ontology name or select a different Category.");
        				m_txtOntologyName.setFocus(true);
        				return;
        			}
        		}

        		
        		//Window.alert("This feature is not yet implemented.");
        		execOntologyCopy();
        	}

            public void onFailure(Throwable caught) {
        		
            	Window.alert("CopyOntologyDialog::validateOntologyName() -- service call failed.");
            	hide();
            }
        };
        
        ontologyService.getOntologiesForCategoryID(m_iSelectedCategoryID, Ontology.FIELD_ID | Ontology.FIELD_NAME, callback);
	}

	private void execOntologyCopy() {

		OntologyServiceProxy proxy = new OntologyServiceProxy();
		proxy.addOntologyChangeListener(this);
		proxy.addOntologyChangeListener(m_OntologyChangeListener);
		proxy.copyOntology(m_iOntologyID, m_iSelectedCategoryID, m_txtOntologyName.getText(), m_lstOrganization.getSelectedOrganization().getOrganizationID());
		
/*		OntologyServiceAsync ontologyService = (OntologyServiceAsync)GWT.create(OntologyService.class);
        ServiceDefTarget endpoint = (ServiceDefTarget)ontologyService;
        String moduleRelativeURL = GWT.getModuleBaseURL() + "ontology";
        endpoint.setServiceEntryPoint(moduleRelativeURL);

        AsyncCallback callback = new AsyncCallback() {

        	public void onSuccess(Object result) {
        	}

            public void onFailure(Throwable caught) {
            	Window.alert("CopyOntologyDialog::copyOntology() -- service call failed.");
        		hide();
            }
        };
        
        try {
        	ontologyService.copyOntology(m_iOntologyID, m_iSelectedCategoryID, m_txtOntologyName.getText(), m_lstOrganization.getSelectedOrganization().getOrganizationID(), callback);
        }
        catch (Exception ex) {
        	Window.alert("Copy failed");
        }
*/
	}
	
	public void show() {
		  super.show();
		  int left = (Window.getClientWidth() - getOffsetWidth()) / 2 + getBodyScrollLeft();
		  int top = (Window.getClientHeight() - getOffsetHeight()) / 2 + getBodyScrollTop();
		  setPopupPosition(left, top);
		  m_txtOntologyName.selectAll();
		  m_txtOntologyName.setFocus(true);
	  }


	  private native int getBodyScrollLeft() /*-{
	        return $doc.body.scrollLeft;
	      }-*/;

	  private native int getBodyScrollTop() /*-{
	        return $doc.body.scrollTop;
	      }-*/;
	
	public void createCategory() {
			
		Category c = new Category();
		c.setName(m_txtNewCategory.getText().trim());
		c.setOrganizationID(m_lstOrganization.getSelectedOrganization().getOrganizationID());
		CategoryServiceProxy proxy = new CategoryServiceProxy();
		proxy.addCategoryChangeListener(this);
		proxy.addCategoryChangeListener(m_CategoryChangeListener);
		proxy.createCategory(c);
		
		//TODO: take this out:
		//c.setCategoryID(-1);
		//Window.alert("TODO: Enable CopyOntologyDialog::createCategory");
		//onCategoryChange(c, new ChangeEvent(true, false, false));
	}

	public void onKeyDown(Widget sender, char keyCode, int modifiers) {
	}

	public void onKeyPress(Widget sender, char keyCode, int modifiers) {
		if ((sender.equals(m_txtOntologyName) || sender.equals(m_txtNewCategory)) && keyCode == 13) {
			onClickOK();
		}
		else if (keyCode == 27) {
			hide();
		}
		
		if (sender.equals(m_txtNewCategory)) {
			m_btnNewCategory.setChecked(true);
			m_btnExistingCategory.setChecked(false);
		}

	}

	public void onKeyUp(Widget sender, char keyCode, int modifiers) {
	}


	public void onChange(Widget sender) {
		if (sender.equals(m_lstOrganization)) {
			if (m_lstOrganization.getSelectedIndex() == 0) {
				m_lstCategory.emptyList();
			}
			else {
				m_lstCategory.fillList(Integer.parseInt(m_lstOrganization.getValue(m_lstOrganization.getSelectedIndex())), "-1");
			}
		}
		else if (sender.equals(m_lstCategory) && m_lstCategory.getSelectedIndex() != 0) {
			m_btnNewCategory.setChecked(false);
			m_btnExistingCategory.setChecked(true);
		}
		
		
	}

	public void onCategoryChange(Category c, ChangeEvent event) {
		if (event.isCreate()) {
			m_iSelectedCategoryID = c.getCategoryID();
			copyOntology();
		}
	}

	public void onOntologyChange(Ontology o, ChangeEvent event) {
		
		if (event.isCreate()) {
    		Window.alert("Ontology copied successfully");
    		hide();
		}
		
	}

  }
