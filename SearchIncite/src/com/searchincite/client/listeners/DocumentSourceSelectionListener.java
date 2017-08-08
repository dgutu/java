package com.searchincite.client.listeners;

import com.google.gwt.user.client.EventListener;
import com.searchincite.client.entity.DocumentSource;

public interface DocumentSourceSelectionListener extends EventListener {

	public void onDocumentSourceSelected(DocumentSource s);
}

