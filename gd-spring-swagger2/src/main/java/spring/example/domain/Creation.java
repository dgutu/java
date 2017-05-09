package spring.example.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

@MappedSuperclass
public class Creation {

	@Column(name = "creation_date", nullable = false)
	protected Date creationDate;
	
	@Column(name = "created_by")
	protected long createdBy;
	
	@Column(name = "last_modified_date", nullable = false)
	protected Date lastModifiedDate;
	
	@Column(name = "last_modified_by")
	protected long lastModifiedBy;

	public Creation() {
	}

	public Creation(long createdBy, long lastModifiedBy) {
		this.createdBy = createdBy;
		this.lastModifiedBy = lastModifiedBy;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(long createdBy) {
		this.createdBy = createdBy;
	}

	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public long getLastModifiedBy() {
		return lastModifiedBy;
	}

	public void setLastModifiedBy(long lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	@PrePersist
	void preInsert() {
		if (creationDate == null)
			creationDate = new Date();

		if (lastModifiedDate == null)
			lastModifiedDate = new Date();
	}

	@PreUpdate
	void preUpdate() {
		lastModifiedDate = new Date();
	}

}
