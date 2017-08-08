package com.searchincite.client.widgets;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
//import com.google.gwt.user.client.ui.FlexTable.FlexCellFormatter;
//import com.google.gwt.user.client.ui.HTMLTable.CellFormatter;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.TabPanel;

public class DocumentManagerPanel
  extends Composite
{
  private FlexTable m_pnlOuter = null;
  private DocumentSourcePanel m_pnlSources = new DocumentSourcePanel();
  private DocumentPanel m_pnlDocuments = new DocumentPanel();
  private AutofeedPanel m_pnlAutofeed = new AutofeedPanel();
  
  public DocumentManagerPanel()
  {
    init();
  }
  
  private void init()
  {
    this.m_pnlOuter = new FlexTable();
    this.m_pnlOuter.setSize("100%", "100%");
    this.m_pnlOuter.setCellPadding(0);
    this.m_pnlOuter.setCellSpacing(0);
    
    this.m_pnlOuter.setBorderWidth(1);
    
    this.m_pnlOuter.setWidget(0, 0, this.m_pnlSources);
    
    this.m_pnlOuter.getFlexCellFormatter().setWidth(0, 1, "100%");
    initWidget(this.m_pnlOuter);
    
    TabPanel tabPanel = new TabPanel();
    this.m_pnlOuter.setWidget(0, 1, tabPanel);
    this.m_pnlOuter.getCellFormatter().setVerticalAlignment(0, 1, HasVerticalAlignment.ALIGN_TOP);
    
    tabPanel.setWidth("100%");
    this.m_pnlDocuments.setSize("100%", "100%");
    tabPanel.add(this.m_pnlDocuments, "Documents");
    tabPanel.add(this.m_pnlAutofeed, "Autofeed");
    
    this.m_pnlSources.addDocumentSourceSelectionListener(this.m_pnlDocuments);
    this.m_pnlSources.addDocumentSourceSelectionListener(this.m_pnlAutofeed);
    tabPanel.selectTab(0);
  }
}