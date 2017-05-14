package spring.example.services;

import javax.ws.rs.NotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.example.domain.Organization;
import spring.example.repositories.OrganizationRepository;

@Service
public class OrganizationServiceImpl implements OrganizationService {

	private OrganizationRepository organizationRepository;

	@Autowired
	public void setOrganizationRepository(OrganizationRepository organizationRepository) {
		this.organizationRepository = organizationRepository;
	}

	@Override
	public Iterable<Organization> listAll() {
		return organizationRepository.findAll();
	}

	@Override
	public void saveOrganization(Organization organization) {
		/*
		 * Iterable<Organization> existingOrganization = getOrganizationByName(
		 * organization.getName());
		 * 
		 * if (existingOrganization == null) organizationRepository.save(organization);
		 * else throw new IllegalArgumentException(String
		 * .format("organization %s already exists", organization.getName()));
		 */

		organizationRepository.save(organization);
	}

	@Override
	public void deleteOrganizationById(Long organizationID) {
		Organization existingOrganization = getOrganizationById(organizationID);
		organizationRepository.delete(existingOrganization);
	}

	@Override
	public void updateOrganization(Organization organization) {
		Organization existingOrganization = getOrganizationById(
				organization.getOrganizationID());

		saveOrganization(existingOrganization);
	}

	@Override
	public void updateOrganization(Long organizationID, String name, String address,
			String address2, String city, String state, String postalCode, String guid) {

		Organization existingOrganization = getOrganizationById(organizationID);

		if (existingOrganization.getName().equals(name)) {
			throw new IllegalArgumentException(
					"organization name is the same as existing organization name");
		}

		existingOrganization.setName(name);
		existingOrganization.setAddress(address);
		existingOrganization.setAddress2(address2);
		existingOrganization.setCity(city);
		existingOrganization.setState(state);
		existingOrganization.setPostalCode(postalCode);
		existingOrganization.setGuid(guid);

		organizationRepository.save(existingOrganization);

	}

	@Override
	public Organization getOrganizationById(Long organizationID) {
		Organization existingOrganization = organizationRepository
				.findOne(organizationID);

		if (existingOrganization == null) {
			throw new NotFoundException(
					String.format("organization %s not found", organizationID));
		}

		return existingOrganization;
	}

	@Override
	public Iterable<Organization> getOrganizationByName(String name) {
		return organizationRepository.getOrganizationByName(name);
	}
}
