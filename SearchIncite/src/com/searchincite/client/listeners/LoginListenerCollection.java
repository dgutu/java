package com.searchincite.client.listeners;

import java.util.Iterator;
import java.util.Vector;

public class LoginListenerCollection extends Vector {

	private static final long serialVersionUID = 1L;

	public void fireLoginAttempt(Boolean bLoggedIn) {
		
		for (Iterator it = iterator(); it.hasNext();) {
			LoginListener listener = (LoginListener) it.next();
			listener.onLoginAttempt(bLoggedIn);
		}
	}
}
