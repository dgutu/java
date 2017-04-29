/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.category.inorganic;

import com.proximo.inci.component.common.HtmlLabelComponent;
import com.proximo.inci.component.common.LabelComponent;
import com.proximo.inci.url.UrlResolver;
import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.view.tradename.detail.category.column.ManufacturingMethodField;
import com.proximo.inci.view.tradename.detail.category.column.TradeNameColumnDetails;
import com.proximo.inci.view.tradename.detail.category.column.TradeNameColumnDetailsFieldLayout;
import com.vaadin.ui.VerticalLayout;

public class InorganicMineralBasedManufacturingMethodFieldLayout extends
        TradeNameColumnDetailsFieldLayout<VerticalLayout> {

    private LabelComponent manufacturingMethodFieldLabel;
    private HtmlLabelComponent linkHtmlLabel;
    private ManufacturingMethodField manufacturingMethodField;

    public InorganicMineralBasedManufacturingMethodFieldLayout(TradeNameColumnDetails parentColumnDetails) {
        super(parentColumnDetails, null, null);
    }
    
    public InorganicMineralBasedManufacturingMethodFieldLayout(TradeNameColumnDetails parentColumnDetails,
            Integer fieldTabIndex) {
        super(parentColumnDetails, null, fieldTabIndex);
    }

    @Override
    protected VerticalLayout createMainComponentInstance() {
        return new VerticalLayout();
    }

    @Override
    protected void init() {
        manufacturingMethodFieldLabel = new LabelComponent("tradeName.detail.manufacturingMethodField",
                "required-field-label");
        
        linkHtmlLabel = new HtmlLabelComponent("<div class=\"very-small-text\">" +
                CaptionResolver.getCaption("tradeName.detail.manufacturingMethodField.inorganic.description1") + "<br>" +
                CaptionResolver.getCaption("tradeName.detail.manufacturingMethodField.inorganic.description2") + "<br>" +
                CaptionResolver.getCaption("tradeName.detail.manufacturingMethodField.inorganic.description3") + "<br>" +
                CaptionResolver.getCaption("tradeName.detail.manufacturingMethodField.inorganic.description4") + "<br>" +
                CaptionResolver.getCaption("tradeName.detail.manufacturingMethodField.inorganic.description5") + "&nbsp;" +                
                "<a href=" +
                UrlResolver.getUrl("icdd") + " style=\"color: red;\" target=\"_blank\">" +
                CaptionResolver.getCaption("tradeName.detail.manufacturingMethodField.inorganic.link") + "</a>)</div>");        
        

        manufacturingMethodField = new ManufacturingMethodField(this);
        manufacturingMethodField.setRequired(true);
    }

    @Override
    protected void addContent() {
        addComponent(manufacturingMethodFieldLabel);
        addComponent(linkHtmlLabel);
        addComponent(manufacturingMethodField);
    }

    public ManufacturingMethodField getManufacturingMethodField() {
        return manufacturingMethodField;
    }

}
