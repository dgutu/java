/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.category.inorganic;

//import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//import com.proximo.inci.DOList;
import com.proximo.inci.DOTradeName;
import com.proximo.inci.caption.ValidationErrorStrUtils;
import com.proximo.inci.view.tradename.detail.TradeNameDetailView;
import com.proximo.inci.view.tradename.detail.category.TradeNameDetails;
import com.proximo.inci.view.tradename.detail.category.chem.GeneralChemistryOthersTradeNameDetails;
import com.proximo.inci.view.tradename.detail.category.column.FunctionsField;
//import com.proximo.inci.view.tradename.detail.category.column.OtherFunctionsField;
import com.proximo.inci.view.tradename.detail.category.inorganic.column.InorganicMineralBasedFirstColumnDetails;
import com.proximo.inci.view.tradename.detail.category.inorganic.column.InorganicMineralBasedSecondColumnDetails;
import com.proximo.inci.view.tradename.detail.category.inorganic.column.InorganicMineralBasedThirdColumnDetails;

public class InorganicMineralBasedTradeNameDetails extends TradeNameDetails {

    private static Logger logger = LoggerFactory.getLogger(GeneralChemistryOthersTradeNameDetails.class);

    private InorganicMineralBasedFirstColumnDetails firstColumnDetails;
    private InorganicMineralBasedSecondColumnDetails secondColumnDetails;
    private InorganicMineralBasedThirdColumnDetails thirdColumnDetails;

    public InorganicMineralBasedTradeNameDetails(TradeNameDetailView parentView) {
        super(parentView);
    }

    @Override
    protected void init() {
        mainComponent.setSpacing(true);

        firstColumnDetails = new InorganicMineralBasedFirstColumnDetails(this);
        secondColumnDetails = new InorganicMineralBasedSecondColumnDetails(this);
        thirdColumnDetails = new InorganicMineralBasedThirdColumnDetails(this);
    }

    @Override
    protected void addContent() {
        //logger.debug("Adding content");

        addComponent(firstColumnDetails);
        addComponent(secondColumnDetails);
        addComponent(thirdColumnDetails);

        //logger.debug("Adding content finished");
    }

    @Override
    public String validate() {
    	logger.debug("############### InorganicMineralBased.validate - START");
    	
        String result = super.validate();

        //if (result == null) {
        //    result = functionsFieldValidate();
        //}

        return result;
    }

	@SuppressWarnings("unused")
	private String functionsFieldValidate() {
		//logger.debug("############### InorganicMineralBased.functionsFieldValidate - START");
		
        FunctionsField functionsField = secondColumnDetails.getFunctionsFieldLayout().getFunctionsField();
        
        //DOList listOfFunctions = functionsField.getSelectedFunctions();
        
        //logger.debug("functionsFieldValue.size = " + listOfFunctions.size());
        
        //if (listOfFunctions == null || (listOfFunctions != null && listOfFunctions.size() <= 0)) {
        if (!functionsField.selected()) {
        	return ValidationErrorStrUtils.getFieldIsRequiredMsg(functionsField);
        }
        else
        	return null;
    }

    @Override
    public void prepareFormTn() {
        DOTradeName formTn = parentView.getFormTn();

        formTn.CASNumber = (String) firstColumnDetails.getCasNumberFieldLayout().getCasNumberField().getMainComponent()
                .getValue();
        formTn.EINECSNumber = (String) secondColumnDetails.getEinecsElincsEcNumberFieldLayout()
                .getEinecsElincsEcNumberField().getValue();
        formTn.nomenclature = (String) thirdColumnDetails.getNomenclatureFieldLayout().getNomenclatureField()
                .getValue();
        formTn.chemSynonyms = (String) firstColumnDetails.getChemicalSynonymsFieldLayout().getChemicalSynonymsField()
                .getValue();

        FunctionsField functionsField = secondColumnDetails.getFunctionsFieldLayout().getFunctionsField();
        String functionId = functionsField.getOneFunctionId();
        if (functionId != null) {
            formTn.functionID = Integer.parseInt(functionId);
        }

        formTn.functionList = functionsField.getSelectedFunctions();
        formTn.compStmt = (String) firstColumnDetails.getInorganicMineralBasedCompositionStatementFieldLayout()
                .getCompositionStatementField().getValue();
        formTn.mfgMehod = (String) secondColumnDetails.getInorganicMineralBasedManufacturingMethodFieldLayout()
                .getManufacturingMethodField().getValue();
        formTn.solvents = (String) thirdColumnDetails.getSolventsOrDiluentsFieldLayout().getSolventsOrDiluentsField()
                .getValue();
        formTn.reference = (String) firstColumnDetails.getReferenceFieldLayout().getReferenceField().getValue();
        formTn.other1 = (String) secondColumnDetails.getUserRespToCommFieldLayout().getUserRespToCommField().getValue();
        formTn.otherFunctions = (String) thirdColumnDetails.getOtherFunctionsFieldLayout().getOtherFunctionsField()
                .getValue();
        formTn.tradeName = (String) firstColumnDetails.getTradeNameFieldLayout().getTradeNameField().getValue();
        formTn.adminComments = (String) thirdColumnDetails.getAdminCommentsFieldLayout().getAdminCommentsField()
                .getValue();
        
        formTn.formula = (String) firstColumnDetails.getInorganicMineralBasedEmpiricalFormulaFieldLayout()
                .getEmpiricalFormulaField().getValue();
    }

    @Override
    public boolean areFieldsModified() {
        DOTradeName formTn = parentView.getFormTn();
        
        boolean fieldsModified = !(formTn.CASNumber.equals((String) firstColumnDetails.getCasNumberFieldLayout()
                .getCasNumberField().getMainComponent().getValue()));

        if (!fieldsModified) {
            fieldsModified = !(formTn.EINECSNumber.equals((String) secondColumnDetails.getEinecsElincsEcNumberFieldLayout()
                    .getEinecsElincsEcNumberField().getValue())); 
        } else {
            return true;
        }
        
        if (!fieldsModified) {
            fieldsModified = !(formTn.nomenclature.equals((String) thirdColumnDetails.getNomenclatureFieldLayout()
                    .getNomenclatureField().getValue()));
        } else {
            return true;
        }

        if (!fieldsModified) {
            fieldsModified = !(formTn.chemSynonyms.equals((String) firstColumnDetails.getChemicalSynonymsFieldLayout()
                    .getChemicalSynonymsField().getValue()));
        } else {
            return true;
        }
        
        /*FunctionsField functionsField = secondColumnDetails.getFunctionsFieldLayout().getFunctionsField();
        
        if (!fieldsModified) {
            String functionId = functionsField.getOneFunctionId();
            if (functionId != null) {
                fieldsModified = !(formTn.functionID == Integer.parseInt(functionId));
            } else {
                fieldsModified = false;
            }
        } else {
            return true;
        }
        
        if (!fieldsModified) {
            fieldsModified = functionsField.isFieldModified(formTn.functionList);
        } else {
            return true;
        }*/
        
        // functions list
        FunctionsField functionsField = secondColumnDetails.getFunctionsFieldLayout().getFunctionsField();
        
        fieldsModified = functionsField.isFieldModified(formTn.functionList);
        
        if (fieldsModified) {
        	logger.debug("InorganicMineralBasedTradeNameDetails.areFieldsModified()");
        	logger.debug("functionList"); 
            return true;
        }          

        if (!fieldsModified) {
            fieldsModified = !(formTn.compStmt.equals((String) firstColumnDetails
                    .getInorganicMineralBasedCompositionStatementFieldLayout().getCompositionStatementField()
                    .getValue()));
        } else {
            return true;
        }
        
        if (!fieldsModified) {
            fieldsModified = !(formTn.mfgMehod.equals((String) secondColumnDetails
                    .getInorganicMineralBasedManufacturingMethodFieldLayout().getManufacturingMethodField().getValue()));
        } else {
            return true;
        }
        
        if (!fieldsModified) {
            fieldsModified = !(formTn.solvents.equals((String) thirdColumnDetails.getSolventsOrDiluentsFieldLayout()
                    .getSolventsOrDiluentsField().getValue()));
        } else {
            return true;
        }
        
        if (!fieldsModified) {
            fieldsModified = !(formTn.reference.equals((String) firstColumnDetails.getReferenceFieldLayout()
                    .getReferenceField().getValue()));
        } else {
            return true;
        }

        if (!fieldsModified) {
            fieldsModified = !(formTn.other1.equals((String) secondColumnDetails.getUserRespToCommFieldLayout()
                    .getUserRespToCommField().getValue()));
        } else {
            return true;
        }

        if (!fieldsModified) {
            fieldsModified = !(formTn.otherFunctions.equals((String) thirdColumnDetails.getOtherFunctionsFieldLayout()
                    .getOtherFunctionsField().getValue()));
        } else {
            return true;
        }
        
        if (!fieldsModified) {
            fieldsModified = !(formTn.tradeName.equals((String) firstColumnDetails.getTradeNameFieldLayout()
                    .getTradeNameField().getValue()));
        } else {
            return true;
        }

        if (!fieldsModified) {
            fieldsModified = !(formTn.adminComments.equals((String) thirdColumnDetails.getAdminCommentsFieldLayout()
                    .getAdminCommentsField().getValue()));
        } else {
            return true;
        }

        if (!fieldsModified) {
            fieldsModified = !(formTn.formula.equals((String) firstColumnDetails
                    .getInorganicMineralBasedEmpiricalFormulaFieldLayout().getEmpiricalFormulaField().getValue()));
        } else {
            return true;
        }

        return fieldsModified;
    }
}
