/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.search.form.fields.left;

import com.proximo.inci.DOList;
import com.proximo.inci.DOLookupValue;
import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.component.field.AbstractInciFieldComponent;
import com.proximo.inci.component.util.ComponentUtil;
import com.proximo.inci.service.common.LookupService;
import com.proximo.inci.view.tradename.search.form.TradeNameSearchForm;
import com.vaadin.data.Property;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.PopupDateField;

@SuppressWarnings("serial")
public class ExportStatusField extends AbstractInciFieldComponent<ComboBox> {

    protected TradeNameSearchForm parentForm;

    public ExportStatusField(TradeNameSearchForm parentForm) {
        this.parentForm = parentForm;
        
        build();
    }

    @Override
    protected ComboBox createMainComponentInstance() {
        return new ComboBox();
    }

    @Override
    protected void init() {
        mainComponent.setCaption(CaptionResolver.getCaption("tradeName.search.exportStatusField"));
        mainComponent.setWidth(TradeNameSearchForm.FORM_TEXT_FIELD_WIDTH);
        fillExportStatusSelectOptions();
        mainComponent.setNullSelectionAllowed(false);
        mainComponent.select("A");
        mainComponent.setImmediate(true);
        mainComponent.addListener(new Property.ValueChangeListener() {
            @Override
            public void valueChange(ValueChangeEvent event) {
                String newValue = (String) event.getProperty().getValue();
                boolean enabled = !("N".equals(newValue));
                PopupDateField staffReviewDateFromField = parentForm.getSearchFieldsRight()
                        .getStaffReviewDateFromField().getMainComponent();
                if (!enabled) {
                    staffReviewDateFromField.setValue(null);
                    staffReviewDateFromField.setValue(null);
                }
                staffReviewDateFromField.setEnabled(enabled);
                staffReviewDateFromField.setEnabled(enabled);
            }
        });
    }

    private void fillExportStatusSelectOptions() {
        DOList exportStatuses = LookupService.getFormTnExportStatuses();
        for (int i = 0; i < exportStatuses.size(); i++) {
            DOLookupValue lv = (DOLookupValue) exportStatuses.elementAt(i);
            ComponentUtil.addItemWithCaption(mainComponent, lv.keyValue, lv.keyDesc);
        }
    }

    @Override
    public String getFieldDescription() {
        return "";
    }

}
