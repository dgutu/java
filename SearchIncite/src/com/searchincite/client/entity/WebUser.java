package com.searchincite.client.entity;

import com.google.gwt.user.client.rpc.IsSerializable;

public class WebUser  implements IsSerializable  {

	//TODO: Consider sharing or subclassing the User class in the api.

	public static final long FIELD_ID = 2;
	public static final long FIELD_ORGANIZATION_ID = 4;
	public static final long FIELD_USERNAME = 8;
	public static final long FIELD_PASSWORD = 16;
	public static final long FIELD_DATE_CREATED = 32;
	public static final long FIELD_CREATED_BY_USER = 64;
	public static final long FIELD_MODIFIED_BY_USER = 128;
	public static final long FIELD_DATE_MODIFIED = 256;
	public static final long FIELD_FIRST_NAME = 512;
	public static final long FIELD_MIDDLE_NAME = 1024;
	public static final long FIELD_LAST_NAME = 2048;
	public static final long FIELD_TELEPHONE = 4096;
	public static final long FIELD_EMAIL_ADDRESS = 8192;
	public static final long FIELD_CHANGE_PASSWORD_ON_LOGIN = 16384;
	public static final long FIELD_EXPIRATION_DATE = 32768;
	public static final long FIELD_ORGANIZATION_NAME = 65536;
	public static final long FIELD_GUID = 131072;
	public static final long FIELD_ALL_FIELDS = FIELD_ID | FIELD_ORGANIZATION_ID | FIELD_USERNAME |
												FIELD_PASSWORD | FIELD_DATE_CREATED | FIELD_CREATED_BY_USER |
												FIELD_MODIFIED_BY_USER | FIELD_DATE_MODIFIED |
												FIELD_FIRST_NAME | FIELD_MIDDLE_NAME | FIELD_LAST_NAME |
												FIELD_TELEPHONE | FIELD_EMAIL_ADDRESS | 
												FIELD_CHANGE_PASSWORD_ON_LOGIN | FIELD_EXPIRATION_DATE | FIELD_GUID;

	/*
"change_password_on_login"
"active"
"expiration_date"

	 * */
	
	private int m_iUserID;
	private int m_iOrganizationID;
	private String m_strFirstName;
	private String m_strMiddleName;
	private String m_strLastName;
	private String m_strUsername;
	private String m_strStatus;
	private String m_strTelephone;
	private String m_strEMailAddress;
	private boolean m_bActive;
	private java.util.Date m_dtExpiration;
	private boolean m_bChangePasswordOnLogin;
	private String m_strPassword;
	private java.util.Date m_dtCreated;
	private int m_iCreatedByUserID;
	private java.util.Date m_dtLastModified;
	private int m_iLastModifiedByUserID;
	private String m_strOrganizationName;
	private int[] m_intArrSecurityRoleIDs = new int[0];
	private String m_strGuid;
	
	public int getOrganizationID() {
		return m_iOrganizationID;
	} 
	public void setOrganizationID(int iOrganizationID) {
		m_iOrganizationID = iOrganizationID;
	}

	public int getUserID() {
		return m_iUserID;
	} 
	public void setUserID(int iUserID) {
		m_iUserID = iUserID;
	}

	public WebUser(){}
	
	public WebUser(String strFirstName, String strLastName) {
		m_strFirstName = strFirstName;
		m_strLastName = strLastName;
	}
	
	public int[] getSecurityRoleIDs() {
		return m_intArrSecurityRoleIDs;
	}
	public void setSecurityRoleIDs(int[] intArrSecurityRoleIDs) {
		m_intArrSecurityRoleIDs = intArrSecurityRoleIDs; 
	}
	
	public void setName(String strFirstName, String strLastName) {
		m_strFirstName = strFirstName;
		m_strLastName = strLastName;
	}
	
	public String getFirstName() {
		return m_strFirstName;		
	}

	public void setFirstName(String strFirstName) {
		m_strFirstName = strFirstName;		
	}

	public String getLastName() {
		return m_strLastName;		
	}
	public void setLastName(String strLastName) {
		m_strLastName = strLastName;		
	}

	public String getMiddleName() {
		return m_strMiddleName;		
	}
	public void setMiddleName(String strMiddleName) {
		m_strMiddleName = strMiddleName;		
	}

	public String getFullName() {
		return getFirstName() + " " + getLastName();
	}

	public String getUsername() {
		return m_strUsername;		
	}
	public void setUsername(String strUsername) {
		m_strUsername = strUsername;		
	}

	public String getStatus() {
		return m_strStatus;		
	}
	
	public void setStatus(String strStatus) {
		m_strStatus = strStatus;		
	}
	public boolean getActive() {
		return m_bActive;
	}
	public void setActive(boolean active) {
		m_bActive = active;
	}
	public java.util.Date getExpiration() {
		return m_dtExpiration;
	}
	public void setExpiration(java.util.Date expiration) {
		m_dtExpiration = expiration;
	}
	public String getEMailAddress() {
		return m_strEMailAddress;
	}
	public void setEMailAddress(String strEMailAddress) {
		m_strEMailAddress = strEMailAddress;
	}
	public String getTelephone() {
		return m_strTelephone;
	}
	public void setTelephone(String telephone) {
		m_strTelephone = telephone;
	}
	public boolean getChangePasswordOnLogin() {
		return m_bChangePasswordOnLogin;
	}
	public void setChangePasswordOnLogin(boolean changePasswordOnLogin) {
		m_bChangePasswordOnLogin = changePasswordOnLogin;
	}
	public String getPassword() {
		return m_strPassword;
	}
	public void setPassword(String strPassword) {
		m_strPassword = strPassword;
	}
	public java.util.Date getDateCreated() {
		return m_dtCreated;
	}
	public void setDateCreated(java.util.Date created) {
		m_dtCreated = created;
	}
	public java.util.Date getLastModifiedDate() {
		return m_dtLastModified;
	}
	public void setLastModifiedDate(java.util.Date lastModified) {
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

	public String getOrganizationName() {
		return m_strOrganizationName;		
	}

	public void setOrganizationName(String strName) {
		m_strOrganizationName = strName;		
	}

	public String getGuid() {
		return m_strGuid;		
	}

	public void setGuid(String strGuid) {
		m_strGuid= strGuid;		
	}

}
