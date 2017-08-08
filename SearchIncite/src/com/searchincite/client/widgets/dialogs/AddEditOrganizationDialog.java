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
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.searchincite.client.data.constants.SecurityConstants;
import com.searchincite.client.entity.ChangeEvent;
import com.searchincite.client.entity.Organization;
import com.searchincite.client.entity.SecurityRole;
import com.searchincite.client.listeners.OrganizationChangeListener;
import com.searchincite.client.services.OrganizationService;
import com.searchincite.client.services.OrganizationServiceAsync;
import com.searchincite.client.services.OrganizationServiceProxy;

  public class AddEditOrganizationDialog  extends DialogBox implements OrganizationChangeListener, KeyboardListener {

	private boolean m_bEditing = false;
	private Organization m_Organization = null;
	SecurityRole[] m_arrRoles = null;
	
    DockPanel m_pnlOuter = new DockPanel();
	FlexTable m_tblMain = new FlexTable();
	HorizontalPanel m_pnlButtons = new HorizontalPanel();
    
	TextBox m_txtOrganizationName = new TextBox();
	TextBox m_txtAddress1 = new TextBox();
	TextBox m_txtAddress2 = new TextBox();
	TextBox m_txtCity = new TextBox();
	TextBox m_txtState = new TextBox();
	TextBox m_txtPostalCode = new TextBox();

    int m_iOrganizationID = -1;
	
	private OrganizationChangeListener m_OrgChangeListener = null;
	
	public AddEditOrganizationDialog(Organization org, int iOrganizationID, OrganizationChangeListener listener, SecurityRole[] arrSecRoles) {

		super();

		m_iOrganizationID = iOrganizationID;
		m_arrRoles = arrSecRoles;
		m_OrgChangeListener = listener;
		m_Organization = org;
		m_bEditing = m_Organization != null;

		if (!isSIAdmin()) {
			return;
		}

		if (m_bEditing) {
			setText("Edit Organization");
		} else {
			m_Organization = new Organization();
			setText("New Organization");
		}

		m_pnlOuter.setSpacing(4);

		HorizontalPanel pnlCaption = new HorizontalPanel();
		HTML text = new HTML(
				"Enter information for the Organization below, then click OK to save, or Cancel to close this dialog.");
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

		HTML htmlOrgCaption = new HTML("<b>Organization:</b>");
		HTML htmlAddress1Caption = new HTML("<b>Address 1:</b>");
		HTML htmlAddress2Caption = new HTML("<b>Address 2:</b>");
		HTML htmlCityCaption = new HTML("<b>City:</b>");
		HTML htmlStateCaption = new HTML("<b>State:</b>");
		HTML htmlPostalCodeCaption = new HTML("<b>Postal code:</b>");

		m_tblMain.setWidget(0, 0, htmlOrgCaption);
		m_tblMain.setWidget(0, 1, m_txtOrganizationName);
		m_tblMain.getFlexCellFormatter().setColSpan(0, 1, 2);
		m_tblMain.setWidget(0, 3, new HTML("&nbsp;")); // empty column

		// Note: leave empty row (1)
		m_tblMain.setWidget(1, 0, new HTML("<hr size=\"1\"/>"));
		m_tblMain.getFlexCellFormatter().setColSpan(1, 0, 8); // colspan empty
																// column

		m_tblMain.setWidget(2, 0, htmlAddress1Caption);
		m_tblMain.setWidget(2, 1, m_txtAddress1);
		m_tblMain.getFlexCellFormatter().setColSpan(2, 1, 2);
		m_tblMain.setWidget(2, 3, new HTML("&nbsp;")); // empty column
		// second column (on the right)
		m_tblMain.setWidget(2, 4, htmlAddress2Caption);
		m_tblMain.setWidget(2, 5, m_txtAddress2);
		m_tblMain.getFlexCellFormatter().setColSpan(2, 5, 2);

		m_tblMain.setWidget(3, 0, htmlCityCaption);
		m_tblMain.setWidget(3, 1, m_txtCity);
		m_tblMain.getFlexCellFormatter().setColSpan(3, 1, 2);
		m_tblMain.setWidget(3, 3, new HTML("&nbsp;")); // empty column
		// second column (on the right)
		m_tblMain.setWidget(3, 4, htmlStateCaption);
		m_tblMain.setWidget(3, 5, m_txtState);
		m_tblMain.getFlexCellFormatter().setColSpan(3, 5, 2);

		m_tblMain.setWidget(4, 0, htmlPostalCodeCaption);
		m_tblMain.setWidget(4, 1, m_txtPostalCode);
		m_tblMain.getFlexCellFormatter().setColSpan(4, 1, 2);
		m_tblMain.setWidget(4, 3, new HTML("&nbsp;")); // empty column

		HorizontalPanel pnlButtons = new HorizontalPanel();
		pnlButtons.setSpacing(4);
		pnlButtons.add(btnOK);
		pnlButtons.add(btnCancel);

		m_tblMain.setWidget(5, 0, pnlButtons);
		m_tblMain.getFlexCellFormatter().setColSpan(5, 0, 8);
		m_tblMain.getCellFormatter().setHorizontalAlignment(5, 0, HorizontalPanel.ALIGN_RIGHT);
		m_tblMain.getCellFormatter().setVerticalAlignment(5, 0, VerticalPanel.ALIGN_BOTTOM);
		// m_tblMain.getCellFormatter().setHeight(10, 0, "55px");

		m_pnlOuter.add(m_tblMain, DockPanel.CENTER);
		m_pnlOuter.setSpacing(8);

		// add keyboard listeners for ENTER keypress in edit boxes
		m_txtOrganizationName.addKeyboardListener(this);
		m_txtAddress1.addKeyboardListener(this);
		m_txtAddress2.addKeyboardListener(this);
		m_txtCity.addKeyboardListener(this);
		m_txtState.addKeyboardListener(this);
		m_txtPostalCode.addKeyboardListener(this);

		m_txtOrganizationName.setTabIndex(1);
		m_txtAddress1.setTabIndex(2);
		m_txtAddress2.setTabIndex(3);
		m_txtCity.setTabIndex(4);
		m_txtState.setTabIndex(5);
		m_txtPostalCode.setTabIndex(6);
		btnOK.setTabIndex(7);
		btnCancel.setTabIndex(8);
		
		setWidget(m_pnlOuter);

		if (m_bEditing) {
			loadOrganization();
		}
	}

	private void onClickOK() {

		if (m_txtOrganizationName.getText().trim().length() == 0) {
			Window.alert("Please enter an Organization name");
			m_txtOrganizationName.setFocus(true);
			return;
		}
		
		// populate fields in m_Organization with values from dialog
		m_Organization.setOrganizationName(m_txtOrganizationName.getText().trim());
		m_Organization.setOrganizationID(m_iOrganizationID);
		m_Organization.setAddressLine1(m_txtAddress1.getText().trim());
		m_Organization.setAddressLine2(m_txtAddress2.getText().trim());
		m_Organization.setCity(m_txtCity.getText().trim());
		m_Organization.setState(m_txtState.getText().trim());
		m_Organization.setPostalCode(m_txtPostalCode.getText().trim());

		if (!m_bEditing) {
	    	createOrganization(m_Organization);
    	}
    	else {
    		updateOrganization(m_Organization);
    	}
	}
	
	public void show() {
		  super.show();
		  int left = (Window.getClientWidth() - getOffsetWidth()) / 2 + getBodyScrollLeft();
		  int top = (Window.getClientHeight() - getOffsetHeight()) / 2 + getBodyScrollTop();
		  setPopupPosition(left, top);

		  if (!m_bEditing) {
			  m_txtOrganizationName.selectAll();
			  m_txtOrganizationName.setFocus(true);
		  }
		  else {
			  m_txtOrganizationName.setFocus(true);
		  }
	  }

	  private native int getBodyScrollLeft() /*-{
	        return $doc.body.scrollLeft;
	      }-*/;

	  private native int getBodyScrollTop() /*-{
	        return $doc.body.scrollTop;
	      }-*/;
	
		public void createOrganization(Organization org) {
			OrganizationServiceProxy proxy = new OrganizationServiceProxy();
			proxy.addOrganizationChangeListener(this);
			proxy.addOrganizationChangeListener(m_OrgChangeListener);
			proxy.createOrganization(org);
		}

	public void updateOrganization(Organization org) {
		OrganizationServiceProxy proxy = new OrganizationServiceProxy();
		proxy.addOrganizationChangeListener(this);
		proxy.addOrganizationChangeListener(m_OrgChangeListener);
		proxy.updateOrganization(org);
	}

	public void onKeyDown(Widget sender, char keyCode, int modifiers) {
	}

	public void onKeyPress(Widget sender, char keyCode, int modifiers) {
		if ((
				sender == m_txtOrganizationName || 
				sender == m_txtAddress1 || 
				sender == m_txtAddress2 ||
				sender == m_txtCity ||
				sender == m_txtState ||
				sender == m_txtPostalCode
				) && keyCode == 13) {
			
			onClickOK();
		}
		else if (keyCode == 27) {
			hide();
		}
	}

	public void onKeyUp(Widget sender, char keyCode, int modifiers) {
	}

	public void loadOrganization() {
		
		OrganizationServiceAsync svc = (OrganizationServiceAsync)GWT.create(OrganizationService.class);
        ServiceDefTarget endpoint = (ServiceDefTarget)svc;
        String moduleRelativeURL = GWT.getModuleBaseURL() + "organization";
        endpoint.setServiceEntryPoint(moduleRelativeURL);

        AsyncCallback callback = new AsyncCallback() {

        	public void onSuccess(Object result) {

        		m_Organization = (Organization)result;
				
				m_txtOrganizationName.setText(m_Organization.getOrganizationName());
				//m_txtOrganizationName.setReadOnly(true);
				//m_txtOrganizationName.setEnabled(false);
				m_txtAddress1.setText(m_Organization.getAddressLine1());
				m_txtAddress2.setText(m_Organization.getAddressLine2());
				m_txtCity.setText(m_Organization.getCity());
				m_txtState.setText(m_Organization.getState());
				m_txtPostalCode.setText(m_Organization.getPostalCode());
        	}

            public void onFailure(Throwable caught) {
            	Window.alert("AddEditOrganizationDialog::loadDocument() -- service call failed.");
            }
        };
        
        svc.getOrganizationByID(m_iOrganizationID, Organization.FIELD_ALL_FIELDS, callback);
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

	public void onOrganizationChange(Organization org, ChangeEvent event) {
		if (event.isCreate() || event.isUpdate()) {
			hide();
		}
	}

  }
