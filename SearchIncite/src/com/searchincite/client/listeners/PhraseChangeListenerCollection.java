package com.searchincite.client.listeners;

import java.util.Iterator;
import java.util.Vector;

import com.searchincite.client.entity.ChangeEvent;
import com.searchincite.client.entity.Phrase;

public class PhraseChangeListenerCollection extends Vector {

	private static final long serialVersionUID = 1L;

	public void firePhraseChanged(Phrase c, ChangeEvent event) {
		
		for (Iterator it = iterator(); it.hasNext();) {
			PhraseChangeListener listener = (PhraseChangeListener) it.next();
			listener.onPhraseChange(c, event);
		}
	}
}
