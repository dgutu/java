package com.searchincite.server.data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class DocumentWrapper {

	public long documentID;

	public int sourceID;

	public int orgID;
	
	public int ontologyID = 1;

	/**
	 * ID of user that created the document
	 */
	public int userID;

	public int status;

	public String name;

	public String description;

	public Date creation;

	public byte[] rawBytes;

	public byte[] plainText;

	DocumentWrapper() {
		super();
	}

	public DocumentWrapper(ResultSet rs) throws SQLException {
		this(rs.getLong("document_id"), rs.getInt("org_id"), rs.getString("file_name"), rs.getBytes("file_data"), rs.getString("description"), rs.getInt("document_source_id"), rs.getInt("created_by"));
		this.status = rs.getInt("status_id");
		
		try {
			this.plainText = ("I am plain text. I work here.").getBytes();
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}

		// this.documentID = rs.getLong("document_id");
		// this.orgID = rs.getInt("org_id");
		// this.name = rs.getString("file_name");
		// this.bytes = rs.getBytes("file_data");
		// this.description = rs.getString("description");
		// this.sourceID = rs.getInt("document_source_id");
		// this.userID = rs.getInt("created_by");
		// this.status = rs.getInt("status_id");
	}

	public DocumentWrapper(int orgID, String name, byte[] bytes, String description, int sourceID, int userID) throws SQLException {
		this();
		this.orgID = orgID;
		this.name = name;
		this.rawBytes = bytes;
		this.description = description;
		this.sourceID = sourceID;
		this.userID = userID;

		createDocument();
	}

	public DocumentWrapper(long documentID, int orgID, String name, byte[] bytes, String description, int sourceID, int userID) {
		this();

		this.documentID = documentID;
		this.orgID = orgID;
		this.name = name;
		this.rawBytes = bytes;
		this.description = description;
		this.sourceID = sourceID;
		this.userID = userID;
	}

	public long createDocument() throws SQLException {
		this.documentID = DocumentData.createDocument(orgID, name, rawBytes, description, sourceID, userID);
		return documentID;
	}

	public void updateDocument() throws SQLException {
		DocumentData.updateDocument(documentID, orgID, name, rawBytes, description, sourceID, userID);
	}

	public void updateDocumentPlainText() throws SQLException {
		DocumentData.updateDocumentPlainText(documentID, new String(plainText));
	}
	
	public void updateStatus(int aStatus) throws SQLException {
		DocumentData.updateDocumentStatusForGivenDocument(documentID, aStatus, 1);
	}
}