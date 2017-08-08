package com.searchincite.client.listeners;

import java.util.Iterator;
import java.util.Vector;

import com.searchincite.client.entity.Subject;

public class SubjectSelectionListenerCollection extends Vector {

	private static final long serialVersionUID = 1L;

	public void fireSubjectSelected(Subject s) {
		
		for (Iterator it = iterator(); it.hasNext();) {
			SubjectSelectionListener listener = (SubjectSelectionListener) it.next();
			listener.onSubjectSelected(s);
		}
	}
}
