/**
 * @author Eric Wayman
 * 
 * This code was modified by Eric Wayman for use with the Autofeeds
 * table in Search Incite. The original author's information is below.
 */

/**
 * Sample reference implementation of the TableModelService class.
 * For simplicity it does not use database but shows how to implement
 * data paging, sorting and filtering.
 * 
 * (c) 2007 by Svetlin Nakov - http://www.nakov.com
 * National Academy for Software Development - http://academy.devbg.org 
 * This software is freeware. Use it at your own risk.
 */

package com.searchincite.server.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.sql.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.searchincite.api.entity.User;
import com.searchincite.client.entity.Autofeed;
import com.searchincite.client.widgets.advancedtable.DataFilter;
import com.searchincite.client.widgets.advancedtable.TableColumn;
import com.searchincite.client.widgets.advancedtable.TableModelService;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class AutofeedsTableModelServiceImpl extends RemoteServiceServlet
		implements TableModelService {

	private static final long serialVersionUID = 1L;

	private TableColumn[] columns = new TableColumn[] {
			new TableColumn("WebsiteId", "#"), new TableColumn("Url", "URL"),
			new TableColumn("Description", "Description"),
//			new TableColumn("OntologyId", "Ontology"),
			new TableColumn("LastCheckedDate", "Last Updated"),
			new TableColumn("Active", "Active"),
			new TableColumn("Recursive", "Recursive")};

	private static int documentSourceId;
	
	public void updateDocumentSourceId(int m_iDocumentSourceID) {
		documentSourceId = m_iDocumentSourceID;
		// System.out.println("m_i: " + m_iDocumentSourceID);
		// System.out.println("static one: " + documentSourceId);
		allAutofeeds = getAllAutofeeds();
	}
	
	public static List getAllAutofeedsList() {
		// System.out.println("" + documentSourceId);
		Connection db = null;
		PreparedStatement ps = null;
		try {
			db = SIDB.getConnection();
			db.setAutoCommit(false);

			ps = db.prepareStatement("SELECT ow.website_id, ow.url, " +
					"ow.description, ow.last_checked_date, " +
					"ow.active, ow.recursive " +
					"FROM ontology.website ow " +
					"WHERE document_source_id = " + documentSourceId + 
					" ORDER BY website_id;");
			
//			ps = db.prepareStatement("SELECT ow.website_id, ow.url, "
//					+ "ow.description, oso.ontology_id, "
//					+ "ow.last_checked_date, ow.active "
//					+ "FROM ontology.website ow "
//					+ "JOIN ontology.source_ontology oso "
//					+ "ON ow.document_source_id = oso.document_source_id;");

			// ps.setInt(1, iOrganizationID);
			ResultSet rs = ps.executeQuery();
			return ObjectFactory.convertToObjects(rs, Autofeed.class);			
		} catch (Exception e) {
			e.printStackTrace();
			return new ArrayList();
		} finally {
			try {
				if (db != null) {
					db.commit();
					db.close();
				}
				if (ps != null)
					ps.close();
			} catch (SQLException ignore) {
			}
		}
	}

	public Autofeed[] getAllAutofeeds() {

		List allAutofeedsList = getAllAutofeedsList();
		Autofeed[] allAutofeeds = new Autofeed[allAutofeedsList.size()];
		for (int i = 0; i < allAutofeedsList.size(); i++) {
			Autofeed a = (Autofeed) allAutofeedsList.get(i);
			allAutofeeds[i] = a;
		}
		return allAutofeeds;

	}
	
	public boolean newAutofeed(String url, String description, boolean active,
			boolean recursive) {
		
		HttpServletRequest req = getThreadLocalRequest();
		User u = (User)req.getSession().getAttribute("user");

		if (u == null) {
			return false;
		}
		
		int orgId = u.getOrganizationID();
		int createdBy = u.getUserID();
		
		// Get the system date and time.
		java.util.Date utilDate = new java.util.Date();
		// Convert it to java.sql.Date
		java.sql.Date creationDate = new java.sql.Date(utilDate.getTime());
		
		Connection db = null;
		PreparedStatement ps = null;
		try {
			db = SIDB.getConnection();
			db.setAutoCommit(false);

			ps = db.prepareStatement("INSERT INTO ontology.website (org_id, document_source_id, "
					+ "url, description, creation_date, created_by, hash, last_checked_date, "
					+ "last_processed_date, active, recursive) "
					+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);");

			ps.setInt(1, orgId);
			ps.setInt(2, documentSourceId);
			ps.setString(3, url);
			ps.setString(4, description);
			ps.setDate(5, creationDate);
			ps.setInt(6, createdBy);
			ps.setString(7, "hash value");
			ps.setDate(8, creationDate);
			ps.setDate(9, creationDate);
			ps.setBoolean(10, active);
			ps.setBoolean(11, recursive);
			ps.executeUpdate();
			
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			try {
				if (db != null) {
					db.commit();
					db.close();
				}
				if (ps != null)
					ps.close();
				
				allAutofeeds = getAllAutofeeds();
			} catch (SQLException ignore) {
			}
		}
	}
	
	public boolean editAutofeed(String url, String description, boolean active,
			boolean recursive, String rowId) {
		HttpServletRequest req = getThreadLocalRequest();
		User u = (User)req.getSession().getAttribute("user");

		if (u == null) {
			return false;
		}
		
		int intRowId = Integer.parseInt(rowId);
		
		Connection db = null;
		PreparedStatement ps = null;
		try {
			db = SIDB.getConnection();
			db.setAutoCommit(false);

			ps = db.prepareStatement("UPDATE ontology.website SET url = ?, description = ?, "
					+ "active = ?, recursive = ? WHERE website_id = ?");

			ps.setString(1, url);
			ps.setString(2, description);
			ps.setBoolean(3, active);
			ps.setBoolean(4, recursive);
			ps.setInt(5, intRowId);
			ps.executeUpdate();
			
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			try {
				if (db != null) {
					db.commit();
					db.close();
				}
				if (ps != null)
					ps.close();

				
				allAutofeeds = getAllAutofeeds();
			} catch (SQLException ignore) {
			}
		}
	}

	public boolean deleteAutofeeds(String[] markedRowsArray) {

		String queryString = "DELETE FROM ontology.website WHERE website_id = ";
		
		queryString += implode(markedRowsArray, " OR website_id = ");
		
		// System.out.println(queryString);
		
		Connection db = null;
		PreparedStatement ps = null;
		try {
			db = SIDB.getConnection();
			db.setAutoCommit(false);
			ps = db.prepareStatement(queryString);
			ps.executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			try {
				if (db != null) {
					db.commit();
					db.close();
				}
				if (ps != null)
					ps.close();

				allAutofeeds = getAllAutofeeds();
			} catch (SQLException ignore) {
			}
		}
	}
	
	static String implode(String[] ary, String delim) {
		String out = "";
		for(int i=0; i<ary.length; i++) {
			if(i!=0) { out += delim; }
			out += ary[i];
		}
		return out;
	}
	
	private Autofeed[] allAutofeeds = getAllAutofeeds();

	private List<Autofeed> filteredAutofeeds;

	public AutofeedsTableModelServiceImpl() {
		this.applyDataFilters(null);
	}

	public TableColumn[] getColumns() {
		return this.columns;
	}

	public int getRowsCount(DataFilter[] filters) {
		applyDataFilters(filters);
		int count = this.filteredAutofeeds.size();
		return count;
	}

	public String[][] getRows(int startRow, int rowsCount,
			DataFilter[] filters, String sortColumn, boolean sortingOrder) {
		Autofeed[] rowsData = getRowsData(startRow, rowsCount, filters,
				sortColumn, sortingOrder);
		int columnsCount = this.columns.length;
		String[][] rows = new String[rowsCount][columnsCount];
		for (int row = 0; row < rowsCount; row++) {
			for (int col = 0; col < columnsCount; col++) {
				String columnName = this.columns[col].getName();
				rows[row][col] = ReflectionUtils.getPropertyStringValue(
						rowsData[row], columnName);
			}
		}
		return rows;
	}

	private Autofeed[] getRowsData(int startRow, int rowsCount,
			DataFilter[] filters, String sortColumn, boolean sortingOrder) {
		applyDataFilters(filters);
		applySorting(sortColumn, sortingOrder);
		Autofeed[] rows = new Autofeed[rowsCount];
		for (int row = startRow; row < startRow + rowsCount; row++) {
			rows[row - startRow] = this.filteredAutofeeds.get(row);
		}
		return rows;
	}

	private void applyDataFilters(DataFilter[] filters) {
		this.filteredAutofeeds = new ArrayList<Autofeed>();
		if (filters == null) {
			// No filter - append all users
			for (Autofeed autofeed : this.allAutofeeds) {
				this.filteredAutofeeds.add(autofeed);
			}
		} else {
			// Simulate data filtering
			String keyword = filters[0].getValue().toUpperCase();
			for (Autofeed autofeed : this.allAutofeeds) {
				Integer websiteID = autofeed.getWebsiteId();
				if (websiteID == null) {
					websiteID = 0;
				}
				String url = autofeed.getUrl();
				if (url == null) {
					url = "";
				}
				if (url.toUpperCase().contains(keyword)
						|| url.toUpperCase().contains(keyword)) {
					this.filteredAutofeeds.add(autofeed);
				}
			}
		}
	}

	private void applySorting(String sortColumn, boolean sortingOrder) {
		if (sortColumn != null) {
			AutofeedComparator autofeedComparator = new AutofeedComparator(
					sortColumn, sortingOrder);
			Collections.sort(this.filteredAutofeeds, autofeedComparator);
		}
	}

}
