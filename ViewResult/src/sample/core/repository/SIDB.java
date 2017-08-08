package sample.core.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class SIDB
{
  public static Connection getConnection()
    throws SQLException
  {
    Connection db = null;
    

    ResourceBundle bdl = ResourceBundle.getBundle("sample.core.repository/db");
    
    String database = bdl.getString("database");
    String username = bdl.getString("username");
    String password = bdl.getString("password");
    String driver = bdl.getString("driver");
    String url = bdl.getString("url");
    
    System.out.println("database="+database);
    System.out.println("username="+username);
    System.out.println("password="+password);
    System.out.println("driver="+driver);
    System.out.println("url="+url);
    
    try
    {
      Class.forName(driver);
    }
    catch (ClassNotFoundException e1)
    {
      throw new SQLException("Failed to connect to database. Exception: " + e1.getMessage());
    }
    db = DriverManager.getConnection(url + ":" + database, username, password);
    
    return db;
  }
}
