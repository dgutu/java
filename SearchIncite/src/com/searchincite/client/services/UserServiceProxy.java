package com.searchincite.client.services;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;
import com.searchincite.client.entity.ChangeEvent;
import com.searchincite.client.entity.WebUser;
import com.searchincite.client.listeners.UserChangeListener;
import com.searchincite.client.listeners.UserChangeListenerCollection;

public class UserServiceProxy {

	private UserChangeListenerCollection m_UserChangeListenerCollection = new UserChangeListenerCollection();
	
	  public void addUserChangeListener(UserChangeListener listener) {
			if (m_UserChangeListenerCollection == null) {
				m_UserChangeListenerCollection = new UserChangeListenerCollection();
			}
			m_UserChangeListenerCollection.add(listener);
		}

		public void removeUserChangeListener(UserChangeListener listener) {
			if (m_UserChangeListenerCollection != null) {
				m_UserChangeListenerCollection.remove(listener);
			}
		}

		public void createUser(WebUser user) {
			
			UserServiceAsync service = (UserServiceAsync)GWT.create(UserService.class);
	        ServiceDefTarget endpoint = (ServiceDefTarget)service;
	        String moduleRelativeURL = GWT.getModuleBaseURL() + "user";
	        endpoint.setServiceEntryPoint(moduleRelativeURL);

	        AsyncCallback callback = new AsyncCallback() {

	        	public void onSuccess(Object result) {
	        		m_UserChangeListenerCollection.fireUserChanged((WebUser)result, new ChangeEvent(true, false, false));
	        	}

	            public void onFailure(Throwable caught) {
	            	Window.alert("UserServiceProxy::createUser() -- service call (1) failed.  Caught: " + caught.getMessage());
	            }
	        };
	        
	        try {
				// Call Web method
	        	service.createUser(user, callback);
			} catch (Exception e) {
	        	Window.alert("UserServiceProxy::createUser() -- service call (2) failed.  Exception: " + e.getMessage());
			}
		}

		public void updateUser(WebUser user) {
			
			UserServiceAsync service = (UserServiceAsync)GWT.create(UserService.class);
	        ServiceDefTarget endpoint = (ServiceDefTarget)service;
	        String moduleRelativeURL = GWT.getModuleBaseURL() + "user";
	        endpoint.setServiceEntryPoint(moduleRelativeURL);

	        AsyncCallback callback = new AsyncCallback() {

	        	public void onSuccess(Object result) {
	        		m_UserChangeListenerCollection.fireUserChanged((WebUser)result, new ChangeEvent(false, true, false));
	        	}

	            public void onFailure(Throwable caught) {
	            	Window.alert("UserServiceProxy::updateUser() -- service call (1) failed.  Caught: " + caught.getMessage());
	            }
	        };
	        
	        try {
				// Call Web method
	        	service.updateUser(user, callback);
			} catch (Exception e) {
	        	Window.alert("UserServiceProxy::updateUser() -- service call (2) failed.  Exception: " + e.getMessage());
			}
		}

		public void setUserActiveStatus(int iUserID, boolean bActive) {
			
			UserServiceAsync service = (UserServiceAsync)GWT.create(UserService.class);
	        ServiceDefTarget endpoint = (ServiceDefTarget)service;
	        String moduleRelativeURL = GWT.getModuleBaseURL() + "user";
	        endpoint.setServiceEntryPoint(moduleRelativeURL);

	        AsyncCallback callback = new AsyncCallback() {

	        	public void onSuccess(Object result) {
	        		m_UserChangeListenerCollection.fireUserChanged((WebUser)result, new ChangeEvent(false, false, true));
	        	}

	            public void onFailure(Throwable caught) {
	            	Window.alert("UserServiceProxy::setUserActiveStatus() -- service call (1) failed.  Caught: " + caught.getMessage());
	            }
	        };
	        
	        try {
				// Call Web method
	        	service.setUserActiveStatus(iUserID, bActive, callback);
			} catch (Exception e) {
	        	Window.alert("UserServiceProxy::setUserActiveStatus() -- service call (2) failed.  Exception: " + e.getMessage());
			}
		}

}
