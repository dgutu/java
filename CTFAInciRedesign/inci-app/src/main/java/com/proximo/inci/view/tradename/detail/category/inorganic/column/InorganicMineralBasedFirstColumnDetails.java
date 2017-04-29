/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.category.inorganic.column;

import com.proximo.inci.view.tradename.detail.category.TradeNameDetails;
import com.proximo.inci.view.tradename.detail.category.column.CasNumberFieldLayout;
import com.proximo.inci.view.tradename.detail.category.column.ChemicalSynonymsFieldLayout;
import com.proximo.inci.view.tradename.detail.category.column.ReferenceFieldLayout;
import com.proximo.inci.view.tradename.detail.category.column.TradeNameColumnDetails;
import com.proximo.inci.view.tradename.detail.category.column.TradeNameFieldLayout;
import com.proximo.inci.view.tradename.detail.category.inorganic.InorganicMineralBasedCompositionStatementFieldLayout;
import com.proximo.inci.view.tradename.detail.category.inorganic.InorganicMineralBasedEmpiricalFormulaFieldLayout;
import com.proximo.inci.view.tradename.detail.category.inorganic.InorganicMineralBasedTradeNameDetails;

public class InorganicMineralBasedFirstColumnDetails extends TradeNameColumnDetails {

    private TradeNameFieldLayout tradeNameFieldLayout;
    private CasNumberFieldLayout casNumberFieldLayout;
    private ChemicalSynonymsFieldLayout chemicalSynonymsFieldLayout;
    private InorganicMineralBasedCompositionStatementFieldLayout inorganicMineralBasedCompositionStatementFieldLayout;
    private ReferenceFieldLayout referenceFieldLayout;
    private InorganicMineralBasedEmpiricalFormulaFieldLayout inorganicMineralBasedEmpiricalFormulaFieldLayout;

    public InorganicMineralBasedFirstColumnDetails(InorganicMineralBasedTradeNameDetails parentDetails) {
        super(parentDetails);
    }

    @Override
    protected void init() {
        tradeNameFieldLayout = new TradeNameFieldLayout(this, 3);
        casNumberFieldLayout = new CasNumberFieldLayout(this, 6);
        inorganicMineralBasedEmpiricalFormulaFieldLayout = new InorganicMineralBasedEmpiricalFormulaFieldLayout(this,
                8); // Empirical Formula        
        chemicalSynonymsFieldLayout = new ChemicalSynonymsFieldLayout(this, 11);
        inorganicMineralBasedCompositionStatementFieldLayout = new InorganicMineralBasedCompositionStatementFieldLayout(
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
        addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        addComponent(inorganicMineralBasedEmpiricalFormulaFieldLayout);        
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
        addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        addComponent(inorganicMineralBasedCompositionStatementFieldLayout);
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

    public InorganicMineralBasedCompositionStatementFieldLayout getInorganicMineralBasedCompositionStatementFieldLayout() {
        return inorganicMineralBasedCompositionStatementFieldLayout;
    }

    public ReferenceFieldLayout getReferenceFieldLayout() {
        return referenceFieldLayout;
    }

    public InorganicMineralBasedEmpiricalFormulaFieldLayout getInorganicMineralBasedEmpiricalFormulaFieldLayout() {
        return inorganicMineralBasedEmpiricalFormulaFieldLayout;
    }
}
