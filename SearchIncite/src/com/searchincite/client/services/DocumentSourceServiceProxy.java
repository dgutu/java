package com.searchincite.client.services;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;
import com.searchincite.client.entity.ChangeEvent;
import com.searchincite.client.entity.DocumentSource;
import com.searchincite.client.listeners.DocumentSourceChangeListener;
import com.searchincite.client.listeners.DocumentSourceChangeListenerCollection;

public class DocumentSourceServiceProxy {

	private DocumentSourceChangeListenerCollection m_DocumentSourceChangeListenerCollection = new DocumentSourceChangeListenerCollection();
	
	  public void addDocumentSourceChangeListener(DocumentSourceChangeListener listener) {
			if (m_DocumentSourceChangeListenerCollection == null) {
				m_DocumentSourceChangeListenerCollection = new DocumentSourceChangeListenerCollection();
			}
			m_DocumentSourceChangeListenerCollection.add(listener);
		}

		public void removeDocumentSourceChangeListener(DocumentSourceChangeListener listener) {
			if (m_DocumentSourceChangeListenerCollection != null) {
				m_DocumentSourceChangeListenerCollection.remove(listener);
			}
		}

		public void createDocumentSource(DocumentSource documentSource) {
			
			DocumentSourceServiceAsync service = (DocumentSourceServiceAsync)GWT.create(DocumentSourceService.class);
	        ServiceDefTarget endpoint = (ServiceDefTarget)service;
	        String moduleRelativeURL = GWT.getModuleBaseURL() + "docsource";
	        endpoint.setServiceEntryPoint(moduleRelativeURL);

	        AsyncCallback callback = new AsyncCallback() {

	        	public void onSuccess(Object result) {
	        		m_DocumentSourceChangeListenerCollection.fireDocumentSourceChanged((DocumentSource)result, new ChangeEvent(true, false, false));
	        	}

	            public void onFailure(Throwable caught) {
	            	Window.alert("DocumentSourceServiceProxy::createDocumentSource() -- service call (1) failed.  Caught: " + caught.getMessage());
	            }
	        };
	        
	        try {
				// Call Web method
	        	service.createDocumentSource(documentSource, callback);
			} catch (Exception e) {
	        	Window.alert("DocumentSourceServiceProxy::createDocumentSource() -- service call (2) failed.  Exception: " + e.getMessage());
			}
		}

		public void updateDocumentSource(DocumentSource documentSource) {
			
			DocumentSourceServiceAsync service = (DocumentSourceServiceAsync)GWT.create(DocumentSourceService.class);
	        ServiceDefTarget endpoint = (ServiceDefTarget)service;
	        String moduleRelativeURL = GWT.getModuleBaseURL() + "docsource";
	        endpoint.setServiceEntryPoint(moduleRelativeURL);

	        AsyncCallback callback = new AsyncCallback() {

	        	public void onSuccess(Object result) {
	        		m_DocumentSourceChangeListenerCollection.fireDocumentSourceChanged((DocumentSource)result, new ChangeEvent(false, true, false));
	        	}

	            public void onFailure(Throwable caught) {
	            	Window.alert("DocumentSourceServiceProxy::updateDocumentSource() -- service call (1) failed.  Caught: " + caught.getMessage());
	            }
	        };
	        
	        try {
				// Call Web method
	        	service.updateDocumentSource(documentSource, callback);
			} catch (Exception e) {
	        	Window.alert("DocumentSourceServiceProxy::updateDocumentSource() -- service call (2) failed.  Exception: " + e.getMessage());
			}
		}

		public void deleteDocumentSource(int iDocumentSourceID) {
			
			DocumentSourceServiceAsync service = (DocumentSourceServiceAsync)GWT.create(DocumentSourceService.class);
	        ServiceDefTarget endpoint = (ServiceDefTarget)service;
	        String moduleRelativeURL = GWT.getModuleBaseURL() + "docsource";
	        endpoint.setServiceEntryPoint(moduleRelativeURL);

	        AsyncCallback callback = new AsyncCallback() {

	        	public void onSuccess(Object result) {
	        		m_DocumentSourceChangeListenerCollection.fireDocumentSourceChanged((DocumentSource)result, new ChangeEvent(false, false, true));
	        	}

	            public void onFailure(Throwable caught) {
	            	Window.alert("DocumentSourceServiceProxy::deleteDocumentSource() -- service call (1) failed.  Caught: " + caught.getMessage());
	            }
	        };
	        
	        try {
				// Call Web method
	        	service.deleteDocumentSource(iDocumentSourceID, callback);
			} catch (Exception e) {
	        	Window.alert("DocumentSourceServiceProxy::deleteDocumentSource() -- service call (2) failed.  Exception: " + e.getMessage());
			}
		}


}
