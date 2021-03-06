package com.gda.newsi.rest;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gda.newsi.domain.Document;

import io.swagger.annotations.ApiOperation;

@Controller
@RequestMapping(value = "/v1/document")
public class DocumentController {

	@ApiOperation(value = "add a new document")
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ResponseEntity<Document> addDocument(@RequestBody Document document) {
		return null;
	}

	@ApiOperation(value = "update an existing document")
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public ResponseEntity<Document> updateDocument(@RequestBody Document document) {
		return null;
	}

	@ApiOperation(value = "delete an existing document")
	@RequestMapping(value = "/delete/{name}", method = RequestMethod.DELETE)
	public void deleteDocument(@PathVariable String name) {
	}

	@ApiOperation(value = "get a document")
	@RequestMapping(value = "/list/{name}", method = RequestMethod.GET)
	public ResponseEntity<Document> getDocument(@PathVariable String name) {
		return null;
	}

	@ApiOperation(value = "get all decouments")
	@RequestMapping(value = "/list/all", method = RequestMethod.GET)
	public List<Document> getAllDocuments() {
		return null;
	}

}
