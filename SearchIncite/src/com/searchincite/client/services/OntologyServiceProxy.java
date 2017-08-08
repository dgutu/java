package com.searchincite.client.services;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;
import com.searchincite.client.entity.ChangeEvent;
import com.searchincite.client.entity.Ontology;
import com.searchincite.client.listeners.OntologyChangeListener;
import com.searchincite.client.listeners.OntologyChangeListenerCollection;

public class OntologyServiceProxy {

	private OntologyChangeListenerCollection m_OntologyChangeListenerCollection = new OntologyChangeListenerCollection();
	
	  public void addOntologyChangeListener(OntologyChangeListener listener) {
			if (m_OntologyChangeListenerCollection == null) {
				m_OntologyChangeListenerCollection = new OntologyChangeListenerCollection();
			}
			m_OntologyChangeListenerCollection.add(listener);
		}

		public void removeOntologyChangeListener(OntologyChangeListener listener) {
			if (m_OntologyChangeListenerCollection != null) {
				m_OntologyChangeListenerCollection.remove(listener);
			}
		}

		public void createOntology(Ontology o) {
			
			OntologyServiceAsync service = (OntologyServiceAsync)GWT.create(OntologyService.class);
	        ServiceDefTarget endpoint = (ServiceDefTarget)service;
	        String moduleRelativeURL = GWT.getModuleBaseURL() + "ontology";
	        endpoint.setServiceEntryPoint(moduleRelativeURL);

	        AsyncCallback callback = new AsyncCallback() {

	        	public void onSuccess(Object result) {
	        		m_OntologyChangeListenerCollection.fireOntologyChanged((Ontology)result, new ChangeEvent(true, false, false));
	        	}

	            public void onFailure(Throwable caught) {
	            	Window.alert("OntologyServiceProxy::createOntology() -- service call (1) failed.  Caught: " + caught.getMessage());
	            }
	        };
	        
	        try {
				// Call Web method
	        	service.createOntology(o, callback);
			} catch (Exception e) {
	        	Window.alert("OntologyServiceProxy::createOntology() -- service call (2) failed.  Exception: " + e.getMessage());
			}
		}

		public void updateOntology(Ontology o) {
			
			OntologyServiceAsync service = (OntologyServiceAsync)GWT.create(OntologyService.class);
	        ServiceDefTarget endpoint = (ServiceDefTarget)service;
	        String moduleRelativeURL = GWT.getModuleBaseURL() + "ontology";
	        endpoint.setServiceEntryPoint(moduleRelativeURL);

	        AsyncCallback callback = new AsyncCallback() {

	        	public void onSuccess(Object result) {
	        		m_OntologyChangeListenerCollection.fireOntologyChanged((Ontology)result, new ChangeEvent(false, true, false));
	        	}

	            public void onFailure(Throwable caught) {
	            	Window.alert("OntologyServiceProxy::updateOntology() -- service call (1) failed.  Caught: " + caught.getMessage());
	            }
	        };
	        
	        try {
				// Call Web method
	        	service.updateOntology(o, callback);
			} catch (Exception e) {
	        	Window.alert("OntologyServiceProxy::updateOntology() -- service call (2) failed.  Exception: " + e.getMessage());
			}
		}

		public void deleteOntology(int iOntologyID) {
			
			OntologyServiceAsync service = (OntologyServiceAsync)GWT.create(OntologyService.class);
	        ServiceDefTarget endpoint = (ServiceDefTarget)service;
	        String moduleRelativeURL = GWT.getModuleBaseURL() + "ontology";
	        endpoint.setServiceEntryPoint(moduleRelativeURL);

	        AsyncCallback callback = new AsyncCallback() {

	        	public void onSuccess(Object result) {
	        		m_OntologyChangeListenerCollection.fireOntologyChanged((Ontology)result, new ChangeEvent(false, false, true));
	        	}

	            public void onFailure(Throwable caught) {
	            	Window.alert("OntologyServiceProxy::deleteOntology() -- service call (1) failed.  Caught: " + caught.getMessage());
	            }
	        };
	        
	        try {
				// Call Web method
	        	service.deleteOntology(iOntologyID, callback);
			} catch (Exception e) {
	        	Window.alert("OntologyServiceProxy::deleteOntology() -- service call (2) failed.  Exception: " + e.getMessage());
			}
		}

		public void copyOntology(int iOntologyID, int iDestinationCategoryID, String strDestinationOntologyName, int iDestinationOrgID) {
			
			OntologyServiceAsync service = (OntologyServiceAsync)GWT.create(OntologyService.class);
	        ServiceDefTarget endpoint = (ServiceDefTarget)service;
	        String moduleRelativeURL = GWT.getModuleBaseURL() + "ontology";
	        endpoint.setServiceEntryPoint(moduleRelativeURL);

	        AsyncCallback callback = new AsyncCallback() {

	        	public void onSuccess(Object result) {
	        		//Ontology o = new Ontology();
	        		//o.setOntologyID(((Integer)result).intValue());
	        		m_OntologyChangeListenerCollection.fireOntologyChanged((Ontology)result, new ChangeEvent(true, false, false));
	        	}

	            public void onFailure(Throwable caught) {
	            	Window.alert("OntologyServiceProxy::copyOntology() -- service call (1) failed.  Caught: " + caught.getMessage());
	            }
	        };
	        
	        try {
				// Call Web method
	        	service.copyOntology(iOntologyID, iDestinationCategoryID, strDestinationOntologyName, iDestinationOrgID, callback);
			} catch (Exception e) {
	        	Window.alert("OntologyServiceProxy::copyOntology() -- service call (2) failed.  Exception: " + e.getMessage());
			}
		}
}
