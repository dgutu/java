package com.searchincite.client.widgets.documentsadvancedtable;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DockPanel;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HTMLTable;
import com.google.gwt.user.client.ui.HTMLTable.CellFormatter;
import com.google.gwt.user.client.ui.HTMLTable.RowFormatter;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.SourcesTableEvents;
import com.google.gwt.user.client.ui.TableListener;
import com.google.gwt.user.client.ui.Widget;
import com.searchincite.client.widgets.entitylabels.DocumentStatusLabel;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class AdvancedTable
  extends Composite
{
  private static final int DEFAULT_PAGE_SIZE = 6;
  private static final String DEFAULT_TABLE_WIDTH = "430px";
  private static final String DEFAULT_TABLE_HEIGHT = "210px";
  private static final int NAVIGATION_PANEL_HEIGHT = 26;
  private static final int STATUS_INFO = 1001;
  private static final int STATUS_ERROR = 1002;
  private static final int STATUS_WAIT = 1003;
  private static final String SORT_ASC_SYMBOL = " ▲";
  private static final String SORT_DESC_SYMBOL = " ▼";
  private static final String MARK_COLUMN_TITLE = "»";
  private static final int NO_ROW_SELECTED = -1;
  private static final String DEFAULT_ROW_STYLE = "advancedTableRow";
  private static final String SELECTED_ROW_STYLE = "advancedTableSelectedRow";
  private static final String NULL_DISPLAY_VALUE = "&nbsp;";
  private ScrollPanel scrollPanelGrid;
  private HorizontalPanel navigationPanel;
  public final Grid grid;
  private final Label statusLabel;
  private final Button buttonFirstPage;
  private final Button buttonPrevPage;
  private final Button buttonNextPage;
  private final Button buttonLastPage;
  private ArrayList rowSelectionListeners;
  private int pageSize = 6;
  private boolean firstColumnVisible = true;
  private boolean allowRowMark = false;
  private DocumentsTableModelServiceAsync documentsTableModelService;
  private TableColumn[] columns;
  private DataFilter[] filters;
  public String[][] pageRows;
  private int totalRowsCount;
  private int currentPageRowsCount;
  private int currentPageStartRow;
  private int currentPageIndex;
  private String sortColumnName;
  private boolean sortOrder;
  public int selectedRowIndex;
  private Set markedRows = new HashSet();
  private Set markedRowsAndOntologies = new HashSet();
  
  public AdvancedTable()
  {
    DockPanel contentDockPanel = new DockPanel();
    initWidget(contentDockPanel);
    contentDockPanel.setSize("100%", "100%");
    setSize("430px", "210px");
    
    this.scrollPanelGrid = new ScrollPanel();
    this.scrollPanelGrid.setSize("100%", "100%");
    contentDockPanel.add(this.scrollPanelGrid, DockPanel.CENTER);
    contentDockPanel.setCellWidth(this.scrollPanelGrid, "100%");
    contentDockPanel.setCellHeight(this.scrollPanelGrid, "100%");
    
    this.grid = new Grid();
    this.grid.setCellSpacing(0);
    this.grid.setBorderWidth(1);
    this.scrollPanelGrid.add(this.grid);
    this.grid.setSize("100%", "100%");
    if (!GWT.isScript())
    {
      this.grid.resize(7, 3);
      this.grid.setText(0, 0, "Column 1");
      this.grid.setText(0, 1, "Column 2");
      this.grid.setText(0, 2, "Column 3");
    }
    this.grid.addTableListener(new TableListener()
    {
      public void onCellClicked(SourcesTableEvents sender, int row, int column)
      {
        AdvancedTable.this.cellClicked(row, column);
      }
    });
    this.navigationPanel = new HorizontalPanel();
    contentDockPanel.add(this.navigationPanel, DockPanel.SOUTH);
    this.navigationPanel.setSize("100%", "26px");
    contentDockPanel.setCellHeight(this.navigationPanel, "26px");
    contentDockPanel.setCellWidth(this.navigationPanel, "100%");
    contentDockPanel.setCellVerticalAlignment(this.navigationPanel, HasVerticalAlignment.ALIGN_BOTTOM);
    

    Button buttonRefresh = new Button();
    this.navigationPanel.add(buttonRefresh);
    this.navigationPanel.setCellHeight(buttonRefresh, "23px");
    buttonRefresh.setSize("70", "23");
    this.navigationPanel.setCellVerticalAlignment(buttonRefresh, HasVerticalAlignment.ALIGN_BOTTOM);
    
    buttonRefresh.addClickListener(new ClickListener()
    {
      public void onClick(Widget sender)
      {
        AdvancedTable.this.buttonRefreshClicked();
      }
    });
    buttonRefresh.setText("Refresh");
    
    this.statusLabel = new Label();
    this.navigationPanel.add(this.statusLabel);
    this.statusLabel.setHeight("20px");
    this.navigationPanel.setCellHeight(this.statusLabel, "23px");
    this.navigationPanel.setCellHorizontalAlignment(this.statusLabel, HasHorizontalAlignment.ALIGN_RIGHT);
    
    this.navigationPanel.setCellVerticalAlignment(this.statusLabel, HasVerticalAlignment.ALIGN_BOTTOM);
    
    showStatus("Table model service not available.", 1002);
    
    this.buttonFirstPage = new Button();
    this.navigationPanel.add(this.buttonFirstPage);
    this.navigationPanel.setCellHeight(this.buttonFirstPage, "23px");
    this.buttonFirstPage.setSize("25", "23");
    this.navigationPanel.setCellVerticalAlignment(this.buttonFirstPage, HasVerticalAlignment.ALIGN_BOTTOM);
    
    this.buttonFirstPage.addClickListener(new ClickListener()
    {
      public void onClick(Widget sender)
      {
        AdvancedTable.this.buttonFirstPageClicked();
      }
    });
    this.navigationPanel.setCellHorizontalAlignment(this.buttonFirstPage, HasHorizontalAlignment.ALIGN_RIGHT);
    
    this.navigationPanel.setCellWidth(this.buttonFirstPage, "30px");
    this.buttonFirstPage.setText("<<");
    
    this.buttonPrevPage = new Button();
    this.navigationPanel.add(this.buttonPrevPage);
    this.navigationPanel.setCellHeight(this.buttonPrevPage, "23px");
    this.buttonPrevPage.setSize("20", "23");
    this.navigationPanel.setCellVerticalAlignment(this.buttonPrevPage, HasVerticalAlignment.ALIGN_BOTTOM);
    
    this.buttonPrevPage.addClickListener(new ClickListener()
    {
      public void onClick(Widget sender)
      {
        AdvancedTable.this.buttonPrevPageClicked();
      }
    });
    this.navigationPanel.setCellHorizontalAlignment(this.buttonPrevPage, HasHorizontalAlignment.ALIGN_RIGHT);
    
    this.navigationPanel.setCellWidth(this.buttonPrevPage, "23px");
    this.buttonPrevPage.setText("<");
    
    this.buttonNextPage = new Button();
    this.navigationPanel.add(this.buttonNextPage);
    this.navigationPanel.setCellHeight(this.buttonNextPage, "23px");
    this.buttonNextPage.setSize("20", "23");
    this.navigationPanel.setCellVerticalAlignment(this.buttonNextPage, HasVerticalAlignment.ALIGN_BOTTOM);
    
    this.buttonNextPage.addClickListener(new ClickListener()
    {
      public void onClick(Widget sender)
      {
        AdvancedTable.this.buttonNextPageClicked();
      }
    });
    this.navigationPanel.setCellHorizontalAlignment(this.buttonNextPage, HasHorizontalAlignment.ALIGN_RIGHT);
    
    this.navigationPanel.setCellWidth(this.buttonNextPage, "23px");
    this.buttonNextPage.setText(">");
    
    this.buttonLastPage = new Button();
    this.navigationPanel.add(this.buttonLastPage);
    this.navigationPanel.setCellHeight(this.buttonLastPage, "23px");
    this.buttonLastPage.setSize("25", "23");
    this.navigationPanel.setCellVerticalAlignment(this.buttonLastPage, HasVerticalAlignment.ALIGN_BOTTOM);
    
    this.buttonLastPage.addClickListener(new ClickListener()
    {
      public void onClick(Widget sender)
      {
        AdvancedTable.this.buttonLastPageClicked();
      }
    });
    this.navigationPanel.setCellHorizontalAlignment(this.buttonLastPage, HasHorizontalAlignment.ALIGN_RIGHT);
    
    this.navigationPanel.setCellWidth(this.buttonLastPage, "28px");
    this.buttonLastPage.setText(">>");
  }
  
  public int getPageSize()
  {
    return this.pageSize;
  }
  
  public void setPageSize(int pageSize)
  {
    this.pageSize = pageSize;
    if (!GWT.isScript()) {
      this.grid.resize(pageSize + 1, 3);
    }
  }
  
  public DocumentsTableModelServiceAsync getDocumentsTableModelService()
  {
    return this.documentsTableModelService;
  }
  
  public boolean isFirstColumnVisible()
  {
    return this.firstColumnVisible;
  }
  
  public void setFirstColumnVisible(boolean firstColumnVisible)
  {
    if (this.documentsTableModelService != null) {
      throw new IllegalStateException("Can not modify the FirstColumnVisible property after the TableModelService is assigned!");
    }
    this.firstColumnVisible = firstColumnVisible;
  }
  
  public boolean isAllowRowMark()
  {
    return this.allowRowMark;
  }
  
  public void setAllowRowMark(boolean allowRowMark)
  {
    if (this.documentsTableModelService != null) {
      throw new IllegalStateException("Can not modify the AllowedRowMark property after the TableModelService is assigned!");
    }
    this.allowRowMark = allowRowMark;
  }
  
  public void setTableModelService(DocumentsTableModelServiceAsync tableModelService)
  {
    this.documentsTableModelService = tableModelService;
    updateTableColumns(new AsyncCallback()
    {
      public void onFailure(Throwable caught)
      {
        AdvancedTable.this.showStatus("Can not get table columns from the server.", 1002);
      }
      
      public void onSuccess(Object result)
      {
        AdvancedTable.this.updateTableData();
      }
    });
  }
  
  public void addRowSelectionListener(RowSelectionListener listener)
  {
    if (this.rowSelectionListeners == null) {
      this.rowSelectionListeners = new ArrayList();
    }
    this.rowSelectionListeners.add(listener);
  }
  
  private void updateTableColumns(final AsyncCallback completedCallback)
  {
    this.documentsTableModelService.getColumns(new AsyncCallback()
    {
      public void onFailure(Throwable caught)
      {
        completedCallback.onFailure(caught);
      }
      
      public void onSuccess(Object result)
      {
        TableColumn[] columns = (TableColumn[])result;
        AdvancedTable.this.updateTableColumns(columns);
        completedCallback.onSuccess(result);
      }
    });
  }
  
  private void updateTableColumns(TableColumn[] newColumns)
  {
    if (this.firstColumnVisible)
    {
      if (this.allowRowMark)
      {
        this.columns = new TableColumn[newColumns.length + 1];
        this.columns[0] = new TableColumn("", "»");
        for (int i = 0; i < newColumns.length; i++) {
          this.columns[(i + 1)] = newColumns[i];
        }
      }
      else
      {
        this.columns = newColumns;
      }
    }
    else if (this.allowRowMark)
    {
      this.columns = newColumns;
      this.columns[0] = new TableColumn("", "»");
    }
    else
    {
      this.columns = new TableColumn[newColumns.length - 1];
      for (int i = 0; i < this.columns.length; i++) {
        this.columns[i] = newColumns[(i + 1)];
      }
    }
    this.sortColumnName = null;
    

    this.selectedRowIndex = -1;
    

    this.markedRows.clear();
    this.markedRowsAndOntologies.clear();
    

    redrawTableColumns();
  }
  
  public void updateTableData()
  {
    showStatus("Loading...", 1003);
    
    this.grid.resizeRows(1 + this.pageSize);
    
    updateRowsCount(new AsyncCallback()
    {
      public void onFailure(Throwable caught)
      {
        AdvancedTable.this.showStatus("Can not get table rows count from the server.", 1002);
      }
      
      public void onSuccess(Object result)
      {
        AdvancedTable.this.updateRows();
      }
    });
  }
  
  public void applyFilters(DataFilter[] filters)
  {
    this.filters = filters;
    updateTableData();
  }
  
  public void applySorting(String sortColumnName, boolean sortOrder)
  {
    this.sortColumnName = sortColumnName;
    this.sortOrder = sortOrder;
    redrawColumnTitles();
    updateRows();
  }
  
  private void redrawTableColumns()
  {
    if (this.grid.getRowCount() == 0) {
      this.grid.resizeRows(1);
    }
    this.grid.getRowFormatter().setStyleName(0, "advancedTableHeader");
    this.grid.resizeColumns(this.columns.length);
    

    redrawColumnTitles();
  }
  
  private void applySorting(String column)
  {
    if (column.equals(this.sortColumnName)) {
      applySorting(this.sortColumnName, !this.sortOrder);
    } else {
      applySorting(column, true);
    }
  }
  
  private void redrawColumnTitles()
  {
    for (int col = 0; col < this.columns.length; col++)
    {
      TableColumn column = this.columns[col];
      String title = column.getTitle();
      if (column.getName().equals(this.sortColumnName)) {
        if (this.sortOrder) {
          title = title + " ▲";
        } else {
          title = title + " ▼";
        }
      }
      this.grid.setText(0, col, title);
    }
    this.grid.getCellFormatter().setHorizontalAlignment(0, 0, HasHorizontalAlignment.ALIGN_CENTER);
  }
  
  private void updateRowsCount(final AsyncCallback completedCallback)
  {
    this.documentsTableModelService.getRowsCount(this.filters, new AsyncCallback()
    {
      public void onFailure(Throwable caught)
      {
        completedCallback.onFailure(caught);
      }
      
      public void onSuccess(Object result)
      {
        int count = ((Integer)result).intValue();
        AdvancedTable.this.totalRowsCount = count;
        completedCallback.onSuccess(result);
      }
    });
  }
  
  private void updateRows()
  {
    showStatus("Loading...", 1003);
    if (this.totalRowsCount == 0)
    {
      this.currentPageRowsCount = 0;
      drawEmptyTable();
      this.selectedRowIndex = -1;
      redrawSelectedRow();
      return;
    }
    int pagesCount = calcPagesCount();
    if (this.currentPageIndex >= pagesCount) {
      this.currentPageIndex = (pagesCount - 1);
    }
    this.currentPageStartRow = (this.currentPageIndex * this.pageSize);
    this.currentPageRowsCount = this.pageSize;
    if (this.currentPageStartRow + this.currentPageRowsCount > this.totalRowsCount) {
      this.currentPageRowsCount = (this.totalRowsCount % this.pageSize);
    }
    this.documentsTableModelService.getRows(this.currentPageStartRow, this.currentPageRowsCount, this.filters, this.sortColumnName, this.sortOrder, new AsyncCallback()
    {
      public void onFailure(Throwable caught)
      {
        AdvancedTable.this.showStatus("Can not get table rows data from the server.", 1002);
      }
      
      public void onSuccess(Object result)
      {
        AdvancedTable.this.pageRows = ((String[][])result);
        AdvancedTable.this.redrawRows();
      }
    });
  }
  
  private int calcPagesCount()
  {
    int pagesCount = (this.totalRowsCount + this.pageSize - 1) / this.pageSize;
    return pagesCount;
  }
  
  private void redrawNavigationArea()
  {
    int startRow = this.currentPageIndex * this.pageSize;
    String rowsInfo = "Rows " + (startRow + 1) + "-" + (startRow + this.currentPageRowsCount) + " of " + this.totalRowsCount;
    

    showStatus(rowsInfo, 1001);
    
    int pagesCount = calcPagesCount();
    boolean enabledPrevFirstPage = (pagesCount > 0) && (this.currentPageIndex > 0);
    
    this.buttonFirstPage.setEnabled(enabledPrevFirstPage);
    this.buttonPrevPage.setEnabled(enabledPrevFirstPage);
    
    boolean enabledNextLastPage = (pagesCount > 0) && (this.currentPageIndex < pagesCount - 1);
    
    this.buttonNextPage.setEnabled(enabledNextLastPage);
    this.buttonLastPage.setEnabled(enabledNextLastPage);
  }
  
  private void redrawRows()
  {
    int startTableColumn = 0;
    if (this.allowRowMark) {
      startTableColumn = 1;
    }
    int startDataColumn = 0;
    if (!this.firstColumnVisible) {
      startDataColumn = 1;
    }
    for (int row = 0; row < this.pageSize; row++) {
      if (row < this.currentPageRowsCount) {
        for (int col = startTableColumn; col < this.columns.length; col++)
        {
          String cellValue = this.pageRows[row][(col - startTableColumn + startDataColumn)];
          if (cellValue == "processed")
          {
            String currentDocumentIdString = this.grid.getText(row + 1, 1);
            int currentDocumentId = Integer.parseInt(currentDocumentIdString);
            
            String currentDocumentOntologyString = this.grid.getText(row + 1, 4);
            this.grid.setWidget(row + 1, col, new DocumentStatusLabel(currentDocumentId, currentDocumentOntologyString));
          }
          else if (cellValue != null)
          {
            this.grid.setText(row + 1, col, cellValue);
          }
          else
          {
            this.grid.setHTML(row + 1, col, "&nbsp;");
          }
        }
      } else {
        for (int col = 0; col < this.columns.length; col++) {
          this.grid.setHTML(row + 1, col, "&nbsp;");
        }
      }
    }
    if (this.allowRowMark) {
      redrawCheckBoxes();
    }
    this.selectedRowIndex = -1;
    redrawSelectedRow();
    
    redrawNavigationArea();
    
    fixGridSize();
  }
  
  private void redrawCheckBoxes()
  {
    for (int row = 0; row < this.pageSize; row++) {
      if (row < this.currentPageRowsCount)
      {
        final CheckBox checkBox = new CheckBox();
        String rowId = this.pageRows[row][0];
        if (this.markedRows.contains(rowId)) {
          checkBox.setChecked(true);
        }
        final int currentRow = row;
        checkBox.addClickListener(new ClickListener()
        {
          public void onClick(Widget sender)
          {
            AdvancedTable.this.checkBoxChanged(currentRow, checkBox.isChecked());
          }
        });
        this.grid.setWidget(row + 1, 0, checkBox);
        this.grid.getCellFormatter().setHorizontalAlignment(row + 1, 0, HasHorizontalAlignment.ALIGN_CENTER);
      }
    }
  }
  
  private void checkBoxChanged(int row, boolean checked)
  {
    String rowId = this.pageRows[row][0];
    
    String ontologyName = this.pageRows[row][3];
    String rowIdOntologyName = rowId + "TheyCallMeTim" + ontologyName;
    if (checked)
    {
      this.markedRows.add(rowId);
      
      this.markedRowsAndOntologies.add(rowIdOntologyName);
    }
    else
    {
      this.markedRows.remove(rowId);
      
      this.markedRowsAndOntologies.remove(rowIdOntologyName);
    }
  }
  
  private void redrawSelectedRow()
  {
    HTMLTable.RowFormatter gridRowFormatter = this.grid.getRowFormatter();
    for (int row = 1; row <= this.pageSize; row++) {
      if (row == this.selectedRowIndex) {
        gridRowFormatter.setStyleName(row, "advancedTableSelectedRow");
      } else {
        gridRowFormatter.setStyleName(row, "advancedTableRow");
      }
    }
  }
  
  private void drawEmptyTable()
  {
    for (int row = 0; row < this.pageSize; row++) {
      for (int col = 0; col < this.columns.length; col++) {
        this.grid.setHTML(row + 1, col, "&nbsp;");
      }
    }
    redrawNavigationArea();
    showStatus("No data found.", 1001);
    fixGridSize();
  }
  
  private void cellClicked(int row, int column)
  {
    if (row == 0)
    {
      if ((column == 0) && (this.allowRowMark)) {
        return;
      }
      String columnName = this.columns[column].getName();
      applySorting(columnName);
    }
    else if (row <= this.currentPageRowsCount)
    {
      selectRow(row);
    }
    redrawSelectedRow();
  }
  
  private void selectRow(int rowIndex)
  {
    this.selectedRowIndex = rowIndex;
    

    String rowId = getSelectedRowId();
    if (this.rowSelectionListeners != null) {
      for (int i = 0; i < this.rowSelectionListeners.size(); i++)
      {
        RowSelectionListener listener = (RowSelectionListener)this.rowSelectionListeners.get(i);
        
        listener.onRowSelected(this, rowId);
      }
    }
  }
  
  private void buttonFirstPageClicked()
  {
    this.currentPageIndex = 0;
    updateRows();
  }
  
  private void buttonPrevPageClicked()
  {
    if (this.currentPageIndex > 0)
    {
      this.currentPageIndex -= 1;
      updateRows();
    }
  }
  
  private void buttonNextPageClicked()
  {
    int pagesCount = calcPagesCount();
    if (this.currentPageIndex < pagesCount - 1)
    {
      this.currentPageIndex += 1;
      updateRows();
    }
  }
  
  private void buttonLastPageClicked()
  {
    int pagesCount = calcPagesCount();
    this.currentPageIndex = pagesCount;
    updateRows();
  }
  
  private void buttonRefreshClicked()
  {
    updateTableData();
  }
  
  private void showStatus(String text, int statusLevel)
  {
    if (statusLevel == 1001) {
      this.statusLabel.setText(text);
    } else if (statusLevel == 1003) {
      this.statusLabel.setText(text);
    } else if (statusLevel == 1002) {
      this.statusLabel.setText("Error: " + text);
    } else {
      throw new IllegalArgumentException("Illegal statusLevel.");
    }
  }
  
  public String getSelectedRowId()
  {
    if (this.selectedRowIndex == -1) {
      return null;
    }
    String selectedRowId = this.pageRows[(this.selectedRowIndex - 1)][0];
    System.out.println(selectedRowId);
    return selectedRowId;
  }
  
  public Set getMarkedRows()
  {
    return this.markedRows;
  }
  
  public Set getMarkedRowsAndOntologies()
  {
    return this.markedRowsAndOntologies;
  }
  
  public void clearMarkedRows()
  {
    this.markedRows.clear();
    this.markedRowsAndOntologies.clear();
    redrawCheckBoxes();
  }
  
  public void markAllRows()
  {
    this.documentsTableModelService.getRows(0, this.totalRowsCount, this.filters, null, false, new AsyncCallback()
    {
      public void onFailure(Throwable caught)
      {
        AdvancedTable.this.showStatus("Can not get table data rows from the server.", 1002);
      }
      
      public void onSuccess(Object result)
      {
        String[][] allTableRows = (String[][])result;
        AdvancedTable.this.markRows(allTableRows);
      }
    });
  }
  
  private void markRows(String[][] allTableRows)
  {
    for (int row = 0; row < allTableRows.length; row++)
    {
      String rowId = allTableRows[row][0];
      this.markedRows.add(rowId);
      
      String ontologyName = this.pageRows[row][3];
      String rowIdOntologyName = rowId + "TheyCallMeTim" + ontologyName;
      this.markedRowsAndOntologies.add(rowIdOntologyName);
    }
    redrawCheckBoxes();
  }
  
  private void fixGridSize()
  {
    String originalWidth = DOM.getStyleAttribute(getElement(), "width");
    
    this.scrollPanelGrid.setWidth(originalWidth);
    

    String originalHeightStr = DOM.getStyleAttribute(getElement(), "height");
    if (originalHeightStr.endsWith("%"))
    {
      Element parentContainer = DOM.getParent(getElement());
      originalHeightStr = DOM.getElementProperty(parentContainer, "offsetHeight");
      

      setHeight("" + originalHeightStr + "px");
    }
    else if (originalHeightStr.endsWith("px"))
    {
      originalHeightStr = originalHeightStr.substring(0, originalHeightStr.length() - 2);
    }
    int originalHeight = Integer.parseInt(originalHeightStr);
    
    int newHeight = 500;
    this.scrollPanelGrid.setHeight("" + newHeight + "px");
  }
}