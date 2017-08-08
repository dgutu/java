package com.searchincite.client.listeners;

import com.google.gwt.user.client.EventListener;

public interface LoginListener extends EventListener {

	public void onLoginAttempt(Boolean bLoggedIn);
}

