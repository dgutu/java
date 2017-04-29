/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.header.sub;

import com.proximo.inci.component.AbstractInciComponentLayout;
import com.proximo.inci.component.common.LabelComponent;
import com.vaadin.ui.VerticalLayout;

public class IngredientTypeOptionGroupLayout extends AbstractInciComponentLayout<VerticalLayout> {
    
    private IngredientTypeSelectionHeader parentHeader;

    private LabelComponent ingredientTypeOptionGroupLabel;
    private IngredientTypeOptionGroup ingredientTypeOptionGroup;
    private LabelComponent ingredientDescriptionLabel;
    private IngredientDescriptionField ingredientDescriptionField;

    public IngredientTypeOptionGroupLayout(IngredientTypeSelectionHeader parentHeader) {
        this.parentHeader = parentHeader;
        
        build();
    }

    @Override
    protected VerticalLayout createMainComponentInstance() {
        return new VerticalLayout();
    }

    @Override
    protected void init() {
        mainComponent.setWidth("640px");
        mainComponent.setMargin(false);
        
        ingredientTypeOptionGroupLabel = new LabelComponent(
                "tradeName.detail.header.ingredientTypeSelectionHeader.caption", "required-field-label");
        ingredientTypeOptionGroup = new IngredientTypeOptionGroup(this);
        ingredientDescriptionLabel = new LabelComponent(
                "tradeName.detail.header.ingredientDescriptionLabel", "very-small-text");        
        ingredientDescriptionField = new IngredientDescriptionField(this);
    }

    @Override
    protected void addContent() {
        addComponent(ingredientTypeOptionGroupLabel);
        addComponent(ingredientTypeOptionGroup);
        addComponent(ingredientDescriptionLabel);
        addComponent(ingredientDescriptionField);
    }

    public IngredientTypeSelectionHeader getParentHeader() {
        return parentHeader;
    }

    public IngredientDescriptionField getIngredientDescriptionField() {
        return ingredientDescriptionField;
    }

    public IngredientTypeOptionGroup getIngredientTypeOptionGroup() {
        return ingredientTypeOptionGroup;
    }
    
}
