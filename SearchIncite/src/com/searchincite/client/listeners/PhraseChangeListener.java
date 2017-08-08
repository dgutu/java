package com.searchincite.client.listeners;

import com.google.gwt.user.client.EventListener;
import com.searchincite.client.entity.ChangeEvent;
import com.searchincite.client.entity.Phrase;

public interface PhraseChangeListener extends EventListener {

	public void onPhraseChange(Phrase c, ChangeEvent event);
	
}

