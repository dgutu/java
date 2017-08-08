package com.searchincite.client.listeners;

import com.google.gwt.user.client.EventListener;
import com.searchincite.client.entity.ChangeEvent;
import com.searchincite.client.entity.Ontology;

public interface OntologyChangeListener extends EventListener {

	public void onOntologyChange(Ontology o, ChangeEvent event);
	
}

