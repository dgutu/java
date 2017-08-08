package com.searchincite.client.widgets;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.Tree;
import com.google.gwt.user.client.ui.TreeItem;
import com.google.gwt.user.client.ui.TreeListener;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.searchincite.client.data.constants.SecurityConstants;
import com.searchincite.client.entity.SecurityRole;
import com.searchincite.client.services.UserService;
import com.searchincite.client.services.UserServiceAsync;


public class LeftNavPanel extends Composite {

	private ScrollPanel m_ScrollPanel = new ScrollPanel();
	private VerticalPanel m_TreeNavPanel = new VerticalPanel();
	private Tree m_Tree = new Tree();
	SecurityRole[] m_arrRoles = null;
	private LeftNavPanel m_This = this; // This is a bad design, but was done because there
	 // are no synchronous method calls in GWT.  We need
	 // to determine the security roles before we can
	 // construct the list because some columns are
	 // not available for some users (i.e., non-admins).
	
	public void addTreeListener(TreeListener tl) {
		m_Tree.addTreeListener(tl);
	}

	public LeftNavPanel() {
	
		m_ScrollPanel.setWidth("150px");
		m_Tree.setWidth("150px");
		//TreeItem itemRoot = new TreeItem();
		//itemRoot.setText("Search Incite");
		//m_Tree.addItem(itemRoot);

		//Label lbl = new Label();
		//lbl.setText("Search Incite");
		//lbl.setStyleName("navRootLabel");
		//lbl.setHeight("20px");

		//m_TreeNavPanel.add(lbl);
		
		m_ScrollPanel.add(m_TreeNavPanel);
		
		initWidget(m_ScrollPanel);
		
		preInit();
	}

	private void init() {

		TreeItem tiDocumentManager = new TreeItem();
		tiDocumentManager.setText("Document Manager");
		m_Tree.addItem(tiDocumentManager);

		TreeItem tiOntologyEditor = new TreeItem();
		tiOntologyEditor.setText("Ontology Editor");
		m_Tree.addItem(tiOntologyEditor);
		m_Tree.setSelectedItem(tiOntologyEditor);

		if (isSIAdmin()) {
			TreeItem tiOrgManager = new TreeItem();
			tiOrgManager.setText("Organization Manager");
			m_Tree.addItem(tiOrgManager);
		}

		TreeItem tiUserManager = new TreeItem();
		tiUserManager.setText("User Manager");
		m_Tree.addItem(tiUserManager);

		//m_Tree.addItem(new HTML("<b>Item 2</b>"));

		m_TreeNavPanel.add(m_Tree);

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
	
	public boolean isSIAdmin() {
		
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

	public boolean isOrgAdmin() {
		
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
