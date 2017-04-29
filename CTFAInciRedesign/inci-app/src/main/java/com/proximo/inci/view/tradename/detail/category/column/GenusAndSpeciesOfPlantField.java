/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.category.column;

import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.view.tradename.detail.category.TradeNameDetails;
import com.vaadin.ui.TextArea;

public class GenusAndSpeciesOfPlantField extends TradeNameColumnDetailsField<TextArea> {

    public GenusAndSpeciesOfPlantField(GenusAndSpeciesOfPlantFieldLayout parentLayout) {
        super(parentLayout);
    }

    @Override
    protected TextArea createMainComponentInstance() {
        return new TradeNameColumnDetailsTextArea(TradeNameDetails.FORM_COLUMN_TEXTAREA_MEDIUM_HEIGHT,
                getParentLayout());
    }
    
    @Override
    protected void init() {
        super.init();
        setRequired(true);
    }

    @Override
    public void generateContent() {
        super.generateContent();
        setValue(getParentLayout().getParentColumnDetails().getParentDetails().getParentView()
                .getFormTn().genus);
    }

    @Override
    public String getFieldDescription() {
        return CaptionResolver.getCaption("tradeName.detail.genusAndSpeciesOfPlantField.DESC");
    }
    
}
