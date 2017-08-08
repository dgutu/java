package com.searchincite.client.listeners;

import com.google.gwt.user.client.EventListener;
import com.searchincite.client.entity.ChangeEvent;
import com.searchincite.client.entity.WebUser;

public interface UserChangeListener extends EventListener {

	public void onUserChange(WebUser u, ChangeEvent event);
	
}

