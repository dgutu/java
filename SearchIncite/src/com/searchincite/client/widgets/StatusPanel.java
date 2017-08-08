package com.searchincite.client.widgets;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.Label;


public class StatusPanel extends Composite {

	Grid m_Grid = new Grid(1, 1);
	Label m_Label = new Label();
	
	public StatusPanel() {
		m_Label.setText("");
	    m_Grid.setWidget(0, 0, m_Label);
		initWidget(m_Grid);
	}	
	
	public void setText(String str) {
		m_Label.setText(str);
	}
}
