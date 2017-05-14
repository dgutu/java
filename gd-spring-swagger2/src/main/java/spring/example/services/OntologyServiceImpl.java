package spring.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.example.domain.Ontology;
import spring.example.repositories.OntologyRepository;

@Service
public class OntologyServiceImpl implements OntologyService {

	private OntologyRepository ontologyRepository;

	@Autowired
	public void setOntologyRepository(OntologyRepository ontologyRepository) {
		this.ontologyRepository = ontologyRepository;
	}

	@Override
	public Iterable<Ontology> listAll() {
		return ontologyRepository.findAll();
	}

	@Override
	public void saveOntology(Ontology ontology) {
		ontologyRepository.save(ontology);
	}

	@Override
	public void deleteOntology(Ontology ontology) {
		ontologyRepository.delete(ontology);
	}

	@Override
	public void deleteOntologyById(Long ontologyID) {
		ontologyRepository.delete(ontologyID);
	}

}
