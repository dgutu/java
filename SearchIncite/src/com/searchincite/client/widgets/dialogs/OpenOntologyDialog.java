package com.searchincite.client.widgets.dialogs;

import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.DockPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.searchincite.client.listeners.OntologySelectionListener;
import com.searchincite.client.listeners.OntologySelectionListenerCollection;
import com.searchincite.client.widgets.OntologyList;

  public class OpenOntologyDialog extends DialogBox {

	OntologyList m_lstOntology = new OntologyList(false);
	protected OntologySelectionListenerCollection m_OntologySelectionListener = new OntologySelectionListenerCollection();
	
	public OpenOntologyDialog() {
		  
		    setText("Open Ontology");
		    
		    // Create a DockPanel to contain the ontology list
		    DockPanel outer = new DockPanel();
		    outer.setSpacing(4);

		    HorizontalPanel pnlCaption = new HorizontalPanel();
		    HTML text = new HTML("Select Ontology to open.");
		    pnlCaption.add(text);
		    outer.add(pnlCaption, DockPanel.NORTH);

		    outer.add(m_lstOntology, DockPanel.WEST);

		    // Create the 'OK' button, along with a listener that hides the dialog
		    // when the button is clicked. Adding it to the 'south' position within
		    // the dock causes it to be placed at the bottom.
		    VerticalPanel buttonPanel = new VerticalPanel();
		    buttonPanel.setSpacing(3);
		    //buttonPanel.setHorizontalAlignment(VerticalPanel.ALIGN_RIGHT);
		    buttonPanel.add(new Button("Open", new ClickListener() {
		      public void onClick(Widget sender) {
		        //Window.alert("Not implemented");
		        m_OntologySelectionListener.fireOntologySelected(getSelectedOntologyID());
		        hide();
		      }
		    }));
		    buttonPanel.add(new Button("Cancel", new ClickListener() {
			      public void onClick(Widget sender) {
			        hide();
			      }
			    }));
		    outer.add(buttonPanel, DockPanel.EAST);
		    
		    // Create the 'about' label. Placing it in the 'rest' position within the
		    // dock causes it to take up any remaining space after the 'OK' button
		    // has been laid out.
		    /*
		    HTML text = new HTML(
		      "This sample application demonstrates the construction "
		        + "of a complex user interface using GWT's built-in widgets.  Have a look "
		        + "at the code to see how easy it is to build your own apps!");
		    text.setStyleName("mail-AboutText");
		    outer.add(text, DockPanel.CENTER);
			*/
		    // Add a bit of spacing and margin to the dock to keep the components from
		    // being placed too closely together.
		    outer.setSpacing(8);

		    setWidget(outer);
	  }

	public void show() {
		  super.show();
		  int left = (Window.getClientWidth() - getOffsetWidth()) / 2 + getBodyScrollLeft();
		  int top = (Window.getClientHeight() - getOffsetHeight()) / 2 + getBodyScrollTop();
		  setPopupPosition(left, top);
	  }

	public int getSelectedOntologyID() {
		
		int iSelectedIndex = m_lstOntology.getSelectedIndex();
		
		if (iSelectedIndex != -1) {
			return Integer.parseInt(m_lstOntology.getValue(iSelectedIndex));
		}
		
		return -1; 
	}
	
	  private native int getBodyScrollLeft() /*-{
	        return $doc.body.scrollLeft;
	      }-*/;

	  private native int getBodyScrollTop() /*-{
	        return $doc.body.scrollTop;
	      }-*/;
	
		public void addOntologySelectionListener(OntologySelectionListener listener) {
			if (m_OntologySelectionListener == null) {
				m_OntologySelectionListener = new OntologySelectionListenerCollection();
			}
			m_OntologySelectionListener.add(listener);
		}

		public void removeOntologySelectionListener(OntologySelectionListener listener) {
			if (m_OntologySelectionListener != null) {
				m_OntologySelectionListener.remove(listener);
			}
		}

  }
