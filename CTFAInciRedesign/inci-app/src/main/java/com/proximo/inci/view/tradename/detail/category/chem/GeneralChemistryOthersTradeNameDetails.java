/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.category.chem;

//import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//import com.proximo.inci.DOList;
import com.proximo.inci.DOTradeName;
import com.proximo.inci.caption.ValidationErrorStrUtils;
import com.proximo.inci.view.tradename.detail.TradeNameDetailView;
import com.proximo.inci.view.tradename.detail.category.TradeNameDetails;
import com.proximo.inci.view.tradename.detail.category.chem.column.GeneralChemistryOthersFirstColumnDetails;
import com.proximo.inci.view.tradename.detail.category.chem.column.GeneralChemistryOthersSecondColumnDetails;
import com.proximo.inci.view.tradename.detail.category.chem.column.GeneralChemistryOthersThirdColumnDetails;
import com.proximo.inci.view.tradename.detail.category.column.FunctionsField;
//import com.proximo.inci.view.tradename.detail.category.column.OtherFunctionsField;

public class GeneralChemistryOthersTradeNameDetails extends TradeNameDetails {

    private static Logger logger = LoggerFactory.getLogger(GeneralChemistryOthersTradeNameDetails.class);

    private GeneralChemistryOthersFirstColumnDetails firstColumnDetails;
    private GeneralChemistryOthersSecondColumnDetails secondColumnDetails;
    private GeneralChemistryOthersThirdColumnDetails thirdColumnDetails;

    public GeneralChemistryOthersTradeNameDetails(TradeNameDetailView parentView) {
        super(parentView);
    }

    @Override
    protected void init() {
        mainComponent.setSpacing(true);

        firstColumnDetails = new GeneralChemistryOthersFirstColumnDetails(this);
        secondColumnDetails = new GeneralChemistryOthersSecondColumnDetails(this);
        thirdColumnDetails = new GeneralChemistryOthersThirdColumnDetails(this);
    }

    @Override
    protected void addContent() {
        logger.debug("Adding content");

        addComponent(firstColumnDetails);
        addComponent(secondColumnDetails);
        addComponent(thirdColumnDetails);

        logger.debug("Adding content finished");
    }

    @Override
    public String validate() {
    	
    	logger.debug("############### GeneralChemistry.validate - START");
    	
        String result = super.validate();

        //if (result == null) {
        //    result = functionsFieldValidate();
        //}

        return result;
    }
   
	@SuppressWarnings("unused")
	private String functionsFieldValidate() {
		//logger.debug("############### GeneralChemistry.functionsFieldValidate - START");
		
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
        formTn.compStmt = (String) firstColumnDetails.getGeneralChemistryOthersCompositionStatementFieldLayout()
                .getCompositionStatementField().getValue();
        formTn.mfgMehod = (String) secondColumnDetails.getGeneralChemistryOthersManufacturingMethodFieldLayout()
                .getManufacturingMethodField().getValue();
        formTn.solvents = (String) thirdColumnDetails.getGeneralChemistryOthersSolventsOrDiluentsFieldLayout()
                .getSolventsOrDiluentsField().getValue();
        formTn.reference = (String) firstColumnDetails.getReferenceFieldLayout().getReferenceField().getValue();
        formTn.other1 = (String) secondColumnDetails.getUserRespToCommFieldLayout().getUserRespToCommField().getValue();
        formTn.otherFunctions = (String) thirdColumnDetails.getOtherFunctionsFieldLayout().getOtherFunctionsField()
                .getValue();
        formTn.tradeName = (String) firstColumnDetails.getTradeNameFieldLayout().getTradeNameField().getValue();
        formTn.adminComments = (String) thirdColumnDetails.getAdminCommentsFieldLayout().getAdminCommentsField()
                .getValue();
        
        //formTn.monoId = (String) secondColumnDetails.getMonoIdFieldLayout().getMonoIdField().getValue();
        formTn.formula = (String) firstColumnDetails.getChemEmpiricalFormulaFieldLayout().getEmpiricalFormulaField()
                .getValue();
    }

    @Override
    public boolean areFieldsModified() {
        DOTradeName formTn = parentView.getFormTn();
        
        // CASNumber
        boolean fieldsModified = (formTn.CASNumber.equals((String) firstColumnDetails.getCasNumberFieldLayout()
                .getCasNumberField().getMainComponent().getValue()));
        
        if (!fieldsModified)
        {
        	logger.debug("GeneralChemistryOthersTradeNameDetails.areFieldsModified()");
        	logger.debug("CASNumber");
        	logger.debug(formTn.CASNumber);
        	logger.debug((String) firstColumnDetails.getCasNumberFieldLayout()
                    .getCasNumberField().getMainComponent().getValue());
        	
        }
        
        // trade name
        fieldsModified = (formTn.tradeName.equals((String) firstColumnDetails.getTradeNameFieldLayout()
                .getTradeNameField().getValue()));
        
        if (!fieldsModified) {
        	logger.debug("GeneralChemistryOthersTradeNameDetails.areFieldsModified()");
        	logger.debug("tradeName");
        	logger.debug(formTn.tradeName);
        	logger.debug((String) firstColumnDetails.getTradeNameFieldLayout()
                    .getTradeNameField().getValue());
            return true;
        }
        
        // EINECSNumber
        fieldsModified = (formTn.EINECSNumber.equals((String) secondColumnDetails.getEinecsElincsEcNumberFieldLayout()
                .getEinecsElincsEcNumberField().getValue())); 
        
        if (!fieldsModified) {
        	logger.debug("GeneralChemistryOthersTradeNameDetails.areFieldsModified()");
        	logger.debug("EINECSNumber");
        	logger.debug(formTn.EINECSNumber);
        	logger.debug((String) secondColumnDetails.getEinecsElincsEcNumberFieldLayout()
                    .getEinecsElincsEcNumberField().getValue());        	
            return true;
        }
        
        // nomenclature
        fieldsModified = (formTn.nomenclature.equals((String) thirdColumnDetails.getNomenclatureFieldLayout()
                .getNomenclatureField().getValue()));
        
        if (!fieldsModified) {
        	logger.debug("GeneralChemistryOthersTradeNameDetails.areFieldsModified()");
        	logger.debug("nomenclature");
        	logger.debug(formTn.nomenclature);
        	logger.debug((String) thirdColumnDetails.getNomenclatureFieldLayout()
                    .getNomenclatureField().getValue());
            return true;
        }
        
        // formula
        fieldsModified = (formTn.formula.equals((String) firstColumnDetails.getChemEmpiricalFormulaFieldLayout()
                .getEmpiricalFormulaField().getValue()));
        
        if (!fieldsModified) {
        	logger.debug("GeneralChemistryOthersTradeNameDetails.areFieldsModified()");
        	logger.debug("formula");
        	logger.debug(formTn.formula);
        	logger.debug((String) firstColumnDetails.getChemEmpiricalFormulaFieldLayout()
                    .getEmpiricalFormulaField().getValue());        	
            return true;
        }
        
        // functions list
        FunctionsField functionsField = secondColumnDetails.getFunctionsFieldLayout().getFunctionsField();
        /*String functionId = functionsField.getOneFunctionId();
        if (functionId != null) {
            fieldsModified = (formTn.functionID == Integer.parseInt(functionId));
        } else {
            fieldsModified = false;
        }
        
        if (!fieldsModified) {
        	logger.debug("functionID"); 	
        	logger.debug(new Integer(formTn.functionID).toString());
        	logger.debug(new Integer(Integer.parseInt(functionId)).toString());
            return true;
        }*/
        
        fieldsModified = functionsField.isFieldModified(formTn.functionList);
        
        if (fieldsModified) {
        	logger.debug("GeneralChemistryOthersTradeNameDetails.areFieldsModified()");
        	logger.debug("functionList"); 
            return true;
        }
        
        // otherFunctions
        fieldsModified = (formTn.otherFunctions.equals((String) thirdColumnDetails.getOtherFunctionsFieldLayout()
                .getOtherFunctionsField().getValue()));
        
        if (!fieldsModified) {
        	logger.debug("GeneralChemistryOthersTradeNameDetails.areFieldsModified()");
        	logger.debug("otherFunctions");
        	logger.debug(formTn.otherFunctions);
        	logger.debug((String) thirdColumnDetails.getOtherFunctionsFieldLayout()
                    .getOtherFunctionsField().getValue());          	
            return true;
        }

        // chemSynonyms
        fieldsModified = (formTn.chemSynonyms.equals((String) firstColumnDetails.getChemicalSynonymsFieldLayout()
                .getChemicalSynonymsField().getValue()));
        
        if (!fieldsModified) {
        	logger.debug("GeneralChemistryOthersTradeNameDetails.areFieldsModified()");
        	logger.debug("chemSynonyms");
        	logger.debug(formTn.chemSynonyms);
        	logger.debug((String) firstColumnDetails.getChemicalSynonymsFieldLayout()
                    .getChemicalSynonymsField().getValue());        	
            return true;
        }
        
        // mfgMehod
        fieldsModified = (formTn.mfgMehod.equals((String) secondColumnDetails
                .getGeneralChemistryOthersManufacturingMethodFieldLayout().getManufacturingMethodField().getValue()));
        
        if (!fieldsModified) {
        	logger.debug("GeneralChemistryOthersTradeNameDetails.areFieldsModified()");
        	logger.debug("mfgMehod");
        	logger.debug(formTn.mfgMehod);
        	logger.debug((String) secondColumnDetails.getGeneralChemistryOthersManufacturingMethodFieldLayout().getManufacturingMethodField().getValue());            	
            return true;
        }
        
        // solvents
        fieldsModified = (formTn.solvents.equals((String) thirdColumnDetails.getGeneralChemistryOthersSolventsOrDiluentsFieldLayout()
                .getSolventsOrDiluentsField().getValue()));
        
        if (!fieldsModified) {
        	logger.debug("GeneralChemistryOthersTradeNameDetails.areFieldsModified()");
        	logger.debug("solvents");
        	logger.debug(formTn.solvents);
        	logger.debug((String) thirdColumnDetails.getGeneralChemistryOthersSolventsOrDiluentsFieldLayout()
                    .getSolventsOrDiluentsField().getValue());        	
            return true;
        }
        
        // compStmt
        fieldsModified = (formTn.compStmt.equals((String) firstColumnDetails
                .getGeneralChemistryOthersCompositionStatementFieldLayout().getCompositionStatementField()
                .getValue()));
        
        if (!fieldsModified) {
        	logger.debug("GeneralChemistryOthersTradeNameDetails.areFieldsModified()");
        	logger.debug("compStmt");
        	logger.debug(formTn.compStmt);
        	logger.debug((String) firstColumnDetails
                    .getGeneralChemistryOthersCompositionStatementFieldLayout().getCompositionStatementField().getValue());           	
            return true;
        }
        
        // other1
        fieldsModified = (formTn.other1.equals((String) secondColumnDetails.getUserRespToCommFieldLayout()
                .getUserRespToCommField().getValue()));
        
        if (!fieldsModified) {
        	logger.debug("GeneralChemistryOthersTradeNameDetails.areFieldsModified()");
        	logger.debug("other1");
        	logger.debug(formTn.other1);
        	logger.debug((String) secondColumnDetails.getUserRespToCommFieldLayout()
                    .getUserRespToCommField().getValue());        	
            return true;
        }        
        
        // reference
        fieldsModified = (formTn.reference.equals((String) firstColumnDetails.getReferenceFieldLayout()
                .getReferenceField().getValue()));
        
        if (!fieldsModified) {
        	logger.debug("GeneralChemistryOthersTradeNameDetails.areFieldsModified()");
        	logger.debug("reference");
        	logger.debug(formTn.reference);
        	logger.debug((String) firstColumnDetails.getReferenceFieldLayout()
                    .getReferenceField().getValue());        	
            return true;
        }
        
        // adminComments
        fieldsModified = (formTn.adminComments.equals((String) thirdColumnDetails.getAdminCommentsFieldLayout()
                .getAdminCommentsField().getValue()));
        
        if (!fieldsModified) {
        	logger.debug("GeneralChemistryOthersTradeNameDetails.areFieldsModified()");
        	logger.debug("adminComments");
        	logger.debug(formTn.adminComments);
        	logger.debug((String) thirdColumnDetails.getAdminCommentsFieldLayout()
                    .getAdminCommentsField().getValue());        	
            return true;
        }
        
        return !fieldsModified;
    }

}
