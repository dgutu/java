/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.archive.move.table.legend;

import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.component.util.ButtonWidth;
import com.proximo.inci.component.util.ComponentUtil;
import com.proximo.inci.view.tradename.archive.move.TradeNameArchiveMoveView;
import com.proximo.inci.view.tradename.archive.search.AbstractTradeNameArchiveView;
import com.proximo.inci.view.tradename.archive.search.table.legend.AbstractSearchResultsTableLegend;
import com.vaadin.data.Property;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.terminal.ThemeResource;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.Embedded;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;

@SuppressWarnings("serial")
public class SearchResultsTableLegend extends AbstractSearchResultsTableLegend {
	
	//protected CheckBox selectAllCheckBox; 
	
    public SearchResultsTableLegend(AbstractTradeNameArchiveView parentView) {
        super(parentView);
    }

    @Override
    protected void addContent() {
        HorizontalLayout hz = new HorizontalLayout();

        /* view pic */
        Embedded viewPic = new Embedded(null, new ThemeResource("images/view.gif"));
        hz.addComponent(viewPic);
        Label viewPicInfo = new Label(
                CaptionResolver.getCaption("view.trade_name.archive.search.table.legend.view_pic_info"));
        viewPicInfo.addStyleName("very-small-text");
        hz.addComponent(viewPicInfo);
        hz.setComponentAlignment(viewPicInfo, Alignment.MIDDLE_LEFT);
        
        ComponentUtil.addSpace(hz, 3);

        /* move-to button */
        Button moveToButton = ComponentUtil.createActionButton("view.trade_name.archive.move.move_to_btn",
                new Button.ClickListener() {
                    @Override
                    public void buttonClick(ClickEvent event) {
                        ((TradeNameArchiveMoveView) parentView).handleMoveToArchive();
                    }
                }, ButtonWidth.XXLARGE);
        hz.addComponent(moveToButton);
        hz.setComponentAlignment(moveToButton, Alignment.MIDDLE_RIGHT);

        ComponentUtil.addSpace(hz);
        
        /* select all check box */
        /*final CheckBox */selectAllCheckBox = new CheckBox(CaptionResolver.getCaption("select_all"));
        selectAllCheckBox.setValue(false);
        selectAllCheckBox.setImmediate(true);
        selectAllCheckBox.addListener(new Property.ValueChangeListener() {
            @Override
            public void valueChange(ValueChangeEvent event) {
                ((TradeNameArchiveMoveView) parentView).handleSelectAll((Boolean)selectAllCheckBox.getValue());                
            }
        });
        hz.addComponent(selectAllCheckBox);
        hz.setComponentAlignment(selectAllCheckBox, Alignment.MIDDLE_RIGHT);

        mainComponent.addComponent(hz);
        mainComponent.setComponentAlignment(hz, Alignment.MIDDLE_RIGHT);
    }
    
    @Override
    public void generateContent() {
    	selectAllCheckBox.setValue(false);
    }
}
