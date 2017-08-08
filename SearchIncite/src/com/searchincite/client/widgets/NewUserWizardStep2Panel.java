package com.searchincite.client.widgets;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;
import com.google.gwt.user.client.ui.ChangeListener;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.searchincite.client.entity.Ontology;
import com.searchincite.client.entity.UserWizardRunInfo;
import com.searchincite.client.listeners.OntologyListFilledListener;
import com.searchincite.client.services.OntologyService;
import com.searchincite.client.services.OntologyServiceAsync;
import com.searchincite.client.services.UserService;
import com.searchincite.client.services.UserServiceAsync;


public class NewUserWizardStep2Panel extends Composite implements ChangeListener, OntologyListFilledListener {

	public TextBox m_txtUsername = new TextBox();
	public TextBox m_txtFirstName = new TextBox();
	public TextBox m_txtLastName = new TextBox();
	public TextBox m_txtOrganization = new TextBox();
	public TextArea m_txtWelcomeMessage = new TextArea();
	private OntologyList m_lstOntology = new OntologyList(false);
	private int m_iDefaultOntologyID = -1;
	boolean m_bDirty = false;
	
	public NewUserWizardStep2Panel() {

	    FlexTable tblMain = new FlexTable();
	    m_lstOntology.addListFilledListener(this);
	    
	    int iRow = 0;
	    
	    Image imgStep1 = new Image();
	    imgStep1.setUrl("images/2.gif");
	    HTML htmlCaption = new HTML();
	    htmlCaption.setHTML("<font size=\"2\">&nbsp;Confirm information</font>");
	    tblMain.setWidget(0, 0, imgStep1);
	    tblMain.setWidget(0, 1, htmlCaption);
	    tblMain.getFlexCellFormatter().setColSpan(0, 1, 2);
	    iRow++;

	    /*
	    tblMain.setWidget(2, 0, new HTML("&nbsp;"));
	    tblMain.setWidget(2, 1, new HTML("&nbsp;&nbsp;<b>User's first name:&nbsp;</b>"));
	    m_txtFirstName.setWidth("150px");
	    tblMain.setWidget(2, 2, m_txtFirstName);

	    tblMain.setWidget(3, 0, new HTML("&nbsp;"));
	    tblMain.setWidget(3, 1, new HTML("&nbsp;&nbsp;<b>User's last name:&nbsp;</b>"));
	    m_txtLastName.setWidth("150px");
	    tblMain.setWidget(3, 2, m_txtLastName);
	    */

	    tblMain.setWidget(iRow, 0, new HTML("&nbsp;"));
	    tblMain.setWidget(iRow, 1, new HTML("&nbsp;&nbsp;<b>Username:&nbsp;</b>"));
	    m_txtFirstName.setWidth("150px");
	    tblMain.setWidget(iRow, 2, m_txtUsername);
	    iRow++;

	    tblMain.setWidget(iRow, 0, new HTML("&nbsp;"));
	    tblMain.setWidget(iRow, 1, new HTML("&nbsp;&nbsp;<b>Organization name:&nbsp;</b>"));
	    m_txtOrganization.setWidth("150px");
	    tblMain.setWidget(iRow, 2, m_txtOrganization);
	    iRow++;

	    tblMain.setWidget(iRow, 0, new HTML("&nbsp;"));
	    tblMain.setWidget(iRow, 1, new HTML("&nbsp;&nbsp;<b>Ontology to copy:&nbsp;</b>"));
	    tblMain.setWidget(iRow, 2, m_lstOntology);
	    iRow++;

	    tblMain.setWidget(iRow, 0, new HTML("&nbsp;"));
	    tblMain.setWidget(iRow, 1, new HTML("&nbsp;&nbsp;<b>Welcome message (to be emailed to user):&nbsp;</b>"));
	    tblMain.getFlexCellFormatter().setColSpan(iRow, 1, 2);
	    iRow++;

	    tblMain.setWidget(iRow, 0, new HTML("&nbsp;"));
	    tblMain.setWidget(iRow, 1, m_txtWelcomeMessage);
	    m_txtWelcomeMessage.addStyleName("welcomeMessageTextArea");
	    m_txtWelcomeMessage.setSize("375px", "75px");
	    tblMain.getFlexCellFormatter().setColSpan(iRow, 1, 2);
	    tblMain.getFlexCellFormatter().setStyleName(iRow, 1, "welcomeMessageTextAreaContainer");
	    iRow++;

	    m_txtFirstName.addChangeListener(this);
	    m_txtLastName.addChangeListener(this);
	    m_txtOrganization.addChangeListener(this);
	    m_txtWelcomeMessage.addChangeListener(this);
		initWidget(tblMain);
		
		//fillOntologyList();
		getLastUserWizardRunInfo();
		
		// after ontology list is filled, select the "default ontology
	}

	public void setUsername(String strUsername) {
		m_txtUsername.setText(strUsername);
	}

	public void setOrganizationName(String strOrganizationName) {
		m_txtOrganization.setText(strOrganizationName);
	}

	public String getUsername() {
		return m_txtUsername.getText();
	}
	public String getOrganizationName() {
		return m_txtOrganization.getText();
	}
	public int getSelectedOntologyID() {
		return m_lstOntology.getSelectedOntology().getOntologyID();
	}
	public String getEmailBody() {
		return m_txtWelcomeMessage.getText();
	}
	public boolean isDirty() {
		return m_bDirty;
	}
	
	public void setFocus(boolean bFocus) {
		m_txtFirstName.setFocus(bFocus);  // This doesn't work when called in the constructor -- why?
	}

	public void onKeyDown(Widget sender, char keyCode, int modifiers) {
	}

	public void onKeyUp(Widget sender, char keyCode, int modifiers) {
	}

	public void onChange(Widget sender) {

		if (sender == m_txtFirstName) {
			m_bDirty = true;
		}
	}
	
	public void fillOntologyList() {
		
		OntologyServiceAsync ontologyService = (OntologyServiceAsync)GWT.create(OntologyService.class);
        ServiceDefTarget endpoint = (ServiceDefTarget)ontologyService;
        String moduleRelativeURL = GWT.getModuleBaseURL() + "ontology";
        endpoint.setServiceEntryPoint(moduleRelativeURL);

        AsyncCallback callback = new AsyncCallback() {

        	public void onSuccess(Object result) {

        		Ontology[] arrOntologies = (Ontology[])result;
        		m_lstOntology.fillList(arrOntologies, "-1");
        	}

            public void onFailure(Throwable caught) {
            	Window.alert("OntologyList::fillList() -- call to  ontologyService failed.");
            }
        };
        
        ontologyService.getOntologiesForOrganization(Ontology.FIELD_ID | Ontology.FIELD_NAME, callback);
        
	}

	public void onOntologyListFilled() {
		// select default ontology
		m_lstOntology.selectItem(String.valueOf(m_iDefaultOntologyID));
	}

	public void getLastUserWizardRunInfo() {
		
		UserServiceAsync svc = (UserServiceAsync)GWT.create(UserService.class);
        ServiceDefTarget endpoint = (ServiceDefTarget)svc;
        String moduleRelativeURL = GWT.getModuleBaseURL() + "user";
        endpoint.setServiceEntryPoint(moduleRelativeURL);

        AsyncCallback callback = new AsyncCallback() {

        	public void onSuccess(Object result) {

        		UserWizardRunInfo runInfo = (UserWizardRunInfo)result;
        		m_iDefaultOntologyID = runInfo.getSelectedOntologyID();
        		fillOntologyList();
        		m_txtWelcomeMessage.setText(runInfo.getEmailText());
        	}

            public void onFailure(Throwable caught) {
            	Window.alert("NewUserWizardStep2Panel::getLastUserWizardRunInfo() -- service call failed.");
            }
        };
        
        try {
			svc.getLastUserWizardRunInfo(0, callback);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
