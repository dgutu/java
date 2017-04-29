package com.proximo.aarp.json.collections;

import java.util.ArrayList;
import java.util.Date;

import com.proximo.aarp.util.MyUtils;

public class UserLogin {
	public final static String IDKEY = "_id";
	public final static String _TYPEKEY = "_type";
	public final static String EMAILKEY = "email";
	public final static String IPKEY = "ip";
	public final static String TIMESTAMPKEY = "timestamp";
	public final static String GEO_HASHKEY = "geo_hash";
	public final static String SUCCESSKEY = "success";
	public final static String IP_INFOKEY = "ip_info";
	public final static String IP_INFO_CONTINENT_CODEKEY = "continent_code";
	public final static String IP_INFO_COUNTRY_CODEKEY = "country_code";
	public final static String IP_INFO_COUNTRY_CODE3KEY = "country_code3";
	public final static String IP_INFO_COUNTRY_NAMEKEY = "country_name";
	public final static String IP_INFO_REGIONKEY = "region";
	public final static String IP_INFO_CITYKEY = "city";
	public final static String IP_INFO_POSTAL_CODEKEY = "postal_code";
	public final static String IP_INFO_LATITUDEKEY = "latitude";
	public final static String IP_INFO_LONGITUDEKEY = "longitude";
	public final static String IP_INFO_DMA_CODEKEY = "dma_code";
	public final static String IP_INFO_AREA_CODEKEY = "area_code";
	public final static String IP_INFO_TIMEZONEKEY = "timezone";
	public final static String IP_INFO_LOOKUP_ADDRESSKEY = "lookup_address";
	public final static String NEAREST_POSTAL_CODE_INFOKEY = "nearest_postal_code_info";
	public final static String NEAREST_POSTAL_CODE_INFO_IDKEY = "id";
	public final static String NEAREST_POSTAL_CODE_INFO_COORDSKEY = "coords";
	public final static String NEAREST_POSTAL_CODE_INFO_COUNTRY_CODEKEY = "country_code";
	public final static String NEAREST_POSTAL_CODE_INFO_COUNTRY_NAMEKEY = "country_name";
	public final static String NEAREST_POSTAL_CODE_INFO_POSTAL_CODEKEY = "postal_code";
	public final static String NEAREST_POSTAL_CODE_INFO_PLACE_NAMEKEY = "place_name";
	public final static String NEAREST_POSTAL_CODE_INFO_PLACE_STATEKEY = "state";
	public final static String NEAREST_POSTAL_CODE_INFO_PROVINCEKEY = "province";
	public final static String NEAREST_POSTAL_CODE_INFO_COMMUNITYKEY = "community";
	public final static String NEAREST_POSTAL_CODE_INFO_DISTANCEKEY = "distance";
	public final static String REMAINING_LOOKUPSKEY = "remaining_lookups";
	public final static String USER_IDKEY = "user_id";
	public final static String CREATEDKEY = "created";	
	
	private Id id;
	private ArrayList<String> _type;
	private String email;
	private String ip;
	private Double timestamp;
	private Boolean success;
	private String ip_info_continent_code;
	private String ip_info_country_code;
	private String ip_info_country_code3;
	private String ip_info_country_name;
	private String ip_info_region;
	private String ip_info_city;
	private String ip_info_postal_code;
	private Float ip_info_latitude;
	private Float ip_info_longitude;
	private Integer ip_info_dma_code;
	private Integer ip_info_area_code;
	private String ip_info_timezone;
	private String ip_info_lookup_address;
	private String nearest_postal_code_info_id;
	private String nearest_postal_code_info_coords;
	private String nearest_postal_code_info_country_code;
	private String nearest_postal_code_info_country_name;
	private String nearest_postal_code_info_postal_code;
	private String nearest_postal_code_info_place_name;
	private String nearest_postal_code_info_state;
	private String nearest_postal_code_info_province;
	private String nearest_postal_code_info_community;
	private Float nearest_postal_code_info_distance;
	private Long remaining_lookups;
	private String user_id;
	private Double created;
	
	public UserLogin() {}
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public Double getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Double timestamp) {
		this.timestamp = timestamp;
	}
	public Boolean getSuccess() {
		return success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public String getIp_info_continent_code() {
		return ip_info_continent_code;
	}
	public void setIp_info_continent_code(String ip_info_continent_code) {
		this.ip_info_continent_code = ip_info_continent_code;
	}
	public String getIp_info_country_code() {
		return ip_info_country_code;
	}
	public void setIp_info_country_code(String ip_info_country_code) {
		this.ip_info_country_code = ip_info_country_code;
	}
	public String getIp_info_country_code3() {
		return ip_info_country_code3;
	}
	public void setIp_info_country_code3(String ip_info_country_code3) {
		this.ip_info_country_code3 = ip_info_country_code3;
	}
	public String getIp_info_country_name() {
		return ip_info_country_name;
	}
	public void setIp_info_country_name(String ip_info_country_name) {
		this.ip_info_country_name = ip_info_country_name;
	}
	public String getIp_info_region() {
		return ip_info_region;
	}
	public void setIp_info_region(String ip_info_region) {
		this.ip_info_region = ip_info_region;
	}
	public String getIp_info_city() {
		return ip_info_city;
	}
	public void setIp_info_city(String ip_info_city) {
		this.ip_info_city = ip_info_city;
	}
	public String getIp_info_postal_code() {
		return ip_info_postal_code;
	}
	public void setIp_info_postal_code(String ip_info_postal_code) {
		this.ip_info_postal_code = ip_info_postal_code;
	}
	public Float getIp_info_latitude() {
		return ip_info_latitude;
	}
	public void setIp_info_latitude(Float ip_info_latitude) {
		this.ip_info_latitude = ip_info_latitude;
	}
	public Float getIp_info_longitude() {
		return ip_info_longitude;
	}
	public void setIp_info_longitude(Float ip_info_longitude) {
		this.ip_info_longitude = ip_info_longitude;
	}
	public Integer getIp_info_dma_code() {
		return ip_info_dma_code;
	}
	public void setIp_info_dma_code(Integer ip_info_dma_code) {
		this.ip_info_dma_code = ip_info_dma_code;
	}
	public Integer getIp_info_area_code() {
		return ip_info_area_code;
	}
	public void setIp_info_area_code(Integer ip_info_area_code) {
		this.ip_info_area_code = ip_info_area_code;
	}
	public String getIp_info_timezone() {
		return ip_info_timezone;
	}
	public void setIp_info_timezone(String ip_info_timezone) {
		this.ip_info_timezone = ip_info_timezone;
	}
	public String getIp_info_lookup_address() {
		return ip_info_lookup_address;
	}
	public void setIp_info_lookup_address(String ip_info_lookup_address) {
		this.ip_info_lookup_address = ip_info_lookup_address;
	}
	public String getNearest_postal_code_info_id() {
		return nearest_postal_code_info_id;
	}
	public void setNearest_postal_code_info_id(
			String nearest_postal_code_info_id) {
		this.nearest_postal_code_info_id = nearest_postal_code_info_id;
	}
	public String getNearest_postal_code_info_coords() {
		return nearest_postal_code_info_coords;
	}
	public void setNearest_postal_code_info_coords(
			String nearest_postal_code_info_coords) {
		this.nearest_postal_code_info_coords = nearest_postal_code_info_coords;
	}
	public String getNearest_postal_code_info_country_code() {
		return nearest_postal_code_info_country_code;
	}
	public void setNearest_postal_code_info_country_code(
			String nearest_postal_code_info_country_code) {
		this.nearest_postal_code_info_country_code = nearest_postal_code_info_country_code;
	}
	public String getNearest_postal_code_info_country_name() {
		return nearest_postal_code_info_country_name;
	}
	public void setNearest_postal_code_info_country_name(
			String nearest_postal_code_info_country_name) {
		this.nearest_postal_code_info_country_name = nearest_postal_code_info_country_name;
	}
	public String getNearest_postal_code_info_postal_code() {
		return nearest_postal_code_info_postal_code;
	}
	public void setNearest_postal_code_info_postal_code(
			String nearest_postal_code_info_postal_code) {
		this.nearest_postal_code_info_postal_code = nearest_postal_code_info_postal_code;
	}
	public String getNearest_postal_code_info_place_name() {
		return nearest_postal_code_info_place_name;
	}
	public void setNearest_postal_code_info_place_name(
			String nearest_postal_code_info_place_name) {
		this.nearest_postal_code_info_place_name = nearest_postal_code_info_place_name;
	}
	public String getNearest_postal_code_info_state() {
		return nearest_postal_code_info_state;
	}
	public void setNearest_postal_code_info_state(
			String nearest_postal_code_info_state) {
		this.nearest_postal_code_info_state = nearest_postal_code_info_state;
	}
	public String getNearest_postal_code_info_province() {
		return nearest_postal_code_info_province;
	}
	public void setNearest_postal_code_info_province(
			String nearest_postal_code_info_province) {
		this.nearest_postal_code_info_province = nearest_postal_code_info_province;
	}
	public String getNearest_postal_code_info_community() {
		return nearest_postal_code_info_community;
	}
	public void setNearest_postal_code_info_community(
			String nearest_postal_code_info_community) {
		this.nearest_postal_code_info_community = nearest_postal_code_info_community;
	}
	public Float getNearest_postal_code_info_distance() {
		return nearest_postal_code_info_distance;
	}
	public void setNearest_postal_code_info_distance(
			Float nearest_postal_code_info_distance) {
		this.nearest_postal_code_info_distance = nearest_postal_code_info_distance;
	}
	public Long getRemaining_lookups() {
		return remaining_lookups;
	}
	public void setRemaining_lookups(Long remaining_lookups) {
		this.remaining_lookups = remaining_lookups;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public Double getCreated() {
		return created;
	}
	public void setCreated(Double created) {
		this.created = created;
	}	
	public Date getCreatedFormat() {
		if (this.getCreated() == null)
			return null;
		else
			return MyUtils.convertUnixTimeStampToDateExample(this.getCreated());
	}
	public Date getgetTimestampFormat() {
		if (this.getTimestamp() == null)
			return null;
		else
			return MyUtils.convertUnixTimeStampToDateExample(this.getTimestamp());
	}		
}
