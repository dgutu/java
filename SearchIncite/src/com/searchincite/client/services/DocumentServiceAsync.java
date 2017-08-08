package com.searchincite.client.services;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.searchincite.client.entity.Document;

@SuppressWarnings("rawtypes")
public interface DocumentServiceAsync {
	void getDocumentByID(long lDocumentID, long lFieldMask, AsyncCallback callback);
	void createDocument(Document doc, AsyncCallback callback) throws Exception;
	void updateDocument(Document doc, AsyncCallback callback) throws Exception;
	void deleteDocument(long lDocumentID, AsyncCallback callback) throws Exception;
	void getDocumentResultByOntologyName(long lDocumentID, String iOntologyName, AsyncCallback callback) throws Exception;
	void updateDocumentStatus(int iOntologyID, long lDocumentID, int iDocumentStatusID, AsyncCallback callback) throws Exception;
	void updateStatusOfDocsInSource(int iDocumentSourceID, int iDocumentStatusID, int lNumberOfDocsToUpdate, AsyncCallback callback) throws Exception;
	void getDocumentResultAndOntology(long lDocumentID, AsyncCallback callback) throws Exception;
}
