/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.admin.cc_transactions_report.form;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proximo.inci.common.TDate;
import com.proximo.inci.common.TemplarUtil;
import com.proximo.inci.component.AbstractInciComponentLayout;
import com.proximo.inci.service.payment.CCTransactionsReportParams;
import com.proximo.inci.service.security.SecurityService;
import com.proximo.inci.service.security.user.User;
import com.proximo.inci.view.admin.cc_transactions_report.CCTransactionsReportView;
import com.vaadin.ui.VerticalLayout;

public class CCTransactionsReportForm extends AbstractInciComponentLayout<VerticalLayout> {

    private static Logger logger = LoggerFactory.getLogger(CCTransactionsReportForm.class);

    private CCTransactionsReportView parentView;

    private SearchFieldsLayout searchFieldsLayout;
    private ActionButtonsLayout actionButtonsLayout;

    public CCTransactionsReportForm(CCTransactionsReportView parentView) {
        this.parentView = parentView;

        build();
    }

    @Override
    protected VerticalLayout createMainComponentInstance() {
        return new VerticalLayout();
    }

    @Override
    protected void init() {
        mainComponent.addStyleName("grayBackgroundColor");
        mainComponent.addStyleName("roundedCorners");

        searchFieldsLayout = new SearchFieldsLayout(this);
        actionButtonsLayout = new ActionButtonsLayout(this);
    }

    @Override
    protected void addContent() {
        addComponent(searchFieldsLayout);
        addComponent(actionButtonsLayout);
    }

    public void clearSearchFields() {
        searchFieldsLayout.clear();
    }

    public CCTransactionsReportParams fillSearchParams() {
        TDate transactionStartDt = new TDate();
        transactionStartDt.setNull();
        Date transactionStartDate = (Date) searchFieldsLayout.getDateFrom().getValue();
        if (transactionStartDate != null) {
            transactionStartDt = new TDate(transactionStartDate);
        }

        TDate transactionEndDt = new TDate();
        transactionEndDt.setNull();
        Date transactionEndDate = (Date) searchFieldsLayout.getDateTo().getValue();
        if (transactionEndDate != null) {
            transactionEndDt = new TDate(transactionEndDate);
        }        
        
        double amountMin = -999999; // initial value, if no value passed to amount field then pass -999999 to DB
        double amountMax = -999999; // initial value, if no value passed to amount field then pass -999999 to DB
        
        if (searchFieldsLayout.getAmountFrom().getValue() != null && !"".equals(searchFieldsLayout.getAmountFrom().getValue().toString()))
        	amountMin = Double.valueOf((String) searchFieldsLayout.getAmountFrom().getValue());
        
        if (searchFieldsLayout.getAmountTo().getValue() != null && !"".equals(searchFieldsLayout.getAmountTo().getValue().toString()))
        	amountMax = Double.valueOf((String) searchFieldsLayout.getAmountTo().getValue());
        
        String searchStr = (String) searchFieldsLayout.getSearchStr().getValue();
        
        String logon = (String) searchFieldsLayout.getLogon().getValue();
        User user = SecurityService.findUserByLogon(logon);
        
        String userCompanyName = (String) searchFieldsLayout.getUserCompanyName().getValue();
        
        return new CCTransactionsReportParams(transactionStartDt, 
        									  transactionEndDt, 
        									  amountMin, 
        									  amountMax, 
        									  searchStr,
        									  (TemplarUtil.isStringNullOrEmpty(user.getUserRecId()) ? logon : user.getUserRecId()), 
        									  userCompanyName);
    }

    public CCTransactionsReportView getParentView() {
        return parentView;
    }
    
    public SearchFieldsLayout getSearchFieldsLayout() {
    	return this.searchFieldsLayout;
    }

	public void fillSearchFom(CCTransactionsReportParams searchParams) {
		try {
			
			searchFieldsLayout.clear();			
			
	        // date start
	        if (searchParams.getTransactionStartDt() != null)
	        	searchFieldsLayout.getDateFrom().setValue(searchParams.getTransactionStartDt().getUtilDate());
	        
	        // date end
	        if (searchParams.getTransactionEndDt() != null)
	        	searchFieldsLayout.getDateTo().setValue(searchParams.getTransactionEndDt().getUtilDate());
	        
			// logon
	        if (!TemplarUtil.isStringNullOrEmpty(searchParams.getLogon()))
	        	searchFieldsLayout.getLogon().setValue(searchParams.getLogon());
	        
	        // comp name
	        if (!TemplarUtil.isStringNullOrEmpty(searchParams.getUserCompanyName()))
	        	searchFieldsLayout.getUserCompanyName().setValue(searchParams.getUserCompanyName());
	        
	        // search
	        if (!TemplarUtil.isStringNullOrEmpty(searchParams.getSearchStr()))
	        	searchFieldsLayout.getSearchStr().setValue(searchParams.getSearchStr());	        
		}
		catch (Exception ex) {
			logger.error("CCTransactionsReportForm.fillSearchFom: " + ex.getMessage());
		}
	}

}

