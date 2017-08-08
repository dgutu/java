package com.searchincite.client.widgets.documentsadvancedtable;

import com.google.gwt.user.client.rpc.AsyncCallback;

public abstract interface DocumentsTableModelServiceAsync
{
  public abstract void getColumns(AsyncCallback paramAsyncCallback);
  
  public abstract void getRowsCount(DataFilter[] paramArrayOfDataFilter, AsyncCallback paramAsyncCallback);
  
  public abstract void getRows(int paramInt1, int paramInt2, DataFilter[] paramArrayOfDataFilter, String paramString, boolean paramBoolean, AsyncCallback paramAsyncCallback);
  
  public abstract void newDocument(String paramString1, String paramString2, String paramString3, AsyncCallback paramAsyncCallback);
  
  public abstract void editDocument(String paramString1, String paramString2, String paramString3, String paramString4, AsyncCallback paramAsyncCallback);
  
  public abstract void deleteDocuments(String[] paramArrayOfString, AsyncCallback paramAsyncCallback);
  
  public abstract void reprocessCheckedDocuments(String[] paramArrayOfString, AsyncCallback paramAsyncCallback);
  
  public abstract void exportCheckedDocuments(String[] paramArrayOfString, AsyncCallback paramAsyncCallback);
  
  public abstract void getCurrentRowContent(String paramString, AsyncCallback paramAsyncCallback);
  
  public abstract void getCurrentDocumentOntology(long paramLong, String paramString, AsyncCallback paramAsyncCallback);
  
  public abstract void updateDocumentSourceId(int paramInt, AsyncCallback paramAsyncCallback);
}

