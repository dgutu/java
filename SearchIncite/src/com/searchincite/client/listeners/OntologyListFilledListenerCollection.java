package com.searchincite.client.listeners;

import java.util.Iterator;
import java.util.Vector;

public class OntologyListFilledListenerCollection extends Vector {

	private static final long serialVersionUID = 1L;

	public void fireOntologyListFilled() {
		
		for (Iterator it = iterator(); it.hasNext();) {
			OntologyListFilledListener listener = (OntologyListFilledListener) it.next();
			listener.onOntologyListFilled();
		}
	}
}
