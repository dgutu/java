package com.searchincite.client.widgets.dialogs;

import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.DockPanel;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.KeyboardListener;
import com.google.gwt.user.client.ui.PopupListener;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.searchincite.client.entity.ChangeEvent;
import com.searchincite.client.entity.Subject;
import com.searchincite.client.listeners.SubjectChangeListener;
import com.searchincite.client.services.SubjectServiceProxy;
import com.searchincite.client.util.ColorUtil;
import com.searchincite.client.widgets.colorpicker.util.RGB;

  public class AddEditSubjectDialog extends DialogBox implements SubjectChangeListener, KeyboardListener, PopupListener {

	private boolean m_bEditing = false;
	private Subject m_Subject = null;
	private ColorPickerDialog m_ColorPickerDialog = null;
	
	DockPanel m_pnlOuter = new DockPanel();
	FlexTable m_tblMain = new FlexTable();
	HorizontalPanel m_pnlButtons = new HorizontalPanel();
	TextBox m_txtName = new TextBox();
	TextBox m_txtWeight = new TextBox();
	TextBox m_txtColor = new TextBox();
	int m_iOntologyID = -1;
	
	private SubjectChangeListener m_SubjectChangeListener = null;
	
	public AddEditSubjectDialog(Subject s, int iOntologyID, SubjectChangeListener listener)
	{
		  
		super();
		
		m_iOntologyID = iOntologyID;
		m_SubjectChangeListener = listener;
		m_Subject = s;
		m_bEditing = m_Subject != null;
		
		if (m_bEditing) {
			setText("Edit Subject");
			m_txtName.setText(s.getName());

			//m_txtColor.setText(s.getColor());

			DOM.setStyleAttribute(m_txtColor.getElement(), "backgroundColor", s.getColor());

			m_txtColor.setReadOnly(true);
			//m_txtColor.setEnabled(false);

			m_txtWeight.setText(String.valueOf(s.getWeight()));
		}
		else {
			setText("New Subject");
			DOM.setStyleAttribute(m_txtColor.getElement(), "backgroundColor", "rgb(255,255,255)");
		}
	    
		m_pnlOuter.setSpacing(4);

		HorizontalPanel pnlCaption = new HorizontalPanel();
		HTML text = new HTML("Enter information for the new Subject below,<br>then click OK to save or Cancel to close this dialog.");
		pnlCaption.add(text);
		//text.setWordWrap(true);
		m_pnlOuter.add(pnlCaption, DockPanel.NORTH);

		m_tblMain.setSize("100%", "100%");

		m_pnlButtons.setHorizontalAlignment(HorizontalPanel.ALIGN_RIGHT);
		m_pnlButtons.setSpacing(4);
		Button btnOK = new Button("OK", new ClickListener()
		{
			public void onClick(Widget sender) {
				onClickOK();
			}
		});

		Button btnCancel = new Button("Cancel", new ClickListener()
		{
			public void onClick(Widget sender) {
				hide();
			}
		});

		HTML htmlCaption = new HTML();
		htmlCaption.setHTML("<b>Subject:</b>");

		m_tblMain.setWidget(1, 0, htmlCaption);
		m_tblMain.setWidget(1, 1, m_txtName);
		m_tblMain.getFlexCellFormatter().setColSpan(1, 1, 2);

		HTML htmlWeightCaption = new HTML();
		htmlWeightCaption.setHTML("<b>Weight:</b>");

		m_tblMain.setWidget(2, 0, htmlWeightCaption);
		m_tblMain.setWidget(2, 1, m_txtWeight);
		m_tblMain.getFlexCellFormatter().setColSpan(2, 1, 2);

		HTML htmlColorCaption = new HTML();
		htmlColorCaption.setHTML("<b>Color:</b>");

		m_tblMain.setWidget(3, 0, htmlColorCaption);
		m_tblMain.setWidget(3, 1, m_txtColor);
		m_tblMain.getFlexCellFormatter().setColSpan(3, 1, 2);

		Button btnChooseColor = new Button("Pick", new ClickListener()
		{
			public void onClick(Widget sender) {
				onChooseColor();
			}
		});

		m_tblMain.setWidget(3, 2, btnChooseColor);

		HorizontalPanel pnlButtons = new HorizontalPanel();
		pnlButtons.setSpacing(4); 
		pnlButtons.add(btnOK);
		pnlButtons.add(btnCancel);

		m_tblMain.setWidget(4, 2, pnlButtons);
		m_tblMain.getCellFormatter().setHorizontalAlignment(4, 2, HorizontalPanel.ALIGN_RIGHT);
		m_tblMain.getCellFormatter().setVerticalAlignment(4, 2, VerticalPanel.ALIGN_BOTTOM);
		m_tblMain.getCellFormatter().setHeight(4, 2, "55px");

		m_pnlOuter.add(m_tblMain, DockPanel.CENTER);
		m_pnlOuter.setSpacing(8);

		// add keyboard listeners for ENTER keypress in edit boxes
		m_txtName.addKeyboardListener(this);
		m_txtWeight.addKeyboardListener(this);
		m_txtColor.addKeyboardListener(this);		    

		//m_ColorPickerDialog.addPopupListener(this);
		setWidget(m_pnlOuter);
	  }

	private void onChooseColor()
	{
		// if the color in the doc is blaknk then make it 'rgb(255,255,255)'
                //Window.alert(DOM.getStyleAttribute(m_txtColor.getElement(), "backgroundColor")); //debug
		m_ColorPickerDialog = new ColorPickerDialog(ColorUtil.HTMLHexToRGB(DOM.getStyleAttribute(m_txtColor.getElement(), "backgroundColor")));
		m_ColorPickerDialog.addPopupListener(this);
		m_ColorPickerDialog.show();
	}
	
	private void onClickOK()
	{
		if (m_txtName.getText().trim().length() == 0)
		{
			Window.alert("Please enter a Subject");
			m_txtName.setFocus(true);
			return;
		}

		if (m_txtWeight.getText().trim().length() == 0)
		{
			Window.alert("Please enter a Weight");
			m_txtWeight.setFocus(true);
			return;
		}

		boolean bInvalidWeight = true;
		
		try
		{
			Double.parseDouble(m_txtWeight.getText());
			bInvalidWeight = false;
		}
		catch (NumberFormatException ex)
		{
			bInvalidWeight = true;
		}

		if (bInvalidWeight)
		{
			Window.alert("Invalid Weight - please enter a numeric value.");
			m_txtWeight.setFocus(true);
			return;
		}

		if (DOM.getStyleAttribute(m_txtColor.getElement(), "backgroundColor").length() == 0)
		{
		//if (m_txtColor.getText().trim().length() == 0) {
			Window.alert("Please select a Color.");
			//m_txtColor.setFocus(true);
			return;
		}
		
		if (!m_bEditing)
		{
			Subject s = new Subject();
			s.setOntologyID(m_iOntologyID);
			s.setName(m_txtName.getText());
			//s.setColor(m_txtColor.getText())
			RGB colorValue = ColorUtil.HTMLHexToRGB(DOM.getStyleAttribute(m_txtColor.getElement(), "backgroundColor"));
			s.setColor(ColorUtil.RGBtoHTMLHex(colorValue.getRed(), colorValue.getGreen(), colorValue.getBlue()));
			
			double dWeight = 0.0000;
	    	
			try {
				dWeight = Double.parseDouble(m_txtWeight.getText());
			}
			catch (NumberFormatException ex) {
				dWeight = 0.0000;
			}
			
			s.setWeight(dWeight);
			
			createSubject(s);
		}
		else {
			m_Subject.setOntologyID(m_iOntologyID);
			m_Subject.setName(m_txtName.getText());
			//m_Subject.setColor(m_txtColor.getText())
			RGB colorValue = ColorUtil.HTMLHexToRGB(DOM.getStyleAttribute(m_txtColor.getElement(), "backgroundColor"));
			m_Subject.setColor(ColorUtil.RGBtoHTMLHex(colorValue.getRed(), colorValue.getGreen(), colorValue.getBlue()));
			
			double dWeight = 0.0000;
			
			try {
				dWeight = Double.parseDouble(m_txtWeight.getText());
			}
			catch (NumberFormatException ex) {
				dWeight = 0.0000;
			}
			
			m_Subject.setWeight(dWeight);
			
			updateSubject(m_Subject);
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


	  private native int getBodyScrollLeft() /*-{
	        return $doc.body.scrollLeft;
	      }-*/;

	  private native int getBodyScrollTop() /*-{
	        return $doc.body.scrollTop;
	      }-*/;
	
		public void createSubject(Subject subject) {
			SubjectServiceProxy proxy = new SubjectServiceProxy();
			proxy.addSubjectChangeListener(this);
			proxy.addSubjectChangeListener(m_SubjectChangeListener);
			proxy.createSubject(subject);
		}

	public void onSubjectChange(Subject c, ChangeEvent event) {
		if (event.isCreate() || event.isUpdate()) {
			hide();
		}
	}

	public void updateSubject(Subject subject) {
		SubjectServiceProxy proxy = new SubjectServiceProxy();
		proxy.addSubjectChangeListener(this);
		proxy.addSubjectChangeListener(m_SubjectChangeListener);
		proxy.updateSubject(subject);
	}

	public void onKeyDown(Widget sender, char keyCode, int modifiers) {
	}

	public void onKeyPress(Widget sender, char keyCode, int modifiers) {
		if ((sender == m_txtName || sender == m_txtWeight || sender == m_txtColor) && keyCode == 13) {
			onClickOK();
		}
		else if (keyCode == 27) {
			hide();
		}
	}

	public void onKeyUp(Widget sender, char keyCode, int modifiers) {
	}

	public void onPopupClosed(PopupPanel sender, boolean autoClosed) {
		if (sender.equals(m_ColorPickerDialog) && !m_ColorPickerDialog.getCanceled() && m_ColorPickerDialog.getSelectedColor() != null) {
			DOM.setStyleAttribute(m_txtColor.getElement(), "backgroundColor", m_ColorPickerDialog.getSelectedColor());
		    m_ColorPickerDialog = null;
		}
	}

  }
