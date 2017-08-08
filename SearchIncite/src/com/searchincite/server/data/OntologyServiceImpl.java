package com.searchincite.server.data;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.searchincite.api.entity.User;
import com.searchincite.client.data.constants.SecurityConstants;
import com.searchincite.client.entity.Ontology;
import com.searchincite.client.services.OntologyService;
import com.searchincite.server.entity.manager.UserManager;

import au.com.bytecode.opencsv.CSVWriter;

public class OntologyServiceImpl extends RemoteServiceServlet implements OntologyService {

	private static final long serialVersionUID = 1L;

	// logger
	private final static Logger log = Logger.getLogger(OntologyServiceImpl.class.getName());

	public Ontology[] getOntologiesForOrganization(long lFieldMask) throws Exception {

		HttpServletRequest req = getThreadLocalRequest();
		User u = (User) req.getSession().getAttribute("user");

		if (u == null) {
			throw new Exception("Access denied.");
		}

		return getOntologiesForOrganization(u.getOrganizationID(), lFieldMask);

	}

	public Ontology[] getOntologiesForOrganization(int iOrganizationID, long lFieldMask) throws Exception {

		Ontology[] arrOntologies = null;

		try {
			arrOntologies = com.searchincite.server.entity.manager.OntologyManager
					.getOntologiesForOrganization(iOrganizationID, lFieldMask);

			HttpServletRequest req = getThreadLocalRequest();
			User u = (User) req.getSession().getAttribute("user");

			// If user is not an SI Admin, they can't view ontologies for other
			// organizations
			if (!UserManager.isSIAdmin(u.getUserID())) {
				for (int i = 0; i < arrOntologies.length; i++) {
					if (arrOntologies[i].getOrganizationID() != u.getOrganizationID()) {
						throw new Exception("Access denied.");
					}
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return arrOntologies;
	}

	public Ontology getOntologyByID(int iOntologyID, long lFieldMask) throws Exception {

		Ontology o = null;

		try {
			o = com.searchincite.server.entity.manager.OntologyManager.getOntologyByID(iOntologyID, lFieldMask);

			HttpServletRequest req = getThreadLocalRequest();
			User u = (User) req.getSession().getAttribute("user");

			// If user is not an SI Admin, they can't get an ontology for
			// another organization
			if (!UserManager.isSIAdmin(u.getUserID())) {
				if (o.getOrganizationID() != u.getOrganizationID()) {
					log.log(Level.WARNING, "Access denied for user={0} with org_id={1}",
							new Object[] { u.getUserID(), u.getOrganizationID() });
					throw new Exception("Access denied.");
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return o;
	}

	public Ontology[] getOntologiesForCategoryID(int iCategoryID, long lFieldMask) throws Exception {

		// log.log(Level.INFO, "iCategoryID={0}", iCategoryID);
		// log.log(Level.INFO, "lFieldMask={0}", lFieldMask);

		Ontology[] arrOntologies = null;

		try {
			arrOntologies = com.searchincite.server.entity.manager.OntologyManager
					.getOntologiesByCategoryID(iCategoryID, lFieldMask);

			HttpServletRequest req = getThreadLocalRequest();
			User u = (User) req.getSession().getAttribute("user");

			// If user is not an SI Admin, they can't view ontologies for other
			// organizations
			if (!UserManager.isSIAdmin(u.getUserID())) {
				for (int i = 0; i < arrOntologies.length; i++) {
					if (arrOntologies[i].getOrganizationID() != u.getOrganizationID()) {
						log.log(Level.WARNING, "Access denied for user={0} with org_id={1}",
								new Object[] { u.getUserID(), u.getOrganizationID() });
						throw new Exception("Access denied.");
					}
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		log.log(Level.INFO, "end OntologyServiceImpl.getOntologiesForCategoryID return arrOntologies={0} ...",
				arrOntologies.length);
		return arrOntologies;
	}

	public Ontology createOntology(Ontology ontology) throws Exception {
		HttpServletRequest req = getThreadLocalRequest();
		User u = (User) req.getSession().getAttribute("user");

		if (u == null) {
			throw new Exception("Access denied.");
		}

		// If user is not an SI Admin, they can't create ontologies for other
		// organizations
		if (!UserManager.isSIAdmin(u.getUserID())) {
			ontology.setOrganizationID(u.getOrganizationID());
		}

		ontology.setCreatedByUserID(u.getUserID());
		ontology.setDateCreated(new Date());
		ontology.setLastModifiedByUserID(u.getUserID());
		ontology.setLastModifiedDate(new Date());

		return com.searchincite.server.entity.manager.OntologyManager.createOntology(ontology);
	}

	public void deleteOntology(int iOntologyID) throws Exception {
		HttpServletRequest req = getThreadLocalRequest();
		User u = (User) req.getSession().getAttribute("user");

		if (u == null) {
			throw new Exception("Access denied.");
		}

		// If user is not an SI Admin, Org Admin or Ontology Builder, they can't
		// delete ontologies
		boolean bIsSIAdmin = UserManager.isSIAdmin(u.getUserID());
		boolean bIsOrgAdmin = UserManager.isOrganizationAdmin(u.getUserID());
		boolean bIsOntologyBuilder = UserManager.isUserInSecurityRole(u.getUserID(),
				SecurityConstants.ROLE_ONTOLOGY_BUILDER);

		if (!bIsSIAdmin && !bIsOrgAdmin && !bIsOntologyBuilder) {
			throw new Exception("Access denied.");
		}

		Ontology o = getOntologyByID(iOntologyID, Ontology.FIELD_ID);

		if (!bIsSIAdmin) {
			// User is not an SI Admin; the ontology they are deleting must
			// belong to THEIR organization
			if (o.getOrganizationID() != u.getOrganizationID()) {
				throw new Exception("Access denied.");
			}
			com.searchincite.server.entity.manager.OntologyManager.deleteOntology(iOntologyID, u.getOrganizationID());
		} else {
			// User is an SI Admin -- delete the ontology no matter what
			// organization it belongs to.
			com.searchincite.server.entity.manager.OntologyManager.deleteOntology(iOntologyID, o.getOrganizationID());
		}
	}

	public Ontology updateOntology(Ontology ontologyToUpdate) throws Exception {

		HttpServletRequest req = getThreadLocalRequest();
		User u = (User) req.getSession().getAttribute("user");

		if (u == null) {
			return null;
		}

		// If user is not an SI Admin, Org Admin or Ontology Builder, they can't
		// update ontologies
		boolean bIsSIAdmin = UserManager.isSIAdmin(u.getUserID());
		boolean bIsOrgAdmin = UserManager.isOrganizationAdmin(u.getUserID());
		boolean bIsOntologyBuilder = UserManager.isUserInSecurityRole(u.getUserID(),
				SecurityConstants.ROLE_ONTOLOGY_BUILDER);

		if (!bIsSIAdmin && !bIsOrgAdmin && !bIsOntologyBuilder) {
			throw new Exception("Access denied.");
		}

		Ontology o = getOntologyByID(ontologyToUpdate.getOntologyID(), Ontology.FIELD_ID);

		if (!bIsSIAdmin) {
			// User is not an SI Admin; the ontology they are updating must
			// belong to THEIR organization
			if (o.getOrganizationID() != u.getOrganizationID()) {
				throw new Exception("Access denied.");
			}
		}

		ontologyToUpdate.setLastModifiedByUserID(u.getUserID());
		ontologyToUpdate.setLastModifiedDate(new Date());
		ontologyToUpdate.setOrganizationID(o.getOrganizationID());

		com.searchincite.server.entity.manager.OntologyManager.updateOntology(ontologyToUpdate);
		return ontologyToUpdate;
	}

	public Ontology copyOntology(int iOntologyID, int iDestinationCategoryID, String strDestinationOntologyName,
			int iDestinationOrgID) throws Exception {

		HttpServletRequest req = getThreadLocalRequest();
		User u = (User) req.getSession().getAttribute("user");

		if (u == null) {
			throw new Exception("Access denied.");
		}

		// If user is not an SI Admin, Org Admin or Ontology Builder, they can't
		// copy ontologies
		boolean bIsSIAdmin = UserManager.isSIAdmin(u.getUserID());
		boolean bIsOrgAdmin = UserManager.isOrganizationAdmin(u.getUserID());
		boolean bIsOntologyBuilder = UserManager.isUserInSecurityRole(u.getUserID(),
				SecurityConstants.ROLE_ONTOLOGY_BUILDER);

		if (!bIsSIAdmin && !bIsOrgAdmin && !bIsOntologyBuilder) {
			throw new Exception("Access denied.");
		}

		Ontology o = getOntologyByID(iOntologyID, Ontology.FIELD_ID);

		// If user is not an SI Admin, the source AND destination organization
		// IDs must be the same
		if (!bIsSIAdmin) {
			if (o.getOrganizationID() != iDestinationOrgID) {
				throw new Exception("Access denied.");
			}
		}

		return com.searchincite.server.entity.manager.OntologyManager.copyOntology(iOntologyID, iDestinationCategoryID,
				strDestinationOntologyName, iDestinationOrgID, u.getUserID());

	}

	@Override
	public int getExportOntologyCount(int ontologyID) throws Exception {
		int count = OntologyData.getOntologyExportCount(ontologyID);
		return count;
	}

	@Override
	public String getExportOntologyFile(int ontologyID) throws Exception {
		String path = "webapps/com.searchincite.SearchIncite/";
		String fileName = "files/" + ontologyID + ".csv";
		ResultSet rs = null;

		log.log(Level.INFO, "ontologyID={0}", ontologyID);
		log.log(Level.INFO, "path={0}", path);
		log.log(Level.INFO, "fileName={0}=", fileName);

		try {
			rs = OntologyData.exportOntologyByID(ontologyID);

			File f = new File(path + fileName);
			if (f.exists())
				f.delete();

			if (rs != null) {
				// CSVWriter csvOutput = new CSVWriter(new FileWriter(path +
				// fileName, true), ',');

				CSVWriter csvOutput = new CSVWriter(
						new OutputStreamWriter(new FileOutputStream(path + fileName), "UTF-8"));

				csvOutput.writeAll(rs, true);
				csvOutput.close();
			} else
				log.log(Level.INFO, "The export resultSet is NULL !!!");

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			log.log(Level.SEVERE, ex.getLocalizedMessage());
		} finally {
			if (rs != null)
				rs.close();
		}

		return fileName;
	}
}
