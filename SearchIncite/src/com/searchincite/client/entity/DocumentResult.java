package com.searchincite.client.entity;

import com.google.gwt.user.client.rpc.IsSerializable;

public class DocumentResult implements IsSerializable {

	private long m_lDocumentID = -1;

	private int m_iDocumentStatusID;
	private String m_strDocumentStatus;
	
	private Ontology m_Ontology = null;
	private String m_strOntologyName;
		
	private DocumentSubjectResult[] m_arrSubjectResults;
	//ArrayList m_arrSubjectResults = new ArrayList();
	//private byte[] m_bArrContent;
	private String m_strMarkedUpDocument = new String();	

	public String getOntologyName() {
		return m_strOntologyName;
	}
	public void setOntologyName(String strOntologyName) {
		m_strOntologyName = strOntologyName;
	}

	public String getMarkedUpDocument() {
		if (isStringNullOrEmpty(m_strMarkedUpDocument))
			return getEmptyString();
		else
			return m_strMarkedUpDocument;
	}
	public void setMarkedUpDocument(String strMarkedUpDocument) {
		m_strMarkedUpDocument = strMarkedUpDocument;
	}
	
	public Ontology getOntology () {
		return m_Ontology;
	}
	public void setOntology(Ontology o) {
		m_Ontology = o;
		setOntologyName(o.getName());
	}
	
	public String getDocumentStatus() {
		if (isStringNullOrEmpty(m_strDocumentStatus))
			return getEmptyString();
		else
			return m_strDocumentStatus;		
	}
	public void setDocumentStatus(String strDocumentStatus) {
		m_strDocumentStatus = strDocumentStatus;
	}

	public int getDocumentStatusID() {
		return m_iDocumentStatusID;
	}
	public void setDocumentStatusID(int documentStatusID) {
		m_iDocumentStatusID = documentStatusID;
	}

	/*
	public byte[] getContent() {
		return m_bArrContent;
	}
	public void setDocumentResultContent(byte[] documentResultContent) {
		m_bArrContent = documentResultContent;
	}
	*/
	public long getDocumentID() {
		return m_lDocumentID;
	}
	public void setDocumentID(long documentID) {
		m_lDocumentID = documentID;
	}

	public DocumentSubjectResult[] getSubjectResults() {
		return m_arrSubjectResults;
	}
	public void setSubjectResults(DocumentSubjectResult[] arrSubjectResults) {
		m_arrSubjectResults = arrSubjectResults;
	}

	public String getSubjectResult(int iSubjectID) {
		
		for (int iSubjects = 0; iSubjects < m_arrSubjectResults.length; iSubjects++) {
			
			DocumentSubjectResult dsr = m_arrSubjectResults[iSubjects];
			Subject s = dsr.getSubject();
			
			//if (s.getSubjectID() == iSubjects) {
			if (s.getSubjectID() == iSubjectID) {
				return dsr.getResult();
			}
		}
		
		return "";
	}

	public DocumentSubjectResult getResult(int iSubjectID) {
		
		for (int iSubjects = 0; iSubjects < m_arrSubjectResults.length; iSubjects++) {
			
			DocumentSubjectResult dsr = m_arrSubjectResults[iSubjects];
			Subject s = dsr.getSubject();
			
			if (s.getSubjectID() == iSubjectID) {
				return dsr;
			}
		}
		
		return null;
	}
	
	
	// get empty String
	public static String getEmptyString() {
		return new String("");
	}
	
	// check if String is null or empty
	public static boolean isStringNullOrEmpty(String value) {
		if (value == null)
			return true;
		else if (value.equals(getEmptyString()))
			return true;
		else
			return false;
	}

	/*
	public String getContentString() {
		
		// Can't do this? What gives? 
		// return new String(m_bArrContent);
		// Produces: The constructor String(byte[], String) is undefined

		String strRet = new String("");
		//TODO: Fix this inefficiency.
		for (int i = 0; i < m_bArrContent.length; i++) {
			strRet += (char)m_bArrContent[i];
		}
		
		return strRet;
		
	}
	*/
}
