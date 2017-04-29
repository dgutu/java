/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.category.ferments.column;

import com.proximo.inci.view.tradename.detail.category.TradeNameDetails;
import com.proximo.inci.view.tradename.detail.category.column.CasNumberFieldLayout;
import com.proximo.inci.view.tradename.detail.category.column.ChemicalSynonymsFieldLayout;
import com.proximo.inci.view.tradename.detail.category.column.CompositionStatementFieldLayout;
import com.proximo.inci.view.tradename.detail.category.column.GenusAndSpeciesOfPlantFieldLayout;
import com.proximo.inci.view.tradename.detail.category.column.ReferenceFieldLayout;
import com.proximo.inci.view.tradename.detail.category.column.TradeNameColumnDetails;
import com.proximo.inci.view.tradename.detail.category.column.TradeNameFieldLayout;
import com.proximo.inci.view.tradename.detail.category.ferments.FermentsTradeNameDetails;

public class FermentsFirstColumnDetails extends TradeNameColumnDetails {

    private TradeNameFieldLayout tradeNameFieldLayout;
    private CasNumberFieldLayout casNumberFieldLayout;
    private ChemicalSynonymsFieldLayout chemicalSynonymsFieldLayout;
    private GenusAndSpeciesOfPlantFieldLayout genusAndSpeciesOfPlantFieldLayout;
    private CompositionStatementFieldLayout compositionStatementFieldLayout;
    private ReferenceFieldLayout referenceFieldLayout;

    public FermentsFirstColumnDetails(FermentsTradeNameDetails parentDetails) {
        super(parentDetails);
    }

    @Override
    protected void init() {
        tradeNameFieldLayout = new TradeNameFieldLayout(this, 3);
        casNumberFieldLayout = new CasNumberFieldLayout(this, 6);
        chemicalSynonymsFieldLayout = new ChemicalSynonymsFieldLayout(this, 10);
        genusAndSpeciesOfPlantFieldLayout = new GenusAndSpeciesOfPlantFieldLayout(this, 13);
        compositionStatementFieldLayout = new CompositionStatementFieldLayout(this, 16);
        referenceFieldLayout = new ReferenceFieldLayout(this, 19);
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
        addComponent(chemicalSynonymsFieldLayout);
        addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        addComponent(genusAndSpeciesOfPlantFieldLayout);        
        addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        addComponent(compositionStatementFieldLayout);        
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
