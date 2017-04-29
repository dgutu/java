/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.archive.search.form;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proximo.inci.DOTradeName;
import com.proximo.inci.common.TDate;
import com.proximo.inci.common.TemplarUtil;
import com.proximo.inci.component.AbstractInciComponentLayout;
import com.proximo.inci.view.tradename.archive.search.AbstractTradeNameArchiveView;
import com.proximo.inci.view.tradename.archive.search.form.buttons.ActionButtonsLayout;
import com.proximo.inci.view.tradename.archive.search.form.fields.SearchFieldsLayout;
import com.proximo.inci.view.tradename.archive.search.params.TradenameArchiveSearchParams;
import com.vaadin.ui.VerticalLayout;

public class TradeNameArchiveSearchForm extends AbstractInciComponentLayout<VerticalLayout> {

    private static Logger logger = LoggerFactory.getLogger(TradeNameArchiveSearchForm.class);

    public static final String FORM_TEXT_FIELD_WIDTH = "250px";
    public static final String FORM_DATE_FIELD_WIDTH = "108px";

    private AbstractTradeNameArchiveView parentView;

    private SearchFieldsLayout searchFieldsLayout;
    private ActionButtonsLayout actionButtonsLayout;

    public TradeNameArchiveSearchForm(AbstractTradeNameArchiveView parentView) {
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

    public TradenameArchiveSearchParams fillSearchParams(String userRecId) {
        DOTradeName formTn = new DOTradeName();

        formTn.tradeName = (String) searchFieldsLayout.getSearchFieldsLeft().getTradeNameField().getValue();
        formTn.tnNumber = (String) searchFieldsLayout.getSearchFieldsRight().getApplicationNumberField().getValue();
        formTn.pubCompany.name = (String) searchFieldsLayout.getSearchFieldsLeft().getCompanyField().getValue();

        String selectedCat = (String) searchFieldsLayout.getSearchFieldsLeft().getCategoryField().getValue();
        if (selectedCat == null) {
            selectedCat = "0";
        }
        formTn.categoryID = Integer.parseInt(selectedCat);

        TDate tDateFrom = new TDate();
        Date dateFrom = (Date) searchFieldsLayout.getSearchFieldsRight().getAssignmentDatesLayout()
                .getAssignmentDateFromField().getValue();
        if (dateFrom == null) {
            tDateFrom.setNull();
        } else {
            tDateFrom = new TDate(dateFrom);
        }
        formTn.inciNameDt = tDateFrom;

        TDate tDateTo = new TDate();
        Date dateTo = (Date) searchFieldsLayout.getSearchFieldsRight().getAssignmentDatesLayout()
                .getAssignmentDateToField().getValue();
        if (dateTo == null) {
            tDateTo.setNull();
        } else {
            tDateTo = new TDate(dateTo);
        }
        formTn.submitDt = tDateTo;

        return new TradenameArchiveSearchParams(formTn, userRecId);
    }

    @Override
    public String validate() {
        return searchFieldsLayout.validate();
    }

    public AbstractTradeNameArchiveView getParentView() {
        return parentView;
    }

	public void fillSearchFom(TradenameArchiveSearchParams searchParam) {
		try
		{
			// clear the form
			clearSearchFields();
			
			// tradeName
			if (!TemplarUtil.isStringNullOrEmpty(searchParam.getFormTn().tradeName))
				searchFieldsLayout.getSearchFieldsLeft().getTradeNameField().setValue(searchParam.getFormTn().tradeName);
			
			// category
			if (!TemplarUtil.isStringNullOrEmpty(String.valueOf(searchParam.getFormTn().categoryID)))
				searchFieldsLayout.getSearchFieldsLeft().getCategoryField().setValue(String.valueOf(searchParam.getFormTn().categoryID));
			
			// company
			if (!TemplarUtil.isStringNullOrEmpty(searchParam.getFormTn().pubCompany.name))
				searchFieldsLayout.getSearchFieldsLeft().getCompanyField().setValue(searchParam.getFormTn().pubCompany.name);
			
			// tn number
			if (!TemplarUtil.isStringNullOrEmpty(searchParam.getFormTn().tnNumber))
				searchFieldsLayout.getSearchFieldsRight().getApplicationNumberField().setValue(searchParam.getFormTn().tnNumber);
			
			// assign date
			if (searchParam.getFormTn().inciNameDt!= null) 
				searchFieldsLayout.getSearchFieldsRight().getAssignmentDatesLayout().getAssignmentDateFromField().setValue(searchParam.getFormTn().inciNameDt.getUtilDate());

			if (searchParam.getFormTn().submitDt!= null) 
				searchFieldsLayout.getSearchFieldsRight().getAssignmentDatesLayout().getAssignmentDateToField().setValue(searchParam.getFormTn().submitDt.getUtilDate());
		}
		catch (Exception ex) {
			logger.error("TradeNameArchiveSearchForm.fillSearchFom: " + ex.getMessage());
		}
	}

}
