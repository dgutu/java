package com.searchincite.server.security;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.searchincite.client.data.constants.SecurityConstants;
import com.searchincite.client.entity.SecurityRole;
import com.searchincite.server.data.SIDB;

public class Authorization {

	// logger
	private final static Logger log = Logger.getLogger(Authorization.class.getName());	
	
	public static boolean isUserInSecurityRole(int iUserID, int iSecurityRoleID) {		
		try {
			ArrayList<SecurityRole> arrRoles = getSecurityRolesForUser(iUserID);
			
			if (arrRoles.isEmpty()) {
				return false;				
			}
			
			for (int i = 0; i < arrRoles.size(); i++) {
				SecurityRole role = (SecurityRole)arrRoles.get(i);
				if (role.getRoleID() == iSecurityRoleID) {					
					return true;
				}
			}
		} catch (SQLException e) {
			log.log(Level.SEVERE, e.getLocalizedMessage());
			return false;
		}
		
		return false;
	}

	public static ArrayList<SecurityRole> getSecurityRolesForUser(int iUserID) throws SQLException {		
		Connection db = null;
		PreparedStatement ps = null;
		ArrayList<SecurityRole> arrRoles = new ArrayList<SecurityRole>();
		ResultSet rs = null;
		ResultSet rsRoles = null;
		
		try {
			db = SIDB.getConnection();		
			
			if (db != null) {
				db.setAutoCommit(false);			
				ps = db.prepareStatement("SELECT * FROM ontology.spgetuserroles (?)");			
				ps.setInt(1, iUserID);
		
				rs = ps.executeQuery();
				
				if (rs.next()) {			
					rsRoles = (ResultSet)rs.getObject(1);
					while (rsRoles.next()) { 
						SecurityRole role = new SecurityRole();
						role.setRoleID(rsRoles.getInt("role_id"));
						role.setRoleName(rsRoles.getString("name"));
						arrRoles.add(role);
					}				
				}
			}
		}
		catch (Exception e) {
			log.log(Level.SEVERE, e.getLocalizedMessage());
		}
		finally {
			try {
				if (db != null) {
					db.commit();
					db.close();
				}
				if (ps != null)
					ps.close();
				if (rs != null)
					rs.close();
				if (rs != null)
					rsRoles.close();
			}
			catch (Exception ex) {
				log.log(Level.SEVERE, ex.getLocalizedMessage());
			}
		}		
		
		return arrRoles;
	}

	public static ArrayList<SecurityRole> getAllSecurityRoles() throws SQLException {
		
		Connection db = SIDB.getConnection();
		db.setAutoCommit(false);

		PreparedStatement ps = db.prepareStatement("SELECT * FROM ontology.spgetroles ()");
		
		ResultSet rs = ps.executeQuery();
		
		ArrayList<SecurityRole> arrRoles = new ArrayList<SecurityRole>();
		
		if (rs.next()) {
			
			ResultSet rsRoles = (ResultSet)rs.getObject(1);
			
			while (rsRoles.next()) { 
				SecurityRole role = new SecurityRole();
				role.setRoleID(rsRoles.getInt("role_id"));
				role.setRoleName(rsRoles.getString("name"));
				arrRoles.add(role);
			}

			rsRoles.close();
		}

		db.close();
		ps.close();
		rs.close();
		
		return arrRoles;
	}

	public static boolean isSIAdmin(int iUserID) {
		return isUserInSecurityRole(iUserID, SecurityConstants.ROLE_SI_ADMIN);
	}

	public static boolean isOrganizationAdmin(int iUserID) {
		return isUserInSecurityRole(iUserID, SecurityConstants.ROLE_ORGANIZATION_ADMIN);
	}

	public static boolean isSIorOrganizationAdmin(int iUserID) {
		
		ArrayList<SecurityRole> arrRoles = null;
		try {
			arrRoles = getSecurityRolesForUser(iUserID);
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		
		for (int i = 0; i < arrRoles.size(); i++) {
			SecurityRole sr = (SecurityRole)arrRoles.get(i);
			if (sr.getRoleID() == SecurityConstants.ROLE_SI_ADMIN ||
				sr.getRoleID() == SecurityConstants.ROLE_ORGANIZATION_ADMIN) {
			
				return true;
			}
		}

		return false;
	}
	
	public static boolean isOntologyBuilderUser(int iUserID) {
		
		ArrayList<SecurityRole> arrRoles = null;
		try {
			arrRoles = getSecurityRolesForUser(iUserID);
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		
		for (int i = 0; i < arrRoles.size(); i++) {
			SecurityRole sr = (SecurityRole)arrRoles.get(i);
			if (sr.getRoleID() == SecurityConstants.ROLE_ONTOLOGY_USER ||
				sr.getRoleID() == SecurityConstants.ROLE_ONTOLOGY_BUILDER) {
			
				return true;
			}
		}		
		return false;
	}
}
