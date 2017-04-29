package com.proximo.aarp.json.collections;

import java.util.ArrayList;

public class UserSettings {
	public final static String EMAILKEY = "email";
    public final static String PROFILE_PHOTOKEY = "profile_photo";
    public final static String LOCATIONKEY = "location";
    public final static String PROFESSIONKEY = "profession";
    public final static String COMPANYKEY = "company";
    public final static String OCCUPATIONKEY = "occupation";
    public final static String RECEIVE_STORIES_EMAILSKEY = "receive_stories_emails";
    public final static String RECEIVE_SUCCESS_REMINDER_EMAILSKEY = "receive_success_reminder_emails";
    public final static String RECEIVE_CONVERSATION_EMAILSKEY = "receive_conversation_emails";
    public final static String RECEIVE_EVENTS_EMAILSKEY = "receive_events_emails"; 	
    public final static String COIKEY = "coi";
    public final static String NARROW_OPTOUTKEY = "narrow_optout";    
	
	private Float email;
    private Float profile_photo;
    private Float location;
    private Float profession;
    private Float company;
    private Float occupation;
    private Float receive_stories_emails;
    private Float receive_success_reminder_emails;
    private Float receive_conversation_emails;
    private Float receive_events_emails;   
    private COI coi;
    private ArrayList<NarrowOptout> narrow_optout;
    
    public UserSettings() {}
    
    // email
	public Float getemail() {
		return this.email;
	}
	
	public void setemail(Float val) {
		this.email = val;
	}	
	
	// profile_photo
	public Float getprofile_photo() {
		return this.profile_photo;
	}
	
	public void setprofile_photo(Float val) {
		this.profile_photo = val;
	}	
	
	// location
	public Float getlocation() {
		return this.location;
	}
	
	public void setlocation(Float val) {
		this.location = val;
	}	
	
	// profession
	public Float getprofession() {
		return this.profession;
	}
	
	public void setprofession(Float val) {
		this.profession = val;
	}	
	
	// company
	public Float getcompany() {
		return this.company;
	}
	
	public void setcompany(Float val) {
		this.company = val;
	}	
	
	// occupation
	public Float getoccupation() {
		return this.occupation;
	}
	
	public void setoccupation(Float val) {
		this.occupation = val;
	}
	
	// receive_stories_emails
	public Float getreceive_stories_emails() {
		return this.receive_stories_emails;
	}
	
	public void setreceive_stories_emails(Float val) {
		this.receive_stories_emails = val;
	}		
	
	
	// receive_success_reminder_emails
	public Float getreceive_success_reminder_emails() {
		return this.receive_success_reminder_emails;
	}
	
	public void setreceive_success_reminder_emails(Float val) {
		this.receive_success_reminder_emails = val;
	}	
	
	// receive_conversation_emails
	public Float getreceive_conversation_emails() {
		return this.receive_conversation_emails;
	}
	
	public void setreceive_conversation_emails(Float val) {
		this.receive_conversation_emails = val;
	}	
	
	// receive_events_emails
	public Float getreceive_events_emails() {
		return this.receive_events_emails;
	}
	
	public void setreceive_events_emails(Float val) {
		this.receive_events_emails = val;
	}
	
    // coi
	public COI getCOI() {
		if (this.coi != null)
			return this.coi;
		else 
			return new COI();
	}
	
	public void setCOI(COI val) {
		this.coi = val;
	}    
	
	// narrow_optout
	public ArrayList<NarrowOptout> getNarrowOptout() {
		if (this.narrow_optout != null)
			return this.narrow_optout;
		else
			return new ArrayList<NarrowOptout>();
	}
	
	public void setNarrowOptout(ArrayList<NarrowOptout> val) {
		this.narrow_optout = val;
	}
}
