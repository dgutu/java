/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.search.form.fields.right;

import com.proximo.inci.DOList;
import com.proximo.inci.DOLookupValue;
import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.component.field.AbstractInciFieldComponent;
import com.proximo.inci.component.util.ComponentUtil;
import com.proximo.inci.service.common.LookupService;
import com.proximo.inci.view.tradename.search.form.TradeNameSearchForm;
import com.vaadin.ui.ComboBox;

public class SubmissionStatusField extends AbstractInciFieldComponent<ComboBox> {

    public SubmissionStatusField() {
        build();
    }

    @Override
    protected ComboBox createMainComponentInstance() {
        return new ComboBox();
    }

    @Override
    protected void init() {
        mainComponent.setCaption(CaptionResolver.getCaption("tradeName.search.submissionStatusField"));
        mainComponent.setWidth(TradeNameSearchForm.FORM_TEXT_FIELD_WIDTH);
        fillSubmissionStatusSelectOptions();
    }

    private void fillSubmissionStatusSelectOptions() {
        DOList submissionStatuses = LookupService.getFormTnSubmissionStatuses();
        for (int i = 0; i < submissionStatuses.size(); i++) {
            DOLookupValue lv = (DOLookupValue) submissionStatuses.elementAt(i);
            ComponentUtil.addItemWithCaption(mainComponent, lv.keyValue, lv.keyDesc);
        }
    }

    @Override
    public String getFieldDescription() {
        return "";
    }
}
