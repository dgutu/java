package com.searchincite.client.widgets;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;
import com.google.gwt.user.client.ui.ChangeListener;
import com.google.gwt.user.client.ui.ChangeListenerCollection;
import com.google.gwt.user.client.ui.ListBox;
import com.searchincite.client.entity.Ontology;
import com.searchincite.client.listeners.OntologyListFilledListener;
import com.searchincite.client.listeners.OntologyListFilledListenerCollection;
import com.searchincite.client.services.OntologyService;
import com.searchincite.client.services.OntologyServiceAsync;
//import java.util.logging.Level;
//import java.util.logging.Logger;

public class OntologyList extends ListBox {
	
	private boolean m_bShowNoSelection = false;
	protected ChangeListenerCollection m_ChangeListenerCollection = null;
	protected OntologyListFilledListenerCollection m_ListFilledListenerCollection = null;
	Ontology[] m_arrOntologies = null;
	private String m_strItemValueToSelect = "-1";
	
	// logger
	//private final static Logger log = Logger.getLogger(OntologyList.class.getName()); 

	public OntologyList(boolean bShowNoSelection) {
	    
		m_bShowNoSelection = bShowNoSelection;
		
		if (getShowNoSelection()) {
    		insertItem("[Select Ontology]", "-1", 0);
		}

		//setVisibleItemCount(10);
	}	

	public void setShowNoSelection(boolean bShowNoSelection) {
		m_bShowNoSelection = bShowNoSelection;
	}
	public boolean getShowNoSelection() {
		return m_bShowNoSelection;
	}
	
	/*
	private void fillList(Ontology[] arrOntologies) {
		fillList(arrOntologies, "-1");
	}
	*/
	
	public void fillList(Ontology[] arrOntologies, String strItemValueToSelect) {	
		
		m_strItemValueToSelect = strItemValueToSelect;
		clear();

		m_arrOntologies = arrOntologies;
		
		if (arrOntologies != null && arrOntologies.length > 0) {
			
			for (int i = 0; i < arrOntologies.length; i++) {
				addItem(arrOntologies[i].getName(), String.valueOf(arrOntologies[i].getOntologyID()));
			}
		}
		
		if (getShowNoSelection()) {
    		insertItem("[Select Ontology]", "-1", 0);
		}

		if (!m_strItemValueToSelect.equals("-1")) {
			selectItem(m_strItemValueToSelect);
		}
		else if (getItemCount() > 0) {
			setSelectedIndex(0);     
		}
		
		if (m_ListFilledListenerCollection != null) {
			m_ListFilledListenerCollection.fireOntologyListFilled();
		}
	}
	
	/*
	private void fillList() {
		
		//first, empty the list
		clear();
		
		OntologyServiceAsync ontologyService = (OntologyServiceAsync)GWT.create(OntologyService.class);
        ServiceDefTarget endpoint = (ServiceDefTarget)ontologyService;
        String moduleRelativeURL = GWT.getModuleBaseURL() + "ontology";
        endpoint.setServiceEntryPoint(moduleRelativeURL);

        AsyncCallback callback = new AsyncCallback() {

        	public void onSuccess(Object result) {

        		m_arrOntologies = (Ontology[])result;
        		fillList(m_arrOntologies);
        	}

            public void onFailure(Throwable caught) {
            	Window.alert("OntologyList::fillList() -- call to  ontologyService failed.");
            }
        };
        
        ontologyService.getOntologiesForOrganization(Ontology.FIELD_ID | Ontology.FIELD_NAME, callback);
        
	}
	*/

	//TODO: Use AsyncCallback for GWT 1.4, ChangeListener for GWT 1.5
//	public void addChangeListener(AsyncCallback listener) {
	public void addLocalChangeListener(ChangeListener listener) {

		if (m_ChangeListenerCollection == null) {
			m_ChangeListenerCollection = new ChangeListenerCollection();
		}
		m_ChangeListenerCollection.add(listener);
	}
	
	public void addListFilledListener(OntologyListFilledListener listener) {
		if (m_ListFilledListenerCollection == null) {
			m_ListFilledListenerCollection = new OntologyListFilledListenerCollection();
		}
		m_ListFilledListenerCollection.add(listener);
	}
	
	public void fillList(int iCategoryID) {
		fillList(iCategoryID, "-1");
	}

	public void fillList(int iCategoryID, String strItemValueToSelect) {		
		//log.log(Level.INFO, "iCategoryID={0}", iCategoryID);
		//log.log(Level.INFO, "strItemValueToSelect={0}", strItemValueToSelect);		
		
		// 
		m_strItemValueToSelect = strItemValueToSelect;
		
		// clear the LisBox
		clear();

		OntologyServiceAsync ontologyService = (OntologyServiceAsync)GWT.create(OntologyService.class);
        ServiceDefTarget endpoint = (ServiceDefTarget)ontologyService;
        String moduleRelativeURL = GWT.getModuleBaseURL() + "ontology";
        endpoint.setServiceEntryPoint(moduleRelativeURL);

        AsyncCallback callback = new AsyncCallback() {
        	public void onSuccess(Object result) {
        		m_arrOntologies = (Ontology[])result;
        		fillList(m_arrOntologies, m_strItemValueToSelect);
        		setEnabled(true);
        	}

            public void onFailure(Throwable caught) {
            	setEnabled(true);
            	Window.alert("OntologyList::fillList() -- service call failed.");
            }
        };
        
        // call method        
        ontologyService.getOntologiesForCategoryID(iCategoryID, Ontology.FIELD_ID | Ontology.FIELD_NAME | Ontology.FIELD_CATEGORY_ID | Ontology.FIELD_DESCRIPTION, callback);
        //log.log(Level.INFO, "end OntologyList.fillList ...");
	}

	public Ontology getSelectedOntology() {

		if (m_arrOntologies != null && m_arrOntologies.length >= 0) {
			for (int i = 0; i < m_arrOntologies.length; i++) {
				if (m_arrOntologies[i].getOntologyID() == Integer.parseInt(getValue(getSelectedIndex()))) {
					return m_arrOntologies[i];
				}
			}
		}		
		return null;
	
	}

	public void selectItem(String strItemValue) {
		for (int i = 0; i < getItemCount(); i++) {
			if (getValue(i).equals(strItemValue)) {
				setSelectedIndex(i);
				
				if (m_ChangeListenerCollection != null) {
					m_ChangeListenerCollection.fireChange(this);
				}
			}
		}
	}

}
