/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.admin.cc_transactions_report.form;

//import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.component.AbstractInciComponentLayout;
import com.proximo.inci.component.common.SpacingComponent;
import com.proximo.inci.component.util.ComponentUtil;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.PopupDateField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

public class SearchFieldsLayout extends AbstractInciComponentLayout<HorizontalLayout> {

    private static Logger logger = LoggerFactory.getLogger(SearchFieldsLayout.class);

    public static final String FORM_TEXT_FIELD_WIDTH = "200px";
    public static final String FORM_DATE_FIELD_WIDTH = "108px";

    private CCTransactionsReportForm parentForm;
    
    private PopupDateField dateFrom;
    private PopupDateField dateTo;
    private TextField amountFrom;
    private TextField amountTo;
    private TextField searchStr;
    private TextField logon;              // user login
    private TextField userCompanyName;    // user company name

    public SearchFieldsLayout(CCTransactionsReportForm parentForm) {
        this.parentForm = parentForm;
        
        build();
    }

    @Override
    protected HorizontalLayout createMainComponentInstance() {
        return new HorizontalLayout();
    }

    @Override
    protected void init() {
        dateFrom = new PopupDateField();
        dateFrom.setCaption(CaptionResolver.getCaption("view.admin.cc_transactions_report.date_from"));
        dateFrom.setResolution(PopupDateField.RESOLUTION_DAY);
        dateFrom.setWidth(FORM_DATE_FIELD_WIDTH);

        dateTo = new PopupDateField();
        dateTo.setCaption(CaptionResolver.getCaption("view.admin.cc_transactions_report.date_to"));
        dateTo.setResolution(PopupDateField.RESOLUTION_DAY);
        dateTo.setWidth(FORM_DATE_FIELD_WIDTH);

        amountFrom = new TextField(CaptionResolver.getCaption("view.admin.cc_transactions_report.amount_from"));
        amountFrom.setWidth(FORM_TEXT_FIELD_WIDTH);

        amountTo = new TextField(CaptionResolver.getCaption("view.admin.cc_transactions_report.amount_to"));
        amountTo.setWidth(FORM_TEXT_FIELD_WIDTH);

        searchStr = new TextField(CaptionResolver.getCaption("view.admin.cc_transactions_report.search_str"));
        searchStr.setWidth(FORM_TEXT_FIELD_WIDTH);
        
        logon = new TextField(CaptionResolver.getCaption("view.admin.cc_transactions_report.logon"));
        logon.setWidth(FORM_TEXT_FIELD_WIDTH);
        
        userCompanyName = new TextField(CaptionResolver.getCaption("view.admin.cc_transactions_report.userCompanyName"));
        userCompanyName.setWidth(FORM_TEXT_FIELD_WIDTH);
        
        generateDefaultFieldsValues();
        
        // set focus on search field
        //searchStr.focus();
        dateFrom.focus();
    }

    @Override
    protected void addContent() {
        addSearchFields();
    }

    @SuppressWarnings("unused")
	private void addSearchFields_old() {
        logger.debug("Adding search fields");

        mainComponent.setSizeFull();

        HorizontalLayout h1 = new HorizontalLayout();
        HorizontalLayout h11 = new HorizontalLayout();
        h11.setWidth("250px");
        h1.addComponent(h11);
        FormLayout formLayoutLeft = new FormLayout();
        formLayoutLeft.setSpacing(false);
        formLayoutLeft.addComponent(dateFrom);
        formLayoutLeft.addComponent(new SpacingComponent(ComponentUtil.NORMAL_FORM_SPACING_PX).getMainComponent());
        //formLayoutLeft.addComponent(amountFrom);
        //formLayoutLeft.addComponent(new SpacingComponent(ComponentUtil.NORMAL_FORM_SPACING_PX).getMainComponent());
        formLayoutLeft.addComponent(logon);
        formLayoutLeft.addComponent(new SpacingComponent(ComponentUtil.NORMAL_FORM_SPACING_PX).getMainComponent());
        formLayoutLeft.addComponent(userCompanyName);
        formLayoutLeft.addComponent(new SpacingComponent(ComponentUtil.NORMAL_FORM_SPACING_PX).getMainComponent());
        formLayoutLeft.addComponent(searchStr);
        h1.addComponent(formLayoutLeft);
        //HorizontalLayout h12 = new HorizontalLayout();
        //h12.setWidth("50px");
        //h1.addComponent(h12);
        mainComponent.addComponent(h1);

        HorizontalLayout h2 = new HorizontalLayout();
        //HorizontalLayout h21 = new HorizontalLayout();
        //h21.setWidth("50px");
        //h2.addComponent(h21);
        FormLayout formLayoutRight = new FormLayout();
        formLayoutRight.setSpacing(false);
        formLayoutRight.addComponent(dateTo);
        //formLayoutRight.addComponent(new SpacingComponent(ComponentUtil.NORMAL_FORM_SPACING_PX).getMainComponent());
        //formLayoutRight.addComponent(amountTo);
        h2.addComponent(formLayoutRight);
        HorizontalLayout h22 = new HorizontalLayout();
        h22.setWidth("250px");
        h2.addComponent(h22);
        mainComponent.addComponent(h2);
        mainComponent.setComponentAlignment(h2, Alignment.TOP_RIGHT);

        logger.debug("Adding search fields finished");
    }
    
    private void addSearchFields() {
    	HorizontalLayout panel = new HorizontalLayout();
    	VerticalLayout leftSide = new VerticalLayout();
    	VerticalLayout rightSide = new VerticalLayout();
    	
    	// adding left side of form
        FormLayout formLayoutLeft = new FormLayout();
        formLayoutLeft.setSpacing(false);
        formLayoutLeft.addComponent(dateFrom);
        formLayoutLeft.addComponent(new SpacingComponent(ComponentUtil.NORMAL_FORM_SPACING_PX).getMainComponent());
        formLayoutLeft.addComponent(logon);
        formLayoutLeft.addComponent(new SpacingComponent(ComponentUtil.NORMAL_FORM_SPACING_PX).getMainComponent());
        formLayoutLeft.addComponent(userCompanyName);
        formLayoutLeft.addComponent(new SpacingComponent(ComponentUtil.NORMAL_FORM_SPACING_PX).getMainComponent());
        formLayoutLeft.addComponent(searchStr);
        leftSide.addComponent(formLayoutLeft);
        
        // adding right side of form
        FormLayout formLayoutRight = new FormLayout();
        formLayoutRight.setSpacing(false);
        formLayoutRight.addComponent(dateTo);     
        rightSide.addComponent(formLayoutRight);

        // add left side to the parent panel
        panel.addComponent(leftSide);
        
        // add right side to the parent panel
        panel.addComponent(rightSide);
        
        // add panel to mainCompenent
        mainComponent.setSizeFull();
        mainComponent.addComponent(panel);
        
        mainComponent.setComponentAlignment(panel, Alignment.MIDDLE_CENTER);
    }
    
    private void generateDefaultFieldsValues() {
    	try{dateFrom.setValue(null);} catch(Exception ex) {logger.error("dateFrom="+ex.getMessage());}
    	try{dateTo.setValue(null);} catch(Exception ex) {logger.error("dateTo="+ex.getMessage());}
    	
    	try {
	    	amountFrom.setValue(null);
	    	amountTo.setValue(null);
	    	searchStr.setValue("");
	    	logon.setValue("");
	    	userCompanyName.setValue("");
    	}
    	catch (Exception ex) {
    		logger.error("SearchFieldsLayout.generateDefaultFieldsValues="+ex.getMessage());
    	}
    }

    public void clear() {
        generateDefaultFieldsValues();
    }

    public PopupDateField getDateFrom() {
        return dateFrom;
    }

    public PopupDateField getDateTo() {
        return dateTo;
    }

    public TextField getAmountFrom() {
        return amountFrom;
    }

    public TextField getAmountTo() {
        return amountTo;
    }

    public TextField getSearchStr() {
        return searchStr;
    }
    
    public CCTransactionsReportForm getParentForm() {
    	return this.parentForm;
    }
    
    public TextField getLogon() {
    	return logon;
    }
    
    public TextField getUserCompanyName() {
    	return userCompanyName;
    }
    
}
