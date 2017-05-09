package spring.example.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import spring.example.domain.Organization;

@RepositoryRestResource
public interface OrganizationRepository extends CrudRepository<Organization, Integer>{

}
