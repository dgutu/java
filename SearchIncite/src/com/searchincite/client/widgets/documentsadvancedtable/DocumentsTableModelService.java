package com.searchincite.client.widgets.documentsadvancedtable;

import com.google.gwt.user.client.rpc.RemoteService;

public abstract interface DocumentsTableModelService
  extends RemoteService
{
  public abstract TableColumn[] getColumns();
  
  public abstract int getRowsCount(DataFilter[] paramArrayOfDataFilter);
  
  public abstract String[][] getRows(int paramInt1, int paramInt2, DataFilter[] paramArrayOfDataFilter, String paramString, boolean paramBoolean);
  
  public abstract boolean newDocument(String paramString1, String paramString2, String paramString3);
  
  public abstract boolean editDocument(String paramString1, String paramString2, String paramString3, String paramString4);
  
  public abstract boolean deleteDocuments(String[] paramArrayOfString);
  
  public abstract boolean reprocessCheckedDocuments(String[] paramArrayOfString); 
  
  public abstract String exportCheckedDocuments(String[] paramArrayOfString);
  
  public abstract String getCurrentRowContent(String paramString);
  
  public abstract int getCurrentDocumentOntology(long paramLong, String paramString);
  
  public abstract void updateDocumentSourceId(int paramInt);
}

