package com.searchincite.server.entity.manager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.searchincite.client.entity.Phrase;
import com.searchincite.client.entity.Subject;
import com.searchincite.client.entity.comparers.SubjectComparer;

public class SubjectManager {

	public static Subject[] getSubjectsForOntology(int iOntologyID, long lFieldMask) throws SQLException {
		
		ResultSet rs = com.searchincite.server.data.SubjectData.getSubjectsForOntology(iOntologyID);
		
		ArrayList arrSubjects = new ArrayList();
		
		while (rs.next()) {
			Subject s = deserialize(rs, lFieldMask);
			arrSubjects.add(s);
		}

		rs.getStatement().getConnection().close();
		rs.getStatement().close();
		rs.close();

		if (arrSubjects.size() > 1) {
			java.util.Collections.sort(arrSubjects, new SubjectComparer(Subject.FIELD_NAME));			
		}
		
		return((Subject[])arrSubjects.toArray((Object[])new Subject[arrSubjects.size()]));
	}
	
	public static Subject deserialize(ResultSet rs, long lFieldMask) throws SQLException {

		// Serialization will fail and a JavaScript error will be 
		// displayed on the page if you use getDate() -- like this:
		// s.setLastModifiedDate(subjResults.getDate("last_modified_date")); //DON'T DO THIS!
		// (Apparently, GWT can't serialize java.sql.Date even though it IS a java.util.Date.)

		Subject s = new Subject();
		
		//TODO: Deserialize only fields in lFieldMask
		
		s.setSubjectID(rs.getInt("subject_id"));
		s.setName(rs.getString("name"));
		s.setColor(rs.getString("color"));
		s.setWeight(rs.getDouble("weight"));
		s.setDateCreated(new java.util.Date(rs.getDate("creation_date").getTime()));
		s.setCreatedByUserID(rs.getInt("created_by"));
		s.setLastModifiedDate(new java.util.Date(rs.getDate("last_modified_date").getTime()));
		s.setLastModifiedByUserID(rs.getInt("last_modified_by"));
		s.setActive(rs.getBoolean("active"));
		s.setOntologyID(rs.getInt("ontology_id"));
		return s;
	}
	
	public static Subject createSubject(Subject s) throws SQLException {

		if (s.getCreatedByUserID() <= 0) {
			return null;			
		}
		
		int iNewID = com.searchincite.server.data.SubjectData.createSubject(
				s.getOntologyID(), 
				s.getName(), 
				s.getColor(),  
				s.getWeight(),
				s.getCreatedByUserID(),
				s.getActive());
		
		s.setSubjectID(iNewID);

		return s;
	}

	public static void deleteSubject(int iSubjectID, int iOrgID) throws SQLException {
		com.searchincite.server.data.SubjectData.deleteSubject(iSubjectID, iOrgID); 
	}

	public static void updateSubject(Subject s) throws SQLException {

		com.searchincite.server.data.SubjectData.updateSubject (
				s.getSubjectID(), 
				s.getName(), 
				s.getColor(),
				s.getWeight(), 
				s.getLastModifiedByUserID(),
				s.getActive()); 
	}

	public static Subject getSubjectByID(int iSubjectID, long lFieldMask) throws SQLException {
		
		ResultSet rs = com.searchincite.server.data.SubjectData.getSubjectByID(iSubjectID, lFieldMask);

		// Move to first row, which is a ResultSet containing Subjects (ONE Subject -- hopefully!)
		if (!rs.next()) {
			return null;			
		}

		// Get reference to first ResultSet (subjects)
		ResultSet rsSubject = (ResultSet)rs.getObject(1);
			
		Subject s = null;
		
		if (rsSubject.next()) {
			s = deserialize(rsSubject, lFieldMask);
		}
		else {
			// Subject wasn't found (invalid subject_id?)
			return null;
		}
		
		// Move to second row, which is a ResultSet containing subjects (if called for in lFieldMask)
		if (rs.next() && (lFieldMask & Subject.FIELD_PHRASES) == Subject.FIELD_PHRASES) {

			ResultSet rsPhrases = (ResultSet)rs.getObject(1);

			// Call PhraseManager.Deserialize() to get phrases
			ArrayList arrPhrases = null;
			
			while (rsPhrases.next()) {

				if (arrPhrases == null) {
					arrPhrases = new ArrayList();
				}
				
				arrPhrases.add(PhraseManager.deserialize(rsPhrases, 0));
			}

			rsPhrases.close();

			if (arrPhrases != null) {
				s.setPhrases(((Phrase[])arrPhrases.toArray((Object[])new Phrase[arrPhrases.size()])));
			}
		}

		rs.getStatement().getConnection().close();
		rs.getStatement().close();
		rs.close();
		
		return s;
	}

}
