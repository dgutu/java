/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.header.sub;

import com.proximo.inci.component.AbstractInciComponentLayout;
import com.proximo.inci.view.tradename.detail.TradeNameDetailView;
import com.proximo.inci.view.tradename.detail.header.TradeNameDetailViewHeader;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.HorizontalLayout;

public class IngredientTypeSelectionHeader extends AbstractInciComponentLayout<HorizontalLayout> {

    private TradeNameDetailViewHeader parentHeader;

    private IngredientTypeOptionGroupLayout ingredientTypeOptionGroupLayout;
    private AnticipatedReviewDateFieldLayout anticipatedReviewDateFieldLayout;

    public IngredientTypeSelectionHeader(TradeNameDetailViewHeader parentHeader) {
        this.parentHeader = parentHeader;

        build();
    }

    @Override
    protected HorizontalLayout createMainComponentInstance() {
        return new HorizontalLayout();
    }

    @Override
    protected void init() {
        mainComponent.setMargin(true);
        mainComponent.setSpacing(true);

        mainComponent.addStyleName("grayBackgroundColor");
        mainComponent.addStyleName("roundedCorners");

        ingredientTypeOptionGroupLayout = new IngredientTypeOptionGroupLayout(this);
        ingredientTypeOptionGroupLayout.getIngredientDescriptionField().getMainComponent().setTabIndex(1);
        
        anticipatedReviewDateFieldLayout = new AnticipatedReviewDateFieldLayout(this);
        anticipatedReviewDateFieldLayout.getAnticipatedReviewDateField().getMainComponent().setTabIndex(2);
    }

    @Override
    protected void addContent() {
        addComponent(ingredientTypeOptionGroupLayout);
        addComponent(anticipatedReviewDateFieldLayout, Alignment.TOP_RIGHT);
    }

    public TradeNameDetailViewHeader getParentHeader() {
        return parentHeader;
    }

    public IngredientTypeOptionGroupLayout getIngredientTypeOptionGroupLayout() {
        return ingredientTypeOptionGroupLayout;
    }

    public AnticipatedReviewDateFieldLayout getAnticipatedReviewDateFieldLayout() {
        return anticipatedReviewDateFieldLayout;
    }
    
    @Override
    public void generateContent() {
    	super.generateContent();
    	
        TradeNameDetailView parentView = parentHeader.getParentView();

    	/*
    	 * when the flag is 'Y', but the application already has a submit date, the only fields the user can edit 
    	 * is the user response and/or upload new attachments,
    	 * all other fields should be read-only
    	 */
    	
    	if (parentView.isEditable() && 
    			!parentView.getCurrentSecurityInfo().getUser().isAdmin() && 
    			parentView.getFormTn().submitted && parentView.getFormTn().editable)
    		this.setEnabled(false);        
    	else
    		this.setEnabled(parentView.isEditable());
    }    

}
