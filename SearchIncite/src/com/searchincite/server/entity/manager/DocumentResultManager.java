package com.searchincite.server.entity.manager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.searchincite.client.entity.DocumentResult;
import com.searchincite.client.entity.DocumentSubjectResult;
import com.searchincite.client.entity.Ontology;
import com.searchincite.client.entity.Phrase;
import com.searchincite.client.entity.Subject;
import com.searchincite.server.data.DocumentData;

public class DocumentResultManager {

	private static Logger logger = Logger.getLogger(DocumentResultManager.class.getName());
	
	public static DocumentResult deserialize(ResultSet rs, long lFieldMask) throws SQLException {

		DocumentResult dr = new DocumentResult();

		dr.setDocumentID(rs.getLong("document_id"));
		dr.setMarkedUpDocument(rs.getString("document_cache"));
		dr.setDocumentStatusID(rs.getInt("status_id"));
		dr.setDocumentStatus(rs.getString("status"));

		return dr;
	}

	public static DocumentSubjectResult deserializeSubjectResult(ResultSet rs) throws SQLException {

		DocumentSubjectResult dsr = new DocumentSubjectResult();

		dsr.setResult(rs.getString("result"));
		dsr.setSubject(SubjectManager.deserialize(rs, Subject.FIELD_WEIGHT | Subject.FIELD_NAME | Subject.FIELD_COLOR | Subject.FIELD_ID));

		return dsr;
	}
	
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static DocumentResult getDocumentResult(String ontologyName, long lDocumentID, long lFieldMask) {

		long startT = 0l, endT = 0l;
		ResultSet rsDocumentCache = null, rsSubjectResult = null, rsPhrases = null;
		DocumentResult documentResult = null;
		
		try {
			
			// ontology_document_cache
			startT = System.currentTimeMillis();		
			rsDocumentCache = DocumentData.getDocumentResultODC(ontologyName, lDocumentID, lFieldMask);
			endT = System.currentTimeMillis();		
			logger.log(Level.INFO, "time in seconds ontology_document_cache: " + String.valueOf((endT-startT)/1000));
			
			// document_subject_result
			startT = System.currentTimeMillis();		
			rsSubjectResult = DocumentData.getDocumentResultDSR(ontologyName, lDocumentID, lFieldMask);
			endT = System.currentTimeMillis();		
			logger.log(Level.INFO, "time in seconds document_subject_result: " + String.valueOf((endT-startT)/1000));
			
			// document_phrase_result
			startT = System.currentTimeMillis();		
			rsPhrases = DocumentData.getDocumentResultDPR(ontologyName, lDocumentID, lFieldMask);
			endT = System.currentTimeMillis();		
			logger.log(Level.INFO, "time in seconds document_phrase_result: " + String.valueOf((endT-startT)/1000));
			
		
			// first cursor	
			startT = System.currentTimeMillis();	
			while (rsDocumentCache != null && rsDocumentCache.next()) {
					logger.log(Level.INFO, "im here");
					documentResult = deserialize(rsDocumentCache, lFieldMask);
					documentResult.setOntology(OntologyManager.deserialize(rsDocumentCache, Ontology.FIELD_ID | Ontology.FIELD_NAME));				
			}
			endT = System.currentTimeMillis();		
			logger.log(Level.INFO, "time in seconds ontology_document_cache: " + String.valueOf((endT-startT)/1000));
		
			// Move to second result set (subject results), second cursor		
			startT = System.currentTimeMillis();
			ArrayList arrSubjectResults = new ArrayList();
			
			while (rsSubjectResult != null && rsSubjectResult.next()) {
				arrSubjectResults.add(deserializeSubjectResult(rsSubjectResult));
			}
			
			if (arrSubjectResults.size()>0)
				documentResult.setSubjectResults((DocumentSubjectResult[])arrSubjectResults.toArray((Object[])new DocumentSubjectResult[arrSubjectResults.size()]));
			
			endT = System.currentTimeMillis();		
			logger.log(Level.INFO, "time in seconds subjects results: " + String.valueOf((endT-startT)/1000));

			// Move to third result set (phrases), third cursor	
			startT = System.currentTimeMillis();
			ArrayList arrPhrases = new ArrayList();
			while (rsPhrases != null && rsPhrases.next()) {
					Phrase p = PhraseManager.deserialize(rsPhrases, 0);
					arrPhrases.add(p);
			}				

			if (arrPhrases.size() > 0) {				
			
				//store phrases in each subject
				for (int iSubjects = 0; iSubjects < documentResult.getSubjectResults().length; iSubjects++) {				
					Subject s = documentResult.getSubjectResults()[iSubjects].getSubject();
					
					ArrayList arrSubjectPhrases = new ArrayList();					
					for (int iPhrases = 0; iPhrases < arrPhrases.size(); iPhrases++) {
						Phrase p = (Phrase)arrPhrases.get(iPhrases);
						if (p.getSubjectID() == s.getSubjectID()) {
							arrSubjectPhrases.add(p);
						}
					}
				
					if (arrSubjectPhrases.size() > 0) {
						s.setPhrases(((Phrase[])arrSubjectPhrases.toArray((Object[])new Phrase[arrSubjectPhrases.size()])));
					}
				}
			}
			
			endT = System.currentTimeMillis();		
			logger.log(Level.INFO, "time in seconds phrases results: " + String.valueOf((endT-startT)/1000));		
			
			logger.log(Level.INFO, String.valueOf(documentResult.getMarkedUpDocument().length()));
		}
		catch(Exception ex) {
			logger.log(Level.SEVERE, ex.getMessage());
			try {
				ex.printStackTrace();
				throw new Exception(ex);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		finally {
			try {
				if (rsDocumentCache != null)
					rsDocumentCache.close();	
				
				if (rsSubjectResult != null)
					rsSubjectResult.close();
				
				if (rsPhrases != null) 
					rsPhrases.close();
			}
			catch(Exception ex) {}
		}
		
		return documentResult;
	}
}
