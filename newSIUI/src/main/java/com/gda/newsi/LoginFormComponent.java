package com.gda.newsi;

import org.springframework.beans.factory.annotation.Autowired;

import com.gda.newsi.service.UserService;
import com.vaadin.event.ShortcutAction;
import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.UIScope;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.Notification;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

@UIScope
@SpringComponent
public class LoginFormComponent extends CustomComponent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1353804791249752441L;

	@Autowired
	private UserService userService;

	public LoginFormComponent() {
		TextField username = new TextField("Username");
		username.setPlaceholder("aaa");
		// username.setRequiredIndicatorVisible(true);
		username.focus();

		PasswordField passwordField = new PasswordField("Password");
		passwordField.setDescription("write");

		Button login = new Button("Login", e -> onLogin(username, passwordField));
		login.setClickShortcut(ShortcutAction.KeyCode.ENTER);

		FormLayout formLayout = new FormLayout(username, passwordField, login);
		formLayout.setSizeUndefined();

		VerticalLayout verticalLayout = new VerticalLayout(formLayout);
		verticalLayout.setSizeFull();
		verticalLayout.setComponentAlignment(formLayout, Alignment.MIDDLE_CENTER);

		setCompositionRoot(verticalLayout);
		setSizeFull();
	}

	private void onLogin(TextField username, PasswordField passwordField) {
		try {
			if (userService.signIn(username.getValue(), passwordField.getValue())) {
				Notification.show("successful login");
			} else {
				Notification.show("fail");
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
