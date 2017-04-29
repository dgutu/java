package com.proximo.inci;


public class DOTNCompany 
    extends com.proximo.inci.common.DODataRecord 
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 673582741336284239L;
	public String name;
    public String addrLine1;
    public String url;
    public String addrLine2;
    public String addrLine3;
    public String city;
    public String state;
    public String zip;
    public String country;
    public String countryLong;
    public String phone;
    public String fax;
    public boolean isInactive;

    public DOTNCompany() {
        super();
        clear();
    }

    public void clear() {
        recID = 0;
        name = "";
        addrLine1 = "";
        addrLine2 = "";
        addrLine3 = "";
        url = "";
        city = "";
        state = "";
        zip = "";
        country = "US";
        phone = "";
        fax = "";
        isInactive = false;
        countryLong = "United State of America";
    }

    public static void validate(com.proximo.inci.common.DODataRecord d)
      throws com.proximo.inci.common.exception.InvalidData 
    {
        @SuppressWarnings("unused")
		DOTNCompany i = (DOTNCompany)d;
    }

    public Object clone() {
        DOTNCompany tn = (DOTNCompany)super.clone();
        tn.name = this.name;
        tn.addrLine1 = this.addrLine1;
        tn.addrLine2 = this.addrLine2;
        tn.addrLine3 = this.addrLine3;
        tn.url = this.url;
        tn.city = this.city;
        tn.state = this.state;
        tn.zip = this.zip;
        tn.country = this.country;
        tn.phone = this.phone;
        tn.fax = this.fax;
        tn.isInactive = this.isInactive;
        tn.countryLong = this.countryLong;

        return tn;
    }  
}
