package com.searchincite.client.listeners;

import java.util.Iterator;
import java.util.Vector;

import com.searchincite.client.entity.Category;
import com.searchincite.client.entity.ChangeEvent;

public class CategoryChangeListenerCollection extends Vector {

	private static final long serialVersionUID = 1L;

	public void fireCategoryChanged(Category c, ChangeEvent event) {
		
		for (Iterator it = iterator(); it.hasNext();) {
			CategoryChangeListener listener = (CategoryChangeListener) it.next();
			listener.onCategoryChange(c, event);
		}
	}
}
