package com.searchincite.client.services;

import com.google.gwt.user.client.rpc.RemoteService;
import com.searchincite.client.entity.Organization;

public interface OrganizationService extends RemoteService {
	
	// SECURITY WARNING: Don't EVER accept or use an org_id passed in from the caller of a Web service!!

	Organization[] getOrganizations(long lFieldMask) throws Exception;
	Organization getOrganizationByID(int iOrganizationID, long lFieldMask) throws Exception;
	Organization createOrganization(Organization org) throws Exception;
	Organization updateOrganization(Organization org) throws Exception;
	void deleteOrganization(int iOrganizationID) throws Exception;
}
