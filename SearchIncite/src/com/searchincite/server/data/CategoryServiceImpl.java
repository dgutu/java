package com.searchincite.server.data;
import java.sql.SQLException;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.searchincite.api.entity.User;
import com.searchincite.client.entity.Category;
import com.searchincite.client.services.CategoryService;
import com.searchincite.server.entity.manager.CateogryManager;
import com.searchincite.server.entity.manager.UserManager;

public class CategoryServiceImpl extends RemoteServiceServlet implements CategoryService {

	private static final long serialVersionUID = 1L;

	public Category[] getCategoriesForOrganization(long lFieldMask) throws Exception {

		HttpServletRequest req = getThreadLocalRequest();
        User u = (User)req.getSession().getAttribute("user");
        
        if (u == null) {
        	return null;
        }

		return getCategoriesForOrganization(u.getOrganizationID(), lFieldMask);
	}

	public Category[] getCategoriesForOrganization(int iOrganizationID, long lFieldMask) throws Exception {

		Category[] arrCategories = null;
		
		try {
			arrCategories = CateogryManager.getCategoriesForOrganization(iOrganizationID, lFieldMask);

			HttpServletRequest req = getThreadLocalRequest();
			User u = (User)req.getSession().getAttribute("user");

			if (!UserManager.isSIAdmin(u.getUserID())) {
				for (int i = 0; i < arrCategories.length; i++) {
					if (arrCategories[i].getOrganizationID() != u.getOrganizationID()) {
						throw new Exception("Access denied.");
					} 
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return arrCategories;
	}

	public Category getCategoryByID(int iCategoryID, long lFieldMask) throws Exception {

		Category c = null;
		
		try {
			c = CateogryManager.getCategoryByID(iCategoryID, lFieldMask);

			//TODO: Protect from user retrieving/seeing ontologies owned by an organization other than their own.
			//		(ALSO - need to determine what to do for administrative users/when this may be permissible.)
			
			//TODO: Implement a better solution here...
			HttpServletRequest req = getThreadLocalRequest();
			User u = (User)req.getSession().getAttribute("user");
			
			if (c.getOrganizationID() != u.getOrganizationID()) {
				throw new Exception("Access denied.");
			} 

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return c;
	}

	public Category createCategory(Category category) throws Exception {

		HttpServletRequest req = getThreadLocalRequest();
        User u = (User)req.getSession().getAttribute("user");
        
        if (u == null) {
        	return null;
        }
        
        category.setCreatedByUserID(u.getUserID());
        category.setDateCreated(new Date());
        category.setLastModifiedByUserID(u.getUserID());
        category.setLastModifiedDate(new Date());
        
		boolean bIsSIAdmin = UserManager.isSIAdmin(u.getUserID());

		if (!bIsSIAdmin || category.getOrganizationID() == 0) {
			category.setOrganizationID(u.getOrganizationID());
		}

		return com.searchincite.server.entity.manager.CateogryManager.createCategory(category);
	}

	public void deleteCategory(int iCategoryID) throws Exception {

		HttpServletRequest req = getThreadLocalRequest();
        User u = (User)req.getSession().getAttribute("user");
        
        if (u == null) {
        	return;
        }
        
        //TODO: Allow users to delete categories for an org other than their own? (Admin users, perhaps?)
        //TODO: Check permissions.

		com.searchincite.server.entity.manager.CateogryManager.deleteCategory(iCategoryID, u.getUserID(), u.getOrganizationID());
	}

	public Category updateCategory(Category category) throws Exception {
		
		HttpServletRequest req = getThreadLocalRequest();
        User u = (User)req.getSession().getAttribute("user");
        
        if (u == null) {
        	return null;
        }
        
        category.setLastModifiedByUserID(u.getUserID());
        category.setLastModifiedDate(new Date());

        //TODO: Allow users to create categories for an org other than their own? (Admin users, perhaps?)
        category.setOrganizationID(u.getOrganizationID());

		com.searchincite.server.entity.manager.CateogryManager.updateCategory(category);
		return category;
	}

}
