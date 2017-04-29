/** Copyright 2012 to present by the Personal Care Products Council, Inc
The copyright to the computer program(s) herein is the property of 
the Personal Care Products Council, Inc. The program(s) may be used and/or
copied only with the written permission of the Personal Care Products Council, Inc
or in accordance with the terms and conditions stipulated in the
agreement/contract under which the program(s) have been supplied.*/

package com.proximo.inci.caption;

import com.proximo.inci.component.field.AbstractInciFieldComponent;
import com.vaadin.ui.AbstractField;

public class ValidationErrorStrUtils {

    /** Not intended to be instantiated. Exposed only static members. */
    private ValidationErrorStrUtils() {
    }

    public static String getFieldIsRequiredMsg(AbstractInciFieldComponent<? extends AbstractField> field) {
        return field.getFieldDescription() + " " + CaptionResolver.getCaption("validation.isRequired");
    }

    public static String getOneOfTheFieldIsRequiredMsg(AbstractInciFieldComponent<? extends AbstractField> field1,
            AbstractInciFieldComponent<? extends AbstractField> field2) {

        return CaptionResolver.getCaption("validation.either") + " " + field1.getFieldDescription() + " "
                + CaptionResolver.getCaption("validation.or") + " " + field2.getFieldDescription() + " "
                + CaptionResolver.getCaption("validation.isRequired");
    }

    /**
     * field2 "requiredness" is dependent on field1 value.
     */
    public static String getRequiredForOtherFieldValueMsg(AbstractInciFieldComponent<? extends AbstractField> field1,
            AbstractInciFieldComponent<? extends AbstractField> field2, String field1Value) {
        return CaptionResolver.getCaption("validation.requiredForOtherFieldValue.part1") + " \"" + field1Value + "\" "
                + CaptionResolver.getCaption("validation.requiredForOtherFieldValue.part2") + " "
                + field1.getFieldDescription() + " "
                + CaptionResolver.getCaption("validation.requiredForOtherFieldValue.part3") + " "
                + field2.getFieldDescription();
    }

}
