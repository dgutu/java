package com.searchincite.client.services;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.searchincite.client.entity.Organization;

public interface OrganizationServiceAsync {

	// SECURITY WARNING: Don't EVER accept or use an org_id passed in from the caller of a Web service!!

	void getOrganizations(long lFieldMask, AsyncCallback callback);
	void getOrganizationByID(int iOrganizationID, long lFieldMask, AsyncCallback callback);
	void createOrganization(Organization org, AsyncCallback callback) throws Exception;
	void updateOrganization(Organization org, AsyncCallback callback) throws Exception;
	void deleteOrganization(int iOrganizationID, AsyncCallback callback) throws Exception;
}
