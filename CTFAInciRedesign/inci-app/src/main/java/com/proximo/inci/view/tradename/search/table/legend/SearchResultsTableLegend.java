/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.search.table.legend;

import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.component.AbstractInciComponentLayout;
import com.proximo.inci.component.util.ComponentUtil;
import com.vaadin.terminal.ThemeResource;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Embedded;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

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
        // TODO (LOW) refactor into components if needed

        HorizontalLayout hz1 = new HorizontalLayout();
        VerticalLayout hz1v1 = new VerticalLayout();
        hz1v1.setSpacing(false);
        hz1v1.setMargin(false);
        Label yellowInfo = new Label(CaptionResolver.getCaption("tradeName.search.table.legend.yellowInfo"));
        yellowInfo.addStyleName("very-small-text");
        hz1v1.addComponent(yellowInfo);
        Label blueGreyInfo = new Label(CaptionResolver.getCaption("tradeName.search.table.legend.blueGreyInfo"));
        blueGreyInfo.addStyleName("very-small-text");
        hz1v1.addComponent(blueGreyInfo);
        Label turquoiseInfo = new Label(CaptionResolver.getCaption("tradeName.search.table.legend.turquoiseInfo"));
        turquoiseInfo.addStyleName("very-small-text");
        hz1v1.addComponent(turquoiseInfo);
        Label orangeInfo = new Label(CaptionResolver.getCaption("tradeName.search.table.legend.orangeInfo"));
        orangeInfo.addStyleName("very-small-text");
        hz1v1.addComponent(orangeInfo);

        hz1.addComponent(hz1v1);
        mainComponent.addComponent(hz1);
        mainComponent.setComponentAlignment(hz1, Alignment.MIDDLE_LEFT);

        HorizontalLayout hz2 = new HorizontalLayout();
        Embedded viewPic = new Embedded(null, new ThemeResource("images/view.gif"));
        hz2.addComponent(viewPic);
        Label viewPicInfo = new Label(CaptionResolver.getCaption("tradeName.search.table.legend.viewPicInfo"));
        viewPicInfo.addStyleName("very-small-text");
        hz2.addComponent(viewPicInfo);
        hz2.setComponentAlignment(viewPicInfo, Alignment.BOTTOM_LEFT);
        ComponentUtil.addSpace(hz2, 5);
        Embedded editPic = new Embedded(null, new ThemeResource("images/edit.gif"));
        hz2.addComponent(editPic);
        Label editPicInfo = new Label(CaptionResolver.getCaption("tradeName.search.table.legend.editPicInfo"));
        editPicInfo.addStyleName("very-small-text");
        hz2.addComponent(editPicInfo);
        hz2.setComponentAlignment(editPicInfo, Alignment.BOTTOM_LEFT);
        mainComponent.addComponent(hz2);
        mainComponent.setComponentAlignment(hz2, Alignment.MIDDLE_RIGHT);
    }

}
