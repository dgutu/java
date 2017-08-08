package com.searchincite.client.widgets.entitylabels;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.searchincite.client.entity.Phrase;


public class PhraseLabel extends Composite {

	Phrase m_Phrase;
	
	public PhraseLabel(Phrase s) {
		m_Phrase = s;
		Label l = new Label(s.getName());
		initWidget(l);
	}
	
	public Phrase getPhrase() {
		return m_Phrase;
	}

	public void setPhrase(Phrase s) {
		m_Phrase = s;
	}
}
