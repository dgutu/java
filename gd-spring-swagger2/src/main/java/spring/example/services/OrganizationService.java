package spring.example.services;

import spring.example.domain.Organization;

public interface OrganizationService {
	Iterable<Organization> listAll();

	Organization getOrganizationById(Long organizationID);

	Iterable<Organization> getOrganizationByName(String name);

	void saveOrganization(Organization organization);

	void updateOrganization(Organization organization);

	void updateOrganization(Long organizationID, String name, String address,
			String address2, String city, String state, String postalCode, String guid);

	void deleteOrganizationById(Long organizationID);
}
