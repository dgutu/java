package com.proximo.inci;

import com.proximo.inci.common.DODataRecord;
import com.proximo.inci.common.exception.InvalidData;


public class DOChemStrucTemplate 
    extends DODataRecord 
{
    public String name;
    public int groupID;
    public String groupDesc;
    public String cml;
    public String descText;
    
    public static final String DEFAULT_CML = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>\r\n" + 
                                             "<!DOCTYPE molecule SYSTEM \"cml.dtd\" []>\r\n" +
                                             "<molecule id=\"\">\r\n" +
                                             "  <atomArray>\r\n" +
                                             "    <stringArray builtin=\"id\"></stringArray>\r\n" +
                                             "    <stringArray builtin=\"elementType\"></stringArray>\r\n" +
                                             "    <floatArray builtin=\"x2\" units=\"arbitrary\">\r\n" +
                                             "      \r\n" +
                                             "    </floatArray>\r\n" +
                                             "    <floatArray builtin=\"y2\" units=\"arbitrary\">\r\n" +
                                             "      \r\n" +
                                             "    </floatArray>\r\n" +
                                             "  </atomArray>\r\n" +
                                             "  <bondArray>\r\n" +
                                             "    <stringArray builtin=\"atomRefs\"></stringArray>\r\n" +
                                             "    <stringArray builtin=\"atomRefs\"></stringArray>\r\n" +
                                             "    <stringArray builtin=\"order\"></stringArray>\r\n" +
                                             "  </bondArray>\r\n" +
                                             "</molecule>\r\n";
    
    public static final String CLEARED_CML = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>\r\n" + 
                                             "<!DOCTYPE molecule SYSTEM \"cml.dtd\" []>\r\n" +
                                             "<molecule id=\"Untitled\">\r\n" +
                                             "  <atomArray>\r\n" +
                                             "    <stringArray builtin=\"id\"></stringArray>\r\n" +
                                             "    <stringArray builtin=\"elementType\"></stringArray>\r\n" +
                                             "    <floatArray builtin=\"x2\" units=\"arbitrary\">\r\n" +
                                             "      \r\n" +
                                             "    </floatArray>\r\n" +
                                             "    <floatArray builtin=\"y2\" units=\"arbitrary\">\r\n" +
                                             "      \r\n" +
                                             "    </floatArray>\r\n" +
                                             "  </atomArray>\r\n" +
                                             "  <bondArray>\r\n" +
                                             "    <stringArray builtin=\"atomRefs\"></stringArray>\r\n" +
                                             "    <stringArray builtin=\"atomRefs\"></stringArray>\r\n" +
                                             "    <stringArray builtin=\"order\"></stringArray>\r\n" +
                                             "  </bondArray>\r\n" +
                                             "</molecule>\r\n";

    public DOChemStrucTemplate() {
        super();
        clear();
    }

    public void clear() {
        recID = 0;
        name = "";
        groupID = 0;
        groupDesc = "";
        cml = "";
        descText = "";
    }

    public static void validate(DODataRecord d)
      throws InvalidData 
    {
        DOChemStrucTemplate i = (DOChemStrucTemplate)d;
    }

    public Object clone() {
        DOChemStrucTemplate template = (DOChemStrucTemplate)super.clone();
        template.name = this.name;
        template.groupID = this.groupID;
        template.groupDesc = this.groupDesc;
        template.cml = this.cml;
        template.descText = this.descText;

        return template;
    }  
}
