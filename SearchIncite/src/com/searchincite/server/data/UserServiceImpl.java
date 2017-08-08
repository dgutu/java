package com.searchincite.server.data;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.searchincite.api.entity.User;
import com.searchincite.client.entity.SecurityRole;
import com.searchincite.client.entity.UserWizardRunInfo;
import com.searchincite.client.entity.WebUser;
import com.searchincite.client.services.UserService;
import com.searchincite.server.entity.manager.UserManager;

public class UserServiceImpl extends RemoteServiceServlet implements UserService {

	private static final long serialVersionUID = 1L;

	public WebUser createUser(WebUser user) throws Exception {

		HttpServletRequest req = getThreadLocalRequest();
        User u = (User)req.getSession().getAttribute("user");
        
        if (u == null) {
        	return null;
        }
        
		boolean bIsSIAdmin = UserManager.isSIAdmin(u.getUserID());
		boolean bIsOrgAdmin = UserManager.isOrganizationAdmin(u.getUserID());

        // Only SI and Organization Admins can create users
		if (!bIsSIAdmin && !bIsOrgAdmin) {
			throw new Exception("Access denied.");
		}

		// If Organization Admin, create new user in this user's organization  
		if (bIsOrgAdmin) {
			//Force creation of user in current organization 
	        //TODO: Reconsider whether this is the appropriate behavior.
	        user.setOrganizationID(u.getOrganizationID());
		}

        user.setCreatedByUserID(u.getUserID());
        user.setDateCreated(new java.util.Date());
        user.setLastModifiedByUserID(u.getUserID());
        user.setLastModifiedDate(new java.util.Date());
        
		return com.searchincite.server.entity.manager.UserManager.createUser(user);
	}

	public void setUserActiveStatus(int iUserID, boolean bActive) throws Exception {

		HttpServletRequest req = getThreadLocalRequest();
        User u = (User)req.getSession().getAttribute("user");
        
        if (u == null) {
        	return;
        }

		boolean bIsSIAdmin = UserManager.isSIAdmin(u.getUserID());
		boolean bIsOrgAdmin = UserManager.isOrganizationAdmin(u.getUserID());

        // User cannot set active status for anybody (even self) unless they are an SI or Organization Admin
		if (!bIsSIAdmin && !bIsOrgAdmin) {
			throw new Exception("Access denied.");
		}

		if (bIsOrgAdmin) {
			// Org Admins cannot set active status for user in another organization 

			// Get User that we are updating
			WebUser userToUpdate = UserManager.getUserByID(iUserID, WebUser.FIELD_ID | WebUser.FIELD_ORGANIZATION_ID);
			if (userToUpdate.getOrganizationID() != u.getOrganizationID()) {
				throw new Exception("Access denied.");
			}			
		}

		com.searchincite.server.entity.manager.UserManager.setUserActiveStatus(iUserID, bActive, u.getUserID());
	}

	public WebUser updateUser(WebUser user) throws Exception {
		
		HttpServletRequest req = getThreadLocalRequest();
        User u = (User)req.getSession().getAttribute("user");
        
        if (u == null) {
        	return null;
        }
        
		boolean bIsSIAdmin = UserManager.isSIAdmin(u.getUserID());
		boolean bIsOrgAdmin = UserManager.isOrganizationAdmin(u.getUserID());

		if (!bIsSIAdmin) {
		
			if (bIsOrgAdmin) {
				// Org admins can update users in their organization only
				if (u.getOrganizationID() != user.getOrganizationID()) {
					throw new Exception("Access denied.");
				}
			}
			else if (u.getUserID() != user.getUserID()) {
				// Users can update themselves only
				throw new Exception("Access denied.");
			}
		} 

        user.setLastModifiedByUserID(u.getUserID());
        user.setLastModifiedDate(new java.util.Date());

		try {
			
			if (bIsSIAdmin || bIsOrgAdmin) {
				//Delete user's roles.  They will be created/updated in updateUser(). 
				com.searchincite.server.entity.manager.UserManager.deleteUserRoles(user.getUserID());
			}
			
			com.searchincite.server.entity.manager.UserManager.updateUser(user);
		}
		catch (Exception ex) {
			throw ex;
		}
		
        return user;
	}

	public WebUser getUserByID(int iUserID, long lFieldMask) throws Exception {
		
		WebUser retUser = null;
		
		try {
			//TODO: Implement a better solution here...
			HttpServletRequest req = getThreadLocalRequest();
			User u = (User)req.getSession().getAttribute("user");

			retUser = com.searchincite.server.entity.manager.UserManager.getUserByID(iUserID, lFieldMask);

			boolean bIsSIAdmin = UserManager.isSIAdmin(u.getUserID());
			boolean bIsOrgAdmin = UserManager.isOrganizationAdmin(u.getUserID());

			if (!bIsSIAdmin) {
				if (bIsOrgAdmin) {
					if (u.getOrganizationID() != retUser.getOrganizationID()) {
						throw new Exception("Access denied.");
					} 
				}
				else {
					// User is NOT an SI Admin OR Organization Admin - they can only "get" themselves.
					if (u.getUserID() != retUser.getUserID()) {
						throw new Exception("Access denied.");
					} 
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return retUser;
	}

	public WebUser[] getUsersForOrganization(long lFieldMask) throws Exception {

		HttpServletRequest req = getThreadLocalRequest();
        User u = (User)req.getSession().getAttribute("user");
        
        if (u == null) {
        	return null;
        }

		return getUsersForOrganization(u.getOrganizationID(), lFieldMask);
	}

	public WebUser[] getUsersForOrganization(int iOrganizationID, long lFieldMask) throws Exception {

		WebUser[] arrUsers = null;
		
		try {

			HttpServletRequest req = getThreadLocalRequest();
			User u = (User)req.getSession().getAttribute("user");

			boolean bIsSIAdmin = UserManager.isSIAdmin(u.getUserID());
			boolean bIsOrgAdmin = UserManager.isOrganizationAdmin(u.getUserID());
			
			// Must be an SI or Organization Admin in order to retrieve users for an organization
			if (!bIsSIAdmin && !bIsOrgAdmin) {
				throw new Exception("Access denied.");
			}
			
			arrUsers = UserManager.getUsersForOrganization(iOrganizationID, lFieldMask);

			if (!bIsSIAdmin) {
				// The authenticated user is an Organization Admin;
				// all users must belong to this user's organization.
				for (int i = 0; i < arrUsers.length; i++) {
					if (arrUsers[i].getOrganizationID() != u.getOrganizationID()) {
						throw new Exception("Access denied.");
					}
				}

				// ALSO - don't show SI Admin users in this organization to Org Admins
				// TODO: Find a more efficient way to do this
				ArrayList lstUsers = new ArrayList();
				for (int i = 0; i < arrUsers.length; i++) {
					if (!UserManager.isSIAdmin(arrUsers[i].getUserID())) {
						lstUsers.add(arrUsers[i]);
					}
				}

				return ((WebUser[])lstUsers.toArray((Object[])new WebUser[lstUsers.size()]));
			}

		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		}
		
		return arrUsers;
	}

	public SecurityRole[] getSecurityRolesForUser(int iUserID) throws Exception {

		SecurityRole[] arrRoles = null;
		
		try {
			HttpServletRequest req = getThreadLocalRequest();
			User u = (User)req.getSession().getAttribute("user");
			
			// Protect from user retrieving/seeing security roles for another user
			// unless they are an SI Admin or Organization Admin
			boolean bIsSIAdmin = UserManager.isSIAdmin(u.getUserID());
			boolean bIsOrgAdmin = UserManager.isOrganizationAdmin(u.getUserID());
			
			if (u.getUserID() != iUserID && !bIsSIAdmin && !bIsOrgAdmin) {
				throw new Exception("Access denied.");
			} else {
				// We're here because the user is either requesting role information
				// for themselves or they are an SI Admin or Org Admin requesting information
				// for another user.
				
				// If the requesting user is an Organization Admin (and not an SI Admin),
				// then they must belong to the same organiztion as -- or BE -- the user they are
				// requesting role information for.
				if (bIsOrgAdmin && !bIsSIAdmin && u.getUserID() != iUserID) {

					WebUser userOfInterest = UserManager.getUserByID(iUserID, WebUser.FIELD_ORGANIZATION_ID);

					if (userOfInterest != null) {
						if (userOfInterest.getOrganizationID() != u.getOrganizationID()) {
							throw new Exception("Access denied.");
						}
					}
				}
			}
			//else, the user is either requesting information for their own user or is an SI Admin
			
			ArrayList arrLstRoles = UserManager.getSecurityRolesForUser(iUserID);
			
			if (arrLstRoles.size() > 0) {
				arrRoles = ((SecurityRole[])arrLstRoles.toArray((Object[])new SecurityRole[arrLstRoles.size()]));
			}

		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		}
		
		return arrRoles;
	}

	public SecurityRole[] getSecurityRolesForUser() throws Exception {

		try {
			HttpServletRequest req = getThreadLocalRequest();
			User u = (User)req.getSession().getAttribute("user");

			return getSecurityRolesForUser(u.getUserID());

		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		}
		
	}

	public WebUser[] getAllUsers(long lFieldMask) throws Exception {

		WebUser[] arrUsers = null;
		
		try {

			HttpServletRequest req = getThreadLocalRequest();
			User u = (User)req.getSession().getAttribute("user");

			// Must be an SI Admin in order to retrieve all users
			if (!UserManager.isSIAdmin(u.getUserID())) {
				throw new Exception("Access denied.");
			}
			
			arrUsers = UserManager.getAllUsers(lFieldMask);

		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		}
		
		return arrUsers;
	}

	public WebUser getCurrentUser(long lFieldMask) throws Exception {
		
		WebUser retUser = null;
		
		try {
			HttpServletRequest req = getThreadLocalRequest();
			User u = (User)req.getSession().getAttribute("user");

			retUser = com.searchincite.server.entity.manager.UserManager.getUserByID(u.getUserID(), lFieldMask);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return retUser;
	}

	public SecurityRole[] getAllSecurityRoles() throws Exception {

		try {
			HttpServletRequest req = getThreadLocalRequest();
			User u = (User)req.getSession().getAttribute("user");

			boolean bIsSIAdmin = UserManager.isSIAdmin(u.getUserID());
			boolean bIsOrgAdmin = UserManager.isOrganizationAdmin(u.getUserID());
			
			if (!bIsSIAdmin && !bIsOrgAdmin) {
				// Not an SI Admin or Org Admin?  User can see only roles assigned to them.
				return getSecurityRolesForUser(u.getUserID());
			}			
			
			ArrayList arrLstRoles = UserManager.getAllSecurityRoles();
			
			// Go through list of roles
			for (int i = 0; i < arrLstRoles.size(); i++) {

				SecurityRole sr = (SecurityRole)arrLstRoles.get(i);
				
				if (sr.getRoleID() == SecurityConstants.ROLE_ADMIN && !bIsSIAdmin) {
					// Don't return SI Admin role -- this user has no business seeing it.
					arrLstRoles.remove(i);
				}
				
			}

			return ((SecurityRole[])arrLstRoles.toArray((Object[])new SecurityRole[arrLstRoles.size()]));
			

		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		}
		
	}

	/*
	public void setSecurityRolesForUser(int iUserID, int[] intArrSecurityRoleIDs) throws Exception {

		//SecurityRole[] arrRoles = null;
		
		try {
			HttpServletRequest req = getThreadLocalRequest();
			User u = (User)req.getSession().getAttribute("user");
			
			boolean bIsSIAdmin = UserManager.isSIAdmin(u.getUserID());
			boolean bIsOrgAdmin = UserManager.isOrganizationAdmin(u.getUserID());
			
			// Only admins can set roles for users
			if (!bIsSIAdmin && !bIsOrgAdmin) {
				throw new Exception("Access denied.");
			} else {
				
				if (bIsOrgAdmin && !bIsSIAdmin) {				
					
					// If the user is an Org Admin and not an SI Admin, then they can't 
					// set the SI Admin role for *anybody*.
					if (intArrSecurityRoleIDs != null) {
						for (int i = 0; i < intArrSecurityRoleIDs.length; i++) {
							if (intArrSecurityRoleIDs[i] == SecurityConstants.ROLE_ADMIN) {
								throw new Exception("Access Denied.");
							}					
						}
					}
					
					// If the requesting user is an Organization Admin (and not an SI Admin),
					// then they must belong to the same organiztion as -- or BE -- the user they are
					// setting roles for.
					WebUser userBeingModified = UserManager.getUserByID(iUserID, WebUser.FIELD_ORGANIZATION_ID);

					if (userBeingModified.getOrganizationID() != u.getOrganizationID()) {
						throw new Exception("Access denied.");
					}
				}
			}
			
			UserManager.setSecurityRolesForUser(iUserID, intArrSecurityRoleIDs);

		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		}
	}
*/
	public UserWizardRunInfo getLastUserWizardRunInfo(long lFieldMask) throws Exception {
		
		UserWizardRunInfo ri = null;
		
		try {
			HttpServletRequest req = getThreadLocalRequest();
			User u = (User)req.getSession().getAttribute("user");

			boolean bIsSIAdmin = UserManager.isSIAdmin(u.getUserID());
			
			if (!bIsSIAdmin) {
				throw new Exception ("Access denied.");
			}

			ri = com.searchincite.server.entity.manager.UserWizardManager.getLastUserWizardRun(u.getOrganizationID(), lFieldMask);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return ri;
	}

	public void completeNewUserWizard(UserWizardRunInfo runInfo) throws Exception {

		try {
			HttpServletRequest req = getThreadLocalRequest();
			User u = (User)req.getSession().getAttribute("user");

			boolean bIsSIAdmin = UserManager.isSIAdmin(u.getUserID());
			
			if (!bIsSIAdmin) {
				throw new Exception ("Access denied.");
			}

			runInfo.setRunByUserID(u.getUserID());
			runInfo.setRunDateTime(new Date());
			
			com.searchincite.server.entity.manager.UserWizardManager.completeNewUserWizard(runInfo);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
