/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

//package com.proximo.inci.view.tradename.detail.category.column;

package com.proximo.inci.view.tradename.detail.extra;

import com.proximo.inci.component.common.LabelComponent;
import com.proximo.inci.view.tradename.detail.TradeNameDetailView;
import com.proximo.inci.view.tradename.detail.extra.TradeNameExtraDetailsComponentLayout;
//import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.VerticalLayout;
import com.proximo.inci.view.tradename.detail.extra.TradeNameExtraDetails;

public class MonoIdFieldLayout extends TradeNameExtraDetailsComponentLayout<VerticalLayout> {

    private LabelComponent monoIdFieldLabel;
    private LabelComponent monoIdFieldLabelDescr;
    private MonoIdField monoIdField;

    public MonoIdFieldLayout(TradeNameExtraDetails parentDetails) {
        super(parentDetails);
    }

    @Override
    protected VerticalLayout createMainComponentInstance() {
        return new VerticalLayout();
    }

    @Override
    protected void init() {
        monoIdFieldLabel = new LabelComponent("tradeName.detail.monoIdField");
        //monoIdFieldLabel.setAdminComponent(true); // by client this is not required field
        
        monoIdFieldLabelDescr = new LabelComponent("tradeName.detail.monoIdField.DESCR", "very-small-text");
        monoIdField = new MonoIdField(this);
        //monoIdField.setAdminComponent(true); // by client this is not required field        
    }
    

    @Override
    public void generateContent() {
        super.generateContent();
        
        TradeNameDetailView parentView = getParentDetails().getParentView();        
        
        monoIdFieldLabel.setVisible(parentView.getCurrentSecurityInfo().getUser().isAdmin());
        monoIdFieldLabelDescr.setVisible(parentView.getCurrentSecurityInfo().getUser().isAdmin());
        monoIdField.setVisible(parentView.getCurrentSecurityInfo().getUser().isAdmin());        
    }    

    @Override
    protected void addContent() {
        addComponent(monoIdFieldLabel);
        addComponent(monoIdFieldLabelDescr);
        addComponent(monoIdField);        
    }

    public MonoIdField getMonoIdField() {
        return monoIdField;
    }

}
