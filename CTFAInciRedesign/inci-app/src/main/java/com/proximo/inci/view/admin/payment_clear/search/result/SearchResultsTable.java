/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.admin.payment_clear.search.result;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proximo.inci.DOList;
import com.proximo.inci.DOUserPayment;
import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.common.TemplarUtil;
import com.proximo.inci.component.AbstractInciComponent;
//import com.proximo.inci.service.payment.PaymentClearSearchParams;
import com.proximo.inci.view.admin.payment_clear.detail.AbstractPaymentClearDetailView;
import com.proximo.inci.view.admin.payment_clear.search.AbstractPaymentClearSearchView;
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

	@SuppressWarnings("unused")
	private static Logger logger = LoggerFactory.getLogger(SearchResultsTable.class);
	
    private SearchResultsTableLayout parentLayout;
    private String tradeNumber;

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
    private void initializeTable(DOList searchResult) {
        mainComponent.setSizeFull();
        mainComponent.addStyleName("payment-clear-search");
        mainComponent.setSortDisabled(true);
        
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
        mainComponent.addContainerProperty(
                CaptionResolver.getCaption("view.admin.payment_clearing.search.table.column.app_no"), String.class,
                null);
        mainComponent.addContainerProperty(
                CaptionResolver.getCaption("view.admin.payment_clearing.search.table.column.trade_name"), String.class,
                null);
        mainComponent.addContainerProperty(
                CaptionResolver.getCaption("view.admin.payment_clearing.search.table.column.actions"),
                AbstractOrderedLayout.class, null);
    }

    private void useSearchResult(DOList searchResult) {
    	// reset pagesize
    	int pageSize = 0;

        for (int i = 0; i < searchResult.size(); i++) {
            DOUserPayment userPayment = (DOUserPayment) searchResult.elementAt(i);

            mainComponent.addItem(new Object[] { userPayment.trade_number, userPayment.trade_name,
                    createActionsLayout(userPayment) }, i);
            
            // keep tradeNumber to diplay on Check Clearing Detail page
            this.tradeNumber = userPayment.trade_number;
            
            pageSize++;
        }
        
        mainComponent.setPageLength(pageSize+1);
    }

    private HorizontalLayout createActionsLayout(final DOUserPayment userPayment) {
        HorizontalLayout actionsLayout = new HorizontalLayout();

        Embedded editPic = new Embedded(null, new ThemeResource("images/edit.gif"));
        editPic.addListener(new ClickListener() {
            @Override
            public void click(ClickEvent event) {
                AbstractPaymentClearSearchView parentView = parentLayout.getParentView();                
                
                Map<String, Object> parameters = new HashMap<String, Object>();                
                parameters.put(AbstractPaymentClearDetailView.PAYMENT_REC_ID_NAVIG_PARAM_KEY, userPayment.payment_method_id);
                parameters.put(AbstractPaymentClearDetailView.TN_REC_ID_NAVIG_PARAM_KEY, userPayment.tn_rec_id);
                parameters.put(AbstractPaymentClearDetailView.TRADE_NUMBER, userPayment.trade_number);
                parentView.navigateTo(parentView.getDetailViewKey().toString(), parameters, parentView.getCurrentView());
            }
        });
        editPic.addStyleName("cursor-pointer");
        actionsLayout.addComponent(editPic);

        return actionsLayout;
    }
    
    public String getTradeNumber() {
    	return this.tradeNumber;
    }
    
    /*private void addTableHeaderAction(){
        mainComponent.addListener(new Table.HeaderClickListener() {
			@Override
			public void headerClick(HeaderClickEvent event) {
				// search parameters
				PaymentClearSearchParams searchParams = parentLayout.getSearchParams();
				
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
				
				logger.debug("PaymentClear.addTableHeaderAction.columnName="+columnName);
				logger.debug("PaymentClear.addTableHeaderAction.orderBy="+orderBy);
				
				
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
