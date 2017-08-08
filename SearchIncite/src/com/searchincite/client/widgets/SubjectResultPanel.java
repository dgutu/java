package com.searchincite.client.widgets;

import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.MouseListener;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.SourcesTableEvents;
import com.google.gwt.user.client.ui.TableListener;
import com.google.gwt.user.client.ui.Widget;
import com.searchincite.client.entity.ChangeEvent;
import com.searchincite.client.entity.DocumentResult;
import com.searchincite.client.entity.DocumentSubjectResult;
import com.searchincite.client.entity.Phrase;
import com.searchincite.client.entity.Subject;
import com.searchincite.client.listeners.SubjectChangeListener;
import com.searchincite.client.listeners.SubjectSelectionListener;
import com.searchincite.client.listeners.SubjectSelectionListenerCollection;
import com.searchincite.client.util.ColorUtil;
import com.searchincite.client.widgets.entitylabels.SubjectLabel;


public class SubjectResultPanel extends Composite implements TableListener, ClickListener, SubjectChangeListener, MouseListener {

	protected SubjectSelectionListenerCollection m_SubjectSelectionListenerCollection = new SubjectSelectionListenerCollection();

	//VerticalPanel m_tblOuter = new VerticalPanel();
	FlexTable m_tblOuter = new FlexTable();
	FlexTable m_tbl = new FlexTable();
	//DocumentSubjectResult[] m_arrSubjectResults = null;
	private int m_iSelectedRow = -1;
	private ScrollPanel m_ScrollPanel = null;
	//private long m_lDocumentID = -1;
	
	private HTML m_htmlDocumentContainer = null;
	private DocumentResult m_DocumentResult = null;
	private String m_strMarkedUpDocument = null;
	
	public void setDocumentContainer(HTML htmlContainer) {
		m_htmlDocumentContainer = htmlContainer;
	}
	
	public void setRenderedMarkedUpDocument(String strRenderedDoc) {
		// The rendered document is the HTML after it has been rendered in the container.
		// (Some of the script tags, header, etc. have been stripped -- this is done 
		// automatically by the browser when the Text property of the container is set.)
		
		m_strMarkedUpDocument = strRenderedDoc;
	}
	
	public void setDocumentResult(DocumentResult docResult, String strRenderedDocument) {

		// The rendered document is the HTML after it has been rendered in the container.
		// (Some of the script tags, header, etc. have been stripped -- this is done 
		// automatically by the browser when the Text property of the container is set.)

		m_DocumentResult = docResult;
		
		if (strRenderedDocument != null) {
			m_strMarkedUpDocument = strRenderedDocument;
		}
		else {
			m_strMarkedUpDocument = "";
		}
	}

	public SubjectResultPanel(DocumentResult docResult, String strRenderedDocument) {

		setDocumentResult(docResult, strRenderedDocument);
		
		init();
	}	

	private void init() {

		m_tbl.setSize("100%", "100%");
		m_tbl.setCellSpacing(1);  
		m_tbl.setBorderWidth(0);
		m_tbl.setText(0, 0, "");  
		m_tbl.setText(0, 1, "Subject");  
		m_tbl.setText(0, 2, "Color");  
		m_tbl.setText(0, 3, "Result");
		
		m_tbl.setStyleName("subjectList");
		m_tbl.getCellFormatter().setStyleName(0, 0, "subjectList-ColumnHeader");
		m_tbl.getCellFormatter().setStyleName(0, 1, "subjectList-ColumnHeader");
		m_tbl.getCellFormatter().setStyleName(0, 2, "subjectList-ColumnHeader");
		m_tbl.getCellFormatter().setStyleName(0, 3, "subjectList-ColumnHeader");
 
		m_ScrollPanel = new ScrollPanel();
		m_ScrollPanel.add(m_tbl);
		m_ScrollPanel.setSize("100%", "100%");

		m_tblOuter.setSize("100%", "100%");
		
		HorizontalPanel hp = new HorizontalPanel();
		hp.setSpacing(3);

		Label lbl = new Label();
		lbl.setText("Subjects");
		lbl.setStyleName("subjectList-Title");
		
		m_tblOuter.setWidget(0, 0, hp);
		m_tblOuter.setWidget(1, 0, m_ScrollPanel);
		m_tblOuter.getFlexCellFormatter().setHeight(1, 0, "100%");
		
		initWidget(m_tblOuter);
		
		m_tblOuter.setHeight("100%");
		m_ScrollPanel.setHeight("100%");
		m_tbl.setHeight("100%");

		refreshList();
	}
	
	public void refreshList() {
		
		int iSubjectRows = m_tbl.getRowCount() - 1;
		
		for (int i = 0; i < iSubjectRows; i++) {
			m_tbl.removeRow(1);			
		}
		
		if (m_DocumentResult == null) {
			return;
		}
		
		DocumentSubjectResult[] arrSubjectResults = m_DocumentResult.getSubjectResults();
		if (arrSubjectResults != null && arrSubjectResults.length > 0) {
    		for (int i = 0; i < arrSubjectResults.length; i++) {
    		
    			DocumentSubjectResult sr = (DocumentSubjectResult)arrSubjectResults[i];
    			Subject subject = sr.getSubject();
    			
    			SubjectCheckBox cb = new SubjectCheckBox(subject);
    			cb.setChecked(true);    			
    			cb.addClickListener(this);
    			
        		m_tbl.setWidget(i + 1, 0, cb);
        		m_tbl.getFlexCellFormatter().setWidth(i + 1, 0, "20px;");
        		m_tbl.setWidget(i + 1, 1, new HTML("<a href=\"#quick_jump_subj_" + subject.getSubjectID() + "_0\">" + subject.getName() + "</a>"));
        		m_tbl.setHTML(i + 1, 2, "<div style='height: 2px; width: 100%; background-color: " + subject.getColor() + ";'/>");
        		
        		m_tbl.setText(i + 1, 3, String.valueOf(sr.getResult()));
        		
        		m_tbl.getRowFormatter().addStyleName(i + 1, "subjectList-Row");
    		}
    		
		}
		else {
			m_tbl.setText(1, 0, "No Subjects");
			m_tbl.getFlexCellFormatter().setColSpan(1, 0, 4);
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
		SubjectCheckBox cb = (SubjectCheckBox)sender;
		Subject s = cb.getSubject();
		String strSubjectID = String.valueOf(s.getSubjectID());
		
		String strHtml = m_strMarkedUpDocument;
		String strHtmlOld = m_strMarkedUpDocument;
		//NOTE: The CASE of some of the HTML is different than what's stored in the database because the
		//		GWT control modifies it either in the call to getHTML() or setHTML().  For example, if the
		//		original call to setHTML() contains "color: #FFFFFF", the getHTML() method will return "COLOR: #ffffff".
		//		(The case of "color" is changed to UPPER case and the case of the color value itself is changed to lower case.)
		//              Because of this, we don't use getHTML(), we simply modify the original HTML and pass it in again.


		//~ Matching THIS: subj_id_8 {color: #eeeeee; background-color: #ff0000;} /* animals */
		String strPhraseIDStart = "phr_id_";
		String strColorStart = "color: ";
		String strBackColorStart = "background-color: ";
		//~ String strQuickJumpAnchor = "<a name=\"quick_jump_anchor\" ></a>";
		//~ strHtml = strHtml.replaceFirst(strQuickJumpAnchor, "");
		
		Phrase[] p = s.getPhrases();
		for(int i = 0;i < p.length;i++)
		{
			String strPhraseID = String.valueOf(p[i].getPhraseID());
			String strFindCurrentColor = strPhraseIDStart + strPhraseID + " {" + strColorStart;
			int iCurrentColorIndex = strHtml.indexOf(strFindCurrentColor) + strFindCurrentColor.length();
			String strCurrentColor = strHtml.substring(iCurrentColorIndex, iCurrentColorIndex + 7);
			
			String strFindCurrentBackColor = strPhraseIDStart + strPhraseID + " {" + strColorStart + strCurrentColor + "; " + strBackColorStart;
			int iCurrentBackColorIndex = strHtml.indexOf(strFindCurrentBackColor) + strFindCurrentBackColor.length();
			String strCurrentBackColor = strHtml.substring(iCurrentBackColorIndex, iCurrentBackColorIndex + 7);
			
			String strToReplace =  strPhraseIDStart + strPhraseID + " \\{" + strColorStart + strCurrentColor + "; " + strBackColorStart + strCurrentBackColor;
			
			
			String strNewColor = "";
			String strNewBackColor = "";
			if (!cb.isChecked()) {
				strNewColor  = "#000000";
				strNewBackColor = "#ffffff";
			}
			else {
				strNewColor = ColorUtil.getFontColor(s.getColor());
				strNewBackColor = s.getColor();
			}
			String strReplaceWith = strPhraseIDStart + strPhraseID + " {" + strColorStart + strNewColor + "; " + strBackColorStart + strNewBackColor;
			
			strHtml = strHtml.replaceFirst(strToReplace, strReplaceWith);
			//~ Window.alert("Replace: \n" + strToReplace + "\n With: \n" + strReplaceWith);
		}	
				
		

		//~ Window.alert("CheckBox clicked: " + cb.getName() + "\n The Old HTML: \n" + strHtmlOld);
		//~ Window.alert("The New HTML: \n" + strHtml);
		
		
		
		m_strMarkedUpDocument = strHtml;
		refreshDocumentContainer();
	}
	
	public void refreshDocumentContainer() {
		// Refreshes the document container to display the (current) content
		// stored in m_strMarkedUpDocument.

		//Window.prompt("about to refreshDocumentContainer with: ", m_strMarkedUpDocument);
		//Window.alert("Setting to: " + m_strMarkedUpDocument);
		m_htmlDocumentContainer.setHTML(m_strMarkedUpDocument);
		//Window.alert("m_htmlDocumentContainer.getHTML: " + m_htmlDocumentContainer.getHTML());
		
	}
	
	private void selectRow(int row) {
		// When a row (other than the first one, which is used as a header) is
		// selected, display its associated Phrases.

		// De-select the currently selected row
		styleRow(m_iSelectedRow, false);
		
		m_iSelectedRow = row;
		
		DocumentSubjectResult s = getSelectedSubjectResult();
		
		if (s != null) {
			styleRow(row, true);
		}

        //m_SubjectSelectionListenerCollection.fireSubjectSelected(s);
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

	private DocumentSubjectResult getSelectedSubjectResult() {
		/*
		if (m_iSelectedRow != -1) {

			SubjectLabel subjectLabel = (SubjectLabel)m_tbl.getWidget(m_iSelectedRow, 1);
		
			if (subjectLabel != null) {
		
				// Find the subject for the selected ID
				for (int i = 0; i < m_arrSubjectResults.length; i++) {
					if (subjectLabel.getSubject() == m_arrSubjectResults[i]) {
						return (DocumentSubjectResult)m_arrSubjectResults[i];
					}
				}
			}
		}
		*/
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
		/*
		if (event.isCreate() || event.isUpdate()) {
			// A new subject was created.
			m_iSubjectIDToSelect = s.getSubjectID();
		}
		//else if (event.isDelete()) {
		//}
		loadSubjects();
		*/
	}

	/*
	public void loadSubjects() {
		
		OntologyServiceAsync ontologyService = (OntologyServiceAsync)GWT.create(OntologyService.class);
        ServiceDefTarget endpoint = (ServiceDefTarget)ontologyService;
        String moduleRelativeURL = GWT.getModuleBaseURL() + "ontology";
        endpoint.setServiceEntryPoint(moduleRelativeURL);

        AsyncCallback callback = new AsyncCallback() {

        	public void onSuccess(Object result) {

        		Ontology o = (Ontology)result;
        		//m_arrSubjects = o.getSubjects();
        		m_arrSubjects.clear();
        		Subject[] arrSubjects = o.getSubjects();
        		for (int i = 0; i < arrSubjects.length; i++) {
        			m_arrSubjects.add(arrSubjects[i]);
        		}
        		
        		refreshList();
        		selectSubject(m_iSubjectIDToSelect);
        	}

            public void onFailure(Throwable caught) {
            	Window.alert("SubjectPanel::loadSubjects() -- service call failed.");
            }
        };
        
        ontologyService.getOntologyByID(m_iOntologyID, Ontology.FIELD_ALL_FIELDS, callback);
	}
	*/
	
	public void onMouseDown(Widget sender, int x, int y) {
		// TODO Auto-generated method stub
		
	}

	public void onMouseEnter(Widget sender) {

	}

	public void onMouseLeave(Widget sender) {
	}

	public void onMouseMove(Widget sender, int x, int y) {
		// TODO Auto-generated method stub
		
	}

	public void onMouseUp(Widget sender, int x, int y) {
		// TODO Auto-generated method stub
		
	}

}
