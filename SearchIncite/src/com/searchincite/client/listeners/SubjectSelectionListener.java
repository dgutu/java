package com.searchincite.client.listeners;

import com.google.gwt.user.client.EventListener;
import com.searchincite.client.entity.Subject;

public interface SubjectSelectionListener extends EventListener {

	public void onSubjectSelected(Subject s);
}

