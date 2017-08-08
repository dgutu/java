package com.searchincite.client.widgets.entitylabels;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.searchincite.client.entity.Subject;


public class SubjectLabel extends Composite {

	Subject m_Subject;
	
	public SubjectLabel(Subject s) {
		m_Subject = s;
		Label l = new Label(s.getName());
		initWidget(l);
	}
	
	public Subject getSubject() {
		return m_Subject;
	}

	public void setSubject(Subject s) {
		m_Subject = s;
	}
}
