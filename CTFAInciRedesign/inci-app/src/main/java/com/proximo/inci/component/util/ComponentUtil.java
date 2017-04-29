/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.component.util;

import java.util.HashMap;
import java.util.Map;

import com.proximo.inci.DOList;
import com.proximo.inci.DOLookupValue;
import com.proximo.inci.caption.CaptionResolver;
import com.proximo.inci.component.common.SpacingComponent;
import com.vaadin.ui.AbstractSelect;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.ComponentContainer;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;

/**
 * Utility methods for UI components.
 */
public class ComponentUtil {

    public static final String NORMAL_DATE_FIELD_WIDTH = "100px";
    public static final int NORMAL_FORM_SPACING_PX = 3;
    public static final int NORMAL_FORM_TEXT_FIELD_HEIGHT_PX = 23;

    /**
     * HTML non-breaking space.
     */
    private static final String HTML_NBSP = "&nbsp;";

    private static Map<ButtonWidth, String> buttonWidthMap;
    static {
        buttonWidthMap = new HashMap<ButtonWidth, String>();
        buttonWidthMap.put(ButtonWidth.MEDIUM, "actionbtn");
        buttonWidthMap.put(ButtonWidth.LARGE, "actionbtn-large");
        buttonWidthMap.put(ButtonWidth.XLARGE, "actionbtn-xlarge");
        buttonWidthMap.put(ButtonWidth.XXLARGE, "actionbtn-xxlarge");
    }

    /** Not intended to be instantiated. Exposed only static members. */
    private ComponentUtil() {
    }

    public static SpacingComponent createNormalSpacingComponent() {
        return new SpacingComponent(NORMAL_FORM_SPACING_PX);
    }

    /** Adds a non-breaking space to the given component container. */
    public static void addSpace(ComponentContainer componentContainer) {
        addSpace(componentContainer, 1);
    }

    /**
     * Adds a specified number of non-breaking spaces to the given component
     * container.
     */
    public static void addSpace(ComponentContainer componentContainer, int numberOfSpaces) {
        StringBuffer stringBuffer = new StringBuffer(numberOfSpaces);
        for (int i = 1; i <= numberOfSpaces; i++) {
            stringBuffer.append(HTML_NBSP);
        }
        componentContainer.addComponent(new Label(stringBuffer.toString(), Label.CONTENT_XHTML));
    }

    /**
     * Creates a button with the specified
     * <code>Button.ClickListener listener</code>.
     * 
     * @param captionKey
     *            button caption resource key.
     * @param clickListener
     *            is a button click listener.
     * @param infoKey
     *            label resource key. It is displayed on the right of the
     *            button.
     */
    public static HorizontalLayout createButtonWithInfo(String captionKey, Button.ClickListener clickListener,
            String infoKey) {
        Button actionBtn = ComponentUtil.createActionButton(captionKey, clickListener);

        return ComponentUtil.attachInfoToButton(actionBtn, infoKey);
    }
    
    public static HorizontalLayout createButtonWithInfoWidthSet(String captionKey, Button.ClickListener clickListener,
            String infoKey, ButtonWidth buttonWidth) {
        Button actionBtn = ComponentUtil.createActionButton(captionKey, clickListener, buttonWidth);

        return ComponentUtil.attachInfoToButton(actionBtn, infoKey);
    }
    

    /**
     * Attaches an information label to the right of the button. The button and
     * the label are put into the horizontal layout.
     * 
     * @param infoKey
     *            information label resource key.
     * @return horizontal layout with the button and information label inside.
     */
    public static HorizontalLayout attachInfoToButton(Button button, String infoKey) {
        HorizontalLayout horizontalLayout = new HorizontalLayout();

        horizontalLayout.addComponent(button);
        ComponentUtil.addSpace(horizontalLayout);

        Label infoLabel = new Label(CaptionResolver.getCaption(infoKey), Label.CONTENT_XHTML);
        horizontalLayout.addComponent(infoLabel);
        horizontalLayout.setComponentAlignment(infoLabel, Alignment.MIDDLE_LEFT);

        return horizontalLayout;
    }

    public static Button createActionButton(String captionKey, Button.ClickListener clickListener) {
        return createActionButton(captionKey, clickListener, null);
    }

    public static Button createActionButton(String captionKey, Button.ClickListener clickListener,
            ButtonWidth buttonWidth) {
        Button button = new Button(CaptionResolver.getCaption(captionKey));

        if (buttonWidth == null) {
            buttonWidth = ButtonWidth.MEDIUM;
        }
        button.addStyleName(buttonWidthMap.get(buttonWidth));

        button.addListener(clickListener);

        return button;
    }

    /**
     * Adds HTML to the component container.
     * 
     * @param html
     *            HTML to add.
     */
    public static void addHtml(String html, ComponentContainer container) {
        Label htmlLabel = new Label(html, Label.CONTENT_XHTML);
        container.addComponent(htmlLabel);
    }

    public static void fillLookupValues(AbstractSelect abstractSelect, DOList lookupValues) {
        for (int i = 0; i < lookupValues.size(); i++) {
            DOLookupValue v = (DOLookupValue) lookupValues.elementAt(i);
            String itemId = String.valueOf(v.keyID);
            addItemWithCaption(abstractSelect, itemId, v.keyValue);
        }
    }

    public static void addItemWithCaption(AbstractSelect abstractSelect, Object key, String value) {
        abstractSelect.addItem(key);
        abstractSelect.setItemCaption(key, value);
    }

}
