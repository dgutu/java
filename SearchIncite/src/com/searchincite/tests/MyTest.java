package com.searchincite.tests;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.searchincite.api.entity.User;
import com.searchincite.api.security.Authentication;
import com.searchincite.client.entity.DocumentWithResult;
import com.searchincite.server.data.DocumentData;
import com.searchincite.server.data.ObjectFactory;
import com.searchincite.server.data.SIDB;
import com.searchincite.server.security.Authorization;

public class MyTest {
	
	
	public static void test1() 
	{
		int ontologyID = 347;
		String docs = ",3930111,3930112,3930143,3930144,3930116,3930147,";
		//String docs = ",3930111";
		
		System.out.println(docs);
		System.out.println("f="+docs.substring(0, 1));
		System.out.println(docs);
		System.out.println("f="+docs.substring(docs.length()-1));		
		
		String fDocs = "";
		
		if (docs.substring(0, 1).equals(","))
			fDocs = docs.substring(1);
		else 
			fDocs = docs;
		
		if (fDocs.substring(fDocs.length()-1).equals(","))
			fDocs = fDocs.substring(0, fDocs.length() - 1);
		
		System.out.println(fDocs);
		
		String[] varr = fDocs.split(",");
		Arrays.sort(varr, new Comparator<String>()
			    {
			      public int compare(String s1, String s2)
			      {
			        return Integer.valueOf(s1).compareTo(Integer.valueOf(s2));
			      }
			    });
		
		String fields = "";
		String fields1 = "";
				
		for (int i=0;i<varr.length;i++)
		{
			System.out.println(varr[i]);
			fields += "\"c" + varr[i] + "\" text";
			fields1 += "\"c" + varr[i] + "\" ";
			
			if (i < varr.length - 1) {
				fields += ", ";
				fields1 += ", ";
			}
		}
		
		System.out.println(fields);
			
		String query = " with ontology_subj as " +
	    		   " ( " +                      
	    		   " select s.subject_id, " +
	    		   "        s.name, " +
	    		   "        s.ontology_id " +
	    		   "   from ontology.ontology o " +
	    		   "   join ontology.category c " +
	    		   "     on c.category_id = o.category_id " +
	    		   "   join ontology.subject s " +
	    		   "     on s.ontology_id = o.ontology_id " +
	    		   "  where o.ontology_id = " + ontologyID + " " +   
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
	    		   "  order by aa.name "; 
		
		System.out.println(query);

	}
	
	public static void getAllDocumentsList() 
	{
		
	    Connection db = null;
	    PreparedStatement ps = null;
	    int documentSourceId = 411;
	    
	    List l = null;
	    
	    try
	    {
	      db = SIDB.getConnection();
	      db.setAutoCommit(false);
	      ps = db.prepareCall("SELECT * FROM ontology.spgetalldocumentlist(?)");	      
	      ps.setInt(1, documentSourceId);	      
	      ResultSet rs = ps.executeQuery();
	      
	      if (rs.next()) {
	    	  l = ObjectFactory.convertToObjects((ResultSet)rs.getObject(1), DocumentWithResult.class);	      
	      
		      for (int i=0; i<l.size(); i++) {
			      DocumentWithResult d = (DocumentWithResult)l.get(i);
			      System.out.println(d.getDocumentID() + "<=>" + d.getFilename());
		      }
	      }
	      
	    }
	    catch (Exception e)
	    {
	      System.out.println(e.getLocalizedMessage());
	    }
	    finally
	    {
	      try
	      {
	        db.commit();
	        ps.close();
	        db.close();
	      }
	      catch (SQLException ignore) {}
	    }
	}	
	
	public static ResultSet getDocumentResultODC(int iOntologyID, long lDocumentID, long lFieldMask) throws SQLException {

		ResultSet rs = null, rsF = null;
		
		
		Connection db = SIDB.getConnection_old();
		
		if (db != null) {
			db.setAutoCommit(false);
			PreparedStatement ps = db.prepareStatement("SELECT * FROM ontology.spgetdocumentresult_odc(?, ?)");
	
			ps.setLong(1, lDocumentID);
			ps.setInt(2, iOntologyID);
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

	public static void main(String[] args) {
		//test1();
		//getAllDocumentsList();
		try {
			/*User u = Authentication.authenticateUser("si-mazda", "password1");
			System.out.println(u.getUserID());
			System.out.println(u.getFirstName());
			System.out.println(u.getLastName());
			System.out.println(u.getOrganizationID());
			System.out.println(u.isSIAdmin());
			System.out.println(u.isOrganizationAdmin());
			System.out.println(u.isOntologyUser());
			System.out.println(u.isOntologyBuilder());
			System.out.println(u.isDemoUser());
			System.out.println(u.isNobody());*/

			//File file = new File("c:\\odc.txt");
			//BufferedWriter output = new BufferedWriter(new FileWriter(file));
			
			ResultSet rs = getDocumentResultODC(0, 4722169, 1l);
			while(rs!= null && rs.next()) {				
				//System.out.println(rs.getString("document_cache"));
				//output.write(rs.getString("document_cache"));
				System.out.println("document_id="+rs.getLong("document_id"));
				System.out.println(rs.getInt("status_id"));
				System.out.println(rs.getString("status"));				
			}
			
			
			//output.close();			
			
			
		}
		catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

}

