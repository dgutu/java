/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.header.sub;

import com.proximo.inci.DOTradeName;
import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.common.TemplarUtil;
import com.proximo.inci.component.field.AbstractInciFieldComponent;
import com.proximo.inci.view.tradename.detail.mode.TradeNameDetailViewMode;
import com.vaadin.ui.TextArea;

public class IngredientDescriptionField extends AbstractInciFieldComponent<TextArea> {

    private IngredientTypeOptionGroupLayout parentLayout;

    public IngredientDescriptionField(IngredientTypeOptionGroupLayout parentLayout) {
        this.parentLayout = parentLayout;

        build();
    }

    @Override
    protected TextArea createMainComponentInstance() {
        return new TextArea();
    }

    @Override
    protected void init() {
        mainComponent.addStyleName("description");
        mainComponent.setHeight("70px");
        mainComponent.setWidth("635px");
        mainComponent.setMaxLength(4000);
    }

    public void refresh(String ingredientTypeOption) {
        if ("AB".equals(ingredientTypeOption)) {
            setEnabled(true);
            mainComponent.focus();
        } else {
            setEnabled(false);
            setValue("");
        }
    }

    @Override
    public void generateContent() {
        DOTradeName formTn = parentLayout.getParentHeader().getParentHeader().getParentView().getFormTn();
        String ingredientTypeOption = formTn.ingredient;
        String description = TemplarUtil.convertNonEnglishCharsToEnglish(formTn.ingredDesc);
        TradeNameDetailViewMode mode = parentLayout.getParentHeader().getParentHeader().getParentView().getMode();

        if (TradeNameDetailViewMode.READ.equals(mode)) {
            setEnabled(false);
        } else {
            if ("AB".equals(ingredientTypeOption)) {
                setEnabled(true);
            }

            if (TradeNameDetailViewMode.CREATE.equals(mode)) {
                setValue("");
            }
        }

        setValue(description);
    }

    @Override
    public String getFieldDescription() {
        return CaptionResolver.getCaption("tradeName.detail.header.ingredientDescriptionField.DESC");
    }

}
