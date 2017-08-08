package com.searchincite.client.widgets.dialogs;

import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.DockPanel;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.KeyboardListener;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.searchincite.client.entity.ChangeEvent;
import com.searchincite.client.entity.Phrase;
import com.searchincite.client.listeners.PhraseChangeListener;
import com.searchincite.client.services.PhraseServiceProxy;

  public class AddEditPhraseDialog extends DialogBox implements PhraseChangeListener, KeyboardListener {

	private boolean m_bEditing = false;
	private Phrase m_Phrase = null;
	
    DockPanel m_pnlOuter = new DockPanel();
	FlexTable m_tblMain = new FlexTable();
	HorizontalPanel m_pnlButtons = new HorizontalPanel();
    TextBox m_txtName = new TextBox();
    TextBox m_txtWeight = new TextBox();
    
    int m_iSubjectID = -1;
	
	private PhraseChangeListener m_PhraseChangeListener = null;
	
	public AddEditPhraseDialog(Phrase p, int iSubjectID, PhraseChangeListener listener) {
		  
			super();
			
			m_iSubjectID = iSubjectID;
			m_PhraseChangeListener = listener;
			m_Phrase = p;
			m_bEditing = m_Phrase != null;
			
			if (m_bEditing) {
				setText("Edit Phrase");
				m_txtName.setText(p.getName());
				m_txtWeight.setText(String.valueOf(p.getWeight()));
			}
			else {
				setText("New Phrase");
			}
		    
			m_pnlOuter.setSpacing(4);

		    HorizontalPanel pnlCaption = new HorizontalPanel();
		    HTML text = new HTML("Enter information for the new Phrase below,<br>then click OK to save or Cancel to close this dialog.");
		    pnlCaption.add(text);
		    //text.setWordWrap(true);
		    m_pnlOuter.add(pnlCaption, DockPanel.NORTH);

		    m_tblMain.setSize("100%", "100%");

		    m_pnlButtons.setHorizontalAlignment(HorizontalPanel.ALIGN_RIGHT);
		    m_pnlButtons.setSpacing(4);
		    Button btnOK = new Button("OK", new ClickListener() {
		      public void onClick(Widget sender) {
		    	  onClickOK();
		      }
		    });
		    
		    Button btnCancel = new Button("Cancel", new ClickListener() {
			      public void onClick(Widget sender) {
			        hide();
			      }
			    });
		    
		    HTML htmlCaption = new HTML();
		    htmlCaption.setHTML("<b>Phrase name:</b>");
		    
		    m_tblMain.setWidget(1, 0, htmlCaption);
		    m_tblMain.setWidget(1, 1, m_txtName);
		    m_tblMain.getFlexCellFormatter().setColSpan(1, 1, 2);

		    HTML htmlWeightCaption = new HTML();
		    htmlWeightCaption.setHTML("<b>Weight:</b>");
		    
		    m_tblMain.setWidget(2, 0, htmlWeightCaption);
		    m_tblMain.setWidget(2, 1, m_txtWeight);
		    m_tblMain.getFlexCellFormatter().setColSpan(2, 1, 2);

		    HorizontalPanel pnlButtons = new HorizontalPanel();
		    pnlButtons.setSpacing(4); 
		    pnlButtons.add(btnOK);
		    pnlButtons.add(btnCancel);
		    
		    m_tblMain.setWidget(3, 2, pnlButtons);
		    m_tblMain.getCellFormatter().setHorizontalAlignment(3, 2, HorizontalPanel.ALIGN_RIGHT);
		    m_tblMain.getCellFormatter().setVerticalAlignment(3, 2, VerticalPanel.ALIGN_BOTTOM);
		    m_tblMain.getCellFormatter().setHeight(3, 2, "55px");
		    
		    m_pnlOuter.add(m_tblMain, DockPanel.CENTER);
		    m_pnlOuter.setSpacing(8);

		    // add keyboard listeners for ENTER keypress in edit boxes
		    m_txtName.addKeyboardListener(this);
		    m_txtWeight.addKeyboardListener(this);

		    setWidget(m_pnlOuter);
	  }
	
	private void onClickOK() {

		if (m_txtName.getText().trim().length() == 0) {
			Window.alert("Please enter a Phrase name");
			m_txtName.setFocus(true);
			return;
		}

		if (m_txtWeight.getText().trim().length() == 0) {
			Window.alert("Please enter a Weight");
			m_txtWeight.setFocus(true);
			return;
		}

		boolean bInvalidWeight = true;
		
		try {
			Double.parseDouble(m_txtWeight.getText());
			bInvalidWeight = false;
		}
		catch (NumberFormatException ex) {
			bInvalidWeight = true;
		}

		if (bInvalidWeight) {
			Window.alert("Invalid Weight - please enter a numeric value.");
			m_txtWeight.setFocus(true);
			return;
		}

		if (!m_bEditing) {
	    	Phrase p = new Phrase();
	    	p.setSubjectID(m_iSubjectID);
	    	p.setName(m_txtName.getText());

	    	int iWeight = 0;
	    	
	    	try {
	    		iWeight = Integer.parseInt(m_txtWeight.getText());
	    	}
	    	catch (NumberFormatException ex) {
	    		iWeight = 0;
	    	}
	    	
	    	p.setWeight(iWeight);

	    	createPhrase(p);
    	}
    	else {
    		m_Phrase.setSubjectID(m_iSubjectID);
    		m_Phrase.setName(m_txtName.getText());

	    	int iWeight = 0;
	    	
	    	try {
	    		iWeight = Integer.parseInt(m_txtWeight.getText());
	    	}
	    	catch (NumberFormatException ex) {
	    		iWeight = 0;
	    	}
	    	
	    	m_Phrase.setWeight(iWeight);
    		
    		updatePhrase(m_Phrase);
    	}
    	  

	}

	public void show() {
		  super.show();
		  int left = (Window.getClientWidth() - getOffsetWidth()) / 2 + getBodyScrollLeft();
		  int top = (Window.getClientHeight() - getOffsetHeight()) / 2 + getBodyScrollTop();
		  setPopupPosition(left, top);
		  m_txtName.selectAll();
		  m_txtName.setFocus(true);
	  }

	/*
	public int getSelectedOntologyID() {
		
		int iSelectedIndex = m_lstOntology.getSelectedIndex();
		
		if (iSelectedIndex != -1) {
			return Integer.parseInt(m_lstOntology.getValue(iSelectedIndex));
		}
		
		return -1; 
	}
	*/
	  private native int getBodyScrollLeft() /*-{
	        return $doc.body.scrollLeft;
	      }-*/;

	  private native int getBodyScrollTop() /*-{
	        return $doc.body.scrollTop;
	      }-*/;
	
		public void createPhrase(Phrase phrase) {
			PhraseServiceProxy proxy = new PhraseServiceProxy();
			proxy.addPhraseChangeListener(this);
			proxy.addPhraseChangeListener(m_PhraseChangeListener);
			proxy.createPhrase(phrase);
		}

	public void onPhraseChange(Phrase c, ChangeEvent event) {
		if (event.isCreate() || event.isUpdate()) {
			hide();
		}
	}

	public void updatePhrase(Phrase phrase) {
		PhraseServiceProxy proxy = new PhraseServiceProxy();
		proxy.addPhraseChangeListener(this);
		proxy.addPhraseChangeListener(m_PhraseChangeListener);
		proxy.updatePhrase(phrase);
	}

	public void onKeyDown(Widget sender, char keyCode, int modifiers) {
	}

	public void onKeyPress(Widget sender, char keyCode, int modifiers) {
		if ((sender == m_txtName || sender == m_txtWeight) && keyCode == 13) {
			onClickOK();
		}
		else if (keyCode == 27) {
			hide();
		}
	}

	public void onKeyUp(Widget sender, char keyCode, int modifiers) {
	}

  }
