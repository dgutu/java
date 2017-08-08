package com.searchincite.client.listeners;

import java.util.Iterator;
import java.util.Vector;

public class MenuItemClickListenerCollection extends Vector {

	private static final long serialVersionUID = 1L;

	public void fireMenuItemClicked(int iMenuItemID) {
		
		for (Iterator it = iterator(); it.hasNext();) {
			MenuItemClickListener listener = (MenuItemClickListener) it.next();
			listener.onMenuItemClicked(iMenuItemID);
		}
	}
}
