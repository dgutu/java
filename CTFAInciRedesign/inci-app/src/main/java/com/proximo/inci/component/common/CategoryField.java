/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.component.common;

import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.component.field.AbstractInciFieldComponent;
import com.proximo.inci.component.util.ComponentUtil;
import com.proximo.inci.service.common.LookupService;
import com.vaadin.ui.ComboBox;

public class CategoryField extends AbstractInciFieldComponent<ComboBox> {
    
    private String width;
    private String captionKey;

    public CategoryField(String width, String captionKey) {
        this.width = width;
        this.captionKey = captionKey;

        build();
    }

    @Override
    protected ComboBox createMainComponentInstance() {
        return new ComboBox();
    }

    @Override
    protected void init() {
        if (captionKey != null) {
            mainComponent.setCaption(CaptionResolver.getCaption(captionKey));
        }
        mainComponent.setWidth(width);
        ComponentUtil.fillLookupValues(mainComponent, LookupService.getFormTnCategories());
    }    
    
    @Override
    public String getFieldDescription() {
        return CaptionResolver.getCaption("tradeName.all.categoryField.DESC");
    }    
}
