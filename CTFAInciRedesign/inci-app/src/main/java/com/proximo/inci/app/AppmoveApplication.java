package com.proximo.inci.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proximo.inci.common.TemplarUtil;
import com.proximo.inci.service.appidmove.AppIDMoveService;
import com.proximo.inci.service.security.SecurityInfo;
import com.proximo.inci.service.security.SecurityService;
import com.proximo.inci.service.security.user.User;
import com.vaadin.Application;
import com.vaadin.data.validator.StringLengthValidator;
import com.vaadin.event.ShortcutAction.KeyCode;
//import com.vaadin.terminal.ExternalResource;
import com.vaadin.ui.*;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Window.Notification;

/**
 * Main application class.
 */
@SuppressWarnings("serial")
public class AppmoveApplication extends Application {

	private static Logger logger = LoggerFactory.getLogger(AppmoveApplication.class);
	
	private Window mainWindow;
	private TextField tfUserName;
	private PasswordField tfUserPassword;
	private TextField oldUserName;
	private PasswordField oldUserPassword;
	private Button button;
	private Label lbl;
	private Label lblOldDescription;
	private Label lblTablesUpdate;
	private final String VALIDATOR_MESSAGE = "Must not be empty";
	private Label note;
	private Label info;
	
	@Override
	public void init() {
		mainWindow = new Window("Appmove Application");
		
		// form layout
		FormLayout fl = new FormLayout();
		//fl.setCaption("User credentials");
		fl.setSizeFull();	
		fl.setSpacing(true);		
		fl.setImmediate(true);
		
		// info
		Panel panel = new Panel();
		//panel.setWidth("600px");
		panel.setSizeFull();
		info = new Label();
		info.setContentMode(Label.CONTENT_XHTML);
		//info.setWidth("600px");
		String infoString = "<div style=\"text-align:left; font-size: 12px; font-weight: bold;\">Enter your new User ID/Password and your old User ID/Password in the text fields below to link "
							+"your new User ID to your applications currently on the INCI Application website. You only need to do this once, "
							+"after that all your applications will be linked to your new User ID.<br><br>" 
							+"If the \"Old User ID\" is shared with staff, the first person to go through this INCI Application"
							+"&nbsp;re-assignment process will have all the applications assigned to their \"New User ID\".<br><br></div>"; 
 
		info.setValue(infoString);
		panel.addComponent(info);
		//fl.addComponent(info);
		mainWindow.addComponent(panel);
		
		// reguired field
		note = new Label("<div style=\"font-size: 10px;\">*Required Information</div>");
		note.setWidth("250px");
		note.setContentMode(Label.CONTENT_XHTML);
		fl.addComponent(note);
		
		// username
		tfUserName = new TextField("New User ID: *");			
		tfUserName.focus();
		tfUserName.setWidth("250px");
		tfUserName.setRequired(true);
		tfUserName.setRequiredError("Give New User ID");
		tfUserName.setImmediate(true);
		tfUserName.setValidationVisible(true);
		tfUserName.addValidator(new StringLengthValidator(VALIDATOR_MESSAGE, 1, 100, false));
		fl.addComponent(tfUserName);
		
		// password
		tfUserPassword = new PasswordField("New Password: *");
		tfUserPassword.setWidth("250px");
		tfUserPassword.setRequired(true);
		tfUserPassword.setRequiredError("Give New Password");
		tfUserPassword.setImmediate(true);
		tfUserPassword.setValidationVisible(true);
		tfUserPassword.addValidator(new StringLengthValidator(VALIDATOR_MESSAGE, 1, 100, false));		
		fl.addComponent(tfUserPassword);
		
		// old username
		oldUserName = new TextField("Old User ID: *");			
		oldUserName.setWidth("250px");
		oldUserName.setRequired(true);
		oldUserName.setRequiredError("Give Old User ID");
		oldUserName.setImmediate(true);
		oldUserName.setValidationVisible(true);
		oldUserName.addValidator(new StringLengthValidator(VALIDATOR_MESSAGE, 1, 100, false));
		fl.addComponent(oldUserName);
		
		// old password
		oldUserPassword = new PasswordField("Old Password: *");
		oldUserPassword.setWidth("250px");
		oldUserPassword.setRequired(true);
		oldUserPassword.setRequiredError("Give Old Password");	
		oldUserPassword.setImmediate(true);
		oldUserPassword.setValidationVisible(true);
		oldUserPassword.addValidator(new StringLengthValidator(VALIDATOR_MESSAGE, 1, 100, false));		
		fl.addComponent(oldUserPassword);		
		
		// button
		button = new Button("Go");
		button.addListener(check());
		button.setClickShortcut(KeyCode.ENTER);
		fl.addComponent(button);

		// label result
		VerticalLayout vl = new VerticalLayout();
		lbl = new Label();
		lbl.setContentMode(Label.CONTENT_XHTML);
		vl.addComponent(lbl);

		VerticalLayout vl2 = new VerticalLayout();
		lblOldDescription = new Label();
		lblOldDescription.setContentMode(Label.CONTENT_XHTML);
		vl2.addComponent(lblOldDescription);
		
		VerticalLayout vl3 = new VerticalLayout();
		lblTablesUpdate = new Label();
		lblTablesUpdate.setContentMode(Label.CONTENT_XHTML);
		vl3.addComponent(lblTablesUpdate);
		
		// add components
		// form layout
		mainWindow.addComponent(fl);
		
		// netforum data 
		mainWindow.addComponent(vl);
		
		// web_user data
		mainWindow.addComponent(vl2);
		
		// table update data
		mainWindow.addComponent(vl3);
		
		// set main window
		setMainWindow(mainWindow);
		//setTheme("appmovetheme");
		setTheme("inci-app-theme");
	}
	
	// button click
    protected Button.ClickListener check() {
        return new Button.ClickListener() {

			public void buttonClick(ClickEvent event) {
				if (validate()) {				
					// netforum credentials
					String username = tfUserName.getValue().toString();
					String password = tfUserPassword.getValue().toString();					
					
					// old credentials
					String oldusername = oldUserName.getValue().toString();
					String oldpassword = oldUserPassword.getValue().toString();
					
					try {
						// check credentials in netforum
						SecurityInfo securityInfo = SecurityService.getSecurityInfoByCredentials(username, password);
						String cstKey = null;
						// if valid user
						if (securityInfo != null) {
							User user = securityInfo.getUser();
							cstKey = user.getUserRecId().toUpperCase();
							lbl.setValue("<br><b>Netforum information</b><br>user cst_key="+cstKey);
						} 
						else {
							lbl.setValue("<br><b>Netforum information</b><br>No such user !");
						}
						
						// old user information
						long userRecId = AppIDMoveService.verifyOldUserCredentials(oldusername, oldpassword);
						
						if (userRecId != 0) {
							lblOldDescription.setValue("<br><br><b>WEB_USER information</b><br>user recID="+userRecId);
						}
						else {
							lblOldDescription.setValue("<br><br><b>WEB_USER information</b><br>No such user !");
						}
						
						// update database tables
						//if (userRecId != 0 && securityInfo != null) {
						String result = AppIDMoveService.updateUserTables(userRecId, cstKey);
						lblTablesUpdate.setValue("<br><br>"+result);
						//}
					}
					catch (Exception ex) {
						//mainWindow.showNotification(ex.getMessage(), Notification.TYPE_ERROR_MESSAGE);
						logger.error(ex.getMessage());
					}
				}
				else {
					mainWindow.showNotification("Fill required fields.", Notification.TYPE_WARNING_MESSAGE);
				}
			}
        	
        };
    }
    
    private boolean validate() {
    	boolean result = true;
    	
    	if (TemplarUtil.isObjNullOrEmpty(tfUserName.getValue())) {
    		result = false;
    	}
    	if (TemplarUtil.isObjNullOrEmpty(tfUserPassword.getValue())) {
    		result = false;
    	}    			
    	if (TemplarUtil.isObjNullOrEmpty(oldUserName.getValue())) {
    		result = false;
    	}    			
    	if (TemplarUtil.isObjNullOrEmpty(oldUserPassword.getValue())) {
    		result = false;
    	}    		
    	
    	return result;
    }
    
    // getWindow
    /*@Override
    public Window getWindow(String name) {
    	// If the window is identified by name, we are good to go
        Window w = super.getWindow(name);
        
        // If not, we must create a new window for this new browser window/tab
        if (w == null) {
        	try {
        		w = new Window();
        		
        		// Use the random name given by the framework to identify this
    			// window in future        		
        		w.setName(name);
    			addWindow(w);
    			
    			// Move to the url to remember the name in the future
    			w.open(new ExternalResource(w.getURL()));
        	}
        	catch(Exception ex) {
        	}
        	
        }

        return w;
    }*/
    

}

