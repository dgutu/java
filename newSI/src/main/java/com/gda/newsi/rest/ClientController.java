package com.gda.newsi.rest;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gda.newsi.domain.Client;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/v1/client")
public class ClientController {

	@ApiOperation(value = "add a new client")
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ResponseEntity<Client> addClient(@RequestBody Client client) {
		return null;
	}

	@ApiOperation(value = "update an existing client")
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public ResponseEntity<Client> updateClient(@RequestBody Client client) {
		return null;
	}

	@ApiOperation(value = "delete an existing client")
	@RequestMapping(value = "/delete/{name}", method = RequestMethod.DELETE)
	public void deleteClient(@PathVariable String name) {
	}

	@ApiOperation(value = "get a client")
	@RequestMapping(value = "/list/{name}", method = RequestMethod.GET)
	public ResponseEntity<Client> getClient(@PathVariable String name) {
		return null;
	}

	@ApiOperation(value = "get all clients")
	@RequestMapping(value = "/list/all", method = RequestMethod.GET)
	public List<Client> getAllClients() {
		return null;
	}

}
