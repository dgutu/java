package com.searchincite.client.services;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;
import com.searchincite.client.entity.ChangeEvent;
import com.searchincite.client.entity.Subject;
import com.searchincite.client.listeners.SubjectChangeListener;
import com.searchincite.client.listeners.SubjectChangeListenerCollection;

public class SubjectServiceProxy {

	private SubjectChangeListenerCollection m_SubjectChangeListenerCollection = new SubjectChangeListenerCollection();
	
	  public void addSubjectChangeListener(SubjectChangeListener listener) {
			if (m_SubjectChangeListenerCollection == null) {
				m_SubjectChangeListenerCollection = new SubjectChangeListenerCollection();
			}
			m_SubjectChangeListenerCollection.add(listener);
		}

		public void removeSubjectChangeListener(SubjectChangeListener listener) {
			if (m_SubjectChangeListenerCollection != null) {
				m_SubjectChangeListenerCollection.remove(listener);
			}
		}

		public void createSubject(Subject subject) {
			
			SubjectServiceAsync service = (SubjectServiceAsync)GWT.create(SubjectService.class);
	        ServiceDefTarget endpoint = (ServiceDefTarget)service;
	        String moduleRelativeURL = GWT.getModuleBaseURL() + "subject";
	        endpoint.setServiceEntryPoint(moduleRelativeURL);

	        AsyncCallback callback = new AsyncCallback() {

	        	public void onSuccess(Object result) {
	        		m_SubjectChangeListenerCollection.fireSubjectChanged((Subject)result, new ChangeEvent(true, false, false));
	        	}

	            public void onFailure(Throwable caught) {
	            	Window.alert("SubjectServiceProxy::createSubject() -- service call (1) failed.  Caught: " + caught.getMessage());
	            }
	        };
	        
	        try {
				// Call Web method
	        	service.createSubject(subject, callback);
			} catch (Exception e) {
	        	Window.alert("SubjectServiceProxy::createSubject() -- service call (2) failed.  Exception: " + e.getMessage());
			}
		}

		public void updateSubject(Subject subject) {
			
			SubjectServiceAsync service = (SubjectServiceAsync)GWT.create(SubjectService.class);
	        ServiceDefTarget endpoint = (ServiceDefTarget)service;
	        String moduleRelativeURL = GWT.getModuleBaseURL() + "subject";
	        endpoint.setServiceEntryPoint(moduleRelativeURL);

	        AsyncCallback callback = new AsyncCallback() {

	        	public void onSuccess(Object result) {
	        		m_SubjectChangeListenerCollection.fireSubjectChanged((Subject)result, new ChangeEvent(false, true, false));
	        	}

	            public void onFailure(Throwable caught) {
	            	Window.alert("SubjectServiceProxy::updateSubject() -- service call (1) failed.  Caught: " + caught.getMessage());
	            }
	        };
	        
	        try {
				// Call Web method
	        	service.updateSubject(subject, callback);
			} catch (Exception e) {
	        	Window.alert("SubjectServiceProxy::updateSubject() -- service call (2) failed.  Exception: " + e.getMessage());
			}
		}

		public void deleteSubject(int iSubjectID) {
			
			SubjectServiceAsync service = (SubjectServiceAsync)GWT.create(SubjectService.class);
	        ServiceDefTarget endpoint = (ServiceDefTarget)service;
	        String moduleRelativeURL = GWT.getModuleBaseURL() + "subject";
	        endpoint.setServiceEntryPoint(moduleRelativeURL);

	        AsyncCallback callback = new AsyncCallback() {

	        	public void onSuccess(Object result) {
	        		m_SubjectChangeListenerCollection.fireSubjectChanged((Subject)result, new ChangeEvent(false, false, true));
	        	}

	            public void onFailure(Throwable caught) {
	            	Window.alert("SubjectServiceProxy::deleteSubject() -- service call (1) failed.  Caught: " + caught.getMessage());
	            }
	        };
	        
	        try {
				// Call Web method
	        	service.deleteSubject(iSubjectID, callback);
			} catch (Exception e) {
	        	Window.alert("SubjectServiceProxy::deleteSubject() -- service call (2) failed.  Exception: " + e.getMessage());
			}
		}


}
