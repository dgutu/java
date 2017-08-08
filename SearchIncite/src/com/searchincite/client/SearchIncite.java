package com.searchincite.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalSplitPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TreeItem;
import com.google.gwt.user.client.ui.TreeListener;
import com.searchincite.client.entity.WebUser;
import com.searchincite.client.listeners.LoginListener;
import com.searchincite.client.security.LoginService;
import com.searchincite.client.security.LoginServiceAsync;
import com.searchincite.client.widgets.DocumentManagerPanel;
import com.searchincite.client.widgets.HeaderPanel;
import com.searchincite.client.widgets.LeftNavPanel;
import com.searchincite.client.widgets.LoginPanel;
import com.searchincite.client.widgets.OntologyEditorPanel;
import com.searchincite.client.widgets.OrganizationManagerPanel;
import com.searchincite.client.widgets.StatusPanel;
import com.searchincite.client.widgets.UserManagerPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class SearchIncite implements EntryPoint, LoginListener, TreeListener {

	LoginPanel m_pnlLogin = new LoginPanel();

	//HeaderPanel m_pnlHeader = new HeaderPanel();
	//TreePanel m_pnlTree = new TreePanel();
	//DetailPanel m_pnlDetail = new DetailPanel();
	//TestPanel m_pnlTest = new TestPanel();

	//LoginPanel m_pnlLogin = null;
	HeaderPanel m_pnlHeader = null;

	HorizontalSplitPanel m_tblMain = new HorizontalSplitPanel();

	LeftNavPanel m_pnlLeftNav = null;
	OntologyEditorPanel m_pnlOntologyEditor = null;
	DocumentManagerPanel m_pnlDocumentManager = null;
	UserManagerPanel m_pnlUserManager = null;
	OrganizationManagerPanel m_pnlOrgManager = null;
	
	HTML m_htmlUserCaption = new HTML();
	HTML m_htmlCurrentUser = new HTML();

	//TreePanel m_pnlTree = null;
	//DetailPanel m_pnlDetail = null;
	StatusPanel m_pnlTest = null;

	Boolean m_bAuthenticated = Boolean.FALSE;

	//long m_lUserID = 0;
	//long m_lOrgID = 0;

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {

		//final Button button = new Button("Click me!");
		//final Label label = new Label();
		//final Tree tree = new Tree();

		m_htmlUserCaption.setHTML("User:&nbsp;<br><br>");
		m_htmlUserCaption.setVisible(false);
		RootPanel.get("pnlUserCaption").add(m_htmlUserCaption);
		
		m_htmlCurrentUser.setVisible(false);
		RootPanel.get("pnlCurrentUser").add(m_htmlCurrentUser);
		
		m_pnlLogin.addLoginListener(this);
		//button.addClickListener(new ClickListener() {
		//	public void onClick(Widget sender) {}
		//});		

		//TreeItem ti = tree.addItem("Parent Item");
		//ti.addItem("Child Item");

		//try {
		//java.sql.Connection pSQL = DriverManager.getConnection("jdbc:postgresql:postgres","postgres","");
		//Object o = (Object)com.searchincite.server.data.BaseData.getConnection(strErr);
		//}
		//catch (Exception ex) {
		//label.setText("Failed to connect to database.  Exception: " + strErr);
		//}

		// Assume that the host HTML has elements defined whose
		// IDs are "slot1", "slot2".  In a real app, you probably would not want
		// to hard-code IDs.  Instead, you could, for example, search for all 
		// elements with a particular CSS class and replace them with widgets.
		//

		//FlexTable tblLogin = new FlexTable();

		//DockPanel topPanel = new DockPanel();
		//topPanel.setVerticalAlignment(DockPanel.ALIGN_MIDDLE);
		//topPanel.add(txtUserName);
		//topPanel.add(txtPassword);

		RootPanel.get("pnlLogin").add(m_pnlLogin);
		//RootPanel.get("pnlHeader").add(m_pnlHeader);
		//RootPanel.get("pnlTree").add(m_pnlTree);
		//RootPanel.get("pnlDetail").add(m_pnlDetail);
		//RootPanel.get("pnlTest").add(m_pnlTest);

		if (isAuthenticated().equals(Boolean.FALSE)) {
			RootPanel.get("pnlLogin").setVisible(true);
			m_pnlLogin.setFocus(true);
			//RootPanel.get("pnlHeader").setVisible(false);
			//RootPanel.get("pnlTree").setVisible(false);
			//RootPanel.get("pnlDetail").setVisible(false);
		} else {
			RootPanel.get("pnlLogin").setVisible(false);
			//RootPanel.get("pnlHeader").setVisible(true);
			//RootPanel.get("pnlTree").setVisible(true);
			//RootPanel.get("pnlDetail").setVisible(true);
		}
	}

	private Boolean isAuthenticated() {

		LoginServiceAsync loginService = (LoginServiceAsync) GWT
				.create(LoginService.class);
		ServiceDefTarget endpoint = (ServiceDefTarget) loginService;
		String moduleRelativeURL = GWT.getModuleBaseURL() + "auth";
		endpoint.setServiceEntryPoint(moduleRelativeURL);

		AsyncCallback<Object> callback = new AsyncCallback<Object>() {

			public void onSuccess(Object result) {
				m_bAuthenticated = (Boolean) result;
			}

			public void onFailure(Throwable caught) {
				m_bAuthenticated = Boolean.FALSE;
			}
		};

		loginService.isAuthenticated(callback);

		return m_bAuthenticated;
	}

	private void setCurrentUserInfo() {

		LoginServiceAsync loginService = (LoginServiceAsync) GWT
				.create(LoginService.class);
		ServiceDefTarget endpoint = (ServiceDefTarget) loginService;
		String moduleRelativeURL = GWT.getModuleBaseURL() + "auth";
		endpoint.setServiceEntryPoint(moduleRelativeURL);

		AsyncCallback<Object> callback = new AsyncCallback<Object>() {

			public void onSuccess(Object result) {
				WebUser wu = (WebUser)result;
				m_htmlCurrentUser.setHTML(wu.getFullName() + "&nbsp;<br><a onclick=\"document.location=document.location;\" href=\"#\" style=\"font-family: Verdana; text-decoration: none; font-size: 7pt;\">[logout]</a>&nbsp;");
			}

			public void onFailure(Throwable caught) {
				m_htmlCurrentUser.setHTML("");
			}
		};

		loginService.getWebUser(callback);
	}
	
	public void onLoginAttempt(Boolean bLoggedIn) {

		//Window.alert("in SearchIncite::onLoginAttempt");

		//if (isAuthenticated().equals(Boolean.FALSE)) {
		if (bLoggedIn.equals(Boolean.FALSE)) {

			// Display (only) the login panel if the user is not authenticated.
			// Remove all Widgets from the page
			if (m_pnlHeader != null) {
				RootPanel.get("pnlHeader").remove(m_pnlHeader);
			}
			if (m_pnlOntologyEditor != null) {
				RootPanel.get("pnlApp").remove(m_pnlOntologyEditor);
			}
			if (m_pnlDocumentManager != null) {
				RootPanel.get("pnlDocManager").remove(m_pnlDocumentManager);
			}
			if (m_pnlUserManager != null) {
				RootPanel.get("pnlUserManager").remove(m_pnlUserManager);
			}
			if (m_pnlOrgManager != null) {
				RootPanel.get("pnlOrgManager").remove(m_pnlOrgManager);
			}
			if (m_pnlLeftNav != null) {
				RootPanel.get("pnlLeftNav").remove(m_pnlLeftNav);
			}
			//if (m_pnlTree != null)   { RootPanel.get("pnlTree").remove(m_pnlTree); }
			//if (m_pnlDetail != null) { RootPanel.get("pnlDetail").remove(m_pnlDetail); }
			if (m_pnlTest != null) {
				RootPanel.get("pnlTest").remove(m_pnlTest);
			}

			m_pnlHeader = null;
			//m_pnlTree = null;
			//m_pnlDetail = null;
			m_pnlOntologyEditor = null;
			m_pnlDocumentManager = null;
			m_pnlUserManager = null;
			m_pnlOrgManager = null;
			m_pnlTest = null;
			m_pnlLeftNav = null;

			RootPanel.get("pnlLogin").setVisible(true);
			RootPanel.get("pnlHeader").setVisible(false);
			RootPanel.get("pnlApp").setVisible(false);
			RootPanel.get("pnlLeftNav").setVisible(false);
			RootPanel.get("pnlDocManager").setVisible(false);
			RootPanel.get("pnlOrgManager").setVisible(false);
			m_htmlUserCaption.setVisible(false);
			m_htmlCurrentUser.setVisible(false);
			
			//RootPanel.get("pnlTree").setVisible(false);
			//RootPanel.get("pnlDetail").setVisible(false);
		} else {
			//Window.alert("Success!");
			m_pnlHeader = new HeaderPanel();
			//m_pnlTree = new TreePanel();
			//m_pnlDetail = new DetailPanel();
			m_pnlOntologyEditor = new OntologyEditorPanel();
			m_pnlDocumentManager = new DocumentManagerPanel();
			m_pnlUserManager = new UserManagerPanel();
			m_pnlOrgManager = new OrganizationManagerPanel();
			m_pnlTest = new StatusPanel();
			m_pnlLeftNav = new LeftNavPanel();
			m_pnlLeftNav.addTreeListener(this);

			RootPanel.get("pnlHeader").add(m_pnlHeader);
			RootPanel.get("pnlApp").add(m_pnlOntologyEditor);
			RootPanel.get("pnlDocManager").add(m_pnlDocumentManager);
			RootPanel.get("pnlUserManager").add(m_pnlUserManager);
			RootPanel.get("pnlOrgManager").add(m_pnlOrgManager);

			//RootPanel.get("pnlTree").add(m_pnlTree);
			//RootPanel.get("pnlDetail").add(m_pnlDetail);
			RootPanel.get("pnlTest").add(m_pnlTest);
			RootPanel.get("pnlLeftNav").add(m_pnlLeftNav);

			RootPanel.get("pnlLogin").setVisible(false);
			RootPanel.get("pnlHeader").setVisible(true);
			RootPanel.get("pnlApp").setVisible(true);
			RootPanel.get("pnlDocManager").setVisible(false);
			RootPanel.get("pnlUserManager").setVisible(false);
			RootPanel.get("pnlOrgManager").setVisible(false);
			RootPanel.get("pnlLeftNav").setVisible(true);
			//RootPanel.get("pnlTree").setVisible(true);
			//RootPanel.get("pnlDetail").setVisible(true);
			m_htmlUserCaption.setVisible(true);
			//m_htmlCurrentUser.setHTML("Tom Kochan&nbsp;<br><a href=\"#\" style=\"font-family: Verdana; text-decoration: none; font-size: 7pt;\">[logout]</a>&nbsp;");
			setCurrentUserInfo();
			m_htmlCurrentUser.setVisible(true);
		}
	}

	public void onTreeItemSelected(TreeItem item) {

		//if (m_bAuthenticated == Boolean.FALSE) {
		//	return;
		//}

		hideAllPanels();
		
		if (item.getText().equals("Ontology Editor")) {
			RootPanel.get("pnlApp").setVisible(true);
		}
		if (item.getText().equals("Document Manager")) {
			RootPanel.get("pnlDocManager").setVisible(true);
		}
		if (item.getText().equals("User Manager")) {
			RootPanel.get("pnlUserManager").setVisible(true);
		}
		if (item.getText().equals("Organization Manager")) {
			RootPanel.get("pnlOrgManager").setVisible(true);
		}

	}
	
	private void hideAllPanels() {
		RootPanel.get("pnlApp").setVisible(false);
		RootPanel.get("pnlDocManager").setVisible(false);
		RootPanel.get("pnlUserManager").setVisible(false);
		RootPanel.get("pnlOrgManager").setVisible(false);
	}

	public void onTreeItemStateChanged(TreeItem item) {

	}

	public void onBrowserEvent(Event event) {
		// TODO Auto-generated method stub
		
	}

}
