package com.searchincite.server.data;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PhraseData {
	
	public static int createPhrase(int iSubjectID, String strName, String strColor, double dWeight, int iUserID) throws SQLException {

		Connection db = SIDB.getConnection();
		db.setAutoCommit(false);
		PreparedStatement ps = db.prepareStatement("SELECT ontology.spcreatephrase(?, ?, ?, ?, ?)");

		//(psubject_id integer, pname text, pcolor text, pweight numeric, puser_id integer)		
		ps.setInt(1, iSubjectID);
		ps.setString(2, strName);
		ps.setString(3, ""); // TODO: Phrases have colors? 
		ps.setBigDecimal(4, new BigDecimal(dWeight));
		ps.setInt(5, iUserID);
	    
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

	public static void deletePhrase(int iPhraseID, int iOrgID) throws SQLException {

		Connection db = SIDB.getConnection();
		db.setAutoCommit(false);
		PreparedStatement ps = db.prepareStatement("SELECT ontology.spdeletephrase(?, ?)");
		
		ps.setInt(1, iPhraseID);
		ps.setInt(2, iOrgID); //Pass OrgID for added security
	    
	    ps.execute();
	    db.commit();
	    ps.close();
	    db.close();
	}	

	public static void updatePhrase(int iPhraseID, String strName, String strColor, double dWeight, int iUserID) throws SQLException {

		//(pphrase_id integer, pname text, pcolor text, pweight numeric, puser_id integer)
		Connection db = SIDB.getConnection();
		db.setAutoCommit(false);
		PreparedStatement ps = db.prepareStatement("SELECT ontology.spupdatephrase(?, ?, ?, ?, ?)");
		
		ps.setInt(1, iPhraseID);
		ps.setString(2, strName);
		ps.setString(3, strColor);
		ps.setBigDecimal(4, new BigDecimal(dWeight));
		ps.setInt(5, iUserID);
	    
		ps.execute();
	    db.commit();
	    ps.close();
	    db.close();
	}	

}
