package com.searchincite.client.services;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;
import com.searchincite.client.entity.ChangeEvent;
import com.searchincite.client.entity.Document;
import com.searchincite.client.listeners.DocumentChangeListener;
import com.searchincite.client.listeners.DocumentChangeListenerCollection;

public class DocumentServiceProxy {

	private DocumentChangeListenerCollection m_DocumentChangeListenerCollection = new DocumentChangeListenerCollection();
	
	  public void addDocumentChangeListener(DocumentChangeListener listener) {
			if (m_DocumentChangeListenerCollection == null) {
				m_DocumentChangeListenerCollection = new DocumentChangeListenerCollection();
			}
			m_DocumentChangeListenerCollection.add(listener);
		}

		public void removeDocumentChangeListener(DocumentChangeListener listener) {
			if (m_DocumentChangeListenerCollection != null) {
				m_DocumentChangeListenerCollection.remove(listener);
			}
		}

		public void createDocument(Document doc) {
			
			DocumentServiceAsync service = (DocumentServiceAsync)GWT.create(DocumentService.class);
	        ServiceDefTarget endpoint = (ServiceDefTarget)service;
	        String moduleRelativeURL = GWT.getModuleBaseURL() + "document";
	        endpoint.setServiceEntryPoint(moduleRelativeURL);

	        AsyncCallback callback = new AsyncCallback() {

	        	public void onSuccess(Object result) {
	        		m_DocumentChangeListenerCollection.fireDocumentChanged((Document)result, new ChangeEvent(true, false, false));
	        	}

	            public void onFailure(Throwable caught) {
	            	Window.alert("DocumentServiceProxy::createDocument() -- service call (1) failed.  Caught: " + caught.getMessage());
	            }
	        };
	        
	        try {
				
	        	// ** CALL WEB METHOD **
	        	service.createDocument(doc, callback);
	        	
			} catch (Exception e) {
	        	Window.alert("DocumentServiceProxy::createDocument() -- service call (2) failed.  Exception: " + e.getMessage());
			}
		}

		public void updateDocument(Document doc) {
			
			DocumentServiceAsync service = (DocumentServiceAsync)GWT.create(DocumentService.class);
	        ServiceDefTarget endpoint = (ServiceDefTarget)service;
	        String moduleRelativeURL = GWT.getModuleBaseURL() + "document";
	        endpoint.setServiceEntryPoint(moduleRelativeURL);

	        AsyncCallback callback = new AsyncCallback() {

	        	public void onSuccess(Object result) {
	        		m_DocumentChangeListenerCollection.fireDocumentChanged((Document)result, new ChangeEvent(false, true, false));
	        	}

	            public void onFailure(Throwable caught) {
	            	Window.alert("DocumentServiceProxy::updateDocument() -- service call (1) failed.  Caught: " + caught.getMessage());
	            }
	        };
	        
	        try {
	        
	        	// ** CALL WEB METHOD **
	        	service.updateDocument(doc, callback);

	        } catch (Exception e) {
	        	Window.alert("DocumentServiceProxy::updateDocument() -- service call (2) failed.  Exception: " + e.getMessage());
			}
		}

		public void deleteDocument(long lDocumentID) {
			
			DocumentServiceAsync service = (DocumentServiceAsync)GWT.create(DocumentService.class);
	        ServiceDefTarget endpoint = (ServiceDefTarget)service;
	        String moduleRelativeURL = GWT.getModuleBaseURL() + "document";
	        endpoint.setServiceEntryPoint(moduleRelativeURL);

	        AsyncCallback callback = new AsyncCallback() {

	        	public void onSuccess(Object result) {
	        		m_DocumentChangeListenerCollection.fireDocumentChanged((Document)result, new ChangeEvent(false, false, true));
	        	}

	            public void onFailure(Throwable caught) {
	            	Window.alert("DocumentServiceProxy::deleteDocument() -- service call (1) failed.  Caught: " + caught.getMessage());
	            }
	        };
	        
	        try {
				
	        	// ** CALL WEB METHOD **
	        	service.deleteDocument(lDocumentID, callback);
	        	
			} catch (Exception e) {
	        	Window.alert("DocumentServiceProxy::deleteDocument() -- service call (2) failed.  Exception: " + e.getMessage());
			}
		}
		
		public void updateDocumentStatus(int iOntologyID, long lDocumentID, int iDocumentStatusID) {
			
			DocumentServiceAsync service = (DocumentServiceAsync)GWT.create(DocumentService.class);
	        ServiceDefTarget endpoint = (ServiceDefTarget)service;
	        String moduleRelativeURL = GWT.getModuleBaseURL() + "document";
	        endpoint.setServiceEntryPoint(moduleRelativeURL);

	        AsyncCallback callback = new AsyncCallback() {

	        	public void onSuccess(Object result) {
	        		m_DocumentChangeListenerCollection.fireDocumentChanged((Document)result, new ChangeEvent(false, true, false));
	        	}

	            public void onFailure(Throwable caught) {
	            	Window.alert("DocumentServiceProxy::updateDocumentStatus() -- service call (1) failed.  Caught: " + caught.getMessage());
	            }
	        };
	        
	        try {
	        
	        	// ** CALL WEB METHOD **
	        	service.updateDocumentStatus(iOntologyID, lDocumentID, iDocumentStatusID, callback);

	        } catch (Exception e) {
	        	Window.alert("DocumentServiceProxy::updateDocumentStatus() -- service call (2) failed.  Exception: " + e.getMessage());
			}
		}

		public void updateStatusOfDocsInSource(int iDocumentSourceID, int iDocumentStatusID, int lNumberOfDocsToUpdate) {
			
			DocumentServiceAsync service = (DocumentServiceAsync)GWT.create(DocumentService.class);
	        ServiceDefTarget endpoint = (ServiceDefTarget)service;
	        String moduleRelativeURL = GWT.getModuleBaseURL() + "document";
	        endpoint.setServiceEntryPoint(moduleRelativeURL);

	        AsyncCallback callback = new AsyncCallback() {

	        	public void onSuccess(Object result) {
	        		m_DocumentChangeListenerCollection.fireDocumentChanged((Document)result, new ChangeEvent(false, true, false));
	        	}

	            public void onFailure(Throwable caught) {
	            	Window.alert("DocumentServiceProxy::updateStatusOfDocsInSource() -- service call (1) failed.  Caught: " + caught.getMessage());
	            }
	        };
	        
	        try {
	        
	        	// ** CALL WEB METHOD **
	        	service.updateStatusOfDocsInSource(iDocumentSourceID, iDocumentStatusID, lNumberOfDocsToUpdate, callback);

	        } catch (Exception e) {
	        	Window.alert("DocumentServiceProxy::updateStatusOfDocsInSource() -- service call (2) failed.  Exception: " + e.getMessage());
			}
		}

}
