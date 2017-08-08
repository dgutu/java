package com.searchincite.client.services;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;
import com.searchincite.client.entity.ChangeEvent;
import com.searchincite.client.entity.Phrase;
import com.searchincite.client.listeners.PhraseChangeListener;
import com.searchincite.client.listeners.PhraseChangeListenerCollection;

public class PhraseServiceProxy {

	private PhraseChangeListenerCollection m_PhraseChangeListenerCollection = new PhraseChangeListenerCollection();
	
	  public void addPhraseChangeListener(PhraseChangeListener listener) {
			if (m_PhraseChangeListenerCollection == null) {
				m_PhraseChangeListenerCollection = new PhraseChangeListenerCollection();
			}
			m_PhraseChangeListenerCollection.add(listener);
		}

		public void removePhraseChangeListener(PhraseChangeListener listener) {
			if (m_PhraseChangeListenerCollection != null) {
				m_PhraseChangeListenerCollection.remove(listener);
			}
		}

		public void createPhrase(Phrase phrase) {
			
			PhraseServiceAsync service = (PhraseServiceAsync)GWT.create(PhraseService.class);
	        ServiceDefTarget endpoint = (ServiceDefTarget)service;
	        String moduleRelativeURL = GWT.getModuleBaseURL() + "phrase";
	        endpoint.setServiceEntryPoint(moduleRelativeURL);

	        AsyncCallback callback = new AsyncCallback() {

	        	public void onSuccess(Object result) {
	        		m_PhraseChangeListenerCollection.firePhraseChanged((Phrase)result, new ChangeEvent(true, false, false));
	        	}

	            public void onFailure(Throwable caught) {
	            	
	            	//try {
	            	//	throw caught;
	            	//}
	            	//catch (IncompatibleRemoteServiceException e) {
	            	//       Window.alert("IncompatibleRemoteServiceException");
	            	//     } catch (InvocationException e) {
		            //	       Window.alert("InvocationException ");
	            	//     } catch (Throwable e) {
			        //    	       Window.alert("Throwable");
	            	//caught.printStackTrace();

	            	Window.alert("PhraseServiceProxy::createPhrase() -- service call (1) failed.  Caught: " + caught.getMessage());
	            }
	        };
	        
	        try {

	        	// Call Web method
	        	service.createPhrase(phrase, callback);
	        	
			} catch (Exception e) {
	        	Window.alert("PhraseServiceProxy::createPhrase() -- service call (2) failed.  Exception: " + e.getMessage());
			}
		}

		public void updatePhrase(Phrase phrase) {
			
			PhraseServiceAsync service = (PhraseServiceAsync)GWT.create(PhraseService.class);
	        ServiceDefTarget endpoint = (ServiceDefTarget)service;
	        String moduleRelativeURL = GWT.getModuleBaseURL() + "phrase";
	        endpoint.setServiceEntryPoint(moduleRelativeURL);

	        AsyncCallback callback = new AsyncCallback() {

	        	public void onSuccess(Object result) {
	        		m_PhraseChangeListenerCollection.firePhraseChanged((Phrase)result, new ChangeEvent(false, true, false));
	        	}

	            public void onFailure(Throwable caught) {
	            	Window.alert("PhraseServiceProxy::updatePhrase() -- service call (1) failed.  Caught: " + caught.getMessage());
	            }
	        };
	        
	        try {
				// Call Web method
	        	service.updatePhrase(phrase, callback);
			} catch (Exception e) {
	        	Window.alert("PhraseServiceProxy::updatePhrase() -- service call (2) failed.  Exception: " + e.getMessage());
			}
		}

		public void deletePhrase(int iPhraseID) {
			
			PhraseServiceAsync service = (PhraseServiceAsync)GWT.create(PhraseService.class);
	        ServiceDefTarget endpoint = (ServiceDefTarget)service;
	        String moduleRelativeURL = GWT.getModuleBaseURL() + "phrase";
	        endpoint.setServiceEntryPoint(moduleRelativeURL);

	        AsyncCallback callback = new AsyncCallback() {

	        	public void onSuccess(Object result) {
	        		m_PhraseChangeListenerCollection.firePhraseChanged((Phrase)result, new ChangeEvent(false, false, true));
	        	}

	            public void onFailure(Throwable caught) {
	            	Window.alert("PhraseServiceProxy::deletePhrase() -- service call (1) failed.  Caught: " + caught.getMessage());
	            }
	        };
	        
	        try {
				// Call Web method
	        	service.deletePhrase(iPhraseID, callback);
			} catch (Exception e) {
	        	Window.alert("PhraseServiceProxy::deletePhrase() -- service call (2) failed.  Exception: " + e.getMessage());
			}
		}


}
