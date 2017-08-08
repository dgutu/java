package com.searchincite.client.services;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.searchincite.client.entity.Category;

public interface CategoryServiceAsync {

	// SECURITY WARNING: Don't EVER accept or use an org_id passed in from the caller of a Web service!!

	void getCategoriesForOrganization(long lFieldMask, AsyncCallback callback);
	void getCategoriesForOrganization(int iOrganizationID, long lFieldMask, AsyncCallback callback);
	void getCategoryByID(int iCategoryID, long lFieldMask, AsyncCallback callback);
	void createCategory(Category category, AsyncCallback callback) throws Exception;
	void updateCategory(Category category, AsyncCallback callback) throws Exception;
	void deleteCategory(int iCategoryID, AsyncCallback callback) throws Exception;
}
