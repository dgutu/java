package com.searchincite.client.services;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;
import com.searchincite.client.entity.Category;
import com.searchincite.client.entity.ChangeEvent;
import com.searchincite.client.listeners.CategoryChangeListener;
import com.searchincite.client.listeners.CategoryChangeListenerCollection;

public class CategoryServiceProxy {

	private CategoryChangeListenerCollection m_CategoryChangeListenerCollection = new CategoryChangeListenerCollection();
	
	  public void addCategoryChangeListener(CategoryChangeListener listener) {
			if (m_CategoryChangeListenerCollection == null) {
				m_CategoryChangeListenerCollection = new CategoryChangeListenerCollection();
			}
			m_CategoryChangeListenerCollection.add(listener);
		}

		public void removeCategoryChangeListener(CategoryChangeListener listener) {
			if (m_CategoryChangeListenerCollection != null) {
				m_CategoryChangeListenerCollection.remove(listener);
			}
		}

		public void createCategory(Category category) {
			
			CategoryServiceAsync service = (CategoryServiceAsync)GWT.create(CategoryService.class);
	        ServiceDefTarget endpoint = (ServiceDefTarget)service;
	        String moduleRelativeURL = GWT.getModuleBaseURL() + "category";
	        endpoint.setServiceEntryPoint(moduleRelativeURL);

	        AsyncCallback callback = new AsyncCallback() {

	        	public void onSuccess(Object result) {
	        		m_CategoryChangeListenerCollection.fireCategoryChanged((Category)result, new ChangeEvent(true, false, false));
	        	}

	            public void onFailure(Throwable caught) {
	            	Window.alert("CategoryServiceProxy::createCategory() -- service call (1) failed.  Caught: " + caught.getMessage());
	            }
	        };
	        
	        try {
				// Call Web method
	        	service.createCategory(category, callback);
			} catch (Exception e) {
	        	Window.alert("CategoryServiceProxy::createCategory() -- service call (2) failed.  Exception: " + e.getMessage());
			}
		}

		public void updateCategory(Category category) {
			
			CategoryServiceAsync service = (CategoryServiceAsync)GWT.create(CategoryService.class);
	        ServiceDefTarget endpoint = (ServiceDefTarget)service;
	        String moduleRelativeURL = GWT.getModuleBaseURL() + "category";
	        endpoint.setServiceEntryPoint(moduleRelativeURL);

	        AsyncCallback callback = new AsyncCallback() {

	        	public void onSuccess(Object result) {
	        		m_CategoryChangeListenerCollection.fireCategoryChanged((Category)result, new ChangeEvent(false, true, false));
	        	}

	            public void onFailure(Throwable caught) {
	            	Window.alert("CategoryServiceProxy::updateCategory() -- service call (1) failed.  Caught: " + caught.getMessage());
	            }
	        };
	        
	        try {
				// Call Web method
	        	service.updateCategory(category, callback);
			} catch (Exception e) {
	        	Window.alert("CategoryServiceProxy::updateCategory() -- service call (2) failed.  Exception: " + e.getMessage());
			}
		}

		public void deleteCategory(int iCategoryID) {
			
			CategoryServiceAsync service = (CategoryServiceAsync)GWT.create(CategoryService.class);
	        ServiceDefTarget endpoint = (ServiceDefTarget)service;
	        String moduleRelativeURL = GWT.getModuleBaseURL() + "category";
	        endpoint.setServiceEntryPoint(moduleRelativeURL);

	        AsyncCallback callback = new AsyncCallback() {

	        	public void onSuccess(Object result) {
	        		m_CategoryChangeListenerCollection.fireCategoryChanged((Category)result, new ChangeEvent(false, false, true));
	        	}

	            public void onFailure(Throwable caught) {
	            	Window.alert("CategoryServiceProxy::deleteCategory() -- service call (1) failed.  Caught: " + caught.getMessage());
	            }
	        };
	        
	        try {
				// Call Web method
	        	service.deleteCategory(iCategoryID, callback);
			} catch (Exception e) {
	        	Window.alert("CategoryServiceProxy::deleteCategory() -- service call (2) failed.  Exception: " + e.getMessage());
			}
		}


}
