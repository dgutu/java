package com.searchincite.client.services;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.searchincite.client.entity.UserWizardRunInfo;
import com.searchincite.client.entity.WebUser;

public interface UserServiceAsync {

	// SECURITY WARNING: Don't EVER accept or use an org_id passed in from the caller of a Web service!!

	void getUsersForOrganization(long lFieldMask, AsyncCallback callback);
	void getUserByID(int iUserID, long lFieldMask, AsyncCallback callback);
	void createUser(WebUser user, AsyncCallback callback) throws Exception;
	void updateUser(WebUser user, AsyncCallback callback) throws Exception;
	void setUserActiveStatus(int iUSerID, boolean bActive, AsyncCallback callback) throws Exception;
	void getSecurityRolesForUser(int iUserID, AsyncCallback callback) throws Exception;
	void getSecurityRolesForUser(AsyncCallback callback) throws Exception;
	void getAllUsers(long lFieldMask, AsyncCallback callback);
	void getCurrentUser(long lFieldMask, AsyncCallback callback);
	void getAllSecurityRoles(AsyncCallback callback) throws Exception;
	void getLastUserWizardRunInfo(long lFieldMask, AsyncCallback callback) throws Exception;
	void completeNewUserWizard(UserWizardRunInfo runInfo, AsyncCallback callback) throws Exception;
}
