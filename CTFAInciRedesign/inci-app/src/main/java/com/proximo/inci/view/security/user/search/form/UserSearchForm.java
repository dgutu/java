/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.security.user.search.form;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proximo.inci.common.TemplarUtil;
import com.proximo.inci.component.AbstractInciComponentLayout;
import com.proximo.inci.service.security.user.UserSearchParams;
import com.proximo.inci.view.security.user.search.UserSearchView;
import com.vaadin.ui.VerticalLayout;

public class UserSearchForm extends AbstractInciComponentLayout<VerticalLayout> {

    private static Logger logger = LoggerFactory.getLogger(UserSearchForm.class);

    private UserSearchView parentView;

    private SearchFieldsLayout searchFieldsLayout;
    private ActionButtonsLayout actionButtonsLayout;

    public UserSearchForm(UserSearchView parentView) {
        this.parentView = parentView;

        build();
    }

    @Override
    protected VerticalLayout createMainComponentInstance() {
        return new VerticalLayout();
    }

    @Override
    protected void init() {
        mainComponent.addStyleName("grayBackgroundColor");
        mainComponent.addStyleName("roundedCorners");

        searchFieldsLayout = new SearchFieldsLayout();
        actionButtonsLayout = new ActionButtonsLayout(this);
    }

    @Override
    protected void addContent() {
        addComponent(searchFieldsLayout);
        addComponent(actionButtonsLayout);
    }

    public void clearSearchFields() {
        searchFieldsLayout.clear();
    }
    
    public UserSearchParams fillSearchParams() {
        String lastName = searchFieldsLayout.getLastNameFieldValue();
        if ("".equals(lastName)) {
            lastName = null;
        }
        String firstName = searchFieldsLayout.getFirstNameFieldValue();
        if ("".equals(firstName)) {
            firstName = null;
        }      
        String loginId = searchFieldsLayout.getLoginIdFieldValue();
        if ("".equals(loginId)) {
            loginId = null;
        }         
        
        return new UserSearchParams(lastName, firstName, loginId);
    }

    public UserSearchView getParentView() {
        return parentView;
    }

	public void fillSearchFom(UserSearchParams searchParam) {
		try {
			
			// clear search form
			searchFieldsLayout.clear();	
			
			// lastname
	        if (!TemplarUtil.isStringNullOrEmpty(searchParam.getLastName()))
	        	searchFieldsLayout.setLastNameFieldValue(searchParam.getLastName());
	        
			// firstname
	        if (!TemplarUtil.isStringNullOrEmpty(searchParam.getFirstName()))
	        	searchFieldsLayout.setFirstNameFieldValue(searchParam.getFirstName());
	        
			// login
	        if (!TemplarUtil.isStringNullOrEmpty(searchParam.getLoginId()))
	        	searchFieldsLayout.setLoginIdFieldValue(searchParam.getLoginId());
		}
		catch (Exception ex) {
			logger.error("TradeNameSearchForm.fillSearchFom: " + ex.getMessage());
		}
	}

}
