package com.searchincite.client.widgets;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.searchincite.client.data.constants.SecurityConstants;
import com.searchincite.client.entity.SecurityRole;
import com.searchincite.client.services.UserService;
import com.searchincite.client.services.UserServiceAsync;

public class SecurityRoleCheckListBox extends ScrollPanel {

	private boolean m_bReadOnly = true;
	SecurityRole[] m_arrSecurityRoles;
	SecurityRole[] m_arrAssignedSecurityRoles;
	VerticalPanel m_pnlList = new VerticalPanel();
	int m_iUserID = -1;
	boolean m_bCallerIsSIAdmin = false;
	int m_iCallingUserID = -1;
	
	public boolean getReadOnly() {
		return m_bReadOnly;
	} 
	
	public SecurityRoleCheckListBox(boolean bReadOnly, boolean bCallerIsSIAdmin, int iCallingUserID) {

		m_iCallingUserID = iCallingUserID; 
		m_bReadOnly = bReadOnly;
		m_bCallerIsSIAdmin = bCallerIsSIAdmin;
		add(m_pnlList);
		//m_pnlList.setBorderWidth(10);
		setHeight("100%");
	}
	
	public void loadRolesForUser(int iUserID) throws Exception {

		m_iUserID = iUserID;
		UserServiceAsync svc = (UserServiceAsync)GWT.create(UserService.class);
        ServiceDefTarget endpoint = (ServiceDefTarget)svc;
        String moduleRelativeURL = GWT.getModuleBaseURL() + "user";
        endpoint.setServiceEntryPoint(moduleRelativeURL);

        AsyncCallback callback = new AsyncCallback() {

        	public void onSuccess(Object result) {
        		m_arrSecurityRoles = (SecurityRole[])result;
        		fillList();
        	}

            public void onFailure(Throwable caught) {
            	Window.alert("SecurityRoleCheckListBox::loadRolesForUser() -- call to userService failed.");
            }
        };
        
        svc.getSecurityRolesForUser(iUserID, callback);
	}

	public void loadAllRolesForUser(int iUserID) throws Exception {

		m_iUserID = iUserID;
		UserServiceAsync svc = (UserServiceAsync)GWT.create(UserService.class);
        ServiceDefTarget endpoint = (ServiceDefTarget)svc;
        String moduleRelativeURL = GWT.getModuleBaseURL() + "user";
        endpoint.setServiceEntryPoint(moduleRelativeURL);
        m_arrAssignedSecurityRoles = null;

        AsyncCallback callback = new AsyncCallback() {

        	public void onSuccess(Object result) {
        		m_arrSecurityRoles = (SecurityRole[])result;
        		try { 
        			fillListAndSelectRolesForUser();
        		}
        		catch (Exception ex) {
                	Window.alert("SecurityRoleCheckListBox::loadAllRolesForUser() (1) -- call to service failed.");
        		}
        	}

            public void onFailure(Throwable caught) {
            	Window.alert("SecurityRoleCheckListBox::loadAllRolesForUser() (2) -- call to service failed.");
            }
        };
        
        svc.getAllSecurityRoles(callback);
	}

	private void fillListAndSelectRolesForUser() throws Exception {

		UserServiceAsync svc = (UserServiceAsync)GWT.create(UserService.class);
        ServiceDefTarget endpoint = (ServiceDefTarget)svc;
        String moduleRelativeURL = GWT.getModuleBaseURL() + "user";
        endpoint.setServiceEntryPoint(moduleRelativeURL);

        AsyncCallback callback = new AsyncCallback() {

        	public void onSuccess(Object result) {
        		
        		m_arrAssignedSecurityRoles = (SecurityRole[])result;

        		m_pnlList.clear();
        		
        		if (m_arrSecurityRoles == null) {
        			return;
        		}
        		
        		for (int i = 0; i < m_arrSecurityRoles.length; i++) {
        			
        			if (!getReadOnly()) {
        				
        				SecurityRoleCheckBox cb = new SecurityRoleCheckBox(m_arrSecurityRoles[i]);
        				
        				if (m_arrAssignedSecurityRoles != null) {
	        				// Check whether or not this is an assigned role
	        				for (int j = 0; j < m_arrAssignedSecurityRoles.length; j++) {
	        					if (m_arrAssignedSecurityRoles[j].getRoleID() == m_arrSecurityRoles[i].getRoleID()) {
	        						cb.setChecked(true);
	        						break;
	        					}
	        				}
        				}
        				
        				if (m_arrSecurityRoles[i].getRoleID() == SecurityConstants.ROLE_SI_ADMIN) {
        					if (m_iUserID == m_iCallingUserID) {
        						// Don't let SI Admins uncheck their SI Admin role
        						cb.setEnabled(false);
        					}
        				}
        				else if (m_arrSecurityRoles[i].getRoleID() == SecurityConstants.ROLE_ORGANIZATION_ADMIN) {
        					if (m_iUserID == m_iCallingUserID && !m_bCallerIsSIAdmin) {
        						// Don't let Org Admins uncheck their Org Admin role
        						cb.setEnabled(false);
        					}
        				}
        				
        				m_pnlList.add(cb);
        			}
        			else {
        				Label lbl = new Label(m_arrSecurityRoles[i].getRoleName());
        				m_pnlList.add(lbl);				
        			}
        		}
        		
        		m_pnlList.setHeight("100%");
        	}

            public void onFailure(Throwable caught) {
            	Window.alert("SecurityRoleCheckListBox::fillListAndSelectRolesForUser() -- call to userService failed.");
            }
        };
        
        svc.getSecurityRolesForUser(m_iUserID, callback);
	}

	private void fillList() {
		
		m_pnlList.clear();
		
		if (m_arrSecurityRoles == null) {
			return;
		}
		
		for (int i = 0; i < m_arrSecurityRoles.length; i++) {
			
			if (!getReadOnly()) {
				SecurityRoleCheckBox cb = new SecurityRoleCheckBox(m_arrSecurityRoles[i]);
				
				if (m_arrSecurityRoles[i].getRoleID() == SecurityConstants.ROLE_SI_ADMIN) {
					if (m_iUserID == m_iCallingUserID) {
						// Don't let SI Admins uncheck their SI Admin role
						cb.setEnabled(false);
					}
				}
				else if (m_arrSecurityRoles[i].getRoleID() == SecurityConstants.ROLE_ORGANIZATION_ADMIN) {
					if (m_iUserID == m_iCallingUserID && !m_bCallerIsSIAdmin) {
						// Don't let Org Admins uncheck their Org Admin role
						cb.setEnabled(false);
					}
				}
				
				m_pnlList.add(cb);
			}
			else {
				Label lbl = new Label(m_arrSecurityRoles[i].getRoleName());
				m_pnlList.add(lbl);				
			}
		}
		
		m_pnlList.setHeight("100%");

	}

	public int[] getSelectedRoleIDs() {
		
		if (getReadOnly() || m_pnlList.getWidgetCount() <= 0) {
			return null;
		}

		int[] iArrRoleIDs = null;
		int iSelectedRoleCount = 0;

		// TODO: Make this more efficient (don't go through the list twice)
		for (int i = 0; i < m_pnlList.getWidgetCount(); i++) {
			SecurityRoleCheckBox cb = (SecurityRoleCheckBox)m_pnlList.getWidget(i);
			if (cb.isChecked()) {
				iSelectedRoleCount++;
			}
		}

		if (iSelectedRoleCount > 0) {
			iArrRoleIDs = new int[iSelectedRoleCount];
			
			for (int i = 0; i < m_pnlList.getWidgetCount(); i++) {
				SecurityRoleCheckBox cb = (SecurityRoleCheckBox)m_pnlList.getWidget(i);
	
				if (cb.isChecked()) {
					iArrRoleIDs[--iSelectedRoleCount] = cb.getSecurityRole().getRoleID();
				}
			}
		}
		
		return iArrRoleIDs;
	}
	

}
