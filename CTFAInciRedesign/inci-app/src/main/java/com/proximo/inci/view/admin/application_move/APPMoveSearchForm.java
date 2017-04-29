/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.admin.application_move;

import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.component.AbstractInciComponentLayout;
import com.proximo.inci.component.common.SpacingComponent;
import com.proximo.inci.component.util.ComponentUtil;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

public class APPMoveSearchForm extends AbstractInciComponentLayout<VerticalLayout> {

	// local variable
	private APPMoveSearchView parentView;
	
	private TextField logon;
	private TextField companyName;
	private TextField appNumber;
	private TextField tradeName;
	
	private SpacingComponent space;
	private HorizontalLayout btnLayout;
	private Button searchBtn;
	private Button clearBtn;
	
	public APPMoveSearchForm(APPMoveSearchView parentView) {
		this.parentView = parentView;
		
		build();
	}
	
	@Override
	protected VerticalLayout createMainComponentInstance() {
		return new VerticalLayout();
	}

	@Override
	protected void init() {
        mainComponent.setSpacing(true);
        mainComponent.setMargin(true);
        
        mainComponent.addStyleName("grayBackgroundColor");
        mainComponent.addStyleName("roundedCorners");
        
        mainComponent.setWidth("600px");		
        
        logon = new TextField(CaptionResolver.getCaption("view.admin.app_move.search.search_form.logon"),"");
        companyName = new TextField(CaptionResolver.getCaption("view.admin.app_move.search.search_form.company_name"),"");
        appNumber = new TextField(CaptionResolver.getCaption("view.admin.app_move.search.search_form.app_number"),"");
        tradeName = new TextField(CaptionResolver.getCaption("view.admin.app_move.search.search_form.trade_name"),"");    
        
        logon.setWidth("200px");
        companyName.setWidth("200px");
        appNumber.setWidth("200px");
        tradeName.setWidth("200px");        
        
		// initiate space
		space = new SpacingComponent(10);
		
		// initiate btn Layout
		btnLayout = new HorizontalLayout();			
		
		// initiate save button
		searchBtn = ComponentUtil.createActionButton("search", searchBtnListener());
		clearBtn = ComponentUtil.createActionButton("clear", clearBtnListener());
		
		btnLayout.addComponent(searchBtn);
		btnLayout.addComponent(clearBtn);				
	}	
	
	@Override
	protected void addContent() {
		// add logon on main view
		mainComponent.addComponent(logon);
		mainComponent.addComponent(space.getMainComponent());
		
		// add company name on main view
		mainComponent.addComponent(companyName);
		mainComponent.addComponent(space.getMainComponent());
		
		// add application number on main view
		mainComponent.addComponent(appNumber);
		mainComponent.addComponent(space.getMainComponent());
		
		// add trade name on main view
		mainComponent.addComponent(tradeName);
		mainComponent.addComponent(space.getMainComponent());		

		// add search & clear buttons on main view
		btnLayout.addComponent(searchBtn);
		btnLayout.addComponent(clearBtn);
		
		mainComponent.addComponent(btnLayout);
		mainComponent.setComponentAlignment(btnLayout, Alignment.MIDDLE_RIGHT);
		
		// focus cursor into textarea
		logon.focus();
	}
	
	// search button
	protected Button.ClickListener searchBtnListener() {
        return new Button.ClickListener() {
			/**
			 * 
			 */
			private static final long serialVersionUID = -7341442907624481769L;

			@Override
            public void buttonClick(ClickEvent event) {
				String logonStr = logon.getValue().toString();
				String companyNameStr = companyName.getValue().toString();
				String appNumberStr = appNumber.getValue().toString();
				String tradeNameStr = tradeName.getValue().toString();
				
				if (logonStr.equals("") && companyNameStr.equals("") && appNumberStr.equals("") && tradeNameStr.equals("")) {
					parentView.showWarningMsg(CaptionResolver.getCaption("view.admin.app_move.search.search_form.wrgmsg"));
				}
				else {
					parentView.getAPPMoveSearchResultLayout().search(logonStr, companyNameStr, appNumberStr, tradeNameStr, true, "", 1);
				}
            }
        };
    }

	// clear button
	protected Button.ClickListener clearBtnListener() {
        return new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = -60121211548130401L;

			@Override
            public void buttonClick(ClickEvent event) {
				// clear current form
				clearForm();
				//parentView.getAPPMoveSearchResultLayout().getSearchTable().checkUncheck();
            }
        };
    }

	public APPMoveSearchView getParentView() {
		return this.parentView;
	}
	
	public TextField getLogonField() {
		return this.logon;		
	}
	
	public TextField getCompanyName() {
		return this.companyName;
	}
	
	public TextField getApplicationNumber() {
		return this.appNumber;
	}
	
	public TextField getTradeName() {
		return this.tradeName;
	}
	
	public void clearForm() {
		this.logon.setValue("");
		this.companyName.setValue("");
		this.appNumber.setValue("");
		this.tradeName.setValue("");
		
		// clear move input textfield
		parentView.searchResultLayout.getMoveTextField().setValue("");
		parentView.searchResultLayout.clearSearchResults();
	}
}
