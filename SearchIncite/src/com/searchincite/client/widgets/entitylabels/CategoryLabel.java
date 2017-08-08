package com.searchincite.client.widgets.entitylabels;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.searchincite.client.entity.Category;

// we do chicken right!
public class CategoryLabel extends Composite {

	Category m_Category;
	
	public CategoryLabel(Category c) {
		m_Category = c;
		Label l = new Label(c.getName());
		initWidget(l);
	}
	
	public Category getCategory() {
		return m_Category;
	}

	public void setCategory(Category c) {
		m_Category = c;
	}
}
