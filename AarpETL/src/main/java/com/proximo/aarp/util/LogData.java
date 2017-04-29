package com.proximo.aarp.util;

public class LogData {
	
	private Long etlProcessTypeID;
	private Long max_etlProcessID;
	private java.util.Date etlProcessTypeParamDt;
	private java.util.Date etlProcessTypeCreatedDate;
	private Boolean stillRun;
	private String since;
	private java.util.Date sinceDt;
	
	public LogData() {}

	public Long getEtlProcessTypeID() {
		return etlProcessTypeID;
	}

	public void setEtlProcessTypeID(Long etlProcessTypeID) {
		this.etlProcessTypeID = etlProcessTypeID;
	}

	public Long getMaxEtlProcessID() {
		return max_etlProcessID;
	}

	public void setMaxEtlProcessID(Long etlProcessID) {
		this.max_etlProcessID = etlProcessID;
	}

	public java.util.Date getEtlProcessTypeParamDt() {
		return etlProcessTypeParamDt;
	}

	public void setEtlProcessTypeParamDt(java.util.Date etlProcessTypeParamDt) {
		this.etlProcessTypeParamDt = etlProcessTypeParamDt;
	}

	public java.util.Date getEtlProcessTypeCreatedDate() {
		return etlProcessTypeCreatedDate;
	}

	public void setEtlProcessTypeCreatedDate(java.util.Date etlProcessTypeCreatedDate) {
		this.etlProcessTypeCreatedDate = etlProcessTypeCreatedDate;
	}

	public Boolean getStillRun() {
		return stillRun;
	}

	public void setStillRun(Boolean stillRun) {
		this.stillRun = stillRun;
	}

	public String getSince() {
		return since;
	}

	public void setSince(String since) {
		this.since = since;
	}

	public java.util.Date getSinceDt() {
		return sinceDt;
	}

	public void setSinceDt(java.util.Date sinceDt) {
		this.sinceDt = sinceDt;
	}
}
