package com.searchincite.client.security;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface LoginServiceAsync {

	void login(String str1, String str2, AsyncCallback callback);
	void isAuthenticated(AsyncCallback callback);
	void getWebUser(AsyncCallback callback);
}
