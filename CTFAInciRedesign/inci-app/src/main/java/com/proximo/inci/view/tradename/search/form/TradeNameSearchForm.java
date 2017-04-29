/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.search.form;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proximo.inci.common.TDate;
import com.proximo.inci.common.TemplarUtil;
import com.proximo.inci.component.AbstractInciComponentLayout;
import com.proximo.inci.view.tradename.search.TradeNameSearchView;
import com.proximo.inci.view.tradename.search.form.buttons.ActionButtonsLayout;
import com.proximo.inci.view.tradename.search.form.fields.SearchFieldsLayout;
import com.proximo.inci.view.tradename.search.form.fields.right.TradeNameSearchFieldsRight;
import com.proximo.inci.view.tradename.search.params.TradenameSearchParams;
import com.vaadin.ui.VerticalLayout;

public class TradeNameSearchForm extends AbstractInciComponentLayout<VerticalLayout> {

    private static Logger logger = LoggerFactory.getLogger(TradeNameSearchForm.class);

    public static final String FORM_TEXT_FIELD_WIDTH = "250px";
    public static final String FORM_DATE_FIELD_WIDTH = "108px";

    private TradeNameSearchView parentView;

    private SearchFieldsLayout searchFieldsLayout;
    private ActionButtonsLayout actionButtonsLayout;

    public TradeNameSearchForm(TradeNameSearchView parentView) {
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

    /**
     * Fill trade name search parameters to be used for search page request.
     */
    public TradenameSearchParams fillSearchParams(String userRecId) {
        TradenameSearchParams tradenameSearchParams = null;

        String applicationNumber = searchFieldsLayout.getAppNoFieldValue();
        String tradename = searchFieldsLayout.getTradeNameFieldValue();

        String exportStatus = "A";
        String exportStatusFieldValue = searchFieldsLayout.getExportStatusFieldValue();
        if (exportStatusFieldValue != null) {
            exportStatus = exportStatusFieldValue;
        }

        String company = searchFieldsLayout.getCompanyFieldValue();

        TDate tEntryDateFromDt = new TDate();
        tEntryDateFromDt.setNull();
        Date entryDateFrom = searchFieldsLayout.getEntryDateFromFieldValue();
        if (entryDateFrom != null) {
        	tEntryDateFromDt = new TDate(entryDateFrom);
        }

        TDate tEntryDateToDt = new TDate();
        tEntryDateToDt.setNull();
        Date entryDateTo = searchFieldsLayout.getEntryDateToFieldValue();
        if (entryDateTo != null) {
            tEntryDateToDt = new TDate(entryDateTo);
        }

        Boolean commentsOutsdObject = searchFieldsLayout.getCommentsOutsdFieldValue();
        boolean commentsOutsd = false;
        if (commentsOutsdObject != null) {
            commentsOutsd = commentsOutsdObject.booleanValue();
        }

        Boolean commentsRespondObject = searchFieldsLayout.getCommentsRespondFieldValue();
        boolean commentsRespond = false;
        if (commentsRespondObject != null) {
            commentsRespond = commentsRespondObject.booleanValue();
        }

        int categoryId = 0;
        String categoryFieldValue = searchFieldsLayout.getCategoryFieldValue();
        if (categoryFieldValue != null) {
            categoryId = Integer.parseInt(categoryFieldValue);
        }

        TDate tStaffReviewDateFromDt = new TDate();
        tStaffReviewDateFromDt.setNull();
        Date staffReviewDateFrom = searchFieldsLayout.getStaffReviewDateFromFieldValue();
        if (staffReviewDateFrom != null) {
            tStaffReviewDateFromDt = new TDate(staffReviewDateFrom);
        }

        TDate tStaffReviewDateToDt = new TDate();
        tStaffReviewDateToDt.setNull();
        Date staffReviewDateTo = searchFieldsLayout.getStaffReviewDateToFieldValue();
        if (staffReviewDateTo != null) {
            tStaffReviewDateToDt = new TDate(staffReviewDateTo);
        }

        TDate tCommiteeReviewDateFromDt = new TDate();
        tCommiteeReviewDateFromDt.setNull();
        Date commiteeReviewDateFrom = searchFieldsLayout.getCommiteeReviewDateFromFieldValue();
        if (commiteeReviewDateFrom != null) {
            tCommiteeReviewDateFromDt = new TDate(commiteeReviewDateFrom);
        }

        TDate tCommiteeReviewDateToDt = new TDate();
        tCommiteeReviewDateToDt.setNull();
        Date commiteeReviewDateTo = searchFieldsLayout.getCommiteeReviewDateToFieldValue();
        if (commiteeReviewDateTo != null) {
            tCommiteeReviewDateToDt = new TDate(commiteeReviewDateTo);
        }

        String submissionStatusFieldValue = searchFieldsLayout.getSubmissionStatusFieldValue();
        String submissionStatus = "";
        if (submissionStatusFieldValue != null) {
            submissionStatus = submissionStatusFieldValue;
        }

        tradenameSearchParams = new TradenameSearchParams(userRecId, applicationNumber, tradename, exportStatus,
                company, tEntryDateFromDt, tEntryDateToDt, commentsOutsd, commentsRespond, categoryId, tStaffReviewDateFromDt,
                tStaffReviewDateToDt, tCommiteeReviewDateFromDt, tCommiteeReviewDateToDt, submissionStatus, "", 1);

        return tradenameSearchParams;
    }

    public void clearSearchFields() {
        searchFieldsLayout.clear();
    }

    @Override
    public String validate() {
        return searchFieldsLayout.validate();
    }

    public TradeNameSearchFieldsRight getSearchFieldsRight() {
        return searchFieldsLayout.getSearchFieldsRight();
    }

    public TradeNameSearchView getParentView() {
        return parentView;
    }

	public void fillSearchFom(TradenameSearchParams searchParams) {

		try {
			
			searchFieldsLayout.clear();			
			
			// ############### left
			// app no
	        if (!TemplarUtil.isStringNullOrEmpty(searchParams.getApplicationNumber()))
	        	searchFieldsLayout.getSearchFieldsLeft().setAppNoFieldValue(searchParams.getApplicationNumber());
	        
	        // trade name
	        if (!TemplarUtil.isStringNullOrEmpty(searchParams.getTradename()))
	        	searchFieldsLayout.getSearchFieldsLeft().setTradeNameFieldValue(searchParams.getTradename());
	        
	        // staff
	        if (!TemplarUtil.isStringNullOrEmpty(searchParams.getExportStatus()))
	        	searchFieldsLayout.getSearchFieldsLeft().setExportStatusFieldValue(searchParams.getExportStatus());
	        
	        // company
	        if (!TemplarUtil.isStringNullOrEmpty(searchParams.getCompany()))
	        	searchFieldsLayout.getSearchFieldsLeft().setCompanyFieldValue(searchParams.getCompany());
	        
	        // entry Date
	        if (searchParams.getEntryDt_start() != null)
	        	searchFieldsLayout.getSearchFieldsRight().getEntryDateFromField().setValue(searchParams.getEntryDt_start().getUtilDate());
	        
	        if (searchParams.getEntryDt_end()!= null)
	        	searchFieldsLayout.getSearchFieldsRight().getEntryDateToField().setValue(searchParams.getEntryDt_end().getUtilDate());
	        
			// ############### right
	        // comments
	        searchFieldsLayout.getSearchFieldsRight().getCommentsCheckBoxesLayout().setCommentsOutsdFieldValue(searchParams.isCommentsOutsd());
	        searchFieldsLayout.getSearchFieldsRight().getCommentsCheckBoxesLayout().setCommentsRespondFieldValue(searchParams.isCommentsRespond());
	        
	        // category
	        if (!TemplarUtil.isStringNullOrEmpty(String.valueOf(searchParams.getCategoryId())))
	        	searchFieldsLayout.getSearchFieldsLeft().getCategoryField().setValue(String.valueOf(searchParams.getCategoryId()));			
	        
	        // staff review date range
	        if (searchParams.getStaffReviewDateFromDt() != null)
	        	searchFieldsLayout.getSearchFieldsRight().getStaffReviewDateFromField().setValue(searchParams.getStaffReviewDateFromDt().getUtilDate());
	        
	        if (searchParams.getStaffReviewDateToDt()!= null)
	        	searchFieldsLayout.getSearchFieldsRight().getStaffReviewDateToField().setValue(searchParams.getStaffReviewDateToDt().getUtilDate());
	        
	        // commitee review date range
	        if (searchParams.getCommiteeReviewDateFromDt()!= null)
	        	searchFieldsLayout.getSearchFieldsRight().getCommiteeReviewDatesLayout().setCommiteeReviewDateFromFieldValue(searchParams.getCommiteeReviewDateFromDt().getUtilDate());
	        
	        if (searchParams.getCommiteeReviewDateToDt()!= null)
	        	searchFieldsLayout.getSearchFieldsRight().getCommiteeReviewDatesLayout().setCommiteeReviewDateToFieldValue(searchParams.getCommiteeReviewDateToDt().getUtilDate());
	        
	        // status
	        if (!TemplarUtil.isStringNullOrEmpty(searchParams.getSubmissionStatus()))
	        	searchFieldsLayout.getSearchFieldsRight().getSubmissionStatusField().setValue(searchParams.getSubmissionStatus());	        

		}
		catch (Exception ex) {
			logger.error("TradeNameSearchForm.fillSearchFom: " + ex.getMessage());
		}
	}
}
