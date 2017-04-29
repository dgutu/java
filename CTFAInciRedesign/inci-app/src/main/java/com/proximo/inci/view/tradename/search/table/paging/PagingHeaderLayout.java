/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.search.table.paging;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.vaadin.pagingcomponent.PagingComponent;
import org.vaadin.pagingcomponent.PagingComponent.ChangePageEvent;
import org.vaadin.pagingcomponent.PagingComponent.PagingComponentListener;

import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.component.AbstractInciComponentLayout;
import com.proximo.inci.view.tradename.search.TradeNameSearchView;
import com.proximo.inci.view.tradename.search.table.SearchResultsTableLayout;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.data.Property.ValueChangeListener;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;

@SuppressWarnings("serial")
public class PagingHeaderLayout extends AbstractInciComponentLayout<HorizontalLayout> {

    private static Logger logger = LoggerFactory.getLogger(PagingHeaderLayout.class);
    
    private int pageSize = TradeNameSearchView.DEFAULT_PAGE_SIZE;

    private SearchResultsTableLayout searchResultsTableLayout;

    private HorizontalLayout pagingComponentLayout;

    public PagingHeaderLayout(SearchResultsTableLayout searchResultsTableLayout) {
        this.searchResultsTableLayout = searchResultsTableLayout;

        build();
    }
    
    @Override
    protected HorizontalLayout createMainComponentInstance() {
        return new HorizontalLayout();
    }

    @Override
    protected void init() {
        mainComponent.setSizeFull();
    }

    @Override
    protected void addContent() {
        // TODO (LOW) refactor insides of this method.

        pagingComponentLayout = new HorizontalLayout();

        mainComponent.addComponent(pagingComponentLayout);
        mainComponent.setComponentAlignment(pagingComponentLayout, Alignment.MIDDLE_LEFT);

        HorizontalLayout pageSizeFieldLayout = new HorizontalLayout();
        
        Label comboBoxText = new Label(CaptionResolver.getCaption("tradeName.search.table.legend.comboBoxText"));
        comboBoxText.addStyleName("very-small-text");
        pageSizeFieldLayout.addComponent(comboBoxText);
        
        ComboBox pageSizeField = createPageSizeField();
        pageSizeFieldLayout.addComponent(pageSizeField);        
        
        pageSizeFieldLayout.setComponentAlignment(comboBoxText, Alignment.MIDDLE_LEFT);
        pageSizeFieldLayout.setComponentAlignment(pageSizeField, Alignment.MIDDLE_RIGHT);
        
        mainComponent.addComponent(pageSizeFieldLayout);
        mainComponent.setComponentAlignment(pageSizeFieldLayout, Alignment.MIDDLE_RIGHT);
    }

    private ComboBox createPageSizeField() {
        // TODO (MEDIUM) refactor into a component
        
        logger.debug("Creating page size field");

        ComboBox pageSizeField = new ComboBox();
        pageSizeField.setNullSelectionAllowed(false);
        pageSizeField.setImmediate(true);

        pageSizeField.addItem(new Integer(TradeNameSearchView.DEFAULT_PAGE_SIZE));
        pageSizeField.addItem(new Integer(25));
        pageSizeField.addItem(new Integer(50));
        pageSizeField.addItem(new Integer(100));

        pageSizeField.setValue(new Integer(pageSize));

        pageSizeField.addListener(new ValueChangeListener() {
            @Override
            public void valueChange(ValueChangeEvent event) {
                pageSize = (Integer) event.getProperty().getValue();
                searchResultsTableLayout.search();
            }
        });

        logger.debug("Creating page size field finished");
        return pageSizeField;
    }

    public void resetPagingConfig() {
        pageSize = TradeNameSearchView.DEFAULT_PAGE_SIZE;
    }

    public void reInitialize(int count) {
        build();
        generateContent(count);
    }

    private void generateContent(int count) {
        /*
         * On paging component creation the search results table is filled with
         * records immediately
         */
        PagingComponent<Long> pagingComponent = createPagingComponent(count);
        pagingComponentLayout.addComponent(pagingComponent);
        pagingComponentLayout.setComponentAlignment(pagingComponent, Alignment.MIDDLE_LEFT);
    }

    /**
     * Initializes paging component and fills the table with search results.
     */
    private PagingComponent<Long> createPagingComponent(int count) {
        // generating idList for paging component
        List<Long> idList = new ArrayList<Long>();
        for (long id = 1; id <= count; id++) {
            idList.add(id);
        }

        PagingComponent<Long> pagingComponent = new PagingComponent<Long>(pageSize, idList,
                new PagingComponentListener<Long>() {
                    @Override
                    public void displayPage(ChangePageEvent<Long> event) {
                        int indexStart = event.getPageRange().getIndexPageStart();
                        
                        
                        //int ePageSize = event.getPageRange().getItemsList().size();
                        
                        
                        searchResultsTableLayout.getSearchTable().generateSearchResultsPage(
                                /*event.getPageRange().getItemsList().size()*/ /*(ePageSize < pageSize ? ePageSize : pageSize)*/ pageSize, indexStart);
                    }
                });

        pagingComponent.addStyleNameCurrentButtonState("v-button-bold-link");

        return pagingComponent;
    }

    public int getPageSize() {
        return pageSize;
    }
}
