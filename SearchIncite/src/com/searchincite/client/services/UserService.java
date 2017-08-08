package com.searchincite.client.services;

import com.google.gwt.user.client.rpc.RemoteService;
import com.searchincite.client.entity.SecurityRole;
import com.searchincite.client.entity.UserWizardRunInfo;
import com.searchincite.client.entity.WebUser;

public interface UserService extends RemoteService {
	
	// SECURITY WARNING: Don't EVER accept or use an org_id passed in from the caller of a Web service!!

	WebUser[] getUsersForOrganization(long lFieldMask) throws Exception;
	WebUser getUserByID(int iUserID, long lFieldMask) throws Exception;
	WebUser createUser(WebUser user) throws Exception;
	WebUser updateUser(WebUser user) throws Exception;
	void setUserActiveStatus(int iUserID, boolean bActive) throws Exception;
	SecurityRole[] getSecurityRolesForUser(int iUserID) throws Exception;
	SecurityRole[] getSecurityRolesForUser() throws Exception;
	WebUser[] getAllUsers(long lFieldMask) throws Exception;
	WebUser getCurrentUser(long lFieldMask) throws Exception;
	SecurityRole[] getAllSecurityRoles() throws Exception;
	UserWizardRunInfo getLastUserWizardRunInfo(long lFieldMask) throws Exception;
	void completeNewUserWizard(UserWizardRunInfo runInfo) throws Exception;
}
