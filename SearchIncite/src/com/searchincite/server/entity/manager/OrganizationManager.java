package com.searchincite.server.entity.manager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.searchincite.client.entity.Organization;

public class OrganizationManager {

	public static Organization[] getOrganizations(long lFieldMask) throws SQLException {
		
		ResultSet rs = com.searchincite.server.data.OrganizationData.getOrganizations();
		ArrayList arrOrganizations = new ArrayList();
		
		// Move to first row, which is a ResultSet containing document sources (ONE Organization -- hopefully!)
		if (!rs.next()) {
			return null;			
		}

		// Get reference to first ResultSet (organizations)
		ResultSet rsOrg = (ResultSet)rs.getObject(1);
		
		while (rsOrg.next()) {
			Organization ds = deserialize(rsOrg, lFieldMask);
			arrOrganizations.add(ds);
		}
		
		rsOrg.close();
		
		/*
		// Move to second row, which is a ResultSet containing ontologies to which the document sources are tied
		if (rs.next()) {

			ResultSet rsOntologies = (ResultSet)rs.getObject(1);
			Hashtable ht = new Hashtable(); // Hashtable containing ArrayLists of Ontologies, keyed by document_source_id
			
			while (rsOntologies.next()) {

				int iOrganizationID = rsOntologies.getInt("document_source_id");
				
				for (int iDocSources = 0; iDocSources < arrOrganizations.size(); iDocSources++) {
					
					if (((Organization)arrOrganizations.get(iDocSources)).getOrganizationID() == iOrganizationID) {

						ArrayList arrOntologies = (ArrayList)ht.get(String.valueOf(iOrganizationID));
						
						if (arrOntologies == null) {
							arrOntologies = new ArrayList();
							ht.put(String.valueOf(iOrganizationID), arrOntologies);
						}

						arrOntologies.add(OntologyManager.deserialize(rsOntologies, Ontology.FIELD_NAME));

					}
				}
			}

			// For each Organization, get the ArrayList of ontologies out of the Hashtable.
			// (The hashtable is keyed on document source id.)
			for (int iDocSourceCount = 0; iDocSourceCount < arrOrganizations.size(); iDocSourceCount++) {
				
				Organization ds = (Organization)arrOrganizations.get(iDocSourceCount);
				
				ArrayList arrOntologies = (ArrayList)ht.get(String.valueOf(ds.getOrganizationID()));
				if (arrOntologies != null) {
					ds.setOntologies(((Ontology[])arrOntologies.toArray((Object[])new Ontology[arrOntologies.size()])));
				}
			}
			rsOntologies.close();
		}
		 */
		
		rs.getStatement().getConnection().close();
		rs.getStatement().close();
		rs.close();
		
		return  ((Organization[])arrOrganizations.toArray((Object[])new Organization[arrOrganizations.size()]));
	}
	
	public static Organization deserialize(ResultSet rs, long lFieldMask) throws SQLException {

		Organization org = new Organization();
		org.setOrganizationID(rs.getInt("org_id"));
		org.setOrganizationName(rs.getString("name"));
		org.setAddressLine1(rs.getString("address"));
		org.setAddressLine2(rs.getString("address2"));
		org.setCity(rs.getString("city"));
		org.setState(rs.getString("state"));
		org.setPostalCode(rs.getString("postal_code"));
		org.setDateCreated(new java.util.Date(rs.getDate("creation_date").getTime()));
		org.setCreatedByUserID(rs.getInt("created_by"));
		org.setLastModifiedDate(new java.util.Date(rs.getDate("last_modified_date").getTime()));
		org.setLastModifiedByUserID(rs.getInt("last_modified_by"));

		return org;
	}
	
	public static Organization createOrganization(Organization org) throws SQLException {

		if (org.getCreatedByUserID() <= 0) {
			return null;			
		}

		int iNewID = com.searchincite.server.data.OrganizationData.createOrganization(
				org.getOrganizationName(),
				org.getAddressLine1(), 
				org.getAddressLine2(),
				org.getCity(),
				org.getState(),
				org.getPostalCode(),
				org.getCreatedByUserID());
		
		org.setOrganizationID(iNewID);

		return org;
	}

	public static Organization createOrganizationWithGuid(Organization org) throws SQLException {

		if (org.getCreatedByUserID() <= 0) {
			return null;			
		}

		int iNewID = com.searchincite.server.data.OrganizationData.createOrganization(
				org.getOrganizationName(),
				org.getAddressLine1(), 
				org.getAddressLine2(),
				org.getCity(),
				org.getState(),
				org.getPostalCode(),
				org.getCreatedByUserID(),
				org.getGuid());
		
		org.setOrganizationID(iNewID);

		return org;
	}

	public static void deleteOrganization(int iOrganizationID) throws SQLException {
		com.searchincite.server.data.OrganizationData.deleteOrganization(iOrganizationID); 
	}

	public static void updateOrganization(Organization org) throws SQLException {
		
		com.searchincite.server.data.OrganizationData.updateOrganization (
				org.getOrganizationID(),
				org.getOrganizationName(),
				org.getAddressLine1(), 
				org.getAddressLine2(),
				org.getCity(),
				org.getState(),
				org.getPostalCode(),
				org.getCreatedByUserID()
		);
	}

	public static Organization getOrganizationByID(int iOrganizationID, long lFieldMask) throws SQLException {
		
		ResultSet rs = com.searchincite.server.data.OrganizationData.getOrganizationByID(iOrganizationID, lFieldMask);

		// Move to first row, which is a ResultSet containing Organizations (ONE Organization -- hopefully!)
		if (!rs.next()) {
			return null;			
		}

		// Get reference to first ResultSet (Organizations)
		ResultSet rsOrganization = (ResultSet)rs.getObject(1);
			
		Organization org = null;
		
		if (rsOrganization.next()) {
			org = deserialize(rsOrganization, lFieldMask);
		}
		//else {
			// Organization wasn't found (invalid Organization_id?)
			// (null will be returned)
		//}

		rs.getStatement().getConnection().close();
		rs.getStatement().close();
		rs.close();
		
		return org;
	}

}
