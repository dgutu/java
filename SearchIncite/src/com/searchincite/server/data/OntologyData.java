package com.searchincite.server.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.searchincite.client.entity.Ontology;
import com.searchincite.client.entity.OntologyCSV;

public class OntologyData {

	// logger
	private final static Logger log = Logger.getLogger(OntologyData.class.getName());	
	
	public static ResultSet getOntologiesForOrganization(int iOrganizationID) throws SQLException {

		Connection db = getDBConnection();
		//Statement sql = db.createStatement();

		PreparedStatement ps = db.prepareCall("{ call ontology.spGetOrgOntologies(?) }");
	    ps.setInt(1, iOrganizationID);
	    return ps.executeQuery();
		
	    /*
		Ontology o = null;
		
		if (results != null) {

			//while (results.next()) {
			if (results.next()) {

				
				ResultSet subjResults = sql.executeQuery("SELECT count(*) as record_count, name, color, weight, creation_date, created_by, last_modified_date, last_modified_by FROM ontology.subject WHERE ontology_id = " + o.getOntologyID() + " GROUP BY ontology_id, name, color, weight, creation_date, created_by, last_modified_date, last_modified_by");

				if (subjResults != null) {
					
					ArrayList arrSubjects = new ArrayList();
					
					while (subjResults.next()) {

						Subject s = new Subject();
						s.setName(subjResults.getString("name"));
						//s.setColor(subjResults.getString("color"));
						s.setWeight(subjResults.getInt("weight"));

						s.setDateCreated(new java.util.Date(subjResults.getDate("creation_date").getTime()));
						s.setCreatedByUserID(subjResults.getInt("created_by"));
						
						// Serialization will fail and a JavaScript error will be 
						// displayed on the page if you do this:
						// s.setLastModifiedDate(subjResults.getDate("last_modified_date")); //DON'T DO THIS!
						// (Apparently, GWT can't serialize java.sql.Date even though it IS a java.util.Date.)
						
						s.setLastModifiedDate(new java.util.Date(subjResults.getDate("last_modified_date").getTime()));
						s.setLastModifiedByUserID(subjResults.getInt("last_modified_by"));

						if (arrSubjects == null) {
							arrSubjects = new ArrayList();
						}
						
						arrSubjects.add(s);
					}

					o.setSubjects((Subject[])arrSubjects.toArray((Object[])new Subject[arrSubjects.size()]));
					subjResults.close();
			    }
			    
			}
	    }
	    results.close();

		//ps.close();
	    db.close();

	    return o;
	    */
	}  
	
	public static ResultSet getOntologyByID(int iOntologyID, long lFieldMask) throws SQLException {
		log.log(Level.INFO, "iOntologyID={0}", iOntologyID);
		log.log(Level.INFO, "lFieldMask={0}", lFieldMask);

		Connection db = null;
		ResultSet rs = null;
		
		try {
			db = getDBConnection();
			
			if (db != null) {
				db.setAutoCommit(false);
				PreparedStatement ps = db.prepareStatement("SELECT * FROM ontology.spgetontologybyid(?, ?)");
			    ps.setInt(1, iOntologyID);
			    
			    int iResultSets = 1; // number of result sets returned by the procedure
				 // (1st RS is ontology, 2nd is subjects, 3rd is phrases)
		
			    if ((lFieldMask & Ontology.FIELD_SUBJECTS) == Ontology.FIELD_SUBJECTS) {
			    	iResultSets++; // 2
			    }
			    if ((lFieldMask & Ontology.FIELD_PHRASES) == Ontology.FIELD_PHRASES) {
			    	iResultSets++; // 3
			    }
		
			    ps.setInt(2, iResultSets);
		
			    rs = ps.executeQuery();
			    
			    //rs.next();
			    //ResultSet rsOntology = (ResultSet)rs.getObject(1);
			    //rs.next();
			    //ResultSet rsSubject = (ResultSet)rs.getObject(1);
		
			    
			    //ResultSet rs = (ResultSet)ps.getObject(1);
			    
			    //return ps.executeQuery();
			    
			    /*if (db != null) {
			    	db.commit();
			    	db.close();
			    }*/
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			log.log(Level.SEVERE, e.getLocalizedMessage());
		}
		
	    return rs;
	    
	    //return (ResultSet)ps.getObject(1);
	    
	}	
	
	public static ResultSet getOntologiesByCategoryID(int iCategoryID) throws SQLException {
		//log.log(Level.INFO, "iCategoryID={0}", iCategoryID);
		
		Connection db = getDBConnection();

		log.log(Level.INFO, "SELECT * FROM ontology.ontology WHERE category_id = {0}", iCategoryID);		
		PreparedStatement ps = db.prepareCall("SELECT * FROM ontology.ontology WHERE category_id = ?");
	    ps.setInt(1, iCategoryID);
	    return ps.executeQuery();
	}

	public static int createOntology(int iOrgID, String strName, int iUserID, String strDescription, int iCategoryID) throws SQLException {

		Connection db = getDBConnection();
		db.setAutoCommit(false);
		PreparedStatement ps = db.prepareStatement("SELECT ontology.spcreateontology(?, ?, ?, ?, ?)");

		ps.setInt(1, iOrgID);
		ps.setString(2, strName);
		ps.setString(3, strDescription);
		ps.setInt(4, iUserID);
		ps.setInt(5, iCategoryID);
	    
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

	public static void deleteOntology(int iOntologyID, int iOrgID) throws SQLException {

		Connection db = getDBConnection();
		db.setAutoCommit(false);
		PreparedStatement ps = db.prepareStatement("SELECT ontology.spdeleteontology(?, ?)");
		
		ps.setInt(1, iOntologyID);
		ps.setInt(2, iOrgID); //Pass OrgID for added security
	    
	    ps.execute();
	    db.commit();
	    ps.close();
	    db.close();
	}	

	public static void updateOntology(int iOntologyID, String strName, String strDescription, int iCategoryID, int iUserID) throws SQLException {

		Connection db = getDBConnection();
		db.setAutoCommit(false);
		PreparedStatement ps = db.prepareStatement("SELECT ontology.spupdateontology(?, ?, ?, ?, ?)");

		//(pontology_id integer, pname text, pdescription text, pcategory_id integer, puser_id integer)
		
		ps.setInt(1, iOntologyID);
		ps.setString(2, strName);
		ps.setString(3, strDescription);
		ps.setInt(4, iCategoryID);
		ps.setInt(5, iUserID);
	    
		ps.execute();
	    db.commit();
	    ps.close();
	    db.close();
	}	

	public static int copyOntology(int iOntologyID, int iDestinationCategoryID, String strDestinationOntologyName, int iDestinationOrgID, int iUserID) throws SQLException {
		
		Connection db = getDBConnection();
		db.setAutoCommit(false);
		PreparedStatement ps = db.prepareStatement("SELECT ontology.spcopyontologyacrossorgs(?, ?, ?, ?, ?)");

		//(pold_ontology_id integer, pcategory_id integer, pnew_ontology_name text, pnew_org_id integer, puser_id integer)
		
		ps.setInt(1, iOntologyID);
		ps.setInt(2, iDestinationCategoryID);
		ps.setString(3, strDestinationOntologyName);
		ps.setInt(4, iDestinationOrgID);
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

	public static ResultSet getProcessedOntologies(long lDocumentID) throws SQLException {
		
		Connection db = getDBConnection();
		db.setAutoCommit(false);

		PreparedStatement ps = db.prepareStatement("SELECT * FROM ontology.spgetprocessedontologies(?)");
		ps.setLong(1, lDocumentID);
    
		ResultSet rs = ps.executeQuery();
		return rs;
	}  

	public static ResultSet getDocumentResultAndOntology(long lDocumentID) throws SQLException {

		Connection db = getDBConnection();
		db.setAutoCommit(false);
		PreparedStatement ps = db.prepareStatement("SELECT * FROM ontology.spgetdocumentresultandontology(?)");
		
		ps.setLong(1, lDocumentID);
		ResultSet rs = ps.executeQuery();

		return rs;
	}
	
	public static ResultSet exportOntologyByID(int ontologyID) throws SQLException {
		Connection db = getDBConnection();
		db.setAutoCommit(false);		
		
		PreparedStatement ps = db.prepareStatement("SELECT * FROM ontology.spexportontologybyid(?)");
		
		ps.setLong(1, ontologyID);
		ResultSet rs = ps.executeQuery();
		
		if (rs != null && rs.next()) 
			return (ResultSet)rs.getObject(1);
		else 
			return null;
	}
	
	public static int getOntologyExportCount(int ontologyID) {
		int count = 0;
		
		try {
			ResultSet rs = OntologyData.exportOntologyByID(ontologyID);
			
			while(rs.next()) {
				++count;
			}
			
		} catch (SQLException e) {				
			e.printStackTrace();
		}
		
		return count;
	}
	
	public static int populateOntologyImportGtt(Connection db, OntologyCSV ontologyCSV, String username, String sessionID) throws SQLException {
		//Connection db = getDBConnection();
		PreparedStatement ps = null;
		db.setAutoCommit(false);
		int result = 1;
		
		try {
			ps = db.prepareStatement("SELECT ontology.spontologyimportcsvdata(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);");
	
			ps.setString(1, ontologyCSV.getOrgID());
			ps.setString(2, ontologyCSV.getCategoryID());
			ps.setString(3, ontologyCSV.getCategoryName());
			ps.setString(4, ontologyCSV.getOntologyID());
			ps.setString(5, ontologyCSV.getOntologyName());
			ps.setString(6, ontologyCSV.getOntologyDescription());
			ps.setString(7, ontologyCSV.getSubjectID());
			ps.setString(8, ontologyCSV.getSubjectName());
			ps.setString(9, ontologyCSV.getSubjectColor());
			ps.setString(10, ontologyCSV.getSubjectWeight());
			ps.setString(11, ontologyCSV.getPhraseID());
			ps.setString(12, ontologyCSV.getPhraseName());
			ps.setString(13, ontologyCSV.getPhraseColor());			
			ps.setString(14, ontologyCSV.getPhraseWeight());
			ps.setString(15, username);
			ps.setString(16, sessionID);
			
			ps.execute();		
			//db.commit();
		}
		catch (Exception ex) {
			result = -1;
			log.log(Level.SEVERE, ex.getLocalizedMessage());		
		}
		finally {
			//closeConnection(db, ps);
			if (ps != null)
				ps.close();
		}		
		return result;
	}
	
	public static void purgeOntologyImportBySessionID(Connection db, String sessionID) throws SQLException {
		//Connection db = getDBConnection();
		PreparedStatement ps = null;
		db.setAutoCommit(false);
		
		try {
			ps = db.prepareStatement("SELECT ontology.spontologypurgeimporttablebysessionid(?);");
	
			ps.setString(1, sessionID);
			
			ps.execute();
			//db.commit();			
		}
		catch (Exception ex) {
			log.log(Level.SEVERE, ex.getLocalizedMessage());
		}
		finally {
			//closeConnection(db, ps);
			if (ps != null)
				ps.close();
		}
	}	
	
	public static int importOntologyProcess(Connection db, String sessionID) throws SQLException {
		
		PreparedStatement ps = null;
		db.setAutoCommit(false);
		int result = 1;
		
		try	{
			ps = db.prepareStatement("SELECT ontology.import_ontology_process(?);");			
			ps.setString(1, sessionID);			
			ps.execute();
		}
		catch(Exception ex) {
			result = -1;
			log.log(Level.SEVERE, ex.getLocalizedMessage());
		}
		finally	{
			if (ps != null)
				ps.close();
		}
		return result;
	}
	
	public static void closeConnection(Connection db,  PreparedStatement ps) throws SQLException {
		if (ps != null)
			ps.close();
		
		if (db != null) 
			db.close();
	}	
	
	public static Connection getDBConnection() throws SQLException {
		Connection db = SIDB.getConnection();
		return db;
	}
	

}
