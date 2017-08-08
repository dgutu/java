package com.searchincite.client.listeners;

import java.util.Iterator;
import java.util.Vector;

import com.searchincite.client.entity.DocumentSource;

public class DocumentSourceSelectionListenerCollection extends Vector {

	private static final long serialVersionUID = 1L;

	public void fireDocumentSourceSelected(DocumentSource s) {
		
		for (Iterator it = iterator(); it.hasNext();) {
			DocumentSourceSelectionListener listener = (DocumentSourceSelectionListener) it.next();
			listener.onDocumentSourceSelected(s);
		}
	}
}
