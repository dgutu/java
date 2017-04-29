/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.archive.search.form.fields;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proximo.inci.component.AbstractInciComponentLayout;
import com.proximo.inci.service.security.SecurityInfo;
import com.proximo.inci.view.tradename.archive.search.form.TradeNameArchiveSearchForm;
import com.proximo.inci.view.tradename.archive.search.form.fields.left.TradeNameArchiveSearchFieldsLeft;
import com.proximo.inci.view.tradename.archive.search.form.fields.right.TradeNameArchiveSearchFieldsRight;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.HorizontalLayout;

public class SearchFieldsLayout extends AbstractInciComponentLayout<HorizontalLayout> {

    private static Logger logger = LoggerFactory.getLogger(SearchFieldsLayout.class);

    protected TradeNameArchiveSearchForm parentForm;

    private TradeNameArchiveSearchFieldsLeft searchFieldsLeft;
    private TradeNameArchiveSearchFieldsRight searchFieldsRight;

    public SearchFieldsLayout(TradeNameArchiveSearchForm parentForm) {
        this.parentForm = parentForm;

        build();
    }

    @Override
    protected HorizontalLayout createMainComponentInstance() {
        return new HorizontalLayout();
    }

    @Override
    protected void init() {
        searchFieldsLeft = new TradeNameArchiveSearchFieldsLeft(parentForm);
        searchFieldsRight = new TradeNameArchiveSearchFieldsRight(parentForm);
    }

    @Override
    protected void addContent() {
        addSearchFields();
    }

    private void addSearchFields() {
        logger.debug("Adding search fields");

        // TODO refactor to component inner stuff if needed

        mainComponent.setSizeFull();

        HorizontalLayout h1 = new HorizontalLayout();
        HorizontalLayout h11 = new HorizontalLayout();
        h11.setWidth("100px");
        h1.addComponent(h11);
        h1.addComponent(searchFieldsLeft.getMainComponent());
        mainComponent.addComponent(h1);
        HorizontalLayout h12 = new HorizontalLayout();
        h12.setWidth("100px");
        h1.addComponent(h12);

        HorizontalLayout h2 = new HorizontalLayout();
        h2.addComponent(searchFieldsRight.getMainComponent());
        HorizontalLayout h21 = new HorizontalLayout();
        h21.setWidth("200px");
        h2.addComponent(h21);
        mainComponent.addComponent(h2);
        mainComponent.setComponentAlignment(h2, Alignment.TOP_RIGHT);

        logger.debug("Adding search fields finished");
    }

    public void clear() {
        searchFieldsLeft.clear();
        searchFieldsRight.clear();
    }
    
    @Override
    public String validate() {
        String validationErrorStr = null;
        
        validationErrorStr = searchFieldsLeft.validate();
        if (validationErrorStr == null){
            validationErrorStr = searchFieldsRight.validate();
        }
        
        return validationErrorStr;
    }

    @Override
    public void applySecurityInfo(SecurityInfo securityInfo) {
        searchFieldsLeft.applySecurityInfo(securityInfo);
        searchFieldsRight.applySecurityInfo(securityInfo);
    }

    public TradeNameArchiveSearchFieldsLeft getSearchFieldsLeft() {
        return searchFieldsLeft;
    }

    public TradeNameArchiveSearchFieldsRight getSearchFieldsRight() {
        return searchFieldsRight;
    }

}
