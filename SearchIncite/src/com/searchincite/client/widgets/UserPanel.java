package com.searchincite.client.widgets;

import javax.servlet.http.HttpServletRequest;

import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.client.DateTimeFormat;
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
import com.searchincite.api.entity.User;
import com.searchincite.client.data.constants.SecurityConstants;
import com.searchincite.client.entity.ChangeEvent;
import com.searchincite.client.entity.SecurityRole;
import com.searchincite.client.entity.WebUser;
import com.searchincite.client.listeners.UserChangeListener;
import com.searchincite.client.services.UserService;
import com.searchincite.client.services.UserServiceAsync;
import com.searchincite.client.widgets.dialogs.AddEditUserDialog;
import com.searchincite.client.widgets.dialogs.NewUserWizardDialog;
import com.searchincite.client.widgets.entitylabels.WebUserLabel;

public class UserPanel extends Composite implements TableListener, ClickListener, UserChangeListener, MouseListener {

	SecurityRole[] m_arrRoles = null;
	int m_iCurrentUserID = -1;
	FlexTable m_tblOuter = new FlexTable();
	FlexTable m_tbl = new FlexTable();
	WebUser[] m_arrUsers = null;
	private int m_iSelectedRow = -1;
	private ScrollPanel m_ScrollPanel = null;
	private int m_iUserIDToSelect = -1;
	
	private int m_iIDColumn = 1;
	private Image m_imgNew = null;
	private Image m_imgEdit = null;
	private Image m_imgDelete = null;
	private Image m_imgRefresh = null;
	private Image m_imgWizard = null;
	private UserPanel m_This = this; // This is a bad design, but was done because there
									 // are no synchronous method calls in GWT.  We need
									 // to determine the security roles before we can
									 // construct the list because some columns are
									 // not available for some users (i.e., non-admins).	
	public UserPanel() {
		
		m_tbl.addTableListener(this);

		initWidget(m_tblOuter);		
		
		
		preInit(); //preInit() calls init()
		
	}	

	private void init() {

		m_tbl.setSize("100%", "100%");
		m_tbl.setCellSpacing(1);  
		m_tbl.setBorderWidth(0);
		
		m_tbl.setStyleName("userList");

		if (isSIAdmin()) {
			m_tbl.setText(0, 0, "ID");  
			m_tbl.setText(0, 1, "Organization");
			m_tbl.setText(0, 2, "Display Name");  
			m_tbl.setText(0, 3, "Username");  
			m_tbl.setText(0, 4, "Status"); //active, inactive (deleted?)
			m_tbl.setText(0, 5, "Expiration");
			
			m_iIDColumn = 2; //default is 1
		}
		else {
			m_tbl.setText(0, 0, "ID");  
			m_tbl.setText(0, 1, "Display Name");  
			m_tbl.setText(0, 2, "Username");  
			m_tbl.setText(0, 3, "Status"); //active, inactive (deleted?)
			m_tbl.setText(0, 4, "Expiration");
		}

		m_tbl.getCellFormatter().setStyleName(0, 0, "userList-ColumnHeader");
		m_tbl.getCellFormatter().setStyleName(0, 1, "userList-ColumnHeader");
		m_tbl.getCellFormatter().setStyleName(0, 2, "userList-ColumnHeader");
		m_tbl.getCellFormatter().setStyleName(0, 3, "userList-ColumnHeader");
		m_tbl.getCellFormatter().setStyleName(0, 4, "userList-ColumnHeader");
		
		if (m_tbl.getCellCount(0) > 5) {
			m_tbl.getCellFormatter().setStyleName(0, 5, "userList-ColumnHeader");
		}
		
		//initWidget(m_tbl);
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

		loadUsers();
		refreshList();
	}
	
	private void InitImageButtons()
	{
		HorizontalPanel hp = new HorizontalPanel();
		hp.setSpacing(3);

		Label lbl = new Label();
		lbl.setText("Users");
		lbl.setStyleName("userList-Title");
		
		m_imgNew = new Image("images/new.gif");
		m_imgNew.setSize("16px", "16px");
		m_imgNew.setTitle("New User");
		m_imgNew.addStyleName("imageButton");
		m_imgNew.addMouseListener(this);
		m_imgNew.addClickListener(this);
		
		m_imgEdit = new Image("images/edit.gif");
		m_imgEdit.setSize("16px", "16px");
		m_imgEdit.setTitle("Edit User");
		m_imgEdit.addStyleName("imageButton");
		m_imgEdit.addMouseListener(this);
		m_imgEdit.addClickListener(this);

		m_imgDelete = new Image("images/delete.gif");
		m_imgDelete.setSize("16px", "16px");
		m_imgDelete.setTitle("Delete User");
		m_imgDelete.addStyleName("imageButton");
		m_imgDelete.addMouseListener(this);
		m_imgDelete.addClickListener(this);

		m_imgWizard = new Image("images/new_user_wizard.gif");
		m_imgWizard.setSize("16px", "16px");
		m_imgWizard.setTitle("New User Wizard");
		m_imgWizard.addStyleName("imageButton");
		m_imgWizard.addMouseListener(this);
		m_imgWizard.addClickListener(this);
		
		m_imgRefresh = new Image("images/refresh.gif");
		m_imgRefresh.setSize("16px", "16px");
		m_imgRefresh.setTitle("Refresh");
		m_imgRefresh.addStyleName("imageButton");
		m_imgRefresh.addMouseListener(this);
		m_imgRefresh.addClickListener(this);
		
		hp.setVerticalAlignment(VerticalPanel.ALIGN_MIDDLE);
		hp.add(lbl);
		
		if (isSIAdmin() || isOrgAdmin()) {
			hp.add(m_imgWizard);
			hp.add(m_imgNew);
		}
		
		hp.add(m_imgEdit);
		
		if (isSIAdmin() || isOrgAdmin()) {
			hp.add(m_imgDelete);
		}
		
		hp.add(m_imgRefresh);
		
		m_tblOuter.setWidget(0, 0, hp);
	}
	
	public void refreshList() {
		
		//m_tbl.clear();
		
		int iUserRows = m_tbl.getRowCount() - 1;
		
		for (int i = 0; i < iUserRows; i++) {
			m_tbl.removeRow(1);			
		}
		
		if (m_arrUsers != null && m_arrUsers.length > 0) {
    		for (int i = 0; i < m_arrUsers.length; i++) {
    		
    			WebUser u = m_arrUsers[i];
    			
    			if (isSIAdmin()) {
    				//SI Admins can see users for all organizations
    				//and have an "Organization" column in the list.
	        		m_tbl.setText(i + 1, 0, String.valueOf(u.getUserID()));
	        		m_tbl.setText(i + 1, 1, u.getOrganizationName());
	        		m_tbl.setWidget(i + 1, 2, new WebUserLabel(u));
	        		m_tbl.setHTML(i + 1, 3, u.getUsername());
	        		m_tbl.setText(i + 1, 4, u.getStatus());
	        		
	        		if (u.getExpiration() != null) {
						DateTimeFormat dtf = DateTimeFormat.getFormat("MM/dd/yyyy hh:mm aa"); 
						m_tbl.setText(i + 1, 5, dtf.format(u.getExpiration()));
	        		}
	        		else {
	        			m_tbl.setText(i + 1, 5, "");
	        		}
    			}
    			else {
	        		m_tbl.setText(i + 1, 0, String.valueOf(u.getUserID()));
	        		m_tbl.setWidget(i + 1, 1, new WebUserLabel(u));
	        		m_tbl.setHTML(i + 1, 2, u.getUsername());
	        		m_tbl.setText(i + 1, 3, u.getStatus());
	        		
	        		if (u.getExpiration() != null) {
						DateTimeFormat dtf = DateTimeFormat.getFormat("MM/dd/yyyy hh:mm aa"); 
						m_tbl.setText(i + 1, 4, dtf.format(u.getExpiration()));
	        		}
	        		else {
	        			m_tbl.setText(i + 1, 4, "");
	        		}
    			}
        		
        		m_tbl.getRowFormatter().addStyleName(i + 1, "userList-Row");
    		}
		}
		else {
			m_tbl.setText(1, 0, "No Users");
			m_tbl.getFlexCellFormatter().setColSpan(1, 0, m_tbl.getCellCount(0));
			m_tbl.getRowFormatter().addStyleName(1, "userList-EmptyRow");
		}

		int iRowCount = m_tbl.getRowCount();
		m_tbl.setText(iRowCount, 0, " ");
		m_tbl.getFlexCellFormatter().setColSpan(iRowCount, 0, m_tbl.getCellCount(0));
		m_tbl.getFlexCellFormatter().setHeight(iRowCount, 0, "100%");
		m_tbl.getRowFormatter().addStyleName(iRowCount, "userList-EmptyRow");

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

		if (sender.equals(m_imgWizard)) {
			NewUserWizardDialog dlg = new NewUserWizardDialog(null, -1, m_iCurrentUserID, this, m_arrRoles);
			dlg.show();
		}
		else if (sender.equals(m_imgNew)) {
			AddEditUserDialog dlg = new AddEditUserDialog(null, -1, m_iCurrentUserID, this, m_arrRoles);
			dlg.show();
		} 
		else if (sender.equals(m_imgDelete)) {
			
			WebUser u = getSelectedUser();
			
			if (u == null) {
				Window.alert("Please select the User to delete before choosing this option.");
				return;
			}
			
			if (Window.confirm("Delete the selected User?")) {
				Window.alert("This feature is not yet implemented");
				//UserServiceProxy proxy = new UserServiceProxy();
				//proxy.addUserChangeListener(this);
				//proxy.deleteUser(u.getUserID());
			}		
		} 
		else if (sender.equals(m_imgEdit)) {

			WebUser u = getSelectedUser();
			
			if (u != null) {
				//AddEditUserDialog dlg = new AddEditUserDialog(u, u.getUserID(), this, m_iCurrentUserID, m_arrRoles);
				AddEditUserDialog dlg = new AddEditUserDialog(u, u.getUserID(), m_iCurrentUserID, this, m_arrRoles);
				dlg.show();
			}
			else {
				Window.alert("Please select the User to edit before choosing this option.");
			}
		}
		else if (sender.equals(m_imgRefresh))
		{
			loadUsers();
		}
	}
	
	private void selectRow(int row) {
		// When a row (other than the first one, which is used as a header) is
		// selected, display its associated Phrases.

		// De-select the currently selected row
		styleRow(m_iSelectedRow, false);
		
		m_iSelectedRow = row;
		
		WebUser u = getSelectedUser();
		
		if (u != null) {
			styleRow(row, true);
		}
	}

	private void styleRow(int row, boolean selected) {
		
		if (row != -1) {
			if (selected) {
				m_tbl.getRowFormatter().removeStyleName(row, "userList-Row");
				m_tbl.getRowFormatter().addStyleName(row, "userList-SelectedRow");
			} else {
				m_tbl.getRowFormatter().removeStyleName(row, "userList-SelectedRow");
				m_tbl.getRowFormatter().addStyleName(row, "userList-Row");
			}
		}
		
	}

	private WebUser getSelectedUser() {
		
		if (m_iSelectedRow != -1) {

			WebUserLabel lbl = (WebUserLabel)m_tbl.getWidget(m_iSelectedRow, m_iIDColumn);
		
			if (lbl != null) {
		
				// Find the user for the selected ID
				for (int i = 0; i < m_arrUsers.length; i++) {
					if (lbl.getUser() == m_arrUsers[i]) {
						return m_arrUsers[i];
					}
				}
			}

		}
		
		return null;
	}

	private void selectUser(int iUserIDToSelect) {
		
		for (int iRow = 0; iRow < m_tbl.getRowCount(); iRow++) {

			if (m_tbl.getCellCount(iRow) > 2) {
				WebUserLabel lbl = (WebUserLabel)m_tbl.getWidget(iRow, 1);
				
				if (lbl != null) {
					if (lbl.getUser().getUserID() == iUserIDToSelect) {
						selectRow(iRow);
						return;
					}
				}
			}
		}
		
	}

	
	
	public void onUserChange(WebUser u, ChangeEvent event) {

		if (event.isCreate() || event.isUpdate()) {
			// A new user was created.
			m_iUserIDToSelect = u.getUserID();
		}
		//else if (event.isDelete()) {
		//}
		loadUsers();
		
	}

	private void loadUsers() {
		
		UserServiceAsync svc = (UserServiceAsync)GWT.create(UserService.class);
		ServiceDefTarget endpoint = (ServiceDefTarget)svc;
		String moduleRelativeURL = GWT.getModuleBaseURL() + "user";
		endpoint.setServiceEntryPoint(moduleRelativeURL);

		AsyncCallback callback = new AsyncCallback() {

			public void onSuccess(Object result) {

				if (isSIAdmin() || isOrgAdmin()) {
				m_arrUsers = (WebUser[])result;
				}
				else {
					m_arrUsers = new WebUser[] { (WebUser)result };
				}
				
				refreshList();
				selectUser(m_iUserIDToSelect);
			}

			public void onFailure(Throwable caught) {
				Window.alert("UserPanel::loadUsers() -- service call failed.");
			}
		};
        
		if (isSIAdmin()) {
		    svc.getAllUsers(WebUser.FIELD_ALL_FIELDS, callback);
		}
		else if (isOrgAdmin()) {
		    svc.getUsersForOrganization(WebUser.FIELD_ALL_FIELDS, callback);
		}
		else {
		    svc.getCurrentUser(WebUser.FIELD_ALL_FIELDS, callback);
		}
	}

	
	public void onMouseDown(Widget sender, int x, int y) {
	}

	public void onMouseEnter(Widget sender) {

		if (sender.equals(m_imgNew) || 
				sender.equals(m_imgEdit) ||
				sender.equals(m_imgDelete) ||
				sender.equals(m_imgWizard) || 
				sender.equals(m_imgRefresh)) {

			sender.addStyleName("imageButton-OnMouseOver");
		}
	}

	public void onMouseLeave(Widget sender) {
		if (sender.equals(m_imgNew) || 
				sender.equals(m_imgEdit) ||
				sender.equals(m_imgDelete) ||
				sender.equals(m_imgWizard) || 
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

        		UserServiceAsync svc = (UserServiceAsync)GWT.create(UserService.class);
                ServiceDefTarget endpoint = (ServiceDefTarget)svc;
                String moduleRelativeURL = GWT.getModuleBaseURL() + "user";
                endpoint.setServiceEntryPoint(moduleRelativeURL);

                AsyncCallback callback = new AsyncCallback() {

                	public void onSuccess(Object result) {

                		m_iCurrentUserID = ((WebUser)result).getUserID();
                		m_This.init();
                	}

                    public void onFailure(Throwable caught) {
                    	Window.alert("UserPanel::getRoles() -- service call failed.");
                    }
                };
                
                try {
        			svc.getCurrentUser(WebUser.FIELD_ID, callback);
        		} catch (Exception e) {
        			// TODO Auto-generated catch block
        			e.printStackTrace();
        		}

        	}

            public void onFailure(Throwable caught) {
            	Window.alert("UserPanel::getRoles() -- service call failed.");
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

	private boolean isOrgAdmin() {
		
		if (m_arrRoles == null) {
			return false;
		}
		
		for (int i = 0; i < m_arrRoles.length; i++) {
			if (m_arrRoles[i].getRoleID() == SecurityConstants.ROLE_ORGANIZATION_ADMIN) {
				return true;
			}
		}
		
		return false;
	}

}
