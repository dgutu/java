/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.category.botanic.column;

import com.proximo.inci.view.tradename.detail.category.TradeNameDetails;
import com.proximo.inci.view.tradename.detail.category.botanic.BotanicalsManufacturingMethodFieldLayout;
import com.proximo.inci.view.tradename.detail.category.botanic.BotanicalsTradeNameDetails;
import com.proximo.inci.view.tradename.detail.category.botanic.PlantPartsFieldLayout;
import com.proximo.inci.view.tradename.detail.category.column.CasNumberFieldLayout;
import com.proximo.inci.view.tradename.detail.category.column.CategoryFieldLayout;
import com.proximo.inci.view.tradename.detail.category.column.FunctionsFieldLayout;
import com.proximo.inci.view.tradename.detail.category.column.TradeNameColumnDetails;
import com.proximo.inci.view.tradename.detail.category.column.UserRespToCommFieldLayout;

public class BotanicalsSecondColumnDetails extends TradeNameColumnDetails {

    private CategoryFieldLayout categoryFieldLayout;
    private CasNumberFieldLayout casNumberFieldLayout;
    private FunctionsFieldLayout functionsFieldLayout;
    private PlantPartsFieldLayout plantPartsFieldLayout;
    private BotanicalsManufacturingMethodFieldLayout botanicalsManufacturingMethodFieldLayout;
    private UserRespToCommFieldLayout userRespToCommFieldLayout;

    public BotanicalsSecondColumnDetails(BotanicalsTradeNameDetails parentDetails) {
        super(parentDetails);
    }

    @Override
    protected void init() {
        categoryFieldLayout = new CategoryFieldLayout(this, 4);
        casNumberFieldLayout = new CasNumberFieldLayout(this, 7);
        functionsFieldLayout = new FunctionsFieldLayout(this, 9);
        plantPartsFieldLayout = new PlantPartsFieldLayout(this, 12);
        botanicalsManufacturingMethodFieldLayout = new BotanicalsManufacturingMethodFieldLayout(this, 15);
        userRespToCommFieldLayout = new UserRespToCommFieldLayout(this, 18);
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
        addComponent(casNumberFieldLayout);
        addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        addComponent(functionsFieldLayout);
        addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        addComponent(plantPartsFieldLayout);
        addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        addComponent(botanicalsManufacturingMethodFieldLayout);
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

    public CasNumberFieldLayout getCasNumberFieldLayout() {
        return casNumberFieldLayout;
    }

    //public MonoIdFieldLayout getMonoIdFieldLayout() {
    //   return monoIdFieldLayout;
    //}

    public PlantPartsFieldLayout getPlantPartsFieldLayout() {
        return plantPartsFieldLayout;
    }

    public BotanicalsManufacturingMethodFieldLayout getBotanicalsManufacturingMethodFieldLayout() {
        return botanicalsManufacturingMethodFieldLayout;
    }

    public UserRespToCommFieldLayout getUserRespToCommFieldLayout() {
        return userRespToCommFieldLayout;
    }

}
