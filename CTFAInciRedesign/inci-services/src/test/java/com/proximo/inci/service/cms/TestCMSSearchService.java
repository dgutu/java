package com.proximo.inci.service.cms;

import java.sql.SQLException;

import javax.naming.NamingException;

import com.proximo.inci.AbstractServiceTest;
import com.proximo.inci.DOCMSText;
import com.proximo.inci.DOList;
import com.proximo.inci.service.tradename.TradeNameService;

public class TestCMSSearchService {

	/**
	 * @param args
	 * @throws NamingException 
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException, NamingException {
		testMethod();
	}
	
	public static void testMethod() throws SQLException, NamingException {
        @SuppressWarnings("unused")
		AbstractServiceTest test = new AbstractServiceTest(true) {
            @Override
            public void runTest() {
            	DOList searchResult = TradeNameService.searchCMSList("Title 1");
            	
            	for (int i=0;i<searchResult.size();i++) {
            		DOCMSText doCMSText = new DOCMSText();
            		doCMSText = (DOCMSText) searchResult.elementAt(i);
            		System.out.printf("cms_uid=%s\n", new Long(doCMSText.getCMSUid()).toString());
            		System.out.printf("cms_title=%s\n",doCMSText.getCMSTitle());
            	}
            }		
        };
	}

}
