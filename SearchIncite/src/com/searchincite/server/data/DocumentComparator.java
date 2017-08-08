package com.searchincite.server.data;

import com.searchincite.client.entity.Document;
import java.util.Comparator;

public class DocumentComparator
  implements Comparator<Document>
{
  private String sortColumn;
  private boolean sortingOrder;
  
  public DocumentComparator(String sortColumn, boolean sortingOrder)
  {
    this.sortColumn = sortColumn;
    this.sortingOrder = sortingOrder;
  }
  
  public int compare(Document document1, Document document2)
  {
    Comparable column1 = (Comparable)ReflectionUtils.getPropertyValue(document1, this.sortColumn);
    

    Comparable column2 = (Comparable)ReflectionUtils.getPropertyValue(document2, this.sortColumn);
    

    int compareResult = -1;
    if (column1 != null) {
      if (column2 != null) {
        compareResult = column1.compareTo(column2);
      } else {
        compareResult = 1;
      }
    }
    if (!this.sortingOrder) {
      compareResult = -1 * compareResult;
    }
    return compareResult;
  }
}
