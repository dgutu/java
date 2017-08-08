package com.searchincite.api.entity;



public class User {
	private int m_iOrganizationID;
	private int m_iUserID;
	private String m_strFirstName;
	private String m_strLastName;
	
	// SI admin role 1
	private int m_isSIAdmin = 0;
	
	// org admin role 2
	private int m_isOrganizationAdmin = 0;
	
	// ontology user role 3
	private int m_isOntologyUser = 0;
	
	// ontology builder role 4 
	private int m_isOntologyBuilder = 0;
	
	// demo user role 5
	private int m_isDemoUser = 0; 
	
	// nobody role 6
	private int m_isNobody = 0;

	public int getOrganizationID() {
		return m_iOrganizationID;
	} 

	public void setOrganizationID(int iOrganizationID) {
		m_iOrganizationID = iOrganizationID;
	}

	public void setName(String strFirstName, String strLastName) {
		m_strFirstName = strFirstName;
		m_strLastName = strLastName;
	}	

	public String getFirstName() {
		return m_strFirstName;		
	}	

	public String getLastName() {
		return m_strLastName;
	}
	
	public int getUserID() {
		return m_iUserID;
	} 

	public void setUserID(int iUserID) {
		m_iUserID = iUserID;
	}
	
	// 
	public void setSIAdmin(int value) {
		this.m_isSIAdmin = value;
	}
	
	public void setOrganizationAdmin(int value) {
		this.m_isOrganizationAdmin = value;
	}
	
	public void setOntologyUser(int value) {
		this.m_isOntologyUser = value;
	}
	
	public void setOntologyBuilder(int value) {
		this.m_isOntologyBuilder = value;
	}
	
	public void setDemoUser(int value) {
		this.m_isDemoUser = value;
	}
	
	public void setNobody(int value) {
		this.m_isNobody = value;
	}	
	
	// check
	public boolean isSIAdmin() {
		return (m_isSIAdmin==1);
	}
	
	public boolean isOrganizationAdmin() {
		return (m_isOrganizationAdmin==1);
	}
	
	public boolean isOntologyBuilder() {
		return (m_isOntologyBuilder==1);
	}
	
	public boolean isOntologyUser() {
		return (m_isOntologyUser==1);
	}	
	
	public boolean isDemoUser() {
		return (m_isDemoUser==1);
	}
	
	public boolean isNobody() {
		return (m_isNobody==1);
	}
}

