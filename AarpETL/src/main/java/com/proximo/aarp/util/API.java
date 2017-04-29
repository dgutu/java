package com.proximo.aarp.util;

public class API {
	private Long id;
	private String url;
	private String contentType;
	
	public API() {}
	
	public API(Long id, String url, String contentType) {
		this.id = id;
		this.url = url;
		this.contentType = contentType;
	}	
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
}
