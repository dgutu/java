/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.category.bio;

//import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//import com.proximo.inci.DOList;
import com.proximo.inci.DOTradeName;
import com.proximo.inci.caption.ValidationErrorStrUtils;
import com.proximo.inci.view.tradename.detail.TradeNameDetailView;
import com.proximo.inci.view.tradename.detail.category.TradeNameDetails;
import com.proximo.inci.view.tradename.detail.category.bio.column.BiotechBioengineeringFirstColumnDetails;
import com.proximo.inci.view.tradename.detail.category.bio.column.BiotechBioengineeringSecondColumnDetails;
import com.proximo.inci.view.tradename.detail.category.bio.column.BiotechBioengineeringThirdColumnDetails;
import com.proximo.inci.view.tradename.detail.category.column.FunctionsField;
//import com.proximo.inci.view.tradename.detail.category.column.OtherFunctionsField;

public class BiotechBioengineeringTradeNameDetails extends TradeNameDetails {

    private static Logger logger = LoggerFactory.getLogger(BiotechBioengineeringTradeNameDetails.class);

    private BiotechBioengineeringFirstColumnDetails firstColumnDetails;
    private BiotechBioengineeringSecondColumnDetails secondColumnDetails;
    private BiotechBioengineeringThirdColumnDetails thirdColumnDetails;

    public BiotechBioengineeringTradeNameDetails(TradeNameDetailView parentView) {
        super(parentView);
    }

    @Override
    protected void init() {
        mainComponent.setSpacing(true);

        firstColumnDetails = new BiotechBioengineeringFirstColumnDetails(this);
        secondColumnDetails = new BiotechBioengineeringSecondColumnDetails(this);
        thirdColumnDetails = new BiotechBioengineeringThirdColumnDetails(this);
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
    	
    	logger.debug("############### BiotechBioengineering.validate - START");		
    	
        String result = super.validate();

        //if (result == null) {
        //    result = functionsFieldValidate();
        //}

        return result;
    }
    
	@SuppressWarnings("unused")
	private String functionsFieldValidate() {		
		logger.debug("############### BiotechBioengineering.functionsFieldValidate - START");
		
        FunctionsField functionsField = secondColumnDetails.getFunctionsFieldLayout().getFunctionsField();
        
        //DOList listOfFunctions = functionsField.getSelectedFunctions();
        
        logger.debug("functionsField.selected" + functionsField.selected());
        
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
        formTn.compStmt = (String) firstColumnDetails.getBiotechBioengineeringCompositionStatementFieldLayout()
                .getCompositionStatementField().getValue();
        formTn.mfgMehod = (String) secondColumnDetails.getBiotechBioengineeringManufacturingMethodFieldLayout()
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
        
        formTn.formula = (String) firstColumnDetails.getBioEmpiricalFormulaFieldLayout().getEmpiricalFormulaField()
                .getValue();
    }

    @Override
    public boolean areFieldsModified() {
        DOTradeName formTn = parentView.getFormTn();
        
        boolean flag = false;      
        boolean fieldsModified = false;          
        
        logger.debug("BiotechBioengineeringTradeNameDetails.areFieldsModified() - START");
        
        // first column
        // check Trade Name:
        flag = formTn.tradeName.equals(firstColumnDetails.getTradeNameFieldLayout().getTradeNameField().getMainComponent().getValue().toString());        
        if (!flag)
        {
        	fieldsModified = true;
        	logger.debug("Trade Name:");
        	logger.debug(formTn.tradeName.toString());
        	logger.debug(firstColumnDetails.getTradeNameFieldLayout().getTradeNameField().getMainComponent().getValue().toString());
        }
        
        // check CAS Number:
        flag = formTn.CASNumber.equals(firstColumnDetails.getCasNumberFieldLayout().getCasNumberField().getMainComponent().getValue().toString());
        if (!flag)
        {
        	fieldsModified = true;
        	logger.debug("CASNumber:");
        	logger.debug(formTn.CASNumber.toString());
        	logger.debug(firstColumnDetails.getCasNumberFieldLayout().getCasNumberField().getMainComponent().getValue().toString());
        }
        
        // check Protein Information: - Empirical Formula
        flag = formTn.formula.equals(firstColumnDetails.getBioEmpiricalFormulaFieldLayout().getEmpiricalFormulaField().getMainComponent().getValue().toString());
        if (!flag)
        {
        	fieldsModified = true;
        	logger.debug("Protein Information: - Empirical Formula");
        	logger.debug(formTn.formula.toString());
        	logger.debug(firstColumnDetails.getBioEmpiricalFormulaFieldLayout().getEmpiricalFormulaField().getMainComponent().getValue().toString());
        }
        
        // check Chemical Synonyms:
        flag = formTn.chemSynonyms.equals(firstColumnDetails.getChemicalSynonymsFieldLayout().getChemicalSynonymsField().getMainComponent().getValue().toString());
        if (!flag)
        {
        	fieldsModified = true;
        	logger.debug("Chemical Synonyms:");
        	logger.debug(formTn.chemSynonyms.toString());
        	logger.debug(firstColumnDetails.getChemicalSynonymsFieldLayout().getChemicalSynonymsField().getMainComponent().getValue().toString());
        }
        
        // check Composition Statement:
        flag = formTn.compStmt.equals(firstColumnDetails.getBiotechBioengineeringCompositionStatementFieldLayout().getCompositionStatementField().getMainComponent().getValue().toString());
        if (!flag)
        {
        	fieldsModified = true;
        	logger.debug("Composition Statement:");
        	logger.debug(formTn.compStmt.toString());
        	logger.debug(firstColumnDetails.getBiotechBioengineeringCompositionStatementFieldLayout().getCompositionStatementField().getMainComponent().getValue().toString());
        }
        
        // check Reference:
        flag = formTn.reference.equals(firstColumnDetails.getReferenceFieldLayout().getReferenceField().getMainComponent().getValue().toString());
        if (!flag)
        {
        	fieldsModified = true;
        	logger.debug("Reference");
        	logger.debug(formTn.reference.toString());
        	logger.debug(firstColumnDetails.getReferenceFieldLayout().getReferenceField().getMainComponent().getValue().toString());
        }
        
        // second column
        // check EINECS/ELINCS/EC Number:
        flag = formTn.EINECSNumber.equals(secondColumnDetails.getEinecsElincsEcNumberFieldLayout().getEinecsElincsEcNumberField().getMainComponent().getValue().toString());
        if (!flag)
        {
        	fieldsModified = true;
        	logger.debug("EINECS/ELINCS/EC Number:");
        	logger.debug(formTn.EINECSNumber.toString());
        	logger.debug(secondColumnDetails.getEinecsElincsEcNumberFieldLayout().getEinecsElincsEcNumberField().getMainComponent().getValue().toString());
        }
        
        // check Functions:        
        FunctionsField functionsField = secondColumnDetails.getFunctionsFieldLayout().getFunctionsField();
        //String functionId = functionsField.getOneFunctionId();
        
        //if (functionId != null) {
        //    fieldsModified = !(formTn.functionID == Integer.parseInt(functionId));
        //}
        
        // isFieldModified return TRUE if the lists are different
        flag = functionsField.isFieldModified(formTn.functionList);        
                
        if (functionsField.isFieldModified(formTn.functionList))
        {
        	fieldsModified = true;
        	logger.debug("Functions:");
        	logger.debug(formTn.functionList.toString());
        	logger.debug(secondColumnDetails.getFunctionsFieldLayout().getFunctionsField().getSelectedFunctions().toString());
        }
        
        // check Manufacturing Method:
        flag = formTn.mfgMehod.equals(secondColumnDetails.getBiotechBioengineeringManufacturingMethodFieldLayout().getManufacturingMethodField().getMainComponent().getValue().toString());
        if (!flag)
        {
        	fieldsModified = true;
        	logger.debug("Manufacturing Method:");
        	logger.debug(formTn.mfgMehod.toString());
        	logger.debug(secondColumnDetails.getBiotechBioengineeringManufacturingMethodFieldLayout().getManufacturingMethodField().getMainComponent().getValue().toString());
        }
        
        // check User Response to Comments:
        flag = formTn.other1.equals(secondColumnDetails.getUserRespToCommFieldLayout().getUserRespToCommField().getMainComponent().getValue().toString());
        if (!flag)
        {
        	fieldsModified = true;
        	logger.debug("User Response to Comments:");
        	logger.debug(formTn.other1.toString());
        	logger.debug(secondColumnDetails.getUserRespToCommFieldLayout().getUserRespToCommField().getMainComponent().getValue().toString());
        }
        
        // third column
        // check Suggested Nomenclature: 
        flag = formTn.nomenclature.equals(thirdColumnDetails.getNomenclatureFieldLayout().getNomenclatureField().getMainComponent().getValue().toString());
        if (!flag)
        {
        	fieldsModified = true;
        	logger.debug("Suggested Nomenclature:");
        	logger.debug(formTn.nomenclature.toString());
        	logger.debug(thirdColumnDetails.getNomenclatureFieldLayout().getNomenclatureField().getMainComponent().getValue().toString());
        }
        
        // check Other Functions: 
        flag = formTn.otherFunctions.equals(thirdColumnDetails.getOtherFunctionsFieldLayout().getOtherFunctionsField().getMainComponent().getValue().toString());
        if (!flag)
        {
        	fieldsModified = true;
        	logger.debug("Other Functions: ");
        	logger.debug(formTn.otherFunctions.toString());
        	logger.debug(thirdColumnDetails.getOtherFunctionsFieldLayout().getOtherFunctionsField().getMainComponent().getValue().toString());
        }
        
        // check Solvents or Diluents:
        flag = formTn.solvents.equals(thirdColumnDetails.getSolventsOrDiluentsFieldLayout().getSolventsOrDiluentsField().getMainComponent().getValue().toString());
        if (!flag)
        {
        	fieldsModified = true;
        	logger.debug("Solvents or Diluents:");
        	logger.debug(formTn.solvents.toString());
        	logger.debug(thirdColumnDetails.getSolventsOrDiluentsFieldLayout().getSolventsOrDiluentsField().getMainComponent().getValue().toString());
        }
        
        // check Admin Comments:
        flag = formTn.adminComments.equals(thirdColumnDetails.getAdminCommentsFieldLayout().getAdminCommentsField().getMainComponent().getValue().toString());
        if (!flag)
        {
        	fieldsModified = true;
        	logger.debug("Admin Comments:");
        	logger.debug(formTn.adminComments.toString());
        	logger.debug(thirdColumnDetails.getAdminCommentsFieldLayout().getAdminCommentsField().getMainComponent().getValue().toString());
        }
        
        logger.debug("BiotechBioengineeringTradeNameDetails.areFieldsModified() - END");
        
        return fieldsModified;
    }

}
