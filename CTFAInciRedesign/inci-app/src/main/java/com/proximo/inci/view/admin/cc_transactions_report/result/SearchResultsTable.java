/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.admin.cc_transactions_report.result;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proximo.inci.DOCreditCardReport;
import com.proximo.inci.DOList;
import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.common.TemplarUtil;
import com.proximo.inci.component.AbstractInciComponent;
import com.proximo.inci.service.payment.CCTransactionsReportParams;
import com.proximo.inci.service.security.SecurityService;
import com.proximo.inci.service.security.user.User;
import com.proximo.inci.service.security.user.UserSearchResult;
import com.proximo.inci.view.utils.CaseInsensitiveItemSorter;
import com.vaadin.data.Container;
import com.vaadin.data.Property;
import com.vaadin.data.util.AbstractBeanContainer;
import com.vaadin.data.util.IndexedContainer;
import com.vaadin.ui.Table;
import com.vaadin.ui.Table.HeaderClickEvent;

public class SearchResultsTable extends AbstractInciComponent<Table> {
	
	private static Logger logger = LoggerFactory.getLogger(SearchResultsTable.class);
	private SearchResultsTableLayout parentLayout;
	
    private static final int COLUMN_COUNT = 10;
    private static final int TABLE_MARGIN = 95;
    
    // total of search result
    private double total = 0.0;
    
    // count for page length size
    int pageSize = 0;    
	
    public SearchResultsTable(SearchResultsTableLayout parentLayout) {
    	this.parentLayout = parentLayout;
        build();
    }

    @Override
    protected Table createMainComponentInstance() {
        return new Table()
        {
            /**
			 * 
			 */
			private static final long serialVersionUID = -8188804282068331981L;

			@Override
            protected String formatPropertyValue(Object rowId, Object colId, Property property) {
				
                // TDate field
                if (property.getType() == Date.class) {
                	SimpleDateFormat df = new SimpleDateFormat("dd MMMM yyyy");
                	try {
                		Date dt = (Date) property.getValue();
                		return df.format(dt);
                	}
                	catch(Exception ex) {
                		
                	}
                }

                return super.formatPropertyValue(rowId, colId, property);
            }        	
        };
    }

    @Override
    protected void init() {
    }

    /**
     * Not called in init(). Called whenever search is performed.
     */
    private void initializeTable(DOList searchResult) {
        mainComponent.setSizeFull();
        mainComponent.addStyleName("cc-transactions-report");
        //mainComponent.setSortDisabled(true);
        
        initializeTableColumns();
        useSearchResult(searchResult);  

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
	        
            logger.debug("############# SearchResultsTable.screenWidth="+screenWidth);
		}
	    catch(Exception ex) {}
		
		final int averageColumnWidth = (screenWidth - (TABLE_MARGIN * 2)) / COLUMN_COUNT;
		
		//logger.debug("############# averageColumnWidth="+averageColumnWidth);
		
		// transaction ID
        String transactionID = CaptionResolver.getCaption("view.admin.cc_transactions_report.table.column.transaction_id"); 
		mainComponent.addContainerProperty(transactionID, Integer.class, null);
        mainComponent.setColumnWidth(transactionID, averageColumnWidth);
        
        // transaction Date
        String transactionDt = CaptionResolver.getCaption("view.admin.cc_transactions_report.table.column.date"); 
        mainComponent.addContainerProperty(transactionDt, Date.class, null);
        mainComponent.setColumnWidth(transactionDt, averageColumnWidth);
        
        // username
        String username = CaptionResolver.getCaption("view.admin.cc_transactions_report.table.column.user_name"); 
        mainComponent.addContainerProperty(username, String.class,null);
        mainComponent.setColumnWidth(username, averageColumnWidth);
        
        // company name
        String companyName = CaptionResolver.getCaption("view.admin.cc_transactions_report.table.column.company_name");
        mainComponent.addContainerProperty(companyName, String.class, null);
        mainComponent.setColumnWidth(companyName, averageColumnWidth);
        
        // trade name
        String tradeName = CaptionResolver.getCaption("view.admin.cc_transactions_report.table.column.trade_name"); 
        mainComponent.addContainerProperty(tradeName, String.class, null);
        mainComponent.setColumnWidth(tradeName, averageColumnWidth);
        
        // company address
        String companyAddr = CaptionResolver.getCaption("view.admin.cc_transactions_report.table.column.address"); 
        mainComponent.addContainerProperty(companyAddr, String.class, null);
        mainComponent.setColumnWidth(companyAddr, averageColumnWidth);
        
        // user email
        String email = CaptionResolver.getCaption("view.admin.cc_transactions_report.table.column.email");
        mainComponent.addContainerProperty(email, String.class, null);
        mainComponent.setColumnWidth(email, averageColumnWidth);
        
        // name on card
        String nameOnCard = CaptionResolver.getCaption("view.admin.cc_transactions_report.table.column.name_on_card"); 
        mainComponent.addContainerProperty(nameOnCard, String.class, null);
        mainComponent.setColumnWidth(nameOnCard, averageColumnWidth);
        
        // card type
        String cardType = CaptionResolver.getCaption("view.admin.cc_transactions_report.table.column.card_type");
        mainComponent.addContainerProperty(cardType, String.class, null);
        mainComponent.setColumnWidth(cardType, averageColumnWidth);
        
        // amount
        String amount = CaptionResolver.getCaption("view.admin.cc_transactions_report.table.column.amount");
        mainComponent.addContainerProperty(amount, String.class, null);
        mainComponent.setColumnWidth(amount, averageColumnWidth);
    }

    private void useSearchResult(DOList searchResult) {
    	// reset pageSize
    	pageSize = 0;
    	
        for (int i = 0; i < searchResult.size(); i++) {
            DOCreditCardReport ccTransaction = (DOCreditCardReport) searchResult.elementAt(i);
            

            mainComponent.addItem(
                    new Object[] { 
                    				ccTransaction.CCPNRef, 
                    				//ccTransaction.transactionDate.formatIt(TDate.DDMONTHYYYY),
                    				ccTransaction.transactionDate.getUtilDate(),
                    				ccTransaction.ccUserFullName, 
                    				ccTransaction.publicationCompany,
                    				ccTransaction.tradeName, 
                    				//ccTransaction.ccUserAddress, 
                    				ccTransaction.publicationCompanyAddr,
                    				ccTransaction.ccUserEmail,
                    				ccTransaction.formatCCLastFirstName(), 
                    				ccTransaction.ccTypeValue,
                    				TemplarUtil.formatCurrency(ccTransaction.transactionAmount , 2)                    				
                    			 }, i);
	            
            // count pageSize
            pageSize++;
        } // end of for
        
        mainComponent.setPageLength(pageSize+1);        
    }    

    private static String getAddressStr(User user) {
        String addressString = "";

        if (!TemplarUtil.isStringNullOrEmpty(user.getUserCompany().getAddress1())) {
            addressString += user.getUserCompany().getAddress1() + " ";
        }

        if (!TemplarUtil.isStringNullOrEmpty(user.getUserCompany().getAddress2())) {
            addressString += user.getUserCompany().getAddress2() + " ";
        }

        if (!TemplarUtil.isStringNullOrEmpty(user.getUserCompany().getAddress3())) {
            addressString += user.getUserCompany().getAddress3() + " ";
        }
        
        if (!TemplarUtil.isStringNullOrEmpty(user.getUserCompany().getCity())) {
        	addressString += user.getUserCompany().getCity();
        }
        
        if (!TemplarUtil.isStringNullOrEmpty(user.getUserCompany().getStateOrProvince())) {
        	addressString += ", " + user.getUserCompany().getStateOrProvince();
        }        

        return addressString;
    }
    
    public double getTotal() {
    	return total;
    }
    
    public int getPageSize() {
    	return this.pageSize;
    }
    
    public DOList ccTransactionReport(DOList searchResult) {
        // get user information from netforum
        User user = null;
        
        // search parameters 
        @SuppressWarnings("unused")
		CCTransactionsReportParams ccSearchParams = parentLayout.getCCSearchParams();
        
        // flag to show result in table layout
        //boolean showRecord = false;
        
        // reset count for page length size
        pageSize = 0;
        
        // reset total for each search
        total = 0.0;
        
        // result set        
        DOList resultSet = new DOList();
        
        // CC transaction added to resultSet
        DOCreditCardReport ccTransactionResult;
        
        // get userMap cstKey = logon (email) from netforum
        if (searchResult.size() > 0) {        	
        	UserSearchResult users = SecurityService.getUsersByCstKey(SecurityService.getCstKeyListCC(searchResult));
        	
        	// go on database result
            for (int i = 0; i < searchResult.size(); i++) {
            	
            	// reset default value for showRecord, for each new record in the result set
            	//showRecord = false;
            	
                DOCreditCardReport ccTransaction = (DOCreditCardReport) searchResult.elementAt(i);                
                
                // check for logon and companyName
                /*if (TemplarUtil.isStringNullOrEmpty(ccSearchParams.getLogon())) {
                	showRecord = true;
                }
                else if (!TemplarUtil.isStringNullOrEmpty(ccSearchParams.getLogon())) {
                	// if cstKey from database is not null
                	if (!TemplarUtil.isStringNullOrEmpty(ccTransaction.cstKey))	{
                		
                		// get user by cstKey from user list returned from netforum
                		user = SecurityService.getUserByCstKey(users, ccTransaction.cstKey);
                		
                		// show the record if user email contains logon string from user search form
                		if (user != null && !TemplarUtil.isStringNullOrEmpty(user.getEmail()) && 
                				user.getEmail().toUpperCase().contains(ccSearchParams.getLogon().toUpperCase())) {
                			showRecord = true;
                		}	
                	}
                }*/          	
                	
                // add record on table layout
                //if (showRecord) {
            	// new cc Transaction
            	ccTransactionResult = ccTransaction;
            	
            	if (!TemplarUtil.isStringNullOrEmpty(ccTransaction.cstKey))	{
            		user = SecurityService.getUserByCstKey(users, ccTransaction.cstKey);
            	}
            	
            	ccTransactionResult.ccUserFullName = (user != null ? user.getUserFullName() : "");
            	ccTransactionResult.ccUserAddress = (user != null ? getAddressStr(user) : "");            	
            	ccTransactionResult.ccUserEmail = (user != null ? user.getEmail() : "");            	
            	
            	// add to DOList				
            	resultSet.addElement(ccTransactionResult);
	            
	            // increment pageSize
	            pageSize++;
	            
	            // sum total
	            total += ccTransaction.transactionAmount;
                //}
                
            } // end of for
            
        } // end if searchResult.size() > 0    
        
        return  resultSet;   
    }

    /*private void addTableHeaderAction(){
        mainComponent.addListener(new Table.HeaderClickListener() {
			@Override
			public void headerClick(HeaderClickEvent event) {
				// search parameters
				CCTransactionsReportParams searchParams = parentLayout.getCCSearchParams();
				
				// column header 
				String columnHeader = event.getPropertyId().toString();
				
				// set order by 
				searchParams.setOrderBy(columnHeader);
				
				// get user session
				HttpSession sess = ((com.vaadin.terminal.gwt.server.WebApplicationContext) parentLayout.getMainComponent()
		                .getApplication().getContext()).getHttpSession();	
				
				// column name 
				String columnName = (String) sess.getAttribute("columnName");
				
				// order asc or desc
				String orderBy = (String) sess.getAttribute("orderBy");
				
				logger.debug("addTableHeaderAction.columnName="+columnName);
				logger.debug("addTableHeaderAction.orderBy="+orderBy);
				
				
				if (!TemplarUtil.isStringNullOrEmpty(columnName)) {					
					// if it's same column header
					if (columnName.equals(columnHeader)) {
						if (orderBy.equals("asc")) {
							searchParams.setOrdering(2);
							sess.setAttribute("orderBy", "desc");
						}
						else {
							searchParams.setOrdering(1);
							sess.setAttribute("orderBy", "asc");
						}
					}
					else {
						searchParams.setOrdering(1);
						sess.setAttribute("columnName", columnHeader);
						sess.setAttribute("orderBy", "asc");
					}
				}
				else {
					sess.setAttribute("columnName", columnHeader);
					sess.setAttribute("orderBy", "asc");		
				}				
				
				// search
				parentLayout.search(searchParams, false);
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
