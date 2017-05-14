package spring.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import spring.example.domain.Organization;
import spring.example.services.OrganizationService;

@RestController
@RequestMapping("/isi/organization")
public class OrganizationController {

	private OrganizationService organizationService;

	@Autowired
	public void setOrganizationService(OrganizationService organizationService) {
		this.organizationService = organizationService;
	}

	@ApiOperation(value = "List all organizations", response = Iterable.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Successfully retrieved list"),
			@ApiResponse(code = 401, message = "You are not authorized to view the resource"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found") })
	@RequestMapping(value = "/list", method = RequestMethod.GET, produces = "application/json")
	public Iterable<Organization> list(Model model) {
		Iterable<Organization> list = organizationService.listAll();
		return list;
	}

	@ApiOperation(value = "List an organization")
	@RequestMapping(value = "/list/organizationID/{organizationID}", method = RequestMethod.GET, produces = "application/json")
	public Organization list(@PathVariable(required = true) Long organizationID) {
		return organizationService.getOrganizationById(organizationID);
	}

	@ApiOperation(value = "List an organization by name")
	@RequestMapping(value = "/list/name/{name}", method = RequestMethod.GET, produces = "application/json")
	public Iterable<Organization> list(@RequestParam(required = true) String name) {
		Iterable<Organization> list = organizationService.getOrganizationByName(name);
		return list;
	}

	@ApiOperation(value = "Add an organization")
	@RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<Organization> add(@RequestBody Organization organization) {
		organizationService.saveOrganization(organization);
		return new ResponseEntity<Organization>(HttpStatus.CREATED);
	}

	@ApiOperation(value = "Update an organization")
	@RequestMapping(value = "/update", method = RequestMethod.PUT, produces = "application/json")
	public ResponseEntity<Organization> update(
			@RequestParam(required = true) Long organizationID,
			@RequestBody Organization organization) {
		organizationService.updateOrganization(organization);
		return new ResponseEntity<Organization>(HttpStatus.OK);
	}

	@ApiOperation(value = "Delete an organization")
	@RequestMapping(value = "/delete/{organizationID}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable(required = true) Long organizationID) {
		organizationService.deleteOrganizationById(organizationID);

	}

}
