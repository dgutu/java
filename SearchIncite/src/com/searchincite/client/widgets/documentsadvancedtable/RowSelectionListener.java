package com.searchincite.client.widgets.documentsadvancedtable;

import java.util.EventListener;

public abstract interface RowSelectionListener
  extends EventListener
{
  public abstract void onRowSelected(AdvancedTable paramAdvancedTable, String paramString);
}


/* Location:           G:\SI\com.searchincite.SearchIncite\com.searchincite.SearchIncite\WEB-INF\classes\
 * Qualified Name:     com.searchincite.client.widgets.documentsadvancedtable.RowSelectionListener
 * JD-Core Version:    0.7.0.1
 */