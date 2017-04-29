package com.proximo.aarp.json.collections;

import java.util.ArrayList;
import java.util.Date;

import com.proximo.aarp.util.MyUtils;

public class LRFile {
	
	public final static String IDKEY = "_id";
	public final static String _TYPEKEY = "_type";
	public final static String USER_IDKEY = "user_id";
	public final static String MIMEKEY = "mime";
	public final static String SIZEKEY = "size";
	public final static String NAMEKEY = "name";
	public final static String EXTENSIONKEY = "extension";
	public final static String CONTENTKEY = "content";
	public final static String CREATEDKEY = "created";
	
	private Id id;
	private ArrayList<String> _type;
	private String user_id;
	private String mime;
	private Integer size;
	private String name;
	private String extension;
	private String content;
	private Double created;
	
	public LRFile() {}
	
	public LRFile(Id id, ArrayList<String> _type, String user_id, String mime, Integer size, String name, String extension, String content, Double created) {
		this.id = id;
		this._type = _type;
		this.user_id = user_id;
		this.mime = mime;
		this.size = size;
		this.name = name;
		this.extension = extension;
		this.content = content;
		this.created = created;
	}
	
	// Id
	public Id getID() {
		return this.id;
	}
	
	public void setID(Id val) {
		this.id = val;
	}
	
	// _type
	public ArrayList<String> getType() {
		return this._type;
	}
	
	public void setType(ArrayList<String> val) {
		this._type = val;
	}
	
	// user_id
	public String getuser_id() {
		return this.user_id;
	}
	
	public void setuser_id(String val) {
		this.user_id = val;
	}		
	
	// mime
	public String getMime() {
		return this.mime;
	}
	
	public void setMime(String val) {
		this.mime = val;
	}	
	
	// mime
	public Integer getSize() {
		return this.size;
	}
	
	public void setSize(Integer val) {
		this.size = val;
	}	
	
	// name
	public String getName() {
		return this.name;
	}
	
	public void setName(String val) {
		this.name = val;
	}	
	
	// extension
	public String getExtension() {
		return this.extension;
	}
	
	public void setExtension(String val) {
		this.extension = val;
	}	
	
	// content
	public String getContent() {
		return this.content;
	}
	
	public void setContent(String val) {
		this.content = val;
	}
	
	// created
	public Double getCreated() {
		return this.created;
	}
	
	public void setCreated(Double val) {
		this.created = val;
	}
	
	public Date getCreatedFormat() {
		if (this.getCreated() == null)
			return null;
		else
			return MyUtils.convertUnixTimeStampToDateExample(this.getCreated());
	}		
}
