/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.category.column;

//import com.proximo.inci.caption.CaptionResolver;
//import com.proximo.inci.component.common.HtmlLabelComponent;
import com.proximo.inci.component.common.LabelComponent;
import com.vaadin.ui.VerticalLayout;

public class GenusAndSpeciesOfPlantFieldLayout extends TradeNameColumnDetailsFieldLayout<VerticalLayout> {

    //private HtmlLabelComponent genusAndSpeciesOfPlantFieldLabel;
	private LabelComponent genusAndSpeciesOfPlantFieldLabel;
    private LabelComponent genusAndSpeciesOfPlantFieldDescriptionLabel1;
    private LabelComponent genusAndSpeciesOfPlantFieldDescriptionLabel2;
    private LabelComponent genusAndSpeciesOfPlantFieldDescriptionLabel3;
    private LabelComponent genusAndSpeciesOfPlantFieldDescriptionLabel4;
    private LabelComponent genusAndSpeciesOfPlantFieldDescriptionLabel5;
    private LabelComponent genusAndSpeciesOfPlantFieldDescriptionLabel6;
    private GenusAndSpeciesOfPlantField genusAndSpeciesOfPlantField;

    public GenusAndSpeciesOfPlantFieldLayout(TradeNameColumnDetails parentColumnDetails) {
        super(parentColumnDetails, null, null);
    }
    
    public GenusAndSpeciesOfPlantFieldLayout(TradeNameColumnDetails parentColumnDetails, Integer fieldTabIndex) {
        super(parentColumnDetails, null, fieldTabIndex);
    }

    @Override
    protected VerticalLayout createMainComponentInstance() {
        return new VerticalLayout();
    }

    @Override
    protected void init() {
        /*genusAndSpeciesOfPlantFieldLabel = new HtmlLabelComponent("<div>" + "<span class=\"required-field-label\">"
                + CaptionResolver.getCaption("tradeName.detail.genusAndSpeciesOfPlantField.part1") + "</span>"
                + "&nbsp;" + "<span class=\"very-small-text\">"
                + CaptionResolver.getCaption("tradeName.detail.genusAndSpeciesOfPlantField.part2") + "</span>"
                + "</div>");*/
        genusAndSpeciesOfPlantFieldLabel = new LabelComponent("tradeName.detail.genusAndSpeciesOfPlantField", "required-field-label");
        genusAndSpeciesOfPlantFieldDescriptionLabel1 = new LabelComponent("tradeName.detail.genusAndSpeciesOfPlantField.description1", "very-small-text");
        genusAndSpeciesOfPlantFieldDescriptionLabel2 = new LabelComponent("tradeName.detail.genusAndSpeciesOfPlantField.description2", "very-small-text");
        genusAndSpeciesOfPlantFieldDescriptionLabel3 = new LabelComponent("tradeName.detail.genusAndSpeciesOfPlantField.description3", "very-small-text");
        genusAndSpeciesOfPlantFieldDescriptionLabel4 = new LabelComponent("tradeName.detail.genusAndSpeciesOfPlantField.description4", "very-small-text");
        genusAndSpeciesOfPlantFieldDescriptionLabel5 = new LabelComponent("tradeName.detail.genusAndSpeciesOfPlantField.description5", "very-small-text");
        genusAndSpeciesOfPlantFieldDescriptionLabel6 = new LabelComponent("tradeName.detail.genusAndSpeciesOfPlantField.description6", "very-small-text");
        genusAndSpeciesOfPlantField = new GenusAndSpeciesOfPlantField(this);
    }

    @Override
    protected void addContent() {
        addComponent(genusAndSpeciesOfPlantFieldLabel);
        addComponent(genusAndSpeciesOfPlantFieldDescriptionLabel1);
        addComponent(genusAndSpeciesOfPlantFieldDescriptionLabel2);
        addComponent(genusAndSpeciesOfPlantFieldDescriptionLabel3);
        addComponent(genusAndSpeciesOfPlantFieldDescriptionLabel4);
        addComponent(genusAndSpeciesOfPlantFieldDescriptionLabel5);
        addComponent(genusAndSpeciesOfPlantFieldDescriptionLabel6);
        addComponent(genusAndSpeciesOfPlantField);
    }

    public GenusAndSpeciesOfPlantField getGenusAndSpeciesOfPlantField() {
        return genusAndSpeciesOfPlantField;
    }

}
