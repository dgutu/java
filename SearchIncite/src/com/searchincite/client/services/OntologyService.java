package com.searchincite.client.services;

import java.io.File;

import com.google.gwt.user.client.rpc.RemoteService;
import com.searchincite.client.entity.Ontology;

public interface OntologyService extends RemoteService {

	// SECURITY WARNING: Don't EVER accept or use an org_id passed in from the caller of a Web service!!

	Ontology[] getOntologiesForOrganization(long lFieldMask) throws Exception;
	Ontology getOntologyByID(int iOntologyID, long lFieldMask) throws Exception;
	Ontology[] getOntologiesForCategoryID(int iCategoryID, long lFieldMask) throws Exception;
	Ontology createOntology(Ontology ontology) throws Exception;
	Ontology updateOntology(Ontology ontology) throws Exception;
	void deleteOntology(int iOntologyID) throws Exception;
	Ontology copyOntology(int iOntologyID, int iDestinationCategoryID, String strDestinationOntologyName, int iDestinationOrgID) throws Exception;
	int getExportOntologyCount(int ontologyID) throws Exception;
	String getExportOntologyFile(int ontologyID) throws Exception;
}
