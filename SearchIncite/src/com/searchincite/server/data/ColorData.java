package com.searchincite.server.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ColorData {

	public static ResultSet getColors(int x) throws SQLException {

		Connection db = SIDB.getConnection();
		PreparedStatement ps = db.prepareCall("SELECT * FROM ontology.some_table WHERE some_field = ?");
	    ps.setInt(1, x);
	    return ps.executeQuery();
	}  

}
