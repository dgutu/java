package com.proximo.aarp.util;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MyUtils {
	public static Date convertUnixTimeStampToDateExample(Double value) {
		return new Date(value.longValue() * 1000L);
	}
	
	public static Long convertDatetoUnixTimeStamp(Date value) {
		if (value == null)
			return null;
		else
			return (value.getTime() / 1000L);
	}
	
	public static boolean isValidDate(Date value) {
		DateFormat format = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss", Locale.ENGLISH);
		try {
			Date startDate = format.parse("1000-01-01 00:00:00");
			Date endDate = format.parse("9999-12-31 23:59:59");
			
			//System.out.println("Date value: " + value);
			//System.out.println("Start MySQL support value: " + startDate);
			//System.out.println("End MySQL support value: " + endDate);
			
			return (value.after(startDate) && value.before(endDate));
		}
		catch(Exception ex) {
			return false;
		}
	}
	
	public static int getContentSize(URL url) {
		int size = 0;
		URLConnection conn = null;
		
		try {
			conn = url.openConnection();
			size = conn.getContentLength();
			conn.getInputStream().close();
		}
		catch(Exception ex){
		}
		
		return size;
	}
	
	public static int getURLFileSize(URL url) {
		HttpURLConnection conn = null;
	    try {
	        conn = (HttpURLConnection) url.openConnection();
	        conn.setRequestMethod("HEAD");
	        conn.getInputStream();
	        return conn.getContentLength();
	    } catch (IOException e) {
	        return -1;
	    } finally {
	        conn.disconnect();
	    }
	}
}
