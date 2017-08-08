package com.searchincite.client.listeners;

import java.util.Iterator;
import java.util.Vector;

import com.searchincite.client.entity.ChangeEvent;
import com.searchincite.client.entity.DocumentSource;

public class DocumentSourceChangeListenerCollection extends Vector {

	private static final long serialVersionUID = 1L;

	public void fireDocumentSourceChanged(DocumentSource c, ChangeEvent event) {
		
		for (Iterator it = iterator(); it.hasNext();) {
			DocumentSourceChangeListener listener = (DocumentSourceChangeListener) it.next();
			listener.onDocumentSourceChange(c, event);
		}
	}
}
