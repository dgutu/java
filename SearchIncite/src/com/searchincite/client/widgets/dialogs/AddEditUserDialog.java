package com.searchincite.client.widgets.dialogs;


import java.util.Date;

import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.client.DateTimeFormat;
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
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.searchincite.client.data.constants.SecurityConstants;
import com.searchincite.client.entity.ChangeEvent;
import com.searchincite.client.entity.SecurityRole;
import com.searchincite.client.entity.WebUser;
import com.searchincite.client.listeners.UserChangeListener;
import com.searchincite.client.services.UserService;
import com.searchincite.client.services.UserServiceAsync;
import com.searchincite.client.services.UserServiceProxy;
import com.searchincite.client.widgets.OrganizationDropdown;
import com.searchincite.client.widgets.SecurityRoleCheckListBox;

  public class AddEditUserDialog extends DialogBox implements UserChangeListener, KeyboardListener {

	private boolean m_bEditing = false;
	private WebUser m_User = null;
	SecurityRole[] m_arrRoles = null;
    DockPanel m_pnlOuter = new DockPanel();
	FlexTable m_tblMain = new FlexTable();
	HorizontalPanel m_pnlButtons = new HorizontalPanel();
    
	TextBox m_txtUsername = new TextBox();
	TextBox m_txtFirstName = new TextBox();
	TextBox m_txtMiddleName = new TextBox();
	TextBox m_txtLastName= new TextBox();
	PasswordTextBox m_txtPassword1 = new PasswordTextBox();
	PasswordTextBox m_txtPassword2 = new PasswordTextBox();
	TextBox m_txtPhone = new TextBox();
	TextBox m_txtEmailAddress = new TextBox();
	CheckBox m_chkActive = new CheckBox();
	TextBox m_txtExpiration = new TextBox();
	CheckBox m_chkChangePasswordOnLogin = new CheckBox();
	OrganizationDropdown m_lstOrganizations = null;
	SecurityRoleCheckListBox m_lstRoles;

    int m_iUserID = -1;
    int m_iCurrentUserID = -1;
    
	private UserChangeListener m_UserChangeListener = null;
	
	public AddEditUserDialog(WebUser u, int iUserID, int iCurrentUserID, UserChangeListener listener, SecurityRole[] arrSecRoles) {

		super();

		m_iUserID = iUserID;
		m_iCurrentUserID = iCurrentUserID;
		m_arrRoles = arrSecRoles;
		m_UserChangeListener = listener;
		m_User = u;
		m_bEditing = m_User != null;

		if (m_bEditing) {
			setText("Edit User");
		} else {
			m_User = new WebUser();
			setText("New User");
		}

		m_pnlOuter.setSpacing(4);

		HorizontalPanel pnlCaption = new HorizontalPanel();
		HTML text = new HTML(
				"Enter information for the User below, then click OK to save, or Cancel to close this dialog.");
		pnlCaption.add(text);
		m_pnlOuter.add(pnlCaption, DockPanel.NORTH);

		m_tblMain.setSize("100%", "100%");
		// m_tblMain.setBorderWidth(1);

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

		// Build the UI

		HTML htmlUsernameCaption = new HTML("<b>Username:</b>");
		HTML htmlOrgCaption = new HTML("<b>Organization:</b>");
		HTML htmlFirstNameCaption = new HTML("<b>First name:</b>");
		HTML htmlMiddleNameCaption = new HTML("<b>Middle name:</b>");
		HTML htmlLastNameCaption = new HTML("<b>Last name:</b>");
		HTML htmlPassword1Caption = new HTML("<b>Password:</b>");
		HTML htmlPassword2Caption = new HTML("<b>Re-enter password:</b>");
		HTML htmlPhoneCaption = new HTML("<b>Telephone:</b>");
		HTML htmlEmailCaption = new HTML("<b>Email address:</b>");
		HTML htmlExpirationCaption = new HTML("<b>Expiration date:</b>");
		HTML htmlActiveCaption = new HTML("<b>Active:</b>");
		
		HTML htmlRolesCaption = new HTML("<b>Roles:</b>");

		m_chkChangePasswordOnLogin.setText("Force password change upon login");

		m_tblMain.setWidget(0, 0, htmlUsernameCaption);
		m_tblMain.setWidget(0, 1, m_txtUsername);
		m_tblMain.getFlexCellFormatter().setColSpan(0, 1, 2);
		m_tblMain.setWidget(0, 3, new HTML("&nbsp;")); // empty column

		if (isSIAdmin()) {
			m_tblMain.setWidget(0, 4, htmlOrgCaption);			
			m_lstOrganizations = new OrganizationDropdown(false);
			m_tblMain.setWidget(0, 5, m_lstOrganizations);
			m_tblMain.getFlexCellFormatter().setColSpan(0, 5, 2); // colspan empty
		}

		// Note: leave empty row (1)
		m_tblMain.setWidget(1, 0, new HTML("<hr size=\"1\"/>"));
		m_tblMain.getFlexCellFormatter().setColSpan(1, 0, 8); // colspan empty
																// column

		m_tblMain.setWidget(2, 0, htmlFirstNameCaption);
		m_tblMain.setWidget(2, 1, m_txtFirstName);
		m_tblMain.getFlexCellFormatter().setColSpan(2, 1, 2);
		m_tblMain.setWidget(2, 3, new HTML("&nbsp;")); // empty column
		// second column (on the right)
		m_tblMain.setWidget(2, 4, htmlPhoneCaption);
		m_tblMain.setWidget(2, 5, m_txtPhone);
		m_tblMain.getFlexCellFormatter().setColSpan(2, 5, 2);

		m_tblMain.setWidget(3, 0, htmlMiddleNameCaption);
		m_tblMain.setWidget(3, 1, m_txtMiddleName);
		m_tblMain.getFlexCellFormatter().setColSpan(3, 1, 2);
		m_tblMain.setWidget(3, 3, new HTML("&nbsp;")); // empty column
		// second column (on the right)
		m_tblMain.setWidget(3, 4, htmlEmailCaption);
		m_tblMain.setWidget(3, 5, m_txtEmailAddress);
		m_tblMain.getFlexCellFormatter().setColSpan(3, 5, 2);

		m_tblMain.setWidget(4, 0, htmlLastNameCaption);
		m_tblMain.setWidget(4, 1, m_txtLastName);
		m_tblMain.getFlexCellFormatter().setColSpan(4, 1, 2);
		m_tblMain.setWidget(4, 3, new HTML("&nbsp;")); // empty column
		// second column (on the right)
		m_tblMain.setWidget(4, 4, htmlExpirationCaption);
		m_tblMain.setWidget(4, 5, m_txtExpiration);
		m_tblMain.getFlexCellFormatter().setColSpan(4, 5, 2);

		m_tblMain.setWidget(6, 0, htmlPassword1Caption);
		m_tblMain.setWidget(6, 1, m_txtPassword1);
		m_tblMain.getFlexCellFormatter().setColSpan(6, 1, 2);
		m_tblMain.setWidget(6, 3, new HTML("&nbsp;")); // empty column
		// second column (on the right)
		m_tblMain.setWidget(6, 4, htmlActiveCaption);
		m_tblMain.setWidget(6, 5, m_chkActive);
		m_tblMain.getFlexCellFormatter().setColSpan(6, 5, 2);

		m_tblMain.setWidget(7, 0, htmlPassword2Caption);
		m_tblMain.setWidget(7, 1, m_txtPassword2);
		m_tblMain.getFlexCellFormatter().setColSpan(7, 1, 2);
		
		m_lstRoles = new SecurityRoleCheckListBox(false, isSIAdmin(), m_iCurrentUserID);
		try {
			if (isSIAdmin() || isOrgAdmin()) {
				m_lstRoles.loadAllRolesForUser(m_iUserID);
			}
			else {
				m_lstRoles.loadRolesForUser(m_iUserID);
			}
		} catch (Exception e) {
			e.printStackTrace();
			Window.alert("Failed to load roles");
		}
		m_lstRoles.setVisible(true);
		m_lstRoles.setHeight("43px");
		m_lstRoles.setWidth("150px");
		
		m_tblMain.setWidget(7, 3, new HTML("&nbsp;")); // empty column
		m_tblMain.setWidget(7, 4, htmlRolesCaption);
		m_tblMain.getFlexCellFormatter().setVerticalAlignment(7, 4, VerticalPanel.ALIGN_TOP);
		m_tblMain.setWidget(7, 5, m_lstRoles);
		//m_tblMain.getFlexCellFormatter().addStyleName(7, 2, "solidBlackBorder");
		m_lstRoles.addStyleName("solidBlackBorder");
		
		m_tblMain.getFlexCellFormatter().setColSpan(7, 5, 2); // colspan empty

		m_tblMain.getFlexCellFormatter().setColSpan(7, 5, 2); // colspan empty

		m_tblMain.setWidget(8, 0, new HTML("&nbsp;")); // empty column
		m_tblMain.setWidget(8, 0, m_chkChangePasswordOnLogin);
		m_tblMain.getFlexCellFormatter().setColSpan(8, 0, 8);

		HorizontalPanel pnlButtons = new HorizontalPanel();
		pnlButtons.setSpacing(4);
		pnlButtons.add(btnOK);
		pnlButtons.add(btnCancel);

		m_tblMain.setWidget(9, 0, pnlButtons);
		m_tblMain.getFlexCellFormatter().setColSpan(9, 0, 8);
		m_tblMain.getCellFormatter().setHorizontalAlignment(9, 0, HorizontalPanel.ALIGN_RIGHT);
		m_tblMain.getCellFormatter().setVerticalAlignment(9, 0, VerticalPanel.ALIGN_BOTTOM);
		// m_tblMain.getCellFormatter().setHeight(10, 0, "55px");

		m_pnlOuter.add(m_tblMain, DockPanel.CENTER);
		m_pnlOuter.setSpacing(8);

		// add keyboard listeners for ENTER keypress in edit boxes
		m_txtUsername.addKeyboardListener(this);
		m_txtFirstName.addKeyboardListener(this);
		m_txtMiddleName.addKeyboardListener(this);
		m_txtLastName.addKeyboardListener(this);
		m_txtPassword1.addKeyboardListener(this);
		m_txtPassword2.addKeyboardListener(this);
		m_txtPhone.addKeyboardListener(this);
		m_txtEmailAddress.addKeyboardListener(this);
		m_chkActive.addKeyboardListener(this);
		m_txtExpiration.addKeyboardListener(this);
		m_chkChangePasswordOnLogin.addKeyboardListener(this);

		m_txtUsername.setTabIndex(1);
		m_txtFirstName.setTabIndex(2);
		m_txtMiddleName.setTabIndex(3);
		m_txtLastName.setTabIndex(4);
		m_txtPassword1.setTabIndex(5);
		m_txtPassword2.setTabIndex(6);
		m_chkChangePasswordOnLogin.setTabIndex(7);
		m_txtPhone.setTabIndex(8);
		m_txtEmailAddress.setTabIndex(9);
		m_txtExpiration.setTabIndex(10);
		m_chkActive.setTabIndex(11);
		btnOK.setTabIndex(12);
		btnCancel.setTabIndex(13);
		
		setWidget(m_pnlOuter);

		if (m_bEditing) {
			loadUser();
			
			if (isSIAdmin()) {
				m_lstOrganizations.setEnabled(false);
			}
		}
		else {
			//defalut expire date is 30 days from creation of user
			//(Thanks, Java, for forcing this cheesy code.  Where's Date.addDays()??)
			Date dtDefaultExpire = new Date(new Date().getTime() + 2592000000L ); //2592000000 milliseconds = 30 days 
			DateTimeFormat dtf = DateTimeFormat.getFormat("MM/dd/yyyy hh:mm aa");
			m_txtExpiration.setText(dtf.format(dtDefaultExpire));
		}
	}

	private void onClickOK() {

		Date dtExpiration = null;
		if (m_txtExpiration.getText().trim().length() > 0) {
			try {
				DateTimeFormat dtf = DateTimeFormat.getFormat("MM/dd/yyyy hh:mm aa"); 
				dtExpiration = dtf.parse(m_txtExpiration.getText());
			}
			catch (IllegalArgumentException ex) {
				Window.alert("Invalid expiration date.  Please enter a valid date in the form: mm/dd/yyyy hh:mm am/pm");
				m_txtExpiration.setFocus(true);
				m_txtExpiration.selectAll();
				return;
			}
		}

		if (m_txtUsername.getText().trim().length() == 0) {
			Window.alert("Please enter a Username");
			m_txtUsername.setFocus(true);
			return;
		}
		if (m_txtFirstName.getText().trim().length() == 0) {
			Window.alert("First name cannot be blank.");
			m_txtFirstName.setFocus(true);
			return;
		}
		if (m_txtLastName.getText().trim().length() == 0) {
			Window.alert("Last name cannot be blank.");
			m_txtLastName.setFocus(true);
			return;
		}
		
		String strPassword1 = m_txtPassword1.getText().trim();
		String strPassword2 = m_txtPassword2.getText().trim();
		boolean bSetPassword = false;
		
		// check whether password was specified (if new user, password MUST be specified)
		if ((strPassword1.length() > 0 || strPassword1.length() > 0) || !m_bEditing) {
			
			if (!strPassword1.equals(strPassword2)) {
				Window.alert("Passwords do not match.");
				m_txtPassword1.setFocus(true);
				m_txtPassword1.selectAll();
				return;
			}
			
			if (strPassword1.length() < 6 || strPassword1.length() > 20 ||
					strPassword2.length() < 6 || strPassword2.length() > 20) {

				Window.alert("Password length must be between 6 and 20 characters.");
				m_txtPassword1.setFocus(true);
				m_txtPassword1.selectAll();
				return;
				
			}
			
			bSetPassword = true;
		}

		// populate fields in m_User with values from dialog
		m_User.setUserID(m_iUserID);
		m_User.setActive(m_chkActive.isChecked());
		m_User.setChangePasswordOnLogin(m_chkChangePasswordOnLogin.isChecked());
		m_User.setEMailAddress(m_txtEmailAddress.getText().trim());
		m_User.setExpiration(dtExpiration);
		m_User.setFirstName(m_txtFirstName.getText().trim());
		m_User.setLastName(m_txtLastName.getText().trim());
		m_User.setMiddleName(m_txtMiddleName.getText().trim());
		m_User.setUsername(m_txtUsername.getText().trim());
		m_User.setTelephone(m_txtPhone.getText().trim());
		
		if (bSetPassword) {
			m_User.setPassword(strPassword1);
		}
		else {
			m_User.setPassword("");
		}
		
		if (isSIAdmin() || isOrgAdmin()) {
			m_User.setSecurityRoleIDs(m_lstRoles.getSelectedRoleIDs());
		}

		if (!m_bEditing) {
			if (isSIAdmin()) {
				m_User.setOrganizationID(Integer.parseInt(m_lstOrganizations.getValue(m_lstOrganizations.getSelectedIndex())));
			}
	    	createUser(m_User);
    	}
    	else {
    		updateUser(m_User);
    	}
	}
	
	public void show() {
		  super.show();
		  int left = (Window.getClientWidth() - getOffsetWidth()) / 2 + getBodyScrollLeft();
		  int top = (Window.getClientHeight() - getOffsetHeight()) / 2 + getBodyScrollTop();
		  setPopupPosition(left, top);

		  if (!m_bEditing) {
			  m_txtUsername.selectAll();
			  m_txtUsername.setFocus(true);
		  }
		  else {
			  m_txtFirstName.setFocus(true);
		  }
	  }

	  private native int getBodyScrollLeft() /*-{
	        return $doc.body.scrollLeft;
	      }-*/;

	  private native int getBodyScrollTop() /*-{
	        return $doc.body.scrollTop;
	      }-*/;
	
		public void createUser(WebUser u) {
			UserServiceProxy proxy = new UserServiceProxy();
			proxy.addUserChangeListener(this);
			proxy.addUserChangeListener(m_UserChangeListener);
			proxy.createUser(u);
		}

	public void onUserChange(WebUser u, ChangeEvent event) {
		if (event.isCreate() || event.isUpdate()) {
			hide();
		}
	}

	public void updateUser(WebUser u) {
		UserServiceProxy proxy = new UserServiceProxy();
		proxy.addUserChangeListener(this);
		proxy.addUserChangeListener(m_UserChangeListener);
		proxy.updateUser(u);
	}

	public void onKeyDown(Widget sender, char keyCode, int modifiers) {
	}

	public void onKeyPress(Widget sender, char keyCode, int modifiers) {
		if ((
				sender == m_txtUsername || 
				sender == m_txtFirstName || 
				sender == m_txtMiddleName ||
				sender == m_txtLastName ||
				sender == m_txtPassword1 ||
				sender == m_txtPassword2 ||
				sender == m_txtPhone ||
				sender == m_txtEmailAddress ||
				sender == m_chkActive ||
				sender == m_txtExpiration ||
				sender == m_chkChangePasswordOnLogin
				) && keyCode == 13) {
			
			onClickOK();
		}
		else if (keyCode == 27) {
			hide();
		}
	}

	public void onKeyUp(Widget sender, char keyCode, int modifiers) {
	}

	public void loadUser() {
		
		UserServiceAsync svc = (UserServiceAsync)GWT.create(UserService.class);
        ServiceDefTarget endpoint = (ServiceDefTarget)svc;
        String moduleRelativeURL = GWT.getModuleBaseURL() + "user";
        endpoint.setServiceEntryPoint(moduleRelativeURL);

        AsyncCallback callback = new AsyncCallback() {

        	public void onSuccess(Object result) {

        		m_User = (WebUser)result;
				
				m_txtUsername.setText(m_User.getUsername());
				m_txtUsername.setReadOnly(true);
				m_txtUsername.setEnabled(false);
				m_txtFirstName.setText(m_User.getFirstName());
				m_txtMiddleName.setText(m_User.getMiddleName());
				m_txtLastName.setText(m_User.getLastName());
				// leave password fields blank
				m_txtPhone.setText(m_User.getTelephone());
				m_txtEmailAddress.setText(m_User.getEMailAddress());
				m_chkActive.setChecked(m_User.getActive());
				
				if (m_User.getExpiration() != null) {
					DateTimeFormat dtf = DateTimeFormat.getFormat("MM/dd/yyyy hh:mm aa"); 
					m_txtExpiration.setText(dtf.format(m_User.getExpiration()));
				}
				else {
					m_txtExpiration.setText("");
				}
				m_chkChangePasswordOnLogin.setChecked(m_User.getChangePasswordOnLogin());
				
				if (isSIAdmin()) {
					
					for (int iOrgs = 0; iOrgs < m_lstOrganizations.getItemCount(); iOrgs++) {
						if (m_lstOrganizations.getValue(iOrgs).equals(String.valueOf(m_User.getOrganizationID()))) {
							m_lstOrganizations.setItemSelected(iOrgs, true);
							break;
						}
						else {
							m_lstOrganizations.setItemSelected(iOrgs, false);
						}
					}

					// Can't CHANGE the organization of an existing user.
					m_lstOrganizations.setEnabled(false);
				}

        	}

            public void onFailure(Throwable caught) {
            	Window.alert("AddEditUserDialog::loadUser() -- service call failed.");
            }
        };
        
        svc.getUserByID(m_iUserID, WebUser.FIELD_ALL_FIELDS, callback);
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
