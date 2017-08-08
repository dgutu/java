package com.searchincite.client.services;

import com.google.gwt.user.client.rpc.RemoteService;
import com.searchincite.client.entity.DocumentSource;

public interface DocumentSourceService extends RemoteService {
	
	// SECURITY WARNING: Don't EVER accept or use an org_id passed in from the caller of a Web service!!

	DocumentSource[] getDocumentSourcesForOrganization(long lFieldMask) throws Exception;
	DocumentSource getDocumentSourceByID(int iSubjectID, long lFieldMask) throws Exception;
	DocumentSource createDocumentSource(DocumentSource docSource) throws Exception;
	DocumentSource updateDocumentSource(DocumentSource docSource) throws Exception;
	void deleteDocumentSource(int iDocumentSourceID) throws Exception;

}
