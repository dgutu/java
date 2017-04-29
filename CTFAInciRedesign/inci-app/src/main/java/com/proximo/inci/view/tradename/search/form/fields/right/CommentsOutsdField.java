/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.search.form.fields.right;

import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.component.field.AbstractInciFieldComponent;
import com.vaadin.ui.CheckBox;

public class CommentsOutsdField extends AbstractInciFieldComponent<CheckBox> {

    public CommentsOutsdField() {
        build();
    }

    @Override
    protected CheckBox createMainComponentInstance() {
        return new CheckBox();
    }

    @Override
    protected void init() {
        mainComponent.setCaption(CaptionResolver.getCaption("tradeName.search.commentsOutstdField"));
    }

    @Override
    public String getFieldDescription() {
        return "";
    }

}
