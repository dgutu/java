/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.search.form.fields;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proximo.inci.component.AbstractInciComponentLayout;
import com.proximo.inci.service.security.SecurityInfo;
import com.proximo.inci.view.tradename.search.form.TradeNameSearchForm;
import com.proximo.inci.view.tradename.search.form.fields.left.TradeNameSearchFieldsLeft;
import com.proximo.inci.view.tradename.search.form.fields.right.TradeNameSearchFieldsRight;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.HorizontalLayout;

public class SearchFieldsLayout extends AbstractInciComponentLayout<HorizontalLayout> {

    private static Logger logger = LoggerFactory.getLogger(SearchFieldsLayout.class);

    protected TradeNameSearchForm parentForm;

    private TradeNameSearchFieldsLeft searchFieldsLeft;
    private TradeNameSearchFieldsRight searchFieldsRight;

    public SearchFieldsLayout(TradeNameSearchForm parentForm) {
        this.parentForm = parentForm;

        build();
    }

    @Override
    protected HorizontalLayout createMainComponentInstance() {
        return new HorizontalLayout();
    }

    @Override
    protected void init() {
        searchFieldsLeft = new TradeNameSearchFieldsLeft(parentForm);
        searchFieldsRight = new TradeNameSearchFieldsRight(parentForm);
    }

    @Override
    protected void addContent() {
        addSearchFields();
    }

    private void addSearchFields() {
        logger.debug("Adding search fields");

        mainComponent.setSizeFull();

        HorizontalLayout h1 = new HorizontalLayout();
        HorizontalLayout h11 = new HorizontalLayout();
        h11.setWidth("50px");
        h1.addComponent(h11);
        h1.addComponent(searchFieldsLeft.getMainComponent());
        mainComponent.addComponent(h1);
        HorizontalLayout h12 = new HorizontalLayout();
        h12.setWidth("50px");
        h1.addComponent(h12);

        HorizontalLayout h2 = new HorizontalLayout();
        h2.addComponent(searchFieldsRight.getMainComponent());
        HorizontalLayout h21 = new HorizontalLayout();
        h21.setWidth("100px");
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

    public String getAppNoFieldValue() {
        return searchFieldsLeft.getAppNoFieldValue();
    }

    public String getTradeNameFieldValue() {
        return searchFieldsLeft.getTradeNameFieldValue();
    }

    public String getExportStatusFieldValue() {
        return searchFieldsLeft.getExportStatusFieldValue();
    }

    public String getCompanyFieldValue() {
        return searchFieldsLeft.getCompanyFieldValue();
    }
    
    public Date getEntryDateFromFieldValue() {
        return searchFieldsRight.getEntryDateFromFieldValue();
    }

    public Date getEntryDateToFieldValue() {
        return searchFieldsRight.getEntryDateToFieldValue();
    }    

    public Boolean getCommentsOutsdFieldValue() {
        return searchFieldsRight.getCommentsOutsdFieldValue();
    }

    public Boolean getCommentsRespondFieldValue() {
        return searchFieldsRight.getCommentsRespondFieldValue();
    }

    public String getCategoryFieldValue() {
        return searchFieldsLeft.getCategoryFieldValue();
    }

    public Date getStaffReviewDateFromFieldValue() {
        return searchFieldsRight.getStaffReviewDateFromFieldValue();
    }

    public Date getStaffReviewDateToFieldValue() {
        return searchFieldsRight.getStaffReviewDateToFieldValue();
    }

    public Date getCommiteeReviewDateFromFieldValue() {
        return searchFieldsRight.getCommiteeReviewDateFromFieldValue();
    }

    public Date getCommiteeReviewDateToFieldValue() {
        return searchFieldsRight.getCommiteeReviewDateToFieldValue();
    }

    public String getSubmissionStatusFieldValue() {
        return searchFieldsRight.getSubmissionStatusFieldValue();
    }

    public TradeNameSearchFieldsRight getSearchFieldsRight() {
        return searchFieldsRight;
    }
    
    public TradeNameSearchFieldsLeft getSearchFieldsLeft() {
        return searchFieldsLeft;
    }    

}
