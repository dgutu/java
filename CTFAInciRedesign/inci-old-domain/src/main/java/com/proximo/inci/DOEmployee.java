package com.proximo.inci;

import com.proximo.inci.common.DODataRecord;
import com.proximo.inci.common.TDate;
import com.proximo.inci.common.exception.InvalidData;

/** Data object for an employee 
	A note on addresses:
	
	address: address of the employee at the company
	companyAddress: company's main address
	homeAddress: address of the employee at home
*/
public class DOEmployee
    extends DODataRecord
{
    public String ssn, userID, first, last, middle, fax, phone, password, title, email, operatorID,
                    initials, companyName, mobilePhone, homePhone, spouseName, homeEmail, empType;
    public TDate hired, terminated;
    public boolean isActive;
    public float salary, wage, hours, billRate;
    public DOList depts; // list of DOEmployeeDepartment
    public DOEmployeeAddress address; // used for the address of the employee at the company
    public DOCompanyAddress companyAddress; // DR 7/26/02: added company address
	public DOList extParams; // CP 02/24/2003 list of extended parameters
    public long companyID;
	public float vacationDays, sickDays, personalDays, rollOverDays;
	public int empTypeID; 
	public boolean isFullTime;
    public DOEmployeeAddress homeAddress; // DR 5/25/03

	private static final long serialVersionUID = 103L; // improves speed of serialization

    // constructors
    public DOEmployee ()
    {
        this (0, "", "", "", "", "", "", "", "", TDate.getNullDateObject (),
                TDate.getNullDateObject (), true, "", 0, 0, 0,"", "");
    }

    public DOEmployee (long recID, String ssn, String userID, String first, String last,
			String middle, String fax, String phone, String password,
			TDate hired, TDate terminated, boolean isActive,
			String title, float salary, float wage, float hours, String email, String operatorID)
    {
        this (recID, ssn, userID, first, last, middle, fax, phone, password,
			hired, terminated, isActive, title, salary, wage, hours, 
			email, operatorID, new DOList ());
    }

    public DOEmployee (long recID, String ssn, String userID, String first, String last,
			String middle, String fax, String phone, String password,
			TDate hired, TDate terminated, boolean isActive,
			String title, float salary, float wage, float hours,  
			String email, String operatorID, DOList depts)
    {
        this (recID, ssn, userID, first, last, middle, fax, phone, password,
			hired, terminated, isActive, title, salary, wage, hours,  
			email, operatorID, depts, new String (""), 
			new DOEmployeeAddress (), 0, new String (""));
    }

	public DOEmployee (long recID, String ssn, String userID, String first, String last,
			String middle, String fax, String phone, String password,
			TDate hired, TDate terminated, boolean isActive,
			String title, float salary, float wage, float hours,   
			String email, String operatorID, DOList depts, 
			String initials, DOEmployeeAddress address, long companyID, String companyName)
    {
		this (recID, ssn, userID, first, last, middle, fax, phone, password,
			hired, terminated, isActive, title, salary, wage, hours,  
			email, operatorID, depts, initials, 
			address, companyID, companyName, new DOList());
	}
	
    public DOEmployee (long recID, String ssn, String userID, String first, String last,
			String middle, String fax, String phone, String password,
			TDate hired, TDate terminated, boolean isActive,
			String title, float salary, float wage, float hours,   
			String email, String operatorID, DOList depts, 
			String initials, DOEmployeeAddress address, long companyID, 
			String companyName, DOList extParams)
    {
        this.recID = recID;
        this.userID = userID;
        this.ssn = ssn;
        this.first = first;
        this.middle = middle;
        this.fax = fax;
        this.phone = phone;
        this.password = password;
        this.hired = hired;
        this.terminated = terminated;
        this.last = last;
    	this.isActive = isActive;
    	this.title = title;
    	this.salary = salary;
    	this.wage = wage;
		this.hours = hours;
		this.vacationDays = 0;
		this.sickDays = 0;
		this.personalDays = 0;
		this.rollOverDays =0;
		this.billRate =0;
    	this.depts = (DOList) depts.clone ();
        this.email = email;
        this.operatorID = operatorID;
        this.initials = initials;
        this.companyID = companyID;
        this.companyName = companyName;
        this.address = (DOEmployeeAddress) address.clone ();
		this.mobilePhone = "";
		this.homePhone = "";
		this.spouseName = "";
		this.homeEmail = "";
		this.companyAddress = new DOCompanyAddress ();
		this.extParams = (DOList) extParams.clone();
		this.empType = "";
		this.empTypeID = 0;
		this.isFullTime = true;
		this.homeAddress = new DOEmployeeAddress (DOEmployeeAddress.ADDRESS_HOME);
    }

    // toString override
    public String toString () { return "Employee[userID=" + userID + "]"; }

    public void validate ()
    throws InvalidData
    {
        this.validate ((DODataRecord) this);
    }

    public static void validate (DODataRecord d)
    throws InvalidData
    {
        DOEmployee i = (DOEmployee) d;
		
		//Debug.write ("DOEmployee.validate...1");
    	if (i.ssn.length () > 20) throw new InvalidData ("The SSN field must be 20 characters or less.");
		//Debug.write ("DOEmployee.validate...2");
    	if (i.homeEmail.length () > 254) throw new InvalidData ("The home e-mail field must be 254 characters or less.");
		//Debug.write ("DOEmployee.validate...3");
    	if (i.email.length () > 254) throw new InvalidData ("The work e-mail field must be 254 characters or less.");
		//Debug.write ("DOEmployee.validate...4");
    	if (i.first.length () > 20) throw new InvalidData ("The first name field must be 20 characters or less.");
		//Debug.write ("DOEmployee.validate...5");
    	if (i.last.length () > 20) throw new InvalidData ("The last name field must be 20 characters or less.");
		//Debug.write ("DOEmployee.validate...6");
    	if (i.middle.length () > 20) throw new InvalidData ("The middle name field must be 20 characters or less.");
		//Debug.write ("DOEmployee.validate...7");
    	if (i.fax.length () > 20) throw new InvalidData ("The fax number field must be 20 characters or less.");
		//Debug.write ("DOEmployee.validate...8");
    	if (i.phone.length () > 20) throw new InvalidData ("The work phone number field must be 20 characters or less.");
		//Debug.write ("DOEmployee.validate...9");
    	if (i.homePhone.length () > 20) throw new InvalidData ("The home phone number field must be 20 characters or less.");
		//Debug.write ("DOEmployee.validate...10");
    	if (i.mobilePhone.length () > 20) throw new InvalidData ("The mobile phone number field must be 20 characters or less.");
		//Debug.write ("DOEmployee.validate...11");
    	if (i.title.length () > 40) throw new InvalidData ("The title field must be 40 characters or less.");
		//Debug.write ("DOEmployee.validate...12");
    	if (i.spouseName.length () > 20) throw new InvalidData ("The spouse name field must be 20 characters or less.");
		//Debug.write ("DOEmployee.validate...13");
    	if (i.operatorID.length () > 20) throw new InvalidData ("The operator ID field must be 20 characters or less.");

		//Debug.write ("DOEmployee.validate...14");
    	if (i.ssn.length () == 0) throw new InvalidData ("The SSN must be entered.");
		//Debug.write ("DOEmployee.validate...15");
    	if (i.first.length () == 0) throw new InvalidData ("The first name must be entered.");
		//Debug.write ("DOEmployee.validate...16");
    	if (i.last.length () == 0) throw new InvalidData ("The last name must be entered.");

		//Debug.write ("DOEmployee.validate...17");
    	if (i.hired.isNull ()) throw new InvalidData ("The date hired is not set.");

		//Debug.write ("DOEmployee.validate...18");
    	if ((!i.terminated.isNull ()) && (i.hired.compareTo (i.terminated) > 0)) throw new InvalidData ("The date terminated must be after the date hired.");

		//Debug.write ("DOEmployee.validate...19");
        if (i.salary < 0) throw new InvalidData ("The salary cannot be less than zero.");
		//Debug.write ("DOEmployee.validate...20");
        if (i.wage < 0) throw new InvalidData ("The wage cannot be less than zero.");
		//Debug.write ("DOEmployee.validate...21");
        if (i.hours < 0) throw new InvalidData ("The hours cannot be less than zero.");
		//Debug.write ("DOEmployee.validate...22");
        if (i.billRate < 0) throw new InvalidData ("The bill rate cannot be less than zero.");
		/*
		DR 8/26/03: these days can be negative
		//Debug.write ("DOEmployee.validate...25");
        if (i.vacationDays < 0) throw new InvalidData ("The number of vacation days cannot be less than zero.");
        if (i.sickDays < 0) throw new InvalidData ("The number of sick days cannot be less than zero.");
        if (i.rollOverDays < 0) throw new InvalidData ("The number of rollover days cannot be less than zero.");
		//Debug.write ("DOEmployee.validate...26");
        if (i.personalDays < 0) throw new InvalidData ("The number of personal days cannot be less than zero.");
		*/

		//Debug.write ("DOEmployee.validate...27");
    	if (i.depts.size () == 0) throw new InvalidData ("The employee must be in at least one department.");

		//Debug.write ("DOEmployee.validate...28");
    	if (i.companyID == 0) throw new InvalidData ("You must select a company for the employee.");
    	
		//Debug.write ("DOEmployee.validate...29");
    	i.companyAddress.validate ();
    	i.homeAddress.validate ();
		//Debug.write ("DOEmployee.validate...30");
    }

    public void clear ()
    {
        this.recID = 0;
        this.userID = "";
        this.ssn = "";
        this.first = "";
        this.middle = "";
        this.fax = "";
        this.phone = "";
        this.password = "";
        this.hired.setNull ();
        this.terminated.setNull ();
        this.last = "";
    	this.isActive = false;
    	this.title = "";
    	this.salary = 0;
    	this.wage = 0;
    	this.hours = 0;
		this.billRate = 0;
		this.vacationDays = 0;
		this.sickDays = 0;
		this.personalDays = 0;
		this.rollOverDays=0;
	    this.depts.removeAllElements ();
	    this.email = "";
	    this.operatorID = "";
	    this.initials = new String ("");
	    this.address = null;
        this.companyID = 0;
        this.companyName = new String ("");
	    this.address = new DOEmployeeAddress ();
		this.mobilePhone = "";
		this.homePhone = "";
		this.spouseName = "";
		this.homeEmail = "";
		this.companyAddress = null;
		this.companyAddress = new DOCompanyAddress ();
		this.extParams.removeAllElements ();
		this.isFullTime = true;
		this.homeAddress = null;
		this.homeAddress = new DOEmployeeAddress (DOEmployeeAddress.ADDRESS_HOME);
		this.empTypeID = 0;
    }

    public String format () { return DOShortEmployee.format (last, first); }
    public static String format (String last, String first) { return DOShortEmployee.format (last, first); }
    public static String format (String last, String first, String middle)
    {
        return (DOShortEmployee.format (last, first) + " " + middle).trim ();
    }
    public String formatFirstLast () { return DOShortEmployee.formatFirstLast (first, last); }
    public static String formatFirstLast (String first, String last) { return DOShortEmployee.formatFirstLast (first, last); }

}
