package com.searchincite.server.entity.manager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.searchincite.client.entity.WebUser;

public class UserManager {
	
	// logger
	private final static Logger log = Logger.getLogger(UserManager.class.getName());		

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static WebUser[] getUsersForOrganization(int iOrganizationID, long lFieldMask) throws SQLException {
		
		ResultSet rs = com.searchincite.server.data.UserData.getUsersForOrganization(iOrganizationID);
		
		ArrayList arrUsers = new ArrayList();
		
		while (rs.next()) {
			WebUser u = deserialize(rs, lFieldMask);
			arrUsers.add(u);
		}
		
		rs.getStatement().getConnection().close();
		rs.getStatement().close();
		rs.close();
		
		return((WebUser[])arrUsers.toArray((Object[])new WebUser[arrUsers.size()]));
	}
	
	public static WebUser deserialize(ResultSet rs, long lFieldMask) throws SQLException {

		WebUser u = new WebUser();
		
		//TODO: Deserialize only fields in lFieldMask
		
		u.setUserID(rs.getInt("user_id"));
		u.setOrganizationID(rs.getInt("org_id"));
		u.setFirstName(rs.getString("first_name"));
		u.setMiddleName(rs.getString("middle_name"));
		u.setLastName(rs.getString("last_name"));
		u.setUsername(rs.getString("user_name"));
		u.setTelephone(rs.getString("telephone"));
		u.setEMailAddress(rs.getString("email_address"));
		
		//u.setExpiration(rs.getTimestamp("expiration_date"));
		//u.setExpiration(new java.util.Date(rs.getTimestamp("expiration_date").getTime()));

		if (rs.getTimestamp("expiration_date") != null) {
			u.setExpiration(new java.util.Date(rs.getTimestamp("expiration_date").getTime()));
		}
		else {
			u.setExpiration(null);
		}
		u.setChangePasswordOnLogin(rs.getBoolean("change_password_on_login"));
		u.setActive(rs.getBoolean("active"));
		u.setPassword(rs.getString("user_password"));
		u.setCreatedByUserID(rs.getInt("created_by"));
		u.setLastModifiedByUserID(rs.getInt("last_modified_by"));
		u.setDateCreated(new java.util.Date(rs.getDate("creation_date").getTime()));
		u.setLastModifiedDate(new java.util.Date(rs.getDate("last_modified_date").getTime()));
		u.setOrganizationName(rs.getString("name"));

		if (u.getExpiration() != null && u.getExpiration().before(new java.util.Date())) {
			u.setStatus("Expired");
		}
		else if (!u.getActive()) {
			u.setStatus("Inactive");
		}
		else {
			u.setStatus("Active");
		}

		return u;
	}
	
	public static WebUser createUser(WebUser u) throws SQLException {

		if (u.getCreatedByUserID() <= 0) {
			return null;			
		}
		
		int iNewID = com.searchincite.server.data.UserData.createUser(
				u.getOrganizationID(), u.getUsername(), u.getPassword(), 
				u.getFirstName(), u.getMiddleName(), u.getLastName(),
				u.getTelephone(), u.getEMailAddress(),
				u.getCreatedByUserID(), u.getActive(), u.getExpiration(), u.getSecurityRoleIDs());

		u.setUserID(iNewID);

		return u;
	}

	public static WebUser createUserWithGuid(WebUser u) throws SQLException {

		if (u.getCreatedByUserID() <= 0) {
			return null;			
		}
		
		int iNewID = com.searchincite.server.data.UserData.createUser(
				u.getOrganizationID(), u.getUsername(), u.getPassword(), 
				u.getFirstName(), u.getMiddleName(), u.getLastName(),
				u.getTelephone(), u.getEMailAddress(),
				u.getCreatedByUserID(), u.getActive(), u.getExpiration(), u.getSecurityRoleIDs(),
				u.getGuid());

		u.setUserID(iNewID);

		return u;
	}

	public static void setUserActiveStatus(int iUserID, boolean bActive, int iModifiedByUserID) throws SQLException {
		com.searchincite.server.data.UserData.setUserActiveStatus(iUserID, bActive, iModifiedByUserID); 
	}

	public static void updateUser(WebUser u) throws SQLException {

		com.searchincite.server.data.UserData.updateUser(
				u.getUserID(), u.getOrganizationID(), u.getUsername(), u.getPassword(), 
				u.getFirstName(), u.getMiddleName(), u.getLastName(),
				u.getTelephone(), u.getEMailAddress(), u.getChangePasswordOnLogin(),
				u.getLastModifiedByUserID(), u.getActive(), u.getExpiration(), u.getSecurityRoleIDs());
	}

	public static void deleteUserRoles(int iUserID) throws SQLException {

		com.searchincite.server.data.UserData.deleteUserRoles(iUserID);
	}

	public static WebUser getUserByID(int iUserID, long lFieldMask) throws SQLException {
		
		ResultSet rs = com.searchincite.server.data.UserData.getUserByID(iUserID, lFieldMask);

		// Move to first row, which is a ResultSet containing users (ONE User -- hopefully!)
		if (!rs.next()) {
			return null;			
		}

		// Get reference to first ResultSet (users)
		ResultSet rsUser = (ResultSet)rs.getObject(1);
			
		WebUser u = null;
		
		if (rsUser.next()) {
			u = deserialize(rsUser, lFieldMask);
		}
		//else {
			// User wasn't found (invalid user_id?)
		//	return null;
		//}

		rs.getStatement().getConnection().close();
		rs.getStatement().close();
		rs.close();

		return u;
	}

	public static WebUser getUserByGuid(String strGuid, long lFieldMask) throws SQLException {
		
		return UserManager.getUserByID(com.searchincite.server.data.UserData.getUserIDByGuid(strGuid), lFieldMask);
	}

	public static ArrayList getSecurityRolesForUser(int iUserID) throws SQLException {
		return com.searchincite.server.security.Authorization.getSecurityRolesForUser(iUserID);
	}
	
	public static boolean isUserInSecurityRole(int iUserID, int iSecurityRoleID) {
		return com.searchincite.server.security.Authorization.isUserInSecurityRole(iUserID, iSecurityRoleID);
	}

	public static boolean isSIAdmin(int iUserID) {
		//log.log(Level.INFO, "iUserID={0}", iUserID);	
		
		boolean isSIAdmin = false;		
		isSIAdmin = com.searchincite.server.security.Authorization.isSIAdmin(iUserID);
		return isSIAdmin;
	}

	public static boolean isOrganizationAdmin(int iUserID) {
		return com.searchincite.server.security.Authorization.isOrganizationAdmin(iUserID);
	}

	public static boolean isSIorOrganizationAdmin(int iUserID) {
		return com.searchincite.server.security.Authorization.isSIorOrganizationAdmin(iUserID);
	}

	public static WebUser[] getAllUsers(long lFieldMask) throws SQLException {
		
		ResultSet rs = com.searchincite.server.data.UserData.getAllUsers();
		
		ArrayList arrUsers = new ArrayList();
		
		while (rs.next()) {
			WebUser u = deserialize(rs, lFieldMask);
			arrUsers.add(u);
		}
		
		rs.getStatement().getConnection().close();
		rs.getStatement().close();
		rs.close();
		
		return((WebUser[])arrUsers.toArray((Object[])new WebUser[arrUsers.size()]));
	}

	public static ArrayList getAllSecurityRoles() throws SQLException {
		return com.searchincite.server.security.Authorization.getAllSecurityRoles();
	}


}
