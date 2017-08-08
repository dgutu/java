package com.gda.newsi;

import javax.servlet.annotation.WebServlet;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.UI;

@Theme("valo")
@SpringUI
public class MyVaadinUI extends UI {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	private LoginFormComponent login;

	@Override
	protected void init(VaadinRequest vaadinRequest) {
		setContent(login);
	}

	@WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
	@VaadinServletConfiguration(ui = MyVaadinUI.class, productionMode = false)
	public static class MyUIServlet extends VaadinServlet {
	}

}
