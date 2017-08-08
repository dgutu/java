package com.searchincite.client.services;

import com.google.gwt.user.client.rpc.RemoteService;
import com.searchincite.client.entity.Category;

public interface CategoryService extends RemoteService {
	
	// SECURITY WARNING: Don't EVER accept or use an org_id passed in from the caller of a Web service!!

	Category[] getCategoriesForOrganization(long lFieldMask) throws Exception;
	Category[] getCategoriesForOrganization(int iOrganizationID, long lFieldMask) throws Exception;
	Category getCategoryByID(int iCategoryID, long lFieldMask) throws Exception;
	Category createCategory(Category category) throws Exception;
	Category updateCategory(Category category) throws Exception;
	void deleteCategory(int iCategoryID) throws Exception;

}
