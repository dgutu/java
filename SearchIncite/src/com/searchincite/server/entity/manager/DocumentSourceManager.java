package com.searchincite.server.entity.manager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Hashtable;

import com.searchincite.client.entity.Document;
import com.searchincite.client.entity.DocumentResult;
import com.searchincite.client.entity.DocumentSource;
import com.searchincite.client.entity.DocumentWithResult;
import com.searchincite.client.entity.Ontology;

//import com.searchincite.client.entity.Autofeed;

public class DocumentSourceManager {

	public static DocumentSource[] getDocumentSourcesForOrganiztaion(
			int iOrganizationID, long lFieldMask) throws SQLException {

		ResultSet rs = com.searchincite.server.data.DocumentSourceData
				.getDocumentSourcesForOrganiztaion(iOrganizationID);
		ArrayList arrDocumentSources = new ArrayList();

		// Move to first row, which is a ResultSet containing document sources
		// (ONE DocumentSource -- hopefully!)
		if (!rs.next()) {
			return null;
		}

		// Get reference to first ResultSet (document sources)
		ResultSet rsDocSources = (ResultSet) rs.getObject(1);

		while (rsDocSources.next()) {
			DocumentSource ds = deserialize(rsDocSources, lFieldMask);
			arrDocumentSources.add(ds);
		}

		rsDocSources.close();

		// Move to second row, which is a ResultSet containing ontologies to
		// which the document sources are tied
		if (rs.next()) {

			ResultSet rsOntologies = (ResultSet) rs.getObject(1);
			Hashtable ht = new Hashtable(); // Hashtable containing ArrayLists
											// of Ontologies, keyed by
											// document_source_id

			while (rsOntologies.next()) {

				int iDocumentSourceID = rsOntologies
						.getInt("document_source_id");

				for (int iDocSources = 0; iDocSources < arrDocumentSources
						.size(); iDocSources++) {

					if (((DocumentSource) arrDocumentSources.get(iDocSources))
							.getDocumentSourceID() == iDocumentSourceID) {

						ArrayList arrOntologies = (ArrayList) ht.get(String
								.valueOf(iDocumentSourceID));

						if (arrOntologies == null) {
							arrOntologies = new ArrayList();
							ht.put(String.valueOf(iDocumentSourceID),
									arrOntologies);
						}

						arrOntologies.add(OntologyManager.deserialize(
								rsOntologies, Ontology.FIELD_NAME));

					}
				}
			}

			// For each DocumentSource, get the ArrayList of ontologies out of
			// the Hashtable.
			// (The hashtable is keyed on document source id.)
			for (int iDocSourceCount = 0; iDocSourceCount < arrDocumentSources
					.size(); iDocSourceCount++) {

				DocumentSource ds = (DocumentSource) arrDocumentSources
						.get(iDocSourceCount);

				ArrayList arrOntologies = (ArrayList) ht.get(String.valueOf(ds
						.getDocumentSourceID()));
				if (arrOntologies != null) {
					ds.setOntologies(((Ontology[]) arrOntologies
							.toArray((Object[]) new Ontology[arrOntologies
									.size()])));
				}
			}
			rsOntologies.close();
		}

		rs.getStatement().getConnection().close();
		rs.getStatement().close();
		rs.close();

		return ((DocumentSource[]) arrDocumentSources
				.toArray((Object[]) new DocumentSource[arrDocumentSources
						.size()]));
	}

	public static DocumentSource deserialize(ResultSet rs, long lFieldMask)
			throws SQLException {

		// Serialization will fail and a JavaScript error will be
		// displayed on the page if you use getDate() -- like this:
		// s.setLastModifiedDate(subjResults.getDate("last_modified_date"));
		// //DON'T DO THIS!
		// (Apparently, GWT can't serialize java.sql.Date even though it IS a
		// java.util.Date.)

		DocumentSource s = new DocumentSource();
		s.setDocumentSourceID(rs.getInt("document_source_id"));
		s.setDocumentSource(rs.getString("document_source"));
		s.setOrganizationID(rs.getInt("org_id"));
		s.setDateCreated(new java.util.Date(rs.getDate("creation_date")
				.getTime()));
		s.setCreatedByUserID(rs.getInt("created_by"));
		s.setLastModifiedDate(new java.util.Date(rs.getDate(
				"last_modified_date").getTime()));
		s.setLastModifiedByUserID(rs.getInt("last_modified_by"));

		return s;
	}

	public static DocumentSource createDocumentSource(DocumentSource s)
			throws SQLException {

		if (s.getCreatedByUserID() <= 0) {
			return null;
		}

		int[] iArrOntologyIDs = new int[s.getOntologies().length];

		for (int i = 0; i < s.getOntologies().length; i++) {
			iArrOntologyIDs[i] = s.getOntologies()[i].getOntologyID();
		}

		int iNewID = com.searchincite.server.data.DocumentSourceData
				.createDocumentSource(s.getOrganizationID(), s
						.getDocumentSource(), iArrOntologyIDs, s
						.getCreatedByUserID());

		s.setDocumentSourceID(iNewID);

		return s;
	}

	public static void deleteDocumentSource(int iDocumentSourceID, int iOrgID)
			throws SQLException {
		com.searchincite.server.data.DocumentSourceData.deleteDocumentSource(
				iDocumentSourceID, iOrgID);
	}

	public static void updateDocumentSource(DocumentSource s)
			throws SQLException {

		int[] iArrOntologyIDs = new int[s.getOntologies().length];

		for (int i = 0; i < s.getOntologies().length; i++) {
			iArrOntologyIDs[i] = s.getOntologies()[i].getOntologyID();
		}

		com.searchincite.server.data.DocumentSourceData.updateDocumentSource(s
				.getDocumentSourceID(), s.getOrganizationID(), s
				.getDocumentSource(), iArrOntologyIDs, s
				.getLastModifiedByUserID());
	}

	public static DocumentSource getDocumentSourceByID(int iDocumentSourceID,
			long lFieldMask) throws SQLException {

		ResultSet rs = com.searchincite.server.data.DocumentSourceData
				.getDocumentSourceByID(iDocumentSourceID, lFieldMask);

		// Move to first row, which is a ResultSet containing DocumentSources
		// (ONE DocumentSource -- hopefully!)
		if (!rs.next()) {
			return null;
		}

		// Get reference to first ResultSet (documentSources)
		ResultSet rsDocumentSource = (ResultSet) rs.getObject(1);

		DocumentSource s = null;

		if (rsDocumentSource.next()) {
			s = deserialize(rsDocumentSource, lFieldMask);
		} else {
			// DocumentSource wasn't found (invalid documentSource_id?)
			return null;
		}

		// 1st RS is document source, 2nd is ONTOLOGIES * !!! NOTE !!! THIS IS
		// DIFFERENT THAN OTHER FUNCTIONS !!!
		// 3rd RS is DOCUMENTS * !!! NOTE !!! THIS IS DIFFERENT THAN OTHER
		// FUNCTIONS !!!
		// Up to THREE result sets may be returned -> document sources,
		// ontologies, and documents!

		// Move to second row, which is a ResultSet containing ONTOLOGIES
		// (REGARDLESS of lFieldMask)
		if (rs.next()) {

			ResultSet rsOntologies = (ResultSet) rs.getObject(1);

			ArrayList arrOntologies = null;

			while (rsOntologies.next()) {

				if (arrOntologies == null) {
					arrOntologies = new ArrayList();
				}

				arrOntologies.add(OntologyManager.deserialize(rsOntologies,
						Ontology.FIELD_ALL_FIELDS));
			}

			rsOntologies.close();

			if (arrOntologies != null) {
				s
						.setOntologies(((Ontology[]) arrOntologies
								.toArray((Object[]) new Ontology[arrOntologies
										.size()])));
			}
		}

		// Move to third row, which is a ResultSet containing Documents (if
		// specified in lFieldMask)
		if (rs.next()
				&& (lFieldMask & DocumentSource.FIELD_DOCUMENTS) == DocumentSource.FIELD_DOCUMENTS) {

			ResultSet rsDocuments = (ResultSet) rs.getObject(1);

			ArrayList arrDocuments = null;

			while (rsDocuments.next()) {

				if (arrDocuments == null) {
					arrDocuments = new ArrayList();
				}

				DocumentWithResult dwr = new DocumentWithResult();

				// NOTE: Document CONTENT is NOT retrieved/deserialized
				dwr = (DocumentWithResult) DocumentManager.deserialize(
						rsDocuments, dwr, Document.FIELD_ALL_FIELDS
								^ Document.FIELD_CONTENT);

				DocumentResult dr = new DocumentResult();
				dr.setDocumentID(dwr.getDocumentID());
				dr.setDocumentStatus(rsDocuments.getString("status"));
				dr.setDocumentStatusID(rsDocuments.getInt("status_id"));

				Ontology o = new Ontology();
				o.setOntologyID(rsDocuments.getInt("ontology_id"));
				o.setName(rsDocuments.getString("name"));
				dr.setOntology(o);
				dwr.setDocumentResult(dr);

				// arrDocuments.add(DocumentManager.deserialize(rsDocuments,
				// Document.FIELD_ALL_FIELDS ^ Document.FIELD_CONTENT));
				arrDocuments.add(dwr);
			}

			rsDocuments.close();

			if (arrDocuments != null) {
				s.setDocuments(((DocumentWithResult[]) arrDocuments
						.toArray((Object[]) new DocumentWithResult[arrDocuments
								.size()])));
			}

		}

		// Start ewayman's code
		// ResultSet rsAutofeeds =
		// com.searchincite.server.data.DocumentData.getAllURLsForDocumentSource
		// (true, iDocumentSourceID);
		//		
		// ArrayList arrAutofeeds = null;
		//		
		// while(rsAutofeeds.next()) {
		//			
		// if (arrAutofeeds == null) {
		// arrAutofeeds = new ArrayList();
		// }
		//			
		// Autofeed a = new Autofeed();
		//			
		// a = (Autofeed)AutofeedManager.deserialize(rsAutofeeds, a,
		// Autofeed.FIELD_ALL_FIELDS ^ Autofeed.FIELD_CONTENT);
		//			
		//
		// arrAutofeeds.add(a);
		// }
		//		
		// rsAutofeeds.close();
		//		
		// if (arrAutofeeds != null) {
		// s.setAutofeeds(((Autofeed[])arrAutofeeds.toArray((Object[])new
		// Autofeed[arrAutofeeds.size()])));
		// }
		// End ewayman's code

		rs.getStatement().getConnection().close();
		rs.getStatement().close();
		rs.close();

		return s;
	}

}
