package com.searchincite.client.entity;

import java.util.Date;

import com.google.gwt.user.client.rpc.IsSerializable;


public class Ontology implements IsSerializable {

	public static final long FIELD_ID = 2;
	public static final long FIELD_NAME = 4;
	public static final long FIELD_DESCRIPTION = 8;
	public static final long FIELD_DATE_CREATED = 16;
	public static final long FIELD_CREATED_BY_USER = 32;
	public static final long FIELD_MODIFIED_BY_USER = 64;
	public static final long FIELD_DATE_MODIFIED = 128;
	public static final long FIELD_SUBJECTS = 256;
	public static final long FIELD_PHRASES = 512;
	public static final long FIELD_CATEGORY_ID = 1024;
	public static final long FIELD_ALL_FIELDS = FIELD_ID | FIELD_NAME | FIELD_DESCRIPTION |
								FIELD_DATE_CREATED | FIELD_CREATED_BY_USER | FIELD_MODIFIED_BY_USER |
								FIELD_DATE_MODIFIED | FIELD_SUBJECTS | FIELD_PHRASES | FIELD_CATEGORY_ID;

	int m_iOrganizationID;
	int m_iOntologyID;
	String m_strName;
	String m_strDescription;
	Date m_dtCreated;
	int m_iCreatedByUserID;
	Date m_dtLastModified;
	int m_iLastModifiedByUserID;
	Subject[] m_arrSubjects;
	int m_iCategoryID;
	
	public int getOrganizationID() {
		return m_iOrganizationID;
	} 
	public void setOrganizationID(int iOrganizationID) {
		m_iOrganizationID = iOrganizationID;
	}

	public int getCategoryID() {
		return m_iCategoryID;
	} 
	public void setCategoryID(int iCategoryID) {
		m_iCategoryID = iCategoryID;
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
	public int getOntologyID() {
		return m_iOntologyID;
	}
	public void setOntologyID(int ontologyID) {
		m_iOntologyID = ontologyID;
	}
	public String getDescription() {
		return m_strDescription;
	}
	public void setDescription(String description) {
		m_strDescription = description;
	}
	public String getName() {
		return m_strName;
	}
	public void setName(String name) {
		m_strName = name;
	}
	public Subject[] getSubjects() {
		return m_arrSubjects;		
	}
	public void setSubjects(Subject[] arrSubjects) {
		m_arrSubjects = arrSubjects; 		
	}


}