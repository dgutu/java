package com.searchincite.server.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.sql.DataSource;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class SIDB {

	private static final String JNDI_DATASOURCE = "java:comp/env/jdbc/siDB";
	
	private static Logger logger = Logger.getLogger(SIDB.class.getName());
	
	public static Connection getConnection_old() throws SQLException {

		Connection db = null;

		ResourceBundle bdl = ResourceBundle.getBundle("com.searchincite.server/db"); 
		
		String database = bdl.getString("database"); // "ontology"
		String username = bdl.getString("username"); // "ontology_app"
		String password = bdl.getString("password"); // "password"
		String driver = bdl.getString("driver"); // org.postgresql.Driver
		String url = bdl.getString("url"); // 
		
		/*String database = "//137.116.113.219:5432/ontology-prod";
		String username = "ontology_app";
		String password = "password"; 
		String driver = "org.postgresql.Driver";
		String url = "jdbc:postgresql"; */
		
		
	    /*System.out.println("database="+database);
	    System.out.println("username="+username);
	    System.out.println("password="+password);
	    System.out.println("driver="+driver);
	    System.out.println("url="+url);*/
	    /*Logger.getLogger(Authentication.class.getName()).log(Level.WARNING, null, "database="+database);
	    Logger.getLogger(Authentication.class.getName()).log(Level.WARNING, null, "username="+username);
	    Logger.getLogger(Authentication.class.getName()).log(Level.WARNING, null, "password="+password);
	    Logger.getLogger(Authentication.class.getName()).log(Level.WARNING, null, "driver="+driver);
	    Logger.getLogger(Authentication.class.getName()).log(Level.WARNING, null, "url="+url);*/		
		
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e1) {
			throw new SQLException("Failed to connect to database. Exception: " + e1.getMessage());
		} //load the driver
		
		try {
			//db = DriverManager.getConnection(url + ":" + database, username, password);
			//db = DriverManager.getConnection("jdbc:postgresql:"+database, username, password); //connect to the db
			db = DriverManager.getConnection(url + ":" + database, username, password);
		} catch (Exception ex) {
			//System.out.println(ex.getLocalizedMessage());
		}

		return db;
	} 
	
	public static Connection getConnection(){
		
		Connection conn = null;
		DataSource ds = null;
		
		try {
			// get DataSource
			ds = loadDataSource();
			
			if (ds != null) {
				conn = ds.getConnection();
			}			
		}
		catch(Exception ex) {
			logger.log(Level.SEVERE, ex.getMessage());
		}
		
		return conn;
	}
	
	private static DataSource loadDataSource() throws NamingException {		
		Context ctx = new InitialContext();
		DataSource ds = (DataSource) ctx.lookup(JNDI_DATASOURCE);
		return ds;
	}
	
	
	
}
