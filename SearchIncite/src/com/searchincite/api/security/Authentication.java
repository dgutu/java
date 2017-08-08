package com.searchincite.api.security;

import com.searchincite.api.entity.User;
import com.searchincite.server.data.SIDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Authentication
{	
	// logger
	private final static Logger log = Logger.getLogger(Authentication.class.getName());	
	
	public static User authenticateUser(String strUserName, String strPassword) throws SQLException {
		User u = null;	
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		ResultSet rsUser = null; 
		
		try {
			conn = SIDB.getConnection();			
			
			if (conn != null) {
				conn.setAutoCommit(false);
				
				ps = conn.prepareStatement("SELECT * FROM ontology.sploginuser2(?, ?)");
				ps.setString(1, strUserName);    
				ps.setString(2, strPassword);
			
				rs = ps.executeQuery();
				if (rs != null && rs.next())
				{
					rsUser = (ResultSet)rs.getObject(1);
					if (rsUser.next())
					{
						u = new User();        
						u.setName(rsUser.getString("first_name"), rsUser.getString("last_name"));
						u.setOrganizationID(rsUser.getInt("org_id"));        
						u.setUserID(rsUser.getInt("user_id"));
						u.setSIAdmin(rsUser.getInt("isUserSIAdmin"));
						u.setOrganizationAdmin(rsUser.getInt("isUserOrgAdmin"));
						u.setOntologyUser(rsUser.getInt("isUserOntologyUser"));
						u.setOntologyBuilder(rsUser.getInt("isUserOntologyBuilder"));
						u.setDemoUser(rsUser.getInt("isDemoUser"));
						u.setNobody(rsUser.getInt("isNobody"));
					}	
					rsUser.close();				
				}
			}
		}
		catch(Exception ex) {
			log.log(Level.SEVERE, ex.getMessage());
		}
		finally {
			try {
				if (conn != null) {
					conn.commit();
					conn.close();
				}
				if (ps != null)
					ps.close();
				if (rs != null)
					rs.close();
				if (rsUser != null)
					rsUser.close();				
				
			}
			catch(Exception ex) {
				log.log(Level.SEVERE, ex.getMessage());
			}
		}
		
		return u;
	}
	
	public static User authenticateUser_old(String strUserName, String strPassword) throws SQLException
	{
		User u = null;			
		Connection db = null;
		
		ResourceBundle bdl = ResourceBundle.getBundle("com.searchincite.server/db");    
		String database = bdl.getString("database");    
		String username = bdl.getString("username");    
		String password = bdl.getString("password");    
		String driver = bdl.getString("driver");    
		String url = bdl.getString("url");
		
		log.log(Level.INFO, "database={0}", database);
		log.log(Level.INFO, "username={0}", username);
		log.log(Level.INFO, "password={0}", password);
		log.log(Level.INFO, "driver={0}", driver);
		log.log(Level.INFO, "url={0}", url);
		
		try
		{
			Class.forName(driver);
		}
		catch (ClassNotFoundException e1)
		{
			String error = "Failed to connect to database. (Driver class not found.) Exception: " + e1.getMessage();
			log.log(Level.SEVERE, error);
			throw new SQLException(error);
		}		
		
		db = DriverManager.getConnection(url + ":" + database, username, password);
		
		if (db == null)
			db = DriverManager.getConnection(url + ":" + database, username, password);
		
		try {
			if (db != null) {			    
				db.setAutoCommit(false);
			
				//PreparedStatement ps = db.prepareStatement("SELECT * FROM ontology.sploginuser (?, ?)");    
				PreparedStatement ps = db.prepareStatement("SELECT * FROM ontology.sploginuser2(?, ?)");
				ps.setString(1, strUserName);    
				ps.setString(2, strPassword);
			
				ResultSet rs = ps.executeQuery();
				if (rs != null && rs.next())
				{
					
					log.log(Level.INFO, "here");
					ResultSet rsUser = (ResultSet)rs.getObject(1);
					if (rsUser.next())
					{
						u = new User();        
						u.setName(rsUser.getString("first_name"), rsUser.getString("last_name"));
						log.log(Level.INFO, u.getFirstName() + " " + u.getLastName());
						u.setOrganizationID(rsUser.getInt("org_id"));        
						u.setUserID(rsUser.getInt("user_id"));
						u.setSIAdmin(rsUser.getInt("isUserSIAdmin"));
						u.setOrganizationAdmin(rsUser.getInt("isUserOrgAdmin"));
						u.setOntologyUser(rsUser.getInt("isUserOntologyUser"));
						u.setOntologyBuilder(rsUser.getInt("isUserOntologyBuilder"));
						u.setDemoUser(rsUser.getInt("isDemoUser"));
						u.setNobody(rsUser.getInt("isNobody"));
					}	
					rsUser.close();				
				}
				
				db.commit();
				db.close();
				if (ps != null)
					ps.close();
				if (rs != null)
					rs.close();
			}
		}
		catch (Exception e) {
			log.log(Level.SEVERE, e.getLocalizedMessage());			
		}
		
		return u;
    }
}
