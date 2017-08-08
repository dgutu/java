package com.searchincite.client.security;

import com.google.gwt.user.client.rpc.RemoteService;
import com.searchincite.client.entity.WebUser;

public interface LoginService extends RemoteService {
	
	Boolean login(String strUserName, String strPassword);
	Boolean isAuthenticated();
	WebUser getWebUser();
	
}
