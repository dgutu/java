package com.searchincite.client.listeners;

import com.google.gwt.user.client.EventListener;
import com.searchincite.client.entity.ChangeEvent;
import com.searchincite.client.entity.DocumentSource;

public interface DocumentSourceChangeListener extends EventListener {

	public void onDocumentSourceChange(DocumentSource s, ChangeEvent event);
	
}

