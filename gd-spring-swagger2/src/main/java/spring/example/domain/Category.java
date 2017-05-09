package spring.example.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "category", uniqueConstraints = @UniqueConstraint(columnNames = { "org_id","name" }), 
	                      indexes = { @Index(name = "category_indx1", columnList = "org_id"),
				                      @Index(name = "category_indx2", columnList = "org_id,name") })

public class Category extends Creation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "category_id")
	private long id;

	@ManyToOne
	@JoinColumn(name = "org_id")
	private Organization organization;

	@Column(length = 250, nullable = false)
	private String name;

	public Category() {
	}

	public Category(Organization organization, String name, Date creationDate,
			long createdBy, Date lastModifiedDate, long lastModifiedBy) {

		this.organization = organization;
		this.creationDate = creationDate;
		this.createdBy = createdBy;
		this.lastModifiedDate = lastModifiedDate;
		this.lastModifiedBy = lastModifiedBy;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	@Override
	public String toString() {
		return String.format("category[category_id=%d, orgId='%d', name='%s']", id,
				organization.getOrgId(), name);
	}
}
