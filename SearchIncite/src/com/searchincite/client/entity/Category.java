package com.searchincite.client.entity;

import java.util.Date;

import com.google.gwt.user.client.rpc.IsSerializable;


public class Category implements IsSerializable {

	public static final long FIELD_ID = 2;
	public static final long FIELD_NAME = 4;
	public static final long FIELD_ORGANIZATION_ID = 8;
	public static final long FIELD_DATE_CREATED = 16;
	public static final long FIELD_CREATED_BY_USER = 32;
	public static final long FIELD_MODIFIED_BY_USER = 64;
	public static final long FIELD_DATE_MODIFIED = 128;
	public static final long FIELD_ONTOLOGIES = 256;
	public static final long FIELD_CATEGORIES = 512;
	public static final long FIELD_PARENT_ID = 1024;
	public static final long FIELD_ALL_FIELDS = FIELD_ID | FIELD_NAME | FIELD_ORGANIZATION_ID |
								FIELD_DATE_CREATED | FIELD_CREATED_BY_USER | FIELD_MODIFIED_BY_USER |
								FIELD_DATE_MODIFIED | FIELD_ONTOLOGIES | FIELD_CATEGORIES | FIELD_PARENT_ID;

	private int m_iOrganizationID;
	private int m_iCategoryID;
	private String m_strName;
	private Date m_dtCreated;
	private int m_iCreatedByUserID;
	private Date m_dtLastModified;
	private int m_iLastModifiedByUserID;
	private Ontology[] m_arrOntologies;
	private Category[] m_arrCategories; // A Category may contain one or more other categories.
	private int m_iParentID;
	
	public int getOrganizationID() {
		return m_iOrganizationID;
	} 
	public void setOrganizationID(int iOrganizationID) {
		m_iOrganizationID = iOrganizationID;
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
	public int getCategoryID() {
		return m_iCategoryID;
	}
	public void setCategoryID(int categoryID) {
		m_iCategoryID = categoryID;
	}
	public String getName() {
		return m_strName;
	}
	public void setName(String name) {
		m_strName = name;
	}
	public Ontology[] getOntologies() {
		return m_arrOntologies;		
	}
	public void setOntologies(Ontology[] arrOntologies) {
		m_arrOntologies = arrOntologies; 		
	}
	public Category[] getCategories() {
		return m_arrCategories;		
	}
	public void setCategories(Category[] arrCategories) {
		m_arrCategories = arrCategories; 		
	}
	public int getParentID() {
		return m_iParentID;
	} 
	public void setParentID(int iParentID) {
		m_iParentID = iParentID;
	}

}