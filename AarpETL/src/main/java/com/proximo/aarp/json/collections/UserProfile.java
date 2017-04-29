package com.proximo.aarp.json.collections;

import java.util.ArrayList;
import java.util.Date;

import com.proximo.aarp.util.MyUtils;

public class UserProfile {
	public final static String IDKEY = "_id";
	public final static String _TYPEKEY = "_type";
	public final static String ISDEFAULTKEY = "isDefault";
	public final static String DEFAULT_TITLEKEY = "default_title";	
	public final static String DEFAULT_CITYKEY = "default_city";	
	public final static String DEFAULT_DESCRIPTIONKEY = "default_description";	
	public final static String FIRSTNAMEKEY = "firstname";	
	public final static String LASTNAMEKEY = "lastname";	
	public final static String USER_IDKEY = "user_id";	
	public final static String TITLEKEY = "title";
	public final static String DESCRIPTIONKEY = "description";
	public final static String CITYKEY = "city";
	public final static String CREATEDKEY = "created";
	public final static String PICTUREKEY = "picture";
	public final static String PICTURE_PATHKEY = "path";
	public final static String PICTURE_CONTENTKEY = "content";
	public final static String PICTURE_DOWNLOADKEY = "download";
	public final static String PICTURE_PICTURE_IDKEY = "picture_id";
	public final static String PICTURE_FULLKEY = "full";
	public final static String UPDATEDKEY = "updated";
	public final static String SHOWTITLEKEY = "showTitle";
	public final static String SHOWBIOKEY = "showBio";
	public final static String SHOWPICTUREKEY = "showPicture";
	public final static String SHOWCOVERKEY = "showCover";
	public final static String SHOWPROGRAMSKEY = "showPrograms";
	public final static String CHALLENGES_ACTIVEKEY = "challenges_active";
	public final static String CHALLENGES_COMPLETEDKEY = "challenges_completed";	
	
	private Id id;
	private ArrayList<String> _type;
	private Double created;
	private Boolean isDefault;
	private String default_title;
	private String default_city;
	private String default_description;
	private String firstname;
	private String lastname;
	private String user_id;
	private String title;
	private String description;
	private String city;
	private String picture_path;
	private String picture_content;
	private String picture_download;
	private String picture_picture_id;
	private String picture_full;
	private Double updated;
	private Boolean showTitle;
	private Boolean showBio;
	private Boolean showPicture;
	private Boolean showCover;
	private Boolean showPrograms;
	private Integer challenges_active;
	private Integer challenges_completed;
	
	public UserProfile() {}
	
	public Id getId() {
		return id;
	}

	public void setId(Id id) {
		this.id = id;
	}

	public ArrayList<String> get_type() {
		return _type;
	}

	public void set_type(ArrayList<String> _type) {
		this._type = _type;
	}

	public Double getCreated() {
		return created;
	}

	public void setCreated(Double created) {
		this.created = created;
	}

	public Boolean getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}

	public String getDefault_title() {
		return default_title;
	}

	public void setDefault_title(String default_title) {
		this.default_title = default_title;
	}

	public String getDefault_city() {
		return default_city;
	}

	public void setDefault_city(String default_city) {
		this.default_city = default_city;
	}

	public String getDefault_description() {
		return default_description;
	}

	public void setDefault_description(String default_description) {
		this.default_description = default_description;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPicture_path() {
		return picture_path;
	}

	public void setPicture_path(String picture_path) {
		this.picture_path = picture_path;
	}

	public String getPicture_content() {
		return picture_content;
	}

	public void setPicture_content(String picture_content) {
		this.picture_content = picture_content;
	}

	public String getPicture_download() {
		return picture_download;
	}

	public void setPicture_download(String picture_download) {
		this.picture_download = picture_download;
	}

	public String getPicture_picture_id() {
		return picture_picture_id;
	}

	public void setPicture_picture_id(String picture_picture_id) {
		this.picture_picture_id = picture_picture_id;
	}

	public String getPicture_full() {
		return picture_full;
	}

	public void setPicture_full(String picture_full) {
		this.picture_full = picture_full;
	}

	public Double getUpdated() {
		return updated;
	}

	public void setUpdated(Double updated) {
		this.updated = updated;
	}

	public Boolean getShowTitle() {
		return showTitle;
	}

	public void setShowTitle(Boolean showTitle) {
		this.showTitle = showTitle;
	}

	public Boolean getShowBio() {
		return showBio;
	}

	public void setShowBio(Boolean showBio) {
		this.showBio = showBio;
	}

	public Boolean getShowPicture() {
		return showPicture;
	}

	public void setShowPicture(Boolean showPicture) {
		this.showPicture = showPicture;
	}

	public Boolean getShowCover() {
		return showCover;
	}

	public void setShowCover(Boolean showCover) {
		this.showCover = showCover;
	}

	public Boolean getShowPrograms() {
		return showPrograms;
	}

	public void setShowPrograms(Boolean showPrograms) {
		this.showPrograms = showPrograms;
	}

	public Integer getChallenges_active() {
		return challenges_active;
	}

	public void setChallenges_active(Integer challenges_active) {
		this.challenges_active = challenges_active;
	}

	public Integer getChallenges_completed() {
		return challenges_completed;
	}

	public void setChallenges_completed(Integer challenges_completed) {
		this.challenges_completed = challenges_completed;
	}
	
	public Date getCreatedFormat() {
		if (this.getCreated() == null)
			return null;
		else
			return MyUtils.convertUnixTimeStampToDateExample(this.getCreated());
	}
	
	public Date getUpdatedFormat() {
		if (this.getUpdated() == null)
			return null;
		else
			return MyUtils.convertUnixTimeStampToDateExample(this.getUpdated());
	}
}
