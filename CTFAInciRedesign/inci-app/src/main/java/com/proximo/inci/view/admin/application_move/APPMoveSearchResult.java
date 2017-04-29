/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.admin.application_move;

import java.util.Iterator;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proximo.inci.DOList;
import com.proximo.inci.DOTradeName;
import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.common.TemplarUtil;
import com.proximo.inci.component.AbstractInciComponent;
import com.proximo.inci.service.security.SecurityService;
import com.proximo.inci.service.security.user.User;
import com.proximo.inci.service.security.user.UserSearchResult;
import com.proximo.inci.service.tradename.TradeNameService;
import com.proximo.inci.view.utils.CaseInsensitiveItemSorter;
import com.vaadin.data.Container;
import com.vaadin.data.Item;
import com.vaadin.data.util.AbstractBeanContainer;
import com.vaadin.data.util.IndexedContainer;
import com.vaadin.ui.AbstractOrderedLayout;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Table;
import com.vaadin.ui.Table.ColumnResizeEvent;
import com.vaadin.ui.Table.HeaderClickEvent;
import com.vaadin.ui.Window.Notification;
import com.vaadin.ui.TextField;

public class APPMoveSearchResult extends AbstractInciComponent<Table> {
	
	private APPMoveSearchResultLayout parentLayout;
	private static Logger logger = LoggerFactory.getLogger(APPMoveSearchResult.class);
	
    private static final int COLUMN_COUNT = 5;
    private static final int TABLE_MARGIN = 10;
    private static final int OFFSET = 10;	

	public APPMoveSearchResult(APPMoveSearchResultLayout parentLayout) {
		this.parentLayout = parentLayout;
		build();
	}
	
	@Override
	protected Table createMainComponentInstance() {
		return new Table();
	}

	@Override
	protected void init() {
	}
	
    /**
     * Not called in init(). Called whenever search is performed.
     */
    private void initializeTable(DOList searchResult) {
        mainComponent.setSizeFull();
        mainComponent.addStyleName("app-move-table");
        mainComponent.setSortDisabled(true);
        
        initializeTableColumns();
        useSearchResult(searchResult);
        //columnResizeTable();

        // header custom sorting
        //addTableHeaderAction();
        addMySort();
    }
    
    public void reInitialize(DOList searchResult) {
        build();
        initializeTable(searchResult);        
    }    
    
    private void initializeTableColumns() {
		int screenWidth = 1150;
		
		try {
	        screenWidth = ((com.vaadin.terminal.gwt.server.WebApplicationContext) parentLayout.getMainComponent()
	                .getApplication().getContext()).getBrowser().getScreenWidth();
		}
	    catch(Exception ex) {screenWidth = 1150;}
        
        final int averageColumnWidth = (screenWidth - (TABLE_MARGIN + OFFSET) * 2) / COLUMN_COUNT;    	
    	
        String logonCaption = CaptionResolver.getCaption("view.admin.app_move.search.search_form.table.result.logon");
        mainComponent.addContainerProperty(logonCaption,String.class, null);
        mainComponent.setColumnWidth(logonCaption, averageColumnWidth);
        
        String companyNameCaption = CaptionResolver.getCaption("view.admin.app_move.search.search_form.table.result.company_name");
        mainComponent.addContainerProperty(companyNameCaption,String.class, null);
        mainComponent.setColumnWidth(companyNameCaption, averageColumnWidth);
        
        String appNumberCaption = CaptionResolver.getCaption("view.admin.app_move.search.search_form.table.result.app_number");
        mainComponent.addContainerProperty(appNumberCaption,String.class, null);
        mainComponent.setColumnWidth(appNumberCaption, averageColumnWidth);
        
        String tradeNameCaption = CaptionResolver.getCaption("view.admin.app_move.search.search_form.table.result.trade_name");
        mainComponent.addContainerProperty(tradeNameCaption,String.class, null);        
        mainComponent.setColumnWidth(tradeNameCaption, averageColumnWidth);
        
        String actionCaption = CaptionResolver.getCaption("view.admin.app_move.search.search_form.table.result.action");
        mainComponent.addContainerProperty(actionCaption,AbstractOrderedLayout.class, null);       
        mainComponent.setColumnWidth(actionCaption, averageColumnWidth-80);
    }
    
    private void useSearchResult(DOList searchResult) {
        int pageSize = 0;
        
    	User user = null;
    	// get list of users from Netforum
        UserSearchResult users = SecurityService.getUsersByCstKey(SecurityService.getCstKeyListAppMv(searchResult));
        
        for (int i = 0; i < searchResult.size(); i++) {
        	DOTradeName trade = (DOTradeName) searchResult.elementAt(i);
        	
        	// get user information by CST_KEY from Netforum service
        	// if logon and company information is null from database
        	// when call netforum method
        	
        	/*if (!TemplarUtil.isStringNullOrEmpty(trade.userRecId)) { 
        		user = SecurityService.findUserByRecId(trade.userRecId);
        	}*/
        	
        	if (!TemplarUtil.isStringNullOrEmpty(trade.userRecId))	{
        		user = SecurityService.getUserByCstKey(users, trade.userRecId);
        	}        	
        	
            mainComponent.addItem(
                    new Object[] { (user != null && !TemplarUtil.isStringNullOrEmpty(user.getEmail())) ? user.getEmail() : trade.userRecId, // logon from netforum
                    		       //(user != null && !TemplarUtil.isStringNullOrEmpty(user.getUserCompany().getCompanyName())) ? user.getUserCompany().getCompanyName() : trade.compStmt,  // company name from netforum
                    			   trade.pubCompany.name,	
                    			   trade.tnNumber,  // tn_number from dabatase
                    			   trade.tradeName, // trade_name from database
                    			   createActionsLayout(trade) }, i);
            
            pageSize++;
        }
        
        mainComponent.setPageLength((int)pageSize*2);
    }
    
    // resize table columns
    @SuppressWarnings("unused")
	private void columnResizeTable() {
    	mainComponent.addListener(new Table.ColumnResizeListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 5728562448516246536L;

			@Override
			public void columnResize(ColumnResizeEvent event) {
				// Get the new width of the resized column
		        int width = event.getCurrentWidth();
		        
		        // Get the property ID of the resized column
		        String column = (String) event.getPropertyId();

		        // Do something with the information
		        mainComponent.setColumnFooter(column, String.valueOf(width) + "px");				
			}
		});
    	
    	// Must be immediate to send the resize events immediately
    	mainComponent.setImmediate(true);
    }

    private HorizontalLayout createActionsLayout(final DOTradeName trade) {
        HorizontalLayout actionsLayout = new HorizontalLayout();
        CheckBox checkBox = new CheckBox();
        checkBox.setValue(false);
        actionsLayout.addComponent(checkBox);      
        
        // add hidden textfield to keep CST_KEY value
    	// get user information by CST_KEY from Netforum service
    	//User user = SecurityService.findUserByRecId(trade.userRecId);
    	
    	/*TextField cstKey = new TextField();
        cstKey.setValue(user.getUserRecId().toString());
        cstKey.setVisible(false);
        cstKey.setWidth("1px");
        actionsLayout.addComponent(cstKey);*/
        
        // add hidden textfield to keep TN_REC_ID value
        TextField tnRecID = new TextField();
        tnRecID.setValue(trade.recID);
        tnRecID.setVisible(false);
        tnRecID.setWidth("1px");
        actionsLayout.addComponent(tnRecID);        
        
        return actionsLayout;
    }
    
    // check all checkboxes from table
    public void checkUncheck(Boolean checkValue) {
    	// caption of check box column
    	String actionCpation = CaptionResolver.getCaption("view.admin.app_move.search.search_form.table.result.action");
    	
    	// go through all table records
    	for (Iterator<?> i=mainComponent.getItemIds().iterator();i.hasNext();) {
    		int iid = (Integer) i.next();
    		
    		// next record in the table
    		Item item = mainComponent.getItem(iid);    		
    		try {
    			// layout from current record
    			HorizontalLayout actionsLayout = new HorizontalLayout();
    			
    			// get current horizontal layout from current record  
    			actionsLayout = (HorizontalLayout) item.getItemProperty(actionCpation).getValue();    			
    			
    			// go through all item on the layout
    			for (Iterator<?> iterator = actionsLayout.getComponentIterator();iterator.hasNext();) {
    				
    				// next object from the layout
    				// checkbox
    				Object object = iterator.next();
    				
    				// textfield rec_id
    				Object objectRecId = iterator.next();
    				
    				// check if object is CheckBox
    				if (object.getClass() == CheckBox.class) {    					
    					// create new checkBox 
    					CheckBox checkBox = (CheckBox) object;
    					
    					// change value of new check box
    					checkBox.setValue(checkValue);
    					
    					// new layout for new checkbox
    					HorizontalLayout newLayout = new HorizontalLayout();
    					newLayout.addComponent(checkBox);
    					
    			        // add hidden textfield to keep TN_REC_ID value
    			        TextField textField = (TextField) objectRecId;
    			        textField.setValue(((TextField) objectRecId).getValue().toString());
    			        textField.setVisible(false);
    			        textField.setWidth("1px");
    			        
    			        newLayout.addComponent(textField);
    					
    					// add new layout to the record table
    					item.getItemProperty(actionCpation).setValue(newLayout);
    				}	
    			}
    		} catch (Exception ex) {
    			
    			logger.debug(ex.getMessage());
    		}
    	}	
    }
    
    // get all check TN_REC_ID key from the table
    // method return the following list
    // TN_REC_ID,TN_REC_ID 
    protected StringBuilder getListToMove () {
    	StringBuilder list = new StringBuilder();
    	
    	// caption of action column
    	String actionCpation = CaptionResolver.getCaption("view.admin.app_move.search.search_form.table.result.action");
    	
    	// go through all table records
    	for (Iterator<?> i=mainComponent.getItemIds().iterator();i.hasNext();) {
    		int iid = (Integer) i.next();
    		
    		// next record in the table
    		Item item = mainComponent.getItem(iid);    		
    		try {
    			// layout from current record
    			HorizontalLayout actionsLayout = new HorizontalLayout();
    			
    			// get current horizontal layout from current record  
    			actionsLayout = (HorizontalLayout) item.getItemProperty(actionCpation).getValue();    			
    			
    			// go through all item on the layout
    			for (Iterator<?> iterator = actionsLayout.getComponentIterator();iterator.hasNext();) {
    				
    				// next object from the layout
    				Object object = iterator.next(); 
    				
    				// check if object is CheckBox
    				if (object.getClass() == CheckBox.class) {    					
    					// create new checkBox 
    					CheckBox checkBox = (CheckBox) object;
    					Boolean checkFlag = (Boolean)checkBox.getValue();
    					
    					// if check box is checked
    					if (checkFlag == true) {
    						// get TextField item from this layout
    						TextField tnRecIDField = (TextField) iterator.next();
    						
    						// append StringBuffer with checked tn_rec_id
    						list.append(tnRecIDField.getValue().toString());
    						list.append(",");
    						
    						// break the for loop on the current record layout
    						// and go to the next table record
    						break;
    					}    					
    				}	
    			}
    		} catch (Exception ex) {
    			
    			logger.debug(ex.getMessage());
    		}
    	}	
    	
    	return list;
    }    
    
    // oracle SP to move trades to new user
    public void moveToNewUser(String newUserCstKey) {
    	StringBuilder tnRecIdList = new StringBuilder(); 
    	
    	// get all check CST key from the table
    	tnRecIdList = getListToMove();
    	
    	//System.out.println(tnRecIdList.toString());
    	
    	// if no check boxes was cheked
    	if (!TemplarUtil.isStringNullOrEmpty(tnRecIdList.toString())) {
    		// call Oracle SP
    		//System.out.println(list.toString());
    		User currentUser = parentLayout.getParentView().getCurrentSecurityInfo().getUser();
    		
    		int rs = TradeNameService.moveTradesToNewUser(newUserCstKey, tnRecIdList, currentUser.getLoginId());
    		
    		// rs == 1 - no errors
    		if (rs == 1) {    			
    			mainComponent.getWindow().showNotification(CaptionResolver.getCaption("view.admin.app_move.search.search_form.moveBtn"), Notification.TYPE_HUMANIZED_MESSAGE);
    		}
    		else {
    			mainComponent.getWindow().showNotification("DB error, SP TRADE_NAME_MGMT.move_trades_to_new_user return: -1", Notification.TYPE_ERROR_MESSAGE);
    		}
    	}
    	else {
    		// please check trades to move
    		mainComponent.getWindow().showNotification(CaptionResolver.getCaption("view.admin.app_move.search.search_form.checkboxes_not_chk"), Notification.TYPE_ERROR_MESSAGE);
    	}
    		
    }
	
	public APPMoveSearchResultLayout getParentLayout() {
		return this.parentLayout;
	}

    /*private void addTableHeaderAction(){
        mainComponent.addListener(new Table.HeaderClickListener() {
			private static final long serialVersionUID = 1L;

			@Override
			public void headerClick(HeaderClickEvent event) {
				// search parameters
				//TradenameSearchParams searchParams = parentLayout.getSearchParams();
				
				// column header 
				String columnHeader = event.getPropertyId().toString();
				
				// set order by 
				//searchParams.setOrderBy(columnHeader);
				
				// get user session
				HttpSession sess = ((com.vaadin.terminal.gwt.server.WebApplicationContext) parentLayout.getMainComponent()
		                .getApplication().getContext()).getHttpSession();	
				
				// column name 
				String columnName = (String) sess.getAttribute("columnName");
				
				// order asc or desc
				String orderBy = (String) sess.getAttribute("orderBy");
				
				logger.debug("AppMoveSearch.addTableHeaderAction.columnName="+columnName);
				logger.debug("AppMoveSearch.addTableHeaderAction.orderBy="+orderBy);
				
				int ordering = 1;
				
				if (!TemplarUtil.isStringNullOrEmpty(columnName)) {					
					// if it's same column header
					if (columnName.equals(columnHeader)) {
						if (orderBy.equals("asc")) {
							ordering = 2;
							sess.setAttribute("orderBy", "desc");
						}
						else {
							ordering = 1;
							sess.setAttribute("orderBy", "asc");
						}
					}
					else {
						ordering = 1;
						sess.setAttribute("columnName", columnHeader);
						sess.setAttribute("orderBy", "asc");
					}
				}
				else {
					sess.setAttribute("columnName", columnHeader);
					sess.setAttribute("orderBy", "asc");		
				}				
				
				// search
				
				String logon = parentLayout.parentView.searchForm.getLogonField().getValue().toString();
				String comp = parentLayout.parentView.searchForm.getCompanyName().getValue().toString();
				String tn_number = parentLayout.parentView.searchForm.getApplicationNumber().getValue().toString();
				String trade_name = parentLayout.parentView.searchForm.getTradeName().getValue().toString();
				
				
				parentLayout.search(logon, comp, tn_number, trade_name, false, columnHeader, ordering);

			} 
		});
    }*/
	
    private void addMySort() {
    	mainComponent.addListener(new Table.HeaderClickListener() {
 			private static final long	serialVersionUID	= -2907064555268852268L;

			public void headerClick(HeaderClickEvent event) {
                String column = (String) event.getPropertyId();
                mySort(column);
			} });
        // Disable the default sorting behavior
    	mainComponent.setSortDisabled(true);
    }
    
    @SuppressWarnings("rawtypes")
	protected void mySort (String colName) {
    	
    	Container container = mainComponent.getContainerDataSource();      
    	  if (container instanceof IndexedContainer) {
    	    ((IndexedContainer) container).setItemSorter(new CaseInsensitiveItemSorter());
    	  } else if (container instanceof AbstractBeanContainer){
    	    ((AbstractBeanContainer) container).setItemSorter(new CaseInsensitiveItemSorter());
    	  }

		// get user session
		HttpSession sess = ((com.vaadin.terminal.gwt.server.WebApplicationContext) parentLayout.getMainComponent()
                .getApplication().getContext()).getHttpSession();	
		
		// column name 
		String columnName = (String) sess.getAttribute("columnName");
		
		// order asc or desc
		String orderBy = (String) sess.getAttribute("orderBy");
		
		int ordering = 1;

		if (!TemplarUtil.isStringNullOrEmpty(columnName)) {					
			// if it's same column header
			if (columnName.equals(colName)) {
				if (orderBy.equals("ascending")) {
					//searchParams.setOrdering(2);
					ordering = 2;
					sess.setAttribute("orderBy", "descending");
				}
				else {
					//searchParams.setOrdering(1);
					ordering = 1;
					sess.setAttribute("orderBy", "ascending");
				}
			}
			else {
				//searchParams.setOrdering(1);
				ordering = 1;
				sess.setAttribute("columnName", colName);
				sess.setAttribute("orderBy", "ascending");
			}
		}
		else {
			sess.setAttribute("columnName", colName);
			sess.setAttribute("orderBy", "ascending");		
		}			
		
		String names[] = {colName};
		boolean ascending[] = {true};    	  
		boolean descending[] = {false};
		mainComponent.setSortDisabled(false);
		mainComponent.setSortContainerPropertyId(colName);		
		
		if (ordering == 2)
			mainComponent.sort(names,descending);
		else
			mainComponent.sort(names,ascending);
		
		mainComponent.setSortDisabled(true);
    }   	
}
