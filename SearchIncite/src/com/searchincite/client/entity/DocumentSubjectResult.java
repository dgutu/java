package com.searchincite.client.entity;

import com.google.gwt.user.client.rpc.IsSerializable;

public class DocumentSubjectResult implements IsSerializable {

	private Subject m_Subject;
	private String m_strResult;
	
	public Subject getSubject() {
		return m_Subject;
	}
	public void setSubject(Subject s) {
		m_Subject = s;
	}
	public String getResult() {
		return m_strResult;
	}
	public void setResult(String strResult) {
		m_strResult = strResult;
	}
	
}
