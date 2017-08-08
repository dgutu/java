package com.searchincite.client.widgets;

import com.google.gwt.user.client.ui.ChangeListener;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;


public class NewUserWizardStep1Panel extends Composite implements ChangeListener {

	public TextBox m_txtEMailAddress = new TextBox();
	boolean m_bDirty = false;
	
	public NewUserWizardStep1Panel() {

	    FlexTable tblMain = new FlexTable();

	    Image imgStep1 = new Image();
	    imgStep1.setUrl("images/1.gif");
	    HTML htmlCaption = new HTML();
	    htmlCaption.setHTML("<font size=\"2\">&nbsp;Enter email address of the user to create</font>");
	    tblMain.setWidget(0, 0, imgStep1);
	    tblMain.setWidget(0, 1, htmlCaption);
	    tblMain.getFlexCellFormatter().setColSpan(0, 1, 2);

	    tblMain.setWidget(2, 0, new HTML("&nbsp;"));
	    tblMain.setWidget(2, 1, new HTML("&nbsp;&nbsp;<b>Email address:&nbsp;</b>"));
	    m_txtEMailAddress.setWidth("200px");
	    tblMain.setWidget(2, 2, m_txtEMailAddress);

	    tblMain.setWidget(3, 0, new HTML("&nbsp;"));
	    tblMain.getFlexCellFormatter().setColSpan(3, 0, 3);

	    m_txtEMailAddress.addChangeListener(this);
		m_txtEMailAddress.setTabIndex(1);
	    initWidget(tblMain);
		m_txtEMailAddress.setFocus(true);

	}

	public String getEmailAddress() {
		return m_txtEMailAddress.getText().trim();
	}
	
	public boolean isDirty() {
		return m_bDirty;
	}

	public void setDirty(boolean bDirty) {
		m_bDirty = bDirty;
	}

	public void setFocus(boolean bFocus) {
		m_txtEMailAddress.setFocus(bFocus);  // This doesn't work when called in the constructor -- why?
	}

	public void onKeyDown(Widget sender, char keyCode, int modifiers) {
	}

	public void onKeyUp(Widget sender, char keyCode, int modifiers) {
	}

	public void onChange(Widget sender) {

		if (sender == m_txtEMailAddress) {
			m_bDirty = true;
		}
	}


}
