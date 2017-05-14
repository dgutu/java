package spring.example.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "ontology", uniqueConstraints = @UniqueConstraint(columnNames = { "org_id",
		"name", "category_id" }), indexes = {
				@Index(name = "ontology_indx1", columnList = "org_id"),
				@Index(name = "ontology_indx2", columnList = "category_id"),
				@Index(name = "ontology_indx3", columnList = "name") })
public class Ontology extends Creation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ontology_id")
	@JsonIgnore
	private long ontologyID;

	@Column(name = "org_id")
	private long orgID;

	@Column(length = 250, nullable = false)
	private String name;

	@Column(length = 250)
	private String description;

	@Column(name = "category_id", nullable = false)
	private long categoryID;

	public Ontology() {
	}

	public Ontology(long ontologyID, long orgID, String name, String description,
			Date creationDate, long createdBy, Date lastModifiedDate, long lastModifiedBy,
			long categoryID) {
		super();
		this.ontologyID = ontologyID;
		this.orgID = orgID;
		this.name = name;
		this.description = description;
	}

	public long getOntologyID() {
		return ontologyID;
	}

	public void setOntologyID(long ontologyID) {
		this.ontologyID = ontologyID;
	}

	public long getOrgID() {
		return orgID;
	}

	public void setOrgID(long orgID) {
		this.orgID = orgID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(long categoryID) {
		this.categoryID = categoryID;
	}

}
