/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.category.botanic.column;

import com.proximo.inci.view.tradename.detail.category.TradeNameDetails;
import com.proximo.inci.view.tradename.detail.category.botanic.BotanicalsTradeNameDetails;
import com.proximo.inci.view.tradename.detail.category.botanic.TypeOfPreparationFieldLayout;
import com.proximo.inci.view.tradename.detail.category.column.AdminCommentsFieldLayout;
import com.proximo.inci.view.tradename.detail.category.column.NomenclatureFieldLayout;
import com.proximo.inci.view.tradename.detail.category.column.OtherFunctionsFieldLayout;
import com.proximo.inci.view.tradename.detail.category.column.SolventsOrDiluentsFieldLayout;
import com.proximo.inci.view.tradename.detail.category.column.TradeNameColumnDetails;

public class BotanicalsThirdColumnDetails extends TradeNameColumnDetails {

    private NomenclatureFieldLayout nomenclatureFieldLayout;
    private OtherFunctionsFieldLayout otherFunctionsFieldLayout;
    private TypeOfPreparationFieldLayout typeOfPreparationFieldLayout;
    private SolventsOrDiluentsFieldLayout solventsOrDiluentsFieldLayout;
    private AdminCommentsFieldLayout adminCommentsFieldLayout;

    public BotanicalsThirdColumnDetails(BotanicalsTradeNameDetails parentDetails) {
        super(parentDetails);
    }

    @Override
    protected void init() {
        nomenclatureFieldLayout = new NomenclatureFieldLayout(this, "141px", 5);
        otherFunctionsFieldLayout = new OtherFunctionsFieldLayout(this, 10);
        typeOfPreparationFieldLayout = new TypeOfPreparationFieldLayout(this, 13);
        solventsOrDiluentsFieldLayout = new SolventsOrDiluentsFieldLayout(this, 16);
        adminCommentsFieldLayout = new AdminCommentsFieldLayout(this, 19);
    }

    @Override
    protected void addContent() {    	
    	addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
    	addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
    	addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        addComponent(nomenclatureFieldLayout);
        //addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        addComponent(otherFunctionsFieldLayout);
        addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        addComponent(typeOfPreparationFieldLayout);
        addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);        
        addComponent(solventsOrDiluentsFieldLayout);
        addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        addSpacing(TradeNameDetails.DEFAULT_DESCRIPTION_LABEL_HEIGHT_PX);
        addComponent(adminCommentsFieldLayout);
    }

    public OtherFunctionsFieldLayout getOtherFunctionsFieldLayout() {
        return otherFunctionsFieldLayout;
    }

    public NomenclatureFieldLayout getNomenclatureFieldLayout() {
        return nomenclatureFieldLayout;
    }

    public TypeOfPreparationFieldLayout getTypeOfPreparationFieldLayout() {
        return typeOfPreparationFieldLayout;
    }

    public SolventsOrDiluentsFieldLayout getSolventsOrDiluentsFieldLayout() {
        return solventsOrDiluentsFieldLayout;
    }

    public AdminCommentsFieldLayout getAdminCommentsFieldLayout() {
        return adminCommentsFieldLayout;
    }

}
