package com.searchincite.server.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.searchincite.client.entity.DocumentSource;

public class DocumentSourceData {
	
	public static ResultSet getDocumentSourcesForOrganiztaion(int iOrganizationID) throws SQLException {
		
		Connection db = SIDB.getConnection();
		//PreparedStatement ps = db.prepareCall("{ call ontology.spGetOrgOntologies(?) }");
		db.setAutoCommit(false);

		//PreparedStatement ps = db.prepareStatement("SELECT * FROM ontology.ontology WHERE category_id = ?");
	    PreparedStatement ps = db.prepareCall("SELECT * FROM ontology.spgetorgdocumentsources(?)");

		ps.setInt(1, iOrganizationID);

		ResultSet rs = ps.executeQuery();
		
		return rs;
	}  
	
	public static int createDocumentSource(int iOrganizationID, String strSource, int[] iArrOntologyIDs, int iUserID) throws SQLException {

		Connection db = SIDB.getConnection();
		db.setAutoCommit(false);
		
		// Generate comma-delimited list of ontology_ids
		String strOntologyIDs = "";
		
		for (int i = 0; i < iArrOntologyIDs.length; i++) {
			strOntologyIDs += strOntologyIDs.length() > 0 ? "," : ""; 
			strOntologyIDs += String.valueOf(iArrOntologyIDs[i]); 
		}
		
		//select * from ontology.arraytest(array[1,2,3,4,5]);

		PreparedStatement ps = db.prepareStatement("SELECT ontology.spcreatedocumentsource(?, ?, ?, array[" + strOntologyIDs + "]);");
		//porg_id integer, pdocument_source text, puser_id integer
		ps.setInt(1, iOrganizationID);
		ps.setString(2, strSource);
		ps.setInt(3, iUserID);
		//ps.setObject(4, new int[] { 1 }, Types.ARRAY); //.setArray(4, new Ontology[] { new Ontology() });
		
	    ResultSet rs = ps.executeQuery();

	    int iNewID = -1;

	    if (rs.next()) {
	    	iNewID = rs.getInt(1);
	    	rs.close();
	    }
	    
	    db.commit();
	    ps.close();
	    db.close();
	    
	    return iNewID;
	}	

	public static void deleteDocumentSource(int iDocumentSourceID, int iOrgID) throws SQLException {

		Connection db = SIDB.getConnection();
		db.setAutoCommit(false);
		PreparedStatement ps = db.prepareStatement("SELECT ontology.spdeletedocumentsource(?)");
		
		ps.setInt(1, iDocumentSourceID);
		//ps.setInt(2, iOrgID); //TODO: Pass OrgID for added security
	    
	    ps.execute();
	    db.commit();
	    ps.close();
	    db.close();
	}	

	public static void updateDocumentSource(int iDocumentSourceID, int iOrganizationID, String strSource, int[] iArrOntologyIDs, int iUserID) throws SQLException {

		/*
		//spupdatedocumentsource(pdocument_source_id integer, porg_id integer, pdocument_source text, puser_id integer)
		Connection db = SIDB.getConnection();
		db.setAutoCommit(false);
		PreparedStatement ps = db.prepareStatement("SELECT ontology.spupdatedocumentsource(?, ?, ?, ?)");
		
		ps.setInt(1, iDocumentSourceID);
		ps.setInt(2, iOrganizationID);
		ps.setString(3, strSource);
		ps.setInt(4, iUserID);
	    
		ps.execute();
	    db.commit();
	    ps.close();
	    db.close();
	    */
	    
		Connection db = SIDB.getConnection();
		db.setAutoCommit(false);
		
		// Generate comma-delimited list of ontology_ids
		String strOntologyIDs = "";
		
		for (int i = 0; i < iArrOntologyIDs.length; i++) {
			strOntologyIDs += strOntologyIDs.length() > 0 ? "," : ""; 
			strOntologyIDs += String.valueOf(iArrOntologyIDs[i]); 
		}
		
		PreparedStatement ps = db.prepareStatement("SELECT ontology.spupdatedocumentsource(?, ?, ?, ?, array[" + strOntologyIDs + "]);");

		ps.setInt(1, iDocumentSourceID);
		ps.setInt(2, iOrganizationID);
		ps.setString(3, strSource);
		ps.setInt(4, iUserID);
		
		ps.execute();
	    db.commit();
	    ps.close();
	    db.close();
	}	


	public static ResultSet getDocumentSourceByID(int iDocumentSourceID, long lFieldMask) throws SQLException {
		
		Connection db = SIDB.getConnection();
		db.setAutoCommit(false);
		PreparedStatement ps = db.prepareStatement("SELECT * FROM ontology.spgetdocumentsourcebyid(?, ?)");

		ps.setInt(1, iDocumentSourceID);
	    
	    int iResultSets = 1; // number of result sets returned by the procedure
		 // 1st RS is document source, 2nd is ONTOLOGIES * !!! NOTE !!! THIS IS DIFFERENT THAN OTHER FUNCTIONS !!! 
	     // 3rd RS is DOCUMENTS * !!! NOTE !!! THIS IS DIFFERENT THAN OTHER FUNCTIONS !!!
	     // Passing 2 (TWO) here will return THREE result sets -> document sources, ontologies, and documents!
	    if ((lFieldMask & DocumentSource.FIELD_DOCUMENTS) == DocumentSource.FIELD_DOCUMENTS) {
	    	iResultSets++; // 2
	    }

	    ps.setInt(2, iResultSets);

	    ResultSet rs = ps.executeQuery();
	    
	    return rs;
	}  

}
