/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.category.bio.column;

import com.proximo.inci.view.tradename.detail.category.TradeNameDetails;
import com.proximo.inci.view.tradename.detail.category.bio.BioEmpiricalFormulaFieldLayout;
import com.proximo.inci.view.tradename.detail.category.bio.BiotechBioengineeringCompositionStatementFieldLayout;
import com.proximo.inci.view.tradename.detail.category.bio.BiotechBioengineeringTradeNameDetails;
import com.proximo.inci.view.tradename.detail.category.column.CasNumberFieldLayout;
import com.proximo.inci.view.tradename.detail.category.column.ChemicalSynonymsFieldLayout;
import com.proximo.inci.view.tradename.detail.category.column.ReferenceFieldLayout;
import com.proximo.inci.view.tradename.detail.category.column.TradeNameColumnDetails;
import com.proximo.inci.view.tradename.detail.category.column.TradeNameFieldLayout;

public class BiotechBioengineeringFirstColumnDetails extends TradeNameColumnDetails {

    private TradeNameFieldLayout tradeNameFieldLayout;
    private CasNumberFieldLayout casNumberFieldLayout;
    private ChemicalSynonymsFieldLayout chemicalSynonymsFieldLayout;
    private BiotechBioengineeringCompositionStatementFieldLayout biotechBioengineeringCompositionStatementFieldLayout;
    private ReferenceFieldLayout referenceFieldLayout;
    private BioEmpiricalFormulaFieldLayout bioEmpiricalFormulaFieldLayout;

    public BiotechBioengineeringFirstColumnDetails(BiotechBioengineeringTradeNameDetails parentDetails) {
        super(parentDetails);
    }

    @Override
    protected void init() {
        tradeNameFieldLayout = new TradeNameFieldLayout(this, 3);
        casNumberFieldLayout = new CasNumberFieldLayout(this, 6);
        bioEmpiricalFormulaFieldLayout = new BioEmpiricalFormulaFieldLayout(this, 8); // Protein Information
        chemicalSynonymsFieldLayout = new ChemicalSynonymsFieldLayout(this, 11);
        biotechBioengineeringCompositionStatementFieldLayout = new BiotechBioengineeringCompositionStatementFieldLayout(
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
        addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        // Protein Information:
        addComponent(bioEmpiricalFormulaFieldLayout);
        addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
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
        addComponent(biotechBioengineeringCompositionStatementFieldLayout);
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

    public BiotechBioengineeringCompositionStatementFieldLayout getBiotechBioengineeringCompositionStatementFieldLayout() {
        return biotechBioengineeringCompositionStatementFieldLayout;
    }

    public ReferenceFieldLayout getReferenceFieldLayout() {
        return referenceFieldLayout;
    }

    public BioEmpiricalFormulaFieldLayout getBioEmpiricalFormulaFieldLayout() {
        return bioEmpiricalFormulaFieldLayout;
    }
}
