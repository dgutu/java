package com.searchincite.client.listeners;

import java.util.Iterator;
import java.util.Vector;

import com.searchincite.client.entity.ChangeEvent;
import com.searchincite.client.entity.Ontology;

public class OntologyChangeListenerCollection extends Vector {

	private static final long serialVersionUID = 1L;

	public void fireOntologyChanged(Ontology o, ChangeEvent event) {
		
		for (Iterator it = iterator(); it.hasNext();) {
			OntologyChangeListener listener = (OntologyChangeListener) it.next();
			listener.onOntologyChange(o, event);
		}
	}
}
