package com.searchincite.client.widgets;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;
import com.google.gwt.user.client.ui.ChangeListener;
import com.google.gwt.user.client.ui.ChangeListenerCollection;
import com.google.gwt.user.client.ui.ListBox;
import com.searchincite.client.entity.Category;
import com.searchincite.client.services.CategoryService;
import com.searchincite.client.services.CategoryServiceAsync;


public class CategoryList extends ListBox {

	private boolean m_bShowNoSelection = false;
	protected ChangeListenerCollection m_ChangeListenerCollection = null;
	private Category[] m_arrCategories = null;
	private String m_strItemValueToSelect = "-1";
	private int m_iOrganizationID = -1;

	public CategoryList(boolean bShowNoSelection, boolean bAutoFill, int iVisibleItemCount) {
	    
		setShowNoSelection(bShowNoSelection);
		setVisibleItemCount(iVisibleItemCount);
		
		if (bAutoFill) {
			fillList();
		}
		else {
			emptyList();
		}
	}	

	public void setShowNoSelection(boolean bShowNoSelection) {
		m_bShowNoSelection = bShowNoSelection;
	}
	public boolean getShowNoSelection() {
		return m_bShowNoSelection;
	}
	
	public void fillList() {
		fillList("-1");
	}

	public void fillList(int iOrganizationID, String strItemValueToSelect) {
		m_iOrganizationID = iOrganizationID;
		fillList(strItemValueToSelect);
	}

	public void emptyList() {
		clear();
		
		if (getShowNoSelection()) {
    		insertItem("[Select Category]", "-1", 0);
		}
	}
	
	public void fillList(String strItemValueToSelect) {
		
		m_strItemValueToSelect = strItemValueToSelect;
		//first, empty the list
		clear();
		
		CategoryServiceAsync categoryService = (CategoryServiceAsync)GWT.create(CategoryService.class);
        ServiceDefTarget endpoint = (ServiceDefTarget)categoryService;
        String moduleRelativeURL = GWT.getModuleBaseURL() + "category";
        endpoint.setServiceEntryPoint(moduleRelativeURL);

        AsyncCallback callback = new AsyncCallback() {

        	public void onSuccess(Object result) {

        		m_arrCategories = (Category[])result;
        		
        		if (m_arrCategories != null && m_arrCategories.length > 0) {
        			
        			for (int i = 0; i < m_arrCategories.length; i++) {
        				addItem(m_arrCategories[i].getName(), String.valueOf(m_arrCategories[i].getCategoryID()));
        			}
        		}
        		
        		if (getShowNoSelection()) {
            		insertItem("[Select Category]", "-1", 0);
        		}

        		if (!m_strItemValueToSelect.equals("-1")) {
        			selectItemByValue(m_strItemValueToSelect);
        		}
        		//else if (getItemCount() > 1) {
        		//	setSelectedIndex(1);
        		//	notifyListeners();
        		//}
        		else if (getItemCount() > 0) {
        			setSelectedIndex(0);
        		}
        	}

            public void onFailure(Throwable caught) {
            	Window.alert("CategoryList::fillList() -- call to categoryService failed.");
            }
        };

        if (m_iOrganizationID == -1) {
        	categoryService.getCategoriesForOrganization(Category.FIELD_ID | Category.FIELD_NAME, callback);
        }
        else {
        	categoryService.getCategoriesForOrganization(m_iOrganizationID, Category.FIELD_ID | Category.FIELD_NAME, callback);
        }
	}

	public void selectItemByValue(String strItemValue) {
		for (int i = 0; i < getItemCount(); i++) {
			if (getValue(i).equals(strItemValue)) {
				setSelectedIndex(i);
			}
		}
	}

	public void selectItemByText(String strItemText) {
		for (int i = 0; i < getItemCount(); i++) {
			if (getItemText(i).equals(strItemText)) {
				setSelectedIndex(i);
			}
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

	public Category getSelectedCategory() {

		if (m_arrCategories != null && m_arrCategories.length >= 0) {
			for (int i = 0; i < m_arrCategories.length; i++) {
				if (m_arrCategories[i].getCategoryID() == Integer.parseInt(getValue(getSelectedIndex()))) {
					return m_arrCategories[i];
				}
			}
		}		
		return null;
	
	}
}
