package spring.example.services;

import spring.example.domain.Organization;

public interface OrganizationService {
	Iterable<Organization> listAllProducts();
	
	void saveOrganization(Organization organization);
}
