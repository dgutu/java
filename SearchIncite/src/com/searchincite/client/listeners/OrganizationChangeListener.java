package com.searchincite.client.listeners;

import com.google.gwt.user.client.EventListener;
import com.searchincite.client.entity.ChangeEvent;
import com.searchincite.client.entity.Organization;

public interface OrganizationChangeListener extends EventListener {

	public void onOrganizationChange(Organization org, ChangeEvent event);
	
}

