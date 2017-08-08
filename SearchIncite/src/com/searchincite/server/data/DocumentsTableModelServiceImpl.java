package com.searchincite.server.data;

import au.com.bytecode.opencsv.CSVWriter;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.searchincite.api.entity.User;
import com.searchincite.client.entity.Document;
import com.searchincite.client.entity.DocumentWithResult;
import com.searchincite.client.widgets.documentsadvancedtable.DataFilter;
import com.searchincite.client.widgets.documentsadvancedtable.DocumentsTableModelService;
import com.searchincite.client.widgets.documentsadvancedtable.TableColumn;
import com.searchincite.server.entity.manager.DocumentManager;

import java.io.File;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpSession;

public class DocumentsTableModelServiceImpl extends RemoteServiceServlet implements DocumentsTableModelService
{
	// logger
	private final static Logger log = Logger.getLogger(DocumentsTableModelServiceImpl.class.getName());	  

	private static final long serialVersionUID = 1L;
	private TableColumn[] columns = { new TableColumn("DocumentId", "ID"), new TableColumn("FileName", "Filename"), new TableColumn("Description", "Description"), new TableColumn("OntologyName", "Ontology"), new TableColumn("Status", "Status"), new TableColumn("LastModifiedDate", "Last Updated") };
	private static int documentSourceId;  
  
	public void updateDocumentSourceId(int m_iDocumentSourceID)
	{
		documentSourceId = m_iDocumentSourceID;
		allDocuments = getAllDocuments();
	}
  
  /*public static List getAllDocumentsList_old()
  {
    Connection db = null;
    PreparedStatement ps = null;
    try
    {
      db = SIDB.getConnection();
      db.setAutoCommit(false);
      ps = db.prepareStatement("\nSELECT od.document_id, od.file_name,\n   od.description, oo.name AS ontology_name,\n   --os1.status as od_status, os2.status as odc_status,\n   --od.status_id, oodc.status_id,\n   CASE WHEN os1.status = 'convert.done'\n        THEN CASE WHEN os2.status = 'uploaded'\n                  THEN 'converted...'\n                  ELSE os2.status\n              END\n        ELSE os1.status\n   END as status,\n   od.last_modified_date \n FROM ontology.document od \n JOIN ontology.ontology_document_cache oodc ON od.document_id   = oodc.document_id \n JOIN ontology.ontology oo                  ON oodc.ontology_id = oo.ontology_id \n JOIN ontology.status os1                   ON od.status_id     = os1.status_id \n JOIN ontology.status os2                   ON oodc.status_id   = os2.status_id \nWHERE document_source_id = " + documentSourceId + " ORDER BY last_modified_date DESC;");
      ResultSet rs = ps.executeQuery();
      
      return ObjectFactory.convertToObjects(rs, DocumentWithResult.class);
    }
    catch (Exception e)
    {
      Object localObject1;
      e.printStackTrace();
      return new ArrayList();
    }
    finally
    {
      try
      {
        db.commit();
        ps.close();
        db.close();
      }
      catch (SQLException ignore) {}
    }
  }*/
  
	// DG 1/15/2014. getAllDocumentsList from database with status, used in Document Manager, Documents tab
	@SuppressWarnings("rawtypes")
	public static List getAllDocumentsList() 
	{
		Connection db = null;
	    PreparedStatement ps = null;
	    ResultSet rs = null;
	    try
	    {
	      db = SIDB.getConnection();
	      
	      if (db != null) {
		      db.setAutoCommit(false);
		      ps = db.prepareCall("SELECT * FROM ontology.spgetalldocumentlist(?)");	      
		      ps.setInt(1, documentSourceId);	      
		      rs = ps.executeQuery();
		      
		      // Move to first row, which is a ResultSet containing users
			  if (!rs.next()) {
				  return null;			
			  }
	      }

		  // Return reference to first ResultSet (documents)
	      return ObjectFactory.convertToObjects((ResultSet)rs.getObject(1), DocumentWithResult.class);
	    }
	    catch (Exception e)
	    {
	      //Object localObject1;
	      e.printStackTrace();
	      return new ArrayList();
	    }
	    finally
	    {
	      try
	      {
			  if (db != null) {
				  db.commit();
				  db.close();
			  }
			  if (ps != null) {
				  ps.close();
			  }
			  if (rs != null) {
				  rs.close();
			  }			  
	      }
	      catch (SQLException ignore) {}
	    }
	}
  
	public DocumentWithResult[] getAllDocuments()
	{
		List allDocumentsList = getAllDocumentsList();
	    DocumentWithResult[] allDocuments = new DocumentWithResult[allDocumentsList.size()];
	    for (int i = 0; i < allDocumentsList.size(); i++)
	    {
	      DocumentWithResult d = (DocumentWithResult)allDocumentsList.get(i);
	      allDocuments[i] = d;
	    }
	    return allDocuments;
	}
  
	public boolean newDocument(String fileName, String description, String contentString)
	{
		HttpServletRequest req = getThreadLocalRequest();
	    User u = (User)req.getSession().getAttribute("user");
	    if (u == null) {
	      return false;
	    }
	    byte[] content = convertStringToByteArray(contentString);
	    
	    int orgId = u.getOrganizationID();
	    int createdBy = u.getUserID();
	    try
	    {
	      DocumentData.createDocument(orgId, fileName, content, description, documentSourceId, createdBy);
	    }
	    catch (Exception e)
	    {
	      e.printStackTrace();
	    }
	    finally
	    {
	      allDocuments = getAllDocuments();
	    }
	    return true;
	}
  
	public boolean editDocument(String fileName, String description, String contentString, String rowId)
	{
		HttpServletRequest req = getThreadLocalRequest();
	    User u = (User)req.getSession().getAttribute("user");
	    if (u == null) {
	      return false;
	    }
	    int intRowId = Integer.parseInt(rowId);
	    
	    byte[] content = convertStringToByteArray(contentString);
	    
	    int orgId = u.getOrganizationID();
	    int lastModifiedBy = u.getUserID();
	    try
	    {
	      DocumentData.updateDocument(intRowId, orgId, fileName, content, description, documentSourceId, lastModifiedBy);
	    }
	    catch (Exception e)
	    {
	      e.printStackTrace();
	    }
	    finally
	    {
	      allDocuments = getAllDocuments();
	    }
	    return true;
	}
  
	public boolean deleteDocuments(String[] markedRowsArray)
	{
	    HttpServletRequest req = getThreadLocalRequest();
	    User u = (User)req.getSession().getAttribute("user");
	    if (u == null) {
	      return false;
	    }
	    int orgId = u.getOrganizationID();
	    try
	    {
	      for (int i = 0; i < markedRowsArray.length; i++)
	      {
	        long documentId = Long.parseLong(markedRowsArray[i]);
	        DocumentData.deleteDocument(documentId, orgId);
	      }
	    }
	    catch (Exception e)
	    {
	      e.printStackTrace();
	    }
	    finally
	    {
	      allDocuments = getAllDocuments();
	    }
	    return true;
	}
  
	public boolean reprocessCheckedDocuments(String[] markedRowsAndOntologiesArray)
	{
	    HttpServletRequest req = getThreadLocalRequest();
	    User u = (User)req.getSession().getAttribute("user");
	    if (u == null) {
	      return false;
	    }
	    int orgId = u.getOrganizationID();
	    int userId = u.getUserID();
	    try
	    {
	      for (int i = 0; i < markedRowsAndOntologiesArray.length; i++)
	      {
	        String rowIdOntologyName = markedRowsAndOntologiesArray[i];
	
	        String[] tokens = rowIdOntologyName.split("TheyCallMeTim");
	
	        String documentIdString = tokens[0];
	        String ontologyName = tokens[1];
	        
	        long documentId = Long.parseLong(documentIdString);
	        
	        int ontologyId = getCurrentDocumentOntology(documentId, ontologyName);
	
	        DocumentManager.updateDocumentStatus(ontologyId, documentId, 1);
	        DocumentManager.updateDocumentStatusForGivenDocument(documentId, 1, userId);
	      }
	    }
	    catch (Exception e)
	    {
	      e.printStackTrace();
	    }
	    finally
	    {
	      allDocuments = getAllDocuments();
	    }
	    return true;
	}
  
	public byte[] convertStringToByteArray(String stringToConvert)
	{
	    byte[] theByteArray = stringToConvert.getBytes();
	    return theByteArray;
	}
  
	public String getCurrentRowContent(String rowId)
	{
  		log.log(Level.INFO, "getCurrentRowContent.rowId={0}", rowId);
		Connection db = null;
		PreparedStatement ps = null;
		String content = "";
		try
		{
			// get db connection
			db = SIDB.getConnection();
			
			if (db != null) {		  
			  db.setAutoCommit(false);
			  
			  ps = db.prepareStatement("SELECT od.file_data AS content FROM ontology.document od WHERE document_id = ?");
			
			  long rowIdLong = Long.parseLong(rowId);
			  ps.setLong(1, rowIdLong);
			  
			  ResultSet rs = ps.executeQuery();
			  
			  if (rs.next()) {
				  byte[] contentByteArray = rs.getBytes("content");
				  content = new String(contentByteArray);
			  }
			}
			
			return content;
		}
		catch (Exception e)
		{
		  e.printStackTrace();
		  return "Error";
		}
		finally
		{
		  try
		  {
			  if (db != null) {
				  //db.commit();
				  db.close();
			  }
			  if (ps != null)
				  ps.close();
		  }
		  catch (SQLException ignore) {}
		}
	}
  
	public int getCurrentDocumentOntology(long lDocumentID, String ontologyName)
	{
		log.log(Level.INFO, "getCurrentDocumentOntology.lDocumentID={0}", lDocumentID);
		log.log(Level.INFO, "getCurrentDocumentOntology.ontologyName={0}", ontologyName);
		
		Connection db = null;
		PreparedStatement ps = null;
		String currentDocumentOntologyIdString = null;
		int currentDocumentOntologyId = -1; // no ontology
		try
		{
		  // get db connection 
		  db = SIDB.getConnection();
		  
		  if (db != null) {
			  db.setAutoCommit(false);
			  
			  ps = db.prepareStatement("SELECT o.ontology_id FROM ontology.ontology o JOIN ontology.organization oorg ON o.org_id = oorg.org_id JOIN ontology.document od ON od.org_id = oorg.org_id WHERE o.name = ? AND od.document_id = ?");
			  
			  ps.setString(1, ontologyName);
			  ps.setLong(2, lDocumentID);
			  
			  ResultSet rs = ps.executeQuery();
			  
			  if (rs.next()) {      
			      currentDocumentOntologyIdString = rs.getString("ontology_id");
			      currentDocumentOntologyId = Integer.parseInt(currentDocumentOntologyIdString);	      
			  }
		  }
		  
		  return currentDocumentOntologyId;
		}
		catch (Exception e)
		{      
		  e.printStackTrace();
		  return -1;
		}
		finally
		{
		  try
		  {
			  if (db != null) {
				  db.commit();
				  db.close();
			  }
			  if (ps != null)
				  ps.close();
		    
		  }
		  catch (SQLException ignore) {}
		}
	}
  
	private DocumentWithResult[] allDocuments = getAllDocuments();
	private List<Document> filteredDocuments;
  
	public DocumentsTableModelServiceImpl()
	{
		applyDataFilters(null);
	}
  
	public TableColumn[] getColumns()
	{
		return columns;
	}
  
	public int getRowsCount(DataFilter[] filters)
	{
		applyDataFilters(filters);
	    int count = filteredDocuments.size();
	    return count;
	}
  
	public String[][] getRows(int startRow, int rowsCount, DataFilter[] filters, String sortColumn, boolean sortingOrder)
	{
		Document[] rowsData = getRowsData(startRow, rowsCount, filters, sortColumn, sortingOrder);
	    
	    int columnsCount = columns.length;
	    String[][] rows = new String[rowsCount][columnsCount];
	    for (int row = 0; row < rowsCount; row++) {
	      for (int col = 0; col < columnsCount; col++)
	      {
	        String columnName = columns[col].getName();
	        rows[row][col] = ReflectionUtils.getPropertyStringValue(rowsData[row], columnName);
	      }
	    }
	    return rows;
	}
  
	private Document[] getRowsData(int startRow, int rowsCount, DataFilter[] filters, String sortColumn, boolean sortingOrder)
	{
	    applyDataFilters(filters);
	    applySorting(sortColumn, sortingOrder);
	    Document[] rows = new Document[rowsCount];
	    for (int row = startRow; row < startRow + rowsCount; row++) {
	      rows[(row - startRow)] = ((Document)filteredDocuments.get(row));
	    }
	    return rows;
	}
  
	private void applyDataFilters(DataFilter[] filters)
	{
	    filteredDocuments = new ArrayList();
	    if (filters == null)
	    {
	      for (Document document : allDocuments) {
	        filteredDocuments.add(document);
	      }
	    }
	    else
	    {
	      String keyword = filters[0].getValue().toUpperCase();
	      for (Document document : allDocuments)
	      {
	        Long documentId = document.getDocumentId();
	        if (documentId == null) {
	          documentId = Long.valueOf(0L);
	        }
	        String fileName = document.getFileName();
	        if (fileName == null) {
	          fileName = "";
	        }
	        if ((fileName.toUpperCase().contains(keyword)) || (fileName.toUpperCase().contains(keyword))) {
	          filteredDocuments.add(document);
	        }
	      }
	    }
	}
  
	private void applySorting(String sortColumn, boolean sortingOrder)
	{
	    if (sortColumn != null)
	    {
	      DocumentComparator documentComparator = new DocumentComparator(sortColumn, sortingOrder);
	      
	      Collections.sort(filteredDocuments, documentComparator);
	    }
	}

	@Override
	public String exportCheckedDocuments(String[] markedRowsAndOntologiesArray) 
	{
	    HttpServletRequest req = getThreadLocalRequest();
	    User u = (User)req.getSession().getAttribute("user");
	    /*if (u == null) {
	      return false;
	    }*/
	    
	    int orgId = u.getOrganizationID();
	    int userId = u.getUserID();
	    //int ontologyId = 0 ;
	    
	    String docs = "";
	    String path = "webapps/com.searchincite.SearchIncite/";		
	    String fileName = "files/exportDocs.csv";		    
	    String documentIdString = "";
	    String ontologyName = "";
	    
	    try
	    {
	      for (int i = 0; i < markedRowsAndOntologiesArray.length; i++)
	      {
	        String rowIdOntologyName = markedRowsAndOntologiesArray[i];

	        String[] tokens = rowIdOntologyName.split("TheyCallMeTim");

	        documentIdString = tokens[0];
	        ontologyName = tokens[1];
	        
	        long documentId = Long.parseLong(documentIdString);
	        
	        // find ontologyId
	        //if (ontologyId == 0) 
	        //	ontologyId = getCurrentDocumentOntology(documentId, ontologyName);
	        
	        docs += documentId;
	        
			if (i < markedRowsAndOntologiesArray.length - 1)
				docs += ",";	        
	      }	      
	      
	      // export query result
	      ResultSet rs = DocumentData.exportDocs(docs, orgId, ontologyName);	      
	      
	      File f = new File(path + fileName);
	      if (f.exists())
	    	  f.delete();			
			
	      CSVWriter csvOutput = new CSVWriter(new FileWriter(path + fileName, true), ',');
	      csvOutput.writeAll(rs, true);
	      csvOutput.close();	      
	      DocumentData.closeConnection(rs);
	      
	    }
	    catch (Exception e)
	    {
	    	System.out.println(e.getLocalizedMessage());
	    }
	    /*finally
	    {
	    	allDocuments = getAllDocuments();
	    }*/
	    return fileName;
	}
}