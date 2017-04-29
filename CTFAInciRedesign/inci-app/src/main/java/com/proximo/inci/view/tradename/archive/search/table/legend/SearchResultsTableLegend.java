/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.archive.search.table.legend;

import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.view.tradename.archive.search.AbstractTradeNameArchiveView;
import com.vaadin.terminal.ThemeResource;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Embedded;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;

public class SearchResultsTableLegend extends AbstractSearchResultsTableLegend {

    public SearchResultsTableLegend(AbstractTradeNameArchiveView parentView) {
        super(parentView);
    }

    @Override
    protected void addContent() {
        HorizontalLayout hz2 = new HorizontalLayout();
        Embedded viewPic = new Embedded(null, new ThemeResource("images/view.gif"));
        hz2.addComponent(viewPic);
        Label viewPicInfo = new Label(
                CaptionResolver.getCaption("view.trade_name.archive.search.table.legend.view_pic_info"));
        viewPicInfo.addStyleName("very-small-text");
        hz2.addComponent(viewPicInfo);
        hz2.setComponentAlignment(viewPicInfo, Alignment.BOTTOM_LEFT);

        mainComponent.addComponent(hz2);
        mainComponent.setComponentAlignment(hz2, Alignment.MIDDLE_RIGHT);
    }

}
