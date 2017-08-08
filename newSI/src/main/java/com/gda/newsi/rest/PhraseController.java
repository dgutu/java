package com.gda.newsi.rest;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gda.newsi.domain.Phrase;

import io.swagger.annotations.ApiOperation;

@Controller
@RequestMapping(value = "/v1/phrase")
public class PhraseController {

	@ApiOperation(value = "add a new phrase")
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ResponseEntity<Phrase> addPhrase(@RequestBody Phrase phrase) {
		return null;
	}

	@ApiOperation(value = "update an existing phrase")
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public ResponseEntity<Phrase> updatePhrase(@RequestBody Phrase phrase) {
		return null;
	}

	@ApiOperation(value = "delete an existing phrase")
	@RequestMapping(value = "/delete/{name}", method = RequestMethod.DELETE)
	public void deletePhrase(@PathVariable String name) {
	}

	@ApiOperation(value = "get a phrase")
	@RequestMapping(value = "/list/{name}", method = RequestMethod.GET)
	public ResponseEntity<Phrase> getPhrase(@PathVariable String name) {
		return null;
	}

	@ApiOperation(value = "get all phrases")
	@RequestMapping(value = "/list/all", method = RequestMethod.GET)
	public List<Phrase> getAllPhrases() {
		return null;
	}

}
