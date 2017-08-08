package com.searchincite.client.widgets.documentsadvancedtable;

import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.TableListener;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("deprecation")
public class RightClickTable
  extends FlexTable
{
  private static Event currentRightClickEvent = null;
  @SuppressWarnings({ "unchecked", "rawtypes" })
private Set<TableListener> listeners = new HashSet();
  
  public void sinkRightClickEvents()
  {
    setOnContextMenu(getElement());
  }
  
  public void addTableListener(TableListener listener)
  {
    super.addTableListener(listener);
    this.listeners.add(listener);
  }
  
  public void removeTableListener(TableListener listener)
  {
    super.removeTableListener(listener);
    this.listeners.remove(listener);
  }
  
  private void fireRightClick(int row, int column)
  {
    for (TableListener listener : this.listeners) {
      listener.onCellClicked(this, row, column);
    }
  }
  
  public static boolean isRightClick(Event event)
  {
    return event == currentRightClickEvent;
  }
  
  public void onBrowserEvent(Event event)
  {
    if (event.getType().equals("contextmenu"))
    {
      currentRightClickEvent = event;
      event.preventDefault();
      handleRightClick(event);
    }
    else
    {
      super.onBrowserEvent(event);
    }
  }
  
  private void handleRightClick(Event event)
  {
    Element td = getEventTargetCell(event);
    if (td == null) {
      return;
    }
    Element tr = DOM.getParent(td);
    Element body = DOM.getParent(tr);
    int row = DOM.getChildIndex(body, tr);
    int column = DOM.getChildIndex(tr, td);
    
    fireRightClick(row, column);
  }
  
  private native void setOnContextMenu(Element paramElement) /*-{
   }-*/;
   
}
