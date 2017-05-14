package spring.example.services;

import spring.example.domain.Ontology;

public interface OntologyService {

	Iterable<Ontology> listAll();

	void saveOntology(Ontology ontology);

	void deleteOntology(Ontology ontology);

	void deleteOntologyById(Long ontologyID);
}
