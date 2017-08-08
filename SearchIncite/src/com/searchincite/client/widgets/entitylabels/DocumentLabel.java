package com.searchincite.client.widgets.entitylabels;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.searchincite.client.entity.DocumentWithResult;

public class DocumentLabel extends Composite {

	DocumentWithResult m_Document;
	
	public DocumentLabel(DocumentWithResult d) {
		m_Document = d;
		Label l = new Label(d.getFilename());
		initWidget(l);
	}
		
	public DocumentWithResult getDocument() {
		return m_Document;
	}

	public void setDocument(DocumentWithResult d) {
		m_Document = d;
	}
}
