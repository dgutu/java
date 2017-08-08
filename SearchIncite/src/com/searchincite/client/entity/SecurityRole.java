package com.searchincite.client.entity;

import java.util.Date;

import com.google.gwt.user.client.rpc.IsSerializable;

public class SecurityRole implements IsSerializable {

	private int m_iRoleID;
	private String m_strRoleName;
	Date m_dtCreated;
	int m_iCreatedByUserID;
	Date m_dtLastModified;
	int m_iLastModifiedByUserID;

	public SecurityRole() {		
	}
	
	public void setRoleID(int iRoleID) {
		m_iRoleID = iRoleID;
	}
	public int getRoleID() {
		return m_iRoleID;		
	}
	public void setRoleName(String strName) {
		m_strRoleName = strName;
	}
	public String getRoleName() {
		return m_strRoleName;		
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

}
