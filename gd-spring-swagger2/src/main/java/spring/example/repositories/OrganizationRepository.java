package spring.example.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import spring.example.domain.Organization;

@RepositoryRestResource
public interface OrganizationRepository extends CrudRepository<Organization, Long> {

	@Query("SELECT o FROM Organization o WHERE LOWER(o.name) LIKE LOWER(:name)")
	Iterable<Organization> getOrganizationByName(@Param("name") String name);
}
