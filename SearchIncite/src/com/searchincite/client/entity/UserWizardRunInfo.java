package com.searchincite.client.entity;

import java.util.Date;

import com.google.gwt.user.client.rpc.IsSerializable;

public class UserWizardRunInfo implements IsSerializable {

	private int m_iOrganizationID;
	private int m_iSelectedOntologyID;
	private String m_strEmailText;
	private Date m_dtRunDateTime;
	private int m_iRunByUserID;
	private String m_strEmailAddress;
	private String m_strOrganizationName;
	private String m_strUserName;
	
	public UserWizardRunInfo(
			int iOrganizationID,
			int iSelectedOntologyID, 
			String strEmailText,
			Date dtRunDateTime,
			int iRunByUserID) {
		
		m_iOrganizationID = iOrganizationID;
		m_iSelectedOntologyID = iSelectedOntologyID;
		m_strEmailText = strEmailText;
		m_dtRunDateTime = dtRunDateTime;
		m_iRunByUserID = iRunByUserID;
	}
	
	public UserWizardRunInfo() {
		
	}
	
	public int getOrganizationID() {
		return m_iOrganizationID;		
	}
	public void setOrganizationID(int iOrganizationID) {
		m_iOrganizationID = iOrganizationID;		
	}
	public int getSelectedOntologyID() {
		return m_iSelectedOntologyID;		
	}
	public void setOntologyID(int iSelectedOntologyID) {
		m_iSelectedOntologyID = iSelectedOntologyID;		
	}
	public String getEmailText() {
		return m_strEmailText;
	}
	public void setEmailText(String strEmailText) {
		m_strEmailText = strEmailText;
	}
	public String getEmailAddress() {
		return m_strEmailAddress;
	}
	public void setEmailAddress(String strEmailAddress) {
		m_strEmailAddress = strEmailAddress;
	}
	public String getOrganizationName() {
		return m_strOrganizationName;
	}
	public void setOrganizationName(String strOrganizationName) {
		m_strOrganizationName = strOrganizationName;
	}
	public Date getRunDateTime() {
		return m_dtRunDateTime;
	}
	public int getRunByUserID() {
		return m_iRunByUserID;
	}
	public void setRunDateTime(Date dtRunDateTime) {
		m_dtRunDateTime = dtRunDateTime;
	}
	public void setRunByUserID(int iRunByUserID) {
		m_iRunByUserID = iRunByUserID;
	}
	public String getUserName() {
		return m_strUserName;
	}
	public void setUserName(String strUserName) {
		m_strUserName = strUserName;
	}
}
