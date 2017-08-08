package com.gda.newsi.rest;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gda.newsi.domain.Client;
import com.gda.newsi.domain.ClientProperty;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/v1/clientproperty")
public class ClientPropertyController {

	@ApiOperation(value = "add a new client property")
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ResponseEntity<ClientProperty> addClientProperty(@RequestBody ClientProperty clientProperty) {
		return null;
	}

	@ApiOperation(value = "update an existing client property")
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public ResponseEntity<ClientProperty> updateClientProperty(@RequestBody ClientProperty clientProperty) {
		return null;
	}

	@ApiOperation(value = "delete an existing client property")
	@RequestMapping(value = "/delete/{name}", method = RequestMethod.DELETE)
	public void deleteClientProperty(@PathVariable String name) {
	}

	@ApiOperation(value = "get a client property")
	@RequestMapping(value = "/list/{name}", method = RequestMethod.GET)
	public ResponseEntity<ClientProperty> getClientProperty(@PathVariable String name) {
		return null;
	}

	@ApiOperation(value = "get all clients properties")
	@RequestMapping(value = "/list/all", method = RequestMethod.GET)
	public List<Client> getAllClientsProperties() {
		return null;
	}

}
