package com.searchincite.client.widgets.documentsadvancedtable;

import com.google.gwt.user.client.rpc.IsSerializable;

public class TableColumn
  implements IsSerializable
{
  private String name;
  private String title;
  
  public TableColumn() {}
  
  public TableColumn(String name, String title)
  {
    this.name = name;
    this.title = title;
  }
  
  public String getName()
  {
    return this.name;
  }
  
  public void setName(String name)
  {
    this.name = name;
  }
  
  public String getTitle()
  {
    return this.title;
  }
  
  public void setTitle(String title)
  {
    this.title = title;
  }
}


/* Location:           G:\SI\com.searchincite.SearchIncite\com.searchincite.SearchIncite\WEB-INF\classes\
 * Qualified Name:     com.searchincite.client.widgets.documentsadvancedtable.TableColumn
 * JD-Core Version:    0.7.0.1
 */