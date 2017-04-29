/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.category.column;

import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.common.TemplarUtil;
import com.proximo.inci.view.tradename.detail.category.TradeNameDetails;
import com.vaadin.ui.AbstractOrderedLayout;
import com.vaadin.ui.TextArea;

public class SolventsOrDiluentsField extends TradeNameColumnDetailsField<TextArea> {

    public SolventsOrDiluentsField(TradeNameColumnDetailsFieldLayout<? extends AbstractOrderedLayout> parentLayout) {
        super(parentLayout);
    }

    @Override
    protected void init() {
        super.init();
        setRequired(true);
    }

    @Override
    protected TextArea createMainComponentInstance() {
        return new TradeNameColumnDetailsTextArea(TradeNameDetails.FORM_COLUMN_TEXTAREA_MEDIUM_HEIGHT,
                getParentLayout());
    }

    @Override
    public void generateContent() {
        super.generateContent();
        setValue(TemplarUtil.convertNonEnglishCharsToEnglish(getParentLayout().getParentColumnDetails()
                .getParentDetails().getParentView().getFormTn().solvents));
    }

    @Override
    public String getFieldDescription() {
        return CaptionResolver.getCaption("tradeName.detail.solventsOrDiluentsField.DESC");
    }

}
