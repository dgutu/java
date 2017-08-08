package com.searchincite.client.widgets;

import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.MenuBar;
import com.google.gwt.user.client.ui.MenuItem;
import com.searchincite.client.data.constants.MenuConstants;
import com.searchincite.client.listeners.MenuItemClickListener;
import com.searchincite.client.listeners.MenuItemClickListenerCollection;


public class HeaderPanel extends Composite implements Command {

	private MenuBar m_menu = new MenuBar();

	protected MenuItemClickListenerCollection m_MenuItemClickListener = new MenuItemClickListenerCollection();

	public HeaderPanel() {
	
	    /*
		MenuBar subMenu = new MenuBar(true);
	    MenuBar menu0 = new MenuBar(true);
	    menu0.addItem("<b>Bold</b>", true, this);
	    menu0.addItem("<i>Italicized</i>", true, this);
	    menu0.addItem("More &#187;", true, subMenu);
	    */
	    MenuBar menu1 = new MenuBar(true);
	    menu1.addItem("New Ontology...", new Command() {
	    	public void execute() {
	    	    Window.alert("Not implemented");
	    	}
	    });
	    menu1.addItem("Open Ontology...", new Command() {
	    	public void execute() {
	    	    //OpenOntologyDialog dlg = new OpenOntologyDialog();
	    		//dlg.addOntologySelectionListener(this);
	    		//dlg.show();
		        m_MenuItemClickListener.fireMenuItemClicked(MenuConstants.MENU_ITEM_FILE_OPEN_ONTOLOGY);

	    	}
	    });
	    m_menu.addItem(new MenuItem("File", menu1));

	    MenuBar menu2 = new MenuBar(true);
	    menu2.addItem("Options", this);
	    menu2.addItem("Check Duplicate Words", this);
	    menu2.addItem("Compile Database", this);
	    menu2.addItem("Run SCaNspect Analyst", this);
		
	    //m_menu.addItem(new MenuItem("Style", menu0));
	    //m_menu.addItem(new MenuItem("Fruit", menu1));
	    m_menu.addItem(new MenuItem("Tools", menu2));

	    m_menu.setWidth("100%");

	    //initWidget(m_menu);
	    
	    FlexTable tbl = new FlexTable();
	    initWidget(tbl);
	}

	public void execute() {
	    Window.alert("Not implemented");
	}	
	
	public void addMenuItemClickListener(MenuItemClickListener listener) {
		if (m_MenuItemClickListener == null) {
			m_MenuItemClickListener = new MenuItemClickListenerCollection();
		}
		m_MenuItemClickListener.add(listener);
	}

	public void removeMenuItemClickListener(MenuItemClickListener listener) {
		if (m_MenuItemClickListener != null) {
			m_MenuItemClickListener.remove(listener);
		}
	}

}
