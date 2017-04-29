package com.proximo.inci;

import com.proximo.inci.common.DODataRecord;
import com.proximo.inci.common.exception.InvalidData;

//import OSSupport;
//import DatabaseFunctions;

public class DORegisteredUser 
    extends DODataRecord
{
    public String firstName;
    public String lastName;
    public long companyRecID;
    public String companyName;
    public String email;
    public String phone;
    public String userName; // this is actually userID
    public String password;
    public String countryCode;
    public String country; // not always populated
    public String address1;
    public String address2;
    public String address3;
    public String city;
    public String state;
    public String zip;
    public String fax;
    
    public String userType;
    public boolean isInactive;
    
    public long pubCompanyRecID;
    public String pubCompanyName;
    public String pubAddr1;
    public String pubAddr2;
    public String pubAddr3;
    public String pubCity;
    public String pubState;
    public String pubZip;
    public String pubCountryCode;
    public String pubPhone;
    public String pubFax;
    public DOList creditCards;
    
    public static final String txtPrivacyPolicy = "<b>The Personal Care Products Council Privacy Policy</b><br><br><b>Effective Date: March 14, 2007</b><br><br><br>" + 
                                                  "Welcome to <a href='http://inci.personalcarecouncil.org'>inci.personalcarecouncil.org</a>, a website provided by " +
                                  "the Personal Care Products Council.  The Personal Care Products Council recognizes the importance of " +
                                  "safeguarding your privacy online. The information we collect from you online will " +
                                  "only be used in accordance with the Privacy Policy set forth below. However, this " +
                                  "Privacy Policy does not cover websites or web pages that you access or link from " +
                                  "this Site. <br><br><br>" + 

                                  "<b>Information We Collect</b><br><br><br>" + 
                                  "We collect and store information that you voluntarily provide to us on this Site " +
                                  "when you purchase a product, respond to a survey, or sign up for a promotion or " +
                                  "enter a contest sponsored by the Site. When you purchase a product, you provide your " +
                                  "name, mailing address, email address, telephone number and credit card information " +
                                  "in order to complete the transaction. If you enter a contest or sign up for a " +
                                  "promotion, you provide your name, email address, or other contact information. At times, " +
                                  "you may be asked to voluntarily provide demographic information such as address, " +
                                  "age range, gender, occupation, interests or hobbies.<br><br>" +

                                  "When you access our Site, our web server automatically collects and stores your " +
                                  "domain name, the date and time you access our Site, and the Internet address of the " +
                                  "website that linked you to our Site. <br><br>" +

                                  "We use cookies to collect and store information. Cookies are small files that your " +
                                  "web browser places on your hard drive for record keeping purposes. Cookies permit the " +
                                  "Site to identify you and to recall your email address (as well as any other " +
                                  "information that you voluntarily provide) from the Site's database.<br><br>" +
    
                                  "Network advertising companies, which use cookies to measure and improve the " +
                                  "effectiveness of third-party ads placed on our site, may also place cookies on " +
                                  "your hard drive. These advertisers may use anonymous information about your visit " +
                                  "to our Site (and other websites) including what banner ad was shown, the date and " +
                                  "time it was shown, the cookie and the IP address. This information may also be used " +
                                  "for online preference marketing purposes. Visit Network Advertising Initiative's " +
                                  "(\"NAI\") gateway opt-out site at <a href='http://www.networkadvertising.org'>http://www.networkadvertising.org/</a> to review the " +
                                  "privacy policies of network advertising companies and/or opt-out of network advertising " +
                                  "cookies. <br><br><br>" +

                                  "<b>How We Use Your Information </b><br><br><br>" +

                                  "The Personal Care Products Council uses the information it collects from you in a variety of ways including to " +
                                  "process your purchase transaction, to improve the content of our Site to address " +
                                  "your preferences and to attract new users, to track user trends and patterns on the " +
                                  "Internet so that we may inform users of information that may be of interest to them " +
                                  "and, in some instances, to properly credit third parties that have referred you to " +
                                  "the Site. Stored information is also used to pre-populate information fields for " +
                                  "purchases, contests or promotions. <br><br>" +

                                  "The Personal Care Products Council shares individually identifiable information, such as name and email address, " +
                                  "with other reputable organizations including its affiliates, advertisers, marketing " +
                                  "partners and network advertising companies that are interested in marketing to Site " +
                                  "users. The Personal Care Products Council also shares individually identifiable information with contractors that " +
                                  "help us provide services in connection with the Site. Demographic information may be " +
                                  "shared in aggregate, non-identifying form with third parties interested in knowing " +
                                  "what type of audience the Site is attracting. The Personal Care Products Council and its advertisers and marketing " +
                                  "partners use this information to ensure that ads, offers and promotions are relevant " +
                                  "and of value to you.<br><br>" +

                                  "Advertisers who contract directly with us are required to represent that they comply " +
                                  "with our privacy policy with respect to information collected through ads displayed " + 
                                  "on our Site. <br><br>" +

                                  "If you register at the Site to become a member, you will have the ability through your " +
                                  "account page to update or change information collected about you. You may also " +
                                  "unsubscribe from our email lists or prevent future disclosure of your information to " +
                                  "third parties for marketing purposes by sending us an email. Please be aware that it " +
                                  "may take a few days for your change to take effect. <br><br>" +

                                  "In the event that the Personal Care Products Council merges with another organization, or transfers or sells " +
                                  "substantially all of its assets to a third party, all collected information stored " +
                                  "on our server would be included in the merger, transfer or sale. Also, if required " +
                                  "by law, individually identifiable information may be disclosed to a third party. " +
                                  "The Personal Care Products Council reserves the right to change its privacy policy at any time. Changes will be " +
                                  "posted to this page in a timely manner.<br><br>" +

                                  "<b>How We Protect Your Information</b><br><br><br>" +

                                  "To prevent unauthorized access, maintain data accuracy and ensure the correct use " +
                                  "of personal information, the Personal Care Products Council uses appropriate industry standard procedures to " +
                                  "safeguard the confidentiality of personal information. All transmissions of personal " +
                                  "information are through secure computer servers, which also run authentication and " +
                                  "Secure Sockets Layer (\"SSL\") software data encryption software to encrypt all " +
                                  "personal information including your name, address and credit card number to protect " +
                                  "it from being read as the information travels over the Internet. Access to " +
                                  "registered users' accounts is password protected. <br><br><br>" +

                                  "<b>Children's Privacy</b><br><br><br>" +
                                  
                                  "In general, the Site does not direct its activities to or market products appropriate " +
                                  "for children under the age of 13. It is the policy of the Personal Care Products Council to refrain from knowingly " +
                                  "collecting personally identifiable information from children under 13. If future Site " +
                                  "activity is directed at children under 13, the Personal Care Products Council will comply with the Children's Online " +
                                  "Privacy Protection Act.<br><br><br>" + 

                                  "<b>Your California Privacy Rights</b><br><br><br>" +

                                  "Under California law, if you are a resident of California, you may request certain " +
                                  "information regarding our disclosure of personal information to third parties for " +
                                  "marketing purposes. To make such a request, please write to:<br><br>" +

                                  "The Personal Care Products Council<br>" +
                                  "1101 17th Street, N.W. Suite 300<br>" +
                                  "Washington, D.C. 20036<br>" +
                                  "ATTN: CA Privacy<br><br>" + 

                                  "We reserve our right not to respond to requests not submitted to the above address.<br><br>" +

                                  "<b>Questions About Privacy</b><br><br><br>" +

                                  "If you have any questions about our privacy policy please email us at " +
                                  "<a href='mailto:privacy@personalcarecouncil.org'>privacy@personalcarecouncil.org</a>.<br><br>" +

                                  "<b>Governing Law</b><br><br><br>" +

                                  "Your access to and use of this Site is governed by and will be construed in " +
                                  "accordance with the law of the District of Columbia without regard to principles " +
                                  "of conflicts of laws.";
    public DORegisteredUser ()
    {
        super();
        clear();
    }

    public void validate ()
    throws InvalidData
    {
        this.validate ((DODataRecord) this);
    }

    public void clear ()
    {
        recID = 0;
        firstName = "";
        lastName = "";
        companyRecID = 0;
        companyName = "";
        email = "";
        phone = "";
        userName = "";
        password = "";
        countryCode = "US";
        country = "";
        address1 = "";
        address2 = "";
        address3 = "";
        city = "";
        state = "";
        zip = "";
        fax = "";
    
        userType = "X";
        isInactive = false;
    
        pubCompanyRecID = 0;
        pubCompanyName = "";
        pubAddr1 = "";
        pubAddr2 = "";
        pubAddr3 = "";
        pubCity = "";
        pubState = "";
        pubZip = "";
        pubCountryCode = "US";
        pubPhone = "";
        pubFax = "";
        
        creditCards = new DOList();
    }

    public Object clone ()
    {
        DORegisteredUser n = (DORegisteredUser) super.clone ();
        n.recID = this.recID;
        n.firstName = this.firstName;
        n.lastName = this.lastName;
        n.companyRecID = this.companyRecID;
        n.companyName = this.companyName;
        n.email = this.email;
        n.phone = this.phone;
        n.userName = this.userName;
        n.password = this.password;
        n.countryCode = this.countryCode;
        n.country = this.country;
        n.address1 = this.address1;
        n.address2 = this.address2;
        n.address3 = this.address3;
        n.city = this.city;
        n.state = this.state;
        n.zip = this.zip;
        n.fax = this.fax;
    
        n.userType = this.userType;
        n.isInactive = this.isInactive;
    
        n.pubCompanyRecID = this.pubCompanyRecID;
        n.pubCompanyName = this.pubCompanyName;
        n.pubAddr1 = this.pubAddr1;
        n.pubAddr2 = this.pubAddr2;
        n.pubAddr3 = this.pubAddr3;
        n.pubCity = this.pubCity;
        n.pubState = this.pubState;
        n.pubZip = this.pubZip;
        n.pubCountryCode = this.pubCountryCode;
        n.pubPhone = this.pubPhone;
        n.pubFax = this.pubFax;
        n.creditCards = this.creditCards;
        return n;
    }

    public String formatLastFirst () { return new String (lastName + ", " + firstName); }
    public String formatFirstLast () { return new String (firstName + " " + lastName); }
    
    public DOUserCC getDefaultCC(){
        return getDefaultCC(this);
    }
    
    public static DOUserCC getDefaultCC(DORegisteredUser user){
        DOList ccList = user.creditCards;
        DOUserCC retCC = new DOUserCC();
        for (int i = 0; i < ccList.size(); i++){
            DOUserCC cc = (DOUserCC) ccList.elementAt(i);
            if (cc.isDefault){
                retCC = cc;
                break;
            }
                
        }        
        return retCC;
    }
    
    public void setDefaultCC(DOUserCC userCC){
        setDefaultCC(this, userCC);
    }
    public static void setDefaultCC(DORegisteredUser user, DOUserCC userCC){        
        boolean cardFound = false;        
        DOList creditCards = user.creditCards;
        for (int i = 0; i < creditCards.size(); i++){
            DOUserCC cc = (DOUserCC) creditCards.elementAt(i);
            if (cc.recID == userCC.recID){
                cc = (DOUserCC) userCC.clone();
                cc.isDefault = true;
                cardFound = true;
            } else
                cc.isDefault = false;                
            creditCards.setElementAt(cc, i);
        }
        if (!cardFound)
            creditCards.addElement(userCC);
        user.creditCards = creditCards;
    }
}
