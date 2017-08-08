package com.searchincite.client.entity;

public class DocumentWithResult extends Document {

	private DocumentResult m_DocumentResult;
	
	public DocumentResult getDocumentResult() {
		return m_DocumentResult;
	}
	public void setDocumentResult(DocumentResult dr) {
		m_DocumentResult = dr;
	}
}
