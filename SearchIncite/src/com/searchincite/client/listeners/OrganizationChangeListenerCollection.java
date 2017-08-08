package com.searchincite.client.listeners;

import java.util.Iterator;
import java.util.Vector;

import com.searchincite.client.entity.ChangeEvent;
import com.searchincite.client.entity.Organization;

public class OrganizationChangeListenerCollection extends Vector {

	private static final long serialVersionUID = 1L;

	public void fireOrganizationChanged(Organization org, ChangeEvent event) {
		
		for (Iterator it = iterator(); it.hasNext();) {
			OrganizationChangeListener listener = (OrganizationChangeListener) it.next();
			listener.onOrganizationChange(org, event);
		}
	}
}
