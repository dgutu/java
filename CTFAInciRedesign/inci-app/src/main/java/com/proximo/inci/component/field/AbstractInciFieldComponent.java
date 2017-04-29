/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.component.field;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proximo.inci.caption.ValidationErrorStrUtils;
import com.proximo.inci.common.TemplarUtil;
import com.proximo.inci.component.AbstractInciComponent;
//import com.proximo.inci.view.tradename.detail.category.ferments.FermentsTradeNameDetails;
//import com.vaadin.data.Validator.EmptyValueException;
//import com.vaadin.data.Validator.InvalidValueException;
import com.vaadin.ui.AbstractField;
import com.vaadin.ui.ListSelect;

public abstract class AbstractInciFieldComponent<F extends AbstractField> extends AbstractInciComponent<F> {
    
	@SuppressWarnings("unused")
	private static Logger logger = LoggerFactory.getLogger(AbstractInciFieldComponent.class);
	
    public Object getValue() {
        return mainComponent.getValue();
    }
    
    public void setValue(Object newValue) {
        mainComponent.setValue(newValue);
    }
    
    public void setRequired(boolean required) {
        mainComponent.setRequired(required);
        
        if (required) {
        	mainComponent.addStyleName("required-field");
        }
    }
    
    public void setStyleName(String style) {
    	mainComponent.setStyleName(style);
    }

    @Override
    public String validate() {
    	//logger.debug("AbstractInciFieldComponent.getCaption="+mainComponent.getCaption());
    	//logger.debug("AbstractInciFieldComponent.getValue="+mainComponent.getValue());
    	//if (mainComponent.isRequired() && TemplarUtil.isObjNullOrEmpty(mainComponent.getValue())) {
    	if (mainComponent.isRequired()) {
    		if (mainComponent instanceof ListSelect) {
    			@SuppressWarnings("rawtypes")
				Collection objects = (Collection) mainComponent.getValue();
    			if (objects.size() == 0) {
    				return ValidationErrorStrUtils.getFieldIsRequiredMsg(this);
    			}
    			else {
    				return null;
    			}
    		}
    		else if (TemplarUtil.isObjNullOrEmpty(mainComponent.getValue())) {
    			return ValidationErrorStrUtils.getFieldIsRequiredMsg(this);
    		}
    		else {
    			return null;
    		}
    	}
    	else
    		return null;
    }
    /*public String validate() {
        try {
            mainComponent.validate();
        } catch (EmptyValueException eve) {
            return ValidationErrorStrUtils.getFieldIsRequiredMsg(this);
        } catch (InvalidValueException ive) {
            return getInvalidValueDescription();
        } catch (Exception e) {
            return getFieldDescription();
        }

        return null;
    }*/

    /** Used for validation information display. */
    public abstract String getFieldDescription();

    /** Override in subclasses if they add validators. */
    public String getInvalidValueDescription() {
        return "";
    }

}
