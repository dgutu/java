package com.searchincite.client.listeners;

import java.util.Iterator;
import java.util.Vector;

public class OntologySelectionListenerCollection extends Vector {

	private static final long serialVersionUID = 1L;

	public void fireOntologySelected(int iOntologyID) {
		
		for (Iterator it = iterator(); it.hasNext();) {
			OntologySelectionListener listener = (OntologySelectionListener) it.next();
			listener.onOntologySelected(iOntologyID);
		}
	}
}
