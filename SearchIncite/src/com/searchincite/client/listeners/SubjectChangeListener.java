package com.searchincite.client.listeners;

import com.google.gwt.user.client.EventListener;
import com.searchincite.client.entity.ChangeEvent;
import com.searchincite.client.entity.Subject;

public interface SubjectChangeListener extends EventListener {

	public void onSubjectChange(Subject s, ChangeEvent event);
	
}

