package com.searchincite.server.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OrganizationData {
	
	public static ResultSet getOrganizations() throws SQLException {
		
		Connection db = SIDB.getConnection();
		db.setAutoCommit(false);

	    PreparedStatement ps = db.prepareCall("SELECT * FROM ontology.spgetorganizations()");
		ResultSet rs = ps.executeQuery();
		
		return rs;
	}  
	
	public static int createOrganization(String strOrgName, String strAddress1, String strAddress2, String strCity, String strState, String strPostalCode, int iUserID) throws SQLException {
		Connection db = SIDB.getConnection();
		db.setAutoCommit(false);
		
		PreparedStatement ps = db.prepareStatement("SELECT ontology.spcreateorg(?, ?, ?, ?, ?, ?, ?);");

		ps.setString(1, strOrgName);
		ps.setString(2, strAddress1);
		ps.setString(3, strAddress2);
		ps.setString(4, strCity);
		ps.setString(5, strState);
		ps.setString(6, strPostalCode);
		ps.setInt(7, iUserID);
		
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

	public static int createOrganization(String strOrgName, String strAddress1, String strAddress2, String strCity, String strState, String strPostalCode, int iUserID, String strGuid) throws SQLException {

		Connection db = SIDB.getConnection();
		db.setAutoCommit(false);
		
		PreparedStatement ps = db.prepareStatement("SELECT ontology.spcreateorg(?, ?, ?, ?, ?, ?, ?, ?);");

		ps.setString(1, strOrgName);
		ps.setString(2, strAddress1);
		ps.setString(3, strAddress2);
		ps.setString(4, strCity);
		ps.setString(5, strState);
		ps.setString(6, strPostalCode);
		ps.setInt(7, iUserID);
		ps.setString(8, strGuid);
		
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

	
	public static void deleteOrganization(int iOrganizationID) throws SQLException {

		Connection db = SIDB.getConnection();
		db.setAutoCommit(false);
		PreparedStatement ps = db.prepareStatement("SELECT ontology.spdeleteorganization(?)");
		
		ps.setInt(1, iOrganizationID);
	    
	    ps.execute();
	    db.commit();
	    ps.close();
	    db.close();
	}	

	public static void updateOrganization(int iOrganizationID, String strOrgName, String strAddress1, String strAddress2, String strCity, String strState, String strPostalCode, int iUserID) throws SQLException {

		Connection db = SIDB.getConnection();
		db.setAutoCommit(false);
		
		PreparedStatement ps = db.prepareStatement("SELECT ontology.spupdateorganization(?, ?, ?, ?, ?, ?, ?, ?);");

		ps.setInt(1, iOrganizationID);
		ps.setString(2, strOrgName);
		ps.setString(3, strAddress1);
		ps.setString(4, strAddress2);
		ps.setString(5, strCity);
		ps.setString(6, strState);
		ps.setString(7, strPostalCode);
		ps.setInt(8, iUserID);
		
		ps.execute();
	    db.commit();
	    ps.close();
	    db.close();
	}	


	public static ResultSet getOrganizationByID(int iOrganizationID, long lFieldMask) throws SQLException {
		
		Connection db = SIDB.getConnection();
		db.setAutoCommit(false);
		PreparedStatement ps = db.prepareStatement("SELECT * FROM ontology.spgetorganizationbyid(?)");

		ps.setInt(1, iOrganizationID);

	    ResultSet rs = ps.executeQuery();
	    
	    return rs;
	}  

}
