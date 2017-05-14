package spring.example.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import spring.example.domain.Ontology;

@RepositoryRestResource
public interface OntologyRepository extends CrudRepository<Ontology, Long> {

}
