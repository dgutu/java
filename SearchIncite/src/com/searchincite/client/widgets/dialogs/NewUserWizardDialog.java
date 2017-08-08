package com.searchincite.client.widgets.dialogs;


import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.DockPanel;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.KeyboardListener;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.searchincite.client.data.constants.SecurityConstants;
import com.searchincite.client.entity.ChangeEvent;
import com.searchincite.client.entity.SecurityRole;
import com.searchincite.client.entity.UserWizardRunInfo;
import com.searchincite.client.entity.WebUser;
import com.searchincite.client.listeners.UserChangeListener;
import com.searchincite.client.services.UserService;
import com.searchincite.client.services.UserServiceAsync;
import com.searchincite.client.services.UserServiceProxy;
import com.searchincite.client.util.EmailUtil;
import com.searchincite.client.widgets.NewUserWizardStep1Panel;
import com.searchincite.client.widgets.NewUserWizardStep2Panel;

  public class NewUserWizardDialog extends DialogBox implements UserChangeListener, KeyboardListener {

	//private boolean m_bEditing = false;
	private WebUser m_User = null;
	SecurityRole[] m_arrRoles = null;
    DockPanel m_pnlOuter = new DockPanel();
    VerticalPanel m_pnlSteps = new VerticalPanel();
	FlexTable m_tblMain = new FlexTable();
	HorizontalPanel m_pnlButtons = new HorizontalPanel();
	HorizontalPanel m_pnlCaption = new HorizontalPanel();
	Button m_btnBack = null;
	Button m_btnNext = null;
	Button m_btnFinish = null;
	Button m_btnCancel = null;
	UserWizardRunInfo m_WizardRunInfo = new UserWizardRunInfo();
	
	NewUserWizardStep1Panel m_pnlStep1 = new NewUserWizardStep1Panel();
	NewUserWizardStep2Panel m_pnlStep2 = new NewUserWizardStep2Panel();
	
    int m_iUserID = -1;
    int m_iCurrentUserID = -1;
    
	private UserChangeListener m_UserChangeListener = null;
	
	public NewUserWizardDialog(WebUser u, int iUserID, int iCurrentUserID, UserChangeListener listener, SecurityRole[] arrSecRoles) {

		super();

		m_iUserID = iUserID;
		m_iCurrentUserID = iCurrentUserID;
		m_arrRoles = arrSecRoles;
		m_UserChangeListener = listener;
		m_User = u;

		setText("New User Wizard - Step 1");

		m_pnlOuter.setSpacing(4);

		HTML text = new HTML(
				"This wizard will help you quickly and easily create a new user and/or organization,<br> copy a specific ontology to the new organization, and notify the new user via<br>email that a Search Incite account has been created for them and is ready for use.");
		m_pnlCaption.add(text);
		m_pnlOuter.add(m_pnlCaption, DockPanel.NORTH);

		m_tblMain.setSize("100%", "100%");
		// m_tblMain.setBorderWidth(1);

		m_pnlButtons.setHorizontalAlignment(HorizontalPanel.ALIGN_RIGHT);
		m_pnlButtons.setSpacing(4);
		m_btnBack = new Button("<< Back", new ClickListener() {
			public void onClick(Widget sender) {
				onClickBack();
			}
		});
		m_btnBack.setVisible(false);

		m_btnNext = new Button("Next >>", new ClickListener() {
			public void onClick(Widget sender) {
				onClickNext();
			}
		});

		m_btnFinish = new Button("Finish", new ClickListener() {
			public void onClick(Widget sender) {
				onClickFinish();
			}
		});
		m_btnFinish.setVisible(false);
		
		m_btnCancel = new Button("Cancel", new ClickListener() {
			public void onClick(Widget sender) {
				onClickCancel();
			}
		});

		// Build the UI

		
		m_pnlSteps.add(m_pnlStep1);
		m_pnlSteps.add(m_pnlStep2);
		m_pnlStep2.setVisible(false);
		//m_tblMain.setWidget(0, 0, m_pnlStep1);
		m_tblMain.setWidget(0, 0, m_pnlSteps);;

		m_pnlButtons.setSpacing(4);
		m_pnlButtons.add(m_btnBack);
		m_pnlButtons.add(m_btnNext);
		m_pnlButtons.add(m_btnFinish);
		m_pnlButtons.add(m_btnCancel);

		m_tblMain.setWidget(1, 0, m_pnlButtons);
		m_tblMain.getCellFormatter().setHorizontalAlignment(1, 0, HorizontalPanel.ALIGN_RIGHT);
		m_tblMain.getCellFormatter().setVerticalAlignment(1, 0, VerticalPanel.ALIGN_BOTTOM);
		// m_tblMain.getCellFormatter().setHeight(10, 0, "55px");

		m_pnlOuter.add(m_tblMain, DockPanel.CENTER);
		m_pnlOuter.setSpacing(8);

		//m_btnOK.setTabIndex(12);
		//m_btnCancel.setTabIndex(13);

		setWidget(m_pnlOuter);

		/*
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
		*/
	}

	private void onClickBack() {
		//Window.alert("Back - Not implemented");
		m_pnlStep2.setVisible(false);
		m_pnlStep1.setVisible(true);
		m_btnBack.setVisible(false);
		
		m_btnFinish.setVisible(false);
		m_btnNext.setVisible(true);

		setText("New User Wizard - Step 1");
		center();
	}

	private void onClickFinish() {
		//Window.alert("Finish - Not implemented");
		
		// Gather info from step 1 and 2
		String strEmailAddress = m_pnlStep1.getEmailAddress();
		String strUsername = m_pnlStep2.getUsername();
		String strOrganizationName = m_pnlStep2.getOrganizationName();
		int iSelectedOntologyID = m_pnlStep2.getSelectedOntologyID();
		String strEmailBody = m_pnlStep2.getEmailBody();
		
		m_WizardRunInfo.setOntologyID(iSelectedOntologyID);
		m_WizardRunInfo.setEmailText(strEmailBody);
		m_WizardRunInfo.setEmailAddress(strEmailAddress);
		m_WizardRunInfo.setOrganizationName(strOrganizationName);
		m_WizardRunInfo.setUserName(strUsername);
		completeWizard();		
	}

	private void onClickCancel() {
		hide();
	}

	private void parseEmail() {
		
		String strOrganization = m_pnlStep1.getEmailAddress().substring(m_pnlStep1.getEmailAddress().indexOf('@') + 1, m_pnlStep1.getEmailAddress().lastIndexOf('.'));
		String strUsername = m_pnlStep1.getEmailAddress().substring(0, m_pnlStep1.getEmailAddress().indexOf('@'));
		
		m_pnlStep2.setUsername(strUsername);
		m_pnlStep2.setOrganizationName(strOrganization);
		
		m_pnlStep1.setDirty(false);
	}
	
	private void onClickNext() {

		if (!EmailUtil.isValidEmailAddress(m_pnlStep1.getEmailAddress())) {
			Window.alert("Invalid email address");
			return;
		}

		if (m_pnlStep1.isDirty()) {
			parseEmail();
		}
		
		m_pnlStep1.setVisible(false);
		m_btnBack.setVisible(true);
		m_btnFinish.setVisible(true);
		m_btnNext.setVisible(false);

		//if (m_pnlStep1.isVisible()) {
			m_pnlStep2.setVisible(true);
		//}
		//else {
		//	m_pnlStep1.setVisible(true);
		//	m_pnlStep2.setVisible(false);
		//}

		setText("New User Wizard - Step 2");
		center();
		/*
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
    	*/
	}
	
	
	public void show() {
		super.show();
		int left = (Window.getClientWidth() - getOffsetWidth()) / 2 + getBodyScrollLeft();
		int top = (Window.getClientHeight() - getOffsetHeight()) / 2 + getBodyScrollTop();
		setPopupPosition(left, top);

		/*
		if (!m_bEditing) {
			m_txtUsername.selectAll();
			m_txtUsername.setFocus(true);
		}
		else {
			m_txtFirstName.setFocus(true);
		}
		*/
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
		/*
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
		else*/
		if (keyCode == 27) {
			onClickCancel();
		}
	}

	public void onKeyUp(Widget sender, char keyCode, int modifiers) {
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

	public void completeWizard() {
		
		UserServiceAsync svc = (UserServiceAsync)GWT.create(UserService.class);
        ServiceDefTarget endpoint = (ServiceDefTarget)svc;
        String moduleRelativeURL = GWT.getModuleBaseURL() + "user";
        endpoint.setServiceEntryPoint(moduleRelativeURL);

        AsyncCallback callback = new AsyncCallback() {

        	public void onSuccess(Object result) {
        		hide();
        	}

            public void onFailure(Throwable caught) {
            	Window.alert("NewUserWizardDialog::completeWizard() -- service call failed.");
            }
        };
        
        try {
			svc.completeNewUserWizard(m_WizardRunInfo, callback);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

  }
