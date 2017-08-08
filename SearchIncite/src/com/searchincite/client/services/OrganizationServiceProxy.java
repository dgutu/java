package com.searchincite.client.services;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;
import com.searchincite.client.entity.ChangeEvent;
import com.searchincite.client.entity.Organization;
import com.searchincite.client.listeners.OrganizationChangeListener;
import com.searchincite.client.listeners.OrganizationChangeListenerCollection;

public class OrganizationServiceProxy {

	private OrganizationChangeListenerCollection m_OrganizationChangeListenerCollection = new OrganizationChangeListenerCollection();
	
	  public void addOrganizationChangeListener(OrganizationChangeListener listener) {
			if (m_OrganizationChangeListenerCollection == null) {
				m_OrganizationChangeListenerCollection = new OrganizationChangeListenerCollection();
			}
			m_OrganizationChangeListenerCollection.add(listener);
		}

		public void removeOrganizationChangeListener(OrganizationChangeListener listener) {
			if (m_OrganizationChangeListenerCollection != null) {
				m_OrganizationChangeListenerCollection.remove(listener);
			}
		}

		public void createOrganization(Organization org) {
			
			OrganizationServiceAsync service = (OrganizationServiceAsync)GWT.create(OrganizationService.class);
	        ServiceDefTarget endpoint = (ServiceDefTarget)service;
	        String moduleRelativeURL = GWT.getModuleBaseURL() + "organization";
	        endpoint.setServiceEntryPoint(moduleRelativeURL);

	        AsyncCallback callback = new AsyncCallback() {

	        	public void onSuccess(Object result) {
	        		m_OrganizationChangeListenerCollection.fireOrganizationChanged((Organization)result, new ChangeEvent(true, false, false));
	        	}

	            public void onFailure(Throwable caught) {
	            	Window.alert("OrganizationServiceProxy::createOrganization() -- service call (1) failed.  Caught: " + caught.getMessage());
	            }
	        };
	        
	        try {
				// Call Web method
	        	service.createOrganization(org, callback);
			} catch (Exception e) {
	        	Window.alert("OrganizationServiceProxy::createOrganization() -- service call (2) failed.  Exception: " + e.getMessage());
			}
		}

		public void updateOrganization(Organization org) {
			
			OrganizationServiceAsync service = (OrganizationServiceAsync)GWT.create(OrganizationService.class);
	        ServiceDefTarget endpoint = (ServiceDefTarget)service;
	        String moduleRelativeURL = GWT.getModuleBaseURL() + "organization";
	        endpoint.setServiceEntryPoint(moduleRelativeURL);

	        AsyncCallback callback = new AsyncCallback() {

	        	public void onSuccess(Object result) {
	        		m_OrganizationChangeListenerCollection.fireOrganizationChanged((Organization)result, new ChangeEvent(false, true, false));
	        	}

	            public void onFailure(Throwable caught) {
	            	Window.alert("OrganizationServiceProxy::updateOrganization() -- service call (1) failed.  Caught: " + caught.getMessage());
	            }
	        };
	        
	        try {
				// Call Web method
	        	service.updateOrganization(org, callback);
			} catch (Exception e) {
	        	Window.alert("OrganizationServiceProxy::updateOrganization() -- service call (2) failed.  Exception: " + e.getMessage());
			}
		}

		public void deleteOrganization(int iOrganizationID) {
			
			OrganizationServiceAsync service = (OrganizationServiceAsync)GWT.create(OrganizationService.class);
	        ServiceDefTarget endpoint = (ServiceDefTarget)service;
	        String moduleRelativeURL = GWT.getModuleBaseURL() + "organization";
	        endpoint.setServiceEntryPoint(moduleRelativeURL);

	        AsyncCallback callback = new AsyncCallback() {

	        	public void onSuccess(Object result) {
	        		m_OrganizationChangeListenerCollection.fireOrganizationChanged((Organization)result, new ChangeEvent(false, false, true));
	        	}

	            public void onFailure(Throwable caught) {
	            	Window.alert("OrganizationServiceProxy::deleteOrganization() -- service call (1) failed.  Caught: " + caught.getMessage());
	            }
	        };
	        
	        try {
				// Call Web method
	        	service.deleteOrganization(iOrganizationID, callback);
			} catch (Exception e) {
	        	Window.alert("OrganizationServiceProxy::deleteOrganization() -- service call (2) failed.  Exception: " + e.getMessage());
			}
		}


}
