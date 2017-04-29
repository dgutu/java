/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.admin.payment_clear.search.result;

import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.component.AbstractInciComponentLayout;
import com.proximo.inci.component.util.ComponentUtil;
import com.vaadin.terminal.ThemeResource;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Embedded;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;

public class SearchResultsTableLegend extends AbstractInciComponentLayout<HorizontalLayout> {

    public SearchResultsTableLegend() {
        build();
    }

    @Override
    protected HorizontalLayout createMainComponentInstance() {
        return new HorizontalLayout();
    }

    @Override
    protected void init() {
        mainComponent.setSizeFull();
    }

    @Override
    protected void addContent() {
        HorizontalLayout hz = new HorizontalLayout();
        Embedded clearPic = new Embedded(null, new ThemeResource("images/edit.gif"));
        hz.addComponent(clearPic);
        Label clearPicInfo = new Label(
                CaptionResolver.getCaption("view.admin.payment_clearing.search.table.legend.clear_pic_info"));
        clearPicInfo.addStyleName("very-small-text");
        hz.addComponent(clearPicInfo);
        hz.setComponentAlignment(clearPicInfo, Alignment.BOTTOM_LEFT);
        ComponentUtil.addSpace(hz, 5);
        mainComponent.addComponent(hz);
        mainComponent.setComponentAlignment(hz, Alignment.MIDDLE_RIGHT);
    }

}
