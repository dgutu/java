package com.searchincite.client.services;

import java.io.File;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.searchincite.client.entity.Ontology;

public interface OntologyServiceAsync {

	// SECURITY WARNING: Don't EVER accept or use an org_id passed in from the caller of a Web service!!

	void getOntologiesForOrganization(long lFieldMask, AsyncCallback callback);
	void getOntologyByID(int iOntologyID, long lFieldMask, AsyncCallback callback);
	void getOntologiesForCategoryID(int iCategoryID, long lFieldMask, AsyncCallback callback);
	void createOntology(Ontology o, AsyncCallback callback) throws Exception;
	void updateOntology(Ontology o, AsyncCallback callback) throws Exception;
	void deleteOntology(int iOntologyID, AsyncCallback callback) throws Exception;
	void copyOntology(int iOntologyID, int iDestinationCategoryID, String strDestinationOntologyName, int iDestinationOrgID, AsyncCallback callback) throws Exception;
	void getExportOntologyCount(int ontologyID, AsyncCallback callback);
	void getExportOntologyFile(int ontologyID, AsyncCallback callback);
}
