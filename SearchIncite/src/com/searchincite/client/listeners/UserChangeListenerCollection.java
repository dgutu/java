package com.searchincite.client.listeners;

import java.util.Iterator;
import java.util.Vector;

import com.searchincite.client.entity.ChangeEvent;
import com.searchincite.client.entity.WebUser;

public class UserChangeListenerCollection extends Vector {

	private static final long serialVersionUID = 1L;

	public void fireUserChanged(WebUser u, ChangeEvent event) {
		
		for (Iterator it = iterator(); it.hasNext();) {
			UserChangeListener listener = (UserChangeListener) it.next();
			listener.onUserChange(u, event);
		}
	}
}
