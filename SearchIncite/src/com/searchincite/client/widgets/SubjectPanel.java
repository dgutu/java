package com.searchincite.client.widgets;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.MouseListener;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.SourcesTableEvents;
import com.google.gwt.user.client.ui.TableListener;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.searchincite.client.data.constants.SecurityConstants;
import com.searchincite.client.entity.ChangeEvent;
import com.searchincite.client.entity.Ontology;
import com.searchincite.client.entity.SecurityRole;
import com.searchincite.client.entity.Subject;
import com.searchincite.client.listeners.SubjectChangeListener;
import com.searchincite.client.listeners.SubjectSelectionListener;
import com.searchincite.client.listeners.SubjectSelectionListenerCollection;
import com.searchincite.client.services.OntologyService;
import com.searchincite.client.services.OntologyServiceAsync;
import com.searchincite.client.services.SubjectServiceProxy;
import com.searchincite.client.services.UserService;
import com.searchincite.client.services.UserServiceAsync;
import com.searchincite.client.widgets.dialogs.AddEditSubjectDialog;
import com.searchincite.client.widgets.entitylabels.SubjectLabel;


public class SubjectPanel extends Composite implements TableListener, ClickListener, SubjectChangeListener, MouseListener {

	protected SubjectSelectionListenerCollection m_SubjectSelectionListenerCollection = new SubjectSelectionListenerCollection();
	SecurityRole[] m_arrRoles = null;
	//VerticalPanel m_tblOuter = new VerticalPanel();
	FlexTable m_tblOuter = new FlexTable();
	FlexTable m_tbl = new FlexTable();
	Subject[] m_arrSubjects = null;
	private int m_iSelectedRow = -1;
	private ScrollPanel m_ScrollPanel = null;
	private int m_iOntologyID = -1;
	private int m_iSubjectIDToSelect = -1;

	private Image m_imgNewSubject = null;
	private Image m_imgEditSubject = null;
	private Image m_imgDeleteSubject = null;

	private SubjectPanel m_This = this; // This is a bad design, but was done because there
	 // are no synchronous method calls in GWT.  We need
	 // to determine the security roles before we can
	 // construct the list because some columns are
	 // not available for some users (i.e., non-admins).

	public int getOntologyID() {
		return m_iOntologyID;
	}
	public void setOntologyID(int iOntologyID) {
		m_iOntologyID = iOntologyID;
		loadSubjects();
	}
	
	public SubjectPanel(int iOntologyID) {
		
		m_iOntologyID = iOntologyID;
		m_tbl.addTableListener(this);

		initWidget(m_tblOuter);

		preInit(); // preInit() calls init(); 

		//if (m_iSelectedRow == -1) {
		//    selectRow(0);
		//}
	}	

	public SubjectPanel(Subject[] arrSubjects, int iOntologyID) {

		m_iOntologyID = iOntologyID;
		m_tbl.addTableListener(this);
		m_arrSubjects = arrSubjects;

		initWidget(m_tblOuter);
		preInit(); // preInit() calls init(); 

		//if (m_iSelectedRow == -1) {
		//    selectRow(0);
		//}
	}	

	private void init() {
		//tbl.setTitle("Subjects");  
		m_tbl.setSize("100%", "100%");
		//m_tbl.setCellPadding(2);  
		m_tbl.setCellSpacing(1);  
		m_tbl.setBorderWidth(0);
		m_tbl.setText(0,0," ");  
		m_tbl.setText(0, 1, "Subject");  
		m_tbl.setText(0, 2, "Color");  
		m_tbl.setText(0, 3, "Weight");
		
		m_tbl.setStyleName("subjectList");
		m_tbl.getCellFormatter().setStyleName(0, 0, "subjectList-ColumnHeader");
		m_tbl.getCellFormatter().setStyleName(0, 1, "subjectList-ColumnHeader");
		m_tbl.getCellFormatter().setStyleName(0, 2, "subjectList-ColumnHeader");
		m_tbl.getCellFormatter().setStyleName(0, 3, "subjectList-ColumnHeader");
 
		//initWidget(m_tbl);
		m_ScrollPanel = new ScrollPanel();
		m_ScrollPanel.add(m_tbl);
		m_ScrollPanel.setSize("100%", "100%");

		m_tblOuter.setSize("100%", "100%");
		
		HorizontalPanel hp = new HorizontalPanel();
		hp.setSpacing(3);

		Label lbl = new Label();
		lbl.setText("Subjects");
		lbl.setStyleName("subjectList-Title");
		
		m_imgNewSubject = new Image("images/new.gif");
		m_imgNewSubject.setSize("16px", "16px");
		m_imgNewSubject.setTitle("New Subject");
		m_imgNewSubject.addStyleName("imageButton");
		m_imgNewSubject.addMouseListener(this);
		m_imgNewSubject.addClickListener(this);
		
		m_imgEditSubject = new Image("images/edit.gif");
		m_imgEditSubject.setSize("16px", "16px");
		m_imgEditSubject.setTitle("Edit Subject");
		m_imgEditSubject.addStyleName("imageButton");
		m_imgEditSubject.addMouseListener(this);
		m_imgEditSubject.addClickListener(this);

		m_imgDeleteSubject = new Image("images/delete.gif");
		m_imgDeleteSubject.setSize("16px", "16px");
		m_imgDeleteSubject.setTitle("Delete Subject");
		m_imgDeleteSubject.addStyleName("imageButton");
		m_imgDeleteSubject.addMouseListener(this);
		m_imgDeleteSubject.addClickListener(this);

		hp.setVerticalAlignment(VerticalPanel.ALIGN_MIDDLE);
		hp.add(lbl);
		
		if (canModify()) {
			hp.add(m_imgNewSubject);
			hp.add(m_imgEditSubject);
			hp.add(m_imgDeleteSubject);
		}

		//m_tblOuter.setWidget(0, 0, new Label("Phrases"));
		m_tblOuter.setWidget(0, 0, hp);
		
		//m_tblOuter.setWidget(0, 0, new Label("Subjects"));
		
		m_tblOuter.setWidget(1, 0, m_ScrollPanel);
		m_tblOuter.getFlexCellFormatter().setHeight(1, 0, "100%");
		
		//m_tblOuter.add(new Label("Subjects"));
		//m_tblOuter.add(m_ScrollPanel);
		
		//initWidget(m_ScrollPanel);
		//initWidget(m_tblOuter);
		
		m_tblOuter.setHeight("100%");
		m_ScrollPanel.setHeight("100%");
		m_tbl.setHeight("100%");

		refreshList();
	}
	
	public void refreshList() {
		
		//m_tbl.clear();
		
		int iSubjectRows = m_tbl.getRowCount() - 1;
		
		for (int i = 0; i < iSubjectRows; i++) {
			m_tbl.removeRow(1);			
		}
		
		if (m_arrSubjects != null && m_arrSubjects.length > 0) {
    		for (int i = 0; i < m_arrSubjects.length; i++) {
    		
    			Subject s = m_arrSubjects[i];
    			
        		m_tbl.setText(i + 1, 0, " ");
        		// Put identifying element in second column -- we might need first column for an image or other widget
        		m_tbl.setWidget(i + 1, 1, new SubjectLabel(s));
        		//m_tbl.setWidget(i + 1, 1, new Hidden("id", String.valueOf(s.getSubjectID())));
        		//m_tbl.setText(i + 1, 1, s.getName());
        		m_tbl.setHTML(i + 1, 2, "<div style='height: 2px; width: 100%; background-color: " + s.getColor() + ";'/>");
        		
        		m_tbl.setText(i + 1, 3, String.valueOf(s.getWeight()));
        		
        		m_tbl.getRowFormatter().addStyleName(i + 1, "subjectList-Row");
        		//m_tbl.getCellFormatter().addStyleName(i + 1, 0, "subjectList-Cell");
        		//m_tbl.getCellFormatter().setStyleName(i + 1, 1, "clickableRow");
        		//m_tbl.getCellFormatter().setStyleName(i + 1, 2, "clickableRow");
    		}
    		
    		//m_tbl.getCellFormatter().setHeight(m_tbl.getRowCount(), 1, "100%");
    		//m_tbl.getCellFormatter().setHeight(m_tbl.getRowCount(), 2, "100%");
    		//m_tbl.getCellFormatter().setHeight(m_tbl.getRowCount(), 3, "100%");
		}
		else {
			m_tbl.setText(1, 0, "No Subjects");
    		m_tbl.getFlexCellFormatter().setColSpan(1, 0, 4);
    		//m_tbl.getFlexCellFormatter().setHeight(1, 0, "100%");
    		//m_tbl.getCellFormatter().setHeight(1, 0, "100%");
    		m_tbl.getRowFormatter().addStyleName(1, "subjectList-EmptyRow");
		}

		int iRowCount = m_tbl.getRowCount();
		m_tbl.setText(iRowCount, 0, " ");
		m_tbl.getFlexCellFormatter().setColSpan(iRowCount, 0, 4);
		m_tbl.getFlexCellFormatter().setHeight(iRowCount, 0, "100%");
		m_tbl.getRowFormatter().addStyleName(iRowCount, "subjectList-EmptyRow");

	}

	public void onCellClicked(SourcesTableEvents sender, int row, int cell) {

		// Select the row that was clicked (-1 to account for header row).
		if (row > 0 && row != m_tbl.getRowCount() -1) {
			selectRow(row);
		}
		else {
			selectRow(-1);
		}
	}

	public void onClick(Widget sender) {

		sender.removeStyleName("imageButton-OnMouseOver");

		if (sender.equals(m_imgNewSubject)) {
			AddEditSubjectDialog dlg = new AddEditSubjectDialog(null, m_iOntologyID, this); //TODO: Find better way to pass listener to dialogs. Perhaps create base class for all dialogs.
			dlg.show();
		} 
		else if (sender.equals(m_imgDeleteSubject)) {
			
			Subject s = getSelectedSubject();
			
			if (s == null) {
				Window.alert("Please select the Subject to delete before choosing this option.");
				return;
			}
			
			if (Window.confirm("Delete the selected Subject, including all Phrases contained in this Subject?")) {
				SubjectServiceProxy proxy = new SubjectServiceProxy();
				proxy.addSubjectChangeListener(this);
				proxy.deleteSubject(s.getSubjectID());
			}		
		} 
		else if (sender.equals(m_imgEditSubject)) {

			Subject s = getSelectedSubject();
			
			if (s != null) {
				AddEditSubjectDialog dlg = new AddEditSubjectDialog(s, m_iOntologyID, this); //TODO: Find better way to pass listener to dialogs. Perhaps create base class for all dialogs.
				dlg.show();
			}
			else {
				Window.alert("Please select the Subject to edit before choosing this option.");
			}
		}
	
	}
	
	private void selectRow(int row) {
		// When a row (other than the first one, which is used as a header) is
		// selected, display its associated Phrases.

		// De-select the currently selected row
		styleRow(m_iSelectedRow, false);
		
		m_iSelectedRow = row;
		
		Subject s = getSelectedSubject();
		
		if (s != null) {
			styleRow(row, true);
		}

        m_SubjectSelectionListenerCollection.fireSubjectSelected(s);
	}

	private void styleRow(int row, boolean selected) {
		
		if (row != -1) {
			if (selected) {
				m_tbl.getRowFormatter().removeStyleName(row, "subjectList-Row");
				m_tbl.getRowFormatter().addStyleName(row, "subjectList-SelectedRow");
			} else {
				m_tbl.getRowFormatter().removeStyleName(row, "subjectList-SelectedRow");
				m_tbl.getRowFormatter().addStyleName(row, "subjectList-Row");
			}
		}
		
	}

	public void addSubjectSelectionListener(SubjectSelectionListener listener) {
		if (m_SubjectSelectionListenerCollection == null) {
			m_SubjectSelectionListenerCollection = new SubjectSelectionListenerCollection();
		}
		m_SubjectSelectionListenerCollection.add(listener);
	}

	public void removeSubjectSelectionListener(SubjectSelectionListener listener) {
		if (m_SubjectSelectionListenerCollection != null) {
			m_SubjectSelectionListenerCollection.remove(listener);
		}
	}

	private Subject getSelectedSubject() {
		
		if (m_iSelectedRow != -1) {

			SubjectLabel subjectLabel = (SubjectLabel)m_tbl.getWidget(m_iSelectedRow, 1);
		
			if (subjectLabel != null) {
		
				// Find the subject for the selected ID
				for (int i = 0; i < m_arrSubjects.length; i++) {
					if (subjectLabel.getSubject() == m_arrSubjects[i]) {
						return m_arrSubjects[i];
					}
				}
			}
		}
		
		return null;
	}

	private void selectSubject(int iSubjectIDToSelect) {
		
		for (int iRow = 0; iRow < m_tbl.getRowCount(); iRow++) {

			SubjectLabel subjectLabel = (SubjectLabel)m_tbl.getWidget(iRow, 1);
			
			if (subjectLabel != null) {
				if (subjectLabel.getSubject().getSubjectID() == iSubjectIDToSelect) {
					selectRow(iRow);
					return;
				}
			}
		}
		
	}

	
	
	public void onSubjectChange(Subject s, ChangeEvent event) {

		if (event.isCreate() || event.isUpdate()) {
			// A new subject was created.
			m_iSubjectIDToSelect = s.getSubjectID();
		}
		//else if (event.isDelete()) {
		//}
		loadSubjects();
		
	}

	public void loadSubjects() {
		
		OntologyServiceAsync ontologyService = (OntologyServiceAsync)GWT.create(OntologyService.class);
        ServiceDefTarget endpoint = (ServiceDefTarget)ontologyService;
        String moduleRelativeURL = GWT.getModuleBaseURL() + "ontology";
        endpoint.setServiceEntryPoint(moduleRelativeURL);

        AsyncCallback callback = new AsyncCallback() {

        	public void onSuccess(Object result) {

        		Ontology o = (Ontology)result;
        		m_arrSubjects = o.getSubjects();
        		refreshList();
        		selectSubject(m_iSubjectIDToSelect);
        	}

            public void onFailure(Throwable caught) {
            	Window.alert("SubjectPanel::loadSubjects() -- service call failed.");
            }
        };
        
        ontologyService.getOntologyByID(m_iOntologyID, Ontology.FIELD_ALL_FIELDS, callback);
	}

	
	public void onMouseDown(Widget sender, int x, int y) {
		// TODO Auto-generated method stub
		
	}

	public void onMouseEnter(Widget sender) {

		if (sender.equals(m_imgNewSubject) || 
				sender.equals(m_imgEditSubject) ||
				sender.equals(m_imgDeleteSubject)) {

			sender.addStyleName("imageButton-OnMouseOver");
		}
	}

	public void onMouseLeave(Widget sender) {
		if (sender.equals(m_imgNewSubject) || 
				sender.equals(m_imgEditSubject) ||
				sender.equals(m_imgDeleteSubject)) {
			
			sender.removeStyleName("imageButton-OnMouseOver");
		}
	}

	public void onMouseMove(Widget sender, int x, int y) {
		// TODO Auto-generated method stub
		
	}

	public void onMouseUp(Widget sender, int x, int y) {
		// TODO Auto-generated method stub
		
	}

	private void preInit() {
		
		UserServiceAsync svc = (UserServiceAsync)GWT.create(UserService.class);
        ServiceDefTarget endpoint = (ServiceDefTarget)svc;
        String moduleRelativeURL = GWT.getModuleBaseURL() + "user";
        endpoint.setServiceEntryPoint(moduleRelativeURL);

        AsyncCallback callback = new AsyncCallback() {

        	public void onSuccess(Object result) {

        		m_arrRoles = (SecurityRole[])result;
        		m_This.init();
        	}

            public void onFailure(Throwable caught) {
            	Window.alert("SubjectPanel::getRoles() -- service call failed.");
            }
        };
        
        try {
			svc.getSecurityRolesForUser(callback);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private boolean canModify() {
		if (m_arrRoles == null) {
			return false;
		}
		
		for (int i = 0; i < m_arrRoles.length; i++) {
			if (m_arrRoles[i].getRoleID() == SecurityConstants.ROLE_SI_ADMIN ||
				m_arrRoles[i].getRoleID() == SecurityConstants.ROLE_ORGANIZATION_ADMIN ||
				m_arrRoles[i].getRoleID() == SecurityConstants.ROLE_ONTOLOGY_BUILDER) {
				return true;
			}
		}
		
		return false;
	}

}
