package spring.example.services;

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
	public Iterable<Organization> listAllProducts() {
		return organizationRepository.findAll();
	}

	@Override
	public void saveOrganization(Organization organization) {
		organizationRepository.save(organization);
	}

}
