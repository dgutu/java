package com.searchincite.client.entity;

import java.util.Date;

import com.google.gwt.user.client.rpc.IsSerializable;

public class Phrase implements IsSerializable {
	
	private int m_iPhraseID;
	private int m_iSubjectID;
	private String m_strName;
	private String m_strColor;
	private double m_dWeight;
	private Date m_dtCreated;
	private int m_iCreatedByUserID;
	private Date m_dtLastModified;
	private int m_iLastModifiedByUserID;
	
	public int getPhraseID() {
		return m_iPhraseID;
	}
	public void setPhraseID(int iPhraseID) {
		m_iPhraseID = iPhraseID;
	}

	public int getSubjectID() {
		return m_iSubjectID;
	}
	public void setSubjectID(int iSubjectID) {
		m_iSubjectID = iSubjectID;
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
	
}
