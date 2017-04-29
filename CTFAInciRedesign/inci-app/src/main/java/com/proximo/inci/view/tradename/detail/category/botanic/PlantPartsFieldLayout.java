/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.category.botanic;

import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.component.common.HtmlLabelComponent;
import com.proximo.inci.view.tradename.detail.category.column.TradeNameColumnDetails;
import com.proximo.inci.view.tradename.detail.category.column.TradeNameColumnDetailsFieldLayout;
import com.vaadin.ui.VerticalLayout;

public class PlantPartsFieldLayout extends TradeNameColumnDetailsFieldLayout<VerticalLayout> {

    private HtmlLabelComponent plantPartsFieldLabel;
    private PlantPartsField plantPartsField;

    public PlantPartsFieldLayout(TradeNameColumnDetails parentColumnDetails) {
        super(parentColumnDetails, null, null);
    }
    
    public PlantPartsFieldLayout(TradeNameColumnDetails parentColumnDetails, Integer fieldTabIndex) {
        super(parentColumnDetails, null, fieldTabIndex);
    }

    @Override
    protected VerticalLayout createMainComponentInstance() {
        return new VerticalLayout();
    }

    @Override
    protected void init() {
        plantPartsFieldLabel = new HtmlLabelComponent("<div>" + "<span class=\"required-field-label\">"
                + CaptionResolver.getCaption("tradeName.detail.plantPartsField.part1") + "</span>" + "&nbsp;"
                + "<span class=\"very-small-text\">"
                + CaptionResolver.getCaption("tradeName.detail.plantPartsField.part2") + "</span>" + "</div>");
        plantPartsField = new PlantPartsField(this);
    }

    @Override
    protected void addContent() {
        addComponent(plantPartsFieldLabel);
        addComponent(plantPartsField);
    }

    public PlantPartsField getPlantPartsField() {
        return plantPartsField;
    }

}
