package com.searchincite.client.entity;

import com.google.gwt.user.client.rpc.IsSerializable;


public class RpcError implements IsSerializable {

	private long m_lErrorCode;
	private String m_strErrorMessage;
	private String m_strStackTrace;
	
	public long getErrorCode() {
		return m_lErrorCode;
	} 
	public void setErrorCode(long lErrorCode) {
		m_lErrorCode = lErrorCode;
	} 
	
	public String getErrorMessage() {
		return m_strErrorMessage;
	}
	public void setErrorMessage(String strErrorMessage) {
		m_strErrorMessage = strErrorMessage;
	}

	public String getStackTrace() {
		return m_strStackTrace;
	}
	public void setStackTrace(String strStackTrace) {
		m_strStackTrace = strStackTrace;
	}

}