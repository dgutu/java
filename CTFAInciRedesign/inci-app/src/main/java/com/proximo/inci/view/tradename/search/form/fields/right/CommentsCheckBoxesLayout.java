/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.search.form.fields.right;

import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.component.AbstractInciComponentLayout;
import com.vaadin.ui.HorizontalLayout;

public class CommentsCheckBoxesLayout extends AbstractInciComponentLayout<HorizontalLayout> {

    private CommentsOutsdField commentsOutsdField;
    private CommentsRespondField commentsRespondField;

    public CommentsCheckBoxesLayout() {
        build();
    }

    @Override
    protected HorizontalLayout createMainComponentInstance() {
        return new HorizontalLayout();
    }

    @Override
    protected void init() {
        mainComponent.setSpacing(false);
        mainComponent.setCaption(CaptionResolver.getCaption("tradeName.search.commentsLayout"));

        commentsOutsdField = new CommentsOutsdField();
        commentsRespondField = new CommentsRespondField();
    }

    @Override
    protected void addContent() {
        addComponent(commentsOutsdField);
        addComponent(commentsRespondField);
    }

    public void clear() {
        commentsOutsdField.setValue(null);
        commentsRespondField.setValue(null);
    }

    public Boolean getCommentsOutsdFieldValue() {
        return (Boolean) commentsOutsdField.getValue();
    }
    
    public void setCommentsOutsdFieldValue(boolean value) {
    	commentsOutsdField.setValue(value);
    }

    public Boolean getCommentsRespondFieldValue() {
        return (Boolean) commentsRespondField.getValue();
    }
    
    public void setCommentsRespondFieldValue(boolean value) {
    	commentsRespondField.setValue(value);
    }    

}
