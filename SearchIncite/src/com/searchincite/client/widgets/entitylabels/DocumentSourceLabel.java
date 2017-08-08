package com.searchincite.client.widgets.entitylabels;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.searchincite.client.entity.DocumentSource;

public class DocumentSourceLabel extends Composite {

	DocumentSource m_DocumentSource;
	
	public DocumentSourceLabel(DocumentSource s) {
		m_DocumentSource = s;
		Label l = new Label(s.getDocumentSource());
		initWidget(l);
	}
	
	public DocumentSource getDocumentSource() {
		return m_DocumentSource;
	}

	public void setDocumentSource(DocumentSource s) {
		m_DocumentSource = s;
	}
}
