/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.category.ferments;

//import com.proximo.inci.caption.CaptionResolver;
//import com.proximo.inci.component.common.HtmlLabelComponent;
import com.proximo.inci.component.common.LabelComponent;
import com.proximo.inci.view.tradename.detail.category.column.TradeNameColumnDetails;
import com.proximo.inci.view.tradename.detail.category.column.TradeNameColumnDetailsFieldLayout;
import com.vaadin.ui.VerticalLayout;

public class IdentityOfMaterialFieldLayout extends TradeNameColumnDetailsFieldLayout<VerticalLayout> {

    //private HtmlLabelComponent identityOfMaterialFieldLabel;
	private LabelComponent identityOfMaterialFieldLabel;
    private IdentityOfMaterialField identityOfMaterialField;
    private LabelComponent identityOfMaterialFielddDescriptionLabel1;
    private LabelComponent identityOfMaterialFielddDescriptionLabel2;

    public IdentityOfMaterialFieldLayout(TradeNameColumnDetails parentColumnDetails) {
        super(parentColumnDetails, null, null);
    }
    
    public IdentityOfMaterialFieldLayout(TradeNameColumnDetails parentColumnDetails, Integer fieldTabIndex) {
        super(parentColumnDetails, null, fieldTabIndex);
    }

    @Override
    protected VerticalLayout createMainComponentInstance() {
        return new VerticalLayout();
    }

    @Override
    protected void init() {
        /*identityOfMaterialFieldLabel = new HtmlLabelComponent("<div>" + "<span class=\"required-field-label\">"
                + CaptionResolver.getCaption("tradeName.detail.identityOfMaterialField.part1") + "</span>" + "&nbsp;"
                + "<span class=\"very-small-text\">"
                + CaptionResolver.getCaption("tradeName.detail.identityOfMaterialField.part2") + "</span>" + "</div>");*/
    	identityOfMaterialFieldLabel = new LabelComponent("tradeName.detail.identityOfMaterialField", "required-field-label");
        identityOfMaterialFielddDescriptionLabel1 = new LabelComponent("tradeName.detail.identityOfMaterialField.description1", "very-small-text");
        identityOfMaterialFielddDescriptionLabel2 = new LabelComponent("tradeName.detail.identityOfMaterialField.description2", "very-small-text");
        identityOfMaterialField = new IdentityOfMaterialField(this);
    }

    @Override
    protected void addContent() {
        addComponent(identityOfMaterialFieldLabel);
        addComponent(identityOfMaterialFielddDescriptionLabel1);
        addComponent(identityOfMaterialFielddDescriptionLabel2);
        addComponent(identityOfMaterialField);
    }

    public IdentityOfMaterialField getIdentityOfMaterialField() {
        return identityOfMaterialField;
    }

}
