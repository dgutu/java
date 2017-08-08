package com.searchincite.client.listeners;

import com.google.gwt.user.client.EventListener;
import com.searchincite.client.entity.ChangeEvent;
import com.searchincite.client.entity.Document;

public interface DocumentChangeListener extends EventListener {

	public void onDocumentChange(Document d, ChangeEvent event);
	
}
