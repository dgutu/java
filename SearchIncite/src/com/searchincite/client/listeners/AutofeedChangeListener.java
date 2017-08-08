package com.searchincite.client.listeners;

import com.google.gwt.user.client.EventListener;
import com.searchincite.client.entity.ChangeEvent;
import com.searchincite.client.entity.Autofeed;

/**
 * 
 * @author ewayman
 *
 */

public interface AutofeedChangeListener extends EventListener {

	public void onAutofeedChange(Autofeed a, ChangeEvent event);
	
}
