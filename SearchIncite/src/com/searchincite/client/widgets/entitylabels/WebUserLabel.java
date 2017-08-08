package com.searchincite.client.widgets.entitylabels;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.searchincite.client.entity.WebUser;


public class WebUserLabel extends Composite {

	WebUser m_User;
	
	public WebUserLabel(WebUser u) {
		m_User = u;
		Label l = new Label(u.getFullName());
		initWidget(l);
	}
	
	public WebUser getUser() {
		return m_User;
	}

	public void setUser(WebUser u) {
		m_User = u;
	}
}
