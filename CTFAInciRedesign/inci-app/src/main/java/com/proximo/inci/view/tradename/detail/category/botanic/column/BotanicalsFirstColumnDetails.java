/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.category.botanic.column;

import com.proximo.inci.view.tradename.detail.category.TradeNameDetails;
import com.proximo.inci.view.tradename.detail.category.botanic.BotanicalsTradeNameDetails;
import com.proximo.inci.view.tradename.detail.category.column.ChemicalSynonymsFieldLayout;
import com.proximo.inci.view.tradename.detail.category.column.CompositionStatementFieldLayout;
import com.proximo.inci.view.tradename.detail.category.column.EinecsElincsEcNumberFieldLayout;
//import com.proximo.inci.view.tradename.detail.category.column.EmpiricalFormulaFieldLayout;
import com.proximo.inci.view.tradename.detail.category.column.GenusAndSpeciesOfPlantFieldLayout;
import com.proximo.inci.view.tradename.detail.category.column.ReferenceFieldLayout;
import com.proximo.inci.view.tradename.detail.category.column.TradeNameColumnDetails;
import com.proximo.inci.view.tradename.detail.category.column.TradeNameFieldLayout;

public class BotanicalsFirstColumnDetails extends TradeNameColumnDetails {

    private TradeNameFieldLayout tradeNameFieldLayout;
    //private EmpiricalFormulaFieldLayout empiricalFormulaFieldLayout;
    private EinecsElincsEcNumberFieldLayout einecsElincsEcNumberFieldLayout;
    private ChemicalSynonymsFieldLayout chemicalSynonymsFieldLayout;
    private GenusAndSpeciesOfPlantFieldLayout genusAndSpeciesOfPlantFieldLayout;
    private CompositionStatementFieldLayout compositionStatementFieldLayout;
    private ReferenceFieldLayout referenceFieldLayout;

    public BotanicalsFirstColumnDetails(BotanicalsTradeNameDetails parentDetails) {
        super(parentDetails);
    }

    @Override
    protected void init() {
        tradeNameFieldLayout = new TradeNameFieldLayout(this, 3);
        //empiricalFormulaFieldLayout = new EmpiricalFormulaFieldLayout(this, 6);
        einecsElincsEcNumberFieldLayout = new EinecsElincsEcNumberFieldLayout(this, 6);
        chemicalSynonymsFieldLayout = new ChemicalSynonymsFieldLayout(this, 8);
        genusAndSpeciesOfPlantFieldLayout = new GenusAndSpeciesOfPlantFieldLayout(this, 11);
        compositionStatementFieldLayout = new CompositionStatementFieldLayout(this, 14);
        referenceFieldLayout = new ReferenceFieldLayout(this, 17);
    }

    @Override
    protected void addContent() {
    	addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        addComponent(tradeNameFieldLayout);
        addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        addComponent(einecsElincsEcNumberFieldLayout);
        addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        addComponent(chemicalSynonymsFieldLayout);
        addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        addComponent(genusAndSpeciesOfPlantFieldLayout);
        addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        addComponent(compositionStatementFieldLayout);
        addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        addComponent(referenceFieldLayout);
    }

    public TradeNameFieldLayout getTradeNameFieldLayout() {
        return tradeNameFieldLayout;
    }

    /*public EmpiricalFormulaFieldLayout getEmpiricalFormulaFieldLayout() {
        return empiricalFormulaFieldLayout;
    }*/

    public EinecsElincsEcNumberFieldLayout getEinecsElincsEcNumberFieldLayout() {
        return einecsElincsEcNumberFieldLayout;
    }

    public ChemicalSynonymsFieldLayout getChemicalSynonymsFieldLayout() {
        return chemicalSynonymsFieldLayout;
    }

    public GenusAndSpeciesOfPlantFieldLayout getGenusAndSpeciesOfPlantFieldLayout() {
        return genusAndSpeciesOfPlantFieldLayout;
    }

    public CompositionStatementFieldLayout getCompositionStatementFieldLayout() {
        return compositionStatementFieldLayout;
    }

    public ReferenceFieldLayout getReferenceFieldLayout() {
        return referenceFieldLayout;
    }

}
