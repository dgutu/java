package com.searchincite.client.widgets;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.MouseListener;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.SourcesTableEvents;
import com.google.gwt.user.client.ui.TableListener;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.searchincite.client.data.constants.SecurityConstants;
import com.searchincite.client.entity.ChangeEvent;
import com.searchincite.client.entity.Organization;
import com.searchincite.client.entity.SecurityRole;
import com.searchincite.client.listeners.OrganizationChangeListener;
import com.searchincite.client.services.OrganizationService;
import com.searchincite.client.services.OrganizationServiceAsync;
import com.searchincite.client.services.UserService;
import com.searchincite.client.services.UserServiceAsync;
import com.searchincite.client.widgets.dialogs.AddEditOrganizationDialog;
import com.searchincite.client.widgets.entitylabels.OrganizationLabel;

public class OrganizationPanel extends Composite implements TableListener, ClickListener, OrganizationChangeListener, MouseListener {

	SecurityRole[] m_arrRoles = null;
	FlexTable m_tblOuter = new FlexTable();
	FlexTable m_tbl = new FlexTable();
	Organization[] m_arrOrganizations = null;
	private int m_iSelectedRow = -1;
	private ScrollPanel m_ScrollPanel = null;
	private int m_iOrganizationIDToSelect = -1;
	
	private int m_iIDColumn = 1;
	private Image m_imgNew = null;
	private Image m_imgEdit = null;
	private Image m_imgDelete = null;
	private Image m_imgRefresh = null;
	private OrganizationPanel m_This = this; // This is a bad design, but was done because there
									 // are no synchronous method calls in GWT.  We need
									 // to determine the security roles before we can
									 // construct the list because some columns are
									 // not available for some users (i.e., non-admins).
	
	public OrganizationPanel() {
		
		m_tbl.addTableListener(this);

		initWidget(m_tblOuter);
		
		preInit(); //preInit() calls init()
		
	}	

	private void init() {

		if (!isSIAdmin()) {
			return;
		}
		
		m_tbl.setSize("100%", "100%");
		m_tbl.setCellSpacing(1);  
		m_tbl.setBorderWidth(0);
		
		m_tbl.setStyleName("orgList");

		if (isSIAdmin()) {
			m_tbl.setText(0, 0, "ID");  
			m_tbl.setText(0, 1, "Organization Name");
			
			m_iIDColumn = 1; //default is 1
		}
		else {
			m_tbl.setText(0, 0, "ID");  
			m_tbl.setText(0, 1, "Organization Name");  
		}

		m_tbl.getCellFormatter().setStyleName(0, 0, "orgList-ColumnHeader");
		m_tbl.getCellFormatter().setStyleName(0, 1, "orgList-ColumnHeader");
		
		m_ScrollPanel = new ScrollPanel();
		m_ScrollPanel.add(m_tbl);
		m_ScrollPanel.setSize("100%", "100%");

		m_tblOuter.setSize("100%", "100%");
		
		InitImageButtons();
		
		m_tblOuter.setWidget(1, 0, m_ScrollPanel);
		m_tblOuter.getFlexCellFormatter().setHeight(1, 0, "100%");

		m_tblOuter.setHeight("100%");
		m_ScrollPanel.setHeight("100%");
		m_tbl.setHeight("100%");

		loadOrganizations();
		refreshList();
	}
	
	private void InitImageButtons()
	{
		HorizontalPanel hp = new HorizontalPanel();
		hp.setSpacing(3);

		Label lbl = new Label();
		lbl.setText("Organizations");
		lbl.setStyleName("orgList-Title");
		
		m_imgNew = new Image("images/new.gif");
		m_imgNew.setSize("16px", "16px");
		m_imgNew.setTitle("New Organization");
		m_imgNew.addStyleName("imageButton");
		m_imgNew.addMouseListener(this);
		m_imgNew.addClickListener(this);
		
		m_imgEdit = new Image("images/edit.gif");
		m_imgEdit.setSize("16px", "16px");
		m_imgEdit.setTitle("Edit Organization");
		m_imgEdit.addStyleName("imageButton");
		m_imgEdit.addMouseListener(this);
		m_imgEdit.addClickListener(this);

		m_imgDelete = new Image("images/delete.gif");
		m_imgDelete.setSize("16px", "16px");
		m_imgDelete.setTitle("Delete Organization");
		m_imgDelete.addStyleName("imageButton");
		m_imgDelete.addMouseListener(this);
		m_imgDelete.addClickListener(this);

		m_imgRefresh = new Image("images/refresh.gif");
		m_imgRefresh.setSize("16px", "16px");
		m_imgRefresh.setTitle("Refresh");
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
	
	public void refreshList() {
		
		//m_tbl.clear();
		
		int iOrgRows = m_tbl.getRowCount() - 1;
		
		for (int i = 0; i < iOrgRows; i++) {
			m_tbl.removeRow(1);			
		}
		
		if (m_arrOrganizations != null && m_arrOrganizations.length > 0) {

			for (int i = 0; i < m_arrOrganizations.length; i++) {
    		
    			Organization org = m_arrOrganizations[i];
        		m_tbl.setText(i + 1, 0, String.valueOf(org.getOrganizationID()));
        		m_tbl.setWidget(i + 1, 1, new OrganizationLabel(org));
        		m_tbl.getRowFormatter().addStyleName(i + 1, "orgList-Row");
    		}
		}
		else {
			m_tbl.setText(1, 0, "No Organizations");
    		m_tbl.getFlexCellFormatter().setColSpan(1, 0, m_tbl.getCellCount(0));
    		m_tbl.getRowFormatter().addStyleName(1, "orgList-EmptyRow");
		}

		int iRowCount = m_tbl.getRowCount();
		m_tbl.setText(iRowCount, 0, " ");
		m_tbl.getFlexCellFormatter().setColSpan(iRowCount, 0, m_tbl.getCellCount(0));
		m_tbl.getFlexCellFormatter().setHeight(iRowCount, 0, "100%");
		m_tbl.getRowFormatter().addStyleName(iRowCount, "orgList-EmptyRow");

	}

	public void onCellClicked(SourcesTableEvents sender, int row, int cell) {

		// Select the row that was clicked (-1 to account for header row).
		if (row > 0 && row != m_tbl.getRowCount() -1) {
			selectRow(row);
		}
		else {
			selectRow(-1);
		}
	}

	public void onClick(Widget sender) {

		sender.removeStyleName("imageButton-OnMouseOver");

		if (sender.equals(m_imgNew)) {
			AddEditOrganizationDialog dlg = new AddEditOrganizationDialog(null, -1, this, m_arrRoles);
			dlg.show();
		} 
		else if (sender.equals(m_imgDelete)) {
			
			Organization org = getSelectedOrganization();
			
			if (org == null) {
				Window.alert("Please select the Organization to delete before choosing this option.");
				return;
			}
			
			if (Window.confirm("Delete the selected Organization?")) {
				Window.alert("This feature is not yet implemented");
				//UserServiceProxy proxy = new UserServiceProxy();
				//proxy.addUserChangeListener(this);
				//proxy.deleteUser(u.getUserID());
				
				//xxx DO NOT DELETE OWN ORGANIZATION
				//xxx DOUBLE CONFIRM
				//xxx DELETES ORGANIZATION, USERS, ONTOLOGIES, DOCUMENTS
				
			}		
		} 
		else if (sender.equals(m_imgEdit)) {

			Organization org = getSelectedOrganization();
			
			if (org != null) {
				AddEditOrganizationDialog dlg = new AddEditOrganizationDialog(org, org.getOrganizationID(), this, m_arrRoles);
				dlg.show();
			}
			else {
				Window.alert("Please select the Organization to edit before choosing this option.");
			}
		}
		else if (sender.equals(m_imgRefresh))
		{
			loadOrganizations();
		}
	}
	
	private void selectRow(int row) {
		// When a row (other than the first one, which is used as a header) is
		// selected, display its associated Phrases.

		// De-select the currently selected row
		styleRow(m_iSelectedRow, false);
		
		m_iSelectedRow = row;
		
		Organization org = getSelectedOrganization();
		
		if (org != null) {
			styleRow(row, true);
		}
	}

	private void styleRow(int row, boolean selected) {
		
		if (row != -1) {
			if (selected) {
				m_tbl.getRowFormatter().removeStyleName(row, "orgList-Row");
				m_tbl.getRowFormatter().addStyleName(row, "orgList-SelectedRow");
			} else {
				m_tbl.getRowFormatter().removeStyleName(row, "orgList-SelectedRow");
				m_tbl.getRowFormatter().addStyleName(row, "orgList-Row");
			}
		}
		
	}

	private Organization getSelectedOrganization() {
		
		if (m_iSelectedRow != -1) {

			try {
				OrganizationLabel lbl = (OrganizationLabel)m_tbl.getWidget(m_iSelectedRow, m_iIDColumn);
			
				if (lbl != null) {
			
					// Find the organization for the selected ID
					for (int i = 0; i < m_arrOrganizations.length; i++) {
						if (lbl.getOrganization() == m_arrOrganizations[i]) {
							return m_arrOrganizations[i];
						}
					}
				}
			}
			catch (Exception ex) {
				return null;
			}
		}
		
		return null;
	}

	private void selectOrganization(int iOrganizationIDToSelect) {
		
		for (int iRow = 0; iRow < m_tbl.getRowCount(); iRow++) {

			if (m_tbl.getCellCount(iRow) > 2) {
				OrganizationLabel lbl = (OrganizationLabel)m_tbl.getWidget(iRow, 1);
				
				if (lbl != null) {
					if (lbl.getOrganization().getOrganizationID() == iOrganizationIDToSelect) {
						selectRow(iRow);
						return;
					}
				}
			}
		}
		
	}

	public void onOrganizationChange(Organization org, ChangeEvent event) {

		if (event.isCreate() || event.isUpdate()) {
			// A new user was created.
			m_iOrganizationIDToSelect = org.getOrganizationID();
		}
		//else if (event.isDelete()) {
		//}
		loadOrganizations();
		
	}

	private void loadOrganizations() {
		
		OrganizationServiceAsync svc = (OrganizationServiceAsync)GWT.create(OrganizationService.class);
        ServiceDefTarget endpoint = (ServiceDefTarget)svc;
        String moduleRelativeURL = GWT.getModuleBaseURL() + "organization";
        endpoint.setServiceEntryPoint(moduleRelativeURL);

        AsyncCallback callback = new AsyncCallback() {

        	public void onSuccess(Object result) {

           		m_arrOrganizations = (Organization[])result;

           		refreshList();
        		selectOrganization(m_iOrganizationIDToSelect);
        	}

            public void onFailure(Throwable caught) {
            	Window.alert("OrganizationPanel::loadOrganizations() -- service call failed.");
            }
        };
        
        svc.getOrganizations(Organization.FIELD_ALL_FIELDS, callback);
	}

	
	public void onMouseDown(Widget sender, int x, int y) {
	}

	public void onMouseEnter(Widget sender) {

		if (sender.equals(m_imgNew) || 
				sender.equals(m_imgEdit) ||
				sender.equals(m_imgDelete) || 
				sender.equals(m_imgRefresh)) {

			sender.addStyleName("imageButton-OnMouseOver");
		}
	}

	public void onMouseLeave(Widget sender) {
		if (sender.equals(m_imgNew) || 
				sender.equals(m_imgEdit) ||
				sender.equals(m_imgDelete) || 
				sender.equals(m_imgRefresh)) {
			
			sender.removeStyleName("imageButton-OnMouseOver");
		}
	}

	public void onMouseMove(Widget sender, int x, int y) {
	}

	public void onMouseUp(Widget sender, int x, int y) {
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
            	Window.alert("OrganizationPanel::getRoles() -- service call failed.");
            }
        };
        
        try {
			svc.getSecurityRolesForUser(callback);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private boolean isSIAdmin() {
		
		if (m_arrRoles == null) {
			return false;
		}
		
		for (int i = 0; i < m_arrRoles.length; i++) {
			if (m_arrRoles[i].getRoleID() == SecurityConstants.ROLE_SI_ADMIN) {
				return true;
			}
		}
		
		return false;
	}

}
