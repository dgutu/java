package spring.example.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(name = "organization", indexes = {
		@Index(name = "organization_indx1", columnList = "name", unique = true) })

public class Organization extends Creation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "org_id")
	private long orgId;

	@Column(unique = true, nullable = false)
	private String name;

	@Column(name = "address", length = 250)
	private String address;

	@Column(name = "address2", length = 250)
	private String address2;

	@Column(name = "city", length = 100)
	private String city;

	@Column(name = "state", length = 50)
	private String state;

	@Column(name = "postalCode", length = 50)
	private String postalCode;

	@Column(name = "guid", length = 250)
	private String guid;

	public Organization() {
	}

	public Organization(String name, String address, String address2, String city,
			String state, String postalCode, Date creationDate, long createdBy,
			Date lastModifiedDate, long lastModifiedBy, String guid) {

		this.name = name;
		this.address = address;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
		this.creationDate = creationDate;
		this.createdBy = createdBy;
		this.lastModifiedDate = lastModifiedDate;
		this.lastModifiedBy = lastModifiedBy;
		this.guid = guid;
	}

	public long getOrgId() {
		return orgId;
	}

	public void setOrgId(long org_id) {
		this.orgId = org_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

}
