package com.searchincite.client.services;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.searchincite.client.entity.DocumentSource;

public interface DocumentSourceServiceAsync {

	// SECURITY WARNING: Don't EVER accept or use an org_id passed in from the caller of a Web service!!

	void getDocumentSourcesForOrganization(long lFieldMask, AsyncCallback callback);
	void getDocumentSourceByID(int iDocumentSourceID, long lFieldMask, AsyncCallback callback);
	void createDocumentSource(DocumentSource docSource, AsyncCallback callback) throws Exception;
	void updateDocumentSource(DocumentSource docSource, AsyncCallback callback) throws Exception;
	void deleteDocumentSource(int iDocumentSourceID, AsyncCallback callback) throws Exception;
}
