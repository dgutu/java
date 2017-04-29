/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.component.common;

import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.component.AbstractInciComponent;
import com.vaadin.ui.Label;

public class LabelComponent extends AbstractInciComponent<Label> {
    
    private String initCaptionKey;
    private String initStyleName;
    private String initHeight;
    
    public LabelComponent() {
        build();
    }    
    
    public LabelComponent(String captionKey) {
        this.initCaptionKey = captionKey;
        
        build();
    }
    
    public LabelComponent(String captionKey, String styleName) {
        this.initCaptionKey = captionKey;
        this.initStyleName = styleName;
        
        build();
    }
    
    public LabelComponent(String captionKey, String styleName, String initHeight) {
        this.initCaptionKey = captionKey;
        this.initStyleName = styleName;
        this.initHeight = initHeight;
        
        build();
    }    
    
    @Override
    protected Label createMainComponentInstance() {
        return new Label();
    }

    @Override
    protected void init() {
        if (initCaptionKey != null) {
            mainComponent.setValue(CaptionResolver.getCaption(initCaptionKey));
        }
        
        if (initStyleName != null) {
            mainComponent.addStyleName(initStyleName);
        }
        
        if (initHeight != null) {
            mainComponent.setHeight(initHeight);
        }        
    }

    public void setValue(String caption) {
        mainComponent.setValue(caption);
    }

}
