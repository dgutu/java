package com.searchincite.client.entity;

import com.google.gwt.user.client.rpc.IsSerializable;

public class OntologyCSV implements IsSerializable{
	private String org_id = "";	
	private String category_id = "";
	private String category_name = "";
	private String ontology_id = "";
	private String ontology_name = "";
	private String ontology_description = "";
	private String subject_id = "";
	private String subject_name = "";
	private String subject_color = "";
	private String subject_weight = "";
	private String phrase_id = "";
	private String phrase_name = "";
	private String phrase_color = "";
	private String phrase_weight = "";
	
	public OntologyCSV() {		
	}
	
	public String getOrgID() {
		return org_id;
	}
	
	public void setOrgID(String org_id) {
		this.org_id = org_id;
	}
	
	public String getCategoryID() {
		return category_id;
	}
	
	public void setCategoryID(String category_id) {
		this.category_id = category_id;
	}	
	
	public String getCategoryName() {
		return category_name;
	}
	
	public void setCategoryName(String category_name) {
		this.category_name = category_name;
	}		
	
	public String getOntologyID() {
		return ontology_id;
	}
	
	public void setOntologyID(String ontology_id) {
		this.ontology_id = ontology_id;
	}	
	
	public String getOntologyName() {
		return ontology_name;
	}
	
	public void setOntologyName(String ontology_name) {
		this.ontology_name = ontology_name;
	}
	
	public String getOntologyDescription() {
		return ontology_description;
	}
	
	public void setOntologyDescription(String ontology_description) {
		this.ontology_description = ontology_description;
	}		
	
	public String getSubjectID() {
		return subject_id;
	}
	
	public void setSubjectID(String subject_id) {
		this.subject_id = subject_id;
	}
	
	public String getSubjectName() {
		return subject_name;
	}
	
	public void setSubjectName(String subject_name) {
		this.subject_name = subject_name;
	}
	
	public String getSubjectColor() {
		return subject_color;
	}
	
	public void setSubjectColor(String subject_color) {
		this.subject_color = subject_color;
	}
	
	public String getSubjectWeight() {
		return subject_weight;
	}
	
	public void setSubjectWeight(String subject_weight) {
		this.subject_weight = subject_weight;
	}
	
	public String getPhraseID() {
		return phrase_id;
	}
	
	public void setPhraseID(String phrase_id) {
		this.phrase_id = phrase_id;
	}
	
	public String getPhraseName() {
		return phrase_name;
	}
	
	public void setPhraseName(String phrase_name) {
		this.phrase_name = phrase_name;
	}
	
	public String getPhraseColor() {
		return phrase_color;
	}
	
	public void setPhraseColor(String phrase_color) {
		this.phrase_color = phrase_color;
	}	
	
	public String getPhraseWeight() {
		return phrase_weight;
	}
	
	public void setPhraseWeight(String phrase_weight) {
		this.phrase_weight = phrase_weight;
	}
	
	
}
