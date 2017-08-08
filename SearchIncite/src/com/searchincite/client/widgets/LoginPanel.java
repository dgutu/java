package com.searchincite.client.widgets;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.KeyboardListener;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.searchincite.client.listeners.LoginListener;
import com.searchincite.client.listeners.LoginListenerCollection;
import com.searchincite.client.security.LoginService;
import com.searchincite.client.security.LoginServiceAsync;


@SuppressWarnings("deprecation")
public class LoginPanel extends Composite implements KeyboardListener {

	public LoginListenerCollection m_loginListener = new LoginListenerCollection();

	public TextBox m_txtUserName = new TextBox();
	public PasswordTextBox m_txtPassword = new PasswordTextBox();

	public LoginPanel() {

	    FlexTable tblLogin = new FlexTable();

	    //tblLogin.setBorderWidth(1);

	    /*Label lblLogin = new Label();
	    lblLogin.setText("Login");
	    lblLogin.setStyleName("loginLabel");
	    tblLogin.setWidget(0, 0, lblLogin);*/
	    //tblLogin.getFlexCellFormatter().setColSpan(0, 0, 2);
	    //tblLogin.getCellFormatter().setHeight(0, 0, "50px");
	    //tblLogin.setText(0, 1, " ");

	    HTML htmlCaption = new HTML();
	    htmlCaption.setHTML("Please enter your username and password in the boxes below.<br/>Click Submit when finished.<br/><br/>");
	    tblLogin.setWidget(1, 0, htmlCaption);
	    tblLogin.getFlexCellFormatter().setColSpan(1, 0, 2);

	    tblLogin.setWidget(2, 0, new Label("Username:"));
	    tblLogin.setWidget(2, 1, m_txtUserName);

	    //m_txtUserName.setText("tkochan");
	    //m_txtPassword.setText("password");
	    tblLogin.setWidget(3, 0, new Label("Password:"));
	    tblLogin.setWidget(3, 1, m_txtPassword);
	    tblLogin.setText(4, 0, " ");
	    tblLogin.setText(4, 1, "Note: Passwords are case-sensitive.");

	    m_txtPassword.addKeyboardListener(this);

	    //m_txtUserName.setText("tkochan");
	    //m_txtPassword.setText("password");

		Button btnLogin = new Button("Submit", new ClickListener() {
			public void onClick(Widget sender) {
				doLogin();
			}
		});

		tblLogin.setWidget(5, 0, btnLogin);
	    tblLogin.getCellFormatter().setHeight(5, 0, "50px");
	    tblLogin.getFlexCellFormatter().setColSpan(5, 0, 2);

	    //m_txtUserName.setFocus(true); // This doesn't work -- WHY?

		initWidget(tblLogin);
	}

	private void doLogin() {

		LoginServiceAsync loginService = (LoginServiceAsync)GWT.create(LoginService.class);
        ServiceDefTarget endpoint = (ServiceDefTarget)loginService;
        String moduleRelativeURL = GWT.getModuleBaseURL() + "auth";
        endpoint.setServiceEntryPoint(moduleRelativeURL);

        AsyncCallback callback = new AsyncCallback() {

        	public void onSuccess(Object result) {

        		if (((Boolean)result).equals(Boolean.TRUE)) {
        			//Window.alert("Login succeeded!");
        		}
        		else {
	            	Window.alert("Invalid Login");
	            	//System.out.println("Invalid Login");
	            	//Logger.getLogger(Authentication.class.getName()).log(Level.INFO, null, "False");
        		}

        		m_loginListener.fireLoginAttempt((Boolean)result);
        	}

            public void onFailure(Throwable caught) {
            	Window.alert("Invalid Login");
            	//System.out.println("Invalid Login");
            	//Logger.getLogger(Authentication.class.getName()).log(Level.INFO, null, caught.getMessage());
            }
        };

        loginService.login(m_txtUserName.getText(), m_txtPassword.getText(), callback);

	}

	public void setFocus(boolean bFocus) {
		m_txtUserName.setFocus(bFocus);  // This doesn't work when called in the constructor -- why?
	}

	public void addLoginListener(LoginListener listener) {
		if (m_loginListener == null) {
			m_loginListener = new LoginListenerCollection();
		}
		m_loginListener.add(listener);
	}

	public void removeLoginListener(LoginListener listener) {
		if (m_loginListener != null) {
			m_loginListener.remove(listener);
		}
	}

	/* Handle Enter key press while focus is in the password edit box */
	public void onKeyPress(Widget sender, char keyCode, int modifiers) {
		if ((sender == m_txtPassword || sender == m_txtUserName) && keyCode == 13) {
			doLogin();
		}
	}

	public void onKeyDown(Widget sender, char keyCode, int modifiers) {
	}

	public void onKeyUp(Widget sender, char keyCode, int modifiers) {
	}

}
