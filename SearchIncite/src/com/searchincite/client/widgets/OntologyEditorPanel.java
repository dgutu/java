package com.searchincite.client.widgets;


import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;
import com.google.gwt.user.client.ui.ChangeListener;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DockPanel;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.MouseListener;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.searchincite.client.data.constants.SecurityConstants;
import com.searchincite.client.entity.Category;
import com.searchincite.client.entity.ChangeEvent;
import com.searchincite.client.entity.Ontology;
import com.searchincite.client.entity.SecurityRole;
import com.searchincite.client.entity.Subject;
import com.searchincite.client.listeners.CategoryChangeListener;
import com.searchincite.client.listeners.OntologyChangeListener;
import com.searchincite.client.services.CategoryServiceProxy;
import com.searchincite.client.services.OntologyService;
import com.searchincite.client.services.OntologyServiceAsync;
import com.searchincite.client.services.OntologyServiceProxy;
import com.searchincite.client.services.UserService;
import com.searchincite.client.services.UserServiceAsync;
import com.searchincite.client.widgets.dialogs.AddEditCategoryDialog;
import com.searchincite.client.widgets.dialogs.AddEditOntologyDialog;
import com.searchincite.client.widgets.dialogs.CopyOntologyDialog;
import com.searchincite.client.widgets.dialogs.UploadOntologyDialog;


@SuppressWarnings("deprecation")
public class OntologyEditorPanel 
	extends Composite 
	implements ChangeListener, MouseListener, ClickListener, CategoryChangeListener, OntologyChangeListener
{
	SecurityRole[] m_arrRoles = null;
	private FlexTable m_pnlOuter = null;
	private VerticalPanel m_pnlInner = null;
	private OntologyList m_lstOntology = null;
	private CategoryList m_lstCategory = null;
	private FlexTable m_tblCategoryOntology = null;
	private DockPanel m_pnlSubjectPhrase = null;
	private DockPanel m_pnlEmpty = new DockPanel();
	private Ontology m_SelectedOntology = null;
	private Image m_imgNewCategory = null;
	private Image m_imgEditCategory = null;
	private Image m_imgDeleteCategory = null;

	private Image m_imgNewOntology = null;
	private Image m_imgEditOntology = null;
	private Image m_imgDeleteOntology = null;
	private Image m_imgCopyOntology = null;
	private Image m_imgExportOntology = null;
	private Image m_imgImportOntology = null;
	private Label m_lblOntologyID = null;
	
	
	private OntologyEditorPanel m_This = this; // This is a bad design, but was done because there
	 // are no synchronous method calls in GWT.  We need
	 // to determine the security roles before we can
	 // construct the list because some columns are
	 // not available for some users (i.e., non-admins).

	public OntologyEditorPanel() {

		m_pnlOuter = new FlexTable();

		this.initWidget(m_pnlOuter);
		
		preInit(); //preInit() calls init()

	}

	private void init() {

		//this.setHeight("100%");
		m_pnlOuter.setSize("100%", "100%");
		m_pnlOuter.setCellPadding(0);
		m_pnlOuter.setCellSpacing(0);
		
		m_pnlInner = new VerticalPanel();
		//m_pnlMain.setSize("100%", "100%");
		m_pnlInner.setSize("100%", "100%");
		m_pnlInner.setVerticalAlignment(VerticalPanel.ALIGN_TOP);
		m_pnlInner.setSpacing(0);
		m_pnlInner.setBorderWidth(0);

		initSelectionTable();
		//m_pnlInner.add(m_tblCategoryOntology);
		m_pnlOuter.setWidget(0, 0, m_tblCategoryOntology);

		m_pnlEmpty.setBorderWidth(1);
		m_pnlEmpty.setVerticalAlignment(DockPanel.ALIGN_MIDDLE);
		m_pnlEmpty.setHorizontalAlignment(DockPanel.ALIGN_CENTER);
		m_pnlEmpty.setSize("100%", "100%");
		m_pnlEmpty.add(new Label("No Ontology Selected"), DockPanel.CENTER);
		m_pnlEmpty.setVisible(true);
		m_pnlOuter.setWidget(1, 0, m_pnlEmpty);

		m_pnlOuter.setWidget(2, 0, m_pnlInner);
		
		//initWidget(m_pnlOuter);
		showEmpty(true);
	}

	private void showEmpty(boolean bShowEmpty) {

		if (m_pnlInner.getWidgetIndex(m_pnlSubjectPhrase) != -1) {
			m_pnlInner.remove(m_pnlSubjectPhrase);
		}
		
		m_pnlOuter.getCellFormatter().setHeight(2, 0, bShowEmpty ? "1px" : "100%");
		m_pnlOuter.getCellFormatter().setHeight(1, 0, bShowEmpty ? "100%" : "1px");
		m_pnlInner.setVisible(!bShowEmpty);
		m_pnlEmpty.setVisible(bShowEmpty);
	}
	
	private void initSelectionTable() {
		
		m_tblCategoryOntology = new FlexTable();
		m_tblCategoryOntology.setWidget(0, 0, new Label("Category:"));
		m_lstCategory = new CategoryList(true, true, 1);
		m_lstCategory.setSelectedIndex(0);
		m_lstCategory.addChangeListener(this);
		m_tblCategoryOntology.setWidget(0, 1, m_lstCategory);
		
		m_imgNewCategory = new Image("images/new.gif");
		m_imgNewCategory.setSize("16px", "16px");
		m_imgNewCategory.setTitle("New Category");
		m_imgNewCategory.addStyleName("imageButton");
		m_imgNewCategory.addMouseListener(this);
		m_imgNewCategory.addClickListener(this);

		m_imgEditCategory = new Image("images/edit.gif");
		m_imgEditCategory.setSize("16px", "16px");
		m_imgEditCategory.setTitle("Edit Category");
		m_imgEditCategory.addMouseListener(this);
		m_imgEditCategory.addMouseListener(this);
		m_imgEditCategory.addClickListener(this);
		m_imgEditCategory.addStyleName("imageButton");
		
		m_imgDeleteCategory = new Image("images/delete.gif");
		m_imgDeleteCategory.setSize("16px", "16px");
		m_imgDeleteCategory.setTitle("Delete Category");
		m_imgDeleteCategory.addStyleName("imageButton");
		m_imgDeleteCategory.addMouseListener(this);
		m_imgDeleteCategory.addClickListener(this);

		if (canModify()) {
			m_tblCategoryOntology.setWidget(0, 2, m_imgNewCategory);
			m_tblCategoryOntology.setWidget(0, 3, m_imgEditCategory);
			m_tblCategoryOntology.setWidget(0, 4, m_imgDeleteCategory);
		}

		//FlexTable ftOntology = new FlexTable();
		m_tblCategoryOntology.setWidget(1, 0, new Label("Ontology:"));
		m_lstOntology = new OntologyList(true);
		m_lstOntology.setVisibleItemCount(1);
		m_lstOntology.setShowNoSelection(true);
		m_lstOntology.setSelectedIndex(0);
		m_lstOntology.addChangeListener(this);
		m_tblCategoryOntology.setWidget(1, 1, m_lstOntology);

		m_imgNewOntology = new Image("images/new.gif");
		m_imgNewOntology.setSize("16px", "16px");
		m_imgNewOntology.setTitle("New Ontology");
		m_imgNewOntology.addStyleName("imageButton");
		m_imgNewOntology.addMouseListener(this);
		m_imgNewOntology.addClickListener(this);

		m_imgEditOntology = new Image("images/edit.gif");
		m_imgEditOntology.setSize("16px", "16px");
		m_imgEditOntology.setTitle("Edit Ontology");
		m_imgEditOntology.addStyleName("imageButton");
		m_imgEditOntology.addMouseListener(this);
		m_imgEditOntology.addClickListener(this);
		
		m_imgDeleteOntology = new Image("images/delete.gif");
		m_imgDeleteOntology.setSize("16px", "16px");
		m_imgDeleteOntology.setTitle("Delete Ontology");
		m_imgDeleteOntology.addStyleName("imageButton");
		m_imgDeleteOntology.addMouseListener(this);
		m_imgDeleteOntology.addClickListener(this);

		m_imgCopyOntology = new Image("images/copy.gif");
		m_imgCopyOntology.setSize("16px", "16px");
		m_imgCopyOntology.setTitle("Copy Ontology");
		m_imgCopyOntology.addStyleName("imageButton");
		m_imgCopyOntology.addMouseListener(this);
		m_imgCopyOntology.addClickListener(this);
		
		m_imgExportOntology = new Image("images/data_export.gif");
		m_imgExportOntology.setSize("16px", "16px");
		m_imgExportOntology.setTitle("Export Ontology");
		m_imgExportOntology.addStyleName("imageButton");
		m_imgExportOntology.addMouseListener(this);
		m_imgExportOntology.addClickListener(this);
		
		m_imgImportOntology = new Image("images/data_import.gif");
		m_imgImportOntology.setSize("16px", "16px");
		m_imgImportOntology.setTitle("Import Ontology");
		m_imgImportOntology.addStyleName("imageButton");
		m_imgImportOntology.addMouseListener(this);
		m_imgImportOntology.addClickListener(this);		
		

		m_lblOntologyID = new Label("Ontology ID: N/A");

		if (canModify()) {
			m_tblCategoryOntology.setWidget(1, 2, m_imgNewOntology);
			m_tblCategoryOntology.setWidget(1, 3, m_imgEditOntology);
			m_tblCategoryOntology.setWidget(1, 4, m_imgDeleteOntology);
			m_tblCategoryOntology.setWidget(1, 5, m_imgCopyOntology);
			m_tblCategoryOntology.setWidget(1, 6, m_imgExportOntology);
			m_tblCategoryOntology.setWidget(1, 7, m_imgImportOntology);
			m_tblCategoryOntology.setWidget(1, 8, m_lblOntologyID);
		}
		
		m_tblCategoryOntology.setText(0, 8, " ");
		m_tblCategoryOntology.getFlexCellFormatter().setRowSpan(0, 8, 2);
		m_tblCategoryOntology.getFlexCellFormatter().setWidth(0, 8, "100%");
		
		m_tblCategoryOntology.setStyleName("categoryOntologySelectorTable");
		m_tblCategoryOntology.setWidth("100%");
	}
	
	public void onOntologySelected(int iOntologyID) {

		openOntology(iOntologyID);
	}
	
	public void openOntology(int iOntologyID) 
	{
		
		OntologyServiceAsync ontologyService = (OntologyServiceAsync)GWT.create(OntologyService.class);
		ServiceDefTarget endpoint = (ServiceDefTarget)ontologyService;
		String moduleRelativeURL = GWT.getModuleBaseURL() + "ontology";
		endpoint.setServiceEntryPoint(moduleRelativeURL);

		AsyncCallback callback = new AsyncCallback() 
		{

			public void onSuccess(Object result) 
			{

				m_SelectedOntology = (Ontology)result;
				
				m_lblOntologyID.setText("Ontology ID: " + m_SelectedOntology.getOntologyID());
				
				SubjectPanel pnlSubjects = null;
				PhrasePanel pnlPhrases = null;
				
				if (m_SelectedOntology.getSubjects() != null && m_SelectedOntology.getSubjects().length > 0) {
					pnlSubjects = new SubjectPanel(m_SelectedOntology.getSubjects(), m_SelectedOntology.getOntologyID());
					//pnlPhrases = new PhrasePanel(m_SelectedOntology.getSubjects()[0].getPhrases());
					pnlPhrases = new PhrasePanel(null, -1);
				}
				else {
					pnlSubjects = new SubjectPanel(m_SelectedOntology.getOntologyID());
					pnlPhrases = new PhrasePanel(-1);
				}

				pnlSubjects.addSubjectSelectionListener(pnlPhrases);
				
				showEmpty(false);

				m_pnlSubjectPhrase = new DockPanel();
				
				m_pnlSubjectPhrase.setSize("100%", "100%");
				m_pnlSubjectPhrase.setSpacing(0);
				//m_pnlSubjectPhrase.setBorderWidth(0);
				m_pnlSubjectPhrase.add(pnlSubjects, DockPanel.WEST);
				m_pnlSubjectPhrase.add(pnlPhrases, DockPanel.EAST);
				
				m_pnlInner.add(m_pnlSubjectPhrase);
			}

			public void onFailure(Throwable caught) {
				Window.alert("AppPanel::openOntology() -- call to ontology service failed.");
			}
		};
        
		ontologyService.getOntologyByID(iOntologyID, Ontology.FIELD_ALL_FIELDS, callback);
	}

	public void onChange(Widget sender) {

		if (sender.equals(m_lstCategory)) {
			
			Category c = m_lstCategory.getSelectedCategory();
			
			if (c != null) {
				m_lstOntology.fillList(c.getCategoryID());
			}
			else {
				m_lstOntology.fillList(-1);
			}
			
			showEmpty(true);
		}
		else if (sender.equals(m_lstOntology)) {
			
			int iSelectedOntologyID = Integer.parseInt(m_lstOntology.getValue(m_lstOntology.getSelectedIndex())); 
			
			if (iSelectedOntologyID == -1) {
				showEmpty(true);
			}
			else {
				openOntology(iSelectedOntologyID);
			}
		}

	}

	public void onMouseDown(Widget sender, int x, int y) {
	}

	public void onMouseEnter(Widget sender) {

		if (sender.equals(m_imgNewCategory) || 
				sender.equals(m_imgEditCategory) ||
				sender.equals(m_imgDeleteCategory) ||
				sender.equals(m_imgNewOntology) ||
				sender.equals(m_imgEditOntology) ||
				sender.equals(m_imgDeleteOntology) ||
				sender.equals(m_imgCopyOntology) || 
				sender.equals(m_imgExportOntology) || 
				sender.equals(m_imgImportOntology)) {

			sender.addStyleName("imageButton-OnMouseOver");
		}
	}

	public void onMouseLeave(Widget sender) {
		if (sender.equals(m_imgNewCategory) || 
				sender.equals(m_imgEditCategory) ||
				sender.equals(m_imgDeleteCategory) ||
				sender.equals(m_imgNewOntology) ||
				sender.equals(m_imgEditOntology) ||
				sender.equals(m_imgDeleteOntology) ||
				sender.equals(m_imgCopyOntology) || 
				sender.equals(m_imgExportOntology) || 
				sender.equals(m_imgImportOntology)
			) {
			
			sender.removeStyleName("imageButton-OnMouseOver");
		}
	}

	public void onMouseMove(Widget sender, int x, int y) {
	}

	public void onMouseUp(Widget sender, int x, int y) {
	}

	public void onClick(Widget sender) {

		sender.removeStyleName("imageButton-OnMouseOver");

		if (sender.equals(m_imgNewCategory)) {
			AddEditCategoryDialog dlg = new AddEditCategoryDialog(null, this); //TODO: Find better way to pass listener to dialogs. Perhaps create base class for all dialogs.
			dlg.show();
		} 
		else if (sender.equals(m_imgDeleteCategory)) {
			
			Category c = m_lstCategory.getSelectedCategory();
			
			if (c == null) {
				Window.alert("Please select the Category to delete before choosing this option.");
				return;
			}
			
			if (Window.confirm("Delete the selected Category, including all Ontologies, Subjects, and Phrases contained in this Category?")) {
				if (Window.confirm("This operation cannot be reversed.  Are you sure?")) {
					
					CategoryServiceProxy proxy = new CategoryServiceProxy();
					proxy.addCategoryChangeListener(this);
					proxy.deleteCategory(c.getCategoryID());
				}
			}		
		} 
		else if (sender.equals(m_imgEditCategory)) {

			Category c = m_lstCategory.getSelectedCategory();
			
			if (c != null) {
				AddEditCategoryDialog dlg = new AddEditCategoryDialog(c, this); //TODO: Find better way to pass listener to dialogs. Perhaps create base class for all dialogs.
				
				dlg.show();
			}
			else {
				Window.alert("Please select the Category to edit before choosing this option.");
				return;
			}
		}
		else if (sender.equals(m_imgNewOntology)) {
			
			Category c = m_lstCategory.getSelectedCategory();
			
			if (c == null) {
				Window.alert("Please select a Category before choosing this option.");
				return;
			}

			AddEditOntologyDialog dlg = new AddEditOntologyDialog(null, m_lstCategory.getSelectedCategory(), this); //TODO: Find better way to pass listener to dialogs. Perhaps create base class for all dialogs.
			dlg.show();
		} 
		else if (sender.equals(m_imgDeleteOntology)) {
			
			Ontology o = m_lstOntology.getSelectedOntology();
			
			if (o == null) {
				Window.alert("Please select the Ontology to delete before choosing this option.");
				return;
			}
			
			if (Window.confirm("Delete the selected Ontology, including all Subjects and Phrases contained in this Ontology?")) {
				if (Window.confirm("This operation cannot be reversed.  Are you sure?")) {
					
					OntologyServiceProxy proxy = new OntologyServiceProxy();
					proxy.addOntologyChangeListener(this);
					proxy.deleteOntology(o.getOntologyID());
				}
			}		
		} 
		else if (sender.equals(m_imgEditOntology)) {

			Ontology o = m_lstOntology.getSelectedOntology();
			
			if (o != null) {
				AddEditOntologyDialog dlg = new AddEditOntologyDialog(o, m_lstCategory.getSelectedCategory(), this); //TODO: Find better way to pass listener to dialogs. Perhaps create base class for all dialogs.
				dlg.show();
			}
			else {
				Window.alert("Please select the Ontology to edit before choosing this option.");
				return;
			}
		}
		else if (sender.equals(m_imgCopyOntology)) {

			Ontology o = m_lstOntology.getSelectedOntology();
			
			if (o != null) {
				CopyOntologyDialog dlg = new CopyOntologyDialog(o, m_lstCategory.getSelectedCategory().getName(), this, this);
				dlg.show();
				//Window.alert("Copy Ontology -- This feature is not yet implemented.");
			}
			else {
				Window.alert("Please select the Ontology to copy before choosing this option.");
				return;
			}
		}
		// export Ontology
		else if (sender.equals(m_imgExportOntology)) {
			
			Ontology o = m_lstOntology.getSelectedOntology();
			
			if (o != null) {
				OntologyServiceAsync ontologyService = (OntologyServiceAsync)GWT.create(OntologyService.class);
				ServiceDefTarget endpoint = (ServiceDefTarget)ontologyService;
				String moduleRelativeURL = GWT.getModuleBaseURL() + "ontology";
				endpoint.setServiceEntryPoint(moduleRelativeURL);
				
				AsyncCallback callback = new AsyncCallback() 
				{
					public void onSuccess(Object result) 
					{
						String fileName = (String)result;
						Window.open(fileName, "name", "enabled");
					}

					public void onFailure(Throwable caught) {
						Window.alert("OntologyEditorPanel::getExportOntologyFile() -- call to ontology service failed.");
					}
				};
				
				ontologyService.getExportOntologyFile(o.getOntologyID(), callback);
			}
			else {
				Window.alert("Please select the Ontology to export before choosing this option.");
				return;
			}			
		}		
		// import Ontology
		else if (sender.equals(m_imgImportOntology)) {
			UploadOntologyDialog dlg = new UploadOntologyDialog();				
			dlg.show();
		}						
	}

	public void onCategoryChange(Category c, ChangeEvent event) {

		if (event.isCreate()) {
			// A new category was created.  Reload the category list and select the new category.
			m_lstCategory.fillList(String.valueOf(c.getCategoryID()));
			//m_lstCategory.selectItem(String.valueOf(c.getCategoryID()));
			m_lstOntology.fillList(c.getCategoryID());  //nothing to select (there are no ontologies in a new category!)
			showEmpty(true);
			
		}
		else if (event.isUpdate()) {
			m_lstCategory.setItemText(m_lstCategory.getSelectedIndex(), c.getName());
		}
		else if (event.isDelete()) {
			m_lstCategory.fillList();
			m_lstOntology.fillList(-1);
			showEmpty(true);
		}
	}

	public void onOntologyChange(Ontology o, ChangeEvent event) {
		
		if (event.isCreate()) {
			// A new ontology was created.  Reload the ontology list and select the new ontology.
			m_lstOntology.fillList(o.getCategoryID(), String.valueOf(o.getOntologyID()));

			openOntology(o.getOntologyID());

		}
		else if (event.isUpdate()) {
			m_lstOntology.setItemText(m_lstOntology.getSelectedIndex(), o.getName());
		}
		else if (event.isDelete()) {
			m_lstOntology.fillList(m_lstCategory.getSelectedCategory().getCategoryID());
			showEmpty(true);
		}
	}

	public void onSubjectChange(Subject s, ChangeEvent event) {
	}
	
	private void preInit() {
		
		UserServiceAsync svc = (UserServiceAsync)GWT.create(UserService.class);
        ServiceDefTarget endpoint = (ServiceDefTarget)svc;
        String moduleRelativeURL = GWT.getModuleBaseURL() + "user";
        endpoint.setServiceEntryPoint(moduleRelativeURL);

        AsyncCallback callback = new AsyncCallback() {

        	public void onSuccess(Object result) {

        		m_arrRoles = (SecurityRole[])result;
        		m_This.init();
        	}

            public void onFailure(Throwable caught) {
            	Window.alert("OntologyEditorPanel::getRoles() -- service call failed.");
            }
        };
        
        try {
			svc.getSecurityRolesForUser(callback);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private boolean canModify() {
		if (m_arrRoles == null) {
			return false;
		}
		
		for (int i = 0; i < m_arrRoles.length; i++) {
			if (m_arrRoles[i].getRoleID() == SecurityConstants.ROLE_SI_ADMIN ||
				m_arrRoles[i].getRoleID() == SecurityConstants.ROLE_ORGANIZATION_ADMIN ||
				m_arrRoles[i].getRoleID() == SecurityConstants.ROLE_ONTOLOGY_BUILDER) {
				return true;
			}
		}
		
		return false;
	}

}
