/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.category.chem.column;

import com.proximo.inci.view.tradename.detail.category.TradeNameDetails;
import com.proximo.inci.view.tradename.detail.category.chem.ChemEmpiricalFormulaFieldLayout;
import com.proximo.inci.view.tradename.detail.category.chem.GeneralChemistryOthersCompositionStatementFieldLayout;
import com.proximo.inci.view.tradename.detail.category.chem.GeneralChemistryOthersTradeNameDetails;
import com.proximo.inci.view.tradename.detail.category.column.CasNumberFieldLayout;
import com.proximo.inci.view.tradename.detail.category.column.ChemicalSynonymsFieldLayout;
import com.proximo.inci.view.tradename.detail.category.column.ReferenceFieldLayout;
import com.proximo.inci.view.tradename.detail.category.column.TradeNameColumnDetails;
import com.proximo.inci.view.tradename.detail.category.column.TradeNameFieldLayout;

public class GeneralChemistryOthersFirstColumnDetails extends TradeNameColumnDetails {

    private TradeNameFieldLayout tradeNameFieldLayout;
    private CasNumberFieldLayout casNumberFieldLayout;
    private ChemicalSynonymsFieldLayout chemicalSynonymsFieldLayout;
    private GeneralChemistryOthersCompositionStatementFieldLayout generalChemistryOthersCompositionStatementFieldLayout;
    private ReferenceFieldLayout referenceFieldLayout;
    private ChemEmpiricalFormulaFieldLayout chemEmpiricalFormulaFieldLayout;

    public GeneralChemistryOthersFirstColumnDetails(GeneralChemistryOthersTradeNameDetails parentDetails) {
        super(parentDetails);
    }

    @Override
    protected void init() {
        tradeNameFieldLayout = new TradeNameFieldLayout(this, 3);
        casNumberFieldLayout = new CasNumberFieldLayout(this, 6);
        chemEmpiricalFormulaFieldLayout = new ChemEmpiricalFormulaFieldLayout(this, 8); // Empirical Formula
        chemicalSynonymsFieldLayout = new ChemicalSynonymsFieldLayout(this, 11);
        generalChemistryOthersCompositionStatementFieldLayout = new GeneralChemistryOthersCompositionStatementFieldLayout(
                this, 14);
        referenceFieldLayout = new ReferenceFieldLayout(this, 17);
        
    }

    @Override
    protected void addContent() {
    	addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        addComponent(tradeNameFieldLayout);
        addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        addComponent(casNumberFieldLayout);
        //addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        //addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        //addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        addComponent(chemEmpiricalFormulaFieldLayout);
        addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);        
        addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        addComponent(chemicalSynonymsFieldLayout);
        addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        addComponent(generalChemistryOthersCompositionStatementFieldLayout);
        addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        addComponent(referenceFieldLayout);
    }

    public TradeNameFieldLayout getTradeNameFieldLayout() {
        return tradeNameFieldLayout;
    }

    public CasNumberFieldLayout getCasNumberFieldLayout() {
        return casNumberFieldLayout;
    }

    public ChemicalSynonymsFieldLayout getChemicalSynonymsFieldLayout() {
        return chemicalSynonymsFieldLayout;
    }

    public GeneralChemistryOthersCompositionStatementFieldLayout getGeneralChemistryOthersCompositionStatementFieldLayout() {
        return generalChemistryOthersCompositionStatementFieldLayout;
    }

    public ReferenceFieldLayout getReferenceFieldLayout() {
        return referenceFieldLayout;
    }

    public ChemEmpiricalFormulaFieldLayout getChemEmpiricalFormulaFieldLayout() {
        return chemEmpiricalFormulaFieldLayout;
    }
}
