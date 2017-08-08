package com.searchincite.client.services;

import com.google.gwt.user.client.rpc.RemoteService;
import com.searchincite.client.entity.Document;
import com.searchincite.client.entity.DocumentResult;
import com.searchincite.client.entity.Ontology;

public interface DocumentService extends RemoteService {
	
	// SECURITY WARNING: Don't EVER accept or use an org_id passed in from the caller of a Web service!!

	Document getDocumentByID(long lDocumentID, long lFieldMask) throws Exception;
	Document createDocument(Document doc) throws Exception;
	Document updateDocument(Document doc) throws Exception;
	void deleteDocument(long lDocumentID) throws Exception;
	DocumentResult getDocumentResultByOntologyName(long lDocumentID, String iOntologyName) throws Exception;	
	void updateDocumentStatus(int iOntology, long lDocumentID, int iDocumentStatusID) throws Exception;
	void updateStatusOfDocsInSource(int iDocumentSourceID, int iDocumentStatusID, int lNumberOfDocsToUpdate) throws Exception;
	Ontology getDocumentResultAndOntology(long lDocumentID) throws Exception;
}
