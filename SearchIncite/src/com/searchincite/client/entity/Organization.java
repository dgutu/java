package com.searchincite.client.entity;

import java.util.Date;

import com.google.gwt.user.client.rpc.IsSerializable;

public class Organization implements IsSerializable {

	public static final long FIELD_ID = 2;
	public static final long FIELD_NAME = 4;
	public static final long FIELD_ADDRESS_LINE1 = 8;
	public static final long FIELD_ADDRESS_LINE2 = 16;
	public static final long FIELD_CITY = 32;
	public static final long FIELD_STATE = 64;
	public static final long FIELD_POSTAL_CODE = 128;
	public static final long FIELD_DATE_MODIFIED = 256;
	public static final long FIELD_MODIFIED_BY_USER = 512;
	public static final long FIELD_DATE_CREATED = 1024;
	public static final long FIELD_CREATED_BY_USER = 2048;
	public static final long FIELD_GUID = 4096;
	public static final long FIELD_ALL_FIELDS = FIELD_ID | FIELD_NAME | FIELD_ADDRESS_LINE1 | FIELD_ADDRESS_LINE2 |
								FIELD_CITY | FIELD_STATE | FIELD_POSTAL_CODE | FIELD_DATE_MODIFIED | FIELD_MODIFIED_BY_USER |
								FIELD_DATE_CREATED | FIELD_CREATED_BY_USER | FIELD_GUID;

	private int m_iOrganizationID;
	private String m_strOrganizationName;
	private String m_strAddressLine1;
	private String m_strAddressLine2;
	private String m_strCity;
	private String m_strState;
	private String m_strPostalCode;
	private Date m_dtCreated;
	private int m_iCreatedByUserID;
	private Date m_dtLastModified;
	private int m_iLastModifiedByUserID;
	private String m_strGuid;

	public int getOrganizationID() {
		return m_iOrganizationID;
	} 
	public void setOrganizationID(int iOrganizationID) {
		m_iOrganizationID = iOrganizationID;
	}
	public String getOrganizationName() {
		return m_strOrganizationName;
	}
	public void setOrganizationName(String strOrganizationName) {
		m_strOrganizationName = strOrganizationName;
	}

	public String getAddressLine1() {
		return m_strAddressLine1;
	}
	public void setAddressLine1(String strAddressLine1) {
		m_strAddressLine1 = strAddressLine1;
	}

	public String getAddressLine2() {
		return m_strAddressLine2;
	}
	public void setAddressLine2(String strAddressLine2) {
		m_strAddressLine2 = strAddressLine2;
	}

	public String getCity() {
		return m_strCity;
	}
	public void setCity(String strCity) {
		m_strCity = strCity;
	}

	public String getState() {
		return m_strState;
	}
	public void setState(String strState) {
		m_strState = strState;
	}

	public String getPostalCode() {
		return m_strPostalCode;
	}
	public void setPostalCode(String strPostalCode) {
		m_strPostalCode = strPostalCode;
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
	public String getGuid() {
		return m_strGuid;
	}
	public void setGuid(String strGuid) {
		m_strGuid = strGuid;
	}

}
