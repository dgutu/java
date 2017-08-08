package com.searchincite.server.entity.manager;

import com.searchincite.client.entity.Document;
import com.searchincite.server.data.DocumentData;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DocumentManager
{
	public static Document deserialize(ResultSet rs, Document d, long lFieldMask) throws SQLException
	{
		if (d == null) {
			d = new Document();
		}
		d.setDocumentID(rs.getLong("document_id"));
		d.setOrganizationID(rs.getInt("org_id"));
		d.setFilename(rs.getString("file_name"));
		d.setDateCreated(new java.util.Date(rs.getDate("creation_date").getTime()));
		d.setCreatedByUserID(rs.getInt("created_by"));
		d.setLastModifiedDate(new java.util.Date(rs.getDate("last_modified_date").getTime()));
		d.setLastModifiedByUserID(rs.getInt("last_modified_by"));
		d.setDocumentSourceID(rs.getInt("document_source_id"));
		d.setDescription(rs.getString("description"));
		if ((lFieldMask & 0x200) == 512L) {
			d.setContent(rs.getBytes("file_data"));
		}
		return d;
	}
  
	public static Document deserialize(ResultSet rs, long lFieldMask) throws SQLException
	{
		return deserialize(rs, null, lFieldMask);
	}
  
	public static Document createDocument(Document d) throws SQLException
	{
		if (d.getCreatedByUserID() <= 0) {
			return null;
		}
		
		long lNewID = DocumentData.createDocument(d.getOrganizationID(), d.getFilename(), d.getContent(), d.getDescription(), d.getDocumentSourceID(), d.getCreatedByUserID());

		d.setDocumentID(lNewID);
		return d;
	}
  
	public static void deleteDocument(long lDocumentID, int iOrgID) throws SQLException
	{
		DocumentData.deleteDocument(lDocumentID, iOrgID);
	}
  
	public static void updateDocument(Document d) throws SQLException
	{
		if (d.getLastModifiedByUserID() <= 0) {
			return;
		}
		DocumentData.updateDocument(d.getDocumentID(), d.getOrganizationID(), d.getFilename(), d.getContent(), d.getDescription(), d.getDocumentSourceID(), d.getLastModifiedByUserID());
	}
  
	public static Document getDocumentByID(long lDocumentID, int iOrganizationID, long lFieldMask) throws SQLException
	{
		ResultSet rs = DocumentData.getDocumentByID(lDocumentID, iOrganizationID, lFieldMask);
    
		Document d = null;
		if (rs.next())
		{
			ResultSet rsDocument = (ResultSet)rs.getObject(1);
			if (!rsDocument.next()) {
				return null;
			}
			d = deserialize(rsDocument, lFieldMask);
		}
		else
		{
			return null;
		}
		
		rs.getStatement().getConnection().close();
		rs.getStatement().close();
		rs.close();
    
		return d;
	}
  
	public static String getOntologyDocumentStatus(long lDocumentID, int iOntologyID) throws SQLException
	{
		ResultSet rs = DocumentData.getOntologyDocumentStatus(lDocumentID, iOntologyID);
    
		String strRet = "";
		if (rs.next()) {
			strRet = rs.getString(1);
		}
		rs.getStatement().getConnection().close();
		rs.getStatement().close();
		rs.close();
    
		return strRet;
	}
  
	public static void updateDocumentStatus(int iOntologyID, long lDocumentID, int iDocumentStatusID) throws SQLException
	{
		DocumentData.updateDocumentStatus(iOntologyID, lDocumentID, iDocumentStatusID);
	}
  
	public static void updateDocumentStatusForGivenDocument(long lDocumentID, int iDocumentStatusID, int iuserID) throws SQLException
	{
		DocumentData.updateDocumentStatusForGivenDocument(lDocumentID, iDocumentStatusID, iuserID);
	}
  
	public static boolean checkFilenameExists(int iOrganizationID, String strFilename) throws SQLException
	{
		return DocumentData.checkFilenameExists(iOrganizationID, strFilename);
	}
  
	public static void updateStatusOfDocsInSource(int iDocumentSourceID, int iDocumentStatusID, int lNumberOfDocsToUpdate) throws SQLException
	{
		DocumentData.updateStatusOfDocsInSource(iDocumentSourceID, iDocumentStatusID, lNumberOfDocsToUpdate);
    }
}