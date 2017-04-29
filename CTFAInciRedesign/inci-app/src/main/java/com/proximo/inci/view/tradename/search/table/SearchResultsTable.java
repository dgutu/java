/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.search.table;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proximo.inci.DOTradeName;
import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.common.TDate;
import com.proximo.inci.common.TemplarUtil;
import com.proximo.inci.component.AbstractInciComponent;
import com.proximo.inci.component.util.ComponentUtil;
import com.proximo.inci.service.tradename.TradeNameSearchResult;
import com.proximo.inci.view.ViewKey;
import com.proximo.inci.view.tradename.detail.TradeNameDetailView;
import com.proximo.inci.view.tradename.detail.mode.TradeNameDetailViewMode;
import com.proximo.inci.view.tradename.search.TradeNameSearchView;
import com.proximo.inci.view.tradename.search.params.TradenameSearchParams;
import com.vaadin.data.Property;
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
    
    //private static final int COLUMN_COUNT = 11;
    private static final int TABLE_MARGIN = 10;
    private static final int OFFSET = 10;

    private SearchResultsTableLayout parentLayout;

    private TradeNameSearchResult searchResult;

    public SearchResultsTable(SearchResultsTableLayout parentLayout) {
        this.parentLayout = parentLayout;

        build();
    }
    
    @Override
    protected Table createMainComponentInstance() {
        return new Table()
        {
            private static final long serialVersionUID = -8188804282068331981L;

            /**
             * format Table column header 
             */         
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
    private void initializeTable(TradeNameSearchResult searchList) {
        mainComponent.setSizeFull();
        mainComponent.addStyleName("tradename-search");
        mainComponent.setSortDisabled(true);
        initializeTableColumns();
        setSearchResult(searchList);
        useSearchResult(); 

        mainComponent.setCellStyleGenerator(createCellStyleGenerator());
        
        // header custom sorting
        addTableHeaderAction();
    }
    
    private Table.CellStyleGenerator createCellStyleGenerator() {
        return new Table.CellStyleGenerator() {
            public String getStyle(Object itemId, Object propertyId) {
                int id = ((Integer) itemId).intValue();
                DOTradeName formTN = (DOTradeName) searchResult.getTnList().elementAt(id);

                if (formTN.onHoldForACH) {
                    return "onhold-forach-bg-color";
                }

                if (formTN.onHold) {
                    return "onhold-bg-color";
                }

                if (formTN.hasOutstdComments) {
                    if (formTN.hasUserResponded) {
                        return "respond-bg-color";
                    } else {
                        return "unclosed-bg-color";
                    }
                }

                return "";
            }
        };        
    }
    
    private void initializeTableColumns() {         
            int screenWidth = 1150;
            int columnCount = 10;
            
            try {
                screenWidth = ((com.vaadin.terminal.gwt.server.WebApplicationContext) parentLayout.getMainComponent()
                        .getApplication().getContext()).getBrowser().getScreenWidth();
            }
            catch(Exception ex) {screenWidth = 1150;}
            
            if (parentLayout.getParentView().getMainWindow().getCurrentSecurityInfo().getUser().isAdmin()) {
                columnCount = 11;
            }
            
            final int averageColumnWidth = (screenWidth - (TABLE_MARGIN + OFFSET) * 2) / columnCount;
            
            mainComponent.addContainerProperty(CaptionResolver.getCaption("tradeName.search.table.column.submitDate"),
                    Date.class, null);
            mainComponent.addContainerProperty(CaptionResolver.getCaption("tradeName.search.table.column.applicationNo"),
                    String.class, null);
    
            String tradeNameColumnCaption = CaptionResolver.getCaption("tradeName.search.table.column.tradeName");
            mainComponent.addContainerProperty(tradeNameColumnCaption, String.class, null);
            mainComponent.setColumnWidth(tradeNameColumnCaption, averageColumnWidth);
    
            String categoryColumnCaption = CaptionResolver.getCaption("tradeName.search.table.column.category");
            mainComponent.addContainerProperty(categoryColumnCaption, String.class, null);
            mainComponent.setColumnWidth(categoryColumnCaption, averageColumnWidth);            
    
            String companyNameColumnCaption = CaptionResolver.getCaption("tradeName.search.table.column.companyName");
            mainComponent.addContainerProperty(companyNameColumnCaption, String.class, null);
            mainComponent.setColumnWidth(companyNameColumnCaption, averageColumnWidth);
    
            String staffReviewDateColumnCaption = CaptionResolver
                    .getCaption("tradeName.search.table.column.staffReviewDate");
            mainComponent.addContainerProperty(staffReviewDateColumnCaption, Date.class, null);
            mainComponent.setColumnWidth(staffReviewDateColumnCaption, averageColumnWidth);
    
            String anticipatedReviewDateColumnCaption = CaptionResolver
                    .getCaption("tradeName.search.table.column.anticipatedReviewDate");
            mainComponent.addContainerProperty(anticipatedReviewDateColumnCaption, Date.class, null);
            mainComponent.setColumnWidth(anticipatedReviewDateColumnCaption, averageColumnWidth);
    
            String inciNameColumnCaption = CaptionResolver.getCaption("tradeName.search.table.column.inciName");
            mainComponent.addContainerProperty(inciNameColumnCaption, String.class, null);
            mainComponent.setColumnWidth(inciNameColumnCaption, averageColumnWidth);
            
            
            if (parentLayout.getParentView().getMainWindow().getCurrentSecurityInfo().getUser().isAdmin()) {
                String adminCommentsColumnCaption = CaptionResolver.getCaption("tradeName.search.table.column.adminComments");
                mainComponent.addContainerProperty(adminCommentsColumnCaption, String.class, null);
                mainComponent.setColumnWidth(adminCommentsColumnCaption, averageColumnWidth);
            }
    
            mainComponent.addContainerProperty(CaptionResolver.getCaption("tradeName.search.table.column.attach"),
                    String.class, null);
            mainComponent.addContainerProperty(CaptionResolver.getCaption("tradeName.search.table.column.actions"),
                    AbstractOrderedLayout.class, null);
    }

    public void reInitialize(TradeNameSearchResult searchList) {
        build();
        initializeTable(searchList);        
    }

    /**
     * @param actualPageSize maybe less or equals then page size selected from UI.
     */
    public void generateSearchResultsPage(int actualPageSize, int indexStart) {
        mainComponent.setPageLength(actualPageSize);

        /*
         * Check whether the table has already some records (if yes, that means
         * the search is performed using the paging component (e.g. by selecting
         * another page); otherwise the searchResult has been already obtained
         * in SearchResultsTableLayout.search(TradenameSearchParams)).
         */
        if (mainComponent.getItemIds().size() > 0) {
            // clear table rows
            mainComponent.removeAllItems();
            // get search results from the specific page
            searchResult = parentLayout.searchTradenames(actualPageSize, indexStart / actualPageSize + 1);
        }

        useSearchResult();
    }
    
    private void useSearchResult() {
        // reset pagesize
        int pageSize = 0;
        
        for (int i = 0; i < searchResult.getTnList().size(); i++) {
            DOTradeName formTN = (DOTradeName) searchResult.getTnList().elementAt(i);
            
            // for ADMIN user show adminComments
            if (parentLayout.getParentView().getMainWindow().getCurrentSecurityInfo().getUser().isAdmin()) {
                        mainComponent.addItem(new Object[] 
                        { 
                            formTN.submitDt.getUtilDate(), 
                            formTN.tnNumber,
                            formTN.tradeName, 
                            String.valueOf(formTN.catName), 
                            convertCompany(formTN.pubCompany.name),
                            formTN.exportDt.getUtilDate(), 
                            formTN.reviewDt.getUtilDate(), 
                            formTN.inciName,
                            formTN.adminComments,
                            formTN.hasAttachments ? "Y" : "N", 
                            createActionsLayout(formTN) 
                        }, i);
            }           
            else {
                        mainComponent.addItem(new Object[] 
                        { 
                            formTN.submitDt.getUtilDate(), 
                            formTN.tnNumber,
                            formTN.tradeName, 
                            String.valueOf(formTN.catName), 
                            convertCompany(formTN.pubCompany.name),
                            formTN.exportDt.getUtilDate(), 
                            formTN.reviewDt.getUtilDate(), 
                            formTN.inciName,
                            //formTN.adminComments,
                            formTN.hasAttachments ? "Y" : "N", 
                            createActionsLayout(formTN) 
                        }, i);              
            }
            
            pageSize++;
        }
        
        mainComponent.setPageLength(pageSize+1);
    }

    @SuppressWarnings("unused")
    private static String convertSumbitDateToCol(TDate submitDt) {
        return (submitDt == null || submitDt.isNull()) ? "--" : submitDt.formatIt(6);
    }

    private static String convertCompany(String company) {
        return (company.equals("")) ? "--" : company;
    }

    @SuppressWarnings("unused")
    private static String convertTDateToCol(TDate tDate) {
        String result;

        if (tDate.isNull()) {
            result = "";
        } else {
            result = TDate.convertTDateToCol(tDate);
        }

        return result;
    }
    
    private void addTableHeaderAction(){
        mainComponent.addListener(new Table.HeaderClickListener() {
            @Override
            public void headerClick(HeaderClickEvent event) {
                // search parameters
                TradenameSearchParams searchParams = parentLayout.getSearchParams();
                
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
                parentLayout.search(searchParams);
            } 
        });
    }

    private HorizontalLayout createActionsLayout(final DOTradeName formTN) {
        HorizontalLayout actionsLayout = new HorizontalLayout();
        actionsLayout.setHeight("30px");
        actionsLayout.setWidth("60px");

        Embedded viewPic = new Embedded(null, new ThemeResource("images/view.gif"));
        viewPic.addListener(new ClickListener() {
            @Override
            public void click(ClickEvent event) {
                TradeNameSearchView parentView = parentLayout.getParentView();

                //parentView.setClearOnNavigateOut(false);
                //parentView.setRefreshFlag(true);

                Map<String, Object> navigationParameterMap = new HashMap<String, Object>();

                navigationParameterMap.put(TradeNameDetailView.MODE_NAVIG_PARAM_KEY, TradeNameDetailViewMode.READ);
                navigationParameterMap.put(TradeNameDetailView.FORM_TN_REC_ID_NAVIG_PARAM_KEY, formTN.recID);

                //parentView.navigateTo(ViewKey.TN_DETAIL.toString(), navigationParameterMap, ViewKey.TN_SEARCH);
                parentView.navigateTo(ViewKey.TN_DETAIL.toString(), navigationParameterMap, parentView.getCurrentView());
            }
        });
        viewPic.addStyleName("cursor-pointer");
        actionsLayout.addComponent(viewPic);
        
        if (formTN.editable) {
            ComponentUtil.addSpace(actionsLayout, 5);
            Embedded editPic = new Embedded(null, new ThemeResource("images/edit.gif"));
            editPic.addListener(new ClickListener() {
                @Override
                public void click(ClickEvent event) {
                    TradeNameSearchView parentView = parentLayout.getParentView();
    
                    //parentView.setClearOnNavigateOut(false);
                    //parentView.setRefreshFlag(true);                    
    
                    Map<String, Object> navigationParameterMap = new HashMap<String, Object>();
    
                    navigationParameterMap.put("mode", TradeNameDetailViewMode.UPDATE);
                    navigationParameterMap.put("formTnRecId", formTN.recID);
    
                    //parentView.navigateTo(ViewKey.TN_DETAIL.toString(), navigationParameterMap, ViewKey.TN_SEARCH);
                    parentView.navigateTo(ViewKey.TN_DETAIL.toString(), navigationParameterMap, parentView.getCurrentView());
                }
            });
            editPic.addStyleName("cursor-pointer");
            actionsLayout.addComponent(editPic);
        }

        return actionsLayout;
    }

    public void setSearchResult(TradeNameSearchResult searchResult) {
        this.searchResult = searchResult;        
    }

}
