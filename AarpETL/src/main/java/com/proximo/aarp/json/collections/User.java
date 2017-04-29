package com.proximo.aarp.json.collections;

import java.util.ArrayList;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import com.proximo.aarp.util.MyUtils;

@JsonIgnoreProperties(ignoreUnknown = true)
public class User {
	
	public final static String IDKEY = "_id";
	public final static String _TYPEKEY = "_type";
	public final static String CREATEDKEY = "created";
	public final static String DOBKEY = "dob";
	public final static String DOB_UPDATEDKEY = "dob_updated";
	public final static String EMAILKEY = "email";
	public final static String EMAIL_UPDATEDKEY = "email_updated";
	public final static String FIRSTNAMEKEY = "firstname";
	public final static String FIRSTNAME_UPDATEDKEY = "firstname_updated";
	public final static String LASTLOGINKEY = "lastlogin";
	public final static String LASTNAMEKEY = "lastname";
	public final static String LASTNAME_UPDATEDKEY = "lastname_updated";
	public final static String SIGNUP_VERSIONKEY = "signup_version";
	public final static String THIRD_PARTYKEY = "third_party";
	public final static String UPDATEDKEY = "updated";
	public final static String USERNAMEKEY = "username";
	public final static String GENDERKEY = "gender";
	public final static String OCCUPATIONKEY = "occupation";
	public final static String PICTUREKEY = "picture";
	public final static String SETTINGSKEY = "settings";
	public final static String ZIP_CODEKEY = "zip_code";
	public final static String ZIP_UPDATEDKEY = "zip_updated";
	public final static String SOURCE_CODESKEY = "source_codes";
	public final static String CAMPAINGKEY = "campaing";
	
	
	private Id id;
	private ArrayList<String> type;
	private String channel;
	private String beta_access;
	private Double created;
	private Double dob;
	private Double dob_updated;
	private String email;
	private Double email_updated;	
	private String firstName;
	private Double firstName_updated;	
	private Double lastLogin;	
	private String lastName;
	private Double lastName_updated;	
	private Integer thirdParty;
	private Double updated;
	private String username;
	private String zipCode;
	private Double zip_updated;	
	private String signupVerion;
	private String campaign;
	private String source_codes;
	private UserSettings settings;
	private String gender;
	private String occupation;
	private String linkedin_id;
	
	public User() {}
	
	// campaing
	public String getCampaign() {
		return this.campaign;
	}
	
	public void setCampaign(String val) {
		this.campaign = val;
	}

	// source_codes
	public String getSourceCodes() {
		return this.source_codes;
	}
	
	public void setSourceCodes(String val) {
		this.source_codes = val;
	}

	// email
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String val) {
		this.email = val;
	}
	
	// firstName
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setFirstName(String val) {
		this.firstName = val;
	}	
	
	// lastName
	public String getLastName() {
		return this.lastName;
	}
	
	public void setLastName(String val) {
		this.lastName = val;
	}		
	
	// zipCode
	public String getZipCode() {
		return this.zipCode;
	}
	
	public void setZipCode(String val) {
		this.zipCode = val;
	}			
	
	// signupVerion
	public String getSignupVerion() {
		return this.signupVerion;
	}
	
	public void setSignupVerion(String val) {
		this.signupVerion = val;
	}	
	
	// dob
	public Double getDob() {
		return this.dob;
	}
	
	public void setDob(Double val) {
		this.dob = val;
	}
	
	// created
	public Double getCreated() {
		return this.created;
	}
	
	public void setCreated(Double val) {
		this.created = val;
	}	
	
	// username
	public String getUsername() {
		return this.username;
	}
	
	public void setUsername(String val) {
		this.username = val;
	}	
	
	// thirdParty
	public Integer getThirdParty() {
		return this.thirdParty;
	}
	
	public void setThirdParty(Integer val) {
		this.thirdParty = val;
	}
	
	// lastLogin
	public Double getLastLogin() {
		return this.lastLogin;
	}
	
	public void setLastLogin(Double val) {
		this.lastLogin = val;
	}	
	
	// updated
	public Double getUpdated() {
		return this.updated;
	}
	
	public void setUpdated(Double val) {
		this.updated = val;
	}
	
	// Id
	public Id getID() {
		return this.id;
	}
	
	public void setID(Id val) {
		this.id = val;
	}
	
	// type
	public ArrayList<String> getType() {
		if (this.type != null) 
			return this.type;
		else
			return new ArrayList<String>();
			
	}
	
	public void setType(ArrayList<String> val) {
		this.type = val;
	}
	
	// UserSettings
	public UserSettings getUserSettings() {
		if (this.settings != null)
			return this.settings;
		else 
			return new UserSettings();
	}
	
	public void setUserSettings(UserSettings val) {
		this.settings = val;
	}	
	
	public void printAllType() {
		System.out.println("_type:"); 
		for (int i=0;i<type.size();i++) {
			System.out.println(type.get(i));
		}
	}
	
	// channel
	public String getChannel() {
		return channel;
	}

	public void setChannel(String val) {
		this.channel = val;
	}
	
	// beta_access
	public String getBetaAccess() {
		return beta_access;
	}

	public void setBetaAccess(String val) {
		this.beta_access = val;
	}
	
	// dob_updated
	public Double getDobUpdated() {
		return dob_updated;
	}

	public void setDobUpdated(Double val) {
		this.dob_updated = val;
	}

	// email_updated
	public Double getEmailUpdated() {
		return email_updated;
	}

	public void setEmailUpdated(Double val) {
		this.email_updated = val;
	}
	
	// firstName_updated
	public Double getFirstNameUpdated() {
		return firstName_updated;
	}

	public void setFirstNameUpdated(Double val) {
		this.firstName_updated = val;
	}
	
	// lastName_updated
	public Double getLastNameUpdated() {
		return lastName_updated;
	}

	public void setLastNameUpdated(Double val) {
		this.lastName_updated = val;
	}
	
	// zip_updated
	public Double getZipUpdated() {
		return zip_updated;
	}

	public void setZipUpdated(Double val) {
		this.zip_updated = val;
	}
	
	// gender
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	// occupation
	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	
	//
	public Date getCreatedFormat() {
		if (this.getCreated() == null)
			return null;
		else
			return MyUtils.convertUnixTimeStampToDateExample(this.getCreated());
	}
	
	public Date getDobUpdatedFormat() {
		if (this.getDobUpdated() == null)
			return null;
		else
			return MyUtils.convertUnixTimeStampToDateExample(this.getDobUpdated());
	}
	
	public Date getDobFormat() {
		if (this.getDob() == null)
			return null;
		else
			return MyUtils.convertUnixTimeStampToDateExample(this.getDob());
	}
	
	public Date getEmailUpdatedFormat() {
		if (this.getEmailUpdated() == null)
			return null;
		else
			return MyUtils.convertUnixTimeStampToDateExample(this.getEmailUpdated());
	}
	
	public Date getFirstNameUpdatedFormat() {
		if (this.getFirstNameUpdated() == null)
			return null;
		else
			return MyUtils.convertUnixTimeStampToDateExample(this.getFirstNameUpdated());
	}	
	
	public Date getLastNameUpdatedFormat() {
		if (this.getLastNameUpdated() == null)
			return null;
		else
			return MyUtils.convertUnixTimeStampToDateExample(this.getLastNameUpdated());
	}
	
	public Date getUpdatedFormat() {
		if (this.getUpdated() == null)
			return null;
		else
			return MyUtils.convertUnixTimeStampToDateExample(this.getUpdated());
	}	
	
	public Date getZipUpdatedFormat() {
		if (this.getZipUpdated() == null)
			return null;
		else
			return MyUtils.convertUnixTimeStampToDateExample(this.getZipUpdated());
	}	
	
	public Date getLastLoginFormat() {
		if (this.getLastLogin() == null)
			return null;
		else
			return MyUtils.convertUnixTimeStampToDateExample(this.getLastLogin());
	}

	public String getLinkedin_id() {
		return linkedin_id;
	}

	public void setLinkedin_id(String linkedin_id) {
		this.linkedin_id = linkedin_id;
	}
}
