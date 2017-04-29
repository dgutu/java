/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.category.column;

import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.component.common.HtmlLabelComponent;
import com.proximo.inci.component.common.LabelComponent;
import com.proximo.inci.url.UrlResolver;
import com.vaadin.ui.VerticalLayout;

public class EinecsElincsEcNumberFieldLayout extends TradeNameColumnDetailsFieldLayout<VerticalLayout> {

    private LabelComponent einecsElincsEcNumberFieldLabel;
    private HtmlLabelComponent echaLinkHtmlLabel;
    private EinecsElincsEcNumberField einecsElincsEcNumberField;

    public EinecsElincsEcNumberFieldLayout(TradeNameColumnDetails parentColumnDetails) {
        super(parentColumnDetails, null, null);
    }
    
    public EinecsElincsEcNumberFieldLayout(TradeNameColumnDetails parentColumnDetails, Integer fieldTabIndex) {
        super(parentColumnDetails, null, fieldTabIndex);
    }

    @Override
    protected VerticalLayout createMainComponentInstance() {
        return new VerticalLayout();
    }

    @Override
    protected void init() {
        einecsElincsEcNumberFieldLabel = new LabelComponent("tradeName.detail.einecsElincsEcNumberField");        

        echaLinkHtmlLabel = new HtmlLabelComponent("<div class=\"very-small-text\">"
                + "<a href=" + UrlResolver.getUrl("ehca") + " style=\"color: blue;\" target=\"_blank\">"
                + CaptionResolver.getCaption("tradeName.detail.echaLink") + "</a></div>");

        einecsElincsEcNumberField = new EinecsElincsEcNumberField(this);
    }

    @Override
    protected void addContent() {
        addComponent(einecsElincsEcNumberFieldLabel);
        addComponent(echaLinkHtmlLabel);
        addComponent(einecsElincsEcNumberField);
    }

    public EinecsElincsEcNumberField getEinecsElincsEcNumberField() {
        return einecsElincsEcNumberField;
    }    
}
