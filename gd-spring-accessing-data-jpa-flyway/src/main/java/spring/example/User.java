package spring.example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private long id;

	@Column(name = "name", length = 250, unique = true, nullable = false)
	private String name;

	@Column(name = "org_id", nullable = false)
	private long orgID;

	public User() {
	}

	public User(String name, long orgID) {
		this.name = name;
		this.orgID = orgID;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getOrgID() {
		return orgID;
	}

	public void setOrgID(long orgID) {
		this.orgID = orgID;
	}

	@Override
	public String toString() {
		return String.format("user[user_id=%d, name='%s', org_id='%d']", id, name, orgID);
	}
}
