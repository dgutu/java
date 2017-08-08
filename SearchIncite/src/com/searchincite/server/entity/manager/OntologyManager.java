package com.searchincite.server.entity.manager;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.google.gwt.thirdparty.guava.common.base.Charsets;
import com.searchincite.api.entity.User;
import com.searchincite.client.entity.Ontology;
import com.searchincite.client.entity.OntologyCSV;
import com.searchincite.client.entity.Phrase;
import com.searchincite.client.entity.Subject;
import com.searchincite.server.data.OntologyData;

import au.com.bytecode.opencsv.CSVReader;

public class OntologyManager {

	// logger
	private final static Logger log = Logger.getLogger(OntologyManager.class.getName());

	public static Ontology[] getOntologiesForOrganization(int iOrganizationID, long lFieldMask) throws SQLException {

		ResultSet rs = com.searchincite.server.data.OntologyData.getOntologiesForOrganization(iOrganizationID);

		ArrayList arrOntologies = new ArrayList();

		while (rs.next()) {
			Ontology o = deserialize(rs, lFieldMask);
			arrOntologies.add(o);
		}

		// TODO: Move to next ResultSet and call SubjectManager.Deserialize() to
		// get
		// subjects (if specified in lFieldMask)
		if ((lFieldMask & Ontology.FIELD_SUBJECTS) == Ontology.FIELD_SUBJECTS) {

			for (int i = 0; i < arrOntologies.size(); i++) {

				Ontology o = (Ontology) arrOntologies.get(i);

				o.setSubjects(SubjectManager.getSubjectsForOntology(o.getOntologyID(), 0));
			}
		}

		rs.getStatement().getConnection().close();
		rs.getStatement().close();
		rs.close();

		return ((Ontology[]) arrOntologies.toArray((Object[]) new Ontology[arrOntologies.size()]));
	}

	public static Ontology getOntologyByID(int iOntologyID, long lFieldMask) throws SQLException {

		ResultSet rs = com.searchincite.server.data.OntologyData.getOntologyByID(iOntologyID, lFieldMask);

		// Move to first row, which is a ResultSet containing ontologies (ONE
		// ontology -- hopefully!)
		if (!rs.next()) {
			return null;
		}

		// Get reference to first ResultSet (ontologies=>ontology.ontology)
		ResultSet rsOntology = (ResultSet) rs.getObject(1);

		Ontology o = null;

		if (rsOntology.next()) {
			o = deserialize(rsOntology, lFieldMask);
		} else {
			// Ontology wasn't found (invalid ontology_id?)
			return null;
		}

		// Move to second row, which is a ResultSet containing subjects (if
		// called for in lFieldMask)
		if (rs.next() && (lFieldMask & Ontology.FIELD_SUBJECTS) == Ontology.FIELD_SUBJECTS) {

			ResultSet rsSubjects = (ResultSet) rs.getObject(1);

			// Call SubjectManager.Deserialize() to get subjects
			ArrayList arrSubjects = null;

			while (rsSubjects.next()) {

				if (arrSubjects == null) {
					arrSubjects = new ArrayList();
				}

				arrSubjects.add(SubjectManager.deserialize(rsSubjects, 0));
			}

			rsSubjects.close();

			if (arrSubjects != null) {
				o.setSubjects(((Subject[]) arrSubjects.toArray((Object[]) new Subject[arrSubjects.size()])));

				// Move to third row, which is a ResultSet containing phrases
				// (if called for in lFieldMask)
				if (rs.next() && (lFieldMask & Ontology.FIELD_PHRASES) == Ontology.FIELD_PHRASES) {

					ResultSet rsPhrases = (ResultSet) rs.getObject(1);

					// Call PhraseManager.Deserialize() to get phrases

					Hashtable ht = new Hashtable(); // Hashtable containing
													// ArrayLists of Phrases,
													// keyed by subject_id

					while (rsPhrases.next()) {

						int iSubjectID = rsPhrases.getInt("subject_id");

						ArrayList arrPhrases = (ArrayList) ht.get(String.valueOf(iSubjectID));

						if (arrPhrases == null) {
							arrPhrases = new ArrayList();
							ht.put(String.valueOf(iSubjectID), arrPhrases);
						}

						arrPhrases.add(PhraseManager.deserialize(rsPhrases, 0));
					}

					// For each subject in the Ontology, get the ArrayList of
					// phrases out of the Hashtable.
					// (The hashtable is keyed on subject id.)
					for (int iSubjectCount = 0; iSubjectCount < o.getSubjects().length; iSubjectCount++) {

						Subject s = o.getSubjects()[iSubjectCount];

						ArrayList arrPhrases = (ArrayList) ht.get(String.valueOf(s.getSubjectID()));
						if (arrPhrases != null) {
							s.setPhrases(((Phrase[]) arrPhrases.toArray((Object[]) new Phrase[arrPhrases.size()])));
						}
					}

					rsPhrases.close();
				}

			}

		}

		if (rs != null) {
			rs.getStatement().getConnection().close();
			rs.getStatement().close();
			rs.close();
		}

		return o;
	}

	public static Ontology deserialize(ResultSet rs, long lFieldMask) throws SQLException {

		Ontology o = new Ontology();

		// org_id is not optional in lFieldMask -- it must be set so we can
		// verify
		// whether the user has access to view it or not, based on THEIR org_id.
		o.setOrganizationID(rs.getInt("org_id"));

		// TODO: (?) Always require the ontology_id?
		// if ((lFieldMask & Ontology.FIELD_ID) == Ontology.FIELD_ID) {
		o.setOntologyID(rs.getInt("ontology_id"));
		// }

		if ((lFieldMask & Ontology.FIELD_CATEGORY_ID) == Ontology.FIELD_CATEGORY_ID) {
			o.setCategoryID(rs.getInt("category_id"));
		}

		if ((lFieldMask & Ontology.FIELD_NAME) == Ontology.FIELD_NAME) {
			o.setName(rs.getString("name"));
		}

		if ((lFieldMask & Ontology.FIELD_DESCRIPTION) == Ontology.FIELD_DESCRIPTION) {
			o.setDescription(rs.getString("description"));
		}

		if ((lFieldMask & Ontology.FIELD_DATE_CREATED) == Ontology.FIELD_DATE_CREATED) {
			o.setDateCreated(new java.util.Date(rs.getDate("creation_date").getTime()));
		}

		if ((lFieldMask & Ontology.FIELD_CREATED_BY_USER) == Ontology.FIELD_CREATED_BY_USER) {
			o.setCreatedByUserID(rs.getInt("created_by"));
		}

		if ((lFieldMask & Ontology.FIELD_DATE_MODIFIED) == Ontology.FIELD_DATE_MODIFIED) {
			o.setLastModifiedDate(new java.util.Date(rs.getDate("last_modified_date").getTime()));
		}

		if ((lFieldMask & Ontology.FIELD_MODIFIED_BY_USER) == Ontology.FIELD_MODIFIED_BY_USER) {
			o.setLastModifiedByUserID(rs.getInt("last_modified_by"));
		}

		return o;
	}

	public static Ontology[] getOntologiesByCategoryID(int iCategoryID, long lFieldMask) throws SQLException {

		// log.log(Level.INFO, "iCategoryID={0}", iCategoryID);
		log.log(Level.INFO, "lFieldMask={0}", lFieldMask);

		ResultSet rs = com.searchincite.server.data.OntologyData.getOntologiesByCategoryID(iCategoryID);

		ArrayList arrOntologies = new ArrayList();

		while (rs.next()) {
			Ontology o = deserialize(rs, lFieldMask);
			arrOntologies.add(o);
		}

		rs.getStatement().getConnection().close();
		rs.getStatement().close();
		rs.close();

		return ((Ontology[]) arrOntologies.toArray((Object[]) new Ontology[arrOntologies.size()]));
	}

	public static Ontology createOntology(Ontology o) throws SQLException {

		if (o.getCreatedByUserID() <= 0) {
			return null;
		}

		int iNewID = com.searchincite.server.data.OntologyData.createOntology(o.getOrganizationID(), o.getName(),
				o.getCreatedByUserID(), o.getDescription(), o.getCategoryID());

		o.setOntologyID(iNewID);

		return o;
	}

	public static void deleteOntology(int iOntologyID, int iOrgID) throws SQLException {
		com.searchincite.server.data.OntologyData.deleteOntology(iOntologyID, iOrgID);
	}

	public static Ontology updateOntology(Ontology o) throws SQLException {

		com.searchincite.server.data.OntologyData.updateOntology(o.getOntologyID(), o.getName(), o.getDescription(),
				o.getCategoryID(), o.getLastModifiedByUserID());

		return o;
	}

	public static Ontology copyOntology(int iOntologyID, int iDestinationCategoryID, String strDestinationOntologyName,
			int iDestinationOrgID, int iUserID) throws SQLException {

		int iNewOntologyID = com.searchincite.server.data.OntologyData.copyOntology(iOntologyID, iDestinationCategoryID,
				strDestinationOntologyName, iDestinationOrgID, iUserID);

		return getOntologyByID(iNewOntologyID, Ontology.FIELD_CATEGORY_ID | Ontology.FIELD_ID | Ontology.FIELD_NAME);
	}

	public static Ontology[] getProcessedOntologies(long lDocumentID, long lFieldMask) throws SQLException {

		ResultSet rs = com.searchincite.server.data.OntologyData.getProcessedOntologies(lDocumentID);

		ArrayList arrOntologies = new ArrayList();

		while (rs.next()) {
			Ontology o = deserialize(rs, Ontology.FIELD_ALL_FIELDS);
			arrOntologies.add(o);
		}

		rs.getStatement().getConnection().close();
		rs.getStatement().close();
		rs.close();

		return ((Ontology[]) arrOntologies.toArray((Object[]) new Ontology[arrOntologies.size()]));
	}

	public static Ontology getDocumentResultAndOntology(long lDocumentID) throws SQLException {

		// Gets the result of the most recently processed ontology for the
		// specified document.

		ResultSet rs = com.searchincite.server.data.OntologyData.getDocumentResultAndOntology(lDocumentID);

		// Move to first row, which is a ResultSet containing ontologies (ONE
		// ontology -- hopefully!)
		if (!rs.next()) {
			return null;
		}

		// Get reference to first ResultSet (ontologies)
		ResultSet rsOntology = (ResultSet) rs.getObject(1);

		Ontology o = null;

		if (rsOntology.next()) {
			o = deserialize(rsOntology, Ontology.FIELD_ALL_FIELDS);
		} else {
			// Ontology wasn't found (invalid ontology_id?)
			return null;
		}

		// Move to second row, which is a ResultSet containing subjects,
		// ontology.subject (if called for in lFieldMask)
		if (rs.next()) {

			ResultSet rsSubjects = (ResultSet) rs.getObject(1);

			// Call SubjectManager.Deserialize() to get subjects
			ArrayList arrSubjects = null;

			while (rsSubjects.next()) {

				if (arrSubjects == null) {
					arrSubjects = new ArrayList();
				}

				arrSubjects.add(SubjectManager.deserialize(rsSubjects, 0));
			}

			rsSubjects.close();

			if (arrSubjects != null) {
				o.setSubjects(((Subject[]) arrSubjects.toArray((Object[]) new Subject[arrSubjects.size()])));

				// Move to third row, which is a ResultSet containing phrases,
				// ontology.phrase (if called for in lFieldMask)
				if (rs.next()) {

					ResultSet rsPhrases = (ResultSet) rs.getObject(1);

					// Call PhraseManager.Deserialize() to get phrases

					Hashtable ht = new Hashtable(); // Hashtable containing
													// ArrayLists of Phrases,
													// keyed by subject_id

					while (rsPhrases.next()) {

						int iSubjectID = rsPhrases.getInt("subject_id");

						ArrayList arrPhrases = (ArrayList) ht.get(String.valueOf(iSubjectID));

						if (arrPhrases == null) {
							arrPhrases = new ArrayList();
							ht.put(String.valueOf(iSubjectID), arrPhrases);
						}

						arrPhrases.add(PhraseManager.deserialize(rsPhrases, 0));
					}

					// For each subject in the Ontology, get the ArrayList of
					// phrases out of the Hashtable.
					// (The hashtable is keyed on subject id.)
					for (int iSubjectCount = 0; iSubjectCount < o.getSubjects().length; iSubjectCount++) {

						Subject s = o.getSubjects()[iSubjectCount];

						ArrayList arrPhrases = (ArrayList) ht.get(String.valueOf(s.getSubjectID()));
						if (arrPhrases != null) {
							s.setPhrases(((Phrase[]) arrPhrases.toArray((Object[]) new Phrase[arrPhrases.size()])));
						}
					}

					rsPhrases.close();
				}
			}
		}

		rs.getStatement().getConnection().close();
		rs.getStatement().close();
		rs.close();

		return o;
	}

	public static int importOntologyCSV(String fileContent, User u, String sessionID) throws SQLException, IOException {

		int result = 1; // load success
		Connection db = null;
		CSVReader reader = new CSVReader(new InputStreamReader(new FileInputStream(fileContent), Charsets.UTF_8));

		try {
			// get connection
			db = OntologyData.getDBConnection();

			// define csv record
			String[] record = null;// reader.readNext();

			// purge data for current sessionID
			OntologyData.purgeOntologyImportBySessionID(db, sessionID);

			// get each record from CSV file
			while ((record = reader.readNext()) != null) {
				OntologyCSV ontologyCSV = new OntologyCSV();
				ontologyCSV.setOrgID(record[0]); // org_id
				ontologyCSV.setCategoryID(record[1]); // category_id
				ontologyCSV.setCategoryName(record[2]); // category_name
				ontologyCSV.setOntologyID(record[3]); // ontology_id
				ontologyCSV.setOntologyName(record[4]); // ontology_name
				ontologyCSV.setOntologyDescription(record[5]); // ontology_description
				ontologyCSV.setSubjectID(record[6]); // subjtec_id
				ontologyCSV.setSubjectName(record[7]); // subject_name
				ontologyCSV.setSubjectColor(record[8]); // subject color
				ontologyCSV.setSubjectWeight(record[9]); // subject weight
				ontologyCSV.setPhraseID(record[10]); // phrase_id
				ontologyCSV.setPhraseName(record[11]); // phrase_name
				ontologyCSV.setPhraseColor(record[12]); // phrase_color
				ontologyCSV.setPhraseWeight(record[13]); // phrase weight

				result = OntologyData.populateOntologyImportGtt(db, ontologyCSV, String.valueOf(u.getUserID()),
						sessionID);

				// break if error at record load
				if (result < 0)
					break;
			}

			// free CSVReader
			reader.close();

			log.log(Level.INFO, "result={0}", result);

			// processing loaded data into GTT
			result = OntologyData.importOntologyProcess(db, sessionID);

			// purge data for current sessionID
			OntologyData.purgeOntologyImportBySessionID(db, sessionID);

			// commit changes
			db.commit();
		} catch (SQLException e) {
			db.rollback();
			result = -1;
			e.printStackTrace();
			log.log(Level.SEVERE, e.getLocalizedMessage());
		} finally {
			if (db != null)
				db.close();

			if (reader != null)
				reader.close();
		}

		return result;
	}

}
