/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.header.sub;

import com.proximo.inci.DOList;
import com.proximo.inci.DOLookupValue;
import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.component.field.AbstractInciFieldComponent;
import com.proximo.inci.component.util.ComponentUtil;
import com.proximo.inci.service.common.LookupService;
import com.proximo.inci.view.tradename.detail.TradeNameDetailView;
import com.proximo.inci.view.tradename.detail.mode.TradeNameDetailViewMode;
import com.vaadin.data.Property;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.ui.OptionGroup;

@SuppressWarnings("serial")
public class IngredientTypeOptionGroup extends AbstractInciFieldComponent<OptionGroup> {

    private IngredientTypeOptionGroupLayout parentLayout;

    public IngredientTypeOptionGroup(IngredientTypeOptionGroupLayout parentLayout) {
        this.parentLayout = parentLayout;

        build();
    }

    @Override
    protected OptionGroup createMainComponentInstance() {
        return new OptionGroup();
    }

    @Override
    protected void init() {
        mainComponent.addStyleName("horizontal");
        fillOptions();
        mainComponent.setImmediate(true);
        mainComponent.addListener(createValueChangeListener());
        setRequired(true);
    }

    private void fillOptions() {
        DOList subCategories = LookupService.getFormTnSubCategories();
        for (int i = 0; i < subCategories.size(); i++) {
            DOLookupValue lv = (DOLookupValue) subCategories.elementAt(i);
            ComponentUtil.addItemWithCaption(mainComponent, lv.keyValue, lv.keyDesc);
        }
    }

    private Property.ValueChangeListener createValueChangeListener() {
        return new Property.ValueChangeListener() {
            @Override
            public void valueChange(ValueChangeEvent event) {
                String newValue = (String) event.getProperty().getValue();
                parentLayout.getParentHeader().getIngredientTypeOptionGroupLayout().getIngredientDescriptionField()
                        .refresh(newValue);
            }
        };
    }

    @Override
    public void generateContent() {
        TradeNameDetailView parentView = parentLayout.getParentHeader().getParentHeader().getParentView();
        TradeNameDetailViewMode mode = parentView.getMode();

        if (TradeNameDetailViewMode.CREATE.equals(mode)) {
            setValue(null);
        } else {
            setValue(parentView.getFormTn().ingredient);
        }

        setEnabled(parentView.isEditable());
    }

    @Override
    public String getFieldDescription() {
        return CaptionResolver.getCaption("tradeName.detail.header.ingredientTypeOptionGroup.DESC");
    }

}
