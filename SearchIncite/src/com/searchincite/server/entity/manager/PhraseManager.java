package com.searchincite.server.entity.manager;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.searchincite.client.entity.Phrase;

public class PhraseManager {

	public static Phrase[] getPhrasesForSubject(int iSubjectID, long lFieldMask) throws SQLException {
		return null;
	}
	
	public static Phrase deserialize(ResultSet rs, long lFieldMask) throws SQLException {

		// Serialization will fail and a JavaScript error will be 
		// displayed on the page if you use getDate() -- like this:
		// s.setLastModifiedDate(subjResults.getDate("last_modified_date")); //DON'T DO THIS!
		// (Apparently, GWT can't serialize java.sql.Date even though it IS a java.util.Date.)

		Phrase p = new Phrase();
		p.setPhraseID(rs.getInt("phrase_id"));
		p.setSubjectID(rs.getInt("subject_id"));
		p.setName(rs.getString("name"));
		p.setColor(rs.getString("color"));
		p.setWeight(rs.getInt("weight"));
		p.setDateCreated(new java.util.Date(rs.getDate("creation_date").getTime()));
		p.setCreatedByUserID(rs.getInt("created_by"));
		p.setLastModifiedDate(new java.util.Date(rs.getDate("last_modified_date").getTime()));
		p.setLastModifiedByUserID(rs.getInt("last_modified_by"));
		
		return p;
	}

	public static Phrase createPhrase(Phrase p) throws SQLException {

		if (p.getCreatedByUserID() <= 0) {
			return null;			
		}
		
		int iNewID = com.searchincite.server.data.PhraseData.createPhrase(
				p.getSubjectID(), 
				p.getName(), 
				p.getColor(),  
				p.getWeight(),
				p.getCreatedByUserID());
		
		p.setPhraseID(iNewID);

		return p;
	}

	public static void deletePhrase(int iPhraseID, int iOrgID) throws SQLException {
		com.searchincite.server.data.PhraseData.deletePhrase(iPhraseID, iOrgID); 
	}

	public static void updatePhrase(Phrase p) throws SQLException {

		com.searchincite.server.data.PhraseData.updatePhrase (
				p.getPhraseID(), 
				p.getName(), 
				p.getColor(),
				p.getWeight(), 
				p.getLastModifiedByUserID()); 
	}

}
