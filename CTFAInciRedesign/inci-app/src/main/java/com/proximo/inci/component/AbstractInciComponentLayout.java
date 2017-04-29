/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.component;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proximo.inci.component.common.SpacingComponent;
import com.proximo.inci.component.util.ComponentUtil;
import com.proximo.inci.service.security.SecurityInfo;
import com.vaadin.ui.AbstractOrderedLayout;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Component;

public abstract class AbstractInciComponentLayout<C extends AbstractOrderedLayout> extends AbstractInciComponent<C> {

    private static Logger logger = LoggerFactory.getLogger(AbstractInciComponentLayout.class);

    protected List<AbstractInciComponent<? extends Component>> childComponents = new ArrayList<AbstractInciComponent<? extends Component>>();

    @Override
    protected void build() {
        super.build();

        //logger.debug("Adding content for {}", getClass());
        addContent();
        //logger.debug("Finished adding content for {}", getClass());
    }

    /** Adds content to mainComponent. */
    protected void addContent() {
    }

    public void addComponent(AbstractInciComponent<? extends Component> inciComponent) {
        mainComponent.addComponent(inciComponent.getMainComponent());
        childComponents.add(inciComponent);
    }

    public void addComponent(AbstractInciComponent<? extends Component> inciComponent, int index) {
        mainComponent.addComponent(inciComponent.getMainComponent(), index);
        childComponents.add(inciComponent);
    }

    public void addComponent(AbstractInciComponent<? extends Component> inciComponent, Alignment alignment) {
        addComponent(inciComponent);
        mainComponent.setComponentAlignment(inciComponent.getMainComponent(), alignment);
    }

    public void removeComponent(AbstractInciComponent<? extends Component> inciComponent) {
        mainComponent.removeComponent(inciComponent.getMainComponent());
        childComponents.remove(inciComponent);
    }

    @Override
    public void applySecurityInfo(SecurityInfo securityInfo) {
        logger.debug("Applying security info for {}", getClass());
        
        super.applySecurityInfo(securityInfo);

        for (AbstractInciComponent<? extends Component> c : childComponents) {
            c.applySecurityInfo(securityInfo);
        }

        logger.debug("Applying security info for {} finished", getClass());
    }
    
    @Override
    public void setAdminComponent(boolean adminComponent) {
        super.setAdminComponent(adminComponent);
        for (AbstractInciComponent<? extends Component> c : childComponents) {
            c.setAdminComponent(adminComponent);
        }
    }    
    
    @Override
    public void generateContent() {
        for (AbstractInciComponent<? extends Component> c : childComponents) {
            c.generateContent();
        }
    }

    @Override
    public String validate() {
        for (AbstractInciComponent<? extends Component> c : childComponents) {
            String validationErrorStr = c.validate();
            if (validationErrorStr != null) {
                return validationErrorStr;
            }
        }
        
        return null;
    }

    public void addSpacing(int heightPx) {
        addComponent(new SpacingComponent(heightPx));
    }    

    public void addSpace(int numberOfSpaces) {
        ComponentUtil.addSpace(mainComponent, numberOfSpaces);
    }

    public void addSpace() {
        addSpace(1);
    }
    
    public void clearChildComponents() {
        /*for (int i=0; i<childComponents.size();i++) {
        	childComponents.remove(i);
        }*/
        
    	childComponents.clear();
    }
}
