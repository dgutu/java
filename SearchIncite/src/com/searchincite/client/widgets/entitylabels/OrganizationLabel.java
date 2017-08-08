package com.searchincite.client.widgets.entitylabels;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.searchincite.client.entity.Organization;


public class OrganizationLabel extends Composite {

	Organization m_Organization;
	
	public OrganizationLabel(Organization org) {
		m_Organization = org;
		Label l = new Label(org.getOrganizationName());
		initWidget(l);
	}
	
	public Organization getOrganization() {
		return m_Organization;
	}

	public void setOrganization(Organization org) {
		m_Organization = org;
	}
}
