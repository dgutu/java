/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.home.intro;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proximo.inci.view.BaseView;
import com.proximo.inci.window.main.MainWindow;

public class IntroductionDetailView extends BaseView {
	
	private static Logger logger = LoggerFactory.getLogger(IntroductionDetailView.class);
	
    public IntroductionDetailView(MainWindow mainWindow) {
        super(mainWindow, false, null);
    }
    
    @Override
    public void applyNavigationParameters(Map<String, Object> navigationParameterMap) {
		String fragment = getCurrentView();
		
		if (fragment.contains("file")) {
			try {
				String strToSearch = "file=";
				int index = fragment.indexOf(strToSearch);
				String fileName = fragment.substring(index + strToSearch.length());
				//logger.debug("fileName="+fileName);
				IntroductionLayout il = new IntroductionLayout((MainWindow) mainWindow, fileName);
				mainComponent.removeAllComponents();
				mainComponent.addComponent(il);
			} 
			catch(Exception ex) {
				logger.error(ex.getMessage());
			}
		}
    }     
}
