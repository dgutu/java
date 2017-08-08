package com.searchincite.client.widgets;

import com.google.gwt.user.client.ui.CheckBox;
import com.searchincite.client.entity.SecurityRole;

public class SecurityRoleCheckBox extends CheckBox {

	SecurityRole m_SecurityRole;
	
	public SecurityRoleCheckBox(SecurityRole sr) {
		m_SecurityRole = sr;
		setText(m_SecurityRole.getRoleName());
	}
	
	public SecurityRole getSecurityRole() {
		return m_SecurityRole;
	}
	
	public void setSecurityRole(SecurityRole sr) {
		m_SecurityRole = sr;
	}
	
}
