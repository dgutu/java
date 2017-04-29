/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.security.user.search.result;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.common.TemplarUtil;
import com.proximo.inci.component.AbstractInciComponent;
import com.proximo.inci.service.security.user.User;
import com.proximo.inci.service.security.user.UserSearchResult;
import com.proximo.inci.view.ViewKey;
import com.proximo.inci.view.security.user.detail.UserDetailView;
import com.proximo.inci.view.security.user.search.UserSearchView;
import com.proximo.inci.view.utils.CaseInsensitiveItemSorter;
import com.vaadin.data.Container;
import com.vaadin.data.util.AbstractBeanContainer;
import com.vaadin.data.util.IndexedContainer;
import com.vaadin.event.MouseEvents.ClickEvent;
import com.vaadin.event.MouseEvents.ClickListener;
import com.vaadin.terminal.ThemeResource;
import com.vaadin.ui.AbstractOrderedLayout;
import com.vaadin.ui.Embedded;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Table;
import com.vaadin.ui.Table.HeaderClickEvent;

@SuppressWarnings("serial")
public class SearchResultsTable extends AbstractInciComponent<Table> {

	private static Logger logger = LoggerFactory.getLogger(SearchResultsTable.class);
	
    private static final int COLUMN_COUNT = 7;
    private static final int TABLE_MARGIN = 10;
    private static final int OFFSET = 10;	
    private SearchResultsTableLayout parentLayout;

    public SearchResultsTable(SearchResultsTableLayout parentLayout) {
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
    private void initializeTable(UserSearchResult searchResult) {
        mainComponent.setSizeFull();
        mainComponent.addStyleName("user-search");
        //mainComponent.setSortDisabled(true);
        
        initializeTableColumns();
        useSearchResult(searchResult);
        
        // header custom sorting
        //addTableHeaderAction();    
        addMySort();
    }

    public void reInitialize(UserSearchResult searchResult) {
        build();
        initializeTable(searchResult);
    }

    private void initializeTableColumns() {    	
		int screenWidth = 1150;
		
		try {
	        screenWidth = ((com.vaadin.terminal.gwt.server.WebApplicationContext) parentLayout.getMainComponent()
	                .getApplication().getContext()).getBrowser().getScreenWidth();
	        logger.debug("user table screen width=" + screenWidth);
		}
	    catch(Exception ex) {screenWidth = 1150;}
        
        final int averageColumnWidth = (screenWidth - (TABLE_MARGIN + OFFSET) * 2) / COLUMN_COUNT;
        
        // col 1
        String usernameColumn = CaptionResolver.getCaption("view.security.user.search.table.column.userName");
        mainComponent.addContainerProperty(usernameColumn, String.class, null);
        mainComponent.setColumnWidth(usernameColumn, averageColumnWidth);
        
        // col 2
        String loginIdColumn = CaptionResolver.getCaption("view.security.user.search.table.column.login_id"); 
        mainComponent.addContainerProperty(loginIdColumn, String.class, null);
        mainComponent.setColumnWidth(loginIdColumn, averageColumnWidth);
        
        // col 3
        String companyColumn = CaptionResolver.getCaption("view.security.user.search.table.column.company"); 
        mainComponent.addContainerProperty(companyColumn , String.class, null);
        mainComponent.setColumnWidth(companyColumn, averageColumnWidth);
        
        // col 4
        String phoneColumn = CaptionResolver.getCaption("view.security.user.search.table.column.phone");
        mainComponent.addContainerProperty(phoneColumn,String.class, null);
        mainComponent.setColumnWidth(phoneColumn, averageColumnWidth);
        
        // col 5
        String emailColumn = CaptionResolver.getCaption("view.security.user.search.table.column.email");
        mainComponent.addContainerProperty(emailColumn, String.class, null);
        mainComponent.setColumnWidth(emailColumn, averageColumnWidth);
        
        // col 6 
        String activeColumn = CaptionResolver.getCaption("view.security.user.search.table.column.active");
        mainComponent.addContainerProperty(activeColumn, String.class, null);
        mainComponent.setColumnWidth(activeColumn, averageColumnWidth);
        
        // col 7
        String actionColumn = CaptionResolver.getCaption("view.security.user.search.table.column.actions"); 
        mainComponent.addContainerProperty(actionColumn, AbstractOrderedLayout.class, null);
        mainComponent.setColumnWidth(actionColumn, averageColumnWidth);
    }

    private void useSearchResult(UserSearchResult searchResult) {
    	int pageSize = 0;
    	
        for (int i = 0; i < searchResult.getUserList().size(); i++) {
            User user = searchResult.getUserList().get(i);

            mainComponent.addItem(new Object[] { user.getUserFullName(), user.getLoginId(),
                    user.getUserCompany().getCompanyName(), user.getPhone(), user.getEmail(),
                    user.isActive() ? "Y" : "N", createActionsLayout(user) }, i);
            
        pageSize++;    
        }
        
        mainComponent.setPageLength(pageSize + 1);
    }

    private HorizontalLayout createActionsLayout(final User user) {
        HorizontalLayout actionsLayout = new HorizontalLayout();

        Embedded viewPic = new Embedded(null, new ThemeResource("images/view.gif"));
        viewPic.addListener(new ClickListener() {
            @Override
            public void click(ClickEvent event) {
                UserSearchView parentView = parentLayout.getParentView();

                Map<String, Object> navigationParameterMap = new HashMap<String, Object>();
                navigationParameterMap.put(UserDetailView.USER_REC_ID_NAVIG_PARAM_KEY, user.getUserRecId());

                parentView.navigateTo(ViewKey.SCR_USER_DETAIL.toString(), navigationParameterMap, parentLayout.getParentView().getCurrentView());
            }
        });
        viewPic.addStyleName("cursor-pointer");
        actionsLayout.addComponent(viewPic);

        return actionsLayout;
    }
    
    /*private void addTableHeaderAction(){
        mainComponent.addListener(new Table.HeaderClickListener() {
			@Override
			public void headerClick(HeaderClickEvent event) {
				// search parameters
				UserSearchParams searchParams = parentLayout.getSearchParams();
				
				// column header 
				String columnHeader = event.getPropertyId().toString();
				
				//logger.debug("Archive.Header.columnHeader1="+columnHeader);
				
				// set order by 
				if (!TemplarUtil.isStringNullOrEmpty(columnHeader))
					searchParams.setOrderBy(columnHeader);
				
				//logger.debug("Archive.Header.columnHeader2="+columnHeader);
				
				// get user session
				HttpSession sess = ((com.vaadin.terminal.gwt.server.WebApplicationContext) parentLayout.getMainComponent()
		                .getApplication().getContext()).getHttpSession();	
				
				// column name 
				String columnName = (String) sess.getAttribute("columnName");
				
				// order asc or desc
				String orderBy = (String) sess.getAttribute("orderBy");
				
				//logger.debug("addTableHeaderAction.columnName="+columnName);
				//logger.debug("addTableHeaderAction.orderBy="+orderBy);
				
				
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
