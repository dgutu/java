package com.searchincite.client.widgets;

import com.google.gwt.user.client.ui.CheckBox;
import com.searchincite.client.entity.Subject;

public class SubjectCheckBox extends CheckBox {

	Subject m_Subject;
	
	public SubjectCheckBox(Subject s) {
		m_Subject = s;
	}
	
	public Subject getSubject() {
		return m_Subject;
	}
	
	public void setSubject(Subject s) {
		m_Subject = s;
	}
}
