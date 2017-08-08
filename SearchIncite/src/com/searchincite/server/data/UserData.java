package com.searchincite.server.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class UserData {

	public static ResultSet getUsersForOrganization(int iOrganizationID) throws SQLException {

		Connection db = SIDB.getConnection();
		db.setAutoCommit(false);
		PreparedStatement ps = db.prepareCall("SELECT * FROM ontology.spgetorgusers(?)");
	    ps.setInt(1, iOrganizationID);
	    ResultSet rs = ps.executeQuery();
	    
		// Move to first row, which is a ResultSet containing users
		if (!rs.next()) {
			return null;			
		}

		// Return reference to first ResultSet (users)
		return (ResultSet)rs.getObject(1);
	}  
	
	public static ResultSet getUserByID(int iUserID, long lFieldMask) throws SQLException {

		Connection db = SIDB.getConnection();
		db.setAutoCommit(false);
		PreparedStatement ps = db.prepareStatement("SELECT * FROM ontology.spgetuserbyid(?)");
		
		ps.setInt(1, iUserID);
	    
	    ResultSet rs = ps.executeQuery();
	    
	    return rs;
	}	

	public static int getUserIDByGuid(String strGuid) throws SQLException {

		Connection db = SIDB.getConnection();
		db.setAutoCommit(false);
		PreparedStatement ps = db.prepareStatement("SELECT ontology.spgetuseridbyguid(?)");
		
		ps.setString(1, strGuid);
	    
	    ResultSet rs = ps.executeQuery();

	    int iUserID = -1;

	    if (rs.next()) {
	    	iUserID = rs.getInt(1);
	    	rs.close();
	    }
	    
	    if (iUserID == 0) {
	    	iUserID = -1;
	    }
	    
	    db.commit();
	    ps.close();
	    db.close();
	    
	    return iUserID;
	}	

	public static int createUser(int iOrgID, String strUsername, String strPassword, 
			String strFirstName, String strMiddleName, String strLastName, String strTelephone,
			String strEMailAddress, int iCreatedByUserID, boolean bActive,
			Date dtExpiration, int[] iArrSecurityRoleIDs) throws SQLException {

		Connection db = SIDB.getConnection();
		db.setAutoCommit(false);
		PreparedStatement ps = db.prepareStatement("SELECT ontology.spcreateuser(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

		/*
		//ontology.spcreateuser(
		porg_id integer, 
		puser_name text, 
		puser_password text, 
		pfirst_name text, 
		pmiddle_name text, 
		plast_name text, 
		ptelephone text, 
		pemail_address text, 
		puser_id integer, 
		pactive boolean, 
		pexpiration_date timestamp without time zone)
		*/
		ps.setInt(1, iOrgID);
		ps.setString(2, strUsername);
		ps.setString(3, strPassword);
		ps.setString(4, strFirstName);
		ps.setString(5, strMiddleName);
		ps.setString(6, strLastName);
		ps.setString(7, strTelephone);
		ps.setString(8, strEMailAddress);
		ps.setInt(9, iCreatedByUserID);
		ps.setBoolean(10, bActive);
		
		if (dtExpiration != null) {
			SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm");
			ps.setString(11, format.format(dtExpiration));
		}
		else {
			ps.setNull(11, Types.VARCHAR);
		}
	    
	    ResultSet rs = ps.executeQuery();

	    int iNewID = -1;

	    if (rs.next()) {
	    	iNewID = rs.getInt(1);
	    	rs.close();
	    }
	    
	    db.commit();
	    ps.close();
	    db.close();
	    
	    if (iArrSecurityRoleIDs != null) {
	    	setSecurityRolesForUser(iNewID, iCreatedByUserID, iArrSecurityRoleIDs);
	    }
	    
	    return iNewID;
	}	

	public static int createUser(int iOrgID, String strUsername, String strPassword, 
			String strFirstName, String strMiddleName, String strLastName, String strTelephone,
			String strEMailAddress, int iCreatedByUserID, boolean bActive,
			Date dtExpiration, int[] iArrSecurityRoleIDs, String strGuid) throws SQLException {

		Connection db = SIDB.getConnection();
		db.setAutoCommit(false);
		PreparedStatement ps = db.prepareStatement("SELECT ontology.spcreateuser(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

		/*
		//ontology.spcreateuser(
		porg_id integer, 
		puser_name text, 
		puser_password text, 
		pfirst_name text, 
		pmiddle_name text, 
		plast_name text, 
		ptelephone text, 
		pemail_address text, 
		puser_id integer, 
		pactive boolean, 
		pexpiration_date timestamp without time zone)
		*/
		ps.setInt(1, iOrgID);
		ps.setString(2, strUsername);
		ps.setString(3, strPassword);
		ps.setString(4, strFirstName);
		ps.setString(5, strMiddleName);
		ps.setString(6, strLastName);
		ps.setString(7, strTelephone);
		ps.setString(8, strEMailAddress);
		ps.setInt(9, iCreatedByUserID);
		ps.setBoolean(10, bActive);
		
		if (dtExpiration != null) {
			SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm");
			ps.setString(11, format.format(dtExpiration));
		}
		else {
			ps.setNull(11, Types.VARCHAR);
		}

		ps.setString(12, strGuid);

	    ResultSet rs = ps.executeQuery();

	    int iNewID = -1;

	    if (rs.next()) {
	    	iNewID = rs.getInt(1);
	    	rs.close();
	    }
	    
	    db.commit();
	    ps.close();
	    db.close();
	    
	    if (iArrSecurityRoleIDs != null) {
	    	setSecurityRolesForUser(iNewID, iCreatedByUserID, iArrSecurityRoleIDs);
	    }
	    
	    return iNewID;
	}	

	public static void setUserActiveStatus(int iUserID, boolean bActive, int iModifiedByUserID) throws SQLException {

		Connection db = SIDB.getConnection();
		db.setAutoCommit(false);
		PreparedStatement ps = db.prepareStatement("SELECT ontology.spupdateusersactiveflag(?, ?, ?)");
		
		ps.setInt(1, iUserID);
		ps.setBoolean(2, bActive); 
		ps.setInt(3, iModifiedByUserID);
	    
	    ps.execute();
	    db.commit();
	    ps.close();
	    db.close();
	}	

	public static void updateUser(int iUserID, int iOrganizationID, String strUsername, String strPassword, 
			String strFirstName, String strMiddleName, String strLastName, String strTelephone,
			String strEMailAddress, boolean bChangePasswordOnLogin, int iModifiedByUserID, boolean bActive,
			Date dtExpiration, int[] iArrSecurityRoleIDs) throws SQLException {

		Connection db = SIDB.getConnection();
		db.setAutoCommit(false);
		PreparedStatement ps = db.prepareStatement("SELECT ontology.spupdateuser(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

		ps.setInt(1, iUserID);
		ps.setInt(2, iOrganizationID);
		ps.setString(3, strUsername);
		ps.setString(4, strPassword);
		ps.setString(5, strFirstName);
		ps.setString(6, strLastName);
		ps.setString(7, strMiddleName);
		ps.setString(8, strTelephone);
		ps.setString(9, strEMailAddress);
		ps.setInt(10, bChangePasswordOnLogin ? 1 : 0);
		ps.setBoolean(11, bActive);
		
		if (dtExpiration != null) {
			SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm");
			ps.setString(12, format.format(dtExpiration));
		}
		else {
			ps.setNull(12, Types.VARCHAR);
		}

		ps.setInt(13, iModifiedByUserID);

		ps.execute();
	    db.commit();
	    ps.close();
	    db.close();
	    
	    if (iArrSecurityRoleIDs != null) {
	    	setSecurityRolesForUser(iUserID, iModifiedByUserID, iArrSecurityRoleIDs);
	    }
	}	

	public static ArrayList getSecurityRolesForUser(int iUserID) throws SQLException {
		return com.searchincite.server.security.Authorization.getSecurityRolesForUser(iUserID);
	}
	
	public static boolean isUserInSecurityRole(int iUserID, int iSecurityRoleID) {
		return com.searchincite.server.security.Authorization.isUserInSecurityRole(iUserID, iSecurityRoleID);
	}

	public static void deleteUserRoles(int iUserID) throws SQLException {
		
		Connection db = SIDB.getConnection();
		db.setAutoCommit(false);
		PreparedStatement ps = db.prepareCall("DELETE FROM ontology.user_role WHERE user_id = ?");
		ps.setInt(1, iUserID);
		ps.execute();
	    db.commit();
	    ps.close();
	    db.close();
	}  

	public static ResultSet getAllUsers() throws SQLException {

		Connection db = SIDB.getConnection();
		db.setAutoCommit(false);
		PreparedStatement ps = db.prepareCall("SELECT * FROM ontology.spgetallusers()");
	    ResultSet rs = ps.executeQuery();
	    
		// Move to first row, which is a ResultSet containing users
		if (!rs.next()) {
			return null;			
		}

		// Return reference to first ResultSet (users)
		return (ResultSet)rs.getObject(1);
	}  
	
	public static void setSecurityRolesForUser(int iUserIDToUpdate, int iCallingUserID, int[] iArrSecurityRoleIDs) throws SQLException {
		
		Connection db = SIDB.getConnection();
		db.setAutoCommit(false);

		String strRoleIDs = "";
		
		for (int i = 0; i < iArrSecurityRoleIDs.length; i++) {
			strRoleIDs += strRoleIDs.length() > 0 ? "," : ""; 
			strRoleIDs += String.valueOf(iArrSecurityRoleIDs[i]); 
		}

		PreparedStatement ps = db.prepareStatement("SELECT ontology.spsetuserroles(?, ?, array[" + strRoleIDs + "]);");
		
		ps.setInt(1, iUserIDToUpdate); //user being changed
		ps.setInt(2, iCallingUserID); //user making change
	    
	    ps.execute();
	    db.commit();
	    ps.close();
	    db.close();
	}
	
	public static ResultSet getLastWizardRunInfo(int iOrganizationID) throws SQLException {

		Connection db = SIDB.getConnection();
		db.setAutoCommit(false);
		PreparedStatement ps = db.prepareCall("SELECT * FROM ontology.spgetlastestwizardrun(?)");

		ps.setInt(1, iOrganizationID);
	    ResultSet rs = ps.executeQuery();
	    
		// Move to first row, which is a ResultSet containing users
		if (!rs.next()) {
			return null;			
		}

		// Return reference to first ResultSet (users)
		return (ResultSet)rs.getObject(1);
	}  


	public static void completeNewUserWizard(
			int iCallingUserID,
			String strEmailAddress,
			String strOrganizationName,
			String strUsername,
			String strPassword,
			int iOntologyID,
			String strEmailBody,
			Date dtExpiration
			) throws SQLException {
		
		Connection db = SIDB.getConnection();
		db.setAutoCommit(false);

		PreparedStatement ps = db.prepareCall("SELECT ontology.spcreatenewuserwizard(?, ?, ?, ?, ?, ?, ?, ?)");
		
		ps.setInt(1, iCallingUserID);
		ps.setString(2, strEmailAddress);
		ps.setString(3, strOrganizationName);
		ps.setString(4, strUsername);
		ps.setString(5, strPassword);
		ps.setInt(6, iOntologyID);
		ps.setString(7, strEmailBody);

		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm");
		ps.setString(8, format.format(dtExpiration));

		ps.execute();
	    db.commit();
	    ps.close();
	    db.close();
	}  

}
