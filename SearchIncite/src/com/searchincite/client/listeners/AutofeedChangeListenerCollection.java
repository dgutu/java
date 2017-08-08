package com.searchincite.client.listeners;

import java.util.Iterator;
import java.util.Vector;

import com.searchincite.client.entity.ChangeEvent;
import com.searchincite.client.entity.Autofeed;

/**
 * 
 * @author ewayman
 *
 */

public class AutofeedChangeListenerCollection extends Vector {
	
	private static final long serialVersionUID = 1L;

	public void fireAutofeedChanged(Autofeed a, ChangeEvent event) {
		
		for (Iterator it = iterator(); it.hasNext();) {
			AutofeedChangeListener listener = (AutofeedChangeListener) it.next();
			listener.onAutofeedChange(a, event);
		}
	}
}
