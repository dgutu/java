package com.searchincite.server.entity.manager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.searchincite.client.entity.Category;
import com.searchincite.client.entity.Ontology;

public class CateogryManager {

	public static Category[] getCategoriesForOrganization(int iOrganizationID, long lFieldMask) throws SQLException {
		
		ResultSet rs = com.searchincite.server.data.CategoryData.getCategoriesForOrganization(iOrganizationID);
		
		ArrayList arrCategories = new ArrayList();
		
		while (rs.next()) {
			Category c = deserialize(rs, lFieldMask);
			arrCategories.add(c);
		}
		
		//TODO: Move to next ResultSet and call SubjectManager.Deserialize() to get
		//		subjects (if specified in lFieldMask)
		/*
		if ((lFieldMask & Ontology.FIELD_SUBJECTS) == Ontology.FIELD_SUBJECTS) {

			for (int i = 0; i < arrOntologies.size(); i++) {
				
				Ontology o = (Ontology)arrOntologies.get(i);
				
				o.setSubjects(SubjectManager.getSubjectsForOntology(o.getOntologyID(), 0));
			}
		}
		*/
		
		rs.getStatement().getConnection().close();
		rs.getStatement().close();
		rs.close();
		
		return((Category[])arrCategories.toArray((Object[])new Category[arrCategories.size()]));
	}
	
	public static Category getCategoryByID(int iCategoryID, long lFieldMask) throws SQLException {
		
		ResultSet rs = com.searchincite.server.data.CategoryData.getCategoryByID(iCategoryID, lFieldMask);

		// Move to first row, which is a ResultSet containing categories (ONE cateogry -- for now.)
		//TODO: Categories may contain other categories
		
		if (!rs.next()) {
			return null;			
		}

		// Get reference to first ResultSet (categories)
		ResultSet rsCategory = (ResultSet)rs.getObject(1);
			
		Category c = null;
		
		if (rsCategory.next()) {
			c = deserialize(rsCategory, lFieldMask);
		}
		else {
			// Category wasn't found (invalid category_id?)
			return null;
		}
		
		// Move to second row, which is a ResultSet containing ontologies (if called for in lFieldMask)
		if (rs.next() && (lFieldMask & Category.FIELD_ONTOLOGIES) == Category.FIELD_ONTOLOGIES) {

			ResultSet rsOntologies = (ResultSet)rs.getObject(1);

			ArrayList arrOntologies = null;
			
			while (rsOntologies.next()) {

				if (arrOntologies == null) {
					arrOntologies = new ArrayList();
				}
				
				//TODO: Invent a good way to pass the fields that we want for the ontology (e.g. in lFieldMask)
				arrOntologies.add(OntologyManager.deserialize(rsOntologies, Ontology.FIELD_ID | Ontology.FIELD_NAME));
			}

			rsOntologies.close();

			if (arrOntologies != null) {
				c.setOntologies(((Ontology[])arrOntologies.toArray((Object[])new Ontology[arrOntologies.size()])));

				//TODO: Finish this - need to get subjects and phrases, if call for in lFieldMask
				
				/*
				// Move to third result set (third "row" in rs), which is a ResultSet containing subjects (if called for in lFieldMask)
				if (rs.next() && (lFieldMask & Ontology.FIELD_PHRASES) == Ontology.FIELD_PHRASES) {

					ResultSet rsPhrases = (ResultSet)rs.getObject(1);

					// Call PhraseManager.Deserialize() to get phrases
					
					Hashtable ht = new Hashtable(); // Hashtable containing ArrayLists of Phrases, keyed by subject_id
					
					while (rsPhrases.next()) {

						int iSubjectID = rsPhrases.getInt("subject_id");
						
						ArrayList arrPhrases = (ArrayList)ht.get(String.valueOf(iSubjectID));
						
						if (arrPhrases == null) {
							arrPhrases = new ArrayList();
							ht.put(String.valueOf(iSubjectID), arrPhrases);
						}

						arrPhrases.add(PhraseManager.deserialize(rsPhrases, 0));
					}

					rsPhrases.close();

					// For each subject in the Ontology, get the ArrayList of phrases out of the Hashtable.
					// (The hashtable is keyed on subject id.)
					for (int iSubjectCount = 0; iSubjectCount < o.getSubjects().length; iSubjectCount++) {
						
						Subject s = o.getSubjects()[iSubjectCount];
						
						ArrayList arrPhrases = (ArrayList)ht.get(String.valueOf(s.getSubjectID()));
						if (arrPhrases != null) {
							s.setPhrases(((Phrase[])arrPhrases.toArray((Object[])new Phrase[arrPhrases.size()])));
						}
					}
					
					// Move to fourth result set (fourth "row" in rs), which is a ResultSet containing phrases (if called for in lFieldMask)
					if (rs.next() && (lFieldMask & Ontology.FIELD_PHRASES) == Ontology.FIELD_PHRASES) {

						ResultSet rsPhrases = (ResultSet)rs.getObject(1);

						// Call PhraseManager.Deserialize() to get phrases
						
						Hashtable ht = new Hashtable(); // Hashtable containing ArrayLists of Phrases, keyed by subject_id
						
						while (rsPhrases.next()) {

							int iSubjectID = rsPhrases.getInt("subject_id");
							
							ArrayList arrPhrases = (ArrayList)ht.get(String.valueOf(iSubjectID));
							
							if (arrPhrases == null) {
								arrPhrases = new ArrayList();
								ht.put(String.valueOf(iSubjectID), arrPhrases);
							}

							arrPhrases.add(PhraseManager.deserialize(rsPhrases, 0));
						}

						rsPhrases.close();

						// For each subject in the Ontology, get the ArrayList of phrases out of the Hashtable.
						// (The hashtable is keyed on subject id.)
						for (int iSubjectCount = 0; iSubjectCount < o.getSubjects().length; iSubjectCount++) {
							
							Subject s = o.getSubjects()[iSubjectCount];
							
							ArrayList arrPhrases = (ArrayList)ht.get(String.valueOf(s.getSubjectID()));
							if (arrPhrases != null) {
								s.setPhrases(((Phrase[])arrPhrases.toArray((Object[])new Phrase[arrPhrases.size()])));
							}
						}
						
					}

				}
				*/	
				

			}
			

		}

		rs.getStatement().getConnection().close();
		rs.getStatement().close();
		rs.close();
		
		return c;
	}

	public static Category deserialize(ResultSet rs, long lFieldMask) throws SQLException {

		Category c = new Category();

		c.setOrganizationID(rs.getInt("org_id"));
		c.setCategoryID(rs.getInt("category_id"));
		c.setName(rs.getString("name"));
		c.setDateCreated(new java.util.Date(rs.getDate("creation_date").getTime()));
		c.setCreatedByUserID(rs.getInt("created_by"));

		if ((lFieldMask & Category.FIELD_PARENT_ID) == Category.FIELD_PARENT_ID) {
			c.setParentID(rs.getInt("parent_id"));
		}
		
		c.setLastModifiedDate(new java.util.Date(rs.getDate("last_modified_date").getTime()));
		c.setLastModifiedByUserID(rs.getInt("last_modified_by"));
		
		return c;
	}

	public static Category createCategory(Category category) throws SQLException {

		if (category.getCreatedByUserID() <= 0) {
			return null;			
		}
		
		int iNewID = com.searchincite.server.data.CategoryData.createCategory(
				category.getOrganizationID(), 
				category.getParentID(),  
				category.getName(), 
				category.getCreatedByUserID());
		
		category.setCategoryID(iNewID);

		return category;
	}

	public static void deleteCategory(int iCategoryID, int iUserID, int iOrgID) throws SQLException {
		com.searchincite.server.data.CategoryData.deleteCategory(iCategoryID, iUserID, iOrgID); 
	}

	public static void updateCategory(Category category) throws SQLException {

		com.searchincite.server.data.CategoryData.updateCategory (
				category.getCategoryID(), 
				category.getOrganizationID(), 
				category.getParentID(),
				category.getName(), 
				category.getLastModifiedByUserID()); 
	}
	 
}
