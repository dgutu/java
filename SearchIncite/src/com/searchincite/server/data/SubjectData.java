package com.searchincite.server.data;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.searchincite.client.entity.Subject;

public class SubjectData {
	
	public static ResultSet getSubjectsForOntology(int iOntologyID) throws SQLException {
		
		Connection db = SIDB.getConnection();
		//PreparedStatement ps = db.prepareStatement("SELECT count(*) as record_count, name, color, weight, creation_date, created_by, last_modified_date, last_modified_by FROM ontology.subject WHERE ontology_id = ? GROUP BY ontology_id, name, color, weight, creation_date, created_by, last_modified_date, last_modified_by ORDER BY name");
		PreparedStatement ps = db.prepareStatement("SELECT * FROM spgetontologysubjectcounts(?)");
		//ontology.spgetontologysubjectcounts(pontology_id integer)
		ps.setInt(1, iOntologyID);
	    
		ResultSet rs = ps.executeQuery();
		
		return rs;
	}  
	
	public static int createSubject(int iOntologyID, String strName, String strColor, double dWeight, int iUserID, boolean bActive) throws SQLException {

		Connection db = SIDB.getConnection();
		db.setAutoCommit(false);
		PreparedStatement ps = db.prepareStatement("SELECT ontology.spcreatesubject(?, ?, ?, ?, ?, ?)");

		//(pontology_id integer, pname text, pcolor text, pweight numeric, puser_id integer)
		ps.setInt(1, iOntologyID);
		ps.setString(2, strName);
		ps.setString(3, strColor);
		ps.setBigDecimal(4, new BigDecimal(dWeight));
		ps.setBoolean(5, true); //TODO: Set value based on subject.Active 
		ps.setInt(6, iUserID);
	    
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

	public static void deleteSubject(int iSubjectID, int iOrgID) throws SQLException {

		Connection db = SIDB.getConnection();
		db.setAutoCommit(false);
		PreparedStatement ps = db.prepareStatement("SELECT ontology.spdeletesubject(?, ?)");
		
		ps.setInt(1, iSubjectID);
		ps.setInt(2, iOrgID); //Pass OrgID for added security
	    
	    ps.execute();
	    db.commit();
	    ps.close();
	    db.close();
	}	

	public static void updateSubject(int iSubjectID, String strName, String strColor, double dWeight, int iUserID, boolean bActive) throws SQLException {

		//psubject_id integer, pname text, pcolor text, pweight numeric, puser_id integer)
		Connection db = SIDB.getConnection();
		db.setAutoCommit(false);
		PreparedStatement ps = db.prepareStatement("SELECT ontology.spupdatesubject(?, ?, ?, ?, ?, ?)");
		
		ps.setInt(1, iSubjectID);
		ps.setString(2, strName);
		ps.setString(3, strColor);
		ps.setBigDecimal(4, new BigDecimal(dWeight));
		ps.setBoolean(5, bActive); 
		ps.setInt(6, iUserID);
	    
		ps.execute();
	    db.commit();
	    ps.close();
	    db.close();
	}	

	public static ResultSet getSubjectByID(int iSubjectID, long lFieldMask) throws SQLException {
		
		Connection db = SIDB.getConnection();
		db.setAutoCommit(false);
		PreparedStatement ps = db.prepareStatement("SELECT * FROM ontology.spgetsubjectbyid(?, ?)");
	    ps.setInt(1, iSubjectID);
	    
	    int iResultSets = 1; // number of result sets returned by the procedure
		 // (1st RS is subject, 2nd is phrases)

	    if ((lFieldMask & Subject.FIELD_PHRASES) == Subject.FIELD_PHRASES) {
	    	iResultSets++; // 2
	    }

	    ps.setInt(2, iResultSets);

	    ResultSet rs = ps.executeQuery();
	    
	    return rs;
	}  

}
