package com.searchincite.client.entity;

import java.util.Date;

import com.google.gwt.user.client.rpc.IsSerializable;

public class Subject implements IsSerializable {
	
	public static final long FIELD_ID = 2;
	public static final long FIELD_NAME = 4;
	public static final long FIELD_COLOR = 8;
	public static final long FIELD_WEIGHT = 16;
	public static final long FIELD_DATE_CREATED = 32;
	public static final long FIELD_CREATED_BY_USER = 64;
	public static final long FIELD_MODIFIED_BY_USER = 128;
	public static final long FIELD_DATE_MODIFIED = 256;
	public static final long FIELD_PHRASES = 512;
	public static final long FIELD_ALL_FIELDS = FIELD_ID | FIELD_NAME | FIELD_COLOR | FIELD_WEIGHT |
								FIELD_DATE_CREATED | FIELD_CREATED_BY_USER | FIELD_MODIFIED_BY_USER |
								FIELD_DATE_MODIFIED | FIELD_PHRASES;

	private int m_iSubjectID;
	private String m_strName;
	private String m_strColor;
	private double m_dWeight;
	private Date m_dtCreated;
	private int m_iCreatedByUserID;
	private Date m_dtLastModified;
	private int m_iLastModifiedByUserID;
	private Phrase[] m_arrPhrases;
	private int m_iOntologyID;
	private boolean m_bActive;

	public boolean getActive() {
		return m_bActive;
	}
	public void setActive(boolean active) {
		m_bActive = active;
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
	public int getSubjectID() {
		return m_iSubjectID;
	}
	public void setSubjectID(int subjectID) {
		m_iSubjectID = subjectID;
	}
	public String getColor() {
		return m_strColor;
	}
	public void setColor(String color) {
		m_strColor = color;
	}
	public String getName() {
		return m_strName;
	}
	public void setName(String name) {
		m_strName = name;
	}
	public double getWeight() {
		return m_dWeight;
	}
	public void setWeight(double weight) {
		m_dWeight = weight;
	}
	public Phrase[] getPhrases() {
		return m_arrPhrases;		
	}
	public void setPhrases(Phrase[] arrPhrases) {
		m_arrPhrases = arrPhrases; 		
	}
	public int getOntologyID() {
		return m_iOntologyID;
	}
	public void setOntologyID(int iOntologyID) {
		m_iOntologyID = iOntologyID;
	}

	
}
