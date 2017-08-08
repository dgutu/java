package com.searchincite.client.listeners;

import com.google.gwt.user.client.EventListener;
import com.searchincite.client.entity.Category;
import com.searchincite.client.entity.ChangeEvent;

public interface CategoryChangeListener extends EventListener {

	public void onCategoryChange(Category c, ChangeEvent event);
	
}

