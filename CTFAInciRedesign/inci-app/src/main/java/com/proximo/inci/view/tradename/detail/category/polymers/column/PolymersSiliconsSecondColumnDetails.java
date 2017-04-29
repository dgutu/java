/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.category.polymers.column;

import com.proximo.inci.view.tradename.detail.category.TradeNameDetails;
import com.proximo.inci.view.tradename.detail.category.column.CategoryFieldLayout;
import com.proximo.inci.view.tradename.detail.category.column.EinecsElincsEcNumberFieldLayout;
import com.proximo.inci.view.tradename.detail.category.column.FunctionsFieldLayout;
import com.proximo.inci.view.tradename.detail.category.column.TradeNameColumnDetails;
import com.proximo.inci.view.tradename.detail.category.column.UserRespToCommFieldLayout;
import com.proximo.inci.view.tradename.detail.category.polymers.PolymersSiliconsManufacturingMethodFieldLayout;
import com.proximo.inci.view.tradename.detail.category.polymers.PolymersSiliconsTradeNameDetails;

public class PolymersSiliconsSecondColumnDetails extends TradeNameColumnDetails {

    private CategoryFieldLayout categoryFieldLayout;
    private EinecsElincsEcNumberFieldLayout einecsElincsEcNumberFieldLayout;
    private FunctionsFieldLayout functionsFieldLayout;
    private PolymersSiliconsManufacturingMethodFieldLayout polymersSiliconsManufacturingMethodFieldLayout;
    private UserRespToCommFieldLayout userRespToCommFieldLayout;

    public PolymersSiliconsSecondColumnDetails(PolymersSiliconsTradeNameDetails parentDetails) {
        super(parentDetails);
    }

    @Override
    protected void init() {
        categoryFieldLayout = new CategoryFieldLayout(this, 4);
        einecsElincsEcNumberFieldLayout = new EinecsElincsEcNumberFieldLayout(this, 7);
        functionsFieldLayout = new FunctionsFieldLayout(this, 11);
        polymersSiliconsManufacturingMethodFieldLayout = new PolymersSiliconsManufacturingMethodFieldLayout(this, 14);
        userRespToCommFieldLayout = new UserRespToCommFieldLayout(this, 17);
    }

    @Override
    protected void addContent() {    	
    	addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
    	addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
    	addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
    	addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        addComponent(categoryFieldLayout);
        addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        addComponent(einecsElincsEcNumberFieldLayout);
        addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        addComponent(functionsFieldLayout);
        addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        addComponent(polymersSiliconsManufacturingMethodFieldLayout);
        addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        addComponent(userRespToCommFieldLayout);
    }

    public FunctionsFieldLayout getFunctionsFieldLayout() {
        return functionsFieldLayout;
    }

    public CategoryFieldLayout getCategoryFieldLayout() {
        return categoryFieldLayout;
    }

    public EinecsElincsEcNumberFieldLayout getEinecsElincsEcNumberFieldLayout() {
        return einecsElincsEcNumberFieldLayout;
    }

    public PolymersSiliconsManufacturingMethodFieldLayout getPolymersSiliconsManufacturingMethodFieldLayout() {
        return polymersSiliconsManufacturingMethodFieldLayout;
    }

    public UserRespToCommFieldLayout getUserRespToCommFieldLayout() {
        return userRespToCommFieldLayout;
    }

}
