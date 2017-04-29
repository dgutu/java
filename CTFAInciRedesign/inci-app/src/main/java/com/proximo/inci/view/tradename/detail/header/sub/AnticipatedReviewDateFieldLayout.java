/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.header.sub;

import com.proximo.inci.component.AbstractInciComponentLayout;
import com.proximo.inci.component.common.LabelComponent;
import com.proximo.inci.component.util.ComponentUtil;
import com.proximo.inci.service.security.SecurityInfo;
import com.proximo.inci.view.tradename.detail.button.SendEmailAntcpDtRelatedButton;
import com.proximo.inci.view.tradename.detail.mode.TradeNameDetailViewMode;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.VerticalLayout;

public class AnticipatedReviewDateFieldLayout extends AbstractInciComponentLayout<VerticalLayout> {
    
    private IngredientTypeSelectionHeader parentHeader;
    
    private LabelComponent anticipatedReviewDateLabel;
    private AnticipatedReviewDateField anticipatedReviewDateField;
    private SendEmailAntcpDtRelatedButton sendEmailButton;
    
    public AnticipatedReviewDateFieldLayout(IngredientTypeSelectionHeader parentHeader) {
        this.parentHeader = parentHeader;
        
        build();
    }

    @Override
    protected VerticalLayout createMainComponentInstance() {
        return new VerticalLayout();
    }

    @Override
    protected void init() {
        mainComponent.setWidth("225px");
        
        anticipatedReviewDateLabel = new LabelComponent("tradeName.detail.header.anticipatedReviewDateField");
        anticipatedReviewDateField = new AnticipatedReviewDateField(this);
        sendEmailButton = new SendEmailAntcpDtRelatedButton(parentHeader.getParentHeader().getParentView());
    }
    
    @Override
    protected void addContent() {
        addSpacing(31);
        
        HorizontalLayout anticipatedReviewDateLabelWrapper = new HorizontalLayout();
        anticipatedReviewDateLabelWrapper.addComponent(anticipatedReviewDateLabel.getMainComponent());
        mainComponent.addComponent(anticipatedReviewDateLabelWrapper);
        mainComponent.setComponentAlignment(anticipatedReviewDateLabelWrapper, Alignment.TOP_RIGHT);
        addSpacing(ComponentUtil.NORMAL_FORM_SPACING_PX);
        
        addComponent(anticipatedReviewDateField, Alignment.TOP_RIGHT);
        addSpacing(ComponentUtil.NORMAL_FORM_SPACING_PX);
        addComponent(sendEmailButton, Alignment.TOP_RIGHT);
    }
    
    @Override    
    public void applySecurityInfo(SecurityInfo securityInfo) {
        TradeNameDetailViewMode mode = parentHeader.getParentHeader().getParentView().getMode();
        boolean editable = !TradeNameDetailViewMode.READ.equals(mode);
        if (editable && securityInfo.getUser().isAdmin()) {
            anticipatedReviewDateField.setEnabled(true);
            sendEmailButton.setVisible(true);
        } else {
            anticipatedReviewDateField.setEnabled(false);
            sendEmailButton.setVisible(false);
        }
    }

    public IngredientTypeSelectionHeader getParentHeader() {
        return parentHeader;
    }

    public AnticipatedReviewDateField getAnticipatedReviewDateField() {
        return anticipatedReviewDateField;
    }

}
