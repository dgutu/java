package spring.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import spring.example.domain.Ontology;
import spring.example.services.OntologyService;

@RestController
@RequestMapping("/isi/ontology")
public class OntologyController {

	private OntologyService ontologyService;

	@Autowired
	public void setOntologyService(OntologyService ontologyService) {
		this.ontologyService = ontologyService;
	}

	@ApiOperation(value = "List all ontologies", response = Iterable.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successfully retrieved list"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found") })
	@RequestMapping(value = "/list", method = RequestMethod.GET, produces = "application/json")
	public Iterable<Ontology> list(Model model) {
		Iterable<Ontology> list = ontologyService.listAll();
		return list;
	}

	@ApiOperation(value = "Add an organization")
	@RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<Ontology> add(@RequestBody Ontology ontology) {
		ontologyService.saveOntology(ontology);
		return new ResponseEntity<Ontology>(HttpStatus.OK);
	}

	@ApiOperation(value = "Update an organization")
	@RequestMapping(value = "/update", method = RequestMethod.PUT, produces = "application/json")
	public ResponseEntity<Ontology> update(@RequestBody Ontology ontology) {
		ontologyService.saveOntology(ontology);
		return new ResponseEntity<Ontology>(HttpStatus.OK);
	}

	@ApiOperation(value = "Delete an organization")
	@RequestMapping(value = "/delete", method = RequestMethod.DELETE, produces = "application/json")
	public ResponseEntity<Ontology> delete(@RequestBody Long ontologyID) {
		ontologyService.deleteOntologyById(ontologyID);
		return new ResponseEntity<Ontology>(HttpStatus.OK);
	}

}
