package com.searchincite.client.entity;

import java.util.Date;

import com.google.gwt.user.client.rpc.IsSerializable;
import com.searchincite.client.entity.Autofeed;

public class DocumentSource implements IsSerializable {

	public static final long FIELD_ID = 2;
	public static final long FIELD_DOCUMENT_SOURCE = 4;
	public static final long FIELD_ORGANIZATION_ID = 8;
	public static final long FIELD_ONTOLOGIES = 16;
	public static final long FIELD_DATE_CREATED = 32;
	public static final long FIELD_CREATED_BY_USER = 64;
	public static final long FIELD_MODIFIED_BY_USER = 128;
	public static final long FIELD_DATE_MODIFIED = 256;
	public static final long FIELD_DOCUMENTS = 512;
	public static final long FIELD_AUTOFEEDS = 1024;
	public static final long FIELD_ALL_FIELDS = FIELD_ID | FIELD_DOCUMENT_SOURCE | FIELD_ORGANIZATION_ID | FIELD_ONTOLOGIES |
								FIELD_DATE_CREATED | FIELD_CREATED_BY_USER | FIELD_MODIFIED_BY_USER |
								FIELD_DATE_MODIFIED | FIELD_DOCUMENTS | FIELD_AUTOFEEDS;

	private int m_iOrganizationID;
	private int m_iDocumentSourceID;
	private String m_strDocumentSource;
	private Date m_dtCreated;
	private int m_iCreatedByUserID;
	private Date m_dtLastModified;
	private int m_iLastModifiedByUserID;

	private Ontology[] m_arrOntologies;
	private DocumentWithResult[] m_arrDocuments;
	private Autofeed[] m_arrAutofeeds;

	public Ontology[] getOntologies() {
		return m_arrOntologies;
	}
	public void setOntologies(Ontology[] ontologies) {
		m_arrOntologies = ontologies;
	}
	public int getOrganizationID() {
		return m_iOrganizationID;
	} 
	public void setOrganizationID(int iOrganizationID) {
		m_iOrganizationID = iOrganizationID;
	}
	public int getDocumentSourceID() {
		return m_iDocumentSourceID;
	}
	public void setDocumentSourceID(int documentSourceID) {
		m_iDocumentSourceID = documentSourceID;
	}
	public String getDocumentSource() {
		return m_strDocumentSource;
	}
	public void setDocumentSource(String documentSource) {
		m_strDocumentSource = documentSource;
	}
	public Date getDateCreated() {
		return m_dtCreated;
	}
	public void setDateCreated(Date created) {
		m_dtCreated = created;
	}
	public Date getLastModifiedDate() {
		return m_dtLastModified;
	}
	public void setLastModifiedDate(Date lastModified) {
		m_dtLastModified = lastModified;
	}
	public int getCreatedByUserID() {
		return m_iCreatedByUserID;
	}
	public void setCreatedByUserID(int createdByUserID) {
		m_iCreatedByUserID = createdByUserID;
	}
	public int getLastModifiedByUserID() {
		return m_iLastModifiedByUserID;
	}
	public void setLastModifiedByUserID(int lastModifiedByUserID) {
		m_iLastModifiedByUserID = lastModifiedByUserID;
	}
	public DocumentWithResult[] getDocuments() {
		return m_arrDocuments;
	}
	public void setDocuments(DocumentWithResult[] documents) {
		m_arrDocuments = documents;
	}
	public Autofeed[] getAutofeeds() {
		return m_arrAutofeeds;
	}
	public void setAutofeeds(Autofeed[] autofeeds) {
		m_arrAutofeeds = autofeeds;
	}
//	public AutofeedResult[] getAutofeeds() {
//        return m_arrAutofeeds;
//    }
//    public void setAutofeeds(AutofeedResult[] documents) {
//        m_arrAutofeeds = documents;
//    }
//	public AutofeedResult[] getAutofeeds() {
//	    return m_arrAutofeeds;
//        return AutofeedWrapper.getAutofeedsForSource(m_iOrganizationID);
//	}
}