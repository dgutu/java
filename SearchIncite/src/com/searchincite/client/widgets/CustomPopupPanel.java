package com.searchincite.client.widgets;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class CustomPopupPanel extends PopupPanel {
    private HTML message = new HTML();

    public CustomPopupPanel() {
        super(false, true); // Create a modal dialog box that will not auto-hide
        super.setGlassEnabled(true); // Enable the glass panel
    }

    public CustomPopupPanel(String text) {
        this();
        this.mask(text);        
    }

    public final void mask(String text) {
    	VerticalPanel popupPanelContents = new VerticalPanel();
    	message.setText(text);
    	message.setStyleName("popup-message");
    	popupPanelContents.add(message);
    	this.setWidget(popupPanelContents);    	
        super.center(); // Center the popup and make it visible
    }

    public void unmask() {
        super.hide(); // Hide the popup
    }
}
