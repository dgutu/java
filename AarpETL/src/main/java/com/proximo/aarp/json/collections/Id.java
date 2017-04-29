package com.proximo.aarp.json.collections;

public class Id {
	private String oid;
	public final static String OIDKEY = "$oid";
	
	public Id() {}
	public String getOid() {
		return this.oid;
	}
	
	public void setOid(String val) {
		this.oid = val;
	}
}
