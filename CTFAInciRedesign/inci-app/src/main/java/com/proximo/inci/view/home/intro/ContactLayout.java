/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.home.intro;

import java.io.File;
import java.io.FileInputStream;
import org.apache.commons.io.IOUtils;
import com.proximo.inci.window.main.MainWindow;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
public class ContactLayout extends VerticalLayout {
    
    private MainWindow mainWindow;
    private String fileName = "contactInfo.html";

    public ContactLayout(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
        
        init();
    }
    
    public ContactLayout(MainWindow mainWindow, String fileName) {
        this.mainWindow = mainWindow;
        this.fileName = fileName;
        
        init();
    }
    
    private void init() {    	
        String basepath = mainWindow.getApplication().getContext().getBaseDirectory().getAbsolutePath() + "\\html\\" + fileName;
    	try {
    		File file = new File(basepath);
    		if (file.exists()) {
	    		FileInputStream is = new FileInputStream(basepath);    		
	        	Label lbl = new Label(IOUtils.toString(is,"UTF-8"), Label.CONTENT_XHTML);
	        	is.close();
	        	addComponent(lbl);
    		}
    		/*else {
    			mainWindow.logout();
    		}*/
		} catch (Exception e) {
		}
    }
    
    
}
