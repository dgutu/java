package com.searchincite.client.widgets;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;

public class OrganizationManagerPanel extends Composite {

	private FlexTable m_pnlOuter = null;
	
	public OrganizationManagerPanel() {
		init();
	}

	private void init() {

		m_pnlOuter = new FlexTable();
		m_pnlOuter.setSize("100%", "100%");
		m_pnlOuter.setCellPadding(0);
		m_pnlOuter.setCellSpacing(0);
		m_pnlOuter.setBorderWidth(1);
		
		m_pnlOuter.setWidget(0, 0, new OrganizationPanel());
		//m_pnlOuter.setWidget(0, 1, new HTML("Selected User detail here"));
		//m_pnlOuter.setWidget(0, 0, m_pnlSources);
		//m_pnlOuter.setWidget(0, 1, m_pnlDocuments);

		//m_pnlOuter.getFlexCellFormatter().setWidth(0, 1, "100%");
		//m_pnlSources.addDocumentSourceSelectionListener(m_pnlDocuments);
		
		initWidget(m_pnlOuter);
	}
	
}
