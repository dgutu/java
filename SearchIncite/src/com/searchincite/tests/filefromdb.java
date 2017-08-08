package com.searchincite.tests;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.google.gwt.thirdparty.guava.common.base.Charsets;
import com.searchincite.client.entity.OntologyCSV;
import com.searchincite.server.data.OntologyData;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;

public class filefromdb {

	public static void main(String[] args) {
		try {
			String database = "//minetechuk.cloudapp.net:5432/ontology-prod";
			String username = "ontology_app";
			String password = "password";
			Class.forName("org.postgresql.Driver");
			Connection db = DriverManager.getConnection("jdbc:postgresql:" + database, username, password);
			DatabaseMetaData dbmd = db.getMetaData();
			System.out.println("Connection to " + dbmd.getDatabaseProductName() + " " + dbmd.getDatabaseProductVersion()
					+ " successful.\n");
			Statement sql = db.createStatement();
			ResultSet rs;

			// String sqlquery = "select * from ontology.users";
			// String sqlquery = "SELECT * FROM
			// ontology.spexportontologybyid(347)";
			int ontologyID = 383, categoryID = 263;
			String sqlquery = "select ont.org_id, cat.category_id, cat.name, ont.ontology_id, ont.name, "
					+ "ont.description, subj.subject_id, subj.name, subj.color, subj.weight, ph.phrase_id, ph.name, ph.color,  ph.weight "
					+ "from ontology.ontology ont join ontology.category cat on ont.org_id = cat.org_id "
					+ "join ontology.subject subj on ont.ontology_id = subj.ontology_id join ontology.phrase ph "
					+ "on ph.subject_id = subj.subject_id where ont.ontology_id = " + ontologyID + " "
					+ "and cat.category_id=" + categoryID;

			rs = sql.executeQuery(sqlquery);

			int count = 0;

			// while (rs.next() ) {
			// String filetext = rs.getString(1);
			// System.out.println(filetext);
			// ++count;
			// }
			// db.close();
			System.out.println(count);

			// CSVWriter csvOutput = new CSVWriter(new
			// FileWriter("/Users/dumitrugutu/Downloads/aaa.csv", true), ',');

			CSVWriter csvOutput = new CSVWriter(
					new OutputStreamWriter(new FileOutputStream("/Users/dumitrugutu/Downloads/aaa.csv"), "UTF-8"));

			csvOutput.writeAll(rs, true);
			csvOutput.close();

			// read and import file
			// purgeOntologyImportBySessionID

			// CSVReader reader = new CSVReader(new
			// FileReader("/Users/dumitrugutu/Downloads/bbb.csv"));

			CSVReader reader = new CSVReader(new InputStreamReader(
					new FileInputStream("/Users/dumitrugutu/Downloads/Workbook4.csv"), Charsets.UTF_8));

			String[] record = null;

			// OntologyData.populateOntologyImportGtt(ontologyCSV, username,
			// sessionID)

			OntologyData.purgeOntologyImportBySessionID(db, "gda session2");
			// Connection db1 = OntologyData.getDBConnection();

			int result = 0;

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

				result = OntologyData.populateOntologyImportGtt(db, ontologyCSV, "350", "gda session2");

				System.out.println("r=" + result);

				if (result < 0)
					break;
			}

			// processing loaded data into GTT
			result = OntologyData.importOntologyProcess(db, "gda session2");

			// OntologyData.purgeOntologyImportBySessionID(db, "gda session2");

			reader.close();
			db.commit();
			db.close();

			/*
			 * System.out.println(GWT.getHostPageBaseURL().toString());
			 * System.out.println(GWT.getModuleBaseURL().toString());
			 * 
			 * String fileName = GWT.getHostPageBaseURL().toString()+"//files//"
			 * + ontologyID + ".csv"; System.out.println(fileName);
			 */

		} catch (Exception e) {
			System.err.println("Got an exception! ");
			System.err.println(e.getMessage());
		}
	}

}
