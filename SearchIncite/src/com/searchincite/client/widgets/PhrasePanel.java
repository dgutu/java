package com.searchincite.client.widgets;

import java.util.ArrayList;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;
import com.google.gwt.user.client.ui.CheckBox;
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
import com.searchincite.client.entity.Phrase;
import com.searchincite.client.entity.SecurityRole;
import com.searchincite.client.entity.Subject;
import com.searchincite.client.listeners.PhraseChangeListener;
import com.searchincite.client.listeners.SubjectSelectionListener;
import com.searchincite.client.services.PhraseServiceProxy;
import com.searchincite.client.services.SubjectService;
import com.searchincite.client.services.SubjectServiceAsync;
import com.searchincite.client.services.UserService;
import com.searchincite.client.services.UserServiceAsync;
import com.searchincite.client.widgets.dialogs.AddEditPhraseDialog;
import com.searchincite.client.widgets.entitylabels.PhraseLabel;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PhrasePanel 
	extends Composite 
	implements TableListener, ClickListener, MouseListener, SubjectSelectionListener, PhraseChangeListener {

	FlexTable m_tblOuter = new FlexTable();
	FlexTable m_tbl = new FlexTable();
	private int m_iSelectedRow = -1;
	private ScrollPanel m_ScrollPanel = null;
	Phrase[] m_arrPhrases = null;
	private int m_iSubjectID;
	private int m_iPhraseIDToSelect = -1;

	private Image m_imgNewPhrase = null;
	private Image m_imgEditPhrase = null;
	private Image m_imgDeletePhrase = null;
	SecurityRole[] m_arrRoles = null;
	private PhrasePanel m_This = this; // This is a bad design, but was done because there
	 // are no synchronous method calls in GWT.  We need
	 // to determine the security roles before we can
	 // construct the list because some columns are
	 // not available for some users (i.e., non-admins).	
	
	ArrayList<String> arr = null;
	private static Logger rootLogger = Logger.getLogger("");
	private Phrase selectedPhrase = null;

	public PhrasePanel(int iSubjectID) {
		
		arr = new ArrayList<String>();
		
		m_iSubjectID = iSubjectID;
		m_tbl.addTableListener(this);

		initWidget(m_tblOuter);

		preInit(); // preInit() calls init()
		
		//if (m_iSelectedRow == -1) {
		//    selectRow(0);
		//}
	}	
	
	public PhrasePanel(Phrase[] arrPhrases, int iSubjectID) {
		m_iSubjectID = iSubjectID;
		m_arrPhrases = arrPhrases;
		m_tbl.addTableListener(this);

		initWidget(m_tblOuter);

		preInit(); // preInit() calls init()
	}	

	private void init() {

		////////////// <added>
		m_tbl.setSize("100%", "100%");
		m_tbl.setCellSpacing(1);  
		m_tbl.setBorderWidth(0);  
		m_tbl.setText(0, 0, "Phrase");  
		m_tbl.setText(0, 1, "Weight");  
		m_tbl.setText(9, 2, "X");
		
		//m_tbl.addTableListener(this);
		
		m_tbl.setStyleName("phraseList");
		m_tbl.getCellFormatter().setStyleName(0, 0, "phraseList-ColumnHeader");
		m_tbl.getCellFormatter().setStyleName(0, 1, "phraseList-ColumnHeader");
		m_tbl.getCellFormatter().setStyleName(0, 2, "phraseList-ColumnHeader");
		
		/////////////// </added>
		
		m_ScrollPanel = new ScrollPanel();
		m_ScrollPanel.add(m_tbl);
		//m_ScrollPanel.setHeight("100%");
		m_ScrollPanel.setSize("100%", "100%");

		m_tblOuter.setSize("100%", "100%");
		
		HorizontalPanel hp = new HorizontalPanel();
		hp.setSpacing(3);

		Label lbl = new Label();
		lbl.setText("Phrases");
		lbl.setStyleName("phraseList-Title");
		
		m_imgNewPhrase = new Image("images/new.gif");
		m_imgNewPhrase.setSize("16px", "16px");
		m_imgNewPhrase.setTitle("New Phrase");
		m_imgNewPhrase.addStyleName("imageButton");
		m_imgNewPhrase.addMouseListener(this);
		m_imgNewPhrase.addClickListener(this);

		m_imgEditPhrase = new Image("images/edit.gif");
		m_imgEditPhrase.setSize("16px", "16px");
		m_imgEditPhrase.setTitle("Edit Phrase");
		m_imgEditPhrase.addStyleName("imageButton");
		m_imgEditPhrase.addMouseListener(this);
		m_imgEditPhrase.addClickListener(this);

		m_imgDeletePhrase = new Image("images/delete.gif");
		m_imgDeletePhrase.setSize("16px", "16px");
		m_imgDeletePhrase.setTitle("Delete Phrase");
		m_imgDeletePhrase.addStyleName("imageButton");
		m_imgDeletePhrase.addMouseListener(this);
		m_imgDeletePhrase.addClickListener(this);

		hp.setVerticalAlignment(VerticalPanel.ALIGN_MIDDLE);
		hp.add(lbl);
		
		if (canModify()) {
			hp.add(m_imgNewPhrase);
			hp.add(m_imgEditPhrase);
			hp.add(m_imgDeletePhrase);
		}
		
		//m_tblOuter.setWidget(0, 0, new Label("Phrases"));
		m_tblOuter.setWidget(0, 0, hp);
		
		m_tblOuter.setWidget(1, 0, m_ScrollPanel);
		m_tblOuter.getFlexCellFormatter().setHeight(1, 0, "100%");

		m_tblOuter.setHeight("100%");
		m_ScrollPanel.setHeight("100%");
		m_tbl.setHeight("100%");

		//loadPhrases();
		refreshList();
	}
	
	public void initTable() {
		if (m_ScrollPanel != null) {
			if (m_tbl != null) {
				if (m_ScrollPanel.getWidget() == m_tbl) {
					m_ScrollPanel.remove(m_tbl);
				}
			}
		}
		
		m_tbl = new FlexTable();
		m_tbl.setSize("100%", "100%");
		m_tbl.setCellSpacing(1);  
		m_tbl.setBorderWidth(0);  
		m_tbl.setText(0, 0, "Phrase");  
		m_tbl.setText(0, 1, "Weight");
		m_tbl.setText(0, 2, "Selected");  
		
		m_tbl.addTableListener(this);
		
		m_tbl.getCellFormatter().setStyleName(0, 0, "phraseList-ColumnHeader");
		m_tbl.getCellFormatter().setStyleName(0, 1, "phraseList-ColumnHeader");
		m_tbl.getCellFormatter().setStyleName(0, 2, "phraseList-ColumnHeader");
		m_tbl.setStyleName("phraseList");

		m_ScrollPanel.add(m_tbl);
	}
	
	public void refreshList() {

		int iRows = m_tbl.getRowCount() - 1;
		
		for (int i = 0; i < iRows; i++) {
			m_tbl.removeRow(1);			
		}
		
		if (m_arrPhrases != null && m_arrPhrases.length > 0) {
    		for (int i = 0; i < m_arrPhrases.length; i++) {
    			final Phrase p = m_arrPhrases[i];
        		m_tbl.setWidget(i + 1, 0, new PhraseLabel(p));
        		m_tbl.setText(i + 1, 1, Double.toString(p.getWeight()));
        		
        		CheckBox chk = new CheckBox();
        		chk.addClickHandler(new ClickHandler() {

					@Override
					public void onClick(ClickEvent event) {
						boolean checked = ((CheckBox) event.getSource()).getValue();
						
						if (checked) {							
							rootLogger.log(Level.INFO, "add phrase="+p.getName());
						}
						else {
							rootLogger.log(Level.INFO, "remove phrase="+p.getName());
						}						
					}});
        		        		
        		m_tbl.setWidget(i +1 , 2, chk);
        		m_tbl.getRowFormatter().addStyleName(i + 1, "phraseList-Row");
    		}
    		
		}
		else {
    		m_tbl.setText(1, 0, "No Phrases");
    		m_tbl.getFlexCellFormatter().setColSpan(1, 0, 4);
    		//m_tbl.getFlexCellFormatter().setHeight(1, 0, "100%");
    		//m_tbl.getCellFormatter().setHeight(1, 0, "100%");
    		m_tbl.getRowFormatter().addStyleName(1, "phraseList-EmptyRow");
		}

		int iRowCount = m_tbl.getRowCount();
		m_tbl.setText(iRowCount, 0, " ");
		m_tbl.getFlexCellFormatter().setColSpan(iRowCount, 0, 4);
		m_tbl.getFlexCellFormatter().setHeight(iRowCount, 0, "100%");
		m_tbl.getRowFormatter().addStyleName(iRowCount, "phraseList-EmptyRow");
	
	}

	public void setPhrases(Phrase[] arrPhrases) {
		m_arrPhrases = arrPhrases;
		loadPhrases();
	}

	private void selectRow(int row) {
		// When a row (other than the first one, which is used as a header) is
		// selected, display its associated Phrases.

		// De-select the currently selected row
		styleRow(m_iSelectedRow, false);
		
		m_iSelectedRow = row;
		
		selectedPhrase = getSelectedPhrase();
		
		if (selectedPhrase != null) {
			styleRow(row, true);
		}

        //m_PhraseSelectionListenerCollection.fireSubjectSelected(s);
	}

	private void styleRow(int row, boolean selected) {
		
		if (row != -1) {
			if (selected) {
				m_tbl.getRowFormatter().removeStyleName(row, "phraseList-Row");
				m_tbl.getRowFormatter().addStyleName(row, "phraseList-SelectedRow");
			} else {
				m_tbl.getRowFormatter().removeStyleName(row, "phraseList-SelectedRow");
				m_tbl.getRowFormatter().addStyleName(row, "phraseList-Row");
			}
		}
	}

	public void onCellClicked(SourcesTableEvents sender, int row, int cell) {
		
		/*if (row > 0 && row != m_tbl.getRowCount() -1) {
			selectRow(row - 1);
			//selectRow(row);
		}
		else {
			selectRow(-1);
		}*/
		rootLogger.log(Level.INFO, "row="+row);
		rootLogger.log(Level.INFO, "cell="+cell);
		
		selectRow(row);
	}
	

	public void onClick(Widget sender) {
		
		sender.removeStyleName("imageButton-OnMouseOver");

		if (sender.equals(m_imgNewPhrase)) {

			if (m_iSubjectID == -1) {
				Window.alert("Please select a Subject before choosing this option.");
				return;
			}
			
			AddEditPhraseDialog dlg = new AddEditPhraseDialog(null, m_iSubjectID, this); //TODO: Find better way to pass listener to dialogs. Perhaps create base class for all dialogs.
			dlg.show();
		} 
		else if (sender.equals(m_imgDeletePhrase)) {
			
			Phrase p = getSelectedPhrase();
			
			if (p == null) {
				Window.alert("Please select the Phrase to delete before choosing this option.");
				return;
			}
			
			if (Window.confirm("Delete the selected Phrase?")) {
				PhraseServiceProxy proxy = new PhraseServiceProxy();
				proxy.addPhraseChangeListener(this);
				proxy.deletePhrase(p.getPhraseID());
				
				/*String str = "";
				
				for (int idx=0; idx < arr.size(); idx++) {
					String p = (String) arr.get(idx);
					str += p + "\n";
					rootLogger.log(Level.SEVERE, str);
				}						
				
				Window.alert(String.valueOf(arr.size()));*/
			}		
		} 
		else if (sender.equals(m_imgEditPhrase)) {

			Phrase p = getSelectedPhrase();
			
			if (p != null) {
				AddEditPhraseDialog dlg = new AddEditPhraseDialog(p, m_iSubjectID, this); //TODO: Find better way to pass listener to dialogs. Perhaps create base class for all dialogs.
				dlg.show();
			}
			else {
				Window.alert("Please select the Phrase to edit before choosing this option.");
			}
		}
	}

	public void onMouseDown(Widget sender, int x, int y) {
		// TODO Auto-generated method stub
		
	}

	public void onMouseMove(Widget sender, int x, int y) {
		// TODO Auto-generated method stub
		
	}

	public void onMouseUp(Widget sender, int x, int y) {
		// TODO Auto-generated method stub
		
	}

	public void onMouseEnter(Widget sender) {

		if (sender.equals(m_imgNewPhrase) || 
				sender.equals(m_imgEditPhrase) ||
				sender.equals(m_imgDeletePhrase)) {

			sender.addStyleName("imageButton-OnMouseOver");
		}
	}

	public void onMouseLeave(Widget sender) {
		if (sender.equals(m_imgNewPhrase) || 
				sender.equals(m_imgEditPhrase) ||
				sender.equals(m_imgDeletePhrase)) {
			
			sender.removeStyleName("imageButton-OnMouseOver");
		}
	}

	private Phrase getSelectedPhrase() {
		
		if (m_iSelectedRow != -1) {

			PhraseLabel phraseLabel = (PhraseLabel)m_tbl.getWidget(m_iSelectedRow, 0);
		
			if (phraseLabel != null) {
		
				// Find the subject for the selected ID
				for (int i = 0; i < m_arrPhrases.length; i++) {
					if (phraseLabel.getPhrase() == m_arrPhrases[i]) {
						return m_arrPhrases[i];
					}
				}
			}
		}
		
		return null;
	}

	public void onSubjectSelected(Subject s) {
		
		Phrase[] arrPhrases = null;
		
		if (s != null) {
			m_iSubjectID = s.getSubjectID();
			arrPhrases = s.getPhrases();
		}
		setPhrases(arrPhrases);		
	}

	public void onPhraseChange(Phrase p, ChangeEvent event) {

		if (event.isDelete()) {
			m_iPhraseIDToSelect = -1;
		}
		else {
			m_iPhraseIDToSelect = p.getPhraseID();
		}
		
		loadPhrases();
	}
	
	public void loadPhrases() {
		
		SubjectServiceAsync svc = (SubjectServiceAsync)GWT.create(SubjectService.class);
        ServiceDefTarget endpoint = (ServiceDefTarget)svc;
        String moduleRelativeURL = GWT.getModuleBaseURL() + "subject";
        endpoint.setServiceEntryPoint(moduleRelativeURL);

        AsyncCallback callback = new AsyncCallback() {

        	public void onSuccess(Object result) {

        		Subject s = (Subject)result;
        		m_arrPhrases = s.getPhrases();
        		refreshList();
        		selectPhrase(m_iPhraseIDToSelect);
        	}

            public void onFailure(Throwable caught) {
            	Window.alert("PhrasePanel::loadPhrases() -- service call failed.");
            }
        };
        
        svc.getSubjectByID(m_iSubjectID, Subject.FIELD_ALL_FIELDS, callback);
	}

	private void selectPhrase(int iPhraseIDToSelect) {
		
		for (int iRow = 0; iRow < m_tbl.getRowCount(); iRow++) {

			PhraseLabel lbl = (PhraseLabel)m_tbl.getWidget(iRow, 0);
			
			if (lbl != null) {
				if (lbl.getPhrase().getPhraseID() == iPhraseIDToSelect) {
					selectRow(iRow);
					return;
				}
			}
		}
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
            	Window.alert("PhrasePanel::getRoles() -- service call failed.");
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
