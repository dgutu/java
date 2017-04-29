package com.proximo.aarp.json.collections;

import java.util.Date;

import com.proximo.aarp.util.MyUtils;

public class LinkedinWorkHistoryPosition {
	
	public final static String POSITIONS_TOTALKEY = "_total";
	public final static String POSITIONS_VALUESKEY = "values";
	public final static String POSITIONS_VALUES_COMPANYKEY = "company";
	public final static String POSITIONS_VALUES_COMPANY_IDKEY = "id";
	public final static String POSITIONS_VALUES_COMPANY_NAMEKEY = "name";
	public final static String POSITIONS_VALUES_IDKEY = "id";
	public final static String POSITIONS_VALUES_ISCURRENTKEY = "isCurrent";
	public final static String POSITIONS_VALUES_STARTDATEKEY = "startDate";
	public final static String POSITIONS_VALUES_STARTDATE_MMKEY = "month";
	public final static String POSITIONS_VALUES_STARTDATE_YYKEY = "year";
	public final static String POSITIONS_VALUES_ENDDATEKEY = "endDate";
	public final static String POSITIONS_VALUES_ENDDATE_MMKEY = "month";
	public final static String POSITIONS_VALUES_ENDDATE_YYKEY = "year";
	public final static String POSITIONS_VALUES_SUMMARYKEY = "summary";
	public final static String POSITIONS_VALUES_TITLEKEY = "title";
	public final static String POSITIONS_VALUES_CREATEDKEY = "created";
	
	public final static String IDKEY = "_id";
	public final static String _TYPEKEY = "_type";
	
	private Integer companyId;
	private String companyName;
	private Long idField;
	private Boolean isCurrent;
	private Integer endDateMM;
	private Integer endDateYY;
	private Integer startDateMM;
	private Integer startDateYY;
	private String summary;
	private String title;
	private Double created;
	
	// companyId
	public Integer getCompanyId() {
		return companyId;
	}
	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}
	
	// companyName
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	// idField
	public Long getIdField() {
		return idField;
	}
	public void setIdField(Long idField) {
		this.idField = idField;
	}
	
	// isCurrent
	public Boolean isCurrent() {
		return isCurrent;
	}
	public void setCurrent(Boolean isCurrent) {
		this.isCurrent = isCurrent;
	}
	
	// endDateMM
	public Integer getEndDateMM() {
		return endDateMM;
	}
	public void setEndDateMM(Integer endDateMM) {
		this.endDateMM = endDateMM;
	}
	
	// endDateYY
	public Integer getEndDateYY() {
		return endDateYY;
	}
	public void setEndDateYY(Integer endDateYY) {
		this.endDateYY = endDateYY;
	}
	
	// startDateMM
	public Integer getStartDateMM() {
		return startDateMM;
	}
	public void setStartDateMM(Integer startDateMM) {
		this.startDateMM = startDateMM;
	}
	
	// startDateYY
	public Integer getStartDateYY() {
		return startDateYY;
	}
	public void setStartDateYY(Integer startDateYY) {
		this.startDateYY = startDateYY;
	}
	
	// summary
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	
	// title
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Double getCreated() {
		return created;
	}
	public void setCreated(Double created) {
		this.created = created;
	}
	
	public Date getCreatedFormat() {
		if (this.getCreated() == null)
			return null;
		else
			return MyUtils.convertUnixTimeStampToDateExample(this.getCreated());
	}		
}
