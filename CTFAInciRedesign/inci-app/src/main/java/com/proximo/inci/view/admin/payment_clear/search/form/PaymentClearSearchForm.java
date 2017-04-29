/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.admin.payment_clear.search.form;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proximo.inci.common.TemplarUtil;
import com.proximo.inci.component.AbstractInciComponentLayout;
import com.proximo.inci.service.payment.PaymentClearSearchParams;
import com.proximo.inci.view.admin.payment_clear.search.AbstractPaymentClearSearchView;
import com.vaadin.ui.VerticalLayout;

public class PaymentClearSearchForm extends AbstractInciComponentLayout<VerticalLayout> {

    private static Logger logger = LoggerFactory.getLogger(PaymentClearSearchForm.class);

    private AbstractPaymentClearSearchView parentView;

    private SearchFieldsLayout searchFieldsLayout;
    private ActionButtonsLayout actionButtonsLayout;

    public PaymentClearSearchForm(AbstractPaymentClearSearchView parentView) {
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

        searchFieldsLayout = new SearchFieldsLayout();
        actionButtonsLayout = new ActionButtonsLayout(this);
    }

    @Override
    protected void addContent() {
        addComponent(searchFieldsLayout);
        addComponent(actionButtonsLayout);
    }

    public void clearSearchFields() {
        //logger.debug("Clearing search form fields");
        searchFieldsLayout.clear();
        //logger.debug("Clearing search form fields finished");
    }

    public PaymentClearSearchParams fillSearchParams() {
        return new PaymentClearSearchParams(searchFieldsLayout.getApplicationNumber(),
                searchFieldsLayout.getCompanyName());
    }

    public AbstractPaymentClearSearchView getParentView() {
        return parentView;
    }
    
	public void fillSearchFom(PaymentClearSearchParams searchParam) {
		try {
			
			// clear search form
			searchFieldsLayout.clear();	
			
			// appno
	        if (!TemplarUtil.isStringNullOrEmpty(searchParam.getApplicationNumber()))
	        	searchFieldsLayout.setApplicationNumber(searchParam.getApplicationNumber());
	        
			// compname
	        if (!TemplarUtil.isStringNullOrEmpty(searchParam.getCompanyName()))
	        	searchFieldsLayout.setCompanyName(searchParam.getCompanyName());	        
		}
		catch (Exception ex) {
			logger.error("PaymentClearSearchForm.fillSearchFom: " + ex.getMessage());
		}
	}    
}
