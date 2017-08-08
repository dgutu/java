package com.searchincite.server.data;
import java.sql.SQLException;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.searchincite.api.entity.User;
import com.searchincite.client.entity.Organization;
import com.searchincite.client.services.OrganizationService;
import com.searchincite.server.entity.manager.UserManager;

public class OrganizationServiceImpl extends RemoteServiceServlet implements OrganizationService {

	private static final long serialVersionUID = 1L;

	public Organization createOrganization(Organization org) throws Exception {

		HttpServletRequest req = getThreadLocalRequest();
        User u = (User)req.getSession().getAttribute("user");
        
        if (u == null) {
        	return null;
        }
        
        // Only SI Admins can create organizations
		if (!UserManager.isSIAdmin(u.getUserID())) {
			throw new Exception("Access denied.");
		}
        
        org.setCreatedByUserID(u.getUserID());
        org.setDateCreated(new Date());
        org.setLastModifiedByUserID(u.getUserID());
        org.setLastModifiedDate(new Date());
        
		return com.searchincite.server.entity.manager.OrganizationManager.createOrganization(org);
	}

	public void deleteOrganization(int iOrganizationID) throws Exception {
		
		HttpServletRequest req = getThreadLocalRequest();
        User u = (User)req.getSession().getAttribute("user");
        
        if (u == null) {
        	return;
        }
        
        // Only SI Admins can delete organizations
		if (!UserManager.isSIAdmin(u.getUserID())) {
			throw new Exception("Access denied.");
		}

		com.searchincite.server.entity.manager.OrganizationManager.deleteOrganization(iOrganizationID);
	}

	public Organization getOrganizationByID(int iOrganizationID, long lFieldMask) throws Exception {

		Organization org = null;
		
		try {
			HttpServletRequest req = getThreadLocalRequest();
			User u = (User)req.getSession().getAttribute("user");
			
			if (!UserManager.isSIAdmin(u.getUserID()) && (iOrganizationID != u.getOrganizationID())) {
				throw new Exception("Access denied.");
			} 

			org = com.searchincite.server.entity.manager.OrganizationManager.getOrganizationByID(iOrganizationID, lFieldMask);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return org;
	}

	public Organization updateOrganization(Organization org) throws Exception {

		HttpServletRequest req = getThreadLocalRequest();
        User u = (User)req.getSession().getAttribute("user");
        
        if (u == null) {
        	return null;
        }

		if (!UserManager.isSIAdmin(u.getUserID())) {
			throw new Exception("Access denied.");
		} 

        org.setLastModifiedByUserID(u.getUserID());
        org.setLastModifiedDate(new Date());
        
		com.searchincite.server.entity.manager.OrganizationManager.updateOrganization(org);
		
		return org;
	}

	public Organization[] getOrganizations(long lFieldMask) throws Exception {

		HttpServletRequest req = getThreadLocalRequest();
        User u = (User)req.getSession().getAttribute("user");
        
        if (u == null) {
        	return null;
        }

		if (!UserManager.isSIAdmin(u.getUserID())) {
			// return only the current user's organization
			return new Organization[] { com.searchincite.server.entity.manager.OrganizationManager.getOrganizationByID(u.getOrganizationID(), lFieldMask) };
		} 

		return com.searchincite.server.entity.manager.OrganizationManager.getOrganizations(lFieldMask);
		
	}

}
