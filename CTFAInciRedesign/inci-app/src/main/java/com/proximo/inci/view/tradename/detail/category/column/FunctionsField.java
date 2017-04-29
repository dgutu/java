/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.view.tradename.detail.category.column;

//import java.util.Collection;
import java.util.HashMap;
//import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proximo.inci.DOList;
import com.proximo.inci.DOLookupValue;
import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.component.util.ComponentUtil;
import com.proximo.inci.service.common.LookupService;
import com.proximo.inci.view.tradename.detail.category.TradeNameDetails;
import com.vaadin.ui.ListSelect;

public class FunctionsField extends TradeNameColumnDetailsField<ListSelect> {
	
	private static Logger logger = LoggerFactory.getLogger(FunctionsField.class);
	
    private Map<Integer, String> itemIdToDescMap;
    
    private boolean itemsSelected = false;

    public FunctionsField(FunctionsFieldLayout parentLayout) {
        super(parentLayout);
    }

    @Override
    protected ListSelect createMainComponentInstance() {
        return new ListSelect();
    }

    
	@Override
    protected void init() {
        super.init();
        
        mainComponent.setWidth(TradeNameDetails.FORM_COLUMN_FIELD_WIDTH);
        mainComponent.setHeight(TradeNameDetails.FORM_COLUMN_TEXTAREA_MEDIUM_HEIGHT);
        mainComponent.setMultiSelect(true);
        mainComponent.setNullSelectionAllowed(false);
        mainComponent.setImmediate(true);
        initItemIdToDescMap();
        
        /*mainComponent.addListener(new Property.ValueChangeListener() {
			
			/**
			 * 
			 */
			/*private static final long serialVersionUID = 1L;

			@Override
			public void valueChange(ValueChangeEvent event) {
				@SuppressWarnings("rawtypes")
				Collection objects = (Collection) event.getProperty().getValue();
				//@SuppressWarnings("rawtypes")
				//Iterator itr = objects.iterator();
				if (objects.size() > 0)
					itemsSelected = true;
				else
					itemsSelected = false;
			}
		});*/
    }

    private void initItemIdToDescMap() {
        itemIdToDescMap = new HashMap<Integer, String>();

        DOList lookupValues = LookupService.getFormTnFunctions();
        for (int i = 0; i < lookupValues.size(); i++) {
            DOLookupValue v = (DOLookupValue) lookupValues.elementAt(i);
            itemIdToDescMap.put(v.keyID, v.keyDesc);
        }
    }

    @Override
    public void generateContent() {
        super.generateContent();
        generateItemsContent();
    }

    private void generateItemsContent() {
    	mainComponent.setRequired(true);
        mainComponent.removeAllItems();
        if (!getParentLayout().getParentColumnDetails().getParentDetails().getParentView().isEditable()) {
            fillItems(getParentLayout().getParentColumnDetails().getParentDetails().getParentView().getFormTn().functionList);
        } else {
            fillItems(LookupService.getFormTnFunctions());
            selectItems();
        }
    }

    private void fillItems(DOList lookupValues) {
        for (int i = 0; i < lookupValues.size(); i++) {
            DOLookupValue v = (DOLookupValue) lookupValues.elementAt(i);
            if (v.keyID != 0) {
                ComponentUtil.addItemWithCaption(mainComponent, String.valueOf(v.keyID), itemIdToDescMap.get(v.keyID));
            }
        }
    }

    private void selectItems() {
        DOList items = getParentLayout().getParentColumnDetails().getParentDetails().getParentView().getFormTn().functionList;
        for (int i = 0; i < items.size(); i++) {
            DOLookupValue v = (DOLookupValue) items.elementAt(i);
            mainComponent.select(String.valueOf(v.keyID));
        }
    }
    
    public String getOneFunctionId() {
        @SuppressWarnings("unchecked")
        Set<String> selectedIds = (Set<String>) mainComponent.getValue();
        
        if (selectedIds.isEmpty()) {
            return null;
        } else {
            return selectedIds.iterator().next();
        }
    }
    
    public DOList getSelectedFunctions() {
        DOList allFunctions = LookupService.getFormTnFunctions();
        
        @SuppressWarnings("unchecked")
        Set<String> selectedIds = (Set<String>) mainComponent.getValue();        
        
        DOList result = new DOList();
        for (String selId : selectedIds) {
            for (int j = 0; j < allFunctions.size(); j++) {
                DOLookupValue d = (DOLookupValue) allFunctions.elementAt(j);
                if (Integer.parseInt(selId) == d.keyID) {
                    result.addElement(d);
                    logger.debug("Funnction.getSelectedFunctions element: " + d.keyValue);
                    break;
                }
            }
        }
        
        return result;
    }
    
    public boolean isFieldModified(DOList modelFunctions) {
        DOList selectedFunctions = getSelectedFunctions();
        
        int foundFuncCount = 0;
        for (int i = 0; i < selectedFunctions.size(); i++) {
            DOLookupValue d = (DOLookupValue) selectedFunctions.elementAt(i);
            for (int j = 0; j < modelFunctions.size(); j++) {
                DOLookupValue md = (DOLookupValue) modelFunctions.elementAt(j);
                if (d.keyID == md.keyID) {
                    foundFuncCount++;
                    logger.debug("Funnction.isFieldModified element: " + d.keyValue + ": " + md.keyValue);
                    break;
                }
            }
        }
        
        //logger.debug("Funnction.isFieldModified foundFuncCount: " + foundFuncCount);
        //logger.debug("Funnction.isFieldModified selectedFunctions.size(): " + modelFunctions.size());
        
        return foundFuncCount != selectedFunctions.size();
    }

    @Override
    public String getFieldDescription() {
        return CaptionResolver.getCaption("tradeName.detail.functionsField.DESC");
    }
    
    public boolean selected() {
    	return this.itemsSelected;
    }
    
}
