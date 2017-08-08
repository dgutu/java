package com.searchincite.client.widgets.documentsadvancedtable;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.ServiceDefTarget;

public class ServiceUtils
{
  private static DocumentsTableModelServiceAsync documentsTableModelServiceAsync;
  
  public static DocumentsTableModelServiceAsync getDocumentsTableModelServiceAsync()
  {
    if (documentsTableModelServiceAsync == null)
    {
      documentsTableModelServiceAsync = (DocumentsTableModelServiceAsync)GWT.create(DocumentsTableModelService.class);
      
      ServiceDefTarget target = (ServiceDefTarget)documentsTableModelServiceAsync;
      target.setServiceEntryPoint(GWT.getModuleBaseURL() + "/DocumentsTableModelService");
    }
    return documentsTableModelServiceAsync;
  }
}


/* Location:           G:\SI\com.searchincite.SearchIncite\com.searchincite.SearchIncite\WEB-INF\classes\
 * Qualified Name:     com.searchincite.client.widgets.documentsadvancedtable.ServiceUtils
 * JD-Core Version:    0.7.0.1
 */