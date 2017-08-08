package com.searchincite.client.widgets;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;
import com.google.gwt.user.client.ui.ChangeListener;
import com.google.gwt.user.client.ui.ChangeListenerCollection;
import com.google.gwt.user.client.ui.ListBox;
import com.searchincite.client.entity.Organization;
import com.searchincite.client.services.OrganizationService;
import com.searchincite.client.services.OrganizationServiceAsync;


public class OrganizationDropdown extends ListBox {

	private boolean m_bShowNoSelection = false;
	protected ChangeListenerCollection m_ChangeListenerCollection = null;
	Organization[] m_arrOrganizations = null;
	private String m_strItemValueToSelect = "-1";

	public OrganizationDropdown(boolean bShowNoSelection) {
	    
		m_bShowNoSelection = bShowNoSelection;
		
		if (getShowNoSelection()) {
    		insertItem("[Select Organization]", "-1", 0);
		}

		fillList("-1");
		//setVisibleItemCount(10);
	}	
	
	public void setShowNoSelection(boolean bShowNoSelection) {
		m_bShowNoSelection = bShowNoSelection;
	}
	public boolean getShowNoSelection() {
		return m_bShowNoSelection;
	}
	
	private void fillList(Organization[] arrOrganizations, String strItemValueToSelect) {

		m_strItemValueToSelect = strItemValueToSelect;
		clear();
		
		if (arrOrganizations != null && arrOrganizations.length > 0) {
			
			for (int i = 0; i < arrOrganizations.length; i++) {
				addItem(arrOrganizations[i].getOrganizationName(), String.valueOf(arrOrganizations[i].getOrganizationID()));
			}
		}
		
		if (getShowNoSelection()) {
    		insertItem("[Select Organization]", "-1", 0);
		}

		if (!m_strItemValueToSelect.equals("-1")) {
			selectItem(m_strItemValueToSelect);
		}
		else if (getItemCount() > 0) {
			setSelectedIndex(0);     
		}
	}

	//TODO: Use AsyncCallback for GWT 1.4, ChangeListener for GWT 1.5
//	public void addChangeListener(AsyncCallback listener) {
	public void addLocalChangeListener(ChangeListener listener) {
		if (m_ChangeListenerCollection == null) {
			m_ChangeListenerCollection = new ChangeListenerCollection();
		}
		m_ChangeListenerCollection.add(listener);
	}

	public void fillList(String strItemValueToSelect) {
		
		m_strItemValueToSelect = strItemValueToSelect;
		clear();

		//if (getSelectedIndex() >= 0) {
		//	setItemText(getSelectedIndex(), "Loading...");
		//}

		OrganizationServiceAsync svc = (OrganizationServiceAsync)GWT.create(OrganizationService.class);
        ServiceDefTarget endpoint = (ServiceDefTarget)svc;
        String moduleRelativeURL = GWT.getModuleBaseURL() + "organization";
        endpoint.setServiceEntryPoint(moduleRelativeURL);

        AsyncCallback callback = new AsyncCallback() {

        	public void onSuccess(Object result) {

        		m_arrOrganizations = (Organization[])result;
        		fillList(m_arrOrganizations, m_strItemValueToSelect);
        		setEnabled(true);
        	}

            public void onFailure(Throwable caught) {
        		setEnabled(true);
            	Window.alert("OrganizationList::fillList() -- service call failed.");
            }
        };
        
        svc.getOrganizations(Organization.FIELD_ALL_FIELDS, callback);
	}

	public Organization getSelectedOrganization() {

		if (m_arrOrganizations != null && m_arrOrganizations.length >= 0) {
			for (int i = 0; i < m_arrOrganizations.length; i++) {
				if (m_arrOrganizations[i].getOrganizationID() == Integer.parseInt(getValue(getSelectedIndex()))) {
					return m_arrOrganizations[i];
				}
			}
		}		
		return null;
	
	}

	public void selectItem(String strItemValue) {
		for (int i = 0; i < getItemCount(); i++) {
			if (getValue(i).equals(strItemValue)) {
				setSelectedIndex(i);
				m_ChangeListenerCollection.fireChange(this);
			}
		}
	}

}
