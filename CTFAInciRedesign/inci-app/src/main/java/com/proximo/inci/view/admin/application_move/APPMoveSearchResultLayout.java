/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.admin.application_move;

import com.proximo.inci.DOList;
import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.common.TemplarUtil;
import com.proximo.inci.component.AbstractInciComponentLayout;
import com.proximo.inci.component.common.LabelComponent;
import com.proximo.inci.component.common.SpacingComponent;
import com.proximo.inci.service.security.SecurityService;
import com.proximo.inci.service.security.user.UserSearchParams;
import com.proximo.inci.service.security.user.UserSearchResult;
import com.proximo.inci.service.tradename.TradeNameService;
import com.vaadin.ui.AbstractLayout;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;
//import com.vaadin.ui.Window.Notification;

public class APPMoveSearchResultLayout extends AbstractInciComponentLayout<VerticalLayout> {

	protected APPMoveSearchView parentView;
	protected LabelComponent noMatchLabel;
    protected APPMoveSearchResult appMoveSearchResult;    
	protected HorizontalLayout layoutLinks;
	protected HorizontalLayout layoutMove;
	protected Button checkLink;
	protected Button uncheckLink;
	protected Label label;
	protected SpacingComponent space;
	protected TextField moveInput;
	protected Button moveBtn;
	protected Panel pn;
	
	
	public APPMoveSearchResultLayout(APPMoveSearchView parentView) {
		this.parentView = parentView;
		
		build();
	}
	
	@Override
	protected VerticalLayout createMainComponentInstance() {
		return new VerticalLayout();
	}

	@Override
	protected void init() {
        mainComponent.setSpacing(false);

        noMatchLabel = new LabelComponent("view.admin.app_move.no_match", "bold-text");
        appMoveSearchResult = new APPMoveSearchResult(this);
        
    	// initiate space
    	space = new SpacingComponent(10);
        
		// init check/uncheck links
    	layoutLinks = new HorizontalLayout();
    	layoutLinks.setSpacing(true);
    	
    	// elements
		checkLink = new Button("Select All");
		uncheckLink = new Button("Deselect All");
		label = new Label("/");
		checkLink.setStyleName("link");
		uncheckLink.setStyleName("link");
		checkLink.addListener(checkAll());
		uncheckLink.addListener(unCheckAll());
		
		// add check/uncheck links on the layout
		layoutLinks.addComponent(checkLink);		
		layoutLinks.addComponent(label);
		layoutLinks.addComponent(uncheckLink);				
		
    	// init move layout
    	layoutMove = new HorizontalLayout();
    	layoutMove.setSpacing(true);    	
		
		// init moveTextFiel and move Button
		moveInput = new TextField(CaptionResolver.getCaption("view.admin.app_move.search.search_form.move_input"));
		moveInput.setWidth("250px");
		moveBtn = new Button("Move");
		moveBtn.addListener(move());		
		
		// add move input and move button on the layout
		layoutMove.addComponent(moveInput);
		layoutMove.addComponent(space.getMainComponent());
		layoutMove.addComponent(moveBtn);
		layoutMove.setComponentAlignment(moveBtn, Alignment.BOTTOM_RIGHT);
		
        pn = new Panel();
        AbstractLayout panelLayout = (AbstractLayout) pn.getContent();
        panelLayout.setMargin(false);
        pn.setHeight("100%");
        pn.setWidth("100%");		
	}
	
	@Override
    protected void addContent() {
        /* Components will be added on search. */
    }

    // check all checkboxes from table result
	protected Button.ClickListener checkAll() {
        return new Button.ClickListener() {
			/**
			 * 
			 */
			private static final long serialVersionUID = -2040156342296956348L;

			@Override
            public void buttonClick(ClickEvent event) {
				appMoveSearchResult.checkUncheck(true);
            }
        };
    }

    // uncheck all checkboxes from table result
	protected Button.ClickListener unCheckAll() {
        return new Button.ClickListener() {
			/**
			 * 
			 */
			private static final long serialVersionUID = -4891571193976033900L;

			@Override
            public void buttonClick(ClickEvent event) {
				appMoveSearchResult.checkUncheck(false);
            }
        };
    }
	
    // move button
	protected Button.ClickListener move() {
    	return new Button.ClickListener() {
			
			/**
			 * 
			 */
			private static final long serialVersionUID = 9204549207433681926L;

			@Override
			public void buttonClick(ClickEvent event) {		
				// check if entered user is valid netforum user
				if (!TemplarUtil.isStringNullOrEmpty(moveInput.getValue().toString())) {
					
					//UserSearchResult searchResult = SecurityService.findUsersByLogonCompanyName(moveInput.getValue().toString(),"");
	                UserSearchParams searchParams = new UserSearchParams("", "", moveInput.getValue().toString());                
	                UserSearchResult searchResult = SecurityService.findUsers(searchParams);
					
					
					// because for webservice method to check user is used like for sql stat.
					// check here that the result is = 1, dont allow here to have multiple users					
					if (searchResult.getUserList().size() == 1) {
						//appMoveSearchResult.moveToNewUser(moveInput.getValue().toString());
						// call oracle SP to move trades to new user
						// pass CST_KEY of passed user in MOVE input field 
						appMoveSearchResult.moveToNewUser(searchResult.getUserList().get(0).getUserRecId().toString());
						
						// refresh the search layout after move
						// elements from APPMoveSearchForm class
						parentView.getAPPMoveSearchResultLayout().search(parentView.searchForm.getLogonField().getValue().toString(), // logon 
																		 parentView.searchForm.getCompanyName().getValue().toString(),  // company name
																		 parentView.searchForm.getApplicationNumber().getValue().toString(), // application number
																		 parentView.searchForm.getTradeName().getValue().toString(), // trade name
																		 false,
																		 "",
																		 1);
					}
					else {
						// invalid username entered
						parentView.showWarningMsg(CaptionResolver.getCaption("view.admin.app_move.search.search_form.invalid_move_user"));
					}
				}
				else {
					// invalid username entered
					// no data entered here 
					parentView.showWarningMsg(CaptionResolver.getCaption("view.admin.app_move.search.search_form.invalid_move_user"));
				}
			}
		};
	}
	
	public void search(String logon, String companyName, String appNumber, String tradeName, boolean setFragment, String orderBy, int ordering) {	
		StringBuilder cstKeyList = new StringBuilder();		
		
		// clear result
		clearSearchResults();
		
		// add Layout move button
		mainComponent.addComponent(layoutMove);
		mainComponent.setComponentAlignment(layoutMove, Alignment.BOTTOM_RIGHT);
		
		// add Layout check and uncheck links
		mainComponent.addComponent(layoutLinks);
		mainComponent.setComponentAlignment(layoutLinks, Alignment.BOTTOM_RIGHT);

		// check one space after check/uncheck links
		mainComponent.addComponent(space.getMainComponent());
		
		try
		{
			
        	/*
             * save URI
             */            
            if (setFragment) {            
            	String uriString = "~";
            	
            	if (!TemplarUtil.isStringNullOrEmpty(logon))
            		uriString += "logon=" + logon + "~";
            	
            	if (!TemplarUtil.isStringNullOrEmpty(companyName))
            		uriString += "comp=" + companyName + "~";

            	if (!TemplarUtil.isStringNullOrEmpty(appNumber))
            		uriString += "appno=" + appNumber + "~";

            	if (!TemplarUtil.isStringNullOrEmpty(tradeName))
            		uriString += "trade=" + tradeName + "~";
            	
            	
            	//TradeNameService.log("search.ADMIN_APP_MOVE_SEARCH|search|" + uriString);            
            	parentView.setFragment("ADMIN_APP_MOVE_SEARCH|search|" + uriString);
            }			
			
			// call netforum method to retrieve users cst_key
			UserSearchResult searchResult = null;
			if (!TemplarUtil.isStringNullOrEmpty(logon)) {
				//searchResult = SecurityService.findUsersByLogonCompanyName(logon,companyName);
				/* by Client the search should be done by publication company from DB */
				searchResult = SecurityService.findUsersByLogonCompanyName(logon,"");
				
			
				// create list string
				// cst_key,cst_key 
				// this list will be passed as parameter to get_trade_list, p_cst_key_list parameter
				for (int i=0; i<searchResult.getUserList().size();i++) {
					cstKeyList.append(searchResult.getUserList().get(i).getUserRecId().toString());
					cstKeyList.append(",");
				}
				
				if (TemplarUtil.isStringNullOrEmpty(cstKeyList.toString())) {
					mainComponent.addComponent(noMatchLabel.getMainComponent());
					// leave the function
					return;
				}						
			}			
			
			// call oracle SP to retrieve trades based on search parameters
			DOList list = TradeNameService.getTradeNameList(cstKeyList, appNumber, tradeName, companyName, orderBy, ordering);
			
	        // limit dataset
	        int rowLimit = 1000000; // unlimited
	        rowLimit = Integer.parseInt(CaptionResolver.getCaption("view.admin.cc_transactions_report.search.record_limit"));
			
			// if there data in ref cursor display on the page
			if (list.size() > 0 && list.size() < rowLimit) {				
				//appMoveSearchResult.reInitialize(list);	
	            //mainComponent.addComponent(appMoveSearchResult.getMainComponent());
	            appMoveSearchResult.reInitialize(list);
	            pn.addComponent(appMoveSearchResult.getMainComponent());
	            mainComponent.addComponent(pn);	            
	            
	        }
			// if result set > that record limit
	        else if (list.size() > 0 && list.size() > rowLimit) {
	        	parentView.showInfoMsgWindow(CaptionResolver.getCaption("view.admin.cc_transactions_report.search.validation.error.msg"));
	        }
	        else {
	        	// if no data in ref cursor display no match
	            mainComponent.addComponent(noMatchLabel.getMainComponent());
	        }		
		}
		catch (Exception ex) {
			throw new RuntimeException(ex);
		}		
	}    

    public void clearSearchResults() {
    	pn.removeAllComponents();
    	mainComponent.removeComponent(pn);    
    	mainComponent.removeComponent(noMatchLabel.getMainComponent());
        mainComponent.removeComponent(appMoveSearchResult.getMainComponent());
        mainComponent.removeComponent(layoutMove);
        mainComponent.removeComponent(layoutLinks);
    }
    
    public APPMoveSearchView getParentView() {
        return this.parentView;
    }

    public APPMoveSearchResult getSearchTable() {
        return this.appMoveSearchResult;
    }
    
    public TextField getMoveTextField() {
    	return this.moveInput;
    }
}
