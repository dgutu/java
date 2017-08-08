package com.searchincite.client.listeners;

import java.util.Iterator;
import java.util.Vector;

import com.searchincite.client.entity.ChangeEvent;
import com.searchincite.client.entity.Subject;

public class SubjectChangeListenerCollection extends Vector {

	private static final long serialVersionUID = 1L;

	public void fireSubjectChanged(Subject c, ChangeEvent event) {
		
		for (Iterator it = iterator(); it.hasNext();) {
			SubjectChangeListener listener = (SubjectChangeListener) it.next();
			listener.onSubjectChange(c, event);
		}
	}
}
