/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.archive.search.table;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proximo.inci.DOList;
import com.proximo.inci.DOTradeName;
import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.common.TDate;
import com.proximo.inci.common.TemplarUtil;
import com.proximo.inci.component.AbstractInciComponent;
import com.proximo.inci.view.utils.CaseInsensitiveItemSorter;
import com.vaadin.data.Container;
import com.vaadin.data.Property;
import com.vaadin.data.util.AbstractBeanContainer;
import com.vaadin.data.util.IndexedContainer;
import com.vaadin.ui.AbstractOrderedLayout;
import com.vaadin.ui.Table;
import com.vaadin.ui.Table.HeaderClickEvent;

@SuppressWarnings("serial")
public class SearchResultsTable extends AbstractInciComponent<Table> {

	@SuppressWarnings("unused")
	private static Logger logger = LoggerFactory.getLogger(SearchResultsTable.class);
	
	private static final int COLUMN_COUNT = 9;
    private static final int TABLE_MARGIN = 10;

    private SearchResultsTableLayout parentLayout;
    
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
                	SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
                	try {
                		Date dt = (Date) property.getValue();
                		return (dt != null ? df.format(dt) : " ");
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
        mainComponent.addStyleName("tradename-archive-search");
        mainComponent.setSortDisabled(true);
        initializeTableColumns();

        mainComponent.setCellStyleGenerator(createCellStyleGenerator());

        useSearchResult(searchResult);
        
        // header custom sorting
        //addTableHeaderAction();
        addMySort();
    }

    private Table.CellStyleGenerator createCellStyleGenerator() {
        return new Table.CellStyleGenerator() {
            public String getStyle(Object itemId, Object propertyId) {
                return "";
            }
        };
    }

    private void initializeTableColumns() {
    	int screenWidth = 1150;
    	
    	try {
    		screenWidth = ((com.vaadin.terminal.gwt.server.WebApplicationContext) parentLayout.getMainComponent()
                .getApplication().getContext()).getBrowser().getScreenWidth();
    	} catch(Exception ex) {screenWidth = 1150;}
        
        final int averageColumnWidth = (screenWidth - TABLE_MARGIN * 2) / COLUMN_COUNT;

        mainComponent.addContainerProperty(
                CaptionResolver.getCaption("view.trade_name.archive.search.table.column.submit_date"), Date.class,
                null);
        mainComponent.addContainerProperty(
                CaptionResolver.getCaption("view.trade_name.archive.search.table.column.application_no"), String.class,
                null);

        String tradeNameColumnCaption = CaptionResolver
                .getCaption("view.trade_name.archive.search.table.column.trade_name");
        mainComponent.addContainerProperty(tradeNameColumnCaption, String.class, null);
        mainComponent.setColumnWidth(tradeNameColumnCaption, averageColumnWidth);

        mainComponent.addContainerProperty(
                CaptionResolver.getCaption("view.trade_name.archive.search.table.column.category"), String.class, null);

        String companyNameColumnCaption = CaptionResolver
                .getCaption("view.trade_name.archive.search.table.column.company_name");
        mainComponent.addContainerProperty(companyNameColumnCaption, String.class, null);
        mainComponent.setColumnWidth(companyNameColumnCaption, averageColumnWidth);

        String exportDateColumnCaption = CaptionResolver
                .getCaption("view.trade_name.archive.search.table.column.export_date");
        mainComponent.addContainerProperty(exportDateColumnCaption, Date.class, null);
        mainComponent.setColumnWidth(exportDateColumnCaption, averageColumnWidth);

        String inciNameColumnCaption = CaptionResolver
                .getCaption("view.trade_name.archive.search.table.column.inci_name");
        mainComponent.addContainerProperty(inciNameColumnCaption, String.class, null);
        mainComponent.setColumnWidth(inciNameColumnCaption, screenWidth / COLUMN_COUNT);

        mainComponent.addContainerProperty(
                CaptionResolver.getCaption("view.trade_name.archive.search.table.column.attachments"), String.class,
                null);
        mainComponent.addContainerProperty(
                CaptionResolver.getCaption("view.trade_name.archive.search.table.column.actions"),
                AbstractOrderedLayout.class, null);
    }

    public void reInitialize(DOList searchResult) {
        build();
        initializeTable(searchResult);
    }

    private void useSearchResult(DOList searchResult) {
        int pageSize = 0;

        for (int i = 0; i < searchResult.size(); i++) {
            DOTradeName formTn = (DOTradeName) searchResult.elementAt(i);

            mainComponent.addItem(new Object[] 
            		{ 
            			//convertSumbitDateToCol(formTn.submitDt), 
            		    formTn.submitDt.getUtilDate(),
            			formTn.tnNumber,
            			formTn.tradeName, 
            			String.valueOf(formTn.catName), 
            			convertCompany(formTn.pubCompany.name),
            			//convertTDateToCol(formTn.exportDt), 
            			formTn.exportDt.getUtilDate(),
            			formTn.inciName, formTn.hasAttachments ? "Y" : "N",
            			parentLayout.getParentView().createRowActionsLayout(formTn) 
            		}, i);
        pageSize++;    
        }
        mainComponent.setPageLength((int) (pageSize*2));
    }
    
    /*private void addTableHeaderAction(){
        mainComponent.addListener(new Table.HeaderClickListener() {
			@Override
			public void headerClick(HeaderClickEvent event) {
				// search parameters
				TradenameArchiveSearchParams searchParams = parentLayout.getSearchParams();
				
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
				parentLayout.search(searchParams);
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

    @SuppressWarnings("unused")
	private static String convertSumbitDateToCol(TDate submitDt) {
        return (submitDt == null || submitDt.isNull()) ? "--" : submitDt.formatIt(6);
    }

    private static String convertCompany(String company) {
        return (company.equals("")) ? "--" : company;
    }

    @SuppressWarnings("unused")
	private String convertTDateToCol(TDate tDate) {
        String result;

        if (tDate.isNull()) {
            result = "";
        } else {
            result = TDate.convertTDateToCol(tDate);
        }

        return result;
    }

}
