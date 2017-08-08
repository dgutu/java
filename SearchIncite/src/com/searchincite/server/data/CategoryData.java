package com.searchincite.server.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.searchincite.client.entity.Category;
import com.searchincite.client.entity.Ontology;

public class CategoryData {

	public static ResultSet getCategoriesForOrganization(int iOrganizationID) throws SQLException {

		Connection db = SIDB.getConnection();

		PreparedStatement ps = db.prepareCall("SELECT * FROM ontology.category WHERE org_id = ?");
	    ps.setInt(1, iOrganizationID);
	    return ps.executeQuery();
	}  
	
	public static ResultSet getCategoryByID(int iCategoryID, long lFieldMask) throws SQLException {

		Connection db = SIDB.getConnection();
		db.setAutoCommit(false);
		PreparedStatement ps = db.prepareStatement("SELECT * FROM ontology.spgetcategorybyid(?, ?)");
		//PreparedStatement ps = db.prepareStatement("SELECT * FROM ontology.category WHERE category_id = ?");
		
		ps.setInt(1, iCategoryID);
	    
	    int iResultSets = 1; // number of result sets returned by the procedure
		// (1st RS is category, 2ns is ontology, 3rd is subjects, 4th is phrases)

	    if ((lFieldMask & Category.FIELD_ONTOLOGIES) == Category.FIELD_ONTOLOGIES) {
	    	iResultSets++; // 2
	    }
	    if ((lFieldMask & Ontology.FIELD_SUBJECTS) == Ontology.FIELD_SUBJECTS) {
	    	iResultSets++; // 3
	    }
	    if ((lFieldMask & Ontology.FIELD_PHRASES) == Ontology.FIELD_PHRASES) {
	    	iResultSets++; // 4
	    }
	    
	    ps.setInt(2, iResultSets);

	    ResultSet rs = ps.executeQuery();
	    
	    return rs;
	}	

	public static int createCategory(int iOrgID, int iParentID, String strName, int iUserID) throws SQLException {

		Connection db = SIDB.getConnection();
		db.setAutoCommit(false);
		PreparedStatement ps = db.prepareStatement("SELECT ontology.spcreatecategory(?, ?, ?, ?)");
		//CallableStatement ps = db.prepareCall("{ ? = call ontology.spcreatecategory(?, ?, ?, ?) }");
		//ps.registerOutParameter(1, Types.INTEGER);

		ps.setInt(1, iOrgID);
		ps.setInt(2, iParentID);
		ps.setString(3, strName);
		ps.setInt(4, iUserID);
	    
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

	public static void deleteCategory(int iCategoryID, int iUserID, int iOrgID) throws SQLException {

		Connection db = SIDB.getConnection();
		db.setAutoCommit(false);
		PreparedStatement ps = db.prepareStatement("SELECT ontology.spdeletecategory(?, ?)");
		
		ps.setInt(1, iCategoryID);
		ps.setInt(2, iOrgID); //Pass OrgID for added security
	    
	    ps.execute();
	    db.commit();
	    ps.close();
	    db.close();
	}	

	public static void updateCategory(int iCategoryID, int iOrgID, int iParentID, String strName, int iUserID) throws SQLException {

		//ontology.spupdatecategory(
		//	pcategory_id integer,
		//		porg_id integer, pparent_id integer, pname text,
		//		puser_id integer)

		Connection db = SIDB.getConnection();
		db.setAutoCommit(false);
		PreparedStatement ps = db.prepareStatement("SELECT ontology.spupdatecategory(?, ?, ?, ?, ?)");
		
		ps.setInt(1, iCategoryID);
		ps.setInt(2, iOrgID);
		ps.setInt(3, iParentID);
		ps.setString(4, strName);
		ps.setInt(5, iUserID);
	    
	    //ResultSet rs = ps.executeQuery();

	    //if (rs.next()) {
	    	//iNewID = rs.getInt(1);
	    //	rs.close();
	    //}

		ps.execute();
	    db.commit();
	    ps.close();
	    db.close();
	}	

}
