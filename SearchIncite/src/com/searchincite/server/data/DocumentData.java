package com.searchincite.server.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.searchincite.server.entity.manager.DocumentResultManager;

public class DocumentData {
	public static final int STATUS_UPLOADED = 1;
	public static final int STATUS_PROCESSING = 2;
	public static final int STATUS_PROCESSED = 3;
	public static final int STATUS_ERROR = 4;
	public static final int STATUS_DO_NOT_PROCESS = 5;
	public static final int STATUS_ERROR_NO_ASSOCIATED_ONTOLOGY_WHEN_ATTEMPTED_PROCESSING = 6;
	public static final int STATUS_CONVERT_READY = 7;
	public static final int STATUS_CONVERT_PRECONVERT = 8;
	public static final int STATUS_CONVERT_CONVERTING = 9;
	public static final int STATUS_CONVERT_POSTCONVERT = 10;
	public static final int STATUS_CONVERT_DONE = 11;
	public static final int STATUS_CONVERT_ERROR = 12;


	//    private static final int MAX_AVAILABLE = 100;
	//    protected static Semaphore available = new Semaphore(MAX_AVAILABLE, true);
	private static Logger logger = Logger.getLogger(DocumentData.class.getName());
	
	public static long createDocument(int iOrganizationID, String strFilename, byte[] bArrContent, String strDescription, int iDocumentSourceID, int iUserID)
	throws SQLException {

		long lNewID = -1;
		
		Connection db = SIDB.getConnection();
		
		if (db != null) {
			db.setAutoCommit(false);
	
			PreparedStatement ps = db.prepareStatement("SELECT ontology.spcreatedocument(?, ?, ?, ?, ?, ?);");
			ps.setInt(1, iOrganizationID);
			ps.setString(2, strFilename);
			ps.setBytes(3, bArrContent);
			ps.setString(4, strDescription);
			ps.setInt(5, iDocumentSourceID);
			ps.setInt(6, iUserID);
	
			ResultSet rs = ps.executeQuery();
			
			if (rs.next()) {
				lNewID = rs.getLong(1);
				rs.close();
			}
	
			db.commit();
			closeConnection(db, ps);
		}

		return lNewID;
	}

	public static void deleteDocument(long lDocumentID, int iOrgID) throws SQLException {

		Connection db = SIDB.getConnection();
		
		if (db != null) {
			db.setAutoCommit(false);
			PreparedStatement ps = db.prepareStatement("SELECT ontology.spdeletedocument(?, ?)");
	
			ps.setLong(1, lDocumentID);
			ps.setInt(2, iOrgID);
	
			ps.execute();
			db.commit();
			closeConnection(db, ps);
		}
	}

	public static void updateDocument(long lDocumentID, int iOrgID, String strFilename, byte[] bArrContent, String strDescription, int iDocumentSourceID,
			int iUserID) throws SQLException {

		Connection db = SIDB.getConnection();
		
		if (db != null) {
			db.setAutoCommit(false);
	
			PreparedStatement ps = db.prepareStatement("SELECT ontology.spupdatedocument(?, ?, ?, ?, ?, ?, ?);");
	
			// pdocument_id integer, porg_id integer, pfile_name text, pfile_data
			// bytea,
			// pdocument_status_id, integer, pdocument_source_id integer,
			// pdescription text,
			// puser_id integer
	
			// ERROR: function ontology.spupdatedocument(
			// bigint, integer, character varying, bytea, integer, integer,
			// character varying, integer) does not exist
	
			ps.setLong(1, lDocumentID);
			ps.setInt(2, iOrgID);
			ps.setString(3, strFilename);
			ps.setBytes(4, bArrContent);
			ps.setInt(5, iDocumentSourceID);
			ps.setString(6, strDescription);
			ps.setInt(7, iUserID);
	
			ps.execute();
			db.commit();
			closeConnection(db, ps);
		}
	}

	public static ResultSet getDocumentByID(long lDocumentID, int iOrganizationID, long lFieldMask) throws SQLException {
		ResultSet rs = null;
		Connection db = SIDB.getConnection();
		
		if (db != null) {
			db.setAutoCommit(false);
			PreparedStatement ps = db.prepareStatement("SELECT * FROM ontology.spgetdocumentbyid(?, ?)");
	
			ps.setLong(1, lDocumentID);
			ps.setInt(2, iOrganizationID);
			rs = ps.executeQuery();
		}

		return rs;
	}
	
	public static ResultSet getAllDocumentsBySourceID(int iSourceID) throws SQLException {
		ResultSet rs = null;
		Connection db = SIDB.getConnection();
		
		if (db !=null ) {
			db.setAutoCommit(false);
			PreparedStatement ps = db.prepareStatement("SELECT * FROM ontology.spgetalldocsbysourceid(?)");
			
			ps.setInt(1, iSourceID);
			rs = ps.executeQuery();
		}
		
		return rs;
	}

	public static ResultSet getDocumentResult(int iOntologyID, long lDocumentID, long lFieldMask) throws SQLException {

		ResultSet rs = null;
		
		Connection db = SIDB.getConnection();
		
		if (db != null) {
			db.setAutoCommit(false);
			PreparedStatement ps = db.prepareStatement("SELECT * FROM ontology.spgetdocumentresult(?, ?)");
	
			ps.setLong(1, lDocumentID);
			ps.setInt(2, iOntologyID);
			rs = ps.executeQuery();
			ps.close();
			db.commit();
			db.close();
		}

		return rs;
	}
	
	public static ResultSet getDocumentResultODC(String ontologyName, long lDocumentID, long lFieldMask) throws SQLException {

		logger.log(Level.INFO, "ontologyName="+ontologyName+ "; lDocumentID=" + lDocumentID);
		ResultSet rs = null, rsF = null;		
		
		Connection db = SIDB.getConnection();
		
		if (db != null) {
			db.setAutoCommit(false);
			PreparedStatement ps = db.prepareStatement("SELECT * FROM ontology.spgetdocumentresult_odc(?, ?)");
	
			ps.setLong(1, lDocumentID);
			ps.setString(2, ontologyName);
			rs = ps.executeQuery();
			
			if (rs != null && rs.next())
				rsF = (ResultSet)rs.getObject(1);
			
			ps.close();
			rs.close();
			db.commit();
			db.close();			
		}

		return rsF;
	}
	
	public static ResultSet getDocumentResultDSR(String ontologyName, long lDocumentID, long lFieldMask) throws SQLException {

		logger.log(Level.INFO, "ontologyName="+ontologyName+ "; lDocumentID=" + lDocumentID);
		ResultSet rs = null, rsF = null;
		
		Connection db = SIDB.getConnection();
		
		if (db != null) {
			db.setAutoCommit(false);
			PreparedStatement ps = db.prepareStatement("SELECT * FROM ontology.spgetdocumentresult_dsr(?, ?)");
	
			ps.setLong(1, lDocumentID);
			ps.setString(2, ontologyName);
			rs = ps.executeQuery();
			
			if (rs != null && rs.next())
				rsF = (ResultSet)rs.getObject(1);
			
			ps.close();
			rs.close();
			db.commit();
			db.close();
		}

		return rsF;
	}
	
	public static ResultSet getDocumentResultDPR(String ontologyName, long lDocumentID, long lFieldMask) throws SQLException {

		logger.log(Level.INFO, "ontologyName="+ontologyName+ "; lDocumentID=" + lDocumentID);
		ResultSet rs = null, rsF = null;
		
		Connection db = SIDB.getConnection();
		
		if (db != null) {
			db.setAutoCommit(false);
			PreparedStatement ps = db.prepareStatement("SELECT * FROM ontology.spgetdocumentresult_dpr(?, ?)");
	
			ps.setLong(1, lDocumentID);
			ps.setString(2, ontologyName);
			rs = ps.executeQuery();
			
			if (rs != null && rs.next())
				rsF = (ResultSet)rs.getObject(1);
			
			ps.close();
			rs.close();
			db.commit();
			db.close();			
		}

		return rsF;
	}	

	public static ResultSet getDocumentResults(long lDocumentID, long lFieldMask) throws SQLException {

		ResultSet rs = null;
		
		Connection db = SIDB.getConnection();
		
		if (db != null) {
			db.setAutoCommit(false);
			PreparedStatement ps = db.prepareStatement("SELECT * FROM ontology.spgetdocumentresult(?)");
	
			ps.setLong(1, lDocumentID);
			rs = ps.executeQuery();
		}

		return rs;
	}

	public static ResultSet getOntologyDocumentStatus(long lDocumentID, int iOntologyID) throws SQLException {
		
		ResultSet rs = null;
		
		Connection db = SIDB.getConnection();
		
		if (db != null) {
			db.setAutoCommit(false);
			PreparedStatement ps = db.prepareStatement("SELECT * FROM ontology.spgetontologydocumentstatus(?, ?)");
	
			ps.setLong(1, lDocumentID);
			ps.setInt(2, iOntologyID);
			rs = ps.executeQuery();
		}
		
		return rs;
	}
	
	public static ResultSet getOntologyDocumentStatusWithoutOntology(long lDocumentID) throws SQLException {
		
		ResultSet rs = null;
		
		Connection db = SIDB.getConnection();
		
		if (db!= null) {
		db.setAutoCommit(false);
		PreparedStatement ps = db.prepareStatement("SELECT os.status as status FROM ontology.ontology_document_cache odc " + 
				"LEFT JOIN ontology.status os ON odc.status_id = os.status_id " + 
				"WHERE document_id = ?");
		ps.setLong(1, lDocumentID);
		rs = ps.executeQuery();
		}

		return rs;
	}

	public static void updateDocumentStatus(int iOntologyID, long lDocumentID, int iDocumentStatusID) throws SQLException {
		Connection db = SIDB.getConnection();
		
		if (db!=null) {
			db.setAutoCommit(false);
			PreparedStatement ps = db.prepareStatement("SELECT ontology.spupdatedocumentstatus(?, ?, ?)");
	
			ps.setInt(1, iOntologyID);
			ps.setLong(2, lDocumentID);
			ps.setInt(3, iDocumentStatusID);
	
			ps.execute();
			db.commit();
			closeConnection(db, ps);
		}

	}

	/**
	 * spgetdocumentstatus returns the status id and status for the document
	 * given, if you need the entire record returned please use
	 * spgetdocumentbyid
	 * 
	 * EDIT: This method returns the status of the document CONVERSION to plain-text 
	 * and not the status of the processing against an ontology. 
	 * 
	 * @param lDocumentID
	 * @throws SQLException
	 */

	public static int getDocumentStatus(long lDocumentID) throws SQLException {
		int status = 0;
		
		Connection db = SIDB.getConnection();
		if (db!=null) {
			db.setAutoCommit(false);
			PreparedStatement ps = db.prepareStatement("SELECT ontology.spgetdocumentstatus(?)");
	
			ps.setLong(1, lDocumentID);
	
			ResultSet rs = ps.executeQuery();
			status = rs.getInt("status_id");
	
			db.commit();
			closeConnection(db, ps);
		}
		return status;
	}


	/**
	 * spgetdocumentwithstatus returns all documents for the given status, it
	 * returns all columns, if you only need a few columns returned, please let
	 * me know.
	 * 
	 * EDIT: This method returns the status of the document CONVERSION to plain-text
	 * and not the status of the processing against an ontology. 
	 * 
	 * @param iStatusID
	 * @throws SQLException
	 */
	public static ResultSet getDocumentWithStatus(int iStatusID) throws SQLException {
		ResultSet rs = null;
		Connection db = SIDB.getConnection();
		
		if (db!= null) {
			db.setAutoCommit(false);
			//PreparedStatement ps = db.prepareCall("SELECT ontology.spgetdocumentwithstatus(?)");
			PreparedStatement ps = db.prepareStatement("SELECT * from ontology.document where status_id  = ? or status_id is null");
	
			ps.setInt(1, iStatusID);
	
			rs = ps.executeQuery();
			//
			//if (!rs.next()) {
			//	return null;			
			//}
	
			// Return reference to first ResultSet (users)
			//return (ResultSet)rs.getObject(1);
		}
		return rs;
	}



	/**
	 * spupdatedocumentplaintext will update the file_plain_text filed for the
	 * given document id
	 * 
	 * @param lDocumentID
	 * @throws SQLException
	 */
	public static void updateDocumentPlainText(long lDocumentID, String bytes) throws SQLException {
		
		Connection db = SIDB.getConnection();
		if (db!=null) {
			db.setAutoCommit(false);
			PreparedStatement ps = db.prepareStatement("SELECT ontology.spupdatedocumentplaintext(?, ?, ?)");
	
			ps.setLong(1, lDocumentID);
			ps.setString(2, bytes);
			ps.setInt(3, 1);
	
			ps.execute();
			db.commit();
			closeConnection(db, ps);
		}

	}

	/**
	 * updateDocumentStatusForGivenDocument will update the status id for the given
	 * document - the was already a function called spupdatedocumentstatus that
	 * updates the status on ontology_document_cache. I should probably rename
	 * them but it would cause a code change.
	 * 
	 * @param iOntologyID
	 * @param lDocumentID
	 * @param iDocumentStatusID
	 * @throws SQLException
	 */
	public static void updateDocumentStatusForGivenDocument(long lDocumentID, int iDocumentStatusID, int iuserID) throws SQLException {

		Connection db = SIDB.getConnection();
		if (db != null) {
			db.setAutoCommit(false);
			PreparedStatement ps = db.prepareStatement("SELECT ontology.spupdatedocumentstatus2(?, ?, ?)");
	
			ps.setLong(1, lDocumentID);
			ps.setInt(2, iDocumentStatusID);
			ps.setInt(3, iuserID);
	
			ps.execute();
			db.commit();
			closeConnection(db, ps);
		}
	}

	public static boolean checkFilenameExists(int iOrganizationID, String strFilename) throws SQLException {
		long lCount = 0;
		
		Connection db = SIDB.getConnection();
		if (db != null) {
			db.setAutoCommit(false);
			PreparedStatement ps = db.prepareStatement("SELECT COUNT(*) AS the_count FROM ontology.document WHERE org_id = ? AND file_name = ?");
	
			ps.setInt(1, iOrganizationID);
			ps.setString(2, strFilename);
			ResultSet rs = ps.executeQuery();		
	
			if (rs.next()) {
				lCount = rs.getLong(1);
				rs.close();
			}
	
			db.commit();
			closeConnection(db, ps);
		}

		return lCount > 0;
	}



	//result set here contains a URL, a Hash of the web content, and the date last updated.
	public static int createURL(int orgID, String url, int documentSourceID, String desc, int user) throws SQLException {
		
		int lNewID = -1;
		Connection db = SIDB.getConnection();
		if (db != null) {
			db.setAutoCommit(false);
			PreparedStatement ps = db.prepareStatement("SELECT ontology.spcreateurl(?, ?, ?, ?, ?)");
	
			ps.setInt(1, orgID);
			ps.setString(2, url);
			ps.setInt(3, documentSourceID);
			ps.setString(4, desc);
			ps.setInt(5, user);
	
			ResultSet rs = ps.executeQuery();		
	
			if (rs.next()) {
				lNewID = rs.getInt(1);
				rs.close();
			}
	
			db.commit();
			closeConnection(db, ps);
		}
		return lNewID;
	}

	public static ResultSet getAllURLs(boolean flag) throws SQLException {
		ResultSet rs = null;
		Connection db = SIDB.getConnection();
		if (db != null) {
			db.setAutoCommit(false);
			PreparedStatement ps = db.prepareStatement("SELECT * FROM ontology.spallurls(?)");
	
			ps.setBoolean(1, flag);		
			rs = ps.executeQuery();
		}
		return rs;
	}
	
    public static ResultSet getAllURLs(boolean flag, int orgID) throws SQLException {

    	ResultSet rs = null;	
        Connection db = SIDB.getConnection();
        if (db != null) {
	        db.setAutoCommit(false);
	        PreparedStatement ps = db.prepareStatement("SELECT * FROM ontology.spallurls(?) WHERE fieldname=?");
	
	        ps.setBoolean(1, flag); 
	        ps.setInt(2, orgID);
	        rs = ps.executeQuery();
        }

        return rs;
    }
    
    
    public static ResultSet exportDocs(String docs, int orgID, String ontologyName) throws SQLException {		
		
    	//int ontologyID = 347;
		//String docs = ",3930111,3930112,3930143,3930144,3930116,3930147,";
		//String docs = ",3930111";
		
		/*System.out.println(docs);
		System.out.println("f="+docs.substring(0, 1));
		System.out.println(docs);
		System.out.println("f="+docs.substring(docs.length()-1));*/		
		
		String fDocs = "";
		
		if (docs.substring(0, 1).equals(","))
			fDocs = docs.substring(1);
		else 
			fDocs = docs;
		
		if (fDocs.substring(fDocs.length()-1).equals(","))
			fDocs = fDocs.substring(0, fDocs.length() - 1);
		
		//System.out.println(fDocs);
		
		String[] varr = fDocs.split(",");		
		Arrays.sort(varr, new Comparator<String>()
	    {
	      public int compare(String s1, String s2)
	      {
	        return Integer.valueOf(s1).compareTo(Integer.valueOf(s2));
	      }
	    });
		
		/*String fields = "";
		String fields1 = "";
				
		for (int i=0;i<varr.length;i++)
		{
			//System.out.println(varr[i]);
			fields += "\"c" + varr[i] + "\" text";
			fields1 += "\"c" + varr[i] + "\" ";
			
			if (i < varr.length - 1) {
				fields += ", ";
				fields1 += ", ";
			}
		}*/
		
		//System.out.println(fields);
			
		/*String query = " with ontology_subj as " +
	    		   " ( " +                      
	    		   " select s.subject_id, " +
	    		   "        s.name, " +
	    		   "        s.ontology_id " +
	    		   "   from ontology.ontology o " +
	    		   "   join ontology.category c " +
	    		   "     on c.category_id = o.category_id " +
	    		   "   join ontology.subject s " +
	    		   "     on s.ontology_id = o.ontology_id " +
	    		   "  where o.name = '" + ontologyName + "' " +
	    		   "    and o.org_id = " + orgID + " " +
	    		   " ), " +
	    		   " cross_t as ( " +
	    		   " select * " +
	    		   " from crosstab( " +
	    		   " 'select sub_name, document_id, result " +
	    		   "   from ontology.vw_doc_with_result t " +
	    		   "  where t.document_id in (" + fDocs + ") order by t.sub_name') " +
	    		   " as vw_doc_with_result(sub_name text, " + fields + ") " +
	    		   " ) " +
	    		   " select aa.ontology_id, aa.subject_id, aa.name, " + fields1 + " " +
	    		   "   from ontology_subj aa " +
	    		   "   left join cross_t bb " +
	    		   "     on aa.name = bb.sub_name " +
	    		   "  order by aa.name "; */
		
		
		String query = " with ontology_subj as " + 
					   " ( " +
					   "    select s.subject_id, " +
					   "	       s.name, " +
					   "	       s.ontology_id " +
					   "	  from ontology.ontology o " +
					   "	  join ontology.category c " +
					   "	    on c.category_id = o.category_id " +
					   "	  join ontology.subject s " +
					   "	    on s.ontology_id = o.ontology_id " +  
					   "	 where o.name = '" + ontologyName + "' " +
					   "	   and o.org_id = " + orgID + " " +
					   " ) " +
					   " select aa.ontology_id,aa.subject_id,aa.name, ";
		
		
		for (int i=0;i<varr.length;i++)
		{
			query += "(select t.result from ontology.vw_doc_with_result t where t.document_id = " + varr[i] + " and t.sub_name = aa.name) as c" + varr[i] + " ";
			
			if (i < varr.length - 1) {
				query += ", ";
			}
		}
		
		query += " from ontology_subj aa order by aa.name ";
		
		
		//System.out.println(query);
    	
    	
    	/*String query1 = "select * from ontology.users";
    	String query2 = "select sub_name, document_id, result " + 
    					"  from ontology.vw_doc_with_result t " +
                        " where t.document_id in (3930111,3930112,3930109,3930113,3930116,3930143) order by t.sub_name";*/
    	
        Connection db = SIDB.getConnection();
        ResultSet rs = null;
        if (db != null) {
	        db.setAutoCommit(false);
	        PreparedStatement ps = db.prepareStatement(query);
	
	        //ps.setBoolean(1, flag); 
	        //ps.setInt(2, orgID);
	        rs = ps.executeQuery();
        }
        
        return rs;
    }    
   
   
    public static ResultSet getAllURLsForDocumentSource(boolean flag, int documentSourceID) throws SQLException {
    	ResultSet rs = null;
        Connection db = SIDB.getConnection();
        
        if (db != null) {
	        db.setAutoCommit(false);
	        PreparedStatement ps = db.prepareStatement("SELECT * FROM ontology.spallurls(?) WHERE document_source_id=?");
	
	        ps.setBoolean(1, flag); 
	        ps.setInt(2, documentSourceID);
	        rs = ps.executeQuery();
        }
        return rs;
    }

	public static void setURLActiveFlag(long URLID, boolean flag) throws SQLException {

		Connection db = SIDB.getConnection();
		if (db != null) {
			db.setAutoCommit(false);
			PreparedStatement ps = db.prepareStatement("SELECT ontology.spseturlactiveflag(?, ?)");
	
			ps.setLong(1, URLID);
			ps.setBoolean(2, flag);		
	
			ps.executeQuery();
			db.commit();
			closeConnection(db, ps);
		}
	}

	public static void updateURL(long URLID, String hash) throws SQLException {

		Connection db = SIDB.getConnection();
		if (db != null) {
			db.setAutoCommit(false);
			PreparedStatement ps = db.prepareStatement("SELECT ontology.spupdateurl(?, ?)");
	
			ps.setLong(1, URLID);
			ps.setString(2, hash);
	
			ps.executeQuery();
			db.commit();
			closeConnection(db, ps);
		}
	}

	public static void updateURLData(long URLID, String URL, String desc, boolean flag) throws SQLException {

		Connection db = SIDB.getConnection();
		if (db != null) {
			db.setAutoCommit(false);
			PreparedStatement ps = db.prepareStatement("SELECT ontology.spupdateurldata(?, ?, ?, ?)");
	
			ps.setLong(1, URLID);
			ps.setString(2, URL);
			ps.setString(3, desc);
			ps.setBoolean(4, flag);
	
			ps.executeQuery();
			db.commit();
			closeConnection(db, ps);
		}
	}


	private static void closeConnection(Connection db,  PreparedStatement ps) throws SQLException {
		if (ps != null) ps.close();
		if (db != null) db.close();
	}

	public static void closeConnection(ResultSet rs) throws SQLException {
		rs.close();
	}
	public static void updateStatusOfDocsInSource(int iDocumentSourceID, int iDocumentStatusID, int lNumberOfDocsToUpdate) throws SQLException {

		Connection db = SIDB.getConnection();
		if (db != null) {
			db.setAutoCommit(false);
			PreparedStatement ps = db.prepareStatement("SELECT ontology.spupdatestatusofdocsinsource(?, ?, ?)");
			//ontology.spupdatestatusofdocsinsource(pdocument_source_id integer, pstatus_id integer, pnum_of_rows_to_update integer)
			ps.setInt(1, iDocumentSourceID);
			ps.setInt(2, iDocumentStatusID);
			ps.setInt(3, lNumberOfDocsToUpdate);
	
			ps.execute();
			db.commit();
			
			closeConnection(db, ps);		
		}
	}

}
