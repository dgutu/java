/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.category.bio;

import com.proximo.inci.component.common.HtmlLabelComponent;
import com.proximo.inci.component.common.LabelComponent;
import com.proximo.inci.url.UrlResolver;
import com.proximo.inci.view.tradename.detail.category.column.EmpiricalFormulaField;
import com.proximo.inci.view.tradename.detail.category.column.TradeNameColumnDetails;
import com.proximo.inci.view.tradename.detail.category.column.TradeNameColumnDetailsFieldLayout;
import com.vaadin.ui.VerticalLayout;

public class BioEmpiricalFormulaFieldLayout extends TradeNameColumnDetailsFieldLayout<VerticalLayout> {

    private LabelComponent empiricalFormulaFieldLabel;
    private HtmlLabelComponent linkHtmlLabel1;
    private HtmlLabelComponent linkHtmlLabel2;
    private EmpiricalFormulaField empiricalFormulaField;
    private LabelComponent empiricalFormulaFieldDescriptionLabel1;
    private LabelComponent empiricalFormulaFieldDescriptionLabel2;
    private LabelComponent empiricalFormulaFieldDescriptionLabel3;
    private LabelComponent empiricalFormulaFieldDescriptionLabel4;
    

    public BioEmpiricalFormulaFieldLayout(TradeNameColumnDetails parentColumnDetails) {
        super(parentColumnDetails, null, null);
    }
    
    public BioEmpiricalFormulaFieldLayout(TradeNameColumnDetails parentColumnDetails, Integer fieldTabIndex) {
        super(parentColumnDetails, null, fieldTabIndex);
    }

    @Override
    protected VerticalLayout createMainComponentInstance() {
        return new VerticalLayout();
    }

    @Override
    protected void init() {
        empiricalFormulaFieldLabel = new LabelComponent("view.trade_name.detail.empirical_formula.biotech");
        
        empiricalFormulaFieldDescriptionLabel1 = new LabelComponent("view.trade_name.detail.empirical_formula.biotech.descr1", "very-small-text");
        empiricalFormulaFieldDescriptionLabel2 = new LabelComponent("view.trade_name.detail.empirical_formula.biotech.descr2", "very-small-text");
        empiricalFormulaFieldDescriptionLabel3 = new LabelComponent("view.trade_name.detail.empirical_formula.biotech.descr3", "very-small-text");
        empiricalFormulaFieldDescriptionLabel4 = new LabelComponent("view.trade_name.detail.empirical_formula.biotech.descr4", "very-small-text");

        linkHtmlLabel1 = new HtmlLabelComponent("<div class=\"very-small-text\">" + "<a href="
                + UrlResolver.getUrl("uniprot") + " style=\"color: red;\" target=\"_blank\">" + UrlResolver.getUrl("uniprot")
                + "</a></div>");
        
        linkHtmlLabel2 = new HtmlLabelComponent("<div class=\"very-small-text\">" + "<a href="
                + UrlResolver.getUrl("entrez") + " style=\"color: red;\" target=\"_blank\">" + UrlResolver.getUrl("entrez")
                + "</a> under it.</div>");


        empiricalFormulaField = new EmpiricalFormulaField(this);
    }

    @Override
    protected void addContent() {
        addComponent(empiricalFormulaFieldLabel);
        addComponent(empiricalFormulaFieldDescriptionLabel1);
        addComponent(empiricalFormulaFieldDescriptionLabel2);
        addComponent(empiricalFormulaFieldDescriptionLabel3);        
        addComponent(linkHtmlLabel1);
        addComponent(empiricalFormulaFieldDescriptionLabel4);
        addComponent(linkHtmlLabel2);
        addComponent(empiricalFormulaField);
    }

    public EmpiricalFormulaField getEmpiricalFormulaField() {
        return empiricalFormulaField;
    }

}
