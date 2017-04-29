/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.search.form.fields.left;

import java.util.Date;

import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.common.TDate;
import com.proximo.inci.component.AbstractInciComponentLayout;
import com.proximo.inci.component.common.LabelComponent;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.HorizontalLayout;

public class EntryDatesLayout extends AbstractInciComponentLayout<HorizontalLayout> {

    private EntryDateFromField entryDateFromField;
    private LabelComponent entryDateToFieldCaption;
    private EntryDateToField entryDateToField;

    public EntryDatesLayout() {
        build();
    }

    @Override
    protected HorizontalLayout createMainComponentInstance() {
        return new HorizontalLayout();
    }

    @Override
    protected void init() {
        mainComponent.setCaption(CaptionResolver.getCaption("tradeName.search.entryDateFieldFrom"));

        entryDateFromField = new EntryDateFromField();
        entryDateToFieldCaption = new LabelComponent("tradeName.search.entryDateFieldTo");
        entryDateToField = new EntryDateToField();
    }

    @Override
    protected void addContent() {
        addComponent(entryDateFromField);
        addSpace(3);
        addComponent(entryDateToFieldCaption, Alignment.MIDDLE_CENTER);
        addSpace(3);
        addComponent(entryDateToField);
    }

    public void clear() {
    	entryDateFromField.setValue(null);
    	entryDateToField.setValue(null);
    }

    public Date getEntryDateFromFieldValue() {
        return (Date) entryDateFromField.getValue();
    }
    
    public void setEntryDateFromFieldValue(TDate value) {
    	entryDateFromField.setValue(value.formatIt(6));
    }    

    public Date getEntryDateToFieldValue() {
        return (Date) entryDateToField.getValue();
    }
    
    public void setEntryDateToFieldValue(TDate value) {
    	entryDateToField.setValue(value.formatIt(6));
    }    

    public EntryDateFromField getEntryDateFromField() {
        return entryDateFromField;
    }
    
    public EntryDateToField getEntryDateToField() {
        return entryDateToField;
    }
    

}
