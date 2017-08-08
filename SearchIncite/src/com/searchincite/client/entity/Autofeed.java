package com.searchincite.client.entity;

import com.google.gwt.user.client.rpc.IsSerializable;

import java.util.Date;

/**
 * 
 * @author Eric Wayman
 * 
 */

public class Autofeed implements IsSerializable {

	private Integer websiteId;

	private String url;

	private String description;

	private Integer ontologyId;

	// private Integer status;
	private Date lastCheckedDate;

	private Boolean active;

	private Boolean recursive;
	
	public Integer getWebsiteId() {
		return websiteId;
	}

	public void setWebsiteId(Integer websiteId) {
		this.websiteId = websiteId;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getOntologyId() {
		return ontologyId;
	}

	public void setOntologyId(Integer ontologyId) {
		this.ontologyId = ontologyId;
	}

	// public Integer getStatus() {
	// return status;
	// }
	//	
	// public void setStatus(Integer status) {
	// this.status = status;
	// }

	public Date getLastCheckedDate() {
		return lastCheckedDate;
	}

	public void setLastCheckedDate(Date lastCheckedDate) {
		this.lastCheckedDate = lastCheckedDate;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}
	
	public Boolean getRecursive() {
		return recursive;
	}

	public void setRecursive(Boolean recursive) {
		this.recursive = recursive;
	}

}