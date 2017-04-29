package com.proximo.inci;



import java.util.Vector;

import com.proximo.inci.common.DODataRecord;
import com.proximo.inci.common.TDate;

public class DOReportOptions
    extends DODataRecord
{
	private static final long serialVersionUID = 100L; // improves speed of serialization

    /* This class has all the variables that have to be set up for any reportOptions.
       We have the possibility of 5 Lists, 2 comboboxes (gen1 & gen2), two plain fields,
       and 1 checkbox that can be set or not. The 5th list is optional (if you set the 5th
       list the date fields and the 2 plain fields will not be visible). The default is
       that the 5th list is not visible.
       The lists can be dependent on each other. To set this up you use the variables
       List1Then2, List2Then3,... to TRUE. This indicates that when a list is clicked, and
       the selection populates the next List. he default is FALSE.
       The lists can also depend on the first combobox or viceversa. For this we have to set
       the variable combo1Link:
            0 - LIST_TO_COMBO - means that when the list indicated in the variable dplist is
                                clicked the combobox1 will be populated
            1 - COMBO_TO_LIST - means that when the combo box is selected the list indicated
                                in the variable dplist will be populated
            2 - NO_LINKS      - means there is no dependency between the combobox1 and any
                                list
       The default for the variable "comboLink1" is 2, or NO_LINKS.
       The combobox2 can also be dependent on the combobox1, for that we have to set the
       variable "comboLink2" to TRUE. The default for this variable is FALSE, meaning no
       Links between comboboxes. When you have dependecies between lists and comboboxes (the
       defaults area not set), then you also have to override the methods in ReportMagic that
       are required: getReportList1Options, getReportList2Options, getReportList3Options,
       getReportList4Options, getReportList5Options, getReporCombo1Options or
       getReportCombo2Options. The defaults of these methods bring a null Vector of Vectors.
       When overriden, the method should bring a vector of vectors, with three elements. The
       first element contains the displayNames strings, the second element contains the
       returnValues and the third vector returns the defaults values for that list.

       DR 6/10/00: added hasGroup. Set to true if when the report is displayed in Proximo Report Viewer
       it should show the group tree.  Default is false.
    */
    public Vector sortNames, returnSort;
    public Vector listBoxNames;
    public Vector boxContents, returnContents, defaults;
    public Vector returnIsString; // DR 12/29/98: returnContents contains nums or strings?
    public Vector gen1List, gen2List; // CP 7/30/99 new combo boxes
    public Vector gen1ReturnList, gen2ReturnList, genDefaults;
    public String gen1Label;
    public String gen2Label;
    public TDate startDate, endDate;
    public String output;
    public Vector outputList, returnOutput; // CP 07/30/99 changed string for Vector
    public String sortSelect, outputSelect, gen1Select, gen2Select; // new CP 7/30/99
    //public String output;
    public String extraLabel;  //new SS 7/16/98
    public String extraData;   //new SS 7/16/98
    public String qtyLabel;  // WL 8/20/98
    public int qtyToMake;  // WL 8/20/98
    public String checkName; // DR 12/29/98
    public boolean check; // DR 12/29/98
    public int internalType; // DR 1/8/99: internal report type
    // DR 10/17/98: these flags tell the applet how to handle user selections in the list box
    // see ARptOptions for notes on how these flags are handled
    public boolean list1Required, list2Required, list3Required; // all will default to true
    public boolean list4Required, list5Required; // CP 7/30/99 added 2 lists
    public boolean list1Then2, list2Then3, list3Then4, list4Then5; // all will default to false
    public boolean list1Multi, list2Multi, list3Multi; // are the lists multi-select?
    public boolean list4Multi, list5Multi; // CP 7/30/99 for 2 new lists
    public boolean hasGroup; // DR 6/10/00: show group tree?

    // WL 12/9/99:
    public boolean startDateRequired, endDateRequired, extraDataRequired;

    public boolean noParams;  //GN 03/29/2000 are there any parameters for the report?, set to false by default

    public int dpList;   //NG integer declaring list that gen1list combo depends on
    public int combo1Link;  //NG integer declaringlink between gen1List and lists
    public boolean combo2Link;  //NG link between gen1List and gen2List

    // DR 10/17/98: default wait message when submitting a report; can be overriden
    public String scheduleMsg = "Please wait for the server to accept your request...";

    public final static String DESC_CSV = "CSV";
    public final static String DESC_HTML = "HTML";
    public final static String DESC_EXCEL = "MS Excel 5.0";
    public final static String DESC_WORD = "MS Word 6.0";
    public final static String DESC_RTF = "Rich Text Format";
    public final static String DESC_ECHAIN = "Proximo Report";
    public final static String DESC_PDF = "PDF";

    public final static int LIST_TO_COMBO = 0;  // NG last list affects combobox
    public final static int COMBO_TO_LIST = 1;  // NG combobox affects first list
    public final static int NO_LINKS = 2;        // NG no links between combobox and lists

    public DOReportOptions()
    {
        this.sortNames = new Vector();
        this.listBoxNames = new Vector();
        this.boxContents = new Vector();
        this.returnContents = new Vector();
        this.returnSort = new Vector();
        this.defaults = new Vector();
        this.outputList = new Vector();  // CP 7/30/99 string changed to vector
        this.returnOutput = new Vector(); //CP 7/30/99 string changed to vector
        this.gen1List = new Vector();  // new CP 7/30/99
        this.gen2List = new Vector();
        this.gen1ReturnList = new Vector();
        this.gen2ReturnList = new Vector();
        this.genDefaults = new Vector();

        // DR 12/29/98: returnContents contains nums or strings?
        // strings by default
        this.returnIsString = new Vector ();
        this.returnIsString.addElement ("Y");
        this.returnIsString.addElement ("Y");
        this.returnIsString.addElement ("Y");

        extraLabel = null;  //new SS 7/16/98
        extraData = new String ("");   //new SS 7/16/98
        startDate = null;
        endDate = null;
        sortSelect = new String ("");
        outputSelect = new String ("");
        gen1Select = new String ("");
        gen2Select = new String ("");
        gen1Label = null;
        gen2Label = null;

        checkName = null;   //new DR 12/29/98
        check = false;
        internalType = 0; // new DR 1/8/99

        // WL 8/20/98
        qtyLabel = null;
        qtyToMake = 0;

        // DR 10/17/98
        // it is up to the report creator to make sure that these flags do not conflict
        // otherwise the applet will behave unpredictably
        list1Required = true;
        list2Required = true;
        list3Required = true;
        list4Required = true; // CP 7/30/99
        list5Required = true; // CP 7/30/99
        // CP 8/3/99 default values for dependency variables
        list1Then2 = false;
        list2Then3 = false;
        list3Then4 = false;
        list4Then5 = false;
        combo1Link = NO_LINKS;
        combo2Link = false;
        dpList = -1;

        list1Multi = true;
        list2Multi = true;
        list3Multi = true;
        list4Multi = true;
        list5Multi = true;

        // WL 12/9/99:
        startDateRequired = false;
        endDateRequired = false;
        extraDataRequired = false;

        //GN 03/29/2000
        noParams = false;

        // DR 6/10/00:
        hasGroup = true;

        // DR 10/98: Excel is the default
        //output = DESC_EXCEL;
        // DR 1/28/99: EChain reporting is the default
        // CP 7/30/99 output is a vector now, and the default will be DESC_ECHAIN
         outputList.addElement(DESC_CSV);
         outputList.addElement(DESC_HTML);
         outputList.addElement(DESC_EXCEL);
         outputList.addElement(DESC_ECHAIN);
         outputList.addElement(DESC_WORD);
         outputList.addElement(DESC_RTF);
         // WL 8/11/01: temporarily remove pdf output untill we fix the win2k distiller problem
         //outputList.addElement(DESC_PDF);
         
         // CP 8/2/99   PDF reporting is the default
         // DR 6/10/00: now, Proximo Reports are the default
         output = DESC_ECHAIN;
    }

    public void setRequiredListBoxes(int[] listNum) {
        list1Required = false;
        list2Required = false;
        list3Required = false;
        list4Required = false;
        list5Required = false;

        for (int i = 0; i < listNum.length; i++) {
            if (listNum[i] == 1) list1Required = true;
            else if (listNum[i] == 2) list2Required = true;
            else if (listNum[i] == 3) list3Required = true;
            else if (listNum[i] == 4) list4Required = true;
            else if (listNum[i] == 5) list5Required = true;
        }
    }

    // WL 9/11/99: added for Lancome to customizing output type list...
    public void customizeOutputList(String [] outputItems) {
        customizeOutputList(outputItems, DESC_PDF);
    }

    public void customizeOutputList(String [] outputItems, String defaultItem) {
        outputList.removeAllElements();
        for (int i = 0; i < outputItems.length; i++) {
            outputList.addElement(outputItems[i]);
        }
        output = defaultItem;
    }
    
    // RL 8/10/01 added for setting sortName easier
    public void setSortNames(String[] names) {
        for (int i = 0; i < names.length; i++) {
            sortNames.addElement(names[i]);
        }    	
	
	}
	
	// RL 8/10/01 added for setting returnSort easier
    public void setReturnSort(String[] retNames) {
        for (int i = 0; i < retNames.length; i++) {
            returnSort.addElement(retNames[i]);
        }    	
	
	}	
}
