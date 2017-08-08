package com.searchincite.client.widgets.documentsadvancedtable;

import com.google.gwt.user.client.rpc.IsSerializable;

public class DataFilter
  implements IsSerializable
{
  private String column;
  private String value;
  
  public DataFilter() {}
  
  public DataFilter(String column, String value)
  {
    this.column = column;
    this.value = value;
  }
  
  public String getColumn()
  {
    return this.column;
  }
  
  public void setColumn(String column)
  {
    this.column = column;
  }
  
  public String getValue()
  {
    return this.value;
  }
  
  public void setValue(String value)
  {
    this.value = value;
  }
}


/* Location:           G:\SI\com.searchincite.SearchIncite\com.searchincite.SearchIncite\WEB-INF\classes\
 * Qualified Name:     com.searchincite.client.widgets.documentsadvancedtable.DataFilter
 * JD-Core Version:    0.7.0.1
 */