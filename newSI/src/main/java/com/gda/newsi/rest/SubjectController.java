package com.gda.newsi.rest;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gda.newsi.domain.Subject;

import io.swagger.annotations.ApiOperation;

@Controller
@RequestMapping(value = "/v1/subject")
public class SubjectController {

	@ApiOperation(value = "add a new subject")
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ResponseEntity<Subject> addSubject(@RequestBody Subject subject) {
		return null;
	}

	@ApiOperation(value = "update an existing subject")
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public ResponseEntity<Subject> updateSubject(@RequestBody Subject subject) {
		return null;
	}

	@ApiOperation(value = "delete an existing subject")
	@RequestMapping(value = "/delete/{name}", method = RequestMethod.DELETE)
	public void deleteSubject(@PathVariable String name) {
	}

	@ApiOperation(value = "get a subject")
	@RequestMapping(value = "/list/{name}", method = RequestMethod.GET)
	public ResponseEntity<Subject> getSubject(@PathVariable String name) {
		return null;
	}

	@ApiOperation(value = "get all subjects")
	@RequestMapping(value = "/list/all", method = RequestMethod.GET)
	public List<Subject> getAllSubjects() {
		return null;
	}

}
