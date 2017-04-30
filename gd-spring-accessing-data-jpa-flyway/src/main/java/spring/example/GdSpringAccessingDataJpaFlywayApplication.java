package spring.example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// main class
@SpringBootApplication
public class GdSpringAccessingDataJpaFlywayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GdSpringAccessingDataJpaFlywayApplication.class, args);
	}
}

// model
@Entity
@Table(name = "users")
class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private long id;

	@Column(name = "name", length = 250)
	private String name;

	@Column(name = "org_id", nullable = false)
	private long orgID;

	public Users() {
	}

	public Users(String name, long orgID) {
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
}
