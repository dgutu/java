/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.security.user.search.result;

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
        Embedded viewPic = new Embedded(null, new ThemeResource("images/view.gif"));
        hz.addComponent(viewPic);
        Label viewPicInfo = new Label(CaptionResolver.getCaption("view.security.user.search.table.legend.viewPicInfo"));
        viewPicInfo.addStyleName("very-small-text");
        hz.addComponent(viewPicInfo);
        hz.setComponentAlignment(viewPicInfo, Alignment.BOTTOM_LEFT);
        ComponentUtil.addSpace(hz, 5);
        mainComponent.addComponent(hz);
        mainComponent.setComponentAlignment(hz, Alignment.MIDDLE_RIGHT);
    }

}
