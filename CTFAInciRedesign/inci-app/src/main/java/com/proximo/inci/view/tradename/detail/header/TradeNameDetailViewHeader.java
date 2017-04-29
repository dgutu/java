/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.header;

import java.util.Date;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

import com.proximo.inci.DOTradeName;
import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.caption.ValidationErrorStrUtils;
import com.proximo.inci.common.TDate;
import com.proximo.inci.component.AbstractInciComponentLayout;
import com.proximo.inci.component.util.ComponentUtil;
import com.proximo.inci.view.tradename.detail.ModeText;
import com.proximo.inci.view.tradename.detail.SubmissionStatusText;
import com.proximo.inci.view.tradename.detail.TradeNameDetailView;
import com.proximo.inci.view.tradename.detail.header.sub.IngredientDescriptionField;
import com.proximo.inci.view.tradename.detail.header.sub.IngredientTypeOptionGroup;
import com.proximo.inci.view.tradename.detail.header.sub.IngredientTypeSelectionHeader;
import com.vaadin.ui.VerticalLayout;

public class TradeNameDetailViewHeader extends AbstractInciComponentLayout<VerticalLayout> {

	//private static Logger logger = LoggerFactory.getLogger(TradeNameDetailViewHeader.class);
	
    public static final String FORM_WIDTH = "890px";

    private TradeNameDetailView parentView;

    private ModeText modeText;
    private SubmissionStatusText submissionStatusText;
    private IngredientTypeSelectionHeader ingredientTypeSelectionHeader;
    private HeaderActionButtonsLayout actionButtonsLayout;

    public TradeNameDetailViewHeader(TradeNameDetailView parentView) {
        this.parentView = parentView;

        build();
    }

    @Override
    protected VerticalLayout createMainComponentInstance() {
        return new VerticalLayout();
    }

    @Override
    protected void init() {
        ingredientTypeSelectionHeader = new IngredientTypeSelectionHeader(this);
        actionButtonsLayout = new HeaderActionButtonsLayout(this);
        modeText = new ModeText(parentView);
        submissionStatusText = new SubmissionStatusText(parentView);
    }

    @Override
    protected void addContent() {
        addOpeningTextBlock();
        addSpace();
        addApplicationFeeText();
        addSpace();
        addComponent(modeText);
        addSpace();
        addComponent(submissionStatusText);
        addSpace();
        addComponent(actionButtonsLayout);
        addRequiredFieldsInfo();
        addSpace();
        addComponent(ingredientTypeSelectionHeader);
    }

    private void addRequiredFieldsInfo() {
        ComponentUtil.addHtml(CaptionResolver.getCaption("tradeName.detail.header.requiredFieldsInfo"), mainComponent);
    }

    private void addOpeningTextBlock() {
        ComponentUtil.addHtml(
                "<div style=\"width:" + FORM_WIDTH + "; font-weight:bold; border: 3px black solid; padding: 3px;\">"
                        + CaptionResolver.getCaption("tradeName.detail.header.openingText") + "</div>", mainComponent);
    }

    private void addApplicationFeeText() {
        ComponentUtil
                .addHtml(
                        CaptionResolver.getCaption("tradeName.detail.header.applicationFeeText.part1")
                                + parentView.getApplicationProperty("tnPaymentAmount")
                                + CaptionResolver.getCaption("tradeName.detail.header.applicationFeeText.part2"),
                        mainComponent);
    }

    @Override
    public String validate() {
        String result = super.validate();

        if (result == null) {
            result = ingredientDescriptionValidate();
        }

        return result;
    }

    private String ingredientDescriptionValidate() {
        IngredientTypeOptionGroup ingredientTypeField = ingredientTypeSelectionHeader
                .getIngredientTypeOptionGroupLayout().getIngredientTypeOptionGroup();
        String ingredientType = (String) ingredientTypeField.getValue();

        IngredientDescriptionField ingredientDescriptionField = ingredientTypeSelectionHeader
                .getIngredientTypeOptionGroupLayout().getIngredientDescriptionField();
        String ingredientDescription = (String) ingredientDescriptionField.getValue();

        if ("AB".equals(ingredientType) && "".equals(ingredientDescription)) {
            return ValidationErrorStrUtils.getRequiredForOtherFieldValueMsg(ingredientTypeField,
                    ingredientDescriptionField, ingredientTypeField.getMainComponent().getItemCaption(ingredientType));
        }

        return null;
    }

    /**
     * Based on UI components values sets attribute values in formTn.
     */
    public void prepareFormTn() {
        DOTradeName formTn = parentView.getFormTn();
        
        formTn.ingredient = (String) ingredientTypeSelectionHeader.getIngredientTypeOptionGroupLayout()
                .getIngredientTypeOptionGroup().getValue();
        formTn.ingredDesc = (String) ingredientTypeSelectionHeader.getIngredientTypeOptionGroupLayout()
                .getIngredientDescriptionField().getValue();
        
        Date reviewDtValue = (Date) ingredientTypeSelectionHeader.getAnticipatedReviewDateFieldLayout()
                .getAnticipatedReviewDateField().getValue();
        if (reviewDtValue != null) {
            formTn.reviewDt = new TDate(reviewDtValue);
        } else {
            formTn.reviewDt.setNull();
        }
    }
    
    public boolean areFieldsModified() {
    	
    	//logger.debug("header.areFieldsModified START");
    	
        DOTradeName formTn = parentView.getFormTn();
        
        
        /*logger.debug("header.areFieldsModified()1="+formTn.ingredient);
        logger.debug("header.areFieldsModified()1="+ingredientTypeSelectionHeader
                .getIngredientTypeOptionGroupLayout().getIngredientTypeOptionGroup().getValue());
        
        logger.debug("header.areFieldsModified()2="+formTn.ingredDesc);
        logger.debug("header.areFieldsModified()2="+ingredientTypeSelectionHeader
                .getIngredientTypeOptionGroupLayout().getIngredientDescriptionField().getValue());
        

        Date reviewDtValue1 = (Date) ingredientTypeSelectionHeader.getAnticipatedReviewDateFieldLayout()
                .getAnticipatedReviewDateField().getValue();
        
        
        logger.debug("header.areFieldsModified()3="+formTn.reviewDt);
        if (reviewDtValue1 == null)
        	logger.debug("header.areFieldsModified()3=NULL");
        else
        	logger.debug("header.areFieldsModified()3="+reviewDtValue1.toString());
        */
        
        boolean fieldsModified = !(formTn.ingredient.equals((String) ingredientTypeSelectionHeader
                .getIngredientTypeOptionGroupLayout().getIngredientTypeOptionGroup().getValue()));

        if (!fieldsModified) {
            fieldsModified = !(formTn.ingredDesc.equals((String) ingredientTypeSelectionHeader
                    .getIngredientTypeOptionGroupLayout().getIngredientDescriptionField().getValue()));
        } else {
            return true;
        }

        if (!fieldsModified) {
            Date reviewDtValue = (Date) ingredientTypeSelectionHeader.getAnticipatedReviewDateFieldLayout()
                    .getAnticipatedReviewDateField().getValue();
            if (reviewDtValue != null) {
                fieldsModified = !(formTn.reviewDt.equals(new TDate(reviewDtValue)));
            } else {
                fieldsModified = !(formTn.reviewDt.equals(TDate.getNullDateObject()));
            }
        } else {
            return true;
        }  
        
        //logger.debug("header.areFieldsModified()="+fieldsModified);

        return fieldsModified;
    }

    public TradeNameDetailView getParentView() {
        return parentView;
    }

}
