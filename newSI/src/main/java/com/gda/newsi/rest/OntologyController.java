package com.gda.newsi.rest;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gda.newsi.domain.Ontology;

import io.swagger.annotations.ApiOperation;

@Controller
@RequestMapping(value = "/v1/ontology")
public class OntologyController {

	@ApiOperation(value = "add a new ontology")
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ResponseEntity<Ontology> addOntology(@RequestBody Ontology ontology) {
		return null;
	}

	@ApiOperation(value = "update an existing ontology")
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public ResponseEntity<Ontology> updateOntology(@RequestBody Ontology ontology) {
		return null;
	}

	@ApiOperation(value = "delete an existing ontology")
	@RequestMapping(value = "/delete/{name}", method = RequestMethod.DELETE)
	public void deleteOntology(@PathVariable String name) {
	}

	@ApiOperation(value = "get an ontology")
	@RequestMapping(value = "/list/{name}", method = RequestMethod.GET)
	public ResponseEntity<Ontology> getOntology(@PathVariable String name) {
		return null;
	}

	@ApiOperation(value = "get all ontologies")
	@RequestMapping(value = "/list/all", method = RequestMethod.GET)
	public List<Ontology> getAllOntologies() {
		return null;
	}

}
