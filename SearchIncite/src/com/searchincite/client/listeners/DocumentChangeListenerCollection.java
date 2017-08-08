package com.searchincite.client.listeners;

import java.util.Iterator;
import java.util.Vector;

import com.searchincite.client.entity.ChangeEvent;
import com.searchincite.client.entity.Document;

public class DocumentChangeListenerCollection extends Vector {

	private static final long serialVersionUID = 1L;

	public void fireDocumentChanged(Document d, ChangeEvent event) {
		
		for (Iterator it = iterator(); it.hasNext();) {
			DocumentChangeListener listener = (DocumentChangeListener) it.next();
			listener.onDocumentChange(d, event);
		}
	}
}
